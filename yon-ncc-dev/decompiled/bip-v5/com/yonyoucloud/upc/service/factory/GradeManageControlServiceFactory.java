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

import com.yonyoucloud.iuap.upc.api.service.IMCUpdateEventHandler;
import com.yonyoucloud.upc.enums.GradeManageControlServiceEnum;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class GradeManageControlServiceFactory
implements InitializingBean,
ApplicationContextAware {
    private ApplicationContext applicationContext;
    private static final Map<String, IMCUpdateEventHandler> mcUpdateEventHandlerMap = new ConcurrentHashMap<String, IMCUpdateEventHandler>();

    public static IMCUpdateEventHandler getMcUpdateEventHandler(String beanName) {
        return mcUpdateEventHandlerMap.get(Objects.requireNonNull(GradeManageControlServiceEnum.getByEntityName(beanName)).getServiceBeanName());
    }

    public void afterPropertiesSet() throws Exception {
        mcUpdateEventHandlerMap.putAll(this.applicationContext.getBeansOfType(IMCUpdateEventHandler.class));
    }

    public void setApplicationContext(@NotNull ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}

