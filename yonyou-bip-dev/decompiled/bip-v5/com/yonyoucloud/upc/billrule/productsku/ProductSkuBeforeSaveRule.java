/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.yonbip.iuap.xport.common.ImportDataSaveStrategy
 *  com.yonyoucloud.upc.common.enums.DomainOpenEnum
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange
 *  com.yonyoucloud.upc.pc.product.ProductDetail
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.product.ProductSkuDetailNew
 *  com.yonyoucloud.upc.pc.product.ProductSkuOrderProperty
 *  com.yonyoucloud.upc.pc.product.ProductSource
 *  com.yonyoucloud.upc.pc.product.UnitUseTypeEnum
 *  com.yonyoucloud.upc.pc.tpl.ProductTpl
 *  com.yonyoucloud.upc.pc.tpl.ProductTplAssistUnitExchange
 *  com.yonyoucloud.upc.pc.tpl.ProductTplUnit
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 */
package com.yonyoucloud.upc.billrule.productsku;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.yonbip.iuap.xport.common.ImportDataSaveStrategy;
import com.yonyoucloud.upc.billrule.goodsAchive.ProductSKUShelveRule;
import com.yonyoucloud.upc.common.enums.DomainOpenEnum;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange;
import com.yonyoucloud.upc.pc.product.ProductDetail;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.product.ProductSkuDetailNew;
import com.yonyoucloud.upc.pc.product.ProductSkuOrderProperty;
import com.yonyoucloud.upc.pc.product.ProductSource;
import com.yonyoucloud.upc.pc.product.UnitUseTypeEnum;
import com.yonyoucloud.upc.pc.tpl.ProductTpl;
import com.yonyoucloud.upc.pc.tpl.ProductTplAssistUnitExchange;
import com.yonyoucloud.upc.pc.tpl.ProductTplUnit;
import com.yonyoucloud.upc.service.ProductBusCheckService;
import com.yonyoucloud.upc.service.ProductSkuAsyncSaveService;
import com.yonyoucloud.upc.service.ProductSkuDetailSaveService;
import com.yonyoucloud.upc.service.ProductSkuImportService;
import com.yonyoucloud.upc.service.ProductSkuRealmService;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.UseSkuService;
import com.yonyoucloud.upc.service.utils.CoredocDataSourceUtils;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

