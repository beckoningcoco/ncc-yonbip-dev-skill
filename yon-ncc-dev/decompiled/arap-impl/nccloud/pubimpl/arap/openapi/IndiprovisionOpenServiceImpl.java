/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.NCLocator
 *  nc.jdbc.framework.processor.ColumnListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nccloud.pubitf.arap.baddebts.IIndiProVisionBillQueryService
 *  nccloud.pubitf.arap.openapi.IIndiprovisionOpenService
 *  nccloud.vo.arap.indiprovision.AggIndiProvisionVO
 *  nccloud.vo.arap.indiprovision.IndiProvisionDetailVO
 *  nccloud.vo.arap.indiprovision.IndiProvisionVO
 */
package nccloud.pubimpl.arap.openapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nccloud.pubimpl.arap.openapi.ArapBDPConvert;
import nccloud.pubitf.arap.baddebts.IIndiProVisionBillQueryService;
import nccloud.pubitf.arap.openapi.IIndiprovisionOpenService;
import nccloud.vo.arap.indiprovision.AggIndiProvisionVO;
import nccloud.vo.arap.indiprovision.IndiProvisionDetailVO;
import nccloud.vo.arap.indiprovision.IndiProvisionVO;

public class IndiprovisionOpenServiceImpl
implements IIndiprovisionOpenService {
    public List<Map<String, Object>> queryBill(Map<String, String> conditionMap) throws BusinessException {
        if (conditionMap == null || conditionMap.size() == 0) {
            return null;
        }
        ArapBDPConvert billconvert = new ArapBDPConvert();
        String select = "select distinct arap_indiprovision.pk_indiprovision";
        String where = billconvert.getConditionSql(conditionMap, "arap_indiprovision");
        String from = "arap_indiprovision arap_indiprovision  inner join arap_indiprovision_d t1 ON t1.pk_indiprovision = arap_indiprovision.pk_indiprovision ";
        String sql = select + " from " + from + " where " + where;
        List pks = (List)new BaseDAO().executeQuery(sql, (ResultSetProcessor)new ColumnListProcessor());
        if (pks != null && pks.size() > 0) {
            AggIndiProvisionVO[] billvos = (AggIndiProvisionVO[])((IIndiProVisionBillQueryService)NCLocator.getInstance().lookup(IIndiProVisionBillQueryService.class)).queryBillsByPKs(pks.toArray(new String[0]));
            ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
            for (AggIndiProvisionVO billvo : billvos) {
                HashMap<String, Object> map = new HashMap<String, Object>();
                IndiProvisionVO headVO = billvo.getHeadVO();
                Map<String, String> headMap = billconvert.convertVOToMap((SuperVO)headVO);
                map.putAll(headMap);
                IndiProvisionDetailVO[] bodyVOs = billvo.getBodyVOs();
                ArrayList<Map<String, String>> body = new ArrayList<Map<String, String>>();
                for (IndiProvisionDetailVO bodyVO : bodyVOs) {
                    Map<String, String> bodyMap = billconvert.convertVOToMap((SuperVO)bodyVO);
                    body.add(bodyMap);
                }
                map.put("body", body);
                list.add(map);
            }
            return list;
        }
        return null;
    }
}

