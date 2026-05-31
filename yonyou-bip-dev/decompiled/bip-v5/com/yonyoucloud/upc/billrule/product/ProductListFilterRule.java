/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO
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
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.service.GlobalShareService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.base.ConditionOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="productListFilterRule")
public class ProductListFilterRule
extends AbstractCommonRule {
    @Autowired
    GlobalShareService globalShareService;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        LoginUser user;
        FilterCommonVO[] vos;
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (billDataDto != null && billDataDto.getCondition() != null && (vos = billDataDto.getCondition().getCommonVOs()) != null) {
            for (FilterCommonVO vo : vos) {
                if ("prodcutTag".equalsIgnoreCase(vo.getItemName()) && vo.getValue1() != null && vo.getValue1().toString().contains(",")) {
                    billDataDto.setIsDistinct(true);
                    continue;
                }
                if (!"realProductAttribute".equalsIgnoreCase(vo.getItemName()) || !"3".equals(vo.getValue1())) continue;
                vo.setItemName("saleStyle");
                vo.setValue1((Object)"2");
            }
        }
        if (null == (user = AppContext.getCurrentUser())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        FilterVO gridFilter = billDataDto.getCondition();
        if (gridFilter == null) {
            gridFilter = new FilterVO();
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
        if (null == billDataDto.getBillnum()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_BILL_NUM_IS_NULL);
        }
        if ("pc_productlist_shop".equals(billDataDto.getBillnum())) {
            if (ProductUtil.checkUserTyoe(user) != 1) throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CURRENT_USER_NOT_SUPPORT_SHOP_QUERY);
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productApplyRange.rangeType", "eq", (Object)"3"), new SimpleFilterVO("productApplyRange.isCreator", "eq", (Object)true)});
        } else {
            int queryType = 0;
            if (billDataDto.getCondition() != null) {
                FilterCommonVO[] vos2 = billDataDto.getCondition().getCommonVOs();
                if (vos2 != null) {
                    for (FilterCommonVO vo : vos2) {
                        if (!"QueryType".equalsIgnoreCase(vo.getItemName())) continue;
                        queryType = (Integer)vo.getValue1();
                        break;
                    }
                }
                if (queryType > 1) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_QUERY_TYPE_PARAM_ERROR);
                }
            }
            if (queryType == 1) {
                billContext.setbRowAuthControl(false);
            }
            switch (user.getUserType()) {
                case TenantAdmin: 
                case TenantEmployee: {
                    if ("pc_productlist".equals(billDataDto.getBillnum())) {
                        billContext.setQueryJoin("[{\"name\":\"productDetail\",\"join\":\".rangeType=1&&.isCreator=1\"}]");
                        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productDetail.rangeType", "eq", (Object)1)});
                        break;
                    }
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productApplyRange.rangeType", "eq", (Object)1)});
                    break;
                }
                case JoinUser: 
                case TenantShopuser: {
                    if (user.getCustomer() == null) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CURRENT_CUSTOMER_ID_IS_NULL, (Object[])user.getId());
                    }
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("cust", "eq", (Object)user.getCustomer())});
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("creatorType", "eq", (Object)"2")});
                    break;
                }
                case ShopAdminUser: 
                case ShopUser: {
                    if (user.get("shop") == null) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CURRENT_SHOP_ID_IS_NULL, (Object[])user.getId());
                    }
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("shop", "eq", user.get("shop"))});
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("creatorType", "eq", (Object)"3")});
                    break;
                }
            }
        }
        billDataDto.setCondition(gridFilter);
        this.globalShareService.dealGlobalShareConditionByDto(billDataDto);
        this.putParam(paramMap, billDataDto);
        return new RuleExecuteResult();
    }
}

