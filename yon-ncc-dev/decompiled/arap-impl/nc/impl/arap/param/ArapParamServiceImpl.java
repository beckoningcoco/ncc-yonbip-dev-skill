/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.BillDateUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.itf.arap.param.IArapParamService
 *  nc.itf.arap.termendtransact.CloseAccountVO
 *  nc.vo.arap.param.ParamVO
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 *  org.apache.commons.collections4.CollectionUtils
 */
package nc.impl.arap.param;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import nc.bs.arap.util.BillDateUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.itf.arap.param.IArapParamService;
import nc.itf.arap.termendtransact.CloseAccountVO;
import nc.vo.arap.param.ParamVO;
import nc.vo.fi.pub.SqlUtils;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;
import org.apache.commons.collections4.CollectionUtils;

public class ArapParamServiceImpl
implements IArapParamService {
    public ParamVO[] queryAllParamsByPk_org(String pkOrg) throws BusinessException {
        BaseDAO dao = new BaseDAO();
        Collection cl = dao.retrieveByCorp(ParamVO.class, pkOrg);
        if (cl.isEmpty()) {
            return null;
        }
        ParamVO[] o = (ParamVO[])Array.newInstance(ParamVO.class, cl.size());
        o = cl.toArray(o);
        return o;
    }

    public ParamVO[] queryParamByCode(CloseAccountVO[] closeAccoutVOs) throws BusinessException {
        CloseAccountVO[] cavos = ArrayUtils.isEmpty((Object[])closeAccoutVOs) ? new CloseAccountVO[]{} : closeAccoutVOs;
        Collection<ParamVO> params = this.getParamVO(cavos);
        ArrayList<ParamVO> results = new ArrayList<ParamVO>();
        List<String> fields = Arrays.asList("pk_org", "param_code");
        HashSet<String> keyfields = new HashSet<String>(fields);
        if (params.isEmpty()) {
            return null;
        }
        HashMap<String, ParamVO> keyMap = new HashMap<String, ParamVO>();
        for (ParamVO vo : params) {
            keyMap.put(this.generateKey(keyfields, (SuperVO)vo), vo);
        }
        for (CloseAccountVO vo : cavos) {
            ParamVO paramVO = (ParamVO)keyMap.get(this.generateKey(keyfields, (SuperVO)vo));
            results.add(paramVO == null ? new ParamVO() : paramVO);
        }
        return results.toArray(new ParamVO[0]);
    }

    public ParamVO queryParamByCode(String pkOrg, String sParamCode, Integer iSysCode) throws BusinessException {
        CloseAccountVO[] closeAccoutVOs = new CloseAccountVO[]{new CloseAccountVO()};
        closeAccoutVOs[0].setPk_org(pkOrg);
        closeAccoutVOs[0].setParam_code(sParamCode);
        closeAccoutVOs[0].setiSysCode(iSysCode);
        Object[] accountClosed = this.queryParamByCode(closeAccoutVOs);
        if (ArrayUtils.isEmpty((Object[])accountClosed)) {
            return null;
        }
        return accountClosed[0];
    }

    public ParamVO[] queryParamByCode(String[] pk_org, String sParamCode, Integer iSysCode) throws BusinessException {
        ArrayList<CloseAccountVO> closeAccoutVOs = new ArrayList<CloseAccountVO>();
        if (ArrayUtils.isEmpty((Object[])pk_org)) {
            return null;
        }
        for (String org : pk_org) {
            if (StringUtils.isEmpty((CharSequence)org)) continue;
            CloseAccountVO vo = new CloseAccountVO();
            vo.setPk_org(org);
            vo.setParam_code(sParamCode);
            vo.setiSysCode(iSysCode);
            closeAccoutVOs.add(vo);
        }
        String FromInitCode = InvocationInfoProxy.getInstance().getProperty("FromInitCode");
        Object[] accountClosed = new ParamVO[pk_org.length];
        accountClosed = "FromInitCode".equals(FromInitCode) ? this.queryParamByCode(closeAccoutVOs.toArray(new CloseAccountVO[0])) : this.queryParamByCodeBatch(closeAccoutVOs.toArray(new CloseAccountVO[0]));
        if (ArrayUtils.isEmpty((Object[])accountClosed)) {
            return new ParamVO[0];
        }
        return accountClosed;
    }

    public ParamVO[] queryParamByCodeBatch(CloseAccountVO[] closeAccoutVOs) throws BusinessException {
        CloseAccountVO[] cavos = ArrayUtils.isEmpty((Object[])closeAccoutVOs) ? new CloseAccountVO[]{} : closeAccoutVOs;
        Collection<ParamVO> params = this.getParamVO(cavos);
        ArrayList<ParamVO> results = new ArrayList<ParamVO>();
        List<String> fields = Arrays.asList("pk_org", "param_code");
        HashSet<String> keyfields = new HashSet<String>(fields);
        if (params != null && params.size() < closeAccoutVOs.length) {
            HashMap<String, ParamVO> mapcheck = new HashMap<String, ParamVO>();
            ArrayList<Object> emptyresults = new ArrayList<Object>();
            for (ParamVO vo : params) {
                mapcheck.put(vo.getPk_org(), vo);
            }
            for (CloseAccountVO cvo : closeAccoutVOs) {
                String org = cvo.getPk_org();
                String code = cvo.getParam_code();
                if (code != null && !code.contains("INIT")) continue;
                if (mapcheck.get(org) != null) {
                    emptyresults.add(mapcheck.get(org));
                    continue;
                }
                ParamVO vo = new ParamVO();
                vo.setPk_org(org);
                vo.setParam_code(code);
                vo.setParam_value("N");
                emptyresults.add(vo);
            }
            return emptyresults.toArray(new ParamVO[0]);
        }
        if (CollectionUtils.isEmpty(params)) {
            for (CloseAccountVO cvo : closeAccoutVOs) {
                String org = cvo.getPk_org();
                String code = cvo.getParam_code();
                if (code != null && !code.contains("INIT")) continue;
                ParamVO vo = new ParamVO();
                vo.setPk_org(org);
                vo.setParam_code(code);
                vo.setParam_value("N");
                results.add(vo);
            }
        }
        HashMap<String, ParamVO> keyMap = new HashMap<String, ParamVO>();
        for (ParamVO vo : params) {
            keyMap.put(this.generateKey(keyfields, (SuperVO)vo), vo);
        }
        for (CloseAccountVO vo : cavos) {
            ParamVO paramVO = (ParamVO)keyMap.get(this.generateKey(keyfields, (SuperVO)vo));
            results.add(paramVO == null ? new ParamVO() : paramVO);
        }
        return results.toArray(new ParamVO[0]);
    }

    private String generateKey(Set<String> keyfields, SuperVO vo) {
        StringBuilder key = new StringBuilder();
        for (String field : keyfields) {
            String value = (String)vo.getAttributeValue(field);
            key.append(StringUtils.isEmpty((CharSequence)value) ? "~" : value);
        }
        return key.toString();
    }

    private Collection<ParamVO> getParamVO(CloseAccountVO[] closeAccoutVOs) throws BusinessException {
        CloseAccountVO[] cavos = ArrayUtils.isEmpty((Object[])closeAccoutVOs) ? new CloseAccountVO[]{} : closeAccoutVOs;
        ArrayList<String> orgs = new ArrayList<String>();
        ArrayList<String> paramCodes = new ArrayList<String>();
        for (int i = 0; i < cavos.length; ++i) {
            CloseAccountVO vo = cavos[i];
            if (StringUtils.isNotEmpty((CharSequence)vo.getPk_org())) {
                orgs.add(vo.getPk_org());
            }
            if (vo.getParam_code() == null) {
                String paramCode = BillDateUtils.getParamCode((String)vo.getNodeCode());
                vo.setParam_code(paramCode);
            }
            if (!StringUtils.isNotEmpty((CharSequence)vo.getParam_code())) continue;
            paramCodes.add(vo.getParam_code());
        }
        StringBuilder sql = new StringBuilder();
        sql.append(SqlUtils.getInStr((String)"pk_org", orgs, (boolean)true));
        sql.append(" and ");
        sql.append(SqlUtils.getInStr((String)"param_code", paramCodes, (boolean)true));
        BaseDAO dao = new BaseDAO();
        Collection params = dao.retrieveByClause(ParamVO.class, sql.toString());
        return params == null ? null : params;
    }

    public ParamVO[] queryParamsByCode(String pkOrg, String sParamCode, Integer iSysCode) throws BusinessException {
        Collection cl;
        String strConditionNames = "";
        String strAndOr = "and ";
        if (pkOrg != null) {
            strConditionNames = strConditionNames + strAndOr + "pk_org='" + pkOrg + "' ";
        }
        if (sParamCode != null) {
            strConditionNames = strConditionNames + strAndOr + "param_code='" + sParamCode + "' ";
        }
        if (iSysCode != null) {
            strConditionNames = strConditionNames + strAndOr + "sysCode=" + iSysCode;
        }
        BaseDAO dao = new BaseDAO();
        if (strConditionNames.length() > 0) {
            strConditionNames = strConditionNames.substring(3);
        }
        if ((cl = dao.retrieveByClause(ParamVO.class, strConditionNames)).isEmpty()) {
            return null;
        }
        ParamVO[] o = (ParamVO[])Array.newInstance(ParamVO.class, cl.size());
        if ((o = cl.toArray(o)) == null || o.length < 1) {
            return null;
        }
        return o;
    }

    public ParamVO queryParamByParamPk(String pkParam) throws BusinessException {
        BaseDAO dao = new BaseDAO();
        return (ParamVO)dao.retrieveByPK(ParamVO.class, pkParam);
    }

    public void updateParams(ParamVO[] paramVos) throws BusinessException {
        BaseDAO dao = new BaseDAO();
        dao.updateVOArray((SuperVO[])paramVos);
    }

    public void insertParams(ParamVO[] paramVos) throws BusinessException {
        BaseDAO dao = new BaseDAO();
        dao.insertVOArray((SuperVO[])paramVos);
    }
}