@Component(value="productSkuBeforeSaveRule")
public class ProductSkuBeforeSaveRule
extends AbstractCommonRule {
    @Autowired
    ProductSkuDetailSaveService productSkuDetailSaveService;
    @Autowired
    ProductSkuAsyncSaveService productSkuAsyncSaveService;
    @Autowired
    ProductBusCheckService productBusCheckService;
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    ProductSkuRealmService productSkuRealmService;
    @Autowired
    ProductSkuImportService productSkuImportService;
    @Autowired
    UseSkuService useSkuService;
    @Autowired
    ProductSKUShelveRule productSKUShelveRule;
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        ProductSKU sku = (ProductSKU)bills.get(0);
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        ImportDataSaveStrategy saveStrategy = ImportDataSaveStrategy.getImportDataSaveStrategy((Integer)billDataDto.getImportMode(), (Boolean)billDataDto.getImportBillDataDto().isSupportUpsert());
        if (CoredocDataSourceUtils.isFromApi((Map)sku).booleanValue()) {
            this.dealdataFromApiOrImport(sku, saveStrategy);
        } else {
            this.dealDataFromHtml(sku);
        }
        return null;
    }

    private void dealdataFromApiOrImport(ProductSKU sku, ImportDataSaveStrategy saveStrategy) throws Exception {
        if (CoredocDataSourceUtils.isFromExcelImport((Map)sku).booleanValue()) {
            sku.setSource(ProductSource.ExcelImport);
        }
        if (sku.get("productId_code") == null && sku.get("productId") == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_PRODUCT_ID_AND_CODE_CANNOT_BE_NULL);
        }
        List<Product> products = this.getProducts(sku);
        LoginUser currentUser = AppContext.getCurrentUser();
        if (CollectionUtils.isEmpty(products) || products.get(0) == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_FOUND);
        }
        if (products.get(0).getUseSku() == 0) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_IS_NOT_ALLOW_ADD, new Object[]{products.get(0).getCode()});
        }
        if ((currentUser.getUserType().equals((Object)UserType.ShopAdminUser) || currentUser.getUserType().equals((Object)UserType.ShopUser)) && !currentUser.getOrgId().equals(products.get(0).getOrgId())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_ALLOW_ADD_BY_CURRENT_ORG);
        }
        if (0 == products.get(0).getUseSku()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800826);
        }
        Product product = products.get(0);
        sku.setProductId((Long)product.getId());
        boolean isUpdateTpl = this.dealProductTemplate(sku, product);
        List<ProductApplyRange> ranges = this.getProductApplyRanges((Long)product.getId());
        Long productDetailId = CollectionUtils.isEmpty(ranges) || ranges.get(0) == null ? null : ranges.get(0).getProductDetailId();
        Long rangeId = CollectionUtils.isEmpty(ranges) || ranges.get(0) == null ? null : (Long)ranges.get(0).getId();
        ProductDetail detail = this.getProductDetail(productDetailId);
        sku.set("orgId", (Object)detail.getOrgId());
        this.productSkuImportService.dealCharacters(sku, product.getProductTemplate(), product, saveStrategy);
        this.checkBusinessForApi(sku, product);
        this.productSkuAsyncSaveService.setSkuDetailForApi(sku, (Long)product.getId(), rangeId, detail);
        this.updateProductDefaultSku(product, isUpdateTpl);
        this.checkBusiness(sku, detail.getId(), product.getId());
    }

    private ProductDetail getProductDetail(Long productDetailId) throws Exception {
        if (productDetailId != null) {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productDetailId)});
            QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryConditionGroup);
            List details = this.productSkuService.query("pc.product.ProductDetail", schema);
            if (!CollectionUtils.isEmpty((Collection)details)) {
                return (ProductDetail)details.get(0);
            }
        }
        return new ProductDetail();
    }

    private List<ProductApplyRange> getProductApplyRanges(Long productId) throws Exception {
        List<Object> productApplyRanges = new ArrayList<ProductApplyRange>();
        if (productId != null) {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isCreator").eq((Object)true)});
            QuerySchema schema = QuerySchema.create().addSelect("id, isCreator, orgId, productDetailId ").addCondition((ConditionExpression)queryConditionGroup);
            productApplyRanges = this.productSkuService.query("pc.product.ProductApplyRange", schema);
        }
        return productApplyRanges;
    }

    private boolean dealProductTemplate(ProductSKU sku, Product product) throws Exception {
        Long productTemplate = product.getProductTemplate();
        Long tplId = null;
        String templateName = MultilangUtil.getLocalValue((Object)sku.get("productId_productTemplate_name"));
        if (null != templateName) {
            QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)templateName)});
            QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)conditionGroup);
            List tpls = this.productSkuService.query("pc.tpl.ProductTpl", querySchema);
            if (CollectionUtils.isEmpty((Collection)tpls)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_TEMPLATE_NOT_EXIST);
            }
            tplId = (Long)((ProductTpl)tpls.get(0)).getId();
        }
        boolean isUpdateTpl = false;
        if (null == product.getProductTemplate()) {
            productTemplate = tplId;
        } else if (null != tplId && !productTemplate.equals(tplId)) {
            this.productSkuService.checkFieldBySku(product.getId(), "productTemplate_Name");
            productTemplate = tplId;
            isUpdateTpl = true;
        }
        if (null == productTemplate) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_TEMPLATE_NOT_EXIST);
        }
        product.setProductTemplate(productTemplate);
        return isUpdateTpl;
    }

    private List<Product> getProducts(ProductSKU sku) throws Exception {
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (null != sku.get("productId_code")) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq(sku.get("productId_code")));
        } else if (null != sku.get("productId")) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq(sku.get("productId")));
        }
        QuerySchema schema = QuerySchema.create().addSelect("id, productTemplate, name, code, useSku,productTemplate.involveSKUNaming as involveSKUNaming, modelDescription, enableAssistUnit, unitUseType, unit, volumeUnit, volumeUnit.precision as volumeUnit_precision, weightUnit, weightUnit.precision as weightUnit_precision, hasSpecs, orgId").addCondition((ConditionExpression)queryConditionGroup);
        List products = this.productSkuService.query("pc.product.Product", schema);
        return products;
    }

    private void updateProductDefaultSku(Product product, Boolean isUpdateTpl) throws Exception {
        final Product productSave = new Product();
        productSave.setId(product.getId());
        productSave.setProductTemplate(product.getProductTemplate());
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"isSKU").eq((Object)0)});
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
        List defaultSkuInDb = this.productSkuService.query("pc.product.ProductSKU", schema);
        if (!CollectionUtils.isEmpty((Collection)defaultSkuInDb)) {
            this.productSkuService.deleteSkuById(((ProductSKU)defaultSkuInDb.get(0)).getId(), product.getId());
            productSave.setDefaultSKUId(null);
            productSave.setHasSpecs(Boolean.valueOf(true));
            isUpdateTpl = true;
        }
        if (null == product.get("hasSpecs") || !product.getHasSpecs().booleanValue()) {
            isUpdateTpl = true;
            productSave.setHasSpecs(Boolean.valueOf(true));
            productSave.setDefaultSKUId(null);
        }
        if (isUpdateTpl.booleanValue()) {
            productSave.setEntityStatus(EntityStatus.Update);
            TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

                public void afterCompletion(int status) {
                    try {
                        MetaDaoHelper.update((String)"pc.product.Product", (BizObject)productSave);
                    }
                    catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
    }

    private void checkBusinessForApi(ProductSKU sku, Product product) throws Exception {
        this.dealBatchUnit(sku, product);
        this.checkWeigheVolume(sku, product);
        List skuDetailNewList = sku.productSkuDetailNew();
        if (!CollectionUtils.isEmpty((Collection)skuDetailNewList)) {
            ProductSkuDetailNew skuDetailNew = (ProductSkuDetailNew)skuDetailNewList.get(0);
            if (EntityStatus.Insert == sku.getEntityStatus()) {
                if (null == skuDetailNew.getStopstatus()) {
                    skuDetailNew.setStopstatus(Boolean.valueOf(true));
                }
                if (null == skuDetailNew.getUstatus()) {
                    skuDetailNew.setUstatus(Boolean.valueOf(false));
                }
                if (null == skuDetailNew.getStatus()) {
                    skuDetailNew.setStatus(Boolean.valueOf(false));
                }
            } else {
                if (null == skuDetailNew.getStopstatus()) {
                    skuDetailNew.remove("stopstatus");
                }
                if (null == skuDetailNew.getUstatus()) {
                    skuDetailNew.remove("ustatus");
                }
                if (null == skuDetailNew.getStatus()) {
                    skuDetailNew.remove("status");
                }
            }
            this.dealBatchPriceUnit(skuDetailNew, product);
        }
    }

    private void checkWeigheVolume(ProductSKU sku, Product product) {
        int precision;
        int scale;
        BigDecimal decimal;
        if (sku == null || product == null) {
            return;
        }
        if (null != sku.getWeight()) {
            if (null == product.getWeightUnit()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_ALLOW_SET_WEIGHT_BY_NOT_OPEN_WEIGHT_UNIT);
            }
            decimal = new BigDecimal(sku.getWeight().toString()).stripTrailingZeros();
            scale = decimal.scale();
            if (null != product.get("weightUnit_precision") && scale > (precision = Integer.parseInt(product.get("weightUnit_precision").toString()))) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_WEIGHT_SCALE_NOT_LESS_THAN_WEIGHT_UNIT_SCALE);
            }
        }
        if (null != sku.getVolume()) {
            if (null == product.getVolumeUnit()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_ALLOW_SET_VOLUME_BY_NOT_OPEN_VOLUME_UNIT);
            }
            decimal = new BigDecimal(sku.getVolume().toString()).stripTrailingZeros();
            scale = decimal.scale();
            if (null != product.get("volumeUnit_precision") && scale > (precision = Integer.parseInt(product.get("volumeUnit_precision").toString()))) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_VOLUME_SCALE_NOT_LESS_THAN_VOLUME_UNIT_SCALE);
            }
        }
    }

    private void dealBatchUnit(ProductSKU sku, Product product) throws Exception {
        if (null != sku.getBatchUnit()) {
            if (UnitUseTypeEnum.USE_PRODUCT.getValue() == product.getUnitUseType().shortValue()) {
                if (!product.getEnableAssistUnit().booleanValue()) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_ALLOW_SET_PACKAGE_UNIT_BY_NOT_OPEN_SUB_UNIT);
                }
                if (sku.getBatchUnit().toString().equals(product.getUnit().toString())) {
                    sku.setBatchRate(new BigDecimal(1));
                } else {
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"assistUnit").eq((Object)sku.getBatchUnit())});
                    QuerySchema schema = QuerySchema.create().addSelect("assistUnit, mainUnitCount").addCondition((ConditionExpression)queryConditionGroup);
                    List productAssistUnitExchanges = this.productSkuService.query("pc.product.ProductAssistUnitExchange", schema);
                    if (CollectionUtils.isEmpty((Collection)productAssistUnitExchanges)) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PACKAGE_UNIT_NOT_EXIST_IN_SUB_UNIT);
                    }
                    sku.setBatchRate(((ProductAssistUnitExchange)productAssistUnitExchanges.get(0)).getMainUnitCount());
                }
            } else {
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq((Object)product.getProductTemplate())});
                QuerySchema schema = QuerySchema.create().addSelect("enableAssistUnit").addCondition((ConditionExpression)queryConditionGroup);
                List productTplUnits = this.productSkuService.query("pc.tpl.ProductTplUnit", schema);
                if (CollectionUtils.isEmpty((Collection)productTplUnits) || !((ProductTplUnit)productTplUnits.get(0)).getEnableAssistUnit().booleanValue()) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_ALLOW_SET_PACKAGE_UNIT_BY_NOT_OPEN_SUB_UNIT);
                }
                if (sku.getBatchUnit().toString().equals(product.getUnit().toString())) {
                    sku.setBatchRate(new BigDecimal(1));
                } else {
                    queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq((Object)product.getProductTemplate()), QueryCondition.name((String)"assistUnit").eq((Object)sku.getBatchUnit())});
                    schema = QuerySchema.create().addSelect("assistUnit, mainUnitCount").addCondition((ConditionExpression)queryConditionGroup);
                    List productTplAssistUnitExchanges = this.productSkuService.query("pc.tpl.ProductTplAssistUnitExchange", schema);
                    if (CollectionUtils.isEmpty((Collection)productTplAssistUnitExchanges)) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PACKAGE_UNIT_NOT_EXIST_IN_SUB_UNIT);
                    }
                    sku.setBatchRate(((ProductTplAssistUnitExchange)productTplAssistUnitExchanges.get(0)).getMainUnitCount());
                }
            }
        } else if (sku.containsKey((Object)"batchUnit")) {
            sku.setBatchRate(null);
        }
    }

    public void dealBatchPriceUnit(ProductSkuDetailNew skuDetailNew, Product product) throws Exception {
        if (skuDetailNew.getBatchPriceUnit() != null) {
            if (UnitUseTypeEnum.USE_PRODUCT.getValue() == product.getUnitUseType().shortValue()) {
                if (!product.getEnableAssistUnit().booleanValue()) {
                    if (!skuDetailNew.getBatchPriceUnit().toString().equals(product.getUnit().toString())) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_ONLY_USE_MAIN_UNIT_BY_NOT_OPEN_SUB_UNIT);
                    }
                    skuDetailNew.setBatchPriceUnitRate(new BigDecimal(1));
                } else if (skuDetailNew.getBatchPriceUnit().toString().equals(product.getUnit().toString())) {
                    skuDetailNew.setBatchPriceUnitRate(new BigDecimal(1));
                } else {
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"assistUnit").eq((Object)skuDetailNew.getBatchPriceUnit())});
                    QuerySchema schema = QuerySchema.create().addSelect(new String[]{"assistUnit", "mainUnitCount"}).addCondition((ConditionExpression)queryConditionGroup);
                    List productAssistUnitExchanges = this.productSkuService.query("pc.product.ProductAssistUnitExchange", schema);
                    if (CollectionUtils.isEmpty((Collection)productAssistUnitExchanges)) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_BATCH_RATE_NOT_EXIST_IN_SUB_UNIT);
                    }
                    skuDetailNew.setBatchPriceUnitRate(((ProductAssistUnitExchange)productAssistUnitExchanges.get(0)).getMainUnitCount());
                }
            } else {
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq((Object)product.getProductTemplate())});
                QuerySchema schema = QuerySchema.create().addSelect("enableAssistUnit").addCondition((ConditionExpression)queryConditionGroup);
                List productTplUnits = this.productSkuService.query("pc.tpl.ProductTplUnit", schema);
                if (CollectionUtils.isEmpty((Collection)productTplUnits) || !((ProductTplUnit)productTplUnits.get(0)).getEnableAssistUnit().booleanValue()) {
                    if (!skuDetailNew.getBatchPriceUnit().toString().equals(product.getUnit().toString())) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_ONLY_USE_MAIN_UNIT_BY_NOT_OPEN_SUB_UNIT);
                    }
                    skuDetailNew.setBatchPriceUnitRate(new BigDecimal(1));
                } else if (skuDetailNew.getBatchPriceUnit().toString().equals(product.getUnit().toString())) {
                    skuDetailNew.setBatchPriceUnitRate(new BigDecimal(1));
                } else {
                    queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq((Object)product.getProductTemplate()), QueryCondition.name((String)"assistUnit").eq((Object)skuDetailNew.getBatchPriceUnit())});
                    schema = QuerySchema.create().addSelect(new String[]{"assistUnit", "mainUnitCount"}).addCondition((ConditionExpression)queryConditionGroup);
                    List productTplAssistUnitExchanges = this.productSkuService.query("pc.tpl.ProductTplAssistUnitExchange", schema);
                    if (CollectionUtils.isEmpty((Collection)productTplAssistUnitExchanges)) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_BATCH_RATE_NOT_EXIST_IN_SUB_UNIT);
                    }
                    skuDetailNew.setBatchPriceUnitRate(((ProductTplAssistUnitExchange)productTplAssistUnitExchanges.get(0)).getMainUnitCount());
                }
            }
        } else {
            skuDetailNew.setBatchPriceUnitRate(null);
        }
    }

    private void dealDataFromHtml(ProductSKU sku) throws Exception {
        Map range = this.productSkuDetailSaveService.getRange(sku.get("productApplyRangeId"));
        Object productId = range.get("productId");
        Long productApplyRangeId = Long.parseLong(range.get("id").toString());
        Boolean isCreator = Boolean.parseBoolean(range.get("isCreator").toString());
        Boolean isApplied = Boolean.parseBoolean(range.get("isApplied").toString());
        Long productDetailId = Long.parseLong(range.get("productDetailId").toString());
        if (isCreator.booleanValue()) {
            this.productSkuDetailSaveService.dealSkuDetailExtend(sku, range);
            this.setStatusOfDetail(sku, range);
        } else if (isApplied.booleanValue()) {
            this.productSkuDetailSaveService.dealSkuApplyDetailExists(sku, productApplyRangeId, productDetailId);
        } else {
            this.productSKUShelveRule.initRangeData(productId.toString(), productApplyRangeId);
            range = this.productSkuDetailSaveService.getRange(sku.get("productApplyRangeId"));
            productDetailId = Long.parseLong(range.get("productDetailId").toString());
            this.productSkuDetailSaveService.dealSkuApplyDetailExists(sku, productApplyRangeId, productDetailId);
        }
        this.checkBusiness(sku, productDetailId, productId);
        List<Product> products = this.getProducts(sku);
        this.checkWeigheVolume(sku, ObjectUtils.isEmpty(products) ? null : products.get(0));
    }

    private void checkBusiness(ProductSKU sku, Object productDetailId, Object productId) throws Exception {
        QueryConditionGroup queryConditionGroupProduct = new QueryConditionGroup();
        if (null == productId) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_PRODUCT_ID_AND_CODE_CANNOT_BE_NULL);
        }
        queryConditionGroupProduct.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq(productId));
        QuerySchema schemaProduct = QuerySchema.create().addSelect("id, productTemplate, name, code, useSku,productTemplate.involveSKUNaming as involveSKUNaming, modelDescription, enableAssistUnit, unitUseType, unit, volumeUnit, volumeUnit.precision as volumeUnit_precision, weightUnit, weightUnit.precision as weightUnit_precision, hasSpecs, orgId").addCondition((ConditionExpression)queryConditionGroupProduct);
        List products = this.productSkuService.query("pc.product.Product", schemaProduct);
        Product product = (Product)products.get(0);
        if (0 == sku.getIsSKU()) {
            this.dealBatchUnit(sku, product);
            return;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(productDetailId)});
        QuerySchema schema = QuerySchema.create().addSelect("iStatus, iUOrderStatus, stopstatus, productId.realProductAttribute as realProductAttribute, productId.realProductAttributeType as realProductAttributeType, productId.virtualProductAttribute as virtualProductAttribute,productId.unit.precision as unitPrecision").addCondition((ConditionExpression)queryConditionGroup);
        List productDetails = this.productSkuService.query("pc.product.ProductDetail", schema);
        if (CollectionUtils.isEmpty((Collection)productDetails)) {
            return;
        }
        ProductDetail productDetail = (ProductDetail)productDetails.get(0);
        List productSkuDetailNews = sku.productSkuDetailNew();
        if (!CollectionUtils.isEmpty((Collection)productSkuDetailNews)) {
            Boolean stopstatus;
            Boolean ustatus;
            ProductSkuDetailNew productSkuDetailNew = (ProductSkuDetailNew)productSkuDetailNews.get(0);
            Boolean status = productSkuDetailNew.getStatus();
            if (null != status && status.booleanValue()) {
                boolean isOpenUMall = ProductUtil.checkOpenOption("u8c-config", DomainOpenEnum.MALL.getServiceName());
                if (isOpenUMall && null != productDetail.getIStatus() && !productDetail.getIStatus().booleanValue()) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_STATUS_NOT_ALLOW_SALE_BY_SHOP);
                }
                this.checkAttributeType(productDetail);
            }
            if (null != (ustatus = productSkuDetailNew.getUstatus()) && ustatus.booleanValue()) {
                boolean isOpenUdh = ProductUtil.checkOpenOption("u8c-config", "app:SCMSA");
                if (isOpenUdh && null != productDetail.getIUOrderStatus() && !productDetail.getIUOrderStatus().booleanValue()) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_STATUS_NOT_ALLOW_SALE_BY_U);
                }
                this.checkAttributeType(productDetail);
            }
            if (null != (stopstatus = productSkuDetailNew.getStopstatus()) && !stopstatus.booleanValue() && null != productDetail.getStopstatus() && productDetail.getStopstatus().booleanValue()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_STATUS_NOT_ALLOW_SALE_BY_PRODUCT_STOP);
            }
            if (null != productSkuDetailNew.get("iDoubleSale")) {
                this.productBusCheckService.checkIDoubleSale(productSkuDetailNew.get("iDoubleSale"), sku.getProductId());
            }
            this.dealBatchPriceUnit(productSkuDetailNew, product);
        }
        if (null != sku.getCode()) {
            if (StringUtils.isEmpty((CharSequence)sku.getCode())) {
                sku.remove("code");
            } else {
                this.productSkuService.checkSkuCodeUniqueOne(sku.getCode(), sku.getId(), productId);
            }
        }
        if (null != sku.get("name")) {
            String skuName = (String)MultilangUtil.getAttr((String)"pc.product.ProductSKU", (String)"name", (BizObject)sku, null);
            if (StringUtils.isEmpty((CharSequence)skuName)) {
                sku.remove("name");
            } else {
                queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").not_eq(sku.getId()), QueryCondition.name((String)"name").eq((Object)skuName), QueryCondition.name((String)"productId").eq(productId)});
                schema = QuerySchema.create().addSelect("id, name, code").addCondition((ConditionExpression)queryConditionGroup);
                List skusInDb = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
                if (!CollectionUtils.isEmpty((Collection)skusInDb)) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_NAME_REPEAT);
                }
            }
        }
        this.checkBusForApi(sku, productDetail.get("unitPrecision"));
        this.dealBatchUnit(sku, product);
    }

    private void checkBusForApi(ProductSKU sku, Object unitPrecision) throws Exception {
        if (sku.containsKey((Object)"_fromApi") && sku.get("_fromApi").equals(true)) {
            int precision = 8;
            if (unitPrecision != null) {
                precision = Integer.parseInt(unitPrecision.toString());
            }
            this.checkDubblePoint(sku.getWeight(), 8, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805FF", (String)"\u91cd\u91cf"));
            this.checkDubblePoint(sku.getVolume(), 8, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080600", (String)"\u4f53\u79ef"));
            List productSkuDetailNews = sku.productSkuDetailNew();
            if (!CollectionUtils.isEmpty((Collection)productSkuDetailNews)) {
                ProductSkuDetailNew productSkuDetailNew = (ProductSkuDetailNew)productSkuDetailNews.get(0);
                this.checkDubblePoint(productSkuDetailNew.getFNoTaxCostPrice(), 8, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080603", (String)"\u53c2\u8003\u6210\u672c"));
                this.checkDubblePoint(productSkuDetailNew.getFPrimeCosts(), 8, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080604", (String)"\u91c7\u8d2d\u53c2\u8003\u4ef7"));
                this.checkDubblePoint(productSkuDetailNew.getIMinOrderQuantity(), 8, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080606", (String)"\u6279\u53d1\u8d77\u8ba2\u91cf"));
                this.checkDubblePoint(productSkuDetailNew.getBatchDeliveryDays(), 8, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080607", (String)"\u6279\u53d1\u4ea4\u8d27\u5468\u671f"));
                this.checkDubblePoint(productSkuDetailNew.getMarkPrice(), 2, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080608", (String)"\u5efa\u8bae\u96f6\u552e\u4ef7"));
                this.checkDubblePoint(productSkuDetailNew.getSalePrice(), 2, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080609", (String)"\u7ebf\u4e0a\u96f6\u552e\u4ef7"));
                this.checkDubblePoint(productSkuDetailNew.getFMarketPrice(), 2, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408060B", (String)"\u5e02\u573a\u4ef7"));
                this.checkDubblePoint(productSkuDetailNew.getFSettleAccountsRate(), 2, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408060C", (String)"\u7ed3\u7b97\u8d39\u7387"));
                this.checkDubblePoint(productSkuDetailNew.getInventoryCount(), 8, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408060D", (String)"\u7ebf\u4e0a\u5e93\u5b58\u91cf"));
                this.checkDubblePoint(productSkuDetailNew.getSafetyStock(), precision, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408060F", (String)"\u5b89\u5168\u5e93\u5b58"));
                this.checkDubblePoint(productSkuDetailNew.getHighestStock(), precision, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080B3D", (String)"\u6700\u9ad8\u5e93\u5b58"));
                this.checkDubblePoint(productSkuDetailNew.getLowestStock(), precision, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080B3B", (String)"\u6700\u4f4e\u5e93\u5b58"));
            }
        }
    }

    public void checkDubblePoint(Object iDoubleSale, int scaleP, String showCaption) throws Exception {
        if (null == iDoubleSale) {
            return;
        }
        BigDecimal decimal = new BigDecimal(iDoubleSale.toString()).stripTrailingZeros();
        int scale = decimal.scale();
        if (scale > scaleP) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SCALE_NOT_LESS_THAN_UNIT_SCALE, new Object[]{showCaption, scaleP});
        }
    }

    private void checkAttributeType(ProductDetail productDetail) {
        Object realProductAttribute = productDetail.get("realProductAttribute");
        Object realProductAttributeType = productDetail.get("realProductAttributeType");
        Object virtualProductAttribute = productDetail.get("virtualProductAttribute");
        if (null != realProductAttribute && "1".equals(realProductAttribute.toString())) {
            if (null != realProductAttribute && "2".equals(realProductAttributeType.toString())) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_ALLOW_SALE_BY_ENTITY_CARD);
            }
            if (null != realProductAttribute && "3".equals(realProductAttributeType.toString())) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_ALLOW_SALE_BY_ENTITY_STORE_VALUE_CARD);
            }
        }
        if (null != realProductAttribute && "2".equals(realProductAttribute.toString()) && null != realProductAttribute && "1".equals(virtualProductAttribute.toString())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_ALLOW_SALE_BY_STORE_VALUE_CARD);
        }
    }

    private void setStatusOfDetail(ProductSKU sku, Map range) {
        List productSkuOrderProperties;
        List productSkuDetailNews = sku.productSkuDetailNew();
        if (!CollectionUtils.isEmpty((Collection)productSkuDetailNews)) {
            for (ProductSkuDetailNew productSkuDetailNew : productSkuDetailNews) {
                productSkuDetailNew.setEntityStatus(EntityStatus.Update);
                productSkuDetailNew.setProductDetailId(Long.valueOf(Long.parseLong(range.get("productDetailId").toString())));
                productSkuDetailNew.setProductApplyRangeId(Long.valueOf(Long.parseLong(range.get("id").toString())));
            }
        }
        if (!CollectionUtils.isEmpty((Collection)(productSkuOrderProperties = sku.productSkuOrderProperty()))) {
            for (ProductSkuOrderProperty productSkuOrderProperty : productSkuOrderProperties) {
                if (EntityStatus.Unchanged != productSkuOrderProperty.getEntityStatus()) continue;
                productSkuOrderProperty.setEntityStatus(EntityStatus.Update);
                productSkuOrderProperty.setProductDetailId(Long.valueOf(Long.parseLong(range.get("productDetailId").toString())));
                productSkuOrderProperty.setProductApplyRangeId(Long.valueOf(Long.parseLong(range.get("id").toString())));
            }
        }
    }
}

