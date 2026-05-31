/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyoucloud.iuap.upc.api.IProductSaveServiceV2
 *  com.yonyoucloud.iuap.upc.api.product.IProductQueryService
 *  com.yonyoucloud.iuap.upc.vo.ProductApiVO
 *  com.yonyoucloud.iuap.upc.vo.ProductQueryVO
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 */
package com.yonyoucloud.upc.service.api.product;

import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyoucloud.iuap.upc.api.IProductSaveServiceV2;
import com.yonyoucloud.iuap.upc.api.product.IProductQueryService;
import com.yonyoucloud.iuap.upc.vo.ProductApiVO;
import com.yonyoucloud.iuap.upc.vo.ProductQueryVO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

@Service
public class ProductQueryServiceImpl
implements IProductQueryService {
    private static final Logger log = LoggerFactory.getLogger(ProductQueryServiceImpl.class);
    @Autowired
    private IProductSaveServiceV2 productSaveService;
    @Autowired
    PubOptionService pubOptionService;
    static final int MAX_BATCH_SAVE_NUM = 10;

    public CoreDocJsonResult<ProductApiVO> listProductDetail(List<ProductQueryVO> productQueryVOList) {
        if (CollectionUtils.isEmpty(productQueryVOList)) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL.getMessage()));
        }
        if (productQueryVOList.size() > 10) {
            return CoreDocJsonResult.error((Long)Long.valueOf(CoreDocBusinessErrorEnum.PARAM_MORE_THAN_LIMITATION.getCode()), (String)String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1971E45604580009", (String)"\u8bf7\u6c42\u6570\u91cf\u8d85\u8fc7\u6700\u5927\u9650\u5236\u6570\u91cf:%d"), 10));
        }
        ArrayList<ProductApiVO> productApiVOList = new ArrayList<ProductApiVO>();
        Integer recordCount = 0;
        StringBuffer errorMessage = new StringBuffer();
        for (ProductQueryVO productQueryVO : productQueryVOList) {
            ProductApiVO productApiVO = null;
            try {
                productApiVO = this.productSaveService.queryProduct(productQueryVO);
            }
            catch (Exception e) {
                if (productQueryVO.getId() != null) {
                    errorMessage.append("id:").append(productQueryVO.getId()).append(",");
                }
                if (!ObjectUtils.isEmpty((Object)productQueryVO.getProductCode())) {
                    errorMessage.append("code:").append(productQueryVO.getProductCode()).append(",");
                }
                errorMessage.append(e.getMessage()).append(";");
                log.error("\u7269\u6599\u8be6\u60c5\u67e5\u8be2\u5f02\u5e38", (Throwable)e);
            }
            if (productApiVO == null) continue;
            Integer n = recordCount;
            recordCount = recordCount + 1;
            productApiVOList.add(productApiVO);
        }
        CoreDocJsonResult result = CoreDocJsonResult.success(productApiVOList, (String)errorMessage.toString());
        result.setTotalCount(recordCount);
        return result;
    }

    public boolean getOrgGlobalShareByBillNum(String billNum) {
        return this.pubOptionService.getOrgGlobalShareByBillNum(billNum);
    }
}

