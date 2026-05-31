/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.dao.material.MaterialApplyRangeQryDao
 *  com.yonyou.iuap.apdoc.coredoc.dao.material.MaterialQryDao
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.QueryOperatorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.material.MaterialApplyRangePO
 *  com.yonyou.iuap.apdoc.coredoc.po.material.MaterialDetailPO
 *  com.yonyou.iuap.apdoc.coredoc.po.material.MaterialExtendCharacterDefPO
 *  com.yonyou.iuap.apdoc.coredoc.po.material.MaterialPO
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.CoreDocBaseEntity
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.QueryConditionPO
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialApplyRangeVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialDetailVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialVO
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.UnitUseTypeEnum
 *  org.apache.commons.collections4.MapUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 */
package com.yonyou.iuap.coredoc.service.material.impl;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.dao.material.MaterialApplyRangeQryDao;
import com.yonyou.iuap.apdoc.coredoc.dao.material.MaterialQryDao;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.QueryOperatorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.material.MaterialApplyRangePO;
import com.yonyou.iuap.apdoc.coredoc.po.material.MaterialDetailPO;
import com.yonyou.iuap.apdoc.coredoc.po.material.MaterialExtendCharacterDefPO;
import com.yonyou.iuap.apdoc.coredoc.po.material.MaterialPO;
import com.yonyou.iuap.apdoc.coredoc.po.pub.CoreDocBaseEntity;
import com.yonyou.iuap.apdoc.coredoc.po.pub.QueryConditionPO;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialApplyRangeVO;
import com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialDetailVO;
import com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialVO;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.coredoc.service.material.ProductAPIService;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.UnitUseTypeEnum;
import com.yonyoucloud.upc.service.api.ProductSaveServiceImpl;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

