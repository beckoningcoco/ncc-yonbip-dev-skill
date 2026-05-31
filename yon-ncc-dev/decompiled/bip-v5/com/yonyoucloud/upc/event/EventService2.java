/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.ucf.mdd.common.utils.json.GsonHelper
 *  com.yonyou.ucf.mdd.ext.bill.service.EventSendService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.event;

import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.ucf.mdd.common.utils.json.GsonHelper;
import com.yonyou.ucf.mdd.ext.bill.service.EventSendService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="upcEventService2")
public class EventService2 {
    public static final String YXY_SOURCE_ID = "YXYBASEDOC";
    public static final String DELETE_EVENT = "DELETE_BEFORE";
    public static final String DELETE_NOTIFY = "DELETE_NOTIFY";
    public static final String UPDATE_NOTIFY = "UPDATE_NOTIFY";
    public static final String ADD_NOTIFY = "ADD_NOTIFY";
    public static final String STOP_NOTIFY = "STOP_NOTIFY";
    public static final String UNSTOP_NOTIFY = "UNSTOP_NOTIFY";
    @Autowired
    private EventSendService eventSendService;

    public void sendEvent(String sourceId, String eventType, HashMap<String, Object> userObject) throws Exception {
        this.sendEvent(eventType, userObject, sourceId);
    }

    public void sendEvent(String eventType, HashMap<String, Object> userObject) throws Exception {
        this.sendEvent(eventType, userObject, YXY_SOURCE_ID);
    }

    private void sendEvent(String eventType, HashMap<String, Object> userObject, String yxySourceId) throws Exception {
        userObject.put("access_token", InvocationInfoProxy.getYhtAccessToken());
        userObject.put("yht_access_token", AppContext.getCurrentUser().getYhtAccessToken());
        userObject.put("tenantId", String.valueOf(AppContext.getCurrentUser().getYhtTenantId()));
        HashMap<String, String> configMap = new HashMap<String, String>();
        configMap.put("sourceId", yxySourceId);
        configMap.put("eventType", eventType);
        String config = GsonHelper.ToJSon(configMap);
        HashMap paramMap = new HashMap();
        ArrayList<HashMap<String, Object>> eventBusinessObjectList = new ArrayList<HashMap<String, Object>>();
        eventBusinessObjectList.add(userObject);
        paramMap.put("eventBusinessObjectList", eventBusinessObjectList);
        this.eventSendService.sendEvent(config, paramMap);
    }
}

