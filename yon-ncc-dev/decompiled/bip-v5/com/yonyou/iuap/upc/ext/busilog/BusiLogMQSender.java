/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.service.async.KafkaTopicService
 *  com.yonyou.iuap.log.util.KafkaFutureCallback
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.kafka.common.security.auth.SecurityProtocol
 *  org.imeta.orm.base.BizObject
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeansException
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
 *  org.springframework.context.ApplicationContext
 *  org.springframework.context.ApplicationContextAware
 *  org.springframework.kafka.core.ConsumerFactory
 *  org.springframework.kafka.core.DefaultKafkaConsumerFactory
 *  org.springframework.kafka.core.DefaultKafkaProducerFactory
 *  org.springframework.kafka.core.KafkaTemplate
 *  org.springframework.kafka.core.ProducerFactory
 *  org.springframework.kafka.listener.ContainerProperties
 *  org.springframework.kafka.listener.KafkaMessageListenerContainer
 *  org.springframework.stereotype.Component
 *  org.springframework.util.concurrent.ListenableFutureCallback
 */
package com.yonyou.iuap.upc.ext.busilog;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.service.async.KafkaTopicService;
import com.yonyou.iuap.log.util.KafkaFutureCallback;
import com.yonyou.iuap.upc.ext.busilog.BusiLogKafkaConfig;
import com.yonyou.iuap.upc.ext.busilog.BusiLogMQListener;
import com.yonyou.iuap.upc.ext.busilog.BusiLogMessage;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.async.KafkaAuthTypeEnum;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.lang3.StringUtils;
import org.apache.kafka.common.security.auth.SecurityProtocol;
import org.imeta.orm.base.BizObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.listener.ContainerProperties;
import org.springframework.kafka.listener.KafkaMessageListenerContainer;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Component
@ConditionalOnProperty(name={"kafka.cluster.hosts"}, matchIfMissing=false)
public class BusiLogMQSender
implements ApplicationContextAware {
    private static final Logger log = LoggerFactory.getLogger(BusiLogMQSender.class);
    public static boolean initStatus = false;
    private static volatile boolean isInit = false;
    private static KafkaTemplate<String, String> kafkaTemplate;
    private static BusiLogKafkaConfig busiLogKafkaConfig;
    private static String topic;
    private static final KafkaFutureCallback callback;
    @Autowired
    private KafkaTopicService kafkaTopicService;
    @Autowired
    private YMSParamConfig ymsParamConfig;

    public void setApplicationContext(ApplicationContext applicationContext) {
        try {
            busiLogKafkaConfig = (BusiLogKafkaConfig)applicationContext.getBean(BusiLogKafkaConfig.class);
        }
        catch (BeansException e) {
            log.error("\u4e1a\u52a1\u65e5\u5fd7setApplicationContext\u5f02\u5e38", (Throwable)e);
        }
    }

    public void send(BillContext billContext, Map<String, Object> paramMap, String token, String clientIp, List<BizObject> bills, String serviceCode) {
        this.send(billContext, paramMap, token, clientIp, bills, serviceCode, null);
    }

    public void send(BillContext billContext, Map<String, Object> paramMap, String token, String clientIp, List<BizObject> bills, String serviceCode, String userId) {
        if (!initStatus || kafkaTemplate == null) {
            log.error("\u4e1a\u52a1\u65e5\u5fd7kafka\u94fe\u8def\u521d\u59cb\u5316\u5931\u8d25");
            return;
        }
        try {
            String currentUserId;
            LoginUser currentUser = AppContext.getCurrentUser();
            String string = currentUserId = userId == null ? currentUser.getYhtUserId() : userId;
            if (StringUtils.isBlank((CharSequence)billContext.getFullname())) {
                log.error("\u8868\u5355\u5143\u6570\u636efullName\u4e3a\u7a7a,\u65e0\u6cd5\u6784\u5efa\u5b9e\u4f53\u3002");
                return;
            }
            BusiLogMessage busiLogMessage = new BusiLogMessage(billContext, paramMap, token, clientIp, bills, serviceCode, currentUser.getYhtTenantId(), currentUserId);
            kafkaTemplate.send(topic, (Object)JSONObject.toJSONString((Object)busiLogMessage)).addCallback((ListenableFutureCallback)callback);
        }
        catch (Throwable th) {
            log.error("\u8bb0\u5f55\u4e1a\u52a1\u65e5\u5fd7\u53d1\u751f\u5f02\u5e38,\u5f02\u5e38\u4fe1\u606f\uff1a", th);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void init() {
        if (isInit) return;
        Class<BusiLogMQSender> clazz = BusiLogMQSender.class;
        synchronized (BusiLogMQSender.class) {
            if (isInit) return;
            isInit = true;
            try {
                Properties kafkaConfig = busiLogKafkaConfig.getBusiLogKafkaConfig();
                DefaultKafkaProducerFactory factory = new DefaultKafkaProducerFactory((Map)kafkaConfig);
                kafkaTemplate = new KafkaTemplate((ProducerFactory)factory, false);
                topic = kafkaConfig.getProperty("auditLog.topic");
                KafkaMessageListenerContainer concurrentMsgListenerContainer = this.createConcurrentMsgListenerContainer();
                concurrentMsgListenerContainer.start();
                initStatus = true;
            }
            catch (Throwable th) {
                log.error("\u4e1a\u52a1\u65e5\u5fd7kafka\u521d\u59cb\u5316\u5f02\u5e38:{}", (Object)th.getMessage());
            }
            return;
        }
    }

    private DefaultKafkaConsumerFactory consumerFactory() {
        return new DefaultKafkaConsumerFactory((Map)this.consumerConfig());
    }

    private Properties consumerConfig() {
        Properties propsMap = new Properties();
        Properties kafkaConfig = busiLogKafkaConfig.getBusiLogKafkaConfig();
        if (kafkaConfig == null) {
            log.error("initKafkaTemplate failed, cause kafkaConfig is null");
            initStatus = false;
            return null;
        }
        propsMap.put("bootstrap.servers", kafkaConfig.get("bootstrap.servers"));
        propsMap.put("acks", kafkaConfig.get("acks"));
        propsMap.put("retries", kafkaConfig.get("retries"));
        propsMap.put("max.request.size", kafkaConfig.get("max.request.size"));
        propsMap.put("buffer.memory", kafkaConfig.get("buffer.memory"));
        propsMap.put("batch.size", kafkaConfig.get("batch.size"));
        propsMap.put("linger.ms", kafkaConfig.get("linger.ms"));
        propsMap.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        propsMap.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        propsMap.put("businessLog.index", kafkaConfig.get("businessLog.index"));
        propsMap.put("auditLog.topic", kafkaConfig.get("auditLog.topic"));
        propsMap.put("group.id", kafkaConfig.get("group.id"));
        propsMap.put("session.timeout.ms", kafkaConfig.get("session.timeout.ms"));
        propsMap.put("max.poll.records", kafkaConfig.get("max.poll.records"));
        propsMap.put("max.poll.interval.ms", kafkaConfig.get("max.poll.interval.ms"));
        KafkaAuthTypeEnum kafkaAuthTypeEnum = KafkaAuthTypeEnum.safeValueOf(this.ymsParamConfig.getKafkaAuthType());
        if (null != kafkaAuthTypeEnum) {
            BusiLogKafkaConfig.configureSaslAuth(propsMap, kafkaAuthTypeEnum, this.ymsParamConfig.getKafkaUserName(), this.ymsParamConfig.getKafkaPassword());
        } else {
            propsMap.put("security.protocol", SecurityProtocol.SASL_PLAINTEXT.name);
            propsMap.put("sasl.mechanism", "PLAIN");
            propsMap.put("sasl.jaas.config", "org.apache.kafka.common.security.plain.PlainLoginModule required username=\"" + this.ymsParamConfig.getKafkaUserName() + "\" password=\"" + this.ymsParamConfig.getKafkaPassword() + "\";");
        }
        return propsMap;
    }

    private KafkaMessageListenerContainer createConcurrentMsgListenerContainer() {
        ContainerProperties properties = new ContainerProperties(new String[]{this.kafkaTopicService.getBusinessLogTopic()});
        properties.setMessageListener((Object)new BusiLogMQListener());
        return new KafkaMessageListenerContainer((ConsumerFactory)this.consumerFactory(), properties);
    }

    static {
        callback = new KafkaFutureCallback();
    }
}

