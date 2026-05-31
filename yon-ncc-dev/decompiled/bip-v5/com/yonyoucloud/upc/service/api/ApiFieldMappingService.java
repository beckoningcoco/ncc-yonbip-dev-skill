/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.MerchantAPIUtils
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.iuap.upc.api.IApiFieldMappingService
 *  com.yonyoucloud.iuap.upc.dto.FieldMappingDTO
 *  com.yonyoucloud.iuap.upc.vo.QueryFieldMappingVo
 *  com.yonyoucloud.iuap.upc.vo.QueryFieldMappingVo$ApiTypeEnum
 *  com.yonyoucloud.iuap.upc.vo.QueryFieldMappingVo$Billnum
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.MerchantAPIUtils;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.api.IApiFieldMappingService;
import com.yonyoucloud.iuap.upc.dto.FieldMappingDTO;
import com.yonyoucloud.iuap.upc.vo.QueryFieldMappingVo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiFieldMappingService
implements IApiFieldMappingService {
    private static final Logger log = LoggerFactory.getLogger(ApiFieldMappingService.class);
    @Autowired
    private ApiFieldMappingService apiFieldMappingService;

    public List<FieldMappingDTO> getApiFieldMappingByVO(QueryFieldMappingVo queryFieldMappingVo) throws Exception {
        if (queryFieldMappingVo == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801412);
        }
        if (queryFieldMappingVo.getApiTypeEnum() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801413);
        }
        return SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.FieldMap.getFileMapByType", (Object)queryFieldMappingVo);
    }

    public void saveApiFieldMapping(List<FieldMappingDTO> fieldMappingDTOS) throws Exception {
        FieldMappingDTO fieldMappingDTO;
        int size = ProductAPIUtils.productAllFieldMapping.size() + ProductAPIUtils.productMainFieldMapping.size() + ProductAPIUtils.skuMainFieldMapping.size() + ProductAPIUtils.materialClassFieldMap.size() + MerchantAPIUtils.merchantAllFieldMapping.size() + MerchantAPIUtils.merchantAllFieldMapping.size();
        ArrayList ids = new ArrayList(size);
        int count = 0;
        for (Map.Entry entry : ProductAPIUtils.productAllFieldMapping.entrySet()) {
            FieldMappingDTO productAllFieldMappingDTO = new FieldMappingDTO();
            productAllFieldMappingDTO.setId((String)ids.get(count++));
            productAllFieldMappingDTO.setApiKey((String)entry.getKey());
            productAllFieldMappingDTO.setApiValue((String)entry.getValue());
            productAllFieldMappingDTO.setBillnum(QueryFieldMappingVo.Billnum.PRODUCT.getBillnum());
            productAllFieldMappingDTO.setApiType(Integer.valueOf(QueryFieldMappingVo.ApiTypeEnum.API.getCode()));
            fieldMappingDTOS.add(productAllFieldMappingDTO);
        }
        for (Map.Entry entry : ProductAPIUtils.productMainFieldMapping.entrySet()) {
            FieldMappingDTO productMainFieldMappingDTO = new FieldMappingDTO();
            productMainFieldMappingDTO.setId((String)ids.get(count++));
            productMainFieldMappingDTO.setApiKey((String)entry.getKey());
            productMainFieldMappingDTO.setApiValue((String)entry.getValue());
            productMainFieldMappingDTO.setBillnum(QueryFieldMappingVo.Billnum.PRODUCT_BASE.getBillnum());
            productMainFieldMappingDTO.setApiType(Integer.valueOf(QueryFieldMappingVo.ApiTypeEnum.API.getCode()));
            fieldMappingDTOS.add(productMainFieldMappingDTO);
        }
        for (Map.Entry entry : ProductAPIUtils.materialClassFieldMap.entrySet()) {
            FieldMappingDTO materialClass = new FieldMappingDTO();
            materialClass.setId((String)ids.get(count++));
            materialClass.setApiKey((String)entry.getKey());
            materialClass.setApiValue((String)entry.getValue());
            materialClass.setBillnum(QueryFieldMappingVo.Billnum.MATERIAL_CLASS.getBillnum());
            materialClass.setApiType(Integer.valueOf(QueryFieldMappingVo.ApiTypeEnum.API.getCode()));
            fieldMappingDTOS.add(materialClass);
        }
        for (Map.Entry entry : ProductAPIUtils.skuMainFieldMapping.entrySet()) {
            FieldMappingDTO skuMainFieldMappingDTO = new FieldMappingDTO();
            skuMainFieldMappingDTO.setId((String)ids.get(count++));
            skuMainFieldMappingDTO.setApiKey((String)entry.getKey());
            skuMainFieldMappingDTO.setApiValue((String)entry.getValue());
            skuMainFieldMappingDTO.setBillnum(QueryFieldMappingVo.Billnum.SKU.getBillnum());
            skuMainFieldMappingDTO.setApiType(Integer.valueOf(QueryFieldMappingVo.ApiTypeEnum.API.getCode()));
            fieldMappingDTOS.add(skuMainFieldMappingDTO);
        }
        for (Map.Entry entry : MerchantAPIUtils.merchantAllFieldMapping.entrySet()) {
            fieldMappingDTO = new FieldMappingDTO();
            fieldMappingDTO.setId((String)ids.get(count++));
            fieldMappingDTO.setApiKey((String)entry.getKey());
            fieldMappingDTO.setApiValue((String)entry.getValue());
            fieldMappingDTO.setBillnum(QueryFieldMappingVo.Billnum.MERCHANT_BASE.getBillnum());
            fieldMappingDTO.setApiType(Integer.valueOf(QueryFieldMappingVo.ApiTypeEnum.API.getCode()));
            fieldMappingDTOS.add(fieldMappingDTO);
        }
        for (Map.Entry entry : MerchantAPIUtils.merchantAllFieldMapping.entrySet()) {
            fieldMappingDTO = new FieldMappingDTO();
            fieldMappingDTO.setId((String)ids.get(count++));
            fieldMappingDTO.setApiKey((String)entry.getKey());
            fieldMappingDTO.setApiValue((String)entry.getValue());
            fieldMappingDTO.setBillnum(QueryFieldMappingVo.Billnum.MERCHANT.getBillnum());
            fieldMappingDTO.setApiType(Integer.valueOf(QueryFieldMappingVo.ApiTypeEnum.API.getCode()));
            fieldMappingDTOS.add(fieldMappingDTO);
        }
        SqlHelper.insert((String)"com.yonyoucloud.upc.mapper.FieldMap.saveApiFieldMapping", fieldMappingDTOS);
    }
}

