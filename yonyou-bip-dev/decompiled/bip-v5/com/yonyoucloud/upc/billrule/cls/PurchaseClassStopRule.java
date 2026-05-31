/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.cls.PurchaseClass
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.cls.PurchaseClass;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component(value="purchaseClassStopRule")
public class PurchaseClassStopRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        String billnum = billContext.getBillnum();
        if ("pc_purchaseclass".equalsIgnoreCase(billnum)) {
            Object data = billDataDto.getData();
            PurchaseClass cls = null;
            if (data instanceof Map) {
                cls = (PurchaseClass)data;
            } else if (data instanceof List) {
                List l = (List)data;
                cls = (PurchaseClass)l.get(0);
            } else {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_DATA_TYPE_ERROR);
            }
            HashMap<String, Object> paramMap = new HashMap<String, Object>();
            paramMap.put("id", cls.getId());
            SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.purchaseClass.updateChildStopStatus", paramMap);
        }
        return null;
    }
}

