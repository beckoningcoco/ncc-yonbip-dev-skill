/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.Json
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.productsku;

import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="productSkuAddInitRule")
public class ProductSkuAddInitRule
extends AbstractCommonRule {
    @Autowired
    PubOptionService pubOptionService;
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        Product product = new Product();
        product.put("productSkuSaveAsync", (Object)this.pubOptionService.getProductSkuSaveAsync());
        paramMap.remove("return");
        return new RuleExecuteResult((Object)Json.encode2((BizObject)product).toString());
    }
}

