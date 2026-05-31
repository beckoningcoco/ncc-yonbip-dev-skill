/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.upc.tools.CoreDocJsonResultForOpenApi
 *  com.yonyoucloud.iuap.ipass.brand.BrandIPassListRequest
 *  com.yonyoucloud.iuap.ipass.brand.BrandIPassSaveRequest
 *  com.yonyoucloud.iuap.upc.dto.derivatives.BrandDTO
 *  com.yonyoucloud.iuap.upc.dto.derivatives.BrandQryDTO
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
package com.yonyoucloud.iuap.ipass.impl.brand;

import com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.upc.tools.CoreDocJsonResultForOpenApi;
import com.yonyoucloud.iuap.ipass.brand.BrandIPassListRequest;
import com.yonyoucloud.iuap.ipass.brand.BrandIPassSaveRequest;
import com.yonyoucloud.iuap.ipass.service.brand.BrandIPassService;
import com.yonyoucloud.iuap.upc.dto.derivatives.BrandDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.BrandQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.upc.ipass.merchant.PassResultDTO;
import com.yonyoucloud.upc.service.api.BrandServiceImpl;
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
public class BrandIPassServiceImpl
implements BrandIPassService {
    private static final Logger log = LoggerFactory.getLogger(BrandIPassServiceImpl.class);
    @Autowired
    private BrandServiceImpl brandService;

    @Override
    public CoreDocJsonResultForOpenApi doBrandQuery(BrandIPassListRequest brandIPassListRequest) {
        try {
            BrandQryDTO brandQryDTO = new BrandQryDTO();
            BeanUtils.copyProperties((Object)brandIPassListRequest, (Object)brandQryDTO);
            if (brandIPassListRequest.getBeginTime() != null) {
                brandQryDTO.setBeganTime(brandIPassListRequest.getBeginTime());
            }
            CoreDocJsonResult<BrandDTO> coreDocJsonResult = this.brandService.listByPage(brandQryDTO);
            CoreDocJsonResultForOpenApi resultForOpenApi = new CoreDocJsonResultForOpenApi();
            BeanUtils.copyProperties(coreDocJsonResult, (Object)resultForOpenApi);
            if (!resultForOpenApi.isSuccess()) {
                return resultForOpenApi;
            }
            Integer recordCount = this.brandService.queryBrandCount(brandQryDTO);
            UPCPager upcPager = new UPCPager();
            upcPager.setPageIndex(brandIPassListRequest.getPageIndex());
            upcPager.setPageSize(brandIPassListRequest.getPageSize());
            upcPager.setRecordCount(recordCount);
            upcPager.setHaveNextPage(Boolean.valueOf(false));
            if (recordCount != null && brandIPassListRequest.getPageIndex() != null && brandIPassListRequest.getPageSize() != null && recordCount > brandIPassListRequest.getPageSize() * brandIPassListRequest.getPageIndex()) {
                upcPager.setHaveNextPage(Boolean.valueOf(true));
            }
            upcPager.setRecordList((List)resultForOpenApi.getData());
            resultForOpenApi.setData((Object)upcPager);
            return resultForOpenApi;
        }
        catch (Exception e) {
            log.error("\u54c1\u724c\u5217\u8868\u67e5\u8be2\u7279\u5f81-\u96c6\u6210\u63a5\u53e3\u5f02\u5e38:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    @Override
    public CoreDocJsonResultForOpenApi doBrandBatchSaveOrUpdate(List<BrandIPassSaveRequest> brandIPassSaveRequestList) {
        if (CollectionUtils.isEmpty(brandIPassSaveRequestList)) {
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        if (brandIPassSaveRequestList.size() > CoredocSDKConstant.DEFAULT_NUM_FOR_SIMPLE) {
            return CoreDocJsonResultForOpenApi.error((Long)Long.valueOf(CoreDocBusinessErrorEnum.PARAM_MORE_THAN_LIMITATION.getCode()), (String)String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A7F2BEA04080003", (String)"\u8bf7\u6c42\u6570\u91cf\u8d85\u8fc7\u6700\u5927\u9650\u5236\u6570\u91cf:%d"), CoredocSDKConstant.DEFAULT_NUM_FOR_SIMPLE));
        }
        try {
            UPCResultList upcResultList = new UPCResultList();
            Integer successCount = 0;
            Integer failCount = 0;
            ArrayList<PassResultDTO> messages = new ArrayList<PassResultDTO>();
            ArrayList successInfos = new ArrayList();
            for (BrandIPassSaveRequest brandIPassSaveRequest : brandIPassSaveRequestList) {
                Integer n;
                BrandDTO brandDTO = new BrandDTO();
                BeanUtils.copyProperties((Object)brandIPassSaveRequest, (Object)brandDTO);
                PassResultDTO passResultDTO = new PassResultDTO();
                CoreDocJsonResult<BrandDTO> saveResult = brandDTO.getId() != null ? this.brandService.update(brandDTO) : this.brandService.add(brandDTO);
                if (saveResult.isSuccess()) {
                    n = successCount;
                    successCount = successCount + 1;
                    BrandDTO brand = (BrandDTO)saveResult.getData().get(0);
                    passResultDTO.setSourceUnique(brandIPassSaveRequest.getSourceUnique());
                    passResultDTO.setTargetUnique(brand.getId().toString());
                    HashMap<String, PassResultDTO> infoMap = new HashMap<String, PassResultDTO>();
                    infoMap.put("data", passResultDTO);
                    successInfos.add(infoMap);
                    continue;
                }
                n = failCount;
                failCount = failCount + 1;
                passResultDTO.setSourceUnique(brandIPassSaveRequest.getSourceUnique());
                passResultDTO.setMessage(saveResult.getMessage());
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
            log.error("\u54c1\u724c\u65b0\u589e/\u66f4\u65b0\u4fdd\u5b58-\u7279\u5f81-\u96c6\u6210\u63a5\u53e3\u5f02\u5e38:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }
}

