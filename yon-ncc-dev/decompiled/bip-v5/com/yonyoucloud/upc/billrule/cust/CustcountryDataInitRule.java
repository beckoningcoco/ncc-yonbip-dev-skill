/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.aa.countryarchives.CountryArchives
 *  com.yonyoucloud.upc.aa.countryarchives.CountryArchivesOrgs
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.base.Json
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cust;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.aa.countryarchives.CountryArchives;
import com.yonyoucloud.upc.aa.countryarchives.CountryArchivesOrgs;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.base.Json;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;

@Component(value="custcountryDataInitRule")
public class CustcountryDataInitRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = (List)billDataDto.getData();
        CountryArchives cls = (CountryArchives)clss.get(0);
        switch (AppContext.getCurrentUser().getUserType()) {
            case TenantAdmin: 
            case TenantEmployee: {
                this.SetOrgs(cls);
                break;
            }
        }
        return new RuleExecuteResult((Object)Json.encode2((BizObject)cls).toString());
    }

    private void SetOrgs(CountryArchives cls) throws Exception {
        List<Map> orgs = this.getPrivilegedAndNextOrgs(cls);
        if (null == orgs) {
            return;
        }
        cls.setCountryorgs(new ArrayList());
        for (int i = 0; i < orgs.size(); ++i) {
            CountryArchivesOrgs custOrgs = new CountryArchivesOrgs();
            custOrgs.setEntityStatus(EntityStatus.Insert);
            custOrgs.setOrg(orgs.get(i).get("id").toString());
            custOrgs.set("org_code", orgs.get(i).get("code"));
            custOrgs.set("org_name", orgs.get(i).get("name"));
            if (orgs.get(i).get("id").toString().equals(AppContext.getCurrentUser().getOrgId())) {
                custOrgs.setIsCreator(Boolean.valueOf(true));
            } else {
                custOrgs.setIsCreator(Boolean.valueOf(false));
            }
            cls.countryorgs().add(custOrgs);
        }
    }

    private List<Map> getPrivilegedAndNextOrgs(CountryArchives cls) throws Exception {
        List orgs = null;
        LoginUser user = AppContext.getCurrentUser();
        if (null == user) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        String orgId = user.getOrgId();
        QuerySchema schema = null;
        QueryConditionGroup queryConditionGroup = null;
        switch (user.getUserType()) {
            case TenantAdmin: {
                schema = QuerySchema.create().addSelect("id,name,code").appendQueryCondition(new ConditionExpression[]{QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)orgId), QueryCondition.name((String)"path").like((Object)orgId)})});
                orgs = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)schema);
                if (orgs == null || orgs.size() >= 1) break;
                break;
            }
            case TenantEmployee: {
                queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"user").eq(user.getId()), QueryCondition.name((String)"org.path").like((Object)orgId)});
                schema = QuerySchema.create().addSelect("org.id as id,org.name as name,org.code as code").addCondition((ConditionExpression)queryConditionGroup);
                orgs = MetaDaoHelper.query((String)"base.user.UserOrg", (QuerySchema)schema);
                if (null == orgs || orgs.size() >= 1) break;
                break;
            }
        }
        return orgs;
    }
}

