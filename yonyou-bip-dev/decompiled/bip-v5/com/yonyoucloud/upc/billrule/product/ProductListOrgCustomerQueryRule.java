/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.login.util.YhtUserUtil
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.login.util.YhtUserUtil;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import com.yonyoucloud.upc.service.GlobalShareService;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.base.ConditionOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productListOrgCustomerQueryRule")
public class ProductListOrgCustomerQueryRule
extends AbstractCommonRule {
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private IUPCProductQueryService upcProductQueryService;
    @Autowired
    PubOptionService pubOptionService;
    @Autowired
    GlobalShareService globalShareService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        FilterCommonVO[] vos;
        billContext.setbRowAuthControl(true);
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShareByBillNum(billDataDto.getBillnum());
        if (billDataDto == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_QUERY_CONDITION_IS_NULL);
        }
        FilterVO gridFilter = billDataDto.getCondition();
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        if (billDataDto.getCondition() != null && (vos = gridFilter.getCommonVOs()) != null) {
            for (FilterCommonVO vo : vos) {
                if (!"prodcutTag".equalsIgnoreCase(vo.getItemName()) || vo.getValue1() == null) continue;
                billDataDto.setIsDistinct(true);
                break;
            }
        }
        if (billDataDto.getTreename() != null) {
            if (StringUtils.equals((CharSequence)billDataDto.getTreename(), (CharSequence)"pc.cls.ManagementClass")) {
                billContext.setForeignKey("manageClass.path");
            }
            if (StringUtils.equals((CharSequence)billDataDto.getTreename(), (CharSequence)"pc.cls.PresentationClass")) {
                billContext.setForeignKey("productClass.path");
            }
            if (StringUtils.equals((CharSequence)billDataDto.getTreename(), (CharSequence)"pc.cls.CostClass")) {
                billContext.setForeignKey("costClass.path");
            }
            if (StringUtils.equals((CharSequence)billDataDto.getTreename(), (CharSequence)"pc.tpl.ProductTpl")) {
                billContext.setForeignKey("productTemplate.id");
                billDataDto.setOperator("eq");
            }
            if (StringUtils.equals((CharSequence)billDataDto.getTreename(), (CharSequence)"pc.tax.TaxRevenueclass")) {
                billContext.setForeignKey("taxClass.taxrevenueclass.path");
            }
        }
        int queryType = 0;
        FilterCommonVO[] vos2 = gridFilter.getCommonVOs();
        if (vos2 != null) {
            for (FilterCommonVO vo : vos2) {
                if ("QueryType".equalsIgnoreCase(vo.getItemName())) {
                    queryType = (Integer)vo.getValue1();
                }
                if (!"realProductAttribute".equalsIgnoreCase(vo.getItemName()) || !"3".equals(vo.getValue1())) continue;
                vo.setItemName("saleStyle");
                vo.setValue1((Object)"2");
            }
        }
        if (queryType > 1) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_QUERY_TYPE_PARAM_ERROR);
        }
        LoginUser user = AppContext.getCurrentUser();
        switch (user.getUserType()) {
            case TenantAdmin: {
                break;
            }
            case TenantEmployee: {
                if (queryType == 0) {
                    boolean isAdmin = YhtUserUtil.isAdmin((LoginUser)user);
                    if (!isAdmin && null != user.get("yht_isAdmin")) {
                        isAdmin = (Boolean)user.get("yht_isAdmin");
                    }
                    if (!isAdmin && !orgGlobalShare) {
                        billDataDto.setMasterOrgField("productApplyRange.orgId");
                        break;
                    }
                    billContext.setbRowAuthControl(false);
                    break;
                }
                billContext.setbRowAuthControl(false);
                break;
            }
            case JoinUser: 
            case TenantShopuser: {
                if (user.getCustomer() == null) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_BILL_NUM_IS_NULL, (Object[])user.getId());
                }
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productApplyRange.customerId", "eq", (Object)user.getCustomer())});
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productApplyRange.rangeType", "eq", (Object)2)});
                break;
            }
            case ShopAdminUser: 
            case ShopUser: {
                if (user.get("shop") == null) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CURRENT_SHOP_ID_IS_NULL, (Object[])user.getId());
                }
                if (!orgGlobalShare) {
                    billDataDto.setMasterOrgField("productApplyRange.orgId");
                }
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productApplyRange.shopId", "eq", user.get("shop"))});
                break;
            }
        }
        if (billDataDto.getIds() != null) {
            List rangeIds = Arrays.stream(billDataDto.getIds().split(",")).filter(v -> v.contains("_")).map(v -> v.substring(v.indexOf("_") + 1)).collect(Collectors.toList());
            if (!CollectionUtils.isEmpty(rangeIds)) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productApplyRange.id", "in", rangeIds)});
                billDataDto.setIds(null);
            } else {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_QUERY_DATA_IS_NULL);
            }
        }
        billDataDto.setCondition(gridFilter);
        this.globalShareService.dealGlobalShareConditionByDto(billDataDto);
        this.putParam(paramMap, billDataDto);
        return new RuleExecuteResult();
    }
}

