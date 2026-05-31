/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.uap.IUAPQueryBS
 *  nc.itf.uap.IVOPersistence
 */
package nc.itf.uap.pa;

import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
import nc.itf.uap.IVOPersistence;
import nc.itf.uap.pa.IPreAlertConfigQueryService;
import nc.itf.uap.pa.IPreAlertConfigService;
import nc.itf.uap.pa.IPreAlertDB;

public class PreAlertServiceLocator {
    public static IPreAlertConfigService getConfigService() {
        return (IPreAlertConfigService)NCLocator.getInstance().lookup(IPreAlertConfigService.class);
    }

    public static IPreAlertConfigQueryService getQueryService() {
        return (IPreAlertConfigQueryService)NCLocator.getInstance().lookup(IPreAlertConfigQueryService.class);
    }

    public static IPreAlertDB getDBService() {
        return (IPreAlertDB)NCLocator.getInstance().lookup(IPreAlertDB.class);
    }

    public static IUAPQueryBS getUAPQueryService() {
        return (IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class);
    }

    public static IVOPersistence getUAPPersistenceService() {
        return (IVOPersistence)NCLocator.getInstance().lookup(IVOPersistence.class);
    }
}

