/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.jdbc.framework.ConnectionFactory
 *  nc.jdbc.framework.processor.ColumnProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.fipub.utils.SqlBuilder
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import nc.bs.dao.BaseDAO;
import nc.jdbc.framework.ConnectionFactory;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.fipub.utils.SqlBuilder;
import nc.vo.pub.BusinessException;

public class ArapDataBaseUtil {
    public static boolean isTableExist(String tableName) throws BusinessException {
        try {
            Integer result;
            int databaseType = SqlBuilder.getDatabaseType();
            String sql = "";
            if (7 == databaseType || 14 == databaseType || 15 == databaseType ? (result = (Integer)new BaseDAO().executeQuery(sql = "select count(1) from pg_class where relname = '" + tableName.toLowerCase() + "'", (ResultSetProcessor)new ColumnProcessor())) != null && 1 == result : (result = (Integer)new BaseDAO().executeQuery(sql = "select count(1) from " + tableName.toLowerCase(), (ResultSetProcessor)new ColumnProcessor())) != null) {
                return true;
            }
        }
        catch (Exception e) {
            return false;
        }
        return false;
    }

    public static String getDbType() throws BusinessException {
        String m_dbname = null;
        try {
            Connection con = ConnectionFactory.getConnection();
            DatabaseMetaData dmd = con.getMetaData();
            String dpn = dmd.getDatabaseProductName().toUpperCase();
            if (dpn.indexOf("POSTGRESQL") != -1) {
                m_dbname = "POSTGRESQL";
            } else if (dpn.indexOf("DB2") != -1) {
                m_dbname = "DB2";
            } else if (dpn.indexOf("ORACLE") != -1) {
                m_dbname = "ORACLE";
            } else if (dpn.indexOf("SQL") != -1) {
                m_dbname = "SQL";
            } else if (dpn.indexOf("INFORMIX") != -1) {
                m_dbname = "INFORMIX";
            } else if (dpn.indexOf("OSCAR") != -1) {
                m_dbname = "OSCAR";
            } else if (dpn.indexOf("GBASE") != -1) {
                m_dbname = "GBASE";
            }
        }
        catch (SQLException e) {
            throw new BusinessException(e.getMessage(), (Throwable)e);
        }
        return m_dbname;
    }
}

