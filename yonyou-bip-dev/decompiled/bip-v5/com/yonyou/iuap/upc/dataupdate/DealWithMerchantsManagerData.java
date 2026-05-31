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
 *  com.yonyoucloud.upc.aa.merchant.MerchantsManager
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
import com.yonyou.iuap.upc.dataupdate.DealWithMerchantData;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.aa.merchant.MerchantsManager;
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
public class DealWithMerchantsManagerData
extends DataUpdateBaseServcie {
    Logger logger = LoggerFactory.getLogger(DealWithMerchantData.class);

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return this.upgradeMerchantsManagerReplaceStr(tenant, capacity);
    }

    public int dataUpdateForTenant(int capacity) throws Exception {
        Tenant tenant = new Tenant();
        tenant.setId(AppContext.getCurrentUser().getTenant());
        tenant.setTenantCenter(AppContext.getCurrentUser().getYTenantId());
        return this.upgradeMerchantsManagerReplaceStr(tenant, capacity);
    }

    @Override
    public String getTaskName() {
        return "\u66f4\u65b0\u5ba2\u6237\u6863\u6848-\u5ba2\u6237\u7ba1\u7406\u5458\u59d3\u540d\u975e\u6cd5\u5b57\u7b26";
    }

    private int upgradeMerchantsManagerReplaceStr(Tenant tenant, int capacity) throws Exception {
        int tenantCount = 0;
        HashMap<String, String> tenantIdParamMap = new HashMap<String, String>(4);
        tenantIdParamMap.put("yTenantId", tenant.getTenantCenter());
        Object merchantCount = SqlHelper.selectOne((String)"com.yonyoucloud.upc.data.MerchantDoubleWriteDao.selectMerchantsManagerCountByTenantId", tenantIdParamMap);
        if (merchantCount != null && Integer.parseInt(merchantCount.toString()) > 0) {
            List<List<Long>> merchantsManagerIdSplitList = this.getSelfMerchantsManagerByMinId(capacity);
            for (List<Long> limitMerchantsManagerIdList : merchantsManagerIdSplitList) {
                int updateCount = this.updateMerchantsManagerReplaceStr(limitMerchantsManagerIdList);
                tenantCount += updateCount;
            }
            this.logger.error(String.format("\u79df\u6237\u3010%s\u3011\u66f4\u65b0\u5ba2\u6237\u6863\u6848-\u5ba2\u6237\u7ba1\u7406\u5458\u59d3\u540d\u53bb\u9664\u7a7a\u683c\u5347\u7ea7\u5b8c\u6210\uff0c\u5171\u8ba1\u5347\u7ea7\u6570\u636e\u3010%d\u3011\u6761\uff0c", tenant.getId().toString(), tenantCount) + LocalDateTime.now());
        }
        return tenantCount;
    }

    public int updateMerchantsManagerReplaceStr(List<Long> merchantsManagerIdList) throws Exception {
        List<MerchantsManager> originalMerchantsManagerList;
        int updateCount = 0;
        if (!CollectionUtils.isEmpty(merchantsManagerIdList) && !CollectionUtils.isEmpty(originalMerchantsManagerList = this.getMerchantsManagerByIdList(merchantsManagerIdList))) {
            for (MerchantsManager originalMerchantsManager : originalMerchantsManagerList) {
                if (!StringUtils.isEmpty((CharSequence)originalMerchantsManager.getFullName())) {
                    originalMerchantsManager.setFullName(MerchantUtils.replaceStr((String)originalMerchantsManager.getFullName()));
                    originalMerchantsManager.setEntityStatus(EntityStatus.Update);
                } else {
                    originalMerchantsManager.setEntityStatus(EntityStatus.Unchanged);
                }
                ++updateCount;
            }
            MetaDaoHelper.update((String)"aa.merchant.MerchantsManager", originalMerchantsManagerList);
        }
        return updateCount;
    }

    private List<MerchantsManager> getMerchantsManagerByIdList(List<Long> merchantsManagerIdList) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,fullName");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(merchantsManagerIdList)}));
        return MetaDaoHelper.queryObject((String)"aa.merchant.MerchantsManager", (QuerySchema)querySchema, null);
    }

    public List<List<Long>> getSelfMerchantsManagerByMinId(int capacity) throws Exception {
        Long currentRangeId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        ArrayList<Long> merchantsManagerIds = new ArrayList<Long>();
        List<Long> merchantsManagerIdList = this.getSelfMerchantsManagerByMinId(currentRangeId, realMaxRowsValue);
        merchantsManagerIds.addAll(merchantsManagerIdList);
        while (merchantsManagerIdList.size() >= realMaxRowsValue) {
            currentRangeId = merchantsManagerIdList.get(merchantsManagerIdList.size() - 1);
            merchantsManagerIdList = this.getSelfMerchantsManagerByMinId(currentRangeId, realMaxRowsValue);
            merchantsManagerIds.addAll(merchantsManagerIdList);
        }
        return ListSplitUtil.splitListByCapacity(merchantsManagerIds, (int)capacity);
    }

    public List<Long> getSelfMerchantsManagerByMinId(Long minId, int realMaxRowsValue) {
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
            List merchantsManagerList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantsManager", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)merchantsManagerList)) {
                idList = merchantsManagerList.stream().map(map -> Long.parseLong(map.getId().toString())).collect(Collectors.toList());
            }
            return idList;
        }
        catch (Exception e) {
            throw new CoreDocBusinessException("\u5ba2\u6237\u6863\u6848\u5ba2\u6237\u7ba1\u7406\u5458\u59d3\u540d\u53bb\u9664\u7a7a\u683c\u67e5\u8be2MinId\u62a5\u9519\uff0c\u8bf7\u786e\u8ba4\uff01");
        }
    }
}

