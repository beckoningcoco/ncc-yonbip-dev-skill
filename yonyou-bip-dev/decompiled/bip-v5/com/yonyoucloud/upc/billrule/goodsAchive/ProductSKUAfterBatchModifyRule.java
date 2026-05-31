/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  org.imeta.orm.base.BizObject
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.goodsAchive;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.billrule.goodsAchive.ProductSKUShelveRule;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.stereotype.Component;

@Component(value="productSKUAfterBatchModifyRule")
public class ProductSKUAfterBatchModifyRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        if ("pc_goodsproductskuprolist".equals(billContext.getBillnum()) && null != bills && bills.size() > 0) {
            for (BizObject bill : bills) {
                ProductSKU sku = (ProductSKU)bill;
                Object skudetail = sku.productSKUDetail() == null ? sku.productSKUAppliedDetail() : sku.productSKUDetail();
                if (skudetail == null || !skudetail.containsKey("status") && !skudetail.containsKey("ustatus")) continue;
                BillContext context = (BillContext)billContext.clone();
                ProductSKU shelveSku = new ProductSKU();
                shelveSku.init((Map)sku);
                if (skudetail.containsKey("status")) {
                    shelveSku.put("biz", (Object)"umall");
                    if (skudetail.get("status").equals(true)) {
                        context.setAction("skushelve");
                    } else if (skudetail.get("status").equals(false)) {
                        context.setAction("skuunshelve");
                    }
                } else if (skudetail.containsKey("ustatus")) {
                    shelveSku.put("biz", (Object)"uorder");
                    if (skudetail.get("ustatus").equals(true)) {
                        context.setAction("skushelve");
                    } else if (skudetail.get("ustatus").equals(false)) {
                        context.setAction("skuunshelve");
                    }
                }
                ArrayList<ProductSKU> list = new ArrayList<ProductSKU>();
                list.add(shelveSku);
                BillDataDto dto = new BillDataDto();
                dto.setBillnum("pc_goodsproductskuprolist");
                dto.setData(list);
                dto.setAction(context.getAction());
                HashMap<String, Object> param = new HashMap<String, Object>();
                param.put("param", dto);
                ProductSKUShelveRule rule = (ProductSKUShelveRule)((Object)AppContext.getBean((String)"productSKUShelveRule"));
                rule.execute(context, param);
            }
        }
        return new RuleExecuteResult();
    }
}

