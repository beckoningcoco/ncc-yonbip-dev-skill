/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  org.apache.kafka.clients.consumer.ConsumerRecord
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.InitializingBean
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
 *  org.springframework.context.annotation.DependsOn
 *  org.springframework.kafka.annotation.KafkaListener
 *  org.springframework.kafka.support.Acknowledgment
 *  org.springframework.retry.RetryCallback
 *  org.springframework.retry.RetryContext
 *  org.springframework.retry.RetryListener
 *  org.springframework.retry.backoff.BackOffPolicy
 *  org.springframework.retry.backoff.ExponentialRandomBackOffPolicy
 *  org.springframework.retry.listener.RetryListenerSupport
 *  org.springframework.retry.support.RetryTemplate
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.async;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyoucloud.upc.service.MQSaveTaskService;
import java.util.List;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.DependsOn;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.retry.RetryCallback;
import org.springframework.retry.RetryContext;
import org.springframework.retry.RetryListener;
import org.springframework.retry.backoff.BackOffPolicy;
import org.springframework.retry.backoff.ExponentialRandomBackOffPolicy;
import org.springframework.retry.listener.RetryListenerSupport;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="upc.asynctask.listener")
@ConditionalOnProperty(name={"kafka.cluster.hosts"}, matchIfMissing=false)
@DependsOn(value={"asynctask.MQProducer"})
public class KafkaTaskMessageListener
implements InitializingBean {
    private static final Logger log = LoggerFactory.getLogger(KafkaTaskMessageListener.class);
    private RetryTemplate retryTemplate;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    @Qualifier(value="mq.saveTaskService")
    private MQSaveTaskService mQSaveTaskService;

    @KafkaListener(topics={"#{kafkaTopicService.getCoredocDefaultopic()}"}, groupId="iuap_coredoc_group_coredocsync")
    public void onMessage(List<ConsumerRecord<?, ?>> records, Acknowledgment ack) {
        try {
            if (!CollectionUtils.isEmpty(records)) {
                this.mQSaveTaskService.dealWithAck(records, ack);
            }
        }
        catch (Throwable e) {
            log.error("com.yonyoucloud.upc.async.KafkaTaskMessageListener MQ Message Handle Error." + e.getMessage(), e);
        }
    }

    public void afterPropertiesSet() {
        this.retryTemplate = new RetryTemplate();
        ExponentialRandomBackOffPolicy backOffPolicy = new ExponentialRandomBackOffPolicy();
        backOffPolicy.setInitialInterval(this.ymsParamConfig.getKafkaListenerInitialInterval().longValue());
        backOffPolicy.setMultiplier(this.ymsParamConfig.getKafkaListenerMultiplier().doubleValue());
        backOffPolicy.setMaxInterval(this.ymsParamConfig.getKafkaListenerMaxInterval().longValue());
        this.retryTemplate.setBackOffPolicy((BackOffPolicy)backOffPolicy);
        this.retryTemplate.setListeners(new RetryListener[]{new RetryListenerSupport(){

            public <T, E extends Throwable> void onError(RetryContext context, RetryCallback<T, E> callback, Throwable t) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408020C", (String)"\u5904\u7406\u5f02\u5e38"), (Object)t.getMessage(), (Object)t);
            }
        }});
    }
}

