/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.util;

import java.awt.Dimension;
import java.awt.Toolkit;

public class OSUtil {
    public static final int WINDOWS = 0;
    public static final int SOLARIS = 1;
    public static final int AIX = 2;
    public static final int LINUX = 3;
    public static final int UNKNOWSYSTEM = -1;
    private static String[] OS_NAME = new String[]{"windows", "solaris", "aix", "linux"};
    private static int m_iOSType = -1;
    private static String m_strOSName;

    public static String getOSName() {
        if (m_strOSName == null) {
            m_strOSName = System.getProperty("os.name");
        }
        return m_strOSName;
    }

    public static int getOSType() {
        return m_iOSType;
    }

    public static boolean isWindows() {
        return OSUtil.getOSType() == 0;
    }

    public static Dimension getScreenSize() {
        return Toolkit.getDefaultToolkit().getScreenSize();
    }

    public static String getUserHome() {
        return System.getProperty("user.home");
    }

    public static String getFileExt() {
        if (OSUtil.isWindows()) {
            return ".bat";
        }
        return ".sh";
    }

    public static void main(String[] args) {
        System.out.println(OSUtil.getOSName());
        System.out.println(OSUtil.isWindows());
        System.out.println(OSUtil.getUserHome());
    }

    static {
        String name = OSUtil.getOSName().toLowerCase();
        for (int i = 0; i < OS_NAME.length; ++i) {
            if (name.indexOf(OS_NAME[i]) == -1) continue;
            m_iOSType = i;
            break;
        }
        m_strOSName = null;
    }
}

