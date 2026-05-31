/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.event.EventType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="custService")
public class CustService {
    private static final Logger log = LoggerFactory.getLogger(CustService.class);
    @Autowired
    private EventService2 eventService2;

    public Map stopCustCatogery(BillDataDto bill) throws Exception {
        Object custs = bill.getData();
        ArrayList<Map> list = null;
        if (custs instanceof String) {
            String data = bill.getData().toString();
            list = (List)JSON.parseObject((String)data, List.class);
        } else if (custs instanceof List) {
            list = (ArrayList<Map>)custs;
        } else if (custs instanceof Map) {
            list = new ArrayList<Map>();
            list.add((Map)custs);
        }
        if (list != null && list.size() != 0) {
            for (Map cust : list) {
                if (cust.get("id") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801020);
                }
                try {
                    EventType eventType = EventType.find(bill.getBillnum(), bill.getAction(), null);
                    String eventTypeCode = eventType.toString();
                    HashMap<String, Object> eventObj = new HashMap<String, Object>();
                    eventObj.put("id", cust.get("id"));
                    this.eventService2.sendEvent("YXYBASEDOC", eventTypeCode, eventObj);
                }
                catch (Exception e) {
                    log.error("\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25" + bill.getBillnum() + e.getMessage(), (Throwable)e);
                }
                cust.put("id", Long.valueOf(cust.get("id").toString()));
                SqlHelper.update((String)"com.yonyoucloud.upc.aa.cust.stopCustCategory", cust.get("id"));
                SqlHelper.update((String)"com.yonyoucloud.upc.aa.cust.updateChildStatus", (Object)cust);
            }
        }
        return null;
    }
}

