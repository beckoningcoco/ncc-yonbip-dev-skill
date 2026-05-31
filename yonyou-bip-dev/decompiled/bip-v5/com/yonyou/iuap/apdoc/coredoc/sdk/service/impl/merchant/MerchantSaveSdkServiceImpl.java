/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantAddressPO
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.sdk.dto.common.DocOrgIdDTO
 *  com.yonyou.iuap.apdoc.sdk.dto.merchant.AddressInfoDataDTO
 *  com.yonyou.iuap.apdoc.sdk.dto.merchant.AgentFinancialDataDTO
 *  com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantApplyRangeDataDTO
 *  com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantBillingDataDTO
 *  com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantContacterDataDTO
 *  com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantDataDTO
 *  com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantDetailDataDTO
 *  com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantInvoiceDataDTO
 *  com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantPrincipalDataDTO
 *  com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantQualificationDocumentDataDTO
 *  com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantRoleInfoDataDTO
 *  com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantSaleAreaDataDTO
 *  com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantsManagerDataDTO
 *  com.yonyou.iuap.apdoc.sdk.service.merchant.IMerchantSaveService
 *  com.yonyou.iuap.log.cons.BusinessLogMode
 *  com.yonyou.iuap.log.model.BusinessLogObjectBuilder
 *  com.yonyou.iuap.log.rpc.IBusiLogService
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.param.BaseEntity
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyou.ucf.mdd.ext.util.JsonUtils
 *  com.yonyou.ypd.bill.basic.service.api.IBillActionService
 *  com.yonyou.ypd.bill.infrastructure.service.api.IDTOConvertService
 *  com.yonyoucloud.iuap.upc.api.IMerchantServiceV2
 *  com.yonyoucloud.iuap.upc.dto.MerchantContacterDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCEntityStatus
 *  com.yonyoucloud.upc.aa.merchant.AddressInfo
 *  com.yonyoucloud.upc.aa.merchant.AgentFinancial
 *  com.yonyoucloud.upc.aa.merchant.AgentInvoice
 *  com.yonyoucloud.upc.aa.merchant.Contacter
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.FrozenState
 *  com.yonyoucloud.upc.aa.merchant.InvoicingCustomers
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeExt
 *  com.yonyoucloud.upc.aa.merchant.MerchantQualificationDocument
 *  com.yonyoucloud.upc.aa.merchant.MerchantRoleInfo
 *  com.yonyoucloud.upc.aa.merchant.MerchantsManager
 *  com.yonyoucloud.upc.aa.merchant.Payway
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.upc.data.merchant.MerchantGroupDao
 *  com.yonyoucloud.upc.utils.APIExtPropertiesUtil
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  com.yonyoucloud.upc.utils.MerchantOpenApiUtils
 *  com.yonyoucloud.upc.utils.ToolUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 */
