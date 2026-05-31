/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.hrcloud.employeedoc.addressbook.BaseResponse
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.staff.model.StaffImportantInfoDto
 *  com.yonyou.iuap.staff.model.StaffInfoQueryParam
 *  com.yonyou.iuap.staff.service.StaffInfoQueryService
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.hrcloud.employeedoc.addressbook.BaseResponse;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.staff.model.StaffImportantInfoDto;
import com.yonyou.iuap.staff.model.StaffInfoQueryParam;
import com.yonyou.iuap.staff.service.StaffInfoQueryService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component
public class UpcStaffQueryService {
    @Autowired
    private StaffInfoQueryService staffInfoQueryService;

    public StaffImportantInfoDto getStaffInfoByUserId(String userId) {
        if (!StringUtils.hasText((String)userId)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800519);
        }
        ArrayList<String> userIdList = new ArrayList<String>();
        userIdList.add(userId);
        StaffInfoQueryParam staffInfoQueryParam = new StaffInfoQueryParam();
        staffInfoQueryParam.setUserIds(userIdList);
        staffInfoQueryParam.setContainsDisableStaff("true");
        staffInfoQueryParam.setContainsEndMainJobInfo("false");
        staffInfoQueryParam.setContainsPtJob("true");
        staffInfoQueryParam.setContainsEndptJobInfo("false");
        BaseResponse baseResponse = this.staffInfoQueryService.getStaffByStaffUserIds(staffInfoQueryParam);
        if (baseResponse != null) {
            if (baseResponse.getCode() == 1) {
                Object staffObj;
                List staffList;
                Object dataList;
                Map data = baseResponse.getData();
                if (!CollectionUtils.isEmpty((Map)data) && (dataList = data.get("data")) instanceof List && !CollectionUtils.isEmpty((Collection)(staffList = (List)dataList)) && (staffObj = staffList.get(0)) instanceof StaffImportantInfoDto) {
                    return (StaffImportantInfoDto)staffObj;
                }
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800520);
            }
        }
        return null;
    }
}

