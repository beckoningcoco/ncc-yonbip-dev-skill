/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.yonyou.iuap.apdoc.coredoc.service.async.KafkaTopicService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
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
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
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

@Component
@Lazy
@ConditionalOnProperty(name={"kafka.cluster.hosts"}, matchIfMissing=false)
public class KafkaMQProductDetailSaveProducer
implements IMQProducer {
    private static final Logger log = LoggerFactory.getLogger(KafkaMQProductDetailSaveProducer.class);
    @Autowired
    private KafkaTopicService kafkaTopicService;
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private static Gson gson = new GsonBuilder().create();

    @Override
    public void registerTask(AsyncTask task) {
        try {
            this.sendMessage(this.kafkaTopicService.getProductDetailTopic(), gson.toJson((Object)task));
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807DD", (String)"\u53d1\u9001\u6570\u636e\u51fa\u9519") + e.getMessage(), (Throwable)e);
            throw e;
        }
    }

    public void sendMessage(final String topic, String data) {
        ListenableFuture future = this.kafkaTemplate.send(topic, (Object)data);
        future.addCallback((ListenableFutureCallback)new ListenableFutureCallback<SendResult<String, String>>(){

            public void onFailure(Throwable ex) {
                log.error("kafka sendMessage error, ex = {}, topic = {}", (Object)ex, (Object)topic);
            }

            public void onSuccess(SendResult<String, String> result) {
                log.error("kafka sendMessage success topic = {}", (Object)topic);
            }
        });
    }
}

