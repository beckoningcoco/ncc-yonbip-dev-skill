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
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.apache.commons.collections4.CollectionUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.base.BizObject
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls;

import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.billrule.cls.ProductClsUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.CollectionUtils;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.base.BizObject;
import org.springframework.stereotype.Component;

@Component(value="productClassReferRule")
public class ProductClassReferRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List products;
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        RefEntity refEntity = billDataDto.getRefEntity();
        String billnum = billDataDto.getBillnum();
        FilterVO gridFilter = billDataDto.getTreeCondition();
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        BizObject bizObject = null;
        Object orgId = null;
        Object id = null;
        if (billDataDto.getData() != null && !CollectionUtils.isEmpty((Collection)(products = (List)billDataDto.getData())) && (bizObject = (BizObject)products.get(0)).containsKey((Object)"id") && bizObject.get("id") != null) {
            id = bizObject.get("id");
        }
        if ("pc_product".equalsIgnoreCase(billnum) && "pc_managementclassref".equalsIgnoreCase(refEntity.refType)) {
            return new RuleExecuteResult();
        }
        if ("pc_managementclass".equalsIgnoreCase(billnum) && "pc_managementclassref".equalsIgnoreCase(refEntity.refType)) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("level", "lt", (Object)8)});
            if (id != null) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "nin", ProductClsUtils.getInstance().getNodeWithChildren(Long.parseLong(id.toString()), "pc.cls.ManagementClass"))});
            }
        }
        if ("pc_presentationclass".equalsIgnoreCase(billnum) && "pc_presentationclassref".equalsIgnoreCase(refEntity.refType)) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("level", "lt", (Object)3)});
            if (id != null) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "nin", ProductClsUtils.getInstance().getNodeWithChildren(Long.parseLong(id.toString()), "pc.cls.PresentationClass"))});
            }
        }
        billDataDto.setTreeCondition(gridFilter);
        this.putParam(paramMap, billDataDto);
        return new RuleExecuteResult();
    }
}

