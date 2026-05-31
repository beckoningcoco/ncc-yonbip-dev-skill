/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.busidoc.regioncorp.RegionCorp
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ypd.bd.api.IBDQueryRepository
 *  com.yonyoucloud.upc.aa.merchant.AddressInfo
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryPager
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyou.iuap.upc.dataupdate;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.busidoc.regioncorp.RegionCorp;
import com.yonyou.iuap.upc.dataupdate.DataUpdateBaseServcie;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ypd.bd.api.IBDQueryRepository;
import com.yonyoucloud.upc.aa.merchant.AddressInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryPager;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class DealWithAddressMergerNameData
extends DataUpdateBaseServcie {
    private static final Logger log = LoggerFactory.getLogger(DealWithAddressMergerNameData.class);
    @Autowired
    YMSParamConfig ymsParamConfig;
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;
    @Autowired
    private IBDQueryRepository billQueryRepository;

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return this.upgradeMergerName(null);
    }

    public int businessDataUpdateByMerchantId(Long merchantId) {
        RobotExecutors.runAs((String)AppContext.getCurrentUser().getYTenantId(), () -> {
            try {
                this.upgradeMergerName(merchantId);
            }
            catch (Exception e) {
                log.error("\u5ba2\u6237\u5730\u5740\u4fe1\u606fmergerName\u5347\u7ea7\u5f02\u5e38:{}", (Object)e.getMessage(), (Object)e);
            }
        }, (ExecutorService)this.ymsLongTaskExecutorService);
        return 0;
    }

    @Override
    public String getTaskName() {
        return "\u66f4\u65b0\u5ba2\u6237\u6863\u6848-\u5730\u5740\u4fe1\u606fmergerName\u5b57\u6bb5";
    }

    private int upgradeMergerName(Long merchantId) throws Exception {
        int tenantCount = 0;
        List<AddressInfo> addressInfoIdDbList = this.getSelfAddressInfoByMinId(merchantId);
        if (!CollectionUtils.isEmpty(addressInfoIdDbList)) {
            List<RegionCorp> regionCodeInDbList;
            ArrayList<AddressInfo> addressInfoList = new ArrayList<AddressInfo>();
            HashSet<String> regionCodeSet = new HashSet<String>();
            for (AddressInfo addressInfo : addressInfoIdDbList) {
                if (StringUtils.isEmpty((CharSequence)addressInfo.getRegionCode())) continue;
                regionCodeSet.add(addressInfo.getRegionCode());
            }
            HashMap<String, String> regionCodeMap = new HashMap<String, String>();
            if (!CollectionUtils.isEmpty(regionCodeSet) && !CollectionUtils.isEmpty(regionCodeInDbList = this.getMergerNameByRegionCodeList(new ArrayList<String>(regionCodeSet)))) {
                for (RegionCorp regionCorp : regionCodeInDbList) {
                    regionCodeMap.put(regionCorp.getCode(), regionCorp.getMergerName());
                }
            }
            if (!CollectionUtils.isEmpty(regionCodeMap)) {
                for (AddressInfo addressInfo : addressInfoIdDbList) {
                    if (StringUtils.isEmpty((CharSequence)addressInfo.getRegionCode()) || StringUtils.isEmpty((CharSequence)((CharSequence)regionCodeMap.get(addressInfo.getRegionCode()))) || StringUtils.isEmpty((CharSequence)addressInfo.getAddress())) continue;
                    StringBuilder stringBuilder = new StringBuilder();
                    String newMergerName = StringUtils.replace((String)((String)regionCodeMap.get(addressInfo.getRegionCode())), (String)"|", (String)" ");
                    stringBuilder.append(newMergerName);
                    stringBuilder.append(addressInfo.getAddress());
                    addressInfo.setMergerName(stringBuilder.toString());
                    addressInfo.setEntityStatus(EntityStatus.Update);
                    addressInfoList.add(addressInfo);
                    ++tenantCount;
                }
            }
            if (!CollectionUtils.isEmpty(addressInfoList)) {
                MetaDaoHelper.update((String)"aa.merchant.AddressInfo", addressInfoList);
            }
        }
        return tenantCount;
    }

    public List<AddressInfo> getSelfAddressInfoByMinId(Long merchantId) {
        Long currentRangeId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        List<AddressInfo> merchantsAddressIdList = this.getSelfAddressInfoByMinId(currentRangeId, realMaxRowsValue, merchantId);
        ArrayList<AddressInfo> merchantsAddressIds = new ArrayList<AddressInfo>(merchantsAddressIdList);
        while (merchantsAddressIdList.size() >= realMaxRowsValue) {
            currentRangeId = (Long)merchantsAddressIdList.get(merchantsAddressIdList.size() - 1).getId();
            merchantsAddressIdList = this.getSelfAddressInfoByMinId(currentRangeId, realMaxRowsValue, merchantId);
            merchantsAddressIds.addAll(merchantsAddressIdList);
        }
        return merchantsAddressIds;
    }

    public List<AddressInfo> getSelfAddressInfoByMinId(Long minId, int realMaxRowsValue, Long merchantId) {
        try {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").gt((Object)minId)});
            if (merchantId != null) {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId").eq((Object)merchantId));
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id,regionCode,address");
            querySchema.addCondition((ConditionExpression)queryConditionGroup);
            querySchema.addOrderBy("id");
            QueryPager queryPager = new QueryPager();
            queryPager.setPageIndex(1);
            queryPager.setPageSize(realMaxRowsValue);
            querySchema.pager(queryPager);
            return MetaDaoHelper.queryObject((String)"aa.merchant.AddressInfo", (QuerySchema)querySchema, null);
        }
        catch (Exception e) {
            throw new CoreDocBusinessException("\u5ba2\u6237\u6863\u6848\u5730\u5740\u4fe1\u606fmergerName\u5347\u7ea7\u67e5\u8be2MinId\u62a5\u9519\uff0c\u8bf7\u786e\u8ba4\uff01");
        }
    }

    public List<RegionCorp> getMergerNameByRegionCodeList(List<String> regionCodeList) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("code,mergerName");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in(regionCodeList)}));
        return this.billQueryRepository.queryBySchema("aa.regioncorp.RegionCorp", querySchema, null);
    }
}

