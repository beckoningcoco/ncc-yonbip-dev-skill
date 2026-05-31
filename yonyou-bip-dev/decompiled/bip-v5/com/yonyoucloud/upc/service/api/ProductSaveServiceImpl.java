/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.alibaba.fastjson.parser.Feature
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.cloud.util.IrisDynamicInvokeUtil
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant
 *  com.yonyou.iuap.apdoc.coredoc.constants.CheckLimitConstant
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.service.attachment.impl.UPCAttachmentTransService
 *  com.yonyou.iuap.apdoc.coredoc.service.common.impl.CoreDocCustomExtendQueryService
 *  com.yonyou.iuap.apdoc.coredoc.service.config.YmsThreadPoolConfig4UPC
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialDetailVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialVO
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.CharacterDTO
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyou.ucf.transtype.model.TransType
 *  com.yonyou.ucf.userdef.api.ICharaterServiceRPC
 *  com.yonyou.upc.ipass.IPassBatchSaveResultUtil
 *  com.yonyoucloud.iuap.ipass.product.ProductApplyDataDetail
 *  com.yonyoucloud.iuap.ipass.product.ProductApplyDataSaveRequest
 *  com.yonyoucloud.iuap.upc.api.IProductDetailService
 *  com.yonyoucloud.iuap.upc.api.IProductSaveServiceV2
 *  com.yonyoucloud.iuap.upc.api.IUnitService
 *  com.yonyoucloud.iuap.upc.dto.MaterialClassDTO
 *  com.yonyoucloud.iuap.upc.dto.MaterialClassQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ProducClasstDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCPager
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO
 *  com.yonyoucloud.iuap.upc.vo.MultilingualVO
 *  com.yonyoucloud.iuap.upc.vo.ProductApiVO
 *  com.yonyoucloud.iuap.upc.vo.ProductApplyDetailSaveVO
 *  com.yonyoucloud.iuap.upc.vo.ProductApplyQueryVO
 *  com.yonyoucloud.iuap.upc.vo.ProductApplySaveVO
 *  com.yonyoucloud.iuap.upc.vo.ProductApplyVO
 *  com.yonyoucloud.iuap.upc.vo.ProductAssistUnitExchangesVO
 *  com.yonyoucloud.iuap.upc.vo.ProductDescriptionVO
 *  com.yonyoucloud.iuap.upc.vo.ProductDetailVO
 *  com.yonyoucloud.iuap.upc.vo.ProductOrgVo
 *  com.yonyoucloud.iuap.upc.vo.ProductQueryVO
 *  com.yonyoucloud.upc.common.enums.DataSource
 *  com.yonyoucloud.upc.constants.ConvertTypeConstants
 *  com.yonyoucloud.upc.ipass.merchant.PassResultDTO
 *  com.yonyoucloud.upc.pc.product.AssistUnitType
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.UnitUseTypeEnum
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  com.yonyoucloud.upc.utils.APIExtPropertiesUtil
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  com.yonyoucloud.upc.utils.CoredocBeanConvert
 *  com.yonyoucloud.upc.utils.UPCResultConverter
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.core.model.Property
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.base.Json
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.cloud.util.IrisDynamicInvokeUtil;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant;
import com.yonyou.iuap.apdoc.coredoc.constants.CheckLimitConstant;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.service.attachment.impl.UPCAttachmentTransService;
import com.yonyou.iuap.apdoc.coredoc.service.common.impl.CoreDocCustomExtendQueryService;
import com.yonyou.iuap.apdoc.coredoc.service.config.YmsThreadPoolConfig4UPC;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialDetailVO;
import com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialVO;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.CharacterDTO;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyou.ucf.transtype.model.TransType;
import com.yonyou.ucf.userdef.api.ICharaterServiceRPC;
import com.yonyou.upc.ipass.IPassBatchSaveResultUtil;
import com.yonyoucloud.iuap.ipass.product.ProductApplyDataDetail;
import com.yonyoucloud.iuap.ipass.product.ProductApplyDataSaveRequest;
import com.yonyoucloud.iuap.upc.api.IProductDetailService;
import com.yonyoucloud.iuap.upc.api.IProductSaveService;
import com.yonyoucloud.iuap.upc.api.IProductSaveServiceV2;
import com.yonyoucloud.iuap.upc.api.IProductService;
import com.yonyoucloud.iuap.upc.api.IUnitService;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.constants.ProductSaveFieldMap;
import com.yonyoucloud.iuap.upc.dto.MaterialClassDTO;
import com.yonyoucloud.iuap.upc.dto.MaterialClassQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProducClasstDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import com.yonyoucloud.iuap.upc.vo.ProductApiVO;
import com.yonyoucloud.iuap.upc.vo.ProductApplyDetailSaveVO;
import com.yonyoucloud.iuap.upc.vo.ProductApplyQueryVO;
import com.yonyoucloud.iuap.upc.vo.ProductApplySaveVO;
import com.yonyoucloud.iuap.upc.vo.ProductApplyVO;
import com.yonyoucloud.iuap.upc.vo.ProductAssistUnitExchangesVO;
import com.yonyoucloud.iuap.upc.vo.ProductDescriptionVO;
import com.yonyoucloud.iuap.upc.vo.ProductDetailVO;
import com.yonyoucloud.iuap.upc.vo.ProductOrgVo;
import com.yonyoucloud.iuap.upc.vo.ProductQueryVO;
import com.yonyoucloud.upc.billrule.product.ProductDataProcessRule;
import com.yonyoucloud.upc.common.enums.DataSource;
import com.yonyoucloud.upc.constants.ConvertTypeConstants;
import com.yonyoucloud.upc.datarule.ProductTplService;
import com.yonyoucloud.upc.ipass.merchant.PassResultDTO;
import com.yonyoucloud.upc.pc.product.AssistUnitType;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.UnitUseTypeEnum;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.service.CoredocTransTypeService;
import com.yonyoucloud.upc.service.MultiThreadService;
import com.yonyoucloud.upc.service.ProductCheckService;
import com.yonyoucloud.upc.service.ProductDefaultValueService;
import com.yonyoucloud.upc.service.UPCControlRuleService;
import com.yonyoucloud.upc.service.UPCProductQueryService;
import com.yonyoucloud.upc.service.api.ProductCheckForApiService;
import com.yonyoucloud.upc.service.api.ProductServiceImpl;
import com.yonyoucloud.upc.service.bill.product.ProductSetDefaultValueUtil;
import com.yonyoucloud.upc.service.product.ProductAddRangeService;
import com.yonyoucloud.upc.service.rpcService.OrgService;
import com.yonyoucloud.upc.utils.APIExtPropertiesUtil;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import com.yonyoucloud.upc.utils.CoredocBeanConvert;
import com.yonyoucloud.upc.utils.UPCResultConverter;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.biz.base.Objectlizer;
import org.imeta.core.model.Property;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.base.Json;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class ProductSaveServiceImpl
implements IProductSaveService,
IProductSaveServiceV2 {
    private static final Logger log = LoggerFactory.getLogger(ProductSaveServiceImpl.class);
    @Autowired
    private IUPCBillService upcBillService;
    @Autowired
    private IProductDetailService productDetailService;
    @Autowired
    private ProductCheckForApiService productCheckForApiService;
    @Autowired
    private ProductCheckService productCheckService;
    @Autowired
    private IOrgUnitQueryService iOrgUnitQueryService;
    @Autowired
    private IUnitService unitService;
    @Autowired
    private IProductService productService;
    @Autowired
    private UPCControlRuleService upcControlRuleService;
    @Autowired
    private ProductDefaultValueService productDefaultValueService;
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    UPCAttachmentTransService attachmentTransService;
    @Autowired
    ProductTplService productTplService;
    @Autowired
    ProductDataProcessRule productDataProcessRule;
    @Autowired
    private UPCProductQueryService productQueryService;
    @Autowired
    ProductAddRangeService productAddRangeService;
    @Autowired
    CoredocTransTypeService coredocTransTypeService;
    @Autowired
    private YmsThreadPoolConfig4UPC ymsThreadPoolConfig4UPC;
    @Autowired
    OrgService orgService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    private ProductServiceImpl productServiceImpl;
    @Autowired
    private MultiThreadService multiThreadService;
    @Autowired
    private CoreDocCustomExtendQueryService coreDocCustomExtendQueryService;
    Logger logger = LoggerFactory.getLogger(ProductSaveServiceImpl.class);

    @Override
    public Object productSave(ProductApiVO dto) throws Exception {
        Product product = this.dealProductData(dto, null);
        return this.saveOneProduct(product, null);
    }

    @Nullable
    private Object saveOneProduct(Product product, Integer convertType) throws Exception {
        Object result = this.saveProduct(product, convertType = this.getConvertType(convertType));
        if (result != null) {
            ProductApiVO productApiVO = new ProductApiVO();
            Map resultMap = (Map)result;
            if (ObjectUtils.isNotEmpty(resultMap.get("id"))) {
                productApiVO.setId(Long.valueOf(resultMap.get("id").toString()));
            }
            productApiVO.setAutoGenerateRangeData(null);
            return productApiVO;
        }
        return null;
    }

    public Object saveProduct(Product product, Integer convertType) throws Exception {
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("pc_product");
        billDataDto.setAction("save");
        billDataDto.setData((Object)product);
        billDataDto.setFromApi(true);
        billDataDto.setConvertType(convertType);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        return result;
    }

    public Object saveProductDetail(Product product, Integer convertType) throws Exception {
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("pc_productdetail");
        billDataDto.setAction("save");
        billDataDto.setData((Object)product);
        billDataDto.setFromApi(true);
        billDataDto.setConvertType(convertType);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        return result;
    }

    @NotNull
    private <T> Product dealProductData(T dto, Integer convertType) throws Exception {
        if (dto == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801155);
        }
        convertType = this.getConvertType(convertType);
        Product product = new Product();
        product.put("_fromApi", (Object)true);
        Map map = UpcAPiTool.beanToMap(dto, ProductSaveFieldMap.productFieldType, ProductSaveFieldMap.productFieldRenameMap, (String)"Insert");
        product.putAll(map);
        return this.getProductData(product, convertType);
    }

    @NotNull
    public Product getProductData(Product product, Integer convertType) throws Exception {
        if (product.get("customExtend") != null) {
            APIExtPropertiesUtil.processExtProperties((Map)product, (String)"customExtend", null);
        }
        if (BooleanUtil.isFalse((Object)product.getEnableAssistUnit()) && product.productAssistUnitExchanges() != null && product.productAssistUnitExchanges().size() == 0) {
            product.setProductAssistUnitExchanges(null);
        }
        if (ConvertTypeConstants.API_TYPE4 != convertType) {
            this.productCheckService.commonCheck(product);
            this.productCheckForApiService.checkProductBefore(product);
        }
        if (product.detail() != null && product.detail().get("productLoadWay") != null) {
            List productLoadWays = (List)product.detail().get("productLoadWay");
            HashMap<String, Map> removeDuplicateData = new HashMap<String, Map>();
            for (Map map : productLoadWays) {
                String loadWayCode = (String)map.get("loadWayCode");
                if (removeDuplicateData.containsKey(loadWayCode)) continue;
                removeDuplicateData.put(loadWayCode, map);
            }
            ArrayList uniqueProductLoadWays = new ArrayList(removeDuplicateData.values());
            product.put("productLoadWays", uniqueProductLoadWays);
            product.detail().remove("productLoadWay");
        }
        this.productCheckForApiService.addRowNumForProductSubData(product);
        DataTransferUtils.fill((String)"pc_product", (String)"pc.product.Product", (Object)product, (int)convertType);
        this.assistUnitInit(product);
        this.productCheckForApiService.checkAndSetProductOrg(product);
        this.processInspectionCtrlPointForAPI(product);
        return product;
    }

    public void processInspectionCtrlPointForAPI(Product product) {
        if (product.detail() != null) {
            if (BooleanUtil.isFalse((Object)product.detail().getInspectionType())) {
                product.detail().setInspectionControlPoint(null);
            }
            if (BooleanUtil.isFalse((Object)product.detail().getProductInspection())) {
                product.detail().setProductInspectionCtrlPoint(null);
            }
            if (BooleanUtil.isFalse((Object)product.detail().getProductFirstInspection())) {
                product.detail().setFirstInspectionCtrlMethod(null);
            }
        }
    }

    private Integer getConvertType(Integer convertType) {
        if (null == convertType) {
            return 2;
        }
        return convertType;
    }

    public CoreDocJsonResult<UPCResultList> productBatchSave(List<ProductApiVO> vos) throws Exception {
        return this.batchSaveProducts(vos, null);
    }

    @NotNull
    private CoreDocJsonResult<UPCResultList> batchSaveProducts(List<ProductApiVO> vos, Integer convertType) throws Exception {
        if (CollectionUtils.isEmpty(vos)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801155);
        }
        convertType = this.getConvertType(convertType);
        ArrayList<Product> products = new ArrayList<Product>();
        for (ProductApiVO dto : vos) {
            products.add(this.dealProductData(dto, convertType));
        }
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("pc_product");
        billDataDto.setAction("save");
        billDataDto.setData(products);
        billDataDto.setFromApi(true);
        billDataDto.setConvertType(convertType);
        com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList resultList = this.apiImportSingleService.batchSave4Api(billDataDto);
        UPCResultList upcResultList = UPCResultConverter.resultConvert((ResultList)resultList);
        return CoreDocJsonResult.success((Object)upcResultList);
    }

    private void assistUnitInit(Product product) throws Exception {
        if (product.getUnitUseType() != null) {
            if (EntityStatus.Insert.equals((Object)product.getEntityStatus()) && UnitUseTypeEnum.USE_PRODUCT.getValue() == product.getUnitUseType().shortValue()) {
                ProductSetDefaultValueUtil.setAssistUnit(product, this.pubOptionService.isOpenMultiFloat());
            } else if (UnitUseTypeEnum.USE_TIMPLATE.getValue() == product.getUnitUseType().shortValue()) {
                this.useTemplateUnitDeal(product);
            }
        }
        product.remove("unit_Code");
    }

    private void useTemplateUnitDeal(Product product) throws Exception {
        Map<String, Object> tplUnit = this.getBusinessUnitByTpl(product.getProductTemplate());
        List<Map<String, Object>> tplAssistUnitExchanges = this.getAssistUnitExchangeByTpl(product.getProductTemplate());
        if (ObjectUtils.isNotEmpty(tplUnit)) {
            if (tplUnit.get("unit") != null) {
                product.setUnit(Long.valueOf(Long.parseLong(tplUnit.get("unit").toString())));
            }
            if (tplUnit.get("enableAssistUnit") != null) {
                product.setEnableAssistUnit(Boolean.valueOf(BooleanUtil.isTrue((Object)tplUnit.get("enableAssistUnit").toString())));
            }
            if (this.hasBusinessUnitIsNull(product)) {
                ProductExtend detail = product.detail();
                for (AssistUnitType unitType : AssistUnitType.values()) {
                    if (detail == null || detail.get(unitType.toString()) != null) continue;
                    detail.put(unitType.toString(), tplUnit.get(unitType.toString()));
                }
            }
        }
        if (ObjectUtils.isNotEmpty(tplAssistUnitExchanges)) {
            product.setProductAssistUnitExchanges(this.buildProductAssistUnitExchange(tplAssistUnitExchanges));
        }
    }

    private Map<String, Object> getBusinessUnitByTpl(Long tplId) throws Exception {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        if (tplId != null) {
            QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq((Object)tplId)});
            QuerySchema querySchema = QuerySchema.create().addSelect("template,enableAssistUnit,unit,purchaseUnit,stockUnit,batchUnit,onlineUnit,offlineUnit,requireUnit,batchPriceUnit,purchasePriceUnit,produceUnit,inspectionUnit,demandPlanningUnit").addCondition((ConditionExpression)conditionGroup);
            resultMap = MetaDaoHelper.queryOne((String)"pc.tpl.ProductTplUnit", (QuerySchema)querySchema);
        }
        return resultMap;
    }

    private Map<String, Object> getBusinessUnit(Long productId, Long applyRangeId) throws Exception {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        if (productId != null && applyRangeId != null) {
            QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"id").eq((Object)applyRangeId)});
            QuerySchema querySchema = QuerySchema.create().addSelect("productId.unitUseType as unitUseType,productId.unit as unit, productId.enableAssistUnit as enableAssistUnit,productDetailId.purchaseUnit,productDetailId.stockUnit,productDetailId.batchUnit,productDetailId.onlineUnit,productDetailId.offlineUnit,productDetailId.requireUnit,productDetailId.batchPriceUnit,productDetailId.purchasePriceUnit,productDetailId.produceUnit,productDetailId.inspectionUnit,productDetailId.demandPlanningUnit").addCondition((ConditionExpression)conditionGroup);
            resultMap = MetaDaoHelper.queryOne((String)"pc.product.ProductApplyRange", (QuerySchema)querySchema);
        }
        return resultMap;
    }

    private List<Map<String, Object>> getAssistUnitExchangeByTpl(Long tplId) throws Exception {
        List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
        if (tplId != null) {
            QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq((Object)tplId)});
            QuerySchema querySchema = QuerySchema.create().addSelect("template,unitExchangeType,assistUnit,assistUnitCount,mainUnitCount,iOrder,mainUnitCountNew,mainUnitRate,assistVersValue").addCondition((ConditionExpression)conditionGroup);
            resultList = MetaDaoHelper.query((String)"pc.tpl.ProductTplAssistUnitExchange", (QuerySchema)querySchema);
        }
        return resultList;
    }

    private boolean hasBusinessUnitIsNull(Product product) {
        ProductExtend detail = product.detail();
        if (product.detail() != null) {
            for (AssistUnitType unitType : AssistUnitType.values()) {
                if (detail.get(unitType.toString()) != null) continue;
                return true;
            }
        }
        return false;
    }

    private List<ProductAssistUnitExchange> buildProductAssistUnitExchange(List<Map<String, Object>> tplAssistUnitExchanges) throws Exception {
        ArrayList<ProductAssistUnitExchange> assistUnitExchanges = new ArrayList<ProductAssistUnitExchange>();
        if (ObjectUtils.isNotEmpty(tplAssistUnitExchanges)) {
            for (Map<String, Object> tplAssistUnitExchange : tplAssistUnitExchanges) {
                ProductAssistUnitExchange assistUnitExchange = new ProductAssistUnitExchange();
                assistUnitExchange.put("unitExchangeType", (Object)this.turnInt(tplAssistUnitExchange.get("unitExchangeType")));
                assistUnitExchange.put("assistUnit", tplAssistUnitExchange.get("assistUnit"));
                assistUnitExchange.put("assistUnitCount", tplAssistUnitExchange.get("assistUnitCount"));
                assistUnitExchange.put("mainUnitCount", tplAssistUnitExchange.get("mainUnitCount"));
                assistUnitExchange.put("mainUnitCountNew", tplAssistUnitExchange.get("mainUnitCountNew"));
                assistUnitExchange.put("mainUnitRate", tplAssistUnitExchange.get("mainUnitRate"));
                assistUnitExchange.put("assistVersValue", tplAssistUnitExchange.get("assistVersValue"));
                assistUnitExchange.put("iOrder", tplAssistUnitExchange.get("iOrder"));
                assistUnitExchange.setEntityStatus(EntityStatus.Insert);
                assistUnitExchanges.add(assistUnitExchange);
            }
        }
        return assistUnitExchanges;
    }

    private Integer turnInt(Object value) throws Exception {
        Integer returnvalue = null;
        if (value != null && !value.toString().trim().isEmpty()) {
            try {
                String trimValue = value.toString().trim();
                returnvalue = trimValue.contains(".") ? Integer.valueOf(Integer.parseInt(trimValue.split("\\.")[0])) : Integer.valueOf(Integer.parseInt(trimValue));
            }
            catch (Exception e) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800584, new Object[]{value});
            }
        }
        return returnvalue;
    }

    public Object productAddSave(ProductApiVO dto) throws Exception {
        if (dto == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801155);
        }
        if (StringUtils.isEmpty((CharSequence)dto.getCode())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800787);
        }
        HashMap<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("code", dto.getCode());
        queryMap.put("ytenant_id", AppContext.getYTenantId());
        List productApiVOS = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.ProductVo.queryProduct", queryMap);
        if (!CollectionUtils.isEmpty((Collection)productApiVOS)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801163);
        }
        return this.productSave(dto);
    }

    public Object productUpdateSave(ProductApiVO dto) throws Exception {
        if (dto == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801155);
        }
        HashMap<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("code", dto.getCode());
        queryMap.put("ytenant_id", AppContext.getYTenantId());
        List productApiVOS = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.ProductVo.queryProduct", queryMap);
        if (CollectionUtils.isEmpty((Collection)productApiVOS)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801164);
        }
        return this.productSave(dto);
    }

    @Override
    public ProductApiVO queryProduct(final ProductQueryVO queryVO) throws Exception {
        if (queryVO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800075);
        }
        if (queryVO.getId() == null && queryVO.getProductCode() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801165);
        }
        if (queryVO.getOrgId() == null && queryVO.getOrgCode() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801166);
        }
        UpcAPiTool.checkTenantInfo();
        ArrayList<String> orgList = null;
        List funcOrges = null;
        if (queryVO.getOrgId() != null) {
            orgList = new ArrayList<String>(){
                {
                    this.add(queryVO.getOrgId());
                }
            };
            if (!CollectionUtils.isEmpty((Collection)orgList)) {
                funcOrges = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn((List)orgList).withEnabled());
            }
        } else {
            orgList = new ArrayList<String>(){
                {
                    this.add(queryVO.getOrgCode());
                }
            };
            if (!CollectionUtils.isEmpty((Collection)orgList)) {
                funcOrges = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andCodeIn((List)orgList).withEnabled());
            }
        }
        if (CollectionUtils.isEmpty(funcOrges)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800887);
        }
        queryVO.setOrgId(((OrgUnitDTO)funcOrges.get(0)).getId());
        HashMap<String, Object> queryMap = new HashMap<String, Object>(8);
        if (queryVO.getId() != null) {
            queryMap.put("id", queryVO.getId());
        } else {
            queryMap.put("code", queryVO.getProductCode());
        }
        queryMap.put("orgId", queryVO.getOrgId());
        queryMap.put("ytenant_id", AppContext.getYTenantId());
        List productApiVOS = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.ProductVo.queryProduct", queryMap);
        if (CollectionUtils.isEmpty((Collection)productApiVOS)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801167);
        }
        ProductApiVO productApiVO = (ProductApiVO)productApiVOS.get(0);
        this.dealProductData(productApiVO);
        queryMap.put("id", productApiVO.getId());
        queryVO.setId(productApiVO.getId());
        List productDetailIdAndOrgType = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.ProductVo.queryProductRange", queryMap);
        if (CollectionUtils.isEmpty((Collection)productDetailIdAndOrgType)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801168);
        }
        queryMap.put("productDetailId", ((Map)productDetailIdAndOrgType.get(0)).get("productDetailId"));
        List productDetailVOS = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.ProductDetail.queryProductDetail", queryMap);
        if (CollectionUtils.isEmpty((Collection)productDetailVOS)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801169);
        }
        ProductDetailVO productDetailVO = (ProductDetailVO)productDetailVOS.get(0);
        this.dealProductDetailData(productDetailVO);
        productApiVO.setDetail(productDetailVO);
        this.queryProductDetail((ProductApiVO)productApiVOS.get(0));
        this.handleMultilingual(productApiVO);
        List productOrges = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.ProductVo.queryProductOrgs", queryMap);
        productApiVO.setProductOrges(productOrges);
        this.dealProductOrgesData(productApiVO);
        List productAssistUnitExchangesVOS = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.ProductAssistUnitExchanges.queryProductAssistUnitExchange", queryMap);
        productApiVO.setProductAssistUnitExchanges(productAssistUnitExchangesVOS);
        List productTags = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.ProductTagNew.queryProductTag", queryMap);
        productApiVO.setProductTags(productTags);
        List productBarCodeVOS = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.ProductBarCode.queryProductBarCode", queryMap);
        productApiVO.setProductBarCodes(productBarCodeVOS);
        List productAssistClassVOS = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.ProductAssistClass.queryProductAssistClass", queryMap);
        productApiVO.setProductAssistClasses(productAssistClassVOS);
        ProductDescriptionVO descriptionVO = (ProductDescriptionVO)SqlHelper.selectOne((String)"com.yonyoucloud.upc.mapper.ProductDescription.queryProductDescription", queryMap);
        productApiVO.setDescription(descriptionVO);
        this.attachmentTransService.convertProductAttachmentForAPIVO(productApiVO);
        this.dealProductCustomExtendData(productApiVO);
        Map<String, Object> product = this.queryReferenceEncodingForProduct(queryVO.getId());
        Map<String, Object> productDetailId = this.queryReferenceEncodingForProductDetail((Long)((Map)productDetailIdAndOrgType.get(0)).get("productDetailId"));
        UpcAPiTool.mapToBean(productDetailVOS.get(0), (HashSet)null, (HashMap)((HashMap)productDetailId), ProductSaveFieldMap.productFieldRenameMap);
        UpcAPiTool.mapToBean((Object)productApiVO, (HashSet)null, (HashMap)((HashMap)product), ProductSaveFieldMap.productFieldRenameMap);
        productApiVO.setAutoGenerateRangeData(null);
        productApiVO.setProductAttribute(null);
        productApiVO.setCreatorType(null);
        productApiVO.setPlatFormStatus(null);
        productApiVO.setTimestamp(null);
        productApiVO.setLogicallyDeleteType(null);
        ProductDetailVO detail = productApiVO.getDetail();
        detail.setSaleChannelOfOnlineBatch(null);
        detail.setSaleChannelOfOnlineRetail(null);
        detail.setSaleChannelOfOfflineRetail(null);
        detail.setSaleChannelOfDistribution(null);
        detail.setBatchPolicy(null);
        detail.setBindCarrier(null);
        detail.setWorkingPlan(null);
        detail.setWeighingMode(null);
        detail.setRangeType(null);
        detail.setShopId(null);
        detail.setCreator(null);
        detail.setServiceDurationUnit(null);
        return productApiVO;
    }

    private void dealProductCustomExtendData(ProductApiVO productApiVO) {
        MaterialVO materialVO = new MaterialVO();
        MaterialDetailVO materialDetailVO = new MaterialDetailVO();
        if (productApiVO.getId() != null) {
            materialVO.setId(productApiVO.getId().toString());
        }
        if (productApiVO.getDetail() != null && productApiVO.getDetail().getId() != null) {
            materialDetailVO.setId(productApiVO.getDetail().getId().toString());
            materialVO.setDetail(materialDetailVO);
        }
        Map customExtendData = this.coreDocCustomExtendQueryService.getMaterialExtendData(materialVO);
        productApiVO.setCustomExtend(customExtendData);
    }

    private void dealProductData(ProductApiVO productApiVO) throws Exception {
        OrgUnitDTO createOrg = this.orgService.getOrgByOrgId(productApiVO.getOrgId());
        productApiVO.setOrgCode(null != createOrg ? createOrg.getCode() : null);
        Map productRefCodeName = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect("productClass.code as productClassCode, productClass.name as productClassName, manageClass.code as manageClassCode, manageClass.name as manageClassName ,purchaseClass.code as purchaseClassCode, purchaseClass.name as purchaseClassName ,costClass.code as costClassCode, costClass.name as costClassName ,productTemplate.name as productTemplateName ,brand.code as brandCode, brand.name as brandName , productLine.code as productLineCode, productLine.name as productLineName ,unit.code as unitCode, unit.name as unitName, taxClass.code as taxClassCode, taxClass.name as taxClassName ,weightUnit.code as weightUnitCode, weightUnit.name as weightUnitName ,volumeUnit.code as volumeUnitCode, volumeUnit.name as volumeUnitName ,planClass.code as planClassCode, planClass.name as planClassName ,internalSupplyOrgId.code as internalSupplyOrgCode, internalSupplyOrgId.name as internalSupplyOrgName ,netWeightUnit.code as netWeightUnitCode, netWeightUnit.name as netWeightUnitName, transType.code as transTypeCode, transType.name as transTypeName, optionalMaterialId.code as optionalMaterialCode, optionalMaterialId.name as optionalMaterialName, materialStatus.code as materialStatusCode ").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productApiVO.getId())})));
        block68: for (Map.Entry entry : productRefCodeName.entrySet()) {
            switch ((String)entry.getKey()) {
                case "productClassCode": {
                    productApiVO.setProductClassCode(entry.getValue().toString());
                    continue block68;
                }
                case "productClassName": {
                    productApiVO.setProductClassName(entry.getValue().toString());
                    continue block68;
                }
                case "manageClassCode": {
                    productApiVO.setManageClassCode(entry.getValue().toString());
                    continue block68;
                }
                case "manageClassName": {
                    productApiVO.setManageClassName(entry.getValue().toString());
                    continue block68;
                }
                case "purchaseClassCode": {
                    productApiVO.setPurchaseClassCode(entry.getValue().toString());
                    continue block68;
                }
                case "purchaseClassName": {
                    productApiVO.setPurchaseClassName(entry.getValue().toString());
                    continue block68;
                }
                case "costClassCode": {
                    productApiVO.setCostClassCode(entry.getValue().toString());
                    continue block68;
                }
                case "costClassName": {
                    productApiVO.setCostClassName(entry.getValue().toString());
                    continue block68;
                }
                case "productTemplateName": {
                    productApiVO.setProductTemplateName(entry.getValue().toString());
                    continue block68;
                }
                case "brandCode": {
                    productApiVO.setBrandCode(entry.getValue().toString());
                    continue block68;
                }
                case "brandName": {
                    productApiVO.setBrandName(entry.getValue().toString());
                    continue block68;
                }
                case "productLineCode": {
                    productApiVO.setProductLineCode(entry.getValue().toString());
                    continue block68;
                }
                case "productLineName": {
                    productApiVO.setProductLineName(entry.getValue().toString());
                    continue block68;
                }
                case "unitCode": {
                    productApiVO.setUnitCode(entry.getValue().toString());
                    continue block68;
                }
                case "unitName": {
                    productApiVO.setUnitName(entry.getValue().toString());
                    continue block68;
                }
                case "taxClassCode": {
                    productApiVO.setTaxClassCode(entry.getValue().toString());
                    continue block68;
                }
                case "taxClassName": {
                    productApiVO.setTaxClassName(entry.getValue().toString());
                    continue block68;
                }
                case "weightUnitCode": {
                    productApiVO.setWeightUnitCode(entry.getValue().toString());
                    continue block68;
                }
                case "weightUnitName": {
                    productApiVO.setWeightUnitName(entry.getValue().toString());
                    continue block68;
                }
                case "volumeUnitCode": {
                    productApiVO.setVolumeUnitCode(entry.getValue().toString());
                    continue block68;
                }
                case "volumeUnitName": {
                    productApiVO.setVolumeUnitName(entry.getValue().toString());
                    continue block68;
                }
                case "planClassCode": {
                    productApiVO.setPlanClassCode(entry.getValue().toString());
                    continue block68;
                }
                case "planClassName": {
                    productApiVO.setPlanClassName(entry.getValue().toString());
                    continue block68;
                }
                case "internalSupplyOrgCode": {
                    productApiVO.setInternalSupplyOrgCode(entry.getValue().toString());
                    continue block68;
                }
                case "internalSupplyOrgName": {
                    productApiVO.setInternalSupplyOrgName(entry.getValue().toString());
                    continue block68;
                }
                case "netWeightUnitCode": {
                    productApiVO.setNetWeightUnitCode(entry.getValue().toString());
                    continue block68;
                }
                case "netWeightUnitName": {
                    productApiVO.setNetWeightUnitName(entry.getValue().toString());
                    continue block68;
                }
                case "transTypeCode": {
                    productApiVO.setTransTypeCode(entry.getValue().toString());
                    continue block68;
                }
                case "transTypeName": {
                    productApiVO.setTransTypeName(entry.getValue().toString());
                    continue block68;
                }
                case "optionalMaterialCode": {
                    productApiVO.setOptionalMaterialCode(entry.getValue().toString());
                    continue block68;
                }
                case "optionalMaterialName": {
                    productApiVO.setOptionalMaterialName(entry.getValue().toString());
                    continue block68;
                }
                case "materialStatusCode": {
                    productApiVO.setMaterialStatusCode(entry.getValue().toString());
                    continue block68;
                }
            }
            log.warn("Unknown key: {}", entry.getKey());
        }
    }

    private void dealProductDetailData(ProductDetailVO productDetailVO) throws Exception {
        Map productDetailRefCodeName = MetaDaoHelper.queryOne((String)"pc.product.ProductDetail", (QuerySchema)QuerySchema.create().addSelect("purchaseUnit.code as purchaseUnitCode, purchaseUnit.name as purchaseUnitName, purchasePriceUnit.code as purchasePriceUnitCode, purchasePriceUnit.name as purchasePriceUnitName ,stockUnit.code as stockUnitCode, stockUnit.name as stockUnitName ,batchUnit.code as batchUnitCode, batchUnit.name as batchUnitName ,onlineUnit.code as onlineUnitCode, onlineUnit.name as onlineUnitName , offlineUnit.code as offlineUnitCode, offlineUnit.name as offlineUnitName ,requireUnit.code as requireUnitCode, requireUnit.name as requireUnitName, batchPriceUnit.code as batchPriceUnitCode, batchPriceUnit.name as batchPriceUnitName ,inspectionUnit.code as inspectionUnitCode, inspectionUnit.name as inspectionUnitName ,omsWarehouse.code as omsWarehouseCode, omsWarehouse.name as omsWarehouseName ,produceDepartment.code as produceDepartmentCode, produceDepartment.name as produceDepartmentName ,manufacturePlanner.code as manufacturePlannerCode, manufacturePlanner.name as manufacturePlannerName ,productVendor.code as productVendorCode, productVendor.name as productVendorName, productBuyer.code as productBuyerCode, productBuyer.name as productBuyerName, inTaxrate.code as incomeTaxRatesCode, inTaxrate.name as incomeTaxRatesName, outTaxrate.code as outTaxRateCode, outTaxrate.name as outTaxRateName, produceUnit.code as produceUnitCode, produceUnit.name as produceUnitName, demandPlanningUnit.code as demandPlanningUnitCode, demandPlanningUnit.name as demandPlanningUnitName, warehouseManager.code as warehouseManagerCode, warehouseManager.name as warehouseManagerName, deliveryWarehouse.code as deliveryWarehouseCode, deliveryWarehouse.name as deliveryWarehouseName, returnWarehouse.code as returnWarehouseCode, returnWarehouse.name as returnWarehouseName, receiptWarehouse.code as receiptWarehouseCode, receiptWarehouse.name as receiptWarehouseName, costItems.code as costItemsCode, costItems.name as costItemsName, materialStatus.code as materialStatusCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productDetailVO.getId())})));
        block98: for (Map.Entry entry : productDetailRefCodeName.entrySet()) {
            switch ((String)entry.getKey()) {
                case "purchaseUnitCode": {
                    productDetailVO.setPurchaseUnitCode(entry.getValue().toString());
                    continue block98;
                }
                case "purchaseUnitName": {
                    productDetailVO.setPurchaseUnitName(entry.getValue().toString());
                    continue block98;
                }
                case "purchasePriceUnitCode": {
                    productDetailVO.setPurchasePriceUnitCode(entry.getValue().toString());
                    continue block98;
                }
                case "purchasePriceUnitName": {
                    productDetailVO.setPurchasePriceUnitName(entry.getValue().toString());
                    continue block98;
                }
                case "stockUnitCode": {
                    productDetailVO.setStockUnitCode(entry.getValue().toString());
                    continue block98;
                }
                case "stockUnitName": {
                    productDetailVO.setStockUnitName(entry.getValue().toString());
                    continue block98;
                }
                case "batchUnitCode": {
                    productDetailVO.setBatchUnitCode(entry.getValue().toString());
                    continue block98;
                }
                case "batchUnitName": {
                    productDetailVO.setBatchUnitName(entry.getValue().toString());
                    continue block98;
                }
                case "onlineUnitCode": {
                    productDetailVO.setOnlineUnitCode(entry.getValue().toString());
                    continue block98;
                }
                case "onlineUnitName": {
                    productDetailVO.setOnlineUnitName(entry.getValue().toString());
                    continue block98;
                }
                case "offlineUnitCode": {
                    productDetailVO.setOfflineUnitCode(entry.getValue().toString());
                    continue block98;
                }
                case "offlineUnitName": {
                    productDetailVO.setOfflineUnitName(entry.getValue().toString());
                    continue block98;
                }
                case "requireUnitCode": {
                    productDetailVO.setRequireUnitCode(entry.getValue().toString());
                    continue block98;
                }
                case "requireUnitName": {
                    productDetailVO.setRequireUnitName(entry.getValue().toString());
                    continue block98;
                }
                case "batchPriceUnitCode": {
                    productDetailVO.setBatchPriceUnitCode(entry.getValue().toString());
                    continue block98;
                }
                case "batchPriceUnitName": {
                    productDetailVO.setBatchPriceUnitName(entry.getValue().toString());
                    continue block98;
                }
                case "inspectionUnitCode": {
                    productDetailVO.setInspectionUnitCode(entry.getValue().toString());
                    continue block98;
                }
                case "inspectionUnitName": {
                    productDetailVO.setInspectionUnitName(entry.getValue().toString());
                    continue block98;
                }
                case "omsWarehouseCode": {
                    productDetailVO.setOmsWarehouseCode(entry.getValue().toString());
                    continue block98;
                }
                case "omsWarehouseName": {
                    productDetailVO.setOmsWarehouseName(entry.getValue().toString());
                    continue block98;
                }
                case "produceDepartmentCode": {
                    productDetailVO.setProduceDepartmentCode(entry.getValue().toString());
                    continue block98;
                }
                case "produceDepartmentName": {
                    productDetailVO.setProduceDepartmentName(entry.getValue().toString());
                    continue block98;
                }
                case "manufacturePlannerCode": {
                    productDetailVO.setManufacturePlannerCode(entry.getValue().toString());
                    continue block98;
                }
                case "manufacturePlannerName": {
                    productDetailVO.setManufacturePlannerName(entry.getValue().toString());
                    continue block98;
                }
                case "productVendorCode": {
                    productDetailVO.setProductVendorCode(entry.getValue().toString());
                    continue block98;
                }
                case "productVendorName": {
                    productDetailVO.setProductVendorName(entry.getValue().toString());
                    continue block98;
                }
                case "productBuyerCode": {
                    productDetailVO.setProductBuyerCode(entry.getValue().toString());
                    continue block98;
                }
                case "productBuyerName": {
                    productDetailVO.setProductBuyerName(entry.getValue().toString());
                    continue block98;
                }
                case "incomeTaxRatesCode": {
                    productDetailVO.setIncomeTaxRatesCode(entry.getValue().toString());
                    continue block98;
                }
                case "incomeTaxRatesName": {
                    productDetailVO.setIncomeTaxRatesName(entry.getValue().toString());
                    continue block98;
                }
                case "outTaxRateCode": {
                    productDetailVO.setOutTaxRateCode(entry.getValue().toString());
                    continue block98;
                }
                case "outTaxRateName": {
                    productDetailVO.setOutTaxRateName(entry.getValue().toString());
                    continue block98;
                }
                case "produceUnitCode": {
                    productDetailVO.setProduceUnitCode(entry.getValue().toString());
                    continue block98;
                }
                case "produceUnitName": {
                    productDetailVO.setProduceUnitName(entry.getValue().toString());
                    continue block98;
                }
                case "demandPlanningUnitCode": {
                    productDetailVO.setDemandPlanningUnitCode(entry.getValue().toString());
                    continue block98;
                }
                case "demandPlanningUnitName": {
                    productDetailVO.setDemandPlanningUnitName(entry.getValue().toString());
                    continue block98;
                }
                case "warehouseManagerCode": {
                    productDetailVO.setWarehouseManagerCode(entry.getValue().toString());
                    continue block98;
                }
                case "warehouseManagerName": {
                    productDetailVO.setWarehouseManagerName(entry.getValue().toString());
                    continue block98;
                }
                case "deliveryWarehouseCode": {
                    productDetailVO.setDeliveryWarehouseCode(entry.getValue().toString());
                    continue block98;
                }
                case "deliveryWarehouseName": {
                    productDetailVO.setDeliveryWarehouseName(entry.getValue().toString());
                    continue block98;
                }
                case "returnWarehouseCode": {
                    productDetailVO.setReturnWarehouseCode(entry.getValue().toString());
                    continue block98;
                }
                case "returnWarehouseName": {
                    productDetailVO.setReturnWarehouseName(entry.getValue().toString());
                    continue block98;
                }
                case "receiptWarehouseCode": {
                    productDetailVO.setReceiptWarehouseCode(entry.getValue().toString());
                    continue block98;
                }
                case "receiptWarehouseName": {
                    productDetailVO.setReceiptWarehouseName(entry.getValue().toString());
                    continue block98;
                }
                case "costItemsCode": {
                    productDetailVO.setCostItemsCode(entry.getValue().toString());
                    continue block98;
                }
                case "costItemsName": {
                    productDetailVO.setCostItemsName(entry.getValue().toString());
                    continue block98;
                }
                case "materialStatusCode": {
                    productDetailVO.setMaterialStatusCode(entry.getValue().toString());
                    continue block98;
                }
            }
            log.warn("Unknown key: {}", entry.getKey());
        }
    }

    private void dealProductOrgesData(ProductApiVO productApiVO) throws Exception {
        ArrayList<ProductOrgVo> productOrgVos = new ArrayList<ProductOrgVo>();
        List productOrgs = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect("rangeType as rangeType,orgId as orgId,orgId.code as orgCode,isCreator as isCreator,isApplied as isApplied").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productApiVO.getId())})));
        if (!CollectionUtils.isEmpty((Collection)productOrgs)) {
            for (Map productOrg : productOrgs) {
                ProductOrgVo productOrgVo = new ProductOrgVo();
                productOrgVo.setRangeType((Integer)productOrg.get("rangeType"));
                productOrgVo.setOrgId((String)productOrg.get("orgId"));
                productOrgVo.setOrgCode((String)productOrg.get("orgCode"));
                productOrgVo.setIsCreator((Boolean)productOrg.get("isCreator"));
                productOrgVo.setIsApplied((Boolean)productOrg.get("isApplied"));
                productOrgVo.setOrgType((Integer)productOrg.get("rangeType"));
                productOrgVos.add(productOrgVo);
            }
        }
        productApiVO.setProductOrges(productOrgVos);
    }

    public ProductApiVO queryProductApplyRangeDetail(ProductQueryVO queryVO) throws Exception {
        ProductApiVO productApiVO = this.queryProduct(queryVO);
        if (null != productApiVO.getOrgId() && productApiVO.getOrgId().equals(queryVO.getOrgId())) {
            HashMap<String, Object> queryMap = new HashMap<String, Object>(2);
            queryMap.put("id", productApiVO.getId());
            queryMap.put("ytenant_id", AppContext.getYTenantId());
            List productOrges = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.ProductVo.queryProductOrgsAll", queryMap);
            productApiVO.setProductOrges(productOrges);
        } else {
            productApiVO.setProductOrges(null);
        }
        return productApiVO;
    }

    @Override
    public Object productApplySave(ProductApplyVO productApplyVO) throws Exception {
        Map description;
        if (productApplyVO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801155);
        }
        if (productApplyVO.getProductData() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801170);
        }
        ProductApiVO productData = productApplyVO.getProductData();
        productApplyVO.setApplyType("0");
        Map productApplyMap = UpcAPiTool.beanToMap((Object)productApplyVO, null, ProductSaveFieldMap.productApplyFieldRenameMap, (String)"Insert");
        ProductApply productApply = new ProductApply();
        productApply.putAll(productApplyMap);
        this.productCheckForApiService.checkMustInputForProductApplySave(productApply);
        Map productMap = UpcAPiTool.beanToMap((Object)productData, ProductSaveFieldMap.productFieldType, ProductSaveFieldMap.productFieldRenameMap, (String)"Insert");
        Product product = new Product();
        product.putAll(productMap);
        this.productCheckForApiService.checkProductBefore(product);
        this.productCheckService.commonCheck(product);
        this.productCheckForApiService.addRowNumForProductSubData(product);
        this.productDefaultValueService.setDefaultValueForProductInsert(product);
        DataTransferUtils.fill((String)"pc_product", (String)"pc.product.Product", (Object)product, (int)2);
        if (productApplyVO.getProductData().getAutoGenerateRangeData() != null && productApplyVO.getProductData().getAutoGenerateRangeData().booleanValue()) {
            product.put("productOrgs", null);
            List<String> orgRangeShareAll = this.upcControlRuleService.getOrgRangeShareAll("pc.product.Product", product.getOrgId());
            ArrayList<3> orgesRange = new ArrayList<3>(orgRangeShareAll.size());
            for (final String orgId : orgRangeShareAll) {
                orgesRange.add(new HashMap<String, Object>(){
                    {
                        this.put("orgId", orgId);
                    }
                });
            }
            product.put("productOrgs", orgesRange);
        }
        this.productCheckForApiService.checkAndSetProductApplyOrg(product);
        this.handleUnitForProduct(product);
        if (product.getTransType() == null) {
            List<TransType> transTypes = this.coredocTransTypeService.getTransTypeByFormId("PC.pc_product");
            if (CollectionUtils.isEmpty(transTypes)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_TRANS_TYPE_NOT_FOUND);
            }
            product.setTransType(transTypes.get(0).getId());
            product.put("transType_Name", (Object)transTypes.get(0).getName().toString());
        }
        this.setMaterialClassNameAndCode(product);
        Map detail = (Map)product.get("detail");
        assert (detail.size() < CheckLimitConstant.DEFAULT_LIMIT);
        for (Map.Entry entry : detail.entrySet()) {
            product.put("detail!" + (String)entry.getKey(), entry.getValue());
        }
        product.remove("detail");
        if (product.get("description") != null) {
            description = (Map)product.get("description");
            assert (description.size() < CheckLimitConstant.DEFAULT_LIMIT);
            for (Map.Entry entry : description.entrySet()) {
                product.put("description!" + (String)entry.getKey(), entry.getValue());
            }
            product.remove("description");
        }
        if (product.get("time") != null) {
            description = (Map)product.get("time");
            assert (description.size() < CheckLimitConstant.DEFAULT_LIMIT);
            for (Map.Entry entry : description.entrySet()) {
                product.put("time!" + (String)entry.getKey(), entry.getValue());
            }
            product.remove("time");
        }
        if (!CollectionUtils.isEmpty((Collection)product.productAssistUnitExchanges())) {
            this.productDataProcessRule.processAssistUnitExchanges(product);
        }
        this.checkProductUseSkuProperties(product);
        this.dealProductCharacterData(product, "productCharacterDef");
        this.dealProductCharacterData(product, "productPropCharacterDefine");
        this.dealProductCharacterData(product, "detail!productExtendCharacterDef");
        this.dealProductDataDisplay(product);
        this.productCheckService.checkNetWeightPrecision(product);
        productApply.setProductData(JSON.toJSONString((Object)product));
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("pc_productapply");
        billDataDto.setAction("save");
        billDataDto.setConvertType(Integer.valueOf(2));
        billDataDto.setData((Object)productApply);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            ProductApplyVO resultProductApplyVO = new ProductApplyVO();
            resultProductApplyVO.setId((Long)((ProductApply)result).getId());
            return resultProductApplyVO;
        }
        return result;
    }

    public void dealProductCharacterData(Product product, String characterField) throws Exception {
        if (product.get(characterField) != null) {
            Map characterMap = (Map)product.get(characterField);
            Iterator characterIterator = characterMap.entrySet().iterator();
            ArrayList<String> characterCodeList = new ArrayList<String>();
            while (characterIterator.hasNext()) {
                Map.Entry entry = characterIterator.next();
                if (entry.getValue() == null) continue;
                characterCodeList.add((String)entry.getKey());
            }
            if (!CollectionUtils.isEmpty(characterCodeList)) {
                ICharaterServiceRPC characterServiceRPC = (ICharaterServiceRPC)IrisDynamicInvokeUtil.getService((String)"u8c-userdefine", (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, ICharaterServiceRPC.class);
                List characterDTOS = characterServiceRPC.getSimpleCharacterDTOByCharacterCodes(characterCodeList);
                for (CharacterDTO characterDTO : characterDTOS) {
                    Map valueMap;
                    String characterType = characterDTO.getCharactorType();
                    String refRetFieldName = characterDTO.getRefRetFieldName();
                    String refDocURI = characterDTO.getRefDocURI();
                    String refDocDomain = characterDTO.getRefDocDomain();
                    if (!"6".equals(characterType) && !"5".equals(characterType) || (valueMap = this.productQueryService.getCrossDomainFieldValue(characterMap.get(characterDTO.getCode()), refDocURI, refDocDomain, refRetFieldName)) == null || valueMap.isEmpty()) continue;
                    characterMap.put(characterDTO.getCode() + "_" + refRetFieldName, valueMap.get(refRetFieldName));
                }
                product.put(characterField, (Object)characterMap);
            }
        }
    }

    public void dealProductDataDisplay(Product product) throws Exception {
        Object value;
        Property property;
        Object value2;
        if (product.getProductClass() != null) {
            value2 = this.queryFieldValueById(product.getProductClass(), "name", "pc.cls.PresentationClass", "productcenter");
            product.put("productClass_Name", value2);
        }
        if (product.getCostClass() != null) {
            value2 = this.queryFieldValueById(product.getCostClass(), "name", "pc.cls.CostClass", "productcenter");
            product.put("costClass_Name", value2);
        }
        if (product.getPurchaseClass() != null) {
            value2 = this.queryFieldValueById(product.getPurchaseClass(), "name", "pc.cls.PurchaseClass", "productcenter");
            product.put("purchaseClass_Name", value2);
        }
        if (product.getProductTemplate() != null) {
            value2 = this.queryFieldValueById(product.getProductTemplate(), "name", "pc.tpl.ProductTpl", "productcenter");
            product.put("productTemplate_Name", value2);
        }
        if (product.getGiftCardId() != null && (property = MetaDaoHelper.getEntity((String)"pc.product.Product").attrMap().get("giftCardId")) != null) {
            value = this.queryFieldValueById(product.getGiftCardId(), "giftCardName", property.getTypeUri(), "upromotion");
            product.put("giftCardId_Name", value);
        }
        if (product.getCouponId() != null && (property = MetaDaoHelper.getEntity((String)"pc.product.Product").attrMap().get("couponId")) != null) {
            value = this.queryFieldValueById(product.getCouponId(), "cTitle", property.getTypeUri(), "uhy");
            product.put("couponId_Name", value);
        }
    }

    public Object queryFieldValueById(Long id, String queryFiled, String fullName, String group) throws Exception {
        Object fieldValue = null;
        QuerySchema querySchema = QuerySchema.create().addSelect(queryFiled).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)id)}));
        List queryResult = MetaDaoHelper.query((String)fullName, (QuerySchema)querySchema, (String)group);
        if (!CollectionUtils.isEmpty((Collection)queryResult)) {
            fieldValue = ((Map)queryResult.get(0)).get(queryFiled);
        }
        return fieldValue;
    }

    public void checkProductUseSkuProperties(Product product) throws Exception {
        Integer useSku = product.getUseSku();
        if (useSku == null) {
            product.setUseSku(Integer.valueOf(0));
            if (StringUtils.isNotEmpty((CharSequence)((CharSequence)product.get("detail!saleChannel")))) {
                product.setUseSku(Integer.valueOf(1));
            }
            if (product.getProductTemplate() != null && product.getProductTemplate() > 0L && this.productTplService.isSkuSens(product.getProductTemplate())) {
                product.setUseSku(Integer.valueOf(1));
            }
        } else {
            if (0 == useSku && StringUtils.isNotEmpty((CharSequence)((CharSequence)product.get("detail!saleChannel")))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800824);
            }
            if (0 == useSku && product.getProductTemplate() != null && product.getProductTemplate() > 0L && this.productTplService.isSkuSens(product.getProductTemplate())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800825);
            }
        }
    }

    @Override
    public ProductApplyVO queryProductApply(ProductApplyQueryVO queryVO) throws Exception {
        Map map;
        QuerySchema schema;
        List productApplyCharacterDef;
        if (queryVO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801171);
        }
        if (queryVO.getId() == null && queryVO.getApplyCode() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801172);
        }
        UpcAPiTool.checkTenantInfo();
        HashMap<String, Object> queryMap = new HashMap<String, Object>(4);
        queryMap.put("ytenant_id", AppContext.getYTenantId());
        if (queryVO.getId() != null) {
            queryMap.put("id", queryVO.getId());
        } else {
            queryMap.put("applyCode", queryVO.getApplyCode());
        }
        List productApplies = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.productapply.getProductApply", queryMap);
        if (CollectionUtils.isEmpty((Collection)productApplies)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801173);
        }
        ProductApply productApply = (ProductApply)productApplies.get(0);
        String productData = productApply.getProductData();
        productApply.remove("productData");
        ProductApplyVO productApplyVO = (ProductApplyVO)JSONObject.parseObject((String)JSONObject.toJSONString((Object)productApply), ProductApplyVO.class);
        if (productApply.getId() != null && !CollectionUtils.isEmpty((Collection)(productApplyCharacterDef = MetaDaoHelper.query((String)"pc.productapply.ProductApply", (QuerySchema)(schema = QuerySchema.create().addSelect("productApplyCharacterDef").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(productApply.getId())})))))) && (map = (Map)productApplyCharacterDef.get(0)).containsKey("productApplyCharacterDef")) {
            productApplyVO.setProductApplyCharacterDef((Map)map.get("productApplyCharacterDef"));
        }
        Product product = (Product)Objectlizer.decodeObj((Json)new Json(productData), (String)"pc.product.Product");
        ProductExtend productDetail = (ProductExtend)product.get("detail");
        ProductApiVO productApiVO = new ProductApiVO();
        Map productMap = (Map)JSON.parseObject((String)productData, Map.class);
        if (productMap.get("_ecsuite_temp") != null) {
            product.put("_ecsuite_temp", productMap.get("_ecsuite_temp"));
        }
        this.attachmentTransService.convertProductAttachmentBySourceId((Map)product);
        UpcAPiTool.mapToBean((Object)productApiVO, ProductSaveFieldMap.productFieldType, (HashMap)product, ProductSaveFieldMap.productFieldRenameMap);
        productApiVO.setSource(product.get("source") != null ? Integer.valueOf(product.get("source").toString()) : null);
        productApiVO.setUnitUseType(product.get("unitUseType") != null ? Integer.valueOf(product.get("unitUseType").toString()) : null);
        productApiVO.setProductPropCharacterDefine((Map)product.get("productPropCharacterDefine"));
        productApiVO.setProductCharacterDef((Map)product.get("productCharacterDef"));
        this.processAssistUnitExchange(productApiVO, productData);
        productDetail.remove("creator");
        ProductDetailVO productDetailVO = (ProductDetailVO)JSONObject.parseObject((String)JSONObject.toJSONString((Object)productDetail), ProductDetailVO.class, (Feature[])new Feature[]{Feature.DisableFieldSmartMatch});
        UpcAPiTool.mapToBean((Object)productDetailVO, ProductSaveFieldMap.productFieldType, (HashMap)productDetail, ProductSaveFieldMap.productFieldRenameMap);
        productDetailVO.setProductExtendCharacterDef((Map)productDetail.get("productExtendCharacterDef"));
        productApiVO.setDetail(productDetailVO);
        productApplyVO.setProductData(productApiVO);
        return productApplyVO;
    }

    private void processAssistUnitExchange(ProductApiVO productApiVO, String productData) {
        ProductApiVO product = (ProductApiVO)JSONObject.parseObject((String)productData, ProductApiVO.class, (Feature[])new Feature[]{Feature.DisableFieldSmartMatch});
        List productAssistUnitExchanges = productApiVO.getProductAssistUnitExchanges();
        List productAssistUnitExchangesTarget = product.getProductAssistUnitExchanges();
        if (!CollectionUtils.isEmpty((Collection)productAssistUnitExchanges) && !CollectionUtils.isEmpty((Collection)productAssistUnitExchangesTarget)) {
            Map assistCollect = productAssistUnitExchangesTarget.stream().collect(Collectors.toMap(k -> k.getAssistUnit(), Function.identity(), (k1, k2) -> k1));
            Iterator iterator = productAssistUnitExchanges.iterator();
            while (iterator.hasNext()) {
                ProductAssistUnitExchangesVO data;
                ProductAssistUnitExchangesVO assistUnitExchangesVO = (ProductAssistUnitExchangesVO)assistCollect.get((data = (ProductAssistUnitExchangesVO)iterator.next()).getAssistUnit());
                data.setUnitExchangeType(assistUnitExchangesVO.getUnitExchangeType() != null ? assistUnitExchangesVO.getUnitExchangeType() : null);
            }
        }
    }

    public UPCPager listProductApplyV2(ProductApplyQueryVO queryVO) throws Exception {
        Pager pager = this.listProductApply(queryVO);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    @Override
    public Pager listProductApply(ProductApplyQueryVO queryVO) throws Exception {
        QueryConditionGroup queryConditionGroup;
        UpcAPiTool.checkTenantInfo();
        if (queryVO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801174);
        }
        if (queryVO.getPageIndex() == null) {
            queryVO.setPageIndex(UpcAPiTool.DEFAULT_PAGE_INDEX);
        }
        if (queryVO.getPageSize() == null) {
            queryVO.setPageSize(UpcAPiTool.DEFAULT_PAGE_SIZE);
        }
        if (queryVO.getPageSize() > UpcAPiTool.PAGE_MAX_SIZE) {
            queryVO.setPageSize(UpcAPiTool.PAGE_MAX_SIZE);
        }
        if ((queryConditionGroup = UpcAPiTool.setAllCondition((Object)queryVO, (Map)ProductAPIUtils.productApplyFieldMap)) == null) {
            queryConditionGroup = new QueryConditionGroup();
        }
        if (queryVO.getTimestamp() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").egt((Object)queryVO.getTimestamp()));
        }
        if (queryVO.getPubts() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").egt((Object)queryVO.getPubts()));
        }
        if (queryVO.getAuditDate() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"auditDate").egt((Object)queryVO.getAuditDate()));
        }
        if (queryVO.getCreateDate() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"createDate").egt((Object)queryVO.getCreateDate()));
        }
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()));
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.productApplyFieldMap, (String[])queryVO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addSelect("pubts as timestamp,auditDate,createDate").addCondition((ConditionExpression)queryConditionGroup).addPager(queryVO.getPageIndex().intValue(), queryVO.getPageSize().intValue());
        schema.setPartitionable(false);
        Pager pager = MetaDaoHelper.queryByPage((String)"pc.productapply.ProductApply", (QuerySchema)schema);
        if (pager != null && pager.getRecordList() != null) {
            pager.setRecordList(JSON.parseArray((String)JSON.toJSONString((Object)pager.getRecordList()), ProductApplyVO.class));
        }
        return pager;
    }

    @Override
    public CoreDocJsonResult<ProductApplySaveVO> productApplyDetailSave(ProductApplySaveVO productApplySaveVO) throws Exception {
        Map productApplyMap = (Map)JSONObject.parseObject((String)JSONObject.toJSONString((Object)productApplySaveVO), Map.class);
        DataTransferUtils.fill((String)"pc_productdetail", (String)"pc.product.Product", (Object)productApplyMap, (int)2);
        Product product = new Product();
        product.putAll(productApplyMap);
        this.productCheckService.commonCheckForProductDetail(product);
        if (productApplyMap != null && !productApplyMap.isEmpty()) {
            BillDataDto billDataDto = new BillDataDto();
            billDataDto.setBillnum("pc_productdetail");
            billDataDto.setAction("save");
            billDataDto.setData((Object)productApplyMap);
            billDataDto.setFromApi(true);
            billDataDto.setConvertType(Integer.valueOf(2));
            RuleExecuteResult result = this.upcBillService.executeUpdate("save", this.upcBillService.dealBillDataForApi(billDataDto, "save"));
            Object data = result.getData();
            if (data != null) {
                return CoreDocJsonResult.success((Object)((ProductApplySaveVO)JSONObject.parseObject((String)JSONObject.toJSONString((Object)data), ProductApplySaveVO.class)));
            }
            return CoreDocJsonResult.error((Long)999L, (String)result.getMessage());
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
    }

    public Object productApplySaveFromIdempotent(OpenAPIDTO<ProductApplyVO> productApplyVO) {
        if (productApplyVO == null || productApplyVO.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            return this.productApplySave((ProductApplyVO)productApplyVO.getData());
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u7533\u8bf7\u5355\u65b0\u589e-\u5e42\u7b49\u63a5\u53e3\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<ProductApplySaveVO> productApplyDetailSaveFromIdempotent(OpenAPIDTO<ProductApplySaveVO> productApplySaveVO) {
        if (productApplySaveVO == null || productApplySaveVO.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            return this.productApplyDetailSave((ProductApplySaveVO)productApplySaveVO.getData());
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u4f7f\u7528\u4fe1\u606f\u7ef4\u62a4\u4fdd\u5b58-\u5e42\u7b49\u63a5\u53e3\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    private void queryProductDetail(ProductApiVO productApiVO) throws Exception {
        Map map;
        QuerySchema schema;
        List productPropCharacterDefine;
        ProductDetailVO detail;
        QuerySchema schema2;
        List productPropCharacterDefine2;
        if (!(productApiVO.getProductPropCharacterDefineId() == null && productApiVO.getProductCharacterDefId() == null || CollectionUtils.isEmpty((Collection)(productPropCharacterDefine2 = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)(schema2 = QuerySchema.create().addSelect("productPropCharacterDefine, productCharacterDef").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(new Object[]{productApiVO.getId()})})))))))) {
            Map map2 = (Map)productPropCharacterDefine2.get(0);
            if (map2.containsKey("productPropCharacterDefine") && map2.get("productPropCharacterDefine") instanceof Map) {
                productApiVO.setProductPropCharacterDefine((Map)map2.get("productPropCharacterDefine"));
            }
            if (map2.containsKey("productCharacterDef") && map2.get("productCharacterDef") instanceof Map) {
                productApiVO.setProductCharacterDef((Map)map2.get("productCharacterDef"));
            }
        }
        if ((detail = productApiVO.getDetail()).getProductExtendCharacterDefId() != null && !CollectionUtils.isEmpty((Collection)(productPropCharacterDefine = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)(schema = QuerySchema.create().addSelect("productExtendCharacterDef").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(new Object[]{detail.getId()})})))))) && (map = (Map)productPropCharacterDefine.get(0)).containsKey("productExtendCharacterDef") && map.get("productExtendCharacterDef") instanceof Map) {
            detail.setProductExtendCharacterDef((Map)map.get("productExtendCharacterDef"));
        }
    }

    public void handleMultilingual(ProductApiVO productApiVO) {
        MultilingualVO name = new MultilingualVO();
        name.setSimplifiedName(productApiVO.getName1());
        name.setEnglishName(productApiVO.getName2());
        name.setTraditionalName(productApiVO.getName3());
        productApiVO.setName(name);
        MultilingualVO modelDescription = new MultilingualVO();
        modelDescription.setSimplifiedName(productApiVO.getModeldescription1());
        modelDescription.setEnglishName(productApiVO.getModeldescription2());
        modelDescription.setTraditionalName(productApiVO.getModeldescription3());
        productApiVO.setModelDescription(modelDescription);
        MultilingualVO model = new MultilingualVO();
        model.setSimplifiedName(productApiVO.getModel1());
        model.setEnglishName(productApiVO.getModel2());
        model.setTraditionalName(productApiVO.getModel3());
        productApiVO.setModel(model);
        MultilingualVO keywords = new MultilingualVO();
        keywords.setSimplifiedName(productApiVO.getKeywords1());
        keywords.setEnglishName(productApiVO.getKeywords2());
        keywords.setTraditionalName(productApiVO.getKeywords3());
        productApiVO.setKeywords(keywords);
        MultilingualVO shareDescription = new MultilingualVO();
        shareDescription.setSimplifiedName(productApiVO.getSharedescription1());
        shareDescription.setEnglishName(productApiVO.getSharedescription2());
        shareDescription.setTraditionalName(productApiVO.getSharedescription3());
        productApiVO.setShareDescription(shareDescription);
        ProductDetailVO detail = productApiVO.getDetail();
        MultilingualVO receiptName = new MultilingualVO();
        receiptName.setSimplifiedName(detail.getReceiptName1());
        receiptName.setEnglishName(detail.getReceiptName2());
        receiptName.setTraditionalName(detail.getReceiptName3());
        detail.setReceiptName(receiptName);
        MultilingualVO displayName = new MultilingualVO();
        displayName.setSimplifiedName(detail.getDisplayName1());
        displayName.setEnglishName(detail.getDisplayName2());
        displayName.setTraditionalName(detail.getDisplayName3());
        detail.setDisplayName(displayName);
        MultilingualVO titleMemo = new MultilingualVO();
        titleMemo.setSimplifiedName(detail.getTitleMemo1());
        titleMemo.setEnglishName(detail.getTitleMemo2());
        titleMemo.setTraditionalName(detail.getTitleMemo3());
        detail.setTitleMemo(titleMemo);
        MultilingualVO metaDescription = new MultilingualVO();
        metaDescription.setSimplifiedName(detail.getMetadescription1());
        metaDescription.setEnglishName(detail.getMetadescription2());
        metaDescription.setTraditionalName(detail.getMetadescription3());
        detail.setMetaDescription(metaDescription);
    }

    public void handleUnitForProduct(Product product) throws Exception {
        HashSet<Long> unitIds = new HashSet<Long>();
        HashSet<String> unitCodeList = new HashSet<String>();
        if (product.getUnit() != null) {
            unitIds.add(product.getUnit());
        } else {
            unitCodeList.add((String)product.get("unit_Code"));
        }
        ProductExtend detail = product.detail();
        if (detail.getPurchaseUnit() != null) {
            unitIds.add(detail.getPurchaseUnit());
        } else {
            unitCodeList.add((String)detail.get("purchaseUnit_Code"));
        }
        if (detail.getPurchasePriceUnit() != null) {
            unitIds.add(detail.getPurchasePriceUnit());
        } else {
            unitCodeList.add((String)detail.get("purchasePriceUnit_Code"));
        }
        if (detail.getStockUnit() != null) {
            unitIds.add(detail.getStockUnit());
        } else {
            unitCodeList.add((String)detail.get("stockUnit_Code"));
        }
        if (detail.getProduceUnit() != null) {
            unitIds.add(detail.getProduceUnit());
        } else {
            unitCodeList.add((String)detail.get("produceUnit_Code"));
        }
        if (detail.getBatchPriceUnit() != null) {
            unitIds.add(detail.getBatchPriceUnit());
        } else {
            unitCodeList.add((String)detail.get("batchPriceUnit_Code"));
        }
        if (detail.get("inspectionUnit") != null) {
            unitIds.add((Long)detail.get("inspectionUnit"));
        } else {
            unitCodeList.add((String)detail.get("inspectionUnit_Code"));
        }
        if (detail.getBatchUnit() != null) {
            unitIds.add(detail.getBatchUnit());
        } else {
            unitCodeList.add((String)detail.get("batchPriceUnit_Code"));
        }
        if (detail.getOnlineUnit() != null) {
            unitIds.add(detail.getOnlineUnit());
        } else {
            unitCodeList.add((String)detail.get("batchPriceUnit_Code"));
        }
        if (detail.getOnlineUnit() != null) {
            unitIds.add(detail.getOnlineUnit());
        } else {
            unitCodeList.add((String)detail.get("onlineUnit_Code"));
        }
        if (detail.getOfflineUnit() != null) {
            unitIds.add(detail.getOfflineUnit());
        } else {
            unitCodeList.add((String)detail.get("offlineUnit_Code"));
        }
        if (detail.getRequireUnit() != null) {
            unitIds.add(detail.getRequireUnit());
        } else {
            unitCodeList.add((String)detail.get("requireUnit_Code"));
        }
        if (detail.getDemandPlanningUnit() != null) {
            unitIds.add(detail.getDemandPlanningUnit());
        } else if (detail.containsKey((Object)"demandPlanningUnit_Code")) {
            unitCodeList.add((String)detail.get("demandPlanningUnit_Code"));
        }
        List productAssistUnitExchanges = product.productAssistUnitExchanges();
        if (!CollectionUtils.isEmpty((Collection)productAssistUnitExchanges)) {
            for (ProductAssistUnitExchange assistUnitExchange : productAssistUnitExchanges) {
                if (assistUnitExchange.getAssistUnit() != null) {
                    unitIds.add(assistUnitExchange.getAssistUnit());
                    continue;
                }
                if (assistUnitExchange.get("assistUnit_Code") == null) continue;
                unitCodeList.add((String)assistUnitExchange.get("assistUnit_Code"));
            }
        }
        Iterable unitByIds = null;
        Iterable unitByCode = null;
        HashMap unit = new HashMap();
        HashMap unitCode = new HashMap();
        if (!CollectionUtils.isEmpty(unitIds)) {
            unitByIds = this.unitService.getUnitByIds(new ArrayList(unitIds), new String[]{"id", "code", "name"});
        }
        if (!CollectionUtils.isEmpty(unitCodeList)) {
            unitByCode = this.unitService.getUnitByCode(new ArrayList(unitCodeList), new String[]{"id", "code", "name"});
        }
        if (!CollectionUtils.isEmpty(unitByIds)) {
            unitByIds.forEach(unitDTO -> unit.put(unitDTO.getId(), unitDTO.getName()));
        }
        if (!CollectionUtils.isEmpty(unitByCode)) {
            unitByCode.forEach(unitDTO -> unitCode.put(unitDTO.getCode(), unitDTO.getName()));
        }
        if (CollectionUtils.isEmpty((Collection)unitByIds) && CollectionUtils.isEmpty((Collection)unitByCode)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801175);
        }
        if (product.getUnit() != null && unit.get(product.getUnit()) != null) {
            product.put("unit_Name", unit.get(product.getUnit()));
        } else if (product.get("unit_Code") != null && unitCode.get(product.get("unit_Code")) != null) {
            product.put("unit_Name", unit.get(product.get("unit_Code")));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801176);
        }
        if (detail.getPurchaseUnit() != null && unit.get(detail.getPurchaseUnit()) != null) {
            detail.put("purchaseUnit_Name", unit.get(detail.getPurchaseUnit()));
        } else if (detail.get("purchaseUnit_Code") != null && unitCode.get(detail.get("purchaseUnit_Code")) != null) {
            detail.put("purchaseUnit_Name", unitCode.get(detail.get("purchaseUnit_Code")));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801177);
        }
        if (detail.getPurchasePriceUnit() != null && unit.get(detail.getPurchasePriceUnit()) != null) {
            detail.put("purchasePriceUnit_Name", unit.get(detail.getPurchasePriceUnit()));
        } else if (detail.get("purchasePriceUnit_Code") != null && unitCode.get(detail.get("purchasePriceUnit_Code")) != null) {
            detail.put("purchasePriceUnit_Name", unitCode.get(detail.get("purchasePriceUnit_Code")));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801178);
        }
        if (detail.getStockUnit() != null && unit.get(detail.getStockUnit()) != null) {
            detail.put("stockUnit_Name", unit.get(detail.getStockUnit()));
        } else if (detail.get("stockUnit_Code") != null && unitCode.get(detail.get("stockUnit_Code")) != null) {
            detail.put("stockUnit_Name", unitCode.get(detail.get("stockUnit_Code")));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801179);
        }
        if (detail.getProduceUnit() != null && unit.get(detail.getProduceUnit()) != null) {
            detail.put("produceUnit_Name", unit.get(detail.getProduceUnit()));
        } else if (detail.get("produceUnit_Code") != null && unitCode.get(detail.get("produceUnit_Code")) != null) {
            detail.put("produceUnit_Name", unitCode.get(detail.get("produceUnit_Code")));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801180);
        }
        if (detail.getBatchPriceUnit() != null && unit.get(detail.getBatchPriceUnit()) != null) {
            detail.put("batchPriceUnit_Name", unit.get(detail.getBatchPriceUnit()));
        } else if (detail.get("batchPriceUnit_Code") != null && unitCode.get(detail.get("batchPriceUnit_Code")) != null) {
            detail.put("batchPriceUnit_Name", unitCode.get(detail.get("batchPriceUnit_Code")));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801181);
        }
        if (detail.get("inspectionUnit") != null && unit.get(detail.get("inspectionUnit")) != null) {
            detail.put("inspectionUnit_Name", unit.get(detail.get("inspectionUnit")));
        } else if (detail.get("inspectionUnit_Code") != null && unitCode.get(detail.get("inspectionUnit_Code")) != null) {
            detail.put("inspectionUnit_Name", unitCode.get(detail.get("inspectionUnit_Code")));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801182);
        }
        if (detail.getBatchUnit() != null && unit.get(detail.getBatchUnit()) != null) {
            detail.put("batchUnit_Name", unit.get(detail.getBatchUnit()));
        } else if (detail.get("batchPriceUnit_Code") != null && unitCode.get(detail.get("batchPriceUnit_Code")) != null) {
            detail.put("batchUnit_Name", unitCode.get(detail.get("batchPriceUnit_Code")));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801183);
        }
        if (detail.getOnlineUnit() != null && unit.get(detail.getOnlineUnit()) != null) {
            detail.put("onlineUnit_Name", unit.get(detail.getOnlineUnit()));
        } else if (detail.get("onlineUnit_Code") != null && unitCode.get(detail.get("onlineUnit_Code")) != null) {
            detail.put("onlineUnit_Name", unitCode.get(detail.get("onlineUnit_Code")));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801184);
        }
        if (detail.getOfflineUnit() != null && unit.get(detail.getOfflineUnit()) != null) {
            detail.put("offlineUnit_Name", unit.get(detail.getOfflineUnit()));
        } else if (detail.get("offlineUnit_Code") != null && unitCode.get(detail.get("offlineUnit_Code")) != null) {
            detail.put("offlineUnit_Name", unitCode.get(detail.get("offlineUnit_Code")));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801185);
        }
        if (detail.getRequireUnit() != null && unit.get(detail.getRequireUnit()) != null) {
            detail.put("requireUnit_Name", unit.get(detail.getRequireUnit()));
        } else if (detail.get("requireUnit_Code") != null && unitCode.get(detail.get("requireUnit_Code")) != null) {
            detail.put("requireUnit_Name", unitCode.get(detail.get("requireUnit_Code")));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801186);
        }
        if (detail.getDemandPlanningUnit() != null && unit.get(detail.getDemandPlanningUnit()) != null) {
            detail.put("demandPlanningUnit_Name", unit.get(detail.getDemandPlanningUnit()));
        } else if (detail.get("demandPlanningUnit_Code") != null && unitCode.get(detail.get("demandPlanningUnit_Code")) != null) {
            detail.put("demandPlanningUnit_Name", unitCode.get(detail.get("demandPlanningUnit_Code")));
        } else if (product.getUnit() != null) {
            detail.put("demandPlanningUnit", (Object)product.getUnit());
            detail.put("demandPlanningUnit_Name", unit.get(product.getUnit()));
        }
        if (!CollectionUtils.isEmpty((Collection)productAssistUnitExchanges)) {
            for (ProductAssistUnitExchange assistUnitExchange : productAssistUnitExchanges) {
                if (assistUnitExchange.getAssistUnit() != null && unit.get(assistUnitExchange.getAssistUnit()) != null) {
                    assistUnitExchange.put("assistUnit_Name", unit.get(assistUnitExchange.getAssistUnit()));
                    continue;
                }
                if (assistUnitExchange.get("assistUnit_Code") == null || unitCode.get(assistUnitExchange.get("assistUnit_Code")) == null) continue;
                assistUnitExchange.put("assistUnit_Name", unitCode.get(assistUnitExchange.get("assistUnit_Code")));
            }
        }
    }

    public void setProductClassNameAndCode(Product product) throws Exception {
        ProducClasstDTO producClasstByIdOrCode = null;
        if (product.getProductClass() != null) {
            producClasstByIdOrCode = this.productService.getProducClasstByIdOrCode(product.getProductClass(), null, new String[]{"name", "code", "id"});
        } else if (product.get("productClass_Code") != null) {
            producClasstByIdOrCode = this.productService.getProducClasstByIdOrCode(null, (String)product.get("productClass_Code"), new String[]{"name", "code", "id"});
        }
        if (producClasstByIdOrCode == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801187);
        }
        product.put("productClass_Code", (Object)producClasstByIdOrCode.getCode());
        product.put("productClass_Name", (Object)producClasstByIdOrCode.getName());
    }

    public void setMaterialClassNameAndCode(final Product product) throws Exception {
        MaterialClassQryDTO materialClassQryDTO = new MaterialClassQryDTO();
        if (product.getManageClass() != null) {
            materialClassQryDTO.setMaterialClassIdList((List)new ArrayList<Long>(){
                {
                    this.add(product.getManageClass());
                }
            });
        } else if (product.get("manageClass_Code") != null) {
            materialClassQryDTO.setMaterialClassCodeList((List)new ArrayList<String>(){
                {
                    this.add((String)product.get("manageClass_Code"));
                }
            });
        }
        List<MaterialClassDTO> materialClassByIdOrCode = this.productService.getMaterialClassByIdOrCode(materialClassQryDTO, new String[]{"name", "code", "id"});
        if (CollectionUtils.isEmpty(materialClassByIdOrCode)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801188);
        }
        product.put("manageClass_Code", (Object)materialClassByIdOrCode.get(0).getCode());
        product.put("manageClass_Name", (Object)materialClassByIdOrCode.get(0).getName());
    }

    public Map<String, Object> queryReferenceEncodingForProduct(Long productId) throws Exception {
        QueryField[] qryFields = new QueryField[]{new QueryField("costClass.code", "costClassCode"), new QueryField("costClass.name", "costClassName"), new QueryField("planClass.code", "planClassCode"), new QueryField("planClass.name", "planClassName"), new QueryField("internalSupplyOrgId.code", "internalSupplyOrgCode"), new QueryField("internalSupplyOrgId.name", "internalSupplyOrgName"), new QueryField("transType.code", "transTypeCode"), new QueryField("transType.name", "transTypeName"), new QueryField("manageClass.code", "manageClassCode"), new QueryField("manageClass.name", "manageClassName"), new QueryField("productClass.code", "productClassCode"), new QueryField("productClass.name", "productClassName"), new QueryField("productTemplate.name", "receiptWarehouseName"), new QueryField("brand.code", "brandCode"), new QueryField("brand.name", "brandName"), new QueryField("unit.code", "unitCode"), new QueryField("unit.name", "unitName"), new QueryField("weightUnit.code", "weightUnitCode"), new QueryField("weightUnit.name", "weightUnitName"), new QueryField("purchaseClass.code", "purchaseClassCode"), new QueryField("purchaseClass.name", "purchaseClassName"), new QueryField("taxClass.code", "taxClassCode"), new QueryField("taxClass.name", "taxClassName")};
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)});
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{queryConditionGroup}));
        return MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)schema);
    }

    public Map<String, Object> queryReferenceEncodingForProductDetail(Long productDetailId) throws Exception {
        QueryField[] qryFields = new QueryField[]{new QueryField("productVendor.code", "productVendorCode"), new QueryField("productVendor.name", "productVendorName"), new QueryField("productBuyer.code", "productBuyerCode"), new QueryField("productBuyer.name", "productBuyerName"), new QueryField("omsWarehouse.code", "omsWarehouseCode"), new QueryField("omsWarehouse.name", "omsWarehouseName"), new QueryField("warehouseManager.code", "warehouseManagerCode"), new QueryField("warehouseManager.name", "warehouseManagerName"), new QueryField("deliveryWarehouse.code", "deliveryWarehouseCode"), new QueryField("deliveryWarehouse.name", "deliveryWarehouseName"), new QueryField("returnWarehouse.code", "returnWarehouseCode"), new QueryField("returnWarehouse.name", "returnWarehouseName"), new QueryField("receiptWarehouse.code", "receiptWarehouseCode"), new QueryField("receiptWarehouse.name", "receiptWarehouseName"), new QueryField("produceDepartment.code", "produceDepartmentCode"), new QueryField("produceDepartment.name", "produceDepartmentName"), new QueryField("manufacturePlanner.code", "manufacturePlannerCode"), new QueryField("manufacturePlanner.name", "manufacturePlannerName"), new QueryField("purchasePriceUnit.code", "purchasePriceUnitCode"), new QueryField("purchasePriceUnit.name", "purchasePriceUnitName"), new QueryField("purchaseUnit.code", "purchaseUnitCode"), new QueryField("purchaseUnit.name", "purchaseUnitName"), new QueryField("stockUnit.code", "stockUnitCode"), new QueryField("stockUnit.name", "stockUnitName"), new QueryField("produceUnit.code", "produceUnitCode"), new QueryField("produceUnit.name", "produceUnitName"), new QueryField("batchPriceUnit.code", "batchPriceUnitCode"), new QueryField("batchPriceUnit.name", "batchPriceUnitName"), new QueryField("batchUnit.code", "batchUnitCode"), new QueryField("batchUnit.name", "batchUnitName"), new QueryField("onlineUnit.code", "onlineUnitCode"), new QueryField("onlineUnit.name", "onlineUnitName"), new QueryField("offlineUnit.code", "offlineUnitCode"), new QueryField("offlineUnit.name", "offlineUnitName"), new QueryField("requireUnit.code", "requireUnitCode"), new QueryField("requireUnit.name", "requireUnitName"), new QueryField("inspectionUnit.code", "inspectionUnitCode"), new QueryField("inspectionUnit.name", "inspectionUnitName"), new QueryField("costItems.code", "costItemsCode"), new QueryField("costItems.name", "costItemsName")};
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productDetailId)});
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{queryConditionGroup}));
        return MetaDaoHelper.queryOne((String)"pc.product.ProductDetail", (QuerySchema)schema);
    }

    public CoreDocJsonResult productSaveIdempotent(OpenAPIDTO<ProductApiVO> dto) {
        if (dto == null || dto.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            Object result = this.productSave((ProductApiVO)dto.getData());
            return CoreDocJsonResult.success((Object)result);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u7279\u5f81\u7269\u6599\u6863\u6848\u4fdd\u5b58-\u5e42\u7b49\u63a5\u53e3\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<UPCResultList> addProductOrgs(Long productId, List<String> orgIds) throws Exception {
        if (productId == null && CollectionUtils.isEmpty(orgIds)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801189);
        }
        HashMap<String, Object> productOrgs = new HashMap<String, Object>();
        productOrgs.put("productId", productId);
        productOrgs.put("orgIds", orgIds);
        BillDataDto dto = new BillDataDto();
        dto.setBillnum("pc_product");
        dto.setAction("addprosuitorg");
        dto.setData(Arrays.asList(productOrgs));
        com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList resultList = this.productAddRangeService.proSuitOrg(dto, DataSource.API_PRODUCT_SUIT_ORG.getSource());
        UPCResultList upcResultList = UPCResultConverter.resultConvert((ResultList)resultList);
        return this.resultConvert(upcResultList);
    }

    private CoreDocJsonResult<UPCResultList> resultConvert(UPCResultList upcResultList) {
        if (upcResultList == null) {
            return CoreDocJsonResult.error((Long)Long.valueOf(CoreDocBusinessErrorEnum.SYSTEM_ERROR.getCode()), (String)CoreDocBusinessErrorEnum.SYSTEM_ERROR.getMultilingualMessage());
        }
        if (upcResultList.getFailCount() > 0) {
            ArrayList resultMessage = new ArrayList();
            List messages = upcResultList.getMessages();
            for (Object message : messages) {
                if (!(message instanceof Map)) continue;
                resultMessage.add(((Map)message).get("message"));
            }
            return CoreDocJsonResult.error((Object)upcResultList, (Long)999L, (String)((Object)resultMessage).toString());
        }
        return CoreDocJsonResult.success((Object)upcResultList);
    }

    public CoreDocJsonResult<UPCResultList> productApplyDetailBatchSave(List<ProductApplyDataSaveRequest> productApplySaveVOList) throws Exception {
        ArrayList<Future> futureList = new ArrayList<Future>();
        for (ProductApplyDataSaveRequest productApplyDataSaveRequest : productApplySaveVOList) {
            Future ruleExecuteResultFuture = RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> {
                new CoreDocJsonResult();
                ProductApplySaveVO productApplySaveVO = new ProductApplySaveVO();
                BeanUtils.copyProperties((Object)productApplyDataSaveRequest, (Object)productApplySaveVO);
                ProductApplyDetailSaveVO detail = this.copyPropertiesToDetail(productApplyDataSaveRequest.getDetail(), null);
                productApplySaveVO.setDetail(detail);
                CoreDocJsonResult<ProductApplySaveVO> coreDocJsonResult = this.productApplyDetailSave(productApplySaveVO);
                PassResultDTO passResultDTO = new PassResultDTO();
                if (coreDocJsonResult.isSuccess()) {
                    ProductApplySaveVO productApplyData = (ProductApplySaveVO)coreDocJsonResult.getData().get(0);
                    passResultDTO.setSourceUnique(productApplyDataSaveRequest.getSourceUnique());
                    passResultDTO.setTargetUnique(productApplyData.getId().toString());
                } else {
                    passResultDTO.setSourceUnique(productApplyDataSaveRequest.getSourceUnique());
                    passResultDTO.setMessage(coreDocJsonResult.getMessage());
                }
                return passResultDTO;
            }, (ExecutorService)this.ymsThreadPoolConfig4UPC.getFixedThreadPoolExecutor("core-doc-ipass-multi-thread"));
            futureList.add(ruleExecuteResultFuture);
        }
        UPCResultList upcResultList = IPassBatchSaveResultUtil.buildResultForBatchSaveOrUpdate(futureList);
        return this.resultConvert(upcResultList);
    }

    private ProductApplyDetailSaveVO copyPropertiesToDetail(ProductApplyDataDetail detailParams, List<String> changeProperties) {
        ProductApplyDetailSaveVO detail = new ProductApplyDetailSaveVO();
        if (changeProperties == null || changeProperties.isEmpty()) {
            BeanUtils.copyProperties((Object)detailParams, (Object)detail);
            return detail;
        }
        try {
            PropertyDescriptor[] sourcePds = Introspector.getBeanInfo(detailParams.getClass()).getPropertyDescriptors();
            PropertyDescriptor[] targetPds = Introspector.getBeanInfo(detail.getClass()).getPropertyDescriptors();
            HashMap<String, PropertyDescriptor> sourcePdMap = new HashMap<String, PropertyDescriptor>();
            for (PropertyDescriptor pd : sourcePds) {
                sourcePdMap.put(pd.getName(), pd);
            }
            HashMap<String, PropertyDescriptor> targetPdMap = new HashMap<String, PropertyDescriptor>();
            for (PropertyDescriptor pd : targetPds) {
                targetPdMap.put(pd.getName(), pd);
            }
            for (String propertyName : changeProperties) {
                if (StringUtils.isEmpty((CharSequence)propertyName)) continue;
                PropertyDescriptor sourcePd = (PropertyDescriptor)sourcePdMap.get(propertyName);
                PropertyDescriptor targetPd = (PropertyDescriptor)targetPdMap.get(propertyName);
                if (sourcePd == null || targetPd == null) {
                    log.warn("Property not found in source or target: {}", (Object)propertyName);
                    continue;
                }
                Method readMethod = sourcePd.getReadMethod();
                Method writeMethod = targetPd.getWriteMethod();
                if (readMethod == null || writeMethod == null) {
                    log.warn("Read or write method not found for property: {}", (Object)propertyName);
                    continue;
                }
                Object value = readMethod.invoke(detailParams, new Object[0]);
                writeMethod.invoke(detail, value);
            }
        }
        catch (Exception e) {
            log.error("Error copying properties: {}", (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR);
        }
        return detail;
    }

    public CoreDocJsonResult<UPCResultList> productDetailBatchSave(List<ProductApplySaveVO> productDetailSaveVOS) throws Exception {
        try {
            if (productDetailSaveVOS.size() > CoredocSDKConstant.MAX_NUM_FOR_COMPLEX) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801348, new Object[]{CoredocSDKConstant.MAX_NUM_FOR_COMPLEX});
            }
            ArrayList<BillDataDto> productDetailList = new ArrayList<BillDataDto>();
            StringBuilder errorMsg = new StringBuilder();
            for (ProductApplySaveVO productDetailVO : productDetailSaveVOS) {
                if (productDetailVO == null) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL);
                }
                if (ObjectUtils.isEmpty((Object)productDetailVO.getId()) && ObjectUtils.isEmpty((Object)productDetailVO.getCode())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801165);
                }
                if (ObjectUtils.isEmpty((Object)productDetailVO.getBelogOrg()) && ObjectUtils.isEmpty((Object)productDetailVO.getBelogOrg_Code())) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_RANGE_ORG_ID_AND_CODE_NOT_NULL);
                }
                try {
                    Map productDetailMap = (Map)JSONObject.parseObject((String)JSONObject.toJSONString((Object)productDetailVO), Map.class);
                    DataTransferUtils.fill((String)"pc_productdetail", (String)"pc.product.Product", (Object)productDetailMap, (int)2);
                    Product product = new Product();
                    product.putAll(productDetailMap);
                    this.productCheckService.commonCheckForProductDetail(product);
                    BillDataDto billDataDto = CoredocBeanConvert.cast2BillDTO((String)"pc_productdetail", (String)"save", (BizObject)product);
                    this.upcBillService.dealBillDataForApi(billDataDto, "save");
                    productDetailList.add(billDataDto);
                }
                catch (BusinessException businessException) {
                    if (errorMsg.length() > 0) {
                        errorMsg.append(";");
                    }
                    String productMsg = ObjectUtils.isNotEmpty((Object)productDetailVO.getCode()) ? productDetailVO.getCode() : productDetailVO.getId();
                    String orgMsg = ObjectUtils.isNotEmpty((Object)productDetailVO.getBelogOrg_Code()) ? productDetailVO.getBelogOrg_Code() : productDetailVO.getBelogOrg();
                    errorMsg.append(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1EEA68300500000D", (String)"\u7269\u6599[{0}],\u4f7f\u7528\u7ec4\u7ec7[{1}]"), productMsg, orgMsg)).append(",").append(businessException.getMessage());
                }
            }
            if (errorMsg.length() > 0) {
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(errorMsg.toString()));
            }
            UPCResultList upcResultList = this.multiThreadService.multiThreadSave(productDetailList);
            UpcAPiTool.dealBatchSaveResult((UPCResultList)upcResultList);
            return CoreDocJsonResult.success((Object)upcResultList);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u4e1a\u52a1\u4fe1\u606f\u6279\u91cf\u4fdd\u5b58\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }
}

