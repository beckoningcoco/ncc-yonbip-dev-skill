/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.coredoc.service.utils.OrgPermissionsService
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.dao.material.MaterialQryDao
 *  com.yonyou.iuap.apdoc.coredoc.dto.event.SuitOrgDTO
 *  com.yonyou.iuap.apdoc.coredoc.dto.event.SuitOrgEventDTO
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.material.MaterialRangeType
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.po.material.MaterialPO
 *  com.yonyou.iuap.apdoc.coredoc.service.async.KafkaTopicService
 *  com.yonyou.iuap.apdoc.coredoc.utils.CoredocContextUtils
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.basedocmc.service.inner.IMCInnerService
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.poi.model.ProcessData
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyou.ucf.mdd.ext.util.Toolkit
 *  com.yonyoucloud.upc.common.AddRangeMessage
 *  com.yonyoucloud.upc.common.enums.DataSource
 *  com.yonyoucloud.upc.data.product.ProductGroupDao
 *  com.yonyoucloud.upc.data.productapply.ProductApplyAddRangeDao
 *  com.yonyoucloud.upc.data.productapply.ProductApplyQueryDao
 *  com.yonyoucloud.upc.pc.product.CreatorType
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.productapply.EffectStatus
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  com.yonyoucloud.upc.pc.productapply.ProductApplyAddRange
 *  org.apache.commons.lang3.ObjectUtils
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service.product;

