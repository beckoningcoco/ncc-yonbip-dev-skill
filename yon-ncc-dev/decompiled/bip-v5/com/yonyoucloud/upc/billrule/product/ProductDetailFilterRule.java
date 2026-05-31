/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.utils.ToolUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import com.yonyoucloud.upc.service.ProductSkuAsyncSaveService;
import com.yonyoucloud.upc.utils.ToolUtils;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component(value="productDetailFilterRule")
public class ProductDetailFilterRule
extends AbstractCommonRule {
    @Autowired
    private IUPCProductQueryService upcProductQueryService;
    @Autowired
    ProductSkuAsyncSaveService productSkuAsyncSaveService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        billContext.setRowAuthControled(true);
        BillDataDto bill = (BillDataDto)paramMap.get("param");
        Map mapCondition = bill.getMapCondition();
        Long productApplyRangeId = null;
        if (null != mapCondition && null != mapCondition.get("@productApplyRangeId") && StringUtils.hasText((String)mapCondition.get("@productApplyRangeId").toString())) {
            productApplyRangeId = Long.parseLong(mapCondition.get("@productApplyRangeId").toString());
        }
        if (!StringUtils.hasText((String)bill.getId()) || !ToolUtils.isNumber((String)bill.getId())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_QUERY_ID_IS_NULL);
        }
        Map<String, Object> params = this.upcProductQueryService.SetParams(Long.valueOf(bill.getId()), productApplyRangeId, null, null, null);
        billContext.setMasterOrgField("productApplyRange.orgId");
        billContext.setContext(params);
        this.productSkuAsyncSaveService.setModifySchemaBySkuAsync(mapCondition, billContext);
        return new RuleExecuteResult();
    }
}

