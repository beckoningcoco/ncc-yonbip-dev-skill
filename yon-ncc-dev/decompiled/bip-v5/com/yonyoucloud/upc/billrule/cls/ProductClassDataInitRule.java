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
 *  com.yonyoucloud.upc.pc.cls.ProductClass
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
import com.yonyoucloud.upc.billrule.cls.ProductClsUtils;
import com.yonyoucloud.upc.pc.cls.ProductClass;
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

@Component(value="productClassDataInitRule")
public class ProductClassDataInitRule
extends AbstractCommonRule {
    @Autowired
    private IUPCControlRuleService upcControlRuleService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = (List)billDataDto.getData();
        ProductClass cls = (ProductClass)clss.get(0);
        if (billDataDto.getId() != null) {
            QuerySchema schema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productClass").eq((Object)billDataDto.getId())}));
            Map queryOne = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)schema);
            int count = 0;
            if (queryOne != null && queryOne.get("count") != null) {
                count = Integer.valueOf(queryOne.get("count").toString());
            }
            if (count > 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800134, new Object[]{""});
            }
            ProductClsUtils.getInstance().setParentData(billContext, billDataDto, (BizObject)cls);
        }
        cls.setIsEnd(Boolean.valueOf(true));
        if ("pc_managementclass".equals(billContext.getBillnum())) {
            TreeApplyRangeUtils.getInstance().dealInitOrg(this.upcControlRuleService, billDataDto, billContext.getFullname(), billDataDto.getBillnum(), (BizObject)cls);
            this.dealOrgPermission(cls);
        }
        return new RuleExecuteResult((Object)Json.encode2((BizObject)cls).toString());
    }

    private void dealOrgPermission(ProductClass cls) throws Exception {
        Boolean singleOrg = this.upcControlRuleService.checkSingleOrg();
        if (singleOrg.booleanValue()) {
            return;
        }
        String orgId = (String)cls.get("orgId");
        if (null != orgId) {
            List<String> userOrgAndVoucherManageOrgs = this.upcControlRuleService.getUserOrgAndVoucherManageOrg("pc.cls.ManagementClass", "pc_managementclass");
            if (!CollectionUtils.isEmpty(userOrgAndVoucherManageOrgs)) {
                for (String orgManage : userOrgAndVoucherManageOrgs) {
                    if (!orgId.equals(orgManage)) continue;
                    return;
                }
            }
            cls.set("orgId", null);
            cls.set("managementClassApplyRanges", null);
        }
    }
}

