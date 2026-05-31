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
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
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
import com.yonyoucloud.upc.pc.unit.Unit;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;

@Component(value="checkPrecisionRule")
public class CheckPrecisionRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        Object data = billDataDto.getData();
        Unit unit = null;
        if (data instanceof Map) {
            unit = (Unit)data;
        }
        if (data instanceof List) {
            List list = (List)data;
            unit = (Unit)list.get(0);
        }
        this.checkStatus((Map<String, Object>)unit);
        return null;
    }

    private void checkStatus(Map<String, Object> unit) throws Exception {
        QuerySchema schema;
        List query;
        if (unit != null && unit.get("id") != null && (query = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)(schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"unit").eq(unit.get("id")), QueryCondition.name((String)"productAssistUnitExchanges.assistUnit").eq(unit.get("id"))}))))) != null && query.size() > 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800001);
        }
    }
}

