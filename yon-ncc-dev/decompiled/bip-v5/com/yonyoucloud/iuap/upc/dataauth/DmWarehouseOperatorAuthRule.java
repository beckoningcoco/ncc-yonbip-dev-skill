/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.ypd.bd.api.IBDQueryRepository
 *  com.yonyoucloud.uretail.sys.auth.CustomAuthContent
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.collections4.MapUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryPager
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.iuap.upc.dataauth;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.ypd.bd.api.IBDQueryRepository;
import com.yonyoucloud.iuap.upc.dataauth.DPBaseRule;
import com.yonyoucloud.uretail.sys.auth.CustomAuthContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryPager;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DmWarehouseOperatorAuthRule
extends DPBaseRule {
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private IBDQueryRepository billQueryRepository;

    @Override
    protected Set<String> getCustomValues(CustomAuthContent content, String personId) throws Exception {
        return this.queryWarehouse(personId);
    }

    public Set<String> queryWarehouse(String personId) throws Exception {
        Long currentRangeId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        List<Map<String, Object>> warehouseList = this.queryWarehouseByMinId(personId, currentRangeId, realMaxRowsValue);
        ArrayList<Map<String, Object>> warehouses = new ArrayList<Map<String, Object>>(warehouseList);
        while (warehouseList.size() >= realMaxRowsValue) {
            currentRangeId = MapUtils.getLong(warehouseList.get(warehouseList.size() - 1), (Object)"id");
            warehouseList = this.queryWarehouseByMinId(personId, currentRangeId, realMaxRowsValue);
            warehouses.addAll(warehouseList);
        }
        if (CollectionUtils.isNotEmpty(warehouses)) {
            return warehouses.stream().map(warehouse -> MapUtils.getString((Map)warehouse, (Object)"id")).collect(Collectors.toSet());
        }
        return new HashSet<String>();
    }

    public List<Map<String, Object>> queryWarehouseByMinId(String operator, Long minId, int realMaxRowsValue) throws Exception {
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"operator").eq((Object)operator), QueryCondition.name((String)"id").gt((Object)minId)});
        QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)conditionGroup);
        querySchema.addOrderBy("id");
        QueryPager queryPager = new QueryPager();
        queryPager.setPageIndex(1);
        queryPager.setPageSize(realMaxRowsValue);
        querySchema.pager(queryPager);
        List warehouseList = this.billQueryRepository.queryMapBySchema("aa.warehouse.Warehouse", querySchema);
        if (CollectionUtils.isNotEmpty((Collection)warehouseList)) {
            return warehouseList;
        }
        return new ArrayList<Map<String, Object>>();
    }
}

