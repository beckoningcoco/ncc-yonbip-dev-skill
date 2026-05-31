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
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class DmBranchLeaderDeptWithSubAuthRule
extends DPBaseRule {
    @Override
    protected Set<String> getCustomValues(CustomAuthContent content, String personId) throws Exception {
        Set<String> deptList;
        Set<String> deptSet = this.getBaseOrgsOrDepts(content, personId, 2, "BRANCH_LEADER");
        if (!deptSet.isEmpty() && !(deptList = this.getDepartmentAndSubDepartments(content, deptSet)).isEmpty()) {
            deptSet.addAll(deptList);
        }
        return deptSet;
    }
}

