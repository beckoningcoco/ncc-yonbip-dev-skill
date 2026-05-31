/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  com.yonyoucloud.upc.pc.productapply.ProductApplyType
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.productApply;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.pc.productapply.ProductApplyType;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.springframework.stereotype.Component;

@Component(value="productApplyDetailRule")
public class ProductApplyDetailRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        for (int i = 0; i < bills.size(); ++i) {
            ProductApply productApply = (ProductApply)bills.get(i);
            if (ProductApplyType.add != productApply.getApplyType() || !StringUtils.isNotEmpty((CharSequence)productApply.getProductData())) continue;
            Product product = (Product)JSONObject.parseObject((String)productApply.getProductData(), Product.class);
            product.setAccessSource("edit");
            productApply.put("productName", MultilangUtil.getAttr((String)"pc.product.Product", (String)"name", (BizObject)product, null));
            productApply.put("productCode", (Object)product.getCode());
        }
        return null;
    }
}

