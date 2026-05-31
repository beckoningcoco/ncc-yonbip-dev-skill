/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.tag.Tag
 *  com.yonyoucloud.upc.pc.tag.TagRule
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.tag;

import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.tag.Tag;
import com.yonyoucloud.upc.pc.tag.TagRule;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component(value="tagReferFilter")
public class TagRefFilter
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, map);
        Tag tag = null;
        if (null != bills && bills.size() > 0) {
            tag = (Tag)this.getBills(billContext, map).get(0);
        }
        if (null != tag) {
            RefEntity refEntity = billDataDto.getRefEntity();
            HashMap<String, String> mapCondition = billDataDto.getMapCondition();
            if (mapCondition == null) {
                mapCondition = new HashMap<String, String>();
                billDataDto.setMapCondition(mapCondition);
            }
            if ("pc_tagrulefieldref".equals(refEntity.refType)) {
                if (tag.rules() != null) {
                    TagRule rule = (TagRule)tag.rules().get(0);
                    mapCondition.put("type", rule.getPropertyType());
                } else {
                    mapCondition.put("type", "0");
                }
            }
        }
        return new RuleExecuteResult();
    }
}

