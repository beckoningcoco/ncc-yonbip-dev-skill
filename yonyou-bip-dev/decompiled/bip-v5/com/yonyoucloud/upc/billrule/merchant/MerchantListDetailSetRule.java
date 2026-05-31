/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.iuap.bizdoc.service.model.RegionCorpModel
 *  com.yonyou.iuap.bizdoc.service.model.RegionCorpQueryParam
 *  com.yonyou.iuap.bizdoc.service.regioncorp.IRegionCorpQueryService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.bizdoc.service.model.RegionCorpModel;
import com.yonyou.iuap.bizdoc.service.model.RegionCorpQueryParam;
import com.yonyou.iuap.bizdoc.service.regioncorp.IRegionCorpQueryService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantListDetailSetRule")
public class MerchantListDetailSetRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(MerchantListDetailSetRule.class);
    @Autowired
    private IRegionCorpQueryService regionCorpQueryService;
    @Autowired
    private PubOptionDataQueryUtil pubOptionDataQueryUtil;
    private static final int REGION_CODE_BATCH_CAPACITY = 500;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        Map externaldata;
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        if (billDataDto.getExternalData() instanceof Map && (externaldata = (Map)billDataDto.getExternalData()) != null && !externaldata.isEmpty()) {
            Map merchantMap;
            if (externaldata.get("importType") != null && externaldata.get("importMode") != null && externaldata.get("importType").equals(2) && externaldata.get("importMode").equals(2)) {
                Map bill = (Map)map.get("return");
                if (bill.get("merchantRole!businessRole") != null && bill.get("merchantRole!businessRole").equals("1")) {
                    bill.put("merchantRole!businessRole", null);
                    bill.put("merchantsManager!countryCode", null);
                    bill.put("merchantsManager!mobile", null);
                    bill.put("merchantsManager!fullName", null);
                    bill.put("merchantsManager!email", null);
                }
                if (bill.get("isCreator") != null && !((Boolean)bill.get("isCreator")).booleanValue()) {
                    bill.remove("merchantAddressInfos");
                    bill.remove("merchantContacterInfos");
                    bill.remove("merchantAgentFinancialInfos");
                    bill.remove("merchantAgentInvoiceInfos");
                }
            }
            if ("batchoutput".equals(externaldata.get("actionName")) && (merchantMap = (Map)map.get("return")) != null) {
                try {
                    this.processMerchantRegions(merchantMap);
                }
                catch (Exception e) {
                    log.error("\u5730\u5740\u67e5\u8be2\u6709\u8befgetAllRegion\uff1a" + e.getMessage(), (Throwable)e);
                }
            }
        }
        this.dealDetail(billContext, map);
        return new RuleExecuteResult();
    }

    private void processMerchantRegions(Map<String, Object> merchantMap) {
        List<String> queryRegionCodeAllList = this.collectRegionCodes(merchantMap);
        if (!queryRegionCodeAllList.isEmpty()) {
            Map<String, RegionCorpModel> regionCorpModelsMap = this.fetchRegionCorpModels(queryRegionCodeAllList);
            this.enrichMerchantRegionNames(merchantMap, regionCorpModelsMap);
        }
    }

    private List<String> collectRegionCodes(Map<String, Object> merchantMap) {
        ArrayList<String> queryRegionCodeAllList = new ArrayList<String>();
        Optional.ofNullable(merchantMap.get("regionCode")).filter(it -> it instanceof String).ifPresent(element -> queryRegionCodeAllList.add((String)element));
        List merchantAddressInfos = (List)merchantMap.get("merchantAddressInfos");
        if (merchantAddressInfos != null) {
            queryRegionCodeAllList.addAll(merchantAddressInfos.stream().filter(it -> it.get("regionCode") instanceof String).map(m -> (String)m.get("regionCode")).collect(Collectors.toList()));
        }
        return queryRegionCodeAllList;
    }

    private Map<String, RegionCorpModel> fetchRegionCorpModels(List<String> queryRegionCodeAllList) {
        List splitRegionCodeAllList = ListSplitUtil.splitListByCapacity(queryRegionCodeAllList, (int)500);
        HashMap<String, RegionCorpModel> regionCorpModelsMap = new HashMap<String, RegionCorpModel>(queryRegionCodeAllList.size());
        for (List batchRegionCodeList : splitRegionCodeAllList) {
            List<RegionCorpModel> regionCorpModels = this.queryRegionCorps(batchRegionCodeList);
            regionCorpModels.forEach(model -> regionCorpModelsMap.put(model.getCode(), (RegionCorpModel)model));
        }
        return regionCorpModelsMap;
    }

    private List<RegionCorpModel> queryRegionCorps(List<String> batchRegionCodeList) {
        RegionCorpQueryParam regionCorpQueryParam = new RegionCorpQueryParam();
        regionCorpQueryParam.setCodes(batchRegionCodeList);
        return this.regionCorpQueryService.queryRegionCorps(regionCorpQueryParam);
    }

    private void enrichMerchantRegionNames(Map<String, Object> merchantMap, Map<String, RegionCorpModel> regionCorpModelsMap) {
        Optional.ofNullable(merchantMap.get("regionCode")).filter(it -> it instanceof String).map(regionCorpModelsMap::get).ifPresent(model -> merchantMap.put("regionNameExport", model.getMergerName()));
        List merchantAddressInfos = (List)merchantMap.get("merchantAddressInfos");
        if (merchantAddressInfos != null) {
            merchantAddressInfos.forEach(addressInfoMap -> Optional.ofNullable(addressInfoMap.get("regionCode")).filter(it -> it instanceof String).map(regionCorpModelsMap::get).ifPresent(model -> addressInfoMap.put("regionNameExport", model.getMergerName())));
        }
    }

    public void dealDetail(BillContext billContext, Map<String, Object> map) throws Exception {
        Map merchantMap;
        Long merchantId;
        Long merchantApplyRangeId = Long.parseLong(billContext.getContext().get("@merchantApplyRangeId").toString());
        List<MerchantApplyRange> merchantApplyRangeList = this.getMerchantApplyRangeById(merchantApplyRangeId, merchantId = Long.valueOf(Long.parseLong((merchantMap = (Map)map.get("return")).get("id").toString())));
        if (CollectionUtils.isEmpty(merchantApplyRangeList)) {
            return;
        }
        this.dealMerchantApplyRangeField(merchantMap, merchantApplyRangeList.get(0));
    }

    public void dealMerchantApplyRangeField(Map<String, Object> merchantMap, MerchantApplyRange merchantApplyRange) {
        List merchantAppliedDetailList;
        if (merchantMap.get("merchantAppliedDetail!signBack") != null && BooleanUtil.isFalse((Object)merchantMap.get("merchantAppliedDetail!signBack"))) {
            merchantMap.put("merchantAppliedDetail!signBack", 0);
        }
        if (merchantMap.get("merchantAppliedDetail!signBack") != null && BooleanUtil.isTrue((Object)merchantMap.get("merchantAppliedDetail!signBack"))) {
            merchantMap.put("merchantAppliedDetail!signBack", 1);
        }
        if (merchantMap.get("signBack") != null && BooleanUtil.isFalse((Object)merchantMap.get("signBack"))) {
            merchantMap.put("signBack", 0);
        }
        if (merchantMap.get("signBack") != null && BooleanUtil.isTrue((Object)merchantMap.get("signBack"))) {
            merchantMap.put("signBack", 1);
        }
        if (merchantMap.get("merchantAppliedDetail!createTime") != null) {
            merchantMap.put("createTime", merchantMap.get("merchantAppliedDetail!createTime"));
        }
        if (merchantMap.get("merchantAppliedDetail") != null && merchantMap.get("merchantAppliedDetail") instanceof List && !CollectionUtils.isEmpty((Collection)(merchantAppliedDetailList = (List)merchantMap.get("merchantAppliedDetail")))) {
            for (Object merchantAppliedDetail : merchantAppliedDetailList) {
                if (!(merchantAppliedDetail instanceof Map)) continue;
                Map appliedDetail = (Map)merchantAppliedDetail;
                if (appliedDetail.get("signBack") != null && BooleanUtil.isTrue(appliedDetail.get("signBack"))) {
                    appliedDetail.put("signBack", 1);
                }
                if (appliedDetail.get("signBack") != null && BooleanUtil.isFalse(appliedDetail.get("signBack"))) {
                    appliedDetail.put("signBack", 0);
                }
                if (appliedDetail.get("createTime") == null) continue;
                merchantMap.put("createTime", appliedDetail.get("createTime"));
            }
        }
        merchantMap.put("merchantAppliedDetail!merchantApplyRangeId", merchantApplyRange.getId());
        merchantMap.put("isApplied", merchantApplyRange.getIsApplied());
        merchantMap.put("isCreator", merchantApplyRange.getIsCreator());
        merchantMap.put("merchantAppliedDetail!belongMerchant_Name", merchantApplyRange.getString("orgId_name"));
        merchantMap.put("merchantAppliedDetail!belongMerchant", merchantApplyRange.getOrgId());
        merchantMap.put("belongOrg_Name", merchantApplyRange.getString("orgId_name"));
        merchantMap.put("belongOrg", merchantApplyRange.getOrgId());
    }

    public List<MerchantApplyRange> getMerchantApplyRangeById(Long merchantApplyRangeId, Long merchantId) throws Exception {
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchantApplyRangeId), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        QuerySchema schema = QuerySchema.create().addSelect("id,orgId,orgId.name as orgId_name,orgId.code as orgId_code,isApplied,isCreator").addCondition((ConditionExpression)condition);
        schema.setPartitionable(false);
        List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            return null;
        }
        return merchantApplyRangeList;
    }
}

