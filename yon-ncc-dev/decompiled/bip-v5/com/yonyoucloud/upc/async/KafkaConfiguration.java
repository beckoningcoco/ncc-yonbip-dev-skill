/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.service.async.KafkaTopicService
 *  org.apache.kafka.clients.admin.NewTopic
 *  org.apache.kafka.common.security.auth.SecurityProtocol
 *  org.apache.kafka.common.security.plain.PlainLoginModule
 *  org.apache.kafka.common.security.scram.ScramLoginModule
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
 *  org.springframework.context.annotation.Bean
 *  org.springframework.kafka.annotation.EnableKafka
 *  org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory
 *  org.springframework.kafka.config.KafkaListenerContainerFactory
 *  org.springframework.kafka.core.ConsumerFactory
 *  org.springframework.kafka.core.DefaultKafkaConsumerFactory
 *  org.springframework.kafka.core.DefaultKafkaProducerFactory
 *  org.springframework.kafka.core.KafkaTemplate
 *  org.springframework.kafka.core.ProducerFactory
 *  org.springframework.kafka.listener.ConcurrentMessageListenerContainer
 *  org.springframework.kafka.listener.ContainerProperties$AckMode
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.async;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.service.async.KafkaTopicService;
import com.yonyoucloud.upc.async.KafkaAuthTypeEnum;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.security.auth.SecurityProtocol;
import org.apache.kafka.common.security.plain.PlainLoginModule;
import org.apache.kafka.common.security.scram.ScramLoginModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.listener.ContainerProperties;
import org.springframework.stereotype.Component;

@Component
@EnableKafka
@ConditionalOnProperty(name={"kafka.cluster.hosts"}, matchIfMissing=false)
public class KafkaConfiguration {
    public static final String SSL_ENDPOINT_IDENTIFICATION_ALGORITHM = "ssl.endpoint.identification.algorithm";
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private KafkaTopicService kafkaTopicService;

    @Bean
    public NewTopic initialMerchantTopic() {
        return new NewTopic(this.kafkaTopicService.getMerchantRangeTopic(), Optional.of(16), Optional.empty());
    }

    @Bean
    public NewTopic initialProductTopic() {
        return new NewTopic(this.kafkaTopicService.getProductRangeTopic(), Optional.of(16), Optional.empty());
    }

    @Bean
    public KafkaTemplate<String, String> kafkaTemplate() {
        return new KafkaTemplate((ProducerFactory)new DefaultKafkaProducerFactory(this.getProducerConfigs()));
    }

