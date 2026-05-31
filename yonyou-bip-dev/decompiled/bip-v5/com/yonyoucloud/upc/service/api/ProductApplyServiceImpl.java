/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.constants.CheckLimitConstant
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyou.ucf.transtype.model.BdTransType
 *  com.yonyou.ucf.transtype.model.TransType
 *  com.yonyoucloud.iuap.upc.api.IProductApplyService
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.iuap.upc.vo.ProductApiVO
 *  com.yonyoucloud.iuap.upc.vo.ProductApplyApiVO
 *  com.yonyoucloud.iuap.upc.vo.ProductApplyVO
 *  com.yonyoucloud.upc.constants.ConvertTypeConstants
 *  com.yonyoucloud.upc.data.product.ProductQueryDao
 *  com.yonyoucloud.upc.data.productapply.ProductApplyQueryDao
 *  com.yonyoucloud.upc.pc.product.AssistUnitType
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.UnitUseTypeEnum
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  com.yonyoucloud.upc.pc.productapply.ProductApplyType
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  com.yonyoucloud.upc.utils.CoredocBeanConvert
 *  com.yonyoucloud.upc.utils.UPCResultConverter
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.constants.CheckLimitConstant;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyou.ucf.transtype.model.BdTransType;
import com.yonyou.ucf.transtype.model.TransType;
import com.yonyoucloud.iuap.upc.api.IProductApplyService;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.constants.ProductSaveFieldMap;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.iuap.upc.vo.ProductApiVO;
import com.yonyoucloud.iuap.upc.vo.ProductApplyApiVO;
import com.yonyoucloud.iuap.upc.vo.ProductApplyVO;
import com.yonyoucloud.upc.billrule.product.ProductDataProcessRule;
import com.yonyoucloud.upc.constants.ConvertTypeConstants;
import com.yonyoucloud.upc.data.product.ProductQueryDao;
import com.yonyoucloud.upc.data.productapply.ProductApplyQueryDao;
import com.yonyoucloud.upc.pc.product.AssistUnitType;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.UnitUseTypeEnum;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.pc.productapply.ProductApplyType;
import com.yonyoucloud.upc.service.CoredocTransTypeService;
import com.yonyoucloud.upc.service.MultiThreadService;
import com.yonyoucloud.upc.service.ProductCheckService;
import com.yonyoucloud.upc.service.ProductDefaultValueService;
import com.yonyoucloud.upc.service.UPCControlRuleService;
import com.yonyoucloud.upc.service.api.ProductCheckForApiService;
import com.yonyoucloud.upc.service.api.ProductSaveServiceImpl;
import com.yonyoucloud.upc.service.api.product.ProductUpdateServiceImpl;
import com.yonyoucloud.upc.service.bill.BillBusinessHandleDTO;
import com.yonyoucloud.upc.service.bill.product.ProductAssistUnitCheckUtil;
import com.yonyoucloud.upc.service.bill.product.ProductBusinessHandleService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import com.yonyoucloud.upc.utils.CoredocBeanConvert;
import com.yonyoucloud.upc.utils.UPCResultConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class ProductApplyServiceImpl
implements IProductApplyService {
    private static final Logger log = LoggerFactory.getLogger(ProductApplyServiceImpl.class);
    @Autowired
    private ProductCheckForApiService productCheckForApiService;
    @Autowired
    private ProductCheckService productCheckService;
    @Autowired
    private UPCControlRuleService upcControlRuleService;
    @Autowired
    private ProductDefaultValueService productDefaultValueService;
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    private ProductSaveServiceImpl productSaveService;
    @Autowired
    private MultiThreadService multiThreadService;
    @Autowired
    private ProductDataProcessRule productDataProcessRule;
    @Autowired
    CoredocTransTypeService coredocTransTypeService;
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    ProductApplyQueryDao productApplyQueryDao;
    @Autowired
    ProductUpdateServiceImpl productUpdateService;
    @Autowired
    ProductQueryDao productQueryDao;
    @Autowired
    ProductBusinessHandleService productBusinessHandleService;
    @Autowired
    private PubOptionService pubOptionService;

    public CoreDocJsonResult<ProductApplyApiVO> productApplySave(ProductApplyVO productApplyVO) {
        if (productApplyVO == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL);
        }
        if (productApplyVO.getProductData() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801170);
        }
        try {
            ProductApply productApply = this.handleProductApplyData(productApplyVO);
            BillDataDto billDataDto = new BillDataDto();
            billDataDto.setBillnum("pc_productapply");
            billDataDto.setAction("save");
            billDataDto.setConvertType(Integer.valueOf(2));
            billDataDto.setData((Object)productApply);
            Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
            ProductApplyApiVO productApplyApiVO = new ProductApplyApiVO();
            productApplyApiVO.setId((Long)((ProductApply)result).getId());
            return CoreDocJsonResult.success((Object)productApplyApiVO);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E04200097", (String)"\u7269\u6599\u7533\u8bf7\u65b0\u589e\u5f02\u5e38:"), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<UPCResultList> productApplyBatchSave(List<ProductApplyVO> vos) {
        try {
            ArrayList<BillDataDto> productApplyList = new ArrayList<BillDataDto>();
            StringBuilder stringBuilder = new StringBuilder();
            for (ProductApplyVO productApplyVO : vos) {
                if (productApplyVO == null) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL);
                }
                if (productApplyVO.getProductData() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801170);
                }
                String productCode = productApplyVO.getProductData().getCode();
                try {
                    ProductApply productApply = this.handleProductApplyData(productApplyVO);
                    BillDataDto billDataDto = CoredocBeanConvert.cast2BillDTO((String)"pc_productapply", (String)"save", (BizObject)productApply);
                    productApplyList.add(billDataDto);
                }
                catch (BusinessException businessException) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(";");
                    }
                    stringBuilder.append(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1AE0DEFC05C00006", (String)"\u7269\u6599\u7f16\u7801[%s]\uff0c"), productCode)).append(businessException.getMessage());
                }
            }
            if (stringBuilder.length() > 0) {
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(stringBuilder.toString()));
            }
            UPCResultList upcResultList = this.multiThreadService.multiThreadSave(productApplyList);
            UpcAPiTool.dealBatchSaveResult((UPCResultList)upcResultList, (String)"applyCode");
            return CoreDocJsonResult.success((Object)upcResultList);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u7533\u8bf7\u5355\u6279\u91cf\u4fdd\u5b58\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<UPCResultList> productApplyBatchSaveForAdd(List<ProductApplyVO> vos) {
        try {
            UPCResultList upcResultList;
            ArrayList<BillDataDto> productApplyList = new ArrayList<BillDataDto>();
            ArrayList<Object> errorMessage = new ArrayList<Object>();
            for (ProductApplyVO productApplyVO : vos) {
                productApplyVO.setApplyType(String.valueOf(ProductApplyType.add.getValue()));
                this.checkMustInput(productApplyVO);
                String productCode = productApplyVO.getProductData().getCode();
                try {
                    ProductApply productApply = this.handleProductApplyData(productApplyVO);
                    BillDataDto billDataDto = CoredocBeanConvert.cast2BillDTO((String)"pc_productapply", (String)"save", (BizObject)productApply, (int)ConvertTypeConstants.API_TYPE3);
                    productApplyList.add(billDataDto);
                }
                catch (BusinessException businessException) {
                    errorMessage.add(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1AE0DEFC05C00006", (String)"\u7269\u6599\u7f16\u7801[%s]\uff0c"), productCode) + businessException.getMessage());
                }
            }
            if (errorMessage.size() > 0) {
                upcResultList = this.resultProcess(vos.size(), errorMessage);
                return CoreDocJsonResult.success((Object)upcResultList);
            }
            upcResultList = this.multiThreadService.multiThreadSave(productApplyList);
            UpcAPiTool.dealBatchSaveResult((UPCResultList)upcResultList, (String)"applyCode");
            return CoreDocJsonResult.success((Object)upcResultList);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u7533\u8bf7\u5355\u6279\u91cf\u4fdd\u5b58\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    private UPCResultList resultProcess(int size, List<Object> errorMessage) {
        UPCResultList upcResultList = new UPCResultList();
        upcResultList.setCount(Integer.valueOf(size));
        upcResultList.setFailCount(Integer.valueOf(size));
        upcResultList.setSuccessCount(Integer.valueOf(0));
        upcResultList.setMessages(errorMessage);
        upcResultList.setInfos(null);
        return upcResultList;
    }

    public ProductApply handleProductApplyData(ProductApplyVO productApplyVO) throws Exception {
        ProductApiVO productData = productApplyVO.getProductData();
        Map productApplyMap = UpcAPiTool.beanToMap((Object)productApplyVO, null, ProductSaveFieldMap.productApplyFieldRenameMap, (String)"Insert");
        ProductApply productApply = new ProductApply();
        productApply.putAll(productApplyMap);
        this.productCheckForApiService.checkMustInputForProductApplySave(productApply);
        Map productMap = UpcAPiTool.beanToMap((Object)productData, ProductSaveFieldMap.productFieldType, ProductSaveFieldMap.productFieldRenameMap, (String)"Insert");
        productMap.put("autoGenerateRangeData", productData.getAutoGenerateRangeData());
        Product product = this.handleProductData(productMap);
        ProductAssistUnitCheckUtil.checkForInsert(product, this.pubOptionService.isOpenMultiFloat());
        productApply.setProductData(JSON.toJSONString((Object)product));
        return productApply;
    }

    @NotNull
    private Product handleProductData(Map<String, Object> productMap) throws Exception {
        Map description;
        Map<String, Object> lifeCycleTemplateData;
        List<TransType> transTypes;
        Product product = new Product();
        product.put("_fromApi", (Object)true);
        product.putAll(productMap);
        this.productCheckForApiService.checkProductBefore(product);
        this.productCheckService.commonCheck(product);
        this.productCheckForApiService.addRowNumForProductSubData(product);
        DataTransferUtils.fill((String)"pc_product", (String)"pc.product.Product", (Object)product, (int)2);
        this.productDefaultValueService.setDefaultValueForProductInsert(product);
        if (productMap.get("autoGenerateRangeData") != null && BooleanUtil.isTrue((Object)productMap.get("autoGenerateRangeData"))) {
            product.put("productOrgs", null);
            List<String> orgRangeShareAll = this.upcControlRuleService.getOrgRangeShareAll("pc.product.Product", product.getOrgId());
            ArrayList<1> orgesRange = new ArrayList<1>(orgRangeShareAll.size());
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
        this.productBusinessHandleService.fillAssistUnitDataByTpl(product, EntityStatus.Insert);
        this.productSaveService.handleUnitForProduct(product);
        if (product.getTransType() == null) {
            transTypes = this.coredocTransTypeService.getTransTypeByFormId("PC.pc_product");
            if (CollectionUtils.isEmpty(transTypes)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_TRANS_TYPE_NOT_FOUND);
            }
            product.setTransType(transTypes.get(0).getId());
            product.put("transType_Name", (Object)transTypes.get(0).getName().toString());
        } else if (product.getTransType() != null && product.get("transType_Name") == null) {
            transTypes = this.coredocTransTypeService.getTransTypeNameById(product.getTransType());
            if (CollectionUtils.isEmpty(transTypes)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_TRANS_TYPE_NOT_FOUND);
            }
            product.put("transType_Name", (Object)((BdTransType)transTypes.get(0)).getName().toString());
        }
        if (product.getTransType() != null && (lifeCycleTemplateData = this.productDefaultValueService.getLifeCycleTemplateData(product.get("transType").toString())).get("lifeCycleTemplate") != null) {
            product.setLifeCycleTemplate(lifeCycleTemplateData.get("lifeCycleTemplate").toString());
            product.put("lifeCycleTemplate_Name", lifeCycleTemplateData.get("lifeCycleTemplate_Name"));
        }
        this.productSaveService.setMaterialClassNameAndCode(product);
        Map detail = (Map)product.get("detail");
        assert (detail.size() < CheckLimitConstant.DEFAULT_LIMIT);
        Iterator detailIterator = detail.entrySet().iterator();
        this.productCheckService.beforeInsertCheck(product);
        while (detailIterator.hasNext()) {
            Map.Entry entry = detailIterator.next();
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
        this.productSaveService.checkProductUseSkuProperties(product);
        this.productSaveService.dealProductCharacterData(product, "productCharacterDef");
        this.productSaveService.dealProductCharacterData(product, "productPropCharacterDefine");
        this.productSaveService.dealProductCharacterData(product, "detail!productExtendCharacterDef");
        this.productSaveService.dealProductDataDisplay(product);
        this.productCheckService.checkNetWeightPrecision(product);
        this.productCheckService.checkOptionalMaterial(product);
        this.productCheckForApiService.checkManageOrg(product);
        return product;
    }

    public CoreDocJsonResult<UPCResultList> batchDelete(List<ProductApplyVO> productApplyVOs) {
        try {
            ArrayList<ProductApply> productApplyList = new ArrayList<ProductApply>();
            ArrayList<String> errorMessages = new ArrayList<String>();
            this.processParam(productApplyVOs, productApplyList, errorMessages);
            BillDataDto billDataDto = new BillDataDto();
            billDataDto.setBillnum("pc_productapplylist");
            billDataDto.setAction("delete");
            billDataDto.setData(productApplyList);
            billDataDto.setFromApi(true);
            com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList resultList = this.billService.batchdelete(billDataDto);
            this.processResultMessages((ResultList)resultList, productApplyList);
            UPCResultList upcResultList = UPCResultConverter.resultConvert((ResultList)resultList);
            upcResultList.setSuccessCount(Integer.valueOf(resultList.getSucessCount()));
            return CoreDocJsonResult.success((Object)upcResultList);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u7533\u8bf7\u5355\u6279\u91cf\u5220\u9664\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    private void processResultMessages(ResultList resultList, List<ProductApply> productApplyList) {
        if (!CollectionUtils.isEmpty((Collection)resultList.getFailInfos())) {
            List failInfos = resultList.getFailInfos();
            if (!CollectionUtils.isEmpty(productApplyList)) {
                Map<Object, String> map = productApplyList.stream().collect(Collectors.toMap(BizObject::getId, ProductApply::getApplyCode));
                for (Object failInfo : failInfos) {
                    Map failInfoMap = (Map)failInfo;
                    failInfoMap.remove("code");
                    if (failInfoMap.get("id") == null) continue;
                    failInfoMap.put("applyCode", map.get(failInfoMap.get("id")));
                }
            }
            resultList.setMessages(failInfos);
            resultList.setFailInfos(null);
        }
    }

    private void processParam(List<ProductApplyVO> productApplyVOs, List<ProductApply> productApplyList, List<String> errorMessages) throws Exception {
        for (ProductApplyVO productApplyVO : productApplyVOs) {
            ProductApply apply;
            if (productApplyVO == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL);
            }
            if (productApplyVO.getId() == null && !StringUtils.hasText((String)productApplyVO.getApplyCode())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801301);
            }
            ProductApply productApply = new ProductApply();
            if (productApplyVO.getId() != null) {
                apply = this.productApplyQueryDao.getProductApplyByIdAndFields(productApplyVO.getId(), new String[]{"id", "applyCode", "productData", "isWfControlled", "verifystate"});
                if (apply == null) {
                    errorMessages.add(CoreDocBusinessErrorEnum.PRODUCT_APPLY_NOT_FOUND_BY_ID.getMultilingualMessage(new Object[]{productApplyVO.getId()}));
                    continue;
                }
                productApply.put("id", apply.getId());
                productApply.put("applyCode", (Object)apply.getApplyCode());
                productApply.put("productData", (Object)apply.getProductData());
                productApply.put("isWfControlled", (Object)apply.getIsWfControlled());
                productApply.put("verifystate", (Object)apply.getVerifystate());
            } else if (StringUtils.hasText((String)productApplyVO.getApplyCode())) {
                apply = this.productApplyQueryDao.getProductApplyByCodeAndFields(productApplyVO.getApplyCode(), new String[]{"id", "applyCode", "productData", "isWfControlled", "verifystate"});
                if (apply == null) {
                    errorMessages.add(CoreDocBusinessErrorEnum.PRODUCT_APPLY_NOT_FOUND_BY_CODE.getMultilingualMessage(new Object[]{productApplyVO.getApplyCode()}));
                    continue;
                }
                productApply.put("id", apply.getId());
                productApply.put("applyCode", (Object)apply.getApplyCode());
                productApply.put("productData", (Object)apply.getProductData());
                productApply.put("isWfControlled", (Object)apply.getIsWfControlled());
                productApply.put("verifystate", (Object)apply.getVerifystate());
            }
            productApplyList.add(productApply);
        }
    }

    public CoreDocJsonResult<UPCResultList> productApplyBatchSaveForModify(List<ProductApplyVO> vos) {
        try {
            UPCResultList upcResultList;
            ArrayList<BillDataDto> productApplyList = new ArrayList<BillDataDto>();
            ArrayList<Object> errorMessage = new ArrayList<Object>();
            for (ProductApplyVO productApplyVO : vos) {
                productApplyVO.setApplyType(String.valueOf(ProductApplyType.modify.getValue()));
                this.checkMustInput(productApplyVO);
                String productCode = productApplyVO.getProductData().getCode();
                try {
                    ProductApply productApply = this.handleProductApplyDataForModify(productApplyVO);
                    BillDataDto billDataDto = CoredocBeanConvert.cast2BillDTO((String)"pc_productapply", (String)"save", (BizObject)productApply, (int)ConvertTypeConstants.API_TYPE3);
                    productApplyList.add(billDataDto);
                }
                catch (BusinessException businessException) {
                    errorMessage.add(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1AE0DEFC05C00006", (String)"\u7269\u6599\u7f16\u7801[%s]\uff0c"), productCode) + businessException.getMessage());
                }
            }
            if (errorMessage.size() > 0) {
                upcResultList = this.resultProcess(vos.size(), errorMessage);
                return CoreDocJsonResult.success((Object)upcResultList);
            }
            upcResultList = this.multiThreadService.multiThreadSave(productApplyList);
            UpcAPiTool.dealBatchSaveResult((UPCResultList)upcResultList, (String)"applyCode");
            return CoreDocJsonResult.success((Object)upcResultList);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u7533\u8bf7\u5355\u6279\u91cf\u53d8\u66f4\u4fdd\u5b58\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    private ProductApply handleProductApplyDataForModify(ProductApplyVO productApplyVO) throws Exception {
        Map productApplyMap = UpcAPiTool.beanToMap((Object)productApplyVO, null, ProductSaveFieldMap.productApplyFieldRenameMap, (String)"Insert");
        ProductApply productApply = new ProductApply();
        productApply.putAll(productApplyMap);
        this.productCheckForApiService.checkMustInputForProductApplySave(productApply);
        ProductApiVO productData = productApplyVO.getProductData();
        Product productMap = this.getProductDetail(productData);
        BizObject productParam = this.parseProductParam(productData);
        this.removeBusinessUnit(productMap, productParam);
        BillBusinessHandleDTO billBusinessHandleDTO = new BillBusinessHandleDTO(productParam, (BizObject)productMap);
        ProductAssistUnitCheckUtil.checkForUpdate(billBusinessHandleDTO, this.pubOptionService.isOpenMultiFloat());
        this.productUpdateService.handleDetail(productMap, (Map<String, Object>)productParam);
        this.productUpdateService.productUpdateCheck(productMap, (Map<String, Object>)productParam);
        if (productMap.getOrgId().equals(productData.getApplyRangeOrgId()) || productMap.get("orgCode").equals(productData.getApplyRangeOrgCode()) || ProductUtil.getIsUpdateProductGlobalFields()) {
            productMap.putAll((Map)productParam);
        }
        Product product = this.handleProductData((Map<String, Object>)productMap);
        productApply.setApplyProductId((Long)product.getId());
        productApply.setProductData(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)product));
        return productApply;
    }

    private void removeBusinessUnit(Product productDB, BizObject productParam) {
        if (productParam.get("productTemplate") != null || productParam.get("productTemplate_Name") != null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_UNIT_USE_TYPE_NOT_ALLOW_UPDATE, new Object[]{productDB.getCode().toString()});
        }
        if (UnitUseTypeEnum.USE_TIMPLATE.getValue() == productDB.getUnitUseType().shortValue()) {
            if (productParam.get("unit") != null || productParam.get("unit_Code") != null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_UNIT_NOT_ALLOW_TO_CHANGE, new Object[]{productDB.getCode().toString()});
            }
            Map detail = (Map)productParam.get("detail");
            for (AssistUnitType unitType : AssistUnitType.values()) {
                if (detail.get(unitType.toString()) == null && detail.get(unitType.toString() + "_Code") == null) continue;
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_BUSINESS_UNIT_NOT_ALLOW_TO_CHANGE, new Object[]{productDB.getCode().toString()});
            }
        }
    }

    private void setProductApplyInfo(Product product) {
        List productApplyRange = (List)product.get("productApplyRange");
        product.set("productApplyRange_OrgId", (Object)((ProductApplyRange)productApplyRange.get(0)).getOrgId());
        product.put("productApplyRange_OrgId_Name", ((ProductApplyRange)productApplyRange.get(0)).get("productApplyRange_OrgId_Name"));
    }

    private BizObject parseProductParam(ProductApiVO productOriginal) throws Exception {
        Map productMap = UpcAPiTool.beanToMap((Object)productOriginal, ProductSaveFieldMap.productFieldType, ProductSaveFieldMap.productFieldRenameMap, (String)"Update");
        Product product = new Product();
        product.putAll(productMap);
        return product;
    }

    private Product getProductDetail(ProductApiVO product) throws Exception {
        Product productDB = this.productQueryDao.getProductApplyAllInfoByCode(product.getCode(), product.getApplyRangeOrgId(), product.getApplyRangeOrgCode());
        if (productDB == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_FOUNT_BY_CODE_AND_ORG, new Object[]{product.getCode(), product.getApplyRangeOrgId() != null ? product.getApplyRangeOrgId() : product.getApplyRangeOrgCode()});
        }
        return productDB;
    }

    private void checkMustInput(ProductApplyVO productApplyVO) {
        if (productApplyVO == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL);
        }
        if (productApplyVO.getProductData() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801170);
        }
        if (String.valueOf(ProductApplyType.modify.getValue()).equals(productApplyVO.getApplyType()) && !StringUtils.hasText((String)productApplyVO.getProductData().getApplyRangeOrgId()) && !StringUtils.hasText((String)productApplyVO.getProductData().getApplyRangeOrgCode())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_APPLY_ORG_NOT_NULL, new Object[]{productApplyVO.getApplyCode()});
        }
    }

    public CoreDocJsonResult<UPCResultList> batchSubmit(List<ProductApplyVO> productApplyVOs) {
        try {
            ArrayList<ProductApply> productApplyList = new ArrayList<ProductApply>();
            ArrayList<String> errorMessages = new ArrayList<String>();
            this.processParam(productApplyVOs, productApplyList, errorMessages);
            if (errorMessages.size() > 0) {
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(String.join((CharSequence)";", errorMessages)));
            }
            BillDataDto billDataDto = new BillDataDto();
            billDataDto.setBillnum("pc_productapplylist");
            billDataDto.setAction("submit");
            billDataDto.setData(productApplyList);
            billDataDto.setFromApi(true);
            com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList resultList = this.billService.batchsubmit(billDataDto);
            this.processResultMessages((ResultList)resultList, productApplyList);
            String[] requiredFields = new String[]{"id", "applyCode"};
            UPCResultList upcResultList = UpcAPiTool.resultConvertOpenApi((ResultList)resultList, (String[])requiredFields);
            return CoreDocJsonResult.success((Object)upcResultList);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u7533\u8bf7\u5355\u6279\u91cf\u63d0\u4ea4\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<UPCResultList> batchAudit(List<ProductApplyVO> productApplyVOs) {
        try {
            ArrayList<ProductApply> productApplyList = new ArrayList<ProductApply>();
            ArrayList<String> errorMessages = new ArrayList<String>();
            this.processParam(productApplyVOs, productApplyList, errorMessages);
            if (errorMessages.size() > 0) {
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(String.join((CharSequence)";", errorMessages)));
            }
            BillDataDto billDataDto = new BillDataDto();
            billDataDto.setBillnum("pc_productapplylist");
            billDataDto.setAction("audit");
            billDataDto.setData(productApplyList);
            billDataDto.setFromApi(true);
            com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList resultList = this.billService.batchaudit(billDataDto);
            this.processResultMessages((ResultList)resultList, productApplyList);
            String[] requiredFields = new String[]{"id", "applyCode"};
            UPCResultList upcResultList = UpcAPiTool.resultConvertOpenApi((ResultList)resultList, (String[])requiredFields);
            return CoreDocJsonResult.success((Object)upcResultList);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u7533\u8bf7\u5355\u6279\u91cf\u5ba1\u6838\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }
}

