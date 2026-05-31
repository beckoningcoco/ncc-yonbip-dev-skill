/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.data.service.itf.TenantStatusApi
 *  com.yonyou.iuap.service.MCSetManageService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.poi.api.ImportProvilegeChecking
 *  com.yonyou.ucf.mdd.ext.poi.context.ImportContext
 *  org.imeta.core.model.Entity
 *  org.springframework.boot.autoconfigure.condition.ConditionalOnClass
 *  org.springframework.core.annotation.Order
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.data.service.itf.TenantStatusApi;
import com.yonyou.iuap.service.MCSetManageService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.poi.api.ImportProvilegeChecking;
import com.yonyou.ucf.mdd.ext.poi.context.ImportContext;
import com.yonyou.ucf.mdd.ext.poi.impl.DefaultHierarchyControlCheckingImpl;
import java.util.Map;
import org.imeta.core.model.Entity;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnClass(value={MCSetManageService.class, TenantStatusApi.class})
@Order(value=2)
public class MyHierarchyControlCheckingImpl
implements ImportProvilegeChecking {
    private DefaultHierarchyControlCheckingImpl check = new DefaultHierarchyControlCheckingImpl();

    public void checkPrivilege(ImportContext ctx, Entity entity, Map<String, Object> row, String sheetName, StringBuilder errorMessage) throws Exception {
        LoginUser currentUser = AppContext.getCurrentUser();
        Map mapCondition = ctx.getMapCondition();
        if (mapCondition != null && mapCondition.get("isChannelCustomer") != null && Boolean.valueOf((String)mapCondition.get("isChannelCustomer")).booleanValue()) {
            return;
        }
        switch (currentUser.getUserType()) {
            case TenantAdmin: 
            case TenantEmployee: {
                break;
            }
            case JoinUser: 
            case TenantShopuser: {
                break;
            }
            case ShopAdminUser: 
            case ShopUser: {
                ctx.setOrgType("single");
                break;
            }
            default: {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800381, new Object[]{currentUser.getUserType()});
            }
        }
        this.check.checkPrivilege(ctx, entity, row, sheetName, errorMessage);
    }
}

