/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.base.user.User
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.util.rpc.RpcCommonUtil
 *  com.yonyoucloud.upc.aa.registInfo.RegisterSourceType
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.regist;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.base.user.User;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.util.rpc.RpcCommonUtil;
import com.yonyoucloud.upc.aa.registInfo.RegisterSourceType;
import com.yonyoucloud.upc.billrule.regist.ModifyOptionData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="RegistInitRegistInfo")
public class RegistInitRegistInfo
extends AbstractCommonRule {
    private final ModifyOptionData modifyOptionData;
    private static final String IS_U8C = "IS_U8C";
    private static Pattern pattern = Pattern.compile("[0-9]*");
    Logger logger = LoggerFactory.getLogger(RegistInitRegistInfo.class);

    @Autowired
    public RegistInitRegistInfo(ModifyOptionData modifyOptionData) {
        this.modifyOptionData = modifyOptionData;
    }

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        boolean isU8C;
        Tenant tenant = (Tenant)map.get("tenant");
        User user = (User)map.get("user");
        boolean bl = isU8C = user.get(IS_U8C) == null ? false : (Boolean)user.get(IS_U8C);
        if (isU8C) {
            return new RuleExecuteResult(map);
        }
        this.saveRegistInfo(tenant, null);
        return new RuleExecuteResult(map);
    }

    public void saveRegistInfo(Tenant tenant, String appid) throws Exception {
        if (tenant.getSource() == null) {
            return;
        }
        this.tenantAddAppId(tenant, appid);
        String source = tenant.get("source").toString();
        String systemCode = RegistInitRegistInfo.getSystemCode(source);
        HashMap<String, Object> queryparams = new HashMap<String, Object>();
        queryparams.put("systemCode", systemCode);
        queryparams.put("iDeleted", 0);
        queryparams.put("ytenant_id", tenant.getTenantCenter());
        List registInfos = SqlHelper.selectList((String)"com.yonyoucloud.upc.dao.meta.init.queryRegistInfoList", queryparams);
        if (registInfos != null && registInfos.size() > 0) {
            this.logger.info("RegistInitRegistInfo/saveRegistInfo,\u5df2\u5f00\u901a" + systemCode);
            return;
        }
        this.modifyOptionData.updateOptionData(tenant, systemCode);
        this.save(tenant, systemCode);
    }

    public static String getSystemCode(String source) {
        int s;
        RegisterSourceType registerSourceType;
        Matcher isNum = pattern.matcher(source);
        String systemCode = isNum.matches() ? ((registerSourceType = RegisterSourceType.find((Number)(s = Integer.parseInt(source)))) == null ? source : registerSourceType.toString()) : source;
        return systemCode;
    }

    private void tenantAddAppId(Tenant tenant, String appid) throws Exception {
        if (appid == null) {
            return;
        }
        tenant.setAppId(appid);
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("tenantId", tenant.getId());
        params.put("appId", appid);
        SqlHelper.update((String)"com.yonyoucloud.upc.dao.meta.init.tenantAddAppId", params);
    }

    public void save(Tenant tenant, String systemCode) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("tenantId", tenant.getId());
        params.put("systemCode", systemCode);
        params.put("isRegist", 1);
        params.put("server", null);
        params.put("registDate", new Date());
        params.put("isRegisted", false);
        params.put("isPreseted", true);
        params.put("ytenantId", tenant.getTenantCenter());
        List registInfoList = SqlHelper.selectList((String)"com.yonyoucloud.upc.dao.meta.init.selectInitRegUPC", params);
        if (!CollectionUtils.isEmpty((Collection)registInfoList)) {
            List ids = IdManager.getInstance().batchGets(registInfoList.size());
            int i = 0;
            for (Map registInfo : registInfoList) {
                registInfo.put("id", ids.get(i));
                registInfo.put("isRegist", params.get("isRegist"));
                registInfo.put("registDate", params.get("registDate"));
                if (!Boolean.parseBoolean(params.get("isPreseted").toString())) {
                    registInfo.put("server", params.get("server"));
                }
                registInfo.put("tenantId", params.get("tenantId"));
                registInfo.put("ytenantId", params.get("ytenantId"));
            }
            SqlHelper.insert((String)"com.yonyoucloud.upc.dao.meta.init.initRegUPC", (Object)registInfoList);
        }
        this.modifyOptionData.updateOptionData(tenant, systemCode);
        ArrayList<String> isOpen = new ArrayList<String>();
        isOpen.add("option_" + tenant.getId() + "_" + RpcCommonUtil.getProfile());
        isOpen.add("sysOption_" + tenant.getId() + "_" + RpcCommonUtil.getProfile());
        AppContext.cache().del(isOpen.toArray(new String[isOpen.size()]));
    }
}

