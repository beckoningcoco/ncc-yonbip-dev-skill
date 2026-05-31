/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.productsku;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.service.ProductSkuDetailSaveService;
import java.util.HashMap;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="productSkuDetailFilterRule")
public class ProductSkuDetailFilterRule
extends AbstractCommonRule {
    @Autowired
    ProductSkuDetailSaveService productSkuDetailSaveService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        billContext.setRowAuthControled(true);
        BillDataDto bill = (BillDataDto)paramMap.get("param");
        Map mapCondition = bill.getMapCondition();
        if (bill.getId() != null) {
            String[] composeIds = bill.getId().replace("composeIds:", "").replace("'", "").split("_");
            if (composeIds.length == 2) {
                bill.setId(composeIds[0]);
                mapCondition = bill.getMapCondition() != null ? bill.getMapCondition() : new HashMap();
                mapCondition.put("@productApplyRangeId", composeIds[1]);
                bill.setMapCondition(mapCondition);
            }
            bill.setIds(null);
        }
        if (null != mapCondition) {
            if (null == mapCondition.get("@productApplyRangeId")) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_RANGE_ID_IS_NULL);
            }
        } else {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_RANGE_ID_IS_NULL);
        }
        Map range = this.productSkuDetailSaveService.getRange(mapCondition.get("@productApplyRangeId"));
        Map context = billContext.getContext();
        context.put("@productApplyRangeId", range.get("id"));
        context.put("@productDetailId", range.get("productDetailId"));
        context.put("isCreator", range.get("isCreator"));
        context.put("isApplied", range.get("isApplied"));
        billContext.setMasterOrgField("productApplyRange.orgId");
        FilterVO gridFilter = bill.getCondition();
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("productId.productApplyRange.productDetailId.productSkuDetailNew.productApplyRangeId", "eq", mapCondition.get("@productApplyRangeId"))});
        return new RuleExecuteResult();
    }
}

