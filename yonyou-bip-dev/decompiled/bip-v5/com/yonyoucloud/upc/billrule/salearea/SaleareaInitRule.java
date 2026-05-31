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
 *  com.yonyoucloud.upc.aa.salearea.SaleArea
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.Json
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.salearea;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.salearea.SaleArea;
import com.yonyoucloud.upc.billrule.cls.ProductClsUtils;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.Collection;
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
import org.springframework.util.CollectionUtils;

@Component(value="saleareaInitRule")
public class SaleareaInitRule
extends AbstractCommonRule {
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = (List)billDataDto.getData();
        SaleArea saleArea = (SaleArea)clss.get(0);
        if (billDataDto.getId() != null) {
            if (!MerchantUtils.getAllowSelectNonLeafNodes()) {
                QuerySchema schema = QuerySchema.create();
                schema.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"saleAreaId").eq((Object)billDataDto.getId())}));
                List customerAreaList = MetaDaoHelper.query((String)"aa.merchant.CustomerArea", (QuerySchema)schema);
                if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800317, new Object[]{""});
                }
            }
            ProductClsUtils.getInstance().setParentData(billContext, billDataDto, (BizObject)saleArea);
        }
        saleArea.setIsEnd(Boolean.valueOf(true));
        TreeApplyRangeUtils.getInstance().dealInitOrg(this.upcControlRuleService, billDataDto, billContext.getFullname(), billDataDto.getBillnum(), (BizObject)saleArea);
        this.dealOrgPermission(saleArea);
        return new RuleExecuteResult((Object)Json.encode2((BizObject)saleArea).toString());
    }

    private void dealOrgPermission(SaleArea saleArea) throws Exception {
        Boolean singleOrg = this.upcControlRuleService.checkSingleOrg();
        if (singleOrg.booleanValue()) {
            return;
        }
        String orgId = saleArea.getOrgId();
        if (null != orgId) {
            List<String> userOrgAndVoucherManageOrgs = this.upcControlRuleService.getUserOrgAndVoucherManageOrg("aa.salearea.SaleArea", "aa_salearea");
            if (!CollectionUtils.isEmpty(userOrgAndVoucherManageOrgs)) {
                for (String orgManage : userOrgAndVoucherManageOrgs) {
                    if (!orgId.equals(orgManage)) continue;
                    return;
                }
            }
            saleArea.setOrgId(null);
            saleArea.setSaleAreaApplyRange(null);
        }
    }
}

