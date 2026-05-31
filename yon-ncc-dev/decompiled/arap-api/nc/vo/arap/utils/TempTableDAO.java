/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.framework.component.RemoteProcessComponent
 *  nc.bs.framework.component.RemoteProcessComponetFactory
 *  nc.bs.logging.Log
 *  nc.bs.mw.sqltrans.TempTable
 *  nc.bs.pub.SystemException
 *  nc.jdbc.framework.JdbcSession
 *  nc.jdbc.framework.PersistenceManager
 *  nc.jdbc.framework.SQLParameter
 *  nc.jdbc.framework.crossdb.CrossDBConnection
 *  nc.jdbc.framework.exception.DbException
 *  nc.vo.fip.pub.TempTableCleaner
 */
package nc.vo.arap.utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.naming.NamingException;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.framework.component.RemoteProcessComponent;
import nc.bs.framework.component.RemoteProcessComponetFactory;
import nc.bs.logging.Log;
import nc.bs.mw.sqltrans.TempTable;
import nc.bs.pub.SystemException;
import nc.jdbc.framework.JdbcSession;
import nc.jdbc.framework.PersistenceManager;
import nc.jdbc.framework.SQLParameter;
import nc.jdbc.framework.crossdb.CrossDBConnection;
import nc.jdbc.framework.exception.DbException;
import nc.vo.fip.pub.TempTableCleaner;

public class TempTableDAO {
    public TempTableDAO() throws NamingException, SystemException {
    }

    public TempTableDAO(String dbName) throws NamingException, SystemException {
    }

    public static int getTmpTableMinCount() {
        return 200;
    }

    public String createTable(String tableName, String colName1, String colDataType1, Object[] values) throws SQLException {
        List<Object> lst = Arrays.asList(values);
        return this.createTable(tableName, colName1, colDataType1, lst);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String createTable(String tableName, String colName1, String colDataType1, List lst) throws SQLException {
        Connection con = null;
        JdbcSession session = this.getJdbcSession();
        try {
            con = this.getConnection();
            if (colName1.indexOf(",ts") == -1) {
                session.setAddTimeStamp(false);
            }
            TempTable tmpTool = new TempTable();
            String tgtTable = tmpTool.createTempTable(con, tableName, colName1 + " " + colDataType1, null);
            String sql_insert = "insert into " + tgtTable + " (" + colName1 + ")  values(?) ";
            Iterator iter = lst.iterator();
            Object value = null;
            while (iter.hasNext()) {
                Object obj = iter.next();
                value = obj;
                SQLParameter sqlParam = new SQLParameter();
                sqlParam.addParam(value);
                session.addBatch(sql_insert, sqlParam);
            }
            session.executeBatch();
            String string = tgtTable;
            return string;
        }
        catch (Exception e) {
            Log.getInstance(this.getClass()).error((Object)e.getMessage());
            String string = null;
            return string;
        }
        finally {
            if (session != null) {
                session.closeAll();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String createTable(String tableName, String[] colNames, String[] dataTypes) throws SQLException {
        String tabname = null;
        try (Connection con = null;){
            String processname;
            con = this.getConnection();
            TempTable tmpTool = new TempTable();
            String colName1andDataType = "";
            String colName_insert = "";
            String value_insert = "";
            for (int i = 0; i < colNames.length; ++i) {
                String temp = "";
                if (i > 0) {
                    temp = temp + ",";
                    colName_insert = colName_insert + ",";
                    value_insert = value_insert + ",";
                }
                temp = temp + colNames[i] + " " + dataTypes[i];
                colName1andDataType = colName1andDataType + temp;
                colName_insert = colName_insert + colNames[i];
                value_insert = value_insert + "?";
            }
            colName1andDataType = colName1andDataType + ",ts varchar(19) ";
            tabname = tmpTool.createTempTable(con, tableName, colName1andDataType, null);
            RemoteProcessComponetFactory irc = (RemoteProcessComponetFactory)NCLocator.getInstance().lookup("RemoteProcessComponetFactory");
            RemoteProcessComponent threadScopePostProcess = irc.getThreadScopePostProcess(processname = TempTableCleaner.class.getName());
            if (threadScopePostProcess == null) {
                TempTableCleaner cleaner = new TempTableCleaner();
                cleaner.addTable(tableName);
                irc.addThreadScopePostProcess(processname, (RemoteProcessComponent)cleaner);
            } else if (threadScopePostProcess instanceof TempTableCleaner) {
                ((TempTableCleaner)threadScopePostProcess).addTable(tableName);
            } else {
                TempTableCleaner cleaner = new TempTableCleaner();
                cleaner.addTable(tableName);
                irc.addThreadScopePostProcess(processname + tableName, (RemoteProcessComponent)cleaner);
            }
        }
        return tabname;
    }

    public String createTable(String tableName, String[] colNames, String[] dataTypes, Object[][] datas) throws SQLException, DbException {
        String tn = this.createTable(tableName, colNames, dataTypes);
        this.insertIntoTable(tn, colNames, dataTypes, datas);
        return tableName;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void insertIntoTable(String tableName, String[] colNames, String[] dataTypes, Object[][] datas) throws SQLException, DbException {
        Connection con = null;
        JdbcSession session = this.getJdbcSession();
        try {
            con = this.getConnection();
            if (con instanceof CrossDBConnection) {
                ((CrossDBConnection)con).setAddTimeStamp(false);
            }
            String colName_insert = "";
            String value_insert = "";
            for (int i = 0; i < colNames.length; ++i) {
                if (i > 0) {
                    colName_insert = colName_insert + ",";
                    value_insert = value_insert + ",";
                }
                colName_insert = colName_insert + colNames[i];
                value_insert = value_insert + "?";
            }
            String sql_insert = "insert into " + tableName + " (" + colName_insert + ")  values(" + value_insert + ") ";
            for (int i = 0; i < datas.length; ++i) {
                Object[] row = datas[i];
                SQLParameter sqlParam = new SQLParameter();
                for (int j = 0; j < row.length; ++j) {
                    Object obj = row[j];
                    String value = (String)obj;
                    sqlParam.addParam(value);
                }
                session.addBatch(sql_insert, sqlParam);
            }
            session.executeBatch();
        }
        finally {
            if (session != null) {
                session.closeAll();
            }
        }
    }

    private JdbcSession getJdbcSession() {
        PersistenceManager manager = null;
        JdbcSession session = null;
        try {
            manager = PersistenceManager.getInstance((String)this.getds());
        }
        catch (DbException e) {
            Log.getInstance(this.getClass()).error((Object)e.getMessage(), (Throwable)e);
        }
        session = manager.getJdbcSession();
        return session;
    }

    private String getds() {
        return InvocationInfoProxy.getInstance().getUserDataSource();
    }

    private Connection getConnection() {
        JdbcSession session = this.getJdbcSession();
        return session.getConnection();
    }
}

