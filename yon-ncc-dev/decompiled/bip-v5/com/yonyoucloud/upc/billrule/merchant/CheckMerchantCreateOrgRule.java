/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.service.IUPCMerchantQueryService
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.service.IUPCMerchantQueryService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="checkMerchantCreateOrgRule")
public class CheckMerchantCreateOrgRule
extends AbstractCommonRule {
    @Autowired
    private IUPCMerchantQueryService iupcMerchantQueryService;
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List merchantAppliedDetailList;
        LoginUser currentUser = AppContext.getCurrentUser();
        if (null == currentUser) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, map);
        Merchant merchant = (Merchant)bills.get(0);
        if (merchant.get("merchantAppliedDetail!signBack") != null && BooleanUtil.isFalse((Object)merchant.get("merchantAppliedDetail!signBack"))) {
            merchant.put("merchantAppliedDetail!signBack", (Object)0);
        }
        if (merchant.get("merchantAppliedDetail!signBack") != null && BooleanUtil.isTrue((Object)merchant.get("merchantAppliedDetail!signBack"))) {
            merchant.put("merchantAppliedDetail!signBack", (Object)1);
        }
        if (merchant.get("merchantAppliedDetail") != null && merchant.get("merchantAppliedDetail") instanceof List && !CollectionUtils.isEmpty((Collection)(merchantAppliedDetailList = (List)merchant.get("merchantAppliedDetail")))) {
            for (Object merchantAppliedDetail : merchantAppliedDetailList) {
                if (!(merchantAppliedDetail instanceof Map)) continue;
                Map appliedDetail = (Map)merchantAppliedDetail;
                if (appliedDetail.get("signBack") != null && BooleanUtil.isTrue(appliedDetail.get("signBack"))) {
                    appliedDetail.put("signBack", 1);
                }
                if (appliedDetail.get("signBack") == null || !BooleanUtil.isFalse(appliedDetail.get("signBack"))) continue;
                appliedDetail.put("signBack", 0);
            }
        }
        return new RuleExecuteResult();
    }
}

