/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.apdoc.basedoc.common.beans.ResultPager
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.customerdoc.service.dto.CustDocDTO
 *  com.yonyou.iuap.customerdoc.service.itf.ICustomerDocApiService
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.BatchBusinessFilesRequest
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationSuiteFile
 *  com.yonyou.ucf.CharacterDTO
 *  com.yonyou.ucf.CharacterDocValueDTO
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.iuap.upc.api.IProductSpecService
 *  com.yonyoucloud.iuap.upc.dto.CharacterValueDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductCharacterDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductCharacterDocValueDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductSpecItemAlbumDTO
 *  com.yonyoucloud.iuap.upc.dto.SpecItemDto
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductSpecItem
 *  com.yonyoucloud.upc.pc.tpl.ProductTplSpec
 *  com.yonyoucloud.upc.pc.userdef.UserDefineTypeEnum
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.basedoc.common.beans.ResultPager;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.customerdoc.service.dto.CustDocDTO;
import com.yonyou.iuap.customerdoc.service.itf.ICustomerDocApiService;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.iuap.fileservice.sdk.module.pojo.BatchBusinessFilesRequest;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationSuiteFile;
import com.yonyou.ucf.CharacterDTO;
import com.yonyou.ucf.CharacterDocValueDTO;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.api.IProductSpecService;
import com.yonyoucloud.iuap.upc.dto.CharacterValueDTO;
import com.yonyoucloud.iuap.upc.dto.ProductCharacterDTO;
import com.yonyoucloud.iuap.upc.dto.ProductCharacterDocValueDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSpecItemAlbumDTO;
import com.yonyoucloud.iuap.upc.dto.SpecItemDto;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductSpecItem;
import com.yonyoucloud.upc.pc.tpl.ProductTplSpec;
import com.yonyoucloud.upc.pc.userdef.UserDefineTypeEnum;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.api.ProductCharactorServiceImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class ProductSpecServiceImpl
implements IProductSpecService {
    private static final Logger log = LoggerFactory.getLogger(ProductSpecServiceImpl.class);
    @Autowired
    CooperationFileService cooperationFileService;
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    ICustomerDocApiService iCustomerDocApiService;
    @Autowired
    ProductCharactorServiceImpl productCharactorService;

    public Map<String, List<SpecItemDto>> getSpecItemByProductId(Long productId) throws Exception {
        return this.getProductSpecItem(productId);
    }

    private Map<String, List<SpecItemDto>> getProductSpecItem(Long productId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId)});
        QuerySchema schema = QuerySchema.create().addSelect("iSpecId, specValue, iSpecId.showItem as showItem, iSpecId.defineId as defineId, iSpecId.achiveDefineCode as achiveDefineCode,iSpecId.type as type, iSpecId.achiveReturn as achiveReturn, lsSpecItems_id, lsSpecItems_id.name as name, lsSpecItems_id.code as code, lsSpecItems_id.orderNum as orderNum").addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(UpcAPiTool.DEFAULT_PAGE_SIZE);
        List productSpecItems = this.productSkuService.query("pc.product.ProductSpecItem", schema);
        Map<String, ProductTplSpec> tplSpecMap = this.getTpLSpecByProductId(productId);
        HashMap<String, List<SpecItemDto>> archiveSpecsMap = new HashMap<String, List<SpecItemDto>>(productSpecItems.size());
        HashMap custArchiveSpecsMap = new HashMap(productSpecItems.size());
        HashMap custCodeIdsMap = new HashMap(productSpecItems.size());
        for (ProductSpecItem productSpecItem : productSpecItems) {
            if (UserDefineTypeEnum.Archive.getName().equals(productSpecItem.get("type").toString())) {
                if (null == archiveSpecsMap.get(productSpecItem.getISpecId().toString())) {
                    archiveSpecsMap.put(productSpecItem.getISpecId().toString(), new ArrayList());
                }
                ProductTplSpec productTplSpec = tplSpecMap.get(productSpecItem.getISpecId().toString());
                List specItemDtos = (List)archiveSpecsMap.get(productSpecItem.getISpecId().toString());
                SpecItemDto specItemDto = new SpecItemDto();
                specItemDto.setSpecId(productSpecItem.getISpecId().toString());
                specItemDto.setId(productSpecItem.getLsSpecItems_id().toString());
                specItemDto.setShowItem(productSpecItem.get("showItem").toString());
                specItemDto.setCFreeid(productSpecItem.get("defineId").toString());
                specItemDto.setCode(productSpecItem.get("code").toString());
                specItemDto.setName(productSpecItem.get("name").toString());
                specItemDto.setTplOrder(productTplSpec.getOrder().intValue());
                if (null != productSpecItem.get("orderNum")) {
                    specItemDto.setIorder(Integer.parseInt(null == productSpecItem.get("orderNum") ? "0" : productSpecItem.get("orderNum").toString()));
                } else {
                    specItemDto.setIorder(0);
                }
                specItemDtos.add(specItemDto);
                continue;
            }
            if (!UserDefineTypeEnum.CustArchive.getName().equals(productSpecItem.get("type").toString())) continue;
            if (null == custArchiveSpecsMap.get(productSpecItem.getISpecId().toString())) {
                custArchiveSpecsMap.put(productSpecItem.getISpecId().toString(), new ArrayList());
            }
            List specItems = (List)custArchiveSpecsMap.get(productSpecItem.getISpecId().toString());
            specItems.add(productSpecItem);
            if (null == custCodeIdsMap.get(productSpecItem.get("achiveDefineCode").toString())) {
                custCodeIdsMap.put(productSpecItem.get("achiveDefineCode").toString(), new ArrayList());
            }
            List ids = (List)custCodeIdsMap.get(productSpecItem.get("achiveDefineCode").toString());
            ids.add(productSpecItem.get("lsSpecItems_id").toString());
        }
        HashMap<String, Map> custValues = new HashMap<String, Map>();
        if (!custCodeIdsMap.isEmpty()) {
            for (Map.Entry entry : custCodeIdsMap.entrySet()) {
                CustDocDTO custDocDTO = new CustDocDTO();
                custDocDTO.setCustDocDefCode((String)entry.getKey());
                custDocDTO.setIds((List)entry.getValue());
                custDocDTO.setPageSize(Integer.valueOf(1000));
                ResultPager resultPager = this.iCustomerDocApiService.queryByCondition(custDocDTO);
                List recordList = resultPager.getRecordList();
                if (CollectionUtils.isEmpty((Collection)recordList)) continue;
                for (Map data : recordList) {
                    custValues.put(data.get("id").toString(), data);
                }
            }
            for (Map.Entry entry : custArchiveSpecsMap.entrySet()) {
                List specItems = (List)entry.getValue();
                for (ProductSpecItem productSpecItem : specItems) {
                    if (null == archiveSpecsMap.get(productSpecItem.getISpecId().toString())) {
                        archiveSpecsMap.put(productSpecItem.getISpecId().toString(), new ArrayList());
                    }
                    ProductTplSpec productTplSpec = tplSpecMap.get(productSpecItem.getISpecId().toString());
                    List specItemDtos = (List)archiveSpecsMap.get(productSpecItem.getISpecId().toString());
                    SpecItemDto specItemDto = new SpecItemDto();
                    specItemDto.setSpecId(productSpecItem.getISpecId().toString());
                    specItemDto.setId(productSpecItem.getLsSpecItems_id().toString());
                    specItemDto.setShowItem(productSpecItem.get("showItem").toString());
                    specItemDto.setCFreeid(productSpecItem.get("defineId").toString());
                    specItemDto.setTplOrder(productTplSpec.getOrder().intValue());
                    Map custValueData = (Map)custValues.get(productSpecItem.getLsSpecItems_id().toString());
                    specItemDto.setCode(custValueData.get("code").toString());
                    String locale = InvocationInfoProxy.getLocale();
                    if (custValueData.get("name") instanceof Map) {
                        Map name = (Map)custValueData.get("name");
                        if (null != name.get(locale)) {
                            specItemDto.setName((String)name.get(locale));
                        } else if (null != name.get("zh_CN")) {
                            specItemDto.setName((String)name.get("zh_CN"));
                        }
                    } else {
                        specItemDto.setName(custValueData.get("name").toString());
                    }
                    if (null != custValueData.get("sort")) {
                        specItemDto.setIorder(Integer.parseInt(custValueData.get("sort").toString()));
                    } else {
                        specItemDto.setIorder(1);
                    }
                    specItemDtos.add(specItemDto);
                }
            }
        }
        return archiveSpecsMap;
    }

    private Map<String, ProductTplSpec> getTpLSpecByProductId(Long productId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)});
        QuerySchema schema = QuerySchema.create().addSelect("productTemplate").addCondition((ConditionExpression)queryConditionGroup);
        List products = this.productSkuService.query("pc.product.Product", schema);
        Product product = (Product)products.get(0);
        queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq((Object)product.getProductTemplate())});
        schema = QuerySchema.create().addSelect("specification, order").distinct().addCondition((ConditionExpression)queryConditionGroup);
        List tplSpecs = this.productSkuService.query("pc.tpl.ProductTplSpec", schema);
        if (CollectionUtils.isEmpty((Collection)tplSpecs)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801099);
        }
        HashMap<String, ProductTplSpec> tplSpecMap = new HashMap<String, ProductTplSpec>(tplSpecs.size());
        for (ProductTplSpec tplSpec : tplSpecs) {
            tplSpecMap.put(tplSpec.getSpecification().toString(), tplSpec);
        }
        return tplSpecMap;
    }

    public Map<Long, List<CharacterDTO>> listCharactorBySkuIds(List<Long> skuIdList) throws Exception {
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("skuIdList", skuIdList);
        param.put("yTenantId", AppContext.getYhtTenantId());
        List skuSpecItems = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductSKUSpecItem.selectProductSkuSpecBySkuIds", param);
        HashMap<Long, List<CharacterDTO>> archiveSpecsMap = new HashMap<Long, List<CharacterDTO>>(skuSpecItems.size());
        HashMap<String, CharacterDTO> skuSpecItem = new HashMap<String, CharacterDTO>();
        for (Map specItem : skuSpecItems) {
            CharacterDTO characterDTO;
            Long skuId = Long.parseLong(specItem.get("skuId").toString());
            Long iSpecId = Long.parseLong(specItem.get("iSpecId").toString());
            String key = skuId + "-" + iSpecId;
            if (!skuSpecItem.containsKey(key)) {
                characterDTO = new CharacterDTO();
                skuSpecItem.put(key, characterDTO);
                characterDTO.setId(iSpecId);
                characterDTO.setName(specItem.get("showitem").toString());
                characterDTO.setCharactorType(specItem.get("type").toString());
                if (!archiveSpecsMap.containsKey(skuId)) {
                    archiveSpecsMap.put(skuId, new ArrayList());
                }
                List characterDTOS = (List)archiveSpecsMap.get(skuId);
                characterDTOS.add(characterDTO);
            }
            characterDTO = (CharacterDTO)skuSpecItem.get(key);
            List charactorDocValueDTOList = characterDTO.getCharactorDocValueDTOList();
            CharacterDocValueDTO characterDocValueDTO = new CharacterDocValueDTO();
            characterDocValueDTO.setId(specItem.get("lsSpecItems_id").toString());
            characterDocValueDTO.setName(specItem.get("specValue").toString());
            charactorDocValueDTOList.add(characterDocValueDTO);
        }
        return archiveSpecsMap;
    }

    public List<ProductCharacterDTO> listUsedCharactorByProductId(Long productId) throws Exception {
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("productId", productId);
        param.put("yTenantId", AppContext.getYhtTenantId());
        List specItems = SqlHelper.selectList((String)"com.yonyoucloud.uretail.mall.dao.QuerySpecificationDao.selectProductSpecByProductId", param);
        ArrayList<ProductCharacterDTO> characterDTOS = new ArrayList<ProductCharacterDTO>();
        HashMap<Long, ProductCharacterDTO> archiveSpecsMap = new HashMap<Long, ProductCharacterDTO>(specItems.size());
        HashMap<String, ProductCharacterDocValueDTO> characterDocValueDTOMap = new HashMap<String, ProductCharacterDocValueDTO>();
        ArrayList<String> businessIdList = new ArrayList<String>();
        HashMap<String, ProductCharacterDocValueDTO> businessAndCharacterItemsMap = new HashMap<String, ProductCharacterDocValueDTO>();
        HashMap<String, Map> businessAndSpecItemsMap = new HashMap<String, Map>();
        for (Map specItem : specItems) {
            ProductCharacterDTO productCharacterDTO;
            Long iSpecId = Long.parseLong(specItem.get("iSpecId").toString());
            if (!archiveSpecsMap.containsKey(iSpecId)) {
                productCharacterDTO = new ProductCharacterDTO();
                archiveSpecsMap.put(iSpecId, productCharacterDTO);
                productCharacterDTO.setId(iSpecId);
                productCharacterDTO.setName(specItem.get("showitem").toString());
                characterDTOS.add(productCharacterDTO);
            }
            productCharacterDTO = (ProductCharacterDTO)archiveSpecsMap.get(iSpecId);
            List charactorDocValueDTOList = productCharacterDTO.getCharactorDocValueDTOList();
            ProductCharacterDocValueDTO characterDocValueDTO = new ProductCharacterDocValueDTO();
            characterDocValueDTO.setId(specItem.get("lsSpecItems_id").toString());
            characterDocValueDTO.setName(specItem.get("specValue").toString());
            if (null != specItem.get("iOrder")) {
                characterDocValueDTO.setTemplateCharacterOrder(Integer.valueOf(Integer.parseInt(specItem.get("iOrder").toString())));
            }
            charactorDocValueDTOList.add(characterDocValueDTO);
            characterDocValueDTOMap.put(specItem.get("id").toString(), characterDocValueDTO);
            if (null == productCharacterDTO.getCharactorValueDTOList()) {
                productCharacterDTO.setCharactorValueDTOList(new ArrayList());
            }
            List charactorValueDTOList = productCharacterDTO.getCharactorValueDTOList();
            charactorValueDTOList.add(characterDocValueDTO);
            if (null == specItem.get("imgBusinessId")) continue;
            businessIdList.add(specItem.get("imgBusinessId").toString());
            businessAndCharacterItemsMap.put(specItem.get("imgBusinessId").toString(), characterDocValueDTO);
            businessAndSpecItemsMap.put(specItem.get("imgBusinessId").toString(), specItem);
        }
        if (!CollectionUtils.isEmpty(businessIdList)) {
            ArrayList<BatchBusinessFilesRequest> batchBusinessFilesRequestList = new ArrayList<BatchBusinessFilesRequest>();
            BatchBusinessFilesRequest batchBusinessFilesRequest = new BatchBusinessFilesRequest();
            batchBusinessFilesRequest.setBusinessType("iuap-apdoc-material");
            batchBusinessFilesRequest.setBusinessIds(businessIdList);
            batchBusinessFilesRequest.setCancelFileExit(Boolean.valueOf(true));
            batchBusinessFilesRequestList.add(batchBusinessFilesRequest);
            CooperationSuiteFile cooperationSuiteFile = this.cooperationFileService.batchBusinessFiles(batchBusinessFilesRequestList);
            List cooperationFileInfoList = cooperationSuiteFile.getData();
            if (!CollectionUtils.isEmpty((Collection)cooperationFileInfoList)) {
                cooperationFileInfoList.forEach(cooperationFileVO -> {
                    String objectId = cooperationFileVO.getObjectId();
                    ProductCharacterDocValueDTO productCharacterDocValueDTO = (ProductCharacterDocValueDTO)businessAndCharacterItemsMap.get(objectId);
                    Map specItem = (Map)businessAndSpecItemsMap.get(objectId);
                    if (null != productCharacterDocValueDTO) {
                        if (null == productCharacterDocValueDTO.getAlbumDTOList()) {
                            productCharacterDocValueDTO.setAlbumDTOList(new ArrayList());
                        }
                        List albumDTOList = productCharacterDocValueDTO.getAlbumDTOList();
                        ProductSpecItemAlbumDTO albumMap = new ProductSpecItemAlbumDTO();
                        albumMap.setProductId(productId);
                        albumMap.setProductSpecItemId(Long.valueOf(Long.parseLong(specItem.get("id").toString())));
                        albumMap.setFolder(cooperationFileVO.getBucketUrl());
                        albumMap.setImgName(cooperationFileVO.getFileName());
                        albumDTOList.add(albumMap);
                        productCharacterDocValueDTO.setAlbumDTOList(albumDTOList);
                    }
                });
            }
        }
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").in(new Object[]{productId}));
        QuerySchema schema = QuerySchema.create().addSelect("productSpecItemId,folder,imgName").addCondition((ConditionExpression)queryConditionGroup);
        List albumList = MetaDaoHelper.query((String)"pc.product.ProductSpecItemAlbum", (QuerySchema)schema);
        if (albumList != null && albumList.size() > 0) {
            List productSpecItemAlbumDTOS = JSON.parseArray((String)JSON.toJSONString((Object)albumList), ProductSpecItemAlbumDTO.class);
            for (ProductSpecItemAlbumDTO albumDTO : productSpecItemAlbumDTOS) {
                ProductCharacterDocValueDTO productCharacterDocValueDTO = (ProductCharacterDocValueDTO)characterDocValueDTOMap.get(albumDTO.getProductSpecItemId().toString());
                ArrayList<ProductSpecItemAlbumDTO> albumDTOList = productCharacterDocValueDTO.getAlbumDTOList();
                if (null == albumDTOList) {
                    albumDTOList = new ArrayList<ProductSpecItemAlbumDTO>();
                    productCharacterDocValueDTO.setAlbumDTOList(albumDTOList);
                }
                albumDTOList.add(albumDTO);
            }
        }
        return characterDTOS;
    }

    public List<Map<String, Object>> getSkuIdByCharactorInfo(Long productId, List<CharacterValueDTO> charactorDTOList) throws Exception {
        ArrayList<Object> expressions = new ArrayList<Object>();
        expressions.add(QueryCondition.name((String)"productId").eq((Object)productId));
        for (CharacterValueDTO characterDTO : charactorDTOList) {
            if (CollectionUtils.isEmpty((Collection)characterDTO.getValueList())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801100);
            }
            ArrayList<QueryCondition> childExpressions = new ArrayList<QueryCondition>();
            for (Object valueId : characterDTO.getValueList()) {
                QueryCondition conditionExpression = QueryCondition.name((String)"specIds").like(valueId);
                childExpressions.add(conditionExpression);
            }
            expressions.add(QueryConditionGroup.or((ConditionExpression[])((ConditionExpression[])childExpressions.toArray(new QueryCondition[childExpressions.size()]))));
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])expressions.toArray(new ConditionExpression[expressions.size()]));
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
        schema.distinct();
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List productSKUList = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        return productSKUList;
    }
}

