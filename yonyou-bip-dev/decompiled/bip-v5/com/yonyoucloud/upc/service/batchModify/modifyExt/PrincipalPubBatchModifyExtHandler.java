/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService
 *  com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.log.cons.BusinessLogMode
 *  com.yonyou.iuap.log.model.BusinessLogObjectBuilder
 *  com.yonyou.iuap.log.rpc.IBusiLogService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.Principal
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
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
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
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO;
import com.yonyoucloud.upc.service.batchModify.modifyExt.MerchantPubBatchModifyExtHandler;
import com.yonyoucloud.upc.service.batchModify.modifyExt.ProductPubBatchModifyExtHandler;
import java.util.ArrayList;
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
public class PrincipalPubBatchModifyExtHandler
implements IPubBatchModifyEntityExtService {
    private static final Logger log = LoggerFactory.getLogger(PrincipalPubBatchModifyExtHandler.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    MerchantPubBatchModifyExtHandler merchantPubBatchModifyExtHandler;
    @Autowired
    private IBusiLogService busiLogService;

    public void batchModifyIsCheckField(BizObject bizObject, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        Merchant merchant = new Merchant();
        Principal principal = new Principal();
        principal.init((Map)bizObject);
        principal.set("importSpecialPrincipalId", (Object)principal.getId().toString());
        principal.setEntityStatus(EntityStatus.Update);
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("merchantApplyRangeId as merchantApplyRangeId,merchantApplyRangeId.orgId as belongOrg,merchantId as merchantId,professSalesman,specialManagementDep,isDefault as isDefault");
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(principal.getId())});
        querySchema.addCondition((ConditionExpression)queryConditionGroup);
        List principalInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Principal", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)principalInDbList)) {
            querySchema = QuerySchema.create();
            querySchema.addSelect("code,name,createOrg,creditCode");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)((Principal)principalInDbList.get(0)).getMerchantId())}));
            List merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (boolean)true, (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)merchantInDbList)) {
                if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("professSalesman")) {
                    if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("professSalesman"))) {
                        principal.setProfessSalesman(String.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("professSalesman")));
                        principal.put("professSalesman_code", (Object)String.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("professSalesman_code")));
                        principal.put("professSalesman_Name", (Object)String.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("professSalesman_Name")));
                    } else {
                        principal.setProfessSalesman(null);
                    }
                } else if (((Principal)principalInDbList.get(0)).getProfessSalesman() != null) {
                    principal.setProfessSalesman(((Principal)principalInDbList.get(0)).getProfessSalesman());
                }
                if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("specialManagementDep")) {
                    if (!ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("specialManagementDep"))) {
                        principal.setSpecialManagementDep(String.valueOf(pubBatchModifyEntityFieldSaveIsCheckMap.get("specialManagementDep")));
                    } else {
                        principal.setSpecialManagementDep(null);
                    }
                } else if (((Principal)principalInDbList.get(0)).getSpecialManagementDep() != null) {
                    principal.setSpecialManagementDep(((Principal)principalInDbList.get(0)).getSpecialManagementDep());
                }
                principal.setIsDefault(((Principal)principalInDbList.get(0)).getIsDefault());
                merchant.setId((Object)((Principal)principalInDbList.get(0)).getMerchantId());
                merchant.setCode(((Merchant)merchantInDbList.get(0)).getCode());
                merchant.set("name", ((Merchant)merchantInDbList.get(0)).get("name"));
                merchant.setCreateOrg(((Merchant)merchantInDbList.get(0)).getCreateOrg());
                merchant.setCreditCode(((Merchant)merchantInDbList.get(0)).getCreditCode());
                merchant.set("belongOrg", ((Principal)principalInDbList.get(0)).get("belongOrg"));
                if (((Principal)principalInDbList.get(0)).get("belongOrg").equals(((Merchant)merchantInDbList.get(0)).getCreateOrg())) {
                    merchant.set("isCreator", (Object)true);
                } else {
                    merchant.set("isCreator", (Object)false);
                }
                merchant.set("merchantApplyRangeId", (Object)((Principal)principalInDbList.get(0)).getMerchantApplyRangeId());
                merchant.set("_fromApi", (Object)true);
                merchant.set("importSpecialKey_merchant", (Object)"importSpecialKey_merchant");
                merchant.set("_fromBatchModify", (Object)true);
                merchant.setEntityStatus(EntityStatus.Update);
                ArrayList<Principal> principalList = new ArrayList<Principal>();
                principalList.add(principal);
                merchant.setPrincipals(principalList);
                BillDataDto saveDto = new BillDataDto();
                saveDto.setData((Object)merchant);
                saveDto.setBillnum("aa_merchant");
                RuleExecuteResult result = this.billService.executeUpdate("save", saveDto);
                if (result.getMsgCode() != 1) {
                    throw new CoreDocBusinessException(result.getMessage());
                }
            }
        }
    }

    public void supplementaryReminder(Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap) throws Exception {
        if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("professSalesman") && !ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("professSalesman"))) {
            QuerySchema schema = QuerySchema.create().addSelect("code, name").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq(pubBatchModifyEntityFieldSaveIsCheckMap.get("professSalesman")), QueryCondition.name((String)"dr").eq((Object)0)});
            List staffs = MetaDaoHelper.query((String)"bd.staff.Staff", (QuerySchema)schema, (String)"ucf-staff-center");
            if (!CollectionUtils.isEmpty((Collection)staffs)) {
                pubBatchModifyEntityFieldSaveIsCheckMap.put("professSalesman_code", ((Map)staffs.get(0)).get("code"));
                pubBatchModifyEntityFieldSaveIsCheckMap.put("professSalesman_Name", ((Map)staffs.get(0)).get("name"));
            }
        } else if (pubBatchModifyEntityFieldSaveIsCheckMap.containsKey("professSalesman") && ObjectUtils.isEmpty((Object)pubBatchModifyEntityFieldSaveIsCheckMap.get("professSalesman"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801463);
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
        querySchema.addSelect("merchantId");
        querySchema.addSelect("merchantApplyRangeId");
    }

    public void update(String fullName, BizObject newBizObjectUpdate, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        this.addLogAndModifyAudit(fullName, newBizObjectUpdate, pubBatchModifyEntitySaveDTO);
    }

    public void addLogAndModifyAudit(String fullName, BizObject newBizObjectUpdate, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        this.merchantPubBatchModifyExtHandler.addAuditFields(newBizObjectUpdate);
        MetaDaoHelper.update((String)fullName, (BizObject)newBizObjectUpdate);
        Object merchantId = newBizObjectUpdate.get("merchantId");
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
        String merchantIDStr = merchantId instanceof Long ? merchantId.toString() : String.valueOf(merchantId);
        if (pubBatchModifyEntitySaveDTO.getUpdateLog().booleanValue()) {
            BillDataDto billDataDtomerchantLog = new BillDataDto("aa_merchant", merchantIDStr);
            Map merchantDetail = this.billService.detail(billDataDtomerchantLog);
            for (String key : newBizObjectUpdate.keySet()) {
                if (!ProductPubBatchModifyExtHandler.notAddFields.contains(key)) {
                    merchantDetail.put(key, newBizObjectUpdate.get(key));
                }
                if (!key.equals("modifierId") && !key.equals("modifyTime") && !key.equals("modifyDate")) continue;
                merchantDetail.put("merchantAppliedDetail!" + key, newBizObjectUpdate.get(key));
            }
            BusinessLogObjectBuilder businessLogObjectBuilder = new BusinessLogObjectBuilder();
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
            businessLogObjectBuilder.uri("aa.merchant.Merchant").busiObjTypeCode(busiObjTypeCode).busiObjTypeName(busiObjTypeName).defaultBusiObjTypeName("\u5ba2\u6237").operationName("UID:P_COREDOC-UI_17AAAFC8042017E9").defaultOperationName("\u6279\u6539").logMode(BusinessLogMode.UI_META).applicationName(appName).serviceName(serviceName).applicationCode(ApplicationCodeConstant.getApplicationCodeByFullName((String)"aa.merchant.Merchant")).domain("productcenter").serviceCode(serviceCode).newObject((Object)merchantDetail).dataId(merchantIDStr).dataCode(merchantDetail.get("code") == null ? "" : merchantDetail.get("code").toString()).dataName(merchantDetail.get("name") == null ? "" : merchantDetail.get("name").toString());
            this.busiLogService.saveBusinessLog(businessLogObjectBuilder.build());
        }
    }
}

