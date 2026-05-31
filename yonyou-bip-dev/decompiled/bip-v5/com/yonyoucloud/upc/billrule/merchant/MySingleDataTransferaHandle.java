/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.poi.context.ImportContext
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.annotation.FlowOrderAnnotation
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.ForwardingPipeline
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.SingleDataHandleCommand
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.SinglePipelineContext
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.ucf.mdd.ext.poi.context.ImportContext;
import com.yonyou.ucf.mdd.ext.poi.importbiz.annotation.FlowOrderAnnotation;
import com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.ForwardingPipeline;
import com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.SingleDataHandleCommand;
import com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.SinglePipelineContext;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="mySingleDataTransferaHandle")
@FlowOrderAnnotation(order=210)
public class MySingleDataTransferaHandle
extends ForwardingPipeline<SinglePipelineContext>
implements SingleDataHandleCommand {
    public static final String MY_SINGLE_DATA_TRANSFER_HANDLE_NAME = "mySingleDataTransferaHandle";

    public void process(SinglePipelineContext singlePipelineContext) throws Exception {
        List invoicingCustomerss;
        Map data;
        ImportContext importContext = singlePipelineContext.getImportContext();
        if (("aa_merchant".equals(importContext.getBillno()) || "aa_merchantexport".equals(importContext.getBillno())) && !(data = singlePipelineContext.getData()).isEmpty() && !CollectionUtils.isEmpty((Collection)(invoicingCustomerss = (List)data.get("invoicingCustomerss")))) {
            for (Map invoicingCustomers : invoicingCustomerss) {
                if (!data.get("code").equals(invoicingCustomers.get("invoicingCustomersId_code"))) continue;
                invoicingCustomers.remove("__errorMessage");
                invoicingCustomers.remove("skipErrorMessage");
            }
        }
    }
}

