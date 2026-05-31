/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.core.JsonProcessingException
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyoucloud.upc.common.AddRangeMessage
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
 *  org.springframework.kafka.core.KafkaTemplate
 *  org.springframework.kafka.support.SendResult
 *  org.springframework.stereotype.Service
 *  org.springframework.util.concurrent.ListenableFuture
 *  org.springframework.util.concurrent.ListenableFutureCallback
 */
package com.yonyoucloud.upc.mq;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyoucloud.upc.common.AddRangeMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Service
@ConditionalOnProperty(name={"kafka.cluster.hosts"}, matchIfMissing=false)
public class KafkaMQProducerForAddRange {
    private static final Logger log = LoggerFactory.getLogger(KafkaMQProducerForAddRange.class);
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(final String topic, AddRangeMessage addRangeMessage) {
        String message;
        try {
            message = UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)addRangeMessage);
        }
        catch (JsonProcessingException e) {
            throw new CoreDocBusinessException(null, "\u53d1\u9001\u6d88\u606f\u6570\u636e\u683c\u5f0f\u5316\u9519\u8bef");
        }
        ListenableFuture future = this.kafkaTemplate.send(topic, (Object)(addRangeMessage.getYTenantId() + addRangeMessage.getId()), (Object)message);
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

