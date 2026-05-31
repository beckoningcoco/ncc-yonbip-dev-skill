/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.kafka.clients.consumer.ConsumerRecord
 *  org.springframework.kafka.support.Acknowledgment
 */
package com.yonyoucloud.upc.async;

import com.yonyoucloud.upc.async.AsyncTask;
import java.util.List;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.support.Acknowledgment;

public interface TaskExecutor {
    public void dealWithAck(AsyncTask var1) throws Exception;

    public void dealWithAck(List<ConsumerRecord<?, ?>> var1, Acknowledgment var2) throws Exception;
}