import com.yonyou.coredoc.service.utils.OrgPermissionsService;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.dao.material.MaterialQryDao;
import com.yonyou.iuap.apdoc.coredoc.dto.event.SuitOrgDTO;
import com.yonyou.iuap.apdoc.coredoc.dto.event.SuitOrgEventDTO;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.material.MaterialRangeType;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.po.material.MaterialPO;
import com.yonyou.iuap.apdoc.coredoc.service.async.KafkaTopicService;
import com.yonyou.iuap.apdoc.coredoc.utils.CoredocContextUtils;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.basedocmc.service.inner.IMCInnerService;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.poi.model.ProcessData;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyou.ucf.mdd.ext.util.Toolkit;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.common.AddRangeMessage;
import com.yonyoucloud.upc.common.enums.DataSource;
import com.yonyoucloud.upc.data.product.ProductGroupDao;
import com.yonyoucloud.upc.data.productapply.ProductApplyAddRangeDao;
import com.yonyoucloud.upc.data.productapply.ProductApplyQueryDao;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.event.EventType;
import com.yonyoucloud.upc.mq.KafkaMQProducerForAddRange;
import com.yonyoucloud.upc.pc.product.CreatorType;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.productapply.EffectStatus;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.pc.productapply.ProductApplyAddRange;
import com.yonyoucloud.upc.service.ProductApplyService;
import com.yonyoucloud.upc.service.api.ProductDetailServiceImpl;
import com.yonyoucloud.upc.service.productapply.ProductApplyUpdateService;
import com.yonyoucloud.upc.service.utils.ProductOrgShareUtil;
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
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
public class ProductAddRangeHandleService {
    private static final Logger log = LoggerFactory.getLogger(ProductAddRangeHandleService.class);
    public static final String KAFKA_PRODUCT_ADD_RANGE_COUNT = "kafkaProductAddRangeCount";
    private static final String SYNC_PRODUCT_ADD_RANGE = "syncProductAddRange";
    @Lazy
    @Autowired
    private KafkaMQProducerForAddRange producerForAddRange;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private KafkaTopicService kafkaTopicService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    ProductGroupDao productGroupDao;
    @Autowired
    private IOrgUnitQueryService iOrgUnitQueryService;
    @Autowired
    ProductApplyService productApplyService;
    @Autowired
    ProductOrgShareUtil productOrgShareUtil;
    @Autowired
    private OrgPermissionsService orgPermissionsService;
    @Autowired
    ProductDetailServiceImpl productDetailService;
    @Autowired
    ProductApplyUpdateService productApplyUpdateService;
    @Autowired
    ProductApplyAddRangeDao productApplyAddRangeDao;
    @Autowired
    ProductApplyQueryDao productApplyQueryDao;
    @Autowired
    private EventService2 eventService;
    @Autowired
    private MaterialQryDao materialQryDao;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    IMCInnerService mcInnerService;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Transactional(rollbackFor={Throwable.class})
    public ResultList dealWithAck(List<AddRangeMessage> addRangeMessageList, String dataSource) {
        ResultList resultList;
        block21: {
            resultList = this.initResultList(0);
            String kafkaProductAddRangeCountLockKey = KAFKA_PRODUCT_ADD_RANGE_COUNT + AppContext.getTenantId();
            String syncProductAddRangeLockKey = SYNC_PRODUCT_ADD_RANGE + AppContext.getTenantId();
            String batchNo = "";
            boolean isProcessed = true;
            try {
                if (CollectionUtils.isEmpty(addRangeMessageList)) break block21;
                resultList.setCount(addRangeMessageList.size());
                batchNo = addRangeMessageList.get(0).getBatchNo();
                String kafkaProductAddRangeCount = AppContext.cache().get(kafkaProductAddRangeCountLockKey);
                if (kafkaProductAddRangeCount != null && 0 < Integer.parseInt(kafkaProductAddRangeCount)) {
                    if (DataSource.WEB_PRODUCT_SUIT_ORG.getSource().equals(dataSource) || DataSource.MC_PRODUCT_SUIT_ORG.getSource().equals(dataSource) || DataSource.PRODUCT_APPLY_ADD_RANGE.getSource().equals(dataSource)) {
                        AppContext.cache().incr(kafkaProductAddRangeCountLockKey);
                        AppContext.cache().expire(kafkaProductAddRangeCountLockKey, 3600);
                        this.handleProductAddRange(addRangeMessageList, dataSource, resultList);
                    } else {
                        resultList.setFailCount(resultList.getCount());
                        Map<String, String> resultMsg = this.getResultMsg(CoreDocBusinessErrorEnum.APPLY_RANGE_PARALLEL_DEAL_ERROR.getMultilingualMessage(), "");
                        if (DataSource.YQL_PRODUCT_SUIT_ORG.getSource().equals(dataSource)) {
                            resultList.addMessage(resultMsg);
                        } else {
                            resultList.addMessage((Object)resultMsg.get("message"));
                        }
                    }
                    break block21;
                }
                for (int tryLockNum = 0; tryLockNum <= 160; ++tryLockNum) {
                    if (tryLockNum > 25 && DataSource.API_PRODUCT_SUIT_ORG.getSource().equals(dataSource)) {
                        isProcessed = false;
                        resultList.setFailCount(resultList.getCount());
                        resultList.addMessage((Object)this.getResultMsg(CoreDocBusinessErrorEnum.APPLY_RANGE_PARALLEL_DEAL_ERROR.getMultilingualMessage(), "").get("message"));
                        break;
                    }
                    if (tryLockNum > 150) {
                        isProcessed = false;
                        if (this.ymsParamConfig.useKafka()) {
                            this.producerForAddRange.sendMessage(this.kafkaTopicService.getProductRangeTopic(), addRangeMessageList.get(0));
                            break;
                        }
                        log.error("\u5b58\u5728\u6b63\u5728\u6267\u884c\u7684\u7269\u6599\u5206\u914d\u7ec4\u7ec7\u4efb\u52a1\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5");
                    }
                    if (RedisTool.tryGetLock((String)syncProductAddRangeLockKey, (String)batchNo, (int)3600)) {
                        if (DataSource.WEB_PRODUCT_SUIT_ORG.getSource().equals(dataSource) || DataSource.MC_PRODUCT_SUIT_ORG.getSource().equals(dataSource) || DataSource.PRODUCT_APPLY_ADD_RANGE.getSource().equals(dataSource)) {
                            AppContext.cache().incr(kafkaProductAddRangeCountLockKey);
                            AppContext.cache().expire(kafkaProductAddRangeCountLockKey, 3600);
                        }
                        this.handleProductAddRange(addRangeMessageList, dataSource, resultList);
                        break;
                    }
                    if (!(DataSource.MC_PRODUCT_SUIT_ORG.getSource().equals(dataSource) || DataSource.WEB_PRODUCT_SUIT_ORG.getSource().equals(dataSource) || DataSource.API_PRODUCT_SUIT_ORG.getSource().equals(dataSource) || DataSource.PRODUCT_APPLY_ADD_RANGE.getSource().equals(dataSource))) {
                        resultList.setFailCount(resultList.getCount());
                        Map<String, String> resultMsg = this.getResultMsg(CoreDocBusinessErrorEnum.APPLY_RANGE_PARALLEL_DEAL_ERROR.getMultilingualMessage(), "");
                        if (DataSource.YQL_PRODUCT_SUIT_ORG.getSource().equals(dataSource)) {
                            resultList.addMessage(resultMsg);
                        } else {
                            resultList.addMessage((Object)resultMsg.get("message"));
                        }
                        break;
                    }
                    TimeUnit.MILLISECONDS.sleep(200L);
                }
            }
            catch (Exception e) {
                log.error(this.getClass() + "/checkProductData, exception:" + e.getMessage(), (Throwable)e);
                resultList.setFailCount(resultList.getCount());
                resultList.addMessage(this.getResultMsg(CoreDocBusinessErrorEnum.SYSTEM_ERROR.getMultilingualMessage(), e.getMessage()));
            }
            finally {
                if (DataSource.WEB_PRODUCT_SUIT_ORG.getSource().equals(dataSource)) {
                    this.writeProcess(addRangeMessageList.get(0), resultList);
                }
                if ((DataSource.WEB_PRODUCT_SUIT_ORG.getSource().equals(dataSource) || DataSource.MC_PRODUCT_SUIT_ORG.getSource().equals(dataSource) || DataSource.PRODUCT_APPLY_ADD_RANGE.getSource().equals(dataSource)) && isProcessed) {
                    AppContext.cache().decr(kafkaProductAddRangeCountLockKey);
                }
                RedisTool.releaseLock((String)syncProductAddRangeLockKey, (String)batchNo);
            }
        }
        return resultList;
    }

