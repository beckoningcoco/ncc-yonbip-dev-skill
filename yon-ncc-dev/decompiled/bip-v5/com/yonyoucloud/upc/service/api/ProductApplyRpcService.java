/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.filter.util.StringUtil
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.core.model.Entity
 *  org.imeta.core.model.Property
 *  org.imeta.orm.base.Json
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

import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.filter.util.StringUtil;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.service.IProductApplyRpcService;
import com.yonyoucloud.upc.service.api.FormulaPubFuntion;
import com.yonyoucloud.upc.service.productapply.ProductApplyCheckService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.biz.base.Objectlizer;
import org.imeta.core.model.Entity;
import org.imeta.core.model.Property;
import org.imeta.orm.base.Json;
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
public class ProductApplyRpcService
extends FormulaPubFuntion
implements IProductApplyRpcService {
    private static final Logger log = LoggerFactory.getLogger(ProductApplyRpcService.class);
    private static final String PREFIX_PRODUCT_DETAIL = "applyProductId.productDetail.";
    private static final String PREFIX_PRODUCT = "applyProductId.";
    @Autowired
    private ProductApplyCheckService productApplyCheckService;

    @Override
    public Object getProductApplyValue(String field, Long productApplyId) {
        return this.getProductDataFromApply(field, productApplyId, false);
    }

    @Override
    public Object getOriginalProductDataFromApply(String field, Long productApplyId) {
        if (StringUtils.isNotEmpty((CharSequence)field)) {
            return this.getProductDataFromApply(field, productApplyId, true);
        }
        return null;
    }

    private Object getProductDataFromApply(String field, Long productApplyId, boolean isOrigin) {
        Object value = null;
        if (StringUtil.isEmpty((String)field) || productApplyId == null) {
            log.error("\u67e5\u8be2\u53c2\u6570\u4e0d\u80fd\u4e3a\u7a7a");
        }
        boolean isProductField = field.startsWith(PREFIX_PRODUCT);
        field = this.dealFieldPrefix(field);
        try {
            value = this.queryProductApplyValue(field, productApplyId, isProductField, isOrigin);
        }
        catch (Exception e) {
            log.error("\u516c\u5f0f\u6267\u884c\u9519\u8bef\uff1a" + e.getMessage());
        }
        return value;
    }

    @Override
    public Object getProductApplyValues(String field, List<Long> productApplyIdList) {
        return this.getProductApplyValues(field, productApplyIdList, false);
    }

    @Override
    public Object getOriginalProductDataFromApplys(String field, List<Long> productApplyIdList) {
        return this.getProductApplyValues(field, productApplyIdList, true);
    }

    private Object getProductApplyValues(String field, List<Long> productApplyIdList, boolean isOrigin) {
        Object valueList = null;
        if (StringUtil.isEmpty((String)field) || CollectionUtils.isEmpty(productApplyIdList)) {
            log.error("\u67e5\u8be2\u53c2\u6570\u4e0d\u80fd\u4e3a\u7a7a");
        }
        boolean isProductField = field.startsWith(PREFIX_PRODUCT);
        field = this.dealFieldPrefix(field);
        try {
            valueList = this.batchQueryProductApplyValue(field, productApplyIdList, isProductField, isOrigin);
        }
        catch (Exception e) {
            log.error("\u516c\u5f0f\u6267\u884c\u9519\u8bef\uff1a" + e.getMessage());
        }
        return valueList;
    }

    private String dealFieldPrefix(String field) {
        if (field.startsWith(PREFIX_PRODUCT_DETAIL)) {
            field = "detail." + field.substring(PREFIX_PRODUCT_DETAIL.length());
        } else if (field.startsWith(PREFIX_PRODUCT)) {
            field = field.substring(PREFIX_PRODUCT.length());
        }
        return field;
    }

    private Object queryProductApplyValue(String field, Long productApplyId, boolean isProductField, boolean isOrigin) throws Exception {
        String productField = isOrigin ? "originProductData" : "productData";
        String selectFieldsStr = isProductField ? "id," + productField : "id," + field;
        QuerySchema querySchema = QuerySchema.create().addSelect(selectFieldsStr).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productApplyId)}));
        List productApplyDataList = MetaDaoHelper.queryObject((String)"pc.productapply.ProductApply", (QuerySchema)querySchema, null);
        Object value = null;
        if (!CollectionUtils.isEmpty((Collection)productApplyDataList)) {
            String productOrgData;
            String string = productOrgData = ((ProductApply)productApplyDataList.get(0)).get(productField) == null ? "" : ((ProductApply)productApplyDataList.get(0)).get(productField).toString();
            if (isProductField && StringUtils.isNotEmpty((CharSequence)productOrgData)) {
                Product productData = (Product)Objectlizer.decodeObj((Json)new Json(productOrgData), (String)"pc.product.Product");
                value = this.getFieldValue(field, (Map<String, Object>)productData);
            } else {
                value = this.getFieldValue(field, (Map)productApplyDataList.get(0));
            }
        }
        return value;
    }

    private Object batchQueryProductApplyValue(String field, List<Long> productApplyIdList, boolean isProductField, boolean isOrigin) throws Exception {
        String productField = isOrigin ? "productApplyOrgDetails" : "productData";
        String queryField = isProductField ? "id," + productField : "id," + field;
        QuerySchema querySchema = QuerySchema.create().addSelect(queryField).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productApplyIdList)}));
        List productApplyDataList = MetaDaoHelper.queryObject((String)"pc.productapply.ProductApply", (QuerySchema)querySchema, null);
        HashMap<Object, Object> valueMap = new HashMap<Object, Object>();
        if (!CollectionUtils.isEmpty((Collection)productApplyDataList)) {
            for (ProductApply productApplyData : productApplyDataList) {
                if (isProductField) {
                    Product productData = (Product)Objectlizer.decodeObj((Json)new Json(productApplyData.get(productField).toString()), (String)"pc.product.Product");
                    valueMap.put(productApplyData.get("id"), this.getFieldValue(field, (Map<String, Object>)productData));
                    continue;
                }
                valueMap.put(productApplyData.get("id"), this.getFieldValue(field, (Map<String, Object>)productApplyData));
            }
        }
        ArrayList valueList = new ArrayList(productApplyIdList.size());
        for (Long productApplyId : productApplyIdList) {
            valueList.add(valueMap.get(productApplyId));
        }
        return valueList;
    }

    private Object getFieldValue(String field, Map<String, Object> valueDataMap) throws Exception {
        if (valueDataMap == null || valueDataMap.isEmpty()) {
            return null;
        }
        Object retValue = null;
        if (field.indexOf(".") != -1) {
            String[] fields = field.split("\\.");
            int index = 0;
            String entityName = "pc.product.Product";
            HashMap<String, Object> fieldValueMap = new HashMap<String, Object>();
            fieldValueMap.put(fields[0], valueDataMap.get(fields[0]));
            for (int i = 0; i < fields.length; ++i) {
                if (i == fields.length - 1) {
                    index = i;
                    break;
                }
                Entity entity = MetaDaoHelper.getEntity((String)entityName);
                Property property = entity.attrMap().get(fields[i]);
                entityName = property.getTypeUri();
                if (!(BooleanUtil.isTrue((Object)property.isCompositionAttribute()) && "1".equals(property.association().roleAMulti()) || property.isElastic())) {
                    index = i;
                    break;
                }
                Map dataMap = (Map)fieldValueMap.get(fields[i]);
                fieldValueMap.put(fields[i + 1], dataMap.get(fields[i + 1]));
            }
            if (index == fields.length - 1) {
                retValue = fieldValueMap.get(fields[index]);
            } else {
                StringBuilder fieldStr = new StringBuilder();
                for (int i = index + 1; i < fields.length; ++i) {
                    if (fieldStr.length() > 0) {
                        fieldStr.append(".");
                    }
                    fieldStr.append(fields[i]);
                }
                String fieldAlias = fields[fields.length - 1];
                QuerySchema querySchema = QuerySchema.create().addSelect(fieldStr + " as " + fieldAlias).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(new Object[]{fieldValueMap.get(fields[index])})}));
                List queryResults = MetaDaoHelper.query((String)entityName, (QuerySchema)querySchema);
                if (!CollectionUtils.isEmpty((Collection)queryResults)) {
                    retValue = ((Map)queryResults.get(0)).get(fields[fields.length - 1]);
                }
            }
        } else {
            retValue = valueDataMap.get(field);
        }
        return this.productApplyCheckService.getMultiValue(retValue);
    }
}

