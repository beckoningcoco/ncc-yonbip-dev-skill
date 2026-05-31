/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.util.ObjectUtil
 *  cn.hutool.json.JSONArray
 *  cn.hutool.json.JSONObject
 *  cn.hutool.json.JSONUtil
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.diwork.service.auth.IServiceIsolateService
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.service.config.YmsThreadPoolConfig4UPC
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.upc.ipass.IPassBatchSaveResultUtil
 *  com.yonyou.upc.tools.CoreDocJsonResultForOpenApi
 *  com.yonyoucloud.iuap.ipass.product.ProductApplyDataSaveRequest
 *  com.yonyoucloud.iuap.ipass.product.ProductIPassAssistClass
 *  com.yonyoucloud.iuap.ipass.product.ProductIPassAssistUnitExchange
 *  com.yonyoucloud.iuap.ipass.product.ProductIPassBarCode
 *  com.yonyoucloud.iuap.ipass.product.ProductIPassOrg
 *  com.yonyoucloud.iuap.ipass.product.ProductIPassQueryRequest
 *  com.yonyoucloud.iuap.ipass.product.ProductSaveRequest
 *  com.yonyoucloud.iuap.upc.api.IProductSaveServiceV2
 *  com.yonyoucloud.iuap.upc.dto.ProductQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCPager
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.iuap.upc.vo.ProductApiVO
 *  com.yonyoucloud.iuap.upc.vo.ProductApplyDetailSaveVO
 *  com.yonyoucloud.iuap.upc.vo.ProductApplySaveVO
 *  com.yonyoucloud.iuap.upc.vo.ProductAssistClassVO
 *  com.yonyoucloud.iuap.upc.vo.ProductAssistUnitExchangesVO
 *  com.yonyoucloud.iuap.upc.vo.ProductBarCodeVO
 *  com.yonyoucloud.iuap.upc.vo.ProductDescriptionVO
 *  com.yonyoucloud.iuap.upc.vo.ProductDetailVO
 *  com.yonyoucloud.iuap.upc.vo.ProductOrgVo
 *  com.yonyoucloud.iuap.upc.vo.ProductQueryVO
 *  com.yonyoucloud.upc.ipass.merchant.PassResultDTO
 *  com.yonyoucloud.upc.ipass.vo.material.ProductCharacterSaveRequest
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.apache.commons.lang3.StringUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeanUtils
 *  org.springframework.beans.BeansException
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.iuap.ipass.impl.product;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.diwork.service.auth.IServiceIsolateService;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.service.config.YmsThreadPoolConfig4UPC;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.upc.ipass.IPassBatchSaveResultUtil;
import com.yonyou.upc.tools.CoreDocJsonResultForOpenApi;
import com.yonyoucloud.iuap.ipass.product.ProductApplyDataSaveRequest;
import com.yonyoucloud.iuap.ipass.product.ProductIPassAssistClass;
import com.yonyoucloud.iuap.ipass.product.ProductIPassAssistUnitExchange;
import com.yonyoucloud.iuap.ipass.product.ProductIPassBarCode;
import com.yonyoucloud.iuap.ipass.product.ProductIPassOrg;
import com.yonyoucloud.iuap.ipass.product.ProductIPassQueryRequest;
import com.yonyoucloud.iuap.ipass.product.ProductSaveRequest;
import com.yonyoucloud.iuap.ipass.service.product.ProductIPassService;
import com.yonyoucloud.iuap.upc.api.IProductSaveServiceV2;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.dto.ProductQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.iuap.upc.vo.ProductApiVO;
import com.yonyoucloud.iuap.upc.vo.ProductApplyDetailSaveVO;
import com.yonyoucloud.iuap.upc.vo.ProductApplySaveVO;
import com.yonyoucloud.iuap.upc.vo.ProductAssistClassVO;
import com.yonyoucloud.iuap.upc.vo.ProductAssistUnitExchangesVO;
import com.yonyoucloud.iuap.upc.vo.ProductBarCodeVO;
import com.yonyoucloud.iuap.upc.vo.ProductDescriptionVO;
import com.yonyoucloud.iuap.upc.vo.ProductDetailVO;
import com.yonyoucloud.iuap.upc.vo.ProductOrgVo;
import com.yonyoucloud.iuap.upc.vo.ProductQueryVO;
import com.yonyoucloud.upc.ipass.merchant.PassResultDTO;
import com.yonyoucloud.upc.ipass.vo.material.ProductCharacterSaveRequest;
import com.yonyoucloud.upc.service.api.ProductServiceImpl;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductIPassServiceImpl
implements ProductIPassService {
    private static final Logger log = LoggerFactory.getLogger(ProductIPassServiceImpl.class);
    @Autowired
    private IServiceIsolateService iServiceIsolateService;
    @Autowired
    private IProductSaveServiceV2 productSaveService;
    @Autowired
    private ProductServiceImpl prouductService;
    private static final String[] PRODUCTLIST_OPEN_API_FIELD = new String[]{"id", "code", "name", "createOrgId", "manageClass", "manageClassCode", "manageClassName", "costClass", "costClassName", "productTemplate", "productTemplateName", "productLine", "productLineCode", "productLineName", "transType", "unitUseType", "weight", "weightUnit", "netWeight", "netWeightUnit", "volume", "volumeUnit", "length", "width", "height", "brand", "brandCode", "brandName", "platformCode", "unitId", "unitCode", "unitName", "modelDescription", "model", "manufacturer", "placeOfOrigin", "medIsRegistrationManager", "medIsAuthorizationManager", "medSunshinePurchaseNo", "medRegistrationNo", "ptoPriceType", "materialStatus", "erpCode", "hasSpecs", "couponId", "couponType", "saleProductClass", "saleProductClassCode", "saleProductClassName", "productFamily", "salesAndOperations", "edPlanClass", "taxClass", "taxClassName", "taxClassCode", "productCharacterDef", "purchaseClass", "purchaseClassCode", "purchaseClassName", "url", "stopstatus", "realProductAttribute", "realProductAttributeType", "virtualProductAttribute"};
    @Autowired
    private IUPCBillService upcBillService;
    @Autowired
    private YmsThreadPoolConfig4UPC ymsThreadPoolConfig4UPC;

    @Override
    public CoreDocJsonResultForOpenApi doProductListAndDetailQuery(ProductIPassQueryRequest productIPassQueryRequest) {
        try {
            Boolean queryDetailData;
            ProductQryDTO productQryDTO = new ProductQryDTO();
            BeanUtils.copyProperties((Object)productIPassQueryRequest, (Object)productQryDTO);
            productQryDTO.setCreator(Boolean.valueOf(true));
            if (!StringUtils.isEmpty((CharSequence)productIPassQueryRequest.getProductTemplate())) {
                productQryDTO.setProductTemplate(Long.valueOf(productIPassQueryRequest.getProductTemplate()));
            }
            if (productIPassQueryRequest.getBeginTime() != null) {
                productQryDTO.setBeganTime(productIPassQueryRequest.getBeginTime());
            }
            UPCPager upcPager = this.listProductByCondition(productQryDTO);
            List recordList = upcPager.getRecordList();
            Integer recordCount = this.prouductService.queryProductListCount(productQryDTO);
            upcPager.setRecordCount(recordCount);
            upcPager.setHaveNextPage(Boolean.valueOf(false));
            if (recordCount != null && productIPassQueryRequest.getPageIndex() != null && productIPassQueryRequest.getPageSize() != null && recordCount > productIPassQueryRequest.getPageSize() * productIPassQueryRequest.getPageIndex()) {
                upcPager.setHaveNextPage(Boolean.valueOf(true));
            }
            if ((queryDetailData = productIPassQueryRequest.getCustom_queryDetailData()).booleanValue() && !CollectionUtils.isEmpty((Collection)recordList)) {
                JSONArray dataArray = JSONUtil.parseArray((Object)recordList);
                for (int i = 0; i < dataArray.size(); ++i) {
                    JSONObject customExtendData;
                    JSONArray assistUnitExchangesDataJson;
                    Object assistUnitExchanges;
                    JSONObject recordJson = dataArray.getJSONObject((Object)i);
                    ProductQueryVO productQueryVO = new ProductQueryVO();
                    productQueryVO.setId(recordJson.getLong((Object)"id"));
                    productQueryVO.setOrgId(recordJson.getStr((Object)"createOrgId"));
                    ProductApiVO productApiVO = this.productSaveService.queryProduct(productQueryVO);
                    JSONObject detailJson = JSONUtil.parseObj((Object)productApiVO);
                    JSONObject detailDataJson = detailJson.getJSONObject((Object)"detail");
                    if (ObjectUtil.isNotEmpty((Object)detailDataJson)) {
                        recordJson.set("detail", (Object)detailDataJson);
                    }
                    if ((assistUnitExchanges = detailJson.get((Object)"productAssistUnitExchanges")) instanceof JSONArray && ObjectUtil.isNotEmpty((Object)(assistUnitExchangesDataJson = (JSONArray)assistUnitExchanges))) {
                        recordJson.set("productAssistUnitExchanges", (Object)assistUnitExchangesDataJson);
                    }
                    if (ObjectUtil.isNotEmpty((Object)(customExtendData = detailJson.getJSONObject((Object)"customExtend")))) {
                        recordJson.set("customExtend", (Object)customExtendData);
                    }
                    this.dealMultilingualField(recordJson);
                }
                upcPager.setRecordList(JSONUtil.toList((JSONArray)dataArray, Object.class));
            }
            return CoreDocJsonResultForOpenApi.success((Object)upcPager);
        }
        catch (BusinessException e) {
            log.error("\u7279\u5f81\u7269\u6599\u6863\u6848\u5217\u8868\u67e5\u8be2-\u96c6\u6210\u63a5\u53e3\u5f02\u5e38:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(e.getMessage()));
        }
        catch (Exception e) {
            log.error("\u7279\u5f81\u7269\u6599\u6863\u6848\u5217\u8868\u67e5\u8be2-\u96c6\u6210\u63a5\u53e3\u5f02\u5e38:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    @Override
    public CoreDocJsonResultForOpenApi doProductBatchSave(List<ProductSaveRequest> productSaveRequestList) {
        ArrayList<Future> futureList = new ArrayList<Future>();
        for (ProductSaveRequest item : productSaveRequestList) {
            Future ruleExecuteResultFuture = RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> {
                BillDataDto bill = new BillDataDto("pc_product");
                bill.setConvertType(Integer.valueOf(2));
                bill.setData((Object)this.handleProductParam(JSONUtil.parseObj((Object)item)));
                ResultList result = this.upcBillService.batchSave(this.upcBillService.dealBillDataForApi(bill, "save"));
                PassResultDTO passResultDTO = new PassResultDTO();
                if (result.getSucessCount() == 1) {
                    passResultDTO.setSourceUnique(item.getSourceUnique());
                    passResultDTO.setTargetUnique(((Map)result.getInfos().get(0)).get("id").toString());
                } else {
                    passResultDTO.setSourceUnique(item.getSourceUnique());
                    passResultDTO.setMessage(result.getMessages().get(0).toString());
                }
                return passResultDTO;
            }, (ExecutorService)this.ymsThreadPoolConfig4UPC.getFixedThreadPoolExecutor("core-doc-ipass-multi-thread"));
            futureList.add(ruleExecuteResultFuture);
        }
        UPCResultList upcResultList = IPassBatchSaveResultUtil.buildResultForBatchSaveOrUpdate(futureList);
        return CoreDocJsonResultForOpenApi.success((Object)upcResultList);
    }

    @Override
    public CoreDocJsonResultForOpenApi doCharacterProductBatchSave(List<ProductCharacterSaveRequest> productCharacterSaveRequestList) {
        ArrayList<Future> futureList = new ArrayList<Future>();
        for (ProductCharacterSaveRequest productNewSaveRequest : productCharacterSaveRequestList) {
            Future ruleExecuteResultFuture = RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> {
                ProductApiVO productApiVO = new ProductApiVO();
                PassResultDTO passResultDTO = new PassResultDTO();
                BeanUtils.copyProperties((Object)productNewSaveRequest, (Object)productApiVO);
                this.convert(productNewSaveRequest, productApiVO);
                try {
                    Object result = this.productSaveService.productSave(productApiVO);
                    if (result != null) {
                        productApiVO = (ProductApiVO)result;
                        passResultDTO.setSourceUnique(productNewSaveRequest.getSourceUnique());
                        passResultDTO.setTargetUnique(productApiVO.getId().toString());
                    }
                    return passResultDTO;
                }
                catch (Exception e) {
                    passResultDTO.setSourceUnique(productNewSaveRequest.getSourceUnique());
                    passResultDTO.setMessage(e.getMessage());
                    return passResultDTO;
                }
            }, (ExecutorService)this.ymsThreadPoolConfig4UPC.getYmsLongTaskExecutorService());
            futureList.add(ruleExecuteResultFuture);
        }
        UPCResultList upcResultList = IPassBatchSaveResultUtil.buildResultForBatchSaveOrUpdate(futureList);
        return CoreDocJsonResultForOpenApi.success((Object)upcResultList);
    }

    @Override
    public CoreDocJsonResultForOpenApi doProductApplyDetailSave(List<ProductApplyDataSaveRequest> productApplyDataSaveRequestList) {
        ArrayList<Future> futureList = new ArrayList<Future>();
        for (ProductApplyDataSaveRequest productApplyDataSaveRequest : productApplyDataSaveRequestList) {
            Future ruleExecuteResultFuture = RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> {
                CoreDocJsonResult coreDocJsonResult = new CoreDocJsonResult();
                ProductApplySaveVO productApplySaveVO = new ProductApplySaveVO();
                BeanUtils.copyProperties((Object)productApplyDataSaveRequest, (Object)productApplySaveVO);
                ProductApplyDetailSaveVO detail = new ProductApplyDetailSaveVO();
                BeanUtils.copyProperties((Object)productApplyDataSaveRequest.getDetail(), (Object)detail);
                productApplySaveVO.setDetail(detail);
                coreDocJsonResult = this.productSaveService.productApplyDetailSave(productApplySaveVO);
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
        return CoreDocJsonResultForOpenApi.success((Object)upcResultList);
    }

    public UPCPager listProductByCondition(ProductQryDTO qryDTO) throws Exception {
        List orgIdList = this.iServiceIsolateService.findMainOrgPermission(AppContext.getCurrentUser().getYhtUserId(), "pc_product", AppContext.getCurrentUser().getYhtTenantId());
        if (!CollectionUtils.isEmpty((Collection)orgIdList)) {
            qryDTO.setCreateOrgList(orgIdList);
        }
        Integer pageIndex = qryDTO.getPageIndex();
        Integer pageSize = qryDTO.getPageSize();
        UPCPager upcPager = this.prouductService.listProductByPageV2(qryDTO, pageIndex, pageSize, PRODUCTLIST_OPEN_API_FIELD);
        return upcPager;
    }

    public void dealMultilingualField(JSONObject recordJson) {
        JSONObject nameJson = JSONUtil.createObj();
        nameJson.set("simplifiedName", (Object)recordJson.getStr((Object)"name"));
        nameJson.set("zh_CN", (Object)recordJson.getStr((Object)"name"));
        recordJson.set("name", (Object)nameJson);
        JSONObject modelDescriptionJson = JSONUtil.createObj();
        modelDescriptionJson.set("simplifiedName", (Object)recordJson.getStr((Object)"modelDescription"));
        recordJson.set("modelDescription", (Object)modelDescriptionJson);
        JSONObject modelJson = JSONUtil.createObj();
        modelJson.set("simplifiedName", (Object)recordJson.getStr((Object)"model"));
        recordJson.set("model", (Object)modelJson);
    }

    public JSONObject handleProductParam(JSONObject data) {
        if (!data.getBool((Object)"enableAssistUnit", Boolean.valueOf(true)).booleanValue()) {
            data.remove((Object)"productAssistUnitExchanges");
        }
        return data;
    }

    public void convert(ProductCharacterSaveRequest source, ProductApiVO target) throws BeansException {
        ProductDescriptionVO descriptionVO;
        if (null == target.getUnitUseType() && null != source.getUnitUseType()) {
            target.setUnitUseType(Integer.valueOf(source.getUnitUseType().toString()));
        }
        if (source.getVirtualProductAttribute() != null) {
            target.setVirtualProductAttribute(Integer.valueOf(source.getVirtualProductAttribute().toString()));
        }
        if (null == target.getDetail() && null != source.getDetail()) {
            ProductDetailVO detailVO = new ProductDetailVO();
            BeanUtils.copyProperties((Object)source.getDetail(), (Object)detailVO);
            detailVO.setStopStatus(source.getDetail().getStopstatus());
            if (source.getDetail().getValueManageType() != null) {
                detailVO.setValueManageType(Integer.valueOf(source.getDetail().getValueManageType()));
            }
            target.setDetail(detailVO);
        }
        if (null == target.getDescription() && null != source.getDescription()) {
            descriptionVO = new ProductDescriptionVO();
            BeanUtils.copyProperties((Object)source.getDescription(), (Object)descriptionVO);
            target.setDescription(descriptionVO);
        }
        if (null == target.getDescription() && null != source.getDescription()) {
            descriptionVO = new ProductDescriptionVO();
            BeanUtils.copyProperties((Object)source.getDescription(), (Object)descriptionVO);
            target.setDescription(descriptionVO);
        }
        if (CollectionUtils.isEmpty((Collection)target.getProductOrges()) && !CollectionUtils.isEmpty((Collection)source.getProductOrges())) {
            ArrayList<ProductOrgVo> orgVos = new ArrayList<ProductOrgVo>();
            for (ProductIPassOrg org : source.getProductOrges()) {
                ProductOrgVo orgVo = new ProductOrgVo();
                BeanUtils.copyProperties((Object)org, (Object)orgVo);
                orgVos.add(orgVo);
            }
            target.setProductOrges(orgVos);
        }
        if (CollectionUtils.isEmpty((Collection)target.getProductAssistClasses()) && !CollectionUtils.isEmpty((Collection)source.getProductAssistClasses())) {
            ArrayList<ProductAssistClassVO> assistClassVOS = new ArrayList<ProductAssistClassVO>();
            for (ProductIPassAssistClass productAssistClass : source.getProductAssistClasses()) {
                ProductAssistClassVO assistClassVO = new ProductAssistClassVO();
                BeanUtils.copyProperties((Object)productAssistClass, (Object)assistClassVO);
                assistClassVOS.add(assistClassVO);
            }
            target.setProductAssistClasses(assistClassVOS);
        }
        if (CollectionUtils.isEmpty((Collection)target.getProductAssistUnitExchanges()) && !CollectionUtils.isEmpty((Collection)source.getProductAssistUnitExchanges())) {
            ArrayList<ProductAssistUnitExchangesVO> productAssistUnitExchangesVOS = new ArrayList<ProductAssistUnitExchangesVO>();
            for (ProductIPassAssistUnitExchange productAssistUnitExchange : source.getProductAssistUnitExchanges()) {
                ProductAssistUnitExchangesVO productAssistUnitExchangesVO = new ProductAssistUnitExchangesVO();
                BeanUtils.copyProperties((Object)productAssistUnitExchange, (Object)productAssistUnitExchangesVO);
                if (productAssistUnitExchange.getAssistUnitCount() != null) {
                    productAssistUnitExchangesVO.setAssistUnitCount(BigDecimal.valueOf(productAssistUnitExchange.getAssistUnitCount()));
                }
                if (productAssistUnitExchange.getMainUnitCount() != null) {
                    productAssistUnitExchangesVO.setMainUnitCount(BigDecimal.valueOf(productAssistUnitExchange.getMainUnitCount()));
                }
                productAssistUnitExchangesVOS.add(productAssistUnitExchangesVO);
            }
            target.setProductAssistUnitExchanges(productAssistUnitExchangesVOS);
        }
        if (CollectionUtils.isEmpty((Collection)target.getProductBarCodes()) && !CollectionUtils.isEmpty((Collection)source.getProductBarCodes())) {
            ArrayList<ProductBarCodeVO> productBarCodeVOS = new ArrayList<ProductBarCodeVO>();
            for (ProductIPassBarCode productBarCode : source.getProductBarCodes()) {
                ProductBarCodeVO productBarCodeVO = new ProductBarCodeVO();
                BeanUtils.copyProperties((Object)productBarCode, (Object)productBarCodeVO);
                productBarCodeVOS.add(productBarCodeVO);
            }
            target.setProductBarCodes(productBarCodeVOS);
        }
        if (null == target.getProductCharacterDef() && null != source.getProductCharacterDef()) {
            target.setProductCharacterDef((Map)source.getProductCharacterDef());
        }
        if (null == target.getProductPropCharacterDefine() && null != source.getProductPropCharacterDefine()) {
            target.setProductPropCharacterDefine((Map)source.getProductPropCharacterDefine());
        }
        if (null == target.getDetail().getProductExtendCharacterDef() && null != source.getDetail().getProductExtendCharacterDef()) {
            target.getDetail().setProductExtendCharacterDef((Map)source.getDetail().getProductExtendCharacterDef());
        }
    }
}

