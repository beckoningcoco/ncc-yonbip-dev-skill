/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.service.config.YmsThreadPoolConfig4UPC
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.upc.ipass.IPassBatchSaveResultUtil
 *  com.yonyou.upc.tools.CoreDocJsonResultForOpenApi
 *  com.yonyoucloud.iuap.ipass.sku.ProductSkuDetailIPass
 *  com.yonyoucloud.iuap.ipass.sku.ProductSkuIPassSaveRequest
 *  com.yonyoucloud.iuap.upc.api.ISkuServiceV2
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.iuap.upc.vo.sku.ProductSKUCharacterSaveVO
 *  com.yonyoucloud.iuap.upc.vo.sku.ProductSKUDetailCharacterSaveVO
 *  com.yonyoucloud.upc.ipass.merchant.PassResultDTO
 *  com.yonyoucloud.upc.utils.DTOCheckUtil
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.iuap.ipass.impl.sku;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.service.config.YmsThreadPoolConfig4UPC;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.upc.ipass.IPassBatchSaveResultUtil;
import com.yonyou.upc.tools.CoreDocJsonResultForOpenApi;
import com.yonyoucloud.iuap.ipass.service.sku.ProductSkuIPassService;
import com.yonyoucloud.iuap.ipass.sku.ProductSkuDetailIPass;
import com.yonyoucloud.iuap.ipass.sku.ProductSkuIPassSaveRequest;
import com.yonyoucloud.iuap.upc.api.ISkuServiceV2;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.iuap.upc.vo.sku.ProductSKUCharacterSaveVO;
import com.yonyoucloud.iuap.upc.vo.sku.ProductSKUDetailCharacterSaveVO;
import com.yonyoucloud.upc.ipass.merchant.PassResultDTO;
import com.yonyoucloud.upc.utils.DTOCheckUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductSkuIPassServiceImpl
implements ProductSkuIPassService {
    private static final Logger log = LoggerFactory.getLogger(ProductSkuIPassServiceImpl.class);
    @Autowired
    private ISkuServiceV2 skuService;
    @Autowired
    private YmsThreadPoolConfig4UPC ymsThreadPoolConfig4UPC;

    @Override
    public CoreDocJsonResultForOpenApi doProductSkuBatchSaveOrUpdate(List<ProductSkuIPassSaveRequest> productSkuIPassSaveRequestList) {
        if (CollectionUtils.isEmpty(productSkuIPassSaveRequestList)) {
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        if (productSkuIPassSaveRequestList.size() > CoredocSDKConstant.MAX_NUM_FOR_COMPLEX) {
            return CoreDocJsonResultForOpenApi.error((Long)Long.valueOf(CoreDocBusinessErrorEnum.PARAM_MORE_THAN_LIMITATION.getCode()), (String)String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A7F2BEA04080003", (String)"\u8bf7\u6c42\u6570\u91cf\u8d85\u8fc7\u6700\u5927\u9650\u5236\u6570\u91cf:%d"), CoredocSDKConstant.MAX_NUM_FOR_COMPLEX));
        }
        ArrayList<Future> futureList = new ArrayList<Future>();
        for (ProductSkuIPassSaveRequest productSkuIPassSaveRequest : productSkuIPassSaveRequestList) {
            Future ruleExecuteResultFuture = RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> {
                ProductSKUCharacterSaveVO productSkuCharacterSaveVO = new ProductSKUCharacterSaveVO();
                BeanUtils.copyProperties((Object)productSkuIPassSaveRequest, (Object)productSkuCharacterSaveVO);
                ProductSkuIPassServiceImpl.convertSkuData(productSkuIPassSaveRequest, productSkuCharacterSaveVO);
                if (productSkuIPassSaveRequest.getProductSkuDetailNew() != null) {
                    ProductSKUDetailCharacterSaveVO productSKUDetailCharacterSaveVO = new ProductSKUDetailCharacterSaveVO();
                    BeanUtils.copyProperties((Object)productSkuIPassSaveRequest.getProductSkuDetailNew(), (Object)productSKUDetailCharacterSaveVO);
                    ProductSkuIPassServiceImpl.convertSkuDetailData(productSkuIPassSaveRequest.getProductSkuDetailNew(), productSKUDetailCharacterSaveVO);
                    productSkuCharacterSaveVO.setProductSkuDetailNew(productSKUDetailCharacterSaveVO);
                }
                PassResultDTO passResultDTO = new PassResultDTO();
                try {
                    DTOCheckUtil.checkParams((ProductSKUCharacterSaveVO)productSkuCharacterSaveVO);
                    ProductSKUCharacterSaveVO resultSkuData = this.skuService.saveProductSKUCharacter(productSkuCharacterSaveVO);
                    passResultDTO.setSourceUnique(productSkuIPassSaveRequest.getSourceUnique());
                    passResultDTO.setTargetUnique(resultSkuData.getId().toString());
                }
                catch (Exception e) {
                    log.error("\u7269\u6599SKU\u6863\u6848\u6279\u91cf\u4fdd\u5b58-\u96c6\u6210\u63a5\u53e3\u5f02\u5e38:" + e.getMessage(), (Throwable)e);
                    passResultDTO.setSourceUnique(productSkuIPassSaveRequest.getSourceUnique());
                    passResultDTO.setMessage(e.getMessage());
                }
                return passResultDTO;
            }, (ExecutorService)this.ymsThreadPoolConfig4UPC.getFixedThreadPoolExecutor("core-doc-ipass-multi-thread"));
            futureList.add(ruleExecuteResultFuture);
        }
        UPCResultList upcResultList = IPassBatchSaveResultUtil.buildResultForBatchSaveOrUpdate(futureList);
        return CoreDocJsonResultForOpenApi.success((Object)upcResultList);
    }

    private static void convertSkuData(ProductSkuIPassSaveRequest productSkuIPassSaveRequest, ProductSKUCharacterSaveVO productSkuCharacterSaveVO) {
        if (productSkuIPassSaveRequest.getBatchRate() != null) {
            productSkuCharacterSaveVO.setBatchRate(productSkuIPassSaveRequest.getBatchRate().toString());
        }
        if (productSkuIPassSaveRequest.getWeight() != null) {
            productSkuCharacterSaveVO.setWeight(new BigDecimal(productSkuIPassSaveRequest.getWeight()));
        }
        if (productSkuIPassSaveRequest.getVolume() != null) {
            productSkuCharacterSaveVO.setVolume(new BigDecimal(productSkuIPassSaveRequest.getVolume()));
        }
    }

    private static void convertSkuDetailData(ProductSkuDetailIPass productSkuDetailIPass, ProductSKUDetailCharacterSaveVO productSKUDetailCharacterSaveVO) {
        if (productSkuDetailIPass.getBatchDeliveryDays() != null) {
            productSKUDetailCharacterSaveVO.setBatchDeliveryDays(Integer.valueOf(productSkuDetailIPass.getBatchDeliveryDays().toString()));
        }
        if (productSkuDetailIPass.getIOrder() != null) {
            productSKUDetailCharacterSaveVO.setiOrder(Integer.valueOf(productSkuDetailIPass.getIOrder().toString()));
        }
        if (productSkuDetailIPass.getFMarketPrice() != null) {
            productSKUDetailCharacterSaveVO.setfMarketPrice(BigDecimal.valueOf(productSkuDetailIPass.getFMarketPrice()));
        }
        if (productSkuDetailIPass.getFPrimeCosts() != null) {
            productSKUDetailCharacterSaveVO.setfPrimeCosts(BigDecimal.valueOf(productSkuDetailIPass.getFPrimeCosts()));
        }
        if (productSkuDetailIPass.getFNoTaxCostPrice() != null) {
            productSKUDetailCharacterSaveVO.setfNoTaxCostPrice(BigDecimal.valueOf(productSkuDetailIPass.getFNoTaxCostPrice()));
        }
        if (productSkuDetailIPass.getFSettleAccountsRate() != null) {
            productSKUDetailCharacterSaveVO.setfSettleAccountsRate(BigDecimal.valueOf(productSkuDetailIPass.getFSettleAccountsRate()));
        }
        if (productSkuDetailIPass.getIDoubleSale() != null) {
            productSKUDetailCharacterSaveVO.setiDoubleSale(BigDecimal.valueOf(productSkuDetailIPass.getIDoubleSale()));
        }
        if (productSkuDetailIPass.getIMinOrderQuantity() != null) {
            productSKUDetailCharacterSaveVO.setiMinOrderQuantity(BigDecimal.valueOf(productSkuDetailIPass.getIMinOrderQuantity()));
        }
        if (productSkuDetailIPass.getInventoryCount() != null) {
            productSKUDetailCharacterSaveVO.setInventoryCount(BigDecimal.valueOf(productSkuDetailIPass.getInventoryCount()));
        }
        if (productSkuDetailIPass.getMarkPrice() != null) {
            productSKUDetailCharacterSaveVO.setMarkPrice(BigDecimal.valueOf(productSkuDetailIPass.getMarkPrice()));
        }
        if (productSkuDetailIPass.getSafetyStock() != null) {
            productSKUDetailCharacterSaveVO.setSafetyStock(BigDecimal.valueOf(productSkuDetailIPass.getSafetyStock()));
        }
        if (productSkuDetailIPass.getSalePrice() != null) {
            productSKUDetailCharacterSaveVO.setSalePrice(BigDecimal.valueOf(productSkuDetailIPass.getSalePrice()));
        }
    }
}

