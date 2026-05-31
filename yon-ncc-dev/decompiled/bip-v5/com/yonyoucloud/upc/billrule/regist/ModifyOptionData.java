/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.registInfo.RegisterSourceType
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.regist;

import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.registInfo.RegisterSourceType;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(value="modifyOptionData")
public class ModifyOptionData
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(ModifyOptionData.class);

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080755", (String)"\u6267\u884cmodifyOptionData\u89c4\u5219,\u53c2\u6570map:"), map);
        Tenant tenant = (Tenant)map.get("tenant");
        if (tenant.getSource() == null) {
            return new RuleExecuteResult(map);
        }
        String systemCode = RegisterSourceType.find((Number)tenant.getSource()).toString();
        this.updateOptionData(tenant, systemCode);
        if (RegisterSourceType.UMember.toString().equals(systemCode)) {
            this.updateOptionData(tenant, RegisterSourceType.UMall.toString());
        }
        log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080754", (String)"\u6267\u884cmodifyOptionData\u89c4\u5219,\u8fd4\u56demap:{}"), map);
        return new RuleExecuteResult(map);
    }

    public void updateOptionData(Tenant tenant, String systemCode) throws Exception {
        String optionName = "";
        optionName = RegisterSourceType.SCMSA.toString().equals(systemCode) ? "isOpenUdh" : "isOpen" + systemCode;
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("optionName", optionName);
        params.put("ytenant_id", tenant.getTenantCenter());
        SqlHelper.update((String)"com.yonyoucloud.upc.dao.meta.init.updateOptionData", params);
    }
}

