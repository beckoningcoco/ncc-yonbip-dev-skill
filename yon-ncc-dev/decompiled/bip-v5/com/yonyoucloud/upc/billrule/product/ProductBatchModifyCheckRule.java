/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.hrcloud.employeedoc.addressbook.BaseResponse
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.billcode.model.QueryBillNumberParam
 *  com.yonyou.iuap.billcode.po.BillNumberPO
 *  com.yonyou.iuap.billcode.po.BillPrefixPO
 *  com.yonyou.iuap.billcode.service.IBillNumberService
 *  com.yonyou.iuap.ml.provider.ILanguageProvider
 *  com.yonyou.iuap.ml.vo.LanguageVO
 *  com.yonyou.iuap.org.service.itf.core.DeptCheckApi
 *  com.yonyou.iuap.staff.model.PtJobInfoDto
 *  com.yonyou.iuap.staff.model.StaffInfoListDto
 *  com.yonyou.iuap.staff.model.StaffInfoQueryParam
 *  com.yonyou.iuap.staff.service.StaffInfoQueryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.ucf.common.ml.MultiLangContext
 *  com.yonyou.uap.billcode.BillCodeComponentParam
 *  com.yonyou.uap.billcode.BillCodeObj
 *  com.yonyou.uap.billcode.service.IBillCodeComponentService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.rule.RuleRegister
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.iuap.upc.api.IUnitService
 *  com.yonyoucloud.iuap.upc.dto.UnitDTO
 *  com.yonyoucloud.upc.common.enums.ValueManageTypeEnum
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.product.ProductSkuDetailNew
 *  com.yonyoucloud.upc.pc.product.RealProductAttributeTypeEnum
 *  com.yonyoucloud.upc.pc.product.UnitUseTypeEnum
 *  com.yonyoucloud.upc.pc.product.VirtualProductAttributeEnum
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  com.yonyoucloud.upc.utils.MathDataUtils
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.imeta.core.base.ConditionOperator
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
 *  org.springframework.stereotype.Component
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationAdapter
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.alibaba.fastjson.JSON;
import com.yonyou.hrcloud.employeedoc.addressbook.BaseResponse;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.billcode.model.QueryBillNumberParam;
import com.yonyou.iuap.billcode.po.BillNumberPO;
import com.yonyou.iuap.billcode.po.BillPrefixPO;
import com.yonyou.iuap.billcode.service.IBillNumberService;
import com.yonyou.iuap.ml.provider.ILanguageProvider;
import com.yonyou.iuap.ml.vo.LanguageVO;
import com.yonyou.iuap.org.service.itf.core.DeptCheckApi;
import com.yonyou.iuap.staff.model.PtJobInfoDto;
import com.yonyou.iuap.staff.model.StaffInfoListDto;
import com.yonyou.iuap.staff.model.StaffInfoQueryParam;
import com.yonyou.iuap.staff.service.StaffInfoQueryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.ucf.common.ml.MultiLangContext;
import com.yonyou.uap.billcode.BillCodeComponentParam;
import com.yonyou.uap.billcode.BillCodeObj;
import com.yonyou.uap.billcode.service.IBillCodeComponentService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.rule.RuleRegister;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.IUnitService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import com.yonyoucloud.iuap.upc.dto.UnitDTO;
import com.yonyoucloud.upc.billrule.goodsAchive.ProductSKUShelveRule;
import com.yonyoucloud.upc.billrule.product.ProductAPIProcessRule;
import com.yonyoucloud.upc.billrule.product.ProductFieldCheckRule;
import com.yonyoucloud.upc.billrule.productsku.ProductSkuBeforeSaveRule;
import com.yonyoucloud.upc.common.enums.ValueManageTypeEnum;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.product.ProductSkuDetailNew;
import com.yonyoucloud.upc.pc.product.RealProductAttributeTypeEnum;
import com.yonyoucloud.upc.pc.product.UnitUseTypeEnum;
import com.yonyoucloud.upc.pc.product.VirtualProductAttributeEnum;
import com.yonyoucloud.upc.service.ProductBusCheckService;
import com.yonyoucloud.upc.service.ProductCheckService;
import com.yonyoucloud.upc.service.ProductReferenceCheckService;
import com.yonyoucloud.upc.service.UseSkuService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.utils.MathDataUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.imeta.core.base.ConditionOperator;
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
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;

