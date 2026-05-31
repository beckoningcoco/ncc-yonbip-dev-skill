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
import com.yonyoucloud.iuap.upc.dataauth.DmPtDeptAuthRule;
import com.yonyoucloud.uretail.sys.auth.CustomAuthContent;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DmPtDeptWithSubAuthRule
extends DPBaseRule {
    @Autowired
    private DmPtDeptAuthRule dmPtDeptAuthRule;

    @Override
    protected Set<String> getCustomValues(CustomAuthContent content, String personId) throws Exception {
        Set<String> deptList;
        Set<String> customValues = this.dmPtDeptAuthRule.getCustomValues(content, personId);
        if (!customValues.isEmpty() && !(deptList = this.getDepartmentAndSubDepartments(content, customValues)).isEmpty()) {
            customValues.addAll(deptList);
        }
        return customValues;
    }
}

