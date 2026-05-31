/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.core.model.Entity
 *  org.imeta.orm.base.BizObject
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.areaclass;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.core.model.Entity;
import org.imeta.orm.base.BizObject;
import org.springframework.stereotype.Component;

@Component(value="unStopAreaBillRule")
public class UnStopAreaBillRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        try {
            for (BizObject bill : bills) {
                HashMap<String, Object> params = new HashMap<String, Object>();
                Entity entity = MetaDaoHelper.getEntity((String)billContext.getFullname());
                params.put("stopstatus", true);
                params.put("id", bill.getId());
                params.put("tableName", entity.getMainTableName());
                SqlHelper.update((String)"com.yonyoucloud.uretail.bill.dao.AreaBillRuleDao.unStopAreaTree", params);
            }
        }
        catch (Exception zr) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_CONCURRENT_ERROR);
        }
        this.putParam(paramMap, "isHoldNull", true);
        return new RuleExecuteResult();
    }
}

