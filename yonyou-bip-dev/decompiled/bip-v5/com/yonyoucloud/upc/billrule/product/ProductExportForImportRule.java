/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.material.service.ProductExportDataDealService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
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

import com.yonyou.iuap.apdoc.coredoc.material.service.ProductExportDataDealService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
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

@Component(value="productExportForImportRule")
public class ProductExportForImportRule
extends AbstractCommonRule {
    @Autowired
    private ProductExportDataDealService dealDataService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        if (paramMap.get("return") == null) {
            return new RuleExecuteResult();
        }
        Map detailData = (Map)paramMap.get("return");
        this.dealDataService.dealDecimalData(detailData, true);
        this.dealDataService.dealBusinessData(detailData);
        if (detailData.get("productAssistUnitExchanges") != null) {
            this.dealDataService.dealAssistUnit(detailData);
        }
        if (detailData.get("productTags") != null) {
            this.dealDataService.dealProductTags(detailData);
        }
        if (detailData.get("productLoadWays") != null) {
            this.dealDataService.dealProductLoadWay(detailData);
        }
        if (detailData.get("productAssistClasses") != null) {
            this.dealDataService.dealAssistClasses(detailData);
        }
        if (detailData.get("productBarCodes") != null) {
            this.dealDataService.dealBarCodes(detailData);
        }
        if (detailData.get("productSpecFrees") != null) {
            this.dealDataService.dealProductCheckFrees(detailData);
        }
        Map externalData = (Map)billDataDto.getExternalData();
        if (detailData.get("id") != null && (externalData.get("exportMode") == null || "2".equals(externalData.get("exportMode").toString()))) {
            detailData.put("productAttachment_fileName", detailData.get("id").toString());
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)detailData.get("id").toString())});
            QuerySchema productSchema = QuerySchema.create().addSelect("id,imgBusinessId,videoBusinessId,homepageBusinessId").addCondition((ConditionExpression)condition);
            List productList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)productSchema);
            if (!CollectionUtils.isEmpty((Collection)productList)) {
                Map productMap = (Map)productList.get(0);
                if (productMap.get("homepageBusinessId") != null) {
                    detailData.put("productHomeAlbums_imgName", productMap.get("homepageBusinessId").toString());
                }
                if (productMap.get("imgBusinessId") != null) {
                    detailData.put("productAlbums_imgName", productMap.get("imgBusinessId").toString());
                }
                if (productMap.get("videoBusinessId") != null) {
                    detailData.put("productVideo_fileName", productMap.get("videoBusinessId").toString());
                }
            }
        }
        return new RuleExecuteResult();
    }
}

