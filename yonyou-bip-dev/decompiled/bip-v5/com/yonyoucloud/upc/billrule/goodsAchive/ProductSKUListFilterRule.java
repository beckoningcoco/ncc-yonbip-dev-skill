/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
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
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.goodsAchive;

import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
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
import com.yonyoucloud.iuap.upc.api.service.IUPCDataAuthService;
import com.yonyoucloud.upc.service.GlobalShareService;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.base.ConditionOperator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productSkuListFilterRule")
public class ProductSKUListFilterRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(ProductSKUListFilterRule.class);
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private IUPCDataAuthService upcDataAuthService;
    @Autowired
    PubOptionService pubOptionService;
    @Autowired
    GlobalShareService globalShareService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        FilterCommonVO[] vos;
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShareByBillNum(billDataDto.getBillnum());
        if (billDataDto == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800075);
        }
        FilterVO gridFilter = billDataDto.getCondition();
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        if (billDataDto.getCondition() != null && (vos = gridFilter.getCommonVOs()) != null) {
            for (FilterCommonVO vo : vos) {
                if (!"skuTag".equalsIgnoreCase(vo.getItemName()) || vo.getValue1() == null) continue;
                String queryJoin = billContext.getQueryJoin();
                billContext.setQueryJoin("[" + queryJoin.trim().substring(1, queryJoin.length() - 1) + ",{\"name\":\"productId.productApplyRange.skuTagNew\",\"join\":\"productId.productApplyRange.skuTagNew.skuId=id\"}]");
                billDataDto.setIsDistinct(true);
                break;
            }
        }
        int queryType = 0;
        FilterCommonVO[] vos2 = gridFilter.getCommonVOs();
        if (vos2 != null) {
            for (FilterCommonVO vo : vos2) {
                if (!"QueryType".equalsIgnoreCase(vo.getItemName())) continue;
                queryType = (Integer)vo.getValue1();
                break;
            }
        }
        if (queryType > 1) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800076);
        }
        LoginUser user = AppContext.getCurrentUser();
        switch (user.getUserType()) {
            case TenantAdmin: {
                if (queryType == 0) {
                    Map<String, List<String>> productIdMap;
                    if (!orgGlobalShare) {
                        billDataDto.setMasterOrgField("productId.productApplyRange.orgId");
                    }
                    if ((productIdMap = this.upcDataAuthService.getDataPermission(new String[]{"pc.product.Product"})) == null || productIdMap.get("pc.product.Product") == null) break;
                    List<String> productIds = productIdMap.get("pc.product.Product");
                    log.info("productSkuListFilterRule-getDataPermission-productIds=======>: " + productIds);
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productId", "in", productIds)});
                    break;
                }
                billContext.setbRowAuthControl(false);
                break;
            }
            case JoinUser: 
            case TenantShopuser: {
                if (user.getCustomer() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800077, (Object[])user.getId());
                }
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productId.productApplyRange.customerId", "eq", (Object)user.getCustomer())});
                break;
            }
            case ShopAdminUser: 
            case ShopUser: {
                if (user.get("shop") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800078, (Object[])user.getId());
                }
                if (!orgGlobalShare) {
                    billDataDto.setMasterOrgField("productId.productApplyRange.orgId");
                }
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productId.productApplyRange.shopId", "eq", user.get("shop"))});
                break;
            }
        }
        if (billDataDto.getIds() != null && billDataDto.getIds().contains("composeIds:")) {
            String[] composeIds = billDataDto.getIds().replace("composeIds:", "").replace("'", "").split(",");
            if (composeIds.length <= 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800079);
            }
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("concat(id, '_', productId.productApplyRange.id)", "in", (Object)composeIds)});
            billDataDto.setIds(null);
        }
        if (billDataDto.getBillnum().equals("pc_goodsproductskuprolist")) {
            List<String> orgIds;
            LoginUser currentUser = AppContext.getCurrentUser();
            boolean isAdmin = YhtUserUtil.isAdmin((LoginUser)currentUser);
            if (!isAdmin && null != currentUser.get("yht_isAdmin")) {
                isAdmin = (Boolean)currentUser.get("yht_isAdmin");
            }
            if (!(isAdmin || billDataDto.getFromApi() || orgGlobalShare || CollectionUtils.isEmpty(orgIds = this.upcControlRuleService.getOrgPermissions(billDataDto.getBillnum())))) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productId.productApplyRange.orgId", "in", orgIds)});
            }
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("isStandard", "eq", (Object)UPCConstants.ISSKU_STADARD)});
        }
        if (billDataDto.getTreename() != null) {
            if (StringUtils.equals((CharSequence)billDataDto.getTreename(), (CharSequence)"pc.cls.ManagementClass")) {
                billContext.setForeignKey("productId.manageClass.path");
            }
            if (StringUtils.equals((CharSequence)billDataDto.getTreename(), (CharSequence)"pc.cls.PresentationClass")) {
                Map partParam = billDataDto.getPartParam();
                if (partParam != null && partParam.get("lookat") != null && partParam.get("lookat").toString().equals("5")) {
                    billContext.setForeignKey("productId.productAssistClasses.productClassId.path");
                } else {
                    billContext.setForeignKey("productId.productClass.path");
                }
            }
            if (StringUtils.equals((CharSequence)billDataDto.getTreename(), (CharSequence)"pc.cls.CostClass")) {
                billContext.setForeignKey("productId.costClass.path");
            }
            if (StringUtils.equals((CharSequence)billDataDto.getTreename(), (CharSequence)"pc.tpl.ProductTpl")) {
                billContext.setForeignKey("productId.productTemplate.id");
                billDataDto.setOperator("eq");
            }
            if (StringUtils.equals((CharSequence)billDataDto.getTreename(), (CharSequence)"pc.tax.TaxRevenueclass")) {
                billContext.setForeignKey("productId.taxClass.taxrevenueclass.path");
            }
        }
        billDataDto.setCondition(gridFilter);
        this.globalShareService.dealGlobalShareConditionByDto(billDataDto);
        this.putParam(paramMap, billDataDto);
        return new RuleExecuteResult();
    }
}

