/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.service.IUPCMerchantSyncService
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.billrule.merchant.MerchantBeforeSaveRule;
import com.yonyoucloud.upc.billrule.merchant.MerchantSaveExternalOrgRule;
import com.yonyoucloud.upc.service.IUPCMerchantSyncService;
import com.yonyoucloud.upc.service.MerchantCheckService;
import com.yonyoucloud.upc.service.UPCMerchantSyncService;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="syncMerchantToUorderSHRule")
public class SyncMerchantToUorderSHRule
extends MerchantBeforeSaveRule {
    private static final Logger log = LoggerFactory.getLogger(SyncMerchantToUorderSHRule.class);
    @Autowired
    private MerchantCheckService merchantCheckService;
    @Autowired
    private IUPCMerchantSyncService iupcMerchantSyncService;
    @Autowired
    private MerchantSaveExternalOrgRule merchantSaveExternalOrgRule;
    @Autowired
    private UPCMerchantSyncService upcMerchantSyncService;

    @Override
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        LoginUser currentUser = AppContext.getCurrentUser();
        if (null == currentUser) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        super.execute(billContext, map);
        List bills = this.getBills(billContext, map);
        for (BizObject bill : bills) {
            Merchant merchant = (Merchant)bill;
            this.merchantCheckService.theBeforeSaveCheckUdh(merchant);
            this.channMerchant(merchant);
            this.createShopFromUdh(billContext, merchant);
            this.merchantSaveExternalOrgRule.createRetail(merchant);
            MetaDaoHelper.update((String)"aa.merchant.Merchant", (BizObject)merchant);
        }
        return new RuleExecuteResult();
    }

    private void channMerchant(Merchant merchant) throws Exception {
        boolean isSqlMerchant;
        QuerySchema querySchema;
        if (merchant.getCreateOrg() != null) {
            querySchema = QuerySchema.create();
            querySchema.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchant.getCreateOrg()), QueryCondition.name((String)"dr").eq((Object)0), QueryCondition.name((String)"externalorg").eq((Object)0)}));
            List org = MetaDaoHelper.query((String)"org.func.BaseOrg", (QuerySchema)querySchema, (String)"ucf-org-center");
            if (!CollectionUtils.isEmpty((Collection)org)) {
                if (MerchantUtils.isExists((Map)merchant, (String)"channCustomerIndustry")) {
                    merchant.setCustomerIndustry(merchant.getChannCustomerIndustry());
                }
                if (MerchantUtils.isExists((Map)merchant, (String)"channCustomerClass")) {
                    merchant.setCustomerClass(merchant.getChannCustomerClass());
                }
            }
        }
        querySchema = QuerySchema.create();
        querySchema.addSelect("parentManageOrg,channCustomerLevel,channCustomerArea").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
        List sqlMerchant = MetaDaoHelper.queryNoPartition((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
        List merchantApplyRange = new ArrayList();
        boolean bl = isSqlMerchant = !CollectionUtils.isEmpty((Collection)sqlMerchant) && (MerchantUtils.isExists((Map)merchant, (String)"parentManageOrg") || ((Map)sqlMerchant.get(0)).containsKey("parentManageOrg"));
        if (isSqlMerchant) {
            Boolean isParentManageOrg = !MerchantUtils.isExists((Map)merchant, (String)"parentManageOrg") || MerchantUtils.isExists((Map)merchant, (String)"parentManageOrg") && merchant.getParentManageOrg().equals(((Map)sqlMerchant.get(0)).get("parentManageOrg"));
            Boolean isChannCustomerLevel = MerchantUtils.isExists((Map)merchant, (String)"channCustomerLevel") && !merchant.getChannCustomerLevel().equals(((Map)sqlMerchant.get(0)).get("channCustomerLevel"));
            Boolean isChannCustomerArea = MerchantUtils.isExists((Map)merchant, (String)"channCustomerArea") && !merchant.getChannCustomerArea().equals(((Map)sqlMerchant.get(0)).get("channCustomerArea"));
            if (!isParentManageOrg.booleanValue()) {
                querySchema = QuerySchema.create();
                querySchema.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"orgId").eq((Object)merchant.getParentManageOrg()), QueryCondition.name((String)"isPotential").eq((Object)false)}));
                merchantApplyRange = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema);
                if (!CollectionUtils.isEmpty(merchantApplyRange)) {
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("id,merchantApplyRangeId,customerArea,customerLevel").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId()), QueryCondition.name((String)"merchantApplyRangeId").eq(((Map)merchantApplyRange.get(0)).get("id"))}));
                    List merchantApplyRangeDetailList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema);
                    MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                    if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList)) {
                        if (isChannCustomerLevel.booleanValue()) {
                            merchantApplyRangeDetail.setCustomerLevel(merchant.getChannCustomerLevel());
                        } else {
                            merchant.setChannCustomerLevel((Long)((Map)merchantApplyRangeDetailList.get(0)).get("customerLevel"));
                        }
                        if (isChannCustomerArea.booleanValue()) {
                            merchantApplyRangeDetail.setCustomerArea(merchant.getChannCustomerArea());
                            querySchema = QuerySchema.create();
                            querySchema.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"merchantApplyRangeId").eq(((Map)merchantApplyRange.get(0)).get("id")), QueryCondition.name((String)"isDefault").eq((Object)1)}));
                            List customerArea = MetaDaoHelper.query((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema);
                            CustomerArea customerArea1 = new CustomerArea();
                            if (!CollectionUtils.isEmpty((Collection)customerArea)) {
                                ((Map)customerArea.get(0)).put("saleAreaId", merchant.getChannCustomerArea());
                                ((Map)customerArea.get(0)).put("_status", EntityStatus.Update);
                                customerArea1.append((Map)customerArea.get(0));
                                MetaDaoHelper.update((String)"aa.merchant.CustomerArea", (BizObject)customerArea1);
                            } else {
                                customerArea1.put("isDefault", (Object)true);
                                customerArea1.put("merchantApplyRangeId", ((Map)merchantApplyRange.get(0)).get("id"));
                                customerArea1.put("merchantId", merchant.getId());
                                customerArea1.put("saleAreaId", (Object)merchant.getChannCustomerArea());
                                customerArea1.put("_status", (Object)EntityStatus.Insert);
                                MetaDaoHelper.insert((String)"aa.merchant.CustomerArea", (BizObject)customerArea1);
                            }
                        } else {
                            merchant.setChannCustomerArea((Long)((Map)merchantApplyRangeDetailList.get(0)).get("customerArea"));
                        }
                        if (merchantApplyRangeDetail.containsKey((Object)"customerArea") || merchantApplyRangeDetail.containsKey((Object)"customerLevel")) {
                            merchantApplyRangeDetail.set("id", ((Map)merchantApplyRangeDetailList.get(0)).get("id"));
                            merchantApplyRangeDetail.set("merchantApplyRangeId", ((Map)merchantApplyRangeDetailList.get(0)).get("merchantApplyRangeId"));
                            merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                            MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
                        }
                    }
                }
            } else if (isParentManageOrg.booleanValue() && (MerchantUtils.isExists((Map)merchant, (String)"channCustomerLevel") || MerchantUtils.isExists((Map)merchant, (String)"channCustomerArea"))) {
                MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                if (!CollectionUtils.isEmpty((Collection)sqlMerchant)) {
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"orgId").eq(((Map)sqlMerchant.get(0)).get("parentManageOrg")), QueryCondition.name((String)"isPotential").eq((Object)false)}));
                    merchantApplyRange = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema);
                }
                if (!CollectionUtils.isEmpty(merchantApplyRange)) {
                    merchantApplyRangeDetail.set("id", merchant.getId());
                    merchantApplyRangeDetail.set("merchantApplyRangeId", ((Map)merchantApplyRange.get(0)).get("id"));
                    if (MerchantUtils.isExists((Map)merchant, (String)"channCustomerArea")) {
                        merchantApplyRangeDetail.setCustomerArea(merchant.getChannCustomerArea());
                        querySchema = QuerySchema.create();
                        querySchema.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"merchantApplyRangeId").eq(((Map)merchantApplyRange.get(0)).get("id")), QueryCondition.name((String)"isDefault").eq((Object)1)}));
                        List customerArea = MetaDaoHelper.query((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema);
                        CustomerArea customerArea1 = new CustomerArea();
                        if (!CollectionUtils.isEmpty((Collection)customerArea)) {
                            ((Map)customerArea.get(0)).put("saleAreaId", merchant.getChannCustomerArea());
                            ((Map)customerArea.get(0)).put("_status", EntityStatus.Update);
                            customerArea1.append((Map)customerArea.get(0));
                            MetaDaoHelper.update((String)"aa.merchant.CustomerArea", (BizObject)customerArea1);
                        } else {
                            customerArea1.put("isDefault", (Object)true);
                            customerArea1.put("merchantApplyRangeId", ((Map)merchantApplyRange.get(0)).get("id"));
                            customerArea1.put("merchantId", merchant.getId());
                            customerArea1.put("saleAreaId", (Object)merchant.getChannCustomerArea());
                            customerArea1.put("_status", (Object)EntityStatus.Insert);
                            MetaDaoHelper.insert((String)"aa.merchant.CustomerArea", (BizObject)customerArea1);
                        }
                    }
                    if (MerchantUtils.isExists((Map)merchant, (String)"channCustomerLevel")) {
                        merchantApplyRangeDetail.setCustomerLevel(merchant.getChannCustomerLevel());
                    }
                    if (merchantApplyRangeDetail.containsKey((Object)"customerArea") || merchantApplyRangeDetail.containsKey((Object)"customerLevel")) {
                        merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                        MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
                    }
                }
            }
        }
    }

    private void createShopFromUdh(BillContext billContext, Merchant merchant) throws Exception {
        if (merchant.merchantRole() != null && StringUtils.isNotBlank((CharSequence)merchant.merchantRole().getBusinessRole())) {
            if (merchant.merchantsManager() != null && (StringUtils.isNotBlank((CharSequence)merchant.merchantsManager().getMobile()) || StringUtils.isNotBlank((CharSequence)merchant.merchantsManager().getEmail()))) {
                QuerySchema querySchema;
                Map stringObjectMap;
                boolean isDeleteUserType = false;
                if (EntityStatus.Update.equals((Object)merchant.getEntityStatus()) && !CollectionUtils.isEmpty((Map)(stringObjectMap = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantsManager", (QuerySchema)(querySchema = QuerySchema.create().addSelect("email,mobile,yhtUserId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId())}))))))) {
                    QuerySchema querySchemaRoleInfo;
                    Map stringObjectMapRoleInfo;
                    if (merchant.merchantsManager().getMobile() != null && stringObjectMap.get("mobile") != null && StringUtils.isNotBlank((CharSequence)stringObjectMap.get("mobile").toString()) && !merchant.merchantsManager().getMobile().equals(stringObjectMap.get("mobile").toString())) {
                        isDeleteUserType = true;
                    } else if (merchant.merchantsManager().getEmail() != null && stringObjectMap.get("email") != null && StringUtils.isNotBlank((CharSequence)stringObjectMap.get("email").toString()) && !merchant.merchantsManager().getEmail().equals(stringObjectMap.get("email").toString())) {
                        isDeleteUserType = true;
                    } else if (merchant.merchantsManager().getMobile() != null && stringObjectMap.get("mobile") == null) {
                        isDeleteUserType = true;
                    } else if (merchant.merchantsManager().getEmail() != null && stringObjectMap.get("email") == null) {
                        isDeleteUserType = true;
                    } else if (merchant.merchantsManager().getMobile() == null && stringObjectMap.get("mobile") != null) {
                        isDeleteUserType = true;
                    } else if (merchant.merchantsManager().getEmail() == null && stringObjectMap.get("email") != null) {
                        isDeleteUserType = true;
                    }
                    if (isDeleteUserType && (stringObjectMapRoleInfo = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)(querySchemaRoleInfo = QuerySchema.create().addSelect("businessRole").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId())}))))) != null && !stringObjectMapRoleInfo.isEmpty() && stringObjectMapRoleInfo.get("businessRole") != null && StringUtils.isNotBlank((CharSequence)stringObjectMapRoleInfo.get("businessRole").toString())) {
                        String businessRole = stringObjectMapRoleInfo.get("businessRole").toString();
                        ArrayList<String> userIds = new ArrayList<String>(1);
                        userIds.add(stringObjectMap.get("yhtUserId").toString());
                        if (businessRole.contains("2") || businessRole.contains("6")) {
                            this.iupcMerchantSyncService.deleteUserType(AppContext.getCurrentUser().getYhtTenantId(), String.valueOf(UserType.TenantShopuser.getValue()), "diwork", userIds, merchant.getId().toString());
                        }
                        if (businessRole.contains("4") || businessRole.contains("3") || businessRole.contains("5")) {
                            this.iupcMerchantSyncService.deleteUserType(AppContext.getCurrentUser().getYhtTenantId(), String.valueOf(UserType.ShopAdminUser.getValue()), "diwork", userIds, merchant.getId().toString());
                        }
                    }
                }
                querySchema = QuerySchema.create();
                querySchema.addSelect("businessRole");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId())}));
                Map merchantRole = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)querySchema);
                String oldBusinessRole = !CollectionUtils.isEmpty((Map)merchantRole) ? merchantRole.get("businessRole").toString() : "1";
                if (isDeleteUserType || !oldBusinessRole.equals(merchant.merchantRole().getBusinessRole())) {
                    this.createUserType(billContext.getAction(), merchant);
                }
                if (merchant.merchantRole().getBusinessRole().contains("4") || merchant.merchantRole().getBusinessRole().contains("3") || merchant.merchantRole().getBusinessRole().contains("5")) {
                    this.saveExternalOrg(billContext.getAction(), merchant);
                }
            }
            this.updateRoleInfoDeleteUser(merchant);
        }
    }
}

