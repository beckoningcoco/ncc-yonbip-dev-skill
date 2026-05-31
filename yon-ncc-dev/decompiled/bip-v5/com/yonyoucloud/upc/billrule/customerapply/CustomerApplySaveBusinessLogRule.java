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
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApply
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApplyType
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.customerapply;

import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.log.cons.BusinessLogMode;
import com.yonyou.iuap.log.model.BusinessLogObjectBuilder;
import com.yonyou.iuap.log.rpc.IBusiLogService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.aa.customerapply.CustomerApply;
import com.yonyoucloud.upc.aa.customerapply.CustomerApplyType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="customerApplySaveBusinessLogRule")
public class CustomerApplySaveBusinessLogRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(CustomerApplySaveBusinessLogRule.class);
    @Autowired
    private IBusiLogService busiLogService;
    @Autowired
    private IUPCBillService billService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List bills = this.getBills(billContext, map);
        for (BizObject bill : bills) {
            CustomerApply customerApply = (CustomerApply)bill;
            if (EntityStatus.Insert != customerApply.getEntityStatus() || CustomerApplyType.modify != customerApply.getApplyType()) continue;
            Map currCustomerData = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(customerApply.getCustomerData(), Map.class);
            HashMap params = new HashMap(3);
            params.put("@merchantApplyRangeId", currCustomerData.get("merchantApplyRangeId"));
            params.put("isCreator", currCustomerData.get("isCreator"));
            params.put("isApplied", currCustomerData.get("isApplied"));
            BillDataDto billDataDtoMerchantLog = new BillDataDto("aa_merchant", customerApply.getApplyCustomer().toString());
            billDataDtoMerchantLog.setMapCondition(params);
            Map merchantDetail = this.billService.detail(billDataDtoMerchantLog);
            BillDataDto billDataDtoCustomerApplyLog = new BillDataDto("aa_customerapply", customerApply.getId().toString());
            Map customerApplyDetail = this.billService.detail(billDataDtoCustomerApplyLog);
            customerApplyDetail.put("customerData", UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)merchantDetail));
            BusinessLogObjectBuilder businessLogObjectBuilder = new BusinessLogObjectBuilder();
            businessLogObjectBuilder.uri("aa.customerapply.CustomerApply").busiObjTypeCode("aa_customerapply").busiObjTypeName("UID:P_COREDOC-BE_1C102D8804580006").defaultBusiObjTypeName("\u5ba2\u6237\u7533\u8bf7\u671f\u521d").operationName("UID:P_COREDOC-BE_1C102E0205200003").defaultOperationName("\u7533\u8bf7\u671f\u521d").logMode(BusinessLogMode.UI_META).domain("productcenter").serviceCode("aa_customerapply").newObject((Object)customerApplyDetail).dataId(customerApply.getId().toString()).dataCode(customerApply.getApplyCode());
            this.busiLogService.saveBusinessLog(businessLogObjectBuilder.build());
        }
        return new RuleExecuteResult();
    }
}

