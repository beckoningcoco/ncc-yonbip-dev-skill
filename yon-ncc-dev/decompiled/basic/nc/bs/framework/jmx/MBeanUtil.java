/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Log
 */
package nc.bs.framework.jmx;

import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectInstance;
import javax.management.ObjectName;
import nc.bs.framework.jmx.JMXRuntimeException;
import nc.bs.logging.Log;
import nc.vo.jcom.env.EnvironmentUtil;

public class MBeanUtil {
    private static Log log = Log.getInstance(MBeanUtil.class);
    public static MBeanServer mbs;

    public static synchronized MBeanServer getMBeanServer() {
        block10: {
            try {
                if (mbs != null) break block10;
                if (EnvironmentUtil.isRunningInWebSphere()) {
                    try {
                        Class<?> adminServiceClass = null;
                        ClassLoader loader = Thread.currentThread().getContextClassLoader();
                        try {
                            adminServiceClass = loader.loadClass("com.ibm.websphere.management.AdminServiceFactory");
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                        loader = MBeanUtil.class.getClassLoader();
                        adminServiceClass = loader.loadClass("com.ibm.websphere.management.AdminServiceFactory");
                        Method getMBeanFactoryMethod = adminServiceClass.getMethod("getMBeanFactory", new Class[0]);
                        Object mbeanFactory = getMBeanFactoryMethod.invoke(null, new Object[0]);
                        Method getMBeanServerMethod = mbeanFactory.getClass().getMethod("getMBeanServer", new Class[0]);
                        mbs = (MBeanServer)getMBeanServerMethod.invoke(mbeanFactory, new Object[0]);
                    }
                    catch (Exception ex) {
                        log.error((Object)"can't get websphere MBeanServer");
                    }
                }
                if (mbs == null) {
                    if (EnvironmentUtil.isCompatible(6)) {
                        ClassLoader cl = Thread.currentThread().getContextClassLoader();
                        Class<?> clazz = cl.loadClass("java.lang.management.ManagementFactory");
                        Method method = clazz.getMethod("getPlatformMBeanServer", null);
                        mbs = (MBeanServer)method.invoke(null, null);
                    } else {
                        ArrayList<MBeanServer> list;
                        mbs = EnvironmentUtil.isRunningInWebSphere() ? MBeanServerFactory.createMBeanServer("NCFramework") : ((list = MBeanServerFactory.findMBeanServer(null)).size() > 0 ? (MBeanServer)list.get(0) : MBeanServerFactory.createMBeanServer("NCFramework"));
                    }
                }
            }
            catch (Exception exp) {
                throw new JMXRuntimeException("Init MBeanServer(NCFramework) error", exp);
            }
        }
        return mbs;
    }

    public static ObjectInstance registerMBean(Object obj, ObjectName name) {
        try {
            if (name != null && MBeanUtil.getMBeanServer().isRegistered(name)) {
                MBeanUtil.getMBeanServer().unregisterMBean(name);
            }
            return MBeanUtil.getMBeanServer().registerMBean(obj, name);
        }
        catch (Throwable e) {
            log.error((Object)("regist " + name + " error"), e);
            return null;
        }
    }

    public static void unregisterMBean(ObjectName name) {
        try {
            if (name != null && MBeanUtil.getMBeanServer().isRegistered(name)) {
                MBeanUtil.getMBeanServer().unregisterMBean(name);
            }
        }
        catch (Throwable e) {
            log.error((Object)("unregister " + name + " error"), e);
        }
    }
}

