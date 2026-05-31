/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.yonyou.cloud.util.IrisDynamicInvokeUtil
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.service.pub.CoreDocUniqueService
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.bizdoc.service.model.WarehouseModel
 *  com.yonyou.iuap.bizdoc.service.model.WarehouseQueryParam
 *  com.yonyou.iuap.bizdoc.service.model.WarehouseStockModel
 *  com.yonyou.iuap.bizdoc.service.warehouse.IWarehouseQueryService
 *  com.yonyou.iuap.data.service.itf.BizDelegateApi
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.util.DateKit
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyoucloud.upc.data.product.ProductApplyRangeDao
 *  com.yonyoucloud.upc.pc.product.AssistUnitType
 *  com.yonyoucloud.upc.pc.product.BusinessAttributeEnum
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductAssistClass
 *  com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange
 *  com.yonyoucloud.upc.pc.product.ProductDepositTimeExtend
 *  com.yonyoucloud.upc.pc.product.ProductDetail
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.ProductLoadWay
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.product.ProductSKUExtend
 *  com.yonyoucloud.upc.pc.product.ProductSource
 *  com.yonyoucloud.upc.pc.product.ProductTagExtend
 *  com.yonyoucloud.upc.pc.product.RealProductAttributeTypeEnum
 *  com.yonyoucloud.upc.pc.product.TestRule
 *  com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubQueryService
 *  com.yonyoucloud.upc.utils.BizObjectUtils
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  com.yonyoucloud.upc.utils.RedisLockKeyConstants
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
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.data.redis.core.RedisTemplate
 *  org.springframework.stereotype.Component
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.google.gson.JsonObject;
import com.yonyou.cloud.util.IrisDynamicInvokeUtil;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.service.pub.CoreDocUniqueService;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.bizdoc.service.model.WarehouseModel;
import com.yonyou.iuap.bizdoc.service.model.WarehouseQueryParam;
import com.yonyou.iuap.bizdoc.service.model.WarehouseStockModel;
import com.yonyou.iuap.bizdoc.service.warehouse.IWarehouseQueryService;
import com.yonyou.iuap.data.service.itf.BizDelegateApi;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.util.DateKit;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import com.yonyoucloud.upc.data.product.ProductApplyRangeDao;
import com.yonyoucloud.upc.pc.product.AssistUnitType;
import com.yonyoucloud.upc.pc.product.BusinessAttributeEnum;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductAssistClass;
import com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange;
import com.yonyoucloud.upc.pc.product.ProductDepositTimeExtend;
import com.yonyoucloud.upc.pc.product.ProductDetail;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.ProductLoadWay;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.product.ProductSKUExtend;
import com.yonyoucloud.upc.pc.product.ProductSource;
import com.yonyoucloud.upc.pc.product.ProductTagExtend;
import com.yonyoucloud.upc.pc.product.RealProductAttributeTypeEnum;
import com.yonyoucloud.upc.pc.product.TestRule;
import com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubQueryService;
import com.yonyoucloud.upc.service.CoredocTransTypeService;
import com.yonyoucloud.upc.service.ProductAssistUnitService;
import com.yonyoucloud.upc.service.ProductCheckService;
import com.yonyoucloud.upc.service.ProductDealAttachmentDataService;
import com.yonyoucloud.upc.service.ProductDefaultValueService;
import com.yonyoucloud.upc.service.ProductReferenceCheckService;
import com.yonyoucloud.upc.service.UPCProductShelfService;
import com.yonyoucloud.upc.service.UseSkuService;
import com.yonyoucloud.upc.service.api.ProductCheckForApiService;
import com.yonyoucloud.upc.service.bill.product.ProductAssistUnitCheckUtil;
import com.yonyoucloud.upc.service.bill.product.ProductBusinessHandleService;
import com.yonyoucloud.upc.service.rpcService.OrgService;
import com.yonyoucloud.upc.service.utils.DomainReferenceFieldCheckUtils;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import com.yonyoucloud.upc.utils.BizObjectUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
import com.yonyoucloud.upc.utils.RedisLockKeyConstants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;

