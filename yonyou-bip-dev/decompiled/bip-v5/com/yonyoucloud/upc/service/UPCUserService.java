/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.login.util.YhtUserUtil
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.login.util.YhtUserUtil;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.api.service.IUPCUserService;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class UPCUserService
implements IUPCUserService {
    private static final String ORG_ENTITYNAME = "bd.adminOrg.BaseOrgVO";
    private static final String ORGGROUP = "ucf-org-center";
    private final IUPCControlRuleService upcControlRuleService;

    @Autowired
    public UPCUserService(IUPCControlRuleService upcControlRuleService) {
        this.upcControlRuleService = upcControlRuleService;
    }

    @Override
    public LoginUser getUserWithOrgs() throws Exception {
        LoginUser loginUser = AppContext.getCurrentUser();
        List<Map<String, Object>> orgs = this.getOneTenantOrgs();
        this.setOrg(loginUser, orgs);
        AppContext.setUserId((Object)loginUser.getId());
        return AppContext.getCurrentUser();
    }

    @Override
    public List<Map<String, Object>> getUserOrgsByBillnum(String billnum) throws Exception {
        List<String> orgPermissions = this.upcControlRuleService.getOrgPermissions(billnum);
        LoginUser loginUser = AppContext.getCurrentUser();
        if (CollectionUtils.isEmpty(orgPermissions)) {
            return null;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"enable").eq((Object)1)});
        if (YhtUserUtil.isAdmin((LoginUser)loginUser)) {
            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"enable").eq((Object)1), QueryCondition.name((String)"id").in(orgPermissions)});
        }
        QuerySchema schema = QuerySchema.create().addSelect("id as org,code as org_code,name as org_name").addCondition((ConditionExpression)queryConditionGroup);
        return MetaDaoHelper.query((String)ORG_ENTITYNAME, (QuerySchema)schema, (String)ORGGROUP);
    }

    private void setOrg(LoginUser loginUser, List<Map<String, Object>> orglist) throws Exception {
        if (null == loginUser.getOrgId()) {
            if (!CollectionUtils.isEmpty(orglist)) {
                String defOrgId = orglist.get(0).get("org").toString();
                loginUser.set("orgId", (Object)defOrgId);
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800771);
            }
        }
    }

    private List<Map<String, Object>> getOneTenantOrgs() throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"enable").eq((Object)1)});
        QuerySchema schema = QuerySchema.create().addSelect("id as org,code as org_code,name as org_name").addCondition((ConditionExpression)queryConditionGroup);
        return MetaDaoHelper.query((String)ORG_ENTITYNAME, (QuerySchema)schema, (String)ORGGROUP);
    }
}

