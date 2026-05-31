/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.ref;

import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="dealBillResgitDataRule")
public class DealBillResgitDataRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        Object aReturn = this.getParam(map, "return");
        if (aReturn != null && aReturn instanceof Pager) {
            Pager pager = (Pager)aReturn;
            this.dealCode(pager);
        }
        return null;
    }

    private void dealCode(Pager pager) {
        List recordList = pager.getRecordList();
        if (!CollectionUtils.isEmpty((Collection)recordList)) {
            for (Map data : recordList) {
                Object code = data.get("code");
                if (code == null) continue;
                String[] domainAndCodes = code.toString().split("&");
                String domainAndCode = domainAndCodes[0];
                if (domainAndCode.indexOf(".") != -1) {
                    String[] split = domainAndCode.split("\\.");
                    data.put("code", split[1]);
                    continue;
                }
                data.put("code", domainAndCodes[0]);
            }
        }
    }
}

