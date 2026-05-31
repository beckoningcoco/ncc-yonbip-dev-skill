/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.common;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="billBatchModifyRule")
public class BillBatchModifyRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        Map externalData = (Map)billDataDto.getExternalData();
        for (String key : externalData.keySet()) {
            List<Object> batchmodifyconfigs;
            if ("isAsync".equals(key) || CollectionUtils.isEmpty(batchmodifyconfigs = this.getBatchModifyConfigs(billDataDto, key))) continue;
            this.setBatchModifyIgnoreCheck(billContext);
            break;
        }
        return null;
    }

    private void setBatchModifyIgnoreCheck(BillContext billContext) throws Exception {
        HashMap<String, Boolean> context = billContext.getContext();
        if (context == null) {
            context = new HashMap<String, Boolean>();
        }
        context.put("batch_modify_ignore_check", true);
    }

    private List<Object> getBatchModifyConfigs(BillDataDto billDataDto, String fieldName) throws Exception {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("billnum", billDataDto.getBillnum());
        params.put("name", fieldName);
        return SqlHelper.selectList((String)"com.yonyoucloud.upc.bill.dao.OperatorBillRuleDao.querybatchmodifyconfig", params);
    }
}

