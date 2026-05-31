/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.service.attachment.impl.UPCAttachmentTransService
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileInfo
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.tag;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.service.attachment.impl.UPCAttachmentTransService;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileInfo;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="tagQueryAfterRule")
public class TagQueryAfterRule
extends AbstractCommonRule {
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    CooperationFileService cooperationFileService;
    @Autowired
    private UPCAttachmentTransService attachmentTransService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (billDataDto == null || null == billDataDto.getBillnum()) {
            return new RuleExecuteResult();
        }
        Pager pager = (Pager)paramMap.get("return");
        if (pager == null || pager.getRecordList() == null) {
            return new RuleExecuteResult();
        }
        List recordList = pager.getRecordList();
        if (!CollectionUtils.isEmpty((Collection)recordList)) {
            for (HashMap record : recordList) {
                if (!"pc_taglist".equals(billContext.getBillnum())) continue;
                this.queryAndSetTagAttachments(record);
            }
        }
        return new RuleExecuteResult();
    }

    public void queryAndSetTagAttachments(Map<String, Object> tag) {
        List tagBusinessIdList;
        if (tag.get("tagBusinessId") != null && !CollectionUtils.isEmpty((Collection)(tagBusinessIdList = this.cooperationFileService.queryFileList("iuap-apdoc-material", tag.get("tagBusinessId").toString(), 1, 50)))) {
            String url = this.attachmentTransService.dealFileUrl(((CooperationFileInfo)tagBusinessIdList.get(0)).getBucketUrl());
            tag.put("tag_image_url", url);
        }
    }
}

