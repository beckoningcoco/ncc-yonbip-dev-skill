/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.MCServiceUntils
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.mc.docunique.dto.DocUniqueRule
 *  com.yonyou.iuap.mc.docunique.dto.UniqueScopeOrgResult
 *  com.yonyou.ucf.mdd.ext.bpm.model.VerifyState
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.voucher.enums.Status
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  com.yonyoucloud.upc.pc.productapply.ProductApplyType
 *  com.yonyoucloud.upc.utils.BizObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.core.exception.EntityNotFoundException
 *  org.imeta.core.model.Constraint
 *  org.imeta.core.model.ConstraintTypeEnum
 *  org.imeta.core.model.Entity
 *  org.imeta.core.model.Enumeration
 *  org.imeta.core.model.EnumerationLiteral
 *  org.imeta.core.model.Property
 *  org.imeta.core.model.PropertyMap
 *  org.imeta.core.model.Type
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.base.Json
 *  org.imeta.orm.base.exception.PropertyNotExpandException
 *  org.imeta.orm.base.exception.PropertyNotFoundException
 *  org.imeta.orm.query.parser.MultiLanguageUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.productapply;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.MCServiceUntils;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.mc.docunique.dto.DocUniqueRule;
import com.yonyou.iuap.mc.docunique.dto.UniqueScopeOrgResult;
import com.yonyou.ucf.mdd.ext.bpm.model.VerifyState;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.voucher.enums.Status;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.pc.productapply.ProductApplyType;
import com.yonyoucloud.upc.utils.BizObjectUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.biz.base.Objectlizer;
import org.imeta.core.exception.EntityNotFoundException;
import org.imeta.core.model.Constraint;
import org.imeta.core.model.ConstraintTypeEnum;
import org.imeta.core.model.Entity;
import org.imeta.core.model.Enumeration;
import org.imeta.core.model.EnumerationLiteral;
import org.imeta.core.model.Property;
import org.imeta.core.model.PropertyMap;
import org.imeta.core.model.Type;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.base.Json;
import org.imeta.orm.base.exception.PropertyNotExpandException;
import org.imeta.orm.base.exception.PropertyNotFoundException;
import org.imeta.orm.query.parser.MultiLanguageUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductApplyCheckService {
    public static final int UNIQUE_CHECK_BATCH_NUM = 500;
    @Autowired
    MCServiceUntils mcServiceUntils;

    public void checkUnique(ProductApply productApply) throws Exception {
        Map productApplyDB;
        QuerySchema productApplySchema = QuerySchema.create().addSelect(new String[]{"id", "applyCode", "uniqueMD5"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"uniqueMD5").eq((Object)productApply.getUniqueMD5()), QueryCondition.name((String)"status").in(new Object[]{Status.newopen.getValue(), Status.confirming.getValue()})}));
        if (EntityStatus.Update.equals((Object)productApply.getEntityStatus())) {
            productApplySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").not_eq(productApply.getId())});
        }
        if (productApply.getApplyProductId() != null) {
            productApplySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"applyProductId").not_eq((Object)productApply.getApplyProductId())});
        }
        if ((productApplyDB = MetaDaoHelper.queryOne((String)"pc.productapply.ProductApply", (QuerySchema)productApplySchema)) != null) {
            if (StringUtils.isEmpty((CharSequence)productApply.getApplyCode())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800532, new Object[]{productApply.getProductCode(), productApplyDB.get("applyCode")});
            }
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800533, new Object[]{productApply.getApplyCode(), productApplyDB.get("applyCode")});
        }
    }

    public List<ProductApply> listProductApplyByVerifyState(ProductApply productApply, List<Short> verifyStates, int pageIndex, int pageSize) throws Exception {
        if (CollectionUtils.isEmpty(verifyStates)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800105);
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"verifystate").in(verifyStates), QueryCondition.name((String)"applyType").in(new Object[]{ProductApplyType.add.getValue(), ProductApplyType.modify.getValue()})});
        if (null != productApply && null != productApply.getId()) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").not_eq(productApply.getId()));
        }
        return MetaDaoHelper.queryObject((String)"pc.productapply.ProductApply", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id", "applyCode", "productData"}).addCondition((ConditionExpression)queryConditionGroup).addPager(pageIndex, pageSize), null);
    }

    public int getProductApplyCountByVerifyState(ProductApply productApply, List<Short> verifyStates) throws Exception {
        if (CollectionUtils.isEmpty(verifyStates)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800105);
        }
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("ytenant", AppContext.getYhtTenantId());
        param.put("verifyStates", verifyStates);
        if (productApply != null && productApply.getId() != null) {
            param.put("productApplyId", productApply.getId());
        }
        int countNum = (Integer)SqlHelper.selectOne((String)"com.yonyoucloud.upc.mapper.productapply.getProductApplyCountByVerifyState", param);
        return countNum;
    }

    public void uniqueCompareWithProductApply(Product product, List<ProductApply> productApplys, Entity entity) {
        if (product == null || CollectionUtils.isEmpty(productApplys) || entity == null) {
            return;
        }
        List uniqueConstraints = entity.getUniqueConstraints().stream().filter(constraint -> ConstraintTypeEnum.Unique.equals((Object)constraint.getConstraintType())).collect(Collectors.toList());
        List docUniqueRules = this.mcServiceUntils.getDocUniqueWithField("pc.product.Product");
        UniqueScopeOrgResult uniqueScopeOrg = this.mcServiceUntils.getUniqueScopeOrgIds("pc.product.Product", product.getOrgId());
        if (CollectionUtils.isEmpty(uniqueConstraints) && (CollectionUtils.isEmpty((Collection)docUniqueRules) || null == uniqueScopeOrg || !uniqueScopeOrg.isAll() && CollectionUtils.isEmpty((Collection)uniqueScopeOrg.getOrgIds()))) {
            return;
        }
        for (ProductApply apply : productApplys) {
            Collection orgIds;
            if (StringUtils.isBlank((CharSequence)apply.getProductData())) continue;
            Product productTarget = (Product)Objectlizer.decodeObj((Json)new Json(apply.getProductData()), (String)"pc.product.Product");
            if (!CollectionUtils.isEmpty(uniqueConstraints)) {
                for (Constraint constraint2 : uniqueConstraints) {
                    this.uniqueCheckWithBizObject((BizObject)product, (BizObject)productTarget, constraint2, entity);
                }
            }
            if (CollectionUtils.isEmpty((Collection)docUniqueRules) || null == uniqueScopeOrg || !uniqueScopeOrg.isAll() && (uniqueScopeOrg.isAll() || CollectionUtils.isEmpty((Collection)uniqueScopeOrg.getOrgIds())) || !uniqueScopeOrg.isAll() && !(orgIds = uniqueScopeOrg.getOrgIds()).contains(productTarget.getOrgId()) || product.getId() != null && product.getId().equals(productTarget.getId())) continue;
            for (DocUniqueRule docUniqueRule : docUniqueRules) {
                this.uniqueCheckWithBizObject((BizObject)product, (BizObject)productTarget, docUniqueRule);
            }
        }
    }

    public void uniqueCheckWithBizObject(BizObject source, BizObject target, Constraint constraint, Entity entity) {
        if (constraint == null || CollectionUtils.isEmpty((Collection)constraint.getUniqueAttributes())) {
            return;
        }
        List uniqueAttributes = constraint.getUniqueAttributes();
        Boolean compareResult = BizObjectUtils.compareBizObjectForFields((BizObject)source, (BizObject)target, (Collection)uniqueAttributes);
        if (!compareResult.booleanValue()) {
            this.processUniqueResult(source, constraint, entity, uniqueAttributes);
        }
    }

    public void uniqueCheckWithBizObject(BizObject source, BizObject target, DocUniqueRule docUniqueRule) {
        if (docUniqueRule == null || CollectionUtils.isEmpty((Collection)docUniqueRule.getDocUniqueFieldList())) {
            return;
        }
        Integer isNullFieldCtrl = docUniqueRule.getIsNullFieldCtrl();
        List uniqueAttributes = docUniqueRule.getDocUniqueFieldList();
        Boolean isDefferent = BizObjectUtils.compareBizObjectForFields((BizObject)source, (BizObject)target, (Collection)uniqueAttributes, (Integer)isNullFieldCtrl);
        if (!isDefferent.booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800534, new Object[]{docUniqueRule.getName(), target.get("code")});
        }
    }

    private void processUniqueResult(BizObject source, Constraint constraint, Entity entity, List<String> uniqueAttributes) {
        StringBuffer buffer = new StringBuffer();
        for (String attr : uniqueAttributes) {
            if (StringUtils.isEmpty((CharSequence)attr)) continue;
            String[] props = attr.split("\\.");
            Entity entityTmp = entity;
            Property property = null;
            Object value = source;
            for (int index = 0; index < props.length; ++index) {
                String prop = props[index];
                boolean isLast = index == props.length - 1;
                property = this.getPropertyFromEntity(entityTmp, prop);
                if (property == null) {
                    throw new PropertyNotFoundException(entityTmp.fullname(), prop, entityTmp.getYTenantId(), entityTmp.id());
                }
                if (!isLast && !property.isEntity()) {
                    throw new PropertyNotExpandException(entityTmp.fullname(), entityTmp.fullname(), prop);
                }
                if (property.isEntity()) {
                    try {
                        entityTmp = (Entity)property.type();
                    }
                    catch (EntityNotFoundException exception) {
                        exception.setUri(property.getTypeUri());
                        throw exception;
                    }
                }
                value = this.getValueFromMap((Map)value, prop, property);
                if (isLast || value instanceof Map) continue;
                value = null;
            }
            if (MultiLanguageUtils.isMultiLangAttr(property)) {
                value = this.getMultiValue(value);
            }
            value = this.getEnumValue(property, value);
            if (StringUtils.isEmpty((CharSequence)buffer)) {
                buffer.append(property.title()).append("[").append((Object)(value == null ? "" : value)).append("]");
                continue;
            }
            buffer.append(",").append(property.title()).append("[").append((Object)(value == null ? "" : value)).append("]");
        }
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800534, new Object[]{constraint.title(), buffer.toString()});
    }

    public void uniqueProductApply(Product product, ProductApply productApply) throws Exception {
        int pageIndex = 1;
        int pageSize = 500;
        int productApplyCountNum = this.getProductApplyCountByVerifyState(productApply, Arrays.asList(VerifyState.INIT_NEW_OPEN.getValue(), VerifyState.SUBMITED.getValue(), VerifyState.REJECTED_TO_MAKEBILL.getValue()));
        int pageCount = productApplyCountNum % pageSize == 0 ? productApplyCountNum / pageSize : productApplyCountNum / pageSize + 1;
        Entity entity = MetaDaoHelper.getEntity((String)"pc.product.Product");
        for (int i = 0; i < pageCount; ++i) {
            List<ProductApply> productApplyList = this.listProductApplyByVerifyState(productApply, Arrays.asList(VerifyState.INIT_NEW_OPEN.getValue(), VerifyState.SUBMITED.getValue(), VerifyState.REJECTED_TO_MAKEBILL.getValue()), pageIndex, pageSize);
            this.uniqueCompareWithProductApply(product, productApplyList, entity);
            ++pageIndex;
        }
    }

    public Object getMultiValue(Object value) {
        if (value instanceof Map) {
            Iterator iterator;
            Object v;
            Map map = (Map)value;
            String locale = InvocationInfoProxy.getLocale();
            if (locale == null || locale.length() == 0) {
                locale = "zh_CN";
            }
            if ((v = map.get(locale)) == null && (iterator = map.keySet().iterator()).hasNext()) {
                Object key = iterator.next();
                v = map.get(key);
            }
            value = v;
        }
        return value;
    }

    private Object getEnumValue(Property property, Object value) {
        try {
            Type dataType = property.type();
            if (dataType instanceof Enumeration) {
                Enumeration enumeration = (Enumeration)dataType;
                List enumItems = enumeration.items();
                String v = value.toString();
                if (enumItems != null && !enumItems.isEmpty()) {
                    for (EnumerationLiteral literal : enumItems) {
                        String literalValue = literal.value();
                        if (!v.equals(literalValue)) continue;
                        value = literal.name();
                    }
                }
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return value;
    }

    private Property getPropertyFromEntity(Entity entity, String prop) {
        PropertyMap propertyMap = entity.attrMap();
        return propertyMap == null ? null : propertyMap.get(prop);
    }

    private Object getValueFromMap(Map map, String key) {
        if (map == null) {
            return null;
        }
        return map.get(key);
    }

    private Object getValueFromMap(Map map, String key, Property property) {
        if (map == null) {
            return null;
        }
        if (property.getIsCharacter()) {
            String retAttrCode = property.refRetAttrCode();
            key = key + "_" + retAttrCode;
        }
        return map.get(key);
    }
}

