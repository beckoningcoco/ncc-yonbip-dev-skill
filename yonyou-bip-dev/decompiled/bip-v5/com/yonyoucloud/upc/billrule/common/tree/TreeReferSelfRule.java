/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.apache.commons.collections4.CollectionUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.common.tree;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.collections4.CollectionUtils;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;

@Component(value="treeReferSelfRule")
public class TreeReferSelfRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        Map data;
        Object id;
        List clss;
        Object o;
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        FilterVO gridFilter = billDataDto.getTreeCondition();
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        Object v0 = o = CollectionUtils.size((Object)(clss = (List)billDataDto.getData())) > 0 ? clss.get(0) : null;
        if (o != null && (id = (data = (Map)o).get("id")) != null) {
            String fullname = billContext.getFullname();
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "nin", this.getNodeWithChildren(Long.parseLong(id.toString()), fullname))});
        }
        billDataDto.setTreeCondition(gridFilter);
        this.putParam(paramMap, billDataDto);
        return new RuleExecuteResult();
    }

    private List<Long> getNodeWithChildren(Long id, String fullname) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"path").like((Object)String.format("%s|", id))});
        List data = MetaDaoHelper.query((String)fullname, (QuerySchema)schema);
        return data.stream().map(m -> (Long)m.get("id")).collect(Collectors.toList());
    }
}

