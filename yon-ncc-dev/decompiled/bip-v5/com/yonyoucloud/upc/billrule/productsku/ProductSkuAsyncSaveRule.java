/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.Product
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.productsku;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.service.ProductSkuAsyncSaveService;
import com.yonyoucloud.upc.service.ProductSkuService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productSkuAsyncSaveRule")
public class ProductSkuAsyncSaveRule
extends AbstractCommonRule {
    @Autowired
    ProductSkuAsyncSaveService productSkuAsyncSaveService;
    @Autowired
    ProductSkuService productSkuService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        Product product = (Product)bills.get(0);
        product.setEntityStatus(EntityStatus.Update);
        if (this.checkCharacterByTpl(product.getId())) {
            this.productSkuAsyncSaveService.saveProductSkuAsync(product, product.get("billCodeContext_billnumMode"));
        }
        return null;
    }

    private boolean checkCharacterByTpl(Object productId) throws Exception {
        List<Map<String, Object>> productSpecs;
        boolean result = false;
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(productId)});
        QuerySchema schema = QuerySchema.create().addSelect("id, productTemplate").addCondition((ConditionExpression)queryConditionGroup);
        List products = this.productSkuService.query("pc.product.Product", schema);
        Product product = (Product)products.get(0);
        String productSql = "select DISTINCT character_id from productfreecharacteritem where product_id = " + productId + " and ytenant_id = '" + AppContext.getYhtTenantId() + "' group by character_id;";
        String tplSql = "select DISTINCT iCharacterId from product_tpl_character  where iCharacteristicsTypeId = 3 and bSkuSens = 1 and tpl_id = " + product.getProductTemplate() + " and ytenant_id = '" + AppContext.getYhtTenantId() + "' group by iCharacterId;";
        List<Map<String, Object>> tplSpecs = this.excuteSql(tplSql);
        if (CollectionUtils.isEmpty(tplSpecs)) {
            result = true;
        }
        if (!CollectionUtils.isEmpty(productSpecs = this.excuteSql(productSql)) && !CollectionUtils.isEmpty(tplSpecs) && productSpecs.size() == tplSpecs.size()) {
            result = true;
        }
        return result;
    }

    private List<Map<String, Object>> excuteSql(String sql) {
        HashMap<String, String> queryTenantSQLList = new HashMap<String, String>(2);
        queryTenantSQLList.put("sql", sql);
        List tenantMapList = SqlHelper.selectList((String)"com.yonyou.ucf.mdd.ext.meta.dao.selectList", queryTenantSQLList);
        return tenantMapList;
    }
}

