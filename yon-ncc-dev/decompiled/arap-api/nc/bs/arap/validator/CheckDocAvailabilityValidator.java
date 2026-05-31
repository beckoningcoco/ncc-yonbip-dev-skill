/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.utils.CollectionUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.jdbc.framework.processor.ArrayListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.arap.validator;

import com.yonyou.cloud.utils.CollectionUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.dao.BaseDAO;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.jdbc.framework.processor.ArrayListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.utils.StringUtil;
import nc.vo.fi.pub.SqlUtils;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.lang.UFBoolean;

public class CheckDocAvailabilityValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        AggregatedValueObject[] aggVOs = (AggregatedValueObject[])obj;
        Map<String, String> map = this.getCheckFieldMap();
        HashMap<String, HashSet<String>> parmMap = new HashMap<String, HashSet<String>>();
        String value = null;
        BaseItemVO[] vos = (BaseItemVO[])aggVOs[0].getChildrenVO();
        for (Map.Entry<String, String> parm : map.entrySet()) {
            HashSet<String> set = new HashSet<String>();
            for (BaseItemVO vo : vos) {
                value = (String)vo.getAttributeValue(parm.getKey());
                set.add(value);
            }
            parmMap.put(parm.getKey(), set);
        }
        try {
            String msg = this.checkData(map, parmMap);
            return msg == null ? null : new ValidationFailure(msg);
        }
        catch (BusinessException e) {
            throw new BusinessRuntimeException(e.getMessage());
        }
    }

    private Map<String, String> getCheckFieldMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("supplier", "bd_supplier-pk_supplier");
        map.put("customer", "bd_customer-pk_customer");
        map.put("pk_deptid_v", "org_dept_v-pk_dept");
        map.put("pk_psndoc", "org_admin_dept-pk_busirole");
        map.put("pk_pcorg_v", "org_profitcenter_v-pk_vid");
        return map;
    }

    private String checkData(Map<String, String> map, Map<String, HashSet<String>> parmMap) throws BusinessException {
        BaseDAO dao = new BaseDAO();
        StringBuffer sql = new StringBuffer();
        for (Map.Entry<String, String> mapEntry : map.entrySet()) {
            List list;
            String pkfield = mapEntry.getValue().split("-")[1];
            String tablename = mapEntry.getValue().split("-")[0];
            if (tablename.equals("org_admin_dept")) {
                sql.append(" select enablestate from ").append(tablename).append(" where ");
                sql.append(SqlUtils.getInStr((String)pkfield, Arrays.asList(parmMap.get(mapEntry.getKey()).toArray(new String[0])), (boolean)true));
                sql.append(" and enablestate in (1,3)");
                list = (List)dao.executeQuery(sql.toString(), (ResultSetProcessor)new ArrayListProcessor());
                if (!CollectionUtils.isEmpty((Collection)list)) {
                    String mes = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1220") + this.getName(mapEntry.getKey()) + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1221");
                    return mes;
                }
            } else {
                sql.append(" select name from ").append(tablename).append(" where ");
                sql.append(SqlUtils.getInStr((String)pkfield, Arrays.asList(parmMap.get(mapEntry.getKey()).toArray(new String[0])), (boolean)true));
                sql.append(" and enablestate in (1,3)");
                list = (List)dao.executeQuery(sql.toString(), (ResultSetProcessor)new ArrayListProcessor());
                if (!CollectionUtils.isEmpty((Collection)list)) {
                    Object[] parm;
                    for (Object name : parm = (Object[])list.get(0)) {
                        if (name == null) continue;
                        String mes = name + this.getName(mapEntry.getKey()) + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1221");
                        return mes;
                    }
                }
            }
            sql.setLength(0);
        }
        return null;
    }

    private String getName(String fieldname) {
        if (StringUtil.isEmpty(fieldname)) {
            return null;
        }
        switch (fieldname) {
            case "supplier": {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1222");
            }
            case "customer": {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1223");
            }
            case "pk_deptid_v": {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1224");
            }
            case "pk_psndoc": {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1225");
            }
            case "pk_pcorg_v": {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1238");
            }
        }
        return null;
    }
}

