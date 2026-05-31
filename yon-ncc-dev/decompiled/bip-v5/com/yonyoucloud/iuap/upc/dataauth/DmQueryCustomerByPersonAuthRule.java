/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyoucloud.uretail.sys.auth.CustomAuthExtContent
 *  org.springframework.beans.factory.annotation.Autowired
 */
package com.yonyoucloud.iuap.upc.dataauth;

import com.yonyoucloud.iuap.upc.dataauth.DmCustomerAuthRule;
import com.yonyoucloud.iuap.upc.dataauth.NewDPBaseRule;
import com.yonyoucloud.uretail.sys.auth.CustomAuthExtContent;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;

public class DmQueryCustomerByPersonAuthRule
extends NewDPBaseRule {
    @Autowired
    private DmCustomerAuthRule dmCustomerAuthRule;

    @Override
    protected Set<String> getCustomValues(CustomAuthExtContent content) throws Exception {
        Map param = content.getParam();
        if (param != null && param.get("staffIds") != null && ((List)param.get("staffIds")).size() > 0) {
            List staffIds = (List)param.get("staffIds");
            return this.dmCustomerAuthRule.queryCustomers(content.getYhtUserId(), content.getYhtTenantId(), staffIds);
        }
        return new HashSet<String>(0);
    }
}

