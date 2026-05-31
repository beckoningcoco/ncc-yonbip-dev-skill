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
 *  com.yonyoucloud.upc.aa.merchant.AddressInfo
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.apache.commons.lang3.StringUtils
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
import com.yonyou.iuap.upc.dataupdate.DataUpdateBaseServcie;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.aa.merchant.AddressInfo;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
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
public class DealWithMerchantAddressData
extends DataUpdateBaseServcie {
    Logger logger = LoggerFactory.getLogger(DealWithMerchantAddressData.class);

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return this.upgradeMerchantsAddressReplaceStr(tenant, capacity);
    }

    public int dataUpdateForTenant(int capacity) throws Exception {
        Tenant tenant = new Tenant();
        tenant.setId(AppContext.getCurrentUser().getTenant());
        tenant.setTenantCenter(AppContext.getCurrentUser().getYTenantId());
        return this.upgradeMerchantsAddressReplaceStr(tenant, capacity);
    }

    @Override
    public String getTaskName() {
        return "\u66f4\u65b0\u5ba2\u6237\u6863\u6848-\u5730\u5740\u4fe1\u606f\u7f16\u7801\u975e\u6cd5\u5b57\u7b26";
    }

    private int upgradeMerchantsAddressReplaceStr(Tenant tenant, int capacity) throws Exception {
        int tenantCount = 0;
        HashMap<String, String> tenantIdParamMap = new HashMap<String, String>(4);
        tenantIdParamMap.put("yTenantId", tenant.getTenantCenter());
        Object merchantCount = SqlHelper.selectOne((String)"com.yonyoucloud.upc.data.MerchantDoubleWriteDao.selectMerchantsAddressCountByYTenantId", tenantIdParamMap);
        if (merchantCount != null && Integer.parseInt(merchantCount.toString()) > 0) {
            List<List<Long>> merchantsAddressIdSplitList = this.getSelfAddressInfoByMinId(capacity);
            for (List<Long> limitMerchantsAddressIdList : merchantsAddressIdSplitList) {
                int updateCount = this.updateMerchantsAddressReplaceStr(limitMerchantsAddressIdList);
                tenantCount += updateCount;
            }
            this.logger.error(String.format("\u79df\u6237\u3010%s\u3011\u66f4\u65b0\u5ba2\u6237\u6863\u6848-\u5730\u5740\u4fe1\u606f\u7f16\u7801\u53bb\u9664\u7a7a\u683c\u5347\u7ea7\u5b8c\u6210\uff0c\u5171\u8ba1\u5347\u7ea7\u6570\u636e\u3010%d\u3011\u6761\uff0c", tenant.getId().toString(), tenantCount) + LocalDateTime.now());
        }
        return tenantCount;
    }

    public int updateMerchantsAddressReplaceStr(List<Long> merchantsAddressIdList) throws Exception {
        List<AddressInfo> originalAddressInfoList;
        int updateCount = 0;
        if (!CollectionUtils.isEmpty(merchantsAddressIdList) && !CollectionUtils.isEmpty(originalAddressInfoList = this.getAddressInfoByIdList(merchantsAddressIdList))) {
            for (AddressInfo originalAddressInfo : originalAddressInfoList) {
                if (!StringUtils.isEmpty((CharSequence)originalAddressInfo.getAddressCode())) {
                    originalAddressInfo.setAddressCode(MerchantUtils.replaceStr((String)originalAddressInfo.getAddressCode()));
                    originalAddressInfo.setEntityStatus(EntityStatus.Update);
                } else {
                    originalAddressInfo.setEntityStatus(EntityStatus.Unchanged);
                }
                ++updateCount;
            }
            MetaDaoHelper.update((String)"aa.merchant.AddressInfo", originalAddressInfoList);
        }
        return updateCount;
    }

    private List<AddressInfo> getAddressInfoByIdList(List<Long> merchantsAddressIdList) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,addressCode");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(merchantsAddressIdList)}));
        return MetaDaoHelper.queryObject((String)"aa.merchant.AddressInfo", (QuerySchema)querySchema, null);
    }

    public List<List<Long>> getSelfAddressInfoByMinId(int capacity) {
        Long currentRangeId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        ArrayList<Long> merchantsAddressIds = new ArrayList<Long>();
        List<Long> merchantsAddressIdList = this.getSelfAddressInfoByMinId(currentRangeId, realMaxRowsValue);
        merchantsAddressIds.addAll(merchantsAddressIdList);
        while (merchantsAddressIdList.size() >= realMaxRowsValue) {
            currentRangeId = merchantsAddressIdList.get(merchantsAddressIdList.size() - 1);
            merchantsAddressIdList = this.getSelfAddressInfoByMinId(currentRangeId, realMaxRowsValue);
            merchantsAddressIds.addAll(merchantsAddressIdList);
        }
        return ListSplitUtil.splitListByCapacity(merchantsAddressIds, (int)capacity);
    }

    public List<Long> getSelfAddressInfoByMinId(Long minId, int realMaxRowsValue) {
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
            List merchantsAddressList = MetaDaoHelper.queryObject((String)"aa.merchant.AddressInfo", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)merchantsAddressList)) {
                idList = merchantsAddressList.stream().map(map -> Long.parseLong(map.getId().toString())).collect(Collectors.toList());
            }
            return idList;
        }
        catch (Exception e) {
            throw new CoreDocBusinessException("\u5ba2\u6237\u6863\u6848\u5730\u5740\u4fe1\u606f\u7f16\u7801\u53bb\u9664\u7a7a\u683c\u67e5\u8be2MinId\u62a5\u9519\uff0c\u8bf7\u786e\u8ba4\uff01");
        }
    }
}

