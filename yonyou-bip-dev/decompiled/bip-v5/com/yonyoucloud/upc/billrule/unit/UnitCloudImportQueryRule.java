/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.QueryPagerVo
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryPager
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.unit;

import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.QueryPagerVo;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.ArrayList;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryPager;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;

@Component(value="unitCloudImportQueryRule")
public class UnitCloudImportQueryRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        FilterCommonVO[] commonVOs;
        QueryPagerVo page0;
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        String ids = billDataDto.getIds();
        QueryPager page = null;
        if (billDataDto != null && null != (page0 = billDataDto.getPage())) {
            page = page0.toQueryPager();
        }
        ArrayList<QueryCondition> conditionExpressions = new ArrayList<QueryCondition>();
        if (ids == null) {
            conditionExpressions.add(QueryCondition.name((String)"tenant").eq((Object)0));
        } else {
            conditionExpressions.add(QueryCondition.name((String)"tenant").eq((Object)0));
            conditionExpressions.add(QueryCondition.name((String)"unitGroup").eq((Object)ids));
        }
        FilterVO condition = billDataDto.getCondition();
        for (FilterCommonVO fcv : commonVOs = condition.getCommonVOs()) {
            Object value1;
            String itemName = fcv.getItemName();
            if (!"code".equals(itemName) && !"name".equals(itemName) || (value1 = fcv.getValue1()) == null) continue;
            conditionExpressions.add(QueryCondition.name((String)itemName).like(value1));
        }
        ConditionExpression[] ces = new ConditionExpression[conditionExpressions.size()];
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])conditionExpressions.toArray(ces));
        QuerySchema querySchema = new QuerySchema();
        querySchema.setPartitionable(false);
        querySchema.addSelect("*, unitGroup.name").fullname("pc.unit.Unit").queryConditionGroup(queryConditionGroup);
        querySchema.pager(page);
        Pager pager = MetaDaoHelper.queryByPage((String)billContext.getFullname(), (QuerySchema)querySchema);
        this.putParam(paramMap, "return", pager);
        RuleExecuteResult ruleResult = new RuleExecuteResult((Object)pager);
        ruleResult.setCancel(true);
        return ruleResult;
    }
}

