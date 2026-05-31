/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.billrule.cls.ProductClsUtils;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component(value="productListQueryTreeRule")
public class ProductListQueryTreeRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List returnMap = (List)map.get("return");
        if (null == returnMap || returnMap.size() == 0) {
            return new RuleExecuteResult();
        }
        ProductClsUtils.getInstance().sortTree(returnMap, "code");
        return new RuleExecuteResult();
    }
}

