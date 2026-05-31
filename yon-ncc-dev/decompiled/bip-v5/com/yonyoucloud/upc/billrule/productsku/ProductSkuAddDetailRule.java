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
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.productsku;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.service.ProductSkuAsyncSaveService;
import com.yonyoucloud.upc.service.ProductSkuService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productSkuAddDetailRule")
public class ProductSkuAddDetailRule
extends AbstractCommonRule {
    public static final String DETAIL_ID_PARAM = "@productDetailId";
    public static final String RANGE_ID_PARAM = "@productApplyRangeId";
    @Autowired
    ProductSkuAsyncSaveService productSkuAsyncSaveService;
    @Autowired
    ProductSkuService productSkuService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto bill = (BillDataDto)paramMap.get("param");
        Map mapCondition = bill.getMapCondition();
        this.productSkuAsyncSaveService.setModifySchemaBySkuAsync(mapCondition, billContext);
        Map context = billContext.getContext();
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)bill.getId()), QueryCondition.name((String)"isCreator").eq((Object)true)});
        QuerySchema schema = QuerySchema.create().addSelect("id, productDetailId").addCondition((ConditionExpression)queryConditionGroup);
        List ranges = this.productSkuService.query("pc.product.ProductApplyRange", schema);
        if (CollectionUtils.isEmpty((Collection)ranges)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CREATE_USER_NOT_FOUND, new Object[]{bill.getId()});
        }
        context.put(DETAIL_ID_PARAM, ((ProductApplyRange)ranges.get(0)).getProductDetailId());
        context.put(RANGE_ID_PARAM, ((ProductApplyRange)ranges.get(0)).getId());
        return null;
    }
}

