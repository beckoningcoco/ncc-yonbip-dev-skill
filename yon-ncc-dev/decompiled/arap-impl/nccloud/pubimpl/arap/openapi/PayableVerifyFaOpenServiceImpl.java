/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.prv.IFaControlPrivate
 *  nc.jdbc.framework.processor.ColumnListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.pubitf.bd.accessor.GeneralAccessorFactory
 *  nc.vo.arap.verify.VerifyfaVO
 *  nc.vo.bd.accessor.IBDData
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nccloud.commons.lang.StringUtils
 *  nccloud.pubitf.arap.openapi.IPayableVerifyFaOpenService
 */
package nccloud.pubimpl.arap.openapi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.prv.IFaControlPrivate;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.pubitf.bd.accessor.GeneralAccessorFactory;
import nc.vo.arap.verify.VerifyfaVO;
import nc.vo.bd.accessor.IBDData;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nccloud.commons.lang.StringUtils;
import nccloud.pubimpl.arap.openapi.ArapVerifyConvert;
import nccloud.pubitf.arap.openapi.IPayableVerifyFaOpenService;

public class PayableVerifyFaOpenServiceImpl
implements IPayableVerifyFaOpenService {
    public Map<String, String> queryFa(Map<String, String> conditionMap) throws BusinessException {
        if (conditionMap == null || conditionMap.size() == 0) {
            return null;
        }
        ArapVerifyConvert billconvert = new ArapVerifyConvert();
        String select = "select distinct arap_verify_fa.pk_verify_fa ";
        String where = billconvert.getConditionSql(conditionMap, new VerifyfaVO().getTableName());
        String from = "arap_verify_fa arap_verify_fa";
        String sql = select + " from " + from + " where " + where;
        List pks = (List)new BaseDAO().executeQuery(sql, (ResultSetProcessor)new ColumnListProcessor());
        if (pks != null) {
            VerifyfaVO srcvo = ((IFaControlPrivate)NCLocator.getInstance().lookup(IFaControlPrivate.class)).findByPrimaryKey((String)pks.get(0));
            Map<String, String> map = billconvert.convertVOToMap((SuperVO)srcvo);
            return map;
        }
        return null;
    }

    public Map<String, String> saveFa(VerifyfaVO favo) throws BusinessException {
        String nameStr;
        String pcltjStr;
        String nodeStr;
        String isinitStr;
        IBDData data;
        String userStr;
        IBDData data2;
        String orgCode = favo.getPk_org();
        if (!StringUtils.isEmpty((CharSequence)orgCode)) {
            data2 = GeneralAccessorFactory.getAccessor((String)"2cfe13c5-9757-4ae8-9327-f5c2d34bcb46").getDocByCode(InvocationInfoProxy.getInstance().getGroupId(), orgCode);
            if (data2 == null) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0967"));
            }
        } else {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0968"));
        }
        favo.setPk_org(data2.getPk());
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        if (!StringUtils.isEmpty((CharSequence)pk_group)) {
            favo.setPk_group(pk_group);
        }
        if (!StringUtils.isEmpty((CharSequence)(userStr = favo.getPk_user())) && (data = GeneralAccessorFactory.getAccessor((String)"f6f9a473-56c0-432f-8bc7-fbf8fde54fee").getDocByCode(favo.getPk_org(), userStr)) != null) {
            favo.setPk_user(data.getPk());
        }
        if (!StringUtils.isEmpty((CharSequence)(isinitStr = favo.getIsinit()))) {
            favo.setIsinit(isinitStr);
        }
        if (!StringUtils.isEmpty((CharSequence)(nodeStr = favo.getNode_code()))) {
            favo.setNode_code(nodeStr);
        }
        if (!StringUtils.isEmpty((CharSequence)(pcltjStr = favo.getPcltj()))) {
            favo.setPcltj(pcltjStr);
        }
        if (!StringUtils.isEmpty((CharSequence)(nameStr = favo.getName()))) {
            favo.setName(nameStr);
        }
        String str = new BaseDAO().insertVO((SuperVO)favo);
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("pk_org", favo.getPk_org());
        map.put("pk_group", favo.getPk_group());
        map.put("pk_user", favo.getPk_user());
        map.put("isinit", favo.getIsinit());
        map.put("node_code", favo.getNode_code());
        map.put("name", favo.getName());
        map.put("pcltj", favo.getPcltj());
        return map;
    }

    public Map<String, String> updateFa(Map<String, Object> map) throws BusinessException {
        String pk_verify_fa = (String)map.get("pk_verify_fa");
        HashMap<String, String> returnMap = new HashMap<String, String>();
        if (StringUtils.isEmpty((CharSequence)pk_verify_fa)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0969"));
        }
        VerifyfaVO favo = ((IFaControlPrivate)NCLocator.getInstance().lookup(IFaControlPrivate.class)).findByPrimaryKey(pk_verify_fa);
        ((IFaControlPrivate)NCLocator.getInstance().lookup(IFaControlPrivate.class)).updateFa(favo);
        returnMap.put("successful", "Y");
        return returnMap;
    }

    public void deleteByName(String name) throws BusinessException {
        String sql = "name='" + name;
        new BaseDAO().deleteByClause(VerifyfaVO.class, sql);
    }
}