@Component(value="productAPIProcessRule")
public class ProductAPIProcessRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(ProductAPIProcessRule.class);
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private ProductDefaultValueService productDefaultValueService;
    @Autowired
    ProductCheckService productCheckService;
    @Autowired
    ProductReferenceCheckService productReferenceCheckService;
    @Autowired
    ProductDealAttachmentDataService productDealAttachmentDataService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    CoredocTransTypeService coredocTransTypeService;
    @Autowired
    UseSkuService useSkuService;
    @Autowired
    private IVendorPubQueryService vendorPubQueryService;
    @Autowired
    private ProductAssistUnitService productAssistUnitService;
    @Autowired
    UPCProductShelfService upcProductShelfService;
    @Autowired
    ProductCheckForApiService productCheckForApiService;
    private static final List<String> PRODUCT_UNIT_CHECK = new ArrayList<String>();
    @Autowired
    @Qualifier(value="ymsExecutorService")
    private ExecutorService ymsExecutorService;
    @Autowired
    private IWarehouseQueryService warehouseQueryService;
    @Autowired
    private ProductApplyRangeDao productApplyRangeDao;
    @Autowired
    private ProductBusinessHandleService productBusinessHandleService;
    @Autowired
    private ProductAssistUnitCheckUtil productAssistUnitModel;
    @Autowired
    private IUPCProductQueryService upcProductQueryService;
    @Autowired
    OrgService orgService;
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    CoreDocUniqueService coreDocUniqueService;
    public static final String SYNC_BLACK_LIST_TENANT = "SYNC_BLACK_LIST_TENANT";

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        for (BizObject bill : bills) {
            Product product = (Product)bill;
            if ("pc_product".equals(billContext.getBillnum()) || "pc_productimport".equals(billContext.getBillnum())) {
                this.coreDocUniqueService.doLockOperate((BizObject)product, "pc.product.Product", product.getCode());
            }
            UserType userType = AppContext.getCurrentUser().getUserType();
            ProductAPIProcessRule.handelBefore(billContext, userType);
            List<Map> productsDB = this.queryProductFieldsById((Long)product.getId());
            this.fillProductStatus(billContext, billDataDto, product, productsDB);
            if (EntityStatus.Insert.equals((Object)product.getEntityStatus())) {
                this.productBusinessHandleService.businessHandleForInsert(product);
            } else {
                if (EntityStatus.Update.equals((Object)product.getEntityStatus()) && product.getId() == null) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_DETAIL_DATA_NOT_EXISTS);
                }
                if (EntityStatus.Update.equals((Object)product.getEntityStatus()) && product.getId() != null) {
                    this.fillApplyRange(billContext, product);
                    Product productDB = this.productBusinessHandleService.detailQueryProduct(product.getId().toString(), product.get("productApplyRangeId").toString(), BooleanUtil.isTrue((Object)product.get("isCreator")), BooleanUtil.isTrue((Object)product.get("isApplied")));
                    this.productAssistUnitModel.dealBusinessUnit(product, productDB.productAssistUnitExchanges());
                    this.productAssistUnitModel.fillAssistUnitExchange(billContext.getBillnum(), product, productDB.productAssistUnitExchanges());
                    this.productBusinessHandleService.businessHandleForUpdate(billContext.getBillnum(), product, productDB);
                }
            }
            this.dealTurnOverMaterials(product);
            BizObjectUtils.removeBizObjectSpaces((BizObject)product);
            if (BooleanUtil.isTrue((Object)product.get("_fromApi"))) {
                String yTenantId = AppContext.getYhtTenantId().toString();
                List syncBlackList = this.redisTemplate.opsForList().range((Object)SYNC_BLACK_LIST_TENANT, 0L, -1L);
                if (CollectionUtils.isEmpty((Collection)syncBlackList) || !syncBlackList.contains(yTenantId)) {
                    this.controlConcurrency(product.getErpCode(), billContext.getBillnum());
                }
                this.dealDataForApiAndExcel(billContext, paramMap, billDataDto, product, productsDB);
                this.dealUnitPrecision(product);
                this.dealBusDataUnitPrecision(product);
            }
            this.checkClassCanUsed(product.getOrgId(), product.getCostClass(), "pc.cls.CostClassApplyRange", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080248", (String)"\u6210\u672c\u5206\u7c7b"), product.getCode());
            if (EntityStatus.Update == product.getEntityStatus()) {
                this.checkProductRefence(billContext, paramMap, product);
                this.modifyFieldReferenceCheck(billContext, paramMap, product);
            }
            if ("pc_productdetail_import".equals(billContext.getBillnum())) {
                this.productCheckService.commonCheckForProductDetail(product);
            }
            if ("pc_productimport".equals(billContext.getBillnum())) {
                Map externalData = (Map)billDataDto.getExternalData();
                if (ObjectUtils.isNotEmpty((Object)externalData)) {
                    product.put("exportMode", externalData.get("exportMode"));
                }
                this.productDealAttachmentDataService.dealProductImgBusinessId(product);
            }
            if (!"pc_productdetail".equals(billContext.getBillnum()) && !"batchModify&save".equals(billDataDto.getAction())) continue;
            this.dealProductWarehouse(product, billContext);
        }
        return new RuleExecuteResult();
    }

    private void dealTurnOverMaterials(Product product) {
        if (product.detail() != null && product.detail().get("turnoverMaterials") != null && BooleanUtil.isFalse((Object)product.detail().get("turnoverMaterials"))) {
            product.detail().set("amortizationMethod", null);
            product.detail().set("measurementCount", null);
            product.detail().set("measurementUnit", null);
            product.detail().set("compensationAmount", null);
            product.detail().set("moldingTime", null);
            product.detail().set("moldCavities", null);
        }
    }

    private void fillApplyRange(BillContext billContext, Product product) throws Exception {
        ProductApplyRange productApplyRange;
        if (EntityStatus.Update.equals((Object)product.getEntityStatus()) && product.getId() != null && (productApplyRange = this.queryProductapplyRange(billContext, product)) != null) {
            product.put("productApplyRange_OrgId", (Object)productApplyRange.getOrgId());
            product.put("productApplyRangeId", productApplyRange.getId());
            product.put("isCreator", (Object)productApplyRange.getIsCreator());
            product.put("isApplied", (Object)productApplyRange.getIsApplied());
        }
    }

    private ProductApplyRange queryProductapplyRange(BillContext billContext, Product product) throws Exception {
        if (EntityStatus.Update.equals((Object)product.getEntityStatus()) && product.get("productApplyRangeId") == null) {
            QueryConditionGroup conditionGroup = new QueryConditionGroup();
            if (product.getId() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").eq(product.get("id")));
            } else if (product.get("code") != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId.code").eq(product.get("code")));
            } else {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_SUBMIT_ID_AND_CODE);
            }
            if ("pc_productimport".equals(billContext.getBillnum()) || "pc_product".equals(billContext.getBillnum())) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"isCreator").eq((Object)"true"));
            } else if (this.iupcControlRuleService.checkSingleOrg().booleanValue() && AppContext.getCurrentUser().get("singleOrgId") != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq(AppContext.getCurrentUser().get("singleOrgId")));
            } else if (product.get("productApplyRange_OrgId") != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq(product.get("productApplyRange_OrgId")));
            } else if (product.get("productApplyRange_OrgId_Name") != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId.code").eq(product.get("productApplyRange_OrgId_Name")));
            } else if (product.get("productApplyRange_OrgId___Name") != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId.name").eq(product.get("productApplyRange_OrgId___Name")));
            } else if (product.get("productApplyRange_OrgId_code") != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId.code").eq(product.get("productApplyRange_OrgId_code")));
            } else if (product.get("productApplyRange_OrgId___code") != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId.code").eq(product.get("productApplyRange_OrgId___code")));
            } else {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_FOUND_USE_ORG_CODE);
            }
            List productApplyRangeList = this.productApplyRangeDao.queryProductApplyRangeByCondition(conditionGroup);
            if (ObjectUtils.isEmpty((Object)productApplyRangeList)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_ORG_DATA_NOT_FOUND);
            }
            return (ProductApplyRange)productApplyRangeList.get(0);
        }
        return null;
    }

    private static void handelBefore(BillContext billContext, UserType userType) {
        if (BooleanUtil.isTrue((Object)"_fromApi") && ("pc_product".equals(billContext.getBillnum()) || "pc_productdetail".equals(billContext.getBillnum())) && UserType.TenantAdmin != userType && UserType.TenantEmployee != userType) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_ALLOW_UPDATE_BY_CURRENT_ORG_USE_API);
        }
    }

    private void fillProductStatus(BillContext billContext, BillDataDto billDataDto, Product product, List<Map> products) {
        if (BooleanUtil.isTrue((Object)product.get("_fromApi"))) {
            String productCode = product.getCode();
            if (CollectionUtils.isEmpty(products)) {
                if ("pc_productdetail_import".equals(billContext.getBillnum()) || "pc_productdetail".equals(billContext.getBillnum())) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_FOUND_BY_CODE, new Object[]{productCode});
                }
                product.setId((Object)IdManager.getInstance().nextId());
                product.setTenant((Long)AppContext.getTenantId());
                product.setEntityStatus(EntityStatus.Insert);
            } else {
                if (products.size() > 1) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_FOUND_BY_CODE_MORE_THAN_ONE, new Object[]{productCode});
                }
                if (billDataDto.getImportMode() != null && "0".equals(billDataDto.getImportMode().toString())) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CODE_EXIST, new Object[]{product.getCode()});
                }
                product.setId(products.get(0).get("id"));
                product.setEntityStatus(EntityStatus.Update);
            }
        }
    }

    private List<Map> queryProductFieldsById(Long productId) {
        HashMap<String, Object> param = new HashMap<String, Object>(2);
        param.put("ytenant_id", AppContext.getYTenantId());
        param.put("id", productId);
        return SqlHelper.selectList((String)"com.yonyoucloud.upc.productAPI.dao.productdata.QueryProductExistOrNot", param);
    }

    private void dealDataForApiAndExcel(BillContext billContext, Map<String, Object> paramMap, BillDataDto billDataDto, Product product, List<Map> products) throws Exception {
        String productName = (String)MultilangUtil.getAttr((String)"pc.product.Product", (String)"name", (BizObject)product, (String)"zh_CN");
        if (EntityStatus.Update.equals((Object)product.getEntityStatus()) && ObjectUtils.isNotEmpty(products) && products.get(0) != null) {
            Map productDB = products.get(0);
            if (billDataDto.getImportMode() != null && "2".equals(billDataDto.getImportMode().toString()) && product.get("unitUseType") != null && productDB != null && productDB.get("unitUseType") != null && !product.get("unitUseType").toString().equals(productDB.get("unitUseType").toString())) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_ALLOW_UPDATE_RULE_PARAM_BY_UPDATE_IMPORT, new Object[]{product.getCode()});
            }
            this.fillDbValues(billContext, product, productDB);
            if ("pc_productdetail".equals(billContext.getBillnum())) {
                this.productCheckService.checkDecimalForCommonCheck(product.detail());
            }
        }
        this.dealSingalOrg(product);
        this.dealSingalRange(billContext.getBillnum(), product);
        this.fillApplyRangeParamter(billContext.getBillnum(), product);
        if (product.detail() != null && product.detail().containsKey((Object)"planCheckDays")) {
            this.productCheckService.checkPlanCheckDays(product);
        }
        if (product.getEntityStatus() == EntityStatus.Insert) {
            if (product.detail() == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PARALLEL_DATA_IS_NULL, new Object[]{product.getCode()});
            }
            this.productDefaultValueService.setDefaultValueForProductInsert(product);
            this.productCheckService.beforeInsertCheck(product);
            if ("pc_productimport".equals(billContext.getBillnum())) {
                this.productCheckService.productOrgsCheck(billContext.getBillnum(), product);
            }
            if (product.detail().get("mnemonicCode") == null && product.get("name") != null) {
                if (product.get("name") instanceof BizObject) {
                    product.detail().put("mnemonicCode", (Object)this.productDefaultValueService.generateMnemonicCode((String)MultilangUtil.getAttr((String)"pc.product.Product", (String)"name", (BizObject)product, (String)"zh_CN")));
                } else {
                    product.detail().put("mnemonicCode", (Object)this.productDefaultValueService.generateMnemonicCode(product.getName()));
                }
            }
            if (product.detail().get("isSerialNoManage") != null && product.detail().get("isSerialNoManage").equals(true) && product.detail().get("isProcess") != null && product.detail().get("isProcess").equals(true)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_OPEN_PROCESS_BY_OPEN_SERIAL_NUMBER, new Object[]{product.getCode()});
            }
            this.dealDefaultValueForInsert(product);
            this.dealTimeData(product);
            this.setAutoRangeForInsert(product);
            this.productCheckForApiService.checkManageOrg(product);
            this.checkSkuDatas(product);
            this.productDefaultValueService.setLifeCycleDataDefaultValue(product);
            this.compatibleAssistUnit(product);
        } else if (product.getEntityStatus() == EntityStatus.Update) {
            this.dealCharacterDefineId(product, products);
            this.productCheckService.beforeInsertCheck(product);
            this.dealIgnoreFields(product, products);
            if (!"pc_productdetail".equals(billContext.getBillnum()) && !"pc_productdetail_import".equals(billContext.getBillnum())) {
                this.setAutoRangeForUpdate(product);
            }
            if ("pc_productimport".equals(billContext.getBillnum())) {
                this.productCheckService.productOrgsCheck(billContext.getBillnum(), product);
                this.productDefaultValueService.addCreateNewCodeType(product, products);
            }
            this.dealProductAttributes(billContext, paramMap, product, productName, products);
            this.dealBarCodes(product);
            if ("pc_productdetail_import".equals(billContext.getBillnum())) {
                this.productDefaultValueService.setDefultValueForProductDetailImport(product);
            }
            this.dealDetailDataForUpdate(billContext, paramMap, billDataDto, product, products);
            this.dealTimeForUpdate(product);
            this.dealDescription(product);
            this.dealAssistClassForUpdate(product);
            this.dealTags(billContext, product);
            this.dealSkuDatas(product);
            this.dealProductLoadWays(product);
            this.productAssistUnitService.checkBusinessUnit(billContext, paramMap, product);
            if (product.detail().get("stopstatus") != null && (Boolean.parseBoolean(product.detail().get("stopstatus").toString()) || "1".equals(product.detail().get("stopstatus").toString()))) {
                this.upcProductShelfService.disableProduct((Long)product.getId(), Long.parseLong(product.get("productApplyRangeId").toString()), Boolean.parseBoolean(product.get("isCreator").toString()));
            }
        }
        this.dealProductWarehouse(product, billContext);
        this.processRealProductAttribute(product);
        this.productCheckService.productAssistUnitExchangesRepeatCheck(product);
        if (!(product.containsKey((Object)"__APIImportCommand") && ((Boolean)product.get("__APIImportCommand")).booleanValue() || "pc_productimport".equals(billContext.getBillnum()))) {
            this.transferDatas(product, billContext.getBillnum());
        }
        this.dealProductFamily(product);
        if (product.getSalesAndOperations() == null || product.getSalesAndOperations() != null && !product.getSalesAndOperations().equals(1) && !product.getSalesAndOperations().equals(0)) {
            product.setSalesAndOperations(Integer.valueOf(0));
        }
        this.useSkuService.setDefaultForApi(product);
    }

    private void fillApplyRangeParamter(String billnum, Product product) {
        if ("pc_productimport".equals(billnum)) {
            product.put("autoGenerateRangeData_", (Object)false);
            product.put("forceControlApplyRange", (Object)true);
        }
        if (!product.containsKey((Object)"autoGenerateRangeData_")) {
            product.put("autoGenerateRangeData_", (Object)true);
            product.put("forceControlApplyRange", (Object)false);
        }
    }

    private void transferDatas(Product product, String billNum) throws Exception {
        DataTransferUtils.fill((String)"pc_product", (String)"pc.product.Product", (Object)product, (int)1);
        if (null != product.get("__errorMessage")) {
            throw new Exception(product.get("__errorMessage").toString());
        }
    }

    private void controlConcurrency(String erpCode, String billNum) {
        if ("pc_product".equals(billNum) && !StringUtils.isEmpty((CharSequence)erpCode)) {
            final String requestId = UUID.randomUUID().toString();
            final String lockKey = RedisLockKeyConstants.PRODUCT_ERPCODE_SAVE + erpCode;
            if (RedisTool.tryGetLock((String)lockKey, (String)requestId, (int)10)) {
                TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

                    public void afterCompletion(int status) {
                        RedisTool.releaseLock((String)lockKey, (String)requestId);
                    }
                });
            } else {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_CONCURRENT_ERROR);
            }
        }
    }

    private void dealProductFamily(Product product) {
        if (product.getProductFamily() != null) {
            if ("true".equals(product.getProductFamily().toString())) {
                product.setProductFamily(Integer.valueOf(1));
            } else if ("false".equals(product.getProductFamily().toString())) {
                product.setProductFamily(Integer.valueOf(0));
            } else if (!product.getProductFamily().equals(1) && !product.getProductFamily().equals(0)) {
                product.setProductFamily(Integer.valueOf(0));
            }
        } else {
            product.setProductFamily(Integer.valueOf(0));
        }
    }

    private void dealProductLoadWays(Product product) throws Exception {
        if (product != null && product.get("productLoadWays") != null) {
            ArrayList<ProductLoadWay> productLoadWaysList = new ArrayList<ProductLoadWay>();
            List productLoadWaysInDb = new ArrayList();
            if (!ObjectUtils.isEmpty((Object)product.get("productApplyRangeId"))) {
                List applyRanges = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"id,productDetailId", (Object)product.get("productApplyRangeId"));
                productLoadWaysInDb = MetaDaoHelper.query((String)"pc.product.ProductLoadWay", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id", "loadWay"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"productDetailId").eq(((Map)applyRanges.get(0)).get("productDetailId"))})));
            }
            HashSet loadWayIdInDb = new HashSet();
            productLoadWaysInDb.forEach(loadWay -> loadWayIdInDb.add(loadWay.get("loadWay").toString()));
            List productLoadWaysFromUser = (List)product.get("productLoadWays");
            HashSet<String> loadWayIdFromUser = new HashSet<String>();
            for (Map loadWayFromUser : productLoadWaysFromUser) {
                loadWayIdFromUser.add(loadWayFromUser.get("loadWay").toString());
                ProductLoadWay productLoadWay = new ProductLoadWay();
                productLoadWay.setLoadWay(Long.valueOf(loadWayFromUser.get("loadWay").toString()));
                productLoadWay.setProductApplyRangeId(Long.valueOf(Long.parseLong(product.get("productApplyRangeId").toString())));
                if (loadWayIdInDb.contains(productLoadWay.getLoadWay().toString())) {
                    productLoadWay.setEntityStatus(EntityStatus.Update);
                } else {
                    productLoadWay.setEntityStatus(EntityStatus.Insert);
                }
                productLoadWaysList.add(productLoadWay);
            }
            for (Map loadWayInDb : productLoadWaysInDb) {
                if (loadWayIdFromUser.contains(loadWayInDb.get("loadWay").toString())) continue;
                ProductLoadWay productLoadWayDel = new ProductLoadWay();
                productLoadWayDel.putAll(loadWayInDb);
                productLoadWayDel.setEntityStatus(EntityStatus.Delete);
                productLoadWaysList.add(productLoadWayDel);
            }
            product.put("productLoadWays", productLoadWaysList);
        }
    }

    private void dealSkuDatas(Product product) throws Exception {
        if (product.productskus() != null) {
            List skus = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)QuerySchema.create().addSelect("id, code").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId())})));
            for (ProductSKU sku : product.productskus()) {
                Optional<Map> optionalMap = skus.stream().filter(map -> map.get("code").equals(sku.getCode())).findAny();
                if (optionalMap.isPresent()) {
                    sku.setId(optionalMap.get().get("id"));
                    sku.setEntityStatus(EntityStatus.Update);
                    HashMap<String, Object> params = new HashMap<String, Object>();
                    params.put("ytenant", AppContext.getYTenantId());
                    params.put("skuId", sku.getId());
                    Map skudetail = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.data.ProductSkuExtendAndDetailDoubleWriteDao.selectProductSkuExtendByCondition", params);
                    if (skudetail == null || skudetail.isEmpty()) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_EXTEND_NOT_FOUND, (Object[])sku.getId());
                    }
                    if (sku.productSKUDetail() != null) {
                        sku.productSKUDetail().setEntityStatus(EntityStatus.Update);
                        sku.productSKUDetail().setId(skudetail.get("id"));
                        continue;
                    }
                    ProductSKUExtend skuExtend = new ProductSKUExtend();
                    skuExtend.setId(skudetail.get("id"));
                    skuExtend.setEntityStatus(EntityStatus.Unchanged);
                    sku.setProductSKUDetail(skuExtend);
                    continue;
                }
                sku.setEntityStatus(EntityStatus.Insert);
                sku.productSKUDetail().setEntityStatus(EntityStatus.Insert);
                sku.productSKUDetail().setId((Object)IdManager.getInstance().nextId());
            }
        }
    }

    private void dealTags(BillContext billContext, Product product) throws Exception {
        if (!CollectionUtils.isEmpty((Collection)product.productTags())) {
            List productTagsInDb = new ArrayList();
            if (ObjectUtils.isNotEmpty((Object)product.get("productApplyRangeId"))) {
                QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"productApplyRangeId").eq(product.get("productApplyRangeId"))});
                QuerySchema productTagNewSchema = QuerySchema.create().addSelect("id,tagId").addCondition((ConditionExpression)condition);
                productTagsInDb = MetaDaoHelper.query((String)"pc.product.ProductTagNew", (QuerySchema)productTagNewSchema);
            }
            if (!CollectionUtils.isEmpty(productTagsInDb)) {
                Map<String, String> productTagsInDbMap = productTagsInDb.stream().collect(Collectors.toMap(x -> x.get("tagId").toString(), y -> y.get("id").toString()));
                for (ProductTagExtend productTagExtend : product.productTags()) {
                    if (productTagsInDbMap.containsKey(productTagExtend.getTagId().toString())) {
                        if (productTagExtend.getEntityStatus() == EntityStatus.Insert) {
                            productTagExtend.setId((Object)productTagsInDbMap.get(productTagExtend.getTagId().toString()));
                            productTagExtend.setEntityStatus(EntityStatus.Unchanged);
                        }
                        productTagExtend.setId((Object)productTagsInDbMap.get(productTagExtend.getTagId().toString()));
                        continue;
                    }
                    if (productTagExtend.getEntityStatus() == EntityStatus.Insert) continue;
                    productTagExtend.setEntityStatus(EntityStatus.Insert);
                }
            }
        }
    }

    private void dealAssistClassForUpdate(Product product) throws Exception {
        List productAssistClassesDB;
        if (!CollectionUtils.isEmpty((Collection)product.productAssistClasses()) && !CollectionUtils.isEmpty((Collection)(productAssistClassesDB = MetaDaoHelper.query((String)"pc.product.ProductAssistClass", (QuerySchema)QuerySchema.create().addSelect("id,productClassId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId())})))))) {
            if (productAssistClassesDB.size() > 5000) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SUB_CATEGORY_TOO_MUCH);
            }
            Map<String, String> productAssistClassesDBMap = productAssistClassesDB.stream().collect(Collectors.toMap(x -> x.get("productClassId").toString(), y -> y.get("id").toString()));
            for (ProductAssistClass productAssistClass : product.productAssistClasses()) {
                if (productAssistClass != null && productAssistClassesDBMap.containsKey(String.valueOf(productAssistClass.getProductClassId()))) {
                    productAssistClass.setId((Object)productAssistClassesDBMap.get(String.valueOf(productAssistClass.getProductClassId())));
                    if (!EntityStatus.Insert.equals((Object)productAssistClass.getEntityStatus())) continue;
                    productAssistClass.setEntityStatus(EntityStatus.Unchanged);
                    continue;
                }
                if (productAssistClass == null || productAssistClassesDBMap.containsKey(String.valueOf(productAssistClass.getProductClassId())) || EntityStatus.Insert.equals((Object)productAssistClass.getEntityStatus())) continue;
                productAssistClass.setEntityStatus(EntityStatus.Unchanged);
            }
        }
    }

    private void dealDescription(Product product) throws Exception {
        if (product.description() != null) {
            List descriptions = MetaDaoHelper.query((String)"pc.product.ProductDescription", (QuerySchema)QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId())})));
            if (descriptions == null || descriptions.isEmpty()) {
                product.description().setId((Object)IdManager.getInstance().nextId());
                product.description().setEntityStatus(EntityStatus.Insert);
            } else {
                if (descriptions.size() > 1) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_DESCRIPTION_TOO_MUCH, new Object[]{product.getCode()});
                }
                product.description().setId(((Map)descriptions.get(0)).get("id"));
                product.description().setEntityStatus(EntityStatus.Update);
            }
        }
    }

    private void dealTimeForUpdate(Product product) throws Exception {
        if (product.time() != null) {
            List times = MetaDaoHelper.query((String)"pc.product.ProductDepositTimeDetail", (QuerySchema)QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"isCreator").eq((Object)true)})));
            if (times == null || times.isEmpty()) {
                product.time().setId((Object)IdManager.getInstance().nextId());
                product.time().setProductId((Long)product.getId());
                product.time().setProductApplyRangeId(Long.valueOf(Long.parseLong(product.get("productApplyRangeId").toString())));
                product.time().setEntityStatus(EntityStatus.Insert);
            } else {
                if (times.size() > 1) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_DESCRIPTION_TOO_MUCH, new Object[]{product.getCode()});
                }
                product.time().setEntityStatus(EntityStatus.Update);
            }
        }
    }

    private void dealDetailDataForUpdate(BillContext billContext, Map<String, Object> paramMap, BillDataDto billDataDto, Product product, List<Map> products) throws Exception {
        Map<String, Object> productExtendDB = this.getProductExtendDBList(product);
        if (product.detail() == null) {
            ProductExtend extend = new ProductExtend();
            extend.setId(product.getId());
            extend.setEntityStatus(EntityStatus.Unchanged);
            product.setDetail(extend);
        } else {
            ProductDetail productDetailDB;
            ProductExtend productDetail = product.detail();
            productDetail.setId(product.getId());
            productDetail.setEntityStatus(EntityStatus.Update);
            HashMap<String, Object> originalParamMap = new HashMap<String, Object>(paramMap);
            if (!product.containsKey((Object)"productTemplate")) {
                product.set("productTemplate", products.get(0).get("productTemplate"));
            }
            if (product.get("unit") != null) {
                QuerySchema querySchema = QuerySchema.create().addSelect("id,unit,orgId, if unitUseType = 2 then productAssistUnitExchanges.unitExchangeType else productTemplate.productTplAssistUnitExchanges.unitExchangeType end as unitExchangeType,if unitUseType = 2 then productAssistUnitExchanges.assistUnit else productTemplate.productTplAssistUnitExchanges.assistUnit end as assistUnit").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)product.getId().toString())}));
                List queryResult = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)querySchema);
                if (!product.get("unit").equals(((Map)queryResult.get(0)).get("unit"))) {
                    HashMap<String, Object> tempMap = new HashMap<String, Object>();
                    JsonObject json = new JsonObject();
                    BillDataDto checkBillDataDto = new BillDataDto();
                    checkBillDataDto.setBillnum("pc_product");
                    checkBillDataDto.setData((Object)queryResult);
                    json.addProperty("key", "unit_Name");
                    checkBillDataDto.setItem(json.toString());
                    this.pubOptionService.prepareCheckParam(checkBillDataDto, "unit_Name");
                    tempMap.put("param", checkBillDataDto);
                    try {
                        log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080255", (String)"\u5f00\u59cb\u9488\u5bf9\u8ba1\u91cf\u5355\u4f4d\u53d8\u66f4\u8fdb\u884c\u9886\u57df\u6821\u9a8c\uff0c\u65f6\u95f4\u662f") + DateKit.getCurrTime());
                        DomainReferenceFieldCheckUtils.checkDomainReference("unit_Name", billContext, tempMap, this.ymsExecutorService);
                        log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080257", (String)"\u9886\u57df\u6821\u9a8c\u7ed3\u675f\uff0c\u65f6\u95f4\u662f") + DateKit.getCurrTime());
                    }
                    catch (Exception e) {
                        throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080259", (String)"\u7f16\u7801\u4e3a%s\u7684\u7269\u6599\u5b58\u5728\u9886\u57df\u5f15\u7528\uff0c\u4e0d\u80fd\u5bf9\u4e3b\u8ba1\u91cf\u5355\u4f4d\u8fdb\u884c\u4fee\u6539\uff0c\u8bf7\u68c0\u67e5\uff01"), product.getCode()));
                    }
                    QuerySchema productextendschema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(((Map)queryResult.get(0)).get("id"))}));
                    Map queryProductExtend = MetaDaoHelper.queryOne((String)"pc.product.ProductExtend", (QuerySchema)productextendschema);
                    for (AssistUnitType type : AssistUnitType.values()) {
                        if (productDetail.containsKey((Object)type.toString()) && productDetail.get(type.toString()) != null || !((Map)queryResult.get(0)).get("unit").equals(queryProductExtend.get(type.toString()))) continue;
                        productDetail.put(type.toString(), (Object)product.getUnit());
                    }
                }
            }
            if (this.detailFieldIsModified(productDetail, productDetailDB = this.getProductDetailDB(product), productExtendDB, "isBatchManage")) {
                ((Map)((List)((BillDataDto)paramMap.get("param")).getData()).get(0)).put("isBatchManage_Change", "true");
                this.pubOptionService.prepareCheckParam(billDataDto, "isBatchManage");
                this.productReferenceCheckService.productCheckRule(billContext, originalParamMap, "detail!isBatchManage", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A7D298805880005", (String)"\u6279\u6b21\u7ba1\u7406"));
            }
            if (this.detailFieldIsModified(productDetail, productDetailDB, productExtendDB, "isBatchManage") && BooleanUtil.isFalse((Object)productDetail.get("manageByInventory"))) {
                this.productReferenceCheckService.productCheckRule(billContext, originalParamMap, "detail!manageByInventory", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A0DE8C604700005", (String)"\u9879\u76ee\u5e93\u5b58"));
            }
            if (this.detailFieldIsModified(productDetail, productDetailDB, productExtendDB, "checkByBatch")) {
                this.pubOptionService.prepareCheckParam(billDataDto, "checkByBatch");
                this.productReferenceCheckService.productCheckRule(billContext, originalParamMap, "detail!checkByBatch", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A57A8C204C80002", (String)"\u6309\u6279\u6b21\u6838\u7b97"));
            }
            if (this.detailFieldIsModified(productDetail, productDetailDB, productExtendDB, "valueManageType")) {
                this.pubOptionService.prepareCheckParam(billDataDto, "valueManageType");
                this.productReferenceCheckService.fieldCheckRule(billContext, originalParamMap);
            }
            if (this.detailFieldIsModified(productDetail, productDetailDB, productExtendDB, "costValuation")) {
                this.productReferenceCheckService.costValuationCheckRule(billContext, originalParamMap);
            }
            HashMap<String, Object> fieldDefaultValueMap = new HashMap<String, Object>();
            fieldDefaultValueMap.put("atpInspection", UPCConstants.FALSE_INT);
            fieldDefaultValueMap.put("overSigning", UPCConstants.FALSE_INT);
            fieldDefaultValueMap.put("checkByRevenueManagement", UPCConstants.FALSE_INT);
            fieldDefaultValueMap.put("testRule", TestRule.testByTestItem.getValue());
            fieldDefaultValueMap.put("manageByInventory", UPCConstants.FALSE_INT);
            fieldDefaultValueMap.put("isBatchManage", false);
            fieldDefaultValueMap.put("checkByBatch", false);
            fieldDefaultValueMap.put("valueManageType", null);
            fieldDefaultValueMap.put("costValuation", null);
            fieldDefaultValueMap.put("isExpiryDateManage", false);
            this.detailFieldNullValue(productDetail, productDetailDB, productExtendDB, fieldDefaultValueMap);
            if (productDetail.get("isSerialNoManage") == null) {
                productDetail.put("isSerialNoManage", productExtendDB.get("isSerialNoManage"));
            } else if (!productDetail.getIsSerialNoManage().equals(BooleanUtil.isTrue((Object)productExtendDB.get("isSerialNoManage")))) {
                this.pubOptionService.prepareCheckParam(billDataDto, "isSerialNoManage");
                this.productReferenceCheckService.batchManageCheckRule(billContext, originalParamMap);
            }
            if (productDetail.get("isProcess") == null) {
                productDetail.put("isProcess", productExtendDB.get("isProcess"));
            }
            if (productDetail.get("isSerialNoManage") != null && productDetail.getIsSerialNoManage().booleanValue() && productDetail.get("isProcess") != null && productDetail.getIsProcess().booleanValue()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_OPEN_PROCESS_BY_OPEN_SERIAL_NUMBER, new Object[]{product.getCode()});
            }
            if ("pc_productdetail_import".equals(billContext.getBillnum()) && BooleanUtil.isFalse((Object)productDetail.get("isExpiryDateManage"))) {
                this.productCheckService.commonCheckForProductDetailImport(productDetail);
            }
            if (productDetail.get("saleChannel") != null && productDetail.get("businessAttribute") == null) {
                if (productDetailDB != null) {
                    productDetail.put("businessAttribute", productDetailDB.get("businessAttribute"));
                } else {
                    productDetail.put("businessAttribute", productExtendDB.get("businessAttribute"));
                }
            }
            if ("pc_productimport".equals(billContext.getBillnum()) || "pc_productdetail_import".equals(billContext.getBillnum())) {
                this.productDefaultValueService.setDefultValueForProductUpdateImport(product, productExtendDB);
            }
        }
    }

    private void dealBarCodes(Product product) {
        if (!CollectionUtils.isEmpty((Collection)product.productBarCodes()) && product.getId() != null) {
            HashMap<String, Object> deleteMap = new HashMap<String, Object>(8);
            deleteMap.put("tenantId", AppContext.getTenantId());
            deleteMap.put("ytenant_id", AppContext.getYTenantId());
            deleteMap.put("productId", product.getId());
            SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.ProductBarCode.deleteProductBarCode", deleteMap);
        }
    }

    private void dealProductAttributes(BillContext billContext, Map<String, Object> paramMap, Product product, String productName, List<Map> products) {
        if (!products.get(0).containsKey("realProductAttribute")) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_ATTRIBUTE_TYPE_ERROR, new Object[]{productName});
        }
        if (!product.containsKey((Object)"realProductAttribute")) {
            product.set("realProductAttribute", products.get(0).get("realProductAttribute"));
        } else {
            if (product.get("realProductAttribute") == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_ATTRIBUTE_TYPE_IS_NULL, new Object[]{product.getCode()});
            }
            if (!product.get("realProductAttribute").toString().equals(products.get(0).get("realProductAttribute").toString())) {
                HashMap<String, Object> tempParamMap = new HashMap<String, Object>();
                tempParamMap.putAll(paramMap);
                this.productReferenceCheckService.productCheckRule(billContext, tempParamMap, "realProductAttribute", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A3AF41E04880008", (String)"\u7269\u6599\u6027\u8d28"));
            }
        }
    }

    private void dealIgnoreFields(Product product, List<Map> products) {
        if (product.containsKey((Object)"$updateignores")) {
            String ignores = (String)product.get("$updateignores");
            if (StringUtils.isNotEmpty((CharSequence)ignores)) {
                String[] items;
                for (String item : items = ignores.trim().split(",")) {
                    if (!products.get(0).containsKey(item)) continue;
                    product.put(item, products.get(0).get(item));
                }
            }
            product.remove("$updateignores");
        }
    }

    private void setAutoRangeForUpdate(Product product) throws Exception {
        if (product.containsKey((Object)"autoGenerateRangeData_") && product.get("autoGenerateRangeData_").equals(false)) {
            product.put("isCreator", (Object)true);
            List rangesInDb = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId())})));
            if (rangesInDb == null || rangesInDb.isEmpty()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_RANGE_NOT_FOUND, new Object[]{product.getCode()});
            }
            Optional<Map> optionalMap = rangesInDb.stream().filter(map -> map.get("isCreator").equals(true)).findAny();
            if (!optionalMap.isPresent()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_CREATOR_NOT_FOUND, new Object[]{product.getCode()});
            }
            if (!(product.productOrgs() != null && !product.productOrgs().isEmpty() || product.productCustomers() != null && !product.productCustomers().isEmpty() || product.productShops() != null && !product.productShops().isEmpty())) {
                ProductApplyRange range = new ProductApplyRange();
                range.init(optionalMap.get());
                range.setEntityStatus(EntityStatus.Unchanged);
                ArrayList<ProductApplyRange> list = new ArrayList<ProductApplyRange>();
                list.add(range);
                product.setProductApplyRange(list);
            } else {
                for (ProductApplyRange range : product.productOrgs()) {
                    Optional<Map> optionalRange = rangesInDb.stream().filter(map -> map.get("orgId").equals(range.getOrgId())).findAny();
                    if (optionalRange.isPresent()) {
                        range.setId(optionalRange.get().get("id"));
                        range.setEntityStatus(EntityStatus.Unchanged);
                        continue;
                    }
                    range.setId((Object)IdManager.getInstance().nextId());
                    range.setProductId((Long)product.getId());
                    range.setRangeType(Integer.valueOf(1));
                    range.setIsCreator(Boolean.valueOf(false));
                    range.setIsApplied(Boolean.valueOf(false));
                    range.setTenant((Long)AppContext.getTenantId());
                    range.setEntityStatus(EntityStatus.Insert);
                }
            }
            product.put("productApplyRangeId", optionalMap.get().get("id"));
        } else {
            List ranges = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"orgId").eq((Object)product.getOrgId())})));
            if (ranges == null || ranges.isEmpty()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_ORG_NOT_FOUND, new Object[]{product.getOrgId()});
            }
            if (ranges.size() > 1) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_ORG_TOO_MUCH, new Object[]{product.getOrgId()});
            }
            ProductApplyRange org = new ProductApplyRange();
            org.init((Map)ranges.get(0));
            org.setEntityStatus(EntityStatus.Unchanged);
            if (((Map)ranges.get(0)).get("isCreator").equals(false)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_ALLOW_UPDATE_BY_CURRENT_USER, new Object[]{product.getCode()});
            }
            ArrayList<ProductApplyRange> orgs = new ArrayList<ProductApplyRange>();
            orgs.add(org);
            product.setProductOrgs(orgs);
            if (!product.containsKey((Object)"productApplyRangeId")) {
                product.put("productApplyRangeId", org.getId());
            }
            if (!product.containsKey((Object)"isCreator")) {
                product.put("isCreator", (Object)true);
            }
        }
    }

    private void dealCharacterDefineId(Product product, List<Map> products) {
        if (!CollectionUtils.isEmpty(products)) {
            Map productInDb = products.get(0);
            if (productInDb.get("productPropCharacterDefine") != null) {
                product.put("productPropCharacterDefine!id", products.get(0).get("productPropCharacterDefine"));
                product.put("productPropCharacterDefine!_status", (Object)EntityStatus.Update);
                if (product.getProductPropCharacterDefine() != null && product.getProductPropCharacterDefine() instanceof Map) {
                    Map productPropCharacterDefine = (Map)product.getProductPropCharacterDefine();
                    productPropCharacterDefine.put("id", products.get(0).get("productPropCharacterDefine"));
                    productPropCharacterDefine.put("_status", EntityStatus.Update);
                }
            }
            if (null != productInDb.get("productCharacterDef")) {
                product.put("productCharacterDef!id", productInDb.get("productCharacterDef"));
                product.put("productCharacterDef!_status", (Object)EntityStatus.Update);
                if (product.get("productCharacterDef") != null && product.get("productCharacterDef") instanceof Map) {
                    Map productCharacterDef = (Map)product.get("productCharacterDef");
                    productCharacterDef.put("id", productInDb.get("productCharacterDef"));
                    productCharacterDef.put("_status", EntityStatus.Update);
                }
            }
        }
    }

    private void compatibleAssistUnit(Product product) {
        if (!CollectionUtils.isEmpty((Collection)product.productAssistUnitExchanges())) {
            for (ProductAssistUnitExchange assistUnitExchange : product.productAssistUnitExchanges()) {
                if (null != assistUnitExchange.getMainUnitCountNew()) continue;
                assistUnitExchange.setMainUnitCountNew(assistUnitExchange.getMainUnitCount());
            }
        }
    }

    private void checkSkuDatas(Product product) {
        if (product.productskus() != null) {
            for (ProductSKU sku : product.productskus()) {
                if (!sku.containsKey((Object)"productSKUDetail")) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_DETAIL_NOT_FOUND, new Object[]{sku.getCode()});
                }
                sku.productSKUDetail().setEntityStatus(EntityStatus.Insert);
            }
        }
    }

    private void setAutoRangeForInsert(Product product) {
        if (product.containsKey((Object)"autoGenerateRangeData_") && product.get("autoGenerateRangeData_").equals(false)) {
            if (product.productOrgs() != null) {
                int creators = 0;
                for (ProductApplyRange range : product.productOrgs()) {
                    if (range.containsKey((Object)"isCreator") && range.getIsCreator().booleanValue()) {
                        String orgId = range.getOrgId();
                        String creatOrg = product.getOrgId();
                        if (creatOrg != null && !creatOrg.equals(orgId)) {
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CREATE_ORG_DIFFERENT);
                        }
                        ++creators;
                    }
                    range.setId((Object)IdManager.getInstance().nextId());
                    range.setRangeType(Integer.valueOf(1));
                    range.setProductId((Long)product.getId());
                    range.setTenant((Long)AppContext.getTenantId());
                    range.setEntityStatus(EntityStatus.Insert);
                    if (!range.getIsCreator().equals(true) || product.detail() == null) continue;
                    product.detail().setId(product.getId());
                    product.detail().setProductApplyRangeId((Long)range.getId());
                    product.detail().setTenant((Long)AppContext.getTenantId());
                    product.setEntityStatus(EntityStatus.Insert);
                }
                if (creators == 0) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_TABLE_HAS_NOT_CREATE_ORG);
                }
                if (creators > 1) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_TABLE_HAS_MULTI_CREATE_ORG);
                }
            }
        } else if (product.productOrgs() == null && ProductUtil.checkUserTyoe(AppContext.getCurrentUser()) != 3) {
            ProductApplyRange org = new ProductApplyRange();
            org.setProductId((Long)product.getId());
            org.setId((Object)IdManager.getInstance().nextId());
            org.setEntityStatus(EntityStatus.Insert);
            org.setRangeType(Integer.valueOf(1));
            if (product.getOrgId() == null) {
                org.setOrgId(AppContext.getCurrentUser().getOrgId());
            } else {
                org.setOrgId(product.getOrgId());
            }
            org.setIsCreator(Boolean.valueOf(true));
            org.setIsApplied(Boolean.valueOf(true));
            ArrayList<ProductApplyRange> orgs = new ArrayList<ProductApplyRange>();
            orgs.add(org);
            product.setProductOrgs(orgs);
        }
    }

    private void dealTimeData(Product product) {
        if (product.time() == null) {
            ProductDepositTimeExtend time = new ProductDepositTimeExtend();
            time.setProductId((Long)product.getId());
            time.setIControlTime(Boolean.valueOf(false));
            time.setControlTimeType(Integer.valueOf(0));
            time.setId((Object)IdManager.getInstance().nextId());
            time.setEntityStatus(EntityStatus.Insert);
            product.setTime(time);
        } else if (product.time().getId() == null) {
            product.time().setProductId((Long)product.getId());
            product.time().setId((Object)IdManager.getInstance().nextId());
            product.time().setEntityStatus(EntityStatus.Insert);
        }
    }

    private void dealDefaultValueForInsert(Product product) {
        if (product.detail().get("stopstatus") == null) {
            product.detail().put("stopstatus", (Object)false);
        }
        if (product.detail().get("billingUnit") == null) {
            product.detail().put("billingUnit", (Object)product.getUnit());
        }
        if (product.detail().get("businessAttribute") != null) {
            this.dealBusinessAttribute(product);
        }
        if (product.detail().get("inspectionType") == null) {
            product.detail().set("inspectionType", (Object)0);
        }
        if (product.detail().get("fullSetInspection") == null) {
            product.detail().set("fullSetInspection", (Object)0);
        }
        if (product.detail().get("workingPlan") == null) {
            product.detail().set("workingPlan", (Object)false);
        }
        if (product.detail().get("ECNControl") == null) {
            product.detail().set("ECNControl", (Object)false);
        }
    }

    private void dealBusinessAttribute(Product product) {
        if (!product.detail().containsKey((Object)"saleChannel") && product.detail().get("businessAttribute") != null && StringUtils.contains((CharSequence)product.detail().get("businessAttribute").toString(), (CharSequence)String.valueOf(BusinessAttributeEnum.SALE.getValue()))) {
            if (product.get("realProductAttributeType") != null && StringUtils.contains((CharSequence)product.get("realProductAttributeType").toString(), (CharSequence)String.valueOf(RealProductAttributeTypeEnum.StoredCard.getValue()))) {
                product.detail().put("saleChannel", (Object)"3");
            } else {
                product.detail().put("saleChannel", (Object)"1,2");
            }
        }
        if (product.detail().get("planDefaultAttribute") == null) {
            if (product.detail().get("businessAttribute").toString().contains("1") && (product.detail().get("businessAttribute").toString().equals("1") || product.detail().get("businessAttribute").toString().contains("7"))) {
                product.detail().put("planDefaultAttribute", (Object)1);
            }
            if (!(!product.detail().get("businessAttribute").toString().contains("2") || product.detail().get("businessAttribute").toString().contains("2") && product.detail().get("businessAttribute").toString().contains("1"))) {
                product.detail().put("planDefaultAttribute", (Object)5);
            }
            if (product.detail().get("businessAttribute").toString().contains("3")) {
                product.detail().put("planDefaultAttribute", (Object)3);
            }
        }
    }

    private void dealSingalRange(String billnum, Product product) throws Exception {
        if (this.iupcControlRuleService.checkSingleOrg().booleanValue() && !ProductSource.ExcelImport.equals((Object)product.getSource()) && !"pc_productdetail_import".equals(billnum)) {
            ArrayList<ProductApplyRange> productApplyRanges = new ArrayList<ProductApplyRange>();
            ProductApplyRange range = new ProductApplyRange();
            range.setId((Object)IdManager.getInstance().nextId());
            range.setProductId((Long)product.getId());
            range.setRangeType(Integer.valueOf(1));
            range.setIsCreator(Boolean.valueOf(true));
            range.setIsApplied(Boolean.valueOf(true));
            range.setTenant((Long)AppContext.getTenantId());
            range.setOrgId(product.getOrgId());
            range.setEntityStatus(EntityStatus.Insert);
            productApplyRanges.add(range);
            product.setProductOrgs(productApplyRanges);
        }
    }

    private void dealSingalOrg(Product product) throws Exception {
        if (EntityStatus.Insert.equals((Object)product.getEntityStatus())) {
            product.setOrgId(TreeApplyRangeUtils.getInstance().getDefaultOrg(this.iupcControlRuleService, product.getOrgId()));
        }
        if (4 == AppContext.getCurrentUser().getUserType().getValue() || 5 == AppContext.getCurrentUser().getUserType().getValue()) {
            if (AppContext.getCurrentUser().get("singleOrgId") != null) {
                product.setShop(Long.valueOf(Long.parseLong(AppContext.getCurrentUser().get("singleOrgId").toString())));
                product.set("productApplyRange_OrgId", (Object)Long.parseLong(AppContext.getCurrentUser().get("singleOrgId").toString()));
            }
            if (EntityStatus.Insert.equals((Object)product.getEntityStatus())) {
                this.setCurrentShop(product);
            }
        } else if (this.iupcControlRuleService.checkSingleOrg().booleanValue() && AppContext.getCurrentUser().get("singleOrgId") != null) {
            product.set("productApplyRange_OrgId", (Object)Long.parseLong(AppContext.getCurrentUser().get("singleOrgId").toString()));
        }
    }

    private void fillDbValues(BillContext billContext, Product product, Map productInDb) throws Exception {
        if (product.get("unit") == null) {
            product.set("unit", productInDb.get("unit"));
        }
        if (product.get("orgId") == null) {
            product.set("orgId", productInDb.get("orgId"));
        }
        if (!product.containsKey((Object)"createDate")) {
            product.set("createDate", (Object)((Date)productInDb.get("createDate")));
        }
        if (product.get("transType") == null) {
            product.set("transType", productInDb.get("transType"));
        }
        if (product.get("lifeCycleTemplate") == null) {
            product.set("lifeCycleTemplate", productInDb.get("lifeCycleTemplate"));
        }
        if (product.get("isOptionalMaterial") == null) {
            product.set("isOptionalMaterial", productInDb.get("isOptionalMaterial"));
            if (product.getProductTemplate() == null) {
                product.set("productTemplate", productInDb.get("productTemplate"));
            }
        } else if (productInDb.get("isOptionalMaterial") == null || !product.get("isOptionalMaterial").toString().equals(productInDb.get("isOptionalMaterial").toString())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_ALLOW_UPDATE_OPTIONAL_FIELD, new Object[]{product.getCode()});
        }
        if (product.get("isDerivedMaterial") == null) {
            product.set("isDerivedMaterial", productInDb.get("isDerivedMaterial"));
        }
        if (product.get("optionalMaterialId") == null) {
            product.set("optionalMaterialId", productInDb.get("optionalMaterialId"));
        }
        if (product.get("homepageBusinessId") == null) {
            product.set("homepageBusinessId", productInDb.get("homepageBusinessId"));
        }
        if (product.get("imgBusinessId") == null) {
            product.set("imgBusinessId", productInDb.get("imgBusinessId"));
        }
        if (product.get("videoBusinessId") == null) {
            product.set("videoBusinessId", productInDb.get("videoBusinessId"));
        }
        if (product.containsKey((Object)"isRegistrationManager") && product.get("isRegistrationManager") == null) {
            product.put("isRegistrationManager", productInDb.get("isRegistrationManager"));
        }
        if (product.containsKey((Object)"isAuthorizationManager") && product.get("isAuthorizationManager") == null) {
            product.put("isAuthorizationManager", productInDb.get("isAuthorizationManager"));
        }
        if (product.containsKey((Object)"productFamily") && product.get("productFamily") == null) {
            product.put("productFamily", productInDb.get("productFamily"));
        }
        if (product.containsKey((Object)"useSku") && product.get("useSku") == null) {
            product.put("useSku", productInDb.get("useSku"));
        }
        if ("pc_productdetail_import".equals(billContext.getBillnum())) {
            this.productDefaultValueService.setMainDataForProductDetailImport(product, productInDb);
            this.transpreferentialPolicyTypeName(product);
        }
        if (!product.containsKey((Object)"code")) {
            product.put("code", productInDb.get("code"));
        }
        if (!product.containsKey((Object)"realProductAttributeType")) {
            product.set("realProductAttributeType", productInDb.get("realProductAttributeType"));
        }
        if (!product.containsKey((Object)"virtualProductAttribute")) {
            product.set("virtualProductAttribute", productInDb.get("virtualProductAttribute"));
        }
    }

    private Map<String, Object> getProductExtendDBList(Product product) throws Exception {
        List productExtendDBList = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)QuerySchema.create().addSelect("id, isSerialNoManage, isProcess, saleChannel,valueManageType, isBatchManage, checkByBatch,costValuation,isExpiryDateManage, iStatus, iUOrderStatus,returnsWarehousingByResult,purchaseUnit,stockUnit,batchUnit,onlineUnit,offlineUnit,requireUnit,batchPriceUnit,produceUnit,purchasePriceUnit,inspectionUnit,demandPlanningUnit,isBarcodeManage,manageByInventory,bindCarrier,workingPlan,projectTrackStrategy,logisticsRelated,fixedReturn,reviewGrossWeight,specialCarTransport,mtoStrategy,strategyComparisonRule,reservation,inspectionType,planDefaultAttribute,isDisplayPrice,canSale,warehousingByResult,ECNControl,fullSetInspection,keySubPart,specialMaterials,virtualPart,prepareFeed,iEnableCyclePurchase,isRecommend,enableSparePartsManagement,saleChannelOfOfflineRetail,manageByInventory,checkByProject,checkBySalesOrders,checkByOutsourcing,checkByClient,singleInspection,testRule,overSigning,checkByRevenueManagement,atpInspection,businessAttribute").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"isCreator").eq((Object)true)})));
        if (ObjectUtils.isEmpty((Object)productExtendDBList)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_EXTEND_NOT_FOUND, new Object[]{product.getCode()});
        }
        if (productExtendDBList.size() > 1) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_EXTEND_TOO_MUCH, new Object[]{product.getCode()});
        }
        return (Map)productExtendDBList.get(0);
    }

    private boolean detailFieldIsModified(ProductExtend detail, ProductDetail detailDB, Map extendDB, String field) {
        boolean isModified = false;
        if (ObjectUtils.isNotEmpty((Object)detail) && ObjectUtils.isNotEmpty((Object)detail.get(field))) {
            if (ObjectUtils.isNotEmpty((Object)detailDB)) {
                return detailDB.get(field) != null && !detail.get(field).toString().equals(detailDB.get(field).toString());
            }
            if (ObjectUtils.isNotEmpty((Object)extendDB)) {
                return extendDB.get(field) != null && !detail.get(field).toString().equals(extendDB.get(field).toString());
            }
        }
        return isModified;
    }

    private boolean detailFieldIsModified4Null(ProductExtend detail, ProductDetail detailDB, Map extendDB, String field) {
        boolean isModified = false;
        if (ObjectUtils.isNotEmpty((Object)detail) && ObjectUtils.isNotEmpty((Object)detail.get(field))) {
            if (ObjectUtils.isNotEmpty((Object)detailDB)) {
                return null == detailDB.get(field) || !detail.get(field).toString().equals(detailDB.get(field).toString());
            }
            if (ObjectUtils.isNotEmpty((Object)extendDB)) {
                return null == extendDB.get(field) || !detail.get(field).toString().equals(extendDB.get(field).toString());
            }
        }
        return isModified;
    }

    private void checkProductRefence(BillContext billContext, Map<String, Object> paramMap, Product product) throws Exception {
        HashMap<String, Object> originalParamMap = new HashMap<String, Object>(paramMap);
        if (product.containsKey((Object)"unit") && product.get("unit") != null) {
            QuerySchema querySchema = QuerySchema.create().addSelect("id,unit,orgId, if unitUseType = 2 then productAssistUnitExchanges.unitExchangeType else productTemplate.productTplAssistUnitExchanges.unitExchangeType end as unitExchangeType,if unitUseType = 2 then productAssistUnitExchanges.assistUnit else productTemplate.productTplAssistUnitExchanges.assistUnit end as assistUnit").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)product.getId().toString())}));
            List queryResult = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)querySchema);
            if (!product.get("unit").equals(((Map)queryResult.get(0)).get("unit"))) {
                HashMap<String, Object> tempMap = new HashMap<String, Object>();
                JsonObject json = new JsonObject();
                BillDataDto checkBillDataDto = new BillDataDto();
                checkBillDataDto.setBillnum("pc_product");
                checkBillDataDto.setData((Object)queryResult);
                json.addProperty("key", "unit_Name");
                checkBillDataDto.setItem(json.toString());
                this.pubOptionService.prepareCheckParam(checkBillDataDto, "unit_Name");
                tempMap.put("param", checkBillDataDto);
                try {
                    log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080255", (String)"\u5f00\u59cb\u9488\u5bf9\u8ba1\u91cf\u5355\u4f4d\u53d8\u66f4\u8fdb\u884c\u9886\u57df\u6821\u9a8c\uff0c\u65f6\u95f4\u662f") + DateKit.getCurrTime());
                    DomainReferenceFieldCheckUtils.checkDomainReference("unit_Name", billContext, tempMap, this.ymsExecutorService);
                    log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080257", (String)"\u9886\u57df\u6821\u9a8c\u7ed3\u675f\uff0c\u65f6\u95f4\u662f") + DateKit.getCurrTime());
                }
                catch (Exception e) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CAN_NOT_UPDATE_MAIN_UNIT_BECAUSE_REFERENCE_BY_DOMAIN, new Object[]{product.getCode(), e.getMessage()});
                }
                QuerySchema productextendschema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(((Map)queryResult.get(0)).get("id"))}));
                Map queryProductExtend = MetaDaoHelper.queryOne((String)"pc.product.ProductExtend", (QuerySchema)productextendschema);
                for (AssistUnitType type : AssistUnitType.values()) {
                    if (product.detail().containsKey((Object)type.toString()) && product.detail().get(type.toString()) != null || !((Map)queryResult.get(0)).get("unit").equals(queryProductExtend.get(type.toString()))) continue;
                    product.detail().put(type.toString(), (Object)product.getUnit());
                }
            }
        }
        List<Map> products = this.queryProductFieldsById((Long)product.getId());
        if (!Objects.equals(product.get("productTemplate"), products.get(0).get("productTemplate"))) {
            this.productReferenceCheckService.productCheckRule(billContext, originalParamMap, "productTemplate_Name", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A0DE8C604700004", (String)"\u7269\u6599\u6a21\u677f"));
        }
        if (!Objects.equals(product.get("realProductAttribute"), products.get(0).get("realProductAttribute"))) {
            this.productReferenceCheckService.productCheckRule(billContext, originalParamMap, "realProductAttribute", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C98A28404C0000A", (String)"\u7269\u6599\u5c5e\u6027"));
        }
        if (1 == product.getRealProductAttribute() && !Objects.equals(product.get("realProductAttributeType"), products.get(0).get("realProductAttributeType"))) {
            this.productReferenceCheckService.productCheckRule(billContext, originalParamMap, "realProductAttributeType", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C98A28404C0000C", (String)"\u5b9e\u7269\u7269\u6599\u5c5e\u6027"));
        }
        if (2 == product.getRealProductAttribute() && !Objects.equals(product.get("virtualProductAttribute"), products.get(0).get("virtualProductAttribute"))) {
            this.productReferenceCheckService.productCheckRule(billContext, originalParamMap, "virtualProductAttribute", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C98A28404C0000D", (String)"\u865a\u62df\u7269\u6599\u5c5e\u6027"));
        }
        if (!Objects.equals(Integer.valueOf(product.get("unitUseType").toString()), products.get(0).get("unitUseType"))) {
            this.productReferenceCheckService.productCheckRule(billContext, originalParamMap, "unitUseType", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C98A28404C0000E", (String)"\u8ba1\u91cf\u5355\u4f4d\u8bbe\u7f6e\u89c4\u5219"));
        }
        if (null != product.get("enableAssistUnit") && !BooleanUtil.isTrue((Object)product.get("enableAssistUnit")) && BooleanUtil.isTrue(products.get(0).get("enableAssistUnit"))) {
            this.productReferenceCheckService.productCheckRule(billContext, originalParamMap, "enableAssistUnit", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C98A28404C0000B", (String)"\u542f\u7528\u8f85\u8ba1\u91cf"));
        }
    }

    private void detailFieldNullValue(ProductExtend detail, ProductDetail detailDB, Map extendDB, Map<String, Object> fieldDefaultValueMap) {
        for (Map.Entry<String, Object> entry : fieldDefaultValueMap.entrySet()) {
            String field = entry.getKey();
            if (!ObjectUtils.isNotEmpty((Object)detail) || !ObjectUtils.isEmpty((Object)detail.get(field))) continue;
            if (ObjectUtils.isNotEmpty((Object)detailDB)) {
                detail.put(field, detailDB.get(field));
            } else {
                detail.put(field, extendDB.get(field));
            }
            if (!ObjectUtils.isEmpty((Object)detail.get(field))) continue;
            detail.put(field, entry.getValue());
        }
    }

    private ProductDetail getProductDetailDB(Product product) throws Exception {
        ProductDetail productDetail = new ProductDetail();
        if (ObjectUtils.isNotEmpty((Object)product) && ObjectUtils.isNotEmpty((Object)product.getId()) && ObjectUtils.isNotEmpty((Object)product.get("productApplyRangeId"))) {
            QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productApplyRangeId").eq(product.get("productApplyRangeId")), QueryCondition.name((String)"productId").eq(product.getId())});
            QuerySchema querySchema = QuerySchema.create().addSelect(new String[]{"id", "isBatchManage", "overSigning", "checkByRevenueManagement", "testRule", "atpInspection", "checkByBatch", "manageByInventory", "valueManageType", "costValuation", "isExpiryDateManage", "saleChannel", "businessAttribute", "isSerialNoManage"}).addCondition((ConditionExpression)conditionGroup);
            Map productDetailMap = MetaDaoHelper.queryOne((String)"pc.product.ProductDetail", (QuerySchema)querySchema);
            productDetail.init(productDetailMap);
        }
        return productDetail;
    }

    public void checkClassCanUsed(String orgId, Long classId, String fullname, String showCaption, String productCode) throws Exception {
        if (classId == null) {
            return;
        }
        List classes = MetaDaoHelper.query((String)fullname, (QuerySchema)QuerySchema.create().addSelect("clsId.isEnd as isEnd").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)orgId), QueryCondition.name((String)"clsId").eq((Object)classId)})));
        if (classes != null && classes.size() > 0) {
            Boolean isEnd = (Boolean)((HashMap)classes.get(0)).get("isEnd");
            if (isEnd == null || isEnd != null && !isEnd.booleanValue()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CAN_NOT_REFERENCE_NON_TERMINAL, new Object[]{productCode, showCaption});
            }
        } else if (AppContext.getCurrentUser().getUserType() != UserType.ShopAdminUser && AppContext.getCurrentUser().getUserType() != UserType.ShopUser) {
            if (this.pubOptionService.getOrgGlobalShare("pc.cls.CostClass").booleanValue() && "pc.cls.CostClassApplyRange".equals(fullname)) {
                QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq((Object)classId)}));
                List costClassList = MetaDaoHelper.query((String)fullname, (QuerySchema)querySchema);
                if (CollectionUtils.isEmpty((Collection)costClassList)) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_COST_CATEGORY_NOT_FOUND, new Object[]{productCode});
                }
            } else {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CREATE_ORG_NOT_FOUND, new Object[]{productCode, showCaption});
            }
        }
    }

    private void processRealProductAttribute(Product product) {
        if (product.getRealProductAttribute() != null) {
            if (1 == product.getRealProductAttribute()) {
                if (null == product.getRealProductAttributeType()) {
                    product.put("realProductAttributeType", (Object)1);
                }
                product.put("virtualProductAttribute", null);
                if (null == product.detail().getValueManageType()) {
                    product.detail().put("valueManageType", (Object)0);
                }
            }
            if (2 == product.getRealProductAttribute()) {
                if (null == product.getVirtualProductAttribute()) {
                    product.put("virtualProductAttribute", (Object)7);
                }
                product.put("realProductAttributeType", null);
            }
        }
    }

    public void dealUnitPrecision(Product product) throws Exception {
        for (String checkUnit : PRODUCT_UNIT_CHECK) {
            if (product.get(checkUnit + "Unit") == null || product.get(checkUnit) == null) continue;
            BigDecimal value = (BigDecimal)product.get(checkUnit);
            BigDecimal check_value = new BigDecimal(value.stripTrailingZeros().toPlainString());
            QueryConditionGroup batchUnitGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.get(checkUnit + "Unit"))});
            QuerySchema batchUnitSchema = QuerySchema.create().addSelect("precision").addCondition((ConditionExpression)batchUnitGroup);
            List batchUnits = MetaDaoHelper.query((String)"pc.unit.Unit", (QuerySchema)batchUnitSchema);
            if (batchUnits == null || batchUnits.isEmpty()) continue;
            int precision = (Integer)((Map)batchUnits.get(0)).get("precision");
            if (check_value != null && check_value.scale() > precision) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_UNIT_PRECISION_ERROR_BY_WEIGHT_OR_VOLUME, new Object[]{product.getCode()});
            }
            if (null == product.productskus()) continue;
            List productskus = product.productskus();
            for (ProductSKU sku : productskus) {
                BigDecimal checkSku_value;
                if (sku.get(checkUnit) == null || (checkSku_value = (BigDecimal)sku.get(checkUnit)) == null || checkSku_value.scale() <= precision) continue;
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_UNIT_PRECISION_ERROR_BY_WEIGHT_OR_VOLUME, new Object[]{sku.getCode()});
            }
        }
    }

    public void dealBusDataUnitPrecision(Product product) throws Exception {
        if (product.get("unit") == null) {
            return;
        }
        QueryConditionGroup unitGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.get("unit"))});
        QuerySchema unitSchema = QuerySchema.create().addSelect("precision").addCondition((ConditionExpression)unitGroup);
        List batchUnits = MetaDaoHelper.query((String)"pc.unit.Unit", (QuerySchema)unitSchema);
        HashMap<String, 2> PRODUCT_UNIT = new HashMap<String, 2>();
        HashMap<String, String> unitMap = new HashMap<String, String>(16){
            {
                this.put("iDoubleSale", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_20533C7A04D00011", (String)"\u9500\u552e\u500d\u91cf"));
                this.put("safetyStock", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_20533C7A04D00012", (String)"\u5b89\u5168\u5e93\u5b58"));
                this.put("highestStock", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_20533C7A04D00013", (String)"\u6700\u9ad8\u5e93\u5b58"));
                this.put("lowestStock", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_20533C7A04D00014", (String)"\u6700\u4f4e\u5e93\u5b58"));
                this.put("purchaseOrderQuantity", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_20533C7A04D00015", (String)"\u91c7\u8d2d\u8d77\u8ba2\u91cf"));
                this.put("purchaseTimes", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_20533C7A04D00016", (String)"\u91c7\u8d2d\u500d\u91cf"));
                this.put("iMinOrderQuantity", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_20533C7A04D00017", (String)"\u8d77\u8ba2\u91cf"));
                this.put("doublePick", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_20533C7A04D00018", (String)"\u9886\u6599\u500d\u91cf"));
                this.put("ropStock", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_20533C7A04D00019", (String)"\u518d\u8ba2\u8d27\u70b9"));
                this.put("economicQuantity", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_20533C7A04D0001A", (String)"\u7ecf\u6d4e\u6279\u91cf"));
                this.put("fixedQuantity", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_20533C7A04D0001B", (String)"\u56fa\u5b9a\u6279\u91cf"));
                this.put("batchDouble", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_20533C7A04D0000E", (String)"\u6279\u91cf\u500d\u91cf"));
                this.put("leadTimeQuantity", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_20533C7A04D0000F", (String)"\u63d0\u524d\u671f\u6279\u91cf"));
            }
        };
        PRODUCT_UNIT.put("unit", unitMap);
        for (Map.Entry entry : ((Map)PRODUCT_UNIT.get("unit")).entrySet()) {
            String checkData = (String)entry.getKey();
            String checkAttName = (String)entry.getValue();
            if (product.detail().get((String)entry.getKey()) == null) continue;
            BigDecimal value = (BigDecimal)product.detail().get(checkData);
            BigDecimal check_value = new BigDecimal(value.stripTrailingZeros().toPlainString());
            if (batchUnits == null || batchUnits.isEmpty()) continue;
            int precision = (Integer)((Map)batchUnits.get(0)).get("precision");
            if (check_value.scale() > precision) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_UNIT_PRECISION_ERROR_BY_OTHER, new Object[]{product.getCode(), checkAttName});
            }
            if (null == product.productskus()) continue;
            List productskus = product.productskus();
            for (ProductSKU sku : productskus) {
                BigDecimal checkSku_value;
                if (sku.productSKUDetail() == null || sku.productSKUDetail().get(checkData) == null || (checkSku_value = (BigDecimal)sku.productSKUDetail().get(checkData)).scale() <= precision) continue;
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_UNIT_PRECISION_ERROR_BY_OTHER, new Object[]{sku.getCode(), checkAttName});
            }
        }
    }

    private void dealProductWarehouse(Product product, BillContext billContext) throws Exception {
        boolean isRangeBill;
        HashMap<String, String> PRODUCT_WAREHOUSE = new HashMap<String, String>(3);
        PRODUCT_WAREHOUSE.put("deliveryWarehouse", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080269", (String)"\u53d1\u8d27\u4ed3\u5e93"));
        PRODUCT_WAREHOUSE.put("returnWarehouse", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408026A", (String)"\u9000\u8d27\u4ed3\u5e93"));
        PRODUCT_WAREHOUSE.put("receiptWarehouse", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408026C", (String)"\u6536\u8d27\u4ed3\u5e93"));
        HashMap<String, String> PRODUCT_PRODUCTVENDOR = new HashMap<String, String>(1);
        PRODUCT_PRODUCTVENDOR.put("productVendor", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408026E", (String)"\u4f9b\u5e94\u5546"));
        String orgId = product.getOrgId();
        boolean bl = isRangeBill = "pc_productdetail".equals(billContext.getBillnum()) || "pc_productdetail_import".equals(billContext.getBillnum());
        if (isRangeBill) {
            if (product.get("productApplyRange_OrgId") != null) {
                orgId = product.get("productApplyRange_OrgId").toString();
            } else if (product.get("productApplyRange_orgId") != null) {
                orgId = product.get("productApplyRange_orgId").toString();
            }
        }
        if (!"666666".equals(orgId)) {
            String tenantId = AppContext.getTenantId() + "";
            ProductExtend detail = product.detail();
            if (null != detail) {
                for (Map.Entry entry : PRODUCT_WAREHOUSE.entrySet()) {
                    if (null == detail.get((String)entry.getKey()) || this.checkWarehouseIsLegal(Long.parseLong(detail.get((String)entry.getKey()).toString()), orgId)) continue;
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_FOUND_IN_CURRENT_ORG, new Object[]{product.getCode(), entry.getValue()});
                }
                for (Map.Entry entry : PRODUCT_PRODUCTVENDOR.entrySet()) {
                    boolean isJudge;
                    if (null == detail.get((String)entry.getKey()) || (isJudge = this.vendorPubQueryService.judgeVendorOrgV2((Long)detail.get((String)entry.getKey()), orgId))) continue;
                    HashSet<Object> productVendors = new HashSet<Object>();
                    productVendors.add(detail.get((String)entry.getKey()));
                    List<Map> productVendorValues = this.upcProductQueryService.getCrossDomainFieldValues(productVendors, "aa.vendor.Vendor", "yssupplier", "id", "code", "name");
                    String productVendorCode = null != productVendorValues ? productVendorValues.get(0).get("code").toString() : (String)detail.get((String)entry.getKey());
                    OrgUnitDTO orgUnitDTO = this.orgService.getOrgByOrgId(orgId);
                    String orgCode = null != orgUnitDTO ? orgUnitDTO.getCode() : orgId;
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_VENDOR_NOT_FOUND_IN_CURRENT_ORG, new Object[]{product.getCode(), productVendorCode, orgCode});
                }
            }
        }
    }

    private boolean checkWarehouseIsLegal(Long warehouseId, String orgId) throws Exception {
        boolean flag = false;
        if (warehouseId != null && StringUtils.isNotEmpty((CharSequence)orgId)) {
            WarehouseModel warehouseModel;
            WarehouseQueryParam warehouseQueryParam = new WarehouseQueryParam();
            warehouseQueryParam.setId(warehouseId);
            warehouseQueryParam.setCust(this.getShopId());
            List warehouseModels = this.warehouseQueryService.queryWarehouses(warehouseQueryParam);
            if (ObjectUtils.isNotEmpty((Object)warehouseModels) && (warehouseModel = (WarehouseModel)warehouseModels.get(0)) != null) {
                if (warehouseModel.getOrgId() == null) {
                    flag = true;
                } else if (ObjectUtils.isNotEmpty((Object)warehouseModel.getStocks())) {
                    List orgIds = warehouseModel.getStocks().stream().filter(v -> v != null && v.getOrgId() != null).map(WarehouseStockModel::getOrgId).collect(Collectors.toList());
                    BizDelegateApi bizDelegateApi = (BizDelegateApi)IrisDynamicInvokeUtil.getService((String)"orgcenter", (String)"orgcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, BizDelegateApi.class);
                    List stockOrgIds = bizDelegateApi == null ? null : bizDelegateApi.listInventoryOrgIdsBySalesOrgIdList(Collections.singletonList(orgId), (String)AppContext.getYhtTenantId(), "diwork");
                    HashSet stockOrgIdSet = new HashSet(stockOrgIds);
                    HashSet orgIdSet = new HashSet(orgIds);
                    orgIdSet.retainAll(stockOrgIdSet);
                    if (orgIds.contains(orgId) || ObjectUtils.isNotEmpty((Object)stockOrgIds) && ObjectUtils.isNotEmpty(orgIdSet)) {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    private String getShopId() {
        boolean isshop;
        String shopId = null;
        boolean bl = isshop = UserType.ShopAdminUser == AppContext.getCurrentUser().getUserType() || UserType.ShopUser == AppContext.getCurrentUser().getUserType();
        if (isshop) {
            shopId = AppContext.getCurrentUser().getDocId();
        }
        return shopId;
    }

    private void transpreferentialPolicyTypeName(Product product) {
        block5: {
            if (Objects.nonNull(product) && product.detail().get("preferentialPolicyType_Name") != null) {
                try {
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.getId())});
                    QuerySchema schema = QuerySchema.create().addSelect("taxClass").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{queryConditionGroup}));
                    Map productMap = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)schema);
                    if (Objects.nonNull(productMap) && productMap.containsKey("taxClass")) {
                        QueryConditionGroup queryTaxRevenueCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"taxRevenue").eq(productMap.get("taxClass")), QueryCondition.name((String)"name").eq(product.detail().get("preferentialPolicyType_Name"))});
                        QuerySchema taxSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{queryTaxRevenueCondition}));
                        Map tax = MetaDaoHelper.queryOne((String)"pc.tax.TaxRevenuePolicy", (QuerySchema)taxSchema);
                        if (tax != null && tax.containsKey("id")) {
                            product.detail().setPreferentialPolicyType(Long.valueOf(String.valueOf(tax.get("id"))));
                        }
                        break block5;
                    }
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_FOUND_TAX_CLASS_CODE);
                }
                catch (Exception e) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_FOUND_TAX_CLASS_CODE_ERROR);
                }
            }
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
        shop.setId((Object)IdManager.getInstance().nextId());
        shop.setRangeType(Integer.valueOf(3));
        shop.setShopId(AppContext.getCurrentUser().getShop());
        shop.setOrgId(AppContext.getCurrentUser().getShop().toString());
        shop.setIsCreator(Boolean.valueOf(true));
        shop.setIsApplied(Boolean.valueOf(true));
        shop.set("shopCode", map.get("code"));
        shop.set("shopName", map.get("name"));
        shop.set("customerId", (Object)AppContext.getCurrentUser().getShop());
        ArrayList<ProductApplyRange> shops = new ArrayList<ProductApplyRange>();
        shops.add(shop);
        product.setProductShops(shops);
    }

    public void modifyFieldReferenceCheck(BillContext billContext, Map<String, Object> paramMap, Product product) throws Exception {
        ProductExtend productDetail = product.detail();
        ProductDetail productDetailDB = this.getProductDetailDB(product);
        Map<String, Object> productExtendDB = this.getProductExtendDBList(product);
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        HashMap<String, Object> originalParamMap = new HashMap<String, Object>(paramMap);
        if (this.detailFieldIsModified(productDetail, productDetailDB, productExtendDB, "atpInspection")) {
            this.pubOptionService.prepareCheckParam(billDataDto, "atpInspection");
            this.productReferenceCheckService.productCheckRule(billContext, originalParamMap, "detail!atpInspection", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C3F10EC04880003", (String)"ATP\u68c0\u67e5"));
        }
        if (this.detailFieldIsModified4Null(productDetail, productDetailDB, productExtendDB, "costValuation")) {
            this.productReferenceCheckService.costValuationCheckRule(billContext, originalParamMap);
        }
        if (this.detailFieldIsModified4Null(productDetail, productDetailDB, productExtendDB, "isExpiryDateManage")) {
            this.productReferenceCheckService.productCheckRule(billContext, originalParamMap, "detail!isExpiryDateManage", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1E3F4E7C05380009", (String)"\u6709\u6548\u671f\u7ba1\u7406"));
        }
        if (this.detailFieldIsModified(productDetail, productDetailDB, productExtendDB, "isSerialNoManage")) {
            this.pubOptionService.prepareCheckParam(billDataDto, "isSerialNoManage");
            this.productReferenceCheckService.productCheckRule(billContext, originalParamMap, "detail!isSerialNoManage", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_20533C7A04D00010", (String)"\u5e8f\u5217\u53f7\u7ba1\u7406"));
        }
    }

    static {
        PRODUCT_UNIT_CHECK.add("weight");
        PRODUCT_UNIT_CHECK.add("netWeight");
        PRODUCT_UNIT_CHECK.add("volume");
    }
}

