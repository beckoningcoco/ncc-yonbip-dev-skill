/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
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
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.alibaba.fastjson.JSON;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(value="merchantLockDetailRule")
public class MerchantLockDetailRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(MerchantLockDetailRule.class);

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        LoginUser currentUser = AppContext.getCurrentUser();
        if (null == currentUser) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        ArrayList<Map> merchantApplyRangeDetailList = new ArrayList<Map>();
        List bills = this.getBills(billContext, paramMap);
        for (BizObject bill : bills) {
            List merchants = new ArrayList();
            merchants = (List)bill.get("freezeParam");
            if (merchants != null && !merchants.isEmpty()) {
                for (Map merchant : merchants) {
                    List detail = new ArrayList();
                    QuerySchema querySchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.get("agentId")), QueryCondition.name((String)"orgId").eq(merchant.get("orgId"))}));
                    List merchantApplyRangeList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
                    if (merchantApplyRangeList != null && !merchantApplyRangeList.isEmpty()) {
                        QuerySchema querySchema1 = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.get("merchantId")), QueryCondition.name((String)"merchantApplyRangeId").eq(((Map)merchantApplyRangeList.get(0)).get("id"))}));
                        detail = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema1, null);
                        log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080411", (String)"\u4f9b\u5e94\u94fe\u8c03\u7528\u67e5\u8be2\u51bb\u7ed3\u72b6\u6001merchantLockDetailRule {}"), detail.get(0));
                        ((Map)detail.get(0)).put("orgId", merchant.get("orgId"));
                        merchantApplyRangeDetailList.add((Map)detail.get(0));
                        continue;
                    }
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800393, new Object[]{merchant.get("agentId"), merchant.get("orgId")});
                }
            }
            if (null == merchantApplyRangeDetailList || !merchantApplyRangeDetailList.isEmpty()) continue;
            HashMap<String, String> merchantApplyRangeDetailMap = new HashMap<String, String>();
            merchantApplyRangeDetailMap.put("merchantApplyRangeDetail", JSON.toJSONString(merchantApplyRangeDetailList));
            this.putParam(paramMap, "return", merchantApplyRangeDetailMap);
        }
        return new RuleExecuteResult(paramMap);
    }
}

