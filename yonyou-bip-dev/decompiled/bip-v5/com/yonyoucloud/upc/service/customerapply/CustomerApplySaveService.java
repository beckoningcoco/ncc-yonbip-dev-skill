/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.sqlconstant.merchantApply.MerchantApplyUpdateSQLConstant
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.param.SQLParameter
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Propagation
 *  org.springframework.transaction.annotation.Transactional
 */
package com.yonyoucloud.upc.service.customerapply;

import com.yonyou.iuap.apdoc.coredoc.sqlconstant.merchantApply.MerchantApplyUpdateSQLConstant;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.param.SQLParameter;
import com.yonyoucloud.upc.service.CustomerApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerApplySaveService {
    @Autowired
    CustomerApplyService customerApplyService;

    @Transactional(rollbackFor={Throwable.class}, propagation=Propagation.REQUIRES_NEW)
    public void saveMerchant(IYmsJdbcApi ymsJdbcApi, Long customerApplyId) throws Exception {
        SQLParameter sqlParameter = new SQLParameter();
        sqlParameter.addParam((Object)customerApplyId);
        ymsJdbcApi.update(MerchantApplyUpdateSQLConstant.merchantApplyUpdateEffectStatus, sqlParameter);
        this.customerApplyService.auditCustomerApply(customerApplyId);
    }
}

