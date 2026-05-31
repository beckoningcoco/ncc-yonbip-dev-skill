/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  org.imeta.orm.base.BizObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyoucloud.upc.service.MerchantService;
import com.yonyoucloud.upc.service.merchantapplyrangegroup.MerchantGroupService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="merchantEnableRule")
public class MerchantEnableRule
extends AbstractCommonRule {
    @Autowired
    private MerchantService merchantService;
    @Autowired
    private MerchantGroupService merchantGroupService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        if (null != bills && bills.size() > 0) {
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("yTenantId", AppContext.getCurrentUser().getYTenantId());
            Object channelOperateCenter = OptionUtils.getSysOptionByName((String)"app:ChannelOperateCenter");
            String defaultOpen = "true";
            int checkLicenseSum = 0;
            try {
                for (BizObject bill : bills) {
                    Long merchantApplyRangeId = 0L;
                    if (bill.get("merchantApplyRangeId") != null) {
                        merchantApplyRangeId = Long.valueOf(bill.get("merchantApplyRangeId").toString());
                    }
                    Long merchantId = 0L;
                    if (bill.getId() != null) {
                        merchantId = Long.valueOf(bill.getId().toString());
                    }
                    if ((bill.get("isCreator") == null || Boolean.valueOf(bill.get("isCreator").toString()).booleanValue()) && channelOperateCenter != null && defaultOpen.equals(channelOperateCenter.toString())) {
                        this.merchantService.decrUnionKeyCheckLicense(bill, false);
                        ++checkLicenseSum;
                    }
                    params.put("merchantid", bill.get("id"));
                    params.put("merchantapplyrangeid", bill.get("merchantApplyRangeId"));
                    SqlHelper.update((String)"com.yonyoucloud.upc.option.dao.merchant.enableMerchant", params);
                    this.merchantGroupService.enableMerchantApplyRangeGroup(merchantId, merchantApplyRangeId);
                }
            }
            catch (Exception e) {
                for (int j = 0; j < checkLicenseSum; ++j) {
                    if (((BizObject)bills.get(j)).get("isCreator") != null && !Boolean.valueOf(((BizObject)bills.get(j)).get("isCreator").toString()).booleanValue() || channelOperateCenter == null || !defaultOpen.equals(channelOperateCenter.toString())) continue;
                    this.merchantService.incrUnionKeyCheckLicense((BizObject)bills.get(j), false);
                }
                throw new Exception(e);
            }
        }
        return new RuleExecuteResult();
    }
}

