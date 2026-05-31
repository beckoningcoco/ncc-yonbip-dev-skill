/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productDistinctRefRule")
public class ProductDistinctRefRule
extends AbstractCommonRule {
    @Autowired
    private IUPCControlRuleService upcControlRuleService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List<String> orgids;
        QueryConditionGroup conditionGroup;
        FilterVO gridFilterVO;
        if (null == billContext) {
            return new RuleExecuteResult();
        }
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (billDataDto == null) {
            billDataDto = new BillDataDto();
        }
        if ((gridFilterVO = billDataDto.getCondition()) == null) {
            gridFilterVO = new FilterVO();
        }
        if ((conditionGroup = gridFilterVO.getQueryConditionGroup()) == null) {
            conditionGroup = new QueryConditionGroup();
        }
        if (CollectionUtils.isEmpty(orgids = this.upcControlRuleService.getOrgPermissions(billDataDto.getBillnum()))) {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"1").eq((Object)2)});
            conditionGroup.appendCondition(new ConditionExpression[]{queryConditionGroup});
        } else {
            QueryConditionGroup orgconditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").in(orgids)});
            QuerySchema querySchema = QuerySchema.create().addSelect("productId").addCondition((ConditionExpression)orgconditionGroup);
            List productidmaplist = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)querySchema, (String)"productcenter");
            List productids = productidmaplist.stream().map(p -> String.valueOf(p.get("productId"))).collect(Collectors.toList());
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productids)});
            conditionGroup.appendCondition(new ConditionExpression[]{queryConditionGroup});
        }
        gridFilterVO.setQueryConditionGroup(conditionGroup);
        billDataDto.setCondition(gridFilterVO);
        this.putParam(map, billDataDto);
        return new RuleExecuteResult();
    }
}

