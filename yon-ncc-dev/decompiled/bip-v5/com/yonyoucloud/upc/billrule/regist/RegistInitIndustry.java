/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.base.user.User
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.industryinit.IndustryInitRule
 *  com.yonyoucloud.upc.aa.industryinit.IndustryInitType
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.regist;

import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.base.user.User;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.industryinit.IndustryInitRule;
import com.yonyoucloud.upc.aa.industryinit.IndustryInitType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(value="RegistInitIndustry")
public class RegistInitIndustry
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(RegistInitIndustry.class);

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802B2", (String)"\u6267\u884cRegistInitIndustry\u89c4\u5219,\u53c2\u6570map: {}"), map);
        Tenant tenant = (Tenant)map.get("tenant");
        User user = (User)map.get("user");
        Short industry = tenant.getIndustry();
        if (industry != null) {
            QuerySchema querySchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"industry").eq((Object)industry)})).addOrderBy("executeOrder");
            List query = MetaDaoHelper.query((String)"aa.industryinit.IndustryInitRule", (QuerySchema)querySchema);
            log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802B3", (String)"\u6267\u884cRegistInitIndustry\u89c4\u5219,IndustryInitRule\u89c4\u5219\u96c6\u5408querey: {}"), (Object)query);
            Iterator iterator = query.iterator();
            while (iterator.hasNext()) {
                IndustryInitRule initRule = new IndustryInitRule();
                initRule.init((Map)iterator.next());
                try {
                    this.doOneInitRule(initRule, tenant, user);
                }
                catch (Exception e) {
                    log.info("warn : ", (Throwable)e);
                }
            }
        }
        return new RuleExecuteResult(map);
    }

    private void doOneInitRule(IndustryInitRule initRule, Tenant tenant, User user) throws Exception {
        if (IndustryInitType.mapperSqlId.equals((Object)initRule.getInitType())) {
            this.executeSql(initRule.getRule(), tenant, user);
        }
    }

    private void executeSql(String rule, Tenant tenant, User user) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("tenant", tenant.getId());
        params.put("industry", tenant.getIndustry());
        params.put("user", user.getId());
        String industryinitmapper = "com.yonyoucloud.upc.aa.industryinit.";
        String statement = rule.contains(".") ? rule : industryinitmapper + rule;
        log.info("executeSql,statement: {}", (Object)statement);
        log.info("executeSql,params: {}", params);
        int insert = SqlHelper.insert((String)statement, params);
        log.info("executeSql,insert: {}", (Object)insert);
    }
}