package com.yonyou.iuap.apdoc.coredoc.sdk.service.impl.merchant;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantAddressPO;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.sdk.dto.common.DocOrgIdDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.AddressInfoDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.AgentFinancialDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantApplyRangeDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantBillingDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantContacterDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantDetailDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantInvoiceDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantPrincipalDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantQualificationDocumentDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantRoleInfoDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantSaleAreaDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantsManagerDataDTO;
import com.yonyou.iuap.apdoc.sdk.service.merchant.IMerchantSaveService;
import com.yonyou.iuap.log.cons.BusinessLogMode;
import com.yonyou.iuap.log.model.BusinessLogObjectBuilder;
import com.yonyou.iuap.log.rpc.IBusiLogService;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.param.BaseEntity;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyou.ucf.mdd.ext.util.JsonUtils;
import com.yonyou.ypd.bill.basic.service.api.IBillActionService;
import com.yonyou.ypd.bill.infrastructure.service.api.IDTOConvertService;
import com.yonyoucloud.iuap.upc.api.IMerchantServiceV2;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.dto.MerchantContacterDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCEntityStatus;
import com.yonyoucloud.upc.aa.merchant.AddressInfo;
import com.yonyoucloud.upc.aa.merchant.AgentFinancial;
import com.yonyoucloud.upc.aa.merchant.AgentInvoice;
import com.yonyoucloud.upc.aa.merchant.Contacter;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.FrozenState;
import com.yonyoucloud.upc.aa.merchant.InvoicingCustomers;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeExt;
import com.yonyoucloud.upc.aa.merchant.MerchantQualificationDocument;
import com.yonyoucloud.upc.aa.merchant.MerchantRoleInfo;
import com.yonyoucloud.upc.aa.merchant.MerchantsManager;
import com.yonyoucloud.upc.aa.merchant.Payway;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.billrule.merchant.MerchantDataProcessRule;
import com.yonyoucloud.upc.data.merchant.MerchantGroupDao;
import com.yonyoucloud.upc.service.MerchantCheckService;
import com.yonyoucloud.upc.service.addrange.KafkaMerchantAddRangeService;
import com.yonyoucloud.upc.service.openapi.MerchantOpenApiServiceImpl;
import com.yonyoucloud.upc.utils.APIExtPropertiesUtil;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import com.yonyoucloud.upc.utils.MerchantOpenApiUtils;
import com.yonyoucloud.upc.utils.ToolUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class MerchantSaveSdkServiceImpl
implements IMerchantSaveService {
    private static final Logger log = LoggerFactory.getLogger(MerchantSaveSdkServiceImpl.class);
    @Autowired
    protected IYmsJdbcApi ymsJdbcApi;
    @Autowired
    private MerchantCheckService merchantCheckService;
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private KafkaMerchantAddRangeService kafkaMerchantAddRangeService;
    @Autowired
    private IMerchantServiceV2 merchantServiceV2;
    @Autowired
    MerchantGroupDao merchantGroupDao;
    @Autowired
    MerchantOpenApiServiceImpl merchantOpenApiServiceImpl;
    @Autowired
    MerchantDataProcessRule merchantDataProcessRule;
    @Autowired
    private IBusiLogService busiLogService;
    @Autowired
    private IBillActionService billActionService;
    @Autowired
    private IDTOConvertService entityConvertService;

    public MerchantDataDTO merchantAdd(MerchantDataDTO merchantDTO) throws Exception {
        MerchantDataDTO merchantDataDTOResult = new MerchantDataDTO();
        Merchant merchant = MerchantSaveSdkServiceImpl.covertToMerChant(merchantDTO);
        Long merchantId = (Long)merchant.getId();
        if (merchantId == null) {
            merchantId = IdManager.getInstance().nextId();
        }
        MerchantSaveSdkServiceImpl.setAllSubObjectsMerchantId(merchant, merchantId);
        if (merchantDTO.getSrcBill() == null || !"CRM".equals(merchantDTO.getSrcBill())) {
            this.merchantCheckService.beforeDataPreprocessCheckFromApi(merchant);
        }
        this.merchantCheckService.dataPreprocessing(merchant, EntityStatus.Insert);
        this.merchantCheckService.theBeforeSaveCheckFromApi(merchant);
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
            Merchant merchantRes = (Merchant)result;
            merchantDataDTOResult.setId((Long)merchantRes.getId());
            merchantDataDTOResult.setCreateOrg(merchantRes.getCreateOrg());
            if (merchantRes.merchantApplyRanges() != null) {
                merchantDataDTOResult.setMerchantApplyRanges(this.convertToMerchantApplyRangeDataList(merchantRes.merchantApplyRanges()));
            }
        }
        return merchantDataDTOResult;
    }

    public MerchantDataDTO merchantOrgDataAdd(MerchantDataDTO merchantDTO) throws Exception {
        return this.merchantUpdate(merchantDTO);
    }

    public MerchantDataDTO merchantUpdate(MerchantDataDTO merchantDTO) throws Exception {
        MerchantDataDTO merchantDataDTOResult = new MerchantDataDTO();
        Merchant merchant = MerchantSaveSdkServiceImpl.covertToMerChant(merchantDTO);
        merchant.set("data_from", (Object)"CRM");
        MerchantSaveSdkServiceImpl.setAllSubObjectsMerchantId(merchant, (Long)merchant.getId());
        MerchantOpenApiUtils.addRowNumForMerchantSubData((Merchant)merchant);
        DataTransferUtils.fill((String)"aa_merchant", (String)"aa.merchant.Merchant", (Object)merchant, (int)4);
        if (merchant.getId() == null || merchant.getCreateOrg() == null || merchant.get("belongOrg") == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_ID_ORGID_NOT_NULL);
        }
        this.merchantCheckService.dataPreprocessing(merchant, EntityStatus.Update);
        this.merchantCheckService.theBeforeSaveCheckFromApi(merchant);
        this.dealSubTableData(merchant);
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("aa_merchant");
        billDataDto.setAction("save");
        billDataDto.setData((Object)merchant);
        billDataDto.setFromApi(true);
        billDataDto.setConvertType(Integer.valueOf(4));
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            Merchant merchantRes = (Merchant)result;
            merchantDataDTOResult.setId((Long)merchantRes.getId());
            merchantDataDTOResult.setCreateOrg(merchantRes.getCreateOrg());
            if (merchantRes.merchantApplyRanges() != null) {
                List<MerchantApplyRangeDataDTO> merchantApplyRangeDataDTOS = this.convertToMerchantApplyRangeDataList(merchantRes.merchantApplyRanges());
                List merchantApplyRanges = merchantApplyRangeDataDTOS.stream().filter(merchantApplyRangeDataDTO -> {
                    if (merchantApplyRangeDataDTO.getOrgId() == null) {
                        return true;
                    }
                    return merchantApplyRangeDataDTO.getOrgId().equals(merchantDTO.getBelongOrgId());
                }).collect(Collectors.toList());
                merchantDataDTOResult.setMerchantApplyRanges(merchantApplyRanges);
            }
        }
        return merchantDataDTOResult;
    }

    private void dealSubTableData(Merchant merchant) throws Exception {
        MerchantApplyRange range;
        List merchantApplyRangeList;
        if (merchant.getId() == null || merchant.get("belongOrg") == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_ID_ORGID_NOT_NULL);
        }
        MerchantApplyRangeExt merchantApplyRange = this.queryMerchantApplyRangeExt((Long)merchant.getId(), merchant.get("belongOrg").toString());
        if (merchantApplyRange != null) {
            String merchantApplyRangeId;
            if (merchantApplyRange.get("id") != null) {
                merchantApplyRangeId = merchantApplyRange.get("id").toString();
                merchant.put("merchantApplyRangeId", (Object)merchantApplyRangeId);
            } else {
                merchantApplyRangeId = "";
            }
            Long merchantId = Long.valueOf(merchant.getId().toString());
            if (merchant.merchantAppliedDetail() != null) {
                for (MerchantApplyRangeDetail merchantAppliedDetail : merchant.merchantAppliedDetail()) {
                    merchantAppliedDetail.set("merchantApplyRangeId", (Object)Long.valueOf(merchantApplyRangeId));
                    merchantAppliedDetail.set("id", (Object)merchantId);
                }
            }
            if (merchant.merchantApplyRange() != null) {
                merchant.merchantApplyRange().forEach(merchantApply -> {
                    merchantApply.setIsApplied(Boolean.valueOf(true));
                    merchantApply.setOrgId((String)merchant.get("belongOrg"));
                    merchantApply.setEntityStatus(EntityStatus.Update);
                });
            }
            if (merchant.customerAreas() != null) {
                merchant.customerAreas().forEach(customerArea -> {
                    customerArea.set("merchantApplyRangeId", (Object)merchantApplyRangeId);
                    customerArea.setMerchantId(merchantId);
                });
            }
            if (merchant.principals() != null) {
                merchant.principals().forEach(principal -> {
                    principal.set("merchantApplyRangeId", (Object)merchantApplyRangeId);
                    principal.setMerchantId(merchantId);
                });
            }
            if (merchant.invoicingCustomerss() != null) {
                merchant.invoicingCustomerss().forEach(invoicingCustomers -> {
                    invoicingCustomers.set("merchantApplyRangeId", (Object)merchantApplyRangeId);
                    invoicingCustomers.setMerchantId(merchantId);
                });
            }
        }
        if ((merchantApplyRangeList = merchant.merchantApplyRanges()) != null && !CollectionUtils.isEmpty((Collection)merchantApplyRangeList) && (range = (MerchantApplyRange)merchantApplyRangeList.get(0)).getEntityStatus() == EntityStatus.Insert) {
            long merchantApplyRangeId = IdManager.getInstance().nextId();
            merchant.put("merchantApplyRangeId", (Object)merchantApplyRangeId);
            if (merchant.customerAreas() != null) {
                merchant.customerAreas().stream().filter(customerArea -> customerArea.getEntityStatus() == EntityStatus.Insert).forEach(customerArea -> {
                    customerArea.setmerchantApplyRangeId(Long.valueOf(merchantApplyRangeId));
                    customerArea.setId((Object)IdManager.getInstance().nextId());
                });
            }
            if (merchant.invoicingCustomerss() != null) {
                merchant.invoicingCustomerss().stream().filter(invoicingCustomers -> invoicingCustomers.getEntityStatus() == EntityStatus.Insert).forEach(invoicingCustomers -> {
                    invoicingCustomers.setMerchantApplyRangeId(Long.valueOf(merchantApplyRangeId));
                    invoicingCustomers.setId((Object)IdManager.getInstance().nextId());
                });
            }
            if (merchant.principals() != null) {
                merchant.principals().stream().filter(principal -> principal.getEntityStatus() == EntityStatus.Insert).forEach(principal -> {
                    principal.setMerchantApplyRangeId(Long.valueOf(merchantApplyRangeId));
                    principal.setId((Object)IdManager.getInstance().nextId());
                });
            }
        }
    }

    private void dealNoOrganizationalFields(Merchant merchant) {
        merchant.remove("name");
        merchant.remove("transType");
        merchant.remove("transType___code");
        merchant.remove("transType___name");
        merchant.remove("shortname");
        merchant.remove("country");
        merchant.remove("country___code");
        merchant.remove("country___name");
        merchant.remove("newTimeZone");
        merchant.remove("language");
        merchant.remove("language___code");
        merchant.remove("language___name");
        merchant.remove("parentCustomer");
        merchant.remove("parentCustomer___code");
        merchant.remove("parentCustomer___name");
        merchant.remove("suppliers");
        merchant.remove("suppliers___code");
        merchant.remove("suppliers___name");
        merchant.remove("retailInvestors");
        merchant.remove("internalOrg");
        merchant.remove("transType");
        merchant.remove("internalOrgId");
        merchant.remove("internalOrgId___code");
        merchant.remove("internalOrgId___name");
        merchant.remove("taxPayingCategories");
        merchant.remove("customerClass");
        merchant.remove("customerIndustry");
        merchant.remove("developmentPartner");
        merchant.remove("parentManageOrg");
        merchant.remove("personName");
        merchant.remove("orgName");
        merchant.remove("personCharge");
        merchant.remove("personChargeIdNo");
        merchant.remove("erpCode");
        merchant.remove("merchantLogo");
        merchant.remove("largeText1");
        merchant.remove("largeText2");
        merchant.remove("largeText3");
        merchant.remove("largeText4");
        merchant.remove("largeText5");
        merchant.remove("frontIdCard");
        merchant.remove("backIdCard");
        merchant.remove("businessLicenseNew");
        merchant.remove("certificate");
        merchant.remove("orgCertificate");
        merchant.remove("isFinancialSynergy");
        merchant.remove("merchantCharacter");
        merchant.remove("customExtend");
        merchant.remove("enterpriseNature");
        merchant.remove("enterpriseName");
        merchant.remove("licenseType");
        merchant.remove("creditCode");
        merchant.remove("leaderName");
        merchant.remove("leaderNameIdNo");
        merchant.remove("businessLicenseNo");
        merchant.remove("businessterm");
        merchant.remove("regionCode");
        merchant.remove("address");
        merchant.remove("longitude");
        merchant.remove("latitude");
        merchant.remove("contactName");
        merchant.remove("contactTel");
        merchant.remove("email");
        merchant.remove("fax");
        merchant.remove("buildTime");
        merchant.remove("enterNature");
        merchant.remove("currencyCode");
        merchant.remove("money");
        merchant.remove("verfyMark");
        merchant.remove("peopleNum");
        merchant.remove("scopeModel");
        merchant.remove("yearMoney");
        merchant.remove("scope");
        merchant.remove("website");
        merchant.remove("wid");
        merchant.remove("postCode");
        merchant.remove("pubts");
        merchant.remove("merchantRole");
        merchant.remove("merchantsManager");
        merchant.remove("merchantAgentInvoiceInfos");
        merchant.remove("merchantContactInfos");
        merchant.remove("merchantAddressInfos");
        merchant.remove("merchantAgentFinancialInfos");
        merchant.remove("merchantApplyRanges");
        merchant.remove("distributePrincipleOrgs");
    }

    private List<MerchantApplyRangeDataDTO> convertToMerchantApplyRangeDataList(List<MerchantApplyRange> merchantApplyRanges) {
        ArrayList<MerchantApplyRangeDataDTO> result = new ArrayList<MerchantApplyRangeDataDTO>();
        for (MerchantApplyRange merchantApplyRange : merchantApplyRanges) {
            MerchantApplyRangeDataDTO merchantApplyRangeDataDTO = new MerchantApplyRangeDataDTO();
            BeanUtils.copyProperties((Object)merchantApplyRange, (Object)merchantApplyRangeDataDTO);
            merchantApplyRangeDataDTO.setId(merchantApplyRange.getId().toString());
            result.add(merchantApplyRangeDataDTO);
        }
        return result;
    }

    public String merchantDelete(DocOrgIdDTO docOrgIdDTO) throws Exception {
        return this.deleteMerchantData(docOrgIdDTO.getDocId(), null, docOrgIdDTO.getOrgId(), "aa_merchantdetail", false);
    }

    public String merchantDeleteAsync(DocOrgIdDTO docOrgIdDTO) throws Exception {
        return this.deleteMerchantData(docOrgIdDTO.getDocId(), null, docOrgIdDTO.getOrgId(), "aa_merchantdetail", true);
    }

    public String merchantBatchDeleteAsync(List<DocOrgIdDTO> merchantIdAndOrgIdList) throws Exception {
        return this.deleteBatchMerchantData(merchantIdAndOrgIdList, "aa_merchantlist_query");
    }

    private String deleteBatchMerchantData(List<DocOrgIdDTO> merchantIdAndOrgIdList, String billnum) throws Exception {
        if (CollectionUtils.isEmpty(merchantIdAndOrgIdList)) {
            return null;
        }
        Map<Long, Set<String>> merchantIdOrgMap = this.groupByMerchantId(merchantIdAndOrgIdList);
        Set<Long> merchantIdList = merchantIdOrgMap.keySet();
        List<Merchant> merchantList = this.queryBatchMerchant(merchantIdList);
        if (merchantList == null) {
            return null;
        }
        List<MerchantApplyRangeExt> merchantApplyRangeList = this.queryBatchMerchantApplyRange(merchantIdList, merchantIdOrgMap);
        if (merchantApplyRangeList == null) {
            return null;
        }
        HashMap<String, Merchant> merchantIdAndMerchantMap = new HashMap<String, Merchant>();
        for (Merchant merchant : merchantList) {
            merchantIdAndMerchantMap.put(merchant.getId().toString(), merchant);
        }
        HashMap<String, MerchantApplyRange> orgIdAndMerchantApplyRangeMap = new HashMap<String, MerchantApplyRange>();
        for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
            if (merchantApplyRange.getOrgId() == null || merchantApplyRange.getMerchantId() == null) continue;
            orgIdAndMerchantApplyRangeMap.put(merchantApplyRange.getOrgId() + "##" + merchantApplyRange.getMerchantId(), merchantApplyRange);
        }
        ArrayList<Map<String, Object>> arrayList = new ArrayList<Map<String, Object>>();
        for (DocOrgIdDTO docOrgIdDTO : merchantIdAndOrgIdList) {
            arrayList.add(this.initDeleteParam((Merchant)merchantIdAndMerchantMap.get(docOrgIdDTO.getDocId()), (MerchantApplyRange)orgIdAndMerchantApplyRangeMap.get(docOrgIdDTO.getOrgId() + "##" + docOrgIdDTO.getDocId())));
        }
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setData(arrayList);
        billDataDto.setBillnum(billnum);
        if (null != billDataDto.getExternalData() && billDataDto.getExternalData() instanceof Map) {
            ((Map)billDataDto.getExternalData()).put("isAsync", true);
        } else if (null == billDataDto.getExternalData()) {
            billDataDto.setExternalData((Object)new HashMap<String, Object>(){
                {
                    this.put("isAsync", true);
                }
            });
        }
        ResultList result = BillBiz.batchdelete((BillDataDto)billDataDto);
        List infos = result.getInfos();
        String asyncKey = null;
        for (Object info : infos) {
            Map map;
            if (!(info instanceof Map) || (map = (Map)info).get("asyncKey") == null) continue;
            asyncKey = map.get("asyncKey").toString();
        }
        if (asyncKey == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_DELETE_ASYNC_KEY_ERROR);
        }
        return asyncKey;
    }

    private List<MerchantApplyRangeExt> queryBatchMerchantApplyRange(Set<Long> merchantIdList, Map<Long, Set<String>> merchantIdOrgMap) throws Exception {
        QuerySchema querySchema = QuerySchema.create().addSelect("id,merchantId,orgId,isCreator,isApplied").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").in(merchantIdList)}));
        List applyRanges = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRangeExt", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)applyRanges)) {
            ArrayList<MerchantApplyRangeExt> merchantApplyRanges = new ArrayList<MerchantApplyRangeExt>();
            applyRanges.forEach(applyRange -> {
                Set merchantOrgIdSet = (Set)merchantIdOrgMap.get(applyRange.getMerchantId());
                if (merchantOrgIdSet != null && merchantOrgIdSet.contains(applyRange.getOrgId())) {
                    merchantApplyRanges.add((MerchantApplyRangeExt)applyRange);
                }
            });
            return merchantApplyRanges;
        }
        return null;
    }

    private Map<Long, Set<String>> groupByMerchantId(List<DocOrgIdDTO> merchantIdAndOrgIdList) {
        return merchantIdAndOrgIdList.stream().filter(dto -> dto.getDocId() != null && dto.getOrgId() != null && ToolUtils.isNumber((String)dto.getDocId())).collect(Collectors.groupingBy(dto -> Long.parseLong(dto.getDocId()), Collectors.mapping(DocOrgIdDTO::getOrgId, Collectors.toSet())));
    }

    private List<Merchant> queryBatchMerchant(Set<Long> merchantIdList) throws Exception {
        QuerySchema querySchema = QuerySchema.create().addSelect("id,code,name,createOrg");
        return MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(merchantIdList)})), null);
    }

    public static void setAllSubObjectsMerchantId(Merchant merchant, Long merchantId) {
        if (merchant == null || merchantId == null) {
            return;
        }
        if (merchant.merchantApplyRange() != null) {
            merchant.merchantApplyRange().forEach(range -> range.put("merchantId", (Object)merchantId));
        }
        if (merchant.merchantAddressInfos() != null) {
            merchant.merchantAddressInfos().forEach(address -> address.put("merchantId", (Object)merchantId));
        }
        if (merchant.merchantContacterInfos() != null) {
            merchant.merchantContacterInfos().forEach(contact -> contact.put("merchantId", (Object)merchantId));
        }
        if (merchant.merchantAgentFinancialInfos() != null) {
            merchant.merchantAgentFinancialInfos().forEach(financial -> financial.put("merchantId", (Object)merchantId));
        }
        if (merchant.merchantAgentInvoiceInfos() != null) {
            merchant.merchantAgentInvoiceInfos().forEach(invoice -> invoice.put("merchantId", (Object)merchantId));
        }
        if (merchant.merchantCorpImages() != null) {
            merchant.merchantCorpImages().forEach(image -> image.put("merchantId", (Object)merchantId));
        }
        if (merchant.merchantAttachments() != null) {
            merchant.merchantAttachments().forEach(attachment -> attachment.put("merchantId", (Object)merchantId));
        }
        if (merchant.merchantApplyRanges() != null) {
            merchant.merchantApplyRanges().forEach(range -> range.put("merchantId", (Object)merchantId));
        }
        if (merchant.merchantsManager() != null) {
            merchant.merchantsManager().put("merchantId", (Object)merchantId);
        }
        if (merchant.merchantRole() != null) {
            merchant.merchantRole().put("merchantId", (Object)merchantId);
        }
        if (merchant.customerDefine() != null) {
            merchant.customerDefine().put("merchantId", (Object)merchantId);
        }
        if (merchant.merchantAppliedDetail() != null) {
            merchant.merchantAppliedDetail().forEach(detail -> detail.put("merchantId", (Object)merchantId));
        }
        if (merchant.merchantStaff() != null) {
            merchant.merchantStaff().forEach(staff -> staff.put("merchantId", (Object)merchantId));
        }
        if (merchant.merchantBusinessRoleTime() != null) {
            merchant.merchantBusinessRoleTime().forEach(roleTime -> roleTime.put("merchantId", (Object)merchantId));
        }
        if (merchant.customerAreas() != null) {
            merchant.customerAreas().forEach(area -> area.put("merchantId", (Object)merchantId));
        }
        if (merchant.principals() != null) {
            merchant.principals().forEach(principal -> principal.put("merchantId", (Object)merchantId));
        }
        if (merchant.invoicingCustomerss() != null) {
            merchant.invoicingCustomerss().forEach(customer -> customer.put("merchantId", (Object)merchantId));
        }
        if (merchant.merchantDefine() != null) {
            merchant.merchantDefine().put("merchantId", (Object)merchantId);
        }
        if (merchant.merchantDetail() != null) {
            merchant.merchantDetail().forEach(detail -> detail.put("merchantId", (Object)merchantId));
        }
        if (merchant.merchantAppliedDetail() != null) {
            merchant.merchantAppliedDetail().forEach(detail -> detail.put("merchantId", (Object)merchantId));
        }
        if (merchant.merchantQualificationDocuments() != null) {
            merchant.merchantQualificationDocuments().forEach(merchantQualificationDocument -> merchantQualificationDocument.put("merchantId", (Object)merchantId));
        }
    }

    public void deleteMerchantAdress(Long id) throws Exception {
        this.ymsJdbcApi.removeByPK((BaseEntity)new MerchantAddressPO(), (Object)id, false);
    }

    public void merchantContacterAdd(List<MerchantContacterDTO> merchantContacterDTOList) throws Exception {
    }

    public void merchantContacterUpdate(List<MerchantContacterDTO> merchantContacterDTOList) throws Exception {
    }

    public void merchantContacterDelete(List<Long> merchantContacterIdList) throws Exception {
    }

    public CoreDocJsonResult<DocOrgIdDTO> merchantBatchStop(List<DocOrgIdDTO> list) throws Exception {
        if (list == null || list.size() <= 0) {
            // empty if block
        }
        RuleExecuteResult result = this.getRuleExecuteResult(list, "batchdisable");
        return new CoreDocJsonResult(list, Long.valueOf(200L), result.getMessage(), true);
    }

    @NotNull
    private List<Map> getData(List<DocOrgIdDTO> list) throws Exception {
        ArrayList<Map> mapList = new ArrayList<Map>();
        for (DocOrgIdDTO docOrgIdDTO : list) {
            HashMap<String, Object> map = new HashMap<String, Object>();
            MerchantApplyRangeExt merchantApplyRange = this.queryMerchantApplyRangeExt(Long.parseLong(docOrgIdDTO.getDocId()), docOrgIdDTO.getOrgId());
            map.put("id", merchantApplyRange.getMerchantId());
            map.put("isCreator", merchantApplyRange.getIsCreator());
            map.put("merchantApplyRangeId", merchantApplyRange.getId());
            mapList.add(map);
        }
        return mapList;
    }

    public CoreDocJsonResult<DocOrgIdDTO> merchantBatchUnStop(List<DocOrgIdDTO> list) throws Exception {
        if (list == null || list.size() <= 0) {
            // empty if block
        }
        RuleExecuteResult result = this.getRuleExecuteResult(list, "batchenable");
        return new CoreDocJsonResult(list, Long.valueOf(200L), result.getMessage(), true);
    }

    private RuleExecuteResult getRuleExecuteResult(List<DocOrgIdDTO> list, String action) throws Exception {
        List<Map> mapList = this.getData(list);
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("aa_merchant");
        billDataDto.setAction(action);
        billDataDto.setData((Object)JsonUtils.toJson(mapList));
        billDataDto.setFromApi(true);
        HashMap<String, String> stringObjectHashMap = new HashMap<String, String>();
        stringObjectHashMap.put("serviceCode", "aa_merchantlist_query");
        stringObjectHashMap.put("local", "zh_CN");
        stringObjectHashMap.put("FRAMEWORK", "MDF_MDD");
        stringObjectHashMap.put("terminalType", "1");
        billDataDto.setParameters(stringObjectHashMap);
        this.billService.setUserDefineClassIsEnabledForSave(billDataDto);
        RuleExecuteResult result = null;
        if ("batchenable".equals(action)) {
            result = this.billService.executeUpdate("unstop", billDataDto);
        } else if ("batchdisable".equals(action)) {
            result = this.billService.executeUpdate("stop", billDataDto);
        }
        return result;
    }

    private String deleteMerchantData(String merchantId, String merchantCode, String orgId, String billnum, boolean isAsync) throws Exception {
        Merchant merchant = this.queryMerchant(merchantId, merchantCode);
        if (merchant == null) {
            return null;
        }
        MerchantApplyRangeExt merchantApplyRange = this.queryMerchantApplyRangeExt((Long)merchant.getId(), orgId);
        if (merchantApplyRange == null) {
            return null;
        }
        if (merchantApplyRange.getIsCreator().booleanValue()) {
            billnum = "aa_merchant";
        }
        return this.executeDelete(merchant, (MerchantApplyRange)merchantApplyRange, billnum, isAsync);
    }

    private Merchant queryMerchant(String merchantId, String merchantCode) throws Exception {
        List merchants;
        if (StringUtils.isEmpty((CharSequence)merchantId) && StringUtils.isEmpty((CharSequence)merchantCode)) {
            return null;
        }
        QuerySchema querySchema = QuerySchema.create().addSelect("id,code,name,createOrg");
        if (StringUtils.isNotEmpty((CharSequence)merchantId) && !CollectionUtils.isEmpty((Collection)(merchants = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)Long.parseLong(merchantId))})), null)))) {
            return (Merchant)merchants.get(0);
        }
        if (StringUtils.isNotEmpty((CharSequence)merchantCode) && !CollectionUtils.isEmpty((Collection)(merchants = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)merchantCode)})), null)))) {
            return (Merchant)merchants.get(0);
        }
        return null;
    }

    private MerchantApplyRangeExt queryMerchantApplyRangeExt(Long merchantId, String orgId) throws Exception {
        QuerySchema querySchema = QuerySchema.create().addSelect("id,merchantId,orgId,isCreator,isApplied").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId)}));
        if (StringUtils.isNotEmpty((CharSequence)orgId)) {
            querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)orgId)});
        } else {
            querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"isCreator").eq((Object)true)});
        }
        List applyRanges = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRangeExt", (QuerySchema)querySchema, null);
        return CollectionUtils.isEmpty((Collection)applyRanges) ? null : (MerchantApplyRangeExt)applyRanges.get(0);
    }

    private String executeDelete(Merchant merchant, MerchantApplyRange merchantApplyRange, String billnum, boolean isAsync) throws Exception {
        BillDataDto bill = new BillDataDto();
        bill.setData(this.initDeleteParam(merchant, merchantApplyRange));
        bill.setBillnum(billnum);
        if (isAsync) {
            if (null != bill.getExternalData() && bill.getExternalData() instanceof Map) {
                ((Map)bill.getExternalData()).put("isAsync", true);
            } else if (null == bill.getExternalData()) {
                bill.setExternalData((Object)new HashMap<String, Object>(){
                    {
                        this.put("isAsync", true);
                    }
                });
            }
            ResultList result = BillBiz.batchdelete((BillDataDto)bill);
            List infos = result.getInfos();
            String asyncKey = null;
            for (Object info : infos) {
                Map map;
                if (!(info instanceof Map) || (map = (Map)info).get("asyncKey") == null) continue;
                asyncKey = map.get("asyncKey").toString();
            }
            if (asyncKey == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_DELETE_ASYNC_KEY_ERROR);
            }
            return asyncKey;
        }
        RuleExecuteResult deleteResult = BillBiz.delete((BillDataDto)bill);
        return CollectionUtils.isEmpty((Collection)deleteResult.getMessages()) ? null : deleteResult.getMessages().get(0).toString();
    }

    private Map<String, Object> initDeleteParam(Merchant merchant, MerchantApplyRange merchantApplyRange) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("id", merchant.getId());
        params.put("code", merchant.getCode());
        params.put("name", merchant.getName());
        params.put("createOrg", merchant.getCreateOrg());
        params.put("isCreator", merchantApplyRange.getIsCreator());
        params.put("isApplied", merchantApplyRange.getIsApplied());
        params.put("belongOrg", merchantApplyRange.getOrgId());
        params.put("merchantApplyRangeId", merchantApplyRange.getId());
        params.put("merchantAppliedDetail!id", merchantApplyRange.getMerchantId());
        HashMap<String, Object> carryParams = new HashMap<String, Object>();
        carryParams.put("isCreator", merchantApplyRange.getIsCreator());
        carryParams.put("isApplied", merchantApplyRange.getIsApplied());
        carryParams.put("orgId", merchantApplyRange.getOrgId());
        carryParams.put("merchantApplyRangeId", merchantApplyRange.getId());
        params.put("carryParams", carryParams);
        return params;
    }

    public static Merchant covertToMerChant(MerchantDataDTO merchantDataDTO) throws Exception {
        Merchant merchant = new Merchant();
        String[] excludeFields = new String[]{"merchantRole", "merchantsManager", "merchantQualificationDocuments", "merchantAgentInvoiceInfos", "merchantContactInfos", "merchantAddressInfos", "merchantAgentFinancialInfos", "customerAreas", "principals", "invoicingCustomers", "merchantApplyRanges", "merchantAppliedDetail", "class"};
        BeanUtils.copyProperties((Object)merchantDataDTO, (Object)merchant, (String[])excludeFields);
        MerchantSaveSdkServiceImpl.copyExtraFields(merchantDataDTO, merchant, MerchantDataDTO.class, Merchant.class, excludeFields);
        if (merchantDataDTO.getEntityStatus() == UPCEntityStatus.Update && !CollectionUtils.isEmpty((Collection)merchantDataDTO.getNeedBlankFieldList())) {
            MerchantSaveSdkServiceImpl.setFieldsBeNull(merchantDataDTO, merchant, MerchantDataDTO.class, Merchant.class, merchantDataDTO.getNeedBlankFieldList());
        }
        if (merchantDataDTO.getBelongOrgId() != null) {
            merchant.set("belongOrg", (Object)merchantDataDTO.getBelongOrgId());
        }
        if (merchantDataDTO.getBelongOrgId() != null && !ObjectUtils.isEmpty((Object)merchantDataDTO.getBelongOrgId()) && !merchantDataDTO.getBelongOrgId().equals(merchant.getCreateOrg())) {
            merchant.set("isCreator", (Object)false);
        } else {
            merchant.set("isCreator", (Object)true);
        }
        if (merchantDataDTO.getEntityStatus() == UPCEntityStatus.Insert) {
            merchant.setEntityStatus(EntityStatus.Insert);
            merchant.set("belongOrg", (Object)merchantDataDTO.getCreateOrg());
        } else if (merchantDataDTO.getEntityStatus() == UPCEntityStatus.Update) {
            merchant.setEntityStatus(EntityStatus.Update);
        }
        if (!ObjectUtils.isEmpty((Object)merchantDataDTO.getName())) {
            merchant.set("name", (Object)merchantDataDTO.getName().toMap());
        }
        if (!ObjectUtils.isEmpty((Object)merchantDataDTO.getShortname())) {
            merchant.set("shortname", (Object)merchantDataDTO.getShortname().toMap());
        }
        if (!ObjectUtils.isEmpty((Object)merchantDataDTO.getAddress())) {
            merchant.set("address", (Object)merchantDataDTO.getAddress().toMap());
        }
        if (!ObjectUtils.isEmpty((Object)merchantDataDTO.getScope())) {
            merchant.set("scope", (Object)merchantDataDTO.getScope().toMap());
        }
        if (merchantDataDTO.getMerchantRole() != null) {
            merchant.setMerchantRole(MerchantSaveSdkServiceImpl.covertToMerchantRoleInfo(merchantDataDTO.getMerchantRole()));
        }
        if (merchantDataDTO.getMerchantsManager() != null) {
            merchant.setMerchantsManager(MerchantSaveSdkServiceImpl.covertToMerchantsManager(merchantDataDTO.getMerchantsManager()));
        }
        if (merchantDataDTO.getMerchantQualificationDocuments() != null) {
            merchant.setMerchantQualificationDocuments(MerchantSaveSdkServiceImpl.covertToQualificationDocuments(merchantDataDTO.getMerchantQualificationDocuments()));
        }
        if (merchantDataDTO.getMerchantAddressInfos() != null) {
            merchant.setMerchantAddressInfos(MerchantSaveSdkServiceImpl.covertToMerchantAddressList(merchantDataDTO.getMerchantAddressInfos()));
        }
        if (merchantDataDTO.getMerchantContactInfos() != null) {
            merchant.setMerchantContacterInfos(MerchantSaveSdkServiceImpl.covertToMerchantContactList(merchantDataDTO.getMerchantContactInfos()));
        }
        if (merchantDataDTO.getMerchantAgentFinancialInfos() != null) {
            merchant.setMerchantAgentFinancialInfos(MerchantSaveSdkServiceImpl.covertToMerchantAgentFinancialList(merchantDataDTO.getMerchantAgentFinancialInfos()));
        }
        if (merchantDataDTO.getMerchantAgentInvoiceInfos() != null) {
            merchant.setMerchantAgentInvoiceInfos(MerchantSaveSdkServiceImpl.covertToMerchantAgentInvoiceList(merchantDataDTO.getMerchantAgentInvoiceInfos()));
        }
        if (merchantDataDTO.getCustomerAreas() != null) {
            merchant.setCustomerAreas(MerchantSaveSdkServiceImpl.convertToCustomerAreaList(merchantDataDTO.getCustomerAreas()));
        }
        if (merchantDataDTO.getPrincipals() != null) {
            merchant.setPrincipals(MerchantSaveSdkServiceImpl.convertToPrincipalList(merchantDataDTO.getPrincipals()));
        }
        if (merchantDataDTO.getInvoicingCustomers() != null) {
            merchant.setInvoicingCustomerss(MerchantSaveSdkServiceImpl.convertToInvoicingCustomerList(merchantDataDTO.getInvoicingCustomers()));
        }
        if (merchantDataDTO.getMerchantApplyRanges() != null) {
            merchant.setMerchantApplyRanges(MerchantSaveSdkServiceImpl.convertToMerchantApplyRangeList(merchantDataDTO.getMerchantApplyRanges()));
        }
        if (merchantDataDTO.getMerchantAppliedDetail() != null) {
            MerchantApplyRangeDetail merchantApplyRangeDetail = MerchantSaveSdkServiceImpl.convertToMerchantApplyRangeDetail(merchantDataDTO.getMerchantAppliedDetail());
            merchantApplyRangeDetail.setBelongOrg(merchantDataDTO.getBelongOrgId() == null ? (String)merchant.get("belongOrg") : merchantDataDTO.getBelongOrgId());
            if (!CollectionUtils.isEmpty((Map)merchantApplyRangeDetail)) {
                ArrayList<MerchantApplyRangeDetail> merchantApplyRangeDetailList = new ArrayList<MerchantApplyRangeDetail>();
                merchantApplyRangeDetailList.add(merchantApplyRangeDetail);
                merchant.setMerchantAppliedDetail(merchantApplyRangeDetailList);
            }
        }
        if (merchantDataDTO.getCustomExtend() != null) {
            merchant.put("customExtend", (Object)merchantDataDTO.getCustomExtend());
            APIExtPropertiesUtil.processExtProperties((Map)merchant, (String)"customExtend", null);
        }
        return merchant;
    }

    private static MerchantApplyRangeDetail convertToMerchantApplyRangeDetail(MerchantDetailDataDTO merchantAppliedDetail) {
        MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
        BeanUtils.copyProperties((Object)merchantAppliedDetail, (Object)merchantApplyRangeDetail);
        MerchantSaveSdkServiceImpl.copyExtraFields(merchantAppliedDetail, merchantApplyRangeDetail, MerchantDetailDataDTO.class, MerchantApplyRangeDetail.class, null);
        List needBlankFieldList = null;
        if (merchantAppliedDetail.getEntityStatus() == UPCEntityStatus.Update && !CollectionUtils.isEmpty((Collection)merchantAppliedDetail.getNeedBlankFieldList())) {
            needBlankFieldList = merchantAppliedDetail.getNeedBlankFieldList();
        }
        if (merchantAppliedDetail.getEntityStatus() == UPCEntityStatus.Insert) {
            merchantApplyRangeDetail.setEntityStatus(EntityStatus.Insert);
        } else if (merchantAppliedDetail.getEntityStatus() == UPCEntityStatus.Update) {
            merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
        }
        if (merchantAppliedDetail.getSearchCode() != null) {
            merchantApplyRangeDetail.setSearchcode(merchantAppliedDetail.getSearchCode());
        } else if (needBlankFieldList != null && needBlankFieldList.contains("searchCode")) {
            merchantApplyRangeDetail.setSearchcode(null);
        }
        if (merchantAppliedDetail.getTransactionCurrencyId() != null) {
            merchantApplyRangeDetail.setTransactionCurrency(merchantAppliedDetail.getTransactionCurrencyId());
        } else if (needBlankFieldList != null && needBlankFieldList.contains("transactionCurrencyId")) {
            merchantApplyRangeDetail.setTransactionCurrency(null);
        }
        if (merchantAppliedDetail.getTaxRateId() != null) {
            merchantApplyRangeDetail.setTaxRate(merchantAppliedDetail.getTaxRateId());
        } else if (needBlankFieldList != null && needBlankFieldList.contains("taxRateId")) {
            merchantApplyRangeDetail.setTaxRate(null);
        }
        if (merchantAppliedDetail.getDeliveryWarehouseId() != null) {
            merchantApplyRangeDetail.setDeliveryWarehouse(merchantAppliedDetail.getDeliveryWarehouseId());
        } else if (needBlankFieldList != null && needBlankFieldList.contains("deliveryWarehouseId")) {
            merchantApplyRangeDetail.setDeliveryWarehouse(null);
        }
        if (merchantAppliedDetail.getCreditServiceDayId() != null) {
            merchantApplyRangeDetail.setCreditServiceDay(merchantAppliedDetail.getCreditServiceDayId());
        } else if (needBlankFieldList != null && needBlankFieldList.contains("creditServiceDayId")) {
            merchantApplyRangeDetail.setCreditServiceDay(null);
        }
        if (merchantAppliedDetail.getCollectionAgreementId() != null) {
            merchantApplyRangeDetail.setCollectionAgreement(merchantAppliedDetail.getCollectionAgreementId());
        } else if (needBlankFieldList != null && needBlankFieldList.contains("collectionAgreementId")) {
            merchantApplyRangeDetail.setCollectionAgreement(null);
        }
        if (merchantAppliedDetail.getSettlementMethodId() != null) {
            merchantApplyRangeDetail.setSettlementMethod(merchantAppliedDetail.getSettlementMethodId());
        } else if (needBlankFieldList != null && needBlankFieldList.contains("settlementMethodId")) {
            merchantApplyRangeDetail.setSettlementMethod(null);
        }
        if (merchantAppliedDetail.getShipmentMethodId() != null) {
            merchantApplyRangeDetail.setShipmentMethod(merchantAppliedDetail.getShipmentMethodId());
        } else if (needBlankFieldList != null && needBlankFieldList.contains("shipmentMethodId")) {
            merchantApplyRangeDetail.setShipmentMethod(null);
        }
        if (merchantAppliedDetail.getMerchantLevelId() != null) {
            merchantApplyRangeDetail.setCustomerLevel(merchantAppliedDetail.getMerchantLevelId());
        } else if (needBlankFieldList != null && needBlankFieldList.contains("merchantLevelId")) {
            merchantApplyRangeDetail.setCustomerLevel(null);
        }
        if (merchantAppliedDetail.getExchangeRateTypeId() != null) {
            merchantApplyRangeDetail.setExchangeratetype(merchantAppliedDetail.getExchangeRateTypeId());
        } else if (needBlankFieldList != null && needBlankFieldList.contains("exchangeRateTypeId")) {
            merchantApplyRangeDetail.setExchangeratetype(null);
        }
        if (merchantAppliedDetail.getMerchantTypeId() != null) {
            merchantApplyRangeDetail.setCustomerType(merchantAppliedDetail.getMerchantTypeId());
        } else if (needBlankFieldList != null && needBlankFieldList.contains("merchantTypeId")) {
            merchantApplyRangeDetail.setCustomerType(null);
        }
        if (merchantAppliedDetail.getFrozenState() != null) {
            if (BooleanUtil.isTrue((Object)merchantAppliedDetail.getFrozenState())) {
                merchantApplyRangeDetail.setFrozenState(FrozenState.frozen);
            } else {
                merchantApplyRangeDetail.setFrozenState(FrozenState.unfrozen);
            }
        } else if (needBlankFieldList != null && needBlankFieldList.contains("frozenState")) {
            merchantApplyRangeDetail.setFrozenState(null);
        }
        if (merchantAppliedDetail.getFreezeLink() != null) {
            merchantApplyRangeDetail.setFreezingLink(merchantAppliedDetail.getFreezeLink());
        } else if (needBlankFieldList != null && needBlankFieldList.contains("freezeLink")) {
            merchantApplyRangeDetail.setFreezingLink(null);
        }
        if (merchantAppliedDetail.getPayWay() != null) {
            merchantApplyRangeDetail.setPayway(Payway.find((Number)Short.valueOf(merchantAppliedDetail.getPayWay().trim())));
        } else if (needBlankFieldList != null && needBlankFieldList.contains("payWay")) {
            merchantApplyRangeDetail.setPayway(null);
        }
        if (merchantAppliedDetail.getCustomExtend() != null) {
            merchantApplyRangeDetail.put("customExtend", (Object)merchantAppliedDetail.getCustomExtend());
            APIExtPropertiesUtil.processExtProperties((Map)merchantApplyRangeDetail, (String)"customExtend", null);
        }
        return merchantApplyRangeDetail;
    }

    private static List<MerchantQualificationDocument> covertToQualificationDocuments(List<MerchantQualificationDocumentDataDTO> merchantQualificationDocuments) {
        ArrayList<MerchantQualificationDocument> merchantQualificationDocumentList = new ArrayList<MerchantQualificationDocument>();
        for (MerchantQualificationDocumentDataDTO merchantQualificationDocument : merchantQualificationDocuments) {
            MerchantQualificationDocument merchantQualificationDocument1 = new MerchantQualificationDocument();
            BeanUtils.copyProperties((Object)merchantQualificationDocument, (Object)merchantQualificationDocument1);
            MerchantSaveSdkServiceImpl.copyExtraFields(merchantQualificationDocument, merchantQualificationDocument1, MerchantQualificationDocumentDataDTO.class, MerchantQualificationDocument.class, null);
            if (merchantQualificationDocument.getEntityStatus() == UPCEntityStatus.Update && !CollectionUtils.isEmpty((Collection)merchantQualificationDocument.getNeedBlankFieldList())) {
                MerchantSaveSdkServiceImpl.setFieldsBeNull(merchantQualificationDocument, merchantQualificationDocument1, MerchantQualificationDocumentDataDTO.class, MerchantQualificationDocument.class, merchantQualificationDocument.getNeedBlankFieldList());
            }
            merchantQualificationDocument1.setId(merchantQualificationDocument.getId() == null ? null : merchantQualificationDocument.getId().toString());
            merchantQualificationDocumentList.add(merchantQualificationDocument1);
        }
        return merchantQualificationDocumentList;
    }

    static List<MerchantApplyRange> convertToMerchantApplyRangeList(List<MerchantApplyRangeDataDTO> merchantApplyRanges) {
        ArrayList<MerchantApplyRange> merchantApplyRangeList = new ArrayList<MerchantApplyRange>();
        if (!CollectionUtils.isEmpty(merchantApplyRanges)) {
            for (MerchantApplyRangeDataDTO merchantApplyRangeDataDTO : merchantApplyRanges) {
                MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
                BeanUtils.copyProperties((Object)merchantApplyRangeDataDTO, (Object)merchantApplyRange);
                MerchantSaveSdkServiceImpl.copyExtraFields(merchantApplyRangeDataDTO, merchantApplyRange, MerchantApplyRangeDataDTO.class, MerchantApplyRange.class, null);
                if (merchantApplyRangeDataDTO.getEntityStatus() == UPCEntityStatus.Update && !CollectionUtils.isEmpty((Collection)merchantApplyRangeDataDTO.getNeedBlankFieldList())) {
                    MerchantSaveSdkServiceImpl.setFieldsBeNull(merchantApplyRangeDataDTO, merchantApplyRange, MerchantApplyRangeDataDTO.class, MerchantApplyRange.class, merchantApplyRangeDataDTO.getNeedBlankFieldList());
                }
                merchantApplyRange.setEntityStatus(MerchantSaveSdkServiceImpl.convertEntityStatus(merchantApplyRangeDataDTO.getEntityStatus()));
                merchantApplyRangeList.add(merchantApplyRange);
            }
        }
        return merchantApplyRangeList;
    }

    public static List<CustomerArea> convertToCustomerAreaList(List<MerchantSaleAreaDataDTO> merchantCustomerAreaOpenApiSaveDTOList) {
        ArrayList<CustomerArea> customerAreaList = new ArrayList<CustomerArea>();
        if (!CollectionUtils.isEmpty(merchantCustomerAreaOpenApiSaveDTOList)) {
            for (MerchantSaleAreaDataDTO customerAreaDTO : merchantCustomerAreaOpenApiSaveDTOList) {
                CustomerArea customerArea = new CustomerArea();
                BeanUtils.copyProperties((Object)customerAreaDTO, (Object)customerArea);
                MerchantSaveSdkServiceImpl.copyExtraFields(customerAreaDTO, customerArea, MerchantSaleAreaDataDTO.class, CustomerArea.class, null);
                if (customerAreaDTO.getEntityStatus() == UPCEntityStatus.Update && !CollectionUtils.isEmpty((Collection)customerAreaDTO.getNeedBlankFieldList())) {
                    MerchantSaveSdkServiceImpl.setFieldsBeNull(customerAreaDTO, customerArea, MerchantSaleAreaDataDTO.class, CustomerArea.class, customerAreaDTO.getNeedBlankFieldList());
                }
                customerArea.setEntityStatus(MerchantSaveSdkServiceImpl.convertEntityStatus(customerAreaDTO.getEntityStatus()));
                if (customerAreaDTO.getCustomExtend() != null) {
                    customerArea.put("customExtend", (Object)customerAreaDTO.getCustomExtend());
                    APIExtPropertiesUtil.processExtProperties((Map)customerArea, (String)"customExtend", null);
                }
                customerAreaList.add(customerArea);
            }
        }
        return customerAreaList;
    }

    static List<Principal> convertToPrincipalList(List<MerchantPrincipalDataDTO> merchantPrincipalOpenApiSaveDTOList) {
        ArrayList<Principal> principalArrayList = new ArrayList<Principal>();
        if (!CollectionUtils.isEmpty(merchantPrincipalOpenApiSaveDTOList)) {
            for (MerchantPrincipalDataDTO merchantPrincipalDataDTO : merchantPrincipalOpenApiSaveDTOList) {
                Principal principal = new Principal();
                BeanUtils.copyProperties((Object)merchantPrincipalDataDTO, (Object)principal);
                MerchantSaveSdkServiceImpl.copyExtraFields(merchantPrincipalDataDTO, principal, MerchantPrincipalDataDTO.class, Principal.class, null);
                if (merchantPrincipalDataDTO.getEntityStatus() == UPCEntityStatus.Update && !CollectionUtils.isEmpty((Collection)merchantPrincipalDataDTO.getNeedBlankFieldList())) {
                    MerchantSaveSdkServiceImpl.setFieldsBeNull(merchantPrincipalDataDTO, principal, MerchantPrincipalDataDTO.class, Principal.class, merchantPrincipalDataDTO.getNeedBlankFieldList());
                }
                principal.setEntityStatus(MerchantSaveSdkServiceImpl.convertEntityStatus(merchantPrincipalDataDTO.getEntityStatus()));
                if (merchantPrincipalDataDTO.getCustomExtend() != null) {
                    principal.put("customExtend", (Object)merchantPrincipalDataDTO.getCustomExtend());
                    APIExtPropertiesUtil.processExtProperties((Map)principal, (String)"customExtend", null);
                }
                principalArrayList.add(principal);
            }
        }
        return principalArrayList;
    }

    static EntityStatus convertEntityStatus(UPCEntityStatus entityStatus) {
        EntityStatus entityStatusRes = null;
        entityStatusRes = entityStatus == UPCEntityStatus.Insert ? EntityStatus.Insert : (entityStatus == UPCEntityStatus.Update ? EntityStatus.Update : (entityStatus == UPCEntityStatus.Delete ? EntityStatus.Delete : EntityStatus.Unchanged));
        return entityStatusRes;
    }

    static List<InvoicingCustomers> convertToInvoicingCustomerList(List<MerchantBillingDataDTO> merchantInvoicingCustomerOpenApiSaveDTOList) {
        ArrayList<InvoicingCustomers> invoicingCustomersList = new ArrayList<InvoicingCustomers>();
        if (!CollectionUtils.isEmpty(merchantInvoicingCustomerOpenApiSaveDTOList)) {
            for (MerchantBillingDataDTO merchantInvoiceDataDTO : merchantInvoicingCustomerOpenApiSaveDTOList) {
                InvoicingCustomers invoicingCustomers = new InvoicingCustomers();
                BeanUtils.copyProperties((Object)merchantInvoiceDataDTO, (Object)invoicingCustomers);
                MerchantSaveSdkServiceImpl.copyExtraFields(merchantInvoiceDataDTO, invoicingCustomers, MerchantInvoiceDataDTO.class, AgentInvoice.class, null);
                if (merchantInvoiceDataDTO.getEntityStatus() == UPCEntityStatus.Update && !CollectionUtils.isEmpty((Collection)merchantInvoiceDataDTO.getNeedBlankFieldList())) {
                    MerchantSaveSdkServiceImpl.setFieldsBeNull(merchantInvoiceDataDTO, invoicingCustomers, MerchantInvoiceDataDTO.class, AgentInvoice.class, merchantInvoiceDataDTO.getNeedBlankFieldList());
                }
                invoicingCustomers.setEntityStatus(MerchantSaveSdkServiceImpl.convertEntityStatus(merchantInvoiceDataDTO.getEntityStatus()));
                invoicingCustomersList.add(invoicingCustomers);
            }
        }
        return invoicingCustomersList;
    }

    static List<AgentInvoice> covertToMerchantAgentInvoiceList(List<MerchantInvoiceDataDTO> merchantAgentInvoiceInfos) {
        ArrayList<AgentInvoice> invoiceArrayList = new ArrayList<AgentInvoice>();
        if (!CollectionUtils.isEmpty(merchantAgentInvoiceInfos)) {
            for (MerchantInvoiceDataDTO invoiceDataDTO : merchantAgentInvoiceInfos) {
                AgentInvoice agentInvoice = new AgentInvoice();
                BeanUtils.copyProperties((Object)invoiceDataDTO, (Object)agentInvoice);
                MerchantSaveSdkServiceImpl.copyExtraFields(invoiceDataDTO, agentInvoice, MerchantInvoiceDataDTO.class, AgentInvoice.class, null);
                if (invoiceDataDTO.getEntityStatus() == UPCEntityStatus.Update && !CollectionUtils.isEmpty((Collection)invoiceDataDTO.getNeedBlankFieldList())) {
                    MerchantSaveSdkServiceImpl.setFieldsBeNull(invoiceDataDTO, agentInvoice, MerchantInvoiceDataDTO.class, AgentInvoice.class, invoiceDataDTO.getNeedBlankFieldList());
                }
                if (!ObjectUtils.isEmpty((Object)invoiceDataDTO.getAddress())) {
                    agentInvoice.set("address", (Object)invoiceDataDTO.getAddress().toMap());
                }
                agentInvoice.setEntityStatus(MerchantSaveSdkServiceImpl.convertEntityStatus(invoiceDataDTO.getEntityStatus()));
                if (invoiceDataDTO.getCustomExtend() != null) {
                    agentInvoice.put("customExtend", (Object)invoiceDataDTO.getCustomExtend());
                    APIExtPropertiesUtil.processExtProperties((Map)agentInvoice, (String)"customExtend", null);
                }
                invoiceArrayList.add(agentInvoice);
            }
        }
        return invoiceArrayList;
    }

    static List<AgentFinancial> covertToMerchantAgentFinancialList(List<AgentFinancialDataDTO> merchantAgentFinancialInfos) {
        ArrayList<AgentFinancial> agentFinancialArrayList = new ArrayList<AgentFinancial>();
        if (!CollectionUtils.isEmpty(merchantAgentFinancialInfos)) {
            for (AgentFinancialDataDTO agentFinancialDataDTO : merchantAgentFinancialInfos) {
                AgentFinancial agentFinancial = new AgentFinancial();
                BeanUtils.copyProperties((Object)agentFinancialDataDTO, (Object)agentFinancial);
                MerchantSaveSdkServiceImpl.copyExtraFields(agentFinancialDataDTO, agentFinancial, AgentFinancialDataDTO.class, AgentFinancial.class, null);
                if (agentFinancialDataDTO.getEntityStatus() == UPCEntityStatus.Update && !CollectionUtils.isEmpty((Collection)agentFinancialDataDTO.getNeedBlankFieldList())) {
                    MerchantSaveSdkServiceImpl.setFieldsBeNull(agentFinancialDataDTO, agentFinancial, AgentFinancialDataDTO.class, AgentFinancial.class, agentFinancialDataDTO.getNeedBlankFieldList());
                }
                if (!ObjectUtils.isEmpty((Object)agentFinancialDataDTO.getAccountOpeningAddress())) {
                    agentFinancial.set("accountOpeningAddress", (Object)agentFinancialDataDTO.getAccountOpeningAddress().toMap());
                }
                if (!ObjectUtils.isEmpty((Object)agentFinancialDataDTO.getBankAccountName())) {
                    agentFinancial.set("bankAccountName", (Object)agentFinancialDataDTO.getBankAccountName().toMap());
                }
                agentFinancial.setEntityStatus(MerchantSaveSdkServiceImpl.convertEntityStatus(agentFinancialDataDTO.getEntityStatus()));
                if (agentFinancialDataDTO.getCustomExtend() != null) {
                    agentFinancial.put("customExtend", (Object)agentFinancialDataDTO.getCustomExtend());
                    APIExtPropertiesUtil.processExtProperties((Map)agentFinancial, (String)"customExtend", null);
                }
                agentFinancialArrayList.add(agentFinancial);
            }
        }
        return agentFinancialArrayList;
    }

    static List<Contacter> covertToMerchantContactList(List<MerchantContacterDataDTO> merchantContactInfos) {
        ArrayList<Contacter> contacterList = new ArrayList<Contacter>();
        if (!CollectionUtils.isEmpty(merchantContactInfos)) {
            for (MerchantContacterDataDTO contacterDataDTO : merchantContactInfos) {
                Contacter contacter = new Contacter();
                BeanUtils.copyProperties((Object)contacterDataDTO, (Object)contacter);
                MerchantSaveSdkServiceImpl.copyExtraFields(contacterDataDTO, contacter, MerchantContacterDataDTO.class, Contacter.class, null);
                if (contacterDataDTO.getEntityStatus() == UPCEntityStatus.Update && !CollectionUtils.isEmpty((Collection)contacterDataDTO.getNeedBlankFieldList())) {
                    MerchantSaveSdkServiceImpl.setFieldsBeNull(contacterDataDTO, contacter, MerchantContacterDataDTO.class, Contacter.class, contacterDataDTO.getNeedBlankFieldList());
                }
                if (contacterDataDTO.getFullName() != null) {
                    contacter.set("fullName", (Object)contacterDataDTO.getFullName().toMap());
                }
                contacter.setEntityStatus(MerchantSaveSdkServiceImpl.convertEntityStatus(contacterDataDTO.getEntityStatus()));
                if (contacterDataDTO.getCustomExtend() != null) {
                    contacter.put("customExtend", (Object)contacterDataDTO.getCustomExtend());
                    APIExtPropertiesUtil.processExtProperties((Map)contacter, (String)"customExtend", null);
                }
                contacterList.add(contacter);
            }
        }
        return contacterList;
    }

    static List<AddressInfo> covertToMerchantAddressList(List<AddressInfoDataDTO> merchantAddressInfos) {
        ArrayList<AddressInfo> merchantAddressList = new ArrayList<AddressInfo>();
        if (!CollectionUtils.isEmpty(merchantAddressInfos)) {
            for (AddressInfoDataDTO merchantAddressInfo : merchantAddressInfos) {
                AddressInfo addressInfo = new AddressInfo();
                BeanUtils.copyProperties((Object)merchantAddressInfo, (Object)addressInfo);
                MerchantSaveSdkServiceImpl.copyExtraFields(merchantAddressInfo, addressInfo, AddressInfoDataDTO.class, AddressInfo.class, null);
                if (merchantAddressInfo.getEntityStatus() == UPCEntityStatus.Update && !CollectionUtils.isEmpty((Collection)merchantAddressInfo.getNeedBlankFieldList())) {
                    MerchantSaveSdkServiceImpl.setFieldsBeNull(merchantAddressInfo, addressInfo, AddressInfoDataDTO.class, AddressInfo.class, merchantAddressInfo.getNeedBlankFieldList());
                }
                addressInfo.setEntityStatus(MerchantSaveSdkServiceImpl.convertEntityStatus(merchantAddressInfo.getEntityStatus()));
                if (merchantAddressInfo.getCustomExtend() != null) {
                    addressInfo.put("customExtend", (Object)merchantAddressInfo.getCustomExtend());
                    APIExtPropertiesUtil.processExtProperties((Map)addressInfo, (String)"customExtend", null);
                }
                merchantAddressList.add(addressInfo);
            }
        }
        return merchantAddressList;
    }

    static MerchantsManager covertToMerchantsManager(MerchantsManagerDataDTO merchantsDataManager) {
        MerchantsManager merchantsManager = new MerchantsManager();
        BeanUtils.copyProperties((Object)merchantsDataManager, (Object)merchantsManager);
        MerchantSaveSdkServiceImpl.copyExtraFields(merchantsDataManager, merchantsManager, MerchantsManagerDataDTO.class, MerchantsManager.class, null);
        if (merchantsDataManager.getEntityStatus() == UPCEntityStatus.Update && !CollectionUtils.isEmpty((Collection)merchantsDataManager.getNeedBlankFieldList())) {
            MerchantSaveSdkServiceImpl.setFieldsBeNull(merchantsDataManager, merchantsManager, MerchantsManagerDataDTO.class, MerchantsManager.class, merchantsDataManager.getNeedBlankFieldList());
        }
        merchantsManager.setEntityStatus(MerchantSaveSdkServiceImpl.convertEntityStatus(merchantsDataManager.getEntityStatus()));
        return merchantsManager;
    }

    static MerchantRoleInfo covertToMerchantRoleInfo(MerchantRoleInfoDataDTO merchantRole) {
        MerchantRoleInfo merchantRoleInfo = new MerchantRoleInfo();
        if (merchantRole != null) {
            BeanUtils.copyProperties((Object)merchantRole, (Object)merchantRoleInfo);
            MerchantSaveSdkServiceImpl.copyExtraFields(merchantRole, merchantRoleInfo, MerchantRoleInfoDataDTO.class, MerchantRoleInfo.class, null);
            if (merchantRole.getEntityStatus() == UPCEntityStatus.Update && !CollectionUtils.isEmpty((Collection)merchantRole.getNeedBlankFieldList())) {
                MerchantSaveSdkServiceImpl.setFieldsBeNull(merchantRole, merchantRoleInfo, MerchantRoleInfoDataDTO.class, MerchantRoleInfo.class, merchantRole.getNeedBlankFieldList());
            }
            merchantRoleInfo.setEntityStatus(MerchantSaveSdkServiceImpl.convertEntityStatus(merchantRole.getEntityStatus()));
        }
        return merchantRoleInfo;
    }

    public static void copyExtraFields(Object source, Object target, Class<?> sourceClass, Class<?> targetClass, String[] excludeFields) {
        HashSet<String> ignoredProps;
        HashSet<String> hashSet = ignoredProps = excludeFields != null ? new HashSet<String>(Arrays.asList(excludeFields)) : null;
        if (source == null || target == null || !(target instanceof BizObject)) {
            return;
        }
        try {
            Method[] sourceMethods;
            Map targetMap = (Map)target;
            Set targetFieldNames = Arrays.stream(targetClass.getDeclaredFields()).map(Field::getName).collect(Collectors.toSet());
            for (Method method : sourceMethods = sourceClass.getMethods()) {
                String fieldName;
                if (!MerchantSaveSdkServiceImpl.isGetter(method) || "class".equals(fieldName = MerchantSaveSdkServiceImpl.getFieldNameFromGetter(method.getName())) || targetFieldNames.contains(fieldName)) continue;
                try {
                    if (ignoredProps != null && ignoredProps.contains(fieldName)) continue;
                    Object value = method.invoke(source, new Object[0]);
                    if (value != null) {
                        targetMap.put(fieldName, value);
                        continue;
                    }
                    targetMap.remove(fieldName);
                }
                catch (Exception e) {
                    // empty catch block
                }
            }
        }
        catch (Exception e) {
            throw new RuntimeException("\u590d\u5236\u989d\u5916\u5b57\u6bb5\u65f6\u53d1\u751f\u9519\u8bef", e);
        }
    }

    public static void setFieldsBeNull(Object source, Object target, Class<?> sourceClass, Class<?> targetClass, List<String> toBeNullFields) {
        HashSet<String> ToBeNullFieldSet;
        HashSet<String> hashSet = ToBeNullFieldSet = toBeNullFields != null ? new HashSet<String>(toBeNullFields) : null;
        if (ToBeNullFieldSet == null || source == null || target == null || !(target instanceof BizObject)) {
            return;
        }
        try {
            Method[] sourceMethods;
            Map targetMap = (Map)target;
            for (Method method : sourceMethods = sourceClass.getMethods()) {
                String fieldName;
                if (!MerchantSaveSdkServiceImpl.isGetter(method) || "class".equals(fieldName = MerchantSaveSdkServiceImpl.getFieldNameFromGetter(method.getName()))) continue;
                try {
                    if (!ToBeNullFieldSet.contains(fieldName)) continue;
                    targetMap.put(fieldName, null);
                }
                catch (Exception e) {
                    // empty catch block
                }
            }
        }
        catch (Exception e) {
            throw new RuntimeException("\u590d\u5236\u989d\u5916\u5b57\u6bb5\u65f6\u53d1\u751f\u9519\u8bef", e);
        }
    }

    public static void copyUnassignedToNull(Object target, Class<?> targetClass, List<String> needSetNullFieldList) {
        if (needSetNullFieldList == null || needSetNullFieldList.isEmpty()) {
            return;
        }
        try {
            Field[] targetFields;
            for (Field targetField : targetFields = targetClass.getDeclaredFields()) {
                String fieldName = targetField.getName();
                if (!needSetNullFieldList.contains(fieldName)) continue;
                targetField.setAccessible(true);
                targetField.set(target, null);
            }
        }
        catch (Exception e) {
            throw new RuntimeException("\u590d\u5236\u672a\u8d4b\u503c\u5b57\u6bb5\u65f6\u53d1\u751f\u9519\u8bef", e);
        }
    }

    private static Class<?> getWrapperType(Class<?> primitiveType) {
        if (primitiveType.equals(Boolean.TYPE)) {
            return Boolean.class;
        }
        if (primitiveType.equals(Byte.TYPE)) {
            return Byte.class;
        }
        if (primitiveType.equals(Character.TYPE)) {
            return Character.class;
        }
        if (primitiveType.equals(Short.TYPE)) {
            return Short.class;
        }
        if (primitiveType.equals(Integer.TYPE)) {
            return Integer.class;
        }
        if (primitiveType.equals(Long.TYPE)) {
            return Long.class;
        }
        if (primitiveType.equals(Float.TYPE)) {
            return Float.class;
        }
        if (primitiveType.equals(Double.TYPE)) {
            return Double.class;
        }
        return primitiveType;
    }

    private static boolean isGetter(Method method) {
        if (!method.getName().startsWith("get")) {
            return false;
        }
        if (method.getParameterTypes().length != 0) {
            return false;
        }
        return !Void.TYPE.equals(method.getReturnType());
    }

    private static String getFieldNameFromGetter(String methodName) {
        String fieldName = methodName.substring(3);
        return fieldName.substring(0, 1).toLowerCase() + fieldName.substring(1);
    }

    public void merchantBusinessLog(MerchantDataDTO merchantDTO, String action) {
        try {
            if (merchantDTO != null && !CollectionUtils.isEmpty((Collection)merchantDTO.getMerchantAgentFinancialInfos())) {
                String id = ((AgentFinancialDataDTO)merchantDTO.getMerchantAgentFinancialInfos().get(0)).getOpenBank();
                BusinessLogObjectBuilder businessLogObjectBuilder = new BusinessLogObjectBuilder();
                businessLogObjectBuilder.uri("aa.merchant.Merchant").busiObjTypeCode("aa_merchant").busiObjTypeName("UID:P_COREDOC-BE_1FF7F05805280010").defaultBusiObjTypeName("\u5ba2\u6237\u66f4\u65b0\u94f6\u884c\u4fe1\u606f").operationName("UID:P_COREDOC-BE_1FF7F05805280011").defaultOperationName("\u66f4\u65b0\u94f6\u884c\u4fe1\u606f").logMode(BusinessLogMode.UI_META).domain("productcenter").serviceCode("aa_merchant").newObject((Object)merchantDTO).dataId(id).dataCode("").dataName("");
                this.busiLogService.saveBusinessLog(businessLogObjectBuilder.build());
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

