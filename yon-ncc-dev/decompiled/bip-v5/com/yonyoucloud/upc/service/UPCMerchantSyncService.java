/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.google.gson.Gson
 *  com.yonyou.cloud.annotation.IrisReference
 *  com.yonyou.cloud.util.IrisDynamicInvokeUtil
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.AppOpenUtil
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantAttachment
 *  com.yonyou.iuap.org.service.itf.IExternalOrgManagerService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.QueryParamVo
 *  com.yonyou.ucf.mdd.ext.api.IBillService
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.meta.UiMetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.merchant.AddressInfo
 *  com.yonyoucloud.upc.aa.merchant.AgentFinancial
 *  com.yonyoucloud.upc.aa.merchant.AgentInvoice
 *  com.yonyoucloud.upc.aa.merchant.Contacter
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.MerchantCorpImage
 *  com.yonyoucloud.upc.aa.merchant.MerchantRoleInfo
 *  com.yonyoucloud.upc.aa.merchant.MerchantsManager
 *  com.yonyoucloud.upc.other.MerchantsManagerDTO
 *  com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorBillStringPubService
 *  com.yonyoucloud.upc.service.IUPCMerchantQueryService
 *  com.yonyoucloud.upc.service.IUPCMerchantSyncService
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.biz.base.BizContext
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.core.model.Entity
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
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.yonyou.cloud.annotation.IrisReference;
import com.yonyou.cloud.util.IrisDynamicInvokeUtil;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.AppOpenUtil;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantAttachment;
import com.yonyou.iuap.org.service.itf.IExternalOrgManagerService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.QueryParamVo;
import com.yonyou.ucf.mdd.ext.api.IBillService;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.meta.UiMetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.merchant.AddressInfo;
import com.yonyoucloud.upc.aa.merchant.AgentFinancial;
import com.yonyoucloud.upc.aa.merchant.AgentInvoice;
import com.yonyoucloud.upc.aa.merchant.Contacter;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.MerchantCorpImage;
import com.yonyoucloud.upc.aa.merchant.MerchantRoleInfo;
import com.yonyoucloud.upc.aa.merchant.MerchantsManager;
import com.yonyoucloud.upc.other.MerchantsManagerDTO;
import com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorBillStringPubService;
import com.yonyoucloud.upc.service.IUPCMerchantQueryService;
import com.yonyoucloud.upc.service.IUPCMerchantSyncService;
import com.yonyoucloud.upc.service.UPCUserCenterService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.biz.base.BizContext;
import org.imeta.biz.base.Objectlizer;
import org.imeta.core.model.Entity;
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

