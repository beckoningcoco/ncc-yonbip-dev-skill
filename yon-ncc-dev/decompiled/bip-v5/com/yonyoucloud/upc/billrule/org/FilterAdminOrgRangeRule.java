/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.base.BizObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.org;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.base.BizObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="filterAdminOrgRangeRule")
public class FilterAdminOrgRangeRule
extends AbstractCommonRule {
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        String billnum;
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        FilterVO gridFilter = billDataDto.getCondition();
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        if ((billnum = billDataDto.getBillnum()) != null) {
            if (!this.upcControlRuleService.checkSingleOrg().booleanValue() && !CollectionUtils.isEmpty((Collection)bills)) {
                String fullClassName = "";
                switch (billnum) {
                    case "pc_product": {
                        fullClassName = "pc.product.Product";
                        break;
                    }
                    case "pc_productdetail": {
                        fullClassName = "pc.product.Product";
                        break;
                    }
                    case "aa_merchant": {
                        fullClassName = "aa.merchant.Merchant";
                        break;
                    }
                    case "pc_managementclass": {
                        fullClassName = "pc.cls.ManagementClass";
                        break;
                    }
                    case "pc_costclass": {
                        fullClassName = "pc.cls.CostClass";
                        break;
                    }
                    case "aa_custcategory": {
                        fullClassName = "aa.custcategory.CustCategory";
                        break;
                    }
                    case "aa_salearea": {
                        fullClassName = "aa.salearea.SaleArea";
                        break;
                    }
                    case "pc_purchaseclass": {
                        fullClassName = "pc.cls.PurchaseClass";
                        break;
                    }
                }
                if (StringUtils.isNotEmpty((CharSequence)fullClassName)) {
                    String orgId;
                    HashSet<String> orgs = new HashSet<String>();
                    String string = orgId = StringUtils.isEmpty((CharSequence)((String)((BizObject)bills.get(0)).get("orgId"))) ? (String)((BizObject)bills.get(0)).get("createOrg") : (String)((BizObject)bills.get(0)).get("orgId");
                    if (!StringUtils.isEmpty((CharSequence)orgId)) {
                        orgs.add(orgId);
                        Set<String> shareAll = this.orgPermissionsUtil.getShareOrgDetailByManageOrg4BillDate(fullClassName, orgId, (BizObject)bills.get(0));
                        orgs.addAll(shareAll);
                    }
                    if (orgs.isEmpty()) {
                        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("1", "eq", (Object)2)});
                    } else {
                        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "in", orgs), new SimpleFilterVO("externalorg", "eq", (Object)0)});
                    }
                }
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800107);
        }
        billDataDto.setCondition(gridFilter);
        this.putParam(paramMap, billDataDto);
        return new RuleExecuteResult();
    }
}

