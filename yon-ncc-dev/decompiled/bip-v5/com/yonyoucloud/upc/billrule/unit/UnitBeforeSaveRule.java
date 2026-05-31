/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.unit.Unit
 *  org.imeta.orm.base.BizObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.unit;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.billrule.unit.UnitUtils;
import com.yonyoucloud.upc.cache.BizCache;
import com.yonyoucloud.upc.pc.unit.Unit;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="unitBeforeSaveRule")
public class UnitBeforeSaveRule
extends AbstractCommonRule {
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    BizCache cache;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, map);
        Unit unit = (Unit)bills.get(0);
        if (unit.getStopstatus() != null && !unit.getStopstatus().booleanValue()) {
            unit.setStoptime(null);
        }
        this.unitSetEn_name(unit);
        UnitUtils.getInstance().dealgroupdata(unit);
        UnitUtils.getInstance().checkUnitData(unit);
        List rows = MetaDaoHelper.queryById((String)"pc.unit.UnitGroup", (String)"*", (Object)unit.getUnitGroup());
        if (rows != null && rows.size() > 0) {
            boolean stopstatus = (Boolean)((Map)rows.get(0)).get("stopstatus");
            Boolean unitStopstatus = unit.getStopstatus();
            if (stopstatus && !unitStopstatus.booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800018);
            }
        }
        UnitUtils.getInstance().cleanUnitCache(this.cache);
        return new RuleExecuteResult();
    }

    private void unitSetEn_name(Unit unit) {
        if (unit != null && unit.get("name") != null && !(unit.get("name") instanceof String) && ((BizObject)unit.get("name")).containsKey((Object)"en_US")) {
            BizObject bizName = (BizObject)unit.get("name");
            unit.setEnName((String)bizName.get("en_US"));
        }
    }
}

