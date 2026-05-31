/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.annotation.FlowOrderAnnotation
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.ForwardingPipeline
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.SingleDataHandleCommand
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.SinglePipelineContext
 *  com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.flow.SingleDataBeforeCheck
 *  org.imeta.orm.base.BizObject
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.eventimport;

import com.yonyou.ucf.mdd.ext.poi.importbiz.annotation.FlowOrderAnnotation;
import com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.ForwardingPipeline;
import com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.SingleDataHandleCommand;
import com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.SinglePipelineContext;
import com.yonyou.ucf.mdd.ext.poi.importbiz.pipeline.flow.SingleDataBeforeCheck;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="upcSingleDataBeforeCheck")
@FlowOrderAnnotation(order=100)
public class UpcSingleDataBeforeCheck
extends ForwardingPipeline<SinglePipelineContext>
implements SingleDataHandleCommand {
    private static final Logger log = LoggerFactory.getLogger(UpcSingleDataBeforeCheck.class);
    public static final String SINGLE_DATA_BEFORE_CHECK_NAME = "upcSingleDataBeforeCheck";
    @Autowired
    SingleDataBeforeCheck singleDataBeforeCheck;

    public void process(SinglePipelineContext ctx) throws Exception {
        Map data = ctx.getData();
        String billnum = ctx.getImportContext().getBillContext().getBillnum();
        log.info("this is upcSingleDataBeforeCheck");
        if ("pc_product".equals(billnum)) {
            data.putAll(new BizObject(data));
            ctx.setBizObject(new BizObject(data));
        } else {
            this.singleDataBeforeCheck.process(ctx);
        }
    }
}

