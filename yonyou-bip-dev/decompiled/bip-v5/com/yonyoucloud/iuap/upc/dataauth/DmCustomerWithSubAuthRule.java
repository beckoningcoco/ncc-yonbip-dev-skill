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
import com.yonyoucloud.iuap.upc.dataauth.DmCustomerAuthRule;
import com.yonyoucloud.uretail.sys.auth.CustomAuthContent;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DmCustomerWithSubAuthRule
extends DPBaseRule {
    @Autowired
    private DmCustomerAuthRule dmCustomerAuthRule;

    @Override
    protected Set<String> getCustomValues(CustomAuthContent content, String personId) throws Exception {
        Set<Long> longSet;
        Set<Long> subCustomerSet;
        Set<String> customerSet = this.dmCustomerAuthRule.getCustomValues(content, personId);
        if (!customerSet.isEmpty() && !(subCustomerSet = this.getCustomerAndSub(content, longSet = customerSet.stream().map(item -> Long.parseLong(item)).collect(Collectors.toSet()))).isEmpty()) {
            subCustomerSet.stream().forEach(item -> customerSet.add(String.valueOf(item)));
        }
        return customerSet;
    }
}

