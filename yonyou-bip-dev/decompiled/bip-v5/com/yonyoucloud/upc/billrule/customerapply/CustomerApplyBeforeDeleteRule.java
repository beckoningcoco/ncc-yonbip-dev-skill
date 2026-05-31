/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.uap.billcode.BillCodeObj
 *  com.yonyou.uap.billcode.service.IBillCodeComponentService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.bpm.model.VerifyState
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApply
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApplyType
 *  com.yonyoucloud.upc.aa.customerapply.CustomerEffectStatus
 *  org.apache.commons.collections4.CollectionUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.customerapply;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.uap.billcode.BillCodeObj;
import com.yonyou.uap.billcode.service.IBillCodeComponentService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.bpm.model.VerifyState;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.customerapply.CustomerApply;
import com.yonyoucloud.upc.aa.customerapply.CustomerApplyType;
import com.yonyoucloud.upc.aa.customerapply.CustomerEffectStatus;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.CollectionUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="customerApplyBeforeDeleteRule")
public class CustomerApplyBeforeDeleteRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(CustomerApplyBeforeDeleteRule.class);
    @Autowired
    private IBillCodeComponentService billCodeComponentService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List bills = this.getBills(billContext, map);
        for (BizObject bio : bills) {
            CustomerApply customerApply = (CustomerApply)bio;
            CustomerApply apply = (CustomerApply)MetaDaoHelper.getById((String)"aa.customerapply.CustomerApply", (Long)((Long)customerApply.getId()));
            String status = apply.get("status").toString();
            String effectStatus = apply.get("effectStatus").toString();
            Boolean isWfControlled = apply.getIsWfControlled();
            if ("1".equals(status) && String.valueOf(CustomerEffectStatus.success.getValue()).equals(effectStatus)) {
                QuerySchema merchantIdSchema = QuerySchema.create().addSelect("applyCustomer").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(customerApply.getId())}));
                List merchantId = MetaDaoHelper.query((String)"aa.customerapply.CustomerApply", (QuerySchema)merchantIdSchema, null);
                if (CollectionUtils.isNotEmpty((Collection)merchantId)) {
                    QuerySchema querySchema;
                    List isExistMerchant;
                    if (((Map)merchantId.get(0)).get("applyCustomer") != null && CollectionUtils.isNotEmpty((Collection)(isExistMerchant = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)(querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(((Map)merchantId.get(0)).get("applyCustomer"))}))), null)))) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801626);
                    }
                } else {
                    this.checkDelete(isWfControlled, status, effectStatus);
                }
            } else {
                this.checkDelete(isWfControlled, status, effectStatus);
            }
            customerApply.setId(customerApply.getId());
            customerApply.setEntityStatus(EntityStatus.Update);
            customerApply.setAuditor("");
            customerApply.setVerifystate(Short.valueOf(VerifyState.INIT_NEW_OPEN.getValue()));
            customerApply.setPubts(null);
            MetaDaoHelper.update((String)"aa.customerapply.CustomerApply", (BizObject)customerApply);
            if (CustomerApplyType.add != customerApply.getApplyType()) continue;
            String tenantId = AppContext.getCurrentUser().getYxyTenantId();
            String code = apply.getMerchantCode();
            String orgId = InvocationInfoProxy.getOrgId();
            BillCodeObj bill = new BillCodeObj(apply.getCustomerData());
            log.error("aa_customerapply delete return code: {tenantId:{}, code:{}, orgId:{}}", new Object[]{tenantId, code, orgId});
            this.billCodeComponentService.returnBillCode("aa_merchant", code, tenantId, "", orgId, false, bill);
        }
        return new RuleExecuteResult();
    }

    private void checkDelete(Boolean isWfControlled, String status, String effectStatus) {
        if (!isWfControlled.booleanValue() && !"0".equals(status)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800092);
        }
        if (isWfControlled.booleanValue() && !"0".equals(effectStatus)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800093);
        }
    }
}

