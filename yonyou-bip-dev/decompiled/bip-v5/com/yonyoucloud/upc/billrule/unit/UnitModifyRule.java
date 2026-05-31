/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.modifyFields.ModifyFieldUnit
 *  com.yonyoucloud.upc.pc.unit.Unit
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.unit;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.modifyFields.ModifyFieldUnit;
import com.yonyoucloud.upc.pc.unit.Unit;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="unitModifyRule")
public class UnitModifyRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(UnitModifyRule.class);

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List bills = this.getBills(billContext, map);
        ModifyFieldUnit modifyFieldUnit = (ModifyFieldUnit)bills.get(0);
        String unitIds = modifyFieldUnit.getUnit();
        List<String> unitIdList = Arrays.asList(unitIds.split(","));
        String reason = null;
        if (modifyFieldUnit.getModifyPrecisionValue() > 8 || modifyFieldUnit.getModifyPrecisionValue() < 0) {
            reason = "\u7cbe\u5ea6\u9519\u8bef\uff01";
            modifyFieldUnit.setReason(reason);
            return new RuleExecuteResult();
        }
        if (!CollectionUtils.isEmpty(unitIdList)) {
            try {
                for (String unitId : unitIdList) {
                    if (unitId == null || unitId.length() <= 0) continue;
                    Long id = Long.valueOf(unitId);
                    RobotExecutors.runAs((String)modifyFieldUnit.getModifyYtenant(), () -> this.updateUnit(id, modifyFieldUnit.getModifyPrecisionValue()));
                }
                reason = "Success!";
            }
            catch (Exception e) {
                reason = e.getMessage() + "Exception!";
                log.error("\u7cbe\u5ea6\u4fee\u6539\u5931\u8d25\uff1a" + e.getMessage(), (Throwable)e);
            }
        } else {
            reason = "\u8ba1\u91cf\u5355\u4f4did\u9519\u8bef!";
        }
        modifyFieldUnit.setReason(reason);
        return new RuleExecuteResult();
    }

    private Boolean updateUnit(Long id, int modifyPrecision) throws Exception {
        Unit unit = new Unit();
        unit.setEntityStatus(EntityStatus.Update);
        unit.setId((Object)id);
        unit.setPrecision(Integer.valueOf(modifyPrecision));
        MetaDaoHelper.update((String)"pc.unit.Unit", (BizObject)unit);
        return true;
    }
}

