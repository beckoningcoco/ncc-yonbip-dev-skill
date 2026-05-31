/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.data.entity.dto.FuncOrg
 *  com.yonyou.iuap.data.service.itf.FuncOrgDataQryService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.merchant.LicenseType
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.service.IUPCMerchantQueryService
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
package com.yonyoucloud.upc.service.openapi;

import com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.data.entity.dto.FuncOrg;
import com.yonyou.iuap.data.service.itf.FuncOrgDataQryService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.merchant.LicenseType;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.service.ApiDataService;
import com.yonyoucloud.upc.service.IUPCMerchantQueryService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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
public class MerchantOldOpenApiServiceImpl
extends ApiDataService {
    Logger logger = LoggerFactory.getLogger(MerchantOldOpenApiServiceImpl.class);
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private IUPCMerchantQueryService upcMerchantQueryService;
    @Autowired
    private FuncOrgDataQryService funcOrgDataQryService;

    public void dealMerchantBillDataForApi(List<Map<String, Object>> billList) throws Exception {
        if (CollectionUtils.isEmpty(billList)) {
            return;
        }
        for (Map<String, Object> billOne : billList) {
            this.checkData(billOne);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void checkData(Map<String, Object> billOne) throws Exception {
        billOne.put("MerchantOneFromApi", "MerchantOneFromApi");
        if (billOne.containsKey("code") && billOne.get("code") != null) {
            QuerySchema querySchema;
            List countryVOList;
            Object querySchema2;
            if (billOne.containsKey("transType_Code") && billOne.get("transType_Code") != null) {
                querySchema2 = QuerySchema.create();
                querySchema2.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"service_code").eq((Object)"aa_merchant"), QueryCondition.name((String)"sysid").eq((Object)ApplicationCodeConstant.getApplicationCodeByFullName((String)"aa.merchant.Merchant")), QueryCondition.name((String)"form_id").eq((Object)"AA.aa_merchant")}));
                List billTypeVOList = MetaDaoHelper.query((String)"bd.bill.BillTypeVO", (QuerySchema)querySchema2, (String)"transtype");
                if (!CollectionUtils.isEmpty((Collection)billTypeVOList)) {
                    querySchema2 = QuerySchema.create();
                    querySchema2.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"billtype_id").eq(((Map)billTypeVOList.get(0)).get("id")), QueryCondition.name((String)"code").eq(billOne.get("transType_Code"))}));
                    List transTypeList = MetaDaoHelper.query((String)"bd.bill.TransType", (QuerySchema)querySchema2, (String)"transtype");
                    if (!CollectionUtils.isEmpty((Collection)transTypeList)) {
                        billOne.put("transType", ((Map)transTypeList.get(0)).get("id").toString());
                    }
                }
            }
            if (billOne.containsKey("enterpriseNature") && billOne.get("enterpriseNature") != null && "1".equals(billOne.get("enterpriseNature").toString())) {
                if (!billOne.containsKey("licenseType") || billOne.get("licenseType") == null || !"3,4,5".contains(billOne.get("licenseType").toString())) {
                    billOne.put("licenseType", LicenseType.IDCard.getValue());
                }
                if (billOne.containsKey("idNo") && billOne.get("idNo") != null && (!billOne.containsKey("creditCode") || billOne.get("creditCode") == null)) {
                    billOne.put("creditCode", billOne.get("idNo"));
                }
            }
            if (billOne.get("country") == null && billOne.get("country_code") != null) {
                querySchema2 = QuerySchema.create();
                querySchema2.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(billOne.get("country_code"))}));
                countryVOList = MetaDaoHelper.query((String)"bd.country.CountryVO", (QuerySchema)querySchema2, (String)"ucfbasedoc");
                if (CollectionUtils.isEmpty((Collection)countryVOList)) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800883, new Object[]{billOne.get("country_code")});
                billOne.put("country", ((Map)countryVOList.get(0)).get("id"));
            } else if (billOne.get("country") == null && billOne.get("country_name") != null) {
                querySchema2 = QuerySchema.create();
                querySchema2.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq(billOne.get("country_name"))}));
                countryVOList = MetaDaoHelper.query((String)"bd.country.CountryVO", (QuerySchema)querySchema2, (String)"ucfbasedoc");
                if (CollectionUtils.isEmpty((Collection)countryVOList)) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800884, new Object[]{billOne.get("country_name")});
                billOne.put("country", ((Map)countryVOList.get(0)).get("id"));
            }
            if (billOne.get("merchantAgentFinancialInfos") != null && ((List)billOne.get("merchantAgentFinancialInfos")).size() > 0) {
                for (Map agentFinancial : (List)billOne.get("merchantAgentFinancialInfos")) {
                    if (agentFinancial.get("country") != null || agentFinancial.get("country_name") == null) continue;
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq(agentFinancial.get("country_name")), QueryCondition.name((String)"code").eq(agentFinancial.get("country_name"))}));
                    List countryVOList2 = MetaDaoHelper.query((String)"bd.country.CountryVO", (QuerySchema)querySchema, (String)"ucfbasedoc");
                    if (CollectionUtils.isEmpty((Collection)countryVOList2)) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800885, new Object[]{agentFinancial.get("country_name")});
                    agentFinancial.put("country", ((Map)countryVOList2.get(0)).get("id"));
                }
            }
            if (billOne.get("merchantAgentInvoiceInfos") != null && ((List)billOne.get("merchantAgentInvoiceInfos")).size() > 0) {
                for (Map agentInvoice : (List)billOne.get("merchantAgentInvoiceInfos")) {
                    if (agentInvoice.get("bdBillingType") != null || agentInvoice.get("bdBillingType_name") == null) continue;
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq(agentInvoice.get("bdBillingType_name")), QueryCondition.name((String)"code").eq(agentInvoice.get("bdBillingType_name"))}));
                    List invoiceTypeVOList = MetaDaoHelper.query((String)"bd.invoice.InvoiceTypeVO", (QuerySchema)querySchema, (String)"ucfbasedoc");
                    if (CollectionUtils.isEmpty((Collection)invoiceTypeVOList)) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800886, new Object[]{agentInvoice.get("bdBillingType_name")});
                    agentInvoice.put("bdBillingType", ((Map)invoiceTypeVOList.get(0)).get("id"));
                }
            }
            if (billOne.get("customerAreas") != null && ((List)billOne.get("customerAreas")).size() > 0) {
                Iterator iterator = ((List)billOne.get("customerAreas")).iterator();
                while (iterator.hasNext()) {
                    Map customerArea = (Map)iterator.next();
                    if (customerArea.get("isDefault") != null) continue;
                    iterator.remove();
                }
            }
            if (!billOne.containsKey("specialKeyFromBusinessPartner")) {
                this.dealDataForMerchant(billOne);
            }
        }
        if (!billOne.containsKey("autoGenerateRangeData") || billOne.get("autoGenerateRangeData") == null || !billOne.get("autoGenerateRangeData").equals(true) || billOne.get("merchantApplyRanges") != null || billOne.get("createOrg") == null) return;
        Boolean singleOrg = this.upcControlRuleService.checkSingleOrg();
        Merchant merchant = new Merchant();
        merchant.setCreateOrg(billOne.get("createOrg").toString());
        this.upcMerchantQueryService.setOrgs4U8c(merchant, singleOrg, Boolean.valueOf(true));
        billOne.put("merchantApplyRanges", merchant.merchantApplyRanges());
    }

    private void dealDataForMerchant(Map<String, Object> billOne) throws Exception {
        QueryConditionGroup queryMerchantNameCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)String.valueOf(billOne.get("code")))});
        QuerySchema queryMerchantNameSchema = QuerySchema.create().addSelect("id,orgId").addCondition((ConditionExpression)queryMerchantNameCondition);
        List returnList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)queryMerchantNameSchema);
        if (returnList != null && !returnList.isEmpty()) {
            List merchantApplyRange;
            billOne.put("id", Long.valueOf(((Map)returnList.get(0)).get("id").toString()));
            if (billOne.get("_status") == null || "Insert".equals(billOne.get("_status").toString())) {
                billOne.put("_status", EntityStatus.Update);
            }
            if (billOne.get("belongOrg") == null) {
                if (billOne.get("merchantApplyRangeId") == null) {
                    billOne.put("belongOrg", ((Map)returnList.get(0)).get("orgId").toString());
                } else {
                    queryMerchantNameCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(billOne.get("merchantApplyRangeId")), QueryCondition.name((String)"isPotential").eq((Object)false)});
                    queryMerchantNameSchema = QuerySchema.create().addSelect("id,orgId,isCreator").addCondition((ConditionExpression)queryMerchantNameCondition);
                    merchantApplyRange = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)queryMerchantNameSchema);
                    if (merchantApplyRange != null && !merchantApplyRange.isEmpty()) {
                        billOne.put("belongOrg", ((Map)merchantApplyRange.get(0)).get("orgId").toString());
                        billOne.put("isCreator", ((Map)merchantApplyRange.get(0)).get("isCreator"));
                    } else {
                        billOne.put("belongOrg", ((Map)returnList.get(0)).get("orgId").toString());
                    }
                }
            }
            queryMerchantNameCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(billOne.get("id")), QueryCondition.name((String)"orgId").eq(billOne.get("belongOrg")), QueryCondition.name((String)"isPotential").eq((Object)false)});
            queryMerchantNameSchema = QuerySchema.create().addSelect("id,isCreator").addCondition((ConditionExpression)queryMerchantNameCondition);
            merchantApplyRange = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)queryMerchantNameSchema);
            if (merchantApplyRange != null && !merchantApplyRange.isEmpty()) {
                billOne.put("merchantApplyRangeId", ((Map)merchantApplyRange.get(0)).get("id"));
                billOne.put("isCreator", ((Map)merchantApplyRange.get(0)).get("isCreator"));
            }
            if (billOne.get("merchantRole") != null) {
                queryMerchantNameCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(billOne.get("id"))});
                queryMerchantNameSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryMerchantNameCondition);
                List merchantRole = MetaDaoHelper.query((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)queryMerchantNameSchema);
                if (merchantRole != null && !merchantRole.isEmpty()) {
                    Map merchantRoleTemp = (Map)billOne.get("merchantRole");
                    merchantRoleTemp.put("id", ((Map)merchantRole.get(0)).get("id"));
                    if (merchantRoleTemp.get("_status") == null || "Insert".equals(merchantRoleTemp.get("_status").toString())) {
                        merchantRoleTemp.put("_status", EntityStatus.Update);
                    }
                    billOne.put("merchantRole", merchantRoleTemp);
                }
            }
            if (billOne.get("merchantsManager") != null) {
                queryMerchantNameCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(billOne.get("id"))});
                queryMerchantNameSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryMerchantNameCondition);
                List merchantsManager = MetaDaoHelper.query((String)"aa.merchant.MerchantsManager", (QuerySchema)queryMerchantNameSchema);
                if (merchantsManager != null && !merchantsManager.isEmpty()) {
                    Iterator merchantsManagerTemp = (Map)billOne.get("merchantsManager");
                    merchantsManagerTemp.put("id", ((Map)merchantsManager.get(0)).get("id"));
                    if (merchantsManagerTemp.get("_status") == null || "Insert".equals(merchantsManagerTemp.get("_status").toString())) {
                        merchantsManagerTemp.put("_status", EntityStatus.Update);
                    }
                    billOne.put("merchantsManager", merchantsManagerTemp);
                }
            }
            if (billOne.get("merchantAppliedDetail") != null && ((List)billOne.get("merchantAppliedDetail")).size() > 0 && (((Map)((List)billOne.get("merchantAppliedDetail")).get(0)).get("_status") == null || "Insert".equals(((Map)((List)billOne.get("merchantAppliedDetail")).get(0)).get("_status").toString()))) {
                ((Map)((List)billOne.get("merchantAppliedDetail")).get(0)).put("_status", EntityStatus.Update);
            }
            if (billOne.get("merchantAddressInfos") != null && ((List)billOne.get("merchantAddressInfos")).size() > 0) {
                queryMerchantNameCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(billOne.get("id"))});
                queryMerchantNameSchema = QuerySchema.create().addSelect("id,addressCode,isDefault").addCondition((ConditionExpression)queryMerchantNameCondition);
                List addressInfodb = MetaDaoHelper.query((String)"aa.merchant.AddressInfo", (QuerySchema)queryMerchantNameSchema);
                if (!CollectionUtils.isEmpty((Collection)addressInfodb)) {
                    for (Map addressInfodbTemp : addressInfodb) {
                        for (Map addressInfo : (List)billOne.get("merchantAddressInfos")) {
                            if (addressInfo.get("addressCode") == null || !addressInfo.get("addressCode").equals(addressInfodbTemp.get("addressCode"))) continue;
                            addressInfo.put("id", addressInfodbTemp.get("id"));
                            if (addressInfo.get("_status") != null && !"Insert".equals(addressInfo.get("_status").toString())) continue;
                            addressInfo.put("_status", EntityStatus.Update);
                        }
                    }
                }
            }
            if (billOne.get("merchantContacterInfos") != null && ((List)billOne.get("merchantContacterInfos")).size() > 0) {
                queryMerchantNameCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(billOne.get("id"))});
                queryMerchantNameSchema = QuerySchema.create().addSelect("id,fullName,mobile,isDefault").addCondition((ConditionExpression)queryMerchantNameCondition);
                List contacterdb = MetaDaoHelper.query((String)"aa.merchant.Contacter", (QuerySchema)queryMerchantNameSchema);
                if (!CollectionUtils.isEmpty((Collection)contacterdb)) {
                    for (Map contacterdbTemp : contacterdb) {
                        for (Map contacter : (List)billOne.get("merchantContacterInfos")) {
                            if (contacter.get("fullName") == null || !contacterdbTemp.get("fullName").equals(((Map)contacter.get("fullName")).get("zh_CN")) && !contacterdbTemp.get("fullName").equals(((Map)contacter.get("fullName")).get("en_US")) && !contacterdbTemp.get("fullName").equals(((Map)contacter.get("fullName")).get("zh_TW"))) continue;
                            contacter.put("id", contacterdbTemp.get("id"));
                            if (contacter.get("_status") != null && !"Insert".equals(contacter.get("_status").toString())) continue;
                            contacter.put("_status", EntityStatus.Update);
                        }
                    }
                }
            }
            if (billOne.get("merchantAgentFinancialInfos") != null && ((List)billOne.get("merchantAgentFinancialInfos")).size() > 0) {
                queryMerchantNameCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(billOne.get("id"))});
                queryMerchantNameSchema = QuerySchema.create().addSelect("id,bankAccount").addCondition((ConditionExpression)queryMerchantNameCondition);
                List agentFinancialdb = MetaDaoHelper.query((String)"aa.merchant.AgentFinancial", (QuerySchema)queryMerchantNameSchema);
                if (!CollectionUtils.isEmpty((Collection)agentFinancialdb)) {
                    for (Map agentFinancialdbTemp : agentFinancialdb) {
                        for (Map agentFinancial : (List)billOne.get("merchantAgentFinancialInfos")) {
                            if (agentFinancial.get("bankAccount") == null || !agentFinancial.get("bankAccount").equals(agentFinancialdbTemp.get("bankAccount"))) continue;
                            agentFinancial.put("id", agentFinancialdbTemp.get("id"));
                            if (agentFinancial.get("_status") != null && !"Insert".equals(agentFinancial.get("_status").toString())) continue;
                            agentFinancial.put("_status", EntityStatus.Update);
                        }
                    }
                }
            }
            if (billOne.get("merchantAgentInvoiceInfos") != null && ((List)billOne.get("merchantAgentInvoiceInfos")).size() > 0) {
                queryMerchantNameCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(billOne.get("id"))});
                queryMerchantNameSchema = QuerySchema.create().addSelect("id,billingType,title").addCondition((ConditionExpression)queryMerchantNameCondition);
                List agentInvoicedb = MetaDaoHelper.query((String)"aa.merchant.AgentInvoice", (QuerySchema)queryMerchantNameSchema);
                if (!CollectionUtils.isEmpty((Collection)agentInvoicedb)) {
                    for (Object agentInvoicedbTemp : agentInvoicedb) {
                        for (Object agentInvoice : (List)billOne.get("merchantAgentInvoiceInfos")) {
                            if (agentInvoice.get("billingType") == null || agentInvoicedbTemp.get("billingType") == null || !agentInvoicedbTemp.get("billingType").toString().equals(agentInvoice.get("billingType").toString()) || !agentInvoicedbTemp.get("title").equals(agentInvoice.get("title"))) continue;
                            agentInvoice.put("id", agentInvoicedbTemp.get("id"));
                            if (agentInvoice.get("_status") != null && !"Insert".equals(agentInvoice.get("_status").toString())) continue;
                            agentInvoice.put("_status", EntityStatus.Update);
                        }
                    }
                }
            }
            if (billOne.get("merchantApplyRanges") != null && ((List)billOne.get("merchantApplyRanges")).size() > 0) {
                queryMerchantNameCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(billOne.get("id")), QueryCondition.name((String)"isPotential").eq((Object)false)});
                queryMerchantNameSchema = QuerySchema.create().addSelect("id,orgId").addCondition((ConditionExpression)queryMerchantNameCondition);
                List merchantApplyRangedb = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)queryMerchantNameSchema);
                if (!CollectionUtils.isEmpty((Collection)merchantApplyRangedb)) {
                    int sameCount = 0;
                    for (Map merchantApplyRangeTemp : merchantApplyRangedb) {
                        for (Map merchantApply : (List)billOne.get("merchantApplyRanges")) {
                            if (!merchantApplyRangeTemp.get("orgId").equals(merchantApply.get("orgId")) || "Delete".equals(merchantApply.get("_status").toString())) continue;
                            ++sameCount;
                        }
                    }
                    if (sameCount > 0) {
                        billOne.put("merchantApplyRanges", null);
                    }
                }
            }
        } else if (billOne.containsKey("createOrg") && billOne.get("createOrg") != null) {
            List funcOrgs;
            ArrayList<String> orgIdList = new ArrayList<String>();
            orgIdList.add(billOne.get("createOrg").toString());
            boolean haveApplyRange = false;
            if (billOne.get("merchantApplyRanges") != null && ((List)billOne.get("merchantApplyRanges")).size() > 0) {
                haveApplyRange = true;
                ArrayList rangeOrgId = new ArrayList();
                ((List)billOne.get("merchantApplyRanges")).forEach(a -> {
                    if (a.get("orgId") != null) {
                        rangeOrgId.add(a.get("orgId").toString());
                    }
                });
                orgIdList.addAll(rangeOrgId);
            }
            if (CollectionUtils.isEmpty((Collection)(funcOrgs = this.funcOrgDataQryService.listByIds(orgIdList, new ArrayList<Integer>(Collections.singletonList(1)), AppContext.getYhtTenantId().toString(), "diwork", "adminorg")))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800887);
            }
            List orgids = funcOrgs.stream().map(FuncOrg::getOrgid).collect(Collectors.toList());
            if (!orgids.contains(billOne.get("createOrg").toString())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800888, new Object[]{billOne.get("createOrg")});
            }
            if (haveApplyRange) {
                List filterList = ((List)billOne.get("merchantApplyRanges")).stream().filter(p -> p.get("orgId").toString().equals(billOne.get("createOrg").toString())).collect(Collectors.toList());
                if (CollectionUtils.isEmpty(filterList)) {
                    MerchantApplyRange tempData = new MerchantApplyRange();
                    tempData.setRangeType(Integer.valueOf(1));
                    tempData.setIsCreator(Boolean.valueOf(true));
                    tempData.setIsApplied(Boolean.valueOf(true));
                    tempData.setOrgId(billOne.get("createOrg").toString());
                    tempData.setEntityStatus(EntityStatus.Insert);
                    ((List)billOne.get("merchantApplyRanges")).add(tempData);
                }
                List applyRanges = ((List)billOne.get("merchantApplyRanges")).stream().filter(p -> orgids.contains(p.get("orgId").toString())).collect(Collectors.toList());
                for (Map range : applyRanges) {
                    if (range.get("orgId") != null && range.get("orgId").toString().equals(billOne.get("createOrg").toString())) {
                        range.put("isCreator", true);
                        range.put("isApplied", true);
                        continue;
                    }
                    range.put("isCreator", false);
                    range.put("isApplied", false);
                }
                billOne.put("merchantApplyRanges", applyRanges);
            }
        }
    }
}

