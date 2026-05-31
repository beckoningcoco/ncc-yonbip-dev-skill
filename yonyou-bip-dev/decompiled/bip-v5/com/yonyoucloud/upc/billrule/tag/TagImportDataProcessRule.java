/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.tag.Tag
 *  org.imeta.orm.base.EntityStatus
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.tag;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.tag.Tag;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.EntityStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="tagImportDataProcessRule")
public class TagImportDataProcessRule
extends AbstractCommonRule {
    @Autowired
    CooperationFileService cooperationFileService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        Integer tag_position;
        long logoNum;
        Integer style;
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        Tag tag = (Tag)bills.get(0);
        boolean hasScope = tag.containsKey((Object)"scope");
        if (!hasScope || tag.getScope() == null || "".equals(tag.getScope().trim())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800353);
        }
        String scope = tag.getScope();
        this.checkScope(scope);
        scope = scope.trim().replace(",", "").replace("", ",");
        int length = scope.length();
        if (length > 0) {
            scope = scope.substring(1, length - 1);
        }
        tag.setScope(scope);
        if (tag.getScope().indexOf("1") != -1 && tag.getTag_position() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800354);
        }
        if (tag.getScope().indexOf("1") == -1 && tag.getTag_position() != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800355);
        }
        if (tag.getScope().contains("1")) {
            tag.setIsFront(Boolean.valueOf(true));
        }
        if (tag.getScope().contains("2")) {
            tag.setIsManage(Boolean.valueOf(true));
        }
        if (tag.getScope().contains("3")) {
            tag.setIsFastSale(Boolean.valueOf(true));
        }
        if (tag.getScope().contains("4")) {
            tag.setIsSmartSearch(Boolean.valueOf(true));
        }
        if ((style = tag.getStyle()) == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800356);
        }
        if (style != 1 && style != 2) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800357);
        }
        String tag_bgcolor = tag.getTag_bgcolor();
        if (style == 1 && tag_bgcolor == null && tag.getEntityStatus() == EntityStatus.Insert) {
            tag.setTag_bgcolor("#FF7301");
        }
        String tag_fgcolor = tag.getTag_fgcolor();
        if (style == 1 && tag_fgcolor == null && tag.getEntityStatus() == EntityStatus.Insert) {
            tag.setTag_fgcolor("#fff");
        }
        if (style == 2 && tag.getTagBusinessId() != null && (logoNum = this.cooperationFileService.countFiles("iuap-apdoc-material", tag.getTagBusinessId())) > 1L) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_TAG_PICTURE_COUNT_EXCEED_MAX_NUMBER);
        }
        String ruleScope = tag.getRuleScope();
        if (ruleScope == null) {
            tag.setRuleScope("1");
        }
        if ((tag_position = tag.getTag_position()) != null && tag_position != 1 && tag_position != 2 && tag_position != 3 && tag_position != 4) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800358);
        }
        return new RuleExecuteResult();
    }

    private void checkScope(String scope) throws Exception {
        String replace = scope.replace(",", "").replace(" ", "").replace("1", "").replace("2", "").replace("3", "");
        if (replace.length() > 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800359);
        }
    }
}

