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
 *  com.yonyoucloud.upc.pc.product.Product
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.product.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;

@Component(value="brandRefFilter")
public class BrandRefFilter
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        RefEntity refEntity = billDataDto.getRefEntity();
        List data = (List)billDataDto.getData();
        if (data == null || data.size() == 0) {
            return new RuleExecuteResult();
        }
        Product product = (Product)data.get(0);
        if ("pc_brandref".equals(refEntity.refType) && product.getProductTemplate() != null) {
            FilterVO gridFilter = billDataDto.getCondition();
            if (gridFilter == null) {
                gridFilter = new FilterVO();
            }
            QuerySchema schema = QuerySchema.create().addSelect("brand").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq((Object)product.getProductTemplate())}));
            List tplBrands = MetaDaoHelper.query((String)"pc.tpl.ProductTplBrand", (QuerySchema)schema);
            ArrayList brandIds = new ArrayList();
            tplBrands.stream().forEach(e -> brandIds.add((Long)e.get("brand")));
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "in", brandIds)});
            billDataDto.setCondition(gridFilter);
            this.putParam(map, billDataDto);
        }
        return new RuleExecuteResult();
    }
}

