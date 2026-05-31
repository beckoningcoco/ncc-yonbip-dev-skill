/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.unit.Unit
 *  com.yonyoucloud.upc.pc.unit.UnitGroup
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.unit;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.billrule.unit.UnitUtils;
import com.yonyoucloud.upc.cache.BizCache;
import com.yonyoucloud.upc.pc.unit.Unit;
import com.yonyoucloud.upc.pc.unit.UnitGroup;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="unitImportCheckRule")
public class UnitImportCheckRule
extends AbstractCommonRule {
    @Autowired
    BizCache cache;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, map);
        UnitGroup unitGroup = (UnitGroup)bills.get(0);
        List units = unitGroup.units();
        if (units != null && unitGroup.size() > 0) {
            UnitUtils.getInstance().checkUniqueData(units);
            for (Unit unit : units) {
                UnitUtils.getInstance().checkUnitData(unit);
                UnitUtils.getInstance().cleanUnitCache(this.cache);
            }
        }
        return new RuleExecuteResult();
    }
}

