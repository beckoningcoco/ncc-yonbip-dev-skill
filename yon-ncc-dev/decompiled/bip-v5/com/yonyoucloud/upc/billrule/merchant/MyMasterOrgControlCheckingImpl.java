/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.service.auth.IServiceIsolateService
 *  com.yonyou.ucf.mdd.ext.poi.api.ImportProvilegeChecking
 *  com.yonyou.ucf.mdd.ext.poi.context.ImportContext
 *  org.imeta.core.model.Entity
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.boot.autoconfigure.condition.ConditionalOnClass
 *  org.springframework.core.annotation.Order
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.diwork.service.auth.IServiceIsolateService;
import com.yonyou.ucf.mdd.ext.poi.api.ImportProvilegeChecking;
import com.yonyou.ucf.mdd.ext.poi.context.ImportContext;
import java.util.Map;
import org.imeta.core.model.Entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnClass(value={IServiceIsolateService.class})
@Order(value=1)
public class MyMasterOrgControlCheckingImpl
implements ImportProvilegeChecking {
    private static final Logger log = LoggerFactory.getLogger(MyMasterOrgControlCheckingImpl.class);

    public void checkPrivilege(ImportContext ctx, Entity entity, Map<String, Object> row, String sheetName, StringBuilder errorMessage) throws Exception {
        Map mapCondition = ctx.getMapCondition();
        if (mapCondition != null && mapCondition.get("isChannelCustomer") != null && Boolean.valueOf((String)mapCondition.get("isChannelCustomer")).booleanValue()) {
            return;
        }
    }
}