    private void handleProductAddRange(List<AddRangeMessage> addRangeMessageList, String dataSource, ResultList resultList) throws Exception {
        if (DataSource.PRODUCT_APPLY_ADD_RANGE.getSource().equals(dataSource)) {
            this.dealAddProductSuitOrgFromProductApply(addRangeMessageList);
            return;
        }
        List<Product> productList = this.getProductList(addRangeMessageList, dataSource);
        Map<String, Product> uniqueKeyProductmap = this.checkProductData(productList, addRangeMessageList, resultList, dataSource);
        for (AddRangeMessage addRangeMessage : addRangeMessageList) {
            Product product = DataSource.YQL_PRODUCT_SUIT_ORG.getSource().equals(dataSource) ? uniqueKeyProductmap.get(addRangeMessage.getErpCode()) : uniqueKeyProductmap.get(addRangeMessage.getId().toString());
            this.dealProSuitOrg(addRangeMessage, product, resultList);
        }
    }

    private void dealAddProductSuitOrgFromProductApply(List<AddRangeMessage> addRangeMessageList) throws Exception {
        if (this.pubOptionService.getOrgGlobalShare("pc.product.Product").booleanValue() || CollectionUtils.isEmpty(addRangeMessageList)) {
            return;
        }
        AddRangeMessage addRangeMessage = addRangeMessageList.get(0);
        ProductApply productApply = new ProductApply();
        productApply.setId((Object)addRangeMessage.getProductApplyId());
        try {
            this.productApplyService.dealAddProductSuitOrgFromProductApply(addRangeMessage);
            String failOrgName = this.processProductOrgDetail(addRangeMessage);
            this.updateProductAuditInfo(addRangeMessage);
            if (StringUtils.hasText((String)failOrgName)) {
                productApply.setPartialSuccessInfo(CoreDocBusinessErrorEnum.PRODUCT_APPLY_PARTIAL_SUCCESS_INFO.getMultilingualMessage(new Object[]{failOrgName}));
            }
            productApply.setEffectStatus(EffectStatus.success);
            productApply.setFailInfo(null);
            productApply.setApplyProductId(addRangeMessage.getId());
        }
        catch (Exception e) {
            log.error("dealAddProductSuitOrgFromProductApply_error{}", (Object)e.getMessage(), (Object)e);
            if (e.getMessage().length() > 500) {
                productApply.setFailInfo(e.getMessage().substring(0, 500));
            } else {
                productApply.setFailInfo(e.getMessage());
            }
            productApply.setEffectStatus(EffectStatus.fail);
        }
        this.productApplyUpdateService.updateEffectStatus(productApply);
    }

