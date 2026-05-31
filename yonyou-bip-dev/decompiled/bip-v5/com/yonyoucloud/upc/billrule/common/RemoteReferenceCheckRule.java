/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.common;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.datarule.DataConsumerProxy;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="remoteReferenceCheck")
public class RemoteReferenceCheckRule
extends AbstractCommonRule {
    @Autowired
    private DataConsumerProxy consumerProxy;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        return new RuleExecuteResult();
    }
}

