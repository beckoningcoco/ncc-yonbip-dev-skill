/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService
 *  com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.log.cons.BusinessLogMode
 *  com.yonyou.iuap.log.model.BusinessLogObjectBuilder
 *  com.yonyou.iuap.log.rpc.IBusiLogService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ypd.bd.api.IBDQueryRepository
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.Payway
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.math.NumberUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.batchModify.modifyExt;

import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService;
import com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.log.cons.BusinessLogMode;
import com.yonyou.iuap.log.model.BusinessLogObjectBuilder;
import com.yonyou.iuap.log.rpc.IBusiLogService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ypd.bd.api.IBDQueryRepository;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.Payway;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO;
import com.yonyoucloud.upc.service.batchModify.modifyExt.ProductPubBatchModifyExtHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class MerchantDetailPubBatchModifyExtHandler
implements IPubBatchModifyEntityExtService {
    private static final Logger log = LoggerFactory.getLogger(MerchantDetailPubBatchModifyExtHandler.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private IBusiLogService busiLogService;
    @Autowired
    private IBDQueryRepository billQueryRepository;

    public void batchModifyIsCheckField(BizObject bizObject, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        Merchant merchant = new Merchant();
        MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
        merchantApplyRangeDetail.init((Map)bizObject);
        merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id as id,merchantApplyRangeId.orgId as belongOrg");
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeDetail.getMerchantApplyRangeId())});
        querySchema.addCondition((ConditionExpression)queryConditionGroup);
        List merchantApplyRangeDetailInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailInDbList)) {
            querySchema = QuerySchema.create();
            querySchema.addSelect("code,name,createOrg,creditCode");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(((MerchantApplyRangeDetail)merchantApplyRangeDetailInDbList.get(0)).get("id"))}));
            List merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (boolean)true, (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)merchantInDbList)) {
                this.initMerchantApplyRangeDetail(merchant, merchantApplyRangeDetail, pubBatchModifyEntityFieldSaveIsCheckMap);
                merchantApplyRangeDetail.set("id", ((MerchantApplyRangeDetail)merchantApplyRangeDetailInDbList.get(0)).get("id"));
                merchant.setId(((MerchantApplyRangeDetail)merchantApplyRangeDetailInDbList.get(0)).get("id"));
                merchant.setCode(((Merchant)merchantInDbList.get(0)).getCode());
                merchant.set("name", ((Merchant)merchantInDbList.get(0)).get("name"));
                merchant.setCreateOrg(((Merchant)merchantInDbList.get(0)).getCreateOrg());
                merchant.setCreditCode(((Merchant)merchantInDbList.get(0)).getCreditCode());
                merchant.set("belongOrg", ((MerchantApplyRangeDetail)merchantApplyRangeDetailInDbList.get(0)).get("belongOrg"));
                if (((MerchantApplyRangeDetail)merchantApplyRangeDetailInDbList.get(0)).get("belongOrg").equals(((Merchant)merchantInDbList.get(0)).getCreateOrg())) {
                    merchant.set("isCreator", (Object)true);
                } else {
                    merchant.set("isCreator", (Object)false);
                }
                merchant.set("merchantApplyRangeId", (Object)merchantApplyRangeDetail.getMerchantApplyRangeId());
                merchant.set("_fromApi", (Object)true);
                merchant.set("importSpecialKey_merchant", (Object)"importSpecialKey_merchant");
                merchant.set("_fromBatchModify", (Object)true);
                merchant.setEntityStatus(EntityStatus.Update);
                ArrayList<MerchantApplyRangeDetail> merchantApplyRangeDetailList = new ArrayList<MerchantApplyRangeDetail>();
                merchantApplyRangeDetailList.add(merchantApplyRangeDetail);
                merchant.setMerchantAppliedDetail(merchantApplyRangeDetailList);
                BillDataDto saveDto = new BillDataDto();
                saveDto.setData((Object)merchant);
                if (pubBatchModifyEntitySaveDTO.getBillNum() != null) {
                    saveDto.setBillnum(pubBatchModifyEntitySaveDTO.getBillNum());
                } else {
                    saveDto.setBillnum("aa_merchant");
                }
                RuleExecuteResult result = this.billService.executeUpdate("save", saveDto);
                if (result.getMsgCode() != 1) {
                    throw new CoreDocBusinessException(result.getMessage());
                }
            }
        }
    }

    private void initMerchantApplyRangeDetail(Merchant merchant, MerchantApplyRangeDetail merchantApplyRangeDetail, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap) {
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("customerLevel")) {
            if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("customerLevel"))) {
                merchantApplyRangeDetail.setCustomerLevel(Long.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("customerLevel").toString()));
            } else {
                merchantApplyRangeDetail.setCustomerLevel(null);
            }
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("customerType")) {
            if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("customerType"))) {
                merchantApplyRangeDetail.setCustomerType(Long.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("customerType").toString()));
            } else {
                merchantApplyRangeDetail.setCustomerType(null);
            }
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("deliveryWarehouse")) {
            if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("deliveryWarehouse"))) {
                merchantApplyRangeDetail.setDeliveryWarehouse(Long.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("deliveryWarehouse").toString()));
            } else {
                merchantApplyRangeDetail.setDeliveryWarehouse(null);
            }
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("transactionCurrency")) {
            if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("transactionCurrency"))) {
                merchantApplyRangeDetail.setTransactionCurrency(String.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("transactionCurrency")));
            } else {
                merchantApplyRangeDetail.setTransactionCurrency(null);
            }
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("exchangeratetype")) {
            if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("exchangeratetype"))) {
                merchantApplyRangeDetail.setExchangeratetype(String.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("exchangeratetype")));
            } else {
                merchantApplyRangeDetail.setExchangeratetype(null);
            }
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("taxRate")) {
            if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("taxRate"))) {
                merchantApplyRangeDetail.setTaxRate(String.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("taxRate")));
            } else {
                merchantApplyRangeDetail.setTaxRate(null);
            }
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("creditServiceDay")) {
            if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("creditServiceDay"))) {
                try {
                    merchantApplyRangeDetail.setCreditServiceDay(Integer.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("creditServiceDay").toString()));
                    merchant.set("merchantAppliedDetail!creditServiceDay", (Object)Integer.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("creditServiceDay").toString()));
                }
                catch (Exception e) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801451);
                }
            } else {
                merchantApplyRangeDetail.setCreditServiceDay(null);
            }
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("collectionAgreement")) {
            if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("collectionAgreement"))) {
                merchantApplyRangeDetail.setCollectionAgreement(Long.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("collectionAgreement").toString()));
            } else {
                merchantApplyRangeDetail.setCollectionAgreement(null);
            }
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("settlementMethod")) {
            if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("settlementMethod"))) {
                merchantApplyRangeDetail.setSettlementMethod(Long.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("settlementMethod").toString()));
                merchantApplyRangeDetail.set("settlementMethod_isEnd", pubBatchModifyEntityFieldSaveIsCheckMap.get("settlementMethod_isEnd"));
                merchant.set("merchantAppliedDetail!settlementMethod_code", pubBatchModifyEntityFieldSaveIsCheckMap.get("merchantAppliedDetail!settlementMethod_code"));
                merchant.set("merchantAppliedDetail!settlementMethod_Name", pubBatchModifyEntityFieldSaveIsCheckMap.get("merchantAppliedDetail!settlementMethod_Name"));
            } else {
                merchantApplyRangeDetail.setSettlementMethod(null);
            }
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("shipmentMethod")) {
            if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("shipmentMethod"))) {
                merchantApplyRangeDetail.setShipmentMethod(Long.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("shipmentMethod").toString()));
            } else {
                merchantApplyRangeDetail.setShipmentMethod(null);
            }
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("isTradeCustomers")) {
            if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("isTradeCustomers"))) {
                merchantApplyRangeDetail.setIsTradeCustomers(String.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("isTradeCustomers")));
            } else {
                merchantApplyRangeDetail.setIsTradeCustomers(null);
            }
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("payway") && !ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("payway"))) {
            merchantApplyRangeDetail.setPayway(Payway.find((Number)NumberUtils.createNumber((String)pubBatchModifyEntityFieldSaveIsCheckMap.get("payway").toString())));
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("signBack") && !ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("signBack"))) {
            merchantApplyRangeDetail.setSignBack(Boolean.valueOf(BooleanUtil.isTrue((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("signBack"))));
        }
    }

    public void supplementaryReminder(Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap) throws Exception {
        QuerySchema schema;
        List settleMethodInDbList;
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("isTradeCustomers") && pubBatchModifyEntityFieldSaveIsCheckMap.get("isTradeCustomers") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801452);
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("collectionAgreement") && (AppContext.getCurrentUser().getUserType() == UserType.ShopAdminUser || AppContext.getCurrentUser().getUserType() == UserType.ShopUser)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801453);
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("signBack") && pubBatchModifyEntityFieldSaveIsCheckMap.get("signBack") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801456);
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("settlementMethod") && !ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("settlementMethod")) && !CollectionUtils.isEmpty((Collection)(settleMethodInDbList = this.billQueryRepository.queryMapBySchema("aa.settlemethod.SettleMethod", schema = QuerySchema.create().addSelect("code as settlementMethodCode, name as settlementMethodName, isEnd as settlementMethodEnd").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq(pubBatchModifyEntityFieldSaveIsCheckMap.get("settlementMethod"))}), null)))) {
            pubBatchModifyEntityFieldSaveIsCheckMap.put("merchantAppliedDetail!settlementMethod_code", ((Map)settleMethodInDbList.get(0)).get("settlementMethodCode"));
            pubBatchModifyEntityFieldSaveIsCheckMap.put("merchantAppliedDetail!settlementMethod_Name", ((Map)settleMethodInDbList.get(0)).get("settlementMethodName"));
            pubBatchModifyEntityFieldSaveIsCheckMap.put("settlementMethod_isEnd", ((Map)settleMethodInDbList.get(0)).get("settlementMethodEnd"));
        }
    }

    public void extendQuerySchema(QuerySchema querySchema, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        if (AppContext.getCurrentUser().getUserType() == UserType.ShopAdminUser || AppContext.getCurrentUser().getUserType() == UserType.ShopUser) {
            querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId.shopId").eq((Object)AppContext.getCurrentUser().getShop())});
        } else {
            querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId.shopId").eq((Object)-1)});
        }
        List extIdList = pubBatchModifyEntitySaveDTO.getExtIdList();
        if (CollectionUtils.isEmpty((Collection)extIdList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801454);
        }
        querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").in((Collection)extIdList)});
        querySchema.addSelect("id");
        querySchema.addSelect("merchantApplyRangeId");
    }

    public void checkBatchModifyEntityFieldSaveMap(Map<String, Object> pubBatchModifyEntityFieldSaveMap) {
        if (pubBatchModifyEntityFieldSaveMap.containsKey("isTradeCustomers") && pubBatchModifyEntityFieldSaveMap.get("isTradeCustomers") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801452);
        }
        if (pubBatchModifyEntityFieldSaveMap.containsKey("payway") && pubBatchModifyEntityFieldSaveMap.get("payway") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801455);
        }
        if (pubBatchModifyEntityFieldSaveMap.containsKey("signBack") && pubBatchModifyEntityFieldSaveMap.get("signBack") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801456);
        }
    }

    public void update(String fullName, BizObject newBizObjectUpdate, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        this.addLogAndModifyAudit(fullName, newBizObjectUpdate, pubBatchModifyEntitySaveDTO);
    }

    public void addLogAndModifyAudit(String fullName, BizObject newBizObjectUpdate, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        newBizObjectUpdate.put("modifierId", AppContext.getCurrentUser().getId());
        newBizObjectUpdate.put("modifyTime", (Object)new Date());
        newBizObjectUpdate.put("modifyDate", (Object)new Date());
        MetaDaoHelper.update((String)fullName, (BizObject)newBizObjectUpdate);
        Object merchantId = newBizObjectUpdate.get("id");
        if (newBizObjectUpdate.get("merchantApplyRangeDetailCharacter") != null && newBizObjectUpdate.get("merchantApplyRangeId") != null && newBizObjectUpdate.get("id") != null) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(newBizObjectUpdate.get("id")), QueryCondition.name((String)"id").eq(newBizObjectUpdate.get("merchantApplyRangeId"))});
            QuerySchema schema = QuerySchema.create().addSelect("id,merchantDetailId").addCondition((ConditionExpression)condition);
            Map merchantApplyRange = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema);
            if (merchantApplyRange != null && merchantApplyRange.get("merchantDetailId") != null) {
                Map character;
                HashMap param = new HashMap();
                param.put("id", merchantApplyRange.get("merchantDetailId"));
                param.put("ytenantId", AppContext.getYTenantId());
                if (newBizObjectUpdate.get("merchantApplyRangeDetailCharacter") instanceof Map && (character = (Map)newBizObjectUpdate.get("merchantApplyRangeDetailCharacter")) != null && character.get("id") != null) {
                    param.put("merchantApplyRangeDetailCharacter", character.get("id"));
                    SqlHelper.update((String)"com.yonyoucloud.upc.option.dao.merchant.updateMerchantDetail", (Object)param);
                }
            }
        }
        String merchantIDStr = merchantId instanceof Long ? merchantId.toString() : String.valueOf(merchantId);
        if (pubBatchModifyEntitySaveDTO.getUpdateLog().booleanValue()) {
            BillDataDto billDataDtomerchantLog = new BillDataDto("aa_merchant", merchantIDStr);
            Map merchantDetail = this.billService.detail(billDataDtomerchantLog);
            for (String key : newBizObjectUpdate.keySet()) {
                if (ProductPubBatchModifyExtHandler.notAddFields.contains(key)) continue;
                merchantDetail.put(key, newBizObjectUpdate.get(key));
            }
            String appName = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807D6", (String)"\u57fa\u7840\u6570\u636e");
            String serviceName = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17AA39BA05700004", (String)"\u5ba2\u6237\u6863\u6848");
            String busiObjTypeCode = "aa_merchant";
            String busiObjTypeName = "UID:P_COREDOC-FE_179FFF1A04080290";
            String serviceCode = "aa_merchant";
            if (pubBatchModifyEntitySaveDTO.getBillNum() != null && "aa_merchantdetail".equals(pubBatchModifyEntitySaveDTO.getBillNum())) {
                busiObjTypeCode = "aa_merchantdetail";
                serviceCode = "aa_merchantlist_query";
                serviceName = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-UI_1C5CAA420558001D", (String)"\u5ba2\u6237\u4e1a\u52a1\u4fe1\u606f");
            }
            BusinessLogObjectBuilder businessLogObjectBuilder = new BusinessLogObjectBuilder();
            businessLogObjectBuilder.uri("aa.merchant.Merchant").busiObjTypeCode(busiObjTypeCode).busiObjTypeName(busiObjTypeName).defaultBusiObjTypeName("\u5ba2\u6237").operationName("UID:P_COREDOC-UI_17AAAFC8042017E9").defaultOperationName("\u6279\u6539").logMode(BusinessLogMode.UI_META).applicationName(appName).serviceName(serviceName).applicationCode(ApplicationCodeConstant.getApplicationCodeByFullName((String)"aa.merchant.Merchant")).domain("productcenter").serviceCode(serviceCode).newObject((Object)merchantDetail).dataId(merchantIDStr).dataCode(merchantDetail.get("code") == null ? "" : merchantDetail.get("code").toString()).dataName(merchantDetail.get("name") == null ? "" : merchantDetail.get("name").toString());
            this.busiLogService.saveBusinessLog(businessLogObjectBuilder.build());
        }
    }
}

