/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.Product
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductShelfService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductUpdateService;
import com.yonyoucloud.upc.pc.product.Product;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="productShopStatusRule")
public class ProductShopStatusRule
extends AbstractCommonRule {
    @Autowired
    private IUPCProductUpdateService upcProductUpdateService;
    @Autowired
    private IUPCProductShelfService upcProductShelfService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        if (null != bills && bills.size() > 0) {
            block10: for (BizObject bill : bills) {
                Product product = (Product)bill;
                product.setEntityStatus(EntityStatus.Update);
                String sReason = (String)product.get("value");
                if (null == sReason) {
                    sReason = "";
                }
                product.setCPlatFormRemark(sReason);
                String sResult = (String)product.get("state");
                if (null == sResult) {
                    sResult = "";
                }
                switch (billContext.getAction().toString()) {
                    case "audit": {
                        if ("pass".equals(sResult)) {
                            product.setPlatFormStaus(Short.valueOf((short)1));
                            continue block10;
                        }
                        product.setPlatFormStaus(Short.valueOf((short)2));
                        continue block10;
                    }
                    case "forcedown": {
                        product.setPlatFormStaus(Short.valueOf((short)3));
                        HashMap<String, Object> params = new HashMap<String, Object>();
                        params.put("productid", product.getId());
                        params.put("productapplyrangeid", product.get("productApplyRangeId"));
                        params.put("tenantid", AppContext.getCurrentUser().getTenant());
                        this.upcProductUpdateService.UpdateApplyRangeDetailStatus(params);
                        this.upcProductShelfService.forceDownShopProduct(Long.parseLong(product.get("productApplyRangeId").toString()));
                        continue block10;
                    }
                    case "reup": {
                        product.setPlatFormStaus(Short.valueOf((short)1));
                        continue block10;
                    }
                }
                product.setEntityStatus(EntityStatus.Unchanged);
            }
        }
        MetaDaoHelper.update((String)"pc.product.Product", (List)bills);
        return new RuleExecuteResult();
    }
}

