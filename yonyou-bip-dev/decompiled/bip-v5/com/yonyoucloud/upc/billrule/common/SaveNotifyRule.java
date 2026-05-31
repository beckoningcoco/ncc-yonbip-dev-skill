/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.alibaba.fastjson.serializer.SerializerFeature
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.custcategory.CustCategory
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.vendor.Vendor
 *  com.yonyoucloud.upc.pc.cls.ManagementClass
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.common;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.custcategory.CustCategory;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.vendor.Vendor;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.pc.cls.ManagementClass;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="saveNotifyRule")
public class SaveNotifyRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(SaveNotifyRule.class);
    @Autowired
    private EventService2 eventService2;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = this.getBills(billContext, map);
        HashMap<String, Object> businessObject = new HashMap<String, Object>();
        businessObject.put("fullname", billContext.getFullname());
        String jsonStr = this.dealDataforSendEvent(billContext, clss);
        if ("".equals(jsonStr)) {
            return new RuleExecuteResult();
        }
        businessObject.put("archive", jsonStr);
        log.info("=========>archive" + jsonStr);
        log.info("=========>billContext.getFullname() " + billContext.getFullname());
        log.info("=========>clss.get(0).get('_status') " + ((BizObject)clss.get(0)).get("_status"));
        log.info("=========>clss.get(0).getEntityStatus() " + ((BizObject)clss.get(0)).getEntityStatus());
        log.info("=========>clss.get(0).get('entityStatus') " + ((BizObject)clss.get(0)).get("entityStatus"));
        try {
            if (((BizObject)clss.get(0)).getEntityStatus() == EntityStatus.Insert) {
                this.eventService2.sendEvent("YXYBASEDOC", "ADD_NOTIFY", businessObject);
            } else if (((BizObject)clss.get(0)).getEntityStatus() == EntityStatus.Update) {
                this.eventService2.sendEvent("YXYBASEDOC", "UPDATE_NOTIFY", businessObject);
            } else if ("aa.merchant.Merchant".equals(billContext.getFullname()) && (((BizObject)clss.get(0)).get("entityStatus") == EntityStatus.Update || ((BizObject)clss.get(0)).getEntityStatus() == EntityStatus.Update)) {
                this.eventService2.sendEvent("YXYBASEDOC", "UPDATE_NOTIFY", businessObject);
            }
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040809BB", (String)"\u4fdd\u5b58\u65f6\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25") + e.getMessage(), (Throwable)e);
        }
        return new RuleExecuteResult();
    }

    public String dealDataforSendEvent(BillContext billContext, List<BizObject> clss) {
        String jsonStr = "";
        int subTableMaxCount = 100;
        if (AppContext.getAppConfig().get("skuCount") != null) {
            subTableMaxCount = Integer.parseInt(AppContext.getAppConfig().get("skuCount").toString());
        }
        if ("aa.merchant.Merchant".equals(billContext.getFullname()) && "save".equals(billContext.getAction())) {
            List tempList;
            Merchant merchant = (Merchant)clss.get(0);
            if (!(MerchantUtils.isExists((Map)merchant, (String)"srcBill") && "CRM".equals(merchant.get("srcBill")) || merchant.get("merchantApplyRanges") == null || ((List)merchant.get("merchantApplyRanges")).size() <= subTableMaxCount)) {
                tempList = ((List)merchant.get("merchantApplyRanges")).subList(0, subTableMaxCount);
                merchant.put("merchantApplyRanges", tempList);
            }
            if (!(MerchantUtils.isExists((Map)merchant, (String)"srcBill") && "CRM".equals(merchant.get("srcBill")) || merchant.get("invoicingCustomerss") == null || ((List)merchant.get("invoicingCustomerss")).size() <= subTableMaxCount)) {
                tempList = ((List)merchant.get("invoicingCustomerss")).subList(0, subTableMaxCount);
                merchant.put("invoicingCustomerss", tempList);
            }
            jsonStr = JSONObject.toJSONString((Object)merchant, (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat});
        } else if ("aa.custcategory.CustCategory".equals(billContext.getFullname()) && "save".equals(billContext.getAction())) {
            CustCategory merchant = (CustCategory)clss.get(0);
            if (merchant.get("custCategoryApplyRanges") != null && ((List)merchant.get("custCategoryApplyRanges")).size() > subTableMaxCount) {
                List tempList = ((List)merchant.get("custCategoryApplyRanges")).subList(0, subTableMaxCount);
                merchant.put("custCategoryApplyRanges", tempList);
            }
            jsonStr = JSONObject.toJSONString((Object)merchant, (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat});
        } else if ("aa.vendor.Vendor".equals(billContext.getFullname()) && "save".equals(billContext.getAction())) {
            Vendor merchant = (Vendor)clss.get(0);
            if (merchant.get("vendorOrgs") != null && ((List)merchant.get("vendorOrgs")).size() > subTableMaxCount) {
                List tempList = ((List)merchant.get("vendorOrgs")).subList(0, subTableMaxCount);
                merchant.put("vendorOrgs", tempList);
            }
            jsonStr = JSONObject.toJSONString((Object)merchant, (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat});
        } else if ("aa.warehouse.Warehouse".equals(billContext.getFullname()) && "save".equals(billContext.getAction())) {
            BizObject merchant = clss.get(0);
            if (merchant.get("stocks") != null && ((List)merchant.get("stocks")).size() > subTableMaxCount) {
                List tempList = ((List)merchant.get("stocks")).subList(0, subTableMaxCount);
                merchant.put("stocks", tempList);
            }
            jsonStr = JSONObject.toJSONString((Object)merchant, (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat});
        } else if ("pc.cls.ManagementClass".equals(billContext.getFullname()) && "save".equals(billContext.getAction())) {
            ManagementClass managementClass = (ManagementClass)clss.get(0);
            List managementClassApplyRanges = managementClass.managementClassApplyRanges();
            if (managementClassApplyRanges != null && managementClassApplyRanges.size() > subTableMaxCount) {
                List managementClassApplyRanges1 = managementClassApplyRanges.subList(0, subTableMaxCount);
                managementClass.setManagementClassApplyRanges(managementClassApplyRanges1);
            }
            jsonStr = JSONObject.toJSONString((Object)managementClass, (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat});
        } else {
            jsonStr = JSONObject.toJSONString((Object)clss.get(0), (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat});
        }
        return jsonStr;
    }
}

