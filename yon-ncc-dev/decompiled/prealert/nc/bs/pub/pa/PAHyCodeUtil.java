/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.framework.common.RuntimeEnv
 *  nc.bs.framework.common.UserExit
 *  nc.bs.logging.Logger
 *  nc.vo.jcom.lang.StringUtil
 */
package nc.bs.pub.pa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.framework.common.RuntimeEnv;
import nc.bs.framework.common.UserExit;
import nc.bs.logging.Logger;
import nc.itf.uap.pa.IPreAlertNCService;
import nc.vo.jcom.lang.StringUtil;

public class PAHyCodeUtil {
    public static final String DEFAULT_HY = "0";
    public static final String ENTRY_KEY = "belongNCIndustryCode";
    public static final String INDUSTRY_CONFIG = RuntimeEnv.getInstance().getNCHome() + "/ierp/bin/industry_config.xml";
    private static String systemHYCode = null;

    public static String getDefaultHyCode() {
        return DEFAULT_HY;
    }

    public static String getClientHyCode() {
        if (RuntimeEnv.getInstance().isRunningInServer()) {
            String hyCode = InvocationInfoProxy.getInstance().getHyCode();
            if (StringUtil.isEmptyWithTrim((String)hyCode)) {
                try {
                    String pk_group = InvocationInfoProxy.getInstance().getGroupId();
                    hyCode = ((IPreAlertNCService)NCLocator.getInstance().lookup(IPreAlertNCService.class)).getIndustryCodeOfGroup(pk_group);
                }
                catch (Exception e) {
                    Logger.error((Object)e.getMessage(), (Throwable)e);
                }
            }
            if (StringUtil.isEmptyWithTrim((String)hyCode)) {
                return DEFAULT_HY;
            }
            return hyCode;
        }
        return UserExit.getInstance().getHyCode();
    }

    public static String getServerHyCode() {
        if (StringUtil.isEmptyWithTrim((String)systemHYCode)) {
            Properties p = new Properties();
            FileInputStream is = null;
            try {
                is = new FileInputStream(INDUSTRY_CONFIG);
                p.loadFromXML(is);
                systemHYCode = p.getProperty(ENTRY_KEY);
            }
            catch (Exception e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
            finally {
                if (is != null) {
                    try {
                        ((InputStream)is).close();
                    }
                    catch (IOException e) {
                        Logger.error((Object)e);
                    }
                }
                if (StringUtil.isEmptyWithTrim((String)systemHYCode)) {
                    systemHYCode = DEFAULT_HY;
                }
            }
        }
        return systemHYCode;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void setServerHyCode(String hyCode) {
        Properties p = new Properties();
        p.put(ENTRY_KEY, hyCode);
        FileOutputStream os = null;
        try {
            os = new FileOutputStream(INDUSTRY_CONFIG);
            p.storeToXML(os, null);
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        finally {
            if (os != null) {
                try {
                    ((OutputStream)os).close();
                }
                catch (IOException e) {
                    Logger.error((Object)e.getMessage(), (Throwable)e);
                }
            }
        }
    }
}

