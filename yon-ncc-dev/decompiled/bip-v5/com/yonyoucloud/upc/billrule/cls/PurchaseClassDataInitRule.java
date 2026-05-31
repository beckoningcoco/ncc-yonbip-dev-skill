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
 *  com.yonyoucloud.upc.pc.cls.PurchaseClass
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
package com.yonyoucloud.upc.billrule.cls;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.pc.cls.PurchaseClass;
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
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="purchaseClassDataInitRule")
public class PurchaseClassDataInitRule
extends AbstractCommonRule {
    @Autowired
    private IUPCControlRuleService upcControlRuleService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = (List)billDataDto.getData();
        PurchaseClass cls = (PurchaseClass)clss.get(0);
        if (billDataDto.getId() != null) {
            List products = null;
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"purchaseClass").eq((Object)billDataDto.getId())}));
            products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
            if (products.size() > 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800180);
            }
            List rows = MetaDaoHelper.queryById((String)billContext.getFullname(), (String)"*", (Object)billDataDto.getId());
            if (rows != null && rows.size() > 0) {
                Map parent = (Map)rows.get(0);
                cls.setParent((Object)((Long)parent.get("id")));
                cls.put("parent_name", parent.get("name"));
            }
        }
        cls.setIsEnd(Boolean.valueOf(true));
        if ("pc_purchaseclass".equals(billContext.getBillnum())) {
            TreeApplyRangeUtils.getInstance().dealInitOrg(this.upcControlRuleService, billDataDto, billContext.getFullname(), billDataDto.getBillnum(), (BizObject)cls);
            this.dealOrgPermission(cls);
        }
        return new RuleExecuteResult((Object)Json.encode2((BizObject)cls).toString());
    }

    private void dealOrgPermission(PurchaseClass cls) throws Exception {
        List<String> userOrgAndVoucherManageOrgs;
        Boolean singleOrg = this.upcControlRuleService.checkSingleOrg();
        if (singleOrg.booleanValue()) {
            return;
        }
        String orgId = (String)cls.get("orgId");
        if (null != orgId && !CollectionUtils.isEmpty(userOrgAndVoucherManageOrgs = this.upcControlRuleService.getUserOrgAndVoucherManageOrg("pc.cls.PurchaseClass", "pc_purchaseclass")) && !userOrgAndVoucherManageOrgs.contains(orgId)) {
            cls.set("orgId", null);
            cls.set("purchaseClassApplyRanges", null);
        }
    }
}

