/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.Payway
 *  com.yonyoucloud.upc.service.IUPCMerchantQueryService
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service.debugmerchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.Payway;
import com.yonyoucloud.upc.service.IUPCMerchantQueryService;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
public class MerchantRelationSaveService {
    Logger logger = LoggerFactory.getLogger(MerchantRelationSaveService.class);
    @Autowired
    private IUPCMerchantQueryService upcMerchantQueryService;

    public void setMerchantRelationSave(Map map) throws Exception {
        List datalist = (List)map.get("data");
        String url = "/agent/infrastructure/upc/syn/agentrelation";
        if (!map.containsKey("tenantAllData")) {
            for (Map data : datalist) {
                if (!data.containsKey("merchantId") || data.get("merchantId") == null || !data.containsKey("orgIdList") || data.get("orgIdList") == null) {
                    throw new CoreDocBusinessException("merchantId or orgId is empty");
                }
                Long merchantId = Long.parseLong(data.get("merchantId").toString());
                List orgIdList = (List)data.get("orgIdList");
                for (String orgId : orgIdList) {
                    Long merchantApplyRangeId;
                    MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
                    QuerySchema querySchema = QuerySchema.create();
                    querySchema.addSelect("id");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchantId)}));
                    List merchantList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
                    if (CollectionUtils.isEmpty((Collection)merchantList)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801084, new Object[]{merchantId});
                    }
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("id");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"orgId").eq((Object)orgId)}));
                    List merchantApplyRangeList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema);
                    if (CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
                        merchantApplyRange = MerchantUtils.getMerchantApplyRange((Long)merchantId, (Integer)1, (String)orgId);
                        merchantApplyRangeId = (Long)merchantApplyRange.getId();
                    } else {
                        merchantApplyRangeId = Long.parseLong(((Map)merchantApplyRangeList.get(0)).get("id").toString());
                    }
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("id");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchantId), QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId)}));
                    List merchantApplyRangeDetailList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema);
                    MerchantApplyRangeDetail merchantApplyRangeDetail = !CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList) ? this.getMerchantApplyRangeDetail(data, merchantApplyRangeId, false) : this.getMerchantApplyRangeDetail(data, merchantApplyRangeId, true);
                    if (!CollectionUtils.isEmpty((Map)merchantApplyRange)) {
                        if (EntityStatus.Insert == merchantApplyRange.getEntityStatus()) {
                            MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
                        } else {
                            MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
                        }
                    }
                    if (CollectionUtils.isEmpty((Map)merchantApplyRangeDetail)) continue;
                    if (EntityStatus.Insert == merchantApplyRangeDetail.getEntityStatus()) {
                        MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
                        continue;
                    }
                    MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
                }
            }
        }
    }

    private MerchantApplyRangeDetail getMerchantApplyRangeDetail(Map data, Long merchantApplyRangeId, boolean insert) {
        MerchantApplyRangeDetail detail = new MerchantApplyRangeDetail();
        detail.set("id", data.get("merchantId"));
        detail.setMerchantApplyRangeId(merchantApplyRangeId);
        if (!StringUtils.isEmpty(data.get("searchcode"))) {
            detail.setSearchcode(data.get("searchcode").toString());
        } else if (data.containsKey("searchcode")) {
            detail.setSearchcode(null);
        }
        if (!StringUtils.isEmpty(data.get("customerLevel"))) {
            detail.setCustomerLevel(Long.valueOf(Long.parseLong(data.get("customerLevel").toString())));
        } else if (data.containsKey("customerLevel")) {
            detail.setCustomerLevel(null);
        }
        if (!StringUtils.isEmpty(data.get("customerType"))) {
            detail.setCustomerType(Long.valueOf(Long.parseLong(data.get("customerType").toString())));
        } else if (data.containsKey("customerType")) {
            detail.setCustomerType(null);
        }
        if (!StringUtils.isEmpty(data.get("deliveryWarehouse"))) {
            detail.setDeliveryWarehouse(Long.valueOf(Long.parseLong(data.get("deliveryWarehouse").toString())));
        } else if (data.containsKey("deliveryWarehouse")) {
            detail.setDeliveryWarehouse(null);
        }
        if (!StringUtils.isEmpty(data.get("transactionCurrency"))) {
            detail.setTransactionCurrency(data.get("transactionCurrency").toString());
        } else if (data.containsKey("transactionCurrency")) {
            detail.setTransactionCurrency(null);
        }
        if (!StringUtils.isEmpty(data.get("taxRate"))) {
            detail.setTaxRate(data.get("taxRate").toString());
        } else if (data.containsKey("taxRate")) {
            detail.setTaxRate(null);
        }
        if (!StringUtils.isEmpty(data.get("creditServiceDay"))) {
            detail.setCreditServiceDay(Integer.valueOf(data.get("creditServiceDay").toString()));
        } else if (data.containsKey("creditServiceDay")) {
            detail.setCreditServiceDay(null);
        }
        if (!StringUtils.isEmpty(data.get("collectionAgreement"))) {
            detail.setCollectionAgreement(Long.valueOf(Long.parseLong(data.get("collectionAgreement").toString())));
        } else if (data.containsKey("collectionAgreement")) {
            detail.setCollectionAgreement(null);
        }
        if (!StringUtils.isEmpty(data.get("settlementMethod"))) {
            detail.setSettlementMethod(Long.valueOf(Long.parseLong(data.get("settlementMethod").toString())));
        } else if (data.containsKey("settlementMethod")) {
            detail.setSettlementMethod(null);
        }
        if (!StringUtils.isEmpty(data.get("shipmentMethod"))) {
            detail.setShipmentMethod(Long.valueOf(Long.parseLong(data.get("shipmentMethod").toString())));
        } else if (data.containsKey("shipmentMethod")) {
            detail.setShipmentMethod(null);
        }
        if (!StringUtils.isEmpty(data.get("exchangeratetype"))) {
            detail.setExchangeratetype((String)data.get("exchangeratetype"));
        } else {
            detail.setExchangeratetype(AppContext.getCurrentUser().getYhtTenantId());
        }
        if (!StringUtils.isEmpty(data.get("payway"))) {
            if (Long.parseLong(data.get("payway").toString()) == (long)Payway.others.getValue()) {
                detail.setPayway(Payway.others);
            } else if (Long.parseLong(data.get("payway").toString()) == (long)Payway.paymentDelivery.getValue()) {
                detail.setPayway(Payway.paymentDelivery);
            }
        } else {
            detail.setPayway(Payway.others);
        }
        if (data.get("signBack") != null) {
            detail.setSignBack((Boolean)data.get("signBack"));
        } else {
            detail.setSignBack(Boolean.valueOf(false));
        }
        if (data.get("stopstatus") != null) {
            detail.setStopstatus(Boolean.valueOf(Boolean.parseBoolean(data.get("stopstatus").toString())));
        }
        detail.setModifier(AppContext.getCurrentUser().getName());
        detail.setCreator(AppContext.getCurrentUser().getName());
        if (insert) {
            detail.setEntityStatus(EntityStatus.Insert);
        } else {
            detail.setEntityStatus(EntityStatus.Update);
        }
        return detail;
    }
}

