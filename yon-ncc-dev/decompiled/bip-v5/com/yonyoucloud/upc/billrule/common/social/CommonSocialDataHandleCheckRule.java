/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  org.imeta.core.lang.BooleanUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.common.social;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.core.lang.BooleanUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class CommonSocialDataHandleCheckRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List query;
        QuerySchema querySchema;
        String fullName = billContext.getFullname();
        List bills = this.getBills(billContext, paramMap);
        BizObject bizObject = (BizObject)bills.get(0);
        if (bizObject.getEntityStatus().equals((Object)EntityStatus.Insert) || BooleanUtils.b((Object)bizObject.get("isFromSocial")) || "social".equals(bizObject.get("data_from_type"))) {
            return new RuleExecuteResult();
        }
        Object isSingleOrg = OptionUtils.getSysOptionByName((String)"singleOrg");
        if ("aa.merchant.Merchant".equals(fullName) && isSingleOrg != null && BooleanUtil.isFalse((Object)isSingleOrg)) {
            if (bizObject.containsKey((Object)"merchantApplyRangeId")) {
                querySchema = new QuerySchema();
                querySchema.addSelect("id");
                querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq(bizObject.get("merchantApplyRangeId"))}).appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)"666666")}).appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
                querySchema.setPartitionable(false);
                query = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema);
                if (CollectionUtils.isEmpty((Collection)query)) {
                    return new RuleExecuteResult();
                }
            } else if (bizObject.containsKey((Object)"belongOrg") && !"666666".equals(bizObject.get("belongOrg"))) {
                return new RuleExecuteResult();
            }
        }
        querySchema = new QuerySchema();
        querySchema.addSelect("id");
        querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq(bizObject.get("id"))}).appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"socialMctype").eq((Object)0)});
        query = MetaDaoHelper.query((String)billContext.getFullname(), (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)query)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800322);
        }
        return new RuleExecuteResult();
    }
}

