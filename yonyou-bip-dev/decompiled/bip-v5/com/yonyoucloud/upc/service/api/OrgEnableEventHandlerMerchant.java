/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.service.IUPCMerchantQueryService
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IOrgEnableEventHandler;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.service.IUPCMerchantQueryService;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

public class OrgEnableEventHandlerMerchant
implements IOrgEnableEventHandler {
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private IUPCMerchantQueryService upcMerchantQueryService;

    @Override
    public void Handle(String orgId) throws Exception {
        String url = "/agent/infrastructure/upc/syn/agentrelation";
        List<String> orgIds = this.iupcControlRuleService.getVoucherManageShareParentOrgs("aa.merchant.Merchant", orgId);
        if (orgIds.isEmpty()) {
            return;
        }
        List<String> merchantIds = this.iupcControlRuleService.getSelfCreateVoucherByCreateOrg("aa.merchant.Merchant", orgIds);
        if (merchantIds.isEmpty()) {
            return;
        }
        List rangesInDb = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)QuerySchema.create().addSelect("merchantId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)orgId), QueryCondition.name((String)"merchantId").in(merchantIds)})));
        if (!rangesInDb.isEmpty()) {
            List merchantExists = rangesInDb.stream().map(map -> map.get("merchantId").toString()).collect(Collectors.toList());
            merchantIds.removeAll(merchantExists);
        }
        if (!merchantIds.isEmpty()) {
            QuerySchema querySchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").in(merchantIds), QueryCondition.name((String)"isCreator").eq((Object)1)}));
            QuerySchema detailSchema = QuerySchema.create().fullname("aa.merchant.MerchantApplyRangeDetail").name("merchantAppliedDetail").addSelect("*");
            querySchema.addCompositionSchema(detailSchema);
            List rangesList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema);
            HashSet<MerchantApplyRangeDetail> resutlDetails = new HashSet<MerchantApplyRangeDetail>();
            HashSet<MerchantApplyRange> ranges = new HashSet<MerchantApplyRange>();
            if (!CollectionUtils.isEmpty((Collection)rangesList)) {
                HashMap<String, String> params = new HashMap<String, String>();
                params.put("billNo", "aa_merchant");
                for (Map map2 : rangesList) {
                    MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
                    merchantApplyRange.setId((Object)IdManager.getInstance().nextId());
                    merchantApplyRange.setMerchantId(Long.valueOf(map2.get("merchantId").toString()));
                    merchantApplyRange.setRangeType(Integer.valueOf(1));
                    merchantApplyRange.setOrgId(orgId);
                    merchantApplyRange.setIsCreator(Boolean.valueOf(false));
                    merchantApplyRange.setIsApplied(Boolean.valueOf(false));
                    merchantApplyRange.setTenant((Long)AppContext.getCurrentUser().getTenant());
                    merchantApplyRange.setEntityStatus(EntityStatus.Insert);
                    ranges.add(merchantApplyRange);
                    MerchantApplyRangeDetail newmerchantApplyRangeDetail = new MerchantApplyRangeDetail();
                    MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                    merchantApplyRangeDetail.init((Map)map2.get("merchantAppliedDetail"));
                    this.upcMerchantQueryService.exchangeFromExtend((BizObject)merchantApplyRangeDetail, (BizObject)newmerchantApplyRangeDetail, params);
                    newmerchantApplyRangeDetail.setEntityStatus(EntityStatus.Insert);
                    newmerchantApplyRangeDetail.setMerchantApplyRangeId((Long)merchantApplyRange.getId());
                    newmerchantApplyRangeDetail.remove("merchantApplyRangeExtId");
                    resutlDetails.add(newmerchantApplyRangeDetail);
                }
            }
        }
    }
}

