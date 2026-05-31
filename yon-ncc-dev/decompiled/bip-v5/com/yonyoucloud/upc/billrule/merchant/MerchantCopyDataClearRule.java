/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.biz.base.BizContext
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.JsonFormatter
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.biz.base.BizContext;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.JsonFormatter;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantCopyDataClearRule")
public class MerchantCopyDataClearRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        String fullname = billContext.getFullname();
        List bills = this.getBills(billContext, paramMap);
        if (!CollectionUtils.isEmpty((Collection)bills)) {
            for (BizObject bill : bills) {
                List merchantApplyRangeListMap;
                bill.put("isCreator", null);
                bill.put("isApplied", null);
                List merchantApplyRangesListMap = (List)bill.get("merchantApplyRanges");
                if (!CollectionUtils.isEmpty((Collection)merchantApplyRangesListMap)) {
                    merchantApplyRangesListMap.stream().forEach(map -> {
                        map.remove("merchantAppliedDetail!id");
                        map.remove("merchantAppliedDetail!pubts");
                    });
                    bill.put("merchantApplyRanges", (Object)merchantApplyRangesListMap);
                }
                if (CollectionUtils.isEmpty((Collection)(merchantApplyRangeListMap = (List)bill.get("merchantApplyRange")))) continue;
                merchantApplyRangeListMap.stream().forEach(map -> {
                    map.remove("merchantAppliedDetail!id");
                    map.remove("merchantAppliedDetail!pubts");
                });
                bill.put("merchantApplyRange", (Object)merchantApplyRangeListMap);
            }
        }
        JsonFormatter formatter = new JsonFormatter(BizContext.getMetaRepository());
        String json = formatter.toJson(bills, fullname, true).toString();
        return new RuleExecuteResult((Object)json);
    }
}

