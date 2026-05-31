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
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.base.BizObject
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
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.event.EventType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="commonNotifyRule")
public class CommonNotifyRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(CommonNotifyRule.class);
    @Autowired
    private EventService2 eventService2;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = this.getBills(billContext, map);
        String billnum = billContext.getBillnum();
        HashMap<String, Object> businessObject = new HashMap<String, Object>();
        String fullName = billContext.getFullname();
        if ("pc_productdetail".equals(billnum) && ("unstop".equals(billContext.getAction()) || "stop".equals(billContext.getAction()))) {
            billnum = "pc_product";
        }
        businessObject.put("fullname", fullName);
        HashMap<String, Object> archive = new HashMap<String, Object>();
        String[] keyList = new String[]{"_entityName", "name", "code", "tenant", "yTanantId", "showItem", "userdefines", "userdefAlias", "userdefinespecs", "id", "ids", "tags", "productApplyRangeId", "merchantId", "merchantApplyRanges", "isCreator"};
        if (clss != null && clss.size() > 0) {
            Iterator iterator = clss.iterator();
            while (iterator.hasNext()) {
                BizObject tempClss;
                BizObject archiveOld = tempClss = (BizObject)iterator.next();
                for (int i = 0; i < keyList.length; ++i) {
                    if (!archiveOld.containsKey((Object)keyList[i])) continue;
                    archive.put(keyList[i], archiveOld.get(keyList[i]));
                }
                if ("aa_merchantlist".equals(billnum) && "addmerchantsuitorg".equals(billContext.getAction()) && !archive.containsKey("merchantApplyRanges")) {
                    return new RuleExecuteResult();
                }
                String jsonStr = JSONObject.toJSONString(archive, (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat});
                businessObject.put("archive", jsonStr);
                log.info("=========>archive" + jsonStr);
                log.info("=========>billContext.getFullname() " + billContext.getFullname());
                log.info("=========>clss.get(0).get('_status') " + ((BizObject)clss.get(0)).get("_status"));
                log.info("=========>clss.get(0).getEntityStatus() " + ((BizObject)clss.get(0)).getEntityStatus());
                log.info("=========>clss.get(0).get('entityStatus') " + ((BizObject)clss.get(0)).get("entityStatus"));
                String entityStatus = this.getEntityStatus(billContext, clss);
                if ("Unchanged".equals(entityStatus)) {
                    return new RuleExecuteResult();
                }
                EventType eventType = EventType.find(billnum, billContext.getAction(), entityStatus);
                if ((eventType = this.convertEventType(eventType)) == null) {
                    return new RuleExecuteResult((Object)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080440", (String)"\u672a\u627e\u5230\u76f8\u5e94\u4e8b\u4ef6\u7c7b\u578b\uff0c\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25"));
                }
                String eventTypeCode = eventType.toString();
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408043D", (String)"\u5355\u636e\u7c7b\u578b\uff1a") + billnum + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408043B", (String)"action\uff1a") + billContext.getAction() + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408043C", (String)"\uff0c\u5b9e\u4f53\u72b6\u6001\uff1a") + entityStatus + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408043E", (String)"\u4e8b\u4ef6\u7c7b\u578b\u7f16\u7801\uff1a") + eventTypeCode);
                try {
                    if ("PC_PRODUCT_BATCHMODIFY".equals(eventTypeCode)) {
                        this.eventService2.sendEvent("YXYBASEDOC", eventTypeCode, (HashMap<String, Object>)tempClss);
                        continue;
                    }
                    this.eventService2.sendEvent("YXYBASEDOC", eventTypeCode, businessObject);
                }
                catch (Exception e) {
                    String SENDFAIL = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408043F", (String)"\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25");
                    log.error(eventType.getDesc() + SENDFAIL + e.getMessage(), (Throwable)e);
                }
            }
        }
        return new RuleExecuteResult();
    }

    private String getEntityStatus(BillContext billContext, List<BizObject> clss) {
        String entityStatus = null;
        if (clss.get(0).get("eventNotify_status") != null) {
            entityStatus = clss.get(0).get("eventNotify_status").toString();
        } else if (clss.get(0).getEntityStatus() != null) {
            entityStatus = clss.get(0).getEntityStatus().toString();
        }
        if ("unstop".equals(billContext.getAction()) || "stop".equals(billContext.getAction()) || "unshelve".equals(billContext.getAction()) || "shelve".equals(billContext.getAction()) || "batchtag".equals(billContext.getAction()) || "batchcleartag".equals(billContext.getAction()) || "batchModify".equals(billContext.getAction()) || "addmerchantsuitorg".equals(billContext.getAction())) {
            entityStatus = null;
        }
        return entityStatus;
    }

    private EventType convertEventType(EventType eventType) {
        if (eventType == EventType.PC_BRAND_UNSTOP) {
            return EventType.PC_BRANDLIST_UNSTOP;
        }
        if (eventType == EventType.PC_BRAND_STOP) {
            return EventType.PC_BRANDLIST_STOP;
        }
        return eventType;
    }
}

