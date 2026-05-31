/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.alibaba.fastjson.serializer.SerializerFeature
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.BatchBusinessFilesRequest
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileVO
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationSuiteFile
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.CommonRuleUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.pc.cls.ManagementClass
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.common;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.iuap.fileservice.sdk.module.pojo.BatchBusinessFilesRequest;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileVO;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationSuiteFile;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.bill.rule.base.CommonRuleUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.event.EventType;
import com.yonyoucloud.upc.pc.cls.ManagementClass;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="saveNotifyNewRule")
public class SaveNotifyNewRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(SaveNotifyNewRule.class);
    @Autowired
    private EventService2 eventService2;
    @Autowired
    CooperationFileService cooperationFileService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = this.getBills(billContext, map);
        CommonRuleUtils.clearParent((List)clss);
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
        String billnum = billContext.getBillnum();
        if ("aa_merchantexport".equals(billnum)) {
            billnum = "aa_merchant";
        } else if ("pc_productimport".equals(billnum)) {
            billnum = "pc_product";
        }
        String entityStatus = null;
        entityStatus = null == ((BizObject)clss.get(0)).get("eventNotify_status") ? ((BizObject)clss.get(0)).getEntityStatus().toString() : ((BizObject)clss.get(0)).get("eventNotify_status").toString();
        if ("Unchanged".equals(entityStatus)) {
            return new RuleExecuteResult();
        }
        if ("base_businesspartner".equals(billnum) && clss.get(0) != null && (EntityStatus.Insert.equals((Object)((BizObject)clss.get(0)).getEntityStatus()) || EntityStatus.Update.equals((Object)((BizObject)clss.get(0)).getEntityStatus()))) {
            entityStatus = null;
        }
        try {
            String eventType = EventType.find(billnum, "save", entityStatus).toString();
            log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408021A", (String)"\u5355\u636e\u7c7b\u578b\uff1a") + billnum + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080218", (String)"action\uff1asave\uff0c\u5b9e\u4f53\u72b6\u6001\uff1a") + entityStatus + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080219", (String)"\u4e8b\u4ef6\u7c7b\u578b\u7f16\u7801\uff1a") + eventType);
            this.eventService2.sendEvent("YXYBASEDOC", eventType, businessObject);
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408021B", (String)"\u4fdd\u5b58\u65f6\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25") + e.getMessage(), (Throwable)e);
        }
        return new RuleExecuteResult();
    }

    public String dealDataforSendEvent(BillContext billContext, List<BizObject> clss) {
        String jsonStr = "";
        int subTableMaxCount = 100;
        if (AppContext.getAppConfig().get("skuCount") != null) {
            subTableMaxCount = Integer.parseInt(AppContext.getAppConfig().get("skuCount").toString());
        }
        if ("pc.product.Product".equals(billContext.getFullname()) && "save".equals(billContext.getAction())) {
            Product product = (Product)clss.get(0);
            Product sendData = this.dealProductData(product, subTableMaxCount);
            jsonStr = JSONObject.toJSONString((Object)sendData, (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat});
        } else if ("aa.merchant.Merchant".equals(billContext.getFullname()) && "save".equals(billContext.getAction())) {
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

    @NotNull
    public Product dealProductData(Product product, int subTableMaxCount) {
        List tempList;
        if (product.productskus() != null && product.productskus().size() > subTableMaxCount) {
            tempList = product.productskus().subList(0, subTableMaxCount);
            product.setProductskus(tempList);
        }
        if (product.productspecitems() != null && product.productspecitems().size() > subTableMaxCount) {
            tempList = product.productspecitems().subList(0, subTableMaxCount);
            product.setProductspecitems(tempList);
        }
        if (product.get("specItems_") != null && ((List)product.get("specItems_")).size() > subTableMaxCount) {
            tempList = ((List)product.get("specItems_")).subList(0, subTableMaxCount);
            product.put("specItems_", tempList);
        }
        if (product.get("proTemplateInfo") != null && ((List)product.get("proTemplateInfo")).size() > subTableMaxCount) {
            tempList = ((List)product.get("proTemplateInfo")).subList(0, subTableMaxCount);
            product.put("proTemplateInfo", tempList);
        }
        if (product.get("productApplyRange") != null && ((List)product.get("productApplyRange")).size() > subTableMaxCount) {
            tempList = ((List)product.get("productApplyRange")).subList(0, subTableMaxCount);
            product.put("productApplyRange", tempList);
        }
        if (product.productTags() != null && product.productTags().size() > subTableMaxCount) {
            List productTagExtends = product.productTags().subList(0, subTableMaxCount);
            product.setProductTags(productTagExtends);
        }
        if (product.get("homepageBusinessId") != null) {
            ArrayList<BatchBusinessFilesRequest> batchBusinessFilesRequestList = new ArrayList<BatchBusinessFilesRequest>();
            BatchBusinessFilesRequest batchBusinessFilesRequest = new BatchBusinessFilesRequest();
            batchBusinessFilesRequest.setBusinessType("iuap-apdoc-material");
            batchBusinessFilesRequest.setBusinessIds(new ArrayList<String>(Collections.singletonList((String)product.get("homepageBusinessId"))));
            batchBusinessFilesRequest.setCancelFileExit(Boolean.valueOf(true));
            batchBusinessFilesRequestList.add(batchBusinessFilesRequest);
            try {
                CooperationSuiteFile cooperationSuiteFile = this.cooperationFileService.batchBusinessFiles(batchBusinessFilesRequestList);
                if (null != cooperationSuiteFile && !CollectionUtils.isEmpty((Collection)cooperationSuiteFile.getData())) {
                    product.put("url", (Object)((CooperationFileVO)cooperationSuiteFile.getData().get(0)).getBucketUrl());
                }
            }
            catch (Exception e) {
                log.error("\u7269\u6599\u4fdd\u5b58\u65f6\u67e5\u8be2\u534f\u540c\u9644\u4ef6\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            }
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
        return sendData;
    }
}

