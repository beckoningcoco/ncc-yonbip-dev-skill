/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;

@Component(value="productSetDetailQueryForNewModelRule")
public class ProductSetDetailQueryForNewModelRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        if (paramMap.get("return") == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SHOP_NOT_FOUND);
        }
        Map mapReturn = (Map)paramMap.get("return");
        List productApplyRangeMapList = new ArrayList();
        if (billContext.getContext().get("productApplyRangeId") != null) {
            productApplyRangeMapList = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"id,productDetailId,productDepositTimeDetailId", billContext.getContext().get("productApplyRangeId"));
        } else {
            QueryConditionGroup rangeCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(billContext.getContext().get("productId")), QueryCondition.name((String)"isCreator").eq((Object)true)});
            QuerySchema rangeConditionSchema = QuerySchema.create().addSelect("id,productDetailId,productDepositTimeDetailId").addCondition((ConditionExpression)rangeCondition);
            productApplyRangeMapList = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)rangeConditionSchema);
        }
        if (productApplyRangeMapList == null || productApplyRangeMapList.size() == 0) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CREATOR_DATA_IS_NULL, new Object[]{billContext.getContext().get("productId")});
        }
        Map productApplyRangeMap = (Map)productApplyRangeMapList.get(0);
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(billContext.getContext().get("productId")), QueryCondition.name((String)"productDetailId").eq(productApplyRangeMap.get("productDetailId"))});
        QuerySchema productParameterSchema = QuerySchema.create().addSelect("id, productId, productApplyRangeId, param, param.parent.name as param_GroupName, param.name as param_Name, paramValue, pubts").addCondition((ConditionExpression)condition);
        List productParametersMapList = MetaDaoHelper.query((String)"pc.product.ProductParameters", (QuerySchema)productParameterSchema);
        mapReturn.put("productParams", productParametersMapList);
        QuerySchema productSpecFreesSchema = QuerySchema.create().addSelect("id,productId,productApplyRangeId,freeType,freeId,freeId.showItem as freeId_Name,checked,freeId.defineId as freeId_DefineId").addCondition((ConditionExpression)condition);
        List productCheckFreeNewMapList = MetaDaoHelper.query((String)"pc.product.ProductCheckFreeNew", (QuerySchema)productSpecFreesSchema);
        mapReturn.put("productSpecFrees", productCheckFreeNewMapList);
        QuerySchema productTagNewSchema = QuerySchema.create().addSelect("id, productId, productApplyRangeId, tagId, tagId.name as tagId_name").addCondition((ConditionExpression)condition);
        List productTagNewMapList = MetaDaoHelper.query((String)"pc.product.ProductTagNew", (QuerySchema)productTagNewSchema);
        mapReturn.put("productTags", productTagNewMapList);
        QuerySchema productSkuOrderPropertySchema = QuerySchema.create().addSelect("id, productId, skuId, productApplyRangeId, skuPropertyTypeId, skuPropertyTypeId.propertyType.showItem as skuPropertyTypeId_showItem, skuPropertyTypeId.alias, skuPropertyTypeId.propertyType.type as skuPropertyTypeId_type, skuPropertyTypeId.propertyType.userdefMode as skuPropertyTypeId_userdefMode, promptMessage, isShow, isRequired, iLimitNum, iOrder").addCondition((ConditionExpression)condition);
        List productSkuOrderPropertyMapList = MetaDaoHelper.query((String)"pc.product.ProductSkuOrderProperty", (QuerySchema)productSkuOrderPropertySchema);
        ArrayList defaultSKUOrderPropertiesMapList = new ArrayList();
        ArrayList<String> falseSkuIdList = new ArrayList<String>();
        defaultSKUOrderPropertiesMapList.addAll(productSkuOrderPropertyMapList);
        if (mapReturn.containsKey("productskus") && mapReturn.get("productskus") != null) {
            for (Map sku : (List)mapReturn.get("productskus")) {
                sku.put("skuOrderProperties", productSkuOrderPropertyMapList.stream().filter(prop -> prop.get("skuId").equals(sku.get("id"))).collect(Collectors.toList()));
                if (sku.get("isSKU") == null || Integer.parseInt(sku.get("isSKU").toString()) != 0) continue;
                falseSkuIdList.add(sku.get("id").toString());
            }
        }
        mapReturn.put("defaultSKUOrderProperties", defaultSKUOrderPropertiesMapList.stream().filter(a -> !falseSkuIdList.contains(a.get("skuId"))).collect(Collectors.toList()));
        QuerySchema productLoadWaysSchema = QuerySchema.create().addSelect("id,productId,productDetailId,productApplyRangeId,loadWay,loadWay.name as loadWay_Name").addCondition((ConditionExpression)condition);
        List productLoadWaysList = MetaDaoHelper.query((String)"pc.product.ProductLoadWay", (QuerySchema)productLoadWaysSchema);
        mapReturn.put("productLoadWays", productLoadWaysList);
        return new RuleExecuteResult();
    }
}

