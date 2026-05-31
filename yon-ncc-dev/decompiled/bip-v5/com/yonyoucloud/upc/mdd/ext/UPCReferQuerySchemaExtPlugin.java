/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.plugin.base.QuerySchemaExecutorPlugin
 *  org.imeta.core.model.Entity
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QueryJoin
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.mdd.ext;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.plugin.base.QuerySchemaExecutorPlugin;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.core.model.Entity;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QueryJoin;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class UPCReferQuerySchemaExtPlugin
implements QuerySchemaExecutorPlugin {
    private static final Logger log = LoggerFactory.getLogger(UPCReferQuerySchemaExtPlugin.class);
    @Autowired
    YMSParamConfig ymsParamConfig;

    public void extendQuerySchema(Entity refEntity, QuerySchema querySchema, BillContext billContext) {
        List conditions;
        QueryConditionGroup queryConditionGroup;
        Map hashMap;
        if (billContext.getParamObj() != null && (hashMap = billContext.getParamObj().getCustMap()) != null) {
            AppContext.setThreadContext((String)"searchType", hashMap.get("searchType"));
        }
        boolean isSimpleField = BooleanUtil.isTrue((Object)this.ymsParamConfig.getRefSimpleField());
        if (billContext.getParamObj() != null) {
            Object extenalData;
            if (isSimpleField && "productref".equalsIgnoreCase(billContext.getBillnum()) && "pc.product.Product".equals(billContext.getFullname())) {
                InvocationInfoProxy.setExtendAttribute((String)"originSelectFields", (Object)querySchema.selectFields());
                extenalData = billContext.getParamObj().getExternalData();
                if (null != extenalData && "filter".equalsIgnoreCase(extenalData.toString())) {
                    querySchema.selectFields(this.getSelectField(billContext.getBillnum()));
                    querySchema.distinct();
                }
            } else if (isSimpleField && ("productskuref".equalsIgnoreCase(billContext.getBillnum()) || "goodsRef".equalsIgnoreCase(billContext.getBillnum())) && "pc.product.ProductSKU".equals(billContext.getFullname())) {
                InvocationInfoProxy.setExtendAttribute((String)"originSelectFields", (Object)querySchema.selectFields());
                extenalData = billContext.getParamObj().getExternalData();
                if (null != extenalData && "filter".equalsIgnoreCase(extenalData.toString())) {
                    querySchema.selectFields(this.getSelectField(billContext.getBillnum()));
                    querySchema.distinct();
                }
            }
        }
        if ("productskuref".equalsIgnoreCase(billContext.getBillnum()) && null != (queryConditionGroup = querySchema.queryConditionGroup()) && !CollectionUtils.isEmpty((Collection)(conditions = queryConditionGroup.conditions()))) {
            for (ConditionExpression conditionExpression : conditions) {
                if (!(conditionExpression instanceof QueryConditionGroup)) continue;
                QueryConditionGroup expressionGroup = (QueryConditionGroup)conditionExpression;
                List conditions1 = expressionGroup.conditions();
                for (ConditionExpression conditionExpression1 : conditions1) {
                    QueryCondition queryCondition;
                    if (!(conditionExpression1 instanceof QueryCondition) || !"skuTagNew.tagId".equals((queryCondition = (QueryCondition)conditionExpression1).field())) continue;
                    if (CollectionUtils.isEmpty((Collection)querySchema.queryJoins())) {
                        querySchema.queryJoins(new ArrayList());
                    }
                    List queryJoins = querySchema.queryJoins();
                    QueryJoin queryJoin = new QueryJoin("skuTagNew", "skuTagNew.productDetailId=productId.productApplyRangeGroup.productDetailId");
                    queryJoins.add(queryJoin);
                    querySchema.distinct();
                }
            }
        }
    }

    public int order() {
        return 0;
    }

    private List<QueryField> getSelectField(String refCode) {
        ArrayList<QueryField> queryFieldList = new ArrayList<QueryField>();
        if ("productref".equalsIgnoreCase(refCode)) {
            QueryField queryField = new QueryField("id", "id");
            queryFieldList.add(queryField);
            queryField = new QueryField("code", "code");
            queryFieldList.add(queryField);
            queryField = new QueryField("name", "name");
            queryFieldList.add(queryField);
            queryField = new QueryField("modelDescription", "modelDescription");
            queryFieldList.add(queryField);
            queryField = new QueryField("url", "url");
            queryFieldList.add(queryField);
            queryField = new QueryField("model", "model");
            queryFieldList.add(queryField);
            queryField = new QueryField("unit", "unit");
            queryFieldList.add(queryField);
            queryField = new QueryField("unit.name", "unit_Name");
            queryFieldList.add(queryField);
            queryField = new QueryField("unit.code", "unit_Code");
            queryFieldList.add(queryField);
            queryField = new QueryField("virtualProductAttribute", "virtualProductAttribute");
            queryFieldList.add(queryField);
        } else if ("productskuref".equalsIgnoreCase(refCode) || "goodsRef".equalsIgnoreCase(refCode)) {
            QueryField queryField = new QueryField("id", "id");
            queryFieldList.add(queryField);
            queryField = new QueryField("code", "code");
            queryFieldList.add(queryField);
            queryField = new QueryField("name", "name");
            queryFieldList.add(queryField);
            queryField = new QueryField("modelDescription", "modelDescription");
            queryFieldList.add(queryField);
            queryField = new QueryField("model", "model");
            queryFieldList.add(queryField);
            queryField = new QueryField("productId", "productId");
            queryFieldList.add(queryField);
        }
        return queryFieldList;
    }
}

