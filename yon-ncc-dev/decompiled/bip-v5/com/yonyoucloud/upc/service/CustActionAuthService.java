/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.sys.service.ActionAuthService
 *  com.yonyou.ucf.mdd.interfaces.ICustActionAuthService
 *  org.imeta.spring.support.db.OrmException
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.yonyou.ucf.mdd.ext.sys.service.ActionAuthService;
import com.yonyou.ucf.mdd.interfaces.ICustActionAuthService;
import org.imeta.spring.support.db.OrmException;
import org.springframework.stereotype.Service;

@Service
public class CustActionAuthService
extends ActionAuthService
implements ICustActionAuthService {
    public String findAuthId(String billnumber, String url, String action) throws OrmException {
        if (null == action) {
            return this.defaultFindAuthId(billnumber, url, action);
        }
        if ("addProductFromApply".equals(action) && "pc_product".equals(billnumber)) {
            return null;
        }
        if ("addMerchantFromApply".equals(action)) {
            return null;
        }
        return this.defaultFindAuthId(billnumber, url, action);
    }

    public String findAuthId(String billnumber, String url, String action, String cmdName) throws OrmException {
        if ("/bill/check".equals(url)) {
            return null;
        }
        if ("pc_product".equals(billnumber) && "addProductFromApply".equals(action)) {
            return "pc_productapplylist";
        }
        if ("pc_product".equals(billnumber) && "changeProductFromApply".equals(action)) {
            return "pc_productapplylist";
        }
        if ("aa_merchant".equals(billnumber) && "addMerchantFromApply".equals(action)) {
            return "aa_customerapplylist";
        }
        if ("aa_merchant".equals(billnumber) && "changeMerchantFromApply".equals(action)) {
            return "aa_customerapplylist";
        }
        return this.defaultFindAuthId(billnumber, url, action, cmdName);
    }
}

