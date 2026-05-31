/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.aa.agentlevel.AgentLevel
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.cust;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.aa.agentlevel.AgentLevel;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="custlevelProcessRule")
public class CustlevelProcessRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        QuerySchema schema;
        List checkResult;
        RuleExecuteResult deleteResult;
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        AgentLevel custInfo = (AgentLevel)bills.get(0);
        LoginUser user = AppContext.getCurrentUser();
        if (null == user) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        if (custInfo.getEntityStatus() == EntityStatus.Update && (deleteResult = this.chechRefered(custInfo)) != null && ((checkResult = MetaDaoHelper.query((String)"aa.agentlevel.AgentLevel", (QuerySchema)(schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(custInfo.getId()), QueryCondition.name((String)"code").eq((Object)custInfo.getCode())}))))) == null || checkResult.size() == 0)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800470);
        }
        if (custInfo.getEntityStatus() == EntityStatus.Unchanged && (deleteResult = this.chechRefered(custInfo)) != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800471);
        }
        this.checkCode(custInfo, user);
        return new RuleExecuteResult();
    }

    private RuleExecuteResult chechRefered(AgentLevel custInfo) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"channCustomerLevel").eq(custInfo.getId())}));
        List checkResult = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)schema);
        if (checkResult != null && checkResult.size() > 0) {
            return new RuleExecuteResult(0, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408077D", (String)"\u7ea7\u522b\u5df2\u88ab\u5f15\u7528"));
        }
        return null;
    }

    private void checkCode(AgentLevel agentLevel, LoginUser user) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)agentLevel.getCode()), QueryCondition.name((String)"tenant").eq(user.getTenant()), QueryCondition.name((String)"id").not_eq(agentLevel.getId())}));
        querySchema.setPartitionable(false);
        List agentLevelList = MetaDaoHelper.query((String)"aa.agentlevel.AgentLevel", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)agentLevelList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800472);
        }
    }
}

