/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONArray
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.service.async.KafkaTopicService
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.meta.UIMetaUtils
 *  com.yonyou.ucf.mdd.ext.poi.model.ProcessData
 *  com.yonyoucloud.upc.common.AddRangeMessage
 *  com.yonyoucloud.upc.common.enums.DataSource
 *  com.yonyoucloud.upc.pc.product.ProductOrg
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.product;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.service.async.KafkaTopicService;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.meta.UIMetaUtils;
import com.yonyou.ucf.mdd.ext.poi.model.ProcessData;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.common.AddRangeMessage;
import com.yonyoucloud.upc.common.enums.DataSource;
import com.yonyoucloud.upc.mq.KafkaMQProducerForAddRange;
import com.yonyoucloud.upc.pc.product.ProductOrg;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.service.product.ProductAddRangeHandleService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductAddRangeService {
    private static final Logger log = LoggerFactory.getLogger(ProductAddRangeService.class);
    private static final String RESULT_QUERY_URL = "/bill/status/getBatchDoProcess";
    @Lazy
    @Autowired
    private KafkaMQProducerForAddRange producerForAddRange;
    @Autowired
    private ProductAddRangeHandleService productAddRangeHandleService;
    @Autowired
    private KafkaTopicService kafkaTopicService;
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    PubOptionService pubOptionService;
    @Autowired
    private YMSParamConfig ymsParamConfig;

    public ResultList proSuitOrg(BillDataDto bill, String dataSource) throws Exception {
        JSONArray dataList;
        this.buildDatas(bill);
        if (bill.getData() instanceof String) {
            dataList = JSON.parseArray((String)((String)bill.getData()));
        } else if (bill.getData() instanceof List) {
            dataList = JSON.parseArray((String)JSONObject.toJSONString((Object)bill.getData()));
        } else {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL.getMultilingualMessage());
        }
        if (CollectionUtils.isEmpty((Collection)dataList)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL.getMultilingualMessage());
        }
        String asyncKey = bill.getAction() + "_" + UUID.randomUUID();
        int count = dataList.size();
        int syncCount = 0;
        ArrayList<AddRangeMessage> addRangeMessageList = new ArrayList<AddRangeMessage>();
        for (Object productAndOrgs : dataList) {
            ProductOrg productOrg = (ProductOrg)JSON.parseObject((String)productAndOrgs.toString(), ProductOrg.class);
            if (null == productOrg.getProductId()) {
                throw new CoreDocBusinessException("productId is null");
            }
            if (null == productOrg.getOrgIds()) {
                throw new CoreDocBusinessException("orgIds is null");
            }
            AddRangeMessage addRangeMessage = this.getAddRangeMessage(asyncKey, count + "", Long.parseLong(productOrg.getProductId()), null, productOrg.getOrgIds(), "pc_productlist", dataSource, 1);
            addRangeMessageList.add(addRangeMessage);
            syncCount += productOrg.getOrgIds().size();
        }
        if (!CollectionUtils.isEmpty(addRangeMessageList)) {
            if (DataSource.WEB_PRODUCT_SUIT_ORG.getSource().equals(dataSource) && syncCount > this.pubOptionService.getSyncAllocateOrgCount() && this.ymsParamConfig.useKafka()) {
                addRangeMessageList.forEach(v -> this.producerForAddRange.sendMessage(this.kafkaTopicService.getProductRangeTopic(), (AddRangeMessage)v));
                ProcessData.builder((int)1, (int)200, null, null).percentage("0").build(asyncKey, Integer.valueOf(600));
                return this.getResultList(asyncKey);
            }
            if (DataSource.WEB_PRODUCT_SUIT_ORG.getSource().equals(dataSource)) {
                ProcessData.builder((int)1, (int)200, null, null).percentage("0").build(asyncKey, Integer.valueOf(600));
                addRangeMessageList.forEach(v -> this.productAddRangeHandleService.dealWithAck(Collections.singletonList(v), dataSource));
                return this.getResultList(asyncKey);
            }
            ResultList resultList = this.productAddRangeHandleService.dealWithAck(addRangeMessageList, dataSource);
            HashMap<String, String> failInfos = new HashMap<String, String>();
            failInfos.put("message", resultList.getMessages().toString());
            resultList.addFailInfo(failInfos);
            return resultList;
        }
        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL.getMultilingualMessage());
    }

    private void buildDatas(BillDataDto bill) throws Exception {
        Map externalData;
        if (null == bill || null == bill.getData()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL.getMultilingualMessage());
        }
        if (null != bill.getExternalData() && bill.getExternalData() instanceof Map && "2".equals((externalData = (Map)bill.getExternalData()).get("rangeMethod"))) {
            this.getRangeDataByCondition(bill);
        }
    }

    private void getRangeDataByCondition(BillDataDto bill) throws Exception {
        List orgIds;
        Map orgDataMap;
        QueryConditionGroup queryConditionGroup = UIMetaUtils.handleQueryCondtion((FilterVO)bill.getCondition());
        QuerySchema querySchema = QuerySchema.create().distinct().addSelect(new String[]{"id", "name"}).addCondition((ConditionExpression)queryConditionGroup).appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"creatorType").not_eq((Object)"3")});
        List productList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)productList) && bill.getData() instanceof String && (orgDataMap = (Map)JSONObject.parseObject((String)bill.getData().toString(), Map.class)).get("orgIds") instanceof List && !CollectionUtils.isEmpty((Collection)(orgIds = (List)orgDataMap.get("orgIds")))) {
            ArrayList datas = new ArrayList();
            for (Map product : productList) {
                HashMap data = new HashMap();
                data.put("productId", product.get("id"));
                data.put("product_name", product.get("name"));
                data.put("orgIds", orgIds);
                datas.add(data);
            }
            bill.setData(datas);
            return;
        }
        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL.getMultilingualMessage());
    }

    public ResultList syncProductRangeByOrg(Map dto) {
        ResultList resultList = this.productAddRangeHandleService.initResultList(0);
        List data = (List)dto.get("data");
        if (CollectionUtils.isEmpty((Collection)data)) {
            resultList.addMessage(this.productAddRangeHandleService.getResultMsg(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805BF", (String)"data\u6570\u636e\u4e3a\u7a7a\uff01"), ""));
            return resultList;
        }
        resultList.setCount(data.size());
        ArrayList<AddRangeMessage> addRangeMessageList = new ArrayList<AddRangeMessage>();
        String asyncKey = "syncProductRangeByOrg_" + UUID.randomUUID();
        for (Map product : data) {
            if (null == product) {
                resultList.addMessage(this.productAddRangeHandleService.getResultMsg(CoreDocBusinessErrorEnum.PARAM_NOT_NULL.getMultilingualMessage(), null));
                resultList.incFailCount();
                continue;
            }
            if (null == product.get("product_erpCode")) {
                resultList.addMessage(this.productAddRangeHandleService.getResultMsg("product_erpCode is null", data.toString()));
                resultList.incFailCount();
                continue;
            }
            if (null == product.get("orgIds")) {
                resultList.addMessage(this.productAddRangeHandleService.getResultMsg("orgIds is null", product.get("product_erpCode").toString()));
                resultList.incFailCount();
                continue;
            }
            ArrayList<String> orgIdList = new ArrayList<String>();
            List orgIds = (List)product.get("orgIds");
            for (Map org : orgIds) {
                if (null == org.get("orgId")) continue;
                orgIdList.add(org.get("orgId").toString());
            }
            if (CollectionUtils.isEmpty(orgIdList)) {
                resultList.addMessage(this.productAddRangeHandleService.getResultMsg("orgIds is null", product.get("product_erpCode").toString()));
                resultList.incFailCount();
                continue;
            }
            AddRangeMessage addRangeMessage = this.getAddRangeMessage(asyncKey, data.size() + "", null, product.get("product_erpCode").toString(), orgIdList, "pc_product", DataSource.YQL_PRODUCT_SUIT_ORG.getSource(), 1);
            addRangeMessageList.add(addRangeMessage);
        }
        ResultList dealResultList = this.productAddRangeHandleService.dealWithAck(addRangeMessageList, DataSource.YQL_PRODUCT_SUIT_ORG.getSource());
        resultList.setFailCount(resultList.getFailCount() + dealResultList.getFailCount());
        resultList.setSucessCount(resultList.getSucessCount() + dealResultList.getSucessCount());
        resultList.setMessages(dealResultList.getMessages());
        return resultList;
    }

    public void dealProSuitOrgBykafka(List<String> productIdList, List<String> orgList) throws Exception {
        String asyncKey = UUID.randomUUID().toString();
        for (String productId : productIdList) {
            AddRangeMessage addRangeMessage = this.getAddRangeMessage(asyncKey, "1", Long.parseLong(productId), null, orgList, "pc_product", DataSource.MC_PRODUCT_SUIT_ORG.getSource(), 1);
            if (this.ymsParamConfig.useKafka()) {
                this.producerForAddRange.sendMessage(this.kafkaTopicService.getProductRangeTopic(), addRangeMessage);
                continue;
            }
            this.productAddRangeHandleService.dealWithAck(Arrays.asList(addRangeMessage), DataSource.CUSTOMER_APPLY_ADD_RANGE.getSource());
        }
    }

    public Map<String, String> syncUOrderProductAuthorization(BillDataDto dto) {
        HashMap<String, String> result = new HashMap<String, String>();
        if (!"pc_product".equalsIgnoreCase(dto.getBillnum())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800864);
        }
        List data = (List)dto.getData();
        if (CollectionUtils.isEmpty((Collection)data)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800865);
        }
        ArrayList<Map> wrongDatas = new ArrayList<Map>();
        ResultList resultList = this.productAddRangeHandleService.initResultList(data.size());
        ArrayList<AddRangeMessage> addRangeMessageList = new ArrayList<AddRangeMessage>();
        String asyncKey = "syncProductRangeByOrg_" + UUID.randomUUID();
        for (Map product : data) {
            List productIdList;
            if (null == product) {
                wrongDatas.add(product);
                continue;
            }
            if (null == product.get("productIds")) {
                wrongDatas.add(product);
                continue;
            }
            if (null == product.get("type")) {
                wrongDatas.add(product);
                continue;
            }
            if (2 == Integer.parseInt(product.get("type").toString())) {
                if (null == product.get("customerId")) {
                    wrongDatas.add(product);
                    continue;
                }
                productIdList = (List)product.get("productIds");
                String customerId = product.get("customerId").toString();
                addRangeMessageList.addAll(this.getAddRangeMessageList(productIdList, customerId, 2, asyncKey, data.size()));
                continue;
            }
            if (3 == Integer.parseInt(product.get("type").toString())) {
                if (null == product.get("shopId")) {
                    wrongDatas.add(product);
                    continue;
                }
                productIdList = (List)product.get("productIds");
                String shopId = product.get("shopId").toString();
                addRangeMessageList.addAll(this.getAddRangeMessageList(productIdList, shopId, 3, asyncKey, data.size()));
                continue;
            }
            wrongDatas.add(product);
        }
        if (!CollectionUtils.isEmpty(addRangeMessageList)) {
            resultList = this.productAddRangeHandleService.dealWithAck(addRangeMessageList, DataSource.SYNC_PRODUCT_AUTH_RANGE.getSource());
        } else {
            this.addMapValue(result, "msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080465", (String)"\u6570\u636e\u5df2\u5b58\u5728\u6216\u6570\u636e\u9519\u8bef"));
        }
        if (!CollectionUtils.isEmpty(wrongDatas)) {
            this.addMapValue(result, "msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080470", (String)"\u6570\u636e\u683c\u5f0f\u9519\u8bef\uff1a") + wrongDatas);
        }
        if (resultList.getSucessCount() > 0) {
            this.addMapValue(result, "msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080461", (String)"\u65b0\u589e\u6210\u529f\uff1a") + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080462", (String)"\uff08\u5171") + resultList.getSucessCount() + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080460", (String)"\u6761\uff09"));
        }
        if (resultList.getFailCount() > 0) {
            this.addMapValue(result, "msg", resultList.getMessages().toString());
        }
        return result;
    }

    private List<AddRangeMessage> getAddRangeMessageList(List<Object> productIdList, String orgId, int rangeType, String asyncKey, int count) {
        ArrayList<AddRangeMessage> addRangeMessageList = new ArrayList<AddRangeMessage>();
        if (!CollectionUtils.isEmpty(productIdList) && null != orgId) {
            for (Object productId : productIdList) {
                long productIdLong = Long.parseLong(productId.toString());
                addRangeMessageList.add(this.getAddRangeMessage(asyncKey, count + "", productIdLong, null, new ArrayList<String>(Collections.singletonList(orgId)), "pc_product", DataSource.SYNC_PRODUCT_AUTH_RANGE.getSource(), rangeType));
            }
        }
        return addRangeMessageList;
    }

    private ResultList getResultList(String key) {
        HashMap<String, String> map = new HashMap<String, String>(6);
        map.put("url", RESULT_QUERY_URL);
        map.put("asyncKey", key);
        ResultList list = new ResultList();
        list.addInfo(map);
        return list;
    }

    public AddRangeMessage getAddRangeMessage(String asyncKey, String totalCount, Long id, String erpCode, List<String> orgIdList, String achiveType, String dataSource, int rangeType) {
        AddRangeMessage addRangeMessage = new AddRangeMessage();
        addRangeMessage.setBatchNo(asyncKey);
        addRangeMessage.setBatchCount(totalCount);
        addRangeMessage.setId(id);
        addRangeMessage.setErpCode(erpCode);
        addRangeMessage.setOrgIdList(orgIdList);
        addRangeMessage.setArchiveType(achiveType);
        addRangeMessage.setDataSource(dataSource);
        addRangeMessage.setRangeType(rangeType);
        addRangeMessage.setYTenantId(AppContext.getCurrentUser().getYTenantId());
        addRangeMessage.setAllocatorId((Long)AppContext.getCurrentUser().getId());
        addRangeMessage.setAllocatorName(AppContext.getCurrentUser().getName());
        addRangeMessage.setLocale(InvocationInfoProxy.getLocale());
        return addRangeMessage;
    }

    private void addMapValue(Map<String, String> map, String key, String value) {
        if (map.containsKey(key)) {
            map.put(key, map.get(key).concat(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080468", (String)"\uff1b") + value));
        } else {
            map.put(key, value);
        }
    }

    public void sendProductApplyAddRange(ProductApply productApply) {
        if (productApply.getApplyProductId() == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_RANGE_ORG_PRODUCT_NOT_NULL);
        }
        String requestId = UUID.randomUUID().toString();
        AddRangeMessage addRangeMessage = new AddRangeMessage();
        addRangeMessage.setId(productApply.getApplyProductId());
        addRangeMessage.setProductApplyId((Long)productApply.getId());
        addRangeMessage.setBatchNo(requestId);
        addRangeMessage.setBatchCount("1");
        addRangeMessage.setArchiveType("pc_productapply");
        addRangeMessage.setDataSource(DataSource.PRODUCT_APPLY_ADD_RANGE.getSource());
        addRangeMessage.setYTenantId((String)AppContext.getYTenantId());
        addRangeMessage.setRangeType(1);
        addRangeMessage.setAllocatorId(productApply.getCreatorId());
        addRangeMessage.setAllocatorName(productApply.getCreator());
        if (this.ymsParamConfig.useKafka()) {
            this.producerForAddRange.sendMessage(this.kafkaTopicService.getProductRangeTopic(), addRangeMessage);
        } else {
            this.productAddRangeHandleService.dealWithAck(Collections.singletonList(addRangeMessage), DataSource.PRODUCT_APPLY_ADD_RANGE.getSource());
        }
    }

    public ResultList cancelProductOrg(BillDataDto bill) throws Exception {
        this.buildDatas(bill);
        return this.billService.batchDo(bill);
    }
}

