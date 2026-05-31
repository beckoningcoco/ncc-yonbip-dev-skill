/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
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
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.service.ProductApplyRangeGroupService;
import com.yonyoucloud.upc.service.product.ProductAddRangeHandleService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="cancelSuitOrg")
public class CancelSuitOrg
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(CancelSuitOrg.class);
    @Autowired
    ProductApplyRangeGroupService productApplyRangeGroupService;
    @Autowired
    ProductAddRangeHandleService productAddRangeHandleService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PARAM_IS_NULL);
        }
        List bills = this.getBills(billContext, paramMap);
        LoginUser user = AppContext.getCurrentUser();
        if (UserType.TenantAdmin != user.getUserType() && UserType.TenantEmployee != user.getUserType()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_ALLOW_SALE_BY_NOT_CURRENT_ORG, new Object[]{user.getName()});
        }
        for (BizObject data : bills) {
            if (!data.containsKey((Object)"orgIds") || data.get("orgIds") == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_ORG_IS_NULL);
            }
            if (!data.containsKey((Object)"productId") || data.get("productId") == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_PRODUCT_IS_NULL);
            }
            Long productId = Long.valueOf((String)data.get("productId"));
            List orgIds = (List)data.get("orgIds");
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"orgId").in((Collection)orgIds)});
            String selectFiled = "id as productApplyRangeId, productId as id,productId.code as code,productId.name as name, isCreator as isCreator, isApplied as isApplied, orgId as productApplyRange_orgId, orgId.name as orgName";
            QuerySchema querySchema = QuerySchema.create().distinct().addSelect(selectFiled).addCondition((ConditionExpression)queryConditionGroup);
            List rangeList = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)querySchema);
            ArrayList<List> messages = new ArrayList<List>();
            ArrayList<String> cancelFailOrgIds = new ArrayList<String>();
            for (Map range : rangeList) {
                if (!BooleanUtil.isFalse(range.get("isCreator"))) continue;
                BillDataDto bill = new BillDataDto();
                bill.setData((Object)range);
                bill.setBillnum("pc_productlist_query");
                RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
                if (CollectionUtils.isEmpty((Collection)result.getMessages())) continue;
                messages.add(result.getMessages());
                cancelFailOrgIds.add(range.get("productApplyRange_orgId").toString());
            }
            orgIds.removeAll(cancelFailOrgIds);
            this.productAddRangeHandleService.handleProductSuitOrgEvent(productId, new HashSet<String>(orgIds), "cancelSuitOrg");
            if (CollectionUtils.isEmpty(messages)) continue;
            RuleExecuteResult ruleExecuteResult = new RuleExecuteResult();
            ruleExecuteResult.setMessages(messages);
            return ruleExecuteResult;
        }
        return new RuleExecuteResult();
    }
}

