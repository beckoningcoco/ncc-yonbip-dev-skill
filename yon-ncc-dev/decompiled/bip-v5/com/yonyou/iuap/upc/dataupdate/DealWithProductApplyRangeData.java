/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.pc.product.Product
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyou.iuap.upc.dataupdate;

import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.upc.dataupdate.DataUpdateBaseServcie;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.pc.product.Product;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class DealWithProductApplyRangeData
extends DataUpdateBaseServcie {
    Logger logger = LoggerFactory.getLogger(DealWithProductApplyRangeData.class);

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return this.upgradeProductApplyRange(tenant, capacity);
    }

    public int dataUpdateForTenant(int capacity) throws Exception {
        Tenant tenant = new Tenant();
        tenant.setId(AppContext.getCurrentUser().getTenant());
        tenant.setYTenantId(AppContext.getCurrentUser().getYTenantId());
        return this.upgradeProductApplyRange(tenant, capacity);
    }

    @Override
    public String getTaskName() {
        return "\u6570\u636e\u6cbb\u7406\uff1a\u7269\u6599ProductApplyRange\u91cd\u590d\u6570\u636e";
    }

    private int upgradeProductApplyRange(Tenant tenant, int capacity) throws Exception {
        int tenantCount = 0;
        HashMap<String, String> tenantIdParamMap = new HashMap<String, String>(4);
        tenantIdParamMap.put("ytenant", tenant.getYTenantId());
        Object productCount = SqlHelper.selectOne((String)"com.yonyoucloud.upc.data.dealWithData.selectProductApplyRangeRepeatCountByYtenantId", tenantIdParamMap);
        if (productCount != null && Integer.parseInt(productCount.toString()) > 0) {
            List<List<Long>> productIdList = this.getProductApplyRangeByMinId(capacity, tenant.getYTenantId());
            for (List<Long> dealDataList : productIdList) {
                int updateCount = this.updateProductApplyRange(dealDataList, tenant.getYTenantId());
                tenantCount += updateCount;
            }
            this.logger.error(String.format("\u79df\u6237\u3010%s\u3011\u6cbb\u7406\u7269\u6599ProductApplyRange\u91cd\u590d\u6570\u636e\uff0c\u5171\u8ba1\u5347\u7ea7\u7269\u6599\u3010%d\u3011\u6761\uff0c\u91cd\u590d\u6570\u636e\u3010%d\u3011\u6761\uff0c", tenant.getId().toString(), productIdList.size(), tenantCount) + LocalDateTime.now());
        }
        return tenantCount;
    }

    public int updateProductApplyRange(List<Long> productIdList, String ytenantId) throws Exception {
        int updateCount = 0;
        if (!CollectionUtils.isEmpty(productIdList)) {
            HashMap<String, Object> paramMap = new HashMap<String, Object>(4);
            paramMap.put("ytenant", ytenantId);
            paramMap.put("productIds", productIdList);
            updateCount = SqlHelper.update((String)"com.yonyoucloud.upc.data.dealWithData.updateProductApplyRangeRepeatByYtenantId", paramMap);
        }
        return updateCount;
    }

    private List<Product> getProductByIdList(List<Long> productIdList) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,name");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIdList)}));
        return MetaDaoHelper.queryObject((String)"pc.product.Product", (QuerySchema)querySchema, null);
    }

    public List<List<Long>> getProductApplyRangeByMinId(int capacity, String ytenantId) throws Exception {
        Long currentRangeId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        List<Object> productIdList = new ArrayList();
        ArrayList<Map<String, Object>> productApplyRange = new ArrayList<Map<String, Object>>();
        List<Map<String, Object>> productApplyRangeList = this.getRangeByMinId(currentRangeId, realMaxRowsValue, ytenantId);
        productApplyRange.addAll(productApplyRangeList);
        while (productApplyRangeList.size() >= realMaxRowsValue) {
            currentRangeId = Long.valueOf(productApplyRangeList.get(productApplyRangeList.size() - 1).get("productId").toString());
            productApplyRangeList = this.getRangeByMinId(currentRangeId, realMaxRowsValue, ytenantId);
            productApplyRange.addAll(productApplyRangeList);
        }
        if (!CollectionUtils.isEmpty(productApplyRange)) {
            productIdList = productApplyRange.stream().map(map -> Long.parseLong(map.get("productId").toString())).distinct().collect(Collectors.toList());
        }
        return ListSplitUtil.splitListByCapacity(productIdList, (int)capacity);
    }

    public List<Map<String, Object>> getRangeByMinId(Long minId, int realMaxRowsValue, String ytenantId) {
        try {
            HashMap<String, Object> paramMap = new HashMap<String, Object>(4);
            paramMap.put("ytenant", ytenantId);
            paramMap.put("minId", minId);
            paramMap.put("limit", realMaxRowsValue);
            List RangeRepeatList = SqlHelper.selectList((String)"com.yonyoucloud.upc.data.dealWithData.getRangeRepeatByMinId", paramMap);
            return RangeRepeatList;
        }
        catch (Exception e) {
            throw new CoreDocBusinessException("\u7269\u6599ProductApplyRange\u91cd\u590d\u6570\u636e\u67e5\u8be2MinId\u62a5\u9519\uff0c\u8bf7\u786e\u8ba4\uff01");
        }
    }
}

