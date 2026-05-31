/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.attachment.service.AttachmentServiceImpl
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.po.material.MaterialFreeCharacterItemPO
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.CharacterDTO
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.filter.util.StringUtil
 *  com.yonyou.ucf.userdef.dto.enums.CharacteristicsTypeEnum
 *  com.yonyoucloud.iuap.upc.api.IProductServiceV2
 *  com.yonyoucloud.iuap.upc.api.ISkuServiceV2
 *  com.yonyoucloud.iuap.upc.dto.ProductDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductSkuDTO
 *  com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoDTO
 *  com.yonyoucloud.upc.utils.AttachmentBusinessTypeEnum
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.attachment.service.AttachmentServiceImpl;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.po.material.MaterialFreeCharacterItemPO;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.CharacterDTO;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.filter.util.StringUtil;
import com.yonyou.ucf.userdef.dto.enums.CharacteristicsTypeEnum;
import com.yonyoucloud.iuap.upc.api.IProductServiceV2;
import com.yonyoucloud.iuap.upc.api.ISkuServiceV2;
import com.yonyoucloud.iuap.upc.dto.ProductDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSkuDTO;
import com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoDTO;
import com.yonyoucloud.upc.service.IProductRpcService;
import com.yonyoucloud.upc.service.ProductCharacterService;
import com.yonyoucloud.upc.service.api.FormulaScopeDTO;
import com.yonyoucloud.upc.service.api.ProductCharactorServiceImpl;
import com.yonyoucloud.upc.service.api.ProductFormulaPubService;
import com.yonyoucloud.upc.service.api.ProductFormulaService;
import com.yonyoucloud.upc.utils.AttachmentBusinessTypeEnum;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
public class ProductRpcService
extends ProductFormulaPubService
implements IProductRpcService {
    private static final Logger log = LoggerFactory.getLogger(ProductRpcService.class);
    @Autowired
    private ProductFormulaService formulaService;
    @Autowired
    private ISkuServiceV2 skuService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    private IProductServiceV2 productService;
    @Autowired
    private ProductCharactorServiceImpl iProductCharactorService;
    @Autowired
    private ProductCharacterService productCharacterService;
    @Autowired
    private AttachmentServiceImpl attachmentService;

    @Override
    public Object getProductValue(String field, List<Long> productId, List<String> orgId) {
        return this.formulaService.getProductValue(field, productId, orgId);
    }

    @Override
    public Object getProductValues(String field, List<Object> productId, List<Object> orgId) {
        List<Long> productIds = this.toLongList(productId);
        List<String> orgIds = this.toStringList(orgId);
        return this.formulaService.getProductValue(field, productIds, orgIds);
    }

    @Override
    public Object getProductValue(String field, Long productId, Long orgId) {
        Object retValue;
        block20: {
            retValue = "";
            if (StringUtil.isEmpty((String)field) || null == productId || orgId == null) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080401", (String)"\u67e5\u8be2\u53c2\u6570\u4e0d\u80fd\u4e3a\u7a7a"));
            } else {
                FormulaScopeDTO formulaScopeDTO = this.getScope(field);
                Integer scope = formulaScopeDTO.getScope();
                field = formulaScopeDTO.getField();
                if (scope != null) {
                    try {
                        if (FIELD_GLOBAL.intValue() == scope.intValue()) {
                            if (field.startsWith(PREFFIX_FREE)) {
                                field = field.substring(PREFFIX_FREE.length());
                                retValue = this.getProductFreeField(productId, field);
                            } else if (field.startsWith(PREFFIX_CHARACTER)) {
                                field = field.substring(PREFFIX_CHARACTER.length());
                                retValue = this.getProductCharacterField(productId, field);
                            } else {
                                retValue = this.getGlobalField(productId, field);
                            }
                            break block20;
                        }
                        if (SUB_ATTR.intValue() == scope.intValue()) {
                            retValue = this.getSubField(productId, field);
                            break block20;
                        }
                        QuerySchema schema = QuerySchema.create().addSelect("id,isCreator,productDetailId");
                        boolean orgGlobalShareFlag = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
                        if (orgGlobalShareFlag) {
                            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isCreator").eq((Object)true)}));
                        } else {
                            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"orgId").eq((Object)String.valueOf(orgId))}));
                        }
                        Map applyRange = MetaDaoHelper.queryOne((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
                        if (null != applyRange) {
                            if (FIELD_ORG.intValue() == scope.intValue()) {
                                Long productDetailId = Long.valueOf(applyRange.get("productDetailId").toString());
                                retValue = this.getOrgField(productId, productDetailId, field);
                            } else if (FIELD_ASISTANT_UNIT.intValue() == scope.intValue()) {
                                Long productDetailId = Long.valueOf(applyRange.get("productDetailId").toString());
                                retValue = this.getOrgField(productId, productDetailId, (String)fieldMap.get(field));
                                schema = QuerySchema.create().addSelect("mainUnitCount").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"assistUnit").eq(retValue)}));
                                Map productAssistUnitMap = MetaDaoHelper.queryOne((String)"pc.product.ProductAssistUnitExchange", (QuerySchema)schema);
                                retValue = null != productAssistUnitMap ? productAssistUnitMap.get("mainUnitCount") : Integer.valueOf(1);
                            } else if (FIELD_DEFFINE.intValue() == scope.intValue()) {
                                retValue = this.getDefineField(productId, field);
                            }
                            break block20;
                        }
                        log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080403", (String)"\u5f53\u524d\u5546\u54c1\u672a\u5206\u914d\u7ed9\u5bf9\u5e94\u7ec4\u7ec7"));
                    }
                    catch (Exception e) {
                        log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080402", (String)"\u516c\u5f0f\u6267\u884c\u9519\u8bef"), (Throwable)e);
                    }
                } else {
                    log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080402", (String)"\u516c\u5f0f\u6267\u884c\u9519\u8bef"));
                }
            }
        }
        return retValue;
    }

    @Override
    public Object getProductValue(String field, Long productId, String orgIdStr) {
        Long orgId = StringUtils.hasLength((String)orgIdStr) ? Long.valueOf(orgIdStr) : 0L;
        return this.getProductValue(field, productId, orgId);
    }

    @Override
    public Object getProductValue(String field, String productIdStr, Long orgId) {
        Long productId = StringUtils.hasLength((String)productIdStr) ? Long.valueOf(productIdStr) : 0L;
        return this.getProductValue(field, productId, orgId);
    }

    @Override
    public Object getProductValue(String field, String productIdStr, String orgIdStr) {
        Long productId = StringUtils.hasLength((String)productIdStr) ? Long.valueOf(productIdStr) : 0L;
        Long orgId = StringUtils.hasLength((String)orgIdStr) ? Long.valueOf(orgIdStr) : 0L;
        return this.getProductValue(field, productId, orgId);
    }

    private Object getProductCharacterField(Long productId, String characterCode) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id,productCharacterDef." + characterCode + " as " + characterCode).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)}));
        Map productExtendMap = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)schema);
        return productExtendMap.get(characterCode);
    }

    private Object getProductFreeField(Long productId, String field) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id,freeDefine." + field).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)}));
        Map productExtendMap = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)schema);
        return productExtendMap.get(field);
    }

    @Override
    public Object getProductSKUValue(String field, Long skuId, Long orgId) {
        return this.getProductSKUValue(field, skuId, orgId.toString());
    }

    @Override
    public Object getProductSKUValue(String field, Long skuId, String orgStrId) {
        Object retValue = "";
        try {
            ProductSkuDTO productSkuDTO = this.skuService.getSkuByIdAndOrg(skuId, orgStrId, new String[]{field});
            retValue = JSONObject.parseObject((String)JSON.toJSONString((Object)productSkuDTO)).get((Object)field);
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080402", (String)"\u516c\u5f0f\u6267\u884c\u9519\u8bef"));
        }
        return retValue;
    }

    @Override
    public Object getProductSKUValue(String field, String skuStrId, Long orgId) {
        Long skuId = StringUtils.hasLength((String)skuStrId) ? Long.valueOf(skuStrId) : 0L;
        return this.getProductSKUValue(field, skuId, orgId.toString());
    }

    @Override
    public Object getProductSKUValue(String field, String skuStrId, String orgStrId) {
        Long skuId = StringUtils.hasLength((String)skuStrId) ? Long.valueOf(skuStrId) : 0L;
        return this.getProductSKUValue(field, skuId, orgStrId);
    }

    @Override
    public Object getProductSKUValues(String field, List<Object> skuIdObjs, List<Object> orgIdObjs) {
        Object retValue = "";
        List<Long> skuIds = this.toLongList(skuIdObjs);
        List<String> orgIds = this.toStringList(orgIdObjs);
        if (StringUtil.isEmpty((String)field) || null == skuIds || orgIds == null) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080401", (String)"\u67e5\u8be2\u53c2\u6570\u4e0d\u80fd\u4e3a\u7a7a"));
        } else {
            HashMap<String, List<Long>> orgMap = this.groupDocByOrgIds(skuIds, orgIds);
            try {
                Iterator<Map.Entry<String, List<Long>>> it = orgMap.entrySet().iterator();
                HashMap<Long, Object> orgValueMap = new HashMap<Long, Object>(skuIds.size());
                while (it.hasNext()) {
                    Map.Entry<String, List<Long>> entry = it.next();
                    String orgId = entry.getKey();
                    List<Long> orgSkuIds = entry.getValue();
                    List productSkuDTOList = this.skuService.getSkuByIdsAndOrg(orgSkuIds, orgId, new String[]{field});
                    if (productSkuDTOList == null || productSkuDTOList.size() <= 0) continue;
                    productSkuDTOList.forEach(productSkuDTO -> orgValueMap.put(productSkuDTO.getId(), JSONObject.parseObject((String)JSON.toJSONString((Object)productSkuDTO)).get((Object)field)));
                }
                retValue = this.matchValue(skuIds, orgValueMap);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080402", (String)"\u516c\u5f0f\u6267\u884c\u9519\u8bef"));
            }
        }
        return retValue;
    }

    private Object getOrgField(Long productId, Long productDetailId, String field) throws Exception {
        Object retValue = null;
        switch (field) {
            case "productTag": {
                HashMap<Long, Object> retValueMap = this.formulaService.getProductTagField(new ArrayList<Long>(Arrays.asList(productDetailId)), field);
                if (retValueMap == null) break;
                retValue = retValueMap.get(productDetailId);
                break;
            }
            default: {
                retValue = this.getOrgDetailField(productId, productDetailId, field);
            }
        }
        return retValue;
    }

    private Object getOrgDetailField(Long productId, Long productDetailId, String field) throws Exception {
        Object retValue = null;
        QuerySchema schema = QuerySchema.create().addSelect("id," + field).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productDetailId)}));
        Map rangeDetailMap = MetaDaoHelper.queryOne((String)"pc.product.ProductDetail", (QuerySchema)schema);
        if (null != rangeDetailMap) {
            retValue = rangeDetailMap.get(field);
        }
        return retValue;
    }

    private Object getGlobalField(Long productId, String field) throws Exception {
        String url;
        if (HOME_PAGE_FIELD.equals(field)) {
            url = this.getAttachUrl(productId);
        } else {
            QuerySchema schema = QuerySchema.create().addSelect("id," + field).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)}));
            Map productExtendMap = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)schema);
            url = productExtendMap.get(field);
        }
        return url;
    }

    private Object getDefineField(Long productId, String field) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("defineId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"showItem").eq((Object)field), QueryCondition.name((String)"classId").eq((Object)"productArchive")}));
        Map productDefineMap = MetaDaoHelper.queryOne((String)"pc.userdef.UserDefineClass", (QuerySchema)schema);
        Object filedObj = productDefineMap.get("defineId");
        if (null != filedObj) {
            String filed = filedObj.toString();
            int defineIndex = Integer.valueOf(filed.substring(DEFINE_LENGTH));
            String readlField = DEFINE_NAME + (defineIndex - 90);
            schema = QuerySchema.create().addSelect(readlField).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId)}));
            Map productExtendMap = MetaDaoHelper.queryOne((String)"pc.product.ProductDefine", (QuerySchema)schema);
            return productExtendMap.get(readlField);
        }
        return null;
    }

    private Object getSubField(Long productId, String field) throws Exception {
        StringBuilder subAttrValue = new StringBuilder("");
        String[] attrs = field.split("!");
        String fieldName = attrs.length == 2 ? attrs[1] : "id";
        QuerySchema schema = QuerySchema.create().addSelect("productClassId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId)}));
        List productAssistClassList = MetaDaoHelper.query((String)"pc.product.ProductAssistClass", (QuerySchema)schema);
        if (null != productAssistClassList && productAssistClassList.size() > 0) {
            ArrayList productClsIdList = new ArrayList(productAssistClassList.size());
            productAssistClassList.forEach(productAssistClassMap -> productClsIdList.add(Long.valueOf(productAssistClassMap.get("productClassId").toString())));
            schema = QuerySchema.create().addSelect(fieldName).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productClsIdList)}));
            List presentationClassList = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (QuerySchema)schema);
            if (null != presentationClassList && presentationClassList.size() > 0) {
                presentationClassList.forEach(presentationClass -> subAttrValue.append(presentationClass.get(fieldName).toString()).append(","));
            }
        }
        return subAttrValue.substring(0, subAttrValue.length() - 1);
    }

    @Override
    public Object getProductFreeCharactorValue(Long productId) {
        try {
            ProductDTO productDTO = this.productService.getProductById(productId, new String[]{"productTemplate"});
            Long productTplId = productDTO.getProductTemplate();
            if (productTplId != null) {
                return this.getCharactorStr(productId);
            }
        }
        catch (Exception e) {
            log.error("\u67e5\u8be2\u7269\u6599\u81ea\u7531\u9879\u7279\u5f81\u7ec4\u516c\u5f0f\u9519\u8bef");
        }
        return null;
    }

    @Override
    public Object getProductsFreeCharactorValue(List<Long> productIds) {
        ArrayList retList = new ArrayList(productIds.size());
        try {
            List productDTOList = this.productService.getProductByIds(productIds, new String[]{"productTemplate"});
            productDTOList.forEach(productDTO -> retList.add(this.getCharactorStr(productDTO.getId())));
            return null;
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u67e5\u8be2\u7269\u6599\u81ea\u7531\u9879\u7279\u5f81\u7ec4\u516c\u5f0f\u9519\u8bef");
            return retList;
        }
    }

    @Override
    public Object getMaterialHomeImage(Long productId) {
        return this.getAlbumByIdAndType(productId, AttachmentBusinessTypeEnum.PRODUCT_HOME_PAGE_IMAGE);
    }

    @Override
    public Object getMaterialsHomeImage(List<Long> productIdList) {
        return null;
    }

    @Override
    public Object getMaterialAlbum(Long productId) {
        return this.getAlbumByIdAndType(productId, AttachmentBusinessTypeEnum.PRODUCT_IMAGE);
    }

    @Override
    public Object getMaterialsAlbum(List<Long> productIdList) {
        return null;
    }

    @Override
    public Object getSkuAlbum(Long productId) {
        String url = "";
        try {
            List<MaterialFreeCharacterItemPO> materialFreeCharacterItemPOList = this.productCharacterService.getSkuAlbumByProduct(Arrays.asList(productId));
            if (!CollectionUtils.isEmpty(materialFreeCharacterItemPOList)) {
                List attachmentInfoDTOList;
                int order = Integer.MAX_VALUE;
                String imageBusinessId = null;
                for (MaterialFreeCharacterItemPO materialFreeCharacterItemPO : materialFreeCharacterItemPOList) {
                    if (!StringUtils.hasLength((String)materialFreeCharacterItemPO.getImgBusinessId())) continue;
                    if (null != materialFreeCharacterItemPO.getIOrder()) {
                        if (materialFreeCharacterItemPO.getIOrder() >= order) continue;
                        imageBusinessId = materialFreeCharacterItemPO.getImgBusinessId();
                        order = materialFreeCharacterItemPO.getIOrder();
                        continue;
                    }
                    imageBusinessId = materialFreeCharacterItemPO.getImgBusinessId();
                }
                if (imageBusinessId != null && !CollectionUtils.isEmpty((Collection)(attachmentInfoDTOList = this.attachmentService.queryAttachmentFromCooperation(imageBusinessId, imageBusinessId, "iuap-apdoc-material")))) {
                    url = ((AttachmentInfoDTO)attachmentInfoDTOList.get(0)).getDownloadUrl();
                }
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        return url;
    }

    @Override
    public Object getSkusAlbum(List<Long> productIdList) {
        ArrayList attachmentUrlList = new ArrayList();
        productIdList.forEach(productId -> attachmentUrlList.add(this.getSkuAlbum((Long)productId)));
        return attachmentUrlList;
    }

    @Override
    public Object getAlbumByBusinessId(String businessId) {
        List attachmentInfoDTOList = this.attachmentService.queryAttachmentFromCooperation(businessId, businessId, "iuap-apdoc-material");
        if (!CollectionUtils.isEmpty((Collection)attachmentInfoDTOList)) {
            return ((AttachmentInfoDTO)attachmentInfoDTOList.get(0)).getDownloadUrl();
        }
        return null;
    }

    @Override
    public Object getAlbumByBusinessId(List<String> businessIdList) {
        ArrayList urlList = new ArrayList(businessIdList.size());
        Map<String, String> businessIdMap = businessIdList.stream().collect(Collectors.toMap(businessId -> businessId, businessId -> businessId, (existing, replacement) -> existing));
        List attachmentInfoDTOList = this.attachmentService.queryAttachmentListFromCooperation(businessIdList, businessIdMap, "iuap-apdoc-material");
        if (!CollectionUtils.isEmpty((Collection)attachmentInfoDTOList)) {
            Map<String, String> attachmentMap = attachmentInfoDTOList.stream().collect(Collectors.toMap(AttachmentInfoDTO::getBusinessId, AttachmentInfoDTO::getDownloadUrl, (existing, replacement) -> existing));
            businessIdList.forEach(businessId -> urlList.add((String)attachmentMap.get(businessId)));
        }
        return urlList;
    }

    private String getAlbumByIdAndType(Long productId, AttachmentBusinessTypeEnum businessType) {
        String url = "";
        CoreDocJsonResult<AttachmentInfoDTO> resultVO = this.getAttachUrl(productId, businessType);
        if (!CollectionUtils.isEmpty((Collection)resultVO.getData())) {
            url = ((AttachmentInfoDTO)resultVO.getData().get(0)).getDownloadUrl();
        }
        return url;
    }

    private String getCharactorStr(Long productId) {
        String result = "";
        List<Long> characterIds = this.productCharacterService.getFreeCharacterIdsByProduct(productId, CharacteristicsTypeEnum.IFreeCT.getValue());
        List<CharacterDTO> characterDTOList = this.iProductCharactorService.getCharacterDTOByIds(characterIds, true);
        if (!CollectionUtils.isEmpty(characterDTOList)) {
            List characterNames = characterDTOList.stream().map(CharacterDTO::getName).collect(Collectors.toList());
            result = characterNames.stream().collect(Collectors.joining(","));
        }
        return result;
    }
}

