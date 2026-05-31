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
 *  com.yonyoucloud.upc.pc.cls.CostClass
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.Json
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls.cost;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.billrule.cls.ProductClsUtils;
import com.yonyoucloud.upc.pc.cls.CostClass;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.Json;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value="costClassDataInitRule")
public class CostClassDataInitRule
extends AbstractCommonRule {
    @Lazy
    @Autowired
    private IUPCControlRuleService upcControlRuleService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = (List)billDataDto.getData();
        CostClass cls = (CostClass)clss.get(0);
        if (billDataDto.getId() != null) {
            QuerySchema schema = QuerySchema.create().addSelect("id ").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"costClass").eq((Object)billDataDto.getId())}));
            List products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
            if (products.size() > 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800150, new Object[]{""});
            }
            ProductClsUtils.getInstance().setParentData(billContext, billDataDto, (BizObject)cls);
        }
        cls.setIsEnd(Boolean.valueOf(true));
        TreeApplyRangeUtils.getInstance().dealInitOrg(this.upcControlRuleService, billDataDto, billContext.getFullname(), billDataDto.getBillnum(), (BizObject)cls);
        this.dealOrgPermission(cls);
        return new RuleExecuteResult((Object)Json.encode2((BizObject)cls).toString());
    }

    private void dealOrgPermission(CostClass cls) throws Exception {
        if (this.upcControlRuleService.checkSingleOrg().booleanValue()) {
            return;
        }
        String orgId = cls.getOrgId();
        if (null != orgId) {
            List<String> userOrgAndVoucherManageOrg = this.upcControlRuleService.getUserOrgAndVoucherManageOrg("pc.cls.CostClass", "pc_costclass");
            boolean flag = false;
            for (String org : userOrgAndVoucherManageOrg) {
                if (!org.equals(orgId)) continue;
                flag = true;
                break;
            }
            if (flag) {
                return;
            }
            cls.setOrgId(null);
            cls.setCostClassApplyRanges(null);
        }
    }
}

