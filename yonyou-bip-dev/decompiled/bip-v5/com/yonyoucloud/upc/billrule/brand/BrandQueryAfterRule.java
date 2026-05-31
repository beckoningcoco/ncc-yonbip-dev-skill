/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.brand;

import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.service.api.BrandServiceImpl;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="brandQueryAfterRule")
public class BrandQueryAfterRule
extends AbstractCommonRule {
    @Autowired
    private BrandServiceImpl brandService;

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
        if (!CollectionUtils.isEmpty((Collection)recordList) && "pc_brandlist".equals(billContext.getBillnum())) {
            this.brandService.batchQueryAndSetBrandAttachments(recordList);
            for (HashMap record : recordList) {
                if (!"pc_brandlist".equals(billContext.getBillnum())) continue;
                if (record.containsKey("brandLogoBusinessId")) {
                    record.remove("brandLogoBusinessId");
                    continue;
                }
                if (!record.containsKey("adImageBusinessId")) continue;
                record.remove("adImageBusinessId");
            }
        }
        return new RuleExecuteResult();
    }
}

