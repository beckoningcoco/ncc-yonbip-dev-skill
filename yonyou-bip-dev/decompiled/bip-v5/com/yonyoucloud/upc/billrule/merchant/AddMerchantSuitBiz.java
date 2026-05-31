/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.aa.merchant.IsTradeCustomers
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.Payway
 *  com.yonyoucloud.upc.service.IUPCMerchantQueryService
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
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
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.merchant.IsTradeCustomers;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.Payway;
import com.yonyoucloud.upc.service.IUPCMerchantQueryService;
import com.yonyoucloud.upc.service.merchantapplyrangegroup.MerchantGroupService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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

@Component(value="addMerchantSuitBiz")
public class AddMerchantSuitBiz
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(AddMerchantSuitBiz.class);
    @Autowired
    private IUPCMerchantQueryService upcMerchantQueryService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private MerchantGroupService merchantGroupService;
    @Autowired
    private PubOptionDataQueryUtil pubOptionDataQueryUtil;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800137);
        }
        List bills = this.getBills(billContext, paramMap);
        LoginUser user = AppContext.getCurrentUser();
        switch (user.getUserType()) {
            case TenantAdmin: 
            case TenantEmployee: {
                break;
            }
            case JoinUser: 
            case TenantShopuser: 
            case ShopAdminUser: 
            case ShopUser: {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800364, new Object[]{user.getName()});
            }
        }
        RuleExecuteResult result = new RuleExecuteResult();
        for (BizObject bill : bills) {
            if (!bill.containsKey((Object)"orgIds") || bill.get("orgIds") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800138);
            }
            if (!bill.containsKey((Object)"merchantId") || bill.get("merchantId") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800365);
            }
            if (!bill.containsKey((Object)"merchantApplyRangeId") || bill.get("merchantApplyRangeId") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800366);
            }
            if (bill.get("merchant_name") == null) {
                QueryConditionGroup queryMerchantNameCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bill.get("merchantId"))});
                QuerySchema queryMerchantNameSchema = QuerySchema.create().addSelect("name").addCondition((ConditionExpression)queryMerchantNameCondition);
                List merchantList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)queryMerchantNameSchema);
                if (merchantList != null && !merchantList.isEmpty()) {
                    bill.put("merchant_name", ((Map)merchantList.get(0)).get("name"));
                }
            }
            List orgIds = (List)bill.get("orgIds");
            Long merchantId = Long.valueOf(bill.get("merchantId").toString());
            List merchantApplyRangeDetail = null;
            if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                QueryConditionGroup queryCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").eq(bill.get("merchantApplyRangeId")), QueryCondition.name((String)"id").eq(bill.get("merchantId"))});
                QuerySchema querySchema = QuerySchema.create().addSelect("signBack, payway, transactionCurrency,taxRate,searchcode").addCondition((ConditionExpression)queryCondition);
                merchantApplyRangeDetail = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema);
            }
            Boolean signBack = (Boolean)bill.get("signBack");
            String payway = (String)bill.get("payway");
            String transactionCurrency = (String)bill.get("transactionCurrency");
            String searchcode = null;
            String taxRate = null;
            if (merchantApplyRangeDetail != null && !merchantApplyRangeDetail.isEmpty()) {
                if (signBack == null && ((Map)merchantApplyRangeDetail.get(0)).get("signBack") != null) {
                    signBack = Boolean.parseBoolean(((Map)merchantApplyRangeDetail.get(0)).get("signBack").toString());
                }
                if (payway == null) {
                    payway = ((Map)merchantApplyRangeDetail.get(0)).get("payway") != null ? ((Map)merchantApplyRangeDetail.get(0)).get("payway").toString() : "99";
                }
                if (transactionCurrency == null && ((Map)merchantApplyRangeDetail.get(0)).get("transactionCurrency") != null) {
                    transactionCurrency = ((Map)merchantApplyRangeDetail.get(0)).get("transactionCurrency").toString();
                }
                if (((Map)merchantApplyRangeDetail.get(0)).get("searchcode") != null) {
                    searchcode = ((Map)merchantApplyRangeDetail.get(0)).get("searchcode").toString();
                }
                if (((Map)merchantApplyRangeDetail.get(0)).get("taxRate") != null) {
                    taxRate = ((Map)merchantApplyRangeDetail.get(0)).get("taxRate").toString();
                }
            }
            if (!CollectionUtils.isEmpty((Collection)orgIds) && orgIds.contains(merchantId + "")) {
                orgIds.remove(merchantId + "");
            }
            if (CollectionUtils.isEmpty((Collection)orgIds)) {
                return new RuleExecuteResult();
            }
            log.info("addMerchantSuitOrg: orgId = {}, merchantIds = {}", (Object)orgIds, (Object)merchantId);
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bill.get("merchantApplyRangeId")), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
            QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryConditionGroup);
            schema.setPartitionable(false);
            List merchantapplyrange = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema);
            if (merchantapplyrange == null || merchantapplyrange.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800367, new Object[]{bill.get("merchant_name").toString()});
            }
            List<MerchantApplyRange> creatorMerchantApplyRangeList = this.merchantGroupService.getCreatorMerchantApplyRangeById(merchantId);
            if (CollectionUtils.isEmpty(creatorMerchantApplyRangeList)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800367, new Object[]{bill.get("merchant_name").toString()});
            }
            String merchantDetailId = creatorMerchantApplyRangeList.get(0).getMerchantDetailId();
            ArrayList<MerchantApplyRange> ranges2Db = new ArrayList<MerchantApplyRange>();
            ArrayList<MerchantApplyRangeDetail> detail2Db = new ArrayList<MerchantApplyRangeDetail>();
            QueryConditionGroup queryConditionGroup1 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").in((Collection)orgIds), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
            QuerySchema schema1 = QuerySchema.create().addSelect("orgId, orgId.name as org_Name").addCondition((ConditionExpression)queryConditionGroup1);
            schema1.setPartitionable(false);
            List ranges = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema1);
            if (!CollectionUtils.isEmpty((Collection)ranges)) {
                List orgsInDb = ranges.stream().map(map -> map.get("orgId").toString()).collect(Collectors.toList());
                HashSet orgsInDbSet = new HashSet(orgsInDb);
                HashSet orgIdSet = new HashSet(orgIds);
                orgIdSet.retainAll(orgsInDbSet);
                if (!orgIdSet.isEmpty()) {
                    log.info("addMerchantSuitOrg merchantId:{}, exists orgs:{}", (Object)merchantId, orgsInDb);
                    orgIds.removeAll(orgsInDb);
                    List exists = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)QuerySchema.create().addSelect(new String[]{"code", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(orgIdSet)})), (String)"ucf-org-center");
                    result.setData((Object)MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080924", (String)"\u5ba2\u6237[{0}]\u5df2\u5206\u914d\u7ec4\u7ec7{1}"), bill.get("merchant_name"), exists.stream().map(map -> map.get("name").toString()).collect(Collectors.toList())));
                }
                if (orgIds.size() > 0) {
                    for (String orgid : orgIds) {
                        MerchantApplyRange range = MerchantUtils.getMerchantApplyRange((Long)merchantId, (Integer)3, (String)orgid);
                        range.setMerchantDetailId(merchantDetailId);
                        MerchantApplyRangeDetail detail = this.getMerchantApplyRangeDetail(merchantId, (Long)range.getId(), signBack, payway, transactionCurrency, searchcode, taxRate);
                        ranges2Db.add(range);
                        detail2Db.add(detail);
                    }
                }
            } else {
                for (String orgid : orgIds) {
                    MerchantApplyRange range = MerchantUtils.getMerchantApplyRange((Long)merchantId, (Integer)3, (String)orgid);
                    range.setMerchantDetailId(merchantDetailId);
                    MerchantApplyRangeDetail detail = this.getMerchantApplyRangeDetail(merchantId, (Long)range.getId(), signBack, payway, transactionCurrency, searchcode, taxRate);
                    ranges2Db.add(range);
                    detail2Db.add(detail);
                }
            }
            if (ranges2Db.isEmpty()) continue;
            MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRange", ranges2Db);
            if (this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) continue;
            MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRangeDetail", detail2Db);
        }
        return new RuleExecuteResult();
    }

    public MerchantApplyRangeDetail getMerchantApplyRangeDetail(Long merchantId, Long rangeid, Boolean signBack, String payway, String transactionCurrency, String searchcode, String taxRate) {
        MerchantApplyRangeDetail detail = new MerchantApplyRangeDetail();
        detail.set("id", (Object)merchantId);
        detail.setMerchantApplyRangeId(rangeid);
        detail.setStopstatus(Boolean.valueOf(false));
        detail.setModifier(AppContext.getCurrentUser().getName());
        detail.setCreator(AppContext.getCurrentUser().getName());
        detail.setSignBack(signBack);
        detail.setTransactionCurrency(transactionCurrency);
        detail.setExchangeratetype(AppContext.getCurrentUser().getYhtTenantId());
        if (!"".equals(payway) && payway != null && Long.valueOf(payway) == (long)Payway.others.getValue()) {
            detail.setPayway(Payway.others);
        } else {
            detail.setPayway(Payway.paymentDelivery);
        }
        detail.setTaxRate(taxRate);
        detail.setSearchcode(searchcode);
        detail.setEntityStatus(EntityStatus.Insert);
        detail.setIsTradeCustomers(IsTradeCustomers.tradeCustomers.getValue());
        return detail;
    }
}

