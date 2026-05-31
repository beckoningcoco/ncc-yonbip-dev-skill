/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.permission.itf.bill.IBillAuthOrgPermission
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.permissions.ICustomOrgPermissionsHandler
 *  com.yonyou.ucf.mdd.ext.sys.service.ApiUserService
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.common;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.permission.itf.bill.IBillAuthOrgPermission;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.permissions.ICustomOrgPermissionsHandler;
import com.yonyou.ucf.mdd.ext.sys.service.ApiUserService;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="myCustomOrgPermissionsHandler")
public class MyCustomOrgPermissionsHandler
implements ICustomOrgPermissionsHandler {
    Logger logger = LoggerFactory.getLogger(MyCustomOrgPermissionsHandler.class);
    @Autowired
    ApiUserService apiUserService;
    @Autowired
    @Qualifier(value="org")
    IBillAuthOrgPermission orgPermissionService;

    public boolean beforeMasterOrgPermissionExt(BillContext billcontext, QuerySchema querySchema) throws Exception {
        boolean doDefaultMasterOrgPermisson = true;
        if ("aa_merchant".equals(billcontext.getBillnum())) {
            String token = InvocationInfoProxy.getYhtAccessToken();
            Object yhtTenantId = AppContext.getYhtTenantId();
            HashMap<String, Object> paramMap = new HashMap<String, Object>(1);
            paramMap.put("yhtTenantId", yhtTenantId);
            Callable<Boolean> callable = () -> {
                String yhttoken = InvocationInfoProxy.getYhtAccessToken();
                if (yhttoken != null && token.equals(yhttoken)) {
                    return false;
                }
                return true;
            };
            doDefaultMasterOrgPermisson = (Boolean)RobotExecutors.runAs((String)yhtTenantId.toString(), callable);
        }
        if ("aa_warehouselist".equals(billcontext.getBillnum())) {
            return false;
        }
        if ("aa_warehouse".equals(billcontext.getBillnum())) {
            return false;
        }
        if ("pc_managementclasslist".equals(billcontext.getBillnum())) {
            return false;
        }
        return doDefaultMasterOrgPermisson;
    }

    public String getAuthIdForRef(BillDataDto billData) {
        String refParam = billData.getParameter("customRefParam");
        if (StringUtils.isEmpty((CharSequence)refParam)) {
            if (null != billData.getQuery() && null != billData.getQuery().get("customRefParam")) {
                AppContext.setThreadContext((String)"customRefParam", billData.getQuery().get("customRefParam"));
            }
            refParam = (String)AppContext.getThreadContext((String)"customRefParam");
        }
        if ("addProductFromApply".equals(refParam)) {
            return "pc_productapplyadd";
        }
        if ("changeProductFromApply".equals(refParam)) {
            return "pc_productapplyaddmodify";
        }
        if ("addMerchantFromApply".equals(refParam)) {
            return "aa_customerapplyadd";
        }
        if ("changeMerchantFromApply".equals(refParam)) {
            return "aa_customerapplyaddmodify";
        }
        String billnum = billData.getBillnum();
        try {
            return this.orgPermissionService.getAuthId(billnum);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getAuthId(BillContext billContext) {
        return "";
    }
}

