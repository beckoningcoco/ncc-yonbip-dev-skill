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
 *  nccloud.pubitf.arap.baddebts.IBDRecoveryQueryService
 *  nccloud.pubitf.arap.openapi.IBDRecoveryOpenService
 *  nccloud.vo.arap.bdrecovery.AggBdRecoveryVO
 *  nccloud.vo.arap.bdrecovery.BdRecoverySKVO
 *  nccloud.vo.arap.bdrecovery.BdRecoveryVO
 *  nccloud.vo.arap.bdrecovery.BdRecoveryYSVO
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
import nccloud.pubitf.arap.baddebts.IBDRecoveryQueryService;
import nccloud.pubitf.arap.openapi.IBDRecoveryOpenService;
import nccloud.vo.arap.bdrecovery.AggBdRecoveryVO;
import nccloud.vo.arap.bdrecovery.BdRecoverySKVO;
import nccloud.vo.arap.bdrecovery.BdRecoveryVO;
import nccloud.vo.arap.bdrecovery.BdRecoveryYSVO;

public class BDRecoveryOpenServiceImpl
implements IBDRecoveryOpenService {
    public List<Map<String, Object>> queryBill(Map<String, String> conditionMap) throws BusinessException {
        if (conditionMap == null || conditionMap.size() == 0) {
            return null;
        }
        ArapBDConvert billconvert = new ArapBDConvert();
        String select = "select distinct arap_bdrecovery.pk_bdrecovery";
        String where = billconvert.getConditionSql(conditionMap, "arap_bdrecovery");
        String from = "arap_bdrecovery arap_bdrecovery  inner join arap_bdrecovery_sk t1 ON t1.pk_bdrecovery = arap_bdrecovery.pk_bdrecovery inner join arap_bdrecovery_ys t2 ON t2.pk_bdrecovery = t1.pk_bdrecovery";
        String sql = select + " from " + from + " where " + where;
        List pks = (List)new BaseDAO().executeQuery(sql, (ResultSetProcessor)new ColumnListProcessor());
        if (pks != null && pks.size() > 0) {
            AggBdRecoveryVO[] billvos = ((IBDRecoveryQueryService)NCLocator.getInstance().lookup(IBDRecoveryQueryService.class)).queryAggVOByPrimaryKey(pks.toArray(new String[0]));
            ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
            for (AggBdRecoveryVO billvo : billvos) {
                HashMap<String, Object> map = new HashMap<String, Object>();
                BdRecoveryVO headVO = billvo.getHeadVO();
                Map<String, String> headMap = billconvert.convertVOToMap((SuperVO)headVO);
                map.putAll(headMap);
                BdRecoverySKVO[] skBodyVOs = billvo.getSKBodyVOs();
                ArrayList<Map<String, String>> skbody = new ArrayList<Map<String, String>>();
                for (BdRecoverySKVO skBodyVO : skBodyVOs) {
                    Map<String, String> skbodyMap = billconvert.convertVOToMap((SuperVO)skBodyVO);
                    skbody.add(skbodyMap);
                }
                map.put("skbody", skbody);
                BdRecoveryYSVO[] ysBodyVOs = billvo.getYSBodyVOs();
                ArrayList<Map<String, String>> ysbody = new ArrayList<Map<String, String>>();
                for (BdRecoveryYSVO ysBodyVO : ysBodyVOs) {
                    Map<String, String> ysbodyMap = billconvert.convertVOToMap((SuperVO)ysBodyVO);
                    ysbody.add(ysbodyMap);
                }
                map.put("ysbody", ysbody);
                list.add(map);
            }
            return list;
        }
        return null;
    }
}

