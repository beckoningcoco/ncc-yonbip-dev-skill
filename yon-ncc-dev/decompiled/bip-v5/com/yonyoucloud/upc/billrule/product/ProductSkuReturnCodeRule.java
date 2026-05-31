/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.yonyou.uap.billcode.BillCodeObj
 *  com.yonyou.uap.billcode.service.IBillCodeComponentService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.utils.MainChildBillBuildUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.google.common.collect.Lists;
import com.yonyou.uap.billcode.BillCodeObj;
import com.yonyou.uap.billcode.service.IBillCodeComponentService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.utils.MainChildBillBuildUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productSkuReturnCodeRule")
public class ProductSkuReturnCodeRule
extends AbstractCommonRule {
    @Autowired
    private IBillCodeComponentService iBillCodeComponentService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        int size = bills.size();
        for (int i = 0; i < size; ++i) {
            Product product = (Product)bills.get(i);
            List productskus = product.productskus();
            ArrayList codeList = Lists.newArrayList();
            if (EntityStatus.Delete == product.getEntityStatus() && null != product.get("isCreator") && !"true".equals(product.get("isCreator"))) {
                return null;
            }
            if (EntityStatus.Update == product.getEntityStatus() && CollectionUtils.isEmpty((Collection)productskus)) {
                return null;
            }
            if (EntityStatus.Delete == product.getEntityStatus() && CollectionUtils.isEmpty((Collection)productskus)) {
                QueryConditionGroup conditionGroup = new QueryConditionGroup();
                conditionGroup.addCondition(new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"isSKU").eq((Object)1)});
                QuerySchema schema = QuerySchema.create().addSelect("id, code").addCondition((ConditionExpression)conditionGroup);
                List skusInDB = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
                if (skusInDB != null) {
                    for (Map sku : skusInDB) {
                        Object code = sku.get("code");
                        if (code == null) continue;
                        codeList.add(code.toString());
                    }
                }
            }
            if (EntityStatus.Update == product.getEntityStatus() && !CollectionUtils.isEmpty((Collection)productskus)) {
                for (ProductSKU sku : productskus) {
                    EntityStatus entityStatus = sku.getEntityStatus();
                    if (entityStatus == null || !"Delete".equals(entityStatus.name())) continue;
                    String code = sku.getCode();
                    codeList.add(code);
                }
            }
            if (CollectionUtils.isEmpty((Collection)codeList)) continue;
            String[] billCodes = new String[codeList.size()];
            codeList.toArray(billCodes);
            BillCodeObj[] billCodeObjs = MainChildBillBuildUtils.buildBillCodeObjs((BizObject)product, (String)"productskus", (String)"pc.prodcut.ProductSKU");
            this.iBillCodeComponentService.returnBatchBillCodes("pc_product|productskus#code", billCodes, AppContext.getTenantId().toString(), null, null, false, billCodeObjs);
        }
        return null;
    }
}

