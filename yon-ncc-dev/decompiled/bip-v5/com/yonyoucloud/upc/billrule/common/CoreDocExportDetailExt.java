/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.yonbip.iuap.xport.export.extension.ExportDetailQueryParamBuildExtension
 *  com.yonyou.yonbip.iuap.xport.mdd.export.web.MddExcelExportActionRequest
 *  org.apache.commons.collections4.CollectionUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.common;

import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.yonbip.iuap.xport.export.extension.ExportDetailQueryParamBuildExtension;
import com.yonyou.yonbip.iuap.xport.mdd.export.web.MddExcelExportActionRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.CollectionUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CoreDocExportDetailExt
implements ExportDetailQueryParamBuildExtension<MddExcelExportActionRequest> {
    private static final Logger log = LoggerFactory.getLogger(CoreDocExportDetailExt.class);

    public MddExcelExportActionRequest buildDetailQueryParamWithRelatedData(MddExcelExportActionRequest clonedBillData, Map<String, Object> mainTableData) {
        BillDataDto billDataDto = clonedBillData.getBill();
        if (mainTableData.get("id") != null) {
            billDataDto.setId(mainTableData.get("id").toString());
            if ("pc_productdetail_import".equals(clonedBillData.getBillNo())) {
                this.productDetailBuildDetailQueryParamWithRelatedData(billDataDto, mainTableData);
            } else if ("aa_merchant_export_range".equals(clonedBillData.getBillNo()) || "aa_merchantdetail".equals(clonedBillData.getBillNo()) || "aa_merchant_export_range".equals(clonedBillData.getBillNo())) {
                this.merchantRangeBuildDetailQueryParamWithRelatedData(billDataDto, mainTableData);
            } else if ("pc_productsku_edit".equals(clonedBillData.getBillNo())) {
                this.skuDetailBuildQueryParam(billDataDto, mainTableData);
            }
        }
        return clonedBillData;
    }

    private void skuDetailBuildQueryParam(BillDataDto billDataDto, Map<String, Object> mainTableData) {
        if (mainTableData.get("productApplyRangeId") != null) {
            Map mapCondition = billDataDto.getMapCondition() != null ? billDataDto.getMapCondition() : new HashMap();
            mapCondition.put("@productApplyRangeId", mainTableData.get("productApplyRangeId").toString());
            billDataDto.setMapCondition(mapCondition);
        }
    }

    private void productDetailBuildDetailQueryParamWithRelatedData(BillDataDto billDataDto, Map<String, Object> mainTableData) {
        String productApplyRangeId = null;
        if (mainTableData.get("detail!productApplyRangeId") != null || mainTableData.get("productApplyRangeId") != null) {
            productApplyRangeId = mainTableData.get("detail!productApplyRangeId") != null ? mainTableData.get("detail!productApplyRangeId").toString() : mainTableData.get("productApplyRangeId").toString();
        } else if (mainTableData.get("productApplyRange_OrgId") != null || mainTableData.get("productApplyRange_orgId") != null) {
            try {
                String orgId = mainTableData.get("productApplyRange_OrgId") != null ? mainTableData.get("productApplyRange_OrgId").toString() : mainTableData.get("productApplyRange_orgId").toString();
                QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").eq((Object)Long.valueOf(mainTableData.get("id").toString())));
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq((Object)orgId));
                QuerySchema schema = QuerySchema.create().addSelect("id,productId,orgId,isApplied,isCreator").addCondition((ConditionExpression)queryConditionGroup);
                List productApplyRanges = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
                if (CollectionUtils.isNotEmpty((Collection)productApplyRanges)) {
                    productApplyRangeId = ((Map)productApplyRanges.get(0)).get("id").toString();
                }
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080535", (String)"\u7269\u6599\u4f7f\u7528\u4fe1\u606f\u66f4\u65b0\u5bfc\u51fa\u62fc\u63a5\u53c2\u6570\u51fa\u9519\uff0c\u62a5\u9519\u4fe1\u606f\uff1a") + e.getMessage(), (Throwable)e);
            }
        } else {
            return;
        }
        HashMap<String, String> mapCondition = billDataDto.getMapCondition();
        if (mapCondition == null) {
            mapCondition = new HashMap<String, String>();
        }
        mapCondition.put("@productApplyRangeId", productApplyRangeId);
        billDataDto.setMapCondition(mapCondition);
    }

    private void merchantRangeBuildDetailQueryParamWithRelatedData(BillDataDto billDataDto, Map<String, Object> mainTableData) {
        if (mainTableData.get("merchantApplyRangeId") != null) {
            HashMap<String, String> mapCondition = billDataDto.getMapCondition();
            if (mapCondition == null) {
                mapCondition = new HashMap<String, String>();
            }
            mapCondition.put("@merchantApplyRangeId", mainTableData.get("merchantApplyRangeId").toString());
            billDataDto.setMapCondition(mapCondition);
        }
    }

    public String buildUniqueKeysForSelect(@NotNull MddExcelExportActionRequest actionRequest, @NotNull String mainTableData) {
        if (("aa_merchant".equals(actionRequest.getBillNo()) || "aa_merchantdetail".equals(actionRequest.getBillNo()) || "aa_merchant_export_range".equals(actionRequest.getBillNo())) && actionRequest.getBill() != null && actionRequest.getBill().getMapCondition() != null) {
            Map mapCondition = actionRequest.getBill().getMapCondition();
            String[] merchantRangeid = mapCondition.get("@merchantApplyRangeIds").toString().split(",");
            int index = Integer.parseInt(String.valueOf(mapCondition.get("index")));
            return String.valueOf(mainTableData) + "_" + String.valueOf(merchantRangeid[index]);
        }
        return super.buildUniqueKeysForSelect((Object)actionRequest, mainTableData);
    }

    public String buildUniqueKeysForConditionQuery(@NotNull MddExcelExportActionRequest actionRequest, @NotNull Map<String, Object> mainTableData, String keyAttribute) {
        if ("pc_productdetail_import".equals(actionRequest.getBillNo())) {
            return String.valueOf(mainTableData.get("id")) + "_" + String.valueOf(mainTableData.get("productApplyRange_orgId"));
        }
        if ("aa_merchant".equals(actionRequest.getBillNo()) || "aa_merchant_export_range".equals(actionRequest.getBillNo()) || "aa_merchantdetail".equals(actionRequest.getBillNo())) {
            return String.valueOf(mainTableData.get("id")) + "_" + String.valueOf(mainTableData.get("merchantApplyRangeId"));
        }
        return super.buildUniqueKeysForConditionQuery((Object)actionRequest, mainTableData, keyAttribute);
    }
}

