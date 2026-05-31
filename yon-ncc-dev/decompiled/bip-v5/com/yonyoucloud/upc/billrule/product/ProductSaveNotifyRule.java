/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.CommonRuleUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.Product
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.bill.rule.base.CommonRuleUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.pc.product.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="productSaveNotifyRule")
public class ProductSaveNotifyRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(ProductSaveNotifyRule.class);
    @Autowired
    private EventService2 eventService2;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        CommonRuleUtils.clear(map);
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = this.getBills(billContext, map);
        ArrayList<Product> sendClss = new ArrayList<Product>();
        HashMap<String, Object> businessObject = new HashMap<String, Object>();
        if ("pc_product".equals(billContext.getBillnum()) || "pc_productdetail".equals(billContext.getBillnum()) || "pc_productlist".equals(billContext.getBillnum())) {
            if ("pc.product.Product".equals(billContext.getFullname()) && "save".equals(billContext.getAction())) {
                List tempList;
                Product product = (Product)clss.get(0);
                int skuCount = 1000;
                if (AppContext.getAppConfig().get("skuCount") != null) {
                    skuCount = Integer.parseInt(AppContext.getAppConfig().get("skuCount").toString());
                }
                if (product.productskus() != null && product.productskus().size() > skuCount) {
                    tempList = product.productskus().subList(0, skuCount);
                    product.setProductskus(tempList);
                }
                if (product.productspecitems() != null && product.productspecitems().size() > skuCount) {
                    tempList = product.productspecitems().subList(0, skuCount);
                    product.setProductspecitems(tempList);
                }
                if (product.get("specItems_") != null && ((List)product.get("specItems_")).size() > skuCount) {
                    tempList = ((List)product.get("specItems_")).subList(0, skuCount);
                    product.put("specItems_", tempList);
                }
                if (product.get("proTemplateInfo") != null && ((List)product.get("proTemplateInfo")).size() > skuCount) {
                    tempList = ((List)product.get("proTemplateInfo")).subList(0, skuCount);
                    product.put("proTemplateInfo", tempList);
                }
                if (product.get("productApplyRange") != null && ((List)product.get("productApplyRange")).size() > skuCount) {
                    tempList = ((List)product.get("productApplyRange")).subList(0, skuCount);
                    product.put("productApplyRange", tempList);
                }
                Product sendData = new Product();
                sendData.putAll((Map)product);
                if (sendData.get("description") != null) {
                    sendData.remove("description");
                }
                if (sendData.get("productAlbums") != null) {
                    sendData.remove("productAlbums");
                }
                if (sendData.get("productVideos") != null) {
                    sendData.remove("productVideos");
                }
                sendClss.add(sendData);
            }
            businessObject.put("fullname", "pc.product.Product");
            businessObject.put("products", sendClss);
        }
        log.info("=========>clss.get(0).getEntityStatus() " + ((BizObject)clss.get(0)).get("eventNotify_status"));
        try {
            if (((BizObject)clss.get(0)).get("eventNotify_status").toString().equals(EntityStatus.Insert.toString())) {
                log.info("=========>insert_products_notify:" + clss);
                this.eventService2.sendEvent("YXYBASEDOC", "ADD_NOTIFY", businessObject);
            } else if (((BizObject)clss.get(0)).get("eventNotify_status").toString().equals(EntityStatus.Update.toString())) {
                log.info("=========> products:" + clss);
                this.eventService2.sendEvent("YXYBASEDOC", "UPDATE_NOTIFY", businessObject);
            }
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080314", (String)"\u4fdd\u5b58\u65f6\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25") + e.getMessage(), (Throwable)e);
        }
        return new RuleExecuteResult();
    }
}

