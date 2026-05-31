/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.service.async.KafkaTopicService
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyoucloud.upc.common.AddRangeMessage
 *  org.apache.kafka.clients.consumer.ConsumerRecord
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
 *  org.springframework.context.annotation.DependsOn
 *  org.springframework.kafka.annotation.KafkaListener
 *  org.springframework.kafka.support.Acknowledgment
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.async;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.service.async.KafkaTopicService;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyoucloud.upc.common.AddRangeMessage;
import com.yonyoucloud.upc.service.addrange.KafkaMerchantAddRangeService;
import com.yonyoucloud.upc.service.product.ProductAddRangeHandleService;
import java.util.Collections;
import java.util.List;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.DependsOn;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component(value="kafkaAddRangeMessageListener")
@ConditionalOnProperty(name={"kafka.cluster.hosts"}, matchIfMissing=false)
@DependsOn(value={"kafkaMQProducerForAddRange"})
public class KafkaAddRangeMessageListener {
    private static final Logger log = LoggerFactory.getLogger(KafkaAddRangeMessageListener.class);
    @Autowired
    private KafkaMerchantAddRangeService merchantAddRangeService;
    @Autowired
    private ProductAddRangeHandleService productAddRangeService;
    @Autowired
    private KafkaTopicService kafkaTopicService;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @KafkaListener(topics={"#{kafkaTopicService.getMerchantRangeTopic()}"}, groupId="iuap_coredoc_group_coredocsyncaddrange")
    public void onMessageForMerchant(List<ConsumerRecord<String, String>> records, Acknowledgment ack) {
        try {
            for (ConsumerRecord<String, String> record : records) {
                if (null == record.value()) continue;
                AddRangeMessage addRangeMessage = (AddRangeMessage)UpcJacksonUtils.OBJECT_MAPPER.readValue((String)record.value(), AddRangeMessage.class);
                RobotExecutors.runAs((String)addRangeMessage.getYTenantId(), () -> {
                    try {
                        this.merchantAddRangeService.dealWithAck(addRangeMessage);
                    }
                    catch (Exception e) {
                        log.error(this.getClass() + ", dealWithAck, exception:" + e.getMessage(), (Throwable)e);
                    }
                });
            }
        }
        catch (Exception e) {
            log.error("onMessageForMerchant_error:" + e.getMessage(), (Throwable)e);
        }
        finally {
            log.info("onMessageForMerchant_success");
            ack.acknowledge();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @KafkaListener(topics={"#{kafkaTopicService.getProductRangeTopic()}"}, groupId="iuap_coredoc_group_coredocsyncaddrange")
    public void onMessageForProduct(List<ConsumerRecord<String, String>> records, Acknowledgment ack) {
        try {
            for (ConsumerRecord<String, String> record : records) {
                if (null == record.value()) continue;
                AddRangeMessage addRangeMessage = (AddRangeMessage)UpcJacksonUtils.OBJECT_MAPPER.readValue((String)record.value(), AddRangeMessage.class);
                RobotExecutors.runAs((String)addRangeMessage.getYTenantId(), (String)addRangeMessage.getLocale(), () -> this.productAddRangeService.dealWithAck(Collections.singletonList(addRangeMessage), addRangeMessage.getDataSource()));
            }
        }
        catch (Exception e) {
            log.error("kafka consumer onMessageForProduct error\uff1a" + e.getMessage(), (Throwable)e);
        }
        finally {
            log.info("kafka consumer onMessageForProduct success,");
            ack.acknowledge();
        }
    }
}

