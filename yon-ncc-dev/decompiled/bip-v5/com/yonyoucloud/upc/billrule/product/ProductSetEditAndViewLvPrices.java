/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;

@Component(value="productSetEditAndViewLvPrices")
public class ProductSetEditAndViewLvPrices
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
        if (billContext.getContext().get("isCreator").equals(false)) {
            UserType userType;
            LoginUser currentUser;
            this.setAppliedData(mapReturn, (Long)billContext.getContext().get("productId"), (Long)billContext.getContext().get("productApplyRangeId"), (Boolean)billContext.getContext().get("isApplied"));
            mapReturn.put("isApplied", (Boolean)billContext.getContext().get("isApplied"));
            if (!(billContext.getContext().get("isApplied") == null || ((Boolean)billContext.getContext().get("isApplied")).booleanValue() || (currentUser = AppContext.getCurrentUser()) == null || (userType = currentUser.getUserType()) == null || userType.getValue() != 4 && userType.getValue() != 5)) {
                this.setMerchantDefaultValue(mapReturn);
            }
        }
        return new RuleExecuteResult();
    }

    private void setMerchantDefaultValue(Map<String, Object> mapReturn) {
        mapReturn.remove("detail!fullSetInspection");
    }

    private void setAppliedData(Map<String, Object> mapReturn, Long productId, Long productApplyRangeId, Boolean isApplied) throws Exception {
        if (isApplied.equals(false)) {
            if (mapReturn.containsKey("productParams") && mapReturn.get("productParams") != null) {
                for (Map param : (List)mapReturn.get("productParams")) {
                    param.remove("id");
                    param.put("productApplyRangeId", productApplyRangeId);
                    param.remove("_status");
                }
            }
            if (mapReturn.containsKey("defaultSKUOrderProperties") && mapReturn.get("defaultSKUOrderProperties") != null) {
                for (Map prop2 : (List)mapReturn.get("defaultSKUOrderProperties")) {
                    prop2.remove("id");
                    prop2.put("productApplyRangeId", productApplyRangeId);
                    prop2.remove("_status");
                }
            }
            if (mapReturn.containsKey("productTags") && mapReturn.get("productTags") != null) {
                for (Map tag : (List)mapReturn.get("productTags")) {
                    tag.remove("id");
                    tag.put("productApplyRangeId", productApplyRangeId);
                    tag.remove("_status");
                }
            }
            if (mapReturn.containsKey("productskus") && mapReturn.get("productskus") != null) {
                for (Map sku : (List)mapReturn.get("productskus")) {
                    if (sku.containsKey("skuOrderProperties") && sku.get("skuOrderProperties") != null) {
                        for (Map prop3 : (List)sku.get("skuOrderProperties")) {
                            prop3.remove("id");
                            prop3.put("productApplyRangeId", productApplyRangeId);
                            prop3.remove("_status");
                        }
                    }
                    if (!sku.containsKey("skuTags") || sku.get("skuTags") == null) continue;
                    sku.remove("skuTags");
                }
            }
            mapReturn.remove("detail!productExtendCharacterDef!id");
            mapReturn.remove("detail!productExtendCharacterDef__id");
            Object productExtendCharacterDef = mapReturn.get("detail!productExtendCharacterDef");
            if (null != productExtendCharacterDef && productExtendCharacterDef instanceof Map) {
                Map productExtendCharacterDefMap = (Map)productExtendCharacterDef;
                productExtendCharacterDefMap.remove("id");
                mapReturn.put("detail!productExtendCharacterDef", productExtendCharacterDefMap);
            }
        } else {
            QueryCondition[] conditions = new QueryCondition[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"productApplyRangeId").eq((Object)productApplyRangeId)};
            List data = MetaDaoHelper.query((String)"pc.product.ProductParameters", (QuerySchema)QuerySchema.create().addSelect("id, productId, productApplyRangeId, param, param.parent.name as param_GroupName, param.name as param_Name, paramValue, pubts").appendQueryCondition((ConditionExpression[])conditions));
            mapReturn.put("productParams", data);
            data = MetaDaoHelper.query((String)"pc.product.ProductSkuOrderProperty", (QuerySchema)QuerySchema.create().addSelect("id, productId, skuId, productApplyRangeId, skuPropertyTypeId, skuPropertyTypeId.propertyType.showItem as skuPropertyTypeId_showItem, skuPropertyTypeId.alias, skuPropertyTypeId.propertyType.type as skuPropertyTypeId_type, skuPropertyTypeId.propertyType.userdefMode as skuPropertyTypeId_userdefMode, promptMessage, isShow, isRequired, iLimitNum, iOrder").appendQueryCondition((ConditionExpression[])conditions).appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"skuId.isSKU").eq((Object)0)}));
            mapReturn.put("defaultSKUOrderProperties", data);
            data = MetaDaoHelper.query((String)"pc.product.ProductTagNew", (QuerySchema)QuerySchema.create().addSelect("id, productId, productApplyRangeId, tagId, tagId.name as tagId_name").appendQueryCondition((ConditionExpression[])conditions));
            mapReturn.put("productTags", data);
            if (mapReturn.containsKey("productskus") && mapReturn.get("productskus") != null) {
                List dataProps = MetaDaoHelper.query((String)"pc.product.ProductSkuOrderProperty", (QuerySchema)QuerySchema.create().addSelect("id, productId, skuId, productApplyRangeId, skuPropertyTypeId, skuPropertyTypeId.propertyType.showItem as skuPropertyTypeId_showItem, skuPropertyTypeId.alias, skuPropertyTypeId.propertyType.type as skuPropertyTypeId_type, skuPropertyTypeId.propertyType.userdefMode as skuPropertyTypeId_userdefMode, promptMessage, isShow, isRequired, iLimitNum, iOrder").appendQueryCondition((ConditionExpression[])conditions));
                for (Map sku : (List)mapReturn.get("productskus")) {
                    sku.put("skuOrderProperties", dataProps.stream().filter(prop -> prop.get("skuId").equals(sku.get("id"))).collect(Collectors.toList()));
                }
            }
        }
    }
}

