/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.dubbo.DubboReference
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.poi.api.ImportProvilegeChecking
 *  com.yonyou.ucf.mdd.ext.poi.context.ImportContext
 *  com.yonyoucloud.uretail.sys.pubItf.IOrgPermissionService
 *  org.imeta.biz.base.BizException
 *  org.imeta.core.model.Entity
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyou.ucf.mdd.ext.poi.support.service.impl;

import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.dubbo.DubboReference;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.poi.api.ImportProvilegeChecking;
import com.yonyou.ucf.mdd.ext.poi.context.ImportContext;
import com.yonyou.ucf.mdd.ext.poi.support.service.UserDataProvilegeCheckService;
import com.yonyou.ucf.mdd.ext.poi.support.service.UserOrgListProvilegeCheckService;
import com.yonyou.ucf.mdd.ext.poi.support.service.UserOrgProvilegeCheckService;
import com.yonyoucloud.uretail.sys.pubItf.IOrgPermissionService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.imeta.biz.base.BizException;
import org.imeta.core.model.Entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataProvilegeCheckingImpl
implements ImportProvilegeChecking {
    private static final Logger log = LoggerFactory.getLogger(DataProvilegeCheckingImpl.class);
    @Autowired
    private IOrgPermissionService orgPermissionService;
    private static final String ORG_PERMISSION_SERVICE_GROUP = "u8c-auth";
    private static final String STATEMENT = "com.yonyou.ucf.mdd.ext.bill.meta.dao.selectAuthId";

    public void checkPrivilege(ImportContext ctx, Entity entity, Map<String, Object> row, String sheetName, StringBuilder errorMessage) throws Exception {
        LoginUser loginUser = AppContext.getCurrentUser();
        row = this.userOrgListPrivilegeHandle(this.getOrgsCodes(ctx), row, errorMessage);
        row = this.userDataPrivilegeHandle(loginUser.getUserAuth(), row, errorMessage);
    }

    private Set<String> getOrgsCodes(ImportContext ctx) throws Exception {
        if (this.orgPermissionService == null) {
            this.orgPermissionService = (IOrgPermissionService)DubboReference.getInstance().getReference(IOrgPermissionService.class, ORG_PERMISSION_SERVICE_GROUP, null);
        }
        String billNo = ctx.getBillno();
        String action = ctx.getAction();
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("tenantId", AppContext.getTenantId());
        param.put("billNo", billNo);
        param.put("action", action);
        List selectResultList = SqlHelper.selectList((String)STATEMENT, param);
        HashSet<String> orgCodes = new HashSet<String>();
        if (selectResultList != null && selectResultList.size() != 0) {
            String authid = "";
            try {
                for (Map map : selectResultList) {
                    Set remoteOrgCodes;
                    Object authidObj = map.get("authid");
                    if (authidObj == null || (remoteOrgCodes = this.orgPermissionService.getOrgPermissions(authid = authidObj.toString())) == null) continue;
                    orgCodes.addAll(remoteOrgCodes);
                }
            }
            catch (Exception e) {
                log.error("\u83b7\u53d6\u5f53\u524d\u79df\u6237\u7ec4\u7ec7\u6743\u9650\u5f02\u5e38\uff0caction=%s,billNo=%s,authid=%s", new Object[]{action, billNo, authid, e});
                String msg = InternationalUtils.getMessage((String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21A830A205380082", (String)"\u83b7\u53d6\u5f53\u524d\u79df\u6237\u7ec4\u7ec7\u6743\u9650\u5f02\u5e38\uff0caction={0},billNo={1},authid={2}"), (Object[])new Object[]{action, billNo, authid});
                throw new BizException(msg);
            }
        }
        return orgCodes;
    }

    private Map<String, Object> userDataPrivilegeHandle(Set<String> userAuthSet, Map<String, Object> row, StringBuilder errorMessage) {
        if (row == null || row.size() == 0) {
            return row;
        }
        LinkedList userDataImplList = new LinkedList(AppContext.getApplicationContext().getBeansOfType(UserDataProvilegeCheckService.class).values());
        if (userDataImplList == null || userDataImplList.size() == 0) {
            return row;
        }
        for (UserDataProvilegeCheckService checkService : userDataImplList) {
            boolean result = checkService.dataProvilegeCheck(userAuthSet, row, errorMessage);
            if (result) continue;
            row.clear();
            break;
        }
        return row;
    }

    private Map<String, Object> userOrgPrivilegeHandle(String orgErpCode, Map<String, Object> row, StringBuilder errorMessage) {
        if (row == null || row.size() == 0) {
            return row;
        }
        LinkedList userOrgImplList = new LinkedList(AppContext.getApplicationContext().getBeansOfType(UserOrgProvilegeCheckService.class).values());
        if (userOrgImplList == null || userOrgImplList.size() == 0) {
            return row;
        }
        for (UserOrgProvilegeCheckService checkService : userOrgImplList) {
            boolean result = checkService.dataProvilegeCheck(orgErpCode, row, errorMessage);
            if (result) continue;
            row.clear();
            break;
        }
        return row;
    }

    private Map<String, Object> userOrgListPrivilegeHandle(Set<String> userOrgList, Map<String, Object> row, StringBuilder errorMessage) {
        if (row == null || row.size() == 0) {
            return row;
        }
        LinkedList userOrgListImplList = new LinkedList(AppContext.getApplicationContext().getBeansOfType(UserOrgListProvilegeCheckService.class).values());
        if (userOrgListImplList == null || userOrgListImplList.size() == 0) {
            return row;
        }
        for (UserOrgListProvilegeCheckService checkService : userOrgListImplList) {
            boolean result = checkService.dataProvilegeCheck(userOrgList, row, errorMessage);
            if (result) continue;
            row.clear();
            break;
        }
        return row;
    }
}

