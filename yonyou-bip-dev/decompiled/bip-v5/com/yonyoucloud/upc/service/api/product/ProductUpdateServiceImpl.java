/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyoucloud.iuap.upc.dto.ProductDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.iuap.upc.vo.ProductApiVO
 *  com.yonyoucloud.upc.data.product.ProductQueryDao
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductAttributeEnum
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.utils.APIExtPropertiesUtil
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  com.yonyoucloud.upc.utils.UPCResultConverter
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.api.product;

import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyoucloud.iuap.upc.constants.ProductSaveFieldMap;
import com.yonyoucloud.iuap.upc.dto.ProductDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.iuap.upc.vo.ProductApiVO;
import com.yonyoucloud.upc.data.product.ProductQueryDao;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductAttributeEnum;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.service.ProductCheckService;
import com.yonyoucloud.upc.service.api.ProductCheckForApiService;
import com.yonyoucloud.upc.utils.APIExtPropertiesUtil;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import com.yonyoucloud.upc.utils.UPCResultConverter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductUpdateServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(ProductUpdateServiceImpl.class);
    @Autowired
    private ProductCheckForApiService productCheckForApiService;
    @Autowired
    private ProductCheckService productCheckService;
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    private ProductQueryDao productQueryDao;
    @Autowired
    private PubOptionService pubOptionService;

    public CoreDocJsonResult<ProductApiVO> productUpdate(ProductApiVO dto) {
        if (null != dto) {
            try {
                Product product = this.handleUpdateProduct(dto);
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("pc_product");
                billDataDto.setAction("save");
                billDataDto.setData((Object)product);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(2));
                Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
                ProductApiVO productApiVO = new ProductApiVO();
                productApiVO.setId((Long)((Product)result).getId());
                productApiVO.setAutoGenerateRangeData(null);
                return CoreDocJsonResult.success((Object)productApiVO);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u7279\u5f81\u7269\u6599\u6863\u6848\u66f4\u65b0\u5f02\u5e38:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<UPCResultList> productBatchUpdate(List<ProductApiVO> vos) {
        try {
            ArrayList<Product> products = new ArrayList<Product>();
            for (ProductApiVO dto : vos) {
                Product product = this.handleUpdateProduct(dto);
                products.add(product);
            }
            BillDataDto billDataDto = new BillDataDto();
            billDataDto.setBillnum("pc_product");
            billDataDto.setAction("save");
            billDataDto.setData(products);
            billDataDto.setFromApi(true);
            billDataDto.setConvertType(Integer.valueOf(2));
            com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList resultList = this.apiImportSingleService.batchSave4Api(billDataDto);
            UPCResultList upcResultList = UPCResultConverter.resultConvert((ResultList)resultList);
            if (upcResultList.getSucessCount() > 0) {
                List collect = upcResultList.getInfos().stream().map(obj -> {
                    Map map = (Map)obj;
                    ProductDTO productDTO = new ProductDTO();
                    productDTO.setId(Long.valueOf(map.get("id").toString()));
                    productDTO.setCode(map.get("code").toString());
                    return productDTO;
                }).collect(Collectors.toList());
                upcResultList.setInfos(collect);
            }
            return CoreDocJsonResult.success((Object)upcResultList);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u7279\u5f81\u7269\u6599\u6863\u6848\u6279\u91cf\u66f4\u65b0\u5f02\u5e38:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public Product handleUpdateProduct(ProductApiVO productApiVO) throws Exception {
        Product product = this.productQueryDao.getProductCreatorAllInfoByCode(productApiVO.getCode());
        if (product == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_FOUND_BY_CODE, new Object[]{productApiVO.getCode()});
        }
        product.put("_fromApi", (Object)true);
        Map map = UpcAPiTool.beanToMap((Object)productApiVO, ProductSaveFieldMap.productFieldType, ProductSaveFieldMap.productFieldRenameMap, null);
        if (product.getId() != null) {
            this.handleDetail(product, map);
            this.productUpdateCheck(product, map);
        }
        product.putAll(map);
        product.setEntityStatus(EntityStatus.Update);
        if (product.detail() != null) {
            product.detail().setEntityStatus(EntityStatus.Update);
        }
        this.productCheckForApiService.handleDataSavePriority(productApiVO);
        if (product.get("customExtend") != null) {
            APIExtPropertiesUtil.processExtProperties((Map)product, (String)"customExtend", null);
        }
        this.productCheckService.commonCheck(product);
        this.productCheckForApiService.addRowNumForProductSubData(product);
        DataTransferUtils.fill((String)"pc_product", (String)"pc.product.Product", (Object)product, (int)2);
        return product;
    }

    public void productUpdateCheck(Product product, Map<String, Object> map) {
        if (map.get("unitUseType") != null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_UNIT_USE_TYPE_NOT_ALLOW_UPDATE, new Object[]{product.getCode().toString()});
        }
    }

    public void handleDetail(Product product, Map<String, Object> map) {
        if (map.get("realProductAttribute") != null) {
            String realProductAttribute = map.get("realProductAttribute").toString();
            if (ProductAttributeEnum.Real.getValue().equals(realProductAttribute)) {
                product.remove("virtualProductAttribute");
            } else if (ProductAttributeEnum.Virtual.getValue().equals(realProductAttribute)) {
                product.remove("realProductAttributeType");
            }
        }
        product.remove("pubts");
        if (map.get("detail") != null) {
            ProductExtend detail = product.detail();
            detail.remove("pubts");
            detail.putAll((Map)map.get("detail"));
            map.remove("detail");
        }
        product.remove("source");
    }
}

