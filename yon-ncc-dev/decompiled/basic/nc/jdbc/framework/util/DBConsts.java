/*
 * Decompiled with CFR 0.152.
 */
package nc.jdbc.framework.util;

public interface DBConsts {
    public static final int DB2 = 0;
    public static final int ORACLE = 1;
    public static final int SQLSERVER = 2;
    public static final int SYBASE = 3;
    public static final int INFORMIX = 4;
    public static final int HSQL = 5;
    public static final int OSCAR = 6;
    public static final int POSTGRESQL = 7;
    public static final int GBASE = 8;
    public static final int ALCEDO = 9;
    public static final int DM = 10;
    public static final int GAUSS = 11;
    public static final int MYSQL = 12;
    public static final int IMPALA = 13;
    public static final int KINGBASE = 14;
    public static final int POLARDB = 15;
    public static final int HIGHGO = 16;
    public static final int UNKOWNDATABASE = -1;
    public static final String DEFAULT_DATABASE_ID = "default_database";
    public static final String ORACLE_NAME = "ORACLE";
    public static final String MSSQL_NAME = "MSSQL";
    public static final String DB2_NAME = "DB2";
    public static final String HSQL_NAME = "HSQL";
    public static final String SYBASE_NAME = "SYBASE";
    public static final String INFORMIX_NAME = "INFORMIX";
    public static final String OSCAR_NAME = "OSCAR";
    public static final String POSTGRESQL_NAME = "POSTGRESQL";
    public static final String ALCEDO_NAME = "ALCEDO";
    public static final String GBASE_NAME = "GBASE";
    public static final String DM_NAME = "DM";
    public static final String GAUSS_NAME = "ZENITH";
    public static final String MYSQL_NAME = "MYSQL";
    public static final String IMPALA_NAME = "IMPALA";
    public static final String KINGBASE_NAME = "KINGBASE";
    public static final String POLARDB_NAME = "POLARDB";
    public static final String HIGHGO_NAME = "HIGHGO";
    public static final String UNKOWN_NAME = "UNKOWN";
    public static final String JDBC_ODBC = "sun.jdbc.odbc.JdbcOdbcDriver";
    public static final String JDBC_DB2_NET = "COM.ibm.db2.jdbc.net.DB2Driver";
    public static final String JDBC_DB2_APP = "COM.ibm.db2.jdbc.app.DB2Driver";
    public static final String JDBC_ORACLE = "oracle.jdbc.driver.OracleDriver";
    public static final String JDBC_SYBASE = "com.sybase.jdbc.SybDriver";
    public static final String JDBC_GBASE = "com.gbase.jdbc.Driver";
    public static final String JDBC_OSCAR = "com.oscar.Driver";
    public static final String JDBC_DM = "dm.jdbc.driver.DmDriver";
    public static final String JDBC_GAUSS = "com.huawei.gauss.jdbc.ZenithDriver";
    public static final String JDBC_MYSQL = "com.mysql.cj.jdbc.Driver";
    public static final String JDBC_KINGBASE = "com.kingbase8.Driver";
    public static final String JDBC_POSTGRESQL = "org.postgresql.Driver";
    public static final String JDBC_POLARDB = "com.aliyun.polardb.Driver";
    public static final String JDBC_HIGHGO = "com.highgo.jdbc.Driver";
    public static final String URL_PREFIX = "jdbc:ufsoft:jdbcDriver";
    public static final int MAJOR_VERSION = 1;
    public static final int MINOR_VERSION = 0;
    public static final String JdbcOdbcBridgeName = "JDBC-ODBC Bridge";
    public static final String JDBC_INFORMIX = "com.informix.jdbc.IfxDriver";
    public static final String JDBC_SQLSERVER = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
    public static final int SQL_SELECT = 1;
    public static final int SQL_INSERT = 2;
    public static final int SQL_CREATE = 3;
    public static final int SQL_DROP = 4;
    public static final int SQL_DELETE = 5;
    public static final int SQL_UPDATE = 6;
    public static final int SQL_EXPLAIN = 7;
    public static final String[] functions = new String[]{"coalesce", "len", "left", "right", "substring", "lower", "upper", "ltrim", "rtrim", "sqrt", "abs", "square", "sign", "count", "max", "min", "sum", "avg", "cast"};
    public static final String NULL_WAVE = "~";
}