@Service
public class ProductAPIServiceImpl
implements ProductAPIService {
    @Autowired
    ProductSaveServiceImpl productSaveService;
    @Autowired
    MaterialQryDao materialQryDao;
    @Autowired
    MaterialApplyRangeQryDao materialApplyRangeQryDao;
    @Autowired
    private IOrgUnitQueryService orgUnitQueryService;
    private static final int MAX_DEPTH = 5;

    @Override
    public MaterialVO productSaveForApi(MaterialVO productVO, Integer convertType, String matchRule) throws Exception {
        this.checkMustInputForProductSave(productVO);
        Map productPropCharacterDefine = productVO.getProductPropCharacterDefine();
        if (MapUtils.isNotEmpty((Map)productPropCharacterDefine)) {
            productPropCharacterDefine.remove("id");
        }
        Product product = (Product)JSON.parseObject((String)JSON.toJSONString((Object)productVO), Product.class);
        this.matchProduct(matchRule, product);
        this.convertProductMultilangText(productVO, product);
        product.put("isCreator", (Object)true);
        this.productSaveService.getProductData(product, convertType);
        this.dealCreatorSubData(product);
        Object result = this.productSaveService.saveProduct(product, convertType);
        if (result != null) {
            Map resultMap = (Map)result;
            if (!ObjectUtils.isEmpty(resultMap.get("id"))) {
                productVO.setId(resultMap.get("id").toString());
            }
            return productVO;
        }
        return null;
    }

    @Override
    public MaterialVO productDetailSaveForApi(MaterialVO productVO, Integer convertType) throws Exception {
        this.checkMustInputForProductDetailSave(productVO);
        MaterialVO materialVOInDB = this.queryProductInfo(productVO);
        MaterialVO mergedResult = this.mergeData(materialVOInDB, productVO);
        Product product = (Product)JSON.parseObject((String)JSON.toJSONString((Object)mergedResult), Product.class);
        this.processProductExtendCharacterDef(product);
        this.matchProduct(null, product);
        this.convertProductMultilangText(mergedResult, product);
        product.setEntityStatus(EntityStatus.Update);
        product.put("isCreator", (Object)false);
        this.productSaveService.getProductData(product, convertType);
        this.dealCreatorSubData(product);
        this.dealProductApplyRangeOrg(product);
        Object result = this.productSaveService.saveProductDetail(product, convertType);
        if (result != null) {
            Map resultMap = (Map)result;
            if (!ObjectUtils.isEmpty(resultMap.get("id"))) {
                productVO.setId(resultMap.get("id").toString());
            }
            return productVO;
        }
        return null;
    }

    private void processProductExtendCharacterDef(Product product) {
        if (product.detail().get("productExtendCharacterDef") != null) {
            Map productExtendCharacterDefMap = (Map)product.detail().get("productExtendCharacterDef");
            if (productExtendCharacterDefMap.get("id") != null) {
                ((Map)product.detail().get("productExtendCharacterDef")).put("id", productExtendCharacterDefMap.get("id"));
                ((Map)product.detail().get("productExtendCharacterDef")).put("_status", EntityStatus.Update);
            } else {
                ((Map)product.detail().get("productExtendCharacterDef")).put("_status", EntityStatus.Insert);
                ((Map)product.detail().get("productExtendCharacterDef")).put("id", IdManager.getInstance().nextId());
            }
        }
    }

    private MaterialVO mergeData(MaterialVO materialVOFromDB, MaterialVO materialVOFromAPI) {
        Map materialFromDB = (Map)UpcJacksonUtils.OBJECT_MAPPER.convertValue((Object)materialVOFromDB, Map.class);
        Map materialFromAPI = (Map)UpcJacksonUtils.OBJECT_MAPPER.convertValue((Object)materialVOFromAPI, Map.class);
        Map materialDetailFromDB = (Map)materialFromDB.get("detail");
        Map materialDetailFromAPI = (Map)materialFromAPI.get("detail");
        materialFromAPI.putAll(materialFromDB);
        this.mergeMaps(materialDetailFromDB, materialDetailFromAPI, 0);
        materialFromAPI.put("detail", materialDetailFromDB);
        MaterialVO mergedResult = (MaterialVO)UpcJacksonUtils.OBJECT_MAPPER.convertValue((Object)materialFromAPI, MaterialVO.class);
        return mergedResult;
    }

    public void mergeMaps(Map<String, Object> source, Map<String, Object> target, int depth) {
        if (depth > 5) {
            return;
        }
        for (Map.Entry<String, Object> entry : target.entrySet()) {
            String key = entry.getKey();
            Object targetValue = entry.getValue();
            Object sourceValue = source.get(key);
            if (sourceValue instanceof Map && targetValue instanceof Map) {
                this.mergeMaps((Map)sourceValue, (Map)targetValue, depth + 1);
                continue;
            }
            source.put(key, targetValue);
        }
    }

    private MaterialVO queryProductInfo(MaterialVO productVO) throws Exception {
        List orgUnitDTOs;
        MaterialVO materialVOInDB = new MaterialVO();
        MaterialPO materialInfo = this.getMaterialInfo(productVO);
        List materialVOInDBs = UpcJacksonUtils.conver2List(Arrays.asList(materialInfo), MaterialVO.class);
        materialVOInDB = (MaterialVO)materialVOInDBs.get(0);
        String productApplyRangeOrgId = productVO.getProductApplyRange_OrgId();
        if (StringUtils.isNotEmpty((CharSequence)productVO.getProductApplyRange_OrgId___code()) && !ObjectUtils.isEmpty((Object)(orgUnitDTOs = this.orgUnitQueryService.listByCodes(InvocationInfoProxy.getTenantid(), Collections.singletonList(productVO.getProductApplyRange_OrgId___code()), null)))) {
            productApplyRangeOrgId = ((OrgUnitDTO)orgUnitDTOs.get(0)).getId();
        }
        MaterialApplyRangePO applyRangePO = this.materialApplyRangeQryDao.queryByIdInfo(materialInfo.getId(), productApplyRangeOrgId);
        MaterialDetailPO materialDetailInfo = this.getMaterialDetailInfo(applyRangePO.getProductDetailId());
        List materialDetailVOInDBs = UpcJacksonUtils.conver2List(Arrays.asList(materialDetailInfo), MaterialDetailVO.class);
        materialVOInDB.setDetail((MaterialDetailVO)materialDetailVOInDBs.get(0));
        if (materialDetailInfo.getProductExtendCharacterDef() != null) {
            MaterialExtendCharacterDefPO productDetailCharacterMap = materialDetailInfo.getProductExtendCharacterDef();
            if (!applyRangePO.getIsApplied().booleanValue()) {
                productDetailCharacterMap.remove("id");
            }
            materialVOInDB.getDetail().setProductExtendCharacterDef((Map)productDetailCharacterMap);
        }
        List materialApplyRangePOs = this.materialQryDao.queryProductOrgesByProductId(materialInfo.getId());
        ArrayList<MaterialApplyRangeVO> materialApplyRangeVOList = new ArrayList<MaterialApplyRangeVO>();
        for (MaterialApplyRangePO materialApplyRangePO : materialApplyRangePOs) {
            MaterialApplyRangeVO materialApplyRangeVO = new MaterialApplyRangeVO();
            materialApplyRangeVO.setOrgId(materialApplyRangePO.getOrgId());
            materialApplyRangeVOList.add(materialApplyRangeVO);
        }
        materialVOInDB.setProductOrgs(materialApplyRangeVOList);
        return materialVOInDB;
    }

    public MaterialDetailPO getMaterialDetailInfo(Long productDetailId) throws Exception {
        List allMetaField = new MaterialDetailPO().getAllMetaField();
        allMetaField.removeAll(Arrays.asList("pubts", "stoptime", "beUpTime", "createTime", "modifyTime", "createDate", "modifyDate", "uorderDownTime", "uorderUpTime", "mallDownTime", "mallUpTime"));
        ArrayList<QueryConditionPO> queryConditionPOList = new ArrayList<QueryConditionPO>();
        queryConditionPOList.add(new QueryConditionPO("id", QueryOperatorEnum.EQ, productDetailId));
        List materialDetailPOList = this.materialQryDao.queryEntityByCondition((CoreDocBaseEntity)new MaterialDetailPO(), allMetaField.toArray(new String[allMetaField.size()]), queryConditionPOList);
        if (ObjectUtils.isEmpty((Object)materialDetailPOList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801169);
        }
        return (MaterialDetailPO)materialDetailPOList.get(0);
    }

    private MaterialPO getMaterialInfo(MaterialVO productVO) throws Exception {
        List allMetaField = new MaterialPO().getAllMetaField();
        allMetaField.removeAll(Arrays.asList("pubts", "createDate", "modifyDate", "createTime", "modifyTime", "source"));
        ArrayList<QueryConditionPO> queryConditionPOList = new ArrayList<QueryConditionPO>();
        if (StringUtils.isNotEmpty((CharSequence)productVO.getCode())) {
            queryConditionPOList.add(new QueryConditionPO("code", QueryOperatorEnum.EQ, productVO.getCode()));
        } else {
            queryConditionPOList.add(new QueryConditionPO("id", QueryOperatorEnum.EQ, productVO.getId()));
        }
        List materialPOList = this.materialQryDao.queryEntityByCondition((CoreDocBaseEntity)new MaterialPO(), allMetaField.toArray(new String[allMetaField.size()]), queryConditionPOList);
        if (ObjectUtils.isEmpty((Object)materialPOList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801072, new Object[]{productVO.getCode()});
        }
        return (MaterialPO)materialPOList.get(0);
    }

    private void dealCreatorSubData(Product product) throws Exception {
        List assistUnitExchanges;
        List productBarCodes;
        List productAssistClasses = product.productAssistClasses();
        if (!CollectionUtils.isEmpty((Collection)productAssistClasses)) {
            productAssistClasses.forEach(productAssistClass -> productAssistClass.setEntityStatus(EntityStatus.Insert));
        }
        if (!CollectionUtils.isEmpty((Collection)(productBarCodes = product.productBarCodes()))) {
            productBarCodes.forEach(productBarCode -> productBarCode.setEntityStatus(EntityStatus.Insert));
        }
        if (!CollectionUtils.isEmpty((Collection)(assistUnitExchanges = product.productAssistUnitExchanges()))) {
            assistUnitExchanges.forEach(unitExchange -> {
                if (null != unitExchange.get("assistUnitCount")) {
                    BigDecimal assistUnitCount = new BigDecimal(unitExchange.get("assistUnitCount").toString());
                    unitExchange.setAssistUnitCount(assistUnitCount);
                }
                if (null != unitExchange.get("mainUnitCount")) {
                    BigDecimal mainUnitCount = new BigDecimal(unitExchange.get("mainUnitCount").toString());
                    unitExchange.setMainUnitCount(mainUnitCount);
                }
            });
        }
        if (null != product.getId() && BooleanUtil.isTrue((Object)product.get("isCreator")) && null != product.detail() && null != product.detail().get("productExtendCharacterDef") && product.detail().get("productExtendCharacterDef") instanceof Map) {
            this.dealCreatorDetailCharacterDefine(product.getId(), (Map)product.detail().get("productExtendCharacterDef"));
        }
        Object productPropCharacterDefine = product.getProductPropCharacterDefine();
        if (null != product.getProductPropCharacterDefine() && productPropCharacterDefine instanceof Map) {
            ((Map)productPropCharacterDefine).remove("id");
        }
    }

    private void dealProductApplyRangeOrg(Product product) throws Exception {
        product.set("productApplyRange_OrgId_code", product.get("productApplyRange_OrgId___code"));
    }

    private void dealCreatorDetailCharacterDefine(Object productId, Map<String, Object> productExtendCharacterDef) throws Exception {
        if (MapUtils.isNotEmpty(productExtendCharacterDef)) {
            QuerySchema querySchema = QuerySchema.create().addSelect("id, productExtendCharacterDef").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productId), QueryCondition.name((String)"isCreator").eq((Object)true)}));
            List productDetails = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)querySchema);
            if (!CollectionUtils.isEmpty((Collection)productDetails)) {
                Object extendCharacterDefInDb = ((Map)productDetails.get(0)).get("productExtendCharacterDef");
                if (null != extendCharacterDefInDb && extendCharacterDefInDb instanceof Map) {
                    productExtendCharacterDef.put("id", ((Map)extendCharacterDefInDb).get("id"));
                    productExtendCharacterDef.put("_status", EntityStatus.Update);
                }
            } else {
                productExtendCharacterDef.put("_status", EntityStatus.Insert);
            }
        }
    }

    private void convertProductMultilangText(MaterialVO productVO, Product product) {
        if (productVO.getName() != null && productVO.getName() instanceof MultiLangText) {
            product.put("name", (Object)productVO.getName().toMap());
        }
        if (productVO.getModel() != null && productVO.getModel() instanceof MultiLangText) {
            product.put("model", (Object)productVO.getModel().toMap());
        }
        if (productVO.getModelDescription() != null && productVO.getModelDescription() instanceof MultiLangText) {
            product.put("modelDescription", (Object)productVO.getModelDescription().toMap());
        }
        if (productVO.getKeywords() != null && productVO.getKeywords() instanceof MultiLangText) {
            product.put("keywords", (Object)productVO.getKeywords().toMap());
        }
        if (productVO.getShareDescription() != null && productVO.getShareDescription() instanceof MultiLangText) {
            product.put("shareDescription", (Object)productVO.getShareDescription().toMap());
        }
        MaterialDetailVO detail = productVO.getDetail();
        ProductExtend extend = product.detail();
        if (detail != null && extend != null) {
            if (detail.getReceiptModel() != null && detail.getReceiptModel() instanceof MultiLangText) {
                extend.put("receiptModel", (Object)detail.getReceiptModel().toMap());
            }
            if (detail.getReceiptName() != null && detail.getReceiptName() instanceof MultiLangText) {
                extend.put("receiptName", (Object)detail.getReceiptName().toMap());
            }
            if (detail.getReceiptSpec() != null && detail.getReceiptSpec() instanceof MultiLangText) {
                extend.put("receiptSpec", (Object)detail.getReceiptSpec().toMap());
            }
            if (detail.getDisplayName() != null && detail.getDisplayName() instanceof MultiLangText) {
                extend.put("displayName", (Object)detail.getDisplayName().toMap());
            }
            if (detail.getMetaDescription() != null && detail.getMetaDescription() instanceof MultiLangText) {
                extend.put("metaDescription", (Object)detail.getMetaDescription().toMap());
            }
            if (detail.getRemark() != null && detail.getRemark() instanceof MultiLangText) {
                extend.put("remark", (Object)detail.getRemark().toMap());
            }
            if (null != detail.getTitleMemo() && detail.getTitleMemo() instanceof MultiLangText) {
                extend.put("titleMemo", (Object)detail.getTitleMemo().toMap());
            }
        }
    }

    private void matchProduct(String matchRule, Product product) throws Exception {
        if (!"id".equals(matchRule)) {
            this.dealProductEntityStatus(product, "code", product.getCode());
        } else if (!StringUtils.isEmpty((CharSequence)((CharSequence)product.getId()))) {
            this.dealProductEntityStatus(product, "id", product.getId().toString());
        } else {
            product.setEntityStatus(EntityStatus.Insert);
        }
    }

    private void dealProductEntityStatus(Product product, String conditionField, String conditionValue) throws Exception {
        String[] selectFields = new String[]{"id"};
        ArrayList<QueryConditionPO> queryConditionPOList = new ArrayList<QueryConditionPO>();
        queryConditionPOList.add(new QueryConditionPO(conditionField, QueryOperatorEnum.EQ, conditionValue));
        List materialPOS = this.materialQryDao.queryEntityByCondition((CoreDocBaseEntity)new MaterialPO(), selectFields, queryConditionPOList);
        if (!CollectionUtils.isEmpty((Collection)materialPOS)) {
            product.setId((Object)((MaterialPO)materialPOS.get(0)).getId());
            product.setEntityStatus(EntityStatus.Update);
        } else {
            product.setEntityStatus(EntityStatus.Insert);
        }
    }

    public void checkMustInputForProductSave(MaterialVO materialVO) {
        if (materialVO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800585);
        }
        if (ObjectUtils.isEmpty((Object)materialVO.getCode())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801242);
        }
        if (materialVO.getManageClass() == null && ObjectUtils.isEmpty((Object)materialVO.getManageClass___code())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801243);
        }
        if (ObjectUtils.isEmpty((Object)materialVO.getOrgId()) && ObjectUtils.isEmpty((Object)materialVO.getOrgId___code())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801241);
        }
        if (materialVO.getRealProductAttribute() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801240);
        }
        if (materialVO.getUnitUseType() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800565);
        }
        if (UnitUseTypeEnum.USE_PRODUCT.getValue() == materialVO.getUnitUseType().intValue() && materialVO.getUnit() == null && ObjectUtils.isEmpty((Object)materialVO.getUnit___code())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801245);
        }
    }

    public void checkMustInputForProductDetailSave(MaterialVO materialVO) {
        if (materialVO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800585);
        }
        if (materialVO.getDetail() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800586);
        }
        if (ObjectUtils.isEmpty((Object)materialVO.getCode())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801242);
        }
        if (ObjectUtils.isEmpty((Object)materialVO.getProductApplyRange_OrgId()) && ObjectUtils.isEmpty((Object)materialVO.getProductApplyRange_OrgId___code())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_RANGE_ORG_ID_AND_CODE_NOT_NULL);
        }
    }
}

