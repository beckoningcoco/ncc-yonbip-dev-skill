/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.jdbc.framework.processor.ArrayListProcessor
 *  nc.jdbc.framework.processor.ColumnProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pattern.pub.SqlBuilder
 *  nccloud.pubitf.arap.arappub.IWebPubService
 */
package nccloud.pubimpl.arap.arappub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import nc.bs.dao.BaseDAO;
import nc.jdbc.framework.processor.ArrayListProcessor;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.pub.SqlBuilder;
import nccloud.pubitf.arap.arappub.IWebPubService;

public class WebPubServiceImpl
implements IWebPubService {
    public Map<String, List<String[]>> getCrossRuleCopeByCondition(String tradeTypeid, String pk_org, String pk_group) throws BusinessException {
        String parentCrossRuleSql;
        List parentCrossRuleList;
        String crossRuleSql = this.getCrossRuleSql(tradeTypeid, pk_org, pk_group);
        BaseDAO dao = new BaseDAO();
        List crossRuleList = (List)dao.executeQuery(crossRuleSql, (ResultSetProcessor)new ArrayListProcessor());
        String sql = "select a.pk_billtypeid from bd_billtype a where exists (select 1 from bd_billtype b where a.pk_billtypecode = b.parentbilltype and b.istransaction = 'Y' and b.pk_billtypeid = '" + tradeTypeid + "')";
        Object parantTradeTypeid = dao.executeQuery(sql.toString(), (ResultSetProcessor)new ColumnProcessor());
        if (null != parantTradeTypeid && null != (parentCrossRuleList = (List)dao.executeQuery(parentCrossRuleSql = this.getCrossRuleSql(parantTradeTypeid.toString(), pk_org, pk_group), (ResultSetProcessor)new ArrayListProcessor())) && parentCrossRuleList.size() > 0) {
            if (null != crossRuleList && crossRuleList.size() > 0) {
                Object[] array;
                HashSet<Object> set = new HashSet<Object>();
                for (Object str : crossRuleList) {
                    array = (Object[])str;
                    set.add(array[1]);
                }
                for (Object str : parentCrossRuleList) {
                    array = (Object[])str;
                    if (set.contains(array[1])) continue;
                    crossRuleList.add(str);
                }
            } else {
                crossRuleList = parentCrossRuleList;
            }
        }
        HashMap<String, List<String[]>> crossRuleCopeMap = new HashMap<String, List<String[]>>();
        for (Object str : crossRuleList) {
            Object[] crossRuleCope = (Object[])str;
            List<Object> crossRuleCopeList = null;
            crossRuleCopeList = crossRuleCopeMap.containsKey(String.valueOf(crossRuleCope[0])) ? (List)crossRuleCopeMap.get(crossRuleCope[0]) : new ArrayList<String[]>();
            crossRuleCopeList.add(new String[]{String.valueOf(crossRuleCope[0]), String.valueOf(crossRuleCope[1]), String.valueOf(crossRuleCope[2]), String.valueOf(crossRuleCope[3]), String.valueOf(crossRuleCope[4])});
            crossRuleCopeMap.put(String.valueOf(crossRuleCope[0]), crossRuleCopeList);
        }
        return crossRuleCopeMap;
    }

    private String getCrossRuleSql(String tradeTypeid, String pk_org, String pk_group) {
        SqlBuilder sqlBuilder = new SqlBuilder();
        sqlBuilder.append(" select distinct bd_crossrulescope.pk_rule,bd_crossbusimap.pk_refobj,mdp1.name,mdc.fullclassname,bd_crossrulescope.pk_entity ");
        sqlBuilder.append(" from bd_crossrule ");
        sqlBuilder.append(" inner join bd_crossrulescope ");
        sqlBuilder.append(" on bd_crossrule.pk_rule = bd_crossrulescope.pk_rule ");
        sqlBuilder.append(" inner join   bd_crossbusimap ");
        sqlBuilder.append(" on bd_crossrulescope.pk_scope = bd_crossbusimap.pk_scope ");
        sqlBuilder.append(" inner join md_property mdp1 ");
        sqlBuilder.append(" on mdp1.id=bd_crossbusimap.pk_refobj ");
        sqlBuilder.append(" inner join md_class mdc ");
        sqlBuilder.append(" on mdc.id = mdp1.classid ");
        sqlBuilder.append(" where bd_crossrule.enablestate = 2  and bd_crossrulescope.pk_entity = '" + tradeTypeid + "' ");
        sqlBuilder.append(" and ((bd_crossrulescope.tag_group = '" + pk_group + "' and ");
        sqlBuilder.append(" bd_crossrulescope.tag_org = '" + pk_org + "') or ");
        sqlBuilder.append(" (bd_crossrulescope.tag_group = '" + pk_group + "' and ");
        sqlBuilder.append(" bd_crossrulescope.tag_org = '" + pk_group + "'))");
        return sqlBuilder.toString();
    }
}

