/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.salearea.SaleAreaApplyRange
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryPager
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IMCUpdateEventHandler;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.salearea.SaleAreaApplyRange;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryPager;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="aa.mCUpdateEventHandlerSaleArea")
public class MCUpdateEventHandlerSaleArea
implements IMCUpdateEventHandler {
    private static final Logger log = LoggerFactory.getLogger(MCUpdateEventHandlerSaleArea.class);
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private YMSParamConfig ymsParamConfig;

    @Override
    public void Handle(List<String> orgIds) throws Exception {
        if (orgIds != null && orgIds.size() > 0) {
            ArrayList<SaleAreaApplyRange> ranges = new ArrayList<SaleAreaApplyRange>();
            for (String orgId : orgIds) {
                List rangesOfCreator;
                List<String> subOrgs = this.upcControlRuleService.getSubOrgs(orgId);
                if (subOrgs.isEmpty() || (rangesOfCreator = MetaDaoHelper.query((String)"aa.salearea.SaleAreaApplyRange", (QuerySchema)QuerySchema.create().addSelect("saleArea, isEnd").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)orgId), QueryCondition.name((String)"isCreator").eq((Object)true)})))).isEmpty()) continue;
                List clsIds = rangesOfCreator.stream().map(map -> map.get("saleArea").toString()).collect(Collectors.toList());
                List rangesInDB = MetaDaoHelper.query((String)"aa.salearea.SaleAreaApplyRange", (QuerySchema)QuerySchema.create().addSelect("saleArea, orgId, id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"saleArea").in(clsIds)})));
                Map<String, String> rangeMapInDB = null;
                if (!rangesInDB.isEmpty()) {
                    rangeMapInDB = rangesInDB.stream().collect(Collectors.toMap(x -> x.get("saleArea").toString() + x.get("orgId").toString(), y -> y.get("id").toString()));
                }
                for (Map map2 : rangesOfCreator) {
                    for (String subOrg : subOrgs) {
                        if (null != rangeMapInDB && rangeMapInDB.containsKey(map2.get("saleArea").toString() + subOrg)) continue;
                        SaleAreaApplyRange range = new SaleAreaApplyRange();
                        range.setId((Object)IdManager.getInstance().nextId());
                        range.put("saleArea", map2.get("saleArea"));
                        range.setOrgId(subOrg);
                        range.setIsCreator(Boolean.valueOf(false));
                        range.setIsApplied(Boolean.valueOf(false));
                        range.put("isEnd", map2.get("isEnd"));
                        range.setTenant((Long)AppContext.getCurrentUser().getTenant());
                        range.setEntityStatus(EntityStatus.Insert);
                        ranges.add(range);
                        if (ranges.size() <= 500) continue;
                        MetaDaoHelper.insert((String)"aa.salearea.SaleAreaApplyRange", ranges);
                        ranges.clear();
                    }
                }
            }
            if (ranges.size() > 0) {
                MetaDaoHelper.insert((String)"aa.salearea.SaleAreaApplyRange", ranges);
            }
        }
    }

    @Override
    public void HandleShareRange(Map shareRangeData) throws Exception {
        for (final Object key : shareRangeData.keySet()) {
            ArrayList<SaleAreaApplyRange> ranges = new ArrayList<SaleAreaApplyRange>();
            List beSharedOrgIds = (List)shareRangeData.get(key);
            List<String> saleAreaIds = this.upcControlRuleService.getSelfCreateVoucherByCreateOrg("aa.salearea.SaleArea", (List<String>)new ArrayList<String>(){
                {
                    this.add(key.toString());
                }
            });
            if (saleAreaIds == null || saleAreaIds.isEmpty()) continue;
            List<Map<String, Object>> rangesInDb = this.getSelfCreateVoucherRangeByMinId(saleAreaIds);
            HashMap<String, Map> saleAreaRangesMap = new HashMap<String, Map>(rangesInDb.size());
            if (!rangesInDb.isEmpty()) {
                for (Map map : rangesInDb) {
                    saleAreaRangesMap.put(map.get("saleArea").toString() + map.get("orgId").toString(), map);
                }
            }
            for (String string : saleAreaIds) {
                for (String subOrgId : beSharedOrgIds) {
                    if (saleAreaRangesMap.containsKey(string + subOrgId)) continue;
                    SaleAreaApplyRange range = TreeApplyRangeUtils.getInstance().getSalearesApplyRangeNew(Long.valueOf(string), subOrgId, Boolean.parseBoolean(((Map)saleAreaRangesMap.get(string + key.toString())).get("isEnd").toString()), false);
                    ranges.add(range);
                }
            }
            log.info("MCUpdateEventHandlerCustCategory HandleShareRange insert range data:{}", ranges);
            if (ranges.isEmpty()) continue;
            MetaDaoHelper.insert((String)"aa.salearea.SaleAreaApplyRange", ranges);
        }
    }

    public List<Map<String, Object>> getSelfCreateVoucherRangeByMinId(List<String> saleAreaIds, Long minId, int realMaxRowsValue) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id as rangeId, saleArea as saleArea, orgId as orgId, isEnd as isEnd, isCreator as isCreator");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").gt((Object)minId), QueryCondition.name((String)"saleArea").in(saleAreaIds)}));
        querySchema.addOrderBy("id");
        QueryPager queryPager = new QueryPager();
        queryPager.setPageIndex(1);
        queryPager.setPageSize(realMaxRowsValue);
        querySchema.pager(queryPager);
        return MetaDaoHelper.query((String)"aa.salearea.SaleAreaApplyRange", (QuerySchema)querySchema, null);
    }

    public List<Map<String, Object>> getSelfCreateVoucherRangeByMinId(List<String> saleAreaIds) throws Exception {
        long currentRangeId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        List<Map<String, Object>> rangesInDbList = this.getSelfCreateVoucherRangeByMinId(saleAreaIds, currentRangeId, realMaxRowsValue);
        ArrayList<Map<String, Object>> rangesInDb = new ArrayList<Map<String, Object>>(rangesInDbList);
        while (rangesInDbList.size() >= realMaxRowsValue) {
            Map<String, Object> rangeNewMinIdMap = rangesInDbList.get(rangesInDbList.size() - 1);
            currentRangeId = Long.parseLong(rangeNewMinIdMap.get("rangeId").toString());
            rangesInDbList = this.getSelfCreateVoucherRangeByMinId(saleAreaIds, currentRangeId, realMaxRowsValue);
            rangesInDb.addAll(rangesInDbList);
        }
        return rangesInDb;
    }
}

