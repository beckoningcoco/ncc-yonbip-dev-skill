/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.upc.tools.CoreDocJsonResultForOpenApi
 *  com.yonyoucloud.iuap.ipass.custcategory.CustCategoryIPassSaveRequest
 *  com.yonyoucloud.iuap.ipass.custcategory.CustcategoryIPassTreeRequest
 *  com.yonyoucloud.iuap.upc.dto.derivatives.CustomerCategoryDTO
 *  com.yonyoucloud.iuap.upc.dto.derivatives.CustomerCategoryQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCPager
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.upc.ipass.merchant.PassResultDTO
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.iuap.ipass.service.custcategory;

import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.upc.tools.CoreDocJsonResultForOpenApi;
import com.yonyoucloud.iuap.ipass.custcategory.CustCategoryIPassSaveRequest;
import com.yonyoucloud.iuap.ipass.custcategory.CustcategoryIPassTreeRequest;
import com.yonyoucloud.iuap.upc.dto.derivatives.CustomerCategoryDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.CustomerCategoryQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.upc.ipass.merchant.PassResultDTO;
import com.yonyoucloud.upc.service.api.CustomerCategoryServiceImpl;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class CustCategoryIPassService {
    private static final Logger log = LoggerFactory.getLogger(CustCategoryIPassService.class);
    @Autowired
    private CustomerCategoryServiceImpl customerCategoryService;

    public CoreDocJsonResultForOpenApi queryTreeIPASS(CustcategoryIPassTreeRequest custcategoryIPassTreeRequest) {
        try {
            CustomerCategoryQryDTO customerCategoryQryDTO = new CustomerCategoryQryDTO();
            BeanUtils.copyProperties((Object)custcategoryIPassTreeRequest, (Object)customerCategoryQryDTO);
            if (custcategoryIPassTreeRequest.getBeginTime() != null) {
                customerCategoryQryDTO.setBeganTime(custcategoryIPassTreeRequest.getBeginTime());
            }
            CoreDocJsonResult<CustomerCategoryDTO> coreDocJsonResult = this.customerCategoryService.queryTree(customerCategoryQryDTO);
            Integer recordCount = this.customerCategoryService.queryTreeCount(customerCategoryQryDTO);
            UPCPager upcPager = new UPCPager();
            upcPager.setPageIndex(custcategoryIPassTreeRequest.getPageIndex());
            upcPager.setPageSize(custcategoryIPassTreeRequest.getPageSize());
            upcPager.setRecordCount(recordCount);
            upcPager.setHaveNextPage(Boolean.valueOf(false));
            if (recordCount != null && recordCount > custcategoryIPassTreeRequest.getPageSize() * custcategoryIPassTreeRequest.getPageIndex()) {
                upcPager.setHaveNextPage(Boolean.valueOf(true));
            }
            upcPager.setRecordList(coreDocJsonResult.getData());
            return CoreDocJsonResultForOpenApi.success((Object)upcPager);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(businessException.getMessage()));
        }
        catch (Exception e) {
            log.error("\u5ba2\u6237\u5206\u7c7b\u6811ipass\u96c6\u6210\u63a5\u53e3\u67e5\u8be2\u9519\u8bef\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResultForOpenApi doBatchSaveOrUpdateForeach(List<CustCategoryIPassSaveRequest> custCategoryIPassSaveRequests) {
        if (CollectionUtils.isEmpty(custCategoryIPassSaveRequests)) {
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        if (custCategoryIPassSaveRequests.size() > CoredocSDKConstant.DEFAULT_NUM_FOR_SIMPLE) {
            return CoreDocJsonResultForOpenApi.error((Long)Long.valueOf(CoreDocBusinessErrorEnum.PARAM_MORE_THAN_LIMITATION.getCode()), (String)String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A7F2BEA04080003", (String)"\u8bf7\u6c42\u6570\u91cf\u8d85\u8fc7\u6700\u5927\u9650\u5236\u6570\u91cf:%d"), CoredocSDKConstant.DEFAULT_NUM_FOR_SIMPLE));
        }
        try {
            UPCResultList upcResultList = new UPCResultList();
            Integer successCount = 0;
            Integer failCount = 0;
            ArrayList<PassResultDTO> messages = new ArrayList<PassResultDTO>();
            ArrayList successInfos = new ArrayList();
            for (CustCategoryIPassSaveRequest custCategoryIPassSaveRequest : custCategoryIPassSaveRequests) {
                Integer n;
                CustomerCategoryDTO customerCategoryDTO = new CustomerCategoryDTO();
                BeanUtils.copyProperties((Object)custCategoryIPassSaveRequest, (Object)customerCategoryDTO);
                PassResultDTO passResultDTO = new PassResultDTO();
                CoreDocJsonResult<CustomerCategoryDTO> result = customerCategoryDTO.getId() != null ? this.customerCategoryService.update(customerCategoryDTO) : this.customerCategoryService.add(customerCategoryDTO);
                if (result.isSuccess()) {
                    n = successCount;
                    successCount = successCount + 1;
                    CustomerCategoryDTO customerCategory = (CustomerCategoryDTO)result.getData().get(0);
                    passResultDTO.setSourceUnique(custCategoryIPassSaveRequest.getSourceUnique());
                    passResultDTO.setTargetUnique(customerCategory.getId().toString());
                    HashMap<String, PassResultDTO> infoMap = new HashMap<String, PassResultDTO>();
                    infoMap.put("data", passResultDTO);
                    successInfos.add(infoMap);
                    continue;
                }
                n = failCount;
                failCount = failCount + 1;
                passResultDTO.setSourceUnique(custCategoryIPassSaveRequest.getSourceUnique());
                passResultDTO.setMessage(result.getMessage());
                messages.add(passResultDTO);
            }
            upcResultList.setCount(Integer.valueOf(failCount + successCount));
            upcResultList.setFailCount(failCount);
            upcResultList.setSuccessCount(successCount);
            upcResultList.setMessages(messages);
            upcResultList.setInfos(successInfos);
            return CoreDocJsonResultForOpenApi.success((Object)upcResultList);
        }
        catch (Exception e) {
            log.error("\u5ba2\u6237\u5206\u7c7b\u6279\u91cf\u4fdd\u5b58\u66f4\u65b0-\u96c6\u6210\u63a5\u53e3\u5f02\u5e38:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }
}

