/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyoucloud.uretail.sys.auth.CustomAuthContent
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.iuap.upc.dataauth;

import com.yonyoucloud.iuap.upc.dataauth.DPBaseRule;
import com.yonyoucloud.iuap.upc.dataauth.DmBranchLeaderDeptCustomerApplyAuthRule;
import com.yonyoucloud.uretail.sys.auth.CustomAuthContent;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DmPrincipalDeptCustomerApplyAuthRule
extends DPBaseRule {
    @Autowired
    private DmBranchLeaderDeptCustomerApplyAuthRule dbRule;

    @Override
    protected Set<String> getCustomValues(CustomAuthContent content, String personId) throws Exception {
        Set<String> customers;
        Set<String> deptSet = this.getBaseOrgsOrDepts(content, personId, 2, "PRINCIPAL");
        if (!deptSet.isEmpty() && (customers = this.dbRule.queryCustomerApply(deptSet)) != null) {
            return customers;
        }
        return new HashSet<String>(0);
    }
}

