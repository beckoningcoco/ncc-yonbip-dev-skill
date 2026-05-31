/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.yonyou.einvoice.dto.taxrevenue.TaxRevenueDTO
 *  com.yonyou.einvoice.service.itf.ITaxRevenueService
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.ucf.common.ml.MultiLangContext
 *  com.yonyou.uap.billcode.BillCodeContext
 *  com.yonyou.uap.billcode.service.IBillCodeComponentService
 *  com.yonyou.ucf.CharacterDTO
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyoucloud.upc.common.enums.DomainOpenEnum
 *  com.yonyoucloud.upc.common.enums.StrategyComparisonRuleEnum
 *  com.yonyoucloud.upc.data.product.ProductQueryDao
 *  com.yonyoucloud.upc.pc.product.AssistUnitType
 *  com.yonyoucloud.upc.pc.product.CreatorType
 *  com.yonyoucloud.upc.pc.product.ForeignKeyQueryEntity
 *  com.yonyoucloud.upc.pc.product.OptionalTypeEnum
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductApplyRangeDetail
 *  com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange
 *  com.yonyoucloud.upc.pc.product.ProductCheckFree
 *  com.yonyoucloud.upc.pc.product.ProductCheckFreeExtend
 *  com.yonyoucloud.upc.pc.product.ProductDepositTime
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.ProductParameter
 *  com.yonyoucloud.upc.pc.product.ProductParameterExtend
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.product.ProductSKUDetail
 *  com.yonyoucloud.upc.pc.product.ProductSource
 *  com.yonyoucloud.upc.pc.product.ProductTag
 *  com.yonyoucloud.upc.pc.product.ProductTagExtend
 *  com.yonyoucloud.upc.pc.product.RealProductAttributeTypeEnum
 *  com.yonyoucloud.upc.pc.product.SKUOrderProperty
 *  com.yonyoucloud.upc.pc.product.SKUOrderPropertyExtend
 *  com.yonyoucloud.upc.pc.product.UnitExchangeType
 *  com.yonyoucloud.upc.pc.tpl.ProductTpl
 *  com.yonyoucloud.upc.pc.tpl.ProductTplCharacter
 *  com.yonyoucloud.upc.utils.ExcelMappingUtil
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.google.gson.JsonObject;
import com.yonyou.einvoice.dto.taxrevenue.TaxRevenueDTO;
import com.yonyou.einvoice.service.itf.ITaxRevenueService;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.ucf.common.ml.MultiLangContext;
import com.yonyou.uap.billcode.BillCodeContext;
import com.yonyou.uap.billcode.service.IBillCodeComponentService;
import com.yonyou.ucf.CharacterDTO;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductDeleteService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductUpdateService;
import com.yonyoucloud.upc.billrule.product.ProductFieldCheckRule;
import com.yonyoucloud.upc.billrule.product.ProductSKUDelCheckRule;
import com.yonyoucloud.upc.common.enums.DomainOpenEnum;
import com.yonyoucloud.upc.common.enums.StrategyComparisonRuleEnum;
import com.yonyoucloud.upc.data.product.ProductQueryDao;
import com.yonyoucloud.upc.enums.BatchRuleEnum;
import com.yonyoucloud.upc.enums.InventoryPlanStrategyEnum;
import com.yonyoucloud.upc.pc.product.AssistUnitType;
import com.yonyoucloud.upc.pc.product.CreatorType;
import com.yonyoucloud.upc.pc.product.ForeignKeyQueryEntity;
import com.yonyoucloud.upc.pc.product.OptionalTypeEnum;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductApplyRangeDetail;
import com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange;
import com.yonyoucloud.upc.pc.product.ProductCheckFree;
import com.yonyoucloud.upc.pc.product.ProductCheckFreeExtend;
import com.yonyoucloud.upc.pc.product.ProductDepositTime;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.ProductParameter;
import com.yonyoucloud.upc.pc.product.ProductParameterExtend;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.product.ProductSKUDetail;
import com.yonyoucloud.upc.pc.product.ProductSource;
import com.yonyoucloud.upc.pc.product.ProductTag;
import com.yonyoucloud.upc.pc.product.ProductTagExtend;
import com.yonyoucloud.upc.pc.product.RealProductAttributeTypeEnum;
import com.yonyoucloud.upc.pc.product.SKUOrderProperty;
import com.yonyoucloud.upc.pc.product.SKUOrderPropertyExtend;
import com.yonyoucloud.upc.pc.product.UnitExchangeType;
import com.yonyoucloud.upc.pc.tpl.ProductTpl;
import com.yonyoucloud.upc.pc.tpl.ProductTplCharacter;
import com.yonyoucloud.upc.service.AchiveDataQueryService;
import com.yonyoucloud.upc.service.ProductBusCheckService;
import com.yonyoucloud.upc.service.ProductCheckService;
import com.yonyoucloud.upc.service.ProductReferenceCheckService;
import com.yonyoucloud.upc.service.ProductSkuCharacterService;
import com.yonyoucloud.upc.service.ProductSkuImportService;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.UseSkuService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.ExcelMappingUtil;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productDataProcessRule")
public class ProductDataProcessRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(ProductDataProcessRule.class);
    BillCodeContext billCodeContext = null;
    @Autowired
    private IUPCProductQueryService upcProductQueryService;
    @Autowired
    private IUPCProductUpdateService upcProductUpdateService;
    @Autowired
    @Lazy
    private IUPCProductDeleteService upcProductDeleteService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private IBillCodeComponentService billCodeComponentService;
    @Autowired
    private ProductBusCheckService productBusCheckService;
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    UseSkuService useSkuService;
    @Autowired
    ProductSkuCharacterService productSkuCharacterService;
    @Autowired
    AchiveDataQueryService achiveDataQueryService;
    @Autowired
    ProductSkuImportService productSkuImportService;
    @Autowired
    ProductReferenceCheckService productReferenceCheckService;
    @Autowired
    ProductCheckService productCheckService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    private ProductQueryDao productQueryDao;
    @Autowired
    private ITaxRevenueService taxRevenueService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        LoginUser user = AppContext.getCurrentUser();
        if (null == user) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PARAM_NOT_NULL_FOR_SAVE);
        }
        List bills = this.getBills(billContext, paramMap);
        this.billCodeContext = this.billCodeComponentService.getBillCodeContext("pc_product|productskus#code", AppContext.getCurrentUser().getYhtTenantId(), "");
        paramMap.put("transactionId", ProductUtil.getNewTransactionId());
        paramMap.put("billCodeContext_billnumMode", this.billCodeContext.getBillnumMode());
        for (int i = 0; i < bills.size(); ++i) {
            Product product = (Product)bills.get(i);
            if (product.get("isCreator") != null && product.get("isCreator").equals(false)) {
                this.setEntityStatus(product);
            }
            this.processAssistUnitExchanges(product);
            this.processRealProductAttribute(product);
            this.verify(product);
            this.productCheckService.checkNameAndModelDescription(product, null, billContext.getBillnum());
            this.setPropValueAuto(product);
            this.setRedundancyData(product);
            this.setInspectionUnitDefaultValues(product);
            this.productReferenceCheckService.productCheckAssistUnitSkuUse(product);
            this.productReferenceCheckService.updateSkuBatchUnitByProductUnit(product);
            Boolean singleOrg = this.upcControlRuleService.checkSingleOrg();
            switch (user.getUserType()) {
                case TenantAdmin: 
                case TenantEmployee: {
                    product.setCreatorType(CreatorType.tenant);
                    product.setPlatFormStaus(Short.valueOf((short)1));
                    this.checkData4U8c(product, 1);
                    this.setOrgData4U8c(product, singleOrg);
                    this.checkRangeData(product, 1);
                    this.setProductApplyRangeDetail(product, 1, billContext);
                    break;
                }
                case JoinUser: 
                case TenantShopuser: {
                    this.checkData4U8c(product, 2);
                    if (product.getEntityStatus() == EntityStatus.Insert) {
                        this.setCustomer(product);
                    }
                    this.checkRangeData(product, 2);
                    this.setProductApplyRangeDetail(product, 2, billContext);
                    break;
                }
                case ShopAdminUser: 
                case ShopUser: {
                    this.checkData4U8c(product, 3);
                    this.checkIfAuditShopProduct(product);
                    if (product.getEntityStatus() == EntityStatus.Insert) {
                        this.setShop(product);
                    }
                    this.checkRangeData(product, 3);
                    this.setProductApplyRangeDetail(product, 3, billContext);
                    break;
                }
                default: {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_USER_TYPE_ERROR, new Object[]{user.getUserType()});
                }
            }
            ArrayList<ProductApplyRange> ranges = new ArrayList<ProductApplyRange>();
            this.processProductApplyRangeAllocator(product);
            this.addRangeData(ranges, product.productOrgs());
            this.addRangeData(ranges, product.productCustomers());
            this.addRangeData(ranges, product.productShops());
            product.setProductOrgs(null);
            product.setProductCustomers(null);
            product.setProductShops(null);
            if (null == product.productApplyRange()) {
                product.setProductApplyRange(ranges);
            } else {
                ranges.removeIf(range -> range.getId().equals(((ProductApplyRange)product.productApplyRange().get(0)).getId()));
                product.productApplyRange().addAll(ranges);
            }
            this.processValueManageType(product);
            this.setDefaultValueForOptionalType(product);
            this.productCheckService.checkOptionalMaterial(product);
            this.processDerivedMaterialChange(product);
            this.processTplChange(product);
            this.setIsBatch(product);
            this.checkApplyDataRepeat(product);
            this.useSkuService.setDefaultForOldArch(product);
            this.useSkuService.syncSaleChannelForApplied(product);
            this.processInspectionCtrPoint(product);
            product.remove("url");
        }
        return new RuleExecuteResult();
    }

    private void processInspectionCtrPoint(Product product) {
        if (product.detail() != null) {
            ProductExtend detail = product.detail();
            if (detail.getOutSourceInspection() != null && detail.getOutSourceInspection() == 1) {
                detail.setOutSourceInspectionCtrlPoint(Integer.valueOf(0));
            } else {
                detail.setOutSourceInspectionCtrlPoint(null);
            }
            if (detail.getTransferInspection() != null && detail.getTransferInspection() == 1) {
                detail.setTransferInspectionCtrlPoint(Integer.valueOf(0));
            } else {
                detail.setTransferInspectionCtrlPoint(null);
            }
            if (detail.getSendInspection() != null && detail.getSendInspection() == 1) {
                detail.setSendInspectionCtrlPoint(Integer.valueOf(0));
            } else {
                detail.setSendInspectionCtrlPoint(null);
            }
            if (detail.getReturnInspection() != null && detail.getReturnInspection() == 1) {
                detail.setReturnInspectionCtrlPoint(Integer.valueOf(0));
            } else {
                detail.setReturnInspectionCtrlPoint(null);
            }
            if (BooleanUtil.isFalse((Object)detail.getInspectionType()) && detail.getInspectionControlPoint() != null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PURCHASE_INSPECTION_CTR_POINT_ERROR, new Object[]{product.getCode()});
            }
            if (BooleanUtil.isTrue((Object)detail.getInspectionType()) && detail.getInspectionControlPoint() == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PURCHASE_INSPECTION_CTR_POINT_NOT_NULL, new Object[]{product.getCode()});
            }
            if (BooleanUtil.isFalse((Object)detail.getProductInspection()) && detail.getProductInspectionCtrlPoint() != null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_INSPECTION_CTR_POINT_ERROR, new Object[]{product.getCode()});
            }
            if (BooleanUtil.isTrue((Object)detail.getProductInspection()) && detail.getProductInspectionCtrlPoint() == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_INSPECTION_CTR_POINT_NOT_NULL, new Object[]{product.getCode()});
            }
            if (BooleanUtil.isFalse((Object)detail.getProductFirstInspection()) && detail.getFirstInspectionCtrlMethod() != null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.FIRST_INSPECTION_CTR_METHOD_ERROR, new Object[]{product.getCode()});
            }
            if (BooleanUtil.isTrue((Object)detail.getProductFirstInspection()) && detail.getFirstInspectionCtrlMethod() == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.FIRST_INSPECTION_CTR_METHOD_NOT_NULL, new Object[]{product.getCode()});
            }
        }
    }

    private void setDefaultValueForOptionalType(Product product) throws Exception {
        if (product != null && EntityStatus.Insert.equals((Object)product.getEntityStatus())) {
            if (product.getIsOptionalMaterial() != null && BooleanUtil.isTrue((Object)product.getIsOptionalMaterial().toString()) && product.getOptionalType() == null) {
                product.setOptionalType(OptionalTypeEnum.CHARACTER_OPTION.getValue());
            }
        } else if (product != null && EntityStatus.Update.equals((Object)product.getEntityStatus())) {
            Product productInDB = this.productQueryDao.getProduct((Long)product.getId(), null);
            if (!product.containsKey((Object)"optionalType")) {
                product.setOptionalType(productInDB.getOptionalType());
            }
        }
    }

    private void processProductApplyRangeAllocator(Product product) {
        if (!Objects.isNull(product) && !CollectionUtils.isEmpty((Collection)product.productOrgs()) && "productApply".equals(product.get("sourceMarker"))) {
            for (ProductApplyRange productApplyRange : product.productOrgs()) {
                productApplyRange.setAllocatorId(StringUtils.isNotBlank((CharSequence)((CharSequence)product.get("allocatorId"))) ? Long.valueOf((String)product.get("allocatorId")) : null);
                productApplyRange.setAllocatorName((String)product.get("allocatorName"));
                productApplyRange.setAllocateTime(new Date());
            }
        }
    }

    private void processDerivedMaterialChange(Product product) throws Exception {
        Integer isDerivedMaterial;
        if (product.get("isDerivedMaterial") != null && (isDerivedMaterial = Integer.valueOf(product.get("isDerivedMaterial").toString())) == 0) {
            product.setOptionalMaterialId(null);
        }
    }

    private void checkApplyDataRepeat(Product product) {
        if (EntityStatus.Insert == product.getEntityStatus() && product.containsKey((Object)"needUpdateCode")) {
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("code", product.getCode());
            params.put("ytenant", AppContext.getYTenantId());
            Map result = (Map)SqlHelper.selectFirst((String)"com.yonyoucloud.upc.product.dao.ProductQuery.QueryByCode", params);
            if (result != null && !result.isEmpty()) {
                product.remove("needUpdateCode");
            }
        }
    }

    private void setIsBatch(Product product) {
        if (!product.containsKey((Object)"isBatch")) {
            product.setIsBatch(Integer.valueOf(0));
        }
    }

    private void setInspectionUnitDefaultValues(Product product) {
        if (null == product.get("productAssistUnitExchanges")) {
            return;
        }
        List productAssistUnitExchanges = ((List)product.get("productAssistUnitExchanges")).stream().filter(assistUnitExchange -> assistUnitExchange.getEntityStatus() != EntityStatus.Delete).collect(Collectors.toList());
        if (productAssistUnitExchanges.size() == 1) {
            Map assistUnitExchange2 = (Map)productAssistUnitExchanges.get(0);
            if (null != assistUnitExchange2.get("unitExchangeType") && "1".equals(assistUnitExchange2.get("unitExchangeType").toString())) {
                ProductExtend detail = (ProductExtend)product.get("detail");
                for (AssistUnitType type : AssistUnitType.values()) {
                    if (null != detail.get(type.toString())) continue;
                    if ("purchasePriceUnit".equals(type.toString()) || "batchPriceUnit".equals(type.toString()) || "offlineUnit".equals(type.toString()) || "onlineUnit".equals(type.toString())) {
                        detail.put(type.toString(), (Object)product.getUnit().toString());
                        continue;
                    }
                    if (assistUnitExchange2.get("assistUnit") == null || detail.get(type.toString()) != null) continue;
                    if (this.pubOptionService.isOpenMultiFloat()) {
                        detail.put(type.toString(), (Object)product.getUnit().toString());
                        continue;
                    }
                    detail.put(type.toString(), (Object)assistUnitExchange2.get("assistUnit").toString());
                }
                product.setDetail(detail);
            }
        } else {
            List productAssistUnitExchangesTemp = productAssistUnitExchanges.stream().filter(assistUnitExchange -> null != assistUnitExchange.get("unitExchangeType") && "1".equals(assistUnitExchange.get("unitExchangeType").toString())).collect(Collectors.toList());
            if (productAssistUnitExchangesTemp.size() > 1) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_ASSIST_UNIT_ONLY_ONE_FOR_UNIT_EXCHANGE_TYPE_1, new Object[]{product.getCode()});
            }
        }
    }

    private void processTplChange(Product product) throws Exception {
        if (!product.containsKey((Object)"productTemplate")) {
            return;
        }
        Long productTemplate = product.getProductTemplate();
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.getId())});
        QuerySchema schema = QuerySchema.create().addSelect("productTemplate").addCondition((ConditionExpression)queryConditionGroup);
        List productIndb = this.productSkuService.query("pc.product.Product", schema);
        if (CollectionUtils.isEmpty((Collection)productIndb)) {
            return;
        }
        Long productTemplateInDb = ((Product)productIndb.get(0)).getProductTemplate();
        if (null == productTemplateInDb) {
            return;
        }
        if (!productTemplateInDb.equals(productTemplate)) {
            if (this.isReferencedByDerivedMaterial(product)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_OPTIONAL_MATERIAL_REF_NOT_SUPPORT_UPDATE_TEMPLATE);
            }
            this.productSkuService.checkFieldBySku(product.getId(), "productTemplate_Name");
            HashMap<String, Object> param = new HashMap<String, Object>(2);
            param.put("productId", product.getId());
            param.put("ytenant", AppContext.getYTenantId());
            SqlHelper.delete((String)"com.yonyoucloud.upc.product.dao.ProductSKUSpecItem.deleteProductSpecItemByProductId", param);
        }
    }

    public boolean isReferencedByDerivedMaterial(Product product) throws Exception {
        QueryConditionGroup queryDerivedMaterialConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"optionalMaterialId").eq(product.getId())});
        QuerySchema queryDerivedMaterialSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryDerivedMaterialConditionGroup);
        List derivedMatariaList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)queryDerivedMaterialSchema);
        return derivedMatariaList != null && derivedMatariaList.size() > 0;
    }

    private void processValueManageType(Product product) {
        ProductExtend detail;
        if (1 == product.getRealProductAttribute() && null != (detail = product.detail()) && !detail.containsKey((Object)"virtualProductAttribute")) {
            detail.put("virtualProductAttribute", (Object)0);
        }
    }

    private void processRealProductAttribute(Product product) {
        if (1 == product.getRealProductAttribute()) {
            if (null == product.getRealProductAttributeType()) {
                product.put("realProductAttributeType", (Object)1);
            }
            product.put("virtualProductAttribute", null);
        }
        if (2 == product.getRealProductAttribute()) {
            if (null == product.getVirtualProductAttribute()) {
                product.put("virtualProductAttribute", (Object)7);
            }
            product.put("realProductAttributeType", null);
        }
    }

    private void addRangeData(List<ProductApplyRange> ranges, List<ProductApplyRange> subRanges) {
        if (null == ranges || null == subRanges) {
            return;
        }
        List rangeIds = ranges.stream().map(map -> (Long)map.getId()).collect(Collectors.toList());
        for (ProductApplyRange range : subRanges) {
            if (rangeIds.contains(range.getId())) continue;
            if (null == range.getAllocatorName()) {
                range.setAllocatorName(AppContext.getCurrentUser().getName());
                range.setAllocatorId((Long)AppContext.getCurrentUser().getId());
                range.setAllocateTime(new Date());
            }
            ranges.add(range);
        }
    }

    private void setEntityStatus(Product product) {
        product.setEntityStatus(EntityStatus.Update);
        if (product.description() != null) {
            product.remove("description");
        }
        if (product.define() != null) {
            product.remove("define");
        }
        if (product.productAssistUnitExchanges() != null) {
            product.remove("productAssistUnitExchanges");
        }
        if (product.productAlbums() != null) {
            product.remove("productAlbums");
        }
        if (product.productAttachments() != null) {
            product.remove("productAttachments");
        }
        if (product.productAssistClasses() != null) {
            product.remove("productAssistClasses");
        }
        if (product.productspecitems() != null) {
            product.remove("productspecitems");
        }
        if (product.productCustomers() != null) {
            product.remove("productCustomers");
        }
        if (product.productShops() != null) {
            product.remove("productShops");
        }
        if (product.productskus() != null) {
            for (ProductSKU sku : product.productskus()) {
                sku.setEntityStatus(EntityStatus.Update);
                if (sku.skudefine() == null) continue;
                sku.remove("skudefine");
            }
        }
        if (product.productSpecFrees() != null) {
            product.remove("productSpecFrees");
        }
        if (product.productOrgs() != null) {
            product.remove("productOrgs");
        }
    }

    private void setPropValueAuto(Product product) throws Exception {
        String productName = (String)MultilangUtil.getAttr((String)"pc.product.Product", (String)"name", (BizObject)product, (String)"zh_CN");
        if (product.getEntityStatus() == EntityStatus.Insert) {
            if (product.detail().getShortName() == null || StringUtils.isEmpty((CharSequence)product.detail().getShortName())) {
                product.detail().setShortName(productName);
            }
            if (product.getIsOptionalMaterial() != null && BooleanUtil.isTrue((Object)product.getIsOptionalMaterial()) && product.detail().get("strategyComparisonRule") == null) {
                product.detail().set("strategyComparisonRule", (Object)StrategyComparisonRuleEnum.severity.getValue());
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void verify(Product product) throws Exception {
        Object doubleReplenish;
        HashMap<String, String> optionDomainMap;
        block98: {
            block99: {
                String defaultLocale = MultiLangContext.getInstance().getDefaultLocaleCode();
                String productName = (String)MultilangUtil.getAttr((String)"pc.product.Product", (String)"name", (BizObject)product, (String)defaultLocale);
                if (!product.containsKey((Object)"code") || product.getCode() == null || "".equalsIgnoreCase(product.getCode())) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CODE_NOT_NULL, new Object[]{productName});
                }
                product.setCode(product.getCode().trim());
                if (product.containsKey((Object)"erpCode") && product.getErpCode() != null) {
                    product.setErpCode(product.getErpCode().trim());
                }
                if (!product.containsKey((Object)"name") || productName == null || "".equalsIgnoreCase(productName)) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NAME_NOT_NULL, new Object[]{product.getCode()});
                }
                if (!product.containsKey((Object)"manageClass") || product.getManageClass() == null || product.getManageClass() == 0L) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_MANAGE_CLASS_NOT_NULL, new Object[]{product.getCode()});
                }
                Object schema = QuerySchema.create().addSelect(new String[]{"id", "code", "name", "isEnd"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)product.getManageClass()), QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgId").eq((Object)product.getOrgId())}));
                List list = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)schema);
                if (CollectionUtils.isEmpty((Collection)list)) {
                    if (!this.pubOptionService.getOrgGlobalShare("pc.cls.ManagementClass").booleanValue()) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800203, new Object[]{product.getCode()});
                    QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)product.getManageClass())}));
                    List manageClassList = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)querySchema);
                    if (CollectionUtils.isEmpty((Collection)manageClassList)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800203, new Object[]{product.getCode()});
                    }
                } else if (((Map)list.get(0)).get("isEnd") == null || !Boolean.parseBoolean(((Map)list.get(0)).get("isEnd").toString())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800204, new Object[]{product.getCode()});
                }
                this.productCheckService.checkProductClassDataValidity(product);
                this.productCheckService.checkPlanClassDataValidity(product);
                this.productCheckService.checkPurchaseClassDataValidity(product);
                if (!product.containsKey((Object)"unit") || product.getUnit() == null || product.getUnit() == 0L) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800205, new Object[]{product.getCode()});
                }
                if (!product.containsKey((Object)"unitUseType") || product.getUnitUseType() == null || product.getUnitUseType() == 0) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808000, new Object[]{product.getCode()});
                }
                if (product.productAssistUnitExchanges() != null) {
                    for (ProductAssistUnitExchange exchange : product.productAssistUnitExchanges()) {
                        if (exchange.containsKey((Object)"mainUnitCount") && exchange.get("mainUnitCount") != null && exchange.get("mainUnitCount").toString().length() != 0 && new BigDecimal(exchange.get("mainUnitCount").toString()).compareTo(BigDecimal.ZERO) > 0) continue;
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808001, new Object[]{product.getCode()});
                    }
                }
                if (product.containsKey((Object)"couponId") && product.getCouponId() != null && this.upcProductQueryService.checkCouponProduct((Long)product.getId(), product.getCouponId()).booleanValue()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808002, new Object[]{product.getCode(), product.getCouponId()});
                }
                if (product.detail() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808003, new Object[]{product.getCode()});
                }
                if (product.detail().containsKey((Object)"saleChannel") && product.detail().get("saleChannel") != null && !"".equals(product.detail().get("saleChannel").toString()) && (!product.detail().containsKey((Object)"businessAttribute") || product.detail().get("businessAttribute") == null || "".equals(product.detail().get("businessAttribute").toString()))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808004, new Object[]{product.getCode()});
                }
                if (product.detail().get("deliveryMethod") == null || "".equals(product.detail().get("deliveryMethod").toString())) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_DELIVERYMETHOD_IS_NOT_NULL, new Object[]{product.getCode()});
                }
                if (product.detail().containsKey((Object)"planMethod") && product.detail().get("planMethod") != null && !"10".equals(product.detail().get("planMethod").toString())) {
                    if (product.detail().containsKey((Object)"inventoryPlanStrategy") && product.detail().get("inventoryPlanStrategy") != null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800206, new Object[]{product.getCode()});
                    }
                } else if (product.detail().containsKey((Object)"planMethod") && product.detail().get("planMethod") != null && "10".equals(product.detail().get("planMethod").toString())) {
                    String batchRule;
                    if (!product.detail().containsKey((Object)"inventoryPlanStrategy") || product.detail().get("inventoryPlanStrategy") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800207, new Object[]{product.getCode()});
                    }
                    if (InventoryPlanStrategyEnum.ROP == InventoryPlanStrategyEnum.find(Integer.valueOf(product.detail().get("inventoryPlanStrategy").toString())) && product.detail().containsKey((Object)"batchRule") && null != product.detail().get("batchRule") && BatchRuleEnum.MakeUP_To_MaxStock != BatchRuleEnum.find(Integer.valueOf(batchRule = product.detail().get("batchRule").toString())) && BatchRuleEnum.Economic_Lot_Size != BatchRuleEnum.find(Integer.valueOf(batchRule))) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800208, new Object[]{product.getCode()});
                    }
                    if (InventoryPlanStrategyEnum.LFL == InventoryPlanStrategyEnum.find(Integer.valueOf(product.detail().get("inventoryPlanStrategy").toString())) && product.detail().containsKey((Object)"batchRule") && null != product.detail().get("batchRule") && BatchRuleEnum.Direct_Batch != BatchRuleEnum.find(Integer.valueOf(batchRule = product.detail().get("batchRule").toString())) && BatchRuleEnum.Economic_Lot_Size != BatchRuleEnum.find(Integer.valueOf(batchRule)) && BatchRuleEnum.Fixed_Lot_Size != BatchRuleEnum.find(Integer.valueOf(batchRule))) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800209, new Object[]{product.getCode()});
                    }
                    if (!product.detail().containsKey((Object)"planDefaultAttribute") && product.getEntityStatus() == EntityStatus.Update && ObjectUtils.isNotEmpty((Object)product) && ObjectUtils.isNotEmpty((Object)product.getId()) && ObjectUtils.isNotEmpty((Object)product.get("productApplyRangeId"))) {
                        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productApplyRangeId").eq(product.get("productApplyRangeId")), QueryCondition.name((String)"productId").eq(product.getId())});
                        QuerySchema querySchema = QuerySchema.create().addSelect("planDefaultAttribute").addCondition((ConditionExpression)conditionGroup);
                        Map productDetailMap = MetaDaoHelper.queryOne((String)"pc.product.ProductDetail", (QuerySchema)querySchema);
                        product.detail().put("planDefaultAttribute", productDetailMap.get("planDefaultAttribute"));
                    }
                    if (!product.detail().containsKey((Object)"planDefaultAttribute") || product.detail().get("planDefaultAttribute") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800210, new Object[]{product.getCode()});
                    }
                    if ("3".equals(product.detail().get("planDefaultAttribute").toString())) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800211, new Object[]{product.getCode()});
                    }
                }
                if (product.detail().containsKey((Object)"isBatchManage") && product.detail().get("isBatchManage") != null && product.detail().get("isBatchManage").equals(false)) {
                    if (product.detail().containsKey((Object)"checkByBatch") && product.detail().get("checkByBatch") != null && product.detail().get("checkByBatch").equals(true)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800212, new Object[]{product.getCode()});
                    }
                    product.detail().setCheckByBatch(Boolean.valueOf(false));
                } else if (product.detail().containsKey((Object)"isBatchManage") && product.detail().get("isBatchManage") != null && product.detail().get("isBatchManage").equals(true)) {
                    if (!product.detail().containsKey((Object)"checkByBatch") || product.detail().get("checkByBatch") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800213, new Object[]{product.getCode()});
                    }
                    if (product.detail().containsKey((Object)"isExpiryDateManage") && product.detail().get("isExpiryDateManage") != null && product.detail().get("isExpiryDateManage").equals(true) && product.getEntityStatus() == EntityStatus.Insert && (!product.detail().containsKey((Object)"isExpiryDateCalculationMethod") || product.detail().get("isExpiryDateCalculationMethod") == null || !"0,1,2".contains(product.detail().get("isExpiryDateCalculationMethod").toString()))) {
                        product.detail().put("isExpiryDateCalculationMethod", (Object)0);
                    }
                } else if (!product.detail().containsKey((Object)"isBatchManage") && product.detail().containsKey((Object)"checkByBatch") && product.detail().get("checkByBatch") != null && product.detail().get("checkByBatch").equals(true)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800214, new Object[]{product.getCode()});
                }
                if (product.detail().containsKey((Object)"lossType") && product.detail().get("lossType") != null) {
                    if ("0".equals(product.detail().get("lossType").toString())) {
                        product.detail().put("fixedWastage", null);
                        product.detail().put("wastageRate", null);
                    }
                    if ("5".equals(product.detail().get("lossType").toString())) {
                        product.detail().put("wastageRate", null);
                    }
                }
                if (product.getUnitUseType().equals(Short.valueOf("1")) && product.productAssistUnitExchanges() != null) {
                    for (ProductAssistUnitExchange exchange : product.productAssistUnitExchanges()) {
                        exchange.setEntityStatus(EntityStatus.Delete);
                    }
                }
                if (product.getRealProductAttribute() != null && product.getVirtualProductAttribute() != null && product.getRealProductAttribute() == 2 && product.getVirtualProductAttribute() == 1) {
                    schema = QuerySchema.create().addSelect(new String[]{"id", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"realProductAttribute").eq((Object)2), QueryCondition.name((String)"virtualProductAttribute").eq((Object)1)}));
                    list = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
                    if (list.size() > 1) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800215);
                    }
                    if (list.size() == 1 && !((Map)list.get(0)).get("id").toString().equals(product.getId().toString())) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800216, new Object[]{((Map)list.get(0)).get("name")});
                    }
                }
                if (product.containsKey((Object)"bCheck_") && product.get("bCheck_").equals(false)) {
                    return;
                }
                if (product.detail().getIStatus() != null && product.detail().getIStatus().equals(true) || product.detail().getIUOrderStatus() != null && product.detail().getIUOrderStatus().equals(true)) {
                    if (product.getRealProductAttribute().equals(1)) {
                        if (product.getRealProductAttributeType().equals(2)) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800217, new Object[]{product.getCode()});
                        }
                        if (product.getRealProductAttributeType().equals(3)) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808020, new Object[]{product.getCode()});
                        }
                    } else if (product.getRealProductAttribute().equals(2) && product.getVirtualProductAttribute().equals(1)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808021, new Object[]{product.getCode()});
                    }
                    if (product.getEntityStatus() == EntityStatus.Insert) {
                        if (!product.containsKey((Object)"productClass") || product.getProductClass() == null) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800218, new Object[]{product.getCode()});
                        }
                    } else if (!product.containsKey((Object)"productClass")) {
                        Map map = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect("id, productClass").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.getId())})));
                        if (null == map) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808022, new Object[]{product.getCode()});
                        }
                        if (!map.containsKey("productClass")) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800218, new Object[]{product.getCode()});
                        }
                    } else if (product.containsKey((Object)"productClass") && product.getProductClass() == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800218, new Object[]{product.getCode()});
                    }
                }
                if (!product.containsKey((Object)"realProductAttribute") || (product.productskus() == null || product.productskus().size() <= 0 || product.productskus().stream().filter(sku -> sku.getEntityStatus() != EntityStatus.Delete).count() <= 0L) && (product.productspecitems() == null || product.productspecitems().size() <= 0 || product.productspecitems().stream().filter(spec -> spec.getEntityStatus() != EntityStatus.Delete).count() <= 0L)) break block98;
                if (!product.getRealProductAttribute().equals(2)) break block99;
                switch (product.getVirtualProductAttribute()) {
                    case 1: {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800219, new Object[]{product.getCode()});
                    }
                    case 2: {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808023, new Object[]{product.getCode()});
                    }
                    case 3: {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808024, new Object[]{product.getCode()});
                    }
                    case 4: {
                        break block98;
                    }
                    case 7: {
                        break block98;
                    }
                    case 9: {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808025, new Object[]{product.getCode()});
                    }
                    case 10: {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808026, new Object[]{product.getCode()});
                    }
                    case 11: {
                        break block98;
                    }
                    case 16: {
                        break block98;
                    }
                    default: {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808027, new Object[]{product.getCode()});
                    }
                }
            }
            if (product.getRealProductAttribute().equals(1)) {
                switch (product.getRealProductAttributeType()) {
                    case 1: {
                        break;
                    }
                    case 4: {
                        break;
                    }
                    case 2: {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808028, new Object[]{product.getCode()});
                    }
                    case 3: {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808029, new Object[]{product.getCode()});
                    }
                    default: {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808030, new Object[]{product.getCode()});
                    }
                }
            }
        }
        if (product.detail().containsKey((Object)"enableDeposit") && product.detail().getEnableDeposit() != null && !product.detail().getEnableDeposit().booleanValue()) {
            product.detail().setDeposits(null);
            product.detail().setDepositPercentage(null);
            product.detail().setMinimumDeposits(null);
        }
        if (product.detail().containsKey((Object)"isExpiryDateManage") && product.detail().getIsExpiryDateManage() != null && !product.detail().getIsExpiryDateManage().booleanValue()) {
            product.detail().setExpireDateNo(null);
            product.detail().setExpireDateUnit(null);
            product.detail().setDaysBeforeValidityReject(null);
            product.detail().setValidityWarningDays(null);
            product.detail().setIsExpiryDateCalculationMethod(null);
        }
        if ((ProductUtil.checkOpenOptionsOrResult((Map<String, String>)(optionDomainMap = new HashMap<String, String>(){
            {
                this.put("app:IA", "u8c-config");
            }
        })).booleanValue() && ProductUtil.checkOptionNameList() || ProductUtil.checkOpenOption("u8c-config", DomainOpenEnum.EIA.getServiceName())) && product.getRealProductAttribute() != null && 2 == product.getRealProductAttribute() && product.detail() != null) {
            String businessAttribute = product.detail().getBusinessAttribute();
            if (businessAttribute != null && businessAttribute.indexOf("2") != -1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800221, new Object[]{product.getCode()});
            }
            if (businessAttribute != null && businessAttribute.indexOf("3") != -1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800222, new Object[]{product.getCode()});
            }
            if (product.detail().getValueManageType() != null && 0 == product.detail().getValueManageType()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800223, new Object[]{product.getCode()});
            }
        }
        if (product.detail() != null && product.detail().getBusinessAttribute() != null && product.detail().getBusinessAttribute().length() > 0 && product.detail().getBusinessAttribute().contains("3") && product.detail().getDirectProduction() != null && product.detail().getDirectProduction() == 1) {
            if (product.detail().containsKey((Object)"demandConsolidation") && product.detail().get("demandConsolidation") != null && !product.detail().get("demandConsolidation").toString().equals("10")) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800224, new Object[]{product.getCode()});
            }
            if (product.detail().containsKey((Object)"demandConsolidation") || product.detail().get("demandConsolidation") == null) {
                product.detail().put("demandConsolidation", (Object)10);
            }
            if (product.detail().getPlanMethod() != null && product.detail().getPlanMethod() == 10) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800225, new Object[]{product.getCode()});
            }
        } else if (product.detail().getDirectProduction() != null && product.detail().getDirectProduction() == 1) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800226, new Object[]{product.getCode()});
        }
        if (product.getVirtualProductAttribute() != null && 16 == product.getVirtualProductAttribute() && product.detail() != null && product.detail().get("ECNControl") != null && ("true".equalsIgnoreCase(product.detail().get("ECNControl").toString()) || "1".equals(product.detail().get("ECNControl").toString()))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800227, new Object[]{product.getCode()});
        }
        if (product.detail().containsKey((Object)"saleStyle") && product.detail().getSaleStyle() != null && product.detail().getSaleStyle().equals("1")) {
            product.detail().setSalePoints(null);
        }
        if (product.detail().getValueManageType() == null) {
            product.detail().setValueManageType(Short.valueOf("99"));
        }
        if (0 != product.detail().getValueManageType()) {
            product.detail().setCostValuation(null);
        }
        if (product.detail().get("specialMaterials") != null && "true".equals(product.detail().get("specialMaterials").toString()) && product.detail().get("reservation") != null && "false".equals(product.detail().get("reservation").toString())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800230, new Object[]{product.getCode()});
        }
        if (product.detail().containsKey((Object)"batchRule")) {
            Short batchRule = product.detail().getBatchRule();
            if (batchRule != null && 10 == batchRule) {
                BigDecimal fixedQuantity = product.detail().getFixedQuantity();
                if (null == fixedQuantity) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800231, new Object[]{product.getCode()});
                }
                if (fixedQuantity.compareTo(BigDecimal.ZERO) <= 0) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800232, new Object[]{product.getCode()});
                }
            }
            if (batchRule != null && 5 == batchRule && null == product.detail().get("economicQuantity")) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800233, new Object[]{product.getCode()});
            }
        }
        if (product.detail().containsKey((Object)"doubleReplenish") && (doubleReplenish = product.detail().get("doubleReplenish")) != null && doubleReplenish.toString().startsWith("-")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800234, new Object[]{product.getCode()});
        }
        this.checkIsEnd(product);
        this.checkVendor(product);
        this.checkIDoubleSale(product);
        this.checkOMSWarehouse(product);
        this.checkAtpInspection(product);
    }

    public void checkAtpInspection(Product product) {
        ProductExtend detail = product.detail();
        if (detail != null && detail.getAtpInspection() != null && BooleanUtil.isTrue((Object)detail.getAtpInspection().toString()) && product.getRealProductAttribute() != null && !RealProductAttributeTypeEnum.PhysicalMaterials.getValue().equals(String.valueOf(product.getRealProductAttribute()))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800235);
        }
    }

    private void checkIsEnd(Product product) throws Exception {
        List taxRevenueList;
        if (product.getTaxClass() != null && (CollectionUtils.isEmpty((Collection)(taxRevenueList = this.taxRevenueService.getTaxRevenueByCode(Collections.singletonList(product.getTaxClass()), new String[]{"isEnd"}))) || taxRevenueList.get(0) == null || !BooleanUtil.isTrue((Object)((TaxRevenueDTO)taxRevenueList.get(0)).getIsEnd()))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800236, new Object[]{product.getCode()});
        }
    }

    private void checkIDoubleSale(Product product) throws Exception {
        if (null != product.productDetail() && product.detail().containsKey((Object)"iDoubleSale") && null != product.detail().get("iDoubleSale")) {
            this.productBusCheckService.checkIDoubleSale(product.detail().get("iDoubleSale"), product.getId());
        }
    }

    private void checkOMSWarehouse(Product product) throws Exception {
        if (null != product.detail() && null != product.detail().get("omsWarehouse")) {
            String orgId = product.getOrgId();
            if (product.get("productApplyRange_OrgId") != null) {
                orgId = product.get("productApplyRange_OrgId").toString();
            } else if (product.get("productApplyRange_orgId") != null) {
                orgId = product.get("productApplyRange_orgId").toString();
            }
            if (!"666666".equals(orgId)) {
                this.productBusCheckService.checkOMSWarehouse(product.detail().get("omsWarehouse").toString(), orgId);
            }
        }
    }

    private void checkVendor(Product product) throws Exception {
        Object orgId;
        if (product.getEntityStatus().equals((Object)EntityStatus.Insert)) {
            orgId = product.getOrgId();
        } else {
            Object object = orgId = null != product.get("productApplyRange_OrgId") ? product.get("productApplyRange_OrgId") : product.get("productApplyRange_orgId");
        }
        if (null != orgId && null != product.productDetail() && product.detail().containsKey((Object)"productVendor") && null != product.detail().get("productVendor")) {
            this.productBusCheckService.checkOrgOfVendor(orgId, product.detail().get("productVendor"));
        }
    }

    private void checkRangeData(Product product, int rangeType) throws Exception {
        if (product.getEntityStatus() == EntityStatus.Insert) {
            if (rangeType == 1) {
                if (product.productOrgs() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808031, new Object[]{product.getCode()});
                }
                List productOrgs = product.productOrgs().stream().filter(v -> v.getOrgId() != null).collect(Collectors.toList());
                Set orgs = productOrgs.stream().map(v -> v.getOrgId()).collect(Collectors.toSet());
                if (!CollectionUtils.isEmpty(productOrgs) && productOrgs.size() != orgs.size()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800237);
                }
            } else if (rangeType == 3) {
                if (product.productShops() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808032, new Object[]{product.getCode()});
                }
                for (ProductApplyRange shop : product.productShops()) {
                    if (product.productShops().stream().filter(productShop -> productShop.getShopId().equals(shop.getShopId())).count() > 1L) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800238);
                    }
                    shop.setOrgId(shop.getShopId().toString());
                }
            }
        } else if (product.getEntityStatus() == EntityStatus.Update) {
            if (rangeType == 1) {
                List orgsDelInDb;
                Object createOrg;
                if (product.productOrgs() == null) {
                    return;
                }
                List orgsDel = product.productOrgs().stream().filter(map -> map.getEntityStatus() == EntityStatus.Delete).collect(Collectors.toList());
                if (orgsDel != null && orgsDel.size() > 0 && ((Optional)(createOrg = (orgsDelInDb = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect("id, isCreator, isApplied, orgId.name as orgName").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"orgId").in((Collection)orgsDel.stream().map(ProductApplyRange::getOrgId).collect(Collectors.toList()))})))).stream().filter(map -> map.get("isCreator").equals(true)).findAny())).isPresent()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800239, new Object[]{((Map)((Optional)createOrg).get()).get("orgName")});
                }
                List orgsToDb = product.productOrgs().stream().filter(map -> map.getEntityStatus() == EntityStatus.Insert || map.getEntityStatus() == EntityStatus.Update).collect(Collectors.toList());
                for (ProductApplyRange org : orgsToDb) {
                    if (orgsToDb.stream().filter(map -> map.getOrgId().equals(org.getOrgId())).count() <= 1L) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800237);
                }
                List orgIds = product.productOrgs().stream().map(ProductApplyRange::getOrgId).collect(Collectors.toList());
                if (orgIds != null && orgIds.size() > 0) {
                    List orgsInDb = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect("id, orgId, orgId.code as orgCode, orgId.name as orgName").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"rangeType").eq((Object)1), QueryCondition.name((String)"orgId").in(orgIds)})));
                    List orgsExistInDb = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect("id, orgId, orgId.code as orgCode, orgId.name as orgName").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"rangeType").eq((Object)1)})));
                    for (ProductApplyRange org : orgsToDb) {
                        if (org.getEntityStatus() == EntityStatus.Insert) {
                            if (orgsInDb.stream().filter(map -> map.get("orgId").equals(org.getOrgId())).count() <= 0L || orgsDel.stream().filter(map -> map.getOrgId().equals(org.getOrgId())).count() != 0L) continue;
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800241);
                        }
                        if (org.getEntityStatus() != EntityStatus.Update || orgsExistInDb.stream().filter(map -> !map.get("id").equals(org.getId()) && map.get("orgId").equals(org.getOrgId())).count() <= 0L || orgsDel.stream().filter(map -> map.getOrgId().equals(org.getOrgId())).count() != 0L) continue;
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800242);
                    }
                }
            } else if (rangeType == 3) {
                // empty if block
            }
        }
    }

    private void checkIfAuditShopProduct(Product product) throws Exception {
        Object checkType = OptionUtils.getSysOptionByName((String)"shopProIfPlatformAudit");
        if (checkType == null || "1".equals(checkType.toString())) {
            if (product.getEntityStatus() == EntityStatus.Insert) {
                product.setPlatFormStaus(Short.valueOf((short)1));
                product.setCPlatFormRemark(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408072A", (String)"\u5546\u5bb6\u5546\u54c1\u5df2\u8bbe\u7f6e\u4e3a\u4e0d\u9700\u8981\u5ba1\u6838\u5c31\u80fd\u4e0a\u4e0b\u67b6"));
            }
        } else if ("2".equals(checkType.toString())) {
            product.setCPlatFormRemark(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408072C", (String)"\u5546\u5bb6\u5546\u54c1\u5df2\u8bbe\u7f6e\u4e3a\u65b0\u5efa\u548c\u4fee\u6539\u65f6\u9700\u8981\u5ba1\u6838\u5c31\u80fd\u4e0a\u4e0b\u67b6"));
            if (product.getEntityStatus() == EntityStatus.Insert) {
                product.setPlatFormStaus(Short.valueOf((short)0));
            } else if (product.getEntityStatus() == EntityStatus.Update && product.containsKey((Object)"platFormStaus") && product.getPlatFormStaus() == 1) {
                product.setPlatFormStaus(Short.valueOf((short)0));
            }
            product.detail().setIStatus(Boolean.valueOf(false));
            product.detail().setIUOrderStatus(Boolean.valueOf(false));
            HashMap<String, Object> params = new HashMap<String, Object>(3);
            params.put("productid", product.getId());
            params.put("tenantid", AppContext.getCurrentUser().getTenant());
            params.put("shopid", AppContext.getCurrentUser().getShop());
            this.upcProductUpdateService.UpdateApplyRangeDetailStatus(params);
        } else if ("3".equals(checkType.toString())) {
            product.setCPlatFormRemark(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040806C3", (String)"\u5546\u5bb6\u5546\u54c1\u5df2\u8bbe\u7f6e\u4e3a\u65b0\u5efa\u65f6\u9700\u8981\uff0c\u4fee\u6539\u65f6\u4e0d\u9700\u8981\u5ba1\u6838\u5c31\u80fd\u4e0a\u4e0b\u67b6"));
            if (product.getEntityStatus() == EntityStatus.Insert) {
                product.setPlatFormStaus(Short.valueOf((short)0));
                product.detail().setIStatus(Boolean.valueOf(false));
                product.detail().setIUOrderStatus(Boolean.valueOf(false));
            } else if (product.getEntityStatus() == EntityStatus.Update && product.containsKey((Object)"platFormStaus") && product.getPlatFormStaus() != 1) {
                product.detail().setIStatus(Boolean.valueOf(false));
                product.detail().setIUOrderStatus(Boolean.valueOf(false));
            }
        }
    }

    private void checkData4U8c(Product product, int rangeType) throws Exception {
        if (rangeType == 1) {
            if (!product.containsKey((Object)"orgId") || product.getOrgId() == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800244);
            }
        } else if (!(rangeType != 3 || product.get("isCreator") != null && product.get("isCreator").equals(false) || product.containsKey((Object)"shop") && product.getShop() != null)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800245);
        }
        if (product.getEntityStatus() == EntityStatus.Update) {
            Map productOrg = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect(new String[]{"orgId", "shop"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.getId())})));
            if (productOrg == null || productOrg.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808005, new Object[]{product.getCode()});
            }
            if (rangeType == 1) {
                if (!productOrg.get("orgId").toString().equals(product.getOrgId())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800246, new Object[]{product.getCode()});
                }
            } else if (!(rangeType != 3 || product.get("isCreator") != null && product.get("isCreator").equals(false) || productOrg.get("shop").equals(product.getShop()))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800247, new Object[]{product.getCode()});
            }
        }
    }

    private void setOrgData4U8c(Product product, Boolean singleOrg) throws Exception {
        if (product.getEntityStatus() == EntityStatus.Insert) {
            if (ProductUtil.AutoGenerateRangeData(product)) {
                this.upcProductQueryService.setOrgs4U8c(product, singleOrg);
            } else if (!CollectionUtils.isEmpty((Collection)product.productOrgs())) {
                List productApplyRanges = product.productOrgs();
                Set<String> orgIds = productApplyRanges.stream().map(range -> range.getOrgId().toString()).collect(Collectors.toSet());
                List<ProductApplyRange> applyRanges = this.getProductApplyRanges(product, orgIds);
                product.setProductOrgs(applyRanges);
            } else {
                this.upcProductQueryService.setOrgs4U8c(product, singleOrg);
            }
            if (null == product.productOrgs() || product.productOrgs().isEmpty()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_RANGE_NOT_NULL);
            }
            for (ProductApplyRange org : product.productOrgs()) {
                org.setId((Object)IdManager.getInstance().nextId());
                org.setProductId((Long)product.getId());
            }
        }
    }

    public List<ProductApplyRange> getProductApplyRanges(Product product, Set<String> orgs) throws Exception {
        ArrayList<ProductApplyRange> ranges = new ArrayList();
        List<Map> result = this.upcControlRuleService.getOrgDetail(orgs);
        for (Map org : result) {
            if (!org.get("externalorg").equals(0)) continue;
            ProductApplyRange range = ProductUtil.buildProductApplyRange(null, 1, org.get("id").toString(), null);
            range.remove("id");
            range.put("orgId", org.get("id"));
            range.put("orgCode", org.get("code"));
            range.put("orgName", org.get("name"));
            if (org.get("id").toString().equalsIgnoreCase(product.getOrgId())) {
                range.setIsCreator(Boolean.valueOf(true));
                range.setIsApplied(Boolean.valueOf(true));
            }
            ranges.add(range);
        }
        ranges = ranges.stream().sorted(Comparator.comparing(ProductApplyRange::getOrgId)).sorted(Comparator.comparing(ProductApplyRange::getIsCreator).reversed()).collect(Collectors.toList());
        return ranges;
    }

    private void setCustomer(Product product) throws Exception {
        LoginUser user = AppContext.getCurrentUser();
        if (null == user) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        Long custId = user.getCustomer();
        QuerySchema schema = QuerySchema.create().addSelect("name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)custId)}));
        List mapCusts = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)schema);
        if (mapCusts == null || mapCusts.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800250);
        }
        product.setCreatorType(CreatorType.jiameng);
        product.setCust(custId);
        product.setPlatFormStaus(Short.valueOf((short)1));
    }

    private void setShop(Product product) {
        LoginUser user = AppContext.getCurrentUser();
        Long shopId = (Long)user.get("shop");
        product.setCreatorType(CreatorType.shangjia);
        product.setShop(shopId);
    }

    private void setFK4Creator(Product product, Long productApplyRangeId) throws CoreDocBusinessException {
        if (product.detail() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800251);
        }
        product.detail().setId(product.getId());
        product.detail().setProductApplyRangeId(productApplyRangeId);
        if (product.define() != null) {
            product.define().setProductId((Long)product.getId());
        }
        if (product.time() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800251);
        }
        product.time().setProductId((Long)product.getId());
        product.time().setProductApplyRangeId(productApplyRangeId);
        if (product.productParams() != null) {
            for (ProductParameterExtend param : product.productParams()) {
                param.setProductId((Long)product.getId());
                param.setProductApplyRangeId(productApplyRangeId);
            }
        }
        if (product.productSpecFrees() != null) {
            for (ProductCheckFreeExtend check : product.productSpecFrees()) {
                check.setProductId((Long)product.getId());
                check.setProductApplyRangeId(productApplyRangeId);
            }
        }
        if (product.defaultSKUOrderProperties() != null) {
            for (SKUOrderPropertyExtend prop : product.defaultSKUOrderProperties()) {
                prop.setProductId((Long)product.getId());
                prop.setProductApplyRangeId(productApplyRangeId);
                prop.setSkuId(Long.valueOf(0L));
            }
        }
        if (product.productTags() != null) {
            for (ProductTagExtend tag : product.productTags()) {
                if (null == tag.getTagId()) continue;
                tag.setProductId((Long)product.getId());
                tag.setProductApplyRangeId(productApplyRangeId);
            }
        }
    }

    private <T1 extends BizObject, T2 extends BizObject> void exchangeFromExtend(T1 sourceObj, T2 destObj) {
        for (Map.Entry entry : sourceObj.entrySet()) {
            destObj.put(entry.getKey().toString(), entry.getValue());
        }
    }

    private void setProductApplyRangeDetail(Product product, int rangeType, BillContext billContext) throws Exception {
        List productDetail;
        ProductExtend detail = product.detail();
        Long productApplyRangeId = 0L;
        Long productId = (Long)product.getId();
        Long productApplyRangeIdForQuery = detail.getProductApplyRangeId();
        boolean iStatus = false;
        boolean iUOrderStatus = false;
        boolean stopstatus = false;
        boolean hasData = false;
        if (productId != null && productApplyRangeIdForQuery != null && (productDetail = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id", "iUOrderStatus", "iStatus", "stopstatus", "isCreator"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"productApplyRangeId").eq((Object)productApplyRangeIdForQuery)})))) != null && productDetail.size() > 0) {
            if (((Map)productDetail.get(0)).get("iUOrderStatus") != null && BooleanUtil.isTrue(((Map)productDetail.get(0)).get("iUOrderStatus"))) {
                iUOrderStatus = true;
            }
            if (((Map)productDetail.get(0)).get("iStatus") != null && BooleanUtil.isTrue(((Map)productDetail.get(0)).get("iStatus"))) {
                iStatus = true;
            }
            if (((Map)productDetail.get(0)).get("stopstatus") != null && BooleanUtil.isTrue(((Map)productDetail.get(0)).get("stopstatus"))) {
                stopstatus = true;
            }
            product.set("isApplied", (Object)true);
        }
        ProductDataProcessRule.dealProductStatus(product, iStatus, iUOrderStatus, stopstatus);
        if (product.getEntityStatus() == EntityStatus.Insert) {
            detail.setRangeType(Integer.valueOf(rangeType));
            detail.setOrgId(product.getOrgId());
            detail.setIsCreator(Boolean.valueOf(true));
            detail.setIsApplied(Boolean.valueOf(true));
            product.put("eventNotify_status", (Object)EntityStatus.Insert);
            product.put("isCreator", (Object)true);
            if (rangeType == 1) {
                Optional<ProductApplyRange> optionalRange = product.productOrgs().stream().filter(ProductApplyRange::getIsCreator).findAny();
                if (!optionalRange.isPresent()) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CREATER_DATA_NOT_FOUND);
                }
                product.productOrgs().stream().map(ProductApplyRange::getOrgId).collect(Collectors.toList());
                for (ProductApplyRange org : product.productOrgs()) {
                    if (org.getIsCreator().booleanValue()) {
                        org.setIsApplied(Boolean.valueOf(true));
                        productApplyRangeId = (Long)org.getId();
                        continue;
                    }
                    org.setIsApplied(Boolean.valueOf(false));
                }
            } else if (rangeType == 2) {
                ProductApplyRange range = new ProductApplyRange();
                range.setId((Object)IdManager.getInstance().nextId());
                productApplyRangeId = (Long)range.getId();
                range.setRangeType(Integer.valueOf(2));
                range.setCustomerId(product.getCust());
                range.setShopId(product.getCust());
                range.setIsCreator(Boolean.valueOf(true));
                range.setIsApplied(Boolean.valueOf(true));
                ArrayList<Object> ranges = new ArrayList<Object>();
                ranges.add(range);
                product.setProductApplyRange(ranges);
                detail.setCustomerId(product.getCust());
                detail.setShopId(product.getCust());
            } else if (rangeType == 3) {
                for (ProductApplyRange range : product.productShops()) {
                    if (range.getIsCreator().booleanValue()) {
                        range.setIsApplied(Boolean.valueOf(true));
                        productApplyRangeId = (Long)range.getId();
                        Long shopId = range.getShopId();
                        detail.setCustomerId(shopId);
                        detail.setShopId(shopId);
                        continue;
                    }
                    range.setIsApplied(Boolean.valueOf(false));
                }
            }
            if (productApplyRangeId == 0L) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800252);
            }
            product.put("productApplyRangeId", (Object)productApplyRangeId);
            this.setFK4Creator(product, productApplyRangeId);
            if (product.productskus() != null) {
                for (ProductSKU sku : product.productskus()) {
                    if (detail.containsKey((Object)"stopstatus") && detail.getStopstatus() != null && detail.getStopstatus().equals(true) && sku.productSKUDetail() != null && sku.productSKUDetail().containsKey((Object)"stopstatus") && sku.productSKUDetail().getStopstatus() != null && sku.productSKUDetail().getStopstatus().equals(false)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808007, new Object[]{product.getCode()});
                    }
                    String specNames = "";
                    for (int i = 1; i <= 5; ++i) {
                        if (!sku.containsKey((Object)("freex" + i)) || !sku.containsKey((Object)("freeidx" + i + "_Name"))) continue;
                        specNames = specNames + sku.get("freeidx" + i + "_Name") + ":" + sku.get("freex" + i) + ";";
                    }
                    if (specNames.length() > 0) {
                        sku.setSpecNames(specNames.substring(0, specNames.length() - 1));
                    }
                    if (sku.productSKUDetail() == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800253);
                    }
                    if (StringUtils.isEmpty((CharSequence)sku.productSKUDetail().getShortName())) {
                        sku.productSKUDetail().setShortName(detail.getShortName());
                    }
                    sku.productSKUDetail().setProductApplyRangeId(productApplyRangeId);
                    sku.productSKUDetail().setProductId((Long)product.getId());
                    if (sku.skudefine() != null) {
                        sku.skudefine().setProductId((Long)product.getId());
                    }
                    if (sku.skuOrderProperties() == null) continue;
                    for (SKUOrderPropertyExtend property : sku.skuOrderProperties()) {
                        property.setProductId((Long)product.getId());
                        property.setProductApplyRangeId(productApplyRangeId);
                    }
                }
            }
            if ("productApply".equals(product.get("sourceMarker"))) {
                product.setSource(ProductSource.APPLY);
            }
        } else if (product.getEntityStatus() == EntityStatus.Update) {
            Object param;
            product.put("eventNotify_status", (Object)EntityStatus.Update);
            if (!product.containsKey((Object)"productApplyRangeId")) {
                if (product.containsKey((Object)"productApplyRange_OrgId") && null != product.get("productApplyRange_OrgId")) {
                    String rangeIdSQL = "select id from productapplyrange where productId = " + product.getId() + " and orgId='" + product.get("productApplyRange_OrgId") + "'";
                    HashMap<String, String> params = new HashMap<String, String>();
                    params.put("sql", rangeIdSQL);
                    Map rangeIdMap = (Map)SqlHelper.selectOne((String)"com.yonyou.ucf.mdd.ext.meta.dao.selectList", params);
                    if (null == rangeIdMap || null == rangeIdMap.get("id")) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800254);
                    }
                    product.put("productApplyRangeId", rangeIdMap.get("id"));
                } else {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800254);
                }
            }
            if ((productApplyRangeId = Long.valueOf(product.get("productApplyRangeId").toString())) == 0L || productApplyRangeId == 0L) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800255);
            }
            Boolean isCreator = BooleanUtil.isTrue((Object)product.get("isCreator"));
            Boolean isApplied = BooleanUtil.isTrue((Object)product.get("isApplied"));
            String productName = (String)MultilangUtil.getAttr((String)"pc.product.Product", (String)"name", (BizObject)product, (String)"zh_CN");
            if (detail.containsKey((Object)"stopstatus") && detail.getStopstatus() != null && !isCreator.booleanValue() && !this.upcProductQueryService.checkCanModifyProductStopStatusOfApplier(product.getId().toString(), detail.getStopstatus()).booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808008, new Object[]{productName});
            }
            detail.setProductApplyRangeId(productApplyRangeId);
            if (product.time() != null) {
                product.time().setProductId((Long)product.getId());
                product.time().setProductApplyRangeId(productApplyRangeId);
                if (product.time().getEntityStatus() == EntityStatus.Unchanged) {
                    product.time().setEntityStatus(EntityStatus.Update);
                }
            }
            if (product.productParams() != null) {
                for (ProductParameterExtend parameter : product.productParams()) {
                    parameter.setProductId((Long)product.getId());
                    parameter.setProductApplyRangeId(productApplyRangeId);
                    if (!parameter.containsKey((Object)"id") || parameter.get("id") == null) {
                        parameter.put("id", (Object)IdManager.getInstance().nextId());
                        parameter.setEntityStatus(EntityStatus.Insert);
                        continue;
                    }
                    if (parameter.getEntityStatus() != EntityStatus.Unchanged) continue;
                    parameter.setEntityStatus(EntityStatus.Update);
                }
            }
            if (product.productSpecFrees() != null) {
                Object checkYonyoufi = true;
                Boolean checkEngineer = true;
                ArrayList delList = new ArrayList();
                for (ProductCheckFreeExtend check : product.productSpecFrees()) {
                    ProductFieldCheckRule checkRule;
                    check.setProductId((Long)product.getId());
                    check.setProductApplyRangeId(productApplyRangeId);
                    if (!check.containsKey((Object)"id") || check.get("id") == null) {
                        if (check.getEntityStatus() == EntityStatus.Delete) {
                            delList.add(check);
                        } else {
                            check.put("id", (Object)IdManager.getInstance().nextId());
                            check.setEntityStatus(EntityStatus.Insert);
                        }
                    }
                    BillDataDto dto = new BillDataDto();
                    dto.setBillnum("pc_product");
                    dto.setData((Object)product);
                    JsonObject json = new JsonObject();
                    json.addProperty("key", "ProductCheckFree");
                    if (((Boolean)checkYonyoufi).booleanValue() && check.getFreeType() == 0 && check.getEntityStatus() == EntityStatus.Update) {
                        checkYonyoufi = false;
                        json.addProperty("freeType", (Number)0);
                        dto.setItem(json.toString());
                        param = new HashMap();
                        param.put("param", dto);
                        checkRule = (ProductFieldCheckRule)((Object)AppContext.getBean((String)"productFieldCheckRule"));
                        checkRule.execute(billContext, (Map<String, Object>)param);
                    }
                    if (!checkEngineer.booleanValue() || check.getFreeType() != 1 || check.getEntityStatus() != EntityStatus.Update) continue;
                    checkEngineer = false;
                    json.addProperty("freeType", (Number)1);
                    dto.setItem(json.toString());
                    param = new HashMap();
                    param.put("param", dto);
                    checkRule = (ProductFieldCheckRule)((Object)AppContext.getBean((String)"productFieldCheckRule"));
                    checkRule.execute(billContext, (Map<String, Object>)param);
                }
                product.productSpecFrees().removeAll(delList);
            }
            if (product.defaultSKUOrderProperties() != null) {
                for (SKUOrderPropertyExtend prop : product.defaultSKUOrderProperties()) {
                    prop.setProductId((Long)product.getId());
                    prop.setProductApplyRangeId(productApplyRangeId);
                    if (prop.getEntityStatus() == EntityStatus.Insert) {
                        prop.setSkuId(Long.valueOf(0L));
                    }
                    if (prop.getEntityStatus() != EntityStatus.Unchanged) continue;
                    prop.setEntityStatus(EntityStatus.Update);
                }
            }
            if (product.productTags() != null) {
                List productTagExtends = product.productTags();
                ArrayList delTags = new ArrayList();
                for (ProductTagExtend tag : productTagExtends) {
                    tag.setProductId((Long)product.getId());
                    tag.setProductApplyRangeId(productApplyRangeId);
                    if (null != isApplied && !Boolean.parseBoolean(((Object)isApplied).toString()) && EntityStatus.Delete == tag.getEntityStatus()) {
                        delTags.add(tag);
                        continue;
                    }
                    if (tag.containsKey((Object)"id") && tag.get("id") != null) continue;
                    tag.put("id", (Object)IdManager.getInstance().nextId());
                    tag.setEntityStatus(EntityStatus.Insert);
                }
                if (!CollectionUtils.isEmpty((Collection)delTags)) {
                    productTagExtends.removeAll(delTags);
                }
            }
            if (product.productskus() != null) {
                boolean isDeleteSKU = false;
                for (ProductSKU sku : product.productskus()) {
                    if (sku.getEntityStatus() == EntityStatus.Delete) {
                        sku.put("productApplyRangeId", product.get("productApplyRangeId"));
                        ArrayList<ProductSKU> list = new ArrayList<ProductSKU>();
                        list.add(sku);
                        BillDataDto dto = new BillDataDto();
                        dto.setBillnum("pc_product");
                        dto.setData(list);
                        dto.setAction("skudelete");
                        HashMap<String, Object> param2 = new HashMap<String, Object>();
                        param2.put("param", dto);
                        ProductSKUDelCheckRule checkRule = (ProductSKUDelCheckRule)((Object)AppContext.getBean((String)"productSKUDelCheckRule"));
                        checkRule.execute(billContext, param2);
                        isDeleteSKU = true;
                        continue;
                    }
                    if (sku.getEntityStatus() == EntityStatus.Insert) {
                        if (detail.containsKey((Object)"stopstatus") && detail.getStopstatus() != null && detail.getStopstatus().equals(true) && sku.productSKUDetail() != null && sku.productSKUDetail().containsKey((Object)"stopstatus") && sku.productSKUDetail().getStopstatus() != null && sku.productSKUDetail().getStopstatus().equals(false)) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808007, new Object[]{product.getCode()});
                        }
                        Object specNames = "";
                        for (int i = 1; i <= 5; ++i) {
                            if (!sku.containsKey((Object)("freex" + i)) || !sku.containsKey((Object)("freeidx" + i + "_Name"))) continue;
                            specNames = (String)specNames + sku.get("freeidx" + i + "_Name") + ":" + sku.get("freex" + i) + ";";
                        }
                        if (((String)specNames).length() > 0) {
                            sku.setSpecNames(((String)specNames).substring(0, ((String)specNames).length() - 1));
                        }
                        if (sku.productSKUDetail() != null) {
                            if (StringUtils.isEmpty((CharSequence)sku.productSKUDetail().getShortName())) {
                                sku.productSKUDetail().setShortName(detail.getShortName());
                            }
                            sku.productSKUDetail().setProductId((Long)product.getId());
                            sku.productSKUDetail().setSkuId((Long)sku.getId());
                            sku.productSKUDetail().setProductApplyRangeId(productApplyRangeId);
                            sku.productSKUDetail().setEntityStatus(EntityStatus.Insert);
                        }
                        if (sku.skudefine() != null) {
                            sku.skudefine().setProductId((Long)product.getId());
                            sku.skudefine().setSkuId((Long)sku.getId());
                            sku.skudefine().setEntityStatus(EntityStatus.Insert);
                        }
                        if (sku.skuOrderProperties() == null) continue;
                        for (Object property : sku.skuOrderProperties()) {
                            property.setProductId((Long)product.getId());
                            property.setSkuId((Long)sku.getId());
                            property.setProductApplyRangeId(productApplyRangeId);
                            property.setEntityStatus(EntityStatus.Insert);
                        }
                        continue;
                    }
                    if (sku.getEntityStatus() != EntityStatus.Update) continue;
                    if (detail.containsKey((Object)"stopstatus") && detail.getStopstatus() != null && detail.getStopstatus().equals(true) && sku.productSKUDetail() != null && sku.productSKUDetail().containsKey((Object)"stopstatus") && sku.productSKUDetail().getStopstatus() != null && sku.productSKUDetail().getStopstatus().equals(false)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808007, new Object[]{product.getCode()});
                    }
                    if (sku.productSKUDetail() != null) {
                        if ((!product.containsKey((Object)"bCheck_") || product.get("bCheck_").equals(true)) && StringUtils.isEmpty((CharSequence)sku.productSKUDetail().getShortName())) {
                            sku.productSKUDetail().setShortName(detail.getShortName());
                        }
                        sku.productSKUDetail().setProductApplyRangeId(productApplyRangeId);
                        sku.productSKUDetail().setProductId((Long)product.getId());
                        if (sku.productSKUDetail().getEntityStatus() == EntityStatus.Unchanged) {
                            sku.productSKUDetail().setEntityStatus(EntityStatus.Update);
                        }
                    }
                    if (sku.skudefine() != null) {
                        sku.skudefine().setProductId((Long)product.getId());
                        if (!sku.skudefine().containsKey((Object)"id") || sku.skudefine().get("id") == null) {
                            sku.skudefine().put("id", (Object)IdManager.getInstance().nextId());
                            sku.skudefine().setEntityStatus(EntityStatus.Insert);
                        } else if (sku.skudefine().getEntityStatus() == EntityStatus.Unchanged) {
                            sku.skudefine().setEntityStatus(EntityStatus.Update);
                        }
                    }
                    if (sku.skuOrderProperties() != null) {
                        for (SKUOrderPropertyExtend property : sku.skuOrderProperties()) {
                            property.setProductApplyRangeId(productApplyRangeId);
                            property.setProductId((Long)product.getId());
                            if (property.getEntityStatus() != EntityStatus.Unchanged) continue;
                            property.setEntityStatus(EntityStatus.Update);
                        }
                    }
                    sku.setEntityStatus(isCreator != false ? EntityStatus.Update : EntityStatus.Unchanged);
                }
                if (isDeleteSKU) {
                    product.put("isDeleteSKU", (Object)true);
                }
            }
            if (!isCreator.booleanValue()) {
                List rangeInDbs = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"orgId", (Object)productApplyRangeId);
                Map rangeInDb = (Map)rangeInDbs.get(0);
                ProductApplyRange range = new ProductApplyRange();
                range.setId((Object)productApplyRangeId);
                range.setIsApplied(Boolean.valueOf(true));
                range.setEntityStatus(EntityStatus.Update);
                ArrayList<ProductApplyRange> ranges = new ArrayList<ProductApplyRange>();
                ranges.add(range);
                product.setProductApplyRange(ranges);
                if (detail != null) {
                    ProductApplyRangeDetail rangeDetail = new ProductApplyRangeDetail();
                    this.exchangeFromExtend(detail, rangeDetail);
                    rangeDetail.setRangeType(Integer.valueOf(rangeType));
                    rangeDetail.setOrgId(rangeInDb.get("orgId").toString());
                    rangeDetail.setIsCreator(Boolean.valueOf(false));
                    rangeDetail.setIsApplied(Boolean.valueOf(true));
                    range.setProductAppliedDetail(rangeDetail);
                    product.setDetail(null);
                    range.productAppliedDetail().setId((Object)productApplyRangeId);
                    range.productAppliedDetail().setProductId((Long)product.getId());
                }
                if (product.time() != null) {
                    ProductDepositTime time = new ProductDepositTime();
                    this.exchangeFromExtend(product.time(), time);
                    range.setProductAppliedTime(time);
                    product.setTime(null);
                }
                if (product.productParams() != null) {
                    ArrayList<ProductParameter> list = new ArrayList<ProductParameter>();
                    for (ProductParameterExtend paramExtend : product.productParams()) {
                        param = new ProductParameter();
                        this.exchangeFromExtend(paramExtend, param);
                        list.add((ProductParameter)param);
                    }
                    range.setProductAppliedParams(list);
                    product.setProductParams(null);
                }
                if (product.productSpecFrees() != null) {
                    ArrayList<ProductCheckFree> list = new ArrayList<ProductCheckFree>();
                    for (ProductCheckFreeExtend checkExtend : product.productSpecFrees()) {
                        ProductCheckFree check = new ProductCheckFree();
                        this.exchangeFromExtend(checkExtend, check);
                        list.add(check);
                    }
                    range.setProductAppliedSpecFrees(list);
                    product.setProductSpecFrees(null);
                }
                if (product.defaultSKUOrderProperties() != null) {
                    ArrayList<SKUOrderProperty> list = new ArrayList<SKUOrderProperty>();
                    for (SKUOrderPropertyExtend propExtend : product.defaultSKUOrderProperties()) {
                        SKUOrderProperty prop = new SKUOrderProperty();
                        this.exchangeFromExtend(propExtend, prop);
                        list.add(prop);
                    }
                    range.setDefaultSKUAppliedOrderProperties(list);
                    product.setDefaultSKUOrderProperties(null);
                }
                if (product.productTags() != null) {
                    ArrayList<ProductTag> list = new ArrayList<ProductTag>();
                    for (ProductTagExtend tagExtend : product.productTags()) {
                        ProductTag tag = new ProductTag();
                        if (null == tagExtend.getTagId()) continue;
                        this.exchangeFromExtend(tagExtend, tag);
                        list.add(tag);
                    }
                    range.setProductAppliedTags(list);
                    product.setProductTags(null);
                }
                if (product.productskus() != null) {
                    for (ProductSKU sku : product.productskus()) {
                        if (sku.productSKUDetail() != null) {
                            ProductSKUDetail skuDetail = new ProductSKUDetail();
                            this.exchangeFromExtend(sku.productSKUDetail(), skuDetail);
                            sku.setProductSKUAppliedDetail(skuDetail);
                            sku.setProductSKUDetail(null);
                        }
                        if (sku.skuOrderProperties() == null) continue;
                        ArrayList<SKUOrderProperty> list = new ArrayList<SKUOrderProperty>();
                        for (SKUOrderPropertyExtend propExtend : sku.skuOrderProperties()) {
                            SKUOrderProperty prop = new SKUOrderProperty();
                            this.exchangeFromExtend(propExtend, prop);
                            list.add(prop);
                        }
                        sku.setSkuAppliedOrderProperties(list);
                        sku.setSkuOrderProperties(null);
                    }
                }
            }
            if (!product.containsKey((Object)"cPlatFormRemark")) {
                product.setEntityStatus(isCreator != false ? EntityStatus.Update : EntityStatus.Unchanged);
            }
            if ("productApply".equals(product.get("sourceMarker")) && ProductUtil.getIsUpdateProductGlobalFields()) {
                product.setEntityStatus(EntityStatus.Update);
            }
            if (product.description() != null && isCreator.booleanValue()) {
                if (!product.description().containsKey((Object)"id") || product.description().get("id") == null) {
                    product.description().put("id", (Object)IdManager.getInstance().nextId());
                    product.description().setEntityStatus(EntityStatus.Insert);
                } else if (product.description().getEntityStatus() == EntityStatus.Unchanged) {
                    product.description().setEntityStatus(EntityStatus.Update);
                }
            }
        }
    }

    private static void dealProductStatus(Product product, boolean iStatusDB, boolean iUOrderStatusDB, boolean stopstatusDB) {
        ProductExtend detail = product.detail();
        if (EntityStatus.Insert == product.getEntityStatus()) {
            if (detail.containsKey((Object)"iStatus") && detail.get("iStatus") != null) {
                if (detail.getIStatus().equals(true)) {
                    if (detail.getMallUpTime() == null) {
                        detail.setMallUpTime(new Date());
                    }
                    detail.setMallDownTime(null);
                } else if (detail.getIStatus().equals(false)) {
                    detail.setMallUpTime(null);
                    if (detail.getMallDownTime() == null) {
                        detail.setMallDownTime(new Date());
                    }
                }
            }
            if (detail.containsKey((Object)"iUOrderStatus") && detail.getIUOrderStatus() != null) {
                if (detail.getIUOrderStatus().equals(true)) {
                    if (detail.getUorderUpTime() == null) {
                        detail.setUorderUpTime(new Date());
                    }
                    detail.setUorderDownTime(null);
                } else if (detail.getIUOrderStatus().equals(false)) {
                    detail.setUorderUpTime(null);
                    if (detail.getUorderDownTime() == null) {
                        detail.setUorderDownTime(new Date());
                    }
                }
            }
            if (detail.containsKey((Object)"stopstatus") && detail.getStopstatus() != null) {
                if (detail.getStopstatus().equals(true) && !stopstatusDB) {
                    if (detail.getStoptime() == null) {
                        detail.setStoptime(new Date());
                    }
                    product.put("isStop", (Object)true);
                } else if (detail.getStopstatus().equals(false) && stopstatusDB) {
                    detail.setStoptime(null);
                    product.put("isStop", (Object)false);
                }
            }
        } else if (EntityStatus.Update == product.getEntityStatus()) {
            if (detail.containsKey((Object)"iStatus") && detail.get("iStatus") != null) {
                if (detail.getIStatus().equals(true) && !iStatusDB) {
                    detail.setMallUpTime(new Date());
                    detail.setMallDownTime(null);
                } else if (detail.getIStatus().equals(false) && iStatusDB) {
                    detail.setMallUpTime(null);
                    detail.setMallDownTime(new Date());
                }
            }
            if (detail.containsKey((Object)"iUOrderStatus") && detail.getIUOrderStatus() != null) {
                if (detail.getIUOrderStatus().equals(true) && !iUOrderStatusDB) {
                    detail.setUorderUpTime(new Date());
                    detail.setUorderDownTime(null);
                } else if (detail.getIUOrderStatus().equals(false) && iUOrderStatusDB) {
                    detail.setUorderUpTime(null);
                    detail.setUorderDownTime(new Date());
                }
            }
            if (detail.containsKey((Object)"stopstatus") && detail.getStopstatus() != null) {
                if (detail.getStopstatus().equals(true) && !stopstatusDB) {
                    detail.setStoptime(new Date());
                    product.put("isStop", (Object)true);
                } else if (detail.getStopstatus().equals(false) && stopstatusDB) {
                    detail.setStoptime(null);
                    product.put("isStop", (Object)false);
                }
            }
        }
    }

    private void setRedundancyData(Product product) throws Exception {
        if (!product.containsKey((Object)"bCheck_") || product.get("bCheck_").equals(true)) {
            this.setAssistUnit(product);
            this.setBusinessAttribute(product);
            this.setSaleChannel(product);
        }
        if (product.get("isCreator") == null || product.get("isCreator").equals(true)) {
            this.setSKUSpecItem(product);
        }
        for (Map.Entry entry : ExcelMappingUtil.PC_PRODUCT_BILLPREFABRICATE_MAP.entrySet()) {
            if (product.get((String)entry.getKey()) != null || product.get(((ForeignKeyQueryEntity)entry.getValue()).getInConditionColumn()) == null) continue;
            QuerySchema querySchema = QuerySchema.create().addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.get(((ForeignKeyQueryEntity)entry.getValue()).getInConditionColumn()))}));
            for (String column : ((ForeignKeyQueryEntity)entry.getValue()).getSelectColumns()) {
                querySchema.addSelect(column);
            }
            List resultList = MetaDaoHelper.query((String)((ForeignKeyQueryEntity)entry.getValue()).getFullName(), (QuerySchema)querySchema, (String)((ForeignKeyQueryEntity)entry.getValue()).getDomain());
            if (resultList.isEmpty()) continue;
            product.put((String)entry.getKey(), ((Map)resultList.get(0)).get(entry.getKey()));
        }
    }

    private void setBusinessAttribute(Product product) {
        if (product.detail().getBusinessAttribute() != null && product.detail().getBusinessAttribute().length() > 0) {
            if (product.detail().getBusinessAttribute().contains("1")) {
                product.detail().setBusinessAttributePurchase(Integer.valueOf(1));
            } else {
                product.detail().setBusinessAttributePurchase(Integer.valueOf(0));
            }
            if (product.detail().getBusinessAttribute().contains("7")) {
                product.detail().setBusinessAttributeSale(Integer.valueOf(1));
            } else {
                product.detail().setBusinessAttributeSale(Integer.valueOf(0));
                product.detail().setSaleChannel(null);
            }
            if (product.detail().getBusinessAttribute().contains("3")) {
                product.detail().setBusinessAttributeSelfCreate(Integer.valueOf(1));
            } else {
                product.detail().setBusinessAttributeSelfCreate(Integer.valueOf(0));
            }
            if (product.detail().getBusinessAttribute().contains("2")) {
                product.detail().setBusinessAttributeOutSourcing(Integer.valueOf(1));
            } else {
                product.detail().setBusinessAttributeOutSourcing(Integer.valueOf(0));
            }
        }
    }

    private void setSaleChannel(Product product) throws Exception {
        if (product.detail().containsKey((Object)"saleChannel")) {
            if (StringUtils.isBlank((CharSequence)product.detail().getSaleChannel())) {
                product.detail().setSaleChannelOfOnlineBatch(Boolean.valueOf(false));
                product.detail().setSaleChannelOfOnlineRetail(Boolean.valueOf(false));
                product.detail().setSaleChannelOfOfflineRetail(Boolean.valueOf(false));
                product.detail().setSaleChannelOfDistribution(Boolean.valueOf(false));
            } else {
                if (product.detail().getSaleChannel().contains("1")) {
                    product.detail().setSaleChannelOfOnlineBatch(Boolean.valueOf(true));
                } else {
                    product.detail().setSaleChannelOfOnlineBatch(Boolean.valueOf(false));
                }
                if (product.detail().getSaleChannel().contains("2")) {
                    product.detail().setSaleChannelOfOnlineRetail(Boolean.valueOf(true));
                } else {
                    product.detail().setSaleChannelOfOnlineRetail(Boolean.valueOf(false));
                }
                if (product.detail().getSaleChannel().contains("3")) {
                    product.detail().setSaleChannelOfOfflineRetail(Boolean.valueOf(true));
                } else {
                    product.detail().setSaleChannelOfOfflineRetail(Boolean.valueOf(false));
                }
                if (product.detail().getSaleChannel().contains("4")) {
                    product.detail().setSaleChannelOfDistribution(Boolean.valueOf(true));
                } else {
                    product.detail().setSaleChannelOfDistribution(Boolean.valueOf(false));
                }
            }
        } else if (!product.getEntityStatus().equals((Object)EntityStatus.Update)) {
            product.detail().setSaleChannelOfOnlineBatch(Boolean.valueOf(false));
            product.detail().setSaleChannelOfOnlineRetail(Boolean.valueOf(false));
            product.detail().setSaleChannelOfOfflineRetail(Boolean.valueOf(false));
            product.detail().setSaleChannelOfDistribution(Boolean.valueOf(false));
        } else {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("saleChannelOfOnlineBatch,saleChannelOfOnlineRetail,saleChannelOfOfflineRetail,saleChannelOfDistribution").addCondition((ConditionExpression)queryConditionGroup);
            List productDetail = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)schema);
            if (productDetail != null && productDetail.size() > 0) {
                if (((Map)productDetail.get(0)).get("saleChannelOfOnlineBatch") != null) {
                    product.detail().setSaleChannelOfOnlineBatch(Boolean.valueOf(Boolean.parseBoolean(((Map)productDetail.get(0)).get("saleChannelOfOnlineBatch").toString())));
                }
                if (((Map)productDetail.get(0)).get("saleChannelOfOnlineRetail") != null) {
                    product.detail().setSaleChannelOfOnlineRetail(Boolean.valueOf(Boolean.parseBoolean(((Map)productDetail.get(0)).get("saleChannelOfOnlineRetail").toString())));
                }
                if (((Map)productDetail.get(0)).get("saleChannelOfOfflineRetail") != null) {
                    product.detail().setSaleChannelOfOfflineRetail(Boolean.valueOf(Boolean.parseBoolean(((Map)productDetail.get(0)).get("saleChannelOfOfflineRetail").toString())));
                }
                if (((Map)productDetail.get(0)).get("saleChannelOfDistribution") != null) {
                    product.detail().setSaleChannelOfDistribution(Boolean.valueOf(Boolean.parseBoolean(((Map)productDetail.get(0)).get("saleChannelOfDistribution").toString())));
                }
            }
        }
    }

    private void setSKUSpecItem(Product product) throws Exception {
        if (product.productskus() != null && product.productskus().size() > 0 && product.productspecitems() != null) {
            this.processSpecsToCharacter(product);
        }
    }

    private void processSpecsToCharacter(Product product) throws Exception {
        Long productTemplate;
        if (CollectionUtils.isEmpty((Collection)product.productskus())) {
            return;
        }
        if (EntityStatus.Insert.equals((Object)product.getEntityStatus())) {
            productTemplate = (Long)product.get("productTemplate");
        } else {
            List products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id", "productTemplate"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.get("id"))})));
            productTemplate = (Long)((Map)products.get(0)).get("productTemplate");
            product.setProductTemplate(productTemplate);
        }
        if (productTemplate == null) {
            return;
        }
        List productTpl = MetaDaoHelper.queryObject((String)"pc.tpl.ProductTpl", (QuerySchema)QuerySchema.create().addSelect("id").addCompositionSchema(QuerySchema.create().name("freeCharacters").fullname("pc.tpl.ProductTplCharacter").addSelect("id, template, characteristicsType, characteristics, characteristics.name,characteristics.code, character, characterCode, character.name, twoDimensionalInput, iOrder, skuSens, batchSens, SNSens, stockSens, costAffec, BOMAffec, manuAffec,priceAffec,dataType,webShow, dataType")).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productTemplate)})), null);
        if (CollectionUtils.isEmpty((Collection)productTpl) || CollectionUtils.isEmpty((Collection)((ProductTpl)productTpl.get(0)).freeCharacters())) {
            return;
        }
        this.changeSpecsToCharacter(((ProductTpl)productTpl.get(0)).freeCharacters(), product);
    }

    private void changeSpecsToCharacter(List<ProductTplCharacter> productTplCharacters, Product product) throws Exception {
        List productSkus = product.productskus();
        if (CollectionUtils.isEmpty((Collection)productSkus)) {
            return;
        }
        Map<String, ProductTplCharacter> characterMap = productTplCharacters.stream().filter(character -> character.getSkuSens().equals(1)).collect(Collectors.toMap(key -> (String)key.get("character_name"), val -> val, (a, b) -> a));
        HashMap<String, Map<String, String>> characterValueMap = new HashMap<String, Map<String, String>>();
        for (Map.Entry<String, ProductTplCharacter> next : characterMap.entrySet()) {
            CharacterDTO characterDTO = this.achiveDataQueryService.getCharacterByIdAndValueIds(next.getValue().getCharacter(), null, false);
            if (characterDTO == null || CollectionUtils.isEmpty((Collection)characterDTO.getCharactorDocValueDTOList())) continue;
            List charactorDocValueDTOList = characterDTO.getCharactorDocValueDTOList();
            Map<String, String> valueMap = charactorDocValueDTOList.stream().collect(Collectors.toMap(key -> key.getName(), val -> val.getId(), (a, b) -> a));
            characterValueMap.put(next.getKey(), valueMap);
        }
        HashMap<String, ProductSKU> skuDistinct = new HashMap<String, ProductSKU>();
        Iterator productSKUIterator = productSkus.iterator();
        while (productSKUIterator.hasNext()) {
            String[] specs;
            ProductSKU sku = (ProductSKU)productSKUIterator.next();
            String specsString = sku.getSpecs();
            if (skuDistinct.containsKey(specsString)) {
                productSKUIterator.remove();
                continue;
            }
            skuDistinct.put(specsString, sku);
            BizObject charactersData = new BizObject();
            if (sku.getEntityStatus() != EntityStatus.Insert) continue;
            for (String spec : specs = sku.getSpecs().split(";")) {
                String[] specName = spec.split(":");
                if (!characterMap.containsKey(specName[0])) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800257, new Object[]{specName[0]});
                }
                if (!((Map)characterValueMap.get(specName[0])).containsKey(specName[1])) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800258, new Object[]{specName[1], specName[0]});
                }
                charactersData.put(characterMap.get(specName[0]).getCharacterCode(), ((Map)characterValueMap.get(specName[0])).get(specName[1]));
            }
            sku.setSource(ProductSource.OpenAPI);
            charactersData.put("id", (Object)(IdManager.getInstance().nextId() + ""));
            sku.set("skuFreeCharacter", (Object)charactersData);
            this.productSkuImportService.dealCharacters(sku, (Long)product.get("productTemplate"), product);
        }
    }

    private void setAssistUnit(Product product) throws Exception {
        if (product.getEntityStatus() == EntityStatus.Insert) {
            ProductExtend detail = product.detail();
            List productAssistUnitExchanges = product.productAssistUnitExchanges();
            if (!CollectionUtils.isEmpty((Collection)productAssistUnitExchanges) && productAssistUnitExchanges.size() == 1) {
                ProductAssistUnitExchange assistUnitExchange = (ProductAssistUnitExchange)productAssistUnitExchanges.get(0);
                UnitExchangeType unitExchangeType = assistUnitExchange.getUnitExchangeType();
                Long assistUnit = assistUnitExchange.getAssistUnit();
                if (UnitExchangeType.floating.equals((Object)unitExchangeType)) {
                    detail.put(AssistUnitType.purchaseUnit.toString(), detail.get(AssistUnitType.purchaseUnit.toString()) != null ? detail.get(AssistUnitType.purchaseUnit.toString()) : assistUnit);
                    detail.put(AssistUnitType.stockUnit.toString(), detail.get(AssistUnitType.stockUnit.toString()) != null ? detail.get(AssistUnitType.stockUnit.toString()) : assistUnit);
                    detail.put(AssistUnitType.batchUnit.toString(), detail.get(AssistUnitType.batchUnit.toString()) != null ? detail.get(AssistUnitType.batchUnit.toString()) : assistUnit);
                    detail.put(AssistUnitType.onlineUnit.toString(), detail.get(AssistUnitType.onlineUnit.toString()) != null ? detail.get(AssistUnitType.onlineUnit.toString()) : product.getUnit());
                    detail.put(AssistUnitType.requireUnit.toString(), detail.get(AssistUnitType.requireUnit.toString()) != null ? detail.get(AssistUnitType.requireUnit.toString()) : assistUnit);
                    detail.put(AssistUnitType.produceUnit.toString(), detail.get(AssistUnitType.produceUnit.toString()) != null ? detail.get(AssistUnitType.produceUnit.toString()) : assistUnit);
                    detail.put(AssistUnitType.inspectionUnit.toString(), detail.get(AssistUnitType.inspectionUnit.toString()) != null ? detail.get(AssistUnitType.inspectionUnit.toString()) : assistUnit);
                    detail.put(AssistUnitType.demandPlanningUnit.toString(), detail.get(AssistUnitType.demandPlanningUnit.toString()) != null ? detail.get(AssistUnitType.demandPlanningUnit.toString()) : assistUnit);
                }
            }
            for (AssistUnitType type : AssistUnitType.values()) {
                if (detail.containsKey((Object)type.toString()) && detail.get(type.toString()) != null) continue;
                product.detail().put(type.toString(), (Object)product.getUnit());
            }
        }
    }

    private void putSKUAutoCode(ProductSKU sku) throws Exception {
        if (sku.containsKey((Object)"specs") && StringUtils.isNotEmpty((CharSequence)((CharSequence)sku.get("specs")))) {
            String[] specsArray;
            String skuAutoCode = new String();
            String specs = (String)sku.get("specs");
            for (String spec : specsArray = StringUtils.split((String)specs, (String)";")) {
                String[] spceKeyValue;
                if (!StringUtils.isNotEmpty((CharSequence)spec) || (spceKeyValue = StringUtils.split((String)spec, (String)":")) == null || spceKeyValue.length < 2) continue;
                skuAutoCode = skuAutoCode + spceKeyValue[1];
            }
            sku.put("skuAutoCode", (Object)skuAutoCode);
            String specIds = (String)sku.get("specIds");
            if (StringUtils.isNotEmpty((CharSequence)specIds)) {
                List basedocList;
                String specCode = new String();
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080705", (String)"\u83b7\u53d6sku\u89c4\u683c\u5bf9\u5e94code\u503c"));
                List<String> specIdList = Arrays.asList(specIds.split(";"));
                List specIdsList = MetaDaoHelper.query((String)"pc.userdef.Userdefine", (QuerySchema)QuerySchema.create().addSelect("code").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(specIdList)})));
                if (specIdsList.size() < specIdList.size() && !(basedocList = MetaDaoHelper.query((String)"bd.basedocdef.CustomerDocVO", (QuerySchema)QuerySchema.create().addSelect("code").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(specIdList)})), (String)"ucfbasedoc")).isEmpty()) {
                    specIdsList.addAll(basedocList);
                }
                HashMap<String, String> filters = new HashMap<String, String>();
                String split = "";
                filters.put("type", "specCodeSplit");
                filters.put("ytenant", (String)AppContext.getYTenantId());
                String specCodeSplit = (String)SqlHelper.selectOne((String)"com.yonyoucloud.upc.mapper.filter.specCodeSplit", filters);
                if (!StringUtils.isEmpty((CharSequence)specCodeSplit)) {
                    split = specCodeSplit;
                }
                if (null != specIdsList && specIdsList.size() > 0) {
                    for (Map specId : specIdsList) {
                        if (StringUtils.isEmpty((CharSequence)specCode)) {
                            specCode = specCode + specId.get("code");
                            continue;
                        }
                        specCode = specCode + split + specId.get("code");
                    }
                }
                sku.put("specCode", (Object)specCode);
            }
        }
    }

    public void processAssistUnitExchanges(Product product) {
        List productAssistUnitExchanges = product.productAssistUnitExchanges();
        if (productAssistUnitExchanges != null) {
            Object conversionAccuracy = OptionUtils.getSysOptionByName((String)"conversionAccuracy");
            int paramScle = conversionAccuracy == null ? 0 : (Integer)conversionAccuracy;
            int scale = paramScle > 2 ? paramScle : 2;
            Boolean openMultiFloat = this.pubOptionService.isOpenMultiFloat();
            Boolean existBalance = false;
            for (ProductAssistUnitExchange assistUnit : productAssistUnitExchanges) {
                if (null == assistUnit.getEntityStatus() || EntityStatus.Delete == assistUnit.getEntityStatus()) continue;
                if (null != assistUnit.getBalance() && BooleanUtil.isTrue((Object)assistUnit.getBalance())) {
                    existBalance = true;
                }
                if (assistUnit.getMainUnitCountNew() == null && assistUnit.getMainUnitCount() != null) {
                    assistUnit.setMainUnitCountNew(assistUnit.getMainUnitCount());
                }
                String mainUnitCount = assistUnit.getMainUnitCountNew() != null ? assistUnit.getMainUnitCountNew().toString() : assistUnit.getMainUnitCount().toString();
                String assistUnitCount = assistUnit.getAssistUnitCount().toString();
                BigDecimal mUnitCount = new BigDecimal(mainUnitCount, MathContext.DECIMAL64);
                BigDecimal aUnitCount = new BigDecimal(assistUnitCount, MathContext.DECIMAL64);
                if (aUnitCount.compareTo(BigDecimal.ZERO) <= 0 || mUnitCount.compareTo(BigDecimal.ZERO) <= 0) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MAINUNITCOUNT_ASSISTUNITCOUNT_NOT_BE_ZERO);
                }
                mainUnitCount = mUnitCount.stripTrailingZeros().toPlainString();
                assistUnitCount = aUnitCount.stripTrailingZeros().toPlainString();
                BigDecimal mainUnitRate = mUnitCount.divide(aUnitCount, scale, 4);
                if (mainUnitRate.compareTo(BigDecimal.ZERO) <= 0) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800259);
                }
                String assistVersValue = mainUnitCount + "/" + assistUnitCount;
                assistUnit.setMainUnitCount(mainUnitRate);
                assistUnit.setMainUnitRate(mainUnitRate);
                assistUnit.setAssistVersValue(assistVersValue);
            }
            if (openMultiFloat.booleanValue() && existBalance.booleanValue() && "2".equals(product.getRealProductAttribute().toString())) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_REALPRODUCTATTRIBUTE_CAN_NOT_SET_VIRTUAL, new Object[]{product.getCode()});
            }
            if (!openMultiFloat.booleanValue() && existBalance.booleanValue()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_BALANCE_CAN_NOT_SET_TRUE, new Object[]{product.getCode()});
            }
        }
    }
}

