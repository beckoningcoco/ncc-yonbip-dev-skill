/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.env;

import java.io.File;
import java.util.StringTokenizer;
import nc.vo.jcom.util.ClassUtil;

public abstract class EnvironmentUtil {
    private static String[] m_strOsKey = new String[]{"windows", "solaris", "aix", "linux"};
    private static int m_iOsType = -1;
    public static final int WINDOWS = 0;
    public static final int SOLARIS = 1;
    public static final int AIX = 2;
    public static final int LINUX = 3;
    public static final int UNKNOWUNIX = 100;
    public static final int VERSION_1_0 = 1;
    public static final int VERSION_1_1 = 2;
    public static final int VERSION_1_2 = 3;
    public static final int VERSION_1_3 = 4;
    public static final int VERSION_1_4 = 5;
    public static final int VERSION_1_5 = 6;
    private static final int VERSION;
    private static final String WLS_JNDI_CONTEXT = "weblogic.jndi.WLInitialContextFactory";
    private static final String WAS_JNDI_CONTEXT = "com.ibm.websphere.naming.WsnInitialContextFactory";
    private static Boolean isRunningInWebSphere;
    private static Boolean isRunningInWeblogic;

    public static String getOsName() {
        return System.getProperty("os.name");
    }

    public static int getOsType() {
        if (m_iOsType == -1) {
            String strOsName = EnvironmentUtil.getOsName();
            for (int i = 0; i < m_strOsKey.length; ++i) {
                if (strOsName.toLowerCase().indexOf(m_strOsKey[i]) == -1) continue;
                m_iOsType = i;
                break;
            }
            if (m_iOsType == -1) {
                m_iOsType = 100;
            }
        }
        return m_iOsType;
    }

    public static String convert2LocalPath(String oldFilePath) {
        if (null == oldFilePath) {
            return null;
        }
        String filePath = oldFilePath.replace('\\', '/');
        StringTokenizer st = new StringTokenizer(filePath, "/");
        StringBuffer newPath = new StringBuffer();
        String strFileSep = EnvironmentUtil.getPathPad();
        while (st.hasMoreElements()) {
            String str = st.nextElement().toString();
            newPath.append(str);
            if (!st.hasMoreElements()) break;
            newPath.append(strFileSep);
        }
        return newPath.toString();
    }

    public static String getPathPad() {
        return File.separator;
    }

    public static String getUserDir() {
        return System.getProperty("user.dir");
    }

    public static int getVersion() {
        return VERSION;
    }

    public static boolean isVersion(int version) {
        return VERSION == version;
    }

    public static boolean isCompatible(int version) {
        return VERSION >= version;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean isRunningInWebSphere() {
        if (isRunningInWebSphere != null) return isRunningInWebSphere;
        Class<EnvironmentUtil> clazz = EnvironmentUtil.class;
        synchronized (EnvironmentUtil.class) {
            if (isRunningInWebSphere != null) return isRunningInWebSphere;
            String s = System.getProperty("nc.target.platform");
            if (s != null) {
                isRunningInWebSphere = "was".equals(s) ? Boolean.valueOf(true) : Boolean.valueOf(false);
            } else {
                try {
                    ClassUtil.loadClass(WAS_JNDI_CONTEXT);
                    isRunningInWebSphere = true;
                }
                catch (Throwable throwable) {
                    isRunningInWebSphere = false;
                }
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return isRunningInWebSphere;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean isRunningInWeblogic() {
        if (isRunningInWeblogic != null) return isRunningInWeblogic;
        Class<EnvironmentUtil> clazz = EnvironmentUtil.class;
        synchronized (EnvironmentUtil.class) {
            if (isRunningInWeblogic != null) return isRunningInWeblogic;
            String s = System.getProperty("nc.target.platform");
            if (s != null) {
                isRunningInWeblogic = "wls".equals(s) ? Boolean.valueOf(true) : Boolean.valueOf(false);
            } else {
                try {
                    ClassUtil.loadClass(WLS_JNDI_CONTEXT);
                    isRunningInWeblogic = true;
                }
                catch (Throwable throwable) {
                    isRunningInWeblogic = false;
                }
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return isRunningInWeblogic;
        }
    }

    static {
        int version = 1;
        try {
            Class.forName("java.lang.Void");
            version = 2;
            Class.forName("java.lang.ThreadLocal");
            version = 3;
            Class.forName("java.lang.StrictMath");
            version = 4;
            Class.forName("java.lang.StackTraceElement");
            version = 5;
            Class.forName("java.lang.Enum");
            version = 6;
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        VERSION = version;
    }
}

