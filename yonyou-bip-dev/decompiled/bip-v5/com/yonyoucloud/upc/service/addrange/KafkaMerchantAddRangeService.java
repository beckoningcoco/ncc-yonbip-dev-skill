/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONArray
 *  com.alibaba.fastjson.JSONObject
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.yonyou.coredoc.service.utils.OrgPermissionsService
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.merchant.service.impl.MerchantAllocateOrgServiceImpl
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.service.async.KafkaTopicService
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.org.dto.BaseOrgDTO
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.common.utils.JacksonUtils
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.poi.model.ProcessData
 *  com.yonyou.ucf.mdd.ext.util.OptionUtils
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyou.ucf.mdd.ext.voucher.enums.Status
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApply
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApplyAddRange
 *  com.yonyoucloud.upc.aa.customerapply.CustomerEffectStatus
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.InvoicingCustomers
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.MerchantDetail
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.upc.attrcontrol.CarryType
 *  com.yonyoucloud.upc.attrcontrol.ControlType
 *  com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfig
 *  com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfigDTO
 *  com.yonyoucloud.upc.common.AddMerchantRangeDTO
 *  com.yonyoucloud.upc.common.AddMerchantSuitOrgEventDTO
 *  com.yonyoucloud.upc.common.AddRangeMessage
 *  com.yonyoucloud.upc.common.AddRangeResultList
 *  com.yonyoucloud.upc.common.MerchantSuitOrgDTO
 *  com.yonyoucloud.upc.common.enums.AddMerchantRangeSourceEnum
 *  com.yonyoucloud.upc.common.enums.DataSource
 *  com.yonyoucloud.upc.service.attrcontrol.DocAttributeControlConfigService
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service.addrange;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yonyou.coredoc.service.utils.OrgPermissionsService;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.merchant.service.impl.MerchantAllocateOrgServiceImpl;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.service.async.KafkaTopicService;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.org.dto.BaseOrgDTO;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.common.utils.JacksonUtils;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.poi.model.ProcessData;
import com.yonyou.ucf.mdd.ext.util.OptionUtils;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyou.ucf.mdd.ext.voucher.enums.Status;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.customerapply.CustomerApply;
import com.yonyoucloud.upc.aa.customerapply.CustomerApplyAddRange;
import com.yonyoucloud.upc.aa.customerapply.CustomerEffectStatus;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.InvoicingCustomers;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.MerchantDetail;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.attrcontrol.CarryType;
import com.yonyoucloud.upc.attrcontrol.ControlType;
import com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfig;
import com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfigDTO;
import com.yonyoucloud.upc.billrule.businesspartner.BusinessPartnerRangeService;
import com.yonyoucloud.upc.common.AddMerchantRangeDTO;
import com.yonyoucloud.upc.common.AddMerchantSuitOrgEventDTO;
import com.yonyoucloud.upc.common.AddRangeMessage;
import com.yonyoucloud.upc.common.AddRangeResultList;
import com.yonyoucloud.upc.common.MerchantSuitOrgDTO;
import com.yonyoucloud.upc.common.enums.AddMerchantRangeSourceEnum;
import com.yonyoucloud.upc.common.enums.DataSource;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.event.EventType;
import com.yonyoucloud.upc.mq.KafkaMQProducerForAddRange;
import com.yonyoucloud.upc.service.MerchantService;
import com.yonyoucloud.upc.service.attrcontrol.DocAttributeControlConfigService;
import com.yonyoucloud.upc.service.merchantapplyrangegroup.MerchantGroupService;
import com.yonyoucloud.upc.service.merchantapplyrangegroup.MerchantRangeShareService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Service
public class KafkaMerchantAddRangeService {
    private static final Logger log = LoggerFactory.getLogger(KafkaMerchantAddRangeService.class);
    @Lazy
    @Autowired
    private KafkaMQProducerForAddRange kafkaMQProducerForAddRange;
    @Autowired
    private IOrgUnitQueryService iOrgUnitQueryService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private MerchantService merchantService;
    @Autowired
    private MerchantGroupService merchantGroupService;
    @Autowired
    private EventService2 eventService2;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    private KafkaTopicService kafkaTopicService;
    @Autowired
    private MerchantRangeShareService merchantRangeShareService;
    @Autowired
    private DocAttributeControlConfigService docAttributeControlConfigService;
    @Autowired
    private IUPCBillService billService;
    @Autowired
    private OrgPermissionsService orgPermissionsService;
    @Autowired
    private PubOptionDataQueryUtil pubOptionDataQueryUtil;
    @Autowired
    BusinessPartnerRangeService partnerRangeService;
    @Autowired
    MerchantAllocateOrgServiceImpl merchantAllocateOrgService;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    public static final String KAFKA_MERCHANT_ADD_RANGE_COUNT = "kafkaMerchantAddRangeCount";
    public static final String SYNC_MERCHANT_ADD_RANGE = "syncMerchantAddRange";
    private static final Gson GSON = new GsonBuilder().create();