    private void updateProductAuditInfo(AddRangeMessage addRangeMessage) {
        try {
            ProductApply productApply = (ProductApply)MetaDaoHelper.findById((String)"pc.productapply.ProductApply", (Object)addRangeMessage.getProductApplyId());
            if (productApply != null) {
                Product productAudit = new Product();
                productAudit.setId((Object)addRangeMessage.getId());
                productAudit.setModifier(productApply.getCreator());
                productAudit.setModifierId(productApply.getCreatorId());
                productAudit.setModifyDate(new Date());
                productAudit.setModifyTime(new Date());
                productAudit.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.update((String)"pc.product.Product", (BizObject)productAudit);
            }
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u7533\u8bf7\u5206\u914d\u4efb\u52a1\u66f4\u65b0\u7269\u6599\u5ba1\u8ba1\u4fe1\u606f\u5f02\u5e38:{}", (Object)e.getMessage(), (Object)e);
        }
    }

    private String processProductOrgDetail(AddRangeMessage addRangeMessage) throws Exception {
        ProductApply productApply = this.productApplyQueryDao.getProductApplyByIdAndFields(addRangeMessage.getProductApplyId(), new String[]{"id", "applyCode", "applyProductId", "creator", "creatorId"});
        if (productApply == null) {
            return null;
        }
        List applyAddRangeList = this.productApplyAddRangeDao.getApplyAddRangeListByApplyId(addRangeMessage.getProductApplyId());
        if (CollectionUtils.isEmpty((Collection)applyAddRangeList)) {
            return null;
        }
        StringBuffer failOrgName = new StringBuffer();
        List<Map<String, Object>> productApplyRangeList = ProductAddRangeHandleService.getProductApplyRangeList(productApply.getApplyProductId());
        Map<Object, Map> productApplyRangeMap = productApplyRangeList.stream().collect(Collectors.toMap(k -> k.get("orgId"), productApplyRange -> productApplyRange));
        for (ProductApplyAddRange applyAddRange : applyAddRangeList) {
            if (!StringUtils.hasText((String)applyAddRange.getProductOrgData())) continue;
            Map productDataMap = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(applyAddRange.getProductOrgData(), Map.class);
            productDataMap.put("detail!productApplyRangeId", productApplyRangeMap.get(applyAddRange.getOrgId()).get("id"));
            productDataMap.put("time!productApplyRangeId", productApplyRangeMap.get(applyAddRange.getOrgId()).get("id"));
            productDataMap.put("productApplyRangeId", productApplyRangeMap.get(applyAddRange.getOrgId()).get("id"));
            applyAddRange.setProductOrgData(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)productDataMap));
            applyAddRange.put("productApplyCode", (Object)productApply.getApplyCode());
            applyAddRange.put("productId", (Object)productApply.getApplyProductId());
            applyAddRange.put("creatorId", (Object)productApply.getCreatorId());
            applyAddRange.put("creator", (Object)productApply.getCreator());
            boolean updateResult = this.productApplyService.auditOrgDetailApply(applyAddRange);
            if (updateResult) continue;
            failOrgName.append(productApplyRangeMap.get(applyAddRange.getOrgId()).get("org_Name")).append(",");
        }
        if (failOrgName.length() > 0) {
            return failOrgName.substring(0, failOrgName.length() - 1);
        }
        return failOrgName.toString();
    }

    private Map<String, Product> checkProductData(List<Product> productList, List<AddRangeMessage> addRangeMessageList, ResultList resultList, String dataSource) throws Exception {
        HashMap<String, Product> uniqueKeyProductmap = new HashMap<String, Product>();
        if (DataSource.YQL_PRODUCT_SUIT_ORG.getSource().equals(dataSource)) {
            List erpCodeList = addRangeMessageList.stream().map(AddRangeMessage::getErpCode).collect(Collectors.toList());
            List queryErpCodeList = productList.stream().map(v -> v.getErpCode()).collect(Collectors.toList());
            HashSet erpCodeSet = new HashSet(erpCodeList);
            HashSet queryErpCodeSet = new HashSet(queryErpCodeList);
            erpCodeSet.removeAll(queryErpCodeSet);
            if (!CollectionUtils.isEmpty(erpCodeSet)) {
                resultList.setFailCount(resultList.getFailCount() + erpCodeSet.size());
                resultList.addMessage(this.getResultMsg(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408037A", (String)"\u7269\u6599\u5df2\u88ab\u5220\u9664\uff0c\u8bf7\u5237\u65b0\u540e\u91cd\u8bd5"), ((Object)erpCodeSet).toString()));
            }
        } else {
            List idList = addRangeMessageList.stream().map(AddRangeMessage::getId).collect(Collectors.toList());
            List queryIdList = productList.stream().map(v -> (Long)v.getId()).collect(Collectors.toList());
            HashSet idSet = new HashSet(idList);
            HashSet queryIdSet = new HashSet(queryIdList);
            idSet.removeAll(queryIdSet);
            if (!CollectionUtils.isEmpty(idSet)) {
                resultList.setFailCount(resultList.getFailCount() + idSet.size());
                resultList.addMessage(this.getResultMsg(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408037A", (String)"\u7269\u6599\u5df2\u88ab\u5220\u9664\uff0c\u8bf7\u5237\u65b0\u540e\u91cd\u8bd5"), ((Object)idSet).toString()));
            }
        }
        if (!CollectionUtils.isEmpty(productList)) {
            for (Product product : productList) {
                String productCode = product.getCode();
                if (DataSource.YQL_PRODUCT_SUIT_ORG.getSource().equals(dataSource)) {
                    productCode = product.getErpCode();
                } else if (DataSource.SYNC_PRODUCT_AUTH_RANGE.getSource().equals(dataSource)) {
                    uniqueKeyProductmap.put(product.getId().toString(), product);
                    continue;
                }
                if (!CreatorType.tenant.equals((Object)product.getCreatorType()) && !CreatorType.org.equals((Object)product.getCreatorType())) {
                    resultList.setFailCount(resultList.getFailCount() + 1);
                    resultList.addMessage(this.getResultMsg(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408037C", (String)"\u7269\u6599[{0}]\u975e\u7ec4\u7ec7\u521b\u5efa\uff0c\u65e0\u6cd5\u5206\u914d"), productCode), productCode));
                    continue;
                }
                if (null == product.getOrgId()) {
                    resultList.setFailCount(resultList.getFailCount() + 1);
                    resultList.addMessage(this.getResultMsg(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408037E", (String)"\u7269\u6599[{0}]\u521b\u5efa\u7ec4\u7ec7\u4e3a\u7a7a\uff0c\u8bf7\u8054\u7cfb\u7ba1\u7406\u5458\u5904\u7406"), productCode), productCode));
                    continue;
                }
                if (!this.upcControlRuleService.checkVoucherManageShareOrg("pc.product.Product", product.getOrgId()).booleanValue()) {
                    resultList.setFailCount(resultList.getFailCount() + 1);
                    resultList.addMessage(this.getResultMsg(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080381", (String)"\u7269\u6599[{0}]\u521b\u5efa\u7ec4\u7ec7[{1}]\u672a\u5f00\u542f\u5171\u4eab\u4e0b\u7ea7\uff0c\u65e0\u6cd5\u5206\u914d\u8be5\u7ec4\u7ec7\u521b\u5efa\u7684\u7269\u6599\u7ed9\u5176\u4ed6\u7ec4\u7ec7"), product.get("orgCode").toString(), product.get("orgName").toString()), productCode));
                    continue;
                }
                if (DataSource.YQL_PRODUCT_SUIT_ORG.getSource().equals(dataSource)) {
                    uniqueKeyProductmap.put(product.getErpCode(), product);
                    continue;
                }
                uniqueKeyProductmap.put(product.getId().toString(), product);
            }
        }
        return uniqueKeyProductmap;
    }

    private List<Product> getProductList(List<AddRangeMessage> addRangeMessageList, String dataSource) throws Exception {
        QueryConditionGroup conditionGroup;
        ArrayList<Product> productList = new ArrayList<Product>();
        if (DataSource.YQL_PRODUCT_SUIT_ORG.getSource().equals(dataSource)) {
            List erpCodeList = addRangeMessageList.stream().map(AddRangeMessage::getErpCode).collect(Collectors.toList());
            conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"erpCode").in(erpCodeList)});
        } else {
            List idList = addRangeMessageList.stream().map(AddRangeMessage::getId).collect(Collectors.toList());
            conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(idList)});
        }
        QuerySchema productSchema = QuerySchema.create().addSelect("id,code,erpCode,creatorType,orgId,orgId.name as orgName,orgId.code as orgCode").addCondition((ConditionExpression)conditionGroup);
        List productMapList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)productSchema);
        if (!CollectionUtils.isEmpty((Collection)productMapList)) {
            for (Map productMap : productMapList) {
                productList.add((Product)Objectlizer.convert((Map)productMap, (String)"pc.product.Product"));
            }
        }
        return productList;
    }

    private void writeProcess(AddRangeMessage addRangeMessage, ResultList resultList) {
        String key_currentCount = addRangeMessage.getBatchNo() + "_currentCount";
        String key_successCount = addRangeMessage.getBatchNo() + "_successCount";
        String key_failCount = addRangeMessage.getBatchNo() + "_failCount";
        String key_message = addRangeMessage.getBatchNo() + "_message";
        if (resultList.getCount() == resultList.getSucessCount()) {
            AppContext.cache().incr(key_successCount);
        } else {
            int failCount = AppContext.cache().incr(key_failCount).intValue();
            if (failCount <= 30) {
                AppContext.cache().lpush(key_message, new String[]{resultList.getMessages().toString()});
            }
        }
        int currentCount = AppContext.cache().incr(key_currentCount).intValue();
        int count = Integer.parseInt(addRangeMessage.getBatchCount());
        String precentValue = Toolkit.getPrecentValue((int)count, (int)currentCount);
        ProcessData processData = ProcessData.builder((int)1, (int)200, null, null).percentage(precentValue);
        if (currentCount == count) {
            List messages = AppContext.cache().lrange(key_message, 0L, -1L);
            List messageObjList = messages.stream().map(v -> v).collect(Collectors.toList());
            int successCount = AppContext.cache().incr(key_successCount).intValue() - 1;
            int failCount = AppContext.cache().incr(key_failCount).intValue() - 1;
            processData.count(count).successCount(successCount).failCount(failCount);
            ResultList finallyResultList = this.initResultList(count);
            finallyResultList.setSucessCount(successCount);
            finallyResultList.setFailCount(failCount);
            finallyResultList.setMessages(messageObjList);
            processData.data((Object)finallyResultList);
            AppContext.cache().del(new String[]{key_successCount, key_failCount, key_currentCount, key_message});
        }
        processData.build(addRangeMessage.getBatchNo(), Integer.valueOf(600));
    }

    private void dealProSuitOrg(AddRangeMessage addRangeMessage, Product product, ResultList resultList) throws Exception {
        if (null != product) {
            String productCode = product.getCode();
            if (DataSource.YQL_PRODUCT_SUIT_ORG.getSource().equals(addRangeMessage.getDataSource())) {
                productCode = product.getErpCode();
            }
            ArrayList orgIdList = new ArrayList(new HashSet(addRangeMessage.getOrgIdList()));
            if (1 == addRangeMessage.getRangeType()) {
                Set<String> orgRangeShare = this.getAllShareOrg((Long)product.getId(), product.getOrgId());
                if (CollectionUtils.isEmpty(orgRangeShare)) {
                    resultList.setFailCount(resultList.getFailCount() + 1);
                    resultList.addMessage(this.getResultMsg(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080384", (String)"\u7269\u6599[{0}]\u521b\u5efa\u7ec4\u7ec7[{1}]\u672a\u8bbe\u7f6e\u5171\u4eab\u4e0b\u7ea7\u7ec4\u7ec7\uff0c\u65e0\u6cd5\u5206\u914d\u8be5\u7ec4\u7ec7\u521b\u5efa\u7684\u7269\u6599\u7ed9\u5176\u4ed6\u7ec4\u7ec7"), productCode, product.get("orgName").toString()), productCode));
                    return;
                }
                HashSet<String> orgRangeShareSet = new HashSet<String>(orgRangeShare);
                HashSet orgIdSet = new HashSet(orgIdList);
                orgIdSet.removeAll(orgRangeShareSet);
                if (!CollectionUtils.isEmpty(orgIdSet)) {
                    QuerySchema queryOrgsSchema = QuerySchema.create().addSelect(new String[]{"code", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(orgIdSet)}));
                    List notExists = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)queryOrgsSchema, (String)"ucf-org-center");
                    resultList.setFailCount(resultList.getFailCount() + 1);
                    resultList.addMessage(this.getResultMsg(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080377", (String)"\u7269\u6599[{0}]\u521b\u5efa\u7ec4\u7ec7[{1}]\u5171\u4eab\u4e0b\u7ea7\u7ec4\u7ec7\u8303\u56f4\u4e0d\u5305\u542b\u4ee5\u4e0b\u7ec4\u7ec7{2}\uff0c\u65e0\u6cd5\u5206\u914d"), productCode, product.get("orgName"), notExists.stream().map(map -> map.get("name").toString()).collect(Collectors.toList())), productCode));
                }
                HashSet<String> orgIdInSet = new HashSet<String>(orgIdList);
                orgIdInSet.retainAll(orgRangeShare);
                if (!CollectionUtils.isEmpty(orgIdInSet)) {
                    List<Map<String, Object>> proApplyRangeList = ProductAddRangeHandleService.getProductApplyRangeList((Long)product.getId());
                    List orgsInDb = proApplyRangeList.stream().map(map -> map.get("orgId").toString()).collect(Collectors.toList());
                    HashSet orgsInDbSet = new HashSet(orgsInDb);
                    orgIdInSet.removeAll(orgsInDbSet);
                    this.saveProductApplyRange((Long)product.getId(), orgIdInSet, "1", addRangeMessage.getAllocatorId(), addRangeMessage.getAllocatorName());
                    this.handleProductSuitOrgEvent((Long)product.getId(), orgIdInSet, "addprosuitorg");
                }
                if (CollectionUtils.isEmpty(orgIdSet)) {
                    resultList.setSucessCount(resultList.getSucessCount() + 1);
                }
            } else {
                Long shopId = Long.valueOf((String)addRangeMessage.getOrgIdList().get(0));
                if (!this.isBusinessRole(shopId)) {
                    resultList.setFailCount(resultList.getFailCount() + 1);
                    resultList.addMessage(this.getResultMsg(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C59CB2E05580008", (String)"\u7269\u6599[{0}]\u5bf9\u5e94\u5f85\u5206\u914d\u7684\u5546\u5bb6\u9002\u7528\u7ec4\u7ec7[{1}]\u975e\u5546\u5bb6\u8eab\u4efd\uff0c\u4e0d\u5141\u8bb8\u5206\u914d"), productCode, String.valueOf(shopId)), productCode));
                    return;
                }
                List<Map<String, Object>> proApplyRangeList = ProductAddRangeHandleService.getProductApplyRangeList((Long)product.getId());
                List rangesInDb = proApplyRangeList.stream().filter(v -> v.get("customerId") != null && v.get("customerId").toString().equals(shopId.toString()) && v.get("shopId") != null && v.get("shopId").toString().equals(shopId.toString())).collect(Collectors.toList());
                if (CollectionUtils.isEmpty(rangesInDb)) {
                    HashSet<String> orgsWillSave = new HashSet<String>(orgIdList);
                    this.saveProductApplyRange((Long)product.getId(), orgsWillSave, "3", addRangeMessage.getAllocatorId(), addRangeMessage.getAllocatorName());
                    resultList.setSucessCount(resultList.getSucessCount() + 1);
                }
            }
        }
    }

    private Set<String> getAllShareOrg(Long productId, String creatOrgId) throws Exception {
        Product productData = null;
        boolean isAllDocRuleType = this.mcInnerService.isAllDocRuleType("pc.product.Product", creatOrgId);
        if (!isAllDocRuleType) {
            productData = this.productDetailService.getProductByIdAndOrgId(productId, creatOrgId);
        }
        return this.orgPermissionsService.getShareOrgByManageOrg4Map("pc.product.Product", creatOrgId, (Map)productData);
    }

    public void saveProductApplyRange(Long productId, Set<String> orgsWillSave, String orgType, long allocatorId, String allocatorName) throws Exception {
        if (!CollectionUtils.isEmpty(orgsWillSave)) {
            this.productOrgShareUtil.getProductDetail(productId, new ArrayList<String>(orgsWillSave), orgType, allocatorId, allocatorName);
        }
    }

    public static List<Map<String, Object>> getProductApplyRangeList(Long productId) throws Exception {
        QuerySchema proApplyRangeShcema = QuerySchema.create().addSelect(new String[]{"id", "orgId", "orgId.name as org_Name", "productDetailId", "productDepositTimeDetailId", "isCreator", "ifnull(customerId,0) as customerId", "ifnull(shopId,0) as shopId"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId)}));
        List proApplyRangeList = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)proApplyRangeShcema);
        return proApplyRangeList;
    }

    public Map<String, String> getResultMsg(String msg, String code) {
        HashMap<String, String> data = new HashMap<String, String>(2);
        data.put("message", msg);
        data.put("key", code);
        return data;
    }

    public ResultList initResultList(int count) {
        ResultList resultList = new ResultList(count);
        resultList.setFailCount(0);
        resultList.setSucessCount(0);
        return resultList;
    }

    private boolean isBusinessRole(Long shopId) throws Exception {
        QuerySchema queryMechantRoleShcema = QuerySchema.create().addSelect("businessRole as businessRole").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)shopId)}));
        Map mechantRole = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)queryMechantRoleShcema);
        if (null == mechantRole) {
            return false;
        }
        if (ObjectUtils.isEmpty(mechantRole.get("businessRole"))) {
            return false;
        }
        return mechantRole.get("businessRole").toString().contains("2") || mechantRole.get("businessRole").toString().contains("3") || mechantRole.get("businessRole").toString().contains("4") || mechantRole.get("businessRole").toString().contains("5");
    }

    public void handleProductSuitOrgEvent(Long productId, Set<String> suitOrgIds, String action) {
        if (!CollectionUtils.isEmpty(suitOrgIds)) {
            List materialPOS = this.materialQryDao.queryByIds(new HashSet<Long>(Collections.singleton(productId)), Arrays.asList("id", "code"));
            List orgUnitDTOS = this.iOrgUnitQueryService.getByCondition(CoredocContextUtils.getYtenantId(), ConditionDTO.newOrgCondition().andIdIn(new ArrayList<String>(suitOrgIds)));
            SuitOrgEventDTO suitOrgEventDTO = this.buildSuitOrgEventDTO(orgUnitDTOS, (MaterialPO)materialPOS.get(0));
            this.sendEventForProductSuitOrg(suitOrgEventDTO, action);
        }
    }

    private void sendEventForProductSuitOrg(SuitOrgEventDTO suitOrgEventDTO, String action) {
        try {
            HashMap<String, Object> businessObject = new HashMap<String, Object>();
            businessObject.put("fullname", "pc.product.Product");
            businessObject.put("archive", UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)suitOrgEventDTO));
            String eventType = EventType.find("pc_productlist", action, null).toString();
            this.eventService.sendEvent("iuap-apdoc-material", eventType, businessObject);
        }
        catch (Exception e) {
            log.error("sendEventForProductSuitOrg error, action:{}, message:{}", new Object[]{action, e.getMessage(), e});
        }
    }

    private SuitOrgEventDTO buildSuitOrgEventDTO(List<OrgUnitDTO> orgUnitDTOS, MaterialPO product) {
        ArrayList<SuitOrgDTO> suitOrgDTOList = new ArrayList<SuitOrgDTO>();
        for (OrgUnitDTO orgUnit : orgUnitDTOS) {
            SuitOrgDTO suitOrgDTO = new SuitOrgDTO();
            suitOrgDTO.setOrgId(orgUnit.getId());
            suitOrgDTO.setOrgCode(orgUnit.getCode());
            suitOrgDTO.setRangeType(MaterialRangeType.ORG.getValue());
            suitOrgDTOList.add(suitOrgDTO);
        }
        SuitOrgEventDTO suitOrgEventDTO = new SuitOrgEventDTO();
        suitOrgEventDTO.setProductId(product.getId().toString());
        suitOrgEventDTO.setProductCode(product.getCode());
        suitOrgEventDTO.setProductOrges(suitOrgDTOList);
        return suitOrgEventDTO;
    }
}

