/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class UpcOrgQueryService {
    @Autowired
    private IOrgUnitQueryService orgUnitQueryService;

    public OrgUnitDTO getOrgById(String orgId) {
        if (StringUtils.hasText((String)orgId)) {
            return (OrgUnitDTO)this.orgUnitQueryService.getById((String)AppContext.getYhtTenantId(), orgId);
        }
        return null;
    }
}

