/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantRoleInfo
 *  com.yonyoucloud.upc.utils.PartnerConstant
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
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
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantRoleInfo;
import com.yonyoucloud.upc.service.MerchantService;
import com.yonyoucloud.upc.utils.PartnerConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantDeleteInitRule")
public class MerchantDeleteInitRule
extends AbstractCommonRule {
    Logger logger = LoggerFactory.getLogger(MerchantDeleteInitRule.class);
    @Autowired
    private MerchantService merchantService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List bills = this.getBills(billContext, map);
        if (null != bills && bills.size() > 0) {
            for (BizObject bill : bills) {
                this.preCheckDeleteMerchant(bill);
                ArrayList<String> excludeList = new ArrayList<String>();
                excludeList.add("aa.vendor.VendorOrg");
                excludeList.add("aa.merchant.MerchantApplyRange4UsePower");
                excludeList.add("aa.merchant.MerchantDetail");
                excludeList.add("aa.merchant.MerchantDetailForCRM");
                excludeList.add("aa.merchant.MerchantSaleArea");
                excludeList.add("aa.merchant.MerchantPrincipal");
                excludeList.add("aa.merchant.MerchantInvoice");
                Object carryParams = bill.get("carryParams");
                Boolean isCreator = carryParams != null ? (Boolean)((Map)bill.get("carryParams")).get("isCreator") : (Boolean)bill.get("isCreator");
                if (isCreator.booleanValue()) {
                    List param = (List)((BillDataDto)map.get("param")).getData();
                    ((Map)param.get(0)).put("merchantAppliedDetail", null);
                    this.merchantRoleInfoDelete(bill, excludeList);
                } else {
                    excludeList.add("aa.warehouse.WarehouseCurrentStock");
                    excludeList.add("aa.warehouse.Warehouse");
                }
                this.initTransactionRelationDeleteNotify(bill);
                map.put("excludeList", excludeList);
                this.logger.info("merchantDelete_excludeList:{}", excludeList);
            }
            this.merchantService.updateBillContext(bills, billContext);
        }
        return new RuleExecuteResult();
    }

    private void merchantRoleInfoDelete(BizObject bill, List<String> excludeList) throws Exception {
        MerchantRoleInfo merchantRoleInfo = (MerchantRoleInfo)bill.getBizObject("merchantRole", MerchantRoleInfo.class);
        if (!CollectionUtils.isEmpty((Map)merchantRoleInfo) && !StringUtils.isBlank((CharSequence)merchantRoleInfo.getBusinessRole()) && merchantRoleInfo.getBusinessRole().contains("3")) {
            excludeList.add("aa.warehouse.WarehouseCurrentStock");
            excludeList.add("aa.warehouse.Warehouse");
        } else {
            QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(bill.getId()), QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"businessRole").like((Object)"3")})}));
            Map merchantRoleInfoSql = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)querySchema);
            if (!CollectionUtils.isEmpty((Map)merchantRoleInfoSql)) {
                excludeList.add("aa.warehouse.WarehouseCurrentStock");
                excludeList.add("aa.warehouse.Warehouse");
            }
        }
    }

    public void preCheckDeleteMerchant(BizObject bill) throws Exception {
        Merchant merchant = new Merchant();
        merchant.init((Map)bill);
        boolean isCreator = merchant.get("isCreator") != null && (Boolean)merchant.get("isCreator") != false;
        QuerySchema schemaParentCustomer = QuerySchema.create().addSelect("createOrg, code").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"parentCustomer").eq(merchant.getId())}));
        schemaParentCustomer.addPager(0, 1);
        Map prarentCustomer = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)schemaParentCustomer);
        if (!CollectionUtils.isEmpty((Map)prarentCustomer) && isCreator) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800375, new Object[]{merchant.getCode(), prarentCustomer.get("code").toString()});
        }
        QuerySchema schemaInvoicingCustomers = QuerySchema.create().addSelect("merchantId, merchantId.code as merchantIdCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"invoicingCustomersId").eq(merchant.getId())}));
        schemaParentCustomer.addPager(0, 1);
        List invoicingCustomers = MetaDaoHelper.query((String)"aa.merchant.InvoicingCustomers", (QuerySchema)schemaInvoicingCustomers);
        if (!CollectionUtils.isEmpty((Collection)invoicingCustomers) && isCreator) {
            for (Map invoicingCustomer : invoicingCustomers) {
                if (invoicingCustomer.get("merchantId").equals(merchant.getId())) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800376, new Object[]{merchant.getCode(), invoicingCustomer.get("merchantIdCode").toString()});
            }
        }
        if (merchant.get("isCreator") != null && ((Boolean)merchant.get("isCreator")).booleanValue()) {
            this.checkMerchantNotReferencedByBusinessPartner(merchant);
            QuerySchema querySchema = QuerySchema.create().addSelect("1").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"shopId").eq(merchant.getId())}));
            querySchema.addPager(0, 1);
            Map productRangeForShop = MetaDaoHelper.queryOne((String)"pc.product.ProductApplyRange", (QuerySchema)querySchema);
            if (!CollectionUtils.isEmpty((Map)productRangeForShop)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800378, new Object[]{merchant.getCode()});
            }
        }
    }

    private void checkMerchantNotReferencedByBusinessPartner(Merchant merchant) throws Exception {
        QuerySchema querySchemaPartnerComparison = QuerySchema.create().addSelect("businessPartner, businessPartner.code as businessPartnerCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId()), QueryCondition.name((String)"businessPartner.dr").eq((Object)PartnerConstant.INTEGER_FALSE)}));
        querySchemaPartnerComparison.addPager(0, 1);
        Map partnerMerchantComparison = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)querySchemaPartnerComparison);
        if (!CollectionUtils.isEmpty((Map)partnerMerchantComparison) && partnerMerchantComparison.get("businessPartner") != null && partnerMerchantComparison.get("businessPartnerCode") != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800377, new Object[]{merchant.getCode(), partnerMerchantComparison.get("businessPartnerCode").toString()});
        }
    }

    private void initTransactionRelationDeleteNotify(BizObject bill) throws Exception {
        boolean isTenantUserType;
        Object carryParams;
        QuerySchema schema;
        Map merchant;
        if (bill.get("createOrg") == null && !CollectionUtils.isEmpty((Map)(merchant = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)(schema = QuerySchema.create().addSelect("createOrg").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bill.getId())}))))))) {
            bill.set("createOrg", (Object)merchant.get("createOrg").toString());
        }
        if (bill.get("belongOrg") == null && bill.get("merchantApplyRangeId") != null) {
            schema = QuerySchema.create().addSelect("orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bill.get("merchantApplyRangeId")), QueryCondition.name((String)"ytenant").eq(AppContext.getYTenantId())}));
            schema.setPartitionable(false);
            Map merchantApplyRange = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema);
            if (!CollectionUtils.isEmpty((Map)merchantApplyRange)) {
                bill.set("belongOrg", (Object)merchantApplyRange.get("orgId").toString());
            }
        }
        Boolean isCreator = (carryParams = bill.get("carryParams")) != null ? (Boolean)((Map)bill.get("carryParams")).get("isCreator") : (Boolean)bill.get("isCreator");
        UserType userType = AppContext.getCurrentUser().getUserType();
        boolean bl = isTenantUserType = userType == UserType.TenantAdmin || userType == UserType.TenantEmployee;
        if (isCreator.booleanValue() && isTenantUserType) {
            QuerySchema schema2 = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(bill.getId()), QueryCondition.name((String)"rangeType").eq((Object)3), QueryCondition.name((String)"ytenant").eq(AppContext.getYTenantId())}));
            schema2.setPartitionable(false);
            List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema2, null);
            if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
                bill.set("isTransactionRelationList", (Object)"true");
            }
        }
    }
}

