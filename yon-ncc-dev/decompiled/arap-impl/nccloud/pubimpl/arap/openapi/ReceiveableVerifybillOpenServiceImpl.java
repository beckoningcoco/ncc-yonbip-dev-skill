/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.jdbc.framework.processor.ColumnListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.arap.verify.AggverifyVO
 *  nc.vo.arap.verify.VerifyDetailVO
 *  nc.vo.arap.verify.VerifyMainVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nccloud.pubitf.arap.openapi.IReceiveableVerifybillOpenService
 */
package nccloud.pubimpl.arap.openapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.dao.BaseDAO;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.arap.verify.AggverifyVO;
import nc.vo.arap.verify.VerifyDetailVO;
import nc.vo.arap.verify.VerifyMainVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nccloud.pubimpl.arap.openapi.ArapBillConvert;
import nccloud.pubitf.arap.openapi.IReceiveableVerifybillOpenService;

public class ReceiveableVerifybillOpenServiceImpl
implements IReceiveableVerifybillOpenService {
    public List<Map<String, Object>> querySumBill(Map<String, String> conditionMap) throws BusinessException {
        if (conditionMap == null || conditionMap.size() == 0) {
            return null;
        }
        ArapBillConvert billconvert = new ArapBillConvert();
        String select = "select distinct arap_verify.pk_verify ";
        String where = billconvert.getConditionSql(conditionMap, new VerifyMainVO().getTableName(), new VerifyDetailVO().getTableName());
        String from = "arap_verify arap_verify inner join arap_verifydetail arap_verifydetail ON arap_verify.pk_verify = arap_verifydetail.pk_verify";
        String sql = select + " from " + from + " where " + where + " and " + new VerifyDetailVO().getTableName() + ".billclass ='ys'";
        List pks = (List)new BaseDAO().executeQuery(sql, (ResultSetProcessor)new ColumnListProcessor());
        if (pks != null && pks.size() > 0) {
            Collection billvos = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(AggverifyVO.class, pks.toArray(new String[0]), false);
            ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
            for (AggverifyVO billvo : billvos) {
                HashMap<String, String> map = new HashMap<String, String>();
                VerifyMainVO parentVO = (VerifyMainVO)billvo.getParentVO();
                Map<String, String> headMap = billconvert.convertVOToMap((SuperVO)parentVO);
                map.putAll(headMap);
                list.add(map);
            }
            return list;
        }
        return null;
    }

    public List<Map<String, Object>> queryDetailBill(Map<String, String> conditionMap) throws BusinessException {
        if (conditionMap == null || conditionMap.size() == 0) {
            return null;
        }
        ArapBillConvert billconvert = new ArapBillConvert();
        String select = "select distinct arap_verify.pk_verify ";
        String where = billconvert.getConditionSql(conditionMap, new VerifyMainVO().getTableName(), new VerifyDetailVO().getTableName());
        String from = "arap_verify arap_verify inner join arap_verifydetail arap_verifydetail ON arap_verify.pk_verify = arap_verifydetail.pk_verify";
        String sql = select + " from " + from + " where " + where + " and " + new VerifyDetailVO().getTableName() + ".billclass ='ys'";
        List pks = (List)new BaseDAO().executeQuery(sql, (ResultSetProcessor)new ColumnListProcessor());
        if (pks != null && pks.size() > 0) {
            Collection billvos = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(AggverifyVO.class, pks.toArray(new String[0]), false);
            ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
            for (AggverifyVO billvo : billvos) {
                HashMap map = new HashMap();
                VerifyDetailVO[] itemvos = (VerifyDetailVO[])billvo.getChildrenVO();
                ArrayList<Map<String, String>> items = new ArrayList<Map<String, String>>();
                for (VerifyDetailVO item : itemvos) {
                    Map<String, String> itemMap = billconvert.convertVOToMap((SuperVO)item);
                    items.add(itemMap);
                }
                map.put("items", items);
                list.add(map);
            }
            return list;
        }
        return new ArrayList<Map<String, Object>>();
    }

    public VerifyMainVO queryVerifyVosByOrgAndBusino(String pk_org, String busino) throws BusinessException {
        BaseDAO dao = new BaseDAO();
        Collection vos = dao.retrieveByClause(VerifyMainVO.class, "pk_org = '" + pk_org + "' and busino='" + busino + "'");
        if (vos != null && vos.size() > 0) {
            VerifyMainVO[] mainVOs = vos.toArray(new VerifyMainVO[0]);
            return mainVOs[0];
        }
        return null;
    }
}

