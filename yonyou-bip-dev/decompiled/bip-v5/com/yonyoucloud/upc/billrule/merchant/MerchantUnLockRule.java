/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.aa.merchant.FrozenState
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.aa.merchant.FrozenState;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantUnLockRule")
public class MerchantUnLockRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(MerchantUnLockRule.class);

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        LoginUser currentUser = AppContext.getCurrentUser();
        if (null == currentUser) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        String url = "/agent/infrastructure/upc/syn/agentrelation";
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, map);
        for (BizObject bill : bills) {
            List merchantApplyRangeList = new ArrayList();
            List merchantApplyRangeDetaillist = new ArrayList();
            if (((Boolean)bill.get("frozenTogetherValue")).booleanValue()) {
                QuerySchema querySchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bill.get("id"))}));
                List merchantApplyRangeDetails = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema, null);
                if (CollectionUtils.isEmpty((Collection)merchantApplyRangeDetails)) {
                    return new RuleExecuteResult();
                }
                for (MerchantApplyRangeDetail mard : merchantApplyRangeDetails) {
                    mard.setLocker(null);
                    mard.setLockTime(null);
                    mard.setLockDate(null);
                    mard.setFrozenState(FrozenState.unfrozen);
                    mard.setFreezingLink(null);
                    mard.setEntityStatus(EntityStatus.Update);
                    MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)mard);
                }
                QuerySchema querySchema1 = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bill.get("id"))}));
                merchantApplyRangeDetaillist = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema1, null);
                QuerySchema querySchema2 = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(bill.get("id"))}));
                merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema2, null);
            } else {
                MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                merchantApplyRangeDetail.setTenant((Long)AppContext.getCurrentUser().getTenant());
                merchantApplyRangeDetail.setMerchantApplyRangeId(Long.valueOf(Long.parseLong((String)bill.get("merchantApplyRangeId"))));
                merchantApplyRangeDetail.setLockTime(null);
                merchantApplyRangeDetail.setLockDate(null);
                merchantApplyRangeDetail.setLocker(null);
                merchantApplyRangeDetail.setFrozenState(FrozenState.unfrozen);
                merchantApplyRangeDetail.setFreezingLink(null);
                merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
                QuerySchema querySchema1 = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bill.get("id")), QueryCondition.name((String)"merchantApplyRangeId").eq(bill.get("merchantApplyRangeId"))}));
                merchantApplyRangeDetaillist = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema1, null);
                QuerySchema querySchema2 = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(bill.get("id")), QueryCondition.name((String)"id").eq(bill.get("merchantApplyRangeId"))}));
                merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema2, null);
            }
            for (MerchantApplyRangeDetail merchantApplyRangeDetail : merchantApplyRangeDetaillist) {
                merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
            }
        }
        return new RuleExecuteResult();
    }
}