    @Bean
    KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, String>> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory factory = new ConcurrentKafkaListenerContainerFactory();
        factory.setConsumerFactory((ConsumerFactory)new DefaultKafkaConsumerFactory(this.getConsumerConfigs()));
        factory.setConcurrency(Integer.valueOf(1));
        factory.setBatchListener(Boolean.valueOf(true));
        factory.getContainerProperties().setAckMode(ContainerProperties.AckMode.MANUAL_IMMEDIATE);
        factory.getContainerProperties().setPollTimeout(this.ymsParamConfig.getKafkaConsumerPolltimeout().longValue());
        return factory;
    }

    private Map<String, Object> getProducerConfigs() {
        Map<String, Object> properties = this.getKafkaPubConfigs();
        properties.put("bootstrap.servers", this.ymsParamConfig.getKafkaClusterHost());
        properties.put("acks", "all");
        properties.put("retries", this.ymsParamConfig.getKafkaRetries());
        properties.put("batch.size", this.ymsParamConfig.getKafkaBatchSize());
        properties.put("linger.ms", 1);
        properties.put("buffer.memory", this.ymsParamConfig.getKafkaBufferMemory());
        properties.put("key.serializer", this.ymsParamConfig.getKafkaProducerKeySerializer());
        properties.put("value.serializer", this.ymsParamConfig.getKafkaProducerKeySerializer());
        properties.put("enable.idempotence", false);
        return properties;
    }

    private Map<String, Object> getConsumerConfigs() {
        Map<String, Object> properties = this.getKafkaPubConfigs();
        properties.put("key.deserializer", this.ymsParamConfig.getKafkaConsumerKeyDeserializer());
        properties.put("value.deserializer", this.ymsParamConfig.getKafkaConsumerKeyDeserializer());
        properties.put("max.poll.records", this.ymsParamConfig.getKafkaConsumerMaxPollRecords());
        properties.put("max.poll.interval.ms", this.ymsParamConfig.getOwnKafkaMaxPollIntervalMs());
        properties.put("session.timeout.ms", this.ymsParamConfig.getOwnKafkaSessionTimeoutMs());
        return properties;
    }

    private Map<String, Object> getKafkaPubConfigs() {
        HashMap<String, Object> properties = new HashMap<String, Object>();
        properties.put("bootstrap.servers", this.ymsParamConfig.getKafkaClusterHost());
        properties.put("group.id", this.ymsParamConfig.getKafkaConsumerGroupId());
        KafkaAuthTypeEnum kafkaAuthTypeEnum = KafkaAuthTypeEnum.safeValueOf(this.ymsParamConfig.getKafkaAuthType());
        if (null != kafkaAuthTypeEnum) {
            this.configureSaslAuth(properties, kafkaAuthTypeEnum, this.ymsParamConfig.getKafkaUserName(), this.ymsParamConfig.getKafkaPassword());
        }
        return properties;
    }

    private static boolean isScramSslAuth(String authType) {
        return KafkaAuthTypeEnum.scram_ssl.name().equalsIgnoreCase(authType);
    }

    private static boolean isScramAuth(String authType) {
        return KafkaAuthTypeEnum.scram.name().equalsIgnoreCase(authType);
    }

    private boolean isPlainAuth(String authType) {
        return KafkaAuthTypeEnum.plain.name().equalsIgnoreCase(authType);
    }

    private boolean isTlsAuth(String authType) {
        return KafkaAuthTypeEnum.ssl.name().equalsIgnoreCase(authType) || KafkaAuthTypeEnum.scram_ssl.name().equalsIgnoreCase(authType);
    }

    private boolean isOnlyTlsAuth(String authType) {
        return KafkaAuthTypeEnum.ssl.name().equalsIgnoreCase(authType);
    }

    private String buildJaasConfig(String loginModule, String username, String password) {
        return String.format("%s required username=\"%s\" password=\"%s\";", loginModule, username, password);
    }

    private void configureSaslAuth(Map<String, Object> config, KafkaAuthTypeEnum authType, String kafkaUserName, String kafkaPassword) {
        String authTypeName = authType.name();
        if (KafkaConfiguration.isScramAuth(authTypeName)) {
            config.put("security.protocol", SecurityProtocol.SASL_PLAINTEXT.name());
            config.put("sasl.mechanism", "SCRAM-SHA-256");
            config.put("sasl.jaas.config", this.buildJaasConfig(ScramLoginModule.class.getName(), kafkaUserName, kafkaPassword));
        } else if (KafkaConfiguration.isScramSslAuth(authTypeName)) {
            config.put("security.protocol", SecurityProtocol.SASL_SSL.name());
            config.put("sasl.mechanism", "SCRAM-SHA-256");
            config.put(SSL_ENDPOINT_IDENTIFICATION_ALGORITHM, "");
            config.put("sasl.jaas.config", this.buildJaasConfig(ScramLoginModule.class.getName(), kafkaUserName, kafkaPassword));
        } else if (this.isPlainAuth(authTypeName)) {
            config.put("security.protocol", SecurityProtocol.SASL_PLAINTEXT.name());
            config.put("sasl.mechanism", "PLAIN");
            config.put("sasl.jaas.config", this.buildJaasConfig(PlainLoginModule.class.getName(), kafkaUserName, kafkaPassword));
        } else if (this.isOnlyTlsAuth(authTypeName)) {
            config.put("security.protocol", SecurityProtocol.SSL.name());
            config.put(SSL_ENDPOINT_IDENTIFICATION_ALGORITHM, "");
        }
    }
}

