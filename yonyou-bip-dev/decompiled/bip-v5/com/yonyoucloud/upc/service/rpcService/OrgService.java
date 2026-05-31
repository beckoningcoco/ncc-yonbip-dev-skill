/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  org.apache.commons.lang3.StringUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.rpcService;

import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrgService {
    @Autowired
    private IOrgUnitQueryService iOrgUnitQueryService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;

    public OrgUnitDTO getOrgByOrgId(String orgId) {
        if (StringUtils.isEmpty((CharSequence)orgId)) {
            return null;
        }
        return (OrgUnitDTO)this.iOrgUnitQueryService.getById(AppContext.getYhtTenantId().toString(), orgId);
    }
}

