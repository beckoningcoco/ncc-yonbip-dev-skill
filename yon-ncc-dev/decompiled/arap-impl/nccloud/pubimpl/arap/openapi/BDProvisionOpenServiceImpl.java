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
 *  nccloud.pubitf.arap.baddebts.IBadProvisionBillQueryService
 *  nccloud.pubitf.arap.openapi.IBDProvisionOpenService
 *  nccloud.vo.arap.bdprovision.AggBdProvisionVO
 *  nccloud.vo.arap.bdprovision.BdProvisionDetailPeriodVO
 *  nccloud.vo.arap.bdprovision.BdProvisionDetailVO
 *  nccloud.vo.arap.bdprovision.BdProvisionVO
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
import nccloud.pubitf.arap.baddebts.IBadProvisionBillQueryService;
import nccloud.pubitf.arap.openapi.IBDProvisionOpenService;
import nccloud.vo.arap.bdprovision.AggBdProvisionVO;
import nccloud.vo.arap.bdprovision.BdProvisionDetailPeriodVO;
import nccloud.vo.arap.bdprovision.BdProvisionDetailVO;
import nccloud.vo.arap.bdprovision.BdProvisionVO;

public class BDProvisionOpenServiceImpl
implements IBDProvisionOpenService {
    public List<Map<String, Object>> queryBill(Map<String, String> conditionMap) throws BusinessException {
        if (conditionMap == null || conditionMap.size() == 0) {
            return null;
        }
        ArapBDPConvert billconvert = new ArapBDPConvert();
        String select = "select distinct arap_bdprovision.pk_bdprovision";
        String where = billconvert.getConditionSql(conditionMap, "arap_bdprovision");
        String from = "arap_bdprovision arap_bdprovision  inner join arap_bdprovision_d t1 ON t1.pk_bdprovision = arap_bdprovision.pk_bdprovision inner join arap_bdprovision_dd t2 ON t2.pk_bdprovision_d = t1.pk_bdprovision_d";
        String sql = select + " from " + from + " where " + where;
        List pks = (List)new BaseDAO().executeQuery(sql, (ResultSetProcessor)new ColumnListProcessor());
        if (pks != null && pks.size() > 0) {
            AggBdProvisionVO[] billvos = (AggBdProvisionVO[])((IBadProvisionBillQueryService)NCLocator.getInstance().lookup(IBadProvisionBillQueryService.class)).queryBillsByPKs(pks.toArray(new String[0]));
            ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
            for (AggBdProvisionVO billvo : billvos) {
                HashMap<String, Object> map = new HashMap<String, Object>();
                BdProvisionVO headVO = billvo.getHeadVO();
                Map<String, String> headMap = billconvert.convertVOToMap((SuperVO)headVO);
                map.putAll(headMap);
                BdProvisionDetailVO[] bodyVOs = billvo.getBodyVOs();
                ArrayList<Map<String, String>> body = new ArrayList<Map<String, String>>();
                ArrayList<Map<String, String>> bodys = new ArrayList<Map<String, String>>();
                for (BdProvisionDetailVO bodyVO : bodyVOs) {
                    BdProvisionDetailPeriodVO[] bodysVOs;
                    Map<String, String> bodyMap = billconvert.convertVOToMap((SuperVO)bodyVO);
                    body.add(bodyMap);
                    map.put("body", body);
                    for (BdProvisionDetailPeriodVO bodysVO : bodysVOs = bodyVO.getBodys()) {
                        Map<String, String> bodysMap = billconvert.convertVOToMap((SuperVO)bodysVO);
                        bodys.add(bodysMap);
                    }
                    map.put("bodys", bodys);
                }
                list.add(map);
            }
            return list;
        }
        return null;
    }
}

