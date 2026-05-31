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
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.org;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.base.ConditionOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="filterAdminOrgRule")
public class FilterAdminOrgRule
extends AbstractCommonRule {
    @Autowired
    private IUPCControlRuleService upcControlRuleService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        String billnum;
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        LoginUser user = AppContext.getCurrentUser();
        if (null == user) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800106);
        }
        FilterVO gridFilter = billDataDto.getCondition();
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        if ((billnum = billDataDto.getBillnum()) != null) {
            if (!this.upcControlRuleService.checkSingleOrg().booleanValue()) {
                String fullClassName = "";
                switch (billnum) {
                    case "pc_productimport": 
                    case "pc_product": {
                        fullClassName = "pc.product.Product";
                        break;
                    }
                    case "aa_merchant": 
                    case "aa_merchantexport": 
                    case "aa_merchant_export_range": {
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
                    case "pc_purchaseclass": {
                        fullClassName = "pc.cls.PurchaseClass";
                        break;
                    }
                    case "aa_salearea": {
                        fullClassName = "aa.salearea.SaleArea";
                        break;
                    }
                    case "base_businesspartner": {
                        fullClassName = "base.businesspartner.BusinessPartner";
                        if (billDataDto.getDatasource().equals("merchantId.createOrg.name")) {
                            fullClassName = "aa.merchant.Merchant";
                        }
                        if (!billDataDto.getDatasource().equals("vendorId.org.name")) break;
                        fullClassName = "aa.vendor.Vendor";
                        break;
                    }
                    case "org_batch_generation_partner": {
                        fullClassName = "base.businesspartner.BusinessPartner";
                        if (billDataDto.getDatasource().equals("merchantId_createOrgName")) {
                            fullClassName = "aa.merchant.Merchant";
                        }
                        if (!billDataDto.getDatasource().equals("vendorId_orgName")) break;
                        fullClassName = "aa.vendor.Vendor";
                        break;
                    }
                }
                if (StringUtils.isNotEmpty((CharSequence)fullClassName)) {
                    List<String> orgIds = this.upcControlRuleService.getUserOrgAndVoucherManageOrgByAuthId(billContext, fullClassName);
                    if (orgIds == null || orgIds.isEmpty()) {
                        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "in", (Object)"###")});
                    } else {
                        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "in", orgIds), new SimpleFilterVO("externalorg", "eq", (Object)0)});
                    }
                }
            }
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("ytenant", ConditionOperator.eq.name(), AppContext.getYTenantId())});
        }
        billDataDto.setCondition(gridFilter);
        this.putParam(paramMap, billDataDto);
        return new RuleExecuteResult();
    }
}

