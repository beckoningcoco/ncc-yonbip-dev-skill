/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.utils.Toolkit
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApply
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApplyType
 *  com.yonyoucloud.upc.aa.customerapply.CustomerEffectStatus
 *  com.yonyoucloud.upc.aa.customerapply.CustomerEffectType
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.customerapply;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.utils.Toolkit;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.customerapply.CustomerApply;
import com.yonyoucloud.upc.aa.customerapply.CustomerApplyType;
import com.yonyoucloud.upc.aa.customerapply.CustomerEffectStatus;
import com.yonyoucloud.upc.aa.customerapply.CustomerEffectType;
import com.yonyoucloud.upc.service.CustomerApplyService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;

@Component(value="customerApplyAuditRule")
public class CustomerApplyAuditRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(CustomerApplyAuditRule.class);
    @Autowired
    private CustomerApplyService customerApplyService;
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List bills = this.getBills(billContext, map);
        if (Toolkit.isEmptyObject((Object)bills) || bills.size() == 0) {
            return new RuleExecuteResult();
        }
        for (BizObject bio : bills) {
            CustomerApply customerApply = (CustomerApply)bio;
            if (customerApply.getId() == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800089);
            }
            final CustomerApply apply = (CustomerApply)MetaDaoHelper.getById((String)"aa.customerapply.CustomerApply", (Long)((Long)customerApply.getId()));
            customerApply.setCustomerData(apply.getCustomerData());
            if ((customerApply.getApplyType() == CustomerApplyType.add || customerApply.getApplyType() == CustomerApplyType.modify) && apply.getCustomerData() == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800090, new Object[]{customerApply.getApplyCode()});
            }
            if (customerApply.getApplyType() == CustomerApplyType.ADD_RANGE && CollectionUtils.isEmpty((Collection)apply.customerApplyAddRanges())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800091, new Object[]{customerApply.getApplyCode()});
            }
            if (CustomerEffectType.timeing == apply.getEffectType() && !this.customerApplyService.compareEffectTime(apply.getEffectTime())) continue;
            apply.setEffectStatus(CustomerEffectStatus.dealing);
            apply.setFailInfo(null);
            apply.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"aa.customerapply.CustomerApply", (BizObject)apply);
            TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

                public void afterCommit() {
                    try {
                        if (CustomerApplyType.add == apply.getApplyType()) {
                            CustomerApplyAuditRule.this.customerApplyService.auditAddApply(apply);
                        } else if (CustomerApplyType.modify == apply.getApplyType()) {
                            CustomerApplyAuditRule.this.customerApplyService.auditModifyApply(apply);
                        } else if (CustomerApplyType.ADD_RANGE == apply.getApplyType()) {
                            CustomerApplyAuditRule.this.customerApplyService.auditCustomerApplyAddRange(apply);
                        }
                    }
                    catch (Exception e) {
                        log.error("customerApplyAuditRule_auditCustomerApply_error:{}", (Object)e.getMessage(), (Object)e);
                    }
                }
            });
        }
        return new RuleExecuteResult();
    }
}

