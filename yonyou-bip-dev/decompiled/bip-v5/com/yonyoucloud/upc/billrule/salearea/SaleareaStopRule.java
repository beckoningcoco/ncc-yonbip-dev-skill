/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.aa.salearea.SaleArea
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.salearea;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.aa.salearea.SaleArea;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component(value="saleareaStopRule")
public class SaleareaStopRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        SaleArea saleArea = (SaleArea)bills.get(0);
        LoginUser user = AppContext.getCurrentUser();
        if (null == user) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        if ("stop".equals(billContext.getAction())) {
            if (saleArea.getId() == null) {
                return new RuleExecuteResult(0, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802B9", (String)"\u975e\u5e38\u89c4\u64cd\u4f5c"));
            }
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("id", saleArea.getId());
            map.put("table", "aa_salearea");
            SqlHelper.update((String)"com.yonyoucloud.upc.aa.cust.updateAreaStopStatus", map);
        }
        return new RuleExecuteResult();
    }
}

