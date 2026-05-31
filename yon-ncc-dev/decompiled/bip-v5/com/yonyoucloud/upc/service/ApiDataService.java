/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.enums.OperationTypeEnum
 *  com.yonyou.ucf.mdd.ext.bill.dto.BaseDto
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.CommonRuleUtils
 *  com.yonyou.ucf.mdd.ext.bill.rule.template.CommonOperator
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.enums.OperationTypeEnum;
import com.yonyou.ucf.mdd.ext.bill.dto.BaseDto;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.CommonRuleUtils;
import com.yonyou.ucf.mdd.ext.bill.rule.template.CommonOperator;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.springframework.stereotype.Service;

@Service
public class ApiDataService {
    public List<Map<String, Object>> converBillData(BillDataDto bill) throws Exception {
        ArrayList<Map<String, Object>> billList = new ArrayList<Map<String, Object>>();
        BillContext billContext = new CommonOperator(OperationTypeEnum.QUERY).getBillContext((BaseDto)bill);
        HashMap<String, BillDataDto> paramMap = new HashMap<String, BillDataDto>();
        paramMap.put("param", bill);
        List bills = CommonRuleUtils.getBills((BillContext)billContext, paramMap);
        for (BizObject tempBill : bills) {
            if (tempBill == null) continue;
            Object status = tempBill.get("_status");
            if (null == status || "Unchanged".equalsIgnoreCase(status.toString())) {
                tempBill.put("_status", (Object)EntityStatus.Insert);
            }
            billList.add((Map<String, Object>)tempBill);
        }
        ArrayList<Map<String, Object>> tempBillList = billList;
        tempBillList.removeAll(Collections.singleton(null));
        if (tempBillList == null || tempBillList.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800518);
        }
        return billList;
    }
}

