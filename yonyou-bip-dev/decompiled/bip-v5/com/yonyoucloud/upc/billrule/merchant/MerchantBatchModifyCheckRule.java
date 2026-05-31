/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.basedoc.model.ReceiveAgreementVO
 *  com.yonyou.ucf.basedoc.model.rpcparams.receiveagreements.RecagreementParams
 *  com.yonyou.ucf.basedoc.service.itf.IReceiveAgreementService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.MerchantRoleInfo
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.basedoc.model.ReceiveAgreementVO;
import com.yonyou.ucf.basedoc.model.rpcparams.receiveagreements.RecagreementParams;
import com.yonyou.ucf.basedoc.service.itf.IReceiveAgreementService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.MerchantRoleInfo;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantBatchModifyCheckRule")
public class MerchantBatchModifyCheckRule
extends AbstractCommonRule {
    @Autowired
    IReceiveAgreementService receiveAgreementService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800137);
        }
        List bills = this.getBills(billContext, paramMap);
        for (BizObject bill : bills) {
            String businessRole;
            bill.setEntityStatus(EntityStatus.Update);
            if (bill.get("isCreator").equals(false) && !"CRM".equals(bill.get("srcBill"))) {
                BizObject customItems;
                if (bill.containsKey((Object)"country") || bill.containsKey((Object)"country_name")) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800384, new Object[]{bill.get("code").toString()});
                }
                if (bill.containsKey((Object)"retailInvestors")) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808052, new Object[]{bill.get("code").toString()});
                }
                if (bill.containsKey((Object)"customerClass") || bill.containsKey((Object)"customerClass_Name")) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808053, new Object[]{bill.get("code").toString()});
                }
                if (bill.containsKey((Object)"customerArea") || bill.containsKey((Object)"customerArea_Name")) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808054, new Object[]{bill.get("code").toString()});
                }
                if (bill.containsKey((Object)"customerIndustry") || bill.containsKey((Object)"customerIndustry_Name")) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808055, new Object[]{bill.get("code").toString()});
                }
                if (bill.containsKey((Object)"taxPayingCategories")) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808056, new Object[]{bill.get("code").toString()});
                }
                if (bill.containsKey((Object)"language") || bill.containsKey((Object)"language_Name")) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808057, new Object[]{bill.get("code").toString()});
                }
                if (bill.containsKey((Object)"timeZone") || bill.containsKey((Object)"timeZone_Name")) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808058, new Object[]{bill.get("code").toString()});
                }
                if (null != bill.get("customerDefine") && (customItems = (BizObject)bill.get("customerDefine")).keySet().stream().anyMatch(key -> key.contains("customerDefine"))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808059, new Object[]{bill.get("code").toString()});
                }
            }
            Merchant merchant = (Merchant)bill;
            merchant.put("isBatchModifyMerchant", (Object)"isBatchModifyMerchant");
            List merchantApplyRangeDetailList = merchant.merchantAppliedDetail();
            MerchantRoleInfo merchantRoleInfo = merchant.merchantRole();
            if (!CollectionUtils.isEmpty((Map)merchantRoleInfo) && !StringUtils.isBlank((CharSequence)merchantRoleInfo.getBusinessRole()) && ((businessRole = merchantRoleInfo.getBusinessRole()).contains("3") || businessRole.contains("4") || businessRole.contains("5")) && !CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList) && ((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).containsKey((Object)"transactionCurrency") && ((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).getTransactionCurrency() == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808060, new Object[]{bill.get("code").toString()});
            }
            if (CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList) || !((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).containsKey((Object)"collectionAgreement") || ((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).getCollectionAgreement() == null || merchant.getCreateOrg() == null) continue;
            RecagreementParams recagreementParams = new RecagreementParams();
            recagreementParams.setId(((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).getCollectionAgreement());
            recagreementParams.setUseOrg(merchant.getCreateOrg());
            ReceiveAgreementVO receiveAgreement = this.receiveAgreementService.queryByUniqueParam(recagreementParams);
            if (receiveAgreement != null && receiveAgreement.getId() != null) continue;
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800392, new Object[]{merchant.getCode()});
        }
        return new RuleExecuteResult();
    }
}

