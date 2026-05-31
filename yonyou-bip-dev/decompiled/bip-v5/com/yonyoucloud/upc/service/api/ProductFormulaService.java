/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.filter.util.StringUtil
 *  com.yonyoucloud.upc.utils.ToolUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.filter.util.StringUtil;
import com.yonyoucloud.upc.service.api.FormulaScopeDTO;
import com.yonyoucloud.upc.service.api.ProductFormulaPubService;
import com.yonyoucloud.upc.utils.ToolUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductFormulaService
extends ProductFormulaPubService {
    private static final Logger log = LoggerFactory.getLogger(ProductFormulaService.class);
    @Autowired
    private PubOptionService pubOptionService;

    public Object getProductValue(String field, List<Long> productIdList, List<String> orgIdList) {
        Object retValue;
        block12: {
            retValue = "";
            productIdList = ToolUtils.removeNullAndEmpty(productIdList);
            orgIdList = ToolUtils.removeNullAndEmpty(orgIdList);
            if (StringUtil.isEmpty((String)field) || CollectionUtils.isEmpty((Collection)productIdList) || CollectionUtils.isEmpty((Collection)orgIdList) || productIdList.size() != orgIdList.size()) {
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
                                retValue = this.matchValue(productIdList, this.getProductFreeField(productIdList, field));
                            } else if (field.startsWith(PREFFIX_CHARACTER)) {
                                field = field.substring(PREFFIX_CHARACTER.length());
                                retValue = this.matchValue(productIdList, this.getProductCharacterField(productIdList, field));
                            } else {
                                retValue = this.matchValue(productIdList, this.getGlobalField(productIdList, field));
                            }
                            break block12;
                        }
                        if (SUB_ATTR.intValue() == scope.intValue()) break block12;
                        if (FIELD_DEFFINE.intValue() == scope.intValue()) {
                            retValue = this.matchValue(productIdList, this.getDefineField(productIdList, field));
                            break block12;
                        }
                        HashMap<String, List<Long>> orgMap = this.groupDocByOrgIds(productIdList, orgIdList);
                        String finalField = field;
                        HashMap<String, Object> orgValueMap = new HashMap<String, Object>();
                        orgMap.forEach((orgId, productIds) -> {
                            Map<String, Object> valueMap = this.getOrgValues(scope, (List<Long>)productIds, (String)orgId, finalField);
                            if (valueMap != null && valueMap.size() > 0) {
                                orgValueMap.putAll(valueMap);
                            }
                        });
                        retValue = this.matchStrValue(this.createMatchKey(productIdList, orgIdList), orgValueMap);
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

    private Map<String, Object> getOrgValues(int scope, List<Long> productIds, String orgId, String field) {
        HashMap<String, Object> retValue = null;
        try {
            HashMap<Long, Object> productDetailMap = this.getProductDetail(productIds, orgId);
            if (productDetailMap != null && productDetailMap.size() > 0) {
                ArrayList<Long> detailIdList = new ArrayList<Long>(productDetailMap.size());
                productDetailMap.forEach((productId, productDetailId) -> {
                    if (!detailIdList.contains(productDetailId)) {
                        detailIdList.add(Long.valueOf(productDetailId.toString()));
                    }
                });
                if (detailIdList != null && detailIdList.size() > 0) {
                    if (FIELD_ORG == scope) {
                        retValue = this.detailMapConvert2ProductMap(productDetailMap, orgId, this.getOrgField(detailIdList, field));
                    } else if (FIELD_ASISTANT_UNIT == scope) {
                        retValue = this.getAsisUnitRate(productDetailMap, orgId, field);
                    }
                } else {
                    log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080403", (String)"\u5f53\u524d\u5546\u54c1\u672a\u5206\u914d\u7ed9\u5bf9\u5e94\u7ec4\u7ec7"));
                }
            }
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080402", (String)"\u516c\u5f0f\u6267\u884c\u9519\u8bef"), (Throwable)e);
        }
        return retValue;
    }

    public HashMap<Long, Object> getProductDetail(List<Long> productIds, String orgId) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id,productId,productDetailId");
        boolean orgGlobalShareFlag = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        if (orgGlobalShareFlag) {
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds), QueryCondition.name((String)"isCreator").eq((Object)true)}));
        } else {
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds), QueryCondition.name((String)"orgId").eq((Object)orgId)}));
        }
        HashMap<Long, Object> productDetailMap = this.getProductProps(schema, "pc.product.ProductApplyRange", "productDetailId");
        return productDetailMap;
    }

    private HashMap<String, Object> detailMapConvert2ProductMap(HashMap<Long, Object> productDetailMap, String orgId, Map<Long, Object> retValueMap) {
        if (null != retValueMap && null != productDetailMap) {
            HashMap<String, Object> reteValue = new HashMap<String, Object>(productDetailMap.size());
            productDetailMap.forEach((productId, productDetailId) -> reteValue.put(this.getKey((Long)productId, orgId), retValueMap.get(Long.valueOf(productDetailId.toString()))));
            return reteValue;
        }
        return null;
    }

    private HashMap<Long, Object> getProductCharacterField(List<Long> productIds, String characterCode) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id as productId,productCharacterDef." + characterCode + " as " + characterCode).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIds)}));
        return this.getProductProps(schema, "pc.product.Product", characterCode);
    }

    private HashMap<Long, Object> getProductFreeField(List<Long> productIds, String field) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id as productId,freeDefine." + field).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIds)}));
        return this.getProductProps(schema, "pc.product.Product", field);
    }

    protected HashMap<Long, Object> getOrgField(List<Long> productDetailIdList, String field) throws Exception {
        switch (field) {
            case "productTag": {
                return this.getProductTagField(productDetailIdList, field);
            }
        }
        return this.getOrgDetailField(productDetailIdList, field);
    }

    private HashMap<Long, Object> getOrgDetailField(List<Long> productDetailIdList, String field) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id as productId," + field).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productDetailIdList)}));
        return this.getProductProps(schema, "pc.product.ProductDetail", field);
    }

    protected HashMap<Long, Object> getProductTagField(List<Long> productDetailIdList, String field) throws Exception {
        HashMap tagNameMap = null;
        QuerySchema productTagSchema = QuerySchema.create().addSelect(new QueryField[]{new QueryField("tagId", "tagId"), new QueryField("productDetailId", "productDetailId")}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productDetailId").in(productDetailIdList)}));
        List productTagMapList = MetaDaoHelper.query((String)"pc.product.ProductTagNew", (QuerySchema)productTagSchema);
        if (!CollectionUtils.isEmpty((Collection)productTagMapList)) {
            QuerySchema tagSchema;
            List tagMapList;
            List tagIdList = productTagMapList.stream().map(map -> Long.valueOf(map.get("tagId").toString())).filter(Objects::nonNull).collect(Collectors.toList());
            Map productDetailTagMapList = productTagMapList.stream().collect(Collectors.groupingBy(map -> Long.valueOf(map.get("productDetailId").toString()), Collectors.mapping(map -> Long.valueOf(map.get("tagId").toString()), Collectors.toList())));
            if (!CollectionUtils.isEmpty(tagIdList) && !CollectionUtils.isEmpty((Collection)(tagMapList = MetaDaoHelper.query((String)"pc.tag.Tag", (QuerySchema)(tagSchema = QuerySchema.create().addSelect(new QueryField[]{new QueryField("name", "name"), new QueryField("id", "id")}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(tagIdList)}))))))) {
                Map<Long, String> tagMap = tagMapList.stream().collect(Collectors.toMap(map -> Long.valueOf(map.get("id").toString()), map -> map.get("name").toString()));
                HashMap finalTagNameMap = tagNameMap = new HashMap();
                productDetailTagMapList.forEach((productDetailId, productTagIdList) -> {
                    StringBuilder tagNameStr = new StringBuilder();
                    productTagIdList.forEach(productTagId -> {
                        String tagName = (String)tagMap.get(productTagId);
                        tagNameStr.append(tagName).append(";");
                    });
                    finalTagNameMap.put(productDetailId, tagNameStr.length() > 0 ? tagNameStr.substring(0, tagNameStr.length() - 1) : "");
                });
            }
        }
        return tagNameMap;
    }

    private HashMap<String, Object> getAsisUnitRate(HashMap<Long, Object> productDetailIdMap, String orgId, String field) throws Exception {
        ArrayList<Long> detailIdList = new ArrayList<Long>(productDetailIdMap.size());
        ArrayList productIdList = new ArrayList(productDetailIdMap.size());
        productDetailIdMap.forEach((productId, productDetailId) -> {
            productIdList.add(productId);
            if (!detailIdList.contains(productDetailId)) {
                detailIdList.add(Long.valueOf(productDetailId.toString()));
            }
        });
        HashMap<Long, Object> detailUnitValue = this.getOrgField(detailIdList, (String)fieldMap.get(field));
        if (detailUnitValue != null && detailUnitValue.size() > 0) {
            QuerySchema schema = QuerySchema.create().addSelect("productId,assistUnit,mainUnitCount").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIdList)}));
            HashMap<String, Object> rateValueMap = this.getProductAsisProps(schema, "pc.product.ProductAssistUnitExchange", "mainUnitCount");
            HashMap<String, Object> retValue = new HashMap<String, Object>(productDetailIdMap.size());
            productDetailIdMap.forEach((productId, detailId) -> {
                Object asisUnitId = detailUnitValue.get(detailId);
                if (asisUnitId != null) {
                    String key = productId + "|" + asisUnitId;
                    Object value = rateValueMap.get(key);
                    if (value == null) {
                        value = 1;
                    }
                    retValue.put(this.getKey((Long)productId, orgId), value);
                }
            });
            return retValue;
        }
        return null;
    }

    private HashMap<Long, Object> getGlobalField(List<Long> productIdList, String field) throws Exception {
        HashMap<Long, Object> resultInfoMap = null;
        if (HOME_PAGE_FIELD.equals(field)) {
            resultInfoMap = this.fillAttachmentUrl(productIdList);
        } else {
            QuerySchema schema = QuerySchema.create().addSelect("id as productId," + field).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIdList)}));
            resultInfoMap = this.getProductProps(schema, "pc.product.Product", field);
        }
        return resultInfoMap;
    }

    private HashMap<Long, Object> getDefineField(List<Long> productIdList, String field) throws Exception {
        Object filedObj;
        QuerySchema schema = QuerySchema.create().addSelect("defineId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"showItem").eq((Object)field), QueryCondition.name((String)"classId").eq((Object)"productArchive")}));
        Map productDefineMap = MetaDaoHelper.queryOne((String)"pc.userdef.UserDefineClass", (QuerySchema)schema);
        if (null != productDefineMap && null != (filedObj = productDefineMap.get("defineId"))) {
            String filed = filedObj.toString();
            int defineIndex = Integer.valueOf(filed.substring(DEFINE_LENGTH));
            String readlField = DEFINE_NAME + (defineIndex - 90);
            schema = QuerySchema.create().addSelect("productId," + readlField).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIdList)}));
            return this.getProductProps(schema, "pc.product.ProductDefine", readlField);
        }
        return null;
    }

    private HashMap<Long, Object> getProductProps(QuerySchema schema, String entityName, String field) throws Exception {
        HashMap<Long, Object> hashMap = new HashMap<Long, Object>();
        List queryFieldList = schema.selectFields();
        for (QueryField queryField : queryFieldList) {
            if (queryField.name() == null || queryField.name().indexOf(".") == -1) continue;
            String[] aliasArr = queryField.name().split("\\.");
            String alias = aliasArr[aliasArr.length - 1];
            queryField.alias(alias);
            field = alias;
        }
        List productMapList = MetaDaoHelper.query((String)entityName, (QuerySchema)schema);
        if (productMapList != null && productMapList.size() > 0) {
            for (Map productMap : productMapList) {
                hashMap.put((Long)productMap.get("productId"), productMap.get(field));
            }
        }
        return hashMap;
    }

    private HashMap<String, Object> getProductAsisProps(QuerySchema schema, String entityName, String field) throws Exception {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        List productMapList = MetaDaoHelper.query((String)entityName, (QuerySchema)schema);
        if (productMapList != null && productMapList.size() > 0) {
            productMapList.forEach(productMap -> {
                String key = productMap.get("productId") + "|" + productMap.get("assistUnit");
                hashMap.put(key, productMap.get(field));
            });
        }
        return hashMap;
    }
}

