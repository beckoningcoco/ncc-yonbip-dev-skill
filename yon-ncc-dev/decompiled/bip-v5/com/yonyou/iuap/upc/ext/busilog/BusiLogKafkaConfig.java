/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.service.async.KafkaTopicService
 *  com.yonyou.iuap.onpremises.EnvContext
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.kafka.common.security.auth.SecurityProtocol
 *  org.apache.kafka.common.security.plain.PlainLoginModule
 *  org.apache.kafka.common.security.scram.ScramLoginModule
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
 *  org.springframework.core.env.Environment
 *  org.springframework.stereotype.Component
 */
package com.yonyou.iuap.upc.ext.busilog;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.service.async.KafkaTopicService;
import com.yonyou.iuap.onpremises.EnvContext;
import com.yonyoucloud.upc.async.KafkaAuthTypeEnum;
import java.util.Properties;
import org.apache.commons.lang3.StringUtils;
import org.apache.kafka.common.security.auth.SecurityProtocol;
import org.apache.kafka.common.security.plain.PlainLoginModule;
import org.apache.kafka.common.security.scram.ScramLoginModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name={"kafka.cluster.hosts"}, matchIfMissing=false)
public class BusiLogKafkaConfig {
    public static final String SSL_ENDPOINT_IDENTIFICATION_ALGORITHM = "ssl.endpoint.identification.algorithm";
    @Autowired
    private Environment env;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private KafkaTopicService kafkaTopicService;

    public Properties getBusiLogKafkaConfig() {
        if (StringUtils.isBlank((CharSequence)this.ymsParamConfig.getKafkaClusterHost())) {
            return null;
        }
        Properties properties = new Properties();
        properties.put("bootstrap.servers", this.ymsParamConfig.getKafkaClusterHost());
        properties.put("acks", this.ymsParamConfig.getKafkaAcks());
        properties.put("retries", this.ymsParamConfig.getKafkaRetries());
        properties.put("max.request.size", this.ymsParamConfig.getKafkaMaxRequestSize());
        properties.put("buffer.memory", this.ymsParamConfig.getKafkaBufferMemory());
        properties.put("batch.size", this.ymsParamConfig.getKafkaBatchSize());
        properties.put("linger.ms", this.ymsParamConfig.getKafkaLingerMs());
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("businessLog.index", this.getIndex());
        properties.put("auditLog.topic", this.kafkaTopicService.getBusinessLogTopic());
        properties.put("group.id", "iuap_coredoc_group_businesslog");
        properties.put("session.timeout.ms", this.ymsParamConfig.getKafkaSessionTimeoutMs());
        properties.put("max.poll.records", this.ymsParamConfig.getKafkaMaxPollRecords());
        properties.put("max.poll.interval.ms", this.ymsParamConfig.getKafkaMaxPollIntervalMs());
        KafkaAuthTypeEnum kafkaAuthTypeEnum = KafkaAuthTypeEnum.safeValueOf(this.ymsParamConfig.getKafkaAuthType());
        if (null != kafkaAuthTypeEnum) {
            BusiLogKafkaConfig.configureSaslAuth(properties, kafkaAuthTypeEnum, this.ymsParamConfig.getKafkaUserName(), this.ymsParamConfig.getKafkaPassword());
        }
        return properties;
    }

    private static boolean isScramSslAuth(String authType) {
        return KafkaAuthTypeEnum.scram_ssl.name().equalsIgnoreCase(authType);
    }

    private static boolean isScramAuth(String authType) {
        return KafkaAuthTypeEnum.scram.name().equalsIgnoreCase(authType);
    }

    private static boolean isPlainAuth(String authType) {
        return KafkaAuthTypeEnum.plain.name().equalsIgnoreCase(authType);
    }

    private static boolean isTlsAuth(String authType) {
        return KafkaAuthTypeEnum.ssl.name().equalsIgnoreCase(authType) || KafkaAuthTypeEnum.scram_ssl.name().equalsIgnoreCase(authType);
    }

    private static boolean isOnlyTlsAuth(String authType) {
        return KafkaAuthTypeEnum.ssl.name().equalsIgnoreCase(authType);
    }

    private static String buildJaasConfig(String loginModule, String username, String password) {
        return String.format("%s required username=\"%s\" password=\"%s\";", loginModule, username, password);
    }

    public static void configureSaslAuth(Properties config, KafkaAuthTypeEnum authType, String kafkaUserName, String kafkaPassword) {
        String authTypeName = authType.name();
        if (BusiLogKafkaConfig.isScramAuth(authTypeName)) {
            config.put("security.protocol", SecurityProtocol.SASL_PLAINTEXT.name());
            config.put("sasl.mechanism", "SCRAM-SHA-256");
            config.put("sasl.jaas.config", BusiLogKafkaConfig.buildJaasConfig(ScramLoginModule.class.getName(), kafkaUserName, kafkaPassword));
        } else if (BusiLogKafkaConfig.isScramSslAuth(authTypeName)) {
            config.put("security.protocol", SecurityProtocol.SASL_SSL.name());
            config.put("sasl.mechanism", "SCRAM-SHA-256");
            config.put(SSL_ENDPOINT_IDENTIFICATION_ALGORITHM, "");
            config.put("sasl.jaas.config", BusiLogKafkaConfig.buildJaasConfig(ScramLoginModule.class.getName(), kafkaUserName, kafkaPassword));
        } else if (BusiLogKafkaConfig.isPlainAuth(authTypeName)) {
            config.put("security.protocol", SecurityProtocol.SASL_PLAINTEXT.name());
            config.put("sasl.mechanism", "PLAIN");
            config.put("sasl.jaas.config", BusiLogKafkaConfig.buildJaasConfig(PlainLoginModule.class.getName(), kafkaUserName, kafkaPassword));
        } else if (BusiLogKafkaConfig.isOnlyTlsAuth(authTypeName)) {
            config.put("security.protocol", SecurityProtocol.SSL.name());
            config.put(SSL_ENDPOINT_IDENTIFICATION_ALGORITHM, "");
        }
    }

    private String getIndex() {
        if (EnvContext.onPremises()) {
            return "online_es_log_business";
        }
        String profile = this.env.getProperty("mw_profiles_active");
        if ("test".equals(profile)) {
            return "test_es_log_business";
        }
        if ("combine".equals(profile)) {
            return "daily_es_log_business";
        }
        return "online_es_log_business";
    }
}

