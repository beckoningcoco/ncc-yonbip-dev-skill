/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApply
 *  com.yonyoucloud.uretail.sys.auth.CustomAuthContent
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryPager
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.iuap.upc.dataauth;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.dataauth.DPBaseRule;
import com.yonyoucloud.upc.aa.customerapply.CustomerApply;
import com.yonyoucloud.uretail.sys.auth.CustomAuthContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryPager;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class DmBranchLeaderDeptCustomerApplyAuthRule
extends DPBaseRule {
    @Autowired
    private YMSParamConfig ymsParamConfig;

    @Override
    protected Set<String> getCustomValues(CustomAuthContent content, String personId) throws Exception {
        Set<String> customers;
        Set<String> deptSet = this.getBaseOrgsOrDepts(content, personId, 2, "BRANCH_LEADER");
        if (!deptSet.isEmpty() && (customers = this.queryCustomerApply(deptSet)) != null) {
            return customers;
        }
        return deptSet;
    }

    public Set<String> queryCustomerApply(Set<String> deptSet) throws Exception {
        Long currentRangeId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        List<CustomerApply> customerApplyList = this.queryCustomerApplyByMinId(deptSet, currentRangeId, realMaxRowsValue);
        ArrayList<CustomerApply> customerApplies = new ArrayList<CustomerApply>(customerApplyList);
        while (customerApplyList.size() >= realMaxRowsValue) {
            currentRangeId = (Long)customerApplyList.get(customerApplyList.size() - 1).getId();
            customerApplyList = this.queryCustomerApplyByMinId(deptSet, currentRangeId, realMaxRowsValue);
            customerApplies.addAll(customerApplyList);
        }
        if (!CollectionUtils.isEmpty(customerApplies)) {
            return customerApplies.stream().map(customerApply -> customerApply.getId().toString()).collect(Collectors.toSet());
        }
        return new HashSet<String>();
    }

    public List<CustomerApply> queryCustomerApplyByMinId(Set<String> deptSet, Long minId, int realMaxRowsValue) throws Exception {
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"applyDepartment").in(deptSet), QueryCondition.name((String)"id").gt((Object)minId)});
        QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)conditionGroup);
        querySchema.addOrderBy("id");
        QueryPager queryPager = new QueryPager();
        queryPager.setPageIndex(1);
        queryPager.setPageSize(realMaxRowsValue);
        querySchema.pager(queryPager);
        List customerApplyList = MetaDaoHelper.queryObject((String)"aa.customerapply.CustomerApply", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)customerApplyList)) {
            return customerApplyList;
        }
        return new ArrayList<CustomerApply>();
    }
}