    public String sendWebMerchantSuitOrg(BillDataDto bill) {
        if ("aa_merchantlist".equals(bill.getBillnum()) && "addmerchantsuitorg".equals(bill.getAction())) {
            String applyRangeLockKey = "APPLY_RANGE_MERCHANT" + AppContext.getTenantId();
            boolean isMerchantAddRange = AppContext.cache().exists(applyRangeLockKey);
            if (isMerchantAddRange) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.APPLY_RANGE_PARALLEL_DEAL_ERROR.getMultilingualMessage());
            }
            if (null != bill.getExternalData() && bill.getExternalData() instanceof Map) {
                Map externalData = (Map)bill.getExternalData();
                if ("2".equals(externalData.get("rangeMethod"))) {
                    String requestId = UUID.randomUUID().toString();
                    List<Object> merchantList = new ArrayList();
                    List orgIds = new ArrayList();
                    try {
                        Map orgDataMap = (Map)JSONObject.parseObject((String)bill.getData().toString(), Map.class);
                        if (orgDataMap.get("orgIds") instanceof List) {
                            merchantList = this.merchantRangeShareService.queryMerchantCancelSuitOrg(bill);
                            orgIds = (List)orgDataMap.get("orgIds");
                        }
                    }
                    catch (Exception e) {
                        log.error("sendWebMerchantSuitOrg\u5f02\u5e38\u4fe1\u606f:{}!", (Object)e.getMessage(), (Object)e);
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801021);
                    }
                    if (!CollectionUtils.isEmpty(orgIds) && !CollectionUtils.isEmpty(merchantList)) {
                        ProcessData.builder((int)1, (int)200, null, null).percentage("0").build(requestId, Integer.valueOf(600));
                        ArrayList<AddRangeMessage> addRangeMessageList = new ArrayList<AddRangeMessage>();
                        for (Merchant merchant : merchantList) {
                            AddRangeMessage addRangeMessage = new AddRangeMessage();
                            addRangeMessage.setId((Long)merchant.getId());
                            addRangeMessage.setOrgIdList(orgIds);
                            addRangeMessage.setBatchNo(requestId);
                            addRangeMessage.setBatchCount(String.valueOf(merchantList.size()));
                            addRangeMessage.setArchiveType("aa_merchant");
                            addRangeMessage.setDataSource(DataSource.WEB_MERCHANT_SUIT_ORG.getSource());
                            addRangeMessage.setAllocatorId((Long)AppContext.getCurrentUser().getId());
                            addRangeMessage.setAllocatorName(AppContext.getCurrentUser().getName());
                            addRangeMessage.setYTenantId((String)AppContext.getYTenantId());
                            addRangeMessageList.add(addRangeMessage);
                        }
                        this.merchantRangeApply(addRangeMessageList);
                        return requestId;
                    }
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL);
                }
                if ("1".equals(externalData.get("rangeMethod"))) {
                    JSONArray list = null;
                    if (bill.getData() instanceof String) {
                        list = JSON.parseArray((String)((String)bill.getData()));
                    } else if (bill.getData() instanceof List) {
                        list = JSON.parseArray((String)JSONObject.toJSONString((Object)bill.getData()));
                    }
                    if (list != null) {
                        String requestId = UUID.randomUUID().toString();
                        int size = list.size();
                        ProcessData.builder((int)1, (int)200, null, null).percentage("0").build(requestId, Integer.valueOf(600));
                        int syncCount = 0;
                        for (int i = 0; i < list.size(); ++i) {
                            JSONObject jSONObject = list.getJSONObject(i);
                            MerchantSuitOrgDTO merchantSuitOrgDTO = (MerchantSuitOrgDTO)JSON.parseObject((String)jSONObject.toJSONString(), MerchantSuitOrgDTO.class);
                            syncCount += merchantSuitOrgDTO.getOrgIds().size();
                        }
                        int syncAllocateOrgCount = this.pubOptionService.getSyncAllocateOrgCount();
                        ArrayList<AddRangeMessage> arrayList = new ArrayList<AddRangeMessage>();
                        for (int i = 0; i < list.size(); ++i) {
                            JSONObject jsonObject = list.getJSONObject(i);
                            MerchantSuitOrgDTO merchantSuitOrgDTO = (MerchantSuitOrgDTO)JSON.parseObject((String)jsonObject.toJSONString(), MerchantSuitOrgDTO.class);
                            AddRangeMessage addRangeMessage = new AddRangeMessage();
                            addRangeMessage.setId(Long.valueOf(Long.parseLong(merchantSuitOrgDTO.getMerchantId())));
                            addRangeMessage.setOrgIdList(merchantSuitOrgDTO.getOrgIds());
                            addRangeMessage.setBatchNo(requestId);
                            addRangeMessage.setBatchCount(String.valueOf(size));
                            addRangeMessage.setArchiveType("aa_merchant");
                            addRangeMessage.setDataSource(DataSource.WEB_MERCHANT_SUIT_ORG.getSource());
                            addRangeMessage.setAllocatorId((Long)AppContext.getCurrentUser().getId());
                            addRangeMessage.setAllocatorName(AppContext.getCurrentUser().getName());
                            addRangeMessage.setYTenantId((String)AppContext.getYTenantId());
                            arrayList.add(addRangeMessage);
                            if (syncCount <= syncAllocateOrgCount) {
                                this.dealWithAck(addRangeMessage);
                                continue;
                            }
                            this.kafkaMQProducerForAddRange.sendMessage(this.kafkaTopicService.getMerchantRangeTopic(), addRangeMessage);
                        }
                        this.merchantRangeApply(arrayList);
                        return requestId;
                    }
                }
            }
        }
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801021);
    }

    public ResultList sendYqlMerchantSuitOrg(Map map) {
        String requestId = UUID.randomUUID().toString();
        List datalist = (List)map.get("data");
        if (datalist == null || datalist.isEmpty()) {
            log.error("\u5ba2\u6237\u5206\u914d\u5173\u7cfb\u540c\u6b65\u5f02\u5e38\u4fe1\u606f:data\u6570\u636e\u4e3a\u7a7a!");
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801022);
        }
        if (datalist.size() > 300) {
            log.error("\u5ba2\u6237\u5206\u914d\u5173\u7cfb\u540c\u6b65\u5f02\u5e38\u4fe1\u606f:\u5206\u9875\u6570\u4e0d\u80fd\u8d85\u8fc7300!");
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801023);
        }
        ResultList resultList = new ResultList();
        HashMap<String, String> erpCodeMap = new HashMap<String, String>();
        ArrayList<AddRangeMessage> addRangeMessageList = new ArrayList<AddRangeMessage>();
        for (Map data : datalist) {
            String erpCode = String.valueOf(data.get("erpCode"));
            try {
                if (ObjectUtils.isEmpty(data.get("merchantId")) || ObjectUtils.isEmpty(data.get("orgId"))) {
                    throw new CoreDocBusinessException("merchantId or orgId is empty");
                }
                Long merchantId = Long.parseLong(data.get("merchantId").toString());
                String orgId = data.get("orgId").toString();
                erpCodeMap.put(merchantId + orgId, erpCode);
                AddRangeMessage addRangeMessage = new AddRangeMessage();
                addRangeMessage.setId(merchantId);
                ArrayList<String> orgIdList = new ArrayList<String>();
                orgIdList.add(orgId);
                addRangeMessage.setOrgIdList(orgIdList);
                addRangeMessage.setBatchNo(requestId);
                addRangeMessage.setBatchCount(String.valueOf(datalist.size()));
                addRangeMessage.setArchiveType("aa_merchant");
                addRangeMessage.setDataSource(DataSource.YQL_MERCHANT_SUIT_ORG.getSource());
                addRangeMessage.setAllocatorId((Long)AppContext.getCurrentUser().getId());
                addRangeMessage.setAllocatorName(AppContext.getCurrentUser().getName());
                addRangeMessage.setYTenantId((String)AppContext.getYTenantId());
                addRangeMessageList.add(addRangeMessage);
            }
            catch (Exception e) {
                resultList.addMessage(this.buildMessage(erpCode, e.getMessage()));
                resultList.incFailCount();
                log.error("sendYqlMerchantSuitOrg_error:" + e.getMessage(), (Throwable)e);
            }
        }
        if (!CollectionUtils.isEmpty(addRangeMessageList)) {
            AddRangeResultList addRangeResultList = this.dealWithAck(addRangeMessageList, erpCodeMap, DataSource.YQL_MERCHANT_SUIT_ORG.getSource(), requestId);
            if (!CollectionUtils.isEmpty((Collection)addRangeResultList.getInfos())) {
                for (Object info : addRangeResultList.getInfos()) {
                    resultList.addInfo(info);
                    resultList.incSucessCount();
                }
            }
            if (!CollectionUtils.isEmpty((Collection)addRangeResultList.getMessages())) {
                for (Object message : addRangeResultList.getMessages()) {
                    resultList.addMessage(message);
                    resultList.incFailCount();
                }
            }
        }
        resultList.setCount(datalist.size());
        return resultList;
    }

    public void sendMcMerchantSuitOrg(List<String> merchantIdList, List<String> orgList) {
        String requestId = UUID.randomUUID().toString();
        ArrayList<AddRangeMessage> addRangeMessageList = new ArrayList<AddRangeMessage>();
        for (String merchantId : merchantIdList) {
            try {
                AddRangeMessage addRangeMessage = new AddRangeMessage();
                addRangeMessage.setId(Long.valueOf(Long.parseLong(merchantId)));
                addRangeMessage.setOrgIdList(orgList);
                addRangeMessage.setBatchNo(requestId);
                addRangeMessage.setBatchCount("1");
                addRangeMessage.setArchiveType("aa_merchant");
                addRangeMessage.setDataSource(DataSource.MC_MERCHANT_SUIT_ORG.getSource());
                addRangeMessage.setAllocatorId((Long)AppContext.getCurrentUser().getId());
                addRangeMessage.setAllocatorName(AppContext.getCurrentUser().getName());
                addRangeMessage.setYTenantId((String)AppContext.getYTenantId());
                addRangeMessageList.add(addRangeMessage);
            }
            catch (Exception e) {
                log.error("sendMCMerchantSuitOrg_error:" + e.getMessage(), (Throwable)e);
            }
            this.merchantRangeApply(addRangeMessageList);
        }
    }

    public ResultList sendApiMerchantSuitOrg(BillDataDto bill) {
        ResultList resultList = new ResultList();
        if ("aa_merchantlist".equals(bill.getBillnum()) && "addmerchantsuitorg".equals(bill.getAction())) {
            String applyRangeLockKey = "APPLY_RANGE_MERCHANT" + AppContext.getTenantId();
            boolean isMerchantAddRange = AppContext.cache().exists(applyRangeLockKey);
            if (isMerchantAddRange) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.APPLY_RANGE_PARALLEL_DEAL_ERROR.getMultilingualMessage());
            }
            JSONArray list = null;
            if (bill.getData() instanceof String) {
                list = JSON.parseArray((String)((String)bill.getData()));
            } else if (bill.getData() instanceof List) {
                list = JSON.parseArray((String)JSONObject.toJSONString((Object)bill.getData()));
            }
            if (list != null) {
                String requestId = UUID.randomUUID().toString();
                int size = list.size();
                ArrayList<AddRangeMessage> addRangeMessageList = new ArrayList<AddRangeMessage>();
                for (int i = 0; i < list.size(); ++i) {
                    JSONObject jsonObject = list.getJSONObject(i);
                    MerchantSuitOrgDTO merchantSuitOrgDTO = (MerchantSuitOrgDTO)JSON.parseObject((String)jsonObject.toJSONString(), MerchantSuitOrgDTO.class);
                    AddRangeMessage addRangeMessage = new AddRangeMessage();
                    addRangeMessage.setId(Long.valueOf(Long.parseLong(merchantSuitOrgDTO.getMerchantId())));
                    addRangeMessage.setOrgIdList(merchantSuitOrgDTO.getOrgIds());
                    addRangeMessage.setBatchNo(requestId);
                    addRangeMessage.setBatchCount(String.valueOf(size));
                    addRangeMessage.setArchiveType("aa_merchant");
                    addRangeMessage.setDataSource(DataSource.API_MERCHANT_SUIT_ORG.getSource());
                    addRangeMessage.setAllocatorId((Long)AppContext.getCurrentUser().getId());
                    addRangeMessage.setAllocatorName(AppContext.getCurrentUser().getName());
                    addRangeMessage.setYTenantId((String)AppContext.getYTenantId());
                    addRangeMessageList.add(addRangeMessage);
                }
                AddRangeResultList addRangeResultList = this.dealWithAck(addRangeMessageList, null, DataSource.API_MERCHANT_SUIT_ORG.getSource(), requestId);
                if (!CollectionUtils.isEmpty((Collection)addRangeResultList.getInfos())) {
                    for (Object info : addRangeResultList.getInfos()) {
                        resultList.addInfo(info);
                    }
                }
                if (!CollectionUtils.isEmpty((Collection)addRangeResultList.getMessages())) {
                    for (Object message : addRangeResultList.getMessages()) {
                        resultList.addMessage(message);
                        resultList.incFailCount();
                    }
                    resultList.setFailInfos(addRangeResultList.getFailInfos());
                }
                resultList.setSucessCount(size - resultList.getFailCount());
                resultList.setCount(size);
            }
        }
        return resultList;
    }

    public void sendCustomerApplyAddRange(CustomerApply customerApply) {
        if (customerApply.getApplyCustomer() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800099);
        }
        String requestId = UUID.randomUUID().toString();
        AddRangeMessage addRangeMessage = new AddRangeMessage();
        addRangeMessage.setId(customerApply.getApplyCustomer());
        addRangeMessage.setCustomerApplyId((Long)customerApply.getId());
        addRangeMessage.setBatchNo(requestId);
        addRangeMessage.setBatchCount("1");
        addRangeMessage.setArchiveType("aa_customerapply");
        addRangeMessage.setDataSource(DataSource.CUSTOMER_APPLY_ADD_RANGE.getSource());
        addRangeMessage.setAllocatorId(customerApply.getCreatorId());
        addRangeMessage.setAllocatorName(customerApply.getCreator());
        addRangeMessage.setYTenantId((String)AppContext.getYTenantId());
        this.merchantRangeApply(Arrays.asList(addRangeMessage));
    }

    private void merchantRangeApply(List<AddRangeMessage> addRangeMessageList) {
        if (this.ymsParamConfig.useKafka() && this.pubOptionService.getSyncAllocateOrgCount() <= addRangeMessageList.size()) {
            for (AddRangeMessage addRangeMessage : addRangeMessageList) {
                this.kafkaMQProducerForAddRange.sendMessage(this.kafkaTopicService.getMerchantRangeTopic(), addRangeMessage);
            }
        } else {
            for (AddRangeMessage addRangeMessage : addRangeMessageList) {
                this.dealWithAck(addRangeMessage);
            }
        }
    }

    public AddRangeResultList dealWithAck(AddRangeMessage addRangeMessage) {
        ArrayList<AddRangeMessage> addRangeMessageList = new ArrayList<AddRangeMessage>();
        addRangeMessageList.add(addRangeMessage);
        return this.dealWithAck(addRangeMessageList, null, addRangeMessage.getDataSource(), addRangeMessage.getBatchNo());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AddRangeResultList dealWithAck(List<AddRangeMessage> addRangeMessageList, Map<String, String> erpCodeMap, String dataSource, String batchNo) {
        AddRangeResultList addRangeResultList = new AddRangeResultList();
        String kafkaMerchantAddRangeCountLockKey = KAFKA_MERCHANT_ADD_RANGE_COUNT + AppContext.getTenantId();
        String syncMerchantAddRangeLockKey = SYNC_MERCHANT_ADD_RANGE + AppContext.getTenantId();
        boolean tryGetLockError = false;
        String kafkaMerchantAddRangeCountLockValue = AppContext.cache().get(kafkaMerchantAddRangeCountLockKey);
        try {
            block28: {
                boolean tryGetLock;
                block32: {
                    block29: {
                        block31: {
                            block30: {
                                if (StringUtils.hasText((String)kafkaMerchantAddRangeCountLockValue) && !"0".equals(kafkaMerchantAddRangeCountLockValue)) break block29;
                                if (!RedisTool.tryGetLock((String)syncMerchantAddRangeLockKey, (String)batchNo, (int)3600)) break block30;
                                if (DataSource.WEB_MERCHANT_SUIT_ORG.getSource().equals(dataSource) || DataSource.CUSTOMER_APPLY_ADD_RANGE.getSource().equals(dataSource)) {
                                    AppContext.cache().incr(kafkaMerchantAddRangeCountLockKey);
                                    AppContext.cache().expire(kafkaMerchantAddRangeCountLockKey, 3600);
                                }
                                break block28;
                            }
                            if (!DataSource.CUSTOMER_APPLY_ADD_RANGE.getSource().equals(dataSource)) break block31;
                            try {
                                TimeUnit.MILLISECONDS.sleep(200L);
                            }
                            catch (InterruptedException e) {
                                log.error(e.getMessage(), (Throwable)e);
                            }
                            if (!RedisTool.tryGetLock((String)syncMerchantAddRangeLockKey, (String)batchNo, (int)3600)) {
                                tryGetLockError = true;
                                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.APPLY_RANGE_PARALLEL_DEAL_ERROR.getMultilingualMessage());
                            }
                            AppContext.cache().incr(kafkaMerchantAddRangeCountLockKey);
                            AppContext.cache().expire(kafkaMerchantAddRangeCountLockKey, 3600);
                            break block28;
                        }
                        if (!DataSource.API_MERCHANT_SUIT_ORG.getSource().equals(dataSource)) {
                            tryGetLockError = true;
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.APPLY_RANGE_PARALLEL_DEAL_ERROR.getMultilingualMessage());
                        }
                        tryGetLock = false;
                        break block32;
                    }
                    if (DataSource.WEB_MERCHANT_SUIT_ORG.getSource().equals(dataSource) || DataSource.CUSTOMER_APPLY_ADD_RANGE.getSource().equals(dataSource)) {
                        AppContext.cache().incr(kafkaMerchantAddRangeCountLockKey);
                        AppContext.cache().expire(kafkaMerchantAddRangeCountLockKey, 3600);
                        break block28;
                    } else {
                        if (DataSource.API_MERCHANT_SUIT_ORG.getSource().equals(dataSource)) throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.APPLY_RANGE_PARALLEL_DEAL_ERROR.getMultilingualMessage());
                        if (DataSource.MC_MERCHANT_SUIT_ORG.getSource().equals(dataSource)) throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.APPLY_RANGE_PARALLEL_DEAL_ERROR.getMultilingualMessage());
                        if (DataSource.YQL_MERCHANT_SUIT_ORG.getSource().equals(dataSource)) {
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.APPLY_RANGE_PARALLEL_DEAL_ERROR.getMultilingualMessage());
                        }
                    }
                    break block28;
                }
                for (int i = 0; i < 25 && !tryGetLock; ++i) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(200L);
                    }
                    catch (InterruptedException e) {
                        log.error(e.getMessage(), (Throwable)e);
                    }
                    if (!RedisTool.tryGetLock((String)syncMerchantAddRangeLockKey, (String)batchNo, (int)3600)) continue;
                    tryGetLock = true;
                }
                if (!tryGetLock) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.APPLY_RANGE_PARALLEL_DEAL_ERROR.getMultilingualMessage());
                }
            }
            if (DataSource.WEB_MERCHANT_SUIT_ORG.getSource().equals(dataSource)) {
                addRangeResultList = this.dealAddMerchantSuitOrg(addRangeMessageList.get(0));
                if (!CollectionUtils.isEmpty((Collection)addRangeResultList.getAddMerchantSuitOrgEventDTOList())) {
                    this.eventAddMerchantSuitOrg(addRangeResultList.getAddMerchantSuitOrgEventDTOList(), addRangeMessageList.get(0));
                }
                if (!CollectionUtils.isEmpty((Collection)addRangeResultList.getMessages())) {
                    this.processDataWebMerchantSuitOrg(addRangeMessageList.get(0), true, GSON.toJson((Object)addRangeResultList.getMessages()));
                    return addRangeResultList;
                }
                this.processDataWebMerchantSuitOrg(addRangeMessageList.get(0), false, null);
                return addRangeResultList;
            }
            if (DataSource.MC_MERCHANT_SUIT_ORG.getSource().equals(dataSource)) {
                this.dealAddMerchantSuitOrg(addRangeMessageList.get(0));
                return addRangeResultList;
            }
            if (DataSource.YQL_MERCHANT_SUIT_ORG.getSource().equals(dataSource)) {
                addRangeResultList = this.dealAddMerchantSuitOrg(addRangeMessageList, erpCodeMap, DataSource.YQL_MERCHANT_SUIT_ORG.getSource());
                return addRangeResultList;
            }
            if (DataSource.API_MERCHANT_SUIT_ORG.getSource().equals(dataSource)) {
                addRangeResultList = this.dealAddMerchantSuitOrg(addRangeMessageList, erpCodeMap, DataSource.API_MERCHANT_SUIT_ORG.getSource());
                if (CollectionUtils.isEmpty((Collection)addRangeResultList.getAddMerchantSuitOrgEventDTOList())) return addRangeResultList;
                this.eventAddMerchantSuitOrg(addRangeResultList.getAddMerchantSuitOrgEventDTOList(), addRangeMessageList.get(0));
                return addRangeResultList;
            }
            if (!DataSource.CUSTOMER_APPLY_ADD_RANGE.getSource().equals(dataSource)) return addRangeResultList;
            this.dealAddMerchantSuitOrgFromCustomerApply(addRangeMessageList);
            return addRangeResultList;
        }
        catch (Exception e) {
            log.error("{}KafkaMerchantAddRangeService_dealWithAck:{}", new Object[]{dataSource, e.getMessage(), e});
            if (DataSource.WEB_MERCHANT_SUIT_ORG.getSource().equals(dataSource)) {
                this.processDataWebMerchantSuitOrg(addRangeMessageList.get(0), true, e.getMessage());
                return addRangeResultList;
            }
            if (!(DataSource.YQL_MERCHANT_SUIT_ORG.getSource().equals(dataSource) || DataSource.API_MERCHANT_SUIT_ORG.getSource().equals(dataSource) || DataSource.MC_MERCHANT_SUIT_ORG.getSource().equals(dataSource))) {
                if (!DataSource.CUSTOMER_APPLY_ADD_RANGE.getSource().equals(dataSource)) return addRangeResultList;
                throw new CoreDocBusinessException(e.getMessage());
            }
            if (!StringUtils.hasText((String)kafkaMerchantAddRangeCountLockValue)) throw new CoreDocBusinessException(e.getMessage());
            if (Integer.parseInt(kafkaMerchantAddRangeCountLockValue) >= 0) throw new CoreDocBusinessException(e.getMessage());
            AppContext.cache().del(new String[]{kafkaMerchantAddRangeCountLockKey});
            throw new CoreDocBusinessException(e.getMessage());
        }
        finally {
            if (DataSource.WEB_MERCHANT_SUIT_ORG.getSource().equals(dataSource) && !tryGetLockError) {
                AppContext.cache().decr(kafkaMerchantAddRangeCountLockKey);
            } else if (DataSource.CUSTOMER_APPLY_ADD_RANGE.getSource().equals(dataSource) && !tryGetLockError) {
                AppContext.cache().decr(kafkaMerchantAddRangeCountLockKey);
            }
            RedisTool.releaseLock((String)syncMerchantAddRangeLockKey, (String)batchNo);
        }
    }

    public AddRangeResultList dealAddMerchantSuitOrg(AddRangeMessage addRangeMessage) throws Exception {
        return this.dealAddMerchantSuitOrg(addRangeMessage, new HashMap<String, String>());
    }

    public AddRangeResultList dealAddMerchantSuitOrg(AddRangeMessage addRangeMessage, Map<String, String> erpCodeMap) throws Exception {
        ArrayList<AddRangeMessage> addRangeMessageList = new ArrayList<AddRangeMessage>();
        addRangeMessageList.add(addRangeMessage);
        return this.dealAddMerchantSuitOrg(addRangeMessageList, erpCodeMap, addRangeMessage.getDataSource());
    }

    @Transactional(rollbackFor={Throwable.class})
    public AddRangeResultList dealAddMerchantSuitOrg(List<AddRangeMessage> addRangeMessageList, Map<String, String> erpCodeMap, String dataSource) throws Exception {
        List funcOrgesByCodeList;
        AddRangeResultList addRangeResultList = new AddRangeResultList();
        if (this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant").booleanValue()) {
            return addRangeResultList;
        }
        ArrayList<Long> merchantIdList = new ArrayList<Long>();
        ArrayList<String> orgIdList = new ArrayList<String>();
        ArrayList<String> orgIdListInDb = new ArrayList<String>();
        HashMap<String, String> orgNameMap = new HashMap<String, String>();
        ArrayList<AddMerchantRangeDTO> addMerchantRangeDTOList = new ArrayList<AddMerchantRangeDTO>();
        for (AddRangeMessage addRangeMessage2 : addRangeMessageList) {
            List addRangeMessageOrgIdList;
            if (!merchantIdList.contains(addRangeMessage2.getId())) {
                merchantIdList.add(addRangeMessage2.getId());
            }
            if (CollectionUtils.isEmpty((Collection)(addRangeMessageOrgIdList = addRangeMessage2.getOrgIdList()))) continue;
            for (String orgId : addRangeMessageOrgIdList) {
                if (orgIdList.contains(orgId)) continue;
                orgIdList.add(orgId);
            }
        }
        if (!CollectionUtils.isEmpty(orgIdList) && !CollectionUtils.isEmpty((Collection)(funcOrgesByCodeList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(orgIdList).withEnabled())))) {
            for (OrgUnitDTO orgUnitDTO : funcOrgesByCodeList) {
                orgNameMap.put(orgUnitDTO.getId(), orgUnitDTO.getName());
                orgIdListInDb.add(orgUnitDTO.getId());
            }
        }
        HashMap<Long, String> nameMap = new HashMap<Long, String>();
        HashMap<Long, Merchant> hashMap = new HashMap<Long, Merchant>();
        HashMap<String, String> createOrgNameMap = new HashMap<String, String>();
        ArrayList<String> createOrgIdInDbList = new ArrayList<String>();
        HashMap<String, DocAttributeControlConfigDTO> orgDocAttributeControlConfigMap = new HashMap<String, DocAttributeControlConfigDTO>();
        HashMap<String, DocAttributeControlConfigDTO> orgDocAttributeControlConfigOnlyMap = new HashMap<String, DocAttributeControlConfigDTO>();
        HashMap<Long, Set> orgRangeShareListMap = new HashMap<Long, Set>();
        QueryConditionGroup queryCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(merchantIdList)});
        QuerySchema querySchema = QuerySchema.create().addSelect("id,code,name,createOrg, businessPartner").addCondition((ConditionExpression)queryCondition);
        List merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantInDbList)) {
            List funcOrgesByCodeList2;
            for (Object merchant : merchantInDbList) {
                Set orgRangeShareSet;
                nameMap.put((Long)merchant.getId(), merchant.getName());
                hashMap.put((Long)merchant.getId(), (Merchant)merchant);
                createOrgIdInDbList.add(merchant.getCreateOrg());
                if (DataSource.MC_MERCHANT_SUIT_ORG.getSource().equals(dataSource) || CollectionUtils.isEmpty((Collection)(orgRangeShareSet = this.orgPermissionsService.getShareOrgDetailByManageOrg4BillDate("aa.merchant.Merchant", merchant.getCreateOrg(), (BizObject)merchant)))) continue;
                orgRangeShareListMap.put((Long)merchant.getId(), orgRangeShareSet);
            }
            if (DataSource.MC_MERCHANT_SUIT_ORG.getSource().equals(dataSource)) {
                addRangeMessageList.forEach(addRangeMessage -> orgRangeShareListMap.put(addRangeMessage.getId(), new HashSet(addRangeMessage.getOrgIdList())));
            }
            if (!CollectionUtils.isEmpty((Collection)(funcOrgesByCodeList2 = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(createOrgIdInDbList).withEnabled())))) {
                for (OrgUnitDTO orgUnitDTO : funcOrgesByCodeList2) {
                    createOrgNameMap.put(orgUnitDTO.getId(), orgUnitDTO.getName());
                }
            }
        }
        List<String> authOrgIdList = this.upcControlRuleService.getManageOrgList("aa.merchant.Merchant", "aa_merchant");
        for (String createOrgIdInDb : createOrgIdInDbList) {
            DocAttributeControlConfigDTO docAttributeControlConfigOnly;
            DocAttributeControlConfigDTO docAttributeControlConfigDTO = this.docAttributeControlConfigService.queryAttrControlConfigForOrg("aa.merchant.Merchant", createOrgIdInDb);
            if (docAttributeControlConfigDTO != null) {
                orgDocAttributeControlConfigMap.put(createOrgIdInDb, docAttributeControlConfigDTO);
            }
            if ((docAttributeControlConfigOnly = this.docAttributeControlConfigService.queryAttrControlConfigOnlyForOrgAdd("aa.merchant.Merchant", createOrgIdInDb)) == null) continue;
            orgDocAttributeControlConfigOnlyMap.put(createOrgIdInDb, docAttributeControlConfigOnly);
        }
        Map<String, String> rangeMapInDb = this.getRangeMapInDb(merchantIdList, orgIdList);
        Map<String, MerchantApplyRangeDetail> creatorRangeDetailMapInDb = this.getCreatorRangeDetailMapInDb(merchantIdList, createOrgIdInDbList);
        Map<String, MerchantDetail> creatorDetailMapInDb = this.getCreatorDetailMapInDb(merchantIdList);
        boolean wbeError = false;
        HashSet<String> distinctRange = new HashSet<String>();
        for (AddRangeMessage addRangeMessage3 : addRangeMessageList) {
            Object orgId22;
            Long merchantId = addRangeMessage3.getId();
            List addRangeMessageOrgIdList = addRangeMessage3.getOrgIdList();
            ArrayList<String> webMessageList = new ArrayList<String>();
            ArrayList<String> webSubtractOrgNameList = new ArrayList<String>();
            for (Object orgId22 : addRangeMessageOrgIdList) {
                String creatorOrgId;
                boolean error = false;
                if (CollectionUtils.isEmpty(creatorDetailMapInDb) || creatorDetailMapInDb.get(merchantId.toString()) == null) {
                    error = true;
                    if (DataSource.YQL_MERCHANT_SUIT_ORG.getSource().equals(addRangeMessage3.getDataSource())) {
                        addRangeResultList.addMessage(this.buildMessage(erpCodeMap.get(merchantId + (String)orgId22), InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C29EEA405A8000E", (String)"\u5ba2\u6237\u4e0d\u5b58\u5728!")));
                    } else if (DataSource.WEB_MERCHANT_SUIT_ORG.getSource().equals(addRangeMessage3.getDataSource()) || DataSource.API_MERCHANT_SUIT_ORG.getSource().equals(addRangeMessage3.getDataSource())) {
                        webMessageList.add(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C29EEA405A8000E", (String)"\u5ba2\u6237\u4e0d\u5b58\u5728!"));
                        break;
                    }
                }
                String string = creatorOrgId = hashMap.get(merchantId) == null ? "" : ((Merchant)hashMap.get(merchantId)).getCreateOrg();
                if (!error && CollectionUtils.isEmpty(authOrgIdList)) {
                    error = true;
                    if (DataSource.YQL_MERCHANT_SUIT_ORG.getSource().equals(addRangeMessage3.getDataSource())) {
                        addRangeResultList.addMessage(this.buildMessage(erpCodeMap.get(merchantId + (String)orgId22), InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C80F6F405700095", (String)"\u5f53\u524d\u767b\u5f55\u8d26\u53f7\u6ca1\u6709\u8bbe\u7f6e\u5ba2\u6237\u6863\u6848\u7684\u6863\u6848\u7ba1\u7406\u6743\u7684\u7ec4\u7ec7")));
                        addRangeResultList.incFailCount();
                    } else if (DataSource.WEB_MERCHANT_SUIT_ORG.getSource().equals(addRangeMessage3.getDataSource()) || DataSource.API_MERCHANT_SUIT_ORG.getSource().equals(addRangeMessage3.getDataSource())) {
                        webMessageList.add(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C80F6F405700095", (String)"\u5f53\u524d\u767b\u5f55\u8d26\u53f7\u6ca1\u6709\u8bbe\u7f6e\u5ba2\u6237\u6863\u6848\u7684\u6863\u6848\u7ba1\u7406\u6743\u7684\u7ec4\u7ec7"));
                        break;
                    }
                }
                if (!error && !authOrgIdList.contains(creatorOrgId)) {
                    error = true;
                    if (DataSource.YQL_MERCHANT_SUIT_ORG.getSource().equals(addRangeMessage3.getDataSource())) {
                        addRangeResultList.addMessage(this.buildMessage(erpCodeMap.get(merchantId + (String)orgId22), String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C80F6F405700099", (String)"\u5ba2\u6237\u6863\u6848[%s]\u6ca1\u6709\u5f53\u524d\u7ba1\u7406\u7ec4\u7ec7\u7684\u7ec4\u7ec7\u6743\u9650\u6216\u8be5\u7ba1\u7406\u7ec4\u7ec7\u6ca1\u6709\u6863\u6848\u7ba1\u7406\u6743\uff0c\u8bf7\u68c0\u67e5\u5206\u7ea7\u7ba1\u63a7\u662f\u5426\u5f00\u542f\u6863\u6848\u7ba1\u7406\u6743!"), nameMap.get(merchantId))));
                        addRangeResultList.incFailCount();
                    } else if (DataSource.WEB_MERCHANT_SUIT_ORG.getSource().equals(addRangeMessage3.getDataSource()) || DataSource.API_MERCHANT_SUIT_ORG.getSource().equals(addRangeMessage3.getDataSource())) {
                        webMessageList.add(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C80F6F405700099", (String)"\u5ba2\u6237\u6863\u6848[%s]\u6ca1\u6709\u5f53\u524d\u7ba1\u7406\u7ec4\u7ec7\u7684\u7ec4\u7ec7\u6743\u9650\u6216\u8be5\u7ba1\u7406\u7ec4\u7ec7\u6ca1\u6709\u6863\u6848\u7ba1\u7406\u6743\uff0c\u8bf7\u68c0\u67e5\u5206\u7ea7\u7ba1\u63a7\u662f\u5426\u5f00\u542f\u6863\u6848\u7ba1\u7406\u6743!"), nameMap.get(merchantId)));
                        break;
                    }
                }
                if (!error && (orgRangeShareListMap.isEmpty() || orgRangeShareListMap.get(merchantId) == null)) {
                    error = true;
                    if (DataSource.YQL_MERCHANT_SUIT_ORG.getSource().equals(addRangeMessage3.getDataSource())) {
                        addRangeResultList.addMessage(this.buildMessage(erpCodeMap.get(merchantId + (String)orgId22), MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C29EEA405A8000B", (String)"\u5ba2\u6237[{0}]\u521b\u5efa\u7ec4\u7ec7[{1}]\u672a\u8bbe\u7f6e\u5171\u4eab\u4e0b\u7ea7\u7ec4\u7ec7\uff0c\u65e0\u6cd5\u5206\u914d\u8be5\u7ec4\u7ec7\u521b\u5efa\u7684\u5ba2\u6237\u7ed9\u5176\u4ed6\u7ec4\u7ec7"), nameMap.get(merchantId), createOrgNameMap.get(creatorOrgId))));
                        addRangeResultList.incFailCount();
                    } else if (DataSource.WEB_MERCHANT_SUIT_ORG.getSource().equals(addRangeMessage3.getDataSource()) || DataSource.API_MERCHANT_SUIT_ORG.getSource().equals(addRangeMessage3.getDataSource())) {
                        webMessageList.add(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C29EEA405A8000B", (String)"\u5ba2\u6237[{0}]\u521b\u5efa\u7ec4\u7ec7[{1}]\u672a\u8bbe\u7f6e\u5171\u4eab\u4e0b\u7ea7\u7ec4\u7ec7\uff0c\u65e0\u6cd5\u5206\u914d\u8be5\u7ec4\u7ec7\u521b\u5efa\u7684\u5ba2\u6237\u7ed9\u5176\u4ed6\u7ec4\u7ec7"), nameMap.get(merchantId), createOrgNameMap.get(creatorOrgId)));
                        break;
                    }
                }
                if (!error && !orgIdListInDb.contains(orgId22)) {
                    error = true;
                    if (DataSource.YQL_MERCHANT_SUIT_ORG.getSource().equals(addRangeMessage3.getDataSource())) {
                        addRangeResultList.addMessage(this.buildMessage(erpCodeMap.get(merchantId + (String)orgId22), String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C80F6F405700097", (String)"\u7ec4\u7ec7\u4e0d\u5b58\u5728%s"), orgId22)));
                        addRangeResultList.incFailCount();
                    } else if (DataSource.WEB_MERCHANT_SUIT_ORG.getSource().equals(addRangeMessage3.getDataSource()) || DataSource.API_MERCHANT_SUIT_ORG.getSource().equals(addRangeMessage3.getDataSource())) {
                        webMessageList.add(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C80F6F405700097", (String)"\u7ec4\u7ec7\u4e0d\u5b58\u5728%s"), orgId22));
                    }
                }
                if (!error && !((Set)orgRangeShareListMap.get(merchantId)).contains(orgId22)) {
                    error = true;
                    if (DataSource.YQL_MERCHANT_SUIT_ORG.getSource().equals(addRangeMessage3.getDataSource())) {
                        addRangeResultList.addMessage(this.buildMessage(erpCodeMap.get(merchantId + (String)orgId22), MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C29EEA405A8000A", (String)"\u5ba2\u6237[{0}]\u521b\u5efa\u7ec4\u7ec7[{1}]\u5171\u4eab\u4e0b\u7ea7\u7ec4\u7ec7\u8303\u56f4\u4e0d\u5305\u542b\u4ee5\u4e0b\u7ec4\u7ec7[{2}]\uff0c\u65e0\u6cd5\u5206\u914d"), nameMap.get(merchantId), createOrgNameMap.get(creatorOrgId), orgNameMap.get(orgId22))));
                    } else if (DataSource.WEB_MERCHANT_SUIT_ORG.getSource().equals(addRangeMessage3.getDataSource()) || DataSource.API_MERCHANT_SUIT_ORG.getSource().equals(addRangeMessage3.getDataSource())) {
                        webSubtractOrgNameList.add((String)orgNameMap.get(orgId22));
                    }
                }
                String rangeString = "merchantId" + merchantId + "orgId" + (String)orgId22;
                if (error || distinctRange.contains(rangeString)) continue;
                AddMerchantRangeDTO addMerchantRangeDTO = new AddMerchantRangeDTO();
                addMerchantRangeDTO.setMerchantId(addRangeMessage3.getId());
                addMerchantRangeDTO.setOrgId((String)orgId22);
                addMerchantRangeDTO.setAssignerId(addRangeMessage3.getAllocatorId());
                addMerchantRangeDTO.setAssignerName(addRangeMessage3.getAllocatorName());
                if (!CollectionUtils.isEmpty(erpCodeMap)) {
                    addMerchantRangeDTO.setErpCode(erpCodeMap.get(addRangeMessage3.getId() + (String)orgId22));
                }
                distinctRange.add(rangeString);
                addMerchantRangeDTOList.add(addMerchantRangeDTO);
            }
            if (!CollectionUtils.isEmpty(webSubtractOrgNameList)) {
                webMessageList.add(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C80F6F405700096", (String)"\u5ba2\u6237[{0}]\u521b\u5efa\u7ec4\u7ec7[{1}]\u5171\u4eab\u4e0b\u7ea7\u7ec4\u7ec7\u8303\u56f4\u4e0d\u5305\u542b\u4ee5\u4e0b\u7ec4\u7ec7{2}\uff0c\u65e0\u6cd5\u5206\u914d"), nameMap.get(merchantId), createOrgNameMap.get(hashMap.get(merchantId) == null ? "" : ((Merchant)hashMap.get(merchantId)).getCreateOrg()), webSubtractOrgNameList));
            }
            if (CollectionUtils.isEmpty(webMessageList)) continue;
            StringBuilder webMessageBuffer = new StringBuilder();
            orgId22 = webMessageList.iterator();
            while (orgId22.hasNext()) {
                String webMessage = (String)orgId22.next();
                webMessageBuffer.append(webMessage);
            }
            addRangeResultList.addMessage((Object)webMessageBuffer.toString());
            HashMap<String, String> failInfoMap = new HashMap<String, String>();
            failInfoMap.put("id", addRangeMessage3.getId().toString());
            failInfoMap.put("message", webMessageBuffer.toString());
            addRangeResultList.addFailInfo(failInfoMap);
            addRangeResultList.incFailCount();
            wbeError = true;
        }
        ArrayList<MerchantApplyRange> merchantApplyRangeList = new ArrayList<MerchantApplyRange>();
        ArrayList<MerchantApplyRangeDetail> merchantApplyRangeDetailList = new ArrayList<MerchantApplyRangeDetail>();
        ArrayList<MerchantDetail> merchantDetailList = new ArrayList<MerchantDetail>();
        ArrayList<CustomerArea> customerAreaList = new ArrayList<CustomerArea>();
        ArrayList<Principal> principalList = new ArrayList<Principal>();
        ArrayList<InvoicingCustomers> invoicingCustomerList = new ArrayList<InvoicingCustomers>();
        HashMap<Long, List<String>> rangeOrgListMap = new HashMap<Long, List<String>>();
        if (!CollectionUtils.isEmpty(addMerchantRangeDTOList)) {
            HashMap<String, MerchantDetail> detailControlRuleVersionMap = new HashMap<String, MerchantDetail>();
            boolean isCustomerAreaIssueOrg = BooleanUtil.isTrue((Object)OptionUtils.getSystemOption((Object)AppContext.getTenantId(), (String)"isCustomerAreaIssueOrg"));
            boolean isPrincipalIssueOrg = BooleanUtil.isTrue((Object)OptionUtils.getSystemOption((Object)AppContext.getTenantId(), (String)"isPrincipalIssueOrg"));
            Map<String, List<CustomerArea>> creatorCustomerAreaMapInDb = this.getCreatorCustomerAreaMapInDb(merchantIdList, createOrgIdInDbList);
            Map<String, List<Principal>> creatorPrincipalMapInDb = this.getCreatorPrincipalMapInDb(merchantIdList, createOrgIdInDbList);
            Map<String, List<InvoicingCustomers>> creatorInvoicingCustomerMapInDb = this.getCreatorInvoicingCustomerMapInDb(merchantIdList, createOrgIdInDbList);
            for (AddMerchantRangeDTO addMerchantRangeDTO : addMerchantRangeDTOList) {
                Long merchantId = addMerchantRangeDTO.getMerchantId();
                String creatorOrgId = hashMap.get(merchantId) == null ? "" : ((Merchant)hashMap.get(merchantId)).getCreateOrg();
                String orgId = addMerchantRangeDTO.getOrgId();
                if (CollectionUtils.isEmpty(rangeMapInDb) || !rangeMapInDb.containsKey(merchantId + orgId)) {
                    List<String> orgIdGroupList;
                    List<InvoicingCustomers> userInvoicingCustomerList;
                    List<Principal> userPrincipalList;
                    DocAttributeControlConfigDTO docAttributeControlConfigOnly = (DocAttributeControlConfigDTO)orgDocAttributeControlConfigOnlyMap.get(creatorOrgId);
                    DocAttributeControlConfigDTO docAttributeControlConfig = (DocAttributeControlConfigDTO)orgDocAttributeControlConfigMap.get(creatorOrgId);
                    Map<String, List<DocAttributeControlConfig>> docAttributeControlConfigMap = this.merchantGroupService.getDocAttributeControlConfig(docAttributeControlConfig);
                    MerchantApplyRange merchantApplyRange = this.getMerchantApplyRange(merchantId, orgId, addMerchantRangeDTO.getAssignerName(), addMerchantRangeDTO.getAssignerId(), dataSource);
                    MerchantApplyRangeDetail merchantApplyRangeDetail = this.getMerchantApplyRangeDetail(merchantId, (Long)merchantApplyRange.getId(), creatorRangeDetailMapInDb.get(merchantId.toString()), docAttributeControlConfigMap.get("aa.merchant.MerchantApplyRangeDetail"));
                    if (!ObjectUtils.isEmpty((Object)docAttributeControlConfigOnly)) {
                        List<MerchantApplyRange> rangeControlRuleVersionList = this.merchantGroupService.getMerchantApplyRangeListByControlRuleVersion(merchantId, docAttributeControlConfigOnly.getVersion());
                        merchantApplyRange.setControlRuleVersion(docAttributeControlConfigOnly.getVersion());
                        if (!CollectionUtils.isEmpty(rangeControlRuleVersionList)) {
                            merchantApplyRange.setMerchantDetailId(rangeControlRuleVersionList.get(0).getMerchantDetailId());
                        } else if (ObjectUtils.isEmpty(detailControlRuleVersionMap) || ObjectUtils.isEmpty(detailControlRuleVersionMap.get(merchantId.toString() + docAttributeControlConfigOnly.getVersion()))) {
                            MerchantDetail userMerchantDetail = this.merchantGroupService.copyMerchantDetail(creatorDetailMapInDb.get(merchantId.toString()), orgId, merchantApplyRange.getMerchantId(), false);
                            merchantDetailList.add(userMerchantDetail);
                            merchantApplyRange.setMerchantDetailId((String)userMerchantDetail.getId());
                            detailControlRuleVersionMap.put(merchantId.toString() + docAttributeControlConfigOnly.getVersion(), userMerchantDetail);
                        } else {
                            merchantApplyRange.setMerchantDetailId((String)((MerchantDetail)detailControlRuleVersionMap.get(merchantId.toString() + docAttributeControlConfigOnly.getVersion())).getId());
                        }
                    } else {
                        merchantApplyRange.setMerchantDetailId((String)creatorDetailMapInDb.get(merchantId.toString()).getId());
                    }
                    merchantApplyRangeList.add(merchantApplyRange);
                    merchantApplyRangeDetailList.add(merchantApplyRangeDetail);
                    List<CustomerArea> userCustomerAreaList = creatorCustomerAreaMapInDb != null ? this.getCustomerAreaList(merchantId, (Long)merchantApplyRange.getId(), creatorCustomerAreaMapInDb.get(merchantId.toString()), isCustomerAreaIssueOrg, docAttributeControlConfigMap.get("aa.merchant.CustomerArea")) : this.getCustomerAreaList(merchantId, (Long)merchantApplyRange.getId(), null, isCustomerAreaIssueOrg, docAttributeControlConfigMap.get("aa.merchant.CustomerArea"));
                    if (!CollectionUtils.isEmpty(userCustomerAreaList)) {
                        customerAreaList.addAll(userCustomerAreaList);
                    }
                    if (!CollectionUtils.isEmpty(userPrincipalList = creatorPrincipalMapInDb != null ? this.getPrincipalList(merchantId, (Long)merchantApplyRange.getId(), creatorPrincipalMapInDb.get(merchantId.toString()), isPrincipalIssueOrg, docAttributeControlConfigMap.get("aa.merchant.Principal")) : this.getPrincipalList(merchantId, (Long)merchantApplyRange.getId(), null, isPrincipalIssueOrg, docAttributeControlConfigMap.get("aa.merchant.Principal")))) {
                        principalList.addAll(userPrincipalList);
                    }
                    if (!CollectionUtils.isEmpty(userInvoicingCustomerList = creatorInvoicingCustomerMapInDb != null ? this.getInvoicingCustomerList(merchantId, (Long)merchantApplyRange.getId(), creatorInvoicingCustomerMapInDb.get(merchantId.toString()), docAttributeControlConfigMap.get("aa.merchant.InvoicingCustomers")) : this.getInvoicingCustomerList(merchantId, (Long)merchantApplyRange.getId(), null, docAttributeControlConfigMap.get("aa.merchant.InvoicingCustomers")))) {
                        invoicingCustomerList.addAll(userInvoicingCustomerList);
                    }
                    addRangeResultList.addMerchantSuitOrgEventDTOList(this.getAddMerchantSuitOrgEventDTO((Merchant)hashMap.get(merchantId), merchantApplyRange, creatorDetailMapInDb.get(merchantId.toString())));
                    if (DataSource.YQL_MERCHANT_SUIT_ORG.getSource().equals(dataSource)) {
                        addRangeResultList.addInfo(this.buildData(erpCodeMap.get(merchantId + orgId), merchantId, (Long)merchantApplyRange.getId(), orgId));
                        addRangeResultList.incSucessCount();
                    }
                    if (rangeOrgListMap.containsKey(merchantId)) {
                        orgIdGroupList = (List)rangeOrgListMap.get(merchantId);
                        if (orgIdGroupList.contains(orgId)) continue;
                        orgIdGroupList.add(orgId);
                        rangeOrgListMap.put(merchantId, orgIdGroupList);
                        continue;
                    }
                    orgIdGroupList = new ArrayList();
                    orgIdGroupList.add(orgId);
                    rangeOrgListMap.put(merchantId, orgIdGroupList);
                    continue;
                }
                if (!DataSource.YQL_MERCHANT_SUIT_ORG.getSource().equals(dataSource)) continue;
                addRangeResultList.addInfo(this.buildData(erpCodeMap.get(merchantId + orgId), merchantId, Long.valueOf(rangeMapInDb.get(merchantId + orgId)), orgId));
                addRangeResultList.incSucessCount();
            }
        }
        if (!CollectionUtils.isEmpty(merchantApplyRangeList)) {
            if (!wbeError) {
                addRangeResultList.incSucessCount();
            }
            this.merchantService.setMerchantApplyRangeOrgFunc(merchantApplyRangeList);
            MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRange", merchantApplyRangeList);
            if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                this.setMerchantMaintenanceUpdate(merchantApplyRangeDetailList, customerAreaList, principalList);
                MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRangeDetail", merchantApplyRangeDetailList);
            }
            if (!CollectionUtils.isEmpty(merchantDetailList)) {
                MetaDaoHelper.insert((String)"aa.merchant.MerchantDetail", merchantDetailList);
            }
            if (!CollectionUtils.isEmpty(customerAreaList)) {
                MetaDaoHelper.insert((String)"aa.merchant.CustomerArea", customerAreaList);
            }
            if (!CollectionUtils.isEmpty(principalList)) {
                MetaDaoHelper.insert((String)"aa.merchant.Principal", principalList);
            }
            if (!CollectionUtils.isEmpty(invoicingCustomerList)) {
                MetaDaoHelper.insert((String)"aa.merchant.InvoicingCustomers", invoicingCustomerList);
            }
            this.addRangeUpdateMerchantAudit(merchantApplyRangeList);
            this.updateBusinessPartnerOrgGroups(merchantInDbList);
        }
        return addRangeResultList;
    }

    public void addRangeUpdateMerchantAudit(List<MerchantApplyRange> merchantApplyRangeList) {
        if (!CollectionUtils.isEmpty(merchantApplyRangeList)) {
            ArrayList<Merchant> merchantAuditList = new ArrayList<Merchant>();
            HashSet<Long> merchantIdSet = new HashSet<Long>();
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                merchantIdSet.add(merchantApplyRange.getMerchantId());
            }
            for (Long merchantId : merchantIdSet) {
                Merchant merchantAudit = new Merchant();
                merchantAudit.setId((Object)merchantId);
                merchantAudit.setModifier(AppContext.getCurrentUser().getName());
                merchantAudit.setModifierId((Long)AppContext.getCurrentUser().getId());
                merchantAudit.setModifyDate(new Date());
                merchantAudit.setModifyTime(new Date());
                merchantAudit.setEntityStatus(EntityStatus.Update);
                merchantAuditList.add(merchantAudit);
            }
            try {
                MetaDaoHelper.update((String)"aa.merchant.Merchant", merchantAuditList);
            }
            catch (Exception e) {
                log.error("\u5ba2\u6237\u5206\u914d\u5173\u7cfb\u540c\u6b65\u4efb\u52a1\u66f4\u65b0\u5ba2\u6237\u5ba1\u8ba1\u4fe1\u606f\u5f02\u5e38:" + e.getMessage(), (Throwable)e);
            }
        }
    }

    private void eventAddMerchantSuitOrg(List<AddMerchantSuitOrgEventDTO> addMerchantSuitOrgEventDTOList, AddRangeMessage addRangeMessage) {
        HashMap<String, Object> businessObject = new HashMap<String, Object>();
        businessObject.put("fullname", "aa.merchant.Merchant");
        HashMap<String, Object> merchant = new HashMap<String, Object>();
        this.merchantAllocateOrgService.fillOrgInfoToMerchantEvents(addMerchantSuitOrgEventDTOList);
        merchant.put("merchantApplyRanges", addMerchantSuitOrgEventDTOList);
        merchant.put("merchantId", addRangeMessage.getId());
        this.merchantAllocateOrgService.fillMerchantBaseInfo(merchant, addRangeMessage.getId());
        merchant.put("_entityName", "aa.merchant.Merchant");
        businessObject.put("archive", JacksonUtils.toJSONString(merchant));
        try {
            this.eventService2.sendEvent("YXYBASEDOC", EventType.AA_MERCHANT_ALLOCATEORG.toString(), businessObject);
        }
        catch (Exception e) {
            log.error("eventAddMerchantSuitOrg" + e.getMessage(), (Throwable)e);
        }
    }

    public void processDataWebMerchantSuitOrg(AddRangeMessage addRangeMessage, boolean error, String message) {
        String batchNo = addRangeMessage.getBatchNo();
        Long batchCount = Long.parseLong(addRangeMessage.getBatchCount());
        String asyncKeyCount = batchNo + "count";
        String asyncKeySuccessCount = batchNo + "SuccessCount";
        String asyncKeyFailCount = batchNo + "FailCount";
        String asyncKeyMessage = batchNo + "message";
        Long failCount = 0L;
        Long successCount = 0L;
        if (error) {
            failCount = AppContext.cache().incr(asyncKeyFailCount);
        } else {
            successCount = AppContext.cache().incr(asyncKeySuccessCount);
        }
        if (StringUtils.hasText((String)message) && failCount <= 30L && error) {
            AppContext.cache().rpush(asyncKeyMessage, new String[]{message});
        }
        Long count = AppContext.cache().incr(asyncKeyCount);
        String percentage = String.valueOf(count * 100L / batchCount);
        if (Objects.equals(batchCount, count)) {
            String successCountValue;
            String failCountValue = AppContext.cache().get(asyncKeyFailCount);
            if (StringUtils.hasText((String)failCountValue)) {
                failCount = Long.parseLong(failCountValue);
            }
            if (StringUtils.hasText((String)(successCountValue = AppContext.cache().get(asyncKeySuccessCount)))) {
                successCount = Long.parseLong(successCountValue);
            }
            List messageRedisList = AppContext.cache().lrange(asyncKeyMessage, 0L, -1L);
            ResultList resultList = new ResultList();
            resultList.setCount(count.intValue());
            resultList.setSucessCount(successCount.intValue());
            resultList.setFailCount(failCount.intValue());
            if (!CollectionUtils.isEmpty((Collection)messageRedisList)) {
                for (String messageRedis : messageRedisList) {
                    resultList.addInfo((Object)messageRedis);
                    resultList.addErrorMessage(messageRedis);
                    resultList.addFailInfo((Object)messageRedis);
                }
            }
            ProcessData.builder((int)1, (int)200, (Object)resultList, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C80F6F405700094", (String)"\u5206\u914d\u7ec4\u7ec7\u5b8c\u6210")).percentage("100").successCount(successCount.intValue()).failCount(failCount.intValue()).build(batchNo, Integer.valueOf(600));
            AppContext.cache().del(new String[]{asyncKeyCount, asyncKeySuccessCount, asyncKeyFailCount, asyncKeyMessage});
        } else if (batchCount > count) {
            ProcessData.builder((int)1, (int)200, null, null).percentage(percentage).build(batchNo, Integer.valueOf(600));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void dealAddMerchantSuitOrgFromCustomerApply(List<AddRangeMessage> addRangeMessageList) throws Exception {
        if (this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant").booleanValue() || CollectionUtils.isEmpty(addRangeMessageList)) {
            return;
        }
        AddRangeMessage addRangeMessage = addRangeMessageList.get(0);
        CustomerApply customerApply = new CustomerApply();
        customerApply.setId((Object)addRangeMessage.getCustomerApplyId());
        try {
            this.dealAddMerchantSuitOrgFromCustomerApply(addRangeMessage);
            customerApply.setEffectStatus(CustomerEffectStatus.success);
            customerApply.setStatus(Status.confirmed);
            customerApply.setFailInfo(null);
        }
        catch (Exception e) {
            log.error("dealAddMerchantSuitOrgFromCustomerApply_error{}", (Object)e.getMessage(), (Object)e);
            customerApply.setFailInfo(e.getMessage());
            customerApply.setEffectStatus(CustomerEffectStatus.fail);
            customerApply.setStatus(Status.confirmed);
        }
        finally {
            customerApply.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"aa.customerapply.CustomerApply", (BizObject)customerApply);
        }
    }

    public void dealAddMerchantSuitOrgFromCustomerApply(AddRangeMessage addRangeMessage) throws Exception {
        CustomerApply customerApply = (CustomerApply)MetaDaoHelper.findById((String)"aa.customerapply.CustomerApply", (Object)addRangeMessage.getCustomerApplyId());
        if (!CollectionUtils.isEmpty((Map)customerApply) && !CollectionUtils.isEmpty((Collection)customerApply.customerApplyAddRanges())) {
            Merchant merchant = this.getMerchantBizObjectById(addRangeMessage.getId());
            if (CollectionUtils.isEmpty((Map)merchant)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801024);
            }
            List<String> authOrgIdList = this.upcControlRuleService.getManageOrgList("aa.merchant.Merchant", "aa_merchant");
            if (CollectionUtils.isEmpty(authOrgIdList) || !authOrgIdList.contains(merchant.getCreateOrg())) {
                List funcOrgesByCodeList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(Collections.singletonList(merchant.getCreateOrg())).withEnabled());
                String messAgeName = merchant.getCreateOrg();
                if (!CollectionUtils.isEmpty((Collection)funcOrgesByCodeList)) {
                    messAgeName = ((OrgUnitDTO)funcOrgesByCodeList.get(0)).toMultiLang().getName().toString();
                }
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801025, new Object[]{messAgeName});
            }
            DocAttributeControlConfigDTO docAttributeControlConfig = this.docAttributeControlConfigService.queryAttrControlConfigForOrg("aa.merchant.Merchant", merchant.getCreateOrg());
            DocAttributeControlConfigDTO docAttributeControlConfigOnly = this.docAttributeControlConfigService.queryAttrControlConfigOnlyForOrgAdd("aa.merchant.Merchant", merchant.getCreateOrg());
            Map<String, List<DocAttributeControlConfig>> docAttributeControlConfigMap = this.merchantGroupService.getDocAttributeControlConfig(docAttributeControlConfig);
            Set orgRangeShareSet = this.orgPermissionsService.getShareOrgDetailByManageOrg4BillDate("aa.merchant.Merchant", merchant.getCreateOrg(), (BizObject)merchant);
            if (CollectionUtils.isEmpty((Collection)orgRangeShareSet)) {
                List funcOrgesByCodeList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(Collections.singletonList(merchant.getCreateOrg())).withEnabled());
                String messAgeName = merchant.getCreateOrg();
                if (!CollectionUtils.isEmpty((Collection)funcOrgesByCodeList)) {
                    messAgeName = ((OrgUnitDTO)funcOrgesByCodeList.get(0)).toMultiLang().getName().toString();
                }
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800371, new Object[]{merchant.getName(), messAgeName});
            }
            Map<String, MerchantApplyRangeDetail> creatorRangeDetailMapInDb = this.getCreatorRangeDetailMapInDb(Collections.singletonList(addRangeMessage.getId()), Collections.singletonList(merchant.getCreateOrg()));
            Map<String, MerchantDetail> creatorDetailMapInDb = this.getCreatorDetailMapInDb(Collections.singletonList(addRangeMessage.getId()));
            if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite() ? CollectionUtils.isEmpty(creatorRangeDetailMapInDb) || creatorRangeDetailMapInDb.get(addRangeMessage.getId().toString()) == null : CollectionUtils.isEmpty(creatorDetailMapInDb) || creatorDetailMapInDb.get(addRangeMessage.getId().toString()) == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801026);
            }
            List<String> orgIdList = customerApply.customerApplyAddRanges().stream().map(CustomerApplyAddRange::getOrgId).collect(Collectors.toList());
            Map<String, String> rangeMapInDb = this.getRangeMapInDb(Collections.singletonList(addRangeMessage.getId()), orgIdList);
            if (rangeMapInDb == null) {
                rangeMapInDb = new HashMap<String, String>();
            }
            for (CustomerApplyAddRange customerApplyAddRange : customerApply.customerApplyAddRanges()) {
                ArrayList<String> orgIdQueryList = new ArrayList<String>();
                if (!CollectionUtils.isEmpty(rangeMapInDb) && rangeMapInDb.containsKey(addRangeMessage.getId() + customerApplyAddRange.getOrgId()) || orgRangeShareSet.contains(customerApplyAddRange.getOrgId())) continue;
                orgIdQueryList.add(merchant.getCreateOrg());
                orgIdQueryList.add(customerApplyAddRange.getOrgId());
                List funcOrgesByCodeList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(orgIdQueryList).withEnabled());
                HashMap<String, String> orgNameMap = new HashMap<String, String>();
                orgNameMap.put(merchant.getCreateOrg(), merchant.getCreateOrg());
                orgNameMap.put(customerApplyAddRange.getOrgId(), customerApplyAddRange.getOrgId());
                if (!CollectionUtils.isEmpty((Collection)funcOrgesByCodeList)) {
                    for (OrgUnitDTO orgUnitDTO : funcOrgesByCodeList) {
                        orgNameMap.put(orgUnitDTO.getId(), orgUnitDTO.toMultiLang().getName().toString());
                    }
                }
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800372, new Object[]{merchant.getName(), orgNameMap.get(merchant.getCreateOrg()), orgNameMap.get(customerApplyAddRange.getOrgId())});
            }
            ArrayList<MerchantApplyRange> merchantApplyRangeList = new ArrayList<MerchantApplyRange>();
            ArrayList<MerchantApplyRangeDetail> merchantApplyRangeDetailList = new ArrayList<MerchantApplyRangeDetail>();
            ArrayList<MerchantDetail> merchantDetailList = new ArrayList<MerchantDetail>();
            ArrayList<CustomerArea> customerAreaList = new ArrayList<CustomerArea>();
            ArrayList<Principal> principalList = new ArrayList<Principal>();
            ArrayList<InvoicingCustomers> invoicingCustomerList = new ArrayList<InvoicingCustomers>();
            Map<String, List<InvoicingCustomers>> creatorInvoicingCustomerMapInDb = this.getCreatorInvoicingCustomerMapInDb(Collections.singletonList(addRangeMessage.getId()), Collections.singletonList(merchant.getCreateOrg()));
            for (CustomerApplyAddRange customerApplyAddRange : customerApply.customerApplyAddRanges()) {
                Long merchantApplyRangeId = null;
                if (!CollectionUtils.isEmpty(rangeMapInDb) && rangeMapInDb.containsKey(addRangeMessage.getId() + customerApplyAddRange.getOrgId())) {
                    merchantApplyRangeId = Long.valueOf(rangeMapInDb.get(addRangeMessage.getId() + customerApplyAddRange.getOrgId()));
                } else {
                    MerchantApplyRange merchantApplyRange = this.getMerchantApplyRange(addRangeMessage.getId(), customerApplyAddRange.getOrgId(), addRangeMessage.getAllocatorName(), addRangeMessage.getAllocatorId(), addRangeMessage.getDataSource());
                    if (!ObjectUtils.isEmpty((Object)docAttributeControlConfigOnly)) {
                        merchantApplyRange.setControlRuleVersion(docAttributeControlConfigOnly.getVersion());
                    }
                    merchantApplyRange.setIsApplied(Boolean.valueOf(true));
                    MerchantApplyRangeDetail merchantApplyRangeDetail = this.getMerchantApplyRangeDetail(addRangeMessage.getId(), (Long)merchantApplyRange.getId(), creatorRangeDetailMapInDb.get(addRangeMessage.getId().toString()), docAttributeControlConfigMap.get("aa.merchant.MerchantApplyRangeDetail"));
                    merchantApplyRangeDetail.setCreator(customerApply.getCreator());
                    merchantApplyRangeDetail.setCreatorId(customerApply.getCreatorId());
                    MerchantDetail merchantDetail = !this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite() ? this.merchantGroupService.getMerchantDetailForInsert(merchantApplyRangeDetail, merchantApplyRange.getOrgId(), (Long)merchant.getId(), false) : this.merchantGroupService.copyMerchantDetail(creatorDetailMapInDb.get(addRangeMessage.getId().toString()), merchantApplyRange.getOrgId(), (Long)merchant.getId(), false);
                    merchantApplyRange.setMerchantDetailId((String)merchantDetail.getId());
                    List<InvoicingCustomers> userInvoicingCustomerList = creatorInvoicingCustomerMapInDb != null ? this.getInvoicingCustomerList(addRangeMessage.getId(), (Long)merchantApplyRange.getId(), creatorInvoicingCustomerMapInDb.get(addRangeMessage.getId().toString()), docAttributeControlConfigMap.get("aa.merchant.InvoicingCustomers")) : this.getInvoicingCustomerList(addRangeMessage.getId(), (Long)merchantApplyRange.getId(), null, docAttributeControlConfigMap.get("aa.merchant.InvoicingCustomers"));
                    if (!CollectionUtils.isEmpty(userInvoicingCustomerList)) {
                        invoicingCustomerList.addAll(userInvoicingCustomerList);
                    }
                    merchantApplyRangeList.add(merchantApplyRange);
                    merchantApplyRangeDetailList.add(merchantApplyRangeDetail);
                    merchantDetailList.add(merchantDetail);
                    rangeMapInDb.put(addRangeMessage.getId().toString() + customerApplyAddRange.getOrgId(), merchantApplyRange.getId().toString());
                    merchantApplyRangeId = Long.valueOf(merchantApplyRange.getId().toString());
                }
                if (customerApplyAddRange.getSaleAreaId() == null && customerApplyAddRange.getProfessSalesmanId() == null && customerApplyAddRange.getSpecialManagementDepId() == null) continue;
                if (customerApplyAddRange.getSaleAreaId() != null) {
                    CustomerArea customerArea = this.getCustomerArea(addRangeMessage.getId(), merchantApplyRangeId, customerApplyAddRange.getSaleAreaId(), customerApplyAddRange.getDefaultSaleArea());
                    customerAreaList.add(customerArea);
                }
                if (customerApplyAddRange.getProfessSalesmanId() == null && customerApplyAddRange.getSpecialManagementDepId() == null) continue;
                Principal principal = this.getPrincipal(addRangeMessage.getId(), merchantApplyRangeId, customerApplyAddRange.getSpecialManagementDepId(), customerApplyAddRange.getProfessSalesmanId(), customerApplyAddRange.getDefaultPrincipal());
                principalList.add(principal);
            }
            if (!CollectionUtils.isEmpty(merchantApplyRangeList)) {
                this.merchantService.setMerchantApplyRangeOrgFunc(merchantApplyRangeList);
                MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRange", merchantApplyRangeList);
                if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                    this.setMerchantMaintenanceUpdate(merchantApplyRangeDetailList, customerAreaList, principalList);
                    MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRangeDetail", merchantApplyRangeDetailList);
                }
                MetaDaoHelper.insert((String)"aa.merchant.MerchantDetail", merchantDetailList);
                if (!CollectionUtils.isEmpty(invoicingCustomerList)) {
                    MetaDaoHelper.insert((String)"aa.merchant.InvoicingCustomers", invoicingCustomerList);
                }
            }
            if (!CollectionUtils.isEmpty(customerAreaList)) {
                MetaDaoHelper.insert((String)"aa.merchant.CustomerArea", customerAreaList);
            }
            if (!CollectionUtils.isEmpty(principalList)) {
                MetaDaoHelper.insert((String)"aa.merchant.Principal", principalList);
            }
            try {
                Merchant merchantAudit = new Merchant();
                merchantAudit.setId((Object)addRangeMessage.getId());
                merchantAudit.setModifier(customerApply.getCreator());
                merchantAudit.setModifierId(customerApply.getCreatorId());
                merchantAudit.setModifyDate(new Date());
                merchantAudit.setModifyTime(new Date());
                merchantAudit.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.update((String)"aa.merchant.Merchant", (BizObject)merchantAudit);
                List<AddMerchantSuitOrgEventDTO> addMerchantSuitOrgEventDTOS = this.buildAddMerchantSuitOrgEventDTOList(merchantDetailList, merchantApplyRangeList, addRangeMessage);
                this.eventAddMerchantSuitOrg(addMerchantSuitOrgEventDTOS, addRangeMessage);
            }
            catch (Exception e) {
                log.error("\u5ba2\u6237\u7533\u8bf7\u5206\u914d\u4efb\u52a1\u66f4\u65b0\u5ba2\u6237\u5ba1\u8ba1\u4fe1\u606f\u5f02\u5e38:{}", (Object)e.getMessage(), (Object)e);
            }
            ArrayList<Merchant> merchants = new ArrayList<Merchant>();
            merchants.add(merchant);
            this.updateBusinessPartnerOrgGroups(merchants);
        }
    }

    private List<AddMerchantSuitOrgEventDTO> buildAddMerchantSuitOrgEventDTOList(List<MerchantDetail> merchantDetailList, List<MerchantApplyRange> merchantApplyRangeList, AddRangeMessage addRangeMessage) {
        if (merchantApplyRangeList == null) {
            return new ArrayList<AddMerchantSuitOrgEventDTO>();
        }
        if (merchantDetailList == null) {
            merchantDetailList = new ArrayList<MerchantDetail>();
        }
        Map<Long, MerchantDetail> merchantDetailMap = merchantDetailList.stream().filter(merchantDetail -> merchantDetail != null && merchantDetail.getId() != null).collect(Collectors.toMap(BizObject::getId, merchantDetail -> merchantDetail));
        ArrayList<AddMerchantSuitOrgEventDTO> addMerchantSuitOrgEventDTOS = new ArrayList<AddMerchantSuitOrgEventDTO>();
        for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
            if (merchantApplyRange == null) continue;
            AddMerchantSuitOrgEventDTO addMerchantSuitOrgEventDTO = new AddMerchantSuitOrgEventDTO();
            addMerchantSuitOrgEventDTO.setMerchantId(addRangeMessage.getId());
            addMerchantSuitOrgEventDTO.setMerchantApplyRangeId((Long)merchantApplyRange.getId());
            addMerchantSuitOrgEventDTO.setOrgId(merchantApplyRange.getOrgId());
            addMerchantSuitOrgEventDTO.setRangeType(merchantApplyRange.getRangeType());
            if (merchantDetailMap.containsKey(merchantApplyRange.getMerchantDetailId())) {
                addMerchantSuitOrgEventDTO.setStopstatus(merchantDetailMap.get(merchantApplyRange.getMerchantDetailId()).getStopstatus());
            }
            addMerchantSuitOrgEventDTOS.add(addMerchantSuitOrgEventDTO);
        }
        return addMerchantSuitOrgEventDTOS;
    }

    public List<Merchant> getMerchantBizObjectByIdList(List<Long> merchantIdList) throws Exception {
        if (!CollectionUtils.isEmpty(merchantIdList)) {
            ArrayList<Merchant> merchantList = new ArrayList<Merchant>();
            for (Long merchantId : merchantIdList) {
                Merchant merchantBizObject = this.getMerchantBizObjectById(merchantId);
                if (CollectionUtils.isEmpty((Map)merchantBizObject)) continue;
                merchantList.add(merchantBizObject);
            }
            return merchantList;
        }
        return null;
    }

    public Merchant getMerchantBizObjectById(Long merchantId) throws Exception {
        BillDataDto billDataDtoMerchantLog = new BillDataDto("aa_merchant", String.valueOf(merchantId));
        Map merchantDetail = this.billService.detail(billDataDtoMerchantLog);
        Merchant convertMerchant = (Merchant)Objectlizer.convert((Map)merchantDetail, (String)"aa.merchant.Merchant");
        Object merchantLocaleNameObject = MultilangUtil.getAttr((String)"aa.merchant.Merchant", (String)"name", (BizObject)convertMerchant, null);
        convertMerchant.setName(String.valueOf(merchantLocaleNameObject));
        return convertMerchant;
    }

    public Map<String, String> getRangeMapInDb(List<Long> merchantIdList, List<String> orgIdList) throws Exception {
        HashMap<String, String> rangeMapInDb = new HashMap<String, String>();
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,orgId,merchantId");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").in(merchantIdList), QueryCondition.name((String)"orgId").in(orgIdList), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())}));
        querySchema.setPartitionable(false);
        List merchantApplyRangeInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeInDbList)) {
            for (MerchantApplyRange rangeInDb : merchantApplyRangeInDbList) {
                rangeMapInDb.put(rangeInDb.getMerchantId().toString() + rangeInDb.getOrgId(), rangeInDb.getId().toString());
            }
            return rangeMapInDb;
        }
        return null;
    }

    private Map<String, MerchantApplyRangeDetail> getCreatorRangeDetailMapInDb(List<Long> merchantIdList, List<String> orgIdList) throws Exception {
        HashMap<String, MerchantApplyRangeDetail> rangeDetailMapInDb = new HashMap<String, MerchantApplyRangeDetail>();
        if (this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
            return rangeDetailMapInDb;
        }
        if (CollectionUtils.isEmpty(merchantIdList) || CollectionUtils.isEmpty(orgIdList)) {
            return rangeDetailMapInDb;
        }
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,searchcode,transactionCurrency,taxRate,deliveryWarehouse,creditServiceDay,collectionAgreement,settlementMethod,shipmentMethod,signBack,customerLevel,exchangeratetype,payway,customerType,orgDefaultAddress,stopstatus,stoptime,isTradeCustomers,layoffId");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(merchantIdList), QueryCondition.name((String)"merchantApplyRangeId.orgId").in(orgIdList), QueryCondition.name((String)"merchantApplyRangeId.isCreator").eq((Object)true)}));
        List merchantApplyRangeDetailInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailInDbList)) {
            for (MerchantApplyRangeDetail rangeDetailInDb : merchantApplyRangeDetailInDbList) {
                rangeDetailMapInDb.put(rangeDetailInDb.get("id").toString(), rangeDetailInDb);
            }
            return rangeDetailMapInDb;
        }
        return null;
    }

    private Map<String, MerchantDetail> getCreatorDetailMapInDb(List<Long> merchantIdList) throws Exception {
        HashMap<String, MerchantDetail> rangeDetailMapInDb = new HashMap<String, MerchantDetail>();
        if (CollectionUtils.isEmpty(merchantIdList)) {
            return null;
        }
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,merchantId,searchCode,transactionCurrencyId,taxRateId,deliveryWarehouseId,creditServiceDayId,collectionAgreementId,settlementMethodId,shipmentMethodId,signBack,merchantLevelId,exchangeRateTypeId,payWay,merchantTypeId,orgDefaultAddress,merchantApplyRangeDetailCharacter,frozenState,freezeLink,stopstatus,stoptime,createTime,createDate,modifyTime,modifyDate,creator,modifier,creatorId,modifierId,isTradeCustomers");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").in(merchantIdList), QueryCondition.name((String)"isCreator").eq((Object)true)}));
        List merchantApplyRangeDetailInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantDetail", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailInDbList)) {
            for (MerchantDetail rangeDetailInDb : merchantApplyRangeDetailInDbList) {
                rangeDetailMapInDb.put(rangeDetailInDb.getMerchantId().toString(), rangeDetailInDb);
            }
            return rangeDetailMapInDb;
        }
        return null;
    }

    private Map<String, List<CustomerArea>> getCreatorCustomerAreaMapInDb(List<Long> merchantIdList, List<String> orgIdList) throws Exception {
        HashMap<String, List<CustomerArea>> customerAreaMapInDb = new HashMap<String, List<CustomerArea>>();
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,merchantId,merchantApplyRangeId,saleAreaId,isDefault,customerAreaCharacter");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").in(merchantIdList), QueryCondition.name((String)"merchantApplyRangeId.orgId").in(orgIdList), QueryCondition.name((String)"merchantApplyRangeId.isCreator").eq((Object)true)}));
        List customerAreaInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)customerAreaInDbList)) {
            for (CustomerArea customerAreaInDb : customerAreaInDbList) {
                List<CustomerArea> customerAreaList;
                if (customerAreaMapInDb.containsKey(customerAreaInDb.getMerchantId().toString())) {
                    customerAreaList = (List)customerAreaMapInDb.get(customerAreaInDb.getMerchantId().toString());
                    customerAreaList.add(customerAreaInDb);
                    customerAreaMapInDb.put(customerAreaInDb.getMerchantId().toString(), customerAreaList);
                    continue;
                }
                customerAreaList = new ArrayList<CustomerArea>();
                customerAreaList.add(customerAreaInDb);
                customerAreaMapInDb.put(customerAreaInDb.getMerchantId().toString(), customerAreaList);
            }
            return customerAreaMapInDb;
        }
        return null;
    }

    private Map<String, List<Principal>> getCreatorPrincipalMapInDb(List<Long> merchantIdList, List<String> orgIdList) throws Exception {
        HashMap<String, List<Principal>> principalMapInDb = new HashMap<String, List<Principal>>();
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,merchantId,merchantApplyRangeId,specialManagementDep,professSalesman,isDefault,principalCharacter");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").in(merchantIdList), QueryCondition.name((String)"merchantApplyRangeId.orgId").in(orgIdList), QueryCondition.name((String)"merchantApplyRangeId.isCreator").eq((Object)true)}));
        List principalInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Principal", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)principalInDbList)) {
            for (Principal principalInDb : principalInDbList) {
                List<Principal> principalList;
                if (principalMapInDb.containsKey(principalInDb.getMerchantId().toString())) {
                    principalList = (List)principalMapInDb.get(principalInDb.getMerchantId().toString());
                    principalList.add(principalInDb);
                    principalMapInDb.put(principalInDb.getMerchantId().toString(), principalList);
                    continue;
                }
                principalList = new ArrayList<Principal>();
                principalList.add(principalInDb);
                principalMapInDb.put(principalInDb.getMerchantId().toString(), principalList);
            }
            return principalMapInDb;
        }
        return null;
    }

    private Map<String, List<InvoicingCustomers>> getCreatorInvoicingCustomerMapInDb(List<Long> merchantIdList, List<String> orgIdList) throws Exception {
        HashMap<String, List<InvoicingCustomers>> invoicingCustomerMapInDb = new HashMap<String, List<InvoicingCustomers>>();
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,merchantId,merchantApplyRangeId,invoicingCustomersId,isDefault");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").in(merchantIdList), QueryCondition.name((String)"merchantApplyRangeId.orgId").in(orgIdList), QueryCondition.name((String)"merchantApplyRangeId.isCreator").eq((Object)true)}));
        List invoicingCustomerInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.InvoicingCustomers", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)invoicingCustomerInDbList)) {
            for (InvoicingCustomers invoicingCustomers : invoicingCustomerInDbList) {
                List<InvoicingCustomers> invoicingCustomersList;
                if (invoicingCustomerMapInDb.containsKey(invoicingCustomers.getMerchantId().toString())) {
                    invoicingCustomersList = (List)invoicingCustomerMapInDb.get(invoicingCustomers.getMerchantId().toString());
                    invoicingCustomersList.add(invoicingCustomers);
                    invoicingCustomerMapInDb.put(invoicingCustomers.getMerchantId().toString(), invoicingCustomersList);
                    continue;
                }
                invoicingCustomersList = new ArrayList<InvoicingCustomers>();
                invoicingCustomersList.add(invoicingCustomers);
                invoicingCustomerMapInDb.put(invoicingCustomers.getMerchantId().toString(), invoicingCustomersList);
            }
            return invoicingCustomerMapInDb;
        }
        return null;
    }

    private List<String> getOrgIdInDb(List<String> orgIdList) {
        List funcOrgesByCodeList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(new ArrayList<String>(orgIdList)));
        if (!CollectionUtils.isEmpty((Collection)funcOrgesByCodeList)) {
            return funcOrgesByCodeList.stream().map(BaseOrgDTO::getId).collect(Collectors.toList());
        }
        return null;
    }

    private MerchantApplyRange getMerchantApplyRange(Long merchantId, String orgId, String allocatorName, Long allocatorId, String source) {
        MerchantApplyRange range = new MerchantApplyRange();
        range.setId((Object)IdManager.getInstance().nextId());
        range.setMerchantId(merchantId);
        range.setRangeType(Integer.valueOf(1));
        range.setOrgId(orgId);
        range.setIsCreator(Boolean.valueOf(false));
        range.setIsApplied(Boolean.valueOf(false));
        range.setAllocatorName(allocatorName);
        range.setAllocatorId(allocatorId);
        if (DataSource.WEB_MERCHANT_SUIT_ORG.getSource().equals(source)) {
            range.setAllocateSource(AddMerchantRangeSourceEnum.WEB_SUIT_ORG.getName());
        } else if (DataSource.MC_MERCHANT_SUIT_ORG.getSource().equals(source)) {
            range.setAllocateSource(AddMerchantRangeSourceEnum.MC_SUIT_ORG.getName());
        } else if (DataSource.API_MERCHANT_SUIT_ORG.getSource().equals(source)) {
            range.setAllocateSource(AddMerchantRangeSourceEnum.API_SUIT_ORG.getName());
        } else if (DataSource.YQL_MERCHANT_SUIT_ORG.getSource().equals(source)) {
            range.setAllocateSource(AddMerchantRangeSourceEnum.YQL_SUIT_ORG.getName());
        } else if (DataSource.CUSTOMER_APPLY_ADD_RANGE.getSource().equals(source)) {
            range.setAllocateSource(AddMerchantRangeSourceEnum.CUSTOMER_APPLY_SUIT_ORG.getName());
        } else {
            range.setAllocateSource(source);
        }
        range.setAllocateTime(new Date());
        range.setEntityStatus(EntityStatus.Insert);
        return range;
    }

    private MerchantApplyRangeDetail getMerchantApplyRangeDetail(Long merchantId, Long merchantApplyRangeId, MerchantApplyRangeDetail creatorRangeDetail, List<DocAttributeControlConfig> docAttributeControlConfigList) {
        MerchantApplyRangeDetail rangeDetail = new MerchantApplyRangeDetail();
        if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
            rangeDetail.putAll((Map)creatorRangeDetail);
        }
        rangeDetail.set("id", (Object)merchantId);
        rangeDetail.setMerchantApplyRangeId(merchantApplyRangeId);
        rangeDetail.setCreator(AppContext.getCurrentUser().getName());
        rangeDetail.setCreatorId((Long)AppContext.getCurrentUser().getId());
        rangeDetail.setCreateDate(new Date());
        rangeDetail.setCreateTime(new Date());
        if (!CollectionUtils.isEmpty(docAttributeControlConfigList)) {
            for (DocAttributeControlConfig docAttributeControlConfig : docAttributeControlConfigList) {
                if (String.valueOf(CarryType.FromDefault.getValue()).equals(docAttributeControlConfig.getCarryType())) {
                    rangeDetail.put(docAttributeControlConfig.getAttributeCode(), (Object)docAttributeControlConfig.getAttributeDefaultValue());
                    continue;
                }
                if (!String.valueOf(CarryType.NotCarry.getValue()).equals(docAttributeControlConfig.getCarryType())) continue;
                rangeDetail.remove(docAttributeControlConfig.getAttributeCode());
            }
        }
        rangeDetail.setEntityStatus(EntityStatus.Insert);
        return rangeDetail;
    }

    private List<CustomerArea> getCustomerAreaList(Long merchantId, Long merchantApplyRangeId, List<CustomerArea> creatorCustomerAreaList, boolean isCustomerAreaIssueOrg, List<DocAttributeControlConfig> docAttributeControlConfigList) {
        ArrayList<CustomerArea> customerAreaList = new ArrayList<CustomerArea>();
        boolean isCopyCreator = false;
        if (!CollectionUtils.isEmpty(docAttributeControlConfigList)) {
            DocAttributeControlConfig docAttributeControlConfigSaleArea = new DocAttributeControlConfig();
            for (DocAttributeControlConfig docAttributeControlConfig : docAttributeControlConfigList) {
                if (!"CustomerArea".equals(docAttributeControlConfig.getAttributeCode())) continue;
                docAttributeControlConfigSaleArea = docAttributeControlConfig;
            }
            if (String.valueOf(ControlType.OwnOrgControl.getValue()).equals(docAttributeControlConfigSaleArea.getControlType()) && String.valueOf(CarryType.FromManage.getValue()).equals(docAttributeControlConfigSaleArea.getCarryType())) {
                isCopyCreator = true;
            } else if (String.valueOf(ControlType.ManageOrgControl.getValue()).equals(docAttributeControlConfigSaleArea.getControlType())) {
                isCopyCreator = true;
            }
        } else if (isCustomerAreaIssueOrg) {
            isCopyCreator = true;
        }
        if (isCopyCreator && !CollectionUtils.isEmpty(creatorCustomerAreaList)) {
            for (CustomerArea creatorCustomerArea : creatorCustomerAreaList) {
                CustomerArea customerArea = this.initCustomerArea(creatorCustomerArea.getMerchantId(), merchantApplyRangeId, creatorCustomerArea.getSaleAreaId(), creatorCustomerArea.getIsDefault());
                if (creatorCustomerArea.containsKey((Object)"customerAreaCharacter") && creatorCustomerArea.get("customerAreaCharacter") instanceof BizObject) {
                    BizObject customerAreaCharacter = ((BizObject)creatorCustomerArea.get("customerAreaCharacter")).clone();
                    customerAreaCharacter.setId((Object)IdManager.getInstance().nextId());
                    customerAreaCharacter.setEntityStatus(EntityStatus.Insert);
                    customerArea.set("customerAreaCharacter", (Object)customerAreaCharacter);
                }
                customerAreaList.add(customerArea);
            }
        }
        return customerAreaList;
    }

    private CustomerArea getCustomerArea(Long merchantId, Long merchantApplyRangeId, Long saleAreaId, Integer isdefault) {
        CustomerArea customerArea = new CustomerArea();
        customerArea.setId((Object)IdManager.getInstance().nextId());
        customerArea.setMerchantId(merchantId);
        customerArea.setmerchantApplyRangeId(merchantApplyRangeId);
        customerArea.setSaleAreaId(saleAreaId);
        if (BooleanUtil.isTrue((Object)isdefault)) {
            customerArea.setIsDefault(Boolean.valueOf(true));
        } else {
            customerArea.setIsDefault(Boolean.valueOf(false));
        }
        customerArea.setEntityStatus(EntityStatus.Insert);
        return customerArea;
    }

    private List<Principal> getPrincipalList(Long merchantId, Long merchantApplyRangeId, List<Principal> creatorPrincipalList, boolean isPrincipalIssueOrg, List<DocAttributeControlConfig> docAttributeControlConfigList) {
        ArrayList<Principal> principalList = new ArrayList<Principal>();
        boolean isCopyCreator = false;
        if (!CollectionUtils.isEmpty(docAttributeControlConfigList)) {
            DocAttributeControlConfig controlConfigProfessSalesman = new DocAttributeControlConfig();
            for (DocAttributeControlConfig docAttributeControlConfig : docAttributeControlConfigList) {
                if (!"Principal".equals(docAttributeControlConfig.getAttributeCode())) continue;
                controlConfigProfessSalesman = docAttributeControlConfig;
            }
            if (String.valueOf(ControlType.OwnOrgControl.getValue()).equals(controlConfigProfessSalesman.getControlType()) && String.valueOf(CarryType.FromManage.getValue()).equals(controlConfigProfessSalesman.getCarryType())) {
                isCopyCreator = true;
            } else if (String.valueOf(ControlType.ManageOrgControl.getValue()).equals(controlConfigProfessSalesman.getControlType())) {
                isCopyCreator = true;
            }
        } else if (isPrincipalIssueOrg) {
            isCopyCreator = true;
        }
        if (isCopyCreator && !CollectionUtils.isEmpty(creatorPrincipalList)) {
            for (Principal creatorPrincipal : creatorPrincipalList) {
                Principal principal = this.initPrincipal(creatorPrincipal.getMerchantId(), merchantApplyRangeId, creatorPrincipal.getProfessSalesman(), creatorPrincipal.getSpecialManagementDep(), creatorPrincipal.getIsDefault());
                if (creatorPrincipal.containsKey((Object)"principalCharacter") && creatorPrincipal.get("principalCharacter") instanceof BizObject) {
                    BizObject principalCharacter = ((BizObject)creatorPrincipal.get("principalCharacter")).clone();
                    principalCharacter.setId((Object)IdManager.getInstance().nextId());
                    principalCharacter.setEntityStatus(EntityStatus.Insert);
                    principal.set("principalCharacter", (Object)principalCharacter);
                }
                principalList.add(principal);
            }
        }
        return principalList;
    }

    private Principal getPrincipal(Long merchantId, Long merchantApplyRangeId, String specialManagementDep, String professSalesman, Integer isdefault) {
        Principal principal = new Principal();
        principal.setId((Object)IdManager.getInstance().nextId());
        principal.setMerchantId(merchantId);
        principal.setMerchantApplyRangeId(merchantApplyRangeId);
        principal.setSpecialManagementDep(specialManagementDep);
        principal.setProfessSalesman(professSalesman);
        if (BooleanUtil.isTrue((Object)isdefault)) {
            principal.setIsDefault(Boolean.valueOf(true));
        } else {
            principal.setIsDefault(Boolean.valueOf(false));
        }
        principal.setEntityStatus(EntityStatus.Insert);
        return principal;
    }

    private List<InvoicingCustomers> getInvoicingCustomerList(Long merchantId, Long merchantApplyRangeId, List<InvoicingCustomers> creatorInvoicingCustomersList, List<DocAttributeControlConfig> docAttributeControlConfigList) {
        ArrayList<InvoicingCustomers> invoicingCustomersList = new ArrayList<InvoicingCustomers>();
        boolean isCopyCreator = false;
        if (!CollectionUtils.isEmpty(docAttributeControlConfigList)) {
            DocAttributeControlConfig controlConfigInvoice = new DocAttributeControlConfig();
            for (DocAttributeControlConfig docAttributeControlConfig : docAttributeControlConfigList) {
                if (!"InvoicingCustomers".equals(docAttributeControlConfig.getAttributeCode())) continue;
                controlConfigInvoice = docAttributeControlConfig;
            }
            if (String.valueOf(ControlType.OwnOrgControl.getValue()).equals(controlConfigInvoice.getControlType()) && String.valueOf(CarryType.FromManage.getValue()).equals(controlConfigInvoice.getCarryType())) {
                isCopyCreator = true;
            } else if (String.valueOf(ControlType.ManageOrgControl.getValue()).equals(controlConfigInvoice.getControlType())) {
                isCopyCreator = true;
            }
        } else {
            isCopyCreator = true;
        }
        if (isCopyCreator && !CollectionUtils.isEmpty(creatorInvoicingCustomersList)) {
            for (InvoicingCustomers creatorInvoicingCustomer : creatorInvoicingCustomersList) {
                InvoicingCustomers invoicingCustomer = this.initInvoicingCustomer(creatorInvoicingCustomer.getMerchantId(), merchantApplyRangeId, creatorInvoicingCustomer.getInvoicingCustomersId(), creatorInvoicingCustomer.getIsDefault());
                invoicingCustomersList.add(invoicingCustomer);
            }
        }
        return invoicingCustomersList;
    }

    private AddMerchantSuitOrgEventDTO getAddMerchantSuitOrgEventDTO(Merchant merchant, MerchantApplyRange merchantApplyRange, MerchantDetail merchantDetail) {
        AddMerchantSuitOrgEventDTO addMerchantSuitOrgEventDTO = new AddMerchantSuitOrgEventDTO();
        addMerchantSuitOrgEventDTO.setMerchantApplyRangeId((Long)merchantApplyRange.getId());
        addMerchantSuitOrgEventDTO.setOrgId(merchantApplyRange.getOrgId());
        addMerchantSuitOrgEventDTO.setRangeType(merchantApplyRange.getRangeType());
        addMerchantSuitOrgEventDTO.setStopstatus(merchantDetail.getStopstatus());
        if (merchant != null) {
            addMerchantSuitOrgEventDTO.setCode(merchant.getCode());
            addMerchantSuitOrgEventDTO.setName(merchant.getName());
        }
        return addMerchantSuitOrgEventDTO;
    }

    private Map<String, Object> buildMessage(String erpCode, String msg) {
        HashMap<String, Object> message = new HashMap<String, Object>();
        message.put("message", msg);
        message.put("key", erpCode);
        return message;
    }

    private Map<String, Object> buildData(String erpCode, Long merchantId, Long merchantApplyRangeId, String orgId) {
        HashMap<String, Object> range = new HashMap<String, Object>();
        range.put("id", merchantApplyRangeId);
        range.put("erpCode", erpCode);
        range.put("merchantId", merchantId);
        range.put("orgId", orgId);
        return range;
    }

    public void setMerchantMaintenanceUpdate(List<MerchantApplyRangeDetail> merchantApplyRangeDetailList, List<CustomerArea> customerAreaList, List<Principal> principalList) {
        if (!CollectionUtils.isEmpty(merchantApplyRangeDetailList)) {
            for (MerchantApplyRangeDetail merchantApplyRangeDetail : merchantApplyRangeDetailList) {
                if (!CollectionUtils.isEmpty(customerAreaList)) {
                    for (CustomerArea customerArea : customerAreaList) {
                        if (!merchantApplyRangeDetail.getMerchantApplyRangeId().equals(customerArea.getmerchantApplyRangeId()) || !customerArea.getIsDefault().booleanValue()) continue;
                        merchantApplyRangeDetail.setCustomerArea(customerArea.getSaleAreaId());
                    }
                }
                if (CollectionUtils.isEmpty(principalList)) continue;
                for (Principal principal : principalList) {
                    if (!merchantApplyRangeDetail.getMerchantApplyRangeId().equals(principal.getMerchantApplyRangeId()) || !principal.getIsDefault().booleanValue()) continue;
                    merchantApplyRangeDetail.setSpecialManagementDep(principal.getSpecialManagementDep());
                    merchantApplyRangeDetail.setProfessSalesman(principal.getProfessSalesman());
                }
            }
        }
    }

    public CustomerArea initCustomerArea(Long merchantId, Long merchantApplyRangeId, Long saleAreaId, Boolean isDefault) {
        CustomerArea customerArea = new CustomerArea();
        customerArea.setId((Object)IdManager.getInstance().nextId());
        customerArea.setMerchantId(merchantId);
        customerArea.setmerchantApplyRangeId(merchantApplyRangeId);
        customerArea.setSaleAreaId(saleAreaId);
        customerArea.setIsDefault(isDefault);
        customerArea.setEntityStatus(EntityStatus.Insert);
        return customerArea;
    }

    public Principal initPrincipal(Long merchantId, Long merchantApplyRangeId, String professSalesman, String specialManagementDep, Boolean isDefault) {
        Principal principal = new Principal();
        principal.setId((Object)IdManager.getInstance().nextId());
        principal.setMerchantId(merchantId);
        principal.setMerchantApplyRangeId(merchantApplyRangeId);
        principal.setProfessSalesman(professSalesman);
        principal.setSpecialManagementDep(specialManagementDep);
        principal.setIsDefault(isDefault);
        principal.setEntityStatus(EntityStatus.Insert);
        return principal;
    }

    public InvoicingCustomers initInvoicingCustomer(Long merchantId, Long merchantApplyRangeId, Long invoicingCustomersId, Boolean isDefault) {
        InvoicingCustomers invoicingCustomer = new InvoicingCustomers();
        invoicingCustomer.setId((Object)IdManager.getInstance().nextId());
        invoicingCustomer.setMerchantId(merchantId);
        invoicingCustomer.setMerchantApplyRangeId(merchantApplyRangeId);
        invoicingCustomer.setInvoicingCustomersId(invoicingCustomersId);
        invoicingCustomer.setIsDefault(isDefault);
        invoicingCustomer.setEntityStatus(EntityStatus.Insert);
        return invoicingCustomer;
    }

    private void updateBusinessPartnerOrgGroups(List<Merchant> merchantList) {
        if (CollectionUtils.isEmpty(merchantList)) {
            return;
        }
        for (Merchant merchant : merchantList) {
            if (!StringUtils.hasText((String)merchant.getBusinessPartner())) continue;
            try {
                this.partnerRangeService.updateBusinessPartnerOrgGroup(merchant.getBusinessPartner());
            }
            catch (Exception e) {
                log.error("\u66f4\u65b0\u4e1a\u52a1\u4f19\u4f34\u9002\u7528\u8303\u56f4\u5931\u8d25, merchantId:{}, businessPartnerId:{}, error:{}", new Object[]{merchant.getId(), merchant.getBusinessPartner(), e.getMessage(), e});
            }
        }
    }
}

