/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.customertrade.CustomerTrade
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.customertrade;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.customertrade.CustomerTrade;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(value="customerTradeSynchroStatusRule")
public class SynchroStatusRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(SynchroStatusRule.class);

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        String billnum = billContext.getBillnum();
        if ("aa_customertrade".equalsIgnoreCase(billnum)) {
            Object data = billDataDto.getData();
            CustomerTrade trade = null;
            if (data instanceof Map) {
                trade = (CustomerTrade)data;
            }
            if (data instanceof List) {
                List l = (List)data;
                trade = (CustomerTrade)l.get(0);
            }
            if (null != trade && null == trade.getStopstatus() && null == trade.getIsEnabled()) {
                trade.setStopstatus(Boolean.valueOf(false));
                trade.setIsEnabled(Boolean.valueOf(true));
            } else if (null == trade.getStopstatus()) {
                trade.setStopstatus(Boolean.valueOf(trade.getIsEnabled() == false));
            } else {
                trade.setIsEnabled(Boolean.valueOf(trade.getStopstatus() == false));
            }
            log.info("===========>" + trade.getIsEnabled() + "--" + trade.getStopstatus());
        }
        return null;
    }
}

