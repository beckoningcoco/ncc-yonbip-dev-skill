/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.MerchantErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.busidoc.warehouse.Warehouse
 *  com.yonyou.iuap.apdoc.coredoc.po.busidoc.warehouse.WarehouseStock
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.ml.vo.LanguageVO
 *  com.yonyou.iuap.org.service.itf.core.IFuncTypeQueryService
 *  com.yonyou.iuap.support.i18n.locale.core.zone.YonBipTimeZones
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.ucf.common.ml.MultiLangContext
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.option.model.OptionData
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyou.ucf.transtype.model.BdTransType
 *  com.yonyou.ypd.bill.infrastructure.service.api.IBillRepository
 *  com.yonyoucloud.upc.aa.merchant.AddressInfo
 *  com.yonyoucloud.upc.aa.merchant.AgentFinancial
 *  com.yonyoucloud.upc.aa.merchant.AgentInvoice
 *  com.yonyoucloud.upc.aa.merchant.Contacter
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.EnterpriseNature
 *  com.yonyoucloud.upc.aa.merchant.InvoiceType
 *  com.yonyoucloud.upc.aa.merchant.InvoicingCustomers
 *  com.yonyoucloud.upc.aa.merchant.IsFinancialSynergy
 *  com.yonyoucloud.upc.aa.merchant.IsTradeCustomers
 *  com.yonyoucloud.upc.aa.merchant.LicenseType
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.MerchantQualificationDocument
 *  com.yonyoucloud.upc.aa.merchant.MerchantRoleInfo
 *  com.yonyoucloud.upc.aa.merchant.MerchantsManager
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.upc.aa.merchant.StopStatusChar
 *  com.yonyoucloud.upc.aa.merchant.TaxPayingCate
 *  com.yonyoucloud.upc.aa.merchant.VerifyingState
 *  com.yonyoucloud.upc.common.enums.DomainOpenEnum
 *  com.yonyoucloud.upc.constants.UPCConstant4Regex
 *  com.yonyoucloud.upc.service.IUPCMerchantSyncService
 *  com.yonyoucloud.upc.utils.IdcardUtils
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  com.yonyoucloud.upc.utils.SQLInjectionCheckUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.base.PartitionContext
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryContext
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.MerchantErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.busidoc.warehouse.Warehouse;
import com.yonyou.iuap.apdoc.coredoc.po.busidoc.warehouse.WarehouseStock;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.ml.vo.LanguageVO;
import com.yonyou.iuap.org.service.itf.core.IFuncTypeQueryService;
import com.yonyou.iuap.support.i18n.locale.core.zone.YonBipTimeZones;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.ucf.common.ml.MultiLangContext;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.option.model.OptionData;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyou.ucf.transtype.model.BdTransType;
import com.yonyou.ypd.bill.infrastructure.service.api.IBillRepository;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.merchant.AddressInfo;
import com.yonyoucloud.upc.aa.merchant.AgentFinancial;
import com.yonyoucloud.upc.aa.merchant.AgentInvoice;
import com.yonyoucloud.upc.aa.merchant.Contacter;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.EnterpriseNature;
import com.yonyoucloud.upc.aa.merchant.InvoiceType;
import com.yonyoucloud.upc.aa.merchant.InvoicingCustomers;
import com.yonyoucloud.upc.aa.merchant.IsFinancialSynergy;
import com.yonyoucloud.upc.aa.merchant.IsTradeCustomers;
import com.yonyoucloud.upc.aa.merchant.LicenseType;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.MerchantQualificationDocument;
import com.yonyoucloud.upc.aa.merchant.MerchantRoleInfo;
import com.yonyoucloud.upc.aa.merchant.MerchantsManager;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.aa.merchant.StopStatusChar;
import com.yonyoucloud.upc.aa.merchant.TaxPayingCate;
import com.yonyoucloud.upc.aa.merchant.VerifyingState;
import com.yonyoucloud.upc.common.enums.DomainOpenEnum;
import com.yonyoucloud.upc.constants.UPCConstant4Regex;
import com.yonyoucloud.upc.service.IUPCMerchantSyncService;
import com.yonyoucloud.upc.service.MerchantCheckService;
import com.yonyoucloud.upc.service.MerchantService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.IdcardUtils;
import com.yonyoucloud.upc.utils.MerchantUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
import com.yonyoucloud.upc.utils.SQLInjectionCheckUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.base.PartitionContext;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryContext;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

