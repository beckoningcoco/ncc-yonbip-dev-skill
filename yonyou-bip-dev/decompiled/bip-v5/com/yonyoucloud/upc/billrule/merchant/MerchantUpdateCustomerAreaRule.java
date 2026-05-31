/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantDao
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.InvoicingCustomers
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
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

import com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantDao;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.InvoicingCustomers;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.billrule.merchant.MerchantDataProcessRule;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import java.util.Collection;
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

@Component(value="merchantUpdateCustomerAreaRule")
public class MerchantUpdateCustomerAreaRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(MerchantUpdateCustomerAreaRule.class);
    @Autowired
    private MerchantDataProcessRule merchantDataProcessRule;
    @Autowired
    private PubOptionDataQueryUtil pubOptionDataQueryUtil;
    @Autowired
    MerchantDao merchantDao;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        for (BizObject bizObject : bills) {
            Merchant merchant = (Merchant)bizObject;
            if (merchant.getEntityStatus() == EntityStatus.Update && merchant.get("merchantApplyRangeId") != null && merchant.get("isCreator") != null) {
                Long merchantApplyRangeId = Long.valueOf(merchant.get("merchantApplyRangeId").toString());
                Boolean isCreator = (Boolean)merchant.get("isCreator");
                if (isCreator.booleanValue() && merchant.containsKey((Object)"customerArea") && merchant.getCustomerArea() == null) {
                    QuerySchema querySchema = QuerySchema.create();
                    querySchema.addSelect("saleAreaId");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId), QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)1)}));
                    List customerAreaList = MetaDaoHelper.queryObject((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema, null);
                    if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
                        merchant.setCustomerArea(((CustomerArea)customerAreaList.get(0)).getSaleAreaId());
                        Merchant merchantForUpdateCustomerArea = new Merchant();
                        merchantForUpdateCustomerArea.setId(merchant.getId());
                        merchantForUpdateCustomerArea.setCustomerArea(((CustomerArea)customerAreaList.get(0)).getSaleAreaId());
                        merchantForUpdateCustomerArea.setEntityStatus(EntityStatus.Update);
                        MetaDaoHelper.update((String)"aa.merchant.Merchant", (BizObject)merchantForUpdateCustomerArea);
                    }
                }
                this.updateCustomerAreaDefaultFromApi(merchant, merchantApplyRangeId);
                this.updatePrincipalDefaultFromApi(merchant, merchantApplyRangeId);
                this.updateInvoicingCustomerDefaultFromApi(merchant, merchantApplyRangeId);
            }
            if (CollectionUtils.isEmpty((Collection)merchant.merchantDetail())) continue;
            List merchantDetailIdList = merchant.merchantDetail().stream().filter(merchantDetail -> merchantDetail.getEntityStatus() == EntityStatus.Insert).map(merchantDetail -> merchantDetail.getId().toString()).collect(Collectors.toList());
            this.merchantDao.updateDetailModifyTimeToNull(merchantDetailIdList);
        }
        return new RuleExecuteResult();
    }

    private void updateCustomerAreaDefaultFromApi(Merchant merchant, Long merchantApplyRangeId) throws Exception {
        if (BooleanUtil.isTrue((Object)merchant.get("_fromApi"))) {
            if (!CollectionUtils.isEmpty((Collection)merchant.customerAreas())) {
                int deleteCount = 0;
                for (CustomerArea customerArea : merchant.customerAreas()) {
                    if (customerArea.getEntityStatus() != EntityStatus.Delete) continue;
                    ++deleteCount;
                }
                if (deleteCount != merchant.customerAreas().size()) {
                    return;
                }
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id,saleAreaId,isDefault");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId), QueryCondition.name((String)"merchantId").eq(merchant.getId())}));
            List customerAreaInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)customerAreaInDbList)) {
                boolean existDefault = false;
                for (CustomerArea customerAreaInDb : customerAreaInDbList) {
                    if (!customerAreaInDb.getIsDefault().booleanValue()) continue;
                    existDefault = true;
                }
                if (!existDefault) {
                    CustomerArea customerAreaInDb = (CustomerArea)customerAreaInDbList.get(0);
                    customerAreaInDb.setIsDefault(Boolean.valueOf(true));
                    customerAreaInDb.setEntityStatus(EntityStatus.Update);
                    if (BooleanUtil.isTrue((Object)merchant.get("isCreator"))) {
                        Merchant merchantUpdate = new Merchant();
                        merchantUpdate.setId(merchant.getId());
                        merchantUpdate.setCustomerArea(customerAreaInDb.getSaleAreaId());
                        merchantUpdate.setEntityStatus(EntityStatus.Update);
                        MetaDaoHelper.update((String)"aa.merchant.Merchant", (BizObject)merchantUpdate);
                    }
                    if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                        MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                        merchantApplyRangeDetail.setMerchantApplyRangeId(merchantApplyRangeId);
                        merchantApplyRangeDetail.setCustomerArea(customerAreaInDb.getSaleAreaId());
                        merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                        MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
                    }
                    MetaDaoHelper.update((String)"aa.merchant.CustomerArea", (BizObject)customerAreaInDb);
                }
            }
        }
    }

    private void updatePrincipalDefaultFromApi(Merchant merchant, Long merchantApplyRangeId) throws Exception {
        if (BooleanUtil.isTrue((Object)merchant.get("_fromApi"))) {
            if (!CollectionUtils.isEmpty((Collection)merchant.principals())) {
                int deleteCount = 0;
                for (Principal principal : merchant.principals()) {
                    if (principal.getEntityStatus() != EntityStatus.Delete) continue;
                    ++deleteCount;
                }
                if (deleteCount != merchant.principals().size()) {
                    return;
                }
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id,specialManagementDep,professSalesman,isDefault");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId), QueryCondition.name((String)"merchantId").eq(merchant.getId())}));
            List principalInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Principal", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)principalInDbList)) {
                boolean existDefault = false;
                for (Principal principalInDb : principalInDbList) {
                    if (!principalInDb.getIsDefault().booleanValue()) continue;
                    existDefault = true;
                }
                if (!existDefault) {
                    Principal principalInDb = (Principal)principalInDbList.get(0);
                    principalInDb.setIsDefault(Boolean.valueOf(true));
                    principalInDb.setEntityStatus(EntityStatus.Update);
                    if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                        MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                        merchantApplyRangeDetail.setMerchantApplyRangeId(merchantApplyRangeId);
                        merchantApplyRangeDetail.setSpecialManagementDep(principalInDb.getSpecialManagementDep());
                        merchantApplyRangeDetail.setProfessSalesman(principalInDb.getProfessSalesman());
                        merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                        MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
                    }
                    MetaDaoHelper.update((String)"aa.merchant.Principal", (BizObject)principalInDb);
                }
            }
        }
    }

    private void updateInvoicingCustomerDefaultFromApi(Merchant merchant, Long merchantApplyRangeId) throws Exception {
        if (BooleanUtil.isTrue((Object)merchant.get("_fromApi"))) {
            if (!CollectionUtils.isEmpty((Collection)merchant.invoicingCustomerss())) {
                int deleteCount = 0;
                for (InvoicingCustomers invoicingCustomers : merchant.invoicingCustomerss()) {
                    if (invoicingCustomers.getEntityStatus() != EntityStatus.Delete) continue;
                    ++deleteCount;
                }
                if (deleteCount != merchant.invoicingCustomerss().size()) {
                    return;
                }
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id,invoicingCustomersId,isDefault");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId), QueryCondition.name((String)"merchantId").eq(merchant.getId())}));
            List invoicingCustomerInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.InvoicingCustomers", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)invoicingCustomerInDbList)) {
                boolean existDefault = false;
                for (InvoicingCustomers invoicingCustomerInDb : invoicingCustomerInDbList) {
                    if (!invoicingCustomerInDb.getIsDefault().booleanValue()) continue;
                    existDefault = true;
                }
                if (!existDefault) {
                    InvoicingCustomers invoicingCustomerInDb = (InvoicingCustomers)invoicingCustomerInDbList.get(0);
                    invoicingCustomerInDb.setIsDefault(Boolean.valueOf(true));
                    invoicingCustomerInDb.setEntityStatus(EntityStatus.Update);
                    if (BooleanUtil.isTrue((Object)merchant.get("isCreator"))) {
                        Merchant merchantUpdate = new Merchant();
                        merchantUpdate.setId(merchant.getId());
                        merchantUpdate.setInvoicingCustomers(invoicingCustomerInDb.getInvoicingCustomersId());
                        merchantUpdate.setEntityStatus(EntityStatus.Update);
                        MetaDaoHelper.update((String)"aa.merchant.Merchant", (BizObject)merchantUpdate);
                    }
                    MetaDaoHelper.update((String)"aa.merchant.InvoicingCustomers", (BizObject)invoicingCustomerInDb);
                }
            }
        }
    }
}

