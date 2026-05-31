/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService
 *  com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.data.service.itf.OrgExternalQryService
 *  com.yonyou.iuap.log.cons.BusinessLogMode
 *  com.yonyou.iuap.log.model.BusinessLogObjectBuilder
 *  com.yonyou.iuap.log.rpc.IBusiLogService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.custcategory.CustCategory
 *  com.yonyoucloud.upc.aa.customertrade.CustomerTrade
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO
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
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.batchModify.modifyExt;

import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService;
import com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.data.service.itf.OrgExternalQryService;
import com.yonyou.iuap.log.cons.BusinessLogMode;
import com.yonyou.iuap.log.model.BusinessLogObjectBuilder;
import com.yonyou.iuap.log.rpc.IBusiLogService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.aa.custcategory.CustCategory;
import com.yonyoucloud.upc.aa.customertrade.CustomerTrade;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO;
import com.yonyoucloud.upc.service.batchModify.modifyExt.ProductPubBatchModifyExtHandler;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class MerchantPubBatchModifyExtHandler
implements IPubBatchModifyEntityExtService {
    private static final Logger log = LoggerFactory.getLogger(MerchantPubBatchModifyExtHandler.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private IBusiLogService busiLogService;
    @Autowired
    private OrgExternalQryService orgExternalQryService;

    public void batchModifyIsCheckField(BizObject bizObject, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        Merchant merchant = new Merchant();
        merchant.init((Map)bizObject);
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("code,name,createOrg,creditCode");
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())});
        querySchema.addCondition((ConditionExpression)queryConditionGroup);
        List merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (boolean)true, (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantInDbList)) {
            this.initMerchant(merchant, pubBatchModifyEntityFieldSaveIsCheckMap);
            merchant.setEntityStatus(EntityStatus.Update);
            merchant.setCode(((Merchant)merchantInDbList.get(0)).getCode());
            merchant.set("name", ((Merchant)merchantInDbList.get(0)).get("name"));
            merchant.setCreateOrg(((Merchant)merchantInDbList.get(0)).getCreateOrg());
            merchant.setCreditCode(((Merchant)merchantInDbList.get(0)).getCreditCode());
            merchant.set("belongOrg", (Object)((Merchant)merchantInDbList.get(0)).getCreateOrg());
            merchant.set("_fromBatchModify", (Object)true);
            merchant.set("_fromApi", (Object)true);
            merchant.set("importSpecialKey_merchant", (Object)"importSpecialKey_merchant");
            BillDataDto saveDto = new BillDataDto();
            saveDto.setData((Object)merchant);
            saveDto.setBillnum("aa_merchant");
            RuleExecuteResult result = this.billService.executeUpdate("save", saveDto);
            if (result.getMsgCode() != 1) {
                throw new CoreDocBusinessException(result.getMessage());
            }
        }
    }

    private void initMerchant(Merchant merchant, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap) {
        Merchant convertMerchant = (Merchant)Objectlizer.convert(pubBatchModifyEntityFieldSaveIsCheckMap, (String)"aa.merchant.Merchant");
        merchant.init((Map)convertMerchant);
    }

    public void extendQuerySchema(QuerySchema querySchema, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        querySchema.addSelect("code");
    }

    public void supplementaryReminder(Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap) throws Exception {
        List customerTradeInDbList;
        QuerySchema schema;
        List custCategoryInDbList;
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("customerClass") && !ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("customerClass")) && !CollectionUtils.isEmpty((Collection)(custCategoryInDbList = MetaDaoHelper.queryObject((String)"aa.custcategory.CustCategory", (QuerySchema)(schema = QuerySchema.create().addSelect("code, name, isEnd").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)Long.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("customerClass").toString()))})), null)))) {
            pubBatchModifyEntityFieldSaveIsCheckMap.put("customerClass_code", ((CustCategory)custCategoryInDbList.get(0)).getCode());
            pubBatchModifyEntityFieldSaveIsCheckMap.put("customerClass_Name", ((CustCategory)custCategoryInDbList.get(0)).getName());
            pubBatchModifyEntityFieldSaveIsCheckMap.put("customerClass_isEnd", ((CustCategory)custCategoryInDbList.get(0)).getIsEnd());
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("customerIndustry") && !ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("customerIndustry")) && !CollectionUtils.isEmpty((Collection)(customerTradeInDbList = MetaDaoHelper.queryObject((String)"aa.customertrade.CustomerTrade", (QuerySchema)(schema = QuerySchema.create().addSelect("code, name, isEnd").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)Long.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("customerIndustry").toString()))})), null)))) {
            pubBatchModifyEntityFieldSaveIsCheckMap.put("customerIndustry_code", ((CustomerTrade)customerTradeInDbList.get(0)).getCode());
            pubBatchModifyEntityFieldSaveIsCheckMap.put("customerIndustry_Name", ((CustomerTrade)customerTradeInDbList.get(0)).getName());
            pubBatchModifyEntityFieldSaveIsCheckMap.put("customerIndustry_isEnd", ((CustomerTrade)customerTradeInDbList.get(0)).getIsEnd());
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("enterpriseNature") && pubBatchModifyEntityFieldSaveIsCheckMap.get("enterpriseNature") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801430);
        }
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("isFinancialSynergy") && pubBatchModifyEntityFieldSaveIsCheckMap.get("isFinancialSynergy") == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_BATCH_MODIFY_IS_FINANCIAL_SYNERGY);
        }
    }

    public void checkBatchModifyEntity(BizObject bizObject) throws Exception {
        if (AppContext.getCurrentUser().getUserType() == UserType.TenantAdmin || AppContext.getCurrentUser().getUserType() == UserType.TenantEmployee) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("createOrg");
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bizObject.getId())});
            querySchema.addCondition((ConditionExpression)queryConditionGroup);
            List merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)merchantInDbList) && this.orgExternalQryService.judgeExternalOrg((String)AppContext.getYTenantId(), ((Merchant)merchantInDbList.get(0)).getCreateOrg()).booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801431);
            }
        }
    }

    public void checkBatchModifyEntityFieldSaveMap(Map<String, Object> pubBatchModifyEntityFieldSaveMap) {
        if (pubBatchModifyEntityFieldSaveMap.containsKey("retailInvestors") && pubBatchModifyEntityFieldSaveMap.get("retailInvestors") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801432);
        }
        if (pubBatchModifyEntityFieldSaveMap.containsKey("taxPayingCategories") && pubBatchModifyEntityFieldSaveMap.get("taxPayingCategories") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801433);
        }
        if (pubBatchModifyEntityFieldSaveMap.containsKey("enterpriseNature") && pubBatchModifyEntityFieldSaveMap.get("enterpriseNature") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801430);
        }
        if (pubBatchModifyEntityFieldSaveMap.containsKey("scopeModel") && pubBatchModifyEntityFieldSaveMap.get("scopeModel") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801434);
        }
        if (pubBatchModifyEntityFieldSaveMap.containsKey("isFinancialSynergy") && pubBatchModifyEntityFieldSaveMap.get("isFinancialSynergy") == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_BATCH_MODIFY_IS_FINANCIAL_SYNERGY);
        }
    }

    public void update(String fullName, BizObject newBizObjectUpdate, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        this.addAuditFields(newBizObjectUpdate);
        MetaDaoHelper.update((String)fullName, (BizObject)newBizObjectUpdate);
        Object merchantId = newBizObjectUpdate.get("id");
        Object merchantCode = newBizObjectUpdate.get("code");
        String merchantIDStr = merchantId instanceof Long ? merchantId.toString() : String.valueOf(merchantId);
        BillDataDto billDataDtomerchantLog = new BillDataDto("aa_merchant", merchantIDStr);
        Map merchantDetail = this.billService.detail(billDataDtomerchantLog);
        for (String key : newBizObjectUpdate.keySet()) {
            if (!ProductPubBatchModifyExtHandler.notAddFields.contains(key)) {
                merchantDetail.put(key, newBizObjectUpdate.get(key));
            }
            if (!key.equals("modifierId") && !key.equals("modifyTime") && !key.equals("modifyDate")) continue;
            merchantDetail.put("merchantAppliedDetail!" + key, newBizObjectUpdate.get(key));
        }
        BizObject bizObjectMerchantUpdate = new BizObject();
        bizObjectMerchantUpdate.put("id", merchantId);
        bizObjectMerchantUpdate.setEntityStatus(EntityStatus.Update);
        HashMap data = new HashMap(bizObjectMerchantUpdate);
        BizObject newBizObjectMerchantUpdate = Objectlizer.convert(data, (String)"aa.merchant.Merchant");
        newBizObjectMerchantUpdate.put("modifierId", AppContext.getCurrentUser().getId());
        newBizObjectMerchantUpdate.put("modifyTime", (Object)new Date());
        newBizObjectMerchantUpdate.put("modifyDate", (Object)new Date());
        BizObject merchantAppliedDetail = new BizObject();
        merchantAppliedDetail.put("id", merchantId);
        if (newBizObjectMerchantUpdate.get("merchantAppliedDetail!id") != null) {
            merchantAppliedDetail.put("merchantApplyRangeId", newBizObjectUpdate.get("merchantApplyRangeId"));
        } else {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchantId), QueryCondition.name((String)"isCreator").eq((Object)true), QueryCondition.name((String)"isPotential").eq((Object)false)}));
            List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
                merchantAppliedDetail.put("merchantApplyRangeId", ((MerchantApplyRange)merchantApplyRangeList.get(0)).getId());
            }
        }
        merchantAppliedDetail.put("modifierId", AppContext.getCurrentUser().getId());
        merchantAppliedDetail.put("modifyTime", (Object)new Date());
        merchantAppliedDetail.put("modifyDate", (Object)new Date());
        merchantAppliedDetail.put("_status", (Object)EntityStatus.Update);
        BizObject newMerchantAppliedDetail = Objectlizer.convert((Map)merchantAppliedDetail, (String)"aa.merchant.MerchantApplyRangeDetail");
        newBizObjectMerchantUpdate.put("merchantAppliedDetail", (Object)newMerchantAppliedDetail);
        MetaDaoHelper.update((String)"aa.merchant.Merchant", (BizObject)newBizObjectMerchantUpdate);
        if (pubBatchModifyEntitySaveDTO.getUpdateLog().booleanValue()) {
            String appName = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807D6", (String)"\u57fa\u7840\u6570\u636e");
            String serviceName = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17AA39BA05700004", (String)"\u5ba2\u6237\u6863\u6848");
            BusinessLogObjectBuilder businessLogObjectBuilder = new BusinessLogObjectBuilder();
            businessLogObjectBuilder.uri("aa.merchant.Merchant").busiObjTypeCode("aa_merchant").busiObjTypeName("UID:P_COREDOC-FE_179FFF1A04080290").defaultBusiObjTypeName("\u5ba2\u6237").operationName("UID:P_BD-UI_17634C300550099F").defaultOperationName("\u66f4\u65b0").logMode(BusinessLogMode.UI_META).applicationName(appName).serviceName(serviceName).applicationCode(ApplicationCodeConstant.getApplicationCodeByFullName((String)"aa.merchant.Merchant")).domain("productcenter").serviceCode("aa_merchant").newObject((Object)merchantDetail).dataId(merchantIDStr).dataCode(merchantCode.toString()).dataName(merchantDetail.get("name").toString());
            this.busiLogService.saveBusinessLog(businessLogObjectBuilder.build());
        }
    }

    public void addAuditFields(BizObject newBizObjectUpdate) {
        newBizObjectUpdate.put("modifierId", AppContext.getCurrentUser().getId());
        newBizObjectUpdate.put("modifyTime", (Object)new Date());
        newBizObjectUpdate.put("modifyDate", (Object)new Date());
    }
}

