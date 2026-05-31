/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.springframework.beans.BeansException
 *  org.springframework.beans.factory.InitializingBean
 *  org.springframework.context.ApplicationContext
 *  org.springframework.context.ApplicationContextAware
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.factory;

import com.yonyoucloud.upc.service.datahandle.BillDataPreHandleService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class BillDataPreHandleFactory
implements InitializingBean,
ApplicationContextAware {
    private ApplicationContext applicationContext;
    private static final Map<String, BillDataPreHandleService> billDataPreHandleServiceMap = new ConcurrentHashMap<String, BillDataPreHandleService>();

    public static BillDataPreHandleService getBillDataPreHandleService(String billNum, String action) {
        return billDataPreHandleServiceMap.get(billNum + action);
    }

    public void afterPropertiesSet() throws Exception {
        this.applicationContext.getBeansOfType(BillDataPreHandleService.class).values().forEach(a -> billDataPreHandleServiceMap.put(a.getBillNumAndActionEnum().getBillNum() + a.getBillNumAndActionEnum().getAction(), (BillDataPreHandleService)a));
    }

    public void setApplicationContext(@NotNull ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}

