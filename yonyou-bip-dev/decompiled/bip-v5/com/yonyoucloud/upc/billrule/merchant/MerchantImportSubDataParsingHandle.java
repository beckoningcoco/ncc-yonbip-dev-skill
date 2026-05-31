/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.poi.context.ImportContext
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.annotation.FlowOrderAnnotation
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.EventPreHandleCommand
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.ForwardingPipeline
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.PreHandleCommand
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.PrePipelineContext
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.UniteEventPreHandleCommand
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.ucf.mdd.ext.poi.context.ImportContext;
import com.yonyou.ucf.mdd.ext.poi.importbiz.annotation.FlowOrderAnnotation;
import com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.EventPreHandleCommand;
import com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.ForwardingPipeline;
import com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.PreHandleCommand;
import com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.PrePipelineContext;
import com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.UniteEventPreHandleCommand;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantImportSubDataParsingHandle")
@FlowOrderAnnotation(order=80)
public class MerchantImportSubDataParsingHandle
extends ForwardingPipeline<PrePipelineContext>
implements PreHandleCommand,
EventPreHandleCommand,
UniteEventPreHandleCommand {
    public static final String MERCHANT_IMPORT_SUB_DATA_PARSING_HANDLE = "merchantImportSubDataParsingHandle";
    public static final String IMPORT_SPECIAL_KEY_MERCHANT = "importSpecialKey_merchant";

    public void process(PrePipelineContext pipelineContext) throws Exception {
        List mapList;
        ImportContext importContext = pipelineContext.getImportContext();
        if ("aa_merchant".equals(importContext.getBillno())) {
            List mapList2 = pipelineContext.getGrandchildren();
            if (!CollectionUtils.isEmpty((Collection)mapList2)) {
                for (Map merchantMap : mapList2) {
                    merchantMap.put(IMPORT_SPECIAL_KEY_MERCHANT, IMPORT_SPECIAL_KEY_MERCHANT);
                    merchantMap.put("aa_merchant", "aa_merchant");
                    merchantMap.put("_fromApi", true);
                }
            }
        } else if ("aa_merchant_export_range".equals(importContext.getBillno())) {
            List mapList3 = pipelineContext.getGrandchildren();
            if (!CollectionUtils.isEmpty((Collection)mapList3)) {
                for (Map merchantMap : mapList3) {
                    merchantMap.put(IMPORT_SPECIAL_KEY_MERCHANT, IMPORT_SPECIAL_KEY_MERCHANT);
                    merchantMap.put("aa_merchant_export_range", "aa_merchant_export_range");
                    merchantMap.put("_fromApi", true);
                    if (!merchantMap.containsKey("merchantAppliedDetailExt")) continue;
                    merchantMap.remove("merchantAppliedDetailExt");
                }
            }
        } else if ("aa_merchantexport".equals(importContext.getBillno()) && !CollectionUtils.isEmpty((Collection)(mapList = pipelineContext.getGrandchildren()))) {
            for (Map merchantMap : mapList) {
                merchantMap.put(IMPORT_SPECIAL_KEY_MERCHANT, IMPORT_SPECIAL_KEY_MERCHANT);
                merchantMap.put("aa_merchantexport", "aa_merchantexport");
                merchantMap.put("_fromApi", true);
                if (!merchantMap.containsKey("merchantAppliedDetailExt")) continue;
                merchantMap.remove("merchantAppliedDetailExt");
            }
        }
        if (importContext.getBillContext() != null && "aa_merchant_export_range".equals(importContext.getBillContext().getBillnum())) {
            importContext.getBillContext().setBillnum("aa_merchant");
        }
    }
}

