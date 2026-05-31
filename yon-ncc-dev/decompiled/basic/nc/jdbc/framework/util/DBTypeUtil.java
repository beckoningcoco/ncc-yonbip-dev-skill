/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.jdbc.framework.util;

import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import nc.bs.logging.Logger;

public class DBTypeUtil {
    public static String dbTypeToString(int dbType) {
        if (dbType == 0) {
            return "DB2";
        }
        if (dbType == 1) {
            return "ORACLE";
        }
        if (dbType == 10) {
            return "DM";
        }
        if (dbType == 6) {
            return "OSCAR";
        }
        if (dbType == 2) {
            return "MSSQL";
        }
        if (dbType == 4) {
            return "INFORMIX";
        }
        if (dbType == 6) {
            return "OSCAR";
        }
        if (dbType == 5) {
            return "HSQL";
        }
        if (dbType == 3) {
            return "SYBASE";
        }
        if (dbType == 7) {
            return "POSTGRESQL";
        }
        if (dbType == 14) {
            return "KINGBASE";
        }
        if (dbType == 15) {
            return "POLARDB";
        }
        if (dbType == 9) {
            return "ALCEDO";
        }
        if (dbType == 8) {
            return "GBASE";
        }
        if (dbType == 11) {
            return "ZENITH";
        }
        if (dbType == 13) {
            return "IMPALA";
        }
        if (dbType == 12) {
            return "MYSQL";
        }
        if (dbType == 16) {
            return "HIGHGO";
        }
        return "UNKOWN";
    }

    public static int getDbType(DatabaseMetaData dmd) {
        String dpn = null;
        String url = null;
        try {
            dpn = dmd.getDatabaseProductName();
            url = dmd.getURL();
        }
        catch (SQLException exp) {
            Logger.error((Object)"get database prodcut name error", (Throwable)exp);
            return -1;
        }
        String udpn = dpn.toUpperCase();
        if (udpn.indexOf("POSTGRES") != -1) {
            if (url != null && url.startsWith("jdbc:highgo:")) {
                return 16;
            }
            return 7;
        }
        if (udpn.indexOf("POLARDB") != -1) {
            return 15;
        }
        if (udpn.indexOf("ALCEDO") != -1) {
            return 9;
        }
        if (udpn.indexOf("DB2") != -1) {
            return 0;
        }
        if (udpn.indexOf("ORACLE") != -1) {
            return 1;
        }
        if (udpn.indexOf("DM") != -1) {
            return 10;
        }
        if (udpn.indexOf("MYSQL") != -1) {
            return 12;
        }
        if (udpn.indexOf("OSCAR") != -1) {
            return 6;
        }
        if (udpn.indexOf("SQL") != -1) {
            return 2;
        }
        if (udpn.indexOf("INFORMIX") != -1) {
            return 4;
        }
        if (udpn.toUpperCase().indexOf("OSCAR") != -1) {
            return 6;
        }
        if (udpn.indexOf("HSQL") != -1) {
            return 5;
        }
        if (udpn.indexOf("SYBASE") != -1) {
            return 3;
        }
        if (udpn.indexOf("KINGBASE") != -1) {
            return 14;
        }
        if (udpn.indexOf("GBASE") != -1) {
            return 8;
        }
        if (udpn.indexOf("ZENITH") != -1) {
            return 11;
        }
        if (udpn.indexOf("IMPALA") != -1) {
            return 13;
        }
        if (udpn.indexOf("HIGHGO") != -1) {
            return 16;
        }
        return -1;
    }

    public static String getDbTypeAsString(DatabaseMetaData dmd) {
        String dpn = null;
        try {
            dpn = dmd.getDatabaseProductName();
        }
        catch (SQLException e) {
            Logger.error((Object)"get database prodcut name error", (Throwable)e);
            return "UNKOWN";
        }
        String udpn = dpn.toUpperCase();
        if (udpn.indexOf("POSTGRES") != -1) {
            return "POSTGRESQL";
        }
        if (udpn.indexOf("KINGBASE") != -1) {
            return "KINGBASE";
        }
        if (udpn.indexOf("POLARDB") != -1) {
            return "POLARDB";
        }
        if (udpn.indexOf("ALCEDO") != -1) {
            return "ALCEDO";
        }
        if (udpn.indexOf("DB2") != -1) {
            return "DB2";
        }
        if (udpn.indexOf("ORACLE") != -1) {
            return "ORACLE";
        }
        if (udpn.indexOf("DM") != -1) {
            return "DM";
        }
        if (udpn.indexOf("MYSQL") != -1) {
            return "MYSQL";
        }
        if (udpn.indexOf("OSCAR") != -1) {
            return "OSCAR";
        }
        if (udpn.indexOf("SQL") != -1) {
            return "MSSQL";
        }
        if (udpn.indexOf("INFORMIX") != -1) {
            return "INFORMIX";
        }
        if (udpn.toUpperCase().indexOf("OSCAR") != -1) {
            return "OSCAR";
        }
        if (udpn.indexOf("HSQL") != -1) {
            return "HSQL";
        }
        if (udpn.indexOf("SYBASE") != -1) {
            return "SYBASE";
        }
        if (udpn.indexOf("GBASE") != -1) {
            return "GBASE";
        }
        if (udpn.indexOf("ZENITH") != -1) {
            return "ZENITH";
        }
        if (udpn.indexOf("HIGHGO") != -1) {
            return "HIGHGO";
        }
        return dpn;
    }
}