@Service
public class UPCMerchantSyncService
implements IUPCMerchantSyncService {
    Logger logger = LoggerFactory.getLogger(UPCMerchantSyncService.class);
    @Autowired
    private IUPCMerchantQueryService merchantQueryService;
    @Autowired
    private UPCUserCenterService upcUserCenterService;
    @Autowired
    private IExternalOrgManagerService iExternalOrgManagerService;
    @Autowired
    private IVendorBillStringPubService ysVendorService;
    @IrisReference(appCode="ucf-org-center", alias="billServiceExtImpl")
    private IBillService billServiceRefer;

    public void queryUdhPurchase() throws Exception {
        BillContext billContext = new BillContext();
        billContext.setBillnum("aa_merchant");
        QuerySchema querySchemaIds = QuerySchema.create().addSelect("id");
        List bizObjects = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchemaIds, null);
        if (CollectionUtils.isEmpty((Collection)bizObjects)) {
            this.logger.info("\u52a0\u8d2d\u672a\u67e5\u8be2\u5230\u5ba2\u6237\u6570\u636e");
            return;
        }
        String url = "/agent/infrastructure/upc/syn";
        QueryParamVo queryParam = new QueryParamVo();
        List<Long> longs = this.transMerchantId(bizObjects);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(longs)});
        queryParam.setCondition((Object)queryConditionGroup);
        queryParam.setParams(new HashMap());
        billContext.setFullname("aa.merchant.Merchant");
        List maps = UiMetaDaoHelper.listDetailByCondition((BillContext)billContext, (QueryParamVo)queryParam);
        if (!CollectionUtils.isEmpty((Collection)maps)) {
            maps.parallelStream().forEach(merchantMap -> {
                BizObject bo;
                long begin = System.currentTimeMillis();
                this.logger.info("beginmercahntsync{}", (Object)begin);
                Object detail = null;
                if (merchantMap != null && !merchantMap.isEmpty() && (bo = Objectlizer.convert((Map)merchantMap, (String)"aa.merchant.Merchant")) != null) {
                    Merchant merchantUpdate = (Merchant)bo;
                    try {
                        this.getMerchantInfos(merchantUpdate);
                    }
                    catch (Exception e) {
                        this.logger.info("\u52a0\u8d2d\u540c\u6b65\u7ec4\u88c5\u5ba2\u6237\u5f02\u5e38:{}", (Throwable)e);
                    }
                    try {
                        merchantUpdate.put("businessRole", (Object)(merchantUpdate.merchantRole() != null && StringUtils.isNotBlank((CharSequence)merchantUpdate.merchantRole().getBusinessRole()) ? merchantUpdate.merchantRole().getBusinessRole() : "1"));
                        if (merchantUpdate != null) {
                            merchantUpdate = null;
                        }
                        this.logger.info("beginmercahntsynconetime:{}", (Object)(System.currentTimeMillis() - begin));
                    }
                    catch (Exception e) {
                        this.logger.info("\u52a0\u8d2d\u540c\u6b65\u5ba2\u6237\u5f02\u5e38:{}", (Throwable)e);
                    }
                }
            });
        }
    }

    public String saveUserType(List<BizObject> bizObjectList, String resCode, Integer userType) throws Exception {
        if (CollectionUtils.isEmpty(bizObjectList)) {
            return "";
        }
        return this.addYthUserIdentitiese(bizObjectList, resCode, userType);
    }

    public void deleteUserType(String tenantId, String identityType, String resCode, List<String> userIds, String docId) {
        if (StringUtils.isBlank((CharSequence)tenantId)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800752);
        }
        if (StringUtils.isBlank((CharSequence)identityType)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800753);
        }
        if (StringUtils.isBlank((CharSequence)resCode)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800754);
        }
        if (CollectionUtils.isEmpty(userIds)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800755);
        }
        if (StringUtils.isBlank((CharSequence)docId)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800756);
        }
        this.upcUserCenterService.removeUsersAndIdentity(tenantId, identityType, resCode, userIds, docId);
    }

    public void executeUpdate(String action, Map<String, Object> bill) {
        IBillService reference = this.billServiceRefer;
        if (reference == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800757);
        }
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setData(bill);
        HashMap<String, Boolean> externalData = new HashMap<String, Boolean>();
        externalData.put("externalOrg", true);
        billDataDto.setExternalData(externalData);
        RuleExecuteResult ruleExecuteResult = null;
        try {
            if (bill.get("status") != null && EntityStatus.Delete.equals(bill.get("status"))) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("id");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bill.get("id")), QueryCondition.name((String)"externalorg").eq((Object)1)}));
                List org = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)querySchema, (String)"ucf-org-center");
                if (org != null && !org.isEmpty()) {
                    this.batchDeleteExternalOrg(bill.get("id").toString());
                }
                return;
            }
            if (EntityStatus.Insert.equals(bill.get("status"))) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("id");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").not_eq(bill.get("id")), QueryCondition.name((String)"code").eq(bill.get("code")), QueryCondition.name((String)"dr").eq((Object)0), QueryCondition.name((String)"externalorg").eq((Object)1)}));
                List externalOrgList = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)querySchema, (String)"ucf-org-center");
                if (!CollectionUtils.isEmpty((Collection)externalOrgList)) {
                    this.batchDeleteExternalOrg(((Map)externalOrgList.get(0)).get("id").toString());
                }
            } else if (EntityStatus.Update.equals(bill.get("status"))) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("id");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bill.get("id")), QueryCondition.name((String)"dr").eq((Object)0), QueryCondition.name((String)"externalorg").eq((Object)1)}));
                List externalOrgList = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)querySchema, (String)"ucf-org-center");
                if (CollectionUtils.isEmpty((Collection)externalOrgList)) {
                    bill.put("status", EntityStatus.Insert);
                } else {
                    bill.remove("stopstatus");
                }
            }
            if (EntityStatus.Update.equals(bill.get("status")) || EntityStatus.Insert.equals(bill.get("status"))) {
                ruleExecuteResult = reference.executeUpdate(action, billDataDto);
            }
            if (ruleExecuteResult != null && ruleExecuteResult.getMsgCode() != 1) {
                this.logger.error("\u8c03\u7528\u5916\u90e8\u7ec4\u7ec7\u670d\u52a1\u5f02\u5e38{}", (Object)ruleExecuteResult);
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800759, new Object[]{ruleExecuteResult.getMessage()});
            }
        }
        catch (Exception e) {
            this.logger.error("\u8c03\u7528\u5916\u90e8\u7ec4\u7ec7\u670d\u52a1\u5f02\u5e38{}", (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800759, new Object[]{e.getMessage()});
        }
    }

    private void batchDeleteExternalOrg(String orgId) {
        this.iExternalOrgManagerService.disable(AppContext.getCurrentUser().getYhtTenantId(), AppContext.getCurrentUser().getYhtUserId(), orgId);
        ArrayList<String> externalOrgIdList = new ArrayList<String>();
        externalOrgIdList.add(orgId);
        this.iExternalOrgManagerService.batchDelete(AppContext.getCurrentUser().getYTenantId(), AppContext.getCurrentUser().getYhtUserId(), externalOrgIdList);
    }

    public void saveMerchantRangeToVendor(String vendor, Map<String, Object> paramMap) {
        String iVendorBillStringService = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408094E", (String)"\u83b7\u53d6\u4f9b\u5e94\u5546\u670d\u52a1\u63a5\u53e3\u5f02\u5e38:domain:%s,\u63a5\u53e3:%s"), "yssupplier", "IVendorBillStringService");
        this.logger.error(iVendorBillStringService);
        this.logger.error("IVendorBillStringService#batchSave:\u5165\u53c2:{}", (Object)vendor);
        this.logger.error("IVendorBillStringService#batchSave:returnmsg:{}", (Object)this.ysVendorService.batchSave(vendor, paramMap));
    }

    public void saveMerchantContacterToCRM(List<Map<String, Object>> tempList) {
        if (AppOpenUtil.isOpenCRM()) {
            IBillService iBillService = (IBillService)IrisDynamicInvokeUtil.getService((String)"yycrm", (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IBillService.class);
            if (iBillService == null) {
                String iVendorBillStringService = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408094B", (String)"\u83b7\u53d6\u5ba2\u6237\u7ba1\u7406\u670d\u52a1\u63a5\u53e3\u5f02\u5e38:domain:%s,\u63a5\u53e3:%s"), "yssupplier", "IBillService");
                this.logger.error(iVendorBillStringService);
                return;
            }
            BillDataDto billDataDto = new BillDataDto();
            billDataDto.setData(tempList);
            billDataDto.setBillnum("cust_contactcard");
            HashMap<String, String> externalData = new HashMap<String, String>();
            externalData.put("fieldType", "MERCHANT");
            billDataDto.setExternalData(externalData);
            try {
                this.logger.info("IBillService#save:returnmsg:{}", (Object)iBillService.save(billDataDto));
            }
            catch (Exception e) {
                this.logger.error("UPCMerchantSyncService:", (Throwable)e);
            }
        }
    }

    private List<Long> transMerchantId(List<Merchant> listMerchants) {
        ArrayList<Long> listMerchangIds = null;
        if (!CollectionUtils.isEmpty(listMerchants)) {
            listMerchangIds = new ArrayList<Long>(listMerchants.size());
            for (Merchant merchant : listMerchants) {
                listMerchangIds.add((Long)merchant.getId());
            }
        }
        return listMerchangIds;
    }

    private Merchant getMerchantInfos(Merchant merchantParam) throws Exception {
        QuerySchema querySchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchantParam.getId())}));
        List contacters = MetaDaoHelper.queryObject((String)"aa.merchant.Contacter", (QuerySchema)querySchema, null);
        List listContacter = merchantParam.merchantContacterInfos();
        if (!CollectionUtils.isEmpty((Collection)listContacter)) {
            Map map = contacters.parallelStream().collect(Collectors.toMap(BizObject::getId, Function.identity(), (key1, key2) -> key2));
            listContacter.parallelStream().peek(e -> {
                if (map.get(e.getId()) != null) {
                    e.setIsDefault(((Contacter)map.get(e.getId())).getIsDefault());
                }
                e.setParentBizObject(null);
            }).collect(Collectors.toList());
        }
        merchantParam.setMerchantContacterInfos(listContacter);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchantParam.getId()), QueryCondition.name((String)"isPotential").eq((Object)false)});
        QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryConditionGroup);
        QueryConditionGroup queryConditionGroupDetail = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchantParam.getId())});
        QuerySchema schemaDetail = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryConditionGroupDetail);
        List results = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema, null);
        List resultsDetail = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)schemaDetail, null);
        List<MerchantApplyRange> listApplyRangs = this.mergeDetailToApplyRange(results, resultsDetail, EntityStatus.Insert);
        merchantParam.setMerchantApplyRanges(listApplyRangs);
        merchantParam.setMerchantAppliedDetail(null);
        this.setUnChangedEntityStatus(merchantParam);
        return merchantParam;
    }

    private List<MerchantApplyRange> mergeDetailToApplyRange(List<MerchantApplyRange> results, List<MerchantApplyRangeDetail> resultsDetail, EntityStatus status) {
        for (MerchantApplyRange result : results) {
            result.setParentBizObject(null);
            for (MerchantApplyRangeDetail resultDetail : resultsDetail) {
                resultDetail.setParentBizObject(null);
                if (!result.getId().equals(resultDetail.getMerchantApplyRangeId())) continue;
                this.setRefer(resultDetail);
                result.put("merchantAppliedDetail", (Object)resultDetail);
                result.put("_status", (Object)status);
            }
        }
        return results;
    }

    private void setUnChangedEntityStatus(Merchant merchant) {
        merchant.setEntityStatus(EntityStatus.Insert);
        if (merchant.merchantsManager() != null) {
            merchant.merchantsManager().setEntityStatus(EntityStatus.Insert);
        }
        if (merchant.merchantRole() != null) {
            merchant.merchantRole().setEntityStatus(EntityStatus.Insert);
        }
        if (merchant.merchantCorpImages() != null) {
            for (MerchantCorpImage album : merchant.merchantCorpImages()) {
                album.setEntityStatus(EntityStatus.Insert);
            }
        }
        if (merchant.merchantAttachments() != null) {
            for (MerchantAttachment attachment : merchant.merchantAttachments()) {
                attachment.setEntityStatus(EntityStatus.Insert);
            }
        }
        if (merchant.merchantAddressInfos() != null) {
            for (AddressInfo addressInfo : merchant.merchantAddressInfos()) {
                addressInfo.setEntityStatus(EntityStatus.Insert);
            }
        }
        if (merchant.merchantContacterInfos() != null) {
            for (Contacter contacter : merchant.merchantContacterInfos()) {
                contacter.setEntityStatus(EntityStatus.Insert);
            }
        }
        if (merchant.merchantAgentFinancialInfos() != null) {
            for (AgentFinancial agentFinancial : merchant.merchantAgentFinancialInfos()) {
                agentFinancial.setEntityStatus(EntityStatus.Insert);
            }
        }
        if (merchant.merchantAgentInvoiceInfos() != null) {
            for (AgentInvoice agentInvoice : merchant.merchantAgentInvoiceInfos()) {
                agentInvoice.setEntityStatus(EntityStatus.Insert);
            }
        }
        merchant.setCustomerDefine(null);
    }

    private void setRefer(MerchantApplyRangeDetail detail) {
        if (detail != null) {
            Entity entity = BizContext.getMetaRepository().entity("aa.merchant.MerchantApplyRangeDetail");
            List attributes = entity.attributes();
            List collects = attributes.stream().filter(attr -> attr.isAssociationAttribute()).collect(Collectors.toList());
            detail.keySet().forEach(key -> collects.forEach(collect -> {
                if (key.equals(collect.name()) && detail.get(collect.name()) == null) {
                    detail.set(collect.name(), (Object)"0");
                }
            }));
        }
    }

    private String addYthUserIdentitiese(List<BizObject> bizList, String resCode, Integer userType) {
        if (CollectionUtils.isEmpty(bizList)) {
            return null;
        }
        String userJson = null;
        userJson = this.transferObject(bizList);
        this.logger.info("requestparams:{}", (Object)userJson);
        return this.upcUserCenterService.addUsersAndIdentity(AppContext.getCurrentUser().getYhtTenantId(), resCode, userType, userJson);
    }

    private String transferObject(List<BizObject> bizObjects) {
        ArrayList resultMap = new ArrayList();
        HashMap usersMap = null;
        bizObjects.forEach(bizObject -> {
            HashMap<String, Object> userMap = new HashMap<String, Object>();
            userMap.put("userEmail", bizObject.get("email"));
            userMap.put("userMobile", bizObject.get("mobile"));
            Object userName = bizObject.get("fullName");
            if (bizObject.get("fullName") != null && bizObject.get("fullName").equals("aa.merchant.MerchantsManager")) {
                userName = bizObject.get("fullName");
            }
            if (bizObject.get("fullName") == null && bizObject.get("fullName") != null) {
                userName = bizObject.get("fullName");
            }
            userMap.put("userName", userName);
            userMap.put("vendorId", bizObject.get("merchantId").toString());
            userMap.put("customId", bizObject.getId().toString());
            userMap.put("userMobileCountrycode", bizObject.get("countryCode"));
            resultMap.add(userMap);
            this.logger.info("=====> userMap " + userMap.get("vendorId") + "  customId: " + userMap.get("customId"));
        });
        if (CollectionUtils.isEmpty(resultMap)) {
            return null;
        }
        usersMap = new HashMap();
        usersMap.put("users", resultMap);
        return JSON.toJSONString(usersMap);
    }

    private static String[] dealContacts(String str) {
        if (StringUtils.isNotBlank((CharSequence)str) && str.contains(",")) {
            return str.split(",");
        }
        return new String[]{str};
    }

    public void saveMerchantRangeToVendorCompensation(BillDataDto bill) throws Exception {
        Map data = (Map)bill.getData();
        if (!(data == null || data.isEmpty() || data.containsKey("id") || data.get("id") instanceof List)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800760);
        }
        List merchantIdList = (List)data.get("id");
        for (Long id : merchantIdList) {
            try {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("id,code,name,creditCode,country,regionCode,address,contactTel");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)id)}));
                List merchantList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
                querySchema = QuerySchema.create();
                querySchema.addSelect("merchantId,orgId");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)id), QueryCondition.name((String)"isPotential").eq((Object)false)}));
                List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
                if (!CollectionUtils.isEmpty((Collection)merchantList) && !CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
                    HashMap<String, Object> param = new HashMap<String, Object>();
                    this.createParamters(param, this.transMerchantApplyRangesToMap((Merchant)merchantList.get(0), merchantApplyRangeList));
                    HashMap<String, Object> map = new HashMap<String, Object>(1);
                    map.put("businessCreateVendor", "true");
                    this.saveMerchantRangeToVendor(new Gson().toJson(param), map);
                    continue;
                }
                this.logger.info("\u5546\u5bb6\u521b\u5efa\u4f9b\u5e94\u5546id\u4e3a{}", (Object)id);
            }
            catch (Exception e) {
                this.logger.error("\u5546\u5bb6\u521b\u5efa\u4f9b\u5e94\u5546\u5931\u8d25\u539f\u56e0:", (Throwable)e);
                this.logger.error("\u5546\u5bb6\u521b\u5efa\u4f9b\u5e94\u5546id\u4e3a{}", (Object)id);
            }
        }
    }

    private void createParamters(Map<String, Object> paramMap, List<Map<String, Object>> dataList) {
        paramMap.put("billnum", "aa_vendor");
        paramMap.put("data", dataList);
        paramMap.put("parameters", new Object());
        paramMap.put("filterId", 0);
        paramMap.put("isIncludeMeta", false);
        paramMap.put("isOnlyTotal", false);
        paramMap.put("isOnlyCount", false);
        paramMap.put("isPrint", false);
        paramMap.put("chartIndex", 0);
        paramMap.put("isMasterOrg", false);
        paramMap.put("fromApi", false);
        paramMap.put("isDistinct", false);
        paramMap.put("onlyCount", false);
        paramMap.put("distinct", false);
        paramMap.put("publish", false);
        paramMap.put("onlyTotal", false);
        paramMap.put("includeMeta", false);
        paramMap.put("print", false);
        paramMap.put("sum", false);
        paramMap.put("masterOrg", false);
        paramMap.put("fromKanban", false);
    }

    private List<Map<String, Object>> transMerchantApplyRangesToMap(Merchant merchant, List<MerchantApplyRange> merchantApplyRanges) throws Exception {
        ArrayList<Map<String, Object>> vendorMapList = new ArrayList<Map<String, Object>>(merchantApplyRanges.size());
        List<Map<String, Object>> orgsAttr = this.getOrgsAttr(merchantApplyRanges);
        merchantApplyRanges.stream().forEach(merchantApplyRange -> orgsAttr.stream().forEach(org -> {
            if (org.get("id").equals(merchantApplyRange.getOrgId())) {
                HashMap<String, Object> map = new HashMap<String, Object>();
                map.put("tenant", AppContext.getCurrentUser().getTenant());
                map.put("_status", EntityStatus.Insert);
                map.put("isCreator", true);
                map.put("isApplied", true);
                map.put("code", org.get("code"));
                HashMap nameMap = new HashMap();
                nameMap.put("zh_CN", org.get("name"));
                nameMap.put("en_US", org.get("name"));
                nameMap.put("zh_TW", org.get("name"));
                map.put("name", nameMap);
                map.put("org", merchantApplyRange.getMerchantId().toString());
                map.put("orgName", merchant.get("name"));
                map.put("creditcode", merchant.getCreditCode());
                map.put("vendorclass", null);
                map.put("datasource", "100_");
                map.put("accessstatus", "1");
                map.put("freezestatus", false);
                map.put("country", merchant.getCountry());
                map.put("regionCode", merchant.getRegionCode());
                map.put("vendorphone", merchant.getContactTel());
                map.put("id", Long.valueOf(org.get("id").toString()));
                map.put("correspondingorg", merchantApplyRange.getOrgId());
                HashMap<String, Object> vendorOrg = new HashMap<String, Object>();
                vendorOrg.put("hasDefaultInit", true);
                vendorOrg.put("isCreator", true);
                vendorOrg.put("rangeType", 1);
                vendorOrg.put("isApplied", true);
                vendorOrg.put("vendororg", Long.valueOf(org.get("id").toString()));
                vendorOrg.put("org_code", merchant.getCode());
                vendorOrg.put("org", merchant.getId().toString());
                vendorOrg.put("org_name", merchant.get("name"));
                vendorOrg.put("_status", EntityStatus.Insert);
                ArrayList<HashMap<String, Object>> vendorOrgs = new ArrayList<HashMap<String, Object>>(1);
                vendorOrgs.add(vendorOrg);
                map.put("vendorOrgs", vendorOrgs);
                vendorMapList.add(map);
            }
        }));
        if (CollectionUtils.isEmpty(vendorMapList)) {
            return new ArrayList<Map<String, Object>>();
        }
        return vendorMapList;
    }

    private List<Map<String, Object>> getOrgsAttr(List<MerchantApplyRange> merchantApplyRanges) throws Exception {
        ArrayList orgsList = new ArrayList(merchantApplyRanges.size());
        merchantApplyRanges.parallelStream().forEach(merchantApplyRange -> orgsList.add(merchantApplyRange.getOrgId()));
        if (CollectionUtils.isEmpty(orgsList)) {
            return new ArrayList<Map<String, Object>>();
        }
        QuerySchema querySchemaStaff = QuerySchema.create().addSelect("id,code,name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(orgsList)}));
        List mapList = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)querySchemaStaff, (String)"ucf-org-center");
        if (CollectionUtils.isEmpty((Collection)mapList)) {
            return new ArrayList<Map<String, Object>>();
        }
        return mapList;
    }

    public void saveMerchantRangeToVendorUdh(Merchant merchant) {
        try {
            String businessRole;
            MerchantRoleInfo merchantRoleInfo = merchant.merchantRole();
            if (!CollectionUtils.isEmpty((Map)merchantRoleInfo) && merchant.merchantRole().getBusinessRole() != null && ((businessRole = merchant.merchantRole().getBusinessRole()).contains("3") || businessRole.contains("4") || businessRole.contains("5"))) {
                Long merchantId = (Long)merchant.getId();
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("merchantId,orgId");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"isPotential").eq((Object)false)}));
                List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
                if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
                    HashMap<String, Object> param = new HashMap<String, Object>();
                    this.createParamters(param, this.transMerchantApplyRangesToMap(merchant, merchantApplyRangeList));
                    HashMap<String, Object> map = new HashMap<String, Object>(1);
                    map.put("businessCreateVendor", "true");
                    this.saveMerchantRangeToVendor(new Gson().toJson(param), map);
                }
            }
        }
        catch (Exception e) {
            this.logger.error("\u5546\u5bb6\u521b\u5efa\u4f9b\u5e94\u5546\u5931\u8d25\u539f\u56e0:" + e.getMessage(), (Throwable)e);
        }
    }

    public ResultList batchUpdateMerchantsManager(List<MerchantsManagerDTO> merchantsManagerDTOList) {
        ResultList result = new ResultList();
        if (CollectionUtils.isEmpty(merchantsManagerDTOList)) {
            result.addMessage((Object)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C80F6F40570009D", (String)"\u53c2\u6570\u4e0d\u80fd\u4e3a\u7a7a\u5e76\u4e14merchantId\u4e0d\u80fd\u4e3a\u7a7a"));
            return result;
        }
        result.setCount(merchantsManagerDTOList.size());
        for (MerchantsManagerDTO merchantsManagerDTO : merchantsManagerDTOList) {
            try {
                MerchantsManager merchantsManager = this.updateMerchantsManager(merchantsManagerDTO);
                result.addInfo((Object)merchantsManager);
                result.incSucessCount();
            }
            catch (Exception e) {
                result.incFailCount();
                result.addMessage((Object)e.getMessage());
                merchantsManagerDTO.setMessage(e.getMessage());
                result.addFailInfo((Object)merchantsManagerDTO);
            }
        }
        return result;
    }

    public MerchantsManager updateMerchantsManager(MerchantsManagerDTO merchantsManagerDTO) throws Exception {
        if (merchantsManagerDTO == null || merchantsManagerDTO.getMerchantId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800761);
        }
        if (StringUtils.isEmpty((CharSequence)merchantsManagerDTO.getFullName())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800762);
        }
        if (StringUtils.isEmpty((CharSequence)merchantsManagerDTO.getEmail()) && StringUtils.isEmpty((CharSequence)merchantsManagerDTO.getMobile())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800763);
        }
        if (StringUtils.isEmpty((CharSequence)merchantsManagerDTO.getCountryCode()) && !StringUtils.isEmpty((CharSequence)merchantsManagerDTO.getMobile())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800764);
        }
        MerchantsManager merchantsManagerInDb = this.getMerchantsManagerByMerchantId(merchantsManagerDTO.getMerchantId());
        MerchantsManager merchantsManager = new MerchantsManager();
        if (CollectionUtils.isEmpty((Map)merchantsManagerInDb)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800765);
        }
        if (!StringUtils.isEmpty((CharSequence)merchantsManagerDTO.getEmail()) && merchantsManagerDTO.getEmail().equals(merchantsManagerInDb.getEmail())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800766);
        }
        if (!StringUtils.isEmpty((CharSequence)merchantsManagerDTO.getMobile()) && merchantsManagerDTO.getMobile().equals(merchantsManagerInDb.getMobile())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800767);
        }
        String businessRole = "1";
        MerchantRoleInfo merchantRoleInfoInDb = this.getMerchantRoleInfoByMerchantId(merchantsManagerDTO.getMerchantId());
        if (merchantRoleInfoInDb != null && !StringUtils.isEmpty((CharSequence)merchantRoleInfoInDb.getBusinessRole())) {
            businessRole = merchantRoleInfoInDb.getBusinessRole();
        }
        if (businessRole.contains("1")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800768);
        }
        merchantsManager.setId(merchantsManagerInDb.getId());
        merchantsManager.setMerchantId(merchantsManagerDTO.getMerchantId());
        merchantsManager.setEmail(merchantsManagerDTO.getEmail());
        merchantsManager.setCountryCode(merchantsManagerDTO.getCountryCode());
        merchantsManager.setMobile(merchantsManagerDTO.getMobile());
        merchantsManager.setFullName(merchantsManagerDTO.getFullName());
        merchantsManager.setEntityStatus(EntityStatus.Update);
        ArrayList<BizObject> bizObjectList = new ArrayList<BizObject>();
        bizObjectList.add((BizObject)merchantsManager);
        String result = null;
        try {
            if (StringUtils.isEmpty((CharSequence)merchantsManagerInDb.getYhtUserId())) {
                if (businessRole.contains("2") || businessRole.contains("6")) {
                    result = this.saveUserType(bizObjectList, "diwork", Integer.valueOf(UserType.TenantShopuser.getValue()));
                }
                if (businessRole.contains("3") || businessRole.contains("4") || businessRole.contains("5")) {
                    result = this.saveUserType(bizObjectList, "diwork", Integer.valueOf(UserType.ShopAdminUser.getValue()));
                }
            } else {
                ArrayList<String> userIds = new ArrayList<String>(1);
                userIds.add(merchantsManagerInDb.getYhtUserId());
                if (businessRole.contains("2") || businessRole.contains("6")) {
                    this.deleteUserType(AppContext.getCurrentUser().getYhtTenantId(), String.valueOf(UserType.TenantShopuser.getValue()), "diwork", userIds, merchantsManagerDTO.getMerchantId().toString());
                    result = this.saveUserType(bizObjectList, "diwork", Integer.valueOf(UserType.TenantShopuser.getValue()));
                }
                if (businessRole.contains("3") || businessRole.contains("4") || businessRole.contains("5")) {
                    this.deleteUserType(AppContext.getCurrentUser().getYhtTenantId(), String.valueOf(UserType.ShopAdminUser.getValue()), "diwork", userIds, merchantsManagerDTO.getMerchantId().toString());
                    result = this.saveUserType(bizObjectList, "diwork", Integer.valueOf(UserType.ShopAdminUser.getValue()));
                }
            }
        }
        catch (Exception e) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800769, new Object[]{e.getMessage()});
        }
        this.setMerchantsManagerYhtUserIdByYhtResult(result, merchantsManager);
        MetaDaoHelper.update((String)"aa.merchant.MerchantsManager", (BizObject)merchantsManager);
        return merchantsManager;
    }

    private MerchantsManager getMerchantsManagerByMerchantId(Long merchantId) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,email,mobile,yhtUserId");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId)}));
        List merchantsManagerInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantsManager", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantsManagerInDbList)) {
            return (MerchantsManager)merchantsManagerInDbList.get(0);
        }
        return null;
    }

    private MerchantRoleInfo getMerchantRoleInfoByMerchantId(Long merchantId) throws Exception {
        QuerySchema querySchema = QuerySchema.create().addSelect("businessRole").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId)}));
        List merchantRoleInfoInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantRoleInfoInDbList)) {
            return (MerchantRoleInfo)merchantRoleInfoInDbList.get(0);
        }
        return null;
    }

    private void setMerchantsManagerYhtUserIdByYhtResult(String result, MerchantsManager merchantsManager) throws Exception {
        List managerListMap;
        if (StringUtils.isNotBlank((CharSequence)result) && !CollectionUtils.isEmpty((Collection)(managerListMap = (List)JSON.parseObject((String)result, List.class)))) {
            managerListMap.forEach(managerMap -> merchantsManager.setYhtUserId((String)managerMap.get("yhtUserId")));
        }
    }
}

