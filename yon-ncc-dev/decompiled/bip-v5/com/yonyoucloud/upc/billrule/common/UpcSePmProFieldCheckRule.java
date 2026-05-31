/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.base.BizObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.common;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.service.UpcCommonFieldCheckService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpcSePmProFieldCheckRule
extends AbstractCommonRule {
    @Autowired
    private UpcCommonFieldCheckService upcCommonFieldCheckService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        String fullname = billContext.getFullname();
        List bills = this.getBills(billContext, map);
        for (BizObject bill : bills) {
            switch (fullname) {
                case "aa.merchant.Merchant": {
                    if (bill.get("isCreator") != null && !((Boolean)bill.get("isCreator")).booleanValue()) break;
                }
                case "pc.product.Product": {
                    if (bill.get("isCreator") != null && !((Boolean)bill.get("isCreator")).booleanValue()) break;
                }
                case "aa.salearea.SaleArea": 
                case "pc.cls.ManagementClass": 
                case "aa.custcategory.CustCategory": 
                case "aa.customertype.CustomerType": 
                case "pc.brand.Brand": 
                case "pc.cls.PresentationClass": 
                case "pc.productline.ProductLine": {
                    ArrayList<String> ids = new ArrayList<String>();
                    if (bill.getId() == null) break;
                    ids.add(bill.getId().toString());
                    this.upcCommonFieldCheckService.fieldSePmProRefCheck(fullname, ids);
                    break;
                }
            }
        }
        return new RuleExecuteResult();
    }
}

