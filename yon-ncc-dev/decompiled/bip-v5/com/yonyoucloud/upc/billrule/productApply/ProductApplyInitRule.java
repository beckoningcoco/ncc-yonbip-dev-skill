/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.Json
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.productApply;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.service.ProductApplyService;
import java.util.Map;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="productApplyInitRule")
public class ProductApplyInitRule
extends AbstractCommonRule {
    @Autowired
    ProductApplyService productApplyService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        Map data = (Map)paramMap.get("return");
        ProductApply productApply = null != data ? (ProductApply)Objectlizer.convert((Map)data, (String)"pc.productapply.ProductApply") : new ProductApply();
        this.productApplyService.setApplyBizOperator((Map)productApply);
        paramMap.remove("return");
        return new RuleExecuteResult((Object)Json.encode2((BizObject)productApply).toString());
    }
}

