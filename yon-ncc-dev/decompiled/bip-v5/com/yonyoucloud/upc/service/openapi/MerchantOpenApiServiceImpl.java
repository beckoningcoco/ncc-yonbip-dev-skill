/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.diwork.service.auth.IServiceIsolateService
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.constants.MerchantOpenApiFieldUtils
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.PubLongCommonVO
 *  com.yonyou.iuap.apdoc.coredoc.service.common.impl.CoreDocCustomExtendQueryService
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantAddressInfoVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantApplyRangeDetailVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantApplyRangeVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantBillingVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantContacterVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantFinancialVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantInvoiceVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantPrincipalVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantRoleInfoVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantSaleAreaVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantsManagerVO
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.BatchBusinessFilesRequest
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileVO
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationSuiteFile
 *  com.yonyou.iuap.fileservice.sdk.service.CooperationFileQueryService
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.iuap.upc.api.openapi.IMerchantOpenApiService
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCPager
 *  com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.FileDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantAddressOpenApiSaveDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantAgentFinancialOpenApiSaveDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantAgentInvoiceOpenApiSaveDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantApplyRangeDetailOpenApiSaveDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantApplyRangeOpenApiSaveDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantContactOpenApiSaveDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantCustomerAreaOpenApiSaveDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantFileDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantFileQryDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantInvoicingCustomerOpenApiSaveDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantManagerOpenApiSaveDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantOpenApiQryDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantOpenApiSaveDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantPrincipalOpenApiSaveDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantRoleOpenApiSaveDTO
 *  com.yonyoucloud.upc.aa.merchant.AddressInfo
 *  com.yonyoucloud.upc.aa.merchant.AgentFinancial
 *  com.yonyoucloud.upc.aa.merchant.AgentInvoice
 *  com.yonyoucloud.upc.aa.merchant.Contacter
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.InvoicingCustomers
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantDetail
 *  com.yonyoucloud.upc.aa.merchant.MerchantQualificationDocument
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.upc.aa.merchant.StopStatusChar
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  com.yonyoucloud.upc.utils.DTOCheckUtil
 *  com.yonyoucloud.upc.utils.MerchantOpenApiUtils
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 */
package com.yonyoucloud.upc.service.openapi;

