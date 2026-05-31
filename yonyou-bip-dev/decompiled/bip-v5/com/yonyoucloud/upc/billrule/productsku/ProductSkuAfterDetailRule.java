/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.SkuOrgFieldEnum
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.productsku;

import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IProductApiService;
import com.yonyoucloud.upc.pc.product.SkuOrgFieldEnum;
import com.yonyoucloud.upc.service.ProductSkuAsyncSaveService;
import com.yonyoucloud.upc.service.ProductSkuDetailSaveService;
import com.yonyoucloud.upc.service.ProductSkuService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="productSkuAfterDetailRule")
public class ProductSkuAfterDetailRule
extends AbstractCommonRule {
    @Autowired
    ProductSkuAsyncSaveService productSkuAsyncSaveService;
    @Autowired
    ProductSkuDetailSaveService productSkuDetailSaveService;
    @Autowired
    IProductApiService productApiService;
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    PubOptionService pubOptionService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        Object productId;
        Object productId_productTemplate;
        BillDataDto bill = (BillDataDto)paramMap.get("param");
        Map mapCondition = bill.getMapCondition();
        boolean isApplied = mapCondition.containsKey("isApplied") ? BooleanUtil.isTrue(mapCondition.get("isApplied")) : BooleanUtil.isTrue(billContext.getContext().get("isApplied"));
        Map sku = (Map)paramMap.get("return");
        if (!isApplied) {
            this.dealSkuOrgField(sku);
        }
        if (null != (productId_productTemplate = sku.get("productId_productTemplate"))) {
            Map tpl = this.productApiService.getTemplateData(Long.parseLong(productId_productTemplate.toString()));
            sku.put("tplData", tpl);
        }
        if (null != (productId = sku.get("productId"))) {
            sku.put("units", this.productSkuDetailSaveService.getUnitByProductId(productId, sku));
        }
        sku.put(PubOptionService.DEFAULTSKU_CANEDIT_CODE, this.pubOptionService.getDefaultSkuCanEditCode());
        return null;
    }

    private void dealSkuOrgField(Map sku) {
        SkuOrgFieldEnum.dealSkuOrgFieldNew((Map)sku);
    }
}

