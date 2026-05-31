/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.manage.MaterialStatus
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.materialLifeCycle;

import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.manage.MaterialStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component(value="materialStatusAfterSaveQueryRule")
public class MaterialStatusAfterSaveQueryRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        MaterialStatus materialStatus = (MaterialStatus)bills.get(0);
        if (materialStatus.containsKey((Object)"_fromApi") && materialStatus.get("_fromApi").equals(true)) {
            return new RuleExecuteResult();
        }
        ArrayList materialStatusMapList = (ArrayList)((BillDataDto)paramMap.get("param")).getData();
        if (null != materialStatusMapList && !materialStatusMapList.isEmpty() && null != ((Map)materialStatusMapList.get(0)).get("stopstatus")) {
            int trunValue = BooleanUtil.isTrue(((Map)materialStatusMapList.get(0)).get("stopstatus")) ? 1 : 0;
            ((Map)materialStatusMapList.get(0)).replace("stopstatus", trunValue);
        }
        return new RuleExecuteResult();
    }
}

