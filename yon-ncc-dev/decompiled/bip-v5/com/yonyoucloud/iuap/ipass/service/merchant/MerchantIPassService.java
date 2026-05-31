/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.upc.tools.CoreDocJsonResultForOpenApi
 *  com.yonyoucloud.iuap.ipass.merchant.MerchantCharacterIPassQueryRequest
 *  com.yonyoucloud.iuap.ipass.merchant.MerchantIPassUpdateRequest
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCPager
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantAddressOpenApiSaveDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantOpenApiQryDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantOpenApiSaveDTO
 *  com.yonyoucloud.upc.ipass.merchant.PassResultDTO
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.iuap.ipass.service.merchant;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.upc.tools.CoreDocJsonResultForOpenApi;
import com.yonyoucloud.iuap.ipass.merchant.MerchantCharacterIPassQueryRequest;
import com.yonyoucloud.iuap.ipass.merchant.MerchantIPassUpdateRequest;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantAddressOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantOpenApiQryDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantOpenApiSaveDTO;
import com.yonyoucloud.upc.ipass.merchant.PassResultDTO;
import com.yonyoucloud.upc.service.MultiThreadService;
import com.yonyoucloud.upc.service.openapi.MerchantOpenApiServiceImpl;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class MerchantIPassService {
    private static final Logger log = LoggerFactory.getLogger(MerchantIPassService.class);
    private static final String[] MERCHANT_OPEN_API_FIELD = new String[]{"id", "code", "name", "createOrgId", "createOrgCode", "belongOrgId", "belongOrgCode", "transTypeId", "transTypeCode", "shortname", "countryId", "countryName", "languageId", "languageCode", "parentManageOrgId", "parentManageOrgCode", "parentCustomerId", "parentCustomerCode", "suppliersId", "suppliersCode", "retailInvestors", "internalOrg", "internalOrgIdId", "internalOrgIdCode", "taxPayingCategories", "customerClassId", "customerClassCode", "customerIndustryId", "customerIndustryCode", "developmentPartnerId", "developmentPartnerCode", "enterpriseNature", "enterpriseName", "personName", "orgName", "licenseType", "creditCode", "leaderName", "leaderNameIdNo", "personCharge", "personChargeIdNo", "businessLicenseNo", "businessterm", "buildTime", "contactName", "contactTel", "address", "regionCode", "email", "fax", "enterNatureId", "enterNatureCode", "currencyCode", "money", "peopleNum", "scopeModel", "yearMoney", "scope", "website", "wid", "postCode", "merchantCharacter", "newTimeZone"};
    @Autowired
    private MerchantOpenApiServiceImpl merchantOpenApiService;
    @Autowired
    private MultiThreadService multiThreadService;

    public List<UPCResultList> batchSaveMerchantCharacterFromPass(List<MerchantIPassUpdateRequest> merchantIPassUpdateRequestList) {
        if (CollectionUtils.isEmpty(merchantIPassUpdateRequestList) || merchantIPassUpdateRequestList.size() > CoredocSDKConstant.MAX_NUM_FOR_COMPLEX) {
            ArrayList<UPCResultList> resultList = new ArrayList<UPCResultList>();
            UPCResultList upcResultList = new UPCResultList();
            ArrayList<String> failInfos = new ArrayList<String>();
            upcResultList.setFailCount(Integer.valueOf(1));
            failInfos.add(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C8459500480000C", (String)"\u6279\u91cf\u64cd\u4f5c\u6570\u91cf\u4e3a\u7a7a\u6216\u8d85\u8fc7\u6700\u5927\u9650\u5236{0}!"), CoredocSDKConstant.MAX_NUM_FOR_COMPLEX));
            upcResultList.setFailInfos(failInfos);
            resultList.add(upcResultList);
            return resultList;
        }
        ArrayList<Future> futureList = new ArrayList<Future>();
        for (MerchantIPassUpdateRequest merchantIPassUpdateRequest : merchantIPassUpdateRequestList) {
            Future ruleExecuteResultFuture = RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> {
                Map<String, List<PassResultDTO>> result = this.saveMerchantIpass(merchantIPassUpdateRequest);
                return result;
            }, (ExecutorService)this.multiThreadService.getThreadPoolExecutor());
            futureList.add(ruleExecuteResultFuture);
        }
        ArrayList<UPCResultList> resultList = new ArrayList<UPCResultList>();
        UPCResultList upcResultList_o1 = new UPCResultList();
        AtomicInteger successCount_o1 = new AtomicInteger();
        AtomicInteger failCount_o1 = new AtomicInteger();
        ArrayList<Object> failInfos_o1 = new ArrayList<Object>();
        ArrayList successInfos_o1 = new ArrayList();
        UPCResultList upcResultList_o2 = new UPCResultList();
        AtomicInteger successCount_o2 = new AtomicInteger();
        ArrayList successInfos_o2 = new ArrayList();
        for (Future future : futureList) {
            try {
                HashMap<String, PassResultDTO> infoMap;
                if (CollectionUtils.isEmpty((Map)((Map)future.get()))) continue;
                Map map = (Map)future.get();
                if (!CollectionUtils.isEmpty((Collection)((Collection)map.get("data_o1")))) {
                    for (PassResultDTO passResultDTO : (List)map.get("data_o1")) {
                        infoMap = new HashMap<String, PassResultDTO>();
                        infoMap.put("data", passResultDTO);
                        successInfos_o1.add(infoMap);
                        successCount_o1.getAndIncrement();
                    }
                }
                if (!CollectionUtils.isEmpty((Collection)((Collection)map.get("message_o1")))) {
                    for (PassResultDTO passResultDTO : (List)map.get("message_o1")) {
                        failInfos_o1.add(passResultDTO);
                        failCount_o1.getAndIncrement();
                    }
                }
                if (CollectionUtils.isEmpty((Collection)((Collection)map.get("data_o2")))) continue;
                for (PassResultDTO passResultDTO : (List)map.get("data_o2")) {
                    infoMap = new HashMap();
                    infoMap.put("data", passResultDTO);
                    successInfos_o2.add(infoMap);
                    successCount_o2.getAndIncrement();
                }
            }
            catch (ExecutionException e) {
                failCount_o1.getAndIncrement();
                failInfos_o1.add(e.getCause().getCause().getMessage());
            }
            catch (Exception e) {
                failCount_o1.getAndIncrement();
                failInfos_o1.add(e.getCause().getMessage());
            }
        }
        upcResultList_o1.setCount(Integer.valueOf(failCount_o1.get() + successCount_o1.get()));
        upcResultList_o1.setFailCount(Integer.valueOf(failCount_o1.get()));
        upcResultList_o1.setSuccessCount(Integer.valueOf(successCount_o1.get()));
        upcResultList_o1.setMessages(failInfos_o1);
        upcResultList_o1.setInfos(successInfos_o1);
        upcResultList_o1.setLevel("o1");
        resultList.add(upcResultList_o1);
        if (successCount_o2.get() > 0) {
            upcResultList_o2.setCount(Integer.valueOf(successCount_o2.get()));
            upcResultList_o2.setFailCount(Integer.valueOf(0));
            upcResultList_o2.setSuccessCount(Integer.valueOf(successCount_o2.get()));
            upcResultList_o2.setInfos(successInfos_o2);
            upcResultList_o2.setLevel("o2");
            resultList.add(upcResultList_o2);
        }
        return resultList;
    }

    private Map<String, List<PassResultDTO>> saveMerchantIpass(MerchantIPassUpdateRequest merchantIPassUpdateRequest) {
        HashMap<String, List<PassResultDTO>> result = new HashMap<String, List<PassResultDTO>>();
        ArrayList<PassResultDTO> data_o1 = new ArrayList<PassResultDTO>();
        ArrayList<PassResultDTO> message_o1 = new ArrayList<PassResultDTO>();
        List<Object> data_o2 = new ArrayList();
        PassResultDTO passResultDTO = new PassResultDTO();
        try {
            MerchantOpenApiSaveDTO merchantOpenApiSaveDTO;
            if (EntityStatus.Update.name().equals(merchantIPassUpdateRequest.get_status()) || merchantIPassUpdateRequest.getId() != null) {
                merchantIPassUpdateRequest.setErpCode(merchantIPassUpdateRequest.getSourceUnique());
                merchantOpenApiSaveDTO = this.merchantOpenApiService.saveMerchantOpenApi((MerchantOpenApiSaveDTO)merchantIPassUpdateRequest, EntityStatus.Update);
            } else {
                merchantOpenApiSaveDTO = this.merchantOpenApiService.saveMerchantOpenApi((MerchantOpenApiSaveDTO)merchantIPassUpdateRequest, EntityStatus.Insert);
            }
            passResultDTO.setSourceUnique(merchantIPassUpdateRequest.getSourceUnique());
            passResultDTO.setTargetUnique(merchantOpenApiSaveDTO.getId().toString());
            data_o1.add(passResultDTO);
            data_o2 = this.handleData(merchantOpenApiSaveDTO);
        }
        catch (Exception e) {
            log.error("batchSaveMerchantCharacterFromPass_error" + e.getMessage(), (Throwable)e);
            passResultDTO.setSourceUnique(merchantIPassUpdateRequest.getSourceUnique());
            passResultDTO.setMessage(e.getMessage());
            message_o1.add(passResultDTO);
        }
        result.put("data_o1", data_o1);
        result.put("message_o1", message_o1);
        if (!CollectionUtils.isEmpty(data_o2)) {
            result.put("data_o2", data_o2);
        }
        return result;
    }

    private List<PassResultDTO> handleData(MerchantOpenApiSaveDTO dto) {
        ArrayList<PassResultDTO> resultList = new ArrayList<PassResultDTO>();
        if (dto != null) {
            PassResultDTO passResultDTO;
            if (dto.getMerchantAddressInfos() != null && !CollectionUtils.isEmpty((Collection)dto.getMerchantAddressInfos())) {
                for (MerchantAddressOpenApiSaveDTO data : dto.getMerchantAddressInfos()) {
                    if (data == null || data.getId() == null) continue;
                    passResultDTO = new PassResultDTO();
                    passResultDTO.setSourceUnique(data.getSourceUnique());
                    passResultDTO.setTargetUnique(data.getId().toString());
                    resultList.add(passResultDTO);
                }
            }
            if (dto.getMerchantContactInfos() != null && !CollectionUtils.isEmpty((Collection)dto.getMerchantContactInfos())) {
                for (MerchantAddressOpenApiSaveDTO data : dto.getMerchantContactInfos()) {
                    if (data == null || data.getId() == null) continue;
                    passResultDTO = new PassResultDTO();
                    passResultDTO.setSourceUnique(data.getSourceUnique());
                    passResultDTO.setTargetUnique(data.getId().toString());
                    resultList.add(passResultDTO);
                }
            }
            if (dto.getMerchantAgentFinancialInfos() != null && !CollectionUtils.isEmpty((Collection)dto.getMerchantAgentFinancialInfos())) {
                for (MerchantAddressOpenApiSaveDTO data : dto.getMerchantAgentFinancialInfos()) {
                    if (data == null || data.getId() == null) continue;
                    passResultDTO = new PassResultDTO();
                    passResultDTO.setSourceUnique(data.getSourceUnique());
                    passResultDTO.setTargetUnique(data.getId().toString());
                    resultList.add(passResultDTO);
                }
            }
            if (dto.getMerchantAgentInvoiceInfos() != null && !CollectionUtils.isEmpty((Collection)dto.getMerchantAgentInvoiceInfos())) {
                for (MerchantAddressOpenApiSaveDTO data : dto.getMerchantAgentInvoiceInfos()) {
                    if (data == null || data.getId() == null) continue;
                    passResultDTO = new PassResultDTO();
                    passResultDTO.setSourceUnique(data.getSourceUnique());
                    passResultDTO.setTargetUnique(data.getId().toString());
                    resultList.add(passResultDTO);
                }
            }
        }
        return resultList;
    }

    public CoreDocJsonResultForOpenApi queryMerchantMasterNewListFromPass(MerchantCharacterIPassQueryRequest merchantCharacterIPassQueryRequest) {
        MerchantOpenApiQryDTO merchantOpenApiQryDTO = new MerchantOpenApiQryDTO();
        BeanUtils.copyProperties((Object)merchantCharacterIPassQueryRequest, (Object)merchantOpenApiQryDTO);
        if (merchantCharacterIPassQueryRequest.getBeginTime() != null) {
            merchantOpenApiQryDTO.setBeganTime(merchantCharacterIPassQueryRequest.getBeginTime());
        }
        merchantOpenApiQryDTO.setFields(MERCHANT_OPEN_API_FIELD);
        List<MerchantOpenApiSaveDTO> merchantOpenApiSaveResultDTOList = null;
        Integer recordCount = null;
        try {
            merchantOpenApiSaveResultDTOList = this.merchantOpenApiService.queryMerchantOpenApi(merchantOpenApiQryDTO);
            recordCount = this.merchantOpenApiService.queryCountMerchantOpenApi(merchantOpenApiQryDTO);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(businessException.getMessage()));
        }
        catch (Exception e) {
            log.error("\u5ba2\u6237\u6863\u6848openApi\u5217\u8868\u67e5\u8be2\u83b7\u53d6\u5ba2\u6237\u6863\u6848\u62a5\u9519:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        Boolean customerChildInfo = merchantCharacterIPassQueryRequest.getCustom_childInfo();
        List<MerchantOpenApiSaveDTO> merchantDetailList = this.queryMerchantDetailList(customerChildInfo, merchantOpenApiSaveResultDTOList);
        List<MerchantOpenApiSaveDTO> queryResultList = CollectionUtils.isEmpty(merchantDetailList) ? merchantOpenApiSaveResultDTOList : merchantDetailList;
        List<String> wholeOrgCodeList = null;
        if (StringUtils.isNotBlank((CharSequence)merchantCharacterIPassQueryRequest.getFilterOrgCodes())) {
            wholeOrgCodeList = Arrays.asList(StringUtils.split((String)merchantCharacterIPassQueryRequest.getFilterOrgCodes(), (String)","));
        }
        if (!CollectionUtils.isEmpty(queryResultList)) {
            ArrayList<MerchantOpenApiSaveDTO> filterResultList = new ArrayList<MerchantOpenApiSaveDTO>();
            for (MerchantOpenApiSaveDTO queryResult : queryResultList) {
                if (wholeOrgCodeList == null) {
                    filterResultList.add(queryResult);
                    continue;
                }
                boolean filterDelete = true;
                for (String s : wholeOrgCodeList) {
                    if (!queryResult.getCreateOrgCode().startsWith(s)) continue;
                    filterDelete = false;
                    break;
                }
                if (!filterDelete) continue;
                filterResultList.add(queryResult);
            }
            queryResultList = filterResultList;
        }
        UPCPager upcPager = new UPCPager();
        upcPager.setPageIndex(merchantCharacterIPassQueryRequest.getPageIndex());
        upcPager.setPageSize(merchantCharacterIPassQueryRequest.getPageSize());
        upcPager.setRecordCount(recordCount);
        upcPager.setHaveNextPage(Boolean.valueOf(false));
        if (recordCount != null && merchantCharacterIPassQueryRequest.getPageIndex() != null && merchantCharacterIPassQueryRequest.getPageSize() != null && recordCount > merchantCharacterIPassQueryRequest.getPageSize() * merchantCharacterIPassQueryRequest.getPageIndex()) {
            upcPager.setHaveNextPage(Boolean.valueOf(true));
        }
        upcPager.setRecordList(queryResultList);
        return CoreDocJsonResultForOpenApi.success((Object)upcPager);
    }

    private List<MerchantOpenApiSaveDTO> queryMerchantDetailList(Boolean customerChildInfo, List<MerchantOpenApiSaveDTO> merchantOpenApiSaveResultDTOList) {
        ArrayList<MerchantOpenApiSaveDTO> merchantDetailList = new ArrayList<MerchantOpenApiSaveDTO>();
        if (customerChildInfo != null && customerChildInfo.booleanValue()) {
            ArrayList<Future> futureList = new ArrayList<Future>();
            for (MerchantOpenApiSaveDTO merchantOpenApiSaveResultDTO : merchantOpenApiSaveResultDTOList) {
                Future ruleExecuteResultFuture = RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> {
                    MerchantOpenApiSaveDTO merchantDetail = new MerchantOpenApiSaveDTO();
                    try {
                        MerchantOpenApiQryDTO merchantDetailQryDTO = new MerchantOpenApiQryDTO();
                        merchantDetailQryDTO.setId(merchantOpenApiSaveResultDTO.getId());
                        CoreDocJsonResult<MerchantOpenApiSaveDTO> coreDocJsonResult = this.merchantOpenApiService.detail(merchantDetailQryDTO);
                        merchantDetail = (MerchantOpenApiSaveDTO)coreDocJsonResult.getData().get(0);
                    }
                    catch (Exception e) {
                        log.error("queryMerchantDetailListFromPass_error" + e.getMessage(), (Throwable)e);
                    }
                    return merchantDetail;
                }, (ExecutorService)this.multiThreadService.getThreadPoolExecutor());
                futureList.add(ruleExecuteResultFuture);
            }
            try {
                for (Future future : futureList) {
                    merchantDetailList.add((MerchantOpenApiSaveDTO)future.get());
                }
            }
            catch (Exception e) {
                log.error("handelMerchantDetailListFromPass_error" + e.getMessage(), (Throwable)e);
            }
        }
        return merchantDetailList;
    }
}

