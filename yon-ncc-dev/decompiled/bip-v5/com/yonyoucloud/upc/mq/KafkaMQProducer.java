/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.yonyou.iuap.apdoc.coredoc.service.async.KafkaTopicService
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.kafka.core.KafkaTemplate
 *  org.springframework.kafka.support.SendResult
 *  org.springframework.stereotype.Component
 *  org.springframework.util.concurrent.ListenableFuture
 *  org.springframework.util.concurrent.ListenableFutureCallback
 */
package com.yonyoucloud.upc.mq;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yonyou.iuap.apdoc.coredoc.service.async.KafkaTopicService;
import com.yonyoucloud.upc.async.AsyncTask;
import com.yonyoucloud.upc.mq.IMQProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Lazy;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Component(value="asynctask.MQProducer")
@Lazy
@ConditionalOnProperty(name={"kafka.cluster.hosts"}, matchIfMissing=false)
public class KafkaMQProducer
implements IMQProducer {
    private static final Logger log = LoggerFactory.getLogger(KafkaMQProducer.class);
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Autowired
    private KafkaTopicService kafkaTopicService;
    private static Gson gson = new GsonBuilder().create();

    @Override
    public void registerTask(AsyncTask task) {
        this.sendMessage(this.kafkaTopicService.getCoredocDefaultopic(), gson.toJson((Object)task));
    }

    public void sendMessage(final String topic, String data) {
        ListenableFuture future = this.kafkaTemplate.send(topic, (Object)data);
        future.addCallback((ListenableFutureCallback)new ListenableFutureCallback<SendResult<String, String>>(){

            public void onFailure(Throwable e) {
                log.error("kafka sendMessage error, topic = " + topic + e.getMessage(), e);
            }

            public void onSuccess(SendResult<String, String> result) {
                log.debug("kafka sendMessage success topic = {}", (Object)topic);
            }
        });
    }
}

