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
 *  nccloud.pubitf.arap.baddebts.IBDLossQueryService
 *  nccloud.pubitf.arap.openapi.IBDLossOpenService
 *  nccloud.vo.arap.bdloss.AggBdLossVO
 *  nccloud.vo.arap.bdloss.BdLossChildVO
 *  nccloud.vo.arap.bdloss.BdLossSunVO
 *  nccloud.vo.arap.bdloss.BdLossVO
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
import nccloud.pubimpl.arap.openapi.ArapBDConvert;
import nccloud.pubitf.arap.baddebts.IBDLossQueryService;
import nccloud.pubitf.arap.openapi.IBDLossOpenService;
import nccloud.vo.arap.bdloss.AggBdLossVO;
import nccloud.vo.arap.bdloss.BdLossChildVO;
import nccloud.vo.arap.bdloss.BdLossSunVO;
import nccloud.vo.arap.bdloss.BdLossVO;

public class BDLossOpenServiceImpl
implements IBDLossOpenService {
    public List<Map<String, Object>> queryBill(Map<String, String> conditionMap) throws BusinessException {
        if (conditionMap == null || conditionMap.size() == 0) {
            return null;
        }
        ArapBDConvert billconvert = new ArapBDConvert();
        String select = "select distinct arap_bdloss.pk_bdloss";
        String where = billconvert.getConditionSql(conditionMap, "arap_bdloss");
        String from = "arap_bdloss arap_bdloss  inner join arap_bdloss_d t1 ON t1.pk_bdloss = arap_bdloss.pk_bdloss inner join arap_bdloss_dd t2 ON t2.pk_bdloss_d = t1.pk_bdloss_d";
        String sql = select + " from " + from + " where " + where;
        List pks = (List)new BaseDAO().executeQuery(sql, (ResultSetProcessor)new ColumnListProcessor());
        if (pks != null && pks.size() > 0) {
            AggBdLossVO[] billvos = ((IBDLossQueryService)NCLocator.getInstance().lookup(IBDLossQueryService.class)).queryBillByPrimaryKey(pks.toArray(new String[0]));
            ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
            for (AggBdLossVO billvo : billvos) {
                HashMap<String, Object> map = new HashMap<String, Object>();
                BdLossVO headVO = billvo.getHeadVO();
                Map<String, String> headMap = billconvert.convertVOToMap((SuperVO)headVO);
                map.putAll(headMap);
                BdLossChildVO[] bodyVOs = billvo.getBodyVOs();
                ArrayList<Map<String, String>> body = new ArrayList<Map<String, String>>();
                ArrayList<Map<String, String>> bodys = new ArrayList<Map<String, String>>();
                for (BdLossChildVO bodyVO : bodyVOs) {
                    BdLossSunVO[] bodysVOs;
                    Map<String, String> bodyMap = billconvert.convertVOToMap((SuperVO)bodyVO);
                    body.add(bodyMap);
                    map.put("body", body);
                    for (BdLossSunVO bodysVO : bodysVOs = bodyVO.getBodys()) {
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

