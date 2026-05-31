/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.log.cons.BusinessLogMode
 *  com.yonyou.iuap.log.model.BusinessLogObjectBuilder
 *  com.yonyou.iuap.log.rpc.IBusiLogService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  com.yonyoucloud.upc.pc.productapply.ProductApplyType
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.productApply;

import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.log.cons.BusinessLogMode;
import com.yonyou.iuap.log.model.BusinessLogObjectBuilder;
import com.yonyou.iuap.log.rpc.IBusiLogService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.pc.productapply.ProductApplyType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="productApplySaveBusinessLogRule")
public class ProductApplySaveBusinessLogRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(ProductApplySaveBusinessLogRule.class);
    @Autowired
    private IBusiLogService busiLogService;
    @Autowired
    private IUPCBillService billService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List bills = this.getBills(billContext, map);
        for (BizObject bill : bills) {
            ProductApply productApply = (ProductApply)bill;
            if (EntityStatus.Insert != productApply.getEntityStatus() || ProductApplyType.modify != productApply.getApplyType()) continue;
            Map currProductData = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(productApply.getProductData(), Map.class);
            HashMap params = new HashMap(3);
            params.put("@productApplyRangeId", currProductData.get("productApplyRangeId"));
            params.put("isCreator", currProductData.get("isCreator"));
            params.put("isApplied", currProductData.get("isApplied"));
            BillDataDto billDataDtoProductLog = new BillDataDto("pc_productdetail", productApply.getApplyProductId().toString());
            billDataDtoProductLog.setMapCondition(params);
            Map productDetail = this.billService.detail(billDataDtoProductLog);
            BillDataDto billDataDtoProductApplyLog = new BillDataDto("pc_productapply", productApply.getId().toString());
            Map productApplyDetail = this.billService.detail(billDataDtoProductApplyLog);
            productApplyDetail.put("productData", UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)productDetail));
            BusinessLogObjectBuilder businessLogObjectBuilder = new BusinessLogObjectBuilder();
            businessLogObjectBuilder.uri("pc.productapply.ProductApply").busiObjTypeCode("pc_productapply").busiObjTypeName("UID:P_COREDOC-BE_1C5F21E605580007").defaultBusiObjTypeName("\u7269\u6599\u7533\u8bf7\u671f\u521d").operationName("UID:P_COREDOC-BE_1C102E0205200003").defaultOperationName("\u7533\u8bf7\u671f\u521d").logMode(BusinessLogMode.UI_META).domain("productcenter").serviceCode("pc_productapply").newObject((Object)productApplyDetail).dataId(productApply.getId().toString()).dataCode(productApply.getApplyCode());
            this.busiLogService.saveBusinessLog(businessLogObjectBuilder.build());
        }
        return new RuleExecuteResult();
    }
}

