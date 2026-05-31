/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.InvoicingCustomers
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.upc.service.IUPCMerchantSyncService
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.InvoicingCustomers;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.billrule.merchant.MerchantDeleteOverRule;
import com.yonyoucloud.upc.service.IUPCMerchantSyncService;
import com.yonyoucloud.upc.service.MerchantService;
import com.yonyoucloud.upc.service.merchantapplyrangegroup.MerchantGroupService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantDeleteRule")
public class MerchantDeleteRule
extends AbstractCommonRule {
    @Autowired
    private IUPCMerchantSyncService merchantSyncService;
    @Autowired
    private MerchantService merchantService;
    @Autowired
    private MerchantGroupService merchantGroupService;
    @Autowired
    private IOrgUnitQueryService iOrgUnitQueryService;
    @Autowired
    private PubOptionDataQueryUtil pubOptionDataQueryUtil;
    @Autowired
    MerchantDeleteOverRule merchantDeleteOverRule;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List bills = this.getBills(billContext, map);
        LoginUser user = AppContext.getCurrentUser();
        if (null == user) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        if (null != bills && bills.size() > 0) {
            Object channelOperateCenter = OptionUtils.getSysOptionByName((String)"app:ChannelOperateCenter");
            String defaultOpen = "true";
            for (BizObject bill : bills) {
                Object merchantApplyRangeIdObj;
                Merchant merchant = (Merchant)bill;
                Object carryParams = bill.get("carryParams");
                Boolean isCreator = carryParams != null ? (Boolean)((Map)bill.get("carryParams")).get("isCreator") : (Boolean)bill.get("isCreator");
                if (isCreator.booleanValue()) {
                    QuerySchema querySchema1 = QuerySchema.create();
                    querySchema1.addSelect("id");
                    querySchema1.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"parentCustomer").eq(bill.getId())}));
                    List parentCustomerList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)querySchema1);
                    if (!CollectionUtils.isEmpty((Collection)parentCustomerList)) {
                        String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080035", (String)"\u5ba2\u6237\u5df2\u88ab:[%s]\u5176\u4ed6\u4e0b\u7ea7\u5ba2\u6237\u5f15\u7528\uff0c\u65e0\u6cd5\u5220\u9664"), (Object[])bill.get("code"));
                        throw new CoreDocBusinessException(msg);
                    }
                    QuerySchema querySchema3 = QuerySchema.create();
                    querySchema3.addSelect("id");
                    querySchema3.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"createOrg").eq((Object)bill.getId().toString())}));
                    List merhcantList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)querySchema3);
                    if (!CollectionUtils.isEmpty((Collection)merhcantList)) {
                        String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080033", (String)"\u8be5[%s]\u5546\u5bb6\u5ba2\u6237\u4e0b\u5b58\u5728\u5ba2\u6237\uff0c\u65e0\u6cd5\u5220\u9664"), (String)bill.get("code"));
                        throw new CoreDocBusinessException(msg);
                    }
                    if (channelOperateCenter != null && defaultOpen.equals(channelOperateCenter.toString())) {
                        this.merchantService.incrUnionKeyCheckLicense(bill, true);
                    }
                    QuerySchema querySchema2 = QuerySchema.create();
                    querySchema2.addSelect("id");
                    querySchema2.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(bill.getId()), QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"businessRole").like((Object)"3"), QueryCondition.name((String)"businessRole").like((Object)"4"), QueryCondition.name((String)"businessRole").like((Object)"5")})}));
                    Map merchantRole = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)querySchema2);
                    if (!CollectionUtils.isEmpty((Map)merchantRole)) {
                        bill.setEntityStatus(EntityStatus.Delete);
                        this.merchantSyncService.executeUpdate(billContext.getAction(), MerchantUtils.transferExternalOrg((Merchant)((Merchant)bill)));
                    }
                    this.deleteUserType(bill);
                }
                if (isCreator.booleanValue()) continue;
                bill.set("code", null);
                MerchantApplyRange range = new MerchantApplyRange();
                List merchantApplyRangeDetails = (List)bill.get("merchantAppliedDetail");
                String merchangApplyRangeId = null;
                if (merchantApplyRangeDetails != null && merchantApplyRangeDetails.size() > 0 && ((Map)merchantApplyRangeDetails.get(0)).get("merchantApplyRangeId") == null) {
                    merchantApplyRangeIdObj = bill.get("merchantApplyRangeId");
                    merchangApplyRangeId = merchantApplyRangeIdObj != null ? merchantApplyRangeIdObj.toString() : null;
                } else {
                    merchantApplyRangeIdObj = null;
                    Object carryParamsBill = bill.get("carryParams");
                    if (carryParamsBill != null && carryParamsBill instanceof Map) {
                        merchantApplyRangeIdObj = ((Map)carryParamsBill).get("merchantApplyRangeId");
                    }
                    if (merchantApplyRangeIdObj == null && merchantApplyRangeDetails != null && !merchantApplyRangeDetails.isEmpty()) {
                        merchantApplyRangeIdObj = ((Map)merchantApplyRangeDetails.get(0)).get("merchantApplyRangeId");
                    }
                    merchangApplyRangeId = merchantApplyRangeIdObj != null ? merchantApplyRangeIdObj.toString() : null;
                }
                range.setId((Object)merchangApplyRangeId);
                range.setMerchantId((Long)bill.getId());
                this.merchantGroupService.deleteMerchantApplyRangeGroup(range.getMerchantId(), Long.parseLong(merchangApplyRangeId), false);
                range.setEntityStatus(EntityStatus.Delete);
                MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRange", (BizObject)range);
                MerchantApplyRangeDetail rangeDetail = new MerchantApplyRangeDetail();
                rangeDetail.setMerchantApplyRangeId(Long.valueOf(Long.parseLong(merchangApplyRangeId)));
                rangeDetail.setEntityStatus(EntityStatus.Delete);
                if (this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                    MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)rangeDetail);
                }
                this.deleteCustomerAreaByRangId(Long.parseLong(merchangApplyRangeId));
                this.deletePrincipalByRangId(Long.parseLong(merchangApplyRangeId));
                this.deleteInvoicingCustomerByRangId(Long.parseLong(merchangApplyRangeId));
                this.merchantDeleteOverRule.deleteForCRM(merchant);
            }
        }
        return new RuleExecuteResult();
    }

    private void deleteUserType(BizObject bill) throws Exception {
        String businessRole = MerchantUtils.getMerchantRoleInfoBusinessRole((BizObject)bill);
        if (businessRole.contains("2") || businessRole.contains("3") || businessRole.contains("4") || businessRole.contains("5") || businessRole.contains("6")) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("yhtUserId");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(bill.getId())}));
            Map merchantsManager = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantsManager", (QuerySchema)querySchema);
            if (!CollectionUtils.isEmpty((Map)merchantsManager)) {
                ArrayList<String> userIds = new ArrayList<String>(1);
                userIds.add(merchantsManager.get("yhtUserId").toString());
                if (businessRole.contains("2") || businessRole.contains("6")) {
                    this.merchantSyncService.deleteUserType(AppContext.getCurrentUser().getYhtTenantId(), String.valueOf(UserType.TenantShopuser.getValue()), "diwork", userIds, bill.getId().toString());
                }
                if (businessRole.contains("3") || businessRole.contains("4") || businessRole.contains("5")) {
                    this.merchantSyncService.deleteUserType(AppContext.getCurrentUser().getYhtTenantId(), String.valueOf(UserType.ShopAdminUser.getValue()), "diwork", userIds, bill.getId().toString());
                }
            }
        }
    }

    private void deleteCustomerAreaByRangId(Long merchantApplyRangeId) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId)}));
        List customerAreaInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)customerAreaInDbList)) {
            for (CustomerArea customerArea : customerAreaInDbList) {
                customerArea.setEntityStatus(EntityStatus.Delete);
            }
            MetaDaoHelper.delete((String)"aa.merchant.CustomerArea", (List)customerAreaInDbList);
        }
    }

    private void deletePrincipalByRangId(Long merchantApplyRangeId) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId)}));
        List principalInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Principal", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)principalInDbList)) {
            for (Principal principal : principalInDbList) {
                principal.setEntityStatus(EntityStatus.Delete);
            }
            MetaDaoHelper.delete((String)"aa.merchant.Principal", (List)principalInDbList);
        }
    }

    private void deleteInvoicingCustomerByRangId(Long merchantApplyRangeId) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId)}));
        List invoicingCustomerInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.InvoicingCustomers", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)invoicingCustomerInDbList)) {
            for (InvoicingCustomers invoicingCustomer : invoicingCustomerInDbList) {
                invoicingCustomer.setEntityStatus(EntityStatus.Delete);
            }
            MetaDaoHelper.delete((String)"aa.merchant.InvoicingCustomers", (List)invoicingCustomerInDbList);
        }
    }
}

