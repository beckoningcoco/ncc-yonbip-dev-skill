/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyoucloud.uretail.sys.auth.CustomAuthExtContent
 *  org.springframework.beans.factory.annotation.Autowired
 */
package com.yonyoucloud.iuap.upc.dataauth;

import com.yonyoucloud.iuap.upc.dataauth.DmCustomerAuthRule;
import com.yonyoucloud.iuap.upc.dataauth.DmDeptCustomerAuthRule;
import com.yonyoucloud.iuap.upc.dataauth.NewDPBaseRule;
import com.yonyoucloud.uretail.sys.auth.CustomAuthExtContent;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;

public class DmQueryCustomerByDeptAuthRule
extends NewDPBaseRule {
    @Autowired
    private DmDeptCustomerAuthRule dmDeptCustomerAuthRule;
    @Autowired
    private DmCustomerAuthRule dmCustomerAuthRule;

    @Override
    protected Set<String> getCustomValues(CustomAuthExtContent content) throws Exception {
        Map param = content.getParam();
        if (param != null && param.get("deptIds") != null && ((List)param.get("deptIds")).size() > 0) {
            List deptIds = (List)param.get("deptIds");
            Set<String> authOrgSet = this.dmCustomerAuthRule.getAuthOrgSet(content.getYhtUserId(), content.getYhtTenantId());
            HashSet<String> deptSet = new HashSet<String>(deptIds.size());
            deptSet.addAll(deptIds);
            return this.dmDeptCustomerAuthRule.getCustomersByDepartment(null, deptSet, authOrgSet);
        }
        return new HashSet<String>(0);
    }
}

