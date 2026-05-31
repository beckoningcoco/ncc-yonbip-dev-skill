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
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.customertrade.CustomerTrade
 *  com.yonyoucloud.upc.utils.TreeBillDataUtil
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.customertrade;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.customertrade.CustomerTrade;
import com.yonyoucloud.upc.service.ProductClsService;
import com.yonyoucloud.upc.utils.TreeBillDataUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="customerTradeBeforeSaveRule")
public class CustomerTradeBeforeSaveRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(CustomerTradeBeforeSaveRule.class);
    @Autowired
    private ProductClsService productClsService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = this.getBills(billContext, map);
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("tenantid", AppContext.getCurrentUser().getTenant());
        for (BizObject cls : clss) {
            boolean checkResult;
            params.put("id", cls.get("id"));
            if (!"aa_customertrade".equals(billContext.getBillnum())) continue;
            CustomerTrade customerTrade = (CustomerTrade)cls;
            log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408047D", (String)"===========>CustomerTradeBeforeSaveRule\uff1a") + customerTrade.getIsEnabled() + "--" + customerTrade.getStopstatus());
            if (customerTrade.getStopstatus() != null && customerTrade.getIsEnabled() != null && !customerTrade.getStopstatus().booleanValue() && customerTrade.getIsEnabled().booleanValue()) {
                customerTrade.setStoptime(null);
            }
            if (customerTrade.getEntityStatus() == EntityStatus.Insert) {
                customerTrade.setIsEnd(Boolean.valueOf(true));
            }
            if (customerTrade.getId() != null && customerTrade.getParent() != null && customerTrade.getEntityStatus() == EntityStatus.Update && !(checkResult = this.productClsService.checkParent((Long)customerTrade.getId(), customerTrade.getParent(), "aa.customertrade.CustomerTrade"))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800190);
            }
            if (customerTrade.getId() == null || customerTrade.getParent() == null) continue;
            TreeBillDataUtil.checkTreeLevel((String)"aa.customertrade.CustomerTrade", (Long)((Long)customerTrade.getId()), (Long)customerTrade.getParent());
        }
        return null;
    }
}

