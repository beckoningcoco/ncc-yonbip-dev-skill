/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.custcategory.CustCategory
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.Json
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.cust;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.custcategory.CustCategory;
import com.yonyoucloud.upc.billrule.cls.ProductClsUtils;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.Json;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="custcategoryDataInitRule")
public class CustcategoryDataInitRule
extends AbstractCommonRule {
    @Autowired
    private IUPCControlRuleService upcControlRuleService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = (List)billDataDto.getData();
        CustCategory cls = (CustCategory)clss.get(0);
        if (billDataDto.getId() != null) {
            if (!MerchantUtils.getAllowSelectNonLeafNodes()) {
                this.checksRefer(Long.parseLong(billDataDto.getId()));
            }
            ProductClsUtils.getInstance().setParentData(billContext, billDataDto, (BizObject)cls);
        }
        cls.setIsEnd(Boolean.valueOf(true));
        TreeApplyRangeUtils.getInstance().dealInitOrg(this.upcControlRuleService, billDataDto, billContext.getFullname(), billDataDto.getBillnum(), (BizObject)cls);
        this.dealOrgPermission(cls);
        return new RuleExecuteResult((Object)Json.encode2((BizObject)cls).toString());
    }

    private RuleExecuteResult checksRefer(Long id) throws Exception {
        ArrayList<QueryCondition> conditionExpressions = new ArrayList<QueryCondition>();
        conditionExpressions.add(QueryCondition.name((String)"channCustomerClass").eq((Object)id));
        conditionExpressions.add(QueryCondition.name((String)"customerClass").eq((Object)id));
        ConditionExpression[] ces = new ConditionExpression[conditionExpressions.size()];
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.or((ConditionExpression[])conditionExpressions.toArray(ces));
        QuerySchema querySchema = new QuerySchema();
        querySchema.addSelect("id");
        querySchema.queryConditionGroup(queryConditionGroup);
        List checkResult = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
        if (checkResult != null && checkResult.size() > 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800480);
        }
        return null;
    }

    private void dealOrgPermission(CustCategory custCategory) throws Exception {
        Boolean singleOrg = this.upcControlRuleService.checkSingleOrg();
        if (singleOrg.booleanValue()) {
            return;
        }
        String orgId = custCategory.getOrgId();
        if (null != orgId) {
            List<String> userOrgAndVoucherManageOrgs = this.upcControlRuleService.getUserOrgAndVoucherManageOrg("aa.custcategory.CustCategory", "aa_custcategory");
            if (!CollectionUtils.isEmpty(userOrgAndVoucherManageOrgs)) {
                for (String orgManage : userOrgAndVoucherManageOrgs) {
                    if (!orgId.equals(orgManage)) continue;
                    return;
                }
            }
            custCategory.setOrgId(null);
            custCategory.setCustCategoryApplyRanges(null);
        }
    }
}

