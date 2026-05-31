/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.loginNew.LoginUserExtendInterface
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.mdd.ext;

import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.loginNew.LoginUserExtendInterface;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class LoginUserExtendInterfaceImpl
implements LoginUserExtendInterface {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public <T> T get(String key) {
        if (null == key) return null;
        if ("shopId".equals(key) || "shop".equals(key) || "cust".equals(key)) {
            if (null == AppContext.getCurrentUser().getIsSingleOrg() || !AppContext.getCurrentUser().getIsSingleOrg().booleanValue()) return (T)Long.valueOf(-1L);
            if (AppContext.getCurrentUser().getUserType() == UserType.ShopAdminUser || AppContext.getCurrentUser().getUserType() == UserType.ShopUser) {
                return (T)(AppContext.getCurrentUser().getDocId() == null ? Long.valueOf(-1L) : Long.valueOf(AppContext.getCurrentUser().getDocId()));
            }
            if (AppContext.getCurrentUser().getUserType() != UserType.TenantAdmin && AppContext.getCurrentUser().getUserType() != UserType.TenantEmployee) return null;
            return (T)Long.valueOf(-1L);
        }
        if ("singleOrgId".equals(key)) {
            if (AppContext.getCurrentUser().getUserType() == UserType.ShopAdminUser || AppContext.getCurrentUser().getUserType() == UserType.ShopUser) {
                return (T)AppContext.getCurrentUser().getDocId();
            }
            if (!AppContext.getCurrentUser().getIsSingleOrg().booleanValue()) return (T)Integer.valueOf(-1);
            return (T)AppContext.getCurrentUser().getOrgId();
        }
        if (!"yht_isAdmin".equals(key)) return null;
        return (T)Boolean.valueOf(UserType.TenantAdmin == AppContext.getCurrentUser().getUserType());
    }

    public Set<String> getExtendKeys() {
        HashSet<String> keys = new HashSet<String>();
        keys.add("shopId");
        keys.add("shop");
        keys.add("cust");
        keys.add("singleOrgId");
        keys.add("yht_isAdmin");
        return keys;
    }
}

