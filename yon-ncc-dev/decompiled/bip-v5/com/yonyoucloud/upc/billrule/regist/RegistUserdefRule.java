/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.po.userdefine.UserDefineClassPO
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ypd.bd.api.IBDQueryRepository
 *  com.yonyou.ypd.bill.infrastructure.service.api.IBillRepository
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.orm.schema.SimpleCondition
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.regist;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.po.userdefine.UserDefineClassPO;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ypd.bd.api.IBDQueryRepository;
import com.yonyou.ypd.bill.infrastructure.service.api.IBillRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.orm.schema.SimpleCondition;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="registuserdefRule")
public class RegistUserdefRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(RegistUserdefRule.class);
    @Autowired
    IBDQueryRepository iBillQueryRepository;
    @Autowired
    IBillRepository iBillRepository;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        Tenant tenant = (Tenant)paramMap.get("tenant");
        this.initUserdefBase(tenant.getTenantCenter(), Long.valueOf(tenant.getId().toString()));
        return new RuleExecuteResult();
    }

    public void initUserdefBase(String ytenantId, Long tenantId) {
        List<UserDefineClassPO> userDefineClassPOList = this.queryUserDefTenant0();
        if (!CollectionUtils.isEmpty(userDefineClassPOList)) {
            List ids = IdManager.getInstance().batchGets(userDefineClassPOList.size());
            int i = 0;
            for (UserDefineClassPO userDefineClassPO : userDefineClassPOList) {
                userDefineClassPO.setId((Long)ids.get(i));
                userDefineClassPO.setTenant(tenantId);
                userDefineClassPO.setYtenant(ytenantId);
                userDefineClassPO.setIsDeleted(Boolean.valueOf(true));
                ++i;
            }
            this.deleteUserDefTenant(ytenantId);
            this.iBillRepository.insert(userDefineClassPOList);
        }
    }

    private void deleteUserDefTenant(String ytenant) {
        ArrayList<SimpleCondition> scList = new ArrayList<SimpleCondition>();
        scList.add(new SimpleCondition("ytenant", ConditionOperator.eq, (Object)ytenant));
        this.iBillRepository.batchRemove("pc.userdef.UserDefineClass", scList);
    }

    public List<UserDefineClassPO> queryUserDefTenant0() {
        ArrayList<UserDefineClassPO> userDefineClassPOList = new ArrayList<UserDefineClassPO>();
        RobotExecutors.runAs((String)"0", () -> {
            String fields = StringUtils.join(UserDefineClassPO.metaArrColumnFieldMap.keySet(), (String)",");
            QuerySchema querySchema = QuerySchema.create().addSelect(fields);
            List userdefList0 = this.iBillQueryRepository.queryBySchema("pc.userdef.UserDefineClass", querySchema);
            userDefineClassPOList.addAll(userdefList0);
        });
        return userDefineClassPOList;
    }
}

