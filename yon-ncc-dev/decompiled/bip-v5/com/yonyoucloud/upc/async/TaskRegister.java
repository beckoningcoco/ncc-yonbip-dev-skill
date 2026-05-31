/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.async;

import com.yonyoucloud.upc.async.AsyncTask;
import com.yonyoucloud.upc.mq.IMQProducer;
import com.yonyoucloud.upc.mq.KafkaMQProductDetailSaveProducer;
import com.yonyoucloud.upc.mq.KafkaMQProductNewArchProducer;
import com.yonyoucloud.upc.mq.KafkaMQSkuProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TaskRegister {
    @Autowired
    @Lazy
    @Qualifier(value="asynctask.MQProducer")
    private IMQProducer mqProducer;
    @Autowired
    @Lazy
    private KafkaMQSkuProducer kafkaMQSkuProducer;
    @Autowired
    @Lazy
    KafkaMQProductNewArchProducer kafkaMQProductNewArchProducer;
    @Autowired
    @Lazy
    private KafkaMQProductDetailSaveProducer kafkaMQProductDetailSaveProducer;

    public String register(AsyncTask task) throws Exception {
        this.mqProducer.registerTask(task);
        return task.getId();
    }

    public String registerSkuTask(AsyncTask task) throws Exception {
        this.kafkaMQSkuProducer.registerTask(task);
        return task.getId();
    }

    public String registerProductNewArchTask(AsyncTask task) throws Exception {
        this.kafkaMQProductNewArchProducer.registerTask(task);
        return task.getId();
    }

    public String registerProductDetailTask(AsyncTask task) throws Exception {
        this.kafkaMQProductDetailSaveProducer.registerTask(task);
        return task.getId();
    }
}

