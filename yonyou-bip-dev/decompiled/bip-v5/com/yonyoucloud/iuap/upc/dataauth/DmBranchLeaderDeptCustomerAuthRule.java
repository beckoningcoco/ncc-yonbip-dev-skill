/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyoucloud.uretail.sys.auth.CustomAuthContent
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.iuap.upc.dataauth;

import com.yonyoucloud.iuap.upc.dataauth.DPBaseRule;
import com.yonyoucloud.uretail.sys.auth.CustomAuthContent;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class DmBranchLeaderDeptCustomerAuthRule
extends DPBaseRule {
    @Override
    protected Set<String> getCustomValues(CustomAuthContent content, String personId) throws Exception {
        Set<String> deptSet = this.getBaseOrgsOrDepts(content, personId, 2, "BRANCH_LEADER");
        if (!deptSet.isEmpty()) {
            return this.getCustomersBySaleOrgOrDepartment(content, deptSet, "DEPT");
        }
        return new HashSet<String>(0);
    }
}

