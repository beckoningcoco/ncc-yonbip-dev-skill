/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.ml.MultiLangContext
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.transtype.model.BdBillType
 *  com.yonyou.ucf.transtype.model.BdTransType
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  org.apache.commons.lang3.ObjectUtils
 *  org.imeta.core.lang.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.base.Json
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.ml.MultiLangContext;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.transtype.model.BdBillType;
import com.yonyou.ucf.transtype.model.BdTransType;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.service.CoredocTransTypeService;
import com.yonyoucloud.upc.service.ProductDefaultValueService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.ObjectUtils;
import org.imeta.core.lang.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.base.Json;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productDataInitRule")
public class ProductDataInitRule
extends AbstractCommonRule {
    @Autowired
    private IUPCProductQueryService upcProductQueryService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    PubOptionService pubOptionService;
    @Autowired
    CoredocTransTypeService coredocTransTypeService;
    @Autowired
    ProductDefaultValueService productDefaultValueService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        Map parameters;
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        Product product = (Product)bills.get(0);
        if (!this.upcControlRuleService.checkProductLine().booleanValue()) {
            switch (AppContext.getCurrentUser().getUserType()) {
                case TenantAdmin: 
                case TenantEmployee: {
                    this.setProductOrgs(product);
                    break;
                }
                case ShopAdminUser: 
                case ShopUser: {
                    this.setCurrentShop(product);
                    break;
                }
            }
        }
        String transTypeId = null;
        Map partParam = billDataDto.getPartParam();
        if (Objects.nonNull(partParam) && partParam.containsKey("transType")) {
            transTypeId = String.valueOf(partParam.get("transType"));
        }
        if (Objects.nonNull(parameters = billDataDto.getParameters()) && parameters.containsKey("transtype")) {
            transTypeId = String.valueOf(parameters.get("transtype"));
        }
        List<Object> transTypeList = new ArrayList();
        if (Objects.nonNull(transTypeId) && !"null".equals(transTypeId) && transTypeId.length() > 0) {
            transTypeList = this.coredocTransTypeService.getTransTypeNameById(transTypeId);
        } else {
            List<BdBillType> billTypeVOList = this.coredocTransTypeService.getBillTypeId();
            if (!CollectionUtils.isEmpty(billTypeVOList)) {
                transTypeList = this.coredocTransTypeService.getTransTypeIdAndNameByBillId(billTypeVOList);
            }
        }
        if (!CollectionUtils.isEmpty(transTypeList)) {
            String locale = InvocationInfoProxy.getLocale();
            String transTypeName = this.coredocTransTypeService.getTranstypeName((BdTransType)transTypeList.get(0), locale);
            if (StringUtils.isEmpty((String)transTypeName)) {
                String defaultLocale = MultiLangContext.getInstance().getDefaultLocaleCode();
                transTypeName = this.coredocTransTypeService.getTranstypeName((BdTransType)transTypeList.get(0), defaultLocale);
            }
            if (StringUtils.isEmpty((String)transTypeName)) {
                transTypeName = ((BdTransType)transTypeList.get(0)).getName();
            }
            product.set("transType", (Object)((BdTransType)transTypeList.get(0)).getId());
            product.set("transType_Name", (Object)transTypeName);
            ((BizObject)bills.get(0)).set("transType", (Object)((BdTransType)transTypeList.get(0)).getId());
            ((BizObject)bills.get(0)).set("transType_Name", (Object)transTypeName);
            this.setMarerialCycleTemptate(product);
        }
        this.putParam(paramMap, product);
        product.put("productSkuSaveAsync", (Object)this.pubOptionService.getProductSkuSaveAsync());
        this.dealOrgPermission(product);
        if ("addProductFromApply".equals(parameters.get("customRefParam"))) {
            this.dealMasterOrgAuto(product);
        }
        this.setManagementClass(billDataDto, product);
        return new RuleExecuteResult((Object)Json.encode2((BizObject)product).toString());
    }

    private void dealMasterOrgAuto(Product product) throws Exception {
        Boolean singleOrg = this.upcControlRuleService.checkSingleOrg();
        if (singleOrg.booleanValue()) {
            return;
        }
        Map masterorgAuto = (Map)product.get("masterorg_auto");
        if (null != masterorgAuto) {
            List<String> userOrgAndVoucherManageOrgs = this.upcControlRuleService.getUserOrgAndVoucherManageOrg("pc.product.Product", "pc_productapply");
            if (!CollectionUtils.isEmpty(userOrgAndVoucherManageOrgs)) {
                for (String orgManage : userOrgAndVoucherManageOrgs) {
                    if (!orgManage.equals(masterorgAuto.get("id"))) continue;
                    return;
                }
            }
            product.setOrgId(null);
            product.setProductApplyRange(null);
            product.setProductOrgs(null);
            product.setProductCustomers(null);
            product.setProductShops(null);
            product.set("masterorg_auto", null);
        }
    }

    private void setMarerialCycleTemptate(Product product) throws Exception {
        if (null != product.getTransType()) {
            Map<String, Object> lifeCycleTemplateData = this.productDefaultValueService.getLifeCycleTemplateData(product.getTransType());
            product.putAll(lifeCycleTemplateData);
            product.put("detail!materialStatus", lifeCycleTemplateData.get("materialStatus"));
            product.put("detail!materialStatus_Name", lifeCycleTemplateData.get("materialStatus_Name"));
        }
    }

    private void setManagementClass(BillDataDto billDataDto, Product product) throws Exception {
        Map partParam = billDataDto.getPartParam();
        if (partParam != null && !partParam.isEmpty()) {
            QuerySchema querySchema;
            List dataList;
            Object productTemplate;
            Object taxClass;
            QuerySchema querySchema2;
            List dataList2;
            Object planClass;
            Object cls;
            QuerySchema querySchema3;
            List dataList3;
            Object productClass;
            QuerySchema querySchema4;
            List dataList4;
            Object costClass;
            QuerySchema querySchema5;
            List dataList5;
            Object manageClass = partParam.get("manageClass");
            if (ObjectUtils.isNotEmpty(manageClass) && !CollectionUtils.isEmpty((Collection)(dataList5 = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)(querySchema5 = QuerySchema.create().addSelect("code, name, template, template.name as templateName,productClass as productClass,productClass.name as productClass_Name,productClass.code as productClass_Code").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isEnd").eq((Object)true), QueryCondition.name((String)"stopstatus").eq((Object)false), QueryCondition.name((String)"id").eq(manageClass), QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgId").eq((Object)product.getOrgId())}))))))) {
                Map cls2 = (Map)dataList5.get(0);
                product.set("manageClass", (Object)Long.parseLong(manageClass.toString()));
                product.put("manageClass_Name", cls2.get("name"));
                product.put("manageClass_Code", cls2.get("code"));
                if (cls2.get("template") != null && cls2.get("templateName") != null) {
                    product.put("productTemplate", (Object)Long.parseLong(cls2.get("template").toString()));
                    product.put("productTemplate_Name", cls2.get("templateName"));
                }
                if (cls2.get("productClass") != null && cls2.get("productClass_Name") != null) {
                    product.setProductClass(Long.valueOf(Long.parseLong(cls2.get("productClass").toString())));
                    product.put("productClass_Name", cls2.get("productClass_Name"));
                    product.put("productClass_Code", cls2.get("productClass_Code"));
                }
            }
            if (ObjectUtils.isNotEmpty(costClass = partParam.get("costClass")) && !CollectionUtils.isEmpty((Collection)(dataList4 = MetaDaoHelper.query((String)"pc.cls.CostClass", (QuerySchema)(querySchema4 = QuerySchema.create().addSelect("code, name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isEnd").eq((Object)true), QueryCondition.name((String)"stopstatus").eq((Object)false), QueryCondition.name((String)"id").eq(costClass), QueryCondition.name((String)"costClassApplyRanges.orgId").eq((Object)product.getOrgId())}))))))) {
                Map cls3 = (Map)dataList4.get(0);
                product.set("costClass", (Object)Long.parseLong(costClass.toString()));
                product.put("costClass_Name", cls3.get("name"));
                product.put("costClass_Code", cls3.get("code"));
            }
            if (ObjectUtils.isNotEmpty(productClass = partParam.get("productClass")) && !CollectionUtils.isEmpty((Collection)(dataList3 = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (QuerySchema)(querySchema3 = QuerySchema.create().addSelect("code, name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isEnd").eq((Object)true), QueryCondition.name((String)"stopstatus").eq((Object)false), QueryCondition.name((String)"id").eq(productClass)}))))))) {
                cls = (Map)dataList3.get(0);
                product.set("productClass", (Object)Long.parseLong(productClass.toString()));
                product.put("productClass_Name", cls.get("name"));
                product.put("productClass_Code", cls.get("code"));
            }
            if (ObjectUtils.isNotEmpty(planClass = partParam.get("planClass")) && !CollectionUtils.isEmpty((Collection)(dataList2 = MetaDaoHelper.query((String)"pc.cls.PlanClass", (QuerySchema)(querySchema2 = QuerySchema.create().addSelect("code, name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isEnd").eq((Object)true), QueryCondition.name((String)"stopstatus").eq((Object)false), QueryCondition.name((String)"id").eq(planClass)}))))))) {
                Map cls4 = (Map)dataList2.get(0);
                product.set("planClass", (Object)Long.parseLong(planClass.toString()));
                product.put("planClass_Name", cls4.get("name"));
                product.put("planClass_Code", cls4.get("code"));
            }
            if (ObjectUtils.isNotEmpty(taxClass = partParam.get("taxClass")) && null != (cls = MetaDaoHelper.findById((String)"pc.tax.TaxRevenue", taxClass))) {
                product.set("taxClass", (Object)Long.parseLong(taxClass.toString()));
                product.put("taxClass_Name", cls.get("name"));
                product.put("taxClass_Code", cls.get("code"));
            }
            if (ObjectUtils.isNotEmpty(productTemplate = partParam.get("productTemplate")) && !CollectionUtils.isEmpty((Collection)(dataList = MetaDaoHelper.query((String)"pc.tpl.ProductTpl", (QuerySchema)(querySchema = QuerySchema.create().addSelect("name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"stopstatus").eq((Object)false), QueryCondition.name((String)"id").eq(productTemplate)}))))))) {
                Map tpl = (Map)dataList.get(0);
                product.set("productTemplate", (Object)Long.parseLong(productTemplate.toString()));
                product.put("productTemplate_Name", tpl.get("name"));
            }
        }
    }

    private void dealOrgPermission(Product product) throws Exception {
        Boolean singleOrg = this.upcControlRuleService.checkSingleOrg();
        if (singleOrg.booleanValue()) {
            return;
        }
        String orgId = product.getOrgId();
        if (null != orgId) {
            List<String> userOrgAndVoucherManageOrgs = this.upcControlRuleService.getUserOrgAndVoucherManageOrg("pc.product.Product", "pc_product", orgId);
            if (!CollectionUtils.isEmpty(userOrgAndVoucherManageOrgs)) {
                for (String orgManage : userOrgAndVoucherManageOrgs) {
                    if (!orgId.equals(orgManage)) continue;
                    return;
                }
            }
            product.setOrgId(null);
            product.setProductApplyRange(null);
            product.setProductOrgs(null);
            product.setProductCustomers(null);
            product.setProductShops(null);
        }
    }

    private void setProductOrgs(Product product) throws Exception {
        if (AppContext.getCurrentUser().getOrgId() == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_ORG_ID_IS_NULL, (Object[])AppContext.getCurrentUser().getId());
        }
        List<Map> orgs = this.upcProductQueryService.GetPrivilegedAndNextOrgs();
        product.setProductOrgs(new ArrayList());
        for (int i = 0; i < orgs.size(); ++i) {
            ProductApplyRange productOrg = new ProductApplyRange();
            productOrg.setEntityStatus(EntityStatus.Insert);
            productOrg.setRangeType(Integer.valueOf(1));
            productOrg.setOrgId(orgs.get(i).get("id").toString());
            productOrg.set("orgCode", orgs.get(i).get("code"));
            productOrg.set("orgName", orgs.get(i).get("name"));
            if (orgs.get(i).get("id").toString().equals(AppContext.getCurrentUser().getOrgId())) {
                productOrg.setIsCreator(Boolean.valueOf(true));
                if (AppContext.getCurrentUser().getShop() != null) {
                    productOrg.setShopId(AppContext.getCurrentUser().getShop());
                }
            } else {
                productOrg.setIsCreator(Boolean.valueOf(false));
            }
            product.productOrgs().add(productOrg);
        }
    }

    private void setCurrentShop(Product product) throws Exception {
        if (AppContext.getCurrentUser().getShop() == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CURRENT_SHOP_ID_IS_NULL, (Object[])AppContext.getCurrentUser().getId());
        }
        BizObject map = MetaDaoHelper.findById((String)"aa.merchant.Merchant", (Object)AppContext.getCurrentUser().getShop());
        if (map == null || map.isEmpty()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_FOUND_CURRENT_SHOP_INFO, new Object[]{AppContext.getCurrentUser().getShop()});
        }
        ProductApplyRange shop = new ProductApplyRange();
        shop.setEntityStatus(EntityStatus.Insert);
        shop.setRangeType(Integer.valueOf(3));
        shop.setShopId(AppContext.getCurrentUser().getShop());
        shop.setOrgId(AppContext.getCurrentUser().getShop().toString());
        shop.setIsCreator(Boolean.valueOf(true));
        shop.setIsApplied(Boolean.valueOf(true));
        shop.set("shopCode", map.get("code"));
        shop.set("shopName", map.get("name"));
        shop.set("customerId", map.get("customerId"));
        ArrayList<ProductApplyRange> shops = new ArrayList<ProductApplyRange>();
        shops.add(shop);
        product.setProductShops(shops);
    }
}

