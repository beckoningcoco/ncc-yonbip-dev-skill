/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.service.ExtendQuerySchemaService
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.common;

import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.service.ExtendQuerySchemaService;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.service.MerchantCommonRefQueryService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="myExtendQuerySchemaService")
public class MyExtendQuerySchemaService
implements ExtendQuerySchemaService {
    @Autowired
    private MerchantCommonRefQueryService merchantCommonRefQueryService;
    @Autowired
    private PubOptionService pubOptionService;

    public void modifySchema(QuerySchema schema, BillContext billContext) {
        List compositonSchemas;
        Object modifySchema;
        Map context;
        if ("aa_salearearef".equals(billContext.getBillnum())) {
            schema.distinct();
            this.isPartitionAbleSaleAreaRef(schema, billContext);
        }
        if ("aa_saleareaqueryref".equals(billContext.getBillnum())) {
            schema.distinct();
            this.isPartitionAbleSaleAreaQueryRef(schema, billContext);
        } else if ("aa_custcategoryref".equals(billContext.getBillnum())) {
            schema.distinct();
            this.isPartitionAbleSaleAreaQueryRef(schema, billContext);
        } else if (this.getCodeList().contains(billContext.getBillnum())) {
            schema.distinct();
        } else if ("pc_purchaseclassref".equals(billContext.getBillnum())) {
            schema.distinct();
        }
        if (("pc_product".equals(billContext.getBillnum()) || "pc_productsku_add".equals(billContext.getBillnum())) && null != (context = billContext.getContext()) && null != (modifySchema = context.get("modifySchema")) && "1".equals(modifySchema.toString()) && !CollectionUtils.isEmpty((Collection)(compositonSchemas = schema.compositonSchemas()))) {
            for (QuerySchema compositonSchema : compositonSchemas) {
                if (!"productskus".equals(compositonSchema.name())) continue;
                compositonSchemas.remove(compositonSchema);
                break;
            }
        }
        if ("aa_customerlevelref".equals(billContext.getBillnum())) {
            this.merchantCommonRefQueryService.isPartitionAbleCustomerLevelRef(schema, billContext);
        }
        if ("aa_merchantref_usage".equals(billContext.getBillnum()) || "aa_merchantref_management".equals(billContext.getBillnum())) {
            this.merchantCommonRefQueryService.isPartitionAbleMerchantGroupRef(schema, billContext);
        }
        if ("aa_merchant_add_range".equals(billContext.getBillnum())) {
            this.merchantCommonRefQueryService.isPartitionAbleMerchantAddRangeRef(schema, billContext);
        }
    }

    private void isPartitionAbleSaleAreaRef(QuerySchema schema, BillContext billContext) {
        Map extendCondition = billContext.getContext();
        if (!CollectionUtils.isEmpty((Map)extendCondition) && extendCondition.containsKey("isShopSaleAreaRef")) {
            schema.setPartitionable(false);
            QueryConditionGroup queryConditionGroup = schema.queryConditionGroup();
            Iterator conditionExpressionIterator = queryConditionGroup.conditions().iterator();
            while (conditionExpressionIterator.hasNext()) {
                ConditionExpression conditionExpression = (ConditionExpression)conditionExpressionIterator.next();
                if (!(conditionExpression instanceof QueryCondition) || !"shop".equals(((QueryCondition)conditionExpression).field())) continue;
                conditionExpressionIterator.remove();
            }
            if ("0".equals(extendCondition.get("isShopSaleAreaRef").toString())) {
                schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq(AppContext.getYTenantId()), QueryCondition.name((String)"shop").eq((Object)-1)});
            } else if ("1".equals(extendCondition.get("isShopSaleAreaRef").toString())) {
                schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq(AppContext.getYTenantId()), QueryCondition.name((String)"shop").not_eq((Object)-1)});
            } else if ("2".equals(extendCondition.get("isShopSaleAreaRef").toString())) {
                schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq(AppContext.getYTenantId())});
            }
        }
    }

    private void isPartitionAbleSaleAreaQueryRef(QuerySchema schema, BillContext billContext) {
        Map extendCondition = billContext.getContext();
        if (!CollectionUtils.isEmpty((Map)extendCondition) && extendCondition.containsKey("shopType")) {
            schema.setPartitionable(false);
            QueryConditionGroup queryConditionGroup = schema.queryConditionGroup();
            Iterator conditionExpressionIterator = queryConditionGroup.conditions().iterator();
            while (conditionExpressionIterator.hasNext()) {
                ConditionExpression conditionExpression = (ConditionExpression)conditionExpressionIterator.next();
                if (!(conditionExpression instanceof QueryCondition) || !"shop".equals(((QueryCondition)conditionExpression).field())) continue;
                conditionExpressionIterator.remove();
            }
            if ("0".equals(extendCondition.get("shopType").toString())) {
                schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq(AppContext.getYTenantId()), QueryCondition.name((String)"shop").eq((Object)-1)});
            } else if ("1".equals(extendCondition.get("shopType").toString())) {
                schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq(AppContext.getYTenantId()), QueryCondition.name((String)"shop").not_eq((Object)-1)});
            } else if ("2".equals(extendCondition.get("shopType").toString())) {
                schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq(AppContext.getYTenantId())});
            }
        }
    }

    private List<String> getCodeList() {
        ArrayList<String> codeList = new ArrayList<String>();
        codeList.add("productref");
        codeList.add("pc_nomalproductref");
        codeList.add("pc_productmasterquerygridref");
        codeList.add("pc_productquerytreeref");
        codeList.add("pc_managementclassref");
        codeList.add("productskuref");
        codeList.add("pc_productskuquerytreeref");
        codeList.add("pc_productskuquerymaintreeref");
        codeList.add("pc_productskuqueryfiltertreeref");
        codeList.add("baseProductRef");
        return codeList;
    }
}