import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.diwork.service.auth.IServiceIsolateService;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.constants.MerchantOpenApiFieldUtils;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.pub.PubLongCommonVO;
import com.yonyou.iuap.apdoc.coredoc.service.common.impl.CoreDocCustomExtendQueryService;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantAddressInfoVO;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantApplyRangeDetailVO;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantApplyRangeVO;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantBillingVO;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantContacterVO;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantFinancialVO;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantInvoiceVO;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantPrincipalVO;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantRoleInfoVO;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantSaleAreaVO;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantVO;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantsManagerVO;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.fileservice.sdk.module.pojo.BatchBusinessFilesRequest;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileVO;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationSuiteFile;
import com.yonyou.iuap.fileservice.sdk.service.CooperationFileQueryService;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.openapi.IMerchantOpenApiService;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.FileDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantAddressOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantAgentFinancialOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantAgentInvoiceOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantApplyRangeDetailOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantApplyRangeOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantContactOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantCustomerAreaOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantFileDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantFileQryDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantInvoicingCustomerOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantManagerOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantOpenApiQryDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantPrincipalOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantRoleOpenApiSaveDTO;
import com.yonyoucloud.upc.aa.merchant.AddressInfo;
import com.yonyoucloud.upc.aa.merchant.AgentFinancial;
import com.yonyoucloud.upc.aa.merchant.AgentInvoice;
import com.yonyoucloud.upc.aa.merchant.Contacter;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.InvoicingCustomers;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantDetail;
import com.yonyoucloud.upc.aa.merchant.MerchantQualificationDocument;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.aa.merchant.StopStatusChar;
import com.yonyoucloud.upc.coredoc.pub.CheckDomainDeleteService;
import com.yonyoucloud.upc.service.MerchantCheckService;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import com.yonyoucloud.upc.utils.DTOCheckUtil;
import com.yonyoucloud.upc.utils.MerchantOpenApiUtils;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class MerchantOpenApiServiceImpl
implements IMerchantOpenApiService {
    Logger logger = LoggerFactory.getLogger(MerchantOpenApiServiceImpl.class);
    public static final String[] MERCHANT_OPEN_API_FIELD = new String[]{"id", "code", "name", "createOrgId", "createOrgCode", "createOrgName", "belongOrgId", "belongOrgCode", "belongOrgName", "transTypeId", "transTypeCode", "transTypeName", "shortname", "countryId", "countryName", "languageId", "languageCode", "parentManageOrgId", "parentManageOrgCode", "parentManageOrgName", "parentCustomerId", "parentCustomerCode", "parentCustomerName", "suppliersId", "suppliersCode", "suppliersName", "retailInvestors", "internalOrg", "internalOrgIdId", "internalOrgIdCode", "internalOrgIdName", "taxPayingCategories", "customerClassId", "customerClassCode", "customerClassName", "customerIndustryId", "customerIndustryCode", "customerIndustryName", "developmentPartnerId", "developmentPartnerCode", "developmentPartnerName", "enterpriseNature", "enterpriseName", "personName", "orgName", "licenseType", "creditCode", "leaderName", "leaderNameIdNo", "personCharge", "personChargeIdNo", "businessLicenseNo", "businessterm", "buildTime", "contactName", "contactTel", "address", "regionCode", "email", "fax", "enterNatureId", "enterNatureCode", "enterNatureName", "currencyCode", "money", "peopleNum", "scopeModel", "yearMoney", "scope", "website", "wid", "postCode", "merchantCharacter", "newTimeZone", "createTime", "modifyTime", "creator", "modifier", "pubts", "longitude", "latitude"};
    public static String merchantVOField = "id,code,name,erpCode,createOrg,createOrg.code as createOrg___code,transType,transType.code as transType___code,shortname,country,country.name as country___name,newTimeZone,language,language.code as language___code,parentManageOrg,parentManageOrg.code as parentManageOrg___code,parentCustomer,parentCustomer.code as parentCustomer___code,suppliers,suppliers.code as suppliers___code,retailInvestors,internalOrg,internalOrgId,internalOrgId.code as internalOrgId___code,taxPayingCategories,customerClass,customerClass.code as customerClass___code,customerIndustry,customerIndustry.code as customerIndustry___code,developmentPartner,developmentPartner.code as developmentPartner___code,enterpriseNature,enterpriseName,personName,orgName,licenseType,creditCode,leaderName,leaderNameIdNo,personCharge,personChargeIdNo,businessLicenseNo,businessterm,buildTime,contactName,contactTel,address,regionCode,email,fax,enterNature,enterNature.code as enterNature___code,currencyCode,money,peopleNum,scopeModel,yearMoney,scope,website,wid,postCode,merchantCharacter,longitude,latitude,createDate,createTime,creator,creatorId,modifier,modifierId,modifyDate,modifyTime";
    public static String rangeDetailVOField = "id,searchCode as searchcode,merchantLevelId as customerLevel,merchantLevelId.code as customerLevel___code,merchantTypeId as customerType,merchantTypeId.code as customerType___code,deliveryWarehouseId as deliveryWarehouse,deliveryWarehouseId.code as deliveryWarehouse___code,transactionCurrencyId as transactionCurrency,transactionCurrencyId.name as transactionCurrency___name,exchangeRateTypeId as exchangeratetype,exchangeRateTypeId.code as exchangeratetype___code,taxRateId as taxRate,taxRateId.code as taxRate___code,payWay as payway,creditServiceDayId as creditServiceDay,collectionAgreementId as collectionAgreement,collectionAgreementId.name as collectionAgreement___name,settlementMethodId as settlementMethod,settlementMethodId.name as settlementMethod___name,shipmentMethodId as shipmentMethod,shipmentMethodId.name as shipmentMethod___name,signBack,isTradeCustomers,stopstatus,createDate,createTime,creator,creatorId,modifier,modifierId,modifyDate,modifyTime,priceMarking,merchantApplyRangeDetailCharacter";
    public static String customerAreaVOField = "id,saleAreaId,saleAreaId.code as saleAreaId___code,isDefault,pubts";
    public static String principalVOField = "id,professSalesman,professSalesman.code as professSalesman___code,specialManagementDep,specialManagementDep.code as specialManagementDep___code,isDefault,pubts";
    public static String invoicingCustomersVOField = "id,invoicingCustomersId,invoicingCustomersId.code as invoicingCustomersId___code,isDefault,pubts";
    public static String addressInfoVOField = "id,erpCode,pubts,addressCode,shipregion,shipregion.code as shipregion___code,regionCode,address,zipCode,receiver,mobile,telePhone,email,qq,weChat,remarks,stopStatus,isDefault,latitude,longitude,addressInfoCharacter";
    public static String contacterVOField = "id,erpCode,pubts,fullName,gender,contactDepartment,positionName,areaCodeMobile,mobile,telePhone,email,qq,weChat,remarks,isDefault,contacterCharacter";
    public static String agentFinancialVOField = "id,erpCode,pubts,country,country.name as country___name,province,province.code as province___code,currency,currency.name as currency___name,accountType,bank,bank.name as bank___name,openBank,openBank.name as openBank___name,bankAccount,bankAccountName,jointLineNo,remarks,accountOpeningAddress,accountOpeningDate,stopstatus,isDefault,agentFinancialCharacter";
    public static String agentInvoiceVOField = "id,erpCode,pubts,bdBillingType,bdBillingType.name as bdBillingType___name,title,taxNo,receievInvoiceMobile,receievInvoiceEmail,telephone,address,name,name.name as name___name,bankName,bankName.name as bankName___name,bankAccount,remarks,isDefault,agentInvoiceCharacter";
    public static String merchantApplyRangeVOField = "pubts,orgId,orgId.code as orgId___code";
    public static String merchantRoleInfoVOField = "merchantOptions,businessRole,pubts";
    public static String merchantsManagerVOField = "countryCode,mobile,fullName,email,pubts";
    private static final String[] MERCHANT_ADDRESS_OPEN_API_FIELD = new String[]{"id", "addressCode", "shipregionId", "shipregionCode", "regionCode", "address", "zipCode", "receiver", "mobile", "telePhone", "email", "qq", "weChat", "remarks", "stopStatus", "isDefault", "addressInfoCharacter", "longitude", "latitude"};
    private static final String[] MERCHANT_CONTACT_OPEN_API_FIELD = new String[]{"id", "fullName", "gender", "positionName", "mobile", "areaCodeMobile", "telePhone", "qq", "email", "weChat", "remarks", "isDefault", "contacterCharacter", "contactDepartment"};
    private static final String[] MERCHANT_AGENT_FINANCIAL_OPEN_API_FIELD = new String[]{"id", "countryId", "countryName", "provinceId", "provinceCode", "currencyId", "currencyName", "accountType", "bankId", "bankName", "openBankId", "openBankName", "bankAccount", "bankAccountName", "jointLineNo", "remarks", "accountOpeningAddress", "accountOpeningDate", "stopStatus", "isDefault", "agentFinancialCharacter"};
    private static final String[] MERCHANT_AGENT_INVOICE_OPEN_API_FIELD = new String[]{"id", "bdBillingTypeId", "bdBillingTypeName", "title", "taxNo", "receievInvoiceMobile", "receievInvoiceEmail", "telephone", "address", "bankId", "bankName", "bankDotId", "bankDotName", "bankAccount", "remarks", "isDefault", "agentInvoiceCharacter"};
    private static final String[] MERCHANT_APPLY_RANGE_OPEN_API_FIELD = new String[]{"orgId", "orgIdCode", "id"};
    private static final String[] MERCHANT_APPLY_RANGE_DETAIL_OPEN_API_FIELD = new String[]{"searchCode", "customerLevelId", "customerLevelCode", "customerTypeId", "customerTypeCode", "deliveryWarehouseId", "deliveryWarehouseCode", "transactionCurrencyId", "transactionCurrencyName", "exchangeRateTypeId", "exchangeRateTypeCode", "taxRateNtaxId", "taxRateNtaxRate", "payWay", "creditServiceDay", "collectionAgreementId", "collectionAgreementName", "settlementMethodId", "settlementMethodName", "shipmentMethodId", "shipmentMethodName", "signBack", "isTradeCustomers", "stopStatus", "merchantApplyRangeDetailCharacter", "createTime", "modifyTime", "creator", "modifier", "priceMarking"};
    private static final String[] MERCHANT_ROLE_OPEN_API_FIELD = new String[]{"merchantOptions", "businessRole"};
    private static final String[] MERCHANT_MANAGER_OPEN_API_FIELD = new String[]{"countryCode", "mobile", "fullName", "email"};
    private static final String[] MERCHANT_CUSTOMER_AREA_OPEN_API_FIELD = new String[]{"id", "saleAreaId", "saleAreaIdCode", "isDefault"};
    private static final String[] MERCHANT_PRINCIPAL_OPEN_API_FIELD = new String[]{"id", "specialManagementDepId", "specialManagementDepCode", "professSalesmanId", "professSalesmanCode", "isDefault"};
    private static final String SOURCE_UNIQUE = "sourceUnique";
    private static final String[] MERCHANT_INVOICING_CUSTOMER_OPEN_API_FIELD = new String[]{"id", "invoicingCustomersId", "invoicingCustomersIdCode", "isDefault"};
    @Autowired
    private MerchantCheckService merchantCheckService;
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    private IOrgUnitQueryService iOrgUnitQueryService;
    @Autowired
    private IServiceIsolateService iServiceIsolateService;
    @Autowired
    private IUPCBillService billService;
    @Autowired
    private CooperationFileQueryService cooperationFileQueryService;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private CheckDomainDeleteService checkDomainDeleteService;
    @Autowired
    private CoreDocCustomExtendQueryService coreDocCustomExtendQueryService;

    public CoreDocJsonResult<MerchantOpenApiSaveDTO> insertMerchant(MerchantOpenApiSaveDTO merchantOpenApiSaveDTO) {
        try {
            MerchantOpenApiSaveDTO merchantOpenApiSaveResultDTO = this.saveMerchantOpenApi(merchantOpenApiSaveDTO, EntityStatus.Insert);
            if (merchantOpenApiSaveResultDTO.getId() != null) {
                return CoreDocJsonResult.success((Object)merchantOpenApiSaveResultDTO);
            }
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((Long)999L, (String)businessException.getDisplayCode(), (String)businessException.getMessage());
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u6863\u6848openApi\u65b0\u589e\u4fdd\u5b58\u62a5\u9519:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public List<Long> batchInsertMerchant(List<MerchantOpenApiSaveDTO> merchantOpenApiSaveDTOList) throws Exception {
        return this.batchSaveMerchantOpenApi(merchantOpenApiSaveDTOList, EntityStatus.Insert);
    }

    public CoreDocJsonResult<MerchantOpenApiSaveDTO> updateMerchant(MerchantOpenApiSaveDTO merchantOpenApiSaveDTO) {
        try {
            MerchantOpenApiSaveDTO merchantOpenApiSaveResultDTO = this.saveMerchantOpenApi(merchantOpenApiSaveDTO, EntityStatus.Update);
            if (merchantOpenApiSaveResultDTO.getId() != null) {
                return CoreDocJsonResult.success((Object)merchantOpenApiSaveResultDTO);
            }
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        catch (BusinessException ex) {
            this.logger.error("\u5ba2\u6237\u6863\u6848openApi\u66f4\u65b0\u4fdd\u5b58\u62a5\u9519:" + ex.getMessage(), (Throwable)ex);
            return CoreDocJsonResult.error((Long)999L, (String)ex.getDisplayCode(), (String)ex.getMessage());
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u6863\u6848openApi\u66f4\u65b0\u4fdd\u5b58\u62a5\u9519:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public List<Long> batchUpdateMerchant(List<MerchantOpenApiSaveDTO> merchantOpenApiSaveDTOList) throws Exception {
        return this.batchSaveMerchantOpenApi(merchantOpenApiSaveDTOList, EntityStatus.Update);
    }

    public List<Long> batchSaveMerchantOpenApi(List<MerchantOpenApiSaveDTO> merchantOpenApiSaveDTOList, EntityStatus entityStatus) throws Exception {
        ArrayList<Long> idList = new ArrayList<Long>();
        if (merchantOpenApiSaveDTOList.size() > 5) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800868);
        }
        for (MerchantOpenApiSaveDTO merchantOpenApiSaveDTO : merchantOpenApiSaveDTOList) {
            try {
                MerchantOpenApiSaveDTO returnMerchant = this.saveMerchantOpenApi(merchantOpenApiSaveDTO, entityStatus);
                idList.add(returnMerchant.getId());
            }
            catch (BusinessException businessException) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800868);
            }
        }
        return idList;
    }

    public MerchantOpenApiSaveDTO saveMerchantOpenApi(MerchantOpenApiSaveDTO merchantOpenApiSaveDTO, EntityStatus entityStatus) throws Exception {
        Long id = 0L;
        Merchant merchant = MerchantOpenApiUtils.getMerchant((MerchantOpenApiSaveDTO)merchantOpenApiSaveDTO);
        MerchantOpenApiUtils.addRowNumForMerchantSubData((Merchant)merchant);
        DataTransferUtils.fill((String)"aa_merchant", (String)"aa.merchant.Merchant", (Object)merchant, (int)3);
        this.merchantCheckService.beforeDataPreprocessCheckFromApi(merchant);
        this.merchantCheckService.dataPreprocessing(merchant, entityStatus);
        this.merchantCheckService.theBeforeSaveCheckFromApi(merchant);
        if (!CollectionUtils.isEmpty((Collection)merchant.merchantApplyRanges())) {
            merchant.set("autoRangeDataFromApi_", (Object)"true");
        }
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("aa_merchant");
        billDataDto.setAction("save");
        billDataDto.setData((Object)merchant);
        billDataDto.setFromApi(true);
        billDataDto.setConvertType(Integer.valueOf(3));
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        MerchantOpenApiSaveDTO returnMerchantDTO = MerchantOpenApiServiceImpl.getMerchantOpenApiSaveDTO(result);
        return returnMerchantDTO;
    }

    public Long createOrgBatchSaveMerchant(String matchRule, MerchantVO merchantVO, Map<String, String> diffDataModel) throws Exception {
        Long id = 0L;
        if (StringUtils.isEmpty((CharSequence)matchRule)) {
            matchRule = "code";
        }
        EntityStatus entityStatus = EntityStatus.Insert;
        CoreDocJsonResult<MerchantOpenApiSaveDTO> merchantOpenApiSaveCoreDocJsonResult = null;
        if (merchantVO.getId() != null && merchantVO.getId().length() > 0 && "id".equals(matchRule)) {
            merchantOpenApiSaveCoreDocJsonResult = this.queryById(Long.parseLong(merchantVO.getId()));
        } else if (!StringUtils.isEmpty((CharSequence)merchantVO.getCode()) && "code".equals(matchRule)) {
            merchantOpenApiSaveCoreDocJsonResult = this.queryByCode(merchantVO.getCode());
        }
        if (merchantOpenApiSaveCoreDocJsonResult != null && merchantOpenApiSaveCoreDocJsonResult.getCode() == 200L) {
            entityStatus = EntityStatus.Update;
            merchantVO.setId(((MerchantOpenApiSaveDTO)merchantOpenApiSaveCoreDocJsonResult.getData().get(0)).getId().toString());
        }
        this.setCreateOrgBatchSaveMerchant(matchRule, merchantVO, entityStatus, diffDataModel);
        Merchant merchant = MerchantOpenApiUtils.getMerchantVO((MerchantVO)merchantVO);
        MerchantOpenApiUtils.addRowNumForMerchantSubData((Merchant)merchant);
        DataTransferUtils.fill((String)"aa_merchant", (String)"aa.merchant.Merchant", (Object)merchant, (int)4);
        this.merchantCheckService.beforeDataPreprocessCheckFromApi(merchant);
        this.merchantCheckService.dataPreprocessing(merchant, entityStatus);
        this.merchantCheckService.theBeforeSaveCheckFromApi(merchant);
        this.merchantCheckService.childStatusExtend(merchant);
        if (!CollectionUtils.isEmpty((Collection)merchant.merchantApplyRanges())) {
            merchant.set("autoRangeDataFromApi_", (Object)"true");
        }
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("aa_merchant");
        billDataDto.setAction("save");
        billDataDto.setData((Object)merchant);
        billDataDto.setFromApi(true);
        billDataDto.setConvertType(Integer.valueOf(4));
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (Long)((Merchant)result).getId();
        }
        return id;
    }

    private static MerchantOpenApiSaveDTO getMerchantOpenApiSaveDTO(Object result) throws Exception {
        MerchantOpenApiSaveDTO returnMerchantDTO = new MerchantOpenApiSaveDTO();
        if (result != null) {
            Merchant merchantResult = (Merchant)result;
            returnMerchantDTO.setId((Long)merchantResult.getId());
            returnMerchantDTO.setCode(merchantResult.getCode());
            if (!CollectionUtils.isEmpty((Collection)merchantResult.merchantAgentInvoiceInfos())) {
                ArrayList<MerchantAgentInvoiceOpenApiSaveDTO> merchantAgentInvoiceOpenApiSaveDTOS = new ArrayList<MerchantAgentInvoiceOpenApiSaveDTO>(merchantResult.merchantAgentInvoiceInfos().size());
                for (AgentInvoice merchantAgentInvoice : merchantResult.merchantAgentInvoiceInfos()) {
                    MerchantAgentInvoiceOpenApiSaveDTO merchantAgentInvoiceOpenApiSaveDTO = new MerchantAgentInvoiceOpenApiSaveDTO();
                    merchantAgentInvoiceOpenApiSaveDTO.setId((Long)merchantAgentInvoice.getId());
                    merchantAgentInvoiceOpenApiSaveDTO.setTitle(merchantAgentInvoice.getTitle());
                    merchantAgentInvoiceOpenApiSaveDTO.setIsDefault(merchantAgentInvoice.getIsDefault());
                    if (merchantAgentInvoice.get(SOURCE_UNIQUE) != null) {
                        merchantAgentInvoiceOpenApiSaveDTO.setSourceUnique(merchantAgentInvoice.get(SOURCE_UNIQUE).toString());
                    }
                    merchantAgentInvoiceOpenApiSaveDTOS.add(merchantAgentInvoiceOpenApiSaveDTO);
                }
                returnMerchantDTO.setMerchantAgentInvoiceInfos(merchantAgentInvoiceOpenApiSaveDTOS);
            }
            if (!CollectionUtils.isEmpty((Collection)merchantResult.merchantAddressInfos())) {
                ArrayList<MerchantAddressOpenApiSaveDTO> merchantAddressOpenApiSaveDTOS = new ArrayList<MerchantAddressOpenApiSaveDTO>(merchantResult.merchantAddressInfos().size());
                for (AddressInfo merchantAddress : merchantResult.merchantAddressInfos()) {
                    MerchantAddressOpenApiSaveDTO merchantAddressOpenApiSaveDTO = new MerchantAddressOpenApiSaveDTO();
                    merchantAddressOpenApiSaveDTO.setId((Long)merchantAddress.getId());
                    merchantAddressOpenApiSaveDTO.setIsDefault(merchantAddress.getIsDefault());
                    merchantAddressOpenApiSaveDTO.setAddressCode(merchantAddress.getAddressCode());
                    merchantAddressOpenApiSaveDTO.setAddress(merchantAddress.getAddress());
                    if (merchantAddress.get(SOURCE_UNIQUE) != null) {
                        merchantAddressOpenApiSaveDTO.setSourceUnique(merchantAddress.get(SOURCE_UNIQUE).toString());
                    }
                    merchantAddressOpenApiSaveDTOS.add(merchantAddressOpenApiSaveDTO);
                }
                returnMerchantDTO.setMerchantAddressInfos(merchantAddressOpenApiSaveDTOS);
            }
            if (!CollectionUtils.isEmpty((Collection)merchantResult.merchantAgentFinancialInfos())) {
                ArrayList<MerchantAgentFinancialOpenApiSaveDTO> merchantAgentFinancialOpenApiSaveDTOS = new ArrayList<MerchantAgentFinancialOpenApiSaveDTO>(merchantResult.merchantAgentFinancialInfos().size());
                for (AgentFinancial agentFinancial : merchantResult.merchantAgentFinancialInfos()) {
                    MerchantAgentFinancialOpenApiSaveDTO merchantAgentFinancialOpenApiSaveDTO = new MerchantAgentFinancialOpenApiSaveDTO();
                    merchantAgentFinancialOpenApiSaveDTO.setId((Long)agentFinancial.getId());
                    merchantAgentFinancialOpenApiSaveDTO.setIsDefault(agentFinancial.getIsDefault());
                    if (agentFinancial.get(SOURCE_UNIQUE) != null) {
                        merchantAgentFinancialOpenApiSaveDTO.setSourceUnique(agentFinancial.get(SOURCE_UNIQUE).toString());
                    }
                    merchantAgentFinancialOpenApiSaveDTO.setCurrencyName((String)agentFinancial.get("currency_name"));
                    if (agentFinancial.getAccountType() != null) {
                        merchantAgentFinancialOpenApiSaveDTO.setAccountType(agentFinancial.getAccountType().toString());
                    }
                    merchantAgentFinancialOpenApiSaveDTO.setBankName((String)agentFinancial.get("bank_name"));
                    merchantAgentFinancialOpenApiSaveDTO.setOpenBankName((String)agentFinancial.get("openBank_name"));
                    merchantAgentFinancialOpenApiSaveDTO.setBankAccount(agentFinancial.getBankAccount());
                    QuerySchema bankAccountNameSchema = QuerySchema.create().addSelect("bankAccountName").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(agentFinancial.getId())}));
                    List bankAccountName = MetaDaoHelper.query((String)"aa.merchant.AgentFinancial", (boolean)true, (QuerySchema)bankAccountNameSchema, null);
                    if (!CollectionUtils.isEmpty((Collection)bankAccountName)) {
                        for (Map map : bankAccountName) {
                            merchantAgentFinancialOpenApiSaveDTO.setBankAccountName(MerchantOpenApiUtils.getMultilingualVO((Map)((Map)map.get("bankAccountName"))));
                        }
                    }
                    merchantAgentFinancialOpenApiSaveDTOS.add(merchantAgentFinancialOpenApiSaveDTO);
                }
                returnMerchantDTO.setMerchantAgentFinancialInfos(merchantAgentFinancialOpenApiSaveDTOS);
            }
            if (!CollectionUtils.isEmpty((Collection)merchantResult.merchantContacterInfos())) {
                ArrayList<MerchantContactOpenApiSaveDTO> merchantContactOpenApiSaveDTOS = new ArrayList<MerchantContactOpenApiSaveDTO>(merchantResult.merchantContacterInfos().size());
                for (Contacter merchantContacter : merchantResult.merchantContacterInfos()) {
                    QuerySchema fullNameSchema;
                    List fullNameName;
                    MerchantContactOpenApiSaveDTO merchantContactOpenApiSaveDTO = new MerchantContactOpenApiSaveDTO();
                    merchantContactOpenApiSaveDTO.setId((Long)merchantContacter.getId());
                    merchantContactOpenApiSaveDTO.setIsDefault(merchantContacter.getIsDefault());
                    if (merchantContacter.get(SOURCE_UNIQUE) != null) {
                        merchantContactOpenApiSaveDTO.setSourceUnique(merchantContacter.get(SOURCE_UNIQUE).toString());
                    }
                    if (!CollectionUtils.isEmpty((Collection)(fullNameName = MetaDaoHelper.query((String)"aa.merchant.Contacter", (boolean)true, (QuerySchema)(fullNameSchema = QuerySchema.create().addSelect("fullName").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchantContacter.getId())}))), null)))) {
                        for (Map map : fullNameName) {
                            merchantContactOpenApiSaveDTO.setFullName(MerchantOpenApiUtils.getMultilingualVO((Map)((Map)map.get("fullName"))));
                        }
                    }
                    merchantContactOpenApiSaveDTOS.add(merchantContactOpenApiSaveDTO);
                }
                returnMerchantDTO.setMerchantContactInfos(merchantContactOpenApiSaveDTOS);
            }
        }
        return returnMerchantDTO;
    }

    public CoreDocJsonResult<MerchantOpenApiSaveDTO> queryById(Long id) {
        try {
            UpcAPiTool.checkPara((Long[])new Long[]{id});
            MerchantOpenApiQryDTO merchantOpenApiQryDTO = new MerchantOpenApiQryDTO();
            merchantOpenApiQryDTO.setId(id);
            merchantOpenApiQryDTO.setFields(MERCHANT_OPEN_API_FIELD);
            List<MerchantOpenApiSaveDTO> merchantOpenApiSaveResultDTOList = this.queryMerchantOpenApi(merchantOpenApiQryDTO);
            if (!CollectionUtils.isEmpty(merchantOpenApiSaveResultDTOList)) {
                return CoreDocJsonResult.success((Object)merchantOpenApiSaveResultDTOList.get(0));
            }
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u6863\u6848openApi\u6839\u636eid\u83b7\u53d6\u5ba2\u6237\u6863\u6848\u62a5\u9519:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<MerchantOpenApiSaveDTO> queryByIdList(List<Long> idList) {
        try {
            UpcAPiTool.checkPara((List[])new List[]{idList});
            MerchantOpenApiQryDTO merchantOpenApiQryDTO = new MerchantOpenApiQryDTO();
            merchantOpenApiQryDTO.setIdList(idList);
            merchantOpenApiQryDTO.setFields(MERCHANT_OPEN_API_FIELD);
            List<MerchantOpenApiSaveDTO> merchantOpenApiSaveResultDTOList = this.queryMerchantOpenApi(merchantOpenApiQryDTO);
            if (!CollectionUtils.isEmpty(merchantOpenApiSaveResultDTOList)) {
                return CoreDocJsonResult.success(merchantOpenApiSaveResultDTOList);
            }
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u6863\u6848openApi\u6839\u636eidList\u83b7\u53d6\u5ba2\u6237\u6863\u6848\u62a5\u9519:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<MerchantOpenApiSaveDTO> queryByCode(String code) {
        try {
            UpcAPiTool.checkPara((String)code);
            MerchantOpenApiQryDTO merchantOpenApiQryDTO = new MerchantOpenApiQryDTO();
            merchantOpenApiQryDTO.setCode(code);
            merchantOpenApiQryDTO.setFields(MERCHANT_OPEN_API_FIELD);
            List<MerchantOpenApiSaveDTO> merchantOpenApiSaveResultDTOList = this.queryMerchantOpenApi(merchantOpenApiQryDTO);
            if (!CollectionUtils.isEmpty(merchantOpenApiSaveResultDTOList)) {
                return CoreDocJsonResult.success((Object)merchantOpenApiSaveResultDTOList.get(0));
            }
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u6863\u6848openApi\u6839\u636ecode\u83b7\u53d6\u5ba2\u6237\u6863\u6848\u62a5\u9519:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<MerchantOpenApiSaveDTO> queryByCodeList(List<String> codeList) {
        try {
            UpcAPiTool.checkPara((List[])new List[]{codeList});
            MerchantOpenApiQryDTO merchantOpenApiQryDTO = new MerchantOpenApiQryDTO();
            merchantOpenApiQryDTO.setCodeList(codeList);
            merchantOpenApiQryDTO.setFields(MERCHANT_OPEN_API_FIELD);
            List<MerchantOpenApiSaveDTO> merchantOpenApiSaveResultDTOList = this.queryMerchantOpenApi(merchantOpenApiQryDTO);
            if (!CollectionUtils.isEmpty(merchantOpenApiSaveResultDTOList)) {
                return CoreDocJsonResult.success(merchantOpenApiSaveResultDTOList);
            }
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u6863\u6848openApi\u6839\u636ecodeList\u83b7\u53d6\u5ba2\u6237\u6863\u6848\u62a5\u9519:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<MerchantOpenApiSaveDTO> listByPage(MerchantOpenApiQryDTO merchantOpenApiQryDTO) {
        try {
            merchantOpenApiQryDTO.setFields(MERCHANT_OPEN_API_FIELD);
            List<MerchantOpenApiSaveDTO> merchantOpenApiSaveResultDTOList = this.queryMerchantOpenApi(merchantOpenApiQryDTO);
            if (!CollectionUtils.isEmpty(merchantOpenApiSaveResultDTOList)) {
                return CoreDocJsonResult.success(merchantOpenApiSaveResultDTOList);
            }
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u6863\u6848openApi\u6839\u636ecodeList\u83b7\u53d6\u5ba2\u6237\u6863\u6848\u62a5\u9519:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public List<MerchantOpenApiSaveDTO> queryMerchantOpenApi(MerchantOpenApiQryDTO merchantOpenApiQryDTO) throws Exception {
        UpcAPiTool.checkPara((String[])merchantOpenApiQryDTO.getFields());
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantOpenApiFieldUtils.MERCHANT_OPEN_API_FIELD_MAPPING, (String[])merchantOpenApiQryDTO.getFields());
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        this.setQueryConditionGroupByMerchantOpenApiQryDTO(merchantOpenApiQryDTO, queryConditionGroup);
        this.setPageInfo(merchantOpenApiQryDTO);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(merchantOpenApiQryDTO.getPageIndex().intValue(), merchantOpenApiQryDTO.getPageSize().intValue());
        List merchantList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (boolean)true, (QuerySchema)schema, null);
        List<MerchantOpenApiSaveDTO> merchantOpenApiSaveDTOList = this.getMerchantOpenApiSaveDTOS(merchantList);
        if (merchantOpenApiSaveDTOList != null) {
            return merchantOpenApiSaveDTOList;
        }
        return null;
    }

    public List<Merchant> queryMerchantByQryDTO(MerchantOpenApiQryDTO merchantOpenApiQryDTO) throws Exception {
        UpcAPiTool.checkPara((String[])merchantOpenApiQryDTO.getFields());
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantOpenApiFieldUtils.MERCHANT_OPEN_API_FIELD_MAPPING, (String[])merchantOpenApiQryDTO.getFields());
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        this.setQueryConditionGroupByMerchantOpenApiQryDTO(merchantOpenApiQryDTO, queryConditionGroup);
        if (merchantOpenApiQryDTO.getBelongOrgId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.orgId").eq((Object)merchantOpenApiQryDTO.getBelongOrgId()));
        }
        if (merchantOpenApiQryDTO.getBeganTime() != null || merchantOpenApiQryDTO.getEndTime() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.merchantDetailId.pubts").between((Object)merchantOpenApiQryDTO.getBeganTime(), (Object)merchantOpenApiQryDTO.getEndTime()));
        }
        if (merchantOpenApiQryDTO.getPubts() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.merchantDetailId.pubts").egt((Object)merchantOpenApiQryDTO.getPubts()));
        }
        this.setPageInfo(merchantOpenApiQryDTO);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(merchantOpenApiQryDTO.getPageIndex().intValue(), merchantOpenApiQryDTO.getPageSize().intValue());
        return MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (boolean)true, (QuerySchema)schema, null);
    }

    private void setPageInfo(MerchantOpenApiQryDTO merchantOpenApiQryDTO) {
        if (merchantOpenApiQryDTO.getPageIndex() == null) {
            merchantOpenApiQryDTO.setPageIndex(UpcAPiTool.DEFAULT_PAGE_INDEX);
        }
        if (merchantOpenApiQryDTO.getPageSize() == null) {
            merchantOpenApiQryDTO.setPageSize(UpcAPiTool.DEFAULT_PAGE_SIZE);
        }
        if (merchantOpenApiQryDTO.getPageSize() > UpcAPiTool.PAGE_MAX_SIZE) {
            merchantOpenApiQryDTO.setPageSize(UpcAPiTool.PAGE_MAX_SIZE);
        }
    }

    private List<MerchantOpenApiSaveDTO> getMerchantOpenApiSaveDTOS(List<Merchant> merchantList) throws Exception {
        if (!CollectionUtils.isEmpty(merchantList)) {
            HashMap<Long, HashMap> merchantCharacterMap = new HashMap<Long, HashMap>();
            HashMap<Long, String> merchantBusinesstermMap = new HashMap<Long, String>();
            HashMap<Long, String> merchantBuildTimeMap = new HashMap<Long, String>();
            HashMap<Long, String> merchantCreateTimeMap = new HashMap<Long, String>();
            HashMap<Long, String> merchantModifyTimeMap = new HashMap<Long, String>();
            HashMap<Long, String> merchantPubtsMap = new HashMap<Long, String>();
            ArrayList<Long> merchantIdList = new ArrayList<Long>(merchantList.size());
            for (Merchant merchant : merchantList) {
                String time;
                merchant.set("name", (Object)MerchantOpenApiUtils.getMultilingualVO((Map)((Map)merchant.get("name"))));
                merchant.set("shortname", (Object)MerchantOpenApiUtils.getMultilingualVO((Map)((Map)merchant.get("shortname"))));
                merchant.set("address", (Object)MerchantOpenApiUtils.getMultilingualVO((Map)((Map)merchant.get("address"))));
                merchant.set("scope", (Object)MerchantOpenApiUtils.getMultilingualVO((Map)((Map)merchant.get("scope"))));
                merchantCharacterMap.put((Long)merchant.getId(), (HashMap)merchant.get("merchantCharacter"));
                if (merchant.get("businessterm") != null) {
                    merchantBusinesstermMap.put((Long)merchant.getId(), merchant.get("businessterm").toString());
                }
                if (merchant.getBuildTime() != null) {
                    merchantBuildTimeMap.put((Long)merchant.getId(), merchant.getBuildTime().toString());
                }
                if (merchant.getCreateTime() != null) {
                    time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(merchant.getCreateTime());
                    merchantCreateTimeMap.put((Long)merchant.getId(), time);
                }
                if (merchant.getModifyTime() != null) {
                    time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(merchant.getModifyTime());
                    merchantModifyTimeMap.put((Long)merchant.getId(), time);
                }
                if (merchant.getPubts() != null) {
                    time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(merchant.getPubts());
                    merchantPubtsMap.put((Long)merchant.getId(), time);
                }
                merchantIdList.add((Long)merchant.getId());
            }
            List merchantOpenApiSaveDTOList = JSON.parseArray((String)JSON.toJSONString(merchantList), MerchantOpenApiSaveDTO.class);
            this.setMerchantOpenApiDTOStopStatus(merchantIdList, merchantOpenApiSaveDTOList);
            for (MerchantOpenApiSaveDTO merchantOpenApiSaveDTO : merchantOpenApiSaveDTOList) {
                merchantOpenApiSaveDTO.setMerchantCharacter((HashMap)merchantCharacterMap.get(merchantOpenApiSaveDTO.getId()));
                merchantOpenApiSaveDTO.setBusinessterm((String)merchantBusinesstermMap.get(merchantOpenApiSaveDTO.getId()));
                merchantOpenApiSaveDTO.setBuildTime((String)merchantBuildTimeMap.get(merchantOpenApiSaveDTO.getId()));
                merchantOpenApiSaveDTO.setCreateTime((String)merchantCreateTimeMap.get(merchantOpenApiSaveDTO.getId()));
                merchantOpenApiSaveDTO.setModifyTime((String)merchantModifyTimeMap.get(merchantOpenApiSaveDTO.getId()));
                merchantOpenApiSaveDTO.setPubts((String)merchantPubtsMap.get(merchantOpenApiSaveDTO.getId()));
            }
            return merchantOpenApiSaveDTOList;
        }
        return null;
    }

    public UPCPager<MerchantOpenApiSaveDTO> queryMerchantOpenApiByPage(MerchantOpenApiQryDTO merchantOpenApiQryDTO) throws Exception {
        UpcAPiTool.checkPara((String[])merchantOpenApiQryDTO.getFields());
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantOpenApiFieldUtils.MERCHANT_OPEN_API_FIELD_MAPPING, (String[])merchantOpenApiQryDTO.getFields());
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        this.setQueryConditionGroupByMerchantOpenApiQryDTO(merchantOpenApiQryDTO, queryConditionGroup);
        this.setPageInfo(merchantOpenApiQryDTO);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(merchantOpenApiQryDTO.getPageIndex().intValue(), merchantOpenApiQryDTO.getPageSize().intValue());
        BillContext billContext = new BillContext();
        billContext.setI18ndoc(true);
        billContext.setFullname("aa.merchant.Merchant");
        Pager pager = MetaDaoHelper.queryByPage((BillContext)billContext, (QuerySchema)schema);
        ArrayList<Merchant> merchantList = new ArrayList<Merchant>();
        UPCPager upcPager = new UPCPager();
        upcPager.setPageIndex(merchantOpenApiQryDTO.getPageIndex());
        upcPager.setPageSize(merchantOpenApiQryDTO.getPageSize());
        upcPager.setRecordCount(Integer.valueOf(0));
        if (pager != null) {
            upcPager.setRecordCount(Integer.valueOf(pager.getRecordCount()));
            upcPager.setPageCount(Integer.valueOf(pager.getPageCount()));
            List recordList = pager.getRecordList();
            if (!CollectionUtils.isEmpty((Collection)recordList)) {
                for (Object record : pager.getRecordList()) {
                    Map data = (Map)record;
                    Merchant merchant = (Merchant)Objectlizer.convert((Map)data, (String)"aa.merchant.Merchant");
                    merchantList.add(merchant);
                }
            }
        }
        List<MerchantOpenApiSaveDTO> merchantOpenApiSaveDTOList = this.getMerchantOpenApiSaveDTOS(merchantList);
        this.setMerchantOpenApiDTORange(merchantOpenApiSaveDTOList);
        upcPager.setRecordList(merchantOpenApiSaveDTOList);
        return upcPager;
    }

    private void setMerchantOpenApiDTORange(List<MerchantOpenApiSaveDTO> merchantOpenApiSaveDTOList) throws Exception {
        block5: {
            ArrayList merchantIdList = new ArrayList();
            if (CollectionUtils.isEmpty(merchantOpenApiSaveDTOList)) break block5;
            merchantOpenApiSaveDTOList.stream().map(MerchantOpenApiSaveDTO::getId).forEach(merchantIdList::add);
            QuerySchema rangeCountSchema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").in(merchantIdList), QueryCondition.name((String)"isPotential").eq((Object)false)}));
            Map rangeCount = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantApplyRange", (QuerySchema)rangeCountSchema);
            if (rangeCount == null || rangeCount.isEmpty()) {
                return;
            }
            if (Long.valueOf(rangeCount.get("count").toString()) > (long)this.ymsParamConfig.getResultMaxRowsValue()) {
                for (MerchantOpenApiSaveDTO merchantOpenApiSaveDTO : merchantOpenApiSaveDTOList) {
                    List<MerchantApplyRangeOpenApiSaveDTO> merchantApplyRangeOpenApiSaveDTOS = this.detailMerchantApplyRangeOpenApi(merchantOpenApiSaveDTO.getId());
                    merchantOpenApiSaveDTO.setMerchantApplyRanges(merchantApplyRangeOpenApiSaveDTOS);
                }
            } else {
                QuerySchema merchantApplyRangeSchema = QuerySchema.create().addSelect("id, merchantId, orgId, orgId.code as orgIdCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").in(merchantIdList), QueryCondition.name((String)"isPotential").eq((Object)false)}));
                List merchantApplyRangeList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)merchantApplyRangeSchema);
                Map groupedByMerchantId = merchantApplyRangeList.stream().collect(Collectors.groupingBy(map -> map.get("merchantId").toString(), Collectors.mapping(map -> {
                    MerchantApplyRangeOpenApiSaveDTO merchantApplyRangeOpenApiSaveDTO = new MerchantApplyRangeOpenApiSaveDTO();
                    merchantApplyRangeOpenApiSaveDTO.setOrgId(map.get("orgId").toString());
                    if (map.get("orgIdCode") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800869, new Object[]{map.get("orgId")});
                    }
                    merchantApplyRangeOpenApiSaveDTO.setOrgIdCode(map.get("orgIdCode").toString());
                    merchantApplyRangeOpenApiSaveDTO.setId(Long.valueOf(map.get("id").toString()));
                    return merchantApplyRangeOpenApiSaveDTO;
                }, Collectors.toList())));
                merchantApplyRangeList = null;
                for (MerchantOpenApiSaveDTO merchantOpenApiSaveDTO : merchantOpenApiSaveDTOList) {
                    merchantOpenApiSaveDTO.setMerchantApplyRanges(groupedByMerchantId.get(merchantOpenApiSaveDTO.getId().toString()));
                }
            }
        }
    }

    public Integer queryCountMerchantOpenApi(MerchantOpenApiQryDTO merchantOpenApiQryDTO) throws Exception {
        QuerySchema schema;
        Map result;
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        this.setQueryConditionGroupByMerchantOpenApiQryDTO(merchantOpenApiQryDTO, queryConditionGroup);
        if (merchantOpenApiQryDTO.getBelongOrgId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.orgId").eq((Object)merchantOpenApiQryDTO.getBelongOrgId()));
        }
        if ((result = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)(schema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)queryConditionGroup)))) != null && result.get("count") != null) {
            Integer count = Integer.valueOf(result.get("count").toString());
            return count;
        }
        return null;
    }

    private void setMerchantOpenApiDTOStopStatus(List<Long> merchantIdList, List<MerchantOpenApiSaveDTO> merchantOpenApiSaveDTOList) throws Exception {
        QuerySchema merchantApplyRangeSchema;
        List merchantApplyRangeList;
        if (!CollectionUtils.isEmpty(merchantIdList) && !CollectionUtils.isEmpty((Collection)(merchantApplyRangeList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)(merchantApplyRangeSchema = QuerySchema.create().addSelect(new String[]{"id", "merchantId", "merchantDetailId.stopstatus as stopstatus"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").in(merchantIdList), QueryCondition.name((String)"isCreator").eq((Object)true), QueryCondition.name((String)"isPotential").eq((Object)false)}))))))) {
            HashMap<String, Boolean> merchantStopStatusMap = new HashMap<String, Boolean>(merchantApplyRangeList.size());
            for (Map merchantDetail : merchantApplyRangeList) {
                if (merchantDetail.get("stopstatus") == null) continue;
                merchantStopStatusMap.put(merchantDetail.get("merchantId").toString(), Boolean.valueOf(merchantDetail.get("stopstatus").toString()));
            }
            for (MerchantOpenApiSaveDTO merchantOpenApiSaveDTO : merchantOpenApiSaveDTOList) {
                Boolean stopStaus = (Boolean)merchantStopStatusMap.get(merchantOpenApiSaveDTO.getId().toString());
                merchantOpenApiSaveDTO.setStopStatus(stopStaus);
            }
        }
    }

    private boolean setQueryConditionGroupByMerchantOpenApiQryDTO(MerchantOpenApiQryDTO merchantOpenApiQryDTO, QueryConditionGroup queryConditionGroup) {
        List orgIdList;
        boolean hasFilterItem = false;
        if (merchantOpenApiQryDTO.getId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)merchantOpenApiQryDTO.getId()));
            hasFilterItem = true;
        } else if (!CollectionUtils.isEmpty((Collection)merchantOpenApiQryDTO.getIdList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in((Collection)merchantOpenApiQryDTO.getIdList()));
            hasFilterItem = true;
        }
        if (!hasFilterItem && merchantOpenApiQryDTO.getCode() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)merchantOpenApiQryDTO.getCode()));
            hasFilterItem = true;
        } else if (!hasFilterItem && !CollectionUtils.isEmpty((Collection)merchantOpenApiQryDTO.getCodeList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").in((Collection)merchantOpenApiQryDTO.getCodeList()));
            hasFilterItem = true;
        }
        if (!hasFilterItem && merchantOpenApiQryDTO.getCreditCode() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"creditCode").eq((Object)merchantOpenApiQryDTO.getCreditCode()));
            hasFilterItem = true;
        } else if (!hasFilterItem && !CollectionUtils.isEmpty((Collection)merchantOpenApiQryDTO.getCreditCodeList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"creditCode").in((Collection)merchantOpenApiQryDTO.getCreditCodeList()));
            hasFilterItem = true;
        }
        if (!StringUtils.isEmpty((CharSequence)merchantOpenApiQryDTO.getCreateOrgId())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"createOrg").eq((Object)merchantOpenApiQryDTO.getCreateOrgId()));
            hasFilterItem = true;
        } else if (!StringUtils.isEmpty((CharSequence)merchantOpenApiQryDTO.getCreateOrgCode())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"createOrg.code").eq((Object)merchantOpenApiQryDTO.getCreateOrgCode()));
            hasFilterItem = true;
        } else if (merchantOpenApiQryDTO.getOnlyQuerySelf() == null && !CollectionUtils.isEmpty((Collection)(orgIdList = this.iServiceIsolateService.findMainOrgPermission(AppContext.getCurrentUser().getYhtUserId(), "aa_merchant", AppContext.getCurrentUser().getYhtTenantId())))) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"createOrg").in((Collection)orgIdList));
        }
        if (merchantOpenApiQryDTO.getCustomerClassId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"customerClass").eq((Object)merchantOpenApiQryDTO.getCustomerClassId()));
            hasFilterItem = true;
        } else if (!StringUtils.isEmpty((CharSequence)merchantOpenApiQryDTO.getCustomerClassCode())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"customerClass.code").eq((Object)merchantOpenApiQryDTO.getCustomerClassCode()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)merchantOpenApiQryDTO.getCustomerClassIdList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"customerClass").in((Collection)merchantOpenApiQryDTO.getCustomerClassIdList()));
            hasFilterItem = true;
        } else if (!CollectionUtils.isEmpty((Collection)merchantOpenApiQryDTO.getCustomerClassCodeList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"customerClass.code").in((Collection)merchantOpenApiQryDTO.getCustomerClassCodeList()));
            hasFilterItem = true;
        }
        if (merchantOpenApiQryDTO.getCustomerIndustryId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"customerIndustry").eq((Object)merchantOpenApiQryDTO.getCustomerIndustryId()));
            hasFilterItem = true;
        } else if (!StringUtils.isEmpty((CharSequence)merchantOpenApiQryDTO.getCustomerIndustryCode())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"customerIndustry.code").eq((Object)merchantOpenApiQryDTO.getCustomerIndustryCode()));
            hasFilterItem = true;
        }
        if (merchantOpenApiQryDTO.getInternalOrg() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"internalOrg").eq((Object)merchantOpenApiQryDTO.getInternalOrg()));
            hasFilterItem = true;
        }
        if (!StringUtils.isEmpty((CharSequence)merchantOpenApiQryDTO.getInternalOrgIdId())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"internalOrgId").eq((Object)merchantOpenApiQryDTO.getInternalOrgIdId()));
            hasFilterItem = true;
        } else if (!StringUtils.isEmpty((CharSequence)merchantOpenApiQryDTO.getInternalOrgIdCode())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"internalOrgId.code").eq((Object)merchantOpenApiQryDTO.getInternalOrgIdCode()));
            hasFilterItem = true;
        }
        if (merchantOpenApiQryDTO.getSuppliersId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"suppliers").eq((Object)merchantOpenApiQryDTO.getSuppliersId()));
            hasFilterItem = true;
        } else if (!StringUtils.isEmpty((CharSequence)merchantOpenApiQryDTO.getSuppliersCode())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"suppliers.code").eq((Object)merchantOpenApiQryDTO.getSuppliersCode()));
            hasFilterItem = true;
        }
        if (merchantOpenApiQryDTO.getBeganTime() != null || merchantOpenApiQryDTO.getEndTime() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").between((Object)merchantOpenApiQryDTO.getBeganTime(), (Object)merchantOpenApiQryDTO.getEndTime()));
            hasFilterItem = true;
        }
        if (merchantOpenApiQryDTO.getPubts() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").egt((Object)merchantOpenApiQryDTO.getPubts()));
            hasFilterItem = true;
        }
        if (merchantOpenApiQryDTO.getFilterPotential() != null && merchantOpenApiQryDTO.getFilterPotential().booleanValue()) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.isPotential").eq((Object)false));
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.isCreator").eq((Object)true));
            hasFilterItem = true;
        }
        if (merchantOpenApiQryDTO.getOnlyFilterPotential() != null && merchantOpenApiQryDTO.getOnlyFilterPotential().booleanValue()) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.isPotential").eq((Object)false));
        }
        if (merchantOpenApiQryDTO.getCreateFlag() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.isCreator").eq((Object)merchantOpenApiQryDTO.getCreateFlag()));
        }
        if (merchantOpenApiQryDTO.getOnlyQuerySelf() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.isApplied").eq((Object)merchantOpenApiQryDTO.getOnlyQuerySelf()));
        }
        if (merchantOpenApiQryDTO.getName() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)merchantOpenApiQryDTO.getName()));
            hasFilterItem = true;
        }
        if (StringUtils.isNotEmpty((CharSequence)merchantOpenApiQryDTO.getFuzzyName())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").like((Object)merchantOpenApiQryDTO.getFuzzyName()));
            hasFilterItem = true;
        }
        if (StringUtils.isNotEmpty((CharSequence)merchantOpenApiQryDTO.getShortname())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"shortname").eq((Object)merchantOpenApiQryDTO.getShortname()));
            hasFilterItem = true;
        }
        if (StringUtils.isNotEmpty((CharSequence)merchantOpenApiQryDTO.getFuzzyShortname())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"shortname").like((Object)merchantOpenApiQryDTO.getFuzzyShortname()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Map)merchantOpenApiQryDTO.getCharacterDefine())) {
            for (String key : merchantOpenApiQryDTO.getCharacterDefine().keySet()) {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)("merchantCharacter." + key)).eq(merchantOpenApiQryDTO.getCharacterDefine().get(key)));
            }
            hasFilterItem = true;
        }
        return hasFilterItem;
    }

    public CoreDocJsonResult<MerchantVO> detailNew(MerchantOpenApiQryDTO merchantOpenApiQryDTO) {
        try {
            Long merchantId = merchantOpenApiQryDTO.getId();
            String belongOrgId = merchantOpenApiQryDTO.getBelongOrgId();
            String merchantCode = merchantOpenApiQryDTO.getCode();
            String belongOrgCode = merchantOpenApiQryDTO.getBelongOrgCode();
            MerchantVO merchantVo = this.detailMerchant(merchantId, merchantCode);
            if (merchantVo != null) {
                if (StringUtils.isEmpty((CharSequence)belongOrgId) && StringUtils.isEmpty((CharSequence)belongOrgCode)) {
                    belongOrgId = merchantVo.getCreateOrg();
                    merchantVo.setBelongOrg(belongOrgId);
                    merchantVo.setBelongOrg___code(merchantVo.getCreateOrg___code());
                } else {
                    List funcOrgesByCode = new ArrayList();
                    ArrayList<String> orgConditionList = new ArrayList<String>();
                    if (StringUtils.isNotEmpty((CharSequence)belongOrgId)) {
                        orgConditionList.add(belongOrgId);
                        funcOrgesByCode = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(orgConditionList).withEnabled());
                    } else if (StringUtils.isNotEmpty((CharSequence)belongOrgCode)) {
                        orgConditionList.add(belongOrgCode);
                        funcOrgesByCode = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andCodeIn(orgConditionList).withEnabled());
                    }
                    if (CollectionUtils.isEmpty(funcOrgesByCode)) {
                        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
                    }
                    belongOrgId = ((OrgUnitDTO)funcOrgesByCode.get(0)).getId();
                    belongOrgCode = ((OrgUnitDTO)funcOrgesByCode.get(0)).getCode();
                    merchantVo.setBelongOrg(belongOrgId);
                    merchantVo.setBelongOrg___code(belongOrgCode);
                }
                MerchantApplyRangeDetailVO merchantApplyRangeDetailVO = this.detailMerchantApplyRangeDetail(merchantId, belongOrgId);
                if (merchantApplyRangeDetailVO != null) {
                    merchantVo.setMerchantAppliedDetail(merchantApplyRangeDetailVO);
                    merchantVo.setCustomerAreas(this.detailMerchantCustomerArea(merchantId, belongOrgId));
                    merchantVo.setPrincipals(this.detailMerchantPrincipal(merchantId, belongOrgId));
                    merchantVo.setInvoicingCustomers(this.detailMerchantInvoicingCustomer(merchantId, belongOrgId));
                    if (belongOrgId.equals(merchantVo.getCreateOrg())) {
                        merchantVo.setMerchantAddressInfos(this.detailMerchantAddress(merchantId));
                        merchantVo.setMerchantContactInfos(this.detailMerchantContact(merchantId));
                        merchantVo.setMerchantAgentFinancialInfos(this.detailMerchantAgentFinancial(merchantId));
                        merchantVo.setMerchantAgentInvoiceInfos(this.detailMerchantAgentInvoice(merchantId));
                        merchantVo.setMerchantApplyRanges(this.detailMerchantApplyRange(merchantId));
                        merchantVo.setMerchantRole(this.detailMerchantRole(merchantId));
                        if (merchantVo.getMerchantRole() != null && !"1".equals(merchantVo.getMerchantRole().getBusinessRole())) {
                            merchantVo.setMerchantsManager(this.detailMerchantManager(merchantId));
                        }
                    }
                } else {
                    return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
                }
                Map customExtendData = this.coreDocCustomExtendQueryService.getMerchantExtendData(merchantVo);
                merchantVo.setCustomExtend(customExtendData);
                return CoreDocJsonResult.success((Object)merchantVo);
            }
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u6863\u6848openApi\u6839\u636ecodeList\u83b7\u53d6\u5ba2\u6237\u6863\u6848\u62a5\u9519:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public MerchantVO detailMerchant(Long merchantId, String merchantCode) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (merchantId != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)merchantId));
        } else if (!StringUtils.isEmpty((CharSequence)merchantCode)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)merchantCode));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800870);
        }
        QuerySchema schema = QuerySchema.create().addSelect(merchantVOField).addCondition((ConditionExpression)queryConditionGroup);
        List merchantList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (boolean)true, (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantList)) {
            String time;
            Merchant merchant = (Merchant)merchantList.get(0);
            MerchantVO merchantVO = (MerchantVO)JSON.parseObject((String)JSON.toJSONString((Object)merchant), MerchantVO.class);
            if (merchant.get("name") != null) {
                merchantVO.setName(new MultiLangText((Map)merchant.get("name")));
            }
            if (merchant.get("shortname") != null) {
                merchantVO.setShortname(new MultiLangText((Map)merchant.get("shortname")));
            }
            if (merchant.get("address") != null) {
                merchantVO.setAddress(new MultiLangText((Map)merchant.get("address")));
            }
            if (merchant.get("scope") != null) {
                merchantVO.setScope(new MultiLangText((Map)merchant.get("scope")));
            }
            merchantVO.setMerchantCharacter((HashMap)merchant.get("merchantCharacter"));
            if (merchant.getBusinessterm() != null) {
                time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(merchant.getBusinessterm());
                merchantVO.setBusinessterm(time);
            }
            if (merchant.getBuildTime() != null) {
                time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(merchant.getBuildTime());
                merchantVO.setBuildTime(time);
            }
            if (merchant.getCreateTime() != null) {
                merchantVO.setCreateTime(merchant.getCreateTime());
            }
            if (merchant.getModifyTime() != null) {
                merchantVO.setModifyTime(merchant.getModifyTime());
            }
            return merchantVO;
        }
        return null;
    }

    public MerchantApplyRangeDetailVO detailMerchantApplyRangeDetail(Long merchantId, String belongOrgId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        UpcAPiTool.checkPara((String)belongOrgId);
        QueryConditionGroup conditionRange = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)belongOrgId), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"isPotential").eq((Object)false), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        QuerySchema schemaRange = QuerySchema.create().addSelect("id,merchantDetailId").addCondition((ConditionExpression)conditionRange);
        List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schemaRange, null);
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"id").eq((Object)((MerchantApplyRange)merchantApplyRangeList.get(0)).getMerchantDetailId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
            QuerySchema schema = QuerySchema.create().addSelect(rangeDetailVOField).addCondition((ConditionExpression)queryConditionGroup);
            List merchantApplyRangeDetailList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantDetail", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList)) {
                MerchantApplyRangeDetailVO merchantApplyRangeDetailVO = (MerchantApplyRangeDetailVO)JSON.parseObject((String)JSON.toJSONString(merchantApplyRangeDetailList.get(0)), MerchantApplyRangeDetailVO.class);
                merchantApplyRangeDetailVO.setMerchantApplyRangeDetailCharacter((HashMap)((MerchantDetail)merchantApplyRangeDetailList.get(0)).get("merchantApplyRangeDetailCharacter"));
                if (merchantApplyRangeDetailList.get(0) != null) {
                    if (((MerchantDetail)merchantApplyRangeDetailList.get(0)).getCreateTime() != null) {
                        merchantApplyRangeDetailVO.setCreateTime(((MerchantDetail)merchantApplyRangeDetailList.get(0)).getCreateTime());
                    }
                    if (((MerchantDetail)merchantApplyRangeDetailList.get(0)).getModifyTime() != null) {
                        merchantApplyRangeDetailVO.setModifyTime(((MerchantDetail)merchantApplyRangeDetailList.get(0)).getModifyTime());
                    }
                }
                return merchantApplyRangeDetailVO;
            }
        }
        return null;
    }

    public List<MerchantSaleAreaVO> detailMerchantCustomerArea(Long merchantId, String belongOrgId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        UpcAPiTool.checkPara((String)belongOrgId);
        QueryConditionGroup conditionRange = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)belongOrgId), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"isPotential").eq((Object)false), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        QuerySchema schemaRange = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)conditionRange);
        List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schemaRange, null);
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"merchantApplyRangeId").eq(((MerchantApplyRange)merchantApplyRangeList.get(0)).getId())});
            QuerySchema schema = QuerySchema.create().addSelect(customerAreaVOField).addCondition((ConditionExpression)queryConditionGroup);
            List customerAreaList = MetaDaoHelper.queryObject((String)"aa.merchant.CustomerArea", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
                return JSON.parseArray((String)JSON.toJSONString((Object)customerAreaList), MerchantSaleAreaVO.class);
            }
        }
        return null;
    }

    public List<MerchantPrincipalVO> detailMerchantPrincipal(Long merchantId, String belongOrgId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        UpcAPiTool.checkPara((String)belongOrgId);
        QueryConditionGroup conditionRange = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)belongOrgId), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"isPotential").eq((Object)false), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        QuerySchema schemaRange = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)conditionRange);
        List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schemaRange, null);
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"merchantApplyRangeId").eq(((MerchantApplyRange)merchantApplyRangeList.get(0)).getId())});
            QuerySchema schema = QuerySchema.create().addSelect(principalVOField).addCondition((ConditionExpression)queryConditionGroup);
            List principalList = MetaDaoHelper.queryObject((String)"aa.merchant.Principal", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)principalList)) {
                return JSON.parseArray((String)JSON.toJSONString((Object)principalList), MerchantPrincipalVO.class);
            }
        }
        return null;
    }

    public List<MerchantBillingVO> detailMerchantInvoicingCustomer(Long merchantId, String belongOrgId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        UpcAPiTool.checkPara((String)belongOrgId);
        QueryConditionGroup conditionRange = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)belongOrgId), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"isPotential").eq((Object)false), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        QuerySchema schemaRange = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)conditionRange);
        List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schemaRange, null);
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"merchantApplyRangeId").eq(((MerchantApplyRange)merchantApplyRangeList.get(0)).getId())});
            QuerySchema schema = QuerySchema.create().addSelect(invoicingCustomersVOField).addCondition((ConditionExpression)queryConditionGroup);
            List invoicingCustomersList = MetaDaoHelper.queryObject((String)"aa.merchant.InvoicingCustomers", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)invoicingCustomersList)) {
                return JSON.parseArray((String)JSON.toJSONString((Object)invoicingCustomersList), MerchantBillingVO.class);
            }
        }
        return null;
    }

    public List<MerchantAddressInfoVO> detailMerchantAddress(Long merchantId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
        QuerySchema schema = QuerySchema.create().addSelect(addressInfoVOField).addCondition((ConditionExpression)queryConditionGroup);
        List addressInfoList = MetaDaoHelper.queryObject((String)"aa.merchant.AddressInfo", (boolean)true, (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)addressInfoList)) {
            HashMap<Long, HashMap> addressInfoCharacterMap = new HashMap<Long, HashMap>();
            for (AddressInfo addressInfo : addressInfoList) {
                addressInfoCharacterMap.put((Long)addressInfo.getId(), (HashMap)addressInfo.get("addressInfoCharacter"));
            }
            List merchantAddressInfoVOS = JSON.parseArray((String)JSON.toJSONString((Object)addressInfoList), MerchantAddressInfoVO.class);
            for (MerchantAddressInfoVO merchantAddressInfoVO : merchantAddressInfoVOS) {
                merchantAddressInfoVO.setAddressInfoCharacter((HashMap)addressInfoCharacterMap.get(merchantAddressInfoVO.getId()));
            }
            return merchantAddressInfoVOS;
        }
        return null;
    }

    public List<MerchantContacterVO> detailMerchantContact(Long merchantId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
        QuerySchema schema = QuerySchema.create().addSelect(contacterVOField).addCondition((ConditionExpression)queryConditionGroup);
        List contactList = MetaDaoHelper.queryObject((String)"aa.merchant.Contacter", (boolean)true, (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)contactList)) {
            HashMap<Long, HashMap> contactInfoCharacterMap = new HashMap<Long, HashMap>();
            HashMap<Long, HashMap> contactInfoNameMap = new HashMap<Long, HashMap>();
            for (Contacter contact : contactList) {
                if (contact.get("contacterCharacter") != null) {
                    contactInfoCharacterMap.put((Long)contact.getId(), (HashMap)contact.get("contacterCharacter"));
                }
                contactInfoNameMap.put((Long)contact.getId(), (HashMap)contact.get("fullName"));
            }
            List merchantContacterVOS = JSON.parseArray((String)JSON.toJSONString((Object)contactList), MerchantContacterVO.class);
            for (MerchantContacterVO merchantContacterVO : merchantContacterVOS) {
                merchantContacterVO.setFullName(new MultiLangText((Map)contactInfoNameMap.get(merchantContacterVO.getId())));
                merchantContacterVO.setContacterCharacter((HashMap)contactInfoCharacterMap.get(merchantContacterVO.getId()));
            }
            return merchantContacterVOS;
        }
        return null;
    }

    public List<MerchantFinancialVO> detailMerchantAgentFinancial(Long merchantId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
        QuerySchema schema = QuerySchema.create().addSelect(agentFinancialVOField).addCondition((ConditionExpression)queryConditionGroup);
        List agentFinancialList = MetaDaoHelper.queryObject((String)"aa.merchant.AgentFinancial", (boolean)true, (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)agentFinancialList)) {
            HashMap<Long, HashMap> agentFinancialCharacterMap = new HashMap<Long, HashMap>();
            HashMap<Long, String> agentFinancialDateMap = new HashMap<Long, String>();
            HashMap<Long, HashMap> bankAccountNameMap = new HashMap<Long, HashMap>();
            HashMap<Long, HashMap> accountOpeningAddressMap = new HashMap<Long, HashMap>();
            for (AgentFinancial agentFinancial : agentFinancialList) {
                if (agentFinancial.get("bankAccountName") != null) {
                    bankAccountNameMap.put((Long)agentFinancial.getId(), (HashMap)agentFinancial.get("bankAccountName"));
                }
                if (agentFinancial.get("accountOpeningAddress") != null) {
                    accountOpeningAddressMap.put((Long)agentFinancial.getId(), (HashMap)agentFinancial.get("accountOpeningAddress"));
                }
                agentFinancialCharacterMap.put((Long)agentFinancial.getId(), (HashMap)agentFinancial.get("agentFinancialCharacter"));
                if (agentFinancial.get("accountOpeningDate") == null) continue;
                agentFinancialDateMap.put((Long)agentFinancial.getId(), agentFinancial.get("accountOpeningDate").toString());
            }
            List merchantFinancialVOS = JSON.parseArray((String)JSON.toJSONString((Object)agentFinancialList), MerchantFinancialVO.class);
            for (MerchantFinancialVO merchantFinancialVO : merchantFinancialVOS) {
                merchantFinancialVO.setBankAccountName(new MultiLangText((Map)bankAccountNameMap.get(merchantFinancialVO.getId())));
                merchantFinancialVO.setAccountOpeningAddress(new MultiLangText((Map)accountOpeningAddressMap.get(merchantFinancialVO.getId())));
                merchantFinancialVO.setAgentFinancialCharacter((HashMap)agentFinancialCharacterMap.get(merchantFinancialVO.getId()));
                merchantFinancialVO.setAccountOpeningDate((String)agentFinancialDateMap.get(merchantFinancialVO.getId()));
            }
            return merchantFinancialVOS;
        }
        return null;
    }

    public List<MerchantInvoiceVO> detailMerchantAgentInvoice(Long merchantId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
        QuerySchema schema = QuerySchema.create().addSelect(agentInvoiceVOField).addCondition((ConditionExpression)queryConditionGroup);
        List agentInvoiceList = MetaDaoHelper.queryObject((String)"aa.merchant.AgentInvoice", (boolean)true, (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)agentInvoiceList)) {
            HashMap<Long, HashMap> agentInvoiceCharacterMap = new HashMap<Long, HashMap>();
            HashMap<Long, HashMap> addressMap = new HashMap<Long, HashMap>();
            for (AgentInvoice agentInvoice : agentInvoiceList) {
                if (agentInvoice.get("address") != null) {
                    addressMap.put((Long)agentInvoice.getId(), (HashMap)agentInvoice.get("address"));
                }
                agentInvoiceCharacterMap.put((Long)agentInvoice.getId(), (HashMap)agentInvoice.get("agentInvoiceCharacter"));
            }
            List agentInvoiceVOS = JSON.parseArray((String)JSON.toJSONString((Object)agentInvoiceList), MerchantInvoiceVO.class);
            for (MerchantInvoiceVO agentInvoiceVO : agentInvoiceVOS) {
                agentInvoiceVO.setAddress(new MultiLangText((Map)addressMap.get(agentInvoiceVO.getId())));
                agentInvoiceVO.setAgentInvoiceCharacter((HashMap)agentInvoiceCharacterMap.get(agentInvoiceVO.getId()));
            }
            return agentInvoiceVOS;
        }
        return null;
    }

    public List<MerchantApplyRangeVO> detailMerchantApplyRange(Long merchantId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"isPotential").eq((Object)false)});
        QuerySchema schema = QuerySchema.create().addSelect(merchantApplyRangeVOField).addCondition((ConditionExpression)queryConditionGroup);
        List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (boolean)true, (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)merchantApplyRangeList), MerchantApplyRangeVO.class);
        }
        return null;
    }

    public MerchantRoleInfoVO detailMerchantRole(Long merchantId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
        QuerySchema schema = QuerySchema.create().addSelect(merchantRoleInfoVOField).addCondition((ConditionExpression)queryConditionGroup);
        List merchantRoleInfoList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantRoleInfo", (boolean)true, (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantRoleInfoList)) {
            return (MerchantRoleInfoVO)JSON.parseObject((String)JSON.toJSONString(merchantRoleInfoList.get(0)), MerchantRoleInfoVO.class);
        }
        return null;
    }

    public MerchantsManagerVO detailMerchantManager(Long merchantId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
        QuerySchema schema = QuerySchema.create().addSelect(merchantsManagerVOField).addCondition((ConditionExpression)queryConditionGroup);
        List merchantsManagerList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantsManager", (boolean)true, (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantsManagerList)) {
            return (MerchantsManagerVO)JSON.parseObject((String)JSON.toJSONString(merchantsManagerList.get(0)), MerchantsManagerVO.class);
        }
        return null;
    }

    public CoreDocJsonResult<MerchantOpenApiSaveDTO> detail(MerchantOpenApiQryDTO merchantOpenApiQryDTO) {
        try {
            Long merchantId = merchantOpenApiQryDTO.getId();
            String belongOrgId = merchantOpenApiQryDTO.getBelongOrgId();
            String merchantCode = merchantOpenApiQryDTO.getCode();
            String belongOrgCode = merchantOpenApiQryDTO.getBelongOrgCode();
            MerchantOpenApiSaveDTO merchantOpenApiSaveResultDTO = this.detailMerchantOpenApi(merchantId, merchantCode);
            if (merchantOpenApiSaveResultDTO != null) {
                if (StringUtils.isEmpty((CharSequence)belongOrgId) && StringUtils.isEmpty((CharSequence)belongOrgCode)) {
                    belongOrgId = merchantOpenApiSaveResultDTO.getCreateOrgId();
                } else {
                    List funcOrgesByCode = new ArrayList();
                    ArrayList<String> orgConditionList = new ArrayList<String>();
                    if (StringUtils.isNotEmpty((CharSequence)belongOrgId)) {
                        orgConditionList.add(belongOrgId);
                        funcOrgesByCode = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(orgConditionList).withEnabled());
                    } else if (StringUtils.isNotEmpty((CharSequence)belongOrgCode)) {
                        orgConditionList.add(belongOrgCode);
                        funcOrgesByCode = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andCodeIn(orgConditionList).withEnabled());
                    }
                    if (CollectionUtils.isEmpty(funcOrgesByCode)) {
                        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
                    }
                    belongOrgId = ((OrgUnitDTO)funcOrgesByCode.get(0)).getId();
                    belongOrgCode = ((OrgUnitDTO)funcOrgesByCode.get(0)).getCode();
                    merchantOpenApiSaveResultDTO.setBelongOrgId(belongOrgId);
                    merchantOpenApiSaveResultDTO.setBelongOrgCode(belongOrgCode);
                }
                MerchantApplyRangeDetailOpenApiSaveDTO merchantApplyRangeDetailOpenApiSaveDTO = this.detailMerchantApplyRangeDetailOpenApi(merchantOpenApiSaveResultDTO.getId(), belongOrgId);
                if (merchantApplyRangeDetailOpenApiSaveDTO != null) {
                    merchantOpenApiSaveResultDTO.setMerchantAppliedDetail(merchantApplyRangeDetailOpenApiSaveDTO);
                    merchantOpenApiSaveResultDTO.setCustomerAreas(this.detailMerchantCustomerAreaOpenApi(merchantOpenApiSaveResultDTO.getId(), belongOrgId));
                    merchantOpenApiSaveResultDTO.setPrincipals(this.detailMerchantPrincipalOpenApi(merchantOpenApiSaveResultDTO.getId(), belongOrgId));
                    merchantOpenApiSaveResultDTO.setInvoicingCustomers(this.detailMerchantInvoicingCustomerOpenApi(merchantOpenApiSaveResultDTO.getId(), belongOrgId));
                    if (belongOrgId.equals(merchantOpenApiSaveResultDTO.getCreateOrgId())) {
                        merchantOpenApiSaveResultDTO.setMerchantAddressInfos(this.detailMerchantAddressOpenApi(merchantOpenApiSaveResultDTO.getId()));
                        merchantOpenApiSaveResultDTO.setMerchantContactInfos(this.detailMerchantContactOpenApi(merchantOpenApiSaveResultDTO.getId()));
                        merchantOpenApiSaveResultDTO.setMerchantAgentFinancialInfos(this.detailMerchantAgentFinancialOpenApi(merchantOpenApiSaveResultDTO.getId()));
                        merchantOpenApiSaveResultDTO.setMerchantAgentInvoiceInfos(this.detailMerchantAgentInvoiceOpenApi(merchantOpenApiSaveResultDTO.getId()));
                        merchantOpenApiSaveResultDTO.setMerchantApplyRanges(this.detailMerchantApplyRangeOpenApi(merchantOpenApiSaveResultDTO.getId()));
                        merchantOpenApiSaveResultDTO.setMerchantRole(this.detailMerchantRoleOpenApi(merchantOpenApiSaveResultDTO.getId()));
                        if (merchantOpenApiSaveResultDTO.getMerchantRole() != null && !"1".equals(merchantOpenApiSaveResultDTO.getMerchantRole().getBusinessRole())) {
                            merchantOpenApiSaveResultDTO.setMerchantsManager(this.detailMerchantManagerOpenApi(merchantOpenApiSaveResultDTO.getId()));
                        }
                    }
                } else {
                    return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
                }
                return CoreDocJsonResult.success((Object)merchantOpenApiSaveResultDTO);
            }
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u6863\u6848openApi\u6839\u636ecodeList\u83b7\u53d6\u5ba2\u6237\u6863\u6848\u62a5\u9519:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<MerchantVO> createOrgBatchQueryMerchantWithDetail(MerchantOpenApiQryDTO merchantOpenApiQry, boolean needCount) {
        List<MerchantOpenApiSaveDTO> merchantOpenApiSaveResultDTOList = null;
        Integer recordCount = 0;
        try {
            merchantOpenApiSaveResultDTOList = this.queryMerchantOpenApi(merchantOpenApiQry);
            Integer count = this.queryCountMerchantOpenApi(merchantOpenApiQry);
            if (count != null) {
                recordCount = count;
            }
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u6863\u6848openApi\u5217\u8868\u67e5\u8be2\u83b7\u53d6\u5ba2\u6237\u6863\u6848\u62a5\u9519:{}", (Object)e.getMessage(), (Object)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        ArrayList<MerchantVO> merchantVOList = new ArrayList<MerchantVO>();
        if (!CollectionUtils.isEmpty(merchantOpenApiSaveResultDTOList)) {
            ArrayList<MerchantOpenApiQryDTO> merchantOpenApiQryDTOList = new ArrayList<MerchantOpenApiQryDTO>();
            for (MerchantOpenApiSaveDTO merchantOpenApiSaveDTO : merchantOpenApiSaveResultDTOList) {
                MerchantOpenApiQryDTO merchantDetailQryDTO = new MerchantOpenApiQryDTO();
                merchantDetailQryDTO.setId(merchantOpenApiSaveDTO.getId());
                merchantOpenApiQryDTOList.add(merchantDetailQryDTO);
            }
            if (merchantOpenApiQryDTOList.size() > 10) {
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_BATCH_DETAIL_QRY_LIST_ERROR));
            }
            for (MerchantOpenApiQryDTO merchantOpenApiQryDTO : merchantOpenApiQryDTOList) {
                CoreDocJsonResult<MerchantVO> merchantVOCoreDocJsonResult = this.detailNew(merchantOpenApiQryDTO);
                if (!CollectionUtils.isEmpty((Collection)merchantVOCoreDocJsonResult.getData())) {
                    merchantVOList.add((MerchantVO)merchantVOCoreDocJsonResult.getData().get(0));
                    continue;
                }
                ArrayList<MerchantVO> merchantVOSaveErrorList = new ArrayList<MerchantVO>();
                MerchantVO merchantVOSaveError = new MerchantVO();
                merchantVOSaveError.setId(String.valueOf(merchantOpenApiQryDTO.getId()));
                merchantVOSaveError.setBelongOrg(merchantOpenApiQryDTO.getBelongOrgId());
                merchantVOSaveError.setCode(merchantOpenApiQryDTO.getCode());
                merchantVOSaveError.setBelongOrg___code(merchantOpenApiQryDTO.getBelongOrgCode());
                merchantVOSaveErrorList.add(merchantVOSaveError);
                merchantVOCoreDocJsonResult.setData(merchantVOSaveErrorList);
                return merchantVOCoreDocJsonResult;
            }
        }
        CoreDocJsonResult success = CoreDocJsonResult.success(merchantVOList);
        success.setTotalCount(recordCount);
        return success;
    }

    public CoreDocJsonResult<MerchantVO> orgBatchQueryMerchantWithDetail(MerchantOpenApiQryDTO merchantOpenApiQry, boolean needCount) {
        Integer recordCount;
        List<Merchant> merchants;
        try {
            merchants = this.queryMerchantByQryDTO(merchantOpenApiQry);
            if (CollectionUtils.isEmpty(merchants)) {
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
            }
            recordCount = this.queryCountMerchantOpenApi(merchantOpenApiQry);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u6863\u6848openApi\u5217\u8868\u67e5\u8be2\u83b7\u53d6\u5ba2\u6237\u6863\u6848\u62a5\u9519:{}", (Object)e.getMessage(), (Object)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        ArrayList<MerchantOpenApiQryDTO> merchantOpenApiQryDTOList = new ArrayList<MerchantOpenApiQryDTO>();
        for (Merchant merchant : merchants) {
            MerchantOpenApiQryDTO merchantDetailQryDTO = new MerchantOpenApiQryDTO();
            merchantDetailQryDTO.setId((Long)merchant.getId());
            merchantDetailQryDTO.setBelongOrgId((String)merchant.get("rangesOrgId"));
            merchantDetailQryDTO.setBelongOrgCode((String)merchant.get("rangesOrgCode"));
            merchantOpenApiQryDTOList.add(merchantDetailQryDTO);
        }
        if (merchantOpenApiQryDTOList.size() > 10) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_BATCH_DETAIL_QRY_LIST_ERROR));
        }
        ArrayList<MerchantVO> merchantVOList = new ArrayList<MerchantVO>();
        for (MerchantOpenApiQryDTO merchantOpenApiQryDTO : merchantOpenApiQryDTOList) {
            CoreDocJsonResult<MerchantVO> merchantVOCoreDocJsonResult = this.detailNew(merchantOpenApiQryDTO);
            if (!CollectionUtils.isEmpty((Collection)merchantVOCoreDocJsonResult.getData())) {
                merchantVOList.add((MerchantVO)merchantVOCoreDocJsonResult.getData().get(0));
                continue;
            }
            ArrayList<MerchantVO> merchantVOSaveErrorList = new ArrayList<MerchantVO>();
            MerchantVO merchantVOSaveError = new MerchantVO();
            merchantVOSaveError.setId(String.valueOf(merchantOpenApiQryDTO.getId()));
            merchantVOSaveError.setBelongOrg(merchantOpenApiQryDTO.getBelongOrgId());
            merchantVOSaveError.setCode(merchantOpenApiQryDTO.getCode());
            merchantVOSaveError.setBelongOrg___code(merchantOpenApiQryDTO.getBelongOrgCode());
            merchantVOSaveErrorList.add(merchantVOSaveError);
            merchantVOCoreDocJsonResult.setData(merchantVOSaveErrorList);
            return merchantVOCoreDocJsonResult;
        }
        CoreDocJsonResult coreDocJsonResult = CoreDocJsonResult.success(merchantVOList);
        coreDocJsonResult.setTotalCount(recordCount);
        return coreDocJsonResult;
    }

    public CoreDocJsonResult<MerchantOpenApiSaveDTO> batchDetail(List<MerchantOpenApiQryDTO> merchantOpenApiQryDTOList) {
        if (!CollectionUtils.isEmpty(merchantOpenApiQryDTOList) && merchantOpenApiQryDTOList.size() <= 10) {
            ArrayList<MerchantOpenApiSaveDTO> merchantOpenApiSaveDTOList = new ArrayList<MerchantOpenApiSaveDTO>();
            for (MerchantOpenApiQryDTO merchantOpenApiQryDTO : merchantOpenApiQryDTOList) {
                CoreDocJsonResult<MerchantOpenApiSaveDTO> coreDocJsonResult = this.detail(merchantOpenApiQryDTO);
                if (CollectionUtils.isEmpty((Collection)coreDocJsonResult.getData())) continue;
                merchantOpenApiSaveDTOList.add((MerchantOpenApiSaveDTO)coreDocJsonResult.getData().get(0));
            }
            return CoreDocJsonResult.success(merchantOpenApiSaveDTOList);
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_BATCH_DETAIL_QRY_LIST_ERROR));
    }

    public MerchantOpenApiSaveDTO detailMerchantOpenApi(Long merchantId, String merchantCode) throws Exception {
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantOpenApiFieldUtils.MERCHANT_OPEN_API_FIELD_MAPPING, (String[])MERCHANT_OPEN_API_FIELD);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (merchantId != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)merchantId));
        } else if (!StringUtils.isEmpty((CharSequence)merchantCode)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)merchantCode));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800870);
        }
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        List merchantList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (boolean)true, (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantList)) {
            String time;
            Merchant merchant = (Merchant)merchantList.get(0);
            merchant.set("name", (Object)MerchantOpenApiUtils.getMultilingualVO((Map)((Map)merchant.get("name"))));
            merchant.set("shortname", (Object)MerchantOpenApiUtils.getMultilingualVO((Map)((Map)merchant.get("shortname"))));
            merchant.set("address", (Object)MerchantOpenApiUtils.getMultilingualVO((Map)((Map)merchant.get("address"))));
            merchant.set("scope", (Object)MerchantOpenApiUtils.getMultilingualVO((Map)((Map)merchant.get("scope"))));
            MerchantOpenApiSaveDTO merchantOpenApiSaveDTO = (MerchantOpenApiSaveDTO)JSON.parseObject((String)JSON.toJSONString((Object)merchant), MerchantOpenApiSaveDTO.class);
            merchantOpenApiSaveDTO.setMerchantCharacter((HashMap)merchant.get("merchantCharacter"));
            if (merchant.get("businessterm") != null) {
                merchantOpenApiSaveDTO.setBusinessterm(merchant.get("businessterm").toString());
            }
            if (merchant.getBuildTime() != null) {
                merchantOpenApiSaveDTO.setBuildTime(merchant.getBuildTime().toString());
            }
            if (merchant.getCreateTime() != null) {
                time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(merchant.getCreateTime());
                merchantOpenApiSaveDTO.setCreateTime(time);
            }
            if (merchant.getModifyTime() != null) {
                time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(merchant.getModifyTime());
                merchantOpenApiSaveDTO.setModifyTime(time);
            }
            return merchantOpenApiSaveDTO;
        }
        return null;
    }

    public List<MerchantAddressOpenApiSaveDTO> detailMerchantAddressOpenApi(Long merchantId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantOpenApiFieldUtils.MERCHANT_ADDRESS_OPEN_API_FIELD_MAPPING, (String[])MERCHANT_ADDRESS_OPEN_API_FIELD);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        List addressInfoList = MetaDaoHelper.queryObject((String)"aa.merchant.AddressInfo", (boolean)true, (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)addressInfoList)) {
            HashMap<Long, HashMap> addressInfoCharacterMap = new HashMap<Long, HashMap>();
            for (AddressInfo addressInfo : addressInfoList) {
                addressInfoCharacterMap.put((Long)addressInfo.getId(), (HashMap)addressInfo.get("addressInfoCharacter"));
            }
            List merchantAddressOpenApiSaveDTOList = JSON.parseArray((String)JSON.toJSONString((Object)addressInfoList), MerchantAddressOpenApiSaveDTO.class);
            for (MerchantAddressOpenApiSaveDTO merchantAddressOpenApiSaveDTO : merchantAddressOpenApiSaveDTOList) {
                merchantAddressOpenApiSaveDTO.setAddressInfoCharacter((HashMap)addressInfoCharacterMap.get(merchantAddressOpenApiSaveDTO.getId()));
            }
            return merchantAddressOpenApiSaveDTOList;
        }
        return null;
    }

    public List<MerchantContactOpenApiSaveDTO> detailMerchantContactOpenApi(Long merchantId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantOpenApiFieldUtils.MERCHANT_CONTACT_OPEN_API_FIELD_MAPPING, (String[])MERCHANT_CONTACT_OPEN_API_FIELD);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        List contactList = MetaDaoHelper.queryObject((String)"aa.merchant.Contacter", (boolean)true, (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)contactList)) {
            HashMap<Long, HashMap> contactInfoCharacterMap = new HashMap<Long, HashMap>();
            for (Contacter contact : contactList) {
                contact.set("fullName", (Object)MerchantOpenApiUtils.getMultilingualVO((Map)((Map)contact.get("fullName"))));
                contactInfoCharacterMap.put((Long)contact.getId(), (HashMap)contact.get("contacterCharacter"));
            }
            List merchantContactOpenApiSaveDTOList = JSON.parseArray((String)JSON.toJSONString((Object)contactList), MerchantContactOpenApiSaveDTO.class);
            for (MerchantContactOpenApiSaveDTO merchantContactOpenApiSaveDTO : merchantContactOpenApiSaveDTOList) {
                merchantContactOpenApiSaveDTO.setContacterCharacter((HashMap)contactInfoCharacterMap.get(merchantContactOpenApiSaveDTO.getId()));
            }
            return merchantContactOpenApiSaveDTOList;
        }
        return null;
    }

    public List<MerchantAgentFinancialOpenApiSaveDTO> detailMerchantAgentFinancialOpenApi(Long merchantId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantOpenApiFieldUtils.MERCHANT_AGENT_FINANCIAL_OPEN_API_FIELD_MAPPING, (String[])MERCHANT_AGENT_FINANCIAL_OPEN_API_FIELD);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        List agentFinancialList = MetaDaoHelper.queryObject((String)"aa.merchant.AgentFinancial", (boolean)true, (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)agentFinancialList)) {
            HashMap<Long, HashMap> agentFinancialCharacterMap = new HashMap<Long, HashMap>();
            HashMap<Long, String> agentFinancialDateMap = new HashMap<Long, String>();
            for (AgentFinancial agentFinancial : agentFinancialList) {
                agentFinancial.set("bankAccountName", (Object)MerchantOpenApiUtils.getMultilingualVO((Map)((Map)agentFinancial.get("bankAccountName"))));
                agentFinancial.set("accountOpeningAddress", (Object)MerchantOpenApiUtils.getMultilingualVO((Map)((Map)agentFinancial.get("accountOpeningAddress"))));
                agentFinancialCharacterMap.put((Long)agentFinancial.getId(), (HashMap)agentFinancial.get("agentFinancialCharacter"));
                if (agentFinancial.get("accountOpeningDate") == null) continue;
                agentFinancialDateMap.put((Long)agentFinancial.getId(), agentFinancial.get("accountOpeningDate").toString());
            }
            List merchantAgentFinancialOpenApiSaveDTOList = JSON.parseArray((String)JSON.toJSONString((Object)agentFinancialList), MerchantAgentFinancialOpenApiSaveDTO.class);
            for (MerchantAgentFinancialOpenApiSaveDTO merchantAgentFinancialOpenApiSaveDTO : merchantAgentFinancialOpenApiSaveDTOList) {
                merchantAgentFinancialOpenApiSaveDTO.setAgentFinancialCharacter((HashMap)agentFinancialCharacterMap.get(merchantAgentFinancialOpenApiSaveDTO.getId()));
                merchantAgentFinancialOpenApiSaveDTO.setAccountOpeningDate((String)agentFinancialDateMap.get(merchantAgentFinancialOpenApiSaveDTO.getId()));
            }
            return merchantAgentFinancialOpenApiSaveDTOList;
        }
        return null;
    }

    public List<MerchantAgentInvoiceOpenApiSaveDTO> detailMerchantAgentInvoiceOpenApi(Long merchantId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantOpenApiFieldUtils.MERCHANT_AGENT_INVOICE_OPEN_API_FIELD_MAPPING, (String[])MERCHANT_AGENT_INVOICE_OPEN_API_FIELD);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        List agentInvoiceList = MetaDaoHelper.queryObject((String)"aa.merchant.AgentInvoice", (boolean)true, (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)agentInvoiceList)) {
            HashMap<Long, HashMap> agentInvoiceCharacterMap = new HashMap<Long, HashMap>();
            for (AgentInvoice agentInvoice : agentInvoiceList) {
                agentInvoice.set("address", (Object)MerchantOpenApiUtils.getMultilingualVO((Map)((Map)agentInvoice.get("address"))));
                agentInvoiceCharacterMap.put((Long)agentInvoice.getId(), (HashMap)agentInvoice.get("agentInvoiceCharacter"));
            }
            List merchantAgentInvoiceOpenApiSaveDTOList = JSON.parseArray((String)JSON.toJSONString((Object)agentInvoiceList), MerchantAgentInvoiceOpenApiSaveDTO.class);
            for (MerchantAgentInvoiceOpenApiSaveDTO merchantAgentInvoiceOpenApiSaveDTO : merchantAgentInvoiceOpenApiSaveDTOList) {
                merchantAgentInvoiceOpenApiSaveDTO.setAgentInvoiceCharacter((HashMap)agentInvoiceCharacterMap.get(merchantAgentInvoiceOpenApiSaveDTO.getId()));
            }
            return merchantAgentInvoiceOpenApiSaveDTOList;
        }
        return null;
    }

    public List<MerchantApplyRangeOpenApiSaveDTO> detailMerchantApplyRangeOpenApi(Long merchantId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantOpenApiFieldUtils.MERCHANT_APPLY_RANGE_OPEN_API_FIELD_MAPPING, (String[])MERCHANT_APPLY_RANGE_OPEN_API_FIELD);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"isPotential").eq((Object)false)});
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (boolean)true, (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)merchantApplyRangeList), MerchantApplyRangeOpenApiSaveDTO.class);
        }
        return null;
    }

    public MerchantApplyRangeDetailOpenApiSaveDTO detailMerchantApplyRangeDetailOpenApi(Long merchantId, String belongOrgId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        UpcAPiTool.checkPara((String)belongOrgId);
        QueryConditionGroup conditionRange = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)belongOrgId), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"isPotential").eq((Object)false), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        QuerySchema schemaRange = QuerySchema.create().addSelect("id,merchantDetailId").addCondition((ConditionExpression)conditionRange);
        List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schemaRange, null);
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantOpenApiFieldUtils.MERCHANT_APPLY_RANGE_DETAIL_OPEN_API_FIELD_MAPPING, (String[])MERCHANT_APPLY_RANGE_DETAIL_OPEN_API_FIELD);
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"id").eq((Object)((MerchantApplyRange)merchantApplyRangeList.get(0)).getMerchantDetailId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
            QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
            List merchantApplyRangeDetailList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantDetail", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList)) {
                MerchantApplyRangeDetailOpenApiSaveDTO merchantApplyRangeDetailOpenApiSaveDTO = (MerchantApplyRangeDetailOpenApiSaveDTO)JSON.parseObject((String)JSON.toJSONString(merchantApplyRangeDetailList.get(0)), MerchantApplyRangeDetailOpenApiSaveDTO.class);
                merchantApplyRangeDetailOpenApiSaveDTO.setMerchantApplyRangeDetailCharacter((HashMap)((MerchantDetail)merchantApplyRangeDetailList.get(0)).get("merchantApplyRangeDetailCharacter"));
                if (merchantApplyRangeDetailList.get(0) != null) {
                    String time;
                    if (((MerchantDetail)merchantApplyRangeDetailList.get(0)).getCreateTime() != null) {
                        time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(((MerchantDetail)merchantApplyRangeDetailList.get(0)).getCreateTime());
                        merchantApplyRangeDetailOpenApiSaveDTO.setCreateTime(time);
                    }
                    if (((MerchantDetail)merchantApplyRangeDetailList.get(0)).getModifyTime() != null) {
                        time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(((MerchantDetail)merchantApplyRangeDetailList.get(0)).getModifyTime());
                        merchantApplyRangeDetailOpenApiSaveDTO.setModifyTime(time);
                    }
                }
                return merchantApplyRangeDetailOpenApiSaveDTO;
            }
        }
        return null;
    }

    public MerchantRoleOpenApiSaveDTO detailMerchantRoleOpenApi(Long merchantId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantOpenApiFieldUtils.MERCHANT_ROLE_OPEN_API_FIELD_MAPPING, (String[])MERCHANT_ROLE_OPEN_API_FIELD);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        List merchantRoleInfoList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantRoleInfo", (boolean)true, (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantRoleInfoList)) {
            return (MerchantRoleOpenApiSaveDTO)JSON.parseObject((String)JSON.toJSONString(merchantRoleInfoList.get(0)), MerchantRoleOpenApiSaveDTO.class);
        }
        return null;
    }

    public MerchantManagerOpenApiSaveDTO detailMerchantManagerOpenApi(Long merchantId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantOpenApiFieldUtils.MERCHANT_MANAGER_OPEN_API_FIELD_MAPPING, (String[])MERCHANT_MANAGER_OPEN_API_FIELD);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        List merchantsManagerList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantsManager", (boolean)true, (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantsManagerList)) {
            return (MerchantManagerOpenApiSaveDTO)JSON.parseObject((String)JSON.toJSONString(merchantsManagerList.get(0)), MerchantManagerOpenApiSaveDTO.class);
        }
        return null;
    }

    public List<MerchantCustomerAreaOpenApiSaveDTO> detailMerchantCustomerAreaOpenApi(Long merchantId, String belongOrgId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        UpcAPiTool.checkPara((String)belongOrgId);
        QueryConditionGroup conditionRange = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)belongOrgId), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"isPotential").eq((Object)false), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        QuerySchema schemaRange = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)conditionRange);
        List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schemaRange, null);
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
            QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantOpenApiFieldUtils.MERCHANT_CUSTOMER_AREA_OPEN_API_FIELD_MAPPING, (String[])MERCHANT_CUSTOMER_AREA_OPEN_API_FIELD);
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"merchantApplyRangeId").eq(((MerchantApplyRange)merchantApplyRangeList.get(0)).getId())});
            QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
            List customerAreaList = MetaDaoHelper.queryObject((String)"aa.merchant.CustomerArea", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
                return JSON.parseArray((String)JSON.toJSONString((Object)customerAreaList), MerchantCustomerAreaOpenApiSaveDTO.class);
            }
        }
        return null;
    }

    public List<MerchantPrincipalOpenApiSaveDTO> detailMerchantPrincipalOpenApi(Long merchantId, String belongOrgId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        UpcAPiTool.checkPara((String)belongOrgId);
        QueryConditionGroup conditionRange = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)belongOrgId), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"isPotential").eq((Object)false), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        QuerySchema schemaRange = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)conditionRange);
        List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schemaRange, null);
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
            QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantOpenApiFieldUtils.MERCHANT_PRINCIPAL_OPEN_API_FIELD_MAPPING, (String[])MERCHANT_PRINCIPAL_OPEN_API_FIELD);
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"merchantApplyRangeId").eq(((MerchantApplyRange)merchantApplyRangeList.get(0)).getId())});
            QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
            List principalList = MetaDaoHelper.queryObject((String)"aa.merchant.Principal", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)principalList)) {
                return JSON.parseArray((String)JSON.toJSONString((Object)principalList), MerchantPrincipalOpenApiSaveDTO.class);
            }
        }
        return null;
    }

    public List<MerchantInvoicingCustomerOpenApiSaveDTO> detailMerchantInvoicingCustomerOpenApi(Long merchantId, String belongOrgId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        UpcAPiTool.checkPara((String)belongOrgId);
        QueryConditionGroup conditionRange = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)belongOrgId), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"isPotential").eq((Object)false), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        QuerySchema schemaRange = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)conditionRange);
        List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schemaRange, null);
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
            QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantOpenApiFieldUtils.MERCHANT_INVOICING_CUSTOMER_OPEN_API_FIELD_MAPPING, (String[])MERCHANT_INVOICING_CUSTOMER_OPEN_API_FIELD);
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"merchantApplyRangeId").eq(((MerchantApplyRange)merchantApplyRangeList.get(0)).getId())});
            QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
            List invoicingCustomersList = MetaDaoHelper.queryObject((String)"aa.merchant.InvoicingCustomers", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)invoicingCustomersList)) {
                return JSON.parseArray((String)JSON.toJSONString((Object)invoicingCustomersList), MerchantInvoicingCustomerOpenApiSaveDTO.class);
            }
        }
        return null;
    }

    public CoreDocJsonResult<MerchantFileDTO> queryFileById(MerchantFileQryDTO merchantFileQryDTO) {
        try {
            if (merchantFileQryDTO == null || merchantFileQryDTO.getId() == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800871);
            }
            QuerySchema schema = new QuerySchema();
            schema.addSelect("id as merchant,merchantLogo,frontIdCard,backIdCard,businessLicenseNew,certificate");
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchantFileQryDTO.getId())}));
            Map query = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)schema);
            schema = new QuerySchema();
            schema.addSelect("attachment");
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantFileQryDTO.getId())}));
            List queryAttachments = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantQualificationDocument", (QuerySchema)schema, null);
            if (CollectionUtils.isEmpty((Map)query)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800872);
            }
            ArrayList<MerchantFileDTO> merchantFileDTOs = new ArrayList<MerchantFileDTO>();
            BatchBusinessFilesRequest request = new BatchBusinessFilesRequest();
            ArrayList<BatchBusinessFilesRequest> requestList = new ArrayList<BatchBusinessFilesRequest>();
            ArrayList<String> businessIds = new ArrayList<String>();
            HashMap<String, String> businessMap = new HashMap<String, String>();
            HashMap typeFileMap = new HashMap();
            if (merchantFileQryDTO.getFileType() != null) {
                if (query.get(merchantFileQryDTO.getFileType()) != null) {
                    businessIds.add(query.get(merchantFileQryDTO.getFileType()).toString());
                    businessMap.put(query.get(merchantFileQryDTO.getFileType()).toString(), merchantFileQryDTO.getFileType());
                    typeFileMap.put(merchantFileQryDTO.getFileType(), new ArrayList());
                }
                if (!CollectionUtils.isEmpty((Collection)queryAttachments)) {
                    for (MerchantQualificationDocument queryAttachment : queryAttachments) {
                        if (queryAttachment.get(merchantFileQryDTO.getFileType()) == null) continue;
                        businessIds.add(queryAttachment.get(merchantFileQryDTO.getFileType()).toString());
                        businessMap.put(queryAttachment.get(merchantFileQryDTO.getFileType()).toString(), merchantFileQryDTO.getFileType());
                        typeFileMap.put(merchantFileQryDTO.getFileType(), new ArrayList());
                    }
                }
            } else {
                for (String fileType : query.keySet()) {
                    if (query.get(fileType) == null) continue;
                    businessIds.add(query.get(fileType).toString());
                    businessMap.put(query.get(fileType).toString(), fileType);
                    typeFileMap.put(fileType, new ArrayList());
                }
                if (!CollectionUtils.isEmpty((Collection)queryAttachments)) {
                    for (MerchantQualificationDocument queryAttachment : queryAttachments) {
                        if (queryAttachment.getAttachment() == null) continue;
                        businessIds.add(queryAttachment.getAttachment());
                        businessMap.put(queryAttachment.getAttachment(), "attachment");
                        typeFileMap.put("attachment", new ArrayList());
                    }
                }
            }
            if (CollectionUtils.isEmpty(businessIds)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800873);
            }
            request.setBusinessIds(businessIds);
            request.setBusinessType("iuap-apdoc-material");
            request.setCancelFileExit(Boolean.valueOf(true));
            requestList.add(request);
            CooperationSuiteFile suiteFile = this.cooperationFileQueryService.batchBusinessFiles(requestList);
            if (suiteFile != null && suiteFile.getData() != null) {
                for (CooperationFileVO fileVO : suiteFile.getData()) {
                    FileDTO fileDTO = new FileDTO();
                    fileDTO.setFileUrl(fileVO.getBucketUrl());
                    fileDTO.setFileName(fileVO.getFileName());
                    if (fileVO.getFileSize() != null) {
                        fileDTO.setFileSize(fileVO.getFileSize().toString());
                    }
                    if (businessMap.get(fileVO.getObjectId()) == null || typeFileMap.get(businessMap.get(fileVO.getObjectId())) == null) continue;
                    ((List)typeFileMap.get(businessMap.get(fileVO.getObjectId()))).add(fileDTO);
                }
                for (String type : typeFileMap.keySet()) {
                    if (typeFileMap.get(type) == null) continue;
                    MerchantFileDTO merchantFileDTO = new MerchantFileDTO();
                    merchantFileDTO.setFileInfos((List)typeFileMap.get(type));
                    merchantFileDTO.setFileType(type);
                    merchantFileDTOs.add(merchantFileDTO);
                }
            }
            if (!CollectionUtils.isEmpty(merchantFileDTOs)) {
                return CoreDocJsonResult.success(merchantFileDTOs);
            }
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u6863\u6848openApi\u6839\u636eid\u548c\u9644\u4ef6\u7c7b\u578b\u83b7\u53d6\u9644\u4ef6\u4fe1\u606f\u62a5\u9519:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<MerchantFileDTO> queryFileByIdList(MerchantFileQryDTO merchantFileQryDTO) {
        try {
            if (merchantFileQryDTO == null || merchantFileQryDTO.getIdList() == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800874);
            }
            QuerySchema schema = new QuerySchema();
            schema.addSelect("id,merchantLogo,frontIdCard,backIdCard,businessLicenseNew,certificate,orgCertificate");
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in((Collection)merchantFileQryDTO.getIdList())}));
            List queryList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)schema);
            if (CollectionUtils.isEmpty((Collection)queryList)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800872);
            }
            ArrayList<MerchantFileDTO> merchantFileDTOs = new ArrayList<MerchantFileDTO>();
            BatchBusinessFilesRequest request = new BatchBusinessFilesRequest();
            ArrayList<BatchBusinessFilesRequest> requestList = new ArrayList<BatchBusinessFilesRequest>();
            ArrayList<String> businessIds = new ArrayList<String>();
            HashMap<String, String> businessTypeMap = new HashMap<String, String>();
            HashMap<String, Long> businessMerchantMap = new HashMap<String, Long>();
            for (Map query : queryList) {
                if (merchantFileQryDTO.getFileType() != null) {
                    if (query.get(merchantFileQryDTO.getFileType()) == null) continue;
                    businessIds.add(query.get(merchantFileQryDTO.getFileType()).toString());
                    businessTypeMap.put(query.get(merchantFileQryDTO.getFileType()).toString(), merchantFileQryDTO.getFileType());
                    businessMerchantMap.put(query.get(merchantFileQryDTO.getFileType()).toString(), (Long)query.get("id"));
                    continue;
                }
                for (String fileType : query.keySet()) {
                    if (query.get(fileType) == null) continue;
                    businessIds.add(query.get(fileType).toString());
                    businessTypeMap.put(query.get(fileType).toString(), fileType);
                    businessMerchantMap.put(query.get(fileType).toString(), (Long)query.get("id"));
                }
            }
            if (CollectionUtils.isEmpty(businessIds)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800873);
            }
            request.setBusinessIds(businessIds);
            request.setBusinessType("iuap-apdoc-material");
            request.setCancelFileExit(Boolean.valueOf(true));
            requestList.add(request);
            CooperationSuiteFile suiteFile = this.cooperationFileQueryService.batchBusinessFiles(requestList);
            MerchantFileDTO merchantFileDTO = new MerchantFileDTO();
            ArrayList<FileDTO> fileInfoList = new ArrayList<FileDTO>();
            if (suiteFile != null && suiteFile.getData() != null) {
                for (CooperationFileVO fileVO : suiteFile.getData()) {
                    FileDTO fileDTO = new FileDTO();
                    fileDTO.setFileUrl(fileVO.getBucketUrl());
                    fileDTO.setFileName(fileVO.getFileName());
                    if (fileVO.getFileSize() != null) {
                        fileDTO.setFileSize(fileVO.getFileSize().toString());
                    }
                    fileInfoList.add(fileDTO);
                    merchantFileDTO.setFileInfos(fileInfoList);
                    merchantFileDTO.setFileType((String)businessTypeMap.get(fileVO.getObjectId()));
                    merchantFileDTO.setId((Long)businessMerchantMap.get(fileVO.getObjectId()));
                    merchantFileDTO.setBusinessId(fileVO.getObjectId());
                    merchantFileDTOs.add(merchantFileDTO);
                }
            }
            if (!CollectionUtils.isEmpty(merchantFileDTOs)) {
                return CoreDocJsonResult.success(merchantFileDTOs);
            }
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.RESULT_IS_NULL));
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u6863\u6848openApi\u6839\u636eid\u548c\u9644\u4ef6\u7c7b\u578b\u83b7\u53d6\u9644\u4ef6\u4fe1\u606f\u62a5\u9519:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public void deleteAddressInfoByMerchantIdAndAddressId(Long id) throws Exception {
        if (id == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800875);
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)id)});
        QuerySchema schema = QuerySchema.create().addSelect("isDefault").addCondition((ConditionExpression)queryConditionGroup);
        List queryAddress = MetaDaoHelper.query((String)"aa.merchant.AddressInfo", (QuerySchema)schema);
        if (CollectionUtils.isEmpty((Collection)queryAddress)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800876);
        }
        Map address = (Map)queryAddress.get(0);
        if (BooleanUtil.isTrue(address.get("isDefault"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800877);
        }
        AddressInfo deleteAddressInfo = new AddressInfo();
        deleteAddressInfo.setEntityStatus(EntityStatus.Delete);
        deleteAddressInfo.setId((Object)id);
        MetaDaoHelper.delete((String)"aa.merchant.AddressInfo", (BizObject)deleteAddressInfo);
    }

    public void deleteAgentFinancialById(MerchantAgentFinancialOpenApiSaveDTO dto) throws Exception {
        QuerySchema schemaAgentFinancialCount;
        Map agentFinancialCount;
        if (dto.getId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800875);
        }
        QuerySchema schemaAgentFinancial = QuerySchema.create().addSelect("id, merchantId, merchantId.code as merchantCode, isDefault").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)dto.getId())}));
        Map queryAgentFinancial = MetaDaoHelper.queryOne((String)"aa.merchant.AgentFinancial", (QuerySchema)schemaAgentFinancial);
        if (CollectionUtils.isEmpty((Map)queryAgentFinancial)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800876);
        }
        boolean merchantNeedDefaultBank = MerchantUtils.getMerchantNeedDefault((String)"customerNeedDefaultBank");
        if (merchantNeedDefaultBank && BooleanUtil.isTrue(queryAgentFinancial.get("isDefault")) && !CollectionUtils.isEmpty((Map)(agentFinancialCount = MetaDaoHelper.queryOne((String)"aa.merchant.AgentFinancial", (QuerySchema)(schemaAgentFinancialCount = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(queryAgentFinancial.get("merchantId"))})))))) && Integer.parseInt(agentFinancialCount.get("count").toString()) > 1) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800878);
        }
        Merchant merchant = new Merchant();
        merchant.setId(queryAgentFinancial.get("merchantId"));
        merchant.setCode(queryAgentFinancial.get("merchantCode").toString());
        merchant.setEntityStatus(EntityStatus.Unchanged);
        AgentFinancial agentFinancial = new AgentFinancial();
        agentFinancial.setId(queryAgentFinancial.get("id"));
        agentFinancial.setEntityStatus(EntityStatus.Delete);
        ArrayList<AgentFinancial> agentFinancials = new ArrayList<AgentFinancial>();
        agentFinancials.add(agentFinancial);
        merchant.setMerchantAgentFinancialInfos(agentFinancials);
        this.checkDomainDeleteService.checkDomainDeleteDTO("aa.merchant.AgentFinancial", "aa_merchant", (BizObject)merchant);
        MetaDaoHelper.delete((String)"aa.merchant.AgentFinancial", (BizObject)agentFinancial);
    }

    public CoreDocJsonResult<String> deleteMerchant(MerchantOpenApiSaveDTO merchantOpenApiSaveDTO) {
        if (merchantOpenApiSaveDTO != null) {
            try {
                List merchantList;
                String createOrg = null;
                QuerySchema schema = new QuerySchema();
                schema.addSelect("id,createOrg");
                if (merchantOpenApiSaveDTO.getCode() != null && merchantOpenApiSaveDTO.getId() == null) {
                    schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)merchantOpenApiSaveDTO.getCode())}));
                    merchantList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)schema, null);
                    if (CollectionUtils.isEmpty((Collection)merchantList) || merchantList.get(0) == null || ((Merchant)merchantList.get(0)).getId() == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800879);
                    }
                    createOrg = ((Merchant)merchantList.get(0)).getCreateOrg();
                    merchantOpenApiSaveDTO.setId((Long)((Merchant)merchantList.get(0)).getId());
                } else {
                    if (merchantOpenApiSaveDTO.getCode() == null && merchantOpenApiSaveDTO.getId() == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800880);
                    }
                    if (merchantOpenApiSaveDTO.getId() != null) {
                        schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchantOpenApiSaveDTO.getId())}));
                        merchantList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)schema, null);
                        if (merchantList != null && merchantList.size() != 1) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800881);
                        }
                        createOrg = ((Merchant)merchantList.get(0)).getCreateOrg();
                        merchantOpenApiSaveDTO.setId((Long)((Merchant)merchantList.get(0)).getId());
                    }
                }
                Merchant merchant = new Merchant();
                merchant.setId((Object)merchantOpenApiSaveDTO.getId());
                schema = new QuerySchema();
                QueryConditionGroup conditionGroup = new QueryConditionGroup();
                conditionGroup.addCondition(new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isPotential").eq((Object)false)});
                if (merchantOpenApiSaveDTO.getBelongOrgId() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq((Object)merchantOpenApiSaveDTO.getBelongOrgId()));
                } else if (merchantOpenApiSaveDTO.getBelongOrgCode() != null) {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId.code").eq((Object)merchantOpenApiSaveDTO.getBelongOrgCode()));
                } else {
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq((Object)createOrg));
                }
                merchant.setCreateOrg(createOrg);
                schema = schema.addSelect("id,isCreator,orgId,merchantId");
                schema.addCondition((ConditionExpression)conditionGroup);
                Map merchantapplyrange = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema);
                if (merchantapplyrange == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800882);
                }
                merchant.put("belongOrg", merchantapplyrange.get("orgId"));
                merchant.put("merchantApplyRangeId", merchantapplyrange.get("id"));
                merchant.put("isCreator", merchantapplyrange.get("isCreator"));
                HashMap merchantApplyRangeDetail = new HashMap();
                merchantApplyRangeDetail.put("id", merchantapplyrange.get("merchantId"));
                merchant.put("merchantAppliedDetail", merchantApplyRangeDetail);
                merchant.put("_fromApi", (Object)true);
                ArrayList<Merchant> merchants = new ArrayList<Merchant>();
                merchants.add(merchant);
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("aa_merchantlist");
                billDataDto.setAction("delete");
                billDataDto.setData(merchants);
                billDataDto.setFromApi(true);
                ResultList result = this.billService.batchdelete(billDataDto);
                if (result.getSucessCount() > 0) {
                    return CoreDocJsonResult.success((Object)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_19B9B7040570000D", (String)"\u5220\u9664\u6210\u529f\uff01"));
                }
                if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
                    throw new CoreDocBusinessException(result.getMessages().get(0).toString());
                }
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                this.logger.error("\u5ba2\u6237\u6863\u6848\u5220\u9664\u62a5\u9519:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<MerchantOpenApiSaveDTO> addIdempotent(OpenAPIDTO<MerchantOpenApiSaveDTO> merchantOpenApiSaveDTO) {
        if (merchantOpenApiSaveDTO == null || merchantOpenApiSaveDTO.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            DTOCheckUtil.validateParamCheck((Object)merchantOpenApiSaveDTO.getData());
            MerchantOpenApiSaveDTO merchantOpenApiSaveResultDTO = this.saveMerchantOpenApi((MerchantOpenApiSaveDTO)merchantOpenApiSaveDTO.getData(), EntityStatus.Insert);
            if (merchantOpenApiSaveResultDTO.getId() != null) {
                return CoreDocJsonResult.success((Object)merchantOpenApiSaveResultDTO);
            }
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u6863\u6848openApi\u65b0\u589e\u4fdd\u5b58-\u5e42\u7b49\u62a5\u9519:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public void setCreateOrgBatchSaveMerchant(String matchRule, MerchantVO merchantVO, EntityStatus entityStatus, Map<String, String> diffDataModel) throws Exception {
        this.matchRuleMerchant(matchRule, merchantVO);
        this.matchRuleAddress(matchRule, merchantVO.getMerchantAddressInfos());
        this.matchRuleAgentFinancial(matchRule, merchantVO.getMerchantAgentFinancialInfos());
        this.matchRuleAgentInvoice(matchRule, merchantVO.getMerchantAgentInvoiceInfos());
        this.matchRuleMerchantApplyRange(matchRule, merchantVO.getMerchantApplyRanges());
        this.matchRuleMerchantApplyRangeDetail(matchRule, merchantVO.getMerchantAppliedDetail());
        this.matchRuleCustomerArea(matchRule, merchantVO.getCustomerAreas());
        this.matchRulePrincipal(matchRule, merchantVO.getPrincipals());
        this.matchRuleInvoicingCustomer(matchRule, merchantVO.getInvoicingCustomers());
        if (EntityStatus.Insert == entityStatus) {
            this.setInvoicingCustomerEntityStatus(merchantVO, entityStatus);
        }
        if (EntityStatus.Update == entityStatus) {
            this.setAddressEntityStatus(merchantVO, entityStatus, diffDataModel.get("aa.merchant.AddressInfo"));
            this.setContactEntityStatus(merchantVO, entityStatus, diffDataModel.get("aa.merchant.Contacter"));
            this.setAgentFinancialEntityStatus(merchantVO, entityStatus, diffDataModel.get("aa.merchant.AgentFinancial"));
            this.setAgentInvoiceEntityStatus(merchantVO, entityStatus, diffDataModel.get("aa.merchant.AgentInvoice"));
            this.setCustomerAreaEntityStatus(merchantVO, entityStatus);
            this.setPrincipalEntityStatus(merchantVO, entityStatus);
            this.setInvoicingCustomerEntityStatus(merchantVO, entityStatus);
        }
    }

    public void matchRuleMerchant(String matchRule, MerchantVO merchantVO) {
        if (merchantVO.getCreateOrg() != null && !"".equals(merchantVO.getCreateOrg())) {
            merchantVO.setCreateOrg___code(null);
        }
        if (merchantVO.getBelongOrg() != null && !"".equals(merchantVO.getBelongOrg())) {
            merchantVO.setBelongOrg___code(null);
        }
        if (merchantVO.getTransType() != null && !"".equals(merchantVO.getTransType())) {
            merchantVO.setTransType___code(null);
        }
        if (merchantVO.getLanguage() != null && !"".equals(merchantVO.getLanguage())) {
            merchantVO.setLanguage___code(null);
        }
        if (merchantVO.getParentManageOrg() != null && !"".equals(merchantVO.getParentManageOrg())) {
            merchantVO.setParentManageOrg___code(null);
        }
        if (merchantVO.getParentCustomer() != null && !"".equals(merchantVO.getParentCustomer())) {
            merchantVO.setParentCustomer___code(null);
        }
        if (merchantVO.getSuppliers() != null && !"".equals(merchantVO.getSuppliers())) {
            merchantVO.setSuppliers___code(null);
        }
        if (merchantVO.getInternalOrgId() != null && !"".equals(merchantVO.getInternalOrgId())) {
            merchantVO.setInternalOrgId___code(null);
        }
        if (merchantVO.getCustomerClass() != null && !"".equals(merchantVO.getCustomerClass())) {
            merchantVO.setCustomerClass___code(null);
        }
        if (merchantVO.getCustomerIndustry() != null && !"".equals(merchantVO.getCustomerIndustry())) {
            merchantVO.setCustomerIndustry___code(null);
        }
        if (merchantVO.getDevelopmentPartner() != null && !"".equals(merchantVO.getDevelopmentPartner())) {
            merchantVO.setDevelopmentPartner___code(null);
        }
    }

    public void matchRuleAddress(String matchRule, List<MerchantAddressInfoVO> addressInfoVOList) {
        if (!CollectionUtils.isEmpty(addressInfoVOList)) {
            for (MerchantAddressInfoVO addressInfoVO : addressInfoVOList) {
                if (addressInfoVO.getShipregion() != null && !"".equals(addressInfoVO.getShipregion())) {
                    addressInfoVO.setShipregion___code(null);
                    continue;
                }
                addressInfoVO.setShipregion(null);
            }
        }
    }

    public void matchRuleAgentFinancial(String matchRule, List<MerchantFinancialVO> agentFinancialVOList) {
        if (!CollectionUtils.isEmpty(agentFinancialVOList)) {
            for (MerchantFinancialVO agentFinancialVO : agentFinancialVOList) {
                if (agentFinancialVO.getCountry() != null && !"".equals(agentFinancialVO.getCountry())) {
                    agentFinancialVO.setCountry___name(null);
                }
                if (agentFinancialVO.getProvince() != null && !"".equals(agentFinancialVO.getProvince())) {
                    agentFinancialVO.setProvince___code(null);
                }
                if (agentFinancialVO.getCurrency() != null && !"".equals(agentFinancialVO.getCurrency())) {
                    agentFinancialVO.setCurrency___name(null);
                }
                if (agentFinancialVO.getBank() != null && !"".equals(agentFinancialVO.getBank())) {
                    agentFinancialVO.setBank___name(null);
                }
                if (agentFinancialVO.getOpenBank() == null || "".equals(agentFinancialVO.getOpenBank())) continue;
                agentFinancialVO.setOpenBank___name(null);
            }
        }
    }

    public void matchRuleAgentInvoice(String matchRule, List<MerchantInvoiceVO> agentInvoiceVOList) {
        if (!CollectionUtils.isEmpty(agentInvoiceVOList)) {
            for (MerchantInvoiceVO agentInvoiceVO : agentInvoiceVOList) {
                if (agentInvoiceVO.getBdBillingType() != null && !"".equals(agentInvoiceVO.getBdBillingType())) {
                    agentInvoiceVO.setBdBillingType___name(null);
                }
                if (agentInvoiceVO.getName() != null && !"".equals(agentInvoiceVO.getName())) {
                    agentInvoiceVO.setName___name(null);
                }
                if (agentInvoiceVO.getBankName() == null || "".equals(agentInvoiceVO.getBankName())) continue;
                agentInvoiceVO.setBankName___name(null);
            }
        }
    }

    public void matchRuleMerchantApplyRange(String matchRule, List<MerchantApplyRangeVO> merchantApplyRangeVOList) {
        if (!CollectionUtils.isEmpty(merchantApplyRangeVOList)) {
            for (MerchantApplyRangeVO merchantApplyRangeVO : merchantApplyRangeVOList) {
                if (merchantApplyRangeVO.getOrgId() == null || "".equals(merchantApplyRangeVO.getOrgId())) continue;
                merchantApplyRangeVO.setOrgId___code(null);
            }
        }
    }

    public void matchRuleMerchantApplyRangeDetail(String matchRule, MerchantApplyRangeDetailVO merchantApplyRangeDetailVO) {
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetailVO)) {
            if (merchantApplyRangeDetailVO.getCustomerLevel() != null && !"".equals(merchantApplyRangeDetailVO.getCustomerLevel())) {
                merchantApplyRangeDetailVO.setCustomerLevel___code(null);
            }
            if (merchantApplyRangeDetailVO.getCustomerType() != null && !"".equals(merchantApplyRangeDetailVO.getCustomerType())) {
                merchantApplyRangeDetailVO.setCustomerType___code(null);
            }
            if (merchantApplyRangeDetailVO.getDeliveryWarehouse() != null && !"".equals(merchantApplyRangeDetailVO.getDeliveryWarehouse())) {
                merchantApplyRangeDetailVO.setDeliveryWarehouse___code(null);
            }
            if (merchantApplyRangeDetailVO.getTransactionCurrency() != null && !"".equals(merchantApplyRangeDetailVO.getTransactionCurrency())) {
                merchantApplyRangeDetailVO.setTransactionCurrency___name(null);
            }
            if (merchantApplyRangeDetailVO.getExchangeratetype() != null && !"".equals(merchantApplyRangeDetailVO.getExchangeratetype())) {
                merchantApplyRangeDetailVO.setExchangeratetype___code(null);
            }
            if (merchantApplyRangeDetailVO.getTaxRate() != null && !"".equals(merchantApplyRangeDetailVO.getTaxRate())) {
                merchantApplyRangeDetailVO.setTaxRate___code(null);
            }
            if (merchantApplyRangeDetailVO.getCollectionAgreement() != null && !"".equals(merchantApplyRangeDetailVO.getCollectionAgreement())) {
                merchantApplyRangeDetailVO.setCollectionAgreement___name(null);
            }
            if (merchantApplyRangeDetailVO.getSettlementMethod() != null && !"".equals(merchantApplyRangeDetailVO.getSettlementMethod())) {
                merchantApplyRangeDetailVO.setSettlementMethod___name(null);
            }
            if (merchantApplyRangeDetailVO.getShipmentMethod() != null && !"".equals(merchantApplyRangeDetailVO.getShipmentMethod())) {
                merchantApplyRangeDetailVO.setShipmentMethod___name(null);
            }
        }
    }

    public void matchRuleCustomerArea(String matchRule, List<MerchantSaleAreaVO> customerAreaVOList) {
        if (!CollectionUtils.isEmpty(customerAreaVOList)) {
            for (MerchantSaleAreaVO customerAreaVO : customerAreaVOList) {
                if (customerAreaVO.getSaleAreaId() == null || "".equals(customerAreaVO.getSaleAreaId())) continue;
                customerAreaVO.setSaleAreaId___code(null);
            }
        }
    }

    public void matchRulePrincipal(String matchRule, List<MerchantPrincipalVO> principalVOList) {
        if (!CollectionUtils.isEmpty(principalVOList)) {
            for (MerchantPrincipalVO principalVO : principalVOList) {
                if (principalVO.getProfessSalesman() != null && !"".equals(principalVO.getProfessSalesman())) {
                    principalVO.setProfessSalesman___code(null);
                }
                if (principalVO.getSpecialManagementDep() == null || "".equals(principalVO.getSpecialManagementDep())) continue;
                principalVO.setSpecialManagementDep___code(null);
            }
        }
    }

    public void matchRuleInvoicingCustomer(String matchRule, List<MerchantBillingVO> invoicingCustomersVOList) {
        if (!CollectionUtils.isEmpty(invoicingCustomersVOList)) {
            for (MerchantBillingVO invoicingCustomersVO : invoicingCustomersVOList) {
                if (invoicingCustomersVO.getInvoicingCustomersId() == null || "".equals(invoicingCustomersVO.getInvoicingCustomersId())) continue;
                invoicingCustomersVO.setInvoicingCustomersId___code(null);
            }
        }
    }

    public void setAddressEntityStatus(MerchantVO merchantVO, EntityStatus entityStatus, String diffData) throws Exception {
        List addressInfoVOList = merchantVO.getMerchantAddressInfos();
        if (entityStatus == EntityStatus.Update) {
            List addressList;
            HashMap<String, Long> erpCodeIdMap = new HashMap<String, Long>();
            ArrayList<Long> idList = new ArrayList<Long>();
            idList.add(-1L);
            HashSet<Long> queryIds = new HashSet<Long>();
            ArrayList<String> erpCodeList = new ArrayList<String>();
            this.collectIdsAndErpCodes(addressInfoVOList, idList, erpCodeList, "merchantAddressInfos");
            if (!CollectionUtils.isEmpty(idList) && !CollectionUtils.isEmpty(addressList = this.getBizObjectById("aa.merchant.AddressInfo", idList, Long.parseLong(merchantVO.getId())))) {
                for (AddressInfo addressInfo : addressList) {
                    if (addressInfo.getId() == null) continue;
                    queryIds.add((Long)addressInfo.getId());
                }
            }
            if (!CollectionUtils.isEmpty(erpCodeList) && !CollectionUtils.isEmpty(addressList = this.getBizObjectByErpCode("aa.merchant.AddressInfo", erpCodeList, Long.parseLong(merchantVO.getId())))) {
                for (AddressInfo addressInfo : addressList) {
                    if (StringUtils.isEmpty((CharSequence)addressInfo.getErpCode())) continue;
                    erpCodeIdMap.put(addressInfo.getErpCode(), (Long)addressInfo.getId());
                    idList.add((Long)addressInfo.getId());
                }
            }
            this.setDataStatus(addressInfoVOList, queryIds, erpCodeIdMap);
            String field = "id,addressCode,address,isDefault";
            List addressList2 = this.getBizObjectByNoId(field, "aa.merchant.AddressInfo", idList, Long.parseLong(merchantVO.getId()));
            if (!CollectionUtils.isEmpty(addressList2)) {
                for (AddressInfo addressInfo : addressList2) {
                    MerchantAddressInfoVO addressInfoVO = new MerchantAddressInfoVO();
                    addressInfoVO.setId((Long)addressInfo.getId());
                    addressInfoVO.setAddressCode(addressInfo.getAddressCode());
                    addressInfoVO.setAddress(addressInfo.getAddress());
                    addressInfoVO.setIsDefault(addressInfo.getIsDefault());
                    if ("stop".equals(diffData)) {
                        addressInfoVO.setStopStatus(StopStatusChar.stop.getValue());
                        addressInfoVO.setEntityStatus("Update");
                        addressInfoVOList.add(addressInfoVO);
                        continue;
                    }
                    if (!"delete".equals(diffData)) continue;
                    addressInfoVO.setEntityStatus("Delete");
                    addressInfoVOList.add(addressInfoVO);
                }
            }
        }
        if (!CollectionUtils.isEmpty((Collection)addressInfoVOList)) {
            merchantVO.setMerchantAddressInfos(addressInfoVOList);
        }
    }

    public void setContactEntityStatus(MerchantVO merchantVO, EntityStatus entityStatus, String diffData) throws Exception {
        List merchantContacterVOList = merchantVO.getMerchantContactInfos();
        if (!CollectionUtils.isEmpty((Collection)merchantContacterVOList) && entityStatus == EntityStatus.Update) {
            String field;
            List contacterNoIdList;
            List contacterErpCodeList;
            List contacterList;
            HashMap<String, Long> erpCodeIdMap = new HashMap<String, Long>();
            ArrayList<Long> idList = new ArrayList<Long>();
            idList.add(-1L);
            HashSet<Long> queryIds = new HashSet<Long>();
            ArrayList<String> erpCodeList = new ArrayList<String>();
            this.collectIdsAndErpCodes(merchantContacterVOList, idList, erpCodeList, "merchantContactInfos");
            if (!CollectionUtils.isEmpty(idList) && !CollectionUtils.isEmpty(contacterList = this.getBizObjectById("aa.merchant.Contacter", idList, Long.parseLong(merchantVO.getId())))) {
                for (Contacter contacter : contacterList) {
                    if (contacter.getId() == null) continue;
                    queryIds.add((Long)contacter.getId());
                }
            }
            if (!CollectionUtils.isEmpty(contacterErpCodeList = this.getBizObjectByErpCode("aa.merchant.Contacter", erpCodeList, Long.parseLong(merchantVO.getId())))) {
                for (Contacter contacter : contacterErpCodeList) {
                    if (StringUtils.isEmpty((CharSequence)contacter.getErpCode())) continue;
                    erpCodeIdMap.put(contacter.getErpCode(), (Long)contacter.getId());
                    idList.add((Long)contacter.getId());
                }
            }
            this.setDataStatus(merchantContacterVOList, queryIds, erpCodeIdMap);
            if (!CollectionUtils.isEmpty(idList) && !CollectionUtils.isEmpty(contacterNoIdList = this.getBizObjectByNoId(field = "id,fullName,isDefault", "aa.merchant.Contacter", idList, Long.parseLong(merchantVO.getId())))) {
                for (Contacter contacter : contacterNoIdList) {
                    MerchantContacterVO merchantContacterVO = new MerchantContacterVO();
                    merchantContacterVO.setId((Long)contacter.getId());
                    HashMap<String, String> name = new HashMap<String, String>();
                    String locale = InvocationInfoProxy.getLocale();
                    if (StringUtils.isEmpty((CharSequence)locale)) {
                        locale = "zh_CN";
                    } else if (!"zh_CN".equals(locale)) {
                        name.put("zh_CN", contacter.getFullName());
                    }
                    name.put(locale, contacter.getFullName());
                    merchantContacterVO.setFullName(new MultiLangText(name));
                    merchantContacterVO.setIsDefault(contacter.getIsDefault());
                    if ("stop".equals(diffData)) {
                        merchantContacterVO.setStopStatus(StopStatusChar.stop.getValue());
                        merchantContacterVO.setEntityStatus("Update");
                        merchantContacterVOList.add(merchantContacterVO);
                        continue;
                    }
                    if (!"delete".equals(diffData)) continue;
                    merchantContacterVO.setEntityStatus("Delete");
                    merchantContacterVOList.add(merchantContacterVO);
                }
            }
        }
        if (!CollectionUtils.isEmpty((Collection)merchantContacterVOList)) {
            merchantVO.setMerchantContactInfos(merchantContacterVOList);
        }
    }

    public void setAgentFinancialEntityStatus(MerchantVO merchantVO, EntityStatus entityStatus, String diffData) throws Exception {
        List merchantFinancialVOList = merchantVO.getMerchantAgentFinancialInfos();
        if (!CollectionUtils.isEmpty((Collection)merchantFinancialVOList) && entityStatus == EntityStatus.Update) {
            String field;
            List agentFinancialNoIdList;
            List agentFinancialErpCodeList;
            List agentFinancialList;
            HashMap<String, Long> erpCodeIdMap = new HashMap<String, Long>();
            ArrayList<Long> idList = new ArrayList<Long>();
            idList.add(-1L);
            HashSet<Long> queryIds = new HashSet<Long>();
            ArrayList<String> erpCodeList = new ArrayList<String>();
            this.collectIdsAndErpCodes(merchantFinancialVOList, idList, erpCodeList, "merchantAgentFinancialInfos");
            if (!CollectionUtils.isEmpty(idList) && !CollectionUtils.isEmpty(agentFinancialList = this.getBizObjectById("aa.merchant.AgentFinancial", idList, Long.parseLong(merchantVO.getId())))) {
                for (AgentFinancial agentFinancial : agentFinancialList) {
                    if (agentFinancial.getId() == null) continue;
                    queryIds.add((Long)agentFinancial.getId());
                }
            }
            if (!CollectionUtils.isEmpty(agentFinancialErpCodeList = this.getBizObjectByErpCode("aa.merchant.AgentFinancial", erpCodeList, Long.parseLong(merchantVO.getId())))) {
                for (AgentFinancial agentFinancial : agentFinancialErpCodeList) {
                    if (StringUtils.isEmpty((CharSequence)agentFinancial.getErpCode())) continue;
                    erpCodeIdMap.put(agentFinancial.getErpCode(), (Long)agentFinancial.getId());
                    idList.add((Long)agentFinancial.getId());
                }
            }
            this.setDataStatus(merchantFinancialVOList, queryIds, erpCodeIdMap);
            if (!CollectionUtils.isEmpty(idList) && !CollectionUtils.isEmpty(agentFinancialNoIdList = this.getBizObjectByNoId(field = "id,currency,accountType,bank,openBank,bankAccount,bankAccountName,isDefault", "aa.merchant.AgentFinancial", idList, Long.parseLong(merchantVO.getId())))) {
                for (AgentFinancial agentFinancial : agentFinancialNoIdList) {
                    MerchantFinancialVO merchantFinancialVO = new MerchantFinancialVO();
                    merchantFinancialVO.setId((Long)agentFinancial.getId());
                    merchantFinancialVO.setCurrency(agentFinancial.getCurrency());
                    merchantFinancialVO.setAccountType(agentFinancial.getAccountType());
                    merchantFinancialVO.setBank(agentFinancial.getBank());
                    merchantFinancialVO.setOpenBank(agentFinancial.getOpenBank());
                    merchantFinancialVO.setBankAccount(agentFinancial.getBankAccount());
                    HashMap<String, String> name = new HashMap<String, String>();
                    String locale = InvocationInfoProxy.getLocale();
                    if (StringUtils.isEmpty((CharSequence)locale)) {
                        locale = "zh_CN";
                    } else if (!"zh_CN".equals(locale)) {
                        name.put("zh_CN", agentFinancial.getBankAccountName());
                    }
                    name.put(locale, agentFinancial.getBankAccountName());
                    merchantFinancialVO.setBankAccountName(new MultiLangText(name));
                    merchantFinancialVO.setIsDefault(agentFinancial.getIsDefault());
                    if ("stop".equals(diffData)) {
                        merchantFinancialVO.setStopstatus(Boolean.valueOf(true));
                        merchantFinancialVO.setEntityStatus("Update");
                        merchantFinancialVOList.add(merchantFinancialVO);
                        continue;
                    }
                    if (!"delete".equals(diffData)) continue;
                    merchantFinancialVO.setEntityStatus("Delete");
                    merchantFinancialVOList.add(merchantFinancialVO);
                }
            }
        }
        if (!CollectionUtils.isEmpty((Collection)merchantFinancialVOList)) {
            merchantVO.setMerchantAgentFinancialInfos(merchantFinancialVOList);
        }
    }

    public void setAgentInvoiceEntityStatus(MerchantVO merchantVO, EntityStatus entityStatus, String diffData) throws Exception {
        List agentInvoiceVOList = merchantVO.getMerchantAgentInvoiceInfos();
        if (!CollectionUtils.isEmpty((Collection)agentInvoiceVOList) && entityStatus == EntityStatus.Update) {
            String field;
            List agentInvoiceNoIdList;
            List agentInvoiceErpCodeList;
            List agentInvoiceList;
            HashMap<String, Long> erpCodeIdMap = new HashMap<String, Long>();
            ArrayList<Long> idList = new ArrayList<Long>();
            idList.add(-1L);
            HashSet<Long> queryIds = new HashSet<Long>();
            ArrayList<String> erpCodeList = new ArrayList<String>();
            this.collectIdsAndErpCodes(agentInvoiceVOList, idList, erpCodeList, "merchantAgentInvoiceInfos");
            if (!CollectionUtils.isEmpty(idList) && !CollectionUtils.isEmpty(agentInvoiceList = this.getBizObjectById("aa.merchant.AgentInvoice", idList, Long.parseLong(merchantVO.getId())))) {
                for (AgentInvoice agentInvoice : agentInvoiceList) {
                    if (agentInvoice.getId() == null) continue;
                    queryIds.add((Long)agentInvoice.getId());
                }
            }
            if (!CollectionUtils.isEmpty(agentInvoiceErpCodeList = this.getBizObjectByErpCode("aa.merchant.AgentInvoice", erpCodeList, Long.parseLong(merchantVO.getId())))) {
                for (AgentInvoice agentInvoice : agentInvoiceErpCodeList) {
                    if (StringUtils.isEmpty((CharSequence)agentInvoice.getErpCode())) continue;
                    erpCodeIdMap.put(agentInvoice.getErpCode(), (Long)agentInvoice.getId());
                    idList.add((Long)agentInvoice.getId());
                }
            }
            this.setDataStatus(agentInvoiceVOList, queryIds, erpCodeIdMap);
            if (!CollectionUtils.isEmpty(idList) && !CollectionUtils.isEmpty(agentInvoiceNoIdList = this.getBizObjectByNoId(field = "id,title,isDefault", "aa.merchant.AgentInvoice", idList, Long.parseLong(merchantVO.getId())))) {
                for (AgentInvoice agentInvoice : agentInvoiceNoIdList) {
                    MerchantInvoiceVO agentInvoiceVO = new MerchantInvoiceVO();
                    agentInvoiceVO.setId((Long)agentInvoice.getId());
                    agentInvoiceVO.setTitle(agentInvoice.getTitle());
                    agentInvoiceVO.setIsDefault(agentInvoice.getIsDefault());
                    if ("delete".equals(diffData)) {
                        agentInvoiceVO.setEntityStatus("Delete");
                        agentInvoiceVOList.add(agentInvoiceVO);
                    }
                    agentInvoiceVOList.add(agentInvoiceVO);
                }
            }
        }
        if (!CollectionUtils.isEmpty((Collection)agentInvoiceVOList)) {
            merchantVO.setMerchantAgentInvoiceInfos(agentInvoiceVOList);
        }
    }

    private <T extends PubLongCommonVO> void collectIdsAndErpCodes(List<T> voList, List<Long> idList, List<String> erpCodeList, String entityType) throws CoreDocBusinessException {
        HashSet<String> uniqueErpCodes = new HashSet<String>();
        if (CollectionUtils.isEmpty(voList)) {
            return;
        }
        for (PubLongCommonVO data : voList) {
            if (data != null && data.getId() != null) {
                idList.add(data.getId());
                continue;
            }
            if (StringUtils.isEmpty((CharSequence)data.getSourceUnique())) continue;
            if (uniqueErpCodes.contains(data.getSourceUnique())) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_ERP_CODE_ONE, new Object[]{entityType});
            }
            uniqueErpCodes.add(data.getSourceUnique());
            erpCodeList.add(data.getSourceUnique());
        }
    }

    private <T extends PubLongCommonVO> void setDataStatus(List<T> voList, Set<Long> queryIds, Map<String, Long> erpCodeIdMap) {
        if (CollectionUtils.isEmpty(voList)) {
            return;
        }
        for (PubLongCommonVO data : voList) {
            if (data != null && data.getId() != null) {
                if (queryIds.contains(data.getId())) {
                    if ("Delete".equals(data.getEntityStatus())) continue;
                    data.setEntityStatus("Update");
                    continue;
                }
                data.setEntityStatus("Insert");
                continue;
            }
            if (StringUtils.isEmpty((CharSequence)data.getSourceUnique())) continue;
            if (erpCodeIdMap.containsKey(data.getSourceUnique())) {
                data.setId(erpCodeIdMap.get(data.getSourceUnique()));
                if ("Delete".equals(data.getEntityStatus())) continue;
                data.setEntityStatus("Update");
                continue;
            }
            data.setEntityStatus("Insert");
        }
    }

    public void setCustomerAreaEntityStatus(MerchantVO merchantVO, EntityStatus entityStatus) throws Exception {
        List customerAreaVOList = merchantVO.getCustomerAreas();
        if (!CollectionUtils.isEmpty((Collection)customerAreaVOList) && entityStatus == EntityStatus.Update) {
            HashMap<Long, Long> saleAreaIdMap = new HashMap<Long, Long>();
            HashMap<String, Long> saleAreaCodeMap = new HashMap<String, Long>();
            ArrayList<Long> idList = new ArrayList<Long>();
            List<CustomerArea> customerAreaByFieldList = this.getCustomerAreaByField(merchantVO.getBelongOrg(), merchantVO.getBelongOrg___code(), Long.parseLong(merchantVO.getId()));
            if (!CollectionUtils.isEmpty(customerAreaByFieldList)) {
                for (CustomerArea customerArea : customerAreaByFieldList) {
                    if (customerArea.getSaleAreaId() != null) {
                        saleAreaIdMap.put(customerArea.getSaleAreaId(), (Long)customerArea.getId());
                    }
                    if (StringUtils.isEmpty((CharSequence)customerArea.getString("saleAreaIdCode"))) continue;
                    saleAreaCodeMap.put(customerArea.getString("saleAreaIdCode"), (Long)customerArea.getId());
                }
            }
            for (MerchantSaleAreaVO customerAreaVO : customerAreaVOList) {
                if (customerAreaVO.getSaleAreaId() != null) {
                    if (saleAreaIdMap.containsKey(customerAreaVO.getSaleAreaId())) {
                        customerAreaVO.setId((Long)saleAreaIdMap.get(customerAreaVO.getSaleAreaId()));
                        if (!"Delete".equals(customerAreaVO.getEntityStatus())) {
                            customerAreaVO.setEntityStatus("Update");
                        }
                    } else {
                        customerAreaVO.setEntityStatus("Insert");
                    }
                } else if (!StringUtils.isEmpty((CharSequence)customerAreaVO.getSaleAreaId___code())) {
                    if (saleAreaCodeMap.containsKey(customerAreaVO.getSaleAreaId___code())) {
                        customerAreaVO.setId((Long)saleAreaCodeMap.get(customerAreaVO.getSaleAreaId___code()));
                        if (!"Delete".equals(customerAreaVO.getEntityStatus())) {
                            customerAreaVO.setEntityStatus("Update");
                        }
                    } else {
                        customerAreaVO.setEntityStatus("Insert");
                    }
                }
                if (customerAreaVO.getId() == null) continue;
                idList.add(customerAreaVO.getId());
            }
            if (!CollectionUtils.isEmpty(customerAreaByFieldList)) {
                for (CustomerArea customerArea : customerAreaByFieldList) {
                    if (customerArea.getId() == null || !CollectionUtils.isEmpty(idList) && idList.contains((Long)customerArea.getId())) continue;
                    MerchantSaleAreaVO merchantCustomerAreaOpenApiSaveDTO = new MerchantSaleAreaVO();
                    merchantCustomerAreaOpenApiSaveDTO.setId((Long)customerArea.getId());
                    merchantCustomerAreaOpenApiSaveDTO.setSaleAreaId(customerArea.getSaleAreaId());
                    merchantCustomerAreaOpenApiSaveDTO.setSaleAreaId___code(customerArea.getString("saleAreaIdCode"));
                    merchantCustomerAreaOpenApiSaveDTO.setIsDefault(customerArea.getIsDefault());
                    merchantCustomerAreaOpenApiSaveDTO.setEntityStatus("Delete");
                    customerAreaVOList.add(merchantCustomerAreaOpenApiSaveDTO);
                }
            }
        }
    }

    public void setPrincipalEntityStatus(MerchantVO merchantVO, EntityStatus entityStatus) throws Exception {
        List principalVOList = merchantVO.getPrincipals();
        if (!CollectionUtils.isEmpty((Collection)principalVOList) && entityStatus == EntityStatus.Update) {
            HashMap<String, Long> principalIdMap = new HashMap<String, Long>();
            HashMap<String, Long> principalCodeMap = new HashMap<String, Long>();
            ArrayList<Long> idList = new ArrayList<Long>();
            List<Principal> principalByFieldList = this.getPrincipalByField(merchantVO.getBelongOrg(), merchantVO.getBelongOrg___code(), Long.parseLong(merchantVO.getId()));
            if (!CollectionUtils.isEmpty(principalByFieldList)) {
                for (Principal principal : principalByFieldList) {
                    if (principal.getProfessSalesman() != null) {
                        principalIdMap.put(principal.getProfessSalesman() + principal.getSpecialManagementDep(), (Long)principal.getId());
                    }
                    if (StringUtils.isEmpty((CharSequence)principal.getString("professSalesmanCode"))) continue;
                    principalCodeMap.put(principal.getString("professSalesmanCode") + principal.getString("specialManagementDepCode"), (Long)principal.getId());
                }
            }
            for (MerchantPrincipalVO principalVO : principalVOList) {
                if (principalVO.getProfessSalesman() != null) {
                    if (principalIdMap.containsKey(principalVO.getProfessSalesman() + principalVO.getSpecialManagementDep())) {
                        principalVO.setId((Long)principalIdMap.get(principalVO.getProfessSalesman() + principalVO.getSpecialManagementDep()));
                        if (!"Delete".equals(principalVO.getEntityStatus())) {
                            principalVO.setEntityStatus("Update");
                        }
                    } else {
                        principalVO.setEntityStatus("Insert");
                    }
                } else if (!StringUtils.isEmpty((CharSequence)(principalVO.getProfessSalesman___code() + principalVO.getSpecialManagementDep___code()))) {
                    if (principalCodeMap.containsKey(principalVO.getProfessSalesman___code() + principalVO.getSpecialManagementDep___code())) {
                        principalVO.setId((Long)principalCodeMap.get(principalVO.getProfessSalesman___code() + principalVO.getSpecialManagementDep___code()));
                        principalVO.setEntityStatus("Update");
                    } else {
                        principalVO.setEntityStatus("Insert");
                    }
                }
                if (principalVO.getId() == null) continue;
                idList.add(principalVO.getId());
            }
            if (!CollectionUtils.isEmpty(principalByFieldList)) {
                for (Principal principal : principalByFieldList) {
                    if (principal.getId() == null || !CollectionUtils.isEmpty(idList) && idList.contains((Long)principal.getId())) continue;
                    MerchantPrincipalVO principalVO = new MerchantPrincipalVO();
                    principalVO.setId((Long)principal.getId());
                    principalVO.setProfessSalesman(principal.getProfessSalesman());
                    principalVO.setProfessSalesman___code(principal.getString("professSalesmanCode"));
                    principalVO.setSpecialManagementDep(principal.getSpecialManagementDep());
                    principalVO.setSpecialManagementDep___code(principal.getString("specialManagementDepCode"));
                    principalVO.setIsDefault(principal.getIsDefault());
                    principalVO.setEntityStatus("Delete");
                    principalVOList.add(principalVO);
                }
            }
        }
    }

    public void setInvoicingCustomerEntityStatus(MerchantVO merchantVO, EntityStatus entityStatus) throws Exception {
        List invoicingCustomersVOList = merchantVO.getInvoicingCustomers();
        if (!CollectionUtils.isEmpty((Collection)invoicingCustomersVOList) && entityStatus == EntityStatus.Update) {
            HashMap<Long, Long> invoicingCustomerIdMap = new HashMap<Long, Long>();
            HashMap<String, Long> invoicingCustomerCodeMap = new HashMap<String, Long>();
            ArrayList<Long> idList = new ArrayList<Long>();
            List<InvoicingCustomers> invoicingCustomerByFieldList = this.getInvoicingCustomerByField(merchantVO.getBelongOrg(), merchantVO.getBelongOrg___code(), Long.parseLong(merchantVO.getId()));
            if (!CollectionUtils.isEmpty(invoicingCustomerByFieldList)) {
                for (InvoicingCustomers invoicingCustomer : invoicingCustomerByFieldList) {
                    if (invoicingCustomer.getInvoicingCustomersId() != null) {
                        invoicingCustomerIdMap.put(invoicingCustomer.getInvoicingCustomersId(), (Long)invoicingCustomer.getId());
                    }
                    if (StringUtils.isEmpty((CharSequence)invoicingCustomer.getString("invoicingCustomersCode"))) continue;
                    invoicingCustomerCodeMap.put(invoicingCustomer.getString("invoicingCustomersCode"), (Long)invoicingCustomer.getId());
                }
            }
            for (MerchantBillingVO invoicingCustomersVO : invoicingCustomersVOList) {
                if (invoicingCustomersVO.getInvoicingCustomersId() != null) {
                    if (invoicingCustomerIdMap.containsKey(invoicingCustomersVO.getInvoicingCustomersId())) {
                        invoicingCustomersVO.setId((Long)invoicingCustomerIdMap.get(invoicingCustomersVO.getInvoicingCustomersId()));
                        if (!"Delete".equals(invoicingCustomersVO.getEntityStatus())) {
                            invoicingCustomersVO.setEntityStatus("Update");
                        }
                    } else {
                        invoicingCustomersVO.setEntityStatus("Insert");
                    }
                } else if (!StringUtils.isEmpty((CharSequence)invoicingCustomersVO.getInvoicingCustomersId___code())) {
                    if (invoicingCustomerCodeMap.containsKey(invoicingCustomersVO.getInvoicingCustomersId___code())) {
                        invoicingCustomersVO.setId((Long)invoicingCustomerCodeMap.get(invoicingCustomersVO.getInvoicingCustomersId___code()));
                        if (!"Delete".equals(invoicingCustomersVO.getEntityStatus())) {
                            invoicingCustomersVO.setEntityStatus("Update");
                        }
                    } else {
                        invoicingCustomersVO.setEntityStatus("Insert");
                    }
                }
                if (invoicingCustomersVO.getId() == null) continue;
                idList.add(invoicingCustomersVO.getId());
            }
            if (!CollectionUtils.isEmpty(invoicingCustomerByFieldList)) {
                for (InvoicingCustomers invoicingCustomer : invoicingCustomerByFieldList) {
                    if (invoicingCustomer.getId() == null || !CollectionUtils.isEmpty(idList) && idList.contains((Long)invoicingCustomer.getId())) continue;
                    MerchantBillingVO merchantInvoicingCustomerOpenApiSaveDTO = new MerchantBillingVO();
                    merchantInvoicingCustomerOpenApiSaveDTO.setId((Long)invoicingCustomer.getId());
                    merchantInvoicingCustomerOpenApiSaveDTO.setInvoicingCustomersId(invoicingCustomer.getInvoicingCustomersId());
                    merchantInvoicingCustomerOpenApiSaveDTO.setInvoicingCustomersId___code(invoicingCustomer.getString("invoicingCustomersCode"));
                    merchantInvoicingCustomerOpenApiSaveDTO.setIsDefault(invoicingCustomer.getIsDefault());
                    merchantInvoicingCustomerOpenApiSaveDTO.setEntityStatus("Delete");
                    invoicingCustomersVOList.add(merchantInvoicingCustomerOpenApiSaveDTO);
                }
            }
        } else if (!CollectionUtils.isEmpty((Collection)invoicingCustomersVOList) && entityStatus == EntityStatus.Insert) {
            ArrayList<MerchantBillingVO> newInvoicingCustomersVOList = new ArrayList<MerchantBillingVO>();
            for (MerchantBillingVO invoicingCustomersVO : invoicingCustomersVOList) {
                if (invoicingCustomersVO.getInvoicingCustomersId() != null && merchantVO.getId() != null && !invoicingCustomersVO.getInvoicingCustomersId().toString().equals(merchantVO.getId())) {
                    newInvoicingCustomersVOList.add(invoicingCustomersVO);
                    continue;
                }
                if (StringUtils.isEmpty((CharSequence)invoicingCustomersVO.getInvoicingCustomersId___code()) || StringUtils.isEmpty((CharSequence)merchantVO.getCode()) || invoicingCustomersVO.getInvoicingCustomersId___code().equals(merchantVO.getCode())) continue;
                newInvoicingCustomersVOList.add(invoicingCustomersVO);
            }
            if (!CollectionUtils.isEmpty(newInvoicingCustomersVOList)) {
                merchantVO.setInvoicingCustomers(newInvoicingCustomersVOList);
            } else {
                merchantVO.setInvoicingCustomers(null);
            }
        }
    }

    public <T extends BizObject> List<T> getBizObjectByErpCode(String fullName, List<String> erpCodeList, Long merchantId) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,erpCode");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"erpCode").in(erpCodeList)}));
        return MetaDaoHelper.queryObject((String)fullName, (QuerySchema)querySchema, null);
    }

    public <T extends BizObject> List<T> getBizObjectById(String fullName, List<Long> idList, Long merchantId) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,erpCode");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"id").in(idList)}));
        return MetaDaoHelper.queryObject((String)fullName, (QuerySchema)querySchema, null);
    }

    public <T extends BizObject> List<T> getBizObjectByNoId(String fieldString, String fullName, List<Long> idList, Long merchantId) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect(fieldString);
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"id").not_in(idList)}));
        return MetaDaoHelper.queryObject((String)fullName, (QuerySchema)querySchema, null);
    }

    public List<CustomerArea> getCustomerAreaByField(String orgId, String orgIdCode, Long merchantId) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id as id,saleAreaId as saleAreaId,saleAreaId.code as saleAreaIdCode,isDefault as isDefault");
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
        if (!StringUtils.isEmpty((CharSequence)orgId)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId.orgId").eq((Object)orgId));
        } else if (!StringUtils.isEmpty((CharSequence)orgIdCode)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId.orgId.code").eq((Object)orgIdCode));
        } else {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId.isCreator").eq((Object)true));
        }
        querySchema.addCondition((ConditionExpression)queryConditionGroup);
        return MetaDaoHelper.queryObject((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema, null);
    }

    public List<Principal> getPrincipalByField(String orgId, String orgIdCode, Long merchantId) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id as id,professSalesman as professSalesman,professSalesman.code as professSalesmanCode,specialManagementDep as specialManagementDep, specialManagementDep.code as specialManagementDepCode,isDefault as isDefault");
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
        if (!StringUtils.isEmpty((CharSequence)orgId)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId.orgId").eq((Object)orgId));
        } else if (!StringUtils.isEmpty((CharSequence)orgIdCode)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId.orgId.code").eq((Object)orgIdCode));
        } else {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId.isCreator").eq((Object)true));
        }
        querySchema.addCondition((ConditionExpression)queryConditionGroup);
        return MetaDaoHelper.queryObject((String)"aa.merchant.Principal", (QuerySchema)querySchema, null);
    }

    public List<InvoicingCustomers> getInvoicingCustomerByField(String orgId, String orgIdCode, Long merchantId) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id as id,invoicingCustomersId as invoicingCustomersId,invoicingCustomersId.code as invoicingCustomersCode,isDefault as isDefault");
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
        if (!StringUtils.isEmpty((CharSequence)orgId)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId.orgId").eq((Object)orgId));
        } else if (!StringUtils.isEmpty((CharSequence)orgIdCode)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId.orgId.code").eq((Object)orgIdCode));
        } else {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId.isCreator").eq((Object)true));
        }
        querySchema.addCondition((ConditionExpression)queryConditionGroup);
        return MetaDaoHelper.queryObject((String)"aa.merchant.InvoicingCustomers", (QuerySchema)querySchema, null);
    }

    public String deleteMerchantData(String merchantId, String merchantCode, String orgCode, String billnum) throws Exception {
        QuerySchema querySchema;
        QueryConditionGroup queryConditionGroup;
        if (StringUtils.isEmpty((CharSequence)merchantCode) && StringUtils.isEmpty((CharSequence)merchantId)) {
            return null;
        }
        List merchantInDbList = new ArrayList();
        if (!StringUtils.isEmpty((CharSequence)merchantId)) {
            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)Long.parseLong(merchantId))});
            querySchema = QuerySchema.create().addSelect("id,code,name,createOrg").addCondition((ConditionExpression)queryConditionGroup);
            merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
        }
        if (CollectionUtils.isEmpty(merchantInDbList) && !StringUtils.isEmpty((CharSequence)merchantCode)) {
            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)merchantCode)});
            querySchema = QuerySchema.create().addSelect("id,code,name,createOrg").addCondition((ConditionExpression)queryConditionGroup);
            merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
        }
        if (CollectionUtils.isEmpty(merchantInDbList)) {
            return null;
        }
        queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(((Merchant)merchantInDbList.get(0)).getId()), QueryCondition.name((String)"isPotential").eq((Object)false)});
        querySchema = QuerySchema.create().addSelect("id,merchantId,orgId,isCreator,isApplied").addCondition((ConditionExpression)queryConditionGroup);
        if (!StringUtils.isEmpty((CharSequence)orgCode)) {
            querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"orgId.code").eq((Object)orgCode)});
        } else {
            querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"isCreator").eq((Object)true)});
        }
        List merchantApplyRangeInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
        if (CollectionUtils.isEmpty((Collection)merchantApplyRangeInDbList)) {
            return null;
        }
        BillDataDto bill = new BillDataDto();
        bill.setData(this.initDeleteParam((Merchant)merchantInDbList.get(0), (MerchantApplyRange)merchantApplyRangeInDbList.get(0)));
        bill.setBillnum(billnum);
        RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
        if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
            return result.getMessages().get(0).toString();
        }
        return null;
    }

    public Map<String, Object> initDeleteParam(Merchant merchant, MerchantApplyRange merchantApplyRange) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("id", merchant.getId());
        params.put("code", merchant.getCode());
        params.put("name", merchant.getName());
        params.put("createOrg", merchant.getCreateOrg());
        params.put("isCreator", merchantApplyRange.getIsCreator());
        params.put("isApplied", merchantApplyRange.getIsApplied());
        params.put("belongOrg", merchantApplyRange.getOrgId());
        if (!merchantApplyRange.getIsCreator().booleanValue()) {
            params.put("merchantApplyRangeId", merchantApplyRange.getId().toString());
        } else {
            params.put("merchantApplyRangeId", merchantApplyRange.getId());
        }
        params.put("merchantAppliedDetail!id", merchantApplyRange.getMerchantId());
        HashMap<String, Object> carryParams = new HashMap<String, Object>();
        carryParams.put("isCreator", merchantApplyRange.getIsCreator());
        carryParams.put("isApplied", merchantApplyRange.getIsApplied());
        carryParams.put("orgId", merchantApplyRange.getOrgId());
        carryParams.put("merchantApplyRangeId", merchantApplyRange.getId());
        params.put("carryParams", carryParams);
        return params;
    }
}

