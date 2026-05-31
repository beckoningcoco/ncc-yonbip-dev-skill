/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.ApplicationContext
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.cron;

import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyoucloud.iuap.upc.api.cron.ICronJob;
import com.yonyoucloud.iuap.upc.api.message.IMessageHandler;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component(value="upc.cron")
public class JobMessageHandler
implements IMessageHandler {
    private static final Logger log = LoggerFactory.getLogger(JobMessageHandler.class);
    public static final String CRON_EXECUTER = "_executor";
    @Autowired
    private ApplicationContext appContext;

    @Override
    public void handle(Map<String, Object> data) {
        ICronJob job;
        if (data.containsKey(CRON_EXECUTER) && (job = (ICronJob)this.appContext.getBean(data.get(CRON_EXECUTER).toString(), ICronJob.class)) != null) {
            try {
                job.execute(data);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040808FC", (String)"\u5b9a\u65f6\u4efb\u52a1\u6267\u884c\u5931\u8d25 {}\uff1a"), (Object)(data + e.getMessage()), (Object)e);
            }
        }
    }
}