@Component(value="productBatchModifyCheckRule")
public class ProductBatchModifyCheckRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(ProductBatchModifyCheckRule.class);
    @Autowired
    ProductCheckService productCheckService;
    @Autowired
    IUnitService unitService;
    @Autowired
    ProductSkuBeforeSaveRule productSkuBeforeSaveRule;
    @Autowired
    ILanguageProvider languageProvider;
    @Autowired
    DeptCheckApi deptCheckApi;
    private static HashMap<String, String> NATURAL_NUMBER_FIELDS;
    private static final List<Map<String, String>> CHECK_ORG_FIELDS;
    private static String FIELDNAME;
    private static String ORGIDKEY;
    private static String CLASSNAME;
    private static String DOMAIN;
    private static final List<String> REPEAT_CHECK_FIELD;
    private static final Map<String, String> REPEAT_COLUMN_MAP;
    @Autowired
    private IUPCProductQueryService upcProductQueryService;
    @Autowired
    private ProductBusCheckService productBusCheckService;
    @Autowired
    private ProductAPIProcessRule productAPIProcessRule;
    @Autowired
    UseSkuService useSkuService;
    @Autowired
    ProductSKUShelveRule productSKUShelveRule;
    @Autowired
    private IBillCodeComponentService billCodeComponentService;
    @Autowired
    private IBillNumberService billCodeRuleMgrService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    ProductReferenceCheckService productReferenceCheckService;
    @Autowired
    StaffInfoQueryService staffInfoQueryService;
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;
    @Autowired
    ProductCheckService checkService;

    /*
     * WARNING - void declaration
     */
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800137);
        }
        List bills = this.getBills(billContext, paramMap);
        for (BizObject bill : bills) {
            QuerySchema querySchema;
            Integer n;
            String string;
            List ranges;
            RuleExecuteResult ruleResult;
            bill.put("fromBatchModify_", (Object)true);
            Map modifyField = (Map)billDataDto.getExternalData();
            if ("pc_goodsproductskuprolist".equals(billContext.getBillnum())) {
                this.extracted(billContext, bill, modifyField);
                continue;
            }
            if (!"pc_productlist".equals(billContext.getBillnum()) && !"pc_productlist_query".equals(billContext.getBillnum())) continue;
            Product product = (Product)bill;
            if ("pc_productlist_query".equals(billContext.getBillnum())) {
                this.removeId(product);
            }
            product.setIsBatch(Integer.valueOf(1));
            String productName = (String)MultilangUtil.getAttr((String)"pc.product.Product", (String)"name", (BizObject)product, (String)"zh_CN");
            if (null == productName) {
                String defaultLocale = MultiLangContext.getInstance().getDefaultLocaleCode();
                productName = (String)MultilangUtil.getAttr((String)"pc.product.Product", (String)"name", (BizObject)product, (String)defaultLocale);
            }
            if (product.detail() != null) {
                for (Map.Entry entry : this.getNaturalNumberFields().entrySet()) {
                    if (!product.detail().containsKey(entry.getKey()) || product.detail().get((String)entry.getKey()) == null || new BigDecimal(product.detail().get((String)entry.getKey()).toString()).compareTo(BigDecimal.ZERO) >= 0) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800260, new Object[]{productName, entry.getValue(), product.detail().get((String)entry.getKey())});
                }
                if (modifyField != null) {
                    List highestStockListDel;
                    Object schemadelete;
                    QueryConditionGroup condition;
                    Object v;
                    List productDetails;
                    List products;
                    int iOrder;
                    Object planMethod;
                    Map planClassMap;
                    if (modifyField.containsKey("planClass_Name")) {
                        if (!modifyField.containsKey("planClass")) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800261);
                        }
                        planClassMap = MetaDaoHelper.queryOne((String)"pc.cls.PlanClass", (QuerySchema)QuerySchema.create().addSelect("1").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(modifyField.get("planClass")), QueryCondition.name((String)"isEnd").eq((Object)"1")})));
                        if (planClassMap == null) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800262, new Object[]{modifyField.get("planClass_Name").toString()});
                        }
                    }
                    if ((modifyField.containsKey("taxClass") || modifyField.containsKey("taxClass_Code") || modifyField.containsKey("taxClass_Name")) && product.detail() != null && product.detail().getPreferentialPolicyType() != null) {
                        product.detail().setPreferentialPolicyType(null);
                    }
                    if (modifyField.containsKey("productClass_Name")) {
                        if (!modifyField.containsKey("productClass")) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800263);
                        }
                        planClassMap = MetaDaoHelper.queryOne((String)"pc.cls.PresentationClass", (QuerySchema)QuerySchema.create().addSelect("1").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(modifyField.get("productClass")), QueryCondition.name((String)"isEnd").eq((Object)"1")})));
                        if (planClassMap == null) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800264, new Object[]{modifyField.get("productClass_Name").toString()});
                        }
                    }
                    if (modifyField.containsKey("detail!warehousingByResult") && BooleanUtil.isTrue(modifyField.get("detail!warehousingByResult")) && product.detail().get("inspectionType") != null && BooleanUtil.isFalse((Object)product.detail().get("inspectionType"))) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800265);
                    }
                    if (!modifyField.containsKey("detail!demandConsolidation") && (modifyField.containsKey("detail!demandConsolidationType") || modifyField.containsKey("detail!demandConsolidationUnit") || modifyField.containsKey("detail!demandConsolidationNumber")) && (product.detail().get("demandConsolidation") == null || product.detail().get("demandConsolidation") != null && "0".equals(product.detail().get("demandConsolidation").toString()))) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800266);
                    }
                    if (modifyField.containsKey("detail!warehousingByResult") && BooleanUtil.isTrue(modifyField.get("detail!warehousingByResult")) && product.detail().get("inspectionType") != null && BooleanUtil.isFalse((Object)product.detail().get("inspectionType"))) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800265);
                    }
                    if (modifyField.containsKey("detail!planCheckDays")) {
                        this.productCheckService.checkPlanCheckDays(product);
                    }
                    if (modifyField.containsKey("detail!saleChannel")) {
                        Object value = modifyField.get("detail!saleChannel");
                        if (!Objects.isNull(value) && product.detail().get("businessAttribute") != null && !product.detail().get("businessAttribute").toString().contains("7")) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800267, new Object[]{product.getCode()});
                        }
                        if (!Objects.isNull(value)) {
                            Integer realProductAttributeType;
                            Integer n2 = product.getVirtualProductAttribute();
                            if (!Objects.isNull(n2)) {
                                if (VirtualProductAttributeEnum.GiftCard.getValue().equals(n2.toString()) && (value.toString().contains("1") || value.toString().contains("3"))) {
                                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800614);
                                }
                                if (VirtualProductAttributeEnum.Virtual.getValue().equals(n2.toString()) && (value.toString().contains("2") || value.toString().contains("3") || value.toString().contains("4"))) {
                                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800269, new Object[]{product.getCode()});
                                }
                            }
                            if (!Objects.isNull(realProductAttributeType = product.getRealProductAttributeType())) {
                                if (RealProductAttributeTypeEnum.VirtualMaterials.getValue().equals(realProductAttributeType.toString()) && !value.toString().contains("1")) {
                                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800271, new Object[]{product.getCode()});
                                }
                                if (RealProductAttributeTypeEnum.StoredCard.getValue().equals(realProductAttributeType.toString()) && value.toString().contains("1")) {
                                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800272, new Object[]{product.getCode()});
                                }
                                if (RealProductAttributeTypeEnum.Equipment.getValue().equals(realProductAttributeType.toString()) && (value.toString().contains("2") || value.toString().contains("4"))) {
                                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800273, new Object[]{product.getCode()});
                                }
                                if (RealProductAttributeTypeEnum.DescMaterials.getValue().equals(realProductAttributeType.toString()) && (value.toString().contains("2") || value.toString().contains("4"))) {
                                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800274, new Object[]{product.getCode()});
                                }
                            }
                        }
                    }
                    if ((modifyField.containsKey("detail!isSerialNoManage") || modifyField.containsKey("detail!isProcess")) && product.detail().get("isSerialNoManage") != null && product.detail().get("isSerialNoManage").equals(true) && product.detail().get("isProcess") != null && product.detail().get("isProcess").equals(true)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800275, new Object[]{product.getCode()});
                    }
                    if (modifyField.containsKey("detail!inventoryPlanStrategy") && !modifyField.containsKey("detail!planMethod")) {
                        planMethod = MetaDaoHelper.queryOne((String)"pc.product.ProductDetail", (QuerySchema)QuerySchema.create().addSelect("id,planMethod").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.detail().getId())})));
                        if (planMethod == null || planMethod.isEmpty()) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800276);
                        }
                        if (planMethod.get("planMethod") != null && !"10".equals(planMethod.get("planMethod").toString())) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800277, new Object[]{product.getCode()});
                        }
                    } else if (modifyField.containsKey("detail!inventoryPlanStrategy") && modifyField.containsKey("detail!planMethod")) {
                        planMethod = product.detail().getPlanMethod();
                        Object v2 = modifyField.get("detail!inventoryPlanStrategy");
                        if (v2 != null && null != planMethod && !"10".equals(((Short)planMethod).toString())) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800278, new Object[]{product.getCode()});
                        }
                    }
                    if (modifyField.containsKey("detail!iOrder") && (iOrder = product.detail().getIOrder().intValue()) < 0) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800279);
                    }
                    if (modifyField.containsKey("weight")) {
                        BigDecimal weight = product.getWeight();
                        BigDecimal bigDecimal = new BigDecimal(0);
                        if (weight != null && weight.compareTo(bigDecimal) < 0) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800280, new Object[]{product.getCode()});
                        }
                        if (null == product.getWeightUnit()) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800281);
                        }
                    }
                    if (modifyField.containsKey("netWeight")) {
                        BigDecimal netWeight = product.getNetWeight();
                        BigDecimal bigDecimal = new BigDecimal(0);
                        if (netWeight != null && netWeight.compareTo(bigDecimal) < 0) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800282, new Object[]{product.getCode()});
                        }
                        if (null == product.getNetWeightUnit()) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800283);
                        }
                    }
                    if (modifyField.containsKey("volume") && null == product.getVolumeUnit()) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800284);
                    }
                    if (product.getWeight() != null) {
                        BigDecimal decimal = new BigDecimal(product.getWeight().toString()).stripTrailingZeros();
                        product.setWeight(decimal);
                    }
                    if (product.getVolume() != null) {
                        BigDecimal decimal = new BigDecimal(product.getVolume().toString()).stripTrailingZeros();
                        product.setVolume(decimal);
                    }
                    if (product.getNetWeight() != null) {
                        BigDecimal decimal = new BigDecimal(product.getNetWeight().toString()).stripTrailingZeros();
                        product.setNetWeight(decimal);
                    }
                    if (modifyField.containsKey("netWeight") || modifyField.containsKey("weight") || modifyField.containsKey("volume")) {
                        this.productAPIProcessRule.dealUnitPrecision(product);
                    }
                    if ((modifyField.keySet().contains("detail!fixedWastage") || modifyField.keySet().contains("detail!wastageRate")) && !CollectionUtils.isEmpty((Collection)(products = MetaDaoHelper.queryById((String)"pc.product.Product", (String)"id,name,code,detail.lossType", (Object)product.getId())))) {
                        if (modifyField.get("detail!fixedWastage") != null && ((Map)products.get(0)).get("detail_lossType") != null && 0 == (Integer)((Map)products.get(0)).get("detail_lossType")) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800285, new Object[]{productName});
                        }
                        if (modifyField.get("detail!wastageRate") != null && ((Map)products.get(0)).get("detail_lossType") != null && (0 == (Integer)((Map)products.get(0)).get("detail_lossType") || 5 == (Integer)((Map)products.get(0)).get("detail_lossType"))) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800286, new Object[]{productName});
                        }
                    }
                    if (modifyField.keySet().contains("detail!isProcess")) {
                        if (modifyField.get("detail!isProcess") == null) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800287, new Object[]{productName});
                        }
                        if (product.detail().getIsProcess().booleanValue()) {
                            if (product.detail().getProcessType() == null) {
                                product.detail().setProcessType(Short.valueOf("0"));
                            }
                        } else {
                            product.detail().setProcessType(null);
                        }
                    }
                    if (modifyField.keySet().contains("detail!processType")) {
                        if (modifyField.get("detail!processType") == null) {
                            if (BooleanUtil.isTrue((Object)product.detail().get("isProcess"))) {
                                throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CDB91AC05A00008", (String)"\u5546\u54c1[%s]\uff0c\u52a0\u5de5\u4e3a\u662f\u65f6\uff0c\u65e0\u6cd5\u4fee\u6539\u52a0\u5de5\u65b9\u5f0f\u4e3a\u7a7a"), productName));
                            }
                        } else {
                            if (product.detail().getIsProcess() == null) {
                                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800289, new Object[]{productName});
                            }
                            if (product.detail().getIsProcess().equals(false)) {
                                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800290, new Object[]{productName});
                            }
                            if ("1".equals(product.detail().getProcessType().toString())) {
                                product.detail().setIsBatchManage(Boolean.valueOf(false));
                                product.detail().setIsExpiryDateManage(Boolean.valueOf(false));
                                product.detail().setCheckByBatch(Boolean.valueOf(false));
                            }
                        }
                    }
                    if (modifyField.keySet().contains("detail!strategyComparisonRule") && modifyField.get("detail!strategyComparisonRule") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800291, new Object[]{productName});
                    }
                    if (modifyField.keySet().contains("detail!preferentialPolicyType") && product.get("_fromBatchModify") != null && BooleanUtil.isFalse((Object)product.get("_fromBatchModify"))) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800292);
                    }
                    if (modifyField.keySet().contains("productTemplate_Name") || modifyField.keySet().contains("productTemplate")) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800293);
                    }
                    if (modifyField.keySet().contains("unit_Name") || modifyField.keySet().contains("unit")) {
                        String[] stringUnitArray;
                        if (Objects.nonNull(product.getUnitUseType()) && product.getUnitUseType().shortValue() == UnitUseTypeEnum.USE_TIMPLATE.getValue()) {
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.BATCH_USE_TEMPLETE_ERROR, new Object[]{product.getCode()});
                        }
                        String[] field = new String[]{"code", "name"};
                        UnitDTO unitDTO = this.unitService.getUnitById(product.getUnit(), field);
                        product.set("unit_Name", (Object)unitDTO.getName());
                        product.set("unit_Code", (Object)unitDTO.getCode());
                        HashSet productAssistNUnitList = new HashSet();
                        if (product.getEnableAssistUnit().booleanValue() && product.productAssistUnitExchanges() != null) {
                            product.productAssistUnitExchanges().forEach(productAssistUnitExchange -> productAssistNUnitList.add(productAssistUnitExchange.getAssistUnit().toString()));
                        }
                        for (String unitAssit : stringUnitArray = new String[]{"purchaseUnit", "purchasePriceUnit", "stockUnit", "produceUnit", "batchUnit", "onlineUnit", "offlineUnit", "requireUnit", "batchPriceUnit", "inspectionUnit", "demandPlanningUnit"}) {
                            if (!product.detail().containsKey((Object)unitAssit) || productAssistNUnitList.contains(product.detail().get(unitAssit))) continue;
                            product.detail().set(unitAssit, (Object)product.getUnit());
                        }
                    }
                    if (modifyField.keySet().contains("detail!valueManageType")) {
                        // empty if block
                    }
                    if (modifyField.keySet().contains("detail!fixedQuantity") && !CollectionUtils.isEmpty((Collection)(productDetails = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)QuerySchema.create().addSelect("batchRule").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"isCreator").eq((Object)true)}))))) && (v = ((Map)productDetails.get(0)).get("batchRule")) != null && "10".equals(v.toString())) {
                        if (null == modifyField.get("detail!fixedQuantity")) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800231, new Object[]{product.getCode()});
                        }
                        BigDecimal fixedQuantity = new BigDecimal(modifyField.get("detail!fixedQuantity").toString());
                        if (fixedQuantity.scale() != 0 && fixedQuantity.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) != 0 || fixedQuantity.intValue() <= 0) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800232, new Object[]{product.getCode()});
                        }
                    }
                    if (modifyField.keySet().contains("detail!inspectionUnit_Name") || modifyField.keySet().contains("detail!inspectionUnit") || modifyField.keySet().contains("detail!demandPlanningUnit")) {
                        if (!modifyField.containsKey("detail!inspectionUnit")) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800296);
                        }
                        HashSet<String> unitSet = new HashSet<String>();
                        unitSet.add(String.valueOf(product.getUnit()));
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId())});
                        QuerySchema schema = QuerySchema.create().addSelect("unitExchangeType,assistUnit").addCondition((ConditionExpression)queryConditionGroup);
                        List productAssistUnitExchangeList = MetaDaoHelper.query((String)"pc.product.ProductAssistUnitExchange", (QuerySchema)schema);
                        if (productAssistUnitExchangeList.size() > 0) {
                            for (Map productAssistUnitExchangeOne : productAssistUnitExchangeList) {
                                if ("1".equals(String.valueOf(productAssistUnitExchangeOne.get("unitExchangeType")))) {
                                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800297, new Object[]{product.getCode()});
                                }
                                unitSet.add(String.valueOf(productAssistUnitExchangeOne.get("assistUnit")));
                            }
                        }
                        if ((modifyField.keySet().contains("detail!inspectionUnit_Name") || modifyField.keySet().contains("detail!inspectionUnit")) && !unitSet.contains(String.valueOf(modifyField.get("detail!inspectionUnit")))) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800298, new Object[]{product.getCode()});
                        }
                        if (modifyField.keySet().contains("detail!demandPlanningUnit") && !unitSet.contains(String.valueOf(modifyField.get("detail!demandPlanningUnit")))) {
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.DEMAND_PLANNINGUNIT_MODIFY_ERROR, new Object[]{product.getCode()});
                        }
                    }
                    if (modifyField.keySet().contains("detail!productVendor")) {
                        this.productBusCheckService.checkOrgOfVendor(product.get("productApplyRange_orgId"), modifyField.get("detail!productVendor"));
                    }
                    if (modifyField.keySet().contains("detail!costItems")) {
                        this.checkService.checkCostItem(product);
                    }
                    if (modifyField.keySet().contains("detail!inspectionControlPoint") && product.detail() != null && BooleanUtil.isFalse((Object)product.detail().getInspectionType()) && modifyField.get("detail!inspectionControlPoint") != null) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.INSPECTION_POINT_ERROR, new Object[]{product.getCode()});
                    }
                    if (modifyField.keySet().contains("detail!iDoubleSale")) {
                        this.productBusCheckService.checkIDoubleSale(modifyField.get("detail!iDoubleSale"), product.getId());
                    }
                    if (modifyField.keySet().contains("detail!iDoubleSale") || modifyField.keySet().contains("detail!safetyStock") || modifyField.keySet().contains("detail!highestStock") || modifyField.keySet().contains("detail!lowestStock") || modifyField.keySet().contains("detail!purchaseOrderQuantity") || modifyField.keySet().contains("detail!purchaseTimes") || modifyField.keySet().contains("detail!iMinOrderQuantity") || modifyField.keySet().contains("detail!doublePick") || modifyField.keySet().contains("detail!ropStock") || modifyField.keySet().contains("detail!economicQuantity") || modifyField.keySet().contains("detail!fixedQuantity") || modifyField.keySet().contains("detail!batchDouble") || modifyField.keySet().contains("detail!leadTimeQuantity")) {
                        this.productAPIProcessRule.dealBusDataUnitPrecision(product);
                    }
                    if (modifyField.keySet().contains("detail!lowestStock")) {
                        Object requestMap = new HashMap();
                        if (paramMap.get("requestData") instanceof String) {
                            requestMap = JSON.parseObject((String)paramMap.get("requestData").toString());
                        } else if (paramMap.get("requestData") instanceof Map) {
                            requestMap = (Map)paramMap.get("requestData");
                        } else if (paramMap.get("requestData") instanceof List) {
                            requestMap = (Map)((List)paramMap.get("requestData")).get(0);
                        }
                        BigDecimal bigDecimal = MathDataUtils.getBigDecimal(modifyField.get("detail!lowestStock"));
                        if (null != requestMap.get("detail!lowestStock")) {
                            BigDecimal bigDecimal2 = MathDataUtils.getBigDecimal(requestMap.get("detail!lowestStock"));
                        }
                        condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.detail().getId())});
                        schemadelete = QuerySchema.create().addSelect("highestStock").addCondition((ConditionExpression)condition);
                        highestStockListDel = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)schemadelete);
                        if (highestStockListDel.size() > 0) {
                            void var11_39;
                            BigDecimal highestStock = MathDataUtils.getBigDecimal(((Map)highestStockListDel.get(0)).get("highestStock"));
                            if (Objects.nonNull(var11_39) && Objects.nonNull(highestStock) && var11_39.compareTo(highestStock) == 1) {
                                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800299);
                            }
                        }
                    }
                    if (modifyField.keySet().contains("detail!highestStock")) {
                        void var11_42;
                        BigDecimal lowestStock;
                        Object requestMap = new HashMap();
                        if (paramMap.get("requestData") instanceof String) {
                            requestMap = JSON.parseObject((String)paramMap.get("requestData").toString());
                        } else if (paramMap.get("requestData") instanceof Map) {
                            requestMap = (Map)paramMap.get("requestData");
                        } else if (paramMap.get("requestData") instanceof List) {
                            requestMap = (Map)((List)paramMap.get("requestData")).get(0);
                        }
                        BigDecimal bigDecimal = MathDataUtils.getBigDecimal(modifyField.get("detail!highestStock"));
                        if (null != requestMap.get("detail!highestStock")) {
                            BigDecimal bigDecimal3 = MathDataUtils.getBigDecimal(requestMap.get("detail!highestStock"));
                        }
                        condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.detail().getId())});
                        schemadelete = QuerySchema.create().addSelect("lowestStock").addCondition((ConditionExpression)condition);
                        highestStockListDel = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)schemadelete);
                        if (highestStockListDel.size() > 0 && Objects.nonNull(lowestStock = MathDataUtils.getBigDecimal(((Map)highestStockListDel.get(0)).get("lowestStock"))) && Objects.nonNull(var11_42) && lowestStock.compareTo((BigDecimal)var11_42) == 1) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800299);
                        }
                    }
                    if (modifyField.containsKey("transType_Name")) {
                        if (!modifyField.containsKey("transType")) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800300);
                        }
                        if (InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_197A2ACA0458000B", (String)"\u8d39\u7528\u7c7b\u7269\u6599").equals(modifyField.get("transType_Name"))) {
                            QueryConditionGroup condition3 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"isCreator").eq((Object)true)});
                            QuerySchema querySchema2 = QuerySchema.create().addSelect("costItems").addCondition((ConditionExpression)condition3);
                            List costItems = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)querySchema2);
                            if (Objects.isNull(costItems) || costItems.size() == 0 || !((Map)costItems.get(0)).containsKey("costItems") || Objects.isNull(((Map)costItems.get(0)).get("costItems"))) {
                                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800301);
                            }
                        }
                    }
                    if (("1751963021784645639".equals(product.get("transType")) || "system_001".equals(product.get("transType_Code")) || "\u8d39\u7528\u7c7b\u7269\u6599".equals(product.get("transType_Name"))) && modifyField.containsKey("detail!costItems") && Objects.isNull(modifyField.get("detail!costItems"))) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800599);
                    }
                    if (modifyField.keySet().contains("detail!costValuation")) {
                        IRpcRule rpcRule;
                        if (product.detail() != null && product.detail().get("valueManageType") != null && (ValueManageTypeEnum.Cost.getValue().equals(product.detail().get("valueManageType").toString()) || ValueManageTypeEnum.FixedAssets.equals((Object)product.detail().get("valueManageType").toString()))) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800302);
                        }
                        if (ProductUtil.checkOpenOption("u8c-config", "app:EIA") && null != (rpcRule = (IRpcRule)AppContext.getBean(IRpcRule.class))) {
                            RuleRegister ruleRegister = ProductUtil.getBillRuleRegister("pc_product", "delete", "IAMaterialDocCheckRule", "yonbip-fi-eia");
                            List data = (List)billDataDto.getData();
                            if (!data.isEmpty()) {
                                for (Map map : data) {
                                    if (null != map.get("changeFileName")) continue;
                                    map.put("changeFileName", "costValuation");
                                }
                            }
                            if (null != (ruleResult = rpcRule.execute(ruleRegister, billContext, paramMap)) && ruleResult.getMsgCode() != 1) {
                                throw new CoreDocBusinessException(ruleResult.getMessage());
                            }
                        }
                    }
                    if (modifyField.containsKey("useSku")) {
                        this.useSkuService.checkProductUseSku(product);
                    }
                    if (modifyField.containsKey("detail!isBatchManage")) {
                        HashMap<String, Object> originalParamMap = new HashMap<String, Object>();
                        originalParamMap.putAll(paramMap);
                        this.productReferenceCheckService.productCheckRule(billContext, originalParamMap, "detail!isBatchManage", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1E2A830E04680007", (String)"\u6279\u6b21\u7ba1\u7406"));
                    }
                    if (modifyField.containsKey("detail!checkByBatch")) {
                        HashMap<String, Object> originalParamMap = new HashMap<String, Object>();
                        originalParamMap.putAll(paramMap);
                        this.productReferenceCheckService.productCheckRule(billContext, originalParamMap, "detail!checkByBatch", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A57A8C204C80002", (String)"\u6309\u6279\u6b21\u6838\u7b97"));
                    }
                    if (modifyField.containsKey("taxClass") && modifyField.get("taxClass") == null) {
                        product.detail().setPreferentialPolicyType(null);
                    }
                    if (modifyField.containsKey("weightUnit") && modifyField.get("weightUnit") == null && product.get("weight") != null) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_WEIGHT_UNIT_NOT_NULL);
                    }
                    if (modifyField.containsKey("netWeightUnit") && modifyField.get("netWeightUnit") == null && product.get("netWeight") != null) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NET_WEIGHT_UNIT_NOT_NULL);
                    }
                    if (modifyField.containsKey("volumeUnit") && modifyField.get("volumeUnit") == null && product.get("volume") != null) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_VOLUME_UNIT_NOT_NULL);
                    }
                }
            }
            if (null == (ranges = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect("isApplied, orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.get("productApplyRangeId"))})))) || ranges.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800303, new Object[]{productName});
            }
            if (((Map)ranges.get(0)).get("isApplied").equals(false)) {
                if (null != product.detail()) {
                    product.detail().setEntityStatus(EntityStatus.Insert);
                }
                if (null != product.time()) {
                    product.time().setEntityStatus(EntityStatus.Insert);
                }
            }
            if (modifyField != null && !"666666".equals(string = ((Map)ranges.get(0)).get("orgId").toString())) {
                ArrayList<String> staffIds = new ArrayList<String>();
                ruleResult = CHECK_ORG_FIELDS.iterator();
                while (ruleResult.hasNext()) {
                    Map<String, String> field = ruleResult.next();
                    String fieldName = "detail!" + field.get(FIELDNAME);
                    if (modifyField.get(fieldName) == null) continue;
                    staffIds.add(modifyField.get(fieldName).toString());
                }
                if (!staffIds.isEmpty()) {
                    HashMap<String, String> staffIdsWithName = new HashMap<String, String>();
                    HashMap<String, String> staffIdsWithNameByOrgId = new HashMap<String, String>();
                    this.getStaffInfo(string, staffIds, staffIdsWithName, staffIdsWithNameByOrgId);
                    HashMap<String, String> MultiLangMap = new HashMap<String, String>();
                    MultiLangMap.put("manufacturePlanner", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CBE656C04B80017", (String)"\u8ba1\u5212\u5458"));
                    MultiLangMap.put("productBuyer", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CBE656C04B80018", (String)"\u91c7\u8d2d\u5458"));
                    MultiLangMap.put("warehouseManager", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CBE656C04B80019", (String)"\u5e93\u7ba1\u5458"));
                    for (Map<String, String> field : CHECK_ORG_FIELDS) {
                        String fieldValue;
                        String fieldName = "detail!" + field.get(FIELDNAME);
                        if (modifyField.get(fieldName) == null || staffIdsWithNameByOrgId.containsKey(fieldValue = modifyField.get(fieldName).toString())) continue;
                        if (staffIdsWithName.containsKey(fieldValue)) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801624, new Object[]{MultiLangMap.get(field.get(FIELDNAME)), staffIdsWithName.get(fieldValue), productName});
                        }
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801625, new Object[]{MultiLangMap.get(field.get(FIELDNAME)), productName});
                    }
                }
            }
            if (product.detail() != null && (product.detail().containsKey((Object)"iStatus") && product.detail().getIStatus() != null || product.detail().containsKey((Object)"iUOrderStatus") && product.detail().getIUOrderStatus() != null)) {
                Map map = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect("productApplyRange.productDetailId.iStatus as iStatus, productApplyRange.productDetailId.iUOrderStatus as iUOrderStatus, productApplyRange.productDetailId.stopstatus as stopstatus").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.getId()), QueryCondition.name((String)"productApplyRange.id").eq(product.get("productApplyRangeId"))})));
                if (map == null || map.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800303, new Object[]{productName});
                }
                if (map.get("stopstatus").equals(true) && product.detail().getStopstatus().equals(map.get("stopstatus"))) {
                    if (!product.detail().getIStatus().equals(map.get("iStatus"))) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800306, new Object[]{productName});
                    }
                    if (!product.detail().getIUOrderStatus().equals(map.get("iUOrderStatus"))) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800307, new Object[]{productName});
                    }
                }
            }
            if (modifyField.keySet().contains("customerServiceDay") && modifyField.get("customerServiceDay") != null && (n = Integer.valueOf(modifyField.get("customerServiceDay").toString())) < 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800311);
            }
            if (!modifyField.keySet().contains("manageClass")) continue;
            if (!this.pubOptionService.getOrgGlobalShare("pc.product.Product").booleanValue() && CollectionUtils.isEmpty((Collection)MetaDaoHelper.queryObject((String)"pc.cls.ManagementClass", (QuerySchema)(querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)product.getManageClass()), QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgId").eq(product.get("productApplyRange_orgId"))}))), null))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800312, new Object[]{productName, product.get("manageClass_Name").toString()});
            }
            try {
                this.createNewCode(product, "manageClass");
            }
            catch (Exception exception) {
                log.error("createNewCode:" + exception.getMessage(), (Throwable)exception);
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800313, new Object[]{productName, exception.getMessage()});
            }
        }
        return new RuleExecuteResult();
    }

    private void getStaffInfo(String orgId, List<String> staffIds, Map<String, String> staffIdsWithName, Map<String, String> staffIdsWithNameByOrgId) {
        StaffInfoQueryParam param = new StaffInfoQueryParam();
        param.setTenantId((String)AppContext.getYTenantId());
        param.setStaffIds(staffIds);
        BaseResponse staffDatas = this.staffInfoQueryService.queryStaffList(param);
        if (staffDatas != null && staffDatas.getData() != null && staffDatas.getData().get("data") != null && staffDatas.getData().get("data") instanceof List && ((List)staffDatas.getData().get("data")).size() > 0) {
            List staffDatasList = (List)staffDatas.getData().get("data");
            for (StaffInfoListDto staff : staffDatasList) {
                staffIdsWithName.put(staff.getId(), staff.getName());
                List ptJobInfoList = staff.getPtJobInfoList();
                if (!CollectionUtils.isEmpty((Collection)ptJobInfoList)) {
                    for (PtJobInfoDto ptJobInfoDto : ptJobInfoList) {
                        if (!ptJobInfoDto.getOrgId().equals(orgId)) continue;
                        staffIdsWithNameByOrgId.put(staff.getId(), staff.getName());
                    }
                }
                if (staff.getOrgId().equals(orgId)) {
                    staffIdsWithNameByOrgId.put(staff.getId(), staff.getName());
                    continue;
                }
                if (!this.deptCheckApi.bizDeptBelongToOrgWithSharingSetting(orgId, staff.getDeptId(), "all", AppContext.getCurrentUser().getYTenantId())) continue;
                staffIdsWithNameByOrgId.put(staff.getId(), staff.getName());
            }
        }
    }

    private void extracted(BillContext billContext, BizObject bill, Map<String, Object> modifyField) throws Exception {
        Object productApplyRangeId;
        List ranges;
        Map range;
        ProductSKU sku = (ProductSKU)bill;
        HashSet<String> ingnoreField = new HashSet<String>(){
            {
                this.add("mode");
                this.add("totalCount");
                this.add("batchUnit");
                this.add("productSKUDetail!batchPriceUnit");
            }
        };
        if (!Objects.isNull(sku.getIsSKU()) && sku.getIsSKU() == 0) {
            boolean flag = false;
            if (modifyField != null && modifyField.size() > 0) {
                for (Map.Entry<String, Object> stringObjectEntry : modifyField.entrySet()) {
                    String key = stringObjectEntry.getKey();
                    if (ingnoreField.contains(key) || key.contains("CharacterDef")) continue;
                    flag = true;
                }
            }
            if (flag) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800314, new Object[]{sku.getCode()});
            }
        }
        if ("pc_goodsproductskuprolist".equals(billContext.getBillnum()) && !Boolean.parseBoolean((range = (Map)(ranges = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"*", (Object)(productApplyRangeId = bill.get("productApplyRangeId")))).get(0)).get("isApplied").toString())) {
            this.productSKUShelveRule.initRangeData(range.get("productId").toString(), Long.parseLong(range.get("id").toString()));
        }
        if (sku.get("isCreator").equals(false)) {
            if (sku.containsKey((Object)"name")) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808040, new Object[]{sku.getCode()});
            }
            if (sku.containsKey((Object)"modelDescription")) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808041, new Object[]{sku.getCode()});
            }
            if (sku.containsKey((Object)"weight")) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808042, new Object[]{sku.getCode()});
            }
            if (sku.containsKey((Object)"volume")) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808043, new Object[]{sku.getCode()});
            }
            if (sku.containsKey((Object)"batchUnit")) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808044, new Object[]{sku.getCode()});
            }
        } else {
            if (sku.containsKey((Object)"batchUnit") && sku.get("batchUnit") != null) {
                List productUnits = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id as productId", "unit as mainUnit", "if unitUseType = 2 then productAssistUnitExchanges.assistUnit else productTemplate.productTplAssistUnitExchanges.assistUnit end as assistUnit"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)sku.getProductId())})));
                if (productUnits == null || productUnits.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808045, new Object[]{sku.getCode()});
                }
                Set units = productUnits.stream().map(map -> (Long)map.get("assistUnit")).collect(Collectors.toSet());
                units.add((Long)((Map)productUnits.get(0)).get("mainUnit"));
                if (!units.contains((Long)sku.get("batchUnit"))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808046, new Object[]{sku.getCode()});
                }
            }
            if (sku.containsKey((Object)"productSkuCharacterDef")) {
                Map skuCharacterDefUI = (Map)sku.get("productSkuCharacterDef");
                List skus = MetaDaoHelper.queryById((String)"pc.product.ProductSKU", (String)"productSkuCharacterDef", (Object)sku.getId());
                if (!CollectionUtils.isEmpty((Collection)skus)) {
                    Map skuInDB = (Map)skus.get(0);
                    Object skuCharacterDefInDb = skuInDB.get("productSkuCharacterDef");
                    if (null != skuCharacterDefInDb && skuCharacterDefInDb instanceof Map) {
                        Object skuCharacterDefId = ((Map)skuCharacterDefInDb).get("id");
                        skuCharacterDefUI.put("id", skuCharacterDefId);
                        skuCharacterDefUI.put("_status", EntityStatus.Update);
                    } else {
                        skuCharacterDefUI.put("id", IdManager.getInstance().nextId());
                        skuCharacterDefUI.put("_status", EntityStatus.Insert);
                    }
                }
            }
        }
        if (sku.productSKUDetail() != null) {
            Integer unitPrecision;
            List products;
            QuerySchema schema;
            sku.productSKUDetail().setProductId(sku.getProductId());
            if (sku.productSKUDetail().getBatchPriceUnit() != null) {
                Map productMap = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id", "unit", "unitUseType", "enableAssistUnit", "productTemplate"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)sku.getProductId())})));
                Product product = new Product();
                product.init(productMap);
                ProductSkuDetailNew productSkuDetailNew = new ProductSkuDetailNew();
                productSkuDetailNew.setBatchPriceUnit(sku.productSKUDetail().getBatchPriceUnit());
                this.productSkuBeforeSaveRule.dealBatchPriceUnit(productSkuDetailNew, product);
                sku.productSKUDetail().setBatchPriceUnitRate(productSkuDetailNew.getBatchPriceUnitRate());
            }
            for (Map.Entry<String, String> entry : this.getNaturalNumberFields().entrySet()) {
                if (!sku.productSKUDetail().containsKey((Object)entry.getKey()) || sku.productSKUDetail().get(entry.getKey()) == null || new BigDecimal(sku.productSKUDetail().get(entry.getKey()).toString()).compareTo(BigDecimal.ZERO) >= 0) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808047, new Object[]{sku.getCode(), sku.productSKUDetail().get(entry.getKey())});
            }
            sku.productSKUDetail().put("productApplyRangeId", sku.get("productApplyRangeId"));
            if (sku.productSKUDetail().containsKey((Object)"id") && sku.productSKUDetail().getEntityStatus() == EntityStatus.Unchanged) {
                Object skuDetailNewsObj;
                List skuDetailNews;
                sku.productSKUDetail().setEntityStatus(EntityStatus.Update);
                ArrayList<ProductSkuDetailNew> productSkuDetailNews = new ArrayList<ProductSkuDetailNew>();
                ProductSkuDetailNew productSkuDetailNew = new ProductSkuDetailNew();
                ProductUtil.exchangeFromExtend(sku.productSKUDetail(), productSkuDetailNew);
                schema = QuerySchema.create().addSelect(new String[]{"id", "skuDetailCharacterDef", "productApplyRangeId", "productDetailId"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"skuId").eq(sku.getId()), QueryCondition.name((String)"productApplyRangeId").eq(sku.get("productApplyRangeId"))}));
                List skudetailInDb = MetaDaoHelper.query((String)"pc.product.ProductSkuDetailNew", (QuerySchema)schema);
                Map skuDetailNewInDB = null;
                if (!CollectionUtils.isEmpty((Collection)skudetailInDb)) {
                    skuDetailNewInDB = (Map)skudetailInDb.get(0);
                    productSkuDetailNew.setId(skuDetailNewInDB.get("id"));
                    if (null != skuDetailNewInDB.get("productApplyRangeId")) {
                        Long productApplyRangeId2 = Long.parseLong(skuDetailNewInDB.get("productApplyRangeId").toString());
                        productSkuDetailNew.setProductApplyRangeId(productApplyRangeId2);
                    }
                    if (null != skuDetailNewInDB.get("productDetailId")) {
                        Long productDetailId = Long.parseLong(skuDetailNewInDB.get("productDetailId").toString());
                        productSkuDetailNew.setProductDetailId(productDetailId);
                    }
                    productSkuDetailNew.setEntityStatus(EntityStatus.Update);
                }
                if (!CollectionUtils.isEmpty((Collection)(skuDetailNews = sku.productSkuDetailNew())) && null != (skuDetailNewsObj = ((ProductSkuDetailNew)skuDetailNews.get(0)).get("skuDetailCharacterDef")) && skuDetailNewsObj instanceof Map) {
                    Map skuDetailCharacterDefUI = (Map)skuDetailNewsObj;
                    if (null != skuDetailNewInDB) {
                        Object skuDetailCharacterDefInDb = skuDetailNewInDB.get("skuDetailCharacterDef");
                        if (null != skuDetailCharacterDefInDb && skuDetailCharacterDefInDb instanceof Map) {
                            Object skuDetailCharacterDefId = ((Map)skuDetailCharacterDefInDb).get("id");
                            skuDetailCharacterDefUI.put("id", skuDetailCharacterDefId);
                            skuDetailCharacterDefUI.put("_status", EntityStatus.Update);
                        } else {
                            skuDetailCharacterDefUI.put("id", IdManager.getInstance().nextId());
                            skuDetailCharacterDefUI.put("_status", EntityStatus.Insert);
                        }
                    }
                    productSkuDetailNew.put("skuDetailCharacterDef", (Object)skuDetailCharacterDefUI);
                }
                productSkuDetailNews.add(productSkuDetailNew);
                sku.setProductSkuDetailNew(productSkuDetailNews);
            }
            if (modifyField.keySet().contains("productSKUDetail!iDoubleSale")) {
                this.productBusCheckService.checkIDoubleSale(modifyField.get("productSKUDetail!iDoubleSale"), sku.getProductId());
            }
            if (modifyField.containsKey("productSKUDetail!highestStock") && modifyField.get("productSKUDetail!highestStock") != null) {
                BigDecimal highestStock = new BigDecimal(modifyField.get("productSKUDetail!highestStock").toString());
                BigDecimal highestStockRemoveZero = new BigDecimal(highestStock.stripTrailingZeros().toPlainString());
                schema = QuerySchema.create().addSelect("unit").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)sku.getProductId())}));
                products = MetaDaoHelper.queryObject((String)"pc.product.Product", (QuerySchema)schema, null);
                if (!CollectionUtils.isEmpty((Collection)products) && (unitPrecision = this.productCheckService.getUnitPrecision(((Product)products.get(0)).getUnit())) != null && highestStockRemoveZero.scale() > unitPrecision) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_HIGHESTSTOCK_PRECISION_ERROR);
                }
            }
            if (modifyField.containsKey("productSKUDetail!lowestStock") && modifyField.get("productSKUDetail!lowestStock") != null) {
                BigDecimal lowestStock = new BigDecimal(modifyField.get("productSKUDetail!lowestStock").toString());
                BigDecimal lowestStockRemoveZero = new BigDecimal(lowestStock.stripTrailingZeros().toPlainString());
                QuerySchema querySchema = QuerySchema.create().addSelect("unit").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)sku.getProductId())}));
                products = MetaDaoHelper.queryObject((String)"pc.product.Product", (QuerySchema)querySchema, null);
                if (!CollectionUtils.isEmpty((Collection)products) && (unitPrecision = this.productCheckService.getUnitPrecision(((Product)products.get(0)).getUnit())) != null && lowestStockRemoveZero.scale() > unitPrecision) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_LOWESTSTOCK_PRECISION_ERROR);
                }
            }
        }
        if (sku.skudefine() != null) {
            if (sku.skudefine().containsKey((Object)"id") && sku.skudefine().getEntityStatus() == EntityStatus.Unchanged) {
                sku.skudefine().setEntityStatus(EntityStatus.Update);
            } else if (!sku.skudefine().containsKey((Object)"id")) {
                sku.skudefine().setId((Object)IdManager.getInstance().nextId());
                sku.skudefine().setSkuId((Long)sku.getId());
                sku.skudefine().setTenant((Long)AppContext.getTenantId());
                sku.skudefine().setEntityStatus(EntityStatus.Insert);
            }
        }
    }

    private void checkBatchModify(Product product, BillContext billContext, Map<String, Object> paramMap) throws Exception {
        for (String domain : ProductFieldCheckRule.CHECK_FIELDS_DOMAIN_ORG.get("detail!isBatchManage")) {
            List bills;
            RuleRegister billRuleRegister;
            RuleExecuteResult ruleResult;
            IRpcRule rpcRule;
            if (!ProductFieldCheckRule.CHECK_DOMAIN.keySet().contains(domain) || !ProductUtil.checkOpenOption("u8c-config", ProductFieldCheckRule.CHECK_DOMAIN.get(domain)) || null == (rpcRule = (IRpcRule)AppContext.getBean(IRpcRule.class))) continue;
            if ("ustock".equals(domain)) {
                ((Map)((List)((BillDataDto)paramMap.get("param")).getData()).get(0)).put("isBatchManage_Change", "true");
            }
            if (null == (ruleResult = rpcRule.execute(billRuleRegister = Objects.nonNull(bills = this.getBills(billContext, paramMap)) && bills.size() > 0 && (Boolean)((BizObject)bills.get(0)).get("isCreator") != false ? ProductUtil.getBillRuleRegister("pc_product", "delete", ProductFieldCheckRule.DOMAIN_RULE.get(domain), domain) : ProductUtil.getBillRuleRegister("pc_product", "delete", ProductFieldCheckRule.DOMAIN_RULE_ORG.get(domain), domain), billContext, paramMap)) || ruleResult.getMsgCode() == 1) continue;
            throw new CoreDocBusinessException(ruleResult.getMessage());
        }
    }

    public void checkNameAndModel(Product product) throws Exception {
        QueryConditionGroup condition;
        Object id = product.getId();
        QuerySchema querySchema = QuerySchema.create().addSelect("id,code");
        List langSequences = this.languageProvider.getEnableLanguages();
        if (!CollectionUtils.isEmpty((Collection)langSequences)) {
            condition = new QueryConditionGroup(ConditionOperator.or);
            for (LanguageVO languageVO : langSequences) {
                if (this.productCheckService.isRepeatNameEmpty(product, REPEAT_CHECK_FIELD, languageVO)) continue;
                QueryConditionGroup condition4language = new QueryConditionGroup();
                ArrayList<Object> conditionExpressions = new ArrayList<Object>();
                conditionExpressions.add(QueryCondition.name((String)"id").not_eq(product.getId()));
                for (String repeatAttr : REPEAT_CHECK_FIELD) {
                    if (null != product.get(repeatAttr) && !CollectionUtils.isEmpty((Map)((BizObject)product.get(repeatAttr)))) {
                        String vCName;
                        String langVal = (String)((BizObject)product.get(repeatAttr)).get(languageVO.getLangCode());
                        if (null == langVal) {
                            if (languageVO.getLangSequence() == 1) {
                                conditionExpressions.add(QueryCondition.name((String)repeatAttr).is_null().multi(true));
                            } else {
                                vCName = REPEAT_COLUMN_MAP.get(repeatAttr) + languageVO.getLangSequence();
                                conditionExpressions.add(QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)vCName).is_null().temp(true), QueryCondition.name((String)vCName).eq((Object)"").temp(true)}));
                            }
                        } else if (languageVO.getLangSequence() == 1) {
                            conditionExpressions.add(QueryCondition.name((String)repeatAttr).eq((Object)langVal).multi(true));
                        } else {
                            vCName = REPEAT_COLUMN_MAP.get(repeatAttr) + languageVO.getLangSequence();
                            conditionExpressions.add(QueryCondition.name((String)vCName).eq((Object)langVal).temp(true));
                        }
                    } else if (languageVO.getLangSequence() == 1) {
                        conditionExpressions.add(QueryCondition.name((String)repeatAttr).is_null().multi(true));
                    } else {
                        String vCName = REPEAT_COLUMN_MAP.get(repeatAttr) + languageVO.getLangSequence();
                        conditionExpressions.add(QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)vCName).is_null().temp(true), QueryCondition.name((String)vCName).eq((Object)"").temp(true)}));
                    }
                    ConditionExpression[] ces = new ConditionExpression[conditionExpressions.size()];
                    condition4language = QueryConditionGroup.and((ConditionExpression[])conditionExpressions.toArray(ces));
                }
                condition.addCondition((ConditionExpression)condition4language);
            }
        } else {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_NO_ENABLELANGUAGES);
        }
        querySchema.appendQueryCondition(new ConditionExpression[]{condition});
        List products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)products)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800315, new Object[]{product.getCode(), ((Map)products.get(0)).getOrDefault("code", " ").toString()});
        }
    }

    private String ConvertDefineId(String DefineId, int type) {
        int i = Integer.parseInt(DefineId.substring(6));
        if (type == 1) {
            i += 90;
        } else if (type == 2) {
            i = i <= 30 ? (i += 120) : (i += 150);
        }
        return DefineId.substring(0, 6).concat(Integer.toString(i));
    }

    private void removeId(Product product) throws Exception {
        boolean hasApplied = false;
        QuerySchema schema = QuerySchema.create().addSelect("productId,orgId,isApplied").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"orgId").eq((Object)product.get("productApplyRange_orgId").toString())}));
        List productProductApplyRange = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
        if (productProductApplyRange != null && productProductApplyRange.get(0) != null && ((Map)productProductApplyRange.get(0)).get("isApplied") != null && BooleanUtil.isTrue((Object)((Map)productProductApplyRange.get(0)).get("isApplied").toString())) {
            hasApplied = true;
        }
        if (!hasApplied) {
            if (product.detail() != null && product.detail().containsKey((Object)"productExtendCharacterDef__id")) {
                product.detail().remove("productExtendCharacterDef__id");
            }
            if (product.detail() != null && product.detail().containsKey((Object)"productExtendCharacterDef")) {
                Map productExtendCharacterDef = (Map)product.detail().get("productExtendCharacterDef");
                productExtendCharacterDef.remove("id");
                product.detail().set("productExtendCharacterDef", (Object)productExtendCharacterDef);
            }
        }
    }

    private void createNewCode(Product product, String billPrefield) throws Exception {
        String billNum = "pc_product";
        String bizObjCode = "productcenter.pc_product";
        boolean checkCode = false;
        String orgId = product.getOrgId() != null ? product.getOrgId() : "-1";
        QueryBillNumberParam param = new QueryBillNumberParam(false, billNum, bizObjCode, orgId);
        HashSet listenFieldNameSet = new HashSet();
        param.setBillNum(billNum);
        param.setExtInfo(new HashMap());
        param.getExtInfo().put("listenFieldNameSet", listenFieldNameSet);
        BizObject bill = new BizObject((Map)product);
        BillCodeObj billObj = new BillCodeObj((Map)bill);
        BillNumberPO bn = this.billCodeRuleMgrService.findCompleteBillNumberByBill(param, billObj);
        if (0 != bn.getBillnumMode() && null != bn.getCallTime() && 0 == bn.getCallTime()) {
            List billPrefixList = bn.getBillPrefix();
            for (BillPrefixPO billPrefixPO : billPrefixList) {
                if (null == billPrefixPO.getCfieldname() || !billPrefixPO.getCfieldname().contains(billPrefield)) continue;
                checkCode = true;
                break;
            }
        }
        if (checkCode) {
            final BillCodeComponentParam billCodeComponentParam = new BillCodeComponentParam(bizObjCode, billNum, (String)AppContext.getYTenantId(), orgId);
            BizObject bizObject = new BizObject((Map)product);
            BillCodeObj[] codeObjs = new BillCodeObj[]{new BillCodeObj((Map)bizObject)};
            billCodeComponentParam.setBills(codeObjs);
            billCodeComponentParam.setMdUri("pc.product.Product");
            final String[] newCodes = this.billCodeComponentService.getBatchBillCodes(billCodeComponentParam);
            final String returnCod = product.getCode();
            if (null != newCodes && newCodes.length > 0) {
                product.setCode(newCodes[0]);
            }
            TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronizationAdapter(){

                public void afterCompletion(int status) {
                    if (0 == status) {
                        billCodeComponentParam.setBillCodes(new String[]{returnCod});
                        ProductBatchModifyCheckRule.this.billCodeComponentService.returnBatchBillCodes(billCodeComponentParam);
                    } else {
                        billCodeComponentParam.setBillCodes(newCodes);
                        ProductBatchModifyCheckRule.this.billCodeComponentService.returnBatchBillCodes(billCodeComponentParam);
                    }
                }
            });
        }
    }

    private HashMap<String, String> getNaturalNumberFields() {
        if (NATURAL_NUMBER_FIELDS == null) {
            NATURAL_NUMBER_FIELDS = new HashMap();
            NATURAL_NUMBER_FIELDS.put("batchPrice", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080569", (String)"\u6279\u53d1\u4ef7"));
            NATURAL_NUMBER_FIELDS.put("fMarkPrice", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408056A", (String)"\u5efa\u8bae\u96f6\u552e\u4ef7"));
            NATURAL_NUMBER_FIELDS.put("markPrice", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408056A", (String)"\u5efa\u8bae\u96f6\u552e\u4ef7"));
            NATURAL_NUMBER_FIELDS.put("fSalePrice", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408056D", (String)"\u7ebf\u4e0a\u96f6\u552e\u4ef7"));
            NATURAL_NUMBER_FIELDS.put("salePrice", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408056D", (String)"\u7ebf\u4e0a\u96f6\u552e\u4ef7"));
            NATURAL_NUMBER_FIELDS.put("fMarketPrice", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408056F", (String)"\u5e02\u573a\u4ef7"));
            NATURAL_NUMBER_FIELDS.put("fPrimeCosts", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080570", (String)"\u8fdb\u8d27\u4ef7"));
            NATURAL_NUMBER_FIELDS.put("fSettleAccountsRate", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080573", (String)"\u7ed3\u7b97\u8d39\u7387"));
            NATURAL_NUMBER_FIELDS.put("safetyStock", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080576", (String)"\u5b89\u5168\u5e93\u5b58"));
            NATURAL_NUMBER_FIELDS.put("highestStock", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080578", (String)"\u6700\u9ad8\u5e93\u5b58"));
            NATURAL_NUMBER_FIELDS.put("lowestStock", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080579", (String)"\u6700\u4f4e\u5e93\u5b58"));
            NATURAL_NUMBER_FIELDS.put("ropStock", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408057B", (String)"\u518d\u8ba2\u8d27\u70b9"));
            NATURAL_NUMBER_FIELDS.put("iMinOrderQuantity", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408057C", (String)"\u8d77\u8ba2\u91cf"));
            NATURAL_NUMBER_FIELDS.put("deliveryDays", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408057E", (String)"\u4ea4\u8d27\u5468\u671f"));
            NATURAL_NUMBER_FIELDS.put("batchDeliveryDays", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408057E", (String)"\u4ea4\u8d27\u5468\u671f"));
            NATURAL_NUMBER_FIELDS.put("inStoreExcessLimit", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408057F", (String)"\u5165\u5e93\u8d85\u91cf\u4e0a\u9650"));
            NATURAL_NUMBER_FIELDS.put("salePoints", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080580", (String)"\u9500\u552e\u79ef\u5206"));
            NATURAL_NUMBER_FIELDS.put("lInventoryCount", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080581", (String)"\u7ebf\u4e0a\u5e93\u5b58\u91cf"));
            NATURAL_NUMBER_FIELDS.put("inventoryCount", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080581", (String)"\u7ebf\u4e0a\u5e93\u5b58\u91cf"));
            NATURAL_NUMBER_FIELDS.put("iBaseSaleCount", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080582", (String)"\u521d\u59cb\u9500\u91cf"));
            NATURAL_NUMBER_FIELDS.put("fNoTaxCostPrice", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080583", (String)"\u53c2\u8003\u6210\u672c"));
            NATURAL_NUMBER_FIELDS.put("frontLeadTime", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080584", (String)"\u524d\u6bb5\u63d0\u524d\u671f"));
            NATURAL_NUMBER_FIELDS.put("economicQuantity", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080585", (String)"\u7ecf\u6d4e\u6279\u91cf"));
            NATURAL_NUMBER_FIELDS.put("fixedQuantity", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080586", (String)"\u56fa\u5b9a\u6279\u91cf"));
            NATURAL_NUMBER_FIELDS.put("batchDouble", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080588", (String)"\u6279\u91cf\u500d\u91cf"));
            NATURAL_NUMBER_FIELDS.put("behindLeadTime", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080589", (String)"\u540e\u6bb5\u63d0\u524d\u671f"));
            NATURAL_NUMBER_FIELDS.put("fixedLeadTime", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408058A", (String)"\u56fa\u5b9a\u63d0\u524d\u671f"));
            NATURAL_NUMBER_FIELDS.put("resetForwardDays", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408058B", (String)"\u91cd\u6392\u524d\u79fb\u5929\u6570"));
            NATURAL_NUMBER_FIELDS.put("resetBackwardDays", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408058C", (String)"\u91cd\u6392\u540e\u79fb\u5929\u6570"));
            NATURAL_NUMBER_FIELDS.put("beyondSupplyDays", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408058D", (String)"\u8d85\u671f\u4f9b\u7ed9\u5929\u6570"));
            NATURAL_NUMBER_FIELDS.put("demandConsolidationNumber", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408058E", (String)"\u9700\u6c42\u5408\u5e76\u65f6\u683c\u6570"));
            NATURAL_NUMBER_FIELDS.put("daysBeforeValidityReject", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CF2B7E20410000A", (String)"\u8fd1\u6548\u671f\u62d2\u6536\u5929\u6570"));
            NATURAL_NUMBER_FIELDS.put("validityWarningDays", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CF2B7E20410000B", (String)"\u8fd1\u6548\u671f\u9884\u8b66\u5929\u6570"));
        }
        return NATURAL_NUMBER_FIELDS;
    }

    static {
        FIELDNAME = "fieldName";
        ORGIDKEY = "orgIdKey";
        CLASSNAME = "className";
        DOMAIN = "domain";
        CHECK_ORG_FIELDS = new ArrayList<Map<String, String>>();
        CHECK_ORG_FIELDS.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put(FIELDNAME, "manufacturePlanner");
                this.put(ORGIDKEY, "mainJobList.org_id");
                this.put(CLASSNAME, "bd.staff.Staff");
                this.put(DOMAIN, "ucf-staff-center");
            }
        });
        CHECK_ORG_FIELDS.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put(FIELDNAME, "productBuyer");
                this.put(ORGIDKEY, "mainJobList.org_id");
                this.put(CLASSNAME, "bd.staff.Staff");
                this.put(DOMAIN, "ucf-staff-center");
            }
        });
        CHECK_ORG_FIELDS.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put(FIELDNAME, "warehouseManager");
                this.put(ORGIDKEY, "mainJobList.org_id");
                this.put(CLASSNAME, "bd.staff.Staff");
                this.put(DOMAIN, "ucf-staff-center");
            }
        });
        REPEAT_CHECK_FIELD = new ArrayList<String>();
        REPEAT_CHECK_FIELD.add("name");
        REPEAT_CHECK_FIELD.add("model");
        REPEAT_CHECK_FIELD.add("modelDescription");
        REPEAT_COLUMN_MAP = new HashMap<String, String>();
        REPEAT_COLUMN_MAP.put("name", "name");
        REPEAT_COLUMN_MAP.put("model", "cmodel");
        REPEAT_COLUMN_MAP.put("modelDescription", "cmodelDescription");
    }
}

