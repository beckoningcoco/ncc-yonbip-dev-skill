/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.pc.product.ProductAttributeEnum
 *  com.yonyoucloud.upc.pc.product.RealProductAttributeTypeEnum
 *  com.yonyoucloud.upc.pc.product.VirtualProductAttributeEnum
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.productsku;

import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.pc.product.ProductAttributeEnum;
import com.yonyoucloud.upc.pc.product.RealProductAttributeTypeEnum;
import com.yonyoucloud.upc.pc.product.VirtualProductAttributeEnum;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.springframework.stereotype.Component;

@Component(value="productSkuAddRefFilter")
public class ProductSkuAddRefFilter
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        RefEntity refEntity = billDataDto.getRefEntity();
        if ("pc_nomalproductref".equals(refEntity.refType)) {
            UserType userType;
            LoginUser user = AppContext.getCurrentUser();
            FilterVO gridFilter = billDataDto.getCondition();
            if (gridFilter == null) {
                gridFilter = new FilterVO();
            }
            if (UserType.ShopAdminUser == (userType = user.getUserType()) || UserType.ShopUser == userType) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("shop", "eq", user.get("shop"))});
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("creatorType", "eq", (Object)"3")});
            }
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("useSku", "eq", (Object)"1")});
            QueryConditionGroup queryConditionGroup = gridFilter.getQueryConditionGroup();
            if (null == queryConditionGroup) {
                queryConditionGroup = new QueryConditionGroup();
                gridFilter.setQueryConditionGroup(queryConditionGroup);
            }
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"realProductAttribute").eq((Object)ProductAttributeEnum.Real.getValue()), QueryCondition.name((String)"realProductAttributeType").in(new Object[]{RealProductAttributeTypeEnum.PhysicalMaterials.getValue(), RealProductAttributeTypeEnum.Equipment.getValue()})});
            QueryConditionGroup condition2 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"realProductAttribute").eq((Object)ProductAttributeEnum.Virtual.getValue()), QueryCondition.name((String)"virtualProductAttribute").in(new Object[]{VirtualProductAttributeEnum.TaoJian.getValue(), VirtualProductAttributeEnum.Other.getValue(), VirtualProductAttributeEnum.Service.getValue(), VirtualProductAttributeEnum.PTO.getValue()})});
            QueryConditionGroup allGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{condition, condition2});
            queryConditionGroup.appendCondition(new ConditionExpression[]{allGroup});
            billDataDto.setCondition(gridFilter);
            this.putParam(map, billDataDto);
        }
        return new RuleExecuteResult();
    }
}