@Component(value="merchantBeforeSaveRule")
public class MerchantBeforeSaveRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(MerchantBeforeSaveRule.class);
    @Autowired
    private IUPCMerchantSyncService iupcMerchantSyncService;
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private MerchantService merchantService;
    @Autowired
    private IFuncTypeQueryService iFuncTypeQueryService;
    private static final String RES_CODE = "diwork";
    @Autowired
    private MerchantCheckService merchantCheckService;
    @Autowired
    private IBillRepository billRepository;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        LoginUser currentUser = AppContext.getCurrentUser();
        if (null == currentUser) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        List bills = this.getBills(billContext, paramMap);
        for (BizObject bill : bills) {
            List<Map<String, Object>> exchangeRateTypeVOList;
            QuerySchema querySchema;
            boolean isUpdateImport;
            Merchant merchant = (Merchant)bill;
            boolean fromCRM = MerchantUtils.isExists((Map)merchant, (String)"srcBill") && "CRM".equals(merchant.get("srcBill"));
            Map mapCondition = billDataDto.getMapCondition();
            Map externalData = (Map)billDataDto.getExternalData();
            log.debug("isChannelCustomer1:{}", (Object)mapCondition);
            if (mapCondition != null && !mapCondition.isEmpty() && mapCondition.get("isChannelCustomer") != null && Boolean.valueOf((String)mapCondition.get("isChannelCustomer")).booleanValue()) {
                QuerySchema querySchema2 = QuerySchema.create();
                querySchema2.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchant.getCreateOrg()), QueryCondition.name((String)"dr").eq((Object)0), QueryCondition.name((String)"externalorg").eq((Object)1)}));
                List org = MetaDaoHelper.query((String)"org.func.BaseOrg", (QuerySchema)querySchema2, (String)"ucf-org-center");
                log.debug("isChannelCustomer2:{}", (Object)org);
                if (CollectionUtils.isEmpty((Collection)org)) {
                    String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080522", (String)"\u5916\u90e8\u7ec4\u7ec7:%s\u4e0d\u5b58\u5728\u4e0d\u5141\u8bb8\u521b\u5efa\u5ba2\u6237"), (String)merchant.get("createOrg_name"));
                    throw new CoreDocBusinessException(msg);
                }
            }
            if (isUpdateImport = merchant.containsKey((Object)"importSpecialKey_merchant")) {
                boolean supportUpsert = billDataDto.getImportBillDataDto().isSupportUpsert();
                this.dealMerchantDataForUpdateImport(merchant, supportUpsert);
            }
            if (this.isCheckCreateOrg(mapCondition, merchant)) {
                this.merchantCheckService.checkCreateOrgForMerchant(merchant, currentUser, singleOrg);
            }
            this.importCheck(merchant, billDataDto);
            this.theCheck(merchant, singleOrg, currentUser);
            this.setTransType(merchant, currentUser);
            if (bill.get("srcBill") != null && "CRM".equals(bill.get("srcBill")) || !merchant.containsKey((Object)"specialKeyFromBusinessPartner") && !Boolean.FALSE.equals(merchant.get("isCreator"))) {
                this.merchantCheckService.setBusinessPartnerId(merchant);
            }
            this.setPath(merchant);
            this.syncNCCToMerchant(merchant);
            if (!MerchantUtils.isExists((Map)merchant, (String)"data_from") && merchant.get("_fromApi") != null && ((Boolean)merchant.get("_fromApi")).booleanValue() || !MerchantUtils.isExists((Map)merchant, (String)"data_from") && merchant.get("importSpecialKey_merchant") != null) {
                if (EntityStatus.Update.equals((Object)merchant.getEntityStatus()) && merchant.merchantRole() != null && StringUtils.isNotBlank((CharSequence)merchant.merchantRole().getBusinessRole())) {
                    QuerySchema querySchemaBusiRole = QuerySchema.create();
                    querySchemaBusiRole.addSelect("businessRole,id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId())}));
                    Map stringObjectMap = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)querySchemaBusiRole);
                    if (stringObjectMap != null && !stringObjectMap.isEmpty() && stringObjectMap.get("businessRole") != null && StringUtils.isNotBlank((CharSequence)stringObjectMap.get("businessRole").toString()) && !merchant.merchantRole().getBusinessRole().equals(stringObjectMap.get("businessRole").toString())) {
                        merchant.merchantRole().setId(stringObjectMap.get("id"));
                        merchant.merchantRole().setEntityStatus(EntityStatus.Update);
                    }
                }
                if (merchant.getEnterpriseNature() != null && merchant.getEnterpriseNature().getValue() == 1 && !MerchantUtils.isExists((Map)merchant, (String)"personName")) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800406);
                }
                querySchema = QuerySchema.create();
                querySchema.addSelect("id,isCreator");
                if (mapCondition != null && !mapCondition.isEmpty() && mapCondition.get("isChannelCustomer") != null && Boolean.valueOf((String)mapCondition.get("isChannelCustomer")).booleanValue()) {
                    PartitionContext partitionContextData = AppContext.getPartitionContextData((String)"aa.merchant.MerchantApplyRange");
                    AppContext.handlePartitionCondition((QuerySchema)querySchema, (PartitionContext)partitionContextData);
                    querySchema.queryContext(new QueryContext(partitionContextData));
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isCreator").eq((Object)1), QueryCondition.name((String)"shopId").is_not_null(), QueryCondition.name((String)"isPotential").eq((Object)false)}));
                } else if (externalData != null && !externalData.isEmpty() && externalData.get("importType") != null && externalData.get("importMode") != null && externalData.get("importType").equals(2) && externalData.get("importMode").equals(2) || merchant.containsKey((Object)"importSpecialKey_merchant")) {
                    if (merchant.containsKey((Object)"belongOrg_code")) {
                        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"orgId.code").eq(merchant.get("belongOrg_code")), QueryCondition.name((String)"isPotential").eq((Object)false)}));
                    } else {
                        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isCreator").eq((Object)1), QueryCondition.name((String)"isPotential").eq((Object)false)}));
                    }
                } else {
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isCreator").eq((Object)1), QueryCondition.name((String)"isPotential").eq((Object)false)}));
                }
                Map map = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema);
                if (map != null && !map.isEmpty()) {
                    if (merchant.getEntityStatus() != EntityStatus.Unchanged) {
                        merchant.setEntityStatus(EntityStatus.Update);
                    }
                    if (merchant.get("merchantApplyRangeId") != null && !merchant.get("merchantApplyRangeId").toString().equals(map.get("id").toString())) {
                        merchant.put("isCreator", (Object)false);
                    } else {
                        merchant.put("isCreator", map.get("isCreator"));
                        merchant.put("merchantApplyRangeId", map.get("id"));
                    }
                }
                if (!(EntityStatus.Unchanged != merchant.getEntityStatus() || merchant.containsKey((Object)"id") && null != merchant.getId())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800407);
                }
            }
            if (!fromCRM && (merchant.get("_fromApi") != null && ((Boolean)merchant.get("_fromApi")).booleanValue() || merchant.get("importSpecialKey_merchant") != null)) {
                List agentInvoicesList;
                List contacterList;
                List addressInfoList;
                List invoicingCustomersIsDefaultList;
                List principalIsDefaultList;
                List invoicingCustomersList;
                List principalList;
                if (billDataDto.getImportMode() != null && billDataDto.getImportMode().equals(2) && merchant.get("data_from") == null && merchant.get("merchantApplyRangeId") != null) {
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.get("merchantApplyRangeId"))});
                    QuerySchema selectByMerchantField = QuerySchema.create().addSelect("id,orgId.code as orgCode,merchantId.name as name,merchantId.code as code, merchantId.createOrg as createOrg").addCondition((ConditionExpression)queryConditionGroup);
                    Map checkMerchant = fromCRM ? MetaDaoHelper.queryOne((String)"aa.merchant.MerchantApplyRangeExt", (QuerySchema)selectByMerchantField) : MetaDaoHelper.queryOne((String)"aa.merchant.MerchantApplyRange", (QuerySchema)selectByMerchantField);
                    if (checkMerchant != null && !checkMerchant.isEmpty()) {
                        if (checkMerchant.get("orgCode") != null && merchant.get("belongOrg_code") != null && !checkMerchant.get("orgCode").equals(merchant.get("belongOrg_code"))) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800408);
                        }
                        if (checkMerchant.get("createOrg") != null && merchant.get("createOrg") != null && !checkMerchant.get("createOrg").equals(merchant.get("createOrg"))) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800409);
                        }
                        if (merchant.get("name") == null) {
                            merchant.setName((String)checkMerchant.get("name"));
                        }
                    } else {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800411);
                    }
                }
                this.checkDetailAddress(merchant.merchantAddressInfos());
                querySchema = null;
                List customerAreaList = merchant.customerAreas();
                if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
                    List calst = customerAreaList.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<CustomerArea>(Comparator.comparing(CustomerArea::getSaleAreaId, Comparator.nullsFirst(Comparator.naturalOrder())))), ArrayList::new));
                    if (customerAreaList.size() != calst.size()) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800412);
                    }
                }
                if (!CollectionUtils.isEmpty((Collection)(principalList = merchant.principals()))) {
                    HashMap<String, String> map0 = new HashMap<String, String>();
                    String code = null;
                    for (Principal principal : principalList) {
                        if (principal.getProfessSalesman() != null && principal.getSpecialManagementDep() != null) {
                            code = "professSalesman" + principal.getProfessSalesman().trim() + ",specialManagementDep" + principal.getSpecialManagementDep().trim();
                        } else if (principal.getProfessSalesman() == null && principal.getSpecialManagementDep() != null) {
                            code = "specialManagementDep" + principal.getSpecialManagementDep().trim();
                        } else if (principal.getProfessSalesman() != null && principal.getSpecialManagementDep() == null) {
                            code = "professSalesman" + principal.getProfessSalesman().trim();
                        }
                        if (StringUtils.isBlank(code)) continue;
                        if (map0.containsKey(code)) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800413);
                        }
                        map0.put(code, "principal");
                    }
                }
                if (!CollectionUtils.isEmpty((Collection)(invoicingCustomersList = merchant.invoicingCustomerss()))) {
                    List inlst = invoicingCustomersList.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<InvoicingCustomers>(Comparator.comparing(o -> o.getInvoicingCustomersId()))), ArrayList::new));
                    if (invoicingCustomersList.size() != inlst.size()) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800414);
                    }
                }
                HashMap<String, String> checkUniqueDefault = new HashMap<String, String>();
                HashSet<String> checkIdExist = new HashSet<String>();
                List customerAreaIsDefaultList = merchant.customerAreas();
                if (!CollectionUtils.isEmpty((Collection)customerAreaIsDefaultList)) {
                    HashMap<Long, String> distinctMap = new HashMap<Long, String>();
                    int isDefaultNum = 0;
                    int deleteNum = 0;
                    for (CustomerArea customerArea : customerAreaIsDefaultList) {
                        if (null == customerArea.getIsDefault() && !isUpdateImport) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800416, new Object[]{customerArea.get("saleAreaId_code").toString()});
                        }
                        if (null == customerArea.getIsDefault() && isUpdateImport) {
                            customerArea.setIsDefault(Boolean.valueOf(false));
                        } else if (null != customerArea.getIsDefault() && customerArea.getIsDefault().booleanValue() && customerArea.getEntityStatus() != EntityStatus.Delete) {
                            ++isDefaultNum;
                        }
                        if (customerArea.getEntityStatus() == EntityStatus.Delete) {
                            ++deleteNum;
                        } else if (customerArea.getEntityStatus() == EntityStatus.Insert) {
                            distinctMap.put(customerArea.getSaleAreaId(), "Insert");
                        }
                        if (!isUpdateImport || customerArea.get("importSpecialSaleAreaId") == null) continue;
                        customerArea.setId((Object)Long.valueOf((String)customerArea.get("importSpecialSaleAreaId")));
                        customerArea.setEntityStatus(EntityStatus.Update);
                    }
                    this.merchantCheckService.checkAreaApplyRange(merchant);
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("*");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"merchantApplyRangeId").eq(merchant.get("merchantApplyRangeId"))}));
                    List originalCustomerAreaList = MetaDaoHelper.queryObject((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema, null);
                    if (!CollectionUtils.isEmpty((Collection)originalCustomerAreaList)) {
                        Iterator originalCustomerAreaIterator = originalCustomerAreaList.iterator();
                        if (isUpdateImport) {
                            while (originalCustomerAreaIterator.hasNext()) {
                                Iterator next = (Map)originalCustomerAreaIterator.next();
                                String id = next.get("id").toString();
                                checkIdExist.add(id);
                                for (CustomerArea invoicingCustomers : customerAreaIsDefaultList) {
                                    if (!id.equals(invoicingCustomers.get("importSpecialSaleAreaId"))) continue;
                                    originalCustomerAreaIterator.remove();
                                }
                            }
                            for (Map icv : originalCustomerAreaList) {
                                if (icv.get("isDefault").equals(true)) {
                                    ++isDefaultNum;
                                }
                                checkUniqueDefault.put(icv.get("saleAreaId").toString(), icv.get("id").toString());
                            }
                            for (CustomerArea customerArea : customerAreaIsDefaultList) {
                                if (customerArea.get("importSpecialSaleAreaId") != null && !checkIdExist.contains(customerArea.get("importSpecialSaleAreaId").toString())) {
                                    throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804F9", (String)"\u8be5\u5ba2\u6237[%s]\u7684\u9500\u552e\u533a\u57df\u5b50\u8868ID[%s]\u4e0d\u5b58\u5728\uff01"), merchant.getCode(), customerArea.get("importSpecialSaleAreaId")));
                                }
                                if (!checkUniqueDefault.containsKey(customerArea.get("saleAreaId").toString())) continue;
                                throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804FB", (String)"\u8be5\u5ba2\u6237[%s]\u7684\u9500\u552e\u533a\u57df\u5df2\u7ecf\u5b58\u5728\u7f16\u7801\u4e3a: %s\u7684\u9500\u552e\u533a\u57df\u4e86\uff01"), merchant.getCode(), customerArea.get("saleAreaId_code")));
                            }
                            checkUniqueDefault.clear();
                        } else {
                            HashSet<String> errorSaleAreaIdCodeList = new HashSet<String>();
                            block7: while (originalCustomerAreaIterator.hasNext()) {
                                Object customerArea2;
                                boolean remove = false;
                                CustomerArea originalCustomerArea = (CustomerArea)originalCustomerAreaIterator.next();
                                for (Object customerArea2 : customerAreaIsDefaultList) {
                                    if (!originalCustomerArea.getId().equals(customerArea2.getId())) continue;
                                    originalCustomerAreaIterator.remove();
                                    remove = true;
                                }
                                if (remove || distinctMap.isEmpty() || !"Insert".equals(distinctMap.get(originalCustomerArea.getSaleAreaId())) || errorSaleAreaIdCodeList.size() > 200) continue;
                                String saleAreaIdCode = "";
                                customerArea2 = customerAreaIsDefaultList.iterator();
                                while (customerArea2.hasNext()) {
                                    CustomerArea customerArea3 = (CustomerArea)customerArea2.next();
                                    if (!customerArea3.getSaleAreaId().equals(originalCustomerArea.getSaleAreaId())) continue;
                                    saleAreaIdCode = (String)customerArea3.get("saleAreaId_code");
                                    errorSaleAreaIdCodeList.add(saleAreaIdCode);
                                    continue block7;
                                }
                            }
                            if (!CollectionUtils.isEmpty(errorSaleAreaIdCodeList)) {
                                throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804FB", (String)"\u8be5\u5ba2\u6237[%s]\u7684\u9500\u552e\u533a\u57df\u5df2\u7ecf\u5b58\u5728\u7f16\u7801\u4e3a: %s\u7684\u9500\u552e\u533a\u57df\u4e86\uff01"), merchant.getCode(), errorSaleAreaIdCodeList));
                            }
                            if (!CollectionUtils.isEmpty((Collection)originalCustomerAreaList)) {
                                for (CustomerArea customerArea : originalCustomerAreaList) {
                                    if (!customerArea.getIsDefault().booleanValue()) continue;
                                    ++isDefaultNum;
                                }
                            }
                        }
                    } else {
                        for (CustomerArea customerArea : customerAreaIsDefaultList) {
                            if (customerArea.get("importSpecialSaleAreaId") == null) continue;
                            throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804F9", (String)"\u8be5\u5ba2\u6237[%s]\u7684\u9500\u552e\u533a\u57df\u5b50\u8868ID[%s]\u4e0d\u5b58\u5728\uff01"), merchant.getCode(), customerArea.get("importSpecialSaleAreaId")));
                        }
                    }
                    if (isDefaultNum != 1 && deleteNum != customerAreaIsDefaultList.size()) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800417);
                    }
                }
                if (!CollectionUtils.isEmpty((Collection)(principalIsDefaultList = merchant.principals()))) {
                    HashMap<String, String> distinctMap = new HashMap<String, String>();
                    int isDefaultNum = 0;
                    int deleteNum = 0;
                    for (Principal pc : principalIsDefaultList) {
                        if (null == pc.getIsDefault() && !isUpdateImport) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800418, new Object[]{(String)pc.get("professSalesman_Name")});
                        }
                        if (null == pc.getIsDefault() && isUpdateImport) {
                            pc.setIsDefault(Boolean.valueOf(false));
                        } else if (null != pc.getIsDefault() && pc.getIsDefault().booleanValue() && pc.getEntityStatus() != EntityStatus.Delete) {
                            ++isDefaultNum;
                        }
                        if (pc.getEntityStatus() == EntityStatus.Delete) {
                            ++deleteNum;
                        } else if (pc.getEntityStatus() == EntityStatus.Insert) {
                            distinctMap.put(pc.getProfessSalesman(), "Insert");
                        }
                        if (!isUpdateImport || pc.get("importSpecialPrincipalId") == null) continue;
                        pc.setId((Object)Long.valueOf((String)pc.get("importSpecialPrincipalId")));
                        pc.setEntityStatus(EntityStatus.Update);
                    }
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("*");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"merchantApplyRangeId").eq(merchant.get("merchantApplyRangeId"))}));
                    List originalPrincipalList = MetaDaoHelper.queryObject((String)"aa.merchant.Principal", (QuerySchema)querySchema, null);
                    if (!CollectionUtils.isEmpty((Collection)originalPrincipalList)) {
                        Iterator originalPrincipalIterator = originalPrincipalList.iterator();
                        if (isUpdateImport) {
                            while (originalPrincipalIterator.hasNext()) {
                                Map next = (Map)originalPrincipalIterator.next();
                                String id = next.get("id").toString();
                                checkIdExist.add(id);
                                for (Principal principal : principalIsDefaultList) {
                                    if (!id.equals(principal.get("importSpecialPrincipalId"))) continue;
                                    originalPrincipalIterator.remove();
                                }
                            }
                            for (Principal icv : originalPrincipalList) {
                                checkUniqueDefault.put(icv.get("professSalesman").toString(), icv.get("id").toString());
                            }
                            for (Principal principal : principalIsDefaultList) {
                                if (principal.get("importSpecialPrincipalId") != null && !checkIdExist.contains(principal.get("importSpecialPrincipalId").toString())) {
                                    throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804E1", (String)"\u8be5\u5ba2\u6237[%s]\u7684\u8d1f\u8d23\u4eba\u5b50\u8868ID[%s]\u4e0d\u5b58\u5728\uff01"), merchant.getCode(), principal.get("importSpecialPrincipalId")));
                                }
                                if (principal.get("professSalesman") == null || !checkUniqueDefault.containsKey(principal.get("professSalesman").toString())) continue;
                                throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804E5", (String)"\u8be5\u5ba2\u6237[%s]\u7684\u8d1f\u8d23\u4eba\u5df2\u7ecf\u5b58\u5728\u4e13\u7ba1\u4e1a\u52a1\u5458\u7f16\u7801\u4e3a: %s\u7684\u4e13\u7ba1\u4e1a\u52a1\u5458\u4e86\uff01"), merchant.getCode(), principal.get("professSalesman_code")));
                            }
                            checkUniqueDefault.clear();
                        } else {
                            HashSet errorProfessSalesmanCodeList = new HashSet();
                            block17: while (originalPrincipalIterator.hasNext()) {
                                Principal principal;
                                boolean remove = false;
                                Principal originalPrincipal = (Principal)originalPrincipalIterator.next();
                                principal = principalIsDefaultList.iterator();
                                while (principal.hasNext()) {
                                    Principal principal2 = (Principal)principal.next();
                                    if (principal2.getId() == null || !principal2.getId().equals(originalPrincipal.getId())) continue;
                                    originalPrincipalIterator.remove();
                                    remove = true;
                                }
                                if (remove || distinctMap.isEmpty() || !"Insert".equals(distinctMap.get(originalPrincipal.getProfessSalesman())) || errorProfessSalesmanCodeList.size() > 200) continue;
                                Object professSalesmanCode = "";
                                for (Principal principal3 : principalIsDefaultList) {
                                    if (principal3.getProfessSalesman() == null || !principal3.getProfessSalesman().equals(originalPrincipal.getProfessSalesman())) continue;
                                    professSalesmanCode = (String)principal3.get("professSalesman_code");
                                    if (StringUtils.isEmpty((CharSequence)professSalesmanCode)) {
                                        professSalesmanCode = (String)principal3.get("professSalesman_Code");
                                    }
                                    errorProfessSalesmanCodeList.add(professSalesmanCode);
                                    continue block17;
                                }
                            }
                            if (!CollectionUtils.isEmpty(errorProfessSalesmanCodeList)) {
                                throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804E5", (String)"\u8be5\u5ba2\u6237[%s]\u7684\u8d1f\u8d23\u4eba\u5df2\u7ecf\u5b58\u5728\u4e13\u7ba1\u4e1a\u52a1\u5458\u7f16\u7801\u4e3a: %s\u7684\u4e13\u7ba1\u4e1a\u52a1\u5458\u4e86\uff01"), merchant.getCode(), errorProfessSalesmanCodeList));
                            }
                        }
                        if (!CollectionUtils.isEmpty((Collection)originalPrincipalList)) {
                            for (Principal originalPrincipal : originalPrincipalList) {
                                if (!originalPrincipal.getIsDefault().booleanValue()) continue;
                                if (isDefaultNum == 1) {
                                    Principal tempData = new Principal();
                                    tempData.setEntityStatus(EntityStatus.Update);
                                    tempData.setIsDefault(Boolean.valueOf(false));
                                    tempData.setMerchantApplyRangeId(originalPrincipal.getMerchantApplyRangeId());
                                    tempData.setMerchantId(originalPrincipal.getMerchantId());
                                    tempData.setProfessSalesman(originalPrincipal.getProfessSalesman());
                                    tempData.setSpecialManagementDep(originalPrincipal.getSpecialManagementDep());
                                    tempData.setId(originalPrincipal.getId());
                                    principalIsDefaultList.add(tempData);
                                    continue;
                                }
                                ++isDefaultNum;
                            }
                        }
                    } else {
                        for (Principal principal : principalIsDefaultList) {
                            if (principal.get("importSpecialPrincipalId") == null) continue;
                            throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804E1", (String)"\u8be5\u5ba2\u6237[%s]\u7684\u8d1f\u8d23\u4eba\u5b50\u8868ID[%s]\u4e0d\u5b58\u5728\uff01"), merchant.getCode(), principal.get("importSpecialPrincipalId")));
                        }
                    }
                    if (isDefaultNum != 1 && deleteNum != principalIsDefaultList.size()) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800419);
                    }
                    merchant.setPrincipals(principalIsDefaultList);
                }
                if (!CollectionUtils.isEmpty((Collection)(invoicingCustomersIsDefaultList = merchant.invoicingCustomerss()))) {
                    HashMap<Long, String> distinctMap = new HashMap<Long, String>();
                    int isDefaultNum = 0;
                    int deleteNum = 0;
                    for (InvoicingCustomers ic : invoicingCustomersIsDefaultList) {
                        if (!merchant.getCode().equals(ic.get("invoicingCustomersId_code"))) {
                            querySchema = QuerySchema.create();
                            querySchema.addSelect("*");
                            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)ic.getInvoicingCustomersId())}));
                            List cas = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema);
                            if (cas == null || cas.size() == 0) {
                                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800420, new Object[]{(String)ic.get("invoicingCustomersId_code")});
                            }
                            if (((Map)cas.get(0)).get("stopstatus").equals(true)) {
                                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800421, new Object[]{(String)ic.get("invoicingCustomersId_code")});
                            }
                        } else {
                            ic.setInvoicingCustomersId((Long)merchant.getId());
                        }
                        if (null == ic.getIsDefault() && !isUpdateImport) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800422, new Object[]{(String)ic.get("invoicingCustomersId_code")});
                        }
                        if (null == ic.getIsDefault() && isUpdateImport) {
                            ic.setIsDefault(Boolean.valueOf(false));
                        } else if (null != ic.getIsDefault() && ic.getIsDefault().booleanValue() && ic.getEntityStatus() != EntityStatus.Delete) {
                            ++isDefaultNum;
                        }
                        if (ic.getEntityStatus() == EntityStatus.Delete) {
                            ++deleteNum;
                        } else if (ic.getEntityStatus() == EntityStatus.Insert) {
                            distinctMap.put(ic.getInvoicingCustomersId(), "Insert");
                        }
                        if (!isUpdateImport || ic.get("importSpecialCustomerId") == null) continue;
                        ic.setId((Object)Long.valueOf((String)ic.get("importSpecialCustomerId")));
                        ic.setEntityStatus(EntityStatus.Update);
                    }
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("*");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"merchantApplyRangeId").eq(merchant.get("merchantApplyRangeId"))}));
                    List originalInvoicingCustomersList = MetaDaoHelper.queryObject((String)"aa.merchant.InvoicingCustomers", (QuerySchema)querySchema, null);
                    if (!CollectionUtils.isEmpty((Collection)originalInvoicingCustomersList)) {
                        Object errorInvoicingCustomersIdCodeList;
                        Iterator originalInvoicingCustomerIterator = originalInvoicingCustomersList.iterator();
                        if (isUpdateImport) {
                            while (originalInvoicingCustomerIterator.hasNext()) {
                                Map next = (Map)originalInvoicingCustomerIterator.next();
                                String id = next.get("id").toString();
                                checkIdExist.add(id);
                                for (InvoicingCustomers invoicingCustomers : invoicingCustomersIsDefaultList) {
                                    if (!id.equals(invoicingCustomers.get("importSpecialCustomerId"))) continue;
                                    originalInvoicingCustomerIterator.remove();
                                }
                            }
                            Iterator next = originalInvoicingCustomersList.iterator();
                            while (next.hasNext()) {
                                Map icv = (Map)next.next();
                                if (icv.get("isDefault").equals(true)) {
                                    ++isDefaultNum;
                                }
                                checkUniqueDefault.put(icv.get("invoicingCustomersId").toString(), icv.get("id").toString());
                            }
                            for (CustomerArea invoicingCustomers : invoicingCustomersIsDefaultList) {
                                if (invoicingCustomers.get("importSpecialCustomerId") != null && !checkIdExist.contains(invoicingCustomers.get("importSpecialCustomerId").toString())) {
                                    throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804F2", (String)"\u8be5\u5ba2\u6237[%s]\u7684\u5f00\u7968\u5ba2\u6237\u5b50\u8868ID[%s]\u4e0d\u5b58\u5728\uff01"), merchant.getCode(), invoicingCustomers.get("importSpecialCustomerId")));
                                }
                                if (!checkUniqueDefault.containsKey(invoicingCustomers.get("invoicingCustomersId").toString())) continue;
                                throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804DE", (String)"\u8be5\u5ba2\u6237[%s]\u7684\u5f00\u7968\u5ba2\u6237\u5df2\u7ecf\u5b58\u5728\u7f16\u7801\u4e3a: %s\u7684\u5f00\u7968\u5ba2\u6237\u4e86\uff01"), merchant.getCode(), invoicingCustomers.get("invoicingCustomersId_code")));
                            }
                            checkUniqueDefault.clear();
                        } else {
                            errorInvoicingCustomersIdCodeList = new HashSet();
                            block27: while (originalInvoicingCustomerIterator.hasNext()) {
                                InvoicingCustomers invoicingCustomers;
                                boolean remove = false;
                                InvoicingCustomers invoicingCustomersId = (InvoicingCustomers)originalInvoicingCustomerIterator.next();
                                invoicingCustomers = invoicingCustomersIsDefaultList.iterator();
                                while (invoicingCustomers.hasNext()) {
                                    InvoicingCustomers invoicingCustomers2 = (InvoicingCustomers)invoicingCustomers.next();
                                    if (!invoicingCustomersId.getId().equals(invoicingCustomers2.getId())) continue;
                                    originalInvoicingCustomerIterator.remove();
                                    remove = true;
                                }
                                if (remove || distinctMap.isEmpty() || !"Insert".equals(distinctMap.get(invoicingCustomersId.getInvoicingCustomersId())) || ((HashSet)errorInvoicingCustomersIdCodeList).size() > 200) continue;
                                String invoicingCustomersIdCode = "";
                                for (InvoicingCustomers invoicingCustomers3 : invoicingCustomersIsDefaultList) {
                                    if (!invoicingCustomersId.getInvoicingCustomersId().equals(invoicingCustomers3.getInvoicingCustomersId())) continue;
                                    invoicingCustomersIdCode = (String)invoicingCustomers3.get("invoicingCustomersId_code");
                                    ((HashSet)errorInvoicingCustomersIdCodeList).add(invoicingCustomersIdCode);
                                    continue block27;
                                }
                            }
                            if (!CollectionUtils.isEmpty(errorInvoicingCustomersIdCodeList)) {
                                throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804DE", (String)"\u8be5\u5ba2\u6237[%s]\u7684\u5f00\u7968\u5ba2\u6237\u5df2\u7ecf\u5b58\u5728\u7f16\u7801\u4e3a: %s\u7684\u5f00\u7968\u5ba2\u6237\u4e86\uff01"), merchant.getCode(), errorInvoicingCustomersIdCodeList));
                            }
                        }
                        if (!CollectionUtils.isEmpty((Collection)originalInvoicingCustomersList)) {
                            errorInvoicingCustomersIdCodeList = originalInvoicingCustomersList.iterator();
                            while (errorInvoicingCustomersIdCodeList.hasNext()) {
                                InvoicingCustomers icv = (InvoicingCustomers)errorInvoicingCustomersIdCodeList.next();
                                if (!icv.getIsDefault().booleanValue()) continue;
                                ++isDefaultNum;
                            }
                        }
                    } else {
                        for (InvoicingCustomers invoicingCustomers : invoicingCustomersIsDefaultList) {
                            if (invoicingCustomers.get("importSpecialCustomerId") == null) continue;
                            throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804F2", (String)"\u8be5\u5ba2\u6237[%s]\u7684\u5f00\u7968\u5ba2\u6237\u5b50\u8868ID[%s]\u4e0d\u5b58\u5728\uff01"), merchant.getCode(), invoicingCustomers.get("importSpecialCustomerId")));
                        }
                    }
                    if (isDefaultNum != 1 && deleteNum != invoicingCustomersIsDefaultList.size()) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800423);
                    }
                }
                if (!CollectionUtils.isEmpty((Collection)(addressInfoList = merchant.merchantAddressInfos()))) {
                    boolean merchantNeedDefaultAddress;
                    ArrayList<Long> addressInfoIdList = new ArrayList<Long>();
                    int isDefaultNum = 0;
                    for (AddressInfo addressInfo : addressInfoList) {
                        if (isUpdateImport && addressInfo.get("importSpecialAddressInfoId") != null) {
                            if (addressInfo.get("importSpecialAddressInfoId").toString().matches("[0-9]+")) {
                                addressInfo.setId((Object)Long.valueOf(addressInfo.get("importSpecialAddressInfoId").toString()));
                                addressInfo.put("_status", (Object)EntityStatus.Update);
                            } else {
                                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800424, new Object[]{merchant.getCode()});
                            }
                        }
                        if (addressInfo.getIsDefault() == null) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800425, new Object[]{merchant.getCode()});
                        }
                        if (addressInfo.getIsDefault().booleanValue() && addressInfo.getEntityStatus() != EntityStatus.Delete) {
                            ++isDefaultNum;
                        }
                        addressInfoIdList.add((Long)addressInfo.getId());
                    }
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("id");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)1), QueryCondition.name((String)"id").not_in(addressInfoIdList)}));
                    List isDefault = MetaDaoHelper.query((String)"aa.merchant.AddressInfo", (QuerySchema)querySchema);
                    if (!CollectionUtils.isEmpty((Collection)isDefault)) {
                        isDefaultNum += isDefault.size();
                    }
                    if ((merchantNeedDefaultAddress = MerchantUtils.getMerchantNeedDefault((String)"customerNeedDefaultAddress")) && isDefaultNum != 1) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800426, new Object[]{merchant.getCode()});
                    }
                    if (!merchantNeedDefaultAddress && isDefaultNum > 1) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800426, new Object[]{merchant.getCode()});
                    }
                }
                if (!CollectionUtils.isEmpty((Collection)(contacterList = merchant.merchantContacterInfos()))) {
                    boolean merchantNeedDefaultContact;
                    ArrayList<Long> contacterIdList = new ArrayList<Long>();
                    int isDefaultNum = 0;
                    for (Contacter contacter : contacterList) {
                        if (isUpdateImport && contacter.get("importSpecialContactId") != null) {
                            if (contacter.get("importSpecialContactId").toString().matches("[0-9]+")) {
                                contacter.setId((Object)Long.valueOf(contacter.get("importSpecialContactId").toString()));
                                contacter.put("_status", (Object)EntityStatus.Update);
                            } else {
                                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800427, new Object[]{merchant.getCode()});
                            }
                        }
                        if (contacter.getIsDefault() == null) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800428, new Object[]{merchant.getCode()});
                        }
                        if (contacter.getIsDefault().booleanValue() && contacter.getEntityStatus() != EntityStatus.Delete) {
                            ++isDefaultNum;
                        }
                        contacterIdList.add((Long)contacter.getId());
                    }
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("id");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)1), QueryCondition.name((String)"id").not_in(contacterIdList)}));
                    List isDefault = MetaDaoHelper.query((String)"aa.merchant.Contacter", (QuerySchema)querySchema);
                    if (!CollectionUtils.isEmpty((Collection)isDefault)) {
                        isDefaultNum += isDefault.size();
                    }
                    if ((merchantNeedDefaultContact = MerchantUtils.getMerchantNeedDefault((String)"customerNeedDefaultContact")) && isDefaultNum != 1) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800429, new Object[]{merchant.getCode()});
                    }
                    if (!merchantNeedDefaultContact && isDefaultNum > 1) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800429, new Object[]{merchant.getCode()});
                    }
                }
                List agentFinancialList = merchant.merchantAgentFinancialInfos();
                this.checkBankAccount(agentFinancialList);
                this.merchantService.handleAgentFinancial(agentFinancialList);
                if (!CollectionUtils.isEmpty((Collection)agentFinancialList)) {
                    boolean merchantNeedDefaultBank;
                    ArrayList<Long> agentFinancialIdList = new ArrayList<Long>();
                    int isDefaultNum = 0;
                    for (AgentFinancial agentFinancial : agentFinancialList) {
                        if (agentFinancial.getIsDefault() == null) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800430, new Object[]{merchant.getCode()});
                        }
                        if (agentFinancial.getIsDefault().booleanValue() && agentFinancial.getEntityStatus() != EntityStatus.Delete) {
                            ++isDefaultNum;
                        }
                        agentFinancialIdList.add((Long)agentFinancial.getId());
                    }
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("id");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)1), QueryCondition.name((String)"id").not_in(agentFinancialIdList)}));
                    List isDefault = MetaDaoHelper.query((String)"aa.merchant.AgentFinancial", (QuerySchema)querySchema);
                    if (!CollectionUtils.isEmpty((Collection)isDefault)) {
                        isDefaultNum += isDefault.size();
                    }
                    if ((merchantNeedDefaultBank = MerchantUtils.getMerchantNeedDefault((String)"customerNeedDefaultBank")) && isDefaultNum != 1) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800431, new Object[]{merchant.getCode()});
                    }
                    if (!merchantNeedDefaultBank && isDefaultNum > 1) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800431, new Object[]{merchant.getCode()});
                    }
                }
                if (!CollectionUtils.isEmpty((Collection)(agentInvoicesList = merchant.merchantAgentInvoiceInfos()))) {
                    boolean merchantNeedDefaultBank;
                    ArrayList<Long> agentInvoiceIdList = new ArrayList<Long>();
                    int isDefaultNum = 0;
                    for (AgentInvoice agentInvoice2 : agentInvoicesList) {
                        if (isUpdateImport && agentInvoice2.get("importSpecialAgentInvoiceId") != null) {
                            if (agentInvoice2.get("importSpecialAgentInvoiceId").toString().matches("[0-9]+")) {
                                agentInvoice2.setId((Object)Long.valueOf(agentInvoice2.get("importSpecialAgentInvoiceId").toString()));
                                agentInvoice2.put("_status", (Object)EntityStatus.Update);
                            } else {
                                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800432, new Object[]{merchant.getCode()});
                            }
                        }
                        if (agentInvoice2.getIsDefault() == null) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800433, new Object[]{merchant.getCode()});
                        }
                        if (agentInvoice2.getIsDefault().booleanValue() && agentInvoice2.getEntityStatus() != EntityStatus.Delete) {
                            ++isDefaultNum;
                        }
                        agentInvoiceIdList.add((Long)agentInvoice2.getId());
                    }
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("id,billingType,title");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)1), QueryCondition.name((String)"id").not_in(agentInvoiceIdList)}));
                    List isDefault = MetaDaoHelper.query((String)"aa.merchant.AgentInvoice", (QuerySchema)querySchema);
                    if (!CollectionUtils.isEmpty((Collection)isDefault)) {
                        isDefaultNum += isDefault.size();
                    }
                    if ((merchantNeedDefaultBank = MerchantUtils.getMerchantNeedDefault((String)"customerNeedDefaultInvoice")) && isDefaultNum != 1) {
                        Optional<AgentInvoice> first;
                        if (isDefaultNum == 0 && !CollectionUtils.isEmpty((Collection)merchant.merchantAgentInvoiceInfos()) && (first = merchant.merchantAgentInvoiceInfos().stream().filter(agentInvoice -> EntityStatus.Delete != agentInvoice.getEntityStatus()).findFirst()).isPresent()) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800434, new Object[]{merchant.getCode()});
                        }
                        if (isDefaultNum == 0 && CollectionUtils.isEmpty((Collection)merchant.merchantAgentInvoiceInfos())) {
                            querySchema = QuerySchema.create();
                            querySchema.addSelect("id,billingType,title");
                            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)0), QueryCondition.name((String)"id").not_in(agentInvoiceIdList)}));
                            List isNotDefault = MetaDaoHelper.query((String)"aa.merchant.AgentInvoice", (QuerySchema)querySchema);
                            if (!CollectionUtils.isEmpty((Collection)isNotDefault)) {
                                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800434, new Object[]{merchant.getCode()});
                            }
                        }
                    } else if (!merchantNeedDefaultBank && isDefaultNum > 1) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800434, new Object[]{merchant.getCode()});
                    }
                }
                this.updateAgentFinancialStopStatus(merchant);
            }
            if (merchant.getEnterpriseNature() == null) {
                querySchema = QuerySchema.create();
                querySchema.addSelect("enterpriseNature");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
                List query = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
                if (CollectionUtils.isEmpty((Collection)query)) {
                    merchant.setEnterpriseNature(EnterpriseNature.enterprise);
                    merchant.setVerfyMark(VerifyingState.Unverified);
                    merchant.setEnterpriseName((String)MultilangUtil.getAttr((String)"aa.merchant.Merchant", (String)"name", (BizObject)bill, null));
                }
            }
            List addresses = merchant.merchantAddressInfos();
            this.checkAddressCode(addresses, (Long)merchant.getId());
            if (!CollectionUtils.isEmpty((Collection)addresses)) {
                addresses.forEach(this::lambda$execute$4);
            }
            if (merchant.merchantsManager() != null && EntityStatus.Insert.equals((Object)merchant.merchantsManager().getEntityStatus())) {
                if (StringUtils.isBlank((CharSequence)merchant.merchantsManager().getMobile()) && StringUtils.isBlank((CharSequence)merchant.merchantsManager().getEmail())) {
                    merchant.setMerchantsManager(null);
                } else {
                    merchant.merchantsManager().setId((Object)merchant.merchantsManager().getMerchantId());
                }
            }
            if (!CollectionUtils.isEmpty((Collection)merchant.merchantAppliedDetail()) && ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).getExchangeratetype() == null) {
                List<Map<String, Object>> exchangeRateTypeVOListIsDefault = this.merchantService.selectExchangeRateTypeVO("01", "code");
                if (!CollectionUtils.isEmpty(exchangeRateTypeVOListIsDefault)) {
                    ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).setExchangeratetype(exchangeRateTypeVOListIsDefault.get(0).get("id").toString());
                }
            } else if (CollectionUtils.isEmpty((Collection)merchant.merchantAppliedDetail()) || ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).getExchangeratetype() == null || CollectionUtils.isEmpty(exchangeRateTypeVOList = this.merchantService.selectExchangeRateTypeVO(((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).getExchangeratetype(), "id"))) {
                // empty if block
            }
            if (merchant.merchantRole() == null || !StringUtils.isNotBlank((CharSequence)merchant.merchantRole().getBusinessRole())) continue;
            if (merchant.merchantsManager() != null && (StringUtils.isNotBlank((CharSequence)merchant.merchantsManager().getMobile()) || StringUtils.isNotBlank((CharSequence)merchant.merchantsManager().getEmail()))) {
                QuerySchema querySchema3;
                Map stringObjectMap;
                boolean isDeleteUserType = false;
                if (EntityStatus.Update.equals((Object)merchant.getEntityStatus()) && !CollectionUtils.isEmpty((Map)(stringObjectMap = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantsManager", (QuerySchema)(querySchema3 = QuerySchema.create().addSelect("email,mobile,yhtUserId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId())})))))) && stringObjectMap.get("yhtUserId") != null) {
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
                            this.iupcMerchantSyncService.deleteUserType(AppContext.getCurrentUser().getYhtTenantId(), String.valueOf(UserType.TenantShopuser.getValue()), RES_CODE, userIds, merchant.getId().toString());
                        }
                        if (businessRole.contains("4") || businessRole.contains("3") || businessRole.contains("5")) {
                            this.iupcMerchantSyncService.deleteUserType(AppContext.getCurrentUser().getYhtTenantId(), String.valueOf(UserType.ShopAdminUser.getValue()), RES_CODE, userIds, merchant.getId().toString());
                        }
                    }
                }
                if ((!MerchantUtils.isExists((Map)merchant, (String)"data_from") && merchant.get("_fromApi") != null && ((Boolean)merchant.get("_fromApi")).booleanValue() || !MerchantUtils.isExists((Map)merchant, (String)"data_from") && merchant.get("importSpecialKey_merchant") != null) && merchant.merchantsManager() != null && EntityStatus.Insert.equals((Object)merchant.merchantsManager().getEntityStatus())) {
                    MerchantsManager merchantsManager = new MerchantsManager();
                    merchantsManager.setId(merchant.getId());
                    merchantsManager.set("merchantId", merchant.getId());
                    log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080518", (String)"merchantBeforeSaveRule\u5220\u9664\u5f00\u59cb:{}"), (Object)merchantsManager);
                    MetaDaoHelper.delete((String)"aa.merchant.MerchantsManager", (BizObject)merchantsManager);
                    log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408051B", (String)"merchantBeforeSaveRule\u5220\u9664\u7ed3\u675f:{}"), (Object)merchantsManager);
                }
                querySchema3 = QuerySchema.create();
                querySchema3.addSelect("businessRole");
                querySchema3.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId())}));
                Map merchantRole = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)querySchema3);
                String oldBusinessRole = !CollectionUtils.isEmpty((Map)merchantRole) ? merchantRole.get("businessRole").toString() : "1";
                if (isDeleteUserType || !oldBusinessRole.equals(merchant.merchantRole().getBusinessRole())) {
                    this.createUserType(billContext.getAction(), merchant);
                }
            }
            this.updateRoleInfoDeleteUser(merchant);
        }
        return new RuleExecuteResult();
    }

    private void dealMerchantDataForUpdateImport(Merchant merchant, boolean supportUpsert) throws Exception {
        MerchantApplyRangeDetail applyRangeDetail;
        List agentFinancialList = merchant.merchantAgentFinancialInfos();
        if (!CollectionUtils.isEmpty((Collection)agentFinancialList)) {
            for (AgentFinancial agentFinancial : agentFinancialList) {
                if (agentFinancial.get("importSpecialVendorBankId") == null) continue;
                if (agentFinancial.get("importSpecialVendorBankId").toString().matches("[0-9]+")) {
                    agentFinancial.setId((Object)Long.valueOf(agentFinancial.get("importSpecialVendorBankId").toString()));
                    agentFinancial.put("_status", (Object)EntityStatus.Update);
                    continue;
                }
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800405, new Object[]{merchant.getCode()});
            }
        }
        if (supportUpsert) {
            this.updateMerchantEntityStatusForExport(merchant);
        }
        this.updateChildEntityStatus(merchant);
        this.setMerchantApplyRangeType(merchant.merchantApplyRange());
        this.merchantCheckService.merchantApplyRangeCheckFromApi(merchant);
        List merchantApplyRangeDetails = merchant.merchantAppliedDetail();
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetails) && merchantApplyRangeDetails.get(0) != null && (applyRangeDetail = (MerchantApplyRangeDetail)merchantApplyRangeDetails.get(0)).getStopstatus() == null && !merchant.containsKey((Object)"_fromBatchModify")) {
            applyRangeDetail.setStopstatus(Boolean.valueOf(false));
        }
    }

    private void setMerchantApplyRangeType(List<MerchantApplyRange> merchantApplyRanges) {
        if (!CollectionUtils.isEmpty(merchantApplyRanges)) {
            for (MerchantApplyRange merchantApplyRange : merchantApplyRanges) {
                if (merchantApplyRange.getRangeType() != null) continue;
                int rangeType = ProductUtil.checkUserTyoe(AppContext.getCurrentUser()) == 3 ? 3 : 1;
                merchantApplyRange.setRangeType(Integer.valueOf(rangeType));
            }
        }
    }

    private String saveUserType(Merchant merchant, String resCode, Integer userType) {
        ArrayList<MerchantsManager> bizObjectList = new ArrayList<MerchantsManager>();
        String result = "";
        try {
            bizObjectList.add(merchant.merchantsManager());
            result = this.iupcMerchantSyncService.saveUserType(bizObjectList, resCode, userType);
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804FA", (String)"\u521b\u5efa\u53cb\u6237\u901a\u8eab\u4efd\u5f02\u5e38:{}") + e.getMessage(), (Throwable)e);
            throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804FD", (String)"\u521b\u5efa\u53cb\u6237\u901a\u8eab\u4efd\u5f02\u5e38:%s"), e));
        }
        if (StringUtils.isBlank((CharSequence)result)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800437, new Object[]{result});
        }
        return result;
    }

    public void createUserType(String action, final Merchant merchant) throws Exception {
        List managerListMap;
        String result = "";
        final String businessRole = merchant.merchantRole().getBusinessRole();
        if (businessRole.contains("2") || businessRole.contains("6")) {
            result = this.saveUserType(merchant, RES_CODE, Integer.valueOf(UserType.TenantShopuser.getValue()));
        }
        if (businessRole.contains("4") || businessRole.contains("3") || businessRole.contains("5")) {
            result = this.saveUserType(merchant, RES_CODE, Integer.valueOf(UserType.ShopAdminUser.getValue()));
        }
        this.saveMerchantsWarehouse(merchant);
        if (StringUtils.isNotBlank((CharSequence)result) && !CollectionUtils.isEmpty((Collection)(managerListMap = (List)JSON.parseObject((String)result, List.class)))) {
            managerListMap.forEach(managerMap -> merchant.merchantsManager().setYhtUserId((String)managerMap.get("yhtUserId")));
        }
        if (!StringUtils.isEmpty((CharSequence)merchant.merchantsManager().getYhtUserId())) {
            final ArrayList<String> userIds = new ArrayList<String>(1);
            userIds.add(merchant.merchantsManager().getYhtUserId());
            TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

                public void afterCompletion(int status) {
                    if (0 != status) {
                        if (businessRole.contains("2") || businessRole.contains("6")) {
                            MerchantBeforeSaveRule.this.iupcMerchantSyncService.deleteUserType(AppContext.getCurrentUser().getYhtTenantId(), String.valueOf(UserType.TenantShopuser.getValue()), MerchantBeforeSaveRule.RES_CODE, userIds, merchant.getId().toString());
                        }
                        if (businessRole.contains("4") || businessRole.contains("3") || businessRole.contains("5")) {
                            MerchantBeforeSaveRule.this.iupcMerchantSyncService.deleteUserType(AppContext.getCurrentUser().getYhtTenantId(), String.valueOf(UserType.ShopAdminUser.getValue()), MerchantBeforeSaveRule.RES_CODE, userIds, merchant.getId().toString());
                        }
                    }
                }
            });
        }
    }

    public void saveExternalOrg(String action, Merchant merchant) {
        this.iupcMerchantSyncService.executeUpdate(action, MerchantUtils.transferExternalOrg((Merchant)merchant));
    }

    private void deleteUserType(String[] dbBusinessRole, List<String> strings, List<String> userIds, String docId) {
        switch (dbBusinessRole.length) {
            case 4: {
                if (!strings.contains("3") || !strings.contains("4") || !strings.contains("5")) break;
                this.iupcMerchantSyncService.deleteUserType(AppContext.getCurrentUser().getYhtTenantId(), String.valueOf(UserType.ShopAdminUser.getValue()), RES_CODE, userIds, docId);
                break;
            }
            case 3: {
                if (!strings.contains("3") || !strings.contains("4") || !strings.contains("5")) break;
                this.iupcMerchantSyncService.deleteUserType(AppContext.getCurrentUser().getYhtTenantId(), String.valueOf(UserType.ShopAdminUser.getValue()), RES_CODE, userIds, docId);
                break;
            }
            case 2: {
                if (!this.getBusinessBoolean(strings)) break;
                this.iupcMerchantSyncService.deleteUserType(AppContext.getCurrentUser().getYhtTenantId(), String.valueOf(UserType.ShopAdminUser.getValue()), RES_CODE, userIds, docId);
                break;
            }
            case 1: {
                if (!strings.contains("3") && !strings.contains("4") && !strings.contains("5")) break;
                this.iupcMerchantSyncService.deleteUserType(AppContext.getCurrentUser().getYhtTenantId(), String.valueOf(UserType.ShopAdminUser.getValue()), RES_CODE, userIds, docId);
                break;
            }
        }
    }

    private boolean getBusinessBoolean(List<String> strings) {
        return strings.contains("3") && strings.contains("4") || strings.contains("3") && strings.contains("5") || strings.contains("4") && strings.contains("5");
    }

    private void saveMerchantsWarehouse(Merchant merchant) throws Exception {
        String businessRole = merchant.merchantRole().getBusinessRole();
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"shopDefault").eq((Object)true), QueryCondition.name((String)"cust").eq(merchant.getId())}));
        Map query = MetaDaoHelper.queryOne((String)"aa.warehouse.Warehouse", (QuerySchema)querySchema);
        if (businessRole.contains("3") && CollectionUtils.isEmpty((Map)query)) {
            Warehouse warehouse = new Warehouse();
            warehouse.setId(Long.valueOf(IdManager.getInstance().nextId()));
            LanguageVO currentLangVO = MultiLangContext.getInstance().getCurrentLangVO();
            LanguageVO defaultLangVO = MultiLangContext.getInstance().getDefaultLangVO();
            if (currentLangVO == null) {
                currentLangVO = defaultLangVO;
            }
            Object name = MultilangUtil.getAttr((String)"aa.merchant.Merchant", (String)"name", (BizObject)merchant, null);
            HashMap<String, String> nameMap = new HashMap<String, String>();
            nameMap.put(currentLangVO.getLangCode(), name == null ? null : name.toString());
            MultiLangText multiLangTextName = new MultiLangText(nameMap);
            warehouse.setName(multiLangTextName);
            warehouse.setCode(merchant.getCode());
            warehouse.setwStore(Boolean.valueOf(false));
            warehouse.seteStore(Boolean.valueOf(false));
            warehouse.setiSerialManage(Boolean.valueOf(false));
            warehouse.setbWMS(Boolean.valueOf(false));
            warehouse.setiUsed("enable");
            warehouse.setOrg(merchant.getId().toString());
            warehouse.setIsWasteWarehouse(Boolean.valueOf(false));
            warehouse.setOwnerorg(merchant.getId().toString());
            warehouse.setOperator(null);
            warehouse.setVendor(null);
            warehouse.setShopDefault(Boolean.valueOf(true));
            warehouse.setbMRP(Boolean.valueOf(false));
            warehouse.setJoinStockQuery(Boolean.valueOf(true));
            warehouse.setStockCheckType(Integer.valueOf(0));
            warehouse.setiSerialManage(Boolean.valueOf(true));
            warehouse.setIsGoodsPosition(Boolean.valueOf(false));
            warehouse.setIsSubcontractW(Boolean.valueOf(false));
            warehouse.setIsInvertedScour(Boolean.valueOf(false));
            warehouse.setCountCost(Boolean.valueOf(false));
            if (MerchantUtils.getIsBatchNumberManage()) {
                warehouse.setIsBatchNumberManage(Integer.valueOf(1));
            } else {
                warehouse.setIsBatchNumberManage(Integer.valueOf(0));
            }
            warehouse.setCust((Long)merchant.getId());
            warehouse.set_status(Integer.valueOf(2));
            warehouse.setYtenant((String)AppContext.getYTenantId());
            warehouse.setTenant((Long)AppContext.getCurrentUser().getTenant());
            this.billRepository.save(Collections.singletonList(warehouse));
            WarehouseStock warehouseStock = new WarehouseStock();
            warehouseStock.setId(Long.valueOf(IdManager.getInstance().nextId()));
            warehouseStock.setOrg(merchant.getId().toString());
            warehouseStock.setWarehouse(warehouse.getId());
            warehouseStock.setIsDefault(Boolean.valueOf(true));
            warehouseStock.set_status(Integer.valueOf(2));
            warehouseStock.setYtenant((String)AppContext.getYTenantId());
            warehouseStock.setTenant((Long)AppContext.getCurrentUser().getTenant());
            this.billRepository.save(Collections.singletonList(warehouseStock));
            List addressInfoList = merchant.merchantAddressInfos();
            if (!CollectionUtils.isEmpty((Collection)addressInfoList)) {
                for (AddressInfo addressInfo : addressInfoList) {
                    addressInfo.setReceivingWarehouse(warehouse.getId());
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void setPath(Merchant merchant) throws Exception {
        if (merchant.getId() == null && merchant.getEntityStatus() == EntityStatus.Insert) {
            merchant.setId((Object)IdManager.getInstance().nextId());
        }
        if (merchant.getEntityStatus() == EntityStatus.Insert || merchant.getEntityStatus() == EntityStatus.Update) {
            merchant.setPath(merchant.getId() + "|");
        }
        if (EntityStatus.Insert == merchant.getEntityStatus() && MerchantUtils.isExists((Map)merchant, (String)"parentCustomer")) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("path");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchant.getParentCustomer())}));
            Map merchantPath = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
            if (!CollectionUtils.isEmpty((Map)merchantPath)) {
                String path = merchantPath.get("path").toString() + merchant.getId() + "|";
                merchant.setPath(path);
                return;
            }
            String errorMsg = InternationalUtils.getMessage((String)MerchantErrorEnum.MERCHANT_PARENT_NOT_FIND_INDB.getMultilingual(), (Object[])new Object[]{merchant.getCode()}, (String)MerchantErrorEnum.MERCHANT_PARENT_NOT_FIND_INDB.getMessage(), null);
            throw new CoreDocBusinessException(errorMsg);
        }
        if (EntityStatus.Insert == merchant.getEntityStatus() && !MerchantUtils.isExists((Map)merchant, (String)"parentCustomer")) {
            String path = merchant.getId() + "|";
            merchant.setPath(path);
            return;
        }
        if (EntityStatus.Update == merchant.getEntityStatus() && MerchantUtils.isExists((Map)merchant, (String)"parentCustomer")) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("parentCustomer,path");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
            Map merchantSql = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
            if (CollectionUtils.isEmpty((Map)merchantSql) || merchant.getParentCustomer().equals(merchantSql.get("parentCustomer"))) return;
            querySchema = QuerySchema.create();
            querySchema.addSelect("path");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchant.getParentCustomer())}));
            final String requestId = UUID.randomUUID().toString();
            final String lockKey = merchant.getParentCustomer() < Long.parseLong(merchant.getId().toString()) ? "merchantParentCustomer_" + AppContext.getYhtTenantId() + "_" + merchant.getId() + merchant.getParentCustomer() : "merchantParentCustomer_" + AppContext.getYhtTenantId() + "_" + merchant.getParentCustomer() + merchant.getId();
            int tryLockNum = 0;
            while (true) {
                if (tryLockNum > 60) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800032);
                }
                ++tryLockNum;
                if (RedisTool.tryGetLock((String)lockKey, (String)requestId, (int)10)) {
                    TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

                        public void afterCompletion(int status) {
                            RedisTool.releaseLock((String)lockKey, (String)requestId);
                        }
                    });
                    Map merchantPath = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
                    if (CollectionUtils.isEmpty((Map)merchantPath)) {
                        String errorMsg = InternationalUtils.getMessage((String)MerchantErrorEnum.MERCHANT_PARENT_NOT_FIND_INDB.getMultilingual(), (Object[])new Object[]{merchant.getCode()}, (String)MerchantErrorEnum.MERCHANT_PARENT_NOT_FIND_INDB.getMessage(), null);
                        throw new CoreDocBusinessException(errorMsg);
                    }
                    String path = merchantPath.get("path").toString() + merchant.getId() + "|";
                    merchant.setPath(path);
                    this.theClosedLoopCheck(merchant);
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("id,path");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"path").left_like(merchantSql.get("path")), QueryCondition.name((String)"id").not_eq(merchant.getId())}));
                    List merchantList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
                    ArrayList<Merchant> lowerMerchantList = new ArrayList<Merchant>();
                    if (CollectionUtils.isEmpty((Collection)merchantList)) return;
                    for (Map map : merchantList) {
                        Merchant lowerMerchant = new Merchant();
                        if (map.get("path") == null) continue;
                        String[] pathArray = ((String)map.get("path")).split("[|]");
                        boolean isPath = false;
                        String pathList = merchant.getPath();
                        for (int i = 0; i < pathArray.length; ++i) {
                            if (isPath) {
                                pathList = pathList + pathArray[i] + "|";
                            }
                            if (!pathArray[i].equals(merchant.getId().toString())) continue;
                            isPath = true;
                        }
                        lowerMerchant.setId(map.get("id"));
                        lowerMerchant.setPath(pathList);
                        lowerMerchant.setEntityStatus(EntityStatus.Update);
                        this.theClosedLoopCheck(lowerMerchant);
                        lowerMerchantList.add(lowerMerchant);
                    }
                    if (CollectionUtils.isEmpty(lowerMerchantList)) return;
                    MetaDaoHelper.update((String)"aa.merchant.Merchant", lowerMerchantList);
                    return;
                }
                TimeUnit.MILLISECONDS.sleep(200L);
            }
        }
        if (EntityStatus.Update == merchant.getEntityStatus() && !MerchantUtils.isExists((Map)merchant, (String)"parentCustomer")) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("parentCustomer,path");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
            Map merchantInDb = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
            if (CollectionUtils.isEmpty((Map)merchantInDb) || merchantInDb.get("parentCustomer") == null) {
                String path = merchant.getId() + "|";
                merchant.setPath(path);
                return;
            } else {
                if (!merchant.containsKey((Object)"parentCustomer") || merchant.getParentCustomer() != null) return;
                String path = merchant.getId() + "|";
                merchant.setPath(path);
                if (merchantInDb.get("path") == null) return;
                querySchema = QuerySchema.create();
                querySchema.addSelect("id,path");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"path").left_like(merchantInDb.get("path")), QueryCondition.name((String)"id").not_eq(merchant.getId())}));
                List childMerchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
                if (CollectionUtils.isEmpty((Collection)childMerchantInDbList)) return;
                for (Merchant childMerchantInDb : childMerchantInDbList) {
                    String childPath = childMerchantInDb.getPath().replace(merchantInDb.get("path").toString(), merchant.getPath());
                    childMerchantInDb.setPath(childPath);
                    childMerchantInDb.setEntityStatus(EntityStatus.Update);
                }
                MetaDaoHelper.update((String)"aa.merchant.Merchant", (List)childMerchantInDbList);
            }
            return;
        } else {
            log.error("Path\u672a\u8bbe\u7f6e\uff0c \u5bf9\u5e94\u5ba2\u6237 ID" + merchant.getId());
        }
    }

    private void theClosedLoopCheck(Merchant merchant) {
        if (merchant != null && !StringUtils.isEmpty((CharSequence)merchant.getPath())) {
            String[] pathArray = merchant.getPath().split("[|]");
            for (int i = 0; i < pathArray.length; ++i) {
                for (int j = i + 1; j < pathArray.length; ++j) {
                    if (!pathArray[i].equals(pathArray[j])) continue;
                    String str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080528", (String)"\u8be5\u5ba2\u6237:%s\u7684\u4e0a\u7ea7\u5ba2\u6237,\u5f62\u6210\u95ed\u73af\u8bf7\u68c0\u67e5\u6570\u636e\uff01"), merchant.getCode());
                    throw new CoreDocBusinessException(str);
                }
            }
        }
    }

    private void setTransType(Merchant merchant, LoginUser currentUser) throws Exception {
        if (currentUser.getUserType() == UserType.TenantAdmin || currentUser.getUserType() == UserType.TenantEmployee || currentUser.getUserType() == UserType.TenantShopuser || currentUser.getUserType() == UserType.JoinUser) {
            if (MerchantUtils.isExists((Map)merchant, (String)"transType")) {
                List<BdTransType> bdTransTypeList = this.merchantService.checkBillTransTypeId(merchant.getTransType());
                if (CollectionUtils.isEmpty(bdTransTypeList)) {
                    String str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804E4", (String)"\u8be5\u5ba2\u6237[%s]\uff1a\u7684\u5ba2\u6237\u7c7b\u578b\u6ca1\u6709\u627e\u5230\uff01"), merchant.getCode());
                    throw new CoreDocBusinessException(str);
                }
            } else if (EntityStatus.Insert.equals((Object)merchant.getEntityStatus())) {
                this.setMerchantTransType(merchant);
            } else if (EntityStatus.Update.equals((Object)merchant.getEntityStatus())) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("transType");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
                Map merchantSql = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
                if (CollectionUtils.isEmpty((Map)merchantSql)) {
                    this.setMerchantTransType(merchant);
                }
            }
        }
        if (currentUser.getUserType() == UserType.ShopAdminUser || currentUser.getUserType() == UserType.ShopUser) {
            this.setMerchantTransType(merchant);
        }
    }

    private void setMerchantTransType(Merchant merchant) throws Exception {
        List<BdTransType> bdTransTypeList = this.merchantService.getBillTransTypeIdIsDefault();
        merchant.setTransType(bdTransTypeList.get(0).getId());
    }

    private void theCheck(Merchant merchant, Boolean singleOrg, LoginUser currentUser) throws Exception {
        this.theMerchantCheck(merchant, singleOrg, currentUser);
        this.theMerchantsManagerCheck(merchant);
        this.theMerchantRoleCheck(merchant, singleOrg, currentUser);
        this.theAgentFinancialCheck(merchant);
        this.theAgentInvoiceCheck(merchant);
        this.theCustomerAreaCheck(merchant);
        this.thePrincipalCheck(merchant);
        this.theInvoicingCustomersCheck(merchant);
        this.theMerchantApplyRangeCheck(merchant);
        this.theMerchantApplyRangeDetailCheck(merchant);
        this.theMerchantAddressInfosCheck(merchant);
        this.theMerchantContactInfosCheck(merchant);
        this.theMerchantQualificationDocumentCheck(merchant);
    }

    private void theMerchantCheck(Merchant merchant, Boolean singleOrg, LoginUser currentUser) throws Exception {
        List merchantInDbList;
        if (!SQLInjectionCheckUtil.validateParamCode((String)merchant.getCode())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800438);
        }
        if (MerchantUtils.isExists((Map)merchant, (String)"enterpriseNature")) {
            if (MerchantUtils.isExists((Map)merchant, (String)"licenseType")) {
                merchant.set("licenseType", (Object)Short.valueOf(merchant.get("licenseType").toString()));
            }
            if (merchant.getEnterpriseNature().getValue() == 0) {
                if (merchant.getLicenseType() != null && merchant.getLicenseType() != LicenseType.socialCodes && merchant.getLicenseType() != LicenseType.otherLicenses) {
                    String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408050D", (String)"\u4f01\u4e1a\u7c7b\u578b\u4e3a\u4f01\u4e1a,\u8bc1\u7167\u7c7b\u578b\u53ea\u80fd\u8f93\u5165\u201c\u7edf\u4e00\u793e\u4f1a\u4fe1\u7528\u4ee3\u7801\u3001\u5176\u4ed6\u8bc1\u7167\u201d"), new Object[0]);
                    throw new CoreDocBusinessException(msg);
                }
            } else if (merchant.getEnterpriseNature().getValue() == 1) {
                if (merchant.getLicenseType() != null && merchant.getLicenseType() != LicenseType.IDCard && merchant.getLicenseType() != LicenseType.passport && merchant.getLicenseType() != LicenseType.otherIDDocuments) {
                    String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080514", (String)"\u4f01\u4e1a\u7c7b\u578b\u4e3a\u4e2a\u4eba,\u8bc1\u7167\u7c7b\u578b\u53ea\u80fd\u8f93\u5165\u201c\u5c45\u6c11\u8eab\u4efd\u8bc1\u3001\u62a4\u7167\u3001\u5176\u4ed6\u8eab\u4efd\u8bc1\u4ef6\u201d"), new Object[0]);
                    throw new CoreDocBusinessException(msg);
                }
                if (merchant.getLicenseType() == LicenseType.IDCard && MerchantUtils.isExists((Map)merchant, (String)"creditCode") && !IdcardUtils.validateCard((String)merchant.getCreditCode())) {
                    String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080519", (String)"\u5c45\u6c11\u8eab\u4efd\u8bc1\u53f7\u4e0d\u5408\u6cd5\uff01"), new Object[0]);
                    throw new CoreDocBusinessException(msg);
                }
            } else if (merchant.getEnterpriseNature().getValue() == 2) {
                if (merchant.getLicenseType() != null && merchant.getLicenseType() != LicenseType.socialCodes && merchant.getLicenseType() != LicenseType.businessLicense && merchant.getLicenseType() != LicenseType.otherLicenses) {
                    String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408051F", (String)"\u4f01\u4e1a\u7c7b\u578b\u4e3a\u5176\u4ed6,\u8bc1\u7167\u7c7b\u578b\u53ea\u80fd\u8f93\u5165\u201c\u7edf\u4e00\u793e\u4f1a\u4fe1\u7528\u4ee3\u7801\u3001\u8425\u4e1a\u6267\u7167\u3001\u5176\u4ed6\u8bc1\u7167\u201d"), new Object[0]);
                    throw new CoreDocBusinessException(msg);
                }
            } else {
                String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080524", (String)"\u4f01\u4e1a\u7c7b\u578b\u6570\u636e\u9519\u8bef,\u8bf7\u8f93\u5165\u6b63\u786e\u6570\u636e!"), new Object[0]);
                throw new CoreDocBusinessException(msg);
            }
        }
        if (MerchantUtils.isExists((Map)merchant, (String)"leaderNameIdNo") && !IdcardUtils.validateCard((String)merchant.getLeaderNameIdNo())) {
            String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408052D", (String)"\u6cd5\u4eba\u4ee3\u8868\u8eab\u4efd\u8bc1\u53f7\u4e0d\u5408\u6cd5\uff01"), new Object[0]);
            throw new CoreDocBusinessException(msg);
        }
        if (MerchantUtils.isExists((Map)merchant, (String)"personChargeIdNo") && !IdcardUtils.validateCard((String)merchant.getPersonChargeIdNo())) {
            String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804DF", (String)"\u8d1f\u8d23\u4eba\u8eab\u4efd\u8bc1\u53f7\u4e0d\u5408\u6cd5\uff01"), new Object[0]);
            throw new CoreDocBusinessException(msg);
        }
        if (merchant.getEntityStatus() == EntityStatus.Insert) {
            if (merchant.getVerfyMark() == null) {
                merchant.setVerfyMark(VerifyingState.Unverified);
            }
            if (merchant.getTaxPayingCategories() == null) {
                merchant.setTaxPayingCategories(TaxPayingCate.generaltaxpayer);
            }
            if (merchant.getInternalOrg() == null) {
                merchant.setInternalOrg(Boolean.valueOf(false));
            }
        }
        if (singleOrg.booleanValue() && (currentUser.getUserType() == UserType.ShopAdminUser || currentUser.getUserType() == UserType.ShopUser)) {
            merchant.setDevelopmentPartner(Long.valueOf((String)AppContext.getCurrentUser().get("singleOrgId")));
        }
        if (MerchantUtils.isExists((Map)merchant, (String)"developmentPartner")) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchant.getDevelopmentPartner()), QueryCondition.name((String)"merchantRole.merchantOptions").eq((Object)1), QueryCondition.name((String)"tenant").eq(AppContext.getCurrentUser().getTenant())}));
            querySchema.setPartitionable(false);
            List developmentPartnerList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
            if (CollectionUtils.isEmpty((Collection)developmentPartnerList)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800439);
            }
        }
        if (MerchantUtils.isExists((Map)merchant, (String)"internalOrgId") && !MerchantUtils.getIsInternalCustomer()) {
            boolean purchaseorg = this.iFuncTypeQueryService.orgHasFunc(AppContext.getCurrentUser().getYhtTenantId(), merchant.getInternalOrgId(), "purchaseorg");
            boolean financeorg = this.iFuncTypeQueryService.orgHasFunc(AppContext.getCurrentUser().getYhtTenantId(), merchant.getInternalOrgId(), "financeorg");
            if (!purchaseorg && !financeorg) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800440);
            }
        }
        if (MerchantUtils.isExists((Map)merchant, (String)"internalOrg") && merchant.getInternalOrg().booleanValue()) {
            if (!CollectionUtils.isEmpty((Map)merchant.merchantRole()) && !StringUtils.isEmpty((CharSequence)merchant.merchantRole().getBusinessRole())) {
                if (merchant.merchantRole().getBusinessRole().contains("3") || merchant.merchantRole().getBusinessRole().contains("4") || merchant.merchantRole().getBusinessRole().contains("5") || merchant.merchantRole().getBusinessRole().contains("6")) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800441);
                }
            } else {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("id");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"businessRole").like((Object)"3"), QueryCondition.name((String)"businessRole").like((Object)"4"), QueryCondition.name((String)"businessRole").like((Object)"5"), QueryCondition.name((String)"businessRole").like((Object)"6")})}));
                Map merchantRole = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)querySchema);
                if (!CollectionUtils.isEmpty((Map)merchantRole)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800441);
                }
            }
            if (merchant.getEntityStatus() == EntityStatus.Insert && StringUtils.isEmpty((CharSequence)merchant.getInternalOrgId())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800442);
            }
            if (merchant.getEntityStatus() == EntityStatus.Update && StringUtils.isEmpty((CharSequence)merchant.getInternalOrgId())) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("internalOrgId");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
                merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
                if (CollectionUtils.isEmpty((Collection)merchantInDbList)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800442);
                }
            }
        } else if (MerchantUtils.isExists((Map)merchant, (String)"internalOrg") && !merchant.getInternalOrg().booleanValue()) {
            merchant.setInternalOrgId(null);
            if (IsFinancialSynergy.YES.getValue().equals(merchant.getIsFinancialSynergy())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800443);
            }
            merchant.setIsFinancialSynergy(IsFinancialSynergy.NO.getValue());
        }
        if (merchant.getEntityStatus() == EntityStatus.Insert && StringUtils.isEmpty((CharSequence)merchant.getIsFinancialSynergy())) {
            merchant.setIsFinancialSynergy(IsFinancialSynergy.NO.getValue());
        } else if (merchant.getEntityStatus() == EntityStatus.Update && IsFinancialSynergy.YES.getValue().equals(merchant.getIsFinancialSynergy()) && merchant.getInternalOrg() == null) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("internalOrg").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
            merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)merchantInDbList) && !((Merchant)merchantInDbList.get(0)).getInternalOrg().booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800443);
            }
        }
        if (merchant.getEntityStatus() == EntityStatus.Update && !"customerapply".equals(merchant.get("customerapply"))) {
            this.merchantCheckService.checkOnTheWayCustomerApply((Long)merchant.getId());
        }
        if (StringUtils.isEmpty((CharSequence)merchant.getNewTimeZone()) && !StringUtils.isEmpty((CharSequence)merchant.getTimeZone())) {
            merchant.setNewTimeZone(YonBipTimeZones.ofCode((String)merchant.getTimeZone()).getCode());
        } else if (!StringUtils.isEmpty((CharSequence)merchant.getNewTimeZone())) {
            merchant.setNewTimeZone(YonBipTimeZones.ofCode((String)merchant.getNewTimeZone()).getCode());
        }
        this.merchantCheckService.checkParentManageOrgForMerchant(merchant, currentUser, singleOrg);
        if (!MerchantUtils.getFromApiMerchant((Merchant)merchant)) {
            this.merchantCheckService.checkMerchantRegionCode(merchant);
        }
        this.merchantCheckService.checkMerchantInternalOrgId(merchant);
    }

    private void theMerchantsManagerCheck(Merchant merchant) throws Exception {
        if ("isBatchModifyMerchant".equals(merchant.get("isBatchModifyMerchant"))) {
            merchant.setMerchantsManager(null);
        }
        if (merchant.merchantsManager() != null) {
            if (StringUtils.isBlank((CharSequence)merchant.merchantsManager().getMobile()) && StringUtils.isBlank((CharSequence)merchant.merchantsManager().getEmail())) {
                merchant.setMerchantsManager(null);
            } else {
                merchant.merchantsManager().setId((Object)merchant.merchantsManager().getMerchantId());
            }
        }
        if (merchant.merchantsManager() != null) {
            if (StringUtils.isNotBlank((CharSequence)merchant.merchantsManager().getMobile()) || StringUtils.isNotBlank((CharSequence)merchant.merchantsManager().getEmail())) {
                if (StringUtils.isBlank((CharSequence)merchant.merchantsManager().getFullName())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800444);
                }
                merchant.merchantsManager().setFullName(MerchantUtils.replaceStr((String)merchant.merchantsManager().getFullName()));
                if (StringUtils.isNotBlank((CharSequence)merchant.merchantsManager().getMobile()) && StringUtils.isBlank((CharSequence)merchant.merchantsManager().getCountryCode())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800445, new Object[]{merchant.getCode()});
                }
                if (!((MerchantUtils.isExists((Map)merchant, (String)"data_from") || merchant.get("_fromApi") == null || !((Boolean)merchant.get("_fromApi")).booleanValue()) && (MerchantUtils.isExists((Map)merchant, (String)"data_from") || merchant.get("importSpecialKey_merchant") == null) || merchant.merchantRole() == null || merchant.merchantRole().getBusinessRole() != null && (merchant.merchantRole().getBusinessRole().contains("4") || merchant.merchantRole().getBusinessRole().contains("3") || merchant.merchantRole().getBusinessRole().contains("5") || merchant.merchantRole().getBusinessRole().contains("2") || merchant.merchantRole().getBusinessRole().contains("6")))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800446, new Object[]{merchant.getCode()});
                }
            } else if (StringUtils.isNotBlank((CharSequence)merchant.merchantsManager().getFullName())) {
                if (StringUtils.isBlank((CharSequence)merchant.merchantsManager().getMobile()) || StringUtils.isBlank((CharSequence)merchant.merchantsManager().getEmail())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800447);
                }
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800448, new Object[]{merchant.getCode()});
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id, mobile, email, fullName").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId())}));
            Map stringObjectMap = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantsManager", (QuerySchema)querySchema);
            if (stringObjectMap != null && !stringObjectMap.isEmpty()) {
                if (merchant.merchantsManager() != null && !merchant.merchantsManager().getFullName().equals(stringObjectMap.get("fullName"))) {
                    if (stringObjectMap.get("mobile") != null && stringObjectMap.get("email") != null && stringObjectMap.get("mobile").equals(merchant.merchantsManager().getMobile()) && stringObjectMap.get("email").equals(merchant.merchantsManager().getEmail())) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800449);
                    }
                    if (stringObjectMap.get("mobile") != null && stringObjectMap.get("mobile").equals(merchant.merchantsManager().getMobile())) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800449);
                    }
                    if (stringObjectMap.get("email") != null && stringObjectMap.get("email").equals(merchant.merchantsManager().getEmail())) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800449);
                    }
                }
                merchant.merchantsManager().setEntityStatus(EntityStatus.Update);
                merchant.merchantsManager().setId(stringObjectMap.get("id"));
            } else {
                merchant.merchantsManager().setEntityStatus(EntityStatus.Insert);
            }
        }
    }

    private void theMerchantRoleCheck(Merchant merchant, Boolean singleOrg, LoginUser currentUser) throws Exception {
        Map merchantRole;
        QuerySchema querySchemaRole;
        if (merchant.merchantRole() == null) {
            querySchemaRole = QuerySchema.create();
            querySchemaRole.addSelect("id,merchantId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId())}));
            merchantRole = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)querySchemaRole);
            if (merchantRole == null) {
                MerchantRoleInfo merchantRoleInfo = new MerchantRoleInfo();
                merchantRoleInfo.setId((Object)IdManager.getInstance().nextId());
                merchantRoleInfo.setMerchantId((Long)merchant.getId());
                merchantRoleInfo.setBusinessRole("1");
                merchantRoleInfo.set("merchantOptions", (Object)false);
                merchantRoleInfo.setEntityStatus(EntityStatus.Insert);
                merchant.setMerchantRole(merchantRoleInfo);
            }
        } else {
            querySchemaRole = QuerySchema.create();
            querySchemaRole.addSelect("id,merchantId,merchantOptions,businessRole").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId())}));
            merchantRole = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)querySchemaRole);
            if (merchantRole != null) {
                merchant.merchantRole().setId(merchantRole.get("id"));
                if (!merchant.merchantRole().containsKey((Object)"merchantOptions") && merchantRole.get("merchantOptions") != null) {
                    merchant.merchantRole().set("merchantOptions", merchantRole.get("merchantOptions"));
                }
                if (!merchant.merchantRole().containsKey((Object)"businessRole") && merchantRole.get("businessRole") != null) {
                    merchant.merchantRole().setBusinessRole(merchantRole.get("businessRole").toString());
                }
                merchant.merchantRole().setEntityStatus(EntityStatus.Update);
            } else {
                if (merchant.merchantRole().getId() == null) {
                    merchant.merchantRole().setId((Object)IdManager.getInstance().nextId());
                }
                merchant.merchantRole().setEntityStatus(EntityStatus.Insert);
            }
        }
        if (merchant.merchantRole() != null && merchant.merchantRole().get("merchantOptions") == null) {
            if (merchant.get("merchantOptions") != null) {
                merchant.merchantRole().set("merchantOptions", merchant.get("merchantOptions"));
            } else {
                merchant.merchantRole().set("merchantOptions", (Object)false);
            }
        }
        if (merchant.merchantRole() != null && StringUtils.isBlank((CharSequence)merchant.merchantRole().getBusinessRole())) {
            merchant.merchantRole().setBusinessRole("1");
        }
        if (!CollectionUtils.isEmpty((Map)merchant.merchantRole())) {
            String businessRole = merchant.merchantRole().getBusinessRole();
            Object isOpenportalMG = OptionUtils.getOptionByName((String)"u8c-config", (String)"app:portalMG", null);
            OptionData isOpenURetail = OptionUtils.getOptionByName((String)"u8c-config", (String)"app:RM");
            boolean sdma = ProductUtil.checkOpenOption("u8c-config", DomainOpenEnum.MALL.getServiceName());
            Object channelnoticesettinglist = OptionUtils.getSysOptionByName((String)"service:channelnoticesettinglist");
            Object prm = OptionUtils.getSysOptionByName((String)"app:PRM");
            String defaultOpen = "0";
            String defaultOpenApp = "false";
            if (singleOrg.booleanValue() && (currentUser.getUserType() == UserType.TenantAdmin || currentUser.getUserType() == UserType.TenantEmployee || currentUser.getUserType() == UserType.TenantShopuser || currentUser.getUserType() == UserType.JoinUser) && (businessRole.contains("4") || businessRole.contains("3") || businessRole.contains("5"))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800450);
            }
            if (businessRole.contains("2") && isOpenportalMG != null && (defaultOpen.equals(isOpenportalMG.toString()) || defaultOpenApp.equals(isOpenportalMG.toString()))) {
                String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1AE0643A04D00025", (String)"\u6ca1\u6709\u5f00\u901a\u8ba2\u8d27\u7ba1\u7406\uff0c\u3010\u4e1a\u52a1\u89d2\u8272\u3011\u5b57\u6bb5\u4e0d\u80fd\u5f55\u5165B2B\u5546\u57ce\u5ba2\u6237"), new Object[0]);
                throw new CoreDocBusinessException(msg);
            }
            if (businessRole.contains("3") && channelnoticesettinglist != null && defaultOpenApp.equals(channelnoticesettinglist.toString())) {
                String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804ED", (String)"\u6ca1\u6709\u5f00\u901a\u6e20\u9053\u8fd0\u8425\u4e2d\u5fc31.0\uff0c\u3010\u4e1a\u52a1\u89d2\u8272\u3011\u5b57\u6bb5\u4e0d\u80fd\u5f55\u51652B\u5546\u5bb6"), new Object[0]);
                throw new CoreDocBusinessException(msg);
            }
            if (isOpenURetail != null && (defaultOpen.equals(isOpenURetail.toString()) || defaultOpenApp.equals(isOpenURetail.toString())) && businessRole.contains("4")) {
                String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804F1", (String)"\u6ca1\u6709\u5f00\u901a\u53cb\u96f6\u552e\uff0c\u3010\u4e1a\u52a1\u89d2\u8272\u3011\u5b57\u6bb5\u4e0d\u80fd\u5f55\u5165\u96f6\u552e\u52a0\u76df\u5546"), new Object[0]);
                throw new CoreDocBusinessException(msg);
            }
            if (!sdma && businessRole.contains("5")) {
                String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804F4", (String)"\u6ca1\u6709\u5f00\u901a\u5546\u57ce\u5e94\u7528\uff0c\u3010\u4e1a\u52a1\u89d2\u8272\u3011\u5b57\u6bb5\u4e0d\u80fd\u5f55\u51652C\u5546\u5bb6"), new Object[0]);
                throw new CoreDocBusinessException(msg);
            }
            if (prm != null && defaultOpenApp.equals(prm.toString()) && businessRole.contains("6")) {
                String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804F8", (String)"\u6ca1\u6709\u5f00\u901a\u4f19\u4f34\u7ba1\u7406\uff0c\u3010\u4e1a\u52a1\u89d2\u8272\u3011\u5b57\u6bb5\u4e0d\u80fd\u5f55\u5165\u4f19\u4f34\u5ba2\u6237"), new Object[0]);
                throw new CoreDocBusinessException(msg);
            }
            if (merchant.merchantRole().get("merchantOptions") != null && merchant.merchantRole().get("merchantOptions").equals(false) && merchant.merchantRole().getBusinessRole() != null && (merchant.merchantRole().getBusinessRole().contains("4") || merchant.merchantRole().getBusinessRole().contains("3") || merchant.merchantRole().getBusinessRole().contains("5") || merchant.merchantRole().getBusinessRole().contains("6"))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800451, new Object[]{merchant.getCode()});
            }
            if (merchant.merchantRole().getBusinessRole() != null && (merchant.merchantRole().getBusinessRole().contains("4") || merchant.merchantRole().getBusinessRole().contains("3") || merchant.merchantRole().getBusinessRole().contains("5") || merchant.merchantRole().getBusinessRole().contains("2") || merchant.merchantRole().getBusinessRole().contains("6"))) {
                QuerySchema querySchema;
                if (!(merchant.merchantsManager() != null && (StringUtils.isNotBlank((CharSequence)merchant.merchantsManager().getMobile()) || StringUtils.isNotBlank((CharSequence)merchant.merchantsManager().getEmail())) || "isBatchModifyMerchant".equals(merchant.get("isBatchModifyMerchant")))) {
                    if (merchant.merchantsManager() == null) {
                        querySchema = QuerySchema.create();
                        querySchema.addSelect("id,mobile,email,fullName");
                        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId())}));
                        List merchantsManagerOriginList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantsManager", (QuerySchema)querySchema, null);
                        if (CollectionUtils.isEmpty((Collection)merchantsManagerOriginList) || ObjectUtils.isEmpty((Object)((MerchantsManager)merchantsManagerOriginList.get(0)).getMobile()) && ObjectUtils.isEmpty((Object)((MerchantsManager)merchantsManagerOriginList.get(0)).getEmail())) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800452, new Object[]{merchant.getCode()});
                        }
                    } else if (merchant.merchantsManager().containsKey((Object)"mobile") && merchant.merchantsManager().getMobile() == null || merchant.merchantsManager().containsKey((Object)"email") && merchant.merchantsManager().getEmail() == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800452, new Object[]{merchant.getCode()});
                    }
                }
                if (merchant.merchantRole().getBusinessRole().contains("3") || merchant.merchantRole().getBusinessRole().contains("4") || merchant.merchantRole().getBusinessRole().contains("5")) {
                    List merchantApplyRangeDetailList = merchant.merchantAppliedDetail();
                    if (merchant.getEntityStatus() == EntityStatus.Insert) {
                        if (CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList) || ((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).getTransactionCurrency() == null) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808060, new Object[]{merchant.getCode()});
                        }
                        if ((currentUser.getUserType() == UserType.TenantAdmin || currentUser.getUserType() == UserType.TenantEmployee) && StringUtils.isEmpty((CharSequence)merchant.getParentManageOrg())) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800453);
                        }
                    } else if (merchant.getEntityStatus() == EntityStatus.Update) {
                        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList) && ((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).containsKey((Object)"transactionCurrency") && ((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).getTransactionCurrency() == null) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808060, new Object[]{merchant.getCode()});
                        }
                        if ((currentUser.getUserType() == UserType.TenantAdmin || currentUser.getUserType() == UserType.TenantEmployee) && StringUtils.isEmpty((CharSequence)merchant.getParentManageOrg())) {
                            QuerySchema querySchema2 = QuerySchema.create();
                            querySchema2.addSelect("parentManageOrg").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
                            List merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema2, null);
                            if (CollectionUtils.isEmpty((Collection)merchantInDbList)) {
                                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800453);
                            }
                        }
                    }
                }
                if (merchant.merchantRole().getBusinessRole().contains("3") || merchant.merchantRole().getBusinessRole().contains("4") || merchant.merchantRole().getBusinessRole().contains("5") || merchant.merchantRole().getBusinessRole().contains("6")) {
                    if (merchant.getInternalOrg() != null && merchant.getInternalOrg().booleanValue()) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800441);
                    }
                    if (merchant.getInternalOrg() == null) {
                        querySchema = QuerySchema.create();
                        querySchema.addSelect("internalOrg");
                        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
                        List merchantOriginList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
                        if (!CollectionUtils.isEmpty((Collection)merchantOriginList) && ((Merchant)merchantOriginList.get(0)).getInternalOrg() != null && ((Merchant)merchantOriginList.get(0)).getInternalOrg().booleanValue()) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800441);
                        }
                    }
                }
            }
        }
    }

    private void theAgentFinancialCheck(Merchant merchant) throws Exception {
        List agentFinancialList = merchant.merchantAgentFinancialInfos();
        if (!CollectionUtils.isEmpty((Collection)agentFinancialList)) {
            int i = 0;
            HashSet<AgentFinancial> agentFinancialSetList = new HashSet<AgentFinancial>();
            ArrayList<Long> agentFinancialIdList = new ArrayList<Long>();
            for (AgentFinancial agentFinancial : agentFinancialList) {
                if (!StringUtils.isEmpty((CharSequence)agentFinancial.getBankAccount())) {
                    agentFinancial.setBankAccount(agentFinancial.getBankAccount().replace(" ", ""));
                }
                if (agentFinancial.getEntityStatus() != EntityStatus.Delete) {
                    AgentFinancial agentFinancialSet = new AgentFinancial();
                    agentFinancialSet.setCurrency(agentFinancial.getCurrency());
                    agentFinancialSet.setBank(agentFinancial.getBank());
                    agentFinancialSet.setBankAccount(agentFinancial.getBankAccount());
                    agentFinancialSet.setOpenBank(agentFinancial.getOpenBank());
                    agentFinancialSetList.add(agentFinancialSet);
                    ++i;
                }
                agentFinancialIdList.add((Long)agentFinancial.getId());
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("currency,bank,bankAccount,openBank");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").not_in(agentFinancialIdList), QueryCondition.name((String)"merchantId").eq(merchant.getId())}));
            List agentFinancialSQLList = MetaDaoHelper.queryObject((String)"aa.merchant.AgentFinancial", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)agentFinancialSQLList)) {
                for (AgentFinancial agentFinancialSQL : agentFinancialSQLList) {
                    AgentFinancial agentFinancialSet = new AgentFinancial();
                    agentFinancialSet.setCurrency(agentFinancialSQL.getCurrency());
                    agentFinancialSet.setBank(agentFinancialSQL.getBank());
                    agentFinancialSet.setBankAccount(agentFinancialSQL.getBankAccount());
                    agentFinancialSet.setOpenBank(agentFinancialSQL.getOpenBank());
                    agentFinancialSetList.add(agentFinancialSet);
                }
                i += agentFinancialSQLList.size();
            }
            if (agentFinancialSetList.size() != i) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800454, new Object[]{merchant.getCode()});
            }
        }
    }

    private void theAgentInvoiceCheck(Merchant merchant) {
        List agentInvoiceList = merchant.merchantAgentInvoiceInfos();
        if (!CollectionUtils.isEmpty((Collection)agentInvoiceList)) {
            for (AgentInvoice agentInvoice : agentInvoiceList) {
                if (agentInvoice.containsKey((Object)"bdBillingType")) {
                    if (agentInvoice.getBdBillingType() == null) {
                        agentInvoice.setBillingType(null);
                        continue;
                    }
                    short invoiceType = MerchantUtils.getInvoiceType((String)agentInvoice.getBdBillingType());
                    if (invoiceType == 100) {
                        agentInvoice.setBillingType(null);
                        continue;
                    }
                    agentInvoice.setBillingType(InvoiceType.find((Number)invoiceType));
                    continue;
                }
                if (!agentInvoice.containsKey((Object)"billingType")) continue;
                if (agentInvoice.getBillingType() == null) {
                    agentInvoice.setBdBillingType(null);
                    continue;
                }
                agentInvoice.setBdBillingType(MerchantUtils.getInvoiceTypeVO((short)agentInvoice.getBillingType().getValue()));
            }
        }
    }

    private void theCustomerAreaCheck(Merchant merchant) {
        List customerAreaList = merchant.customerAreas();
        if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
            CustomerArea customerArea2;
            Iterator customerAreaIterator;
            if (EntityStatus.Insert.equals((Object)merchant.getEntityStatus())) {
                customerAreaIterator = customerAreaList.iterator();
                while (customerAreaIterator.hasNext()) {
                    customerArea2 = (CustomerArea)customerAreaIterator.next();
                    if (customerArea2.getId() == null || customerArea2.getSaleAreaId() != null) continue;
                    customerAreaIterator.remove();
                }
            } else if (EntityStatus.Update.equals((Object)merchant.getEntityStatus())) {
                customerAreaIterator = customerAreaList.iterator();
                while (customerAreaIterator.hasNext()) {
                    customerArea2 = (CustomerArea)customerAreaIterator.next();
                    if (customerArea2.getId() != null && customerArea2.getSaleAreaId() == null && customerArea2.getEntityStatus() == EntityStatus.Update) {
                        customerArea2.setEntityStatus(EntityStatus.Delete);
                        continue;
                    }
                    if (customerArea2.getId() == null || customerArea2.getSaleAreaId() != null || customerArea2.getEntityStatus() != EntityStatus.Insert) continue;
                    customerAreaIterator.remove();
                }
            }
            if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
                for (CustomerArea customerArea2 : customerAreaList) {
                    if (customerArea2.getIsDefault() != null) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800455);
                }
            }
        }
    }

    private void thePrincipalCheck(Merchant merchant) throws Exception {
        List principalList = merchant.principals();
        if (!CollectionUtils.isEmpty((Collection)principalList)) {
            Principal principal2;
            Iterator principalIterator;
            if (EntityStatus.Insert.equals((Object)merchant.getEntityStatus())) {
                principalIterator = principalList.iterator();
                while (principalIterator.hasNext()) {
                    principal2 = (Principal)principalIterator.next();
                    if (principal2.getId() == null || principal2.getProfessSalesman() != null || principal2.getSpecialManagementDep() != null) continue;
                    principalIterator.remove();
                }
            } else if (EntityStatus.Update.equals((Object)merchant.getEntityStatus())) {
                principalIterator = principalList.iterator();
                while (principalIterator.hasNext()) {
                    principal2 = (Principal)principalIterator.next();
                    if (principal2.getId() != null && principal2.getProfessSalesman() == null && principal2.getSpecialManagementDep() == null && principal2.getEntityStatus() == EntityStatus.Update) {
                        principal2.setEntityStatus(EntityStatus.Delete);
                        continue;
                    }
                    if (principal2.getId() == null || principal2.getProfessSalesman() != null || principal2.getSpecialManagementDep() != null || principal2.getEntityStatus() != EntityStatus.Insert) continue;
                    principalIterator.remove();
                }
            }
            if (!CollectionUtils.isEmpty((Collection)principalList)) {
                for (Principal principal2 : principalList) {
                    if (principal2.getIsDefault() != null) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800456);
                }
            }
        }
    }

    private void theInvoicingCustomersCheck(Merchant merchant) {
        List invoicingCustomersList = merchant.invoicingCustomerss();
        if (!CollectionUtils.isEmpty((Collection)invoicingCustomersList)) {
            InvoicingCustomers invoicingCustomers2;
            Iterator invoicingCustomersIterator;
            if (EntityStatus.Insert.equals((Object)merchant.getEntityStatus())) {
                invoicingCustomersIterator = invoicingCustomersList.iterator();
                while (invoicingCustomersIterator.hasNext()) {
                    invoicingCustomers2 = (InvoicingCustomers)invoicingCustomersIterator.next();
                    if (invoicingCustomers2.getId() == null || invoicingCustomers2.getInvoicingCustomersId() != null) continue;
                    invoicingCustomersIterator.remove();
                }
            } else if (EntityStatus.Update.equals((Object)merchant.getEntityStatus())) {
                invoicingCustomersIterator = invoicingCustomersList.iterator();
                while (invoicingCustomersIterator.hasNext()) {
                    invoicingCustomers2 = (InvoicingCustomers)invoicingCustomersIterator.next();
                    if (invoicingCustomers2.getId() != null && invoicingCustomers2.getInvoicingCustomersId() == null && invoicingCustomers2.getEntityStatus() == EntityStatus.Update) {
                        invoicingCustomers2.setEntityStatus(EntityStatus.Delete);
                        continue;
                    }
                    if (invoicingCustomers2.getId() == null || invoicingCustomers2.getInvoicingCustomersId() != null || invoicingCustomers2.getEntityStatus() != EntityStatus.Insert) continue;
                    invoicingCustomersIterator.remove();
                }
            }
            if (!CollectionUtils.isEmpty((Collection)invoicingCustomersList)) {
                for (InvoicingCustomers invoicingCustomers2 : invoicingCustomersList) {
                    if (invoicingCustomers2.getIsDefault() != null) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800457);
                }
            }
        }
    }

    private void theMerchantApplyRangeCheck(Merchant merchant) throws Exception {
        block6: {
            List merchantApplyRangeList;
            block5: {
                if (!EntityStatus.Insert.equals((Object)merchant.getEntityStatus())) break block5;
                List merchantApplyRangeList2 = merchant.merchantApplyRanges();
                if (CollectionUtils.isEmpty((Collection)merchantApplyRangeList2) || !MerchantUtils.isExists((Map)merchant, (String)"createOrg")) break block6;
                for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList2) {
                    if (merchant.getCreateOrg().equals(merchantApplyRange.getOrgId())) {
                        merchantApplyRange.setIsCreator(Boolean.valueOf(true));
                        merchantApplyRange.setIsApplied(Boolean.valueOf(true));
                    }
                    if (EntityStatus.Update != merchantApplyRange.getEntityStatus()) continue;
                    if (merchantApplyRange.getId() == null) {
                        merchantApplyRange.setId((Object)IdManager.getInstance().nextId());
                    }
                    merchantApplyRange.setEntityStatus(EntityStatus.Insert);
                }
                break block6;
            }
            if (EntityStatus.Update.equals((Object)merchant.getEntityStatus()) && !CollectionUtils.isEmpty((Collection)(merchantApplyRangeList = merchant.merchantApplyRanges()))) {
                for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                    if (merchantApplyRange.getOrgId() == null || merchantApplyRange.getEntityStatus() != EntityStatus.Insert) continue;
                    QuerySchema querySchema = QuerySchema.create();
                    querySchema.addSelect("id,isPotential");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)merchantApplyRange.getOrgId()), QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())}));
                    querySchema.setPartitionable(false);
                    List originalMerchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
                    if (CollectionUtils.isEmpty((Collection)originalMerchantApplyRangeList) || ((MerchantApplyRange)originalMerchantApplyRangeList.get(0)).getIsPotential() == null || !((MerchantApplyRange)originalMerchantApplyRangeList.get(0)).getIsPotential().booleanValue()) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800458);
                }
            }
        }
    }

    private void theMerchantApplyRangeDetailCheck(Merchant merchant) throws Exception {
        List merchantApplyRangeDetailList = merchant.merchantAppliedDetail();
        if (CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList)) {
            return;
        }
        if (merchant.getEntityStatus() == EntityStatus.Update) {
            boolean isTransactionCurrency = false;
            for (MerchantApplyRangeDetail merchantApplyRangeDetail : merchantApplyRangeDetailList) {
                if (merchantApplyRangeDetail.containsKey((Object)"isTradeCustomers") && merchantApplyRangeDetail.getIsTradeCustomers() == null) {
                    merchantApplyRangeDetail.setIsTradeCustomers(IsTradeCustomers.tradeCustomers.getValue());
                }
                if (!merchantApplyRangeDetail.containsKey((Object)"transactionCurrency") || merchantApplyRangeDetail.getTransactionCurrency() != null) continue;
                isTransactionCurrency = true;
            }
            if (isTransactionCurrency && merchant.merchantRole() == null) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("businessRole").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId())}));
                List merchantRoleInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)querySchema, null);
                if (!CollectionUtils.isEmpty((Collection)merchantRoleInDbList) && (((MerchantRoleInfo)merchantRoleInDbList.get(0)).getBusinessRole().contains("3") || ((MerchantRoleInfo)merchantRoleInDbList.get(0)).getBusinessRole().contains("4") || ((MerchantRoleInfo)merchantRoleInDbList.get(0)).getBusinessRole().contains("5"))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808060, new Object[]{merchant.getCode()});
                }
            }
        }
    }

    private void theMerchantAddressInfosCheck(Merchant merchant) throws Exception {
        List addressInfoList = merchant.merchantAddressInfos();
        if (!CollectionUtils.isEmpty((Collection)addressInfoList)) {
            boolean isDefault = false;
            for (AddressInfo addressInfo : addressInfoList) {
                if (addressInfo.getEntityStatus() == EntityStatus.Insert && StringUtils.isEmpty((CharSequence)addressInfo.getStopStatus())) {
                    addressInfo.setStopStatus(StopStatusChar.unStop);
                }
                if (addressInfo.getEntityStatus() != EntityStatus.Delete && addressInfo.getIsDefault() != null && addressInfo.getIsDefault().booleanValue()) {
                    isDefault = true;
                    if (StopStatusChar.stop.getValue().equals(addressInfo.getStopStatus())) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800459);
                    }
                }
                if (MerchantUtils.getFromApiMerchant((Merchant)merchant)) continue;
                this.merchantCheckService.checkAddressInfoRegionCode(addressInfo);
            }
            if (!isDefault) {
                for (AddressInfo addressInfo : addressInfoList) {
                    if (addressInfo.getEntityStatus() != EntityStatus.Update || !StopStatusChar.stop.getValue().equals(addressInfo.getStopStatus()) || addressInfo.getIsDefault() != null) continue;
                    QuerySchema querySchema = QuerySchema.create();
                    querySchema.addSelect("isDefault");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(addressInfo.getId())}));
                    List originalAddressInfoList = MetaDaoHelper.queryObject((String)"aa.merchant.AddressInfo", (QuerySchema)querySchema, null);
                    if (CollectionUtils.isEmpty((Collection)originalAddressInfoList) || !((AddressInfo)originalAddressInfoList.get(0)).getIsDefault().booleanValue()) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800459);
                }
            }
        }
    }

    private void theMerchantContactInfosCheck(Merchant merchant) throws Exception {
        List contacterList = merchant.merchantContacterInfos();
        if (!CollectionUtils.isEmpty((Collection)contacterList)) {
            for (Contacter contacter : contacterList) {
                if (contacter.getEntityStatus() != EntityStatus.Insert || !contacter.containsKey((Object)"stopStatus") || !StringUtils.isEmpty((CharSequence)contacter.getStopStatus())) continue;
                contacter.setStopStatus(StopStatusChar.unStop);
            }
        }
    }

    private void theMerchantQualificationDocumentCheck(Merchant merchant) throws Exception {
        List merchantQualificationDocumentList;
        if (merchant.getEntityStatus() == EntityStatus.Insert) {
            List merchantQualificationDocumentList2 = merchant.merchantQualificationDocuments();
            if (!CollectionUtils.isEmpty((Collection)merchantQualificationDocumentList2) && merchantQualificationDocumentList2.size() > 50) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800460);
            }
            if (!CollectionUtils.isEmpty((Collection)merchantQualificationDocumentList2)) {
                for (MerchantQualificationDocument merchantQualificationDocument : merchantQualificationDocumentList2) {
                    if (!StringUtils.isEmpty((CharSequence)merchantQualificationDocument.getDocumentUploader())) continue;
                    merchantQualificationDocument.setDocumentUploader(AppContext.getCurrentUser().getName());
                    merchantQualificationDocument.setDocumentUploaderTime(new Date());
                }
            }
        } else if (!(merchant.getEntityStatus() != EntityStatus.Update && merchant.getEntityStatus() != EntityStatus.Unchanged || CollectionUtils.isEmpty((Collection)(merchantQualificationDocumentList = merchant.merchantQualificationDocuments())))) {
            int size = 0;
            ArrayList<String> idList = new ArrayList<String>();
            for (MerchantQualificationDocument merchantQualificationDocument : merchantQualificationDocumentList) {
                if (merchantQualificationDocument.getEntityStatus() != EntityStatus.Delete) {
                    ++size;
                }
                if (merchantQualificationDocument.getEntityStatus() == EntityStatus.Update) {
                    if (StringUtils.isEmpty((CharSequence)merchantQualificationDocument.getInformationModifier())) {
                        merchantQualificationDocument.setInformationModifier(AppContext.getCurrentUser().getName());
                        merchantQualificationDocument.setInformationModifyTime(new Date());
                    }
                } else if (merchantQualificationDocument.getEntityStatus() == EntityStatus.Insert && StringUtils.isEmpty((CharSequence)merchantQualificationDocument.getDocumentUploader())) {
                    merchantQualificationDocument.setDocumentUploader(AppContext.getCurrentUser().getName());
                    merchantQualificationDocument.setDocumentUploaderTime(new Date());
                }
                idList.add(merchantQualificationDocument.getId().toString());
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"id").not_in(idList)}));
            List originalMerchantQualificationDocumentList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantQualificationDocument", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)originalMerchantQualificationDocumentList)) {
                size += originalMerchantQualificationDocumentList.size();
            }
            if (size > 50) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800460);
            }
        }
    }

    private void syncNCCToMerchant(Merchant merchant) throws Exception {
        if (MerchantUtils.isExists((Map)merchant, (String)"data_from") && merchant.get("_fromApi") != null && ((Boolean)merchant.get("_fromApi")).booleanValue() || MerchantUtils.isExists((Map)merchant, (String)"data_from") && merchant.get("importSpecialKey_merchant") != null) {
            this.syncCheck(merchant);
            this.syncNCCToAgentFinancial(merchant);
            this.syncNCCToAddressInfo(merchant);
            this.syncNCCToContacter(merchant);
            this.syncNCCToAgentInvoice(merchant);
        }
    }

    private void syncNCCToAddressInfo(Merchant merchant) throws Exception {
        List addressInfoList = merchant.merchantAddressInfos();
        if (!CollectionUtils.isEmpty((Collection)addressInfoList)) {
            boolean isDefault = false;
            ArrayList<Long> addressInfoId = new ArrayList<Long>();
            for (AddressInfo addressInfo : addressInfoList) {
                if (addressInfo.getIsDefault() != null && addressInfo.getIsDefault().booleanValue()) {
                    isDefault = true;
                } else if (addressInfo.getIsDefault() == null) {
                    addressInfo.setIsDefault(Boolean.valueOf(false));
                }
                addressInfoId.add((Long)addressInfo.getId());
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").not_in(addressInfoId), QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)true)}));
            List addressInfoList_SQL = MetaDaoHelper.queryObject((String)"aa.merchant.AddressInfo", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)addressInfoList_SQL)) {
                if (isDefault) {
                    for (AddressInfo addressInfo : addressInfoList_SQL) {
                        addressInfo.setIsDefault(Boolean.valueOf(false));
                        addressInfo.setEntityStatus(EntityStatus.Update);
                    }
                    MetaDaoHelper.update((String)"aa.merchant.AddressInfo", (List)addressInfoList_SQL);
                }
                isDefault = true;
            }
            if (!isDefault) {
                ((AddressInfo)addressInfoList.get(0)).setIsDefault(Boolean.valueOf(true));
            }
        }
    }

    private void syncNCCToContacter(Merchant merchant) throws Exception {
        List contacterList = merchant.merchantContacterInfos();
        if (!CollectionUtils.isEmpty((Collection)contacterList)) {
            boolean isDefault = false;
            ArrayList<Long> contacterId = new ArrayList<Long>();
            for (Contacter contacter : contacterList) {
                if (contacter.getIsDefault() != null && contacter.getIsDefault().booleanValue()) {
                    isDefault = true;
                } else if (contacter.getIsDefault() == null) {
                    contacter.setIsDefault(Boolean.valueOf(false));
                }
                contacterId.add((Long)contacter.getId());
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").not_in(contacterId), QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)true)}));
            List contacterList_SQL = MetaDaoHelper.queryObject((String)"aa.merchant.Contacter", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)contacterList_SQL)) {
                if (isDefault) {
                    for (Contacter contacter : contacterList_SQL) {
                        contacter.setIsDefault(Boolean.valueOf(false));
                        contacter.setEntityStatus(EntityStatus.Update);
                    }
                    MetaDaoHelper.update((String)"aa.merchant.Contacter", (List)contacterList_SQL);
                }
                isDefault = true;
            }
            if (!isDefault) {
                ((Contacter)contacterList.get(0)).setIsDefault(Boolean.valueOf(true));
            }
        }
    }

    private void syncCheck(Merchant merchant) {
        if (EntityStatus.Unchanged == merchant.getEntityStatus() && !MerchantUtils.isExists((Map)merchant, (String)"id")) {
            String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804E0", (String)"\u8be5\u5ba2\u6237\u6ca1\u6709\u540c\u6b65\u6210\u529f!"), new Object[0]);
            throw new CoreDocBusinessException(msg);
        }
    }

    private void syncNCCToAgentFinancial(Merchant merchant) throws Exception {
        List agentFinancialList = merchant.merchantAgentFinancialInfos();
        if (!CollectionUtils.isEmpty((Collection)agentFinancialList)) {
            boolean isDefault = false;
            ArrayList<Long> agentFinancialId = new ArrayList<Long>();
            for (AgentFinancial agentFinancial : agentFinancialList) {
                if (agentFinancial.getIsDefault() != null && agentFinancial.getIsDefault().booleanValue()) {
                    isDefault = true;
                } else if (agentFinancial.getIsDefault() == null) {
                    agentFinancial.setIsDefault(Boolean.valueOf(false));
                }
                agentFinancialId.add((Long)agentFinancial.getId());
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").not_in(agentFinancialId), QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)true)}));
            List AgentFinancialList_SQL = MetaDaoHelper.queryObject((String)"aa.merchant.AgentFinancial", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)AgentFinancialList_SQL)) {
                if (isDefault) {
                    for (AgentFinancial agentFinancial : AgentFinancialList_SQL) {
                        agentFinancial.setIsDefault(Boolean.valueOf(false));
                        agentFinancial.setEntityStatus(EntityStatus.Update);
                    }
                    MetaDaoHelper.update((String)"aa.merchant.AgentFinancial", (List)AgentFinancialList_SQL);
                }
                isDefault = true;
            }
            if (!isDefault) {
                ((AgentFinancial)agentFinancialList.get(0)).setIsDefault(Boolean.valueOf(true));
            }
        }
    }

    private void syncNCCToAgentInvoice(Merchant merchant) throws Exception {
        List agentInvoiceList = merchant.merchantAgentInvoiceInfos();
        if (!CollectionUtils.isEmpty((Collection)agentInvoiceList)) {
            boolean isDefault = false;
            ArrayList<Long> agentInvoiceId = new ArrayList<Long>();
            for (AgentInvoice agentInvoice : agentInvoiceList) {
                if (agentInvoice.getIsDefault() != null && agentInvoice.getIsDefault().booleanValue()) {
                    isDefault = true;
                } else if (agentInvoice.getIsDefault() == null) {
                    agentInvoice.setIsDefault(Boolean.valueOf(false));
                }
                agentInvoiceId.add((Long)agentInvoice.getId());
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").not_in(agentInvoiceId), QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)true)}));
            List agentInvoiceList_SQL = MetaDaoHelper.queryObject((String)"aa.merchant.AgentInvoice", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)agentInvoiceList_SQL)) {
                if (isDefault) {
                    for (AgentInvoice agentInvoice : agentInvoiceList_SQL) {
                        agentInvoice.setIsDefault(Boolean.valueOf(false));
                        agentInvoice.setEntityStatus(EntityStatus.Update);
                    }
                    MetaDaoHelper.update((String)"aa.merchant.AgentInvoice", (List)agentInvoiceList_SQL);
                }
                isDefault = true;
            }
            if (!isDefault) {
                ((AgentInvoice)agentInvoiceList.get(0)).setIsDefault(Boolean.valueOf(true));
            }
        }
    }

    public void updateRoleInfoDeleteUser(Merchant merchant) throws Exception {
        if (EntityStatus.Update.equals((Object)merchant.getEntityStatus())) {
            QuerySchema querySchema;
            String businessRole = merchant.merchantRole().getBusinessRole();
            Map merchantsManager = new HashMap();
            String oldBusinessRole = null;
            BizObject bill = new BizObject();
            bill.setId(merchant.getId());
            if (!businessRole.contains("2") && !businessRole.contains("6")) {
                if (oldBusinessRole == null) {
                    oldBusinessRole = MerchantUtils.getMerchantRoleInfoBusinessRole((BizObject)bill);
                }
                if (oldBusinessRole.contains("2") || oldBusinessRole.contains("6")) {
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("yhtUserId");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId())}));
                    merchantsManager = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantsManager", (QuerySchema)querySchema);
                    if (!CollectionUtils.isEmpty(merchantsManager)) {
                        ArrayList<String> userIds = new ArrayList<String>(1);
                        userIds.add(merchantsManager.get("yhtUserId").toString());
                        this.iupcMerchantSyncService.deleteUserType(AppContext.getCurrentUser().getYhtTenantId(), String.valueOf(UserType.TenantShopuser.getValue()), RES_CODE, userIds, merchant.getId().toString());
                    }
                }
            }
            if (!(businessRole.contains("3") || businessRole.contains("4") || businessRole.contains("5"))) {
                if (oldBusinessRole == null) {
                    oldBusinessRole = MerchantUtils.getMerchantRoleInfoBusinessRole((BizObject)bill);
                }
                if (oldBusinessRole.contains("3") || oldBusinessRole.contains("4") || oldBusinessRole.contains("5")) {
                    if (CollectionUtils.isEmpty(merchantsManager)) {
                        querySchema = QuerySchema.create();
                        querySchema.addSelect("yhtUserId");
                        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId())}));
                        merchantsManager = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantsManager", (QuerySchema)querySchema);
                    }
                    if (!CollectionUtils.isEmpty(merchantsManager)) {
                        ArrayList<String> userIds = new ArrayList<String>(1);
                        userIds.add(merchantsManager.get("yhtUserId").toString());
                        this.iupcMerchantSyncService.deleteUserType(AppContext.getCurrentUser().getYhtTenantId(), String.valueOf(UserType.ShopAdminUser.getValue()), RES_CODE, userIds, merchant.getId().toString());
                    }
                }
            }
        }
    }

    private void importCheck(Merchant merchant, BillDataDto billDataDto) {
        if ((merchant.get("_fromApi") != null && ((Boolean)merchant.get("_fromApi")).booleanValue() || merchant.get("importSpecialKey_merchant") != null) && ("aa_merchant".equals(billDataDto.getBillnum()) || "aa_merchantexport".equals(billDataDto.getBillnum())) && billDataDto.getImportType() != null && billDataDto.getImportMode() != null && billDataDto.getImportType() == 1 && billDataDto.getImportMode() == 0 && merchant.containsKey((Object)"merchantAppliedDetailExt")) {
            merchant.remove("merchantAppliedDetailExt");
        }
    }

    private void checkAddressCode(List<AddressInfo> addresses, Long merchantId) throws Exception {
        if (!CollectionUtils.isEmpty(addresses)) {
            List addressCodeMap;
            HashSet addressIds = new HashSet();
            addresses.forEach(address -> {
                if (address.getId() != null) {
                    addressIds.add(address.getId().toString());
                }
            });
            HashSet addressCodeSet = new HashSet();
            if (merchantId != null) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("id,addressCode");
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
                if (!CollectionUtils.isEmpty(addressIds)) {
                    queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").not_in(addressIds));
                }
                querySchema.addCondition((ConditionExpression)queryConditionGroup);
                addressCodeMap = MetaDaoHelper.query((String)"aa.merchant.AddressInfo", (QuerySchema)querySchema);
                if (!CollectionUtils.isEmpty((Collection)addressCodeMap)) {
                    addressCodeMap.forEach(codeMap -> {
                        if (codeMap.get("addressCode") != null && !addressCodeSet.contains(codeMap.get("addressCode").toString())) {
                            addressCodeSet.add(codeMap.get("addressCode").toString());
                        }
                    });
                }
            }
            HashSet ids = new HashSet();
            addresses.forEach(address -> {
                if (address.getEntityStatus() != EntityStatus.Delete) {
                    String addressCode = address.getAddressCode();
                    if (addressCode == null || addressCode.length() == 0) {
                        ids.add(address.getId().toString());
                    } else {
                        if (addressCodeSet.contains(addressCode)) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800461);
                        }
                        addressCodeSet.add(addressCode);
                    }
                }
            });
            if (!ids.isEmpty()) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("id,addressCode");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(ids)}));
                addressCodeMap = MetaDaoHelper.query((String)"aa.merchant.AddressInfo", (QuerySchema)querySchema);
                if (!CollectionUtils.isEmpty((Collection)addressCodeMap)) {
                    addressCodeMap.forEach(codeMap -> {
                        if (codeMap.get("addressCode") != null && addressCodeSet.contains(codeMap.get("addressCode").toString())) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800461);
                        }
                        addressCodeSet.add(codeMap.get("addressCode").toString());
                    });
                }
            }
        }
    }

    private void checkDetailAddress(List<AddressInfo> addresses) throws Exception {
        if (!CollectionUtils.isEmpty(addresses)) {
            addresses.forEach(addressInfo -> {
                String address = addressInfo.getAddress();
                if (address != null && address.length() > 0 && address.endsWith(" ")) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800462);
                }
            });
        }
    }

    private void checkBankAccount(List<AgentFinancial> agentFinancialList) {
        if (!CollectionUtils.isEmpty(agentFinancialList)) {
            agentFinancialList.forEach(agentFinancial -> {
                if (agentFinancial.getEntityStatus() != EntityStatus.Delete && agentFinancial.getBankAccount() != null) {
                    String bankAccount = agentFinancial.getBankAccount();
                    if ((bankAccount = bankAccount.replace(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408051C", (String)"\uffe5"), "")) != null && bankAccount.length() > 0 && !UPCConstant4Regex.BANK_ACCOUNT.matcher(bankAccount).matches()) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800464);
                    }
                }
            });
        }
    }

    private void updateAgentFinancialStopStatus(Merchant merchant) {
        List agentFinancialList = merchant.merchantAgentFinancialInfos();
        if (!CollectionUtils.isEmpty((Collection)agentFinancialList) && EntityStatus.Insert.equals((Object)merchant.getEntityStatus())) {
            for (AgentFinancial agentFinancial : agentFinancialList) {
                if (agentFinancial == null || agentFinancial.getStopstatus() != null) continue;
                agentFinancial.setStopstatus(Boolean.valueOf(false));
            }
        }
    }

    private void updateMerchantEntityStatusForExport(Merchant merchant) throws Exception {
        QuerySchema schema;
        Map merchantId;
        if (merchant.getCode() != null && (merchantId = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)(schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)merchant.getCode())}))))) != null && !merchantId.isEmpty()) {
            merchant.setId(merchantId.get("id"));
            merchant.setEntityStatus(EntityStatus.Update);
        }
    }

    private void updateChildEntityStatus(Merchant merchant) {
        List merchantQualificationDocuments;
        List customerAreaList = merchant.customerAreas();
        List principalList = merchant.principals();
        if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
            for (CustomerArea customerArea : customerAreaList) {
                if (customerArea.getId() != null || customerArea.getEntityStatus() != null) continue;
                customerArea.setEntityStatus(EntityStatus.Insert);
                customerArea.setId((Object)IdManager.getInstance().nextId());
            }
        }
        if (!CollectionUtils.isEmpty((Collection)principalList)) {
            for (Principal principal : principalList) {
                if (principal.getId() != null || principal.getEntityStatus() != null) continue;
                principal.setEntityStatus(EntityStatus.Insert);
                principal.setId((Object)IdManager.getInstance().nextId());
            }
        }
        if (!CollectionUtils.isEmpty((Collection)(merchantQualificationDocuments = merchant.merchantQualificationDocuments()))) {
            for (MerchantQualificationDocument merchantQualificationDocument : merchantQualificationDocuments) {
                if (merchantQualificationDocument.get("importSpecialDocumentId") != null) {
                    merchantQualificationDocument.setId((Object)merchantQualificationDocument.get("importSpecialDocumentId").toString());
                    merchantQualificationDocument.setEntityStatus(EntityStatus.Update);
                    continue;
                }
                if (merchantQualificationDocument.getId() != null || merchantQualificationDocument.getEntityStatus() != null) continue;
                merchantQualificationDocument.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
                merchantQualificationDocument.setEntityStatus(EntityStatus.Insert);
            }
        }
        this.initializeEntityStatusAndIdsIfMissing(merchant.merchantAddressInfos());
        this.initializeEntityStatusAndIdsIfMissing(merchant.merchantContacterInfos());
        this.initializeEntityStatusAndIdsIfMissing(merchant.merchantAgentFinancialInfos());
        this.initializeEntityStatusAndIdsIfMissing(merchant.invoicingCustomerss());
        this.initializeEntityStatusAndIdsIfMissing(merchant.merchantAgentInvoiceInfos());
        this.initializeEntityStatusAndIdsIfMissing(merchant.merchantApplyRange());
    }

    private <T extends BizObject> void initializeEntityStatusAndIdsIfMissing(List<T> entityList) {
        if (!CollectionUtils.isEmpty(entityList)) {
            for (BizObject entity : entityList) {
                if (entity.getId() != null || entity.getEntityStatus() != null) continue;
                entity.setId((Object)IdManager.getInstance().nextId());
                entity.setEntityStatus(EntityStatus.Insert);
            }
        }
    }

    public boolean isCheckCreateOrg(Map mapCondition, Merchant merchant) {
        boolean isCheck = true;
        if (!CollectionUtils.isEmpty((Map)mapCondition) && BooleanUtil.isTrue(mapCondition.get("isChannelCustomer"))) {
            isCheck = false;
        } else if (MerchantUtils.isExists((Map)merchant, (String)"srcBill") && "CRM".equals(merchant.get("srcBill"))) {
            isCheck = false;
        } else if ("customerapply".equals(merchant.get("customerapply"))) {
            isCheck = false;
        }
        return isCheck;
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void lambda$execute$4(AddressInfo address) {
        if (MerchantUtils.isExists((Map)address, (String)"address")) {
            sb = new StringBuilder();
            if (MerchantUtils.isExists((Map)address, (String)"regionCode")) {
                try {
                    regionCorpList = this.merchantService.getMergerNameByRegionCode(address.getRegionCode());
                    if (CollectionUtils.isEmpty(regionCorpList)) ** GOTO lbl36
                    newMergerName = StringUtils.replace((String)((String)regionCorpList.get(0).get("mergerName")), (String)"|", (String)" ");
                    sb.append(newMergerName);
                }
                catch (Exception e) {
                    MerchantBeforeSaveRule.log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080510", (String)"\u5ba2\u6237\u6863\u6848\u5730\u5740\u4fe1\u606f\u9875\u7b7e\u884c\u653f\u533a\u5212\u7f16\u7801\u5904\u7406\u5f02\u5e38 :"), (Throwable)e);
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800435);
                }
            } else if (!address.containsKey((Object)"regionCode")) {
                try {
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("regionCode");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(address.getId())}));
                    addressInfo = MetaDaoHelper.query((String)"aa.merchant.AddressInfo", (QuerySchema)querySchema);
                    if (!CollectionUtils.isEmpty((Collection)addressInfo)) {
                        querySchema = QuerySchema.create();
                        querySchema.addSelect("mergerName");
                        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(((Map)addressInfo.get(0)).get("regionCode"))}));
                        regionCorp = MetaDaoHelper.query((String)"aa.regioncorp.RegionCorp", (QuerySchema)querySchema);
                        if (!CollectionUtils.isEmpty((Collection)regionCorp)) {
                            newMergerName = StringUtils.replace((String)((String)((Map)regionCorp.get(0)).get("mergerName")), (String)"|", (String)" ");
                            sb.append(newMergerName);
                        }
                    }
                }
                catch (Exception e) {
                    MerchantBeforeSaveRule.log.info("warn : ", (Throwable)e);
                }
            }
lbl36:
            // 6 sources

            sb.append(address.getAddress());
            address.setMergerName(sb.toString());
        }
    }
}

