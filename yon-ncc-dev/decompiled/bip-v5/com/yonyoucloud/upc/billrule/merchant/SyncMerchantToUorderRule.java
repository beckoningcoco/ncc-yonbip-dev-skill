/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.i18n.utils.MddMultilingualUtil
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyoucloud.upc.aa.merchant.AgentFinancial
 *  com.yonyoucloud.upc.aa.merchant.AgentInvoice
 *  com.yonyoucloud.upc.aa.merchant.Contacter
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.i18n.utils.MddMultilingualUtil;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyoucloud.upc.aa.merchant.AgentFinancial;
import com.yonyoucloud.upc.aa.merchant.AgentInvoice;
import com.yonyoucloud.upc.aa.merchant.Contacter;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="syncMerchantToUorderRule")
public class SyncMerchantToUorderRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(SyncMerchantToUorderRule.class);
    Logger logger = LoggerFactory.getLogger(SyncMerchantToUorderRule.class);
    @Autowired
    private YMSParamConfig ymsParamConfig;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        LoginUser currentUser = AppContext.getCurrentUser();
        if (null == currentUser) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, map);
        Object isOpenPortal = OptionUtils.getOptionByName((String)"u8c-config", (String)"app:portalMG", null);
        String defaultOpen = "0";
        if (isOpenPortal == null || Objects.equals(defaultOpen, isOpenPortal.toString()) || Objects.equals("false", isOpenPortal.toString())) {
            return new RuleExecuteResult();
        }
        for (BizObject bill : bills) {
            Merchant merchant = (Merchant)bill;
            if (!EntityStatus.Insert.equals(merchant.get("entityStatus"))) continue;
            merchant.setMerchantContacterInfos(this.transferBizObject(merchant.merchantContacterInfos(), EntityStatus.Insert));
            merchant.put("_status", merchant.get("entityStatus"));
            String i18NEnable = this.ymsParamConfig.getMddI18nEnable();
            boolean isEnable = StringUtils.isNotBlank((CharSequence)i18NEnable) && ("true".equalsIgnoreCase(i18NEnable) || Boolean.valueOf(i18NEnable) == true);
            String locale = MddMultilingualUtil.getLocale();
            if (!isEnable || !StringUtils.isNotBlank((CharSequence)locale)) continue;
            this.dealMultiName(merchant, locale);
        }
        return new RuleExecuteResult();
    }

    private void dealMultiName(Merchant merchant, String locale) {
        List agentFinancials;
        List agentInvoices;
        List contacters = merchant.merchantContacterInfos();
        if (!CollectionUtils.isEmpty((Collection)contacters)) {
            for (Contacter contacter : contacters) {
                if (contacter.get("fullName") == null || !(contacter.get("fullName") instanceof BizObject)) continue;
                contacter.put("fullName", ((BizObject)contacter.get("fullName")).get(locale));
            }
        }
        if (!CollectionUtils.isEmpty((Collection)(agentInvoices = merchant.merchantAgentInvoiceInfos()))) {
            for (AgentInvoice agentInvoice : agentInvoices) {
                if (agentInvoice.get("address") == null || !(agentInvoice.get("address") instanceof BizObject)) continue;
                agentInvoice.put("address", ((BizObject)agentInvoice.get("address")).get(locale));
            }
        }
        if (!CollectionUtils.isEmpty((Collection)(agentFinancials = merchant.merchantAgentFinancialInfos()))) {
            for (AgentFinancial agentFinancial : agentFinancials) {
                if (agentFinancial.get("bankAccountName") != null && agentFinancial.get("bankAccountName") instanceof BizObject) {
                    agentFinancial.put("bankAccountName", ((BizObject)agentFinancial.get("bankAccountName")).get(locale));
                }
                if (agentFinancial.get("accountOpeningAddress") == null || !(agentFinancial.get("accountOpeningAddress") instanceof BizObject)) continue;
                agentFinancial.put("accountOpeningAddress", ((BizObject)agentFinancial.get("accountOpeningAddress")).get(locale));
            }
        }
    }

    private <T extends BizObject> List<T> transferBizObject(List<T> list, EntityStatus entityStatus) {
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList();
        }
        list.forEach(contacter -> contacter.put("_status", (Object)entityStatus));
        return list;
    }
}

