/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.cls.PurchaseClass
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls;

import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.cls.PurchaseClass;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;

@Component(value="purchaseClassReferRule")
public class PurchaseClassReferRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        RefEntity refEntity = billDataDto.getRefEntity();
        String billnum = billDataDto.getBillnum();
        FilterVO gridFilter = billDataDto.getTreeCondition();
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        PurchaseClass cls = null;
        if (billDataDto.getData() != null) {
            List clss = (List)billDataDto.getData();
            cls = (PurchaseClass)clss.get(0);
        }
        if ("pc_purchaseclass".equalsIgnoreCase(billnum) && "pc_purchaseclassref".equalsIgnoreCase(refEntity.refType)) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("level", "lt", (Object)8)});
            if (cls != null && cls.getId() != null) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "nin", this.getNodeWithChildren((Long)cls.getId(), "pc.cls.PurchaseClass"))});
            }
            if (cls != null && cls.getOrgId() != null) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("orgId", "eq", (Object)cls.getOrgId())});
            }
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

