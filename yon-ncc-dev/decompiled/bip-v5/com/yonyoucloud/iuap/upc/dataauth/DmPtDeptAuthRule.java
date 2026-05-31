/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyoucloud.uretail.sys.auth.CustomAuthContent
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.iuap.upc.dataauth;

import com.yonyoucloud.iuap.upc.dataauth.DPBaseRule;
import com.yonyoucloud.uretail.sys.auth.CustomAuthContent;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class DmPtDeptAuthRule
extends DPBaseRule {
    @Override
    protected Set<String> getCustomValues(CustomAuthContent content, String personId) throws Exception {
        HashSet<String> customValues = new HashSet<String>();
        List<Map<String, Object>> personPtJobs = this.getPersonPtJob(content, personId);
        if (!CollectionUtils.isEmpty(personPtJobs)) {
            personPtJobs.stream().forEach(map -> {
                if (map.get("dept_id") != null) {
                    customValues.add((String)map.get("dept_id"));
                }
            });
        }
        return customValues;
    }
}

