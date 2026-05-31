/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileGroupService
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.group.GroupBindFileRequest
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.response.CommonResponse
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.fileservice.sdk.module.CooperationFileGroupService;
import com.yonyou.iuap.fileservice.sdk.module.pojo.group.GroupBindFileRequest;
import com.yonyou.iuap.fileservice.sdk.module.pojo.response.CommonResponse;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="attachmentGroupBindService")
public class AttachmentGroupBindService {
    private static final Logger log = LoggerFactory.getLogger(AttachmentGroupBindService.class);
    @Autowired
    CooperationFileGroupService cooperationFileGroupService;

    public CommonResponse bindGroupForAttachment(String businessId, String typeCode, String groupCode, List<String> fileIds) {
        GroupBindFileRequest groupBindFileRequest = new GroupBindFileRequest();
        groupBindFileRequest.setAppCode("PF");
        groupBindFileRequest.setBusinessType("iuap-apdoc-material");
        groupBindFileRequest.setBusinessId(businessId);
        groupBindFileRequest.setTypeCode(typeCode);
        groupBindFileRequest.setGroupCode(groupCode);
        groupBindFileRequest.setFileIds(fileIds);
        CommonResponse commonResponse = this.cooperationFileGroupService.groupBindFiles(groupBindFileRequest);
        return commonResponse;
    }
}

