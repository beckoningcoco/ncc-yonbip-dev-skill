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
 *  com.yonyoucloud.upc.aa.merchant.Merchant
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
import com.yonyoucloud.upc.aa.merchant.Merchant;
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
public class DealWithMerchantData
extends DataUpdateBaseServcie {
    Logger logger = LoggerFactory.getLogger(DealWithMerchantData.class);

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return this.upgradeMerchantReplaceStr(tenant, capacity);
    }

    public int dataUpdateForTenant(int capacity) throws Exception {
        Tenant tenant = new Tenant();
        tenant.setId(AppContext.getCurrentUser().getTenant());
        tenant.setTenantCenter(AppContext.getCurrentUser().getYTenantId());
        return this.upgradeMerchantReplaceStr(tenant, capacity);
    }

    @Override
    public String getTaskName() {
        return "\u66f4\u65b0\u5ba2\u6237\u6863\u6848\u540d\u79f0\u3001\u7f16\u7801\u975e\u6cd5\u5b57\u7b26";
    }

    private int upgradeMerchantReplaceStr(Tenant tenant, int capacity) throws Exception {
        int tenantCount = 0;
        HashMap<String, String> tenantIdParamMap = new HashMap<String, String>(4);
        tenantIdParamMap.put("yTenantId", tenant.getTenantCenter());
        Object merchantCount = SqlHelper.selectOne((String)"com.yonyoucloud.upc.data.MerchantDoubleWriteDao.selectMerchantCountByTenantId", tenantIdParamMap);
        if (merchantCount != null && Integer.parseInt(merchantCount.toString()) > 0) {
            List<List<Long>> merchantIdSplitList = this.getSelfCreateVoucherMerchantByMinId(capacity);
            for (List<Long> limitMerchantIdList : merchantIdSplitList) {
                int updateCount = this.updateMerchantReplaceStr(limitMerchantIdList);
                tenantCount += updateCount;
            }
            this.logger.error(String.format("\u79df\u6237\u3010%s\u3011\u66f4\u65b0\u5ba2\u6237\u6863\u6848\u7f16\u7801\u3001\u540d\u79f0\u53bb\u9664\u7a7a\u683c\u5347\u7ea7\u5b8c\u6210\uff0c\u5171\u8ba1\u5347\u7ea7\u6570\u636e\u3010%d\u3011\u6761\uff0c", tenant.getId().toString(), tenantCount) + LocalDateTime.now());
        }
        return tenantCount;
    }

    public int updateMerchantReplaceStr(List<Long> merchantIdList) throws Exception {
        List<Merchant> originalMerchantList;
        int updateCount = 0;
        if (!CollectionUtils.isEmpty(merchantIdList) && !CollectionUtils.isEmpty(originalMerchantList = this.getMerchantByIdList(merchantIdList))) {
            for (Merchant originalMerchant : originalMerchantList) {
                originalMerchant.setCode(MerchantUtils.replaceStr((String)originalMerchant.getCode()));
                if (originalMerchant.get("name") instanceof String) {
                    originalMerchant.set("name", (Object)MerchantUtils.replaceStr((String)((String)originalMerchant.get("name"))));
                } else if (originalMerchant.get("name") instanceof BizObject) {
                    String merchantLocaleName = String.valueOf(MultilangUtil.getAttr((String)"aa.merchant.Merchant", (String)"name", (BizObject)originalMerchant, null));
                    String locale = InvocationInfoProxy.getLocale();
                    BizObject nameObject = (BizObject)originalMerchant.get("name");
                    if (null == locale) {
                        nameObject.set("zh_CN", (Object)MerchantUtils.replaceStr((String)merchantLocaleName));
                    } else {
                        nameObject.set(locale, (Object)MerchantUtils.replaceStr((String)merchantLocaleName));
                    }
                }
                originalMerchant.setEntityStatus(EntityStatus.Update);
                ++updateCount;
            }
            MetaDaoHelper.update((String)"aa.merchant.Merchant", originalMerchantList);
        }
        return updateCount;
    }

    private List<Merchant> getMerchantByIdList(List<Long> merchantIdList) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,code,name");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(merchantIdList)}));
        return MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
    }

    public List<List<Long>> getSelfCreateVoucherMerchantByMinId(int capacity) throws Exception {
        Long currentRangeId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        ArrayList<Long> merchantIds = new ArrayList<Long>();
        List<Long> merchantIdList = this.getSelfCreateVoucherMerchantByMinId(currentRangeId, realMaxRowsValue);
        merchantIds.addAll(merchantIdList);
        while (merchantIdList.size() >= realMaxRowsValue) {
            currentRangeId = merchantIdList.get(merchantIdList.size() - 1);
            merchantIdList = this.getSelfCreateVoucherMerchantByMinId(currentRangeId, realMaxRowsValue);
            merchantIds.addAll(merchantIdList);
        }
        return ListSplitUtil.splitListByCapacity(merchantIds, (int)capacity);
    }

    public List<Long> getSelfCreateVoucherMerchantByMinId(Long minId, int realMaxRowsValue) {
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
            List merchantList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)merchantList)) {
                idList = merchantList.stream().map(map -> Long.parseLong(map.getId().toString())).collect(Collectors.toList());
            }
            return idList;
        }
        catch (Exception e) {
            throw new CoreDocBusinessException("\u5ba2\u6237\u6863\u6848\u7f16\u7801\u3001\u540d\u79f0\u53bb\u9664\u7a7a\u683c\u67e5\u8be2MinId\u62a5\u9519\uff0c\u8bf7\u786e\u8ba4\uff01");
        }
    }

    public String deleteNotExistentRangId(List<Long> merchantApplyRangeIdList) {
        try {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(merchantApplyRangeIdList), QueryCondition.name((String)"ytenant").eq(AppContext.getYTenantId())}));
            querySchema.setPartitionable(false);
            List merchantApplyRangeInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
            if (CollectionUtils.isEmpty((Collection)merchantApplyRangeInDbList)) {
                HashMap<String, Object> param = new HashMap<String, Object>();
                param.put("ytenant", AppContext.getYTenantId());
                param.put("updatetenant", -((Long)AppContext.getCurrentUser().getTenant()).longValue());
                param.put("updateytenant", "-" + AppContext.getYTenantId());
                param.put("merchantApplyRangeIdList", merchantApplyRangeIdList);
                SqlHelper.update((String)"com.yonyoucloud.upc.data.MerchantDoubleWriteDao.updateNotExistentRangId", param);
                return "\u63a5\u53e3\u8c03\u7528\u5b8c\u6210";
            }
            return "\u5b58\u5728merchantApplyRangeId";
        }
        catch (Exception e) {
            this.logger.error("deleteNotExistentRangId:" + e.getMessage(), (Throwable)e);
            return "\u63a5\u53e3\u8c03\u7528\u5931\u8d25!";
        }
    }
}

