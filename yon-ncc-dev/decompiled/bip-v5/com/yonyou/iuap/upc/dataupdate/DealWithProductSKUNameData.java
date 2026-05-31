/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryPager
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyou.iuap.upc.dataupdate;

import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.upc.dataupdate.DataUpdateBaseServcie;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.utils.MerchantUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryPager;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class DealWithProductSKUNameData
extends DataUpdateBaseServcie {
    Logger logger = LoggerFactory.getLogger(DealWithProductSKUNameData.class);

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return this.upgradeProductSKUName(tenant, capacity);
    }

    public int dataUpdateForTenant(int capacity) throws Exception {
        Tenant tenant = new Tenant();
        tenant.setId(AppContext.getCurrentUser().getTenant());
        tenant.setYTenantId(AppContext.getCurrentUser().getYTenantId());
        return this.upgradeProductSKUName(tenant, capacity);
    }

    @Override
    public String getTaskName() {
        return "\u6570\u636e\u6cbb\u7406\uff1asku\u540d\u79f0\u6709\u7a7a\u683c\uff0c\u6216\u8005\u6362\u884c";
    }

    private int upgradeProductSKUName(Tenant tenant, int capacity) throws Exception {
        int tenantCount = 0;
        HashMap<String, String> tenantIdParamMap = new HashMap<String, String>(4);
        tenantIdParamMap.put("ytenant", tenant.getYTenantId());
        Object productSKUCount = SqlHelper.selectOne((String)"com.yonyoucloud.upc.data.dealWithData.selectProductSKUNameCountByYtenantId", tenantIdParamMap);
        if (productSKUCount != null && Integer.parseInt(productSKUCount.toString()) > 0) {
            List<List<Long>> productSKUIdList = this.getProductSKUByMinId(capacity);
            for (List<Long> dealDataList : productSKUIdList) {
                int updateCount = this.updateProductSKUNameStr(dealDataList);
                tenantCount += updateCount;
            }
            this.logger.error(String.format("\u79df\u6237\u3010%s\u3011\u6cbb\u7406SKU\u540d\u79f0\u6709\u7a7a\u683c\uff0c\u6216\u8005\u6362\u884c\u6570\u636e\u5347\u7ea7\u5b8c\u6210\uff0c\u5171\u8ba1\u5347\u7ea7\u6570\u636e\u3010%d\u3011\u6761\uff0c", tenant.getId().toString(), tenantCount) + LocalDateTime.now());
        }
        return tenantCount;
    }

    public int updateProductSKUNameStr(List<Long> productSKUIdList) throws Exception {
        List<ProductSKU> originalProductSKUList;
        int updateCount = 0;
        if (!CollectionUtils.isEmpty(productSKUIdList) && !CollectionUtils.isEmpty(originalProductSKUList = this.getProductSKUByIdList(productSKUIdList))) {
            for (ProductSKU originalProductSKU : originalProductSKUList) {
                if (originalProductSKU.get("name") instanceof String) {
                    originalProductSKU.set("name", (Object)MerchantUtils.replaceStr((String)((String)originalProductSKU.get("name"))));
                } else if (originalProductSKU.get("name") instanceof BizObject) {
                    String localeName = String.valueOf(MultilangUtil.getAttr((String)"pc.product.ProductSKU", (String)"name", (BizObject)originalProductSKU, null));
                    String locale = InvocationInfoProxy.getLocale();
                    BizObject nameObject = (BizObject)originalProductSKU.get("name");
                    if (null == locale) {
                        nameObject.set("zh_CN", (Object)MerchantUtils.replaceStr((String)localeName));
                    } else {
                        nameObject.set(locale, (Object)MerchantUtils.replaceStr((String)localeName));
                    }
                }
                originalProductSKU.setEntityStatus(EntityStatus.Update);
                ++updateCount;
            }
            MetaDaoHelper.update((String)"pc.product.Product", originalProductSKUList);
        }
        return updateCount;
    }

    private List<ProductSKU> getProductSKUByIdList(List<Long> productSKUIdList) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,name");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productSKUIdList)}));
        return MetaDaoHelper.queryObject((String)"pc.product.ProductSKU", (QuerySchema)querySchema, null);
    }

    public List<List<Long>> getProductSKUByMinId(int capacity) throws Exception {
        Long currentRangeId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        ArrayList<Long> productSKUIds = new ArrayList<Long>();
        List<Long> productSKUIdList = this.getProductSKUByMinId(currentRangeId, realMaxRowsValue);
        productSKUIds.addAll(productSKUIdList);
        while (productSKUIdList.size() >= realMaxRowsValue) {
            currentRangeId = (Long)productSKUIds.get(productSKUIdList.size() - 1);
            productSKUIdList = this.getProductSKUByMinId(currentRangeId, realMaxRowsValue);
            productSKUIds.addAll(productSKUIdList);
        }
        return ListSplitUtil.splitListByCapacity(productSKUIds, (int)capacity);
    }

    public List<Long> getProductSKUByMinId(Long minId, int realMaxRowsValue) {
        try {
            List<Long> idList = new ArrayList<Long>();
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").gt((Object)minId)}));
            querySchema.addOrderBy("id");
            QueryPager queryPager = new QueryPager();
            queryPager.setPageIndex(1);
            queryPager.setPageSize(realMaxRowsValue);
            querySchema.pager(queryPager);
            List productSKUList = MetaDaoHelper.queryObject((String)"pc.product.ProductSKU", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)productSKUList)) {
                idList = productSKUList.stream().map(map -> Long.parseLong(map.getId().toString())).collect(Collectors.toList());
            }
            return idList;
        }
        catch (Exception e) {
            throw new CoreDocBusinessException("SKU\u6863\u6848\u540d\u79f0\u53bb\u9664\u7a7a\u683c\u3001\u56de\u8f66\u67e5\u8be2MinId\u62a5\u9519\uff0c\u8bf7\u786e\u8ba4\uff01");
        }
    }
}

