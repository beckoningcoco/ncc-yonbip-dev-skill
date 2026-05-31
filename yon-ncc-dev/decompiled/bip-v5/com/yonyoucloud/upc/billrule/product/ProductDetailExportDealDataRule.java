/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.material.service.ProductExportDataDealService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.apache.commons.lang3.ObjectUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.material.service.ProductExportDataDealService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productDetailExportDealDataRule")
public class ProductDetailExportDealDataRule
extends AbstractCommonRule {
    @Autowired
    private ProductExportDataDealService dealDataService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        if (paramMap.get("return") == null) {
            return new RuleExecuteResult();
        }
        Map product = (Map)paramMap.get("return");
        List<Map<String, Object>> productTagNewList = ProductDetailExportDealDataRule.getProductTagNewList(billContext);
        product.put("productTags", productTagNewList);
        this.dealDataService.dealDecimalData(product, true);
        this.dealDataService.dealBusinessData(product);
        if (product.get("productTags") != null) {
            this.dealDataService.dealProductTags(product);
        }
        return new RuleExecuteResult();
    }

    private Map<String, Object> getProductApplyRange(BillContext billContext) throws Exception {
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billContext.getContext().get("productApplyRangeId"))});
        QuerySchema schema = QuerySchema.create().addSelect("id, isCreator, isApplied").addCondition((ConditionExpression)condition);
        Map productApplyRange = MetaDaoHelper.queryOne((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
        return productApplyRange;
    }

    private static List<Map<String, Object>> getProductTagNewList(BillContext billContext) throws Exception {
        List productApplyRangeList;
        String productDetailId = null;
        if (!ObjectUtils.isEmpty(billContext.getContext().get("productApplyRangeId")) && !CollectionUtils.isEmpty((Collection)(productApplyRangeList = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"id,productDetailId", billContext.getContext().get("productApplyRangeId"))))) {
            productDetailId = ((Map)productApplyRangeList.get(0)).get("productDetailId").toString();
        }
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(billContext.getContext().get("productId")), productDetailId == null ? QueryCondition.name((String)"isCreator").eq((Object)true) : QueryCondition.name((String)"productDetailId").eq((Object)productDetailId)});
        QuerySchema productTagNewSchema = QuerySchema.create().addSelect("id, productId, productApplyRangeId, tagId, tagId.name as tagId_name").addCondition((ConditionExpression)condition);
        List productTagNewMapList = MetaDaoHelper.query((String)"pc.product.ProductTagNew", (QuerySchema)productTagNewSchema);
        return productTagNewMapList;
    }
}

