/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.sm.accountmanage.IUpdateAccount
 *  nc.jdbc.framework.ConnectionFactory
 *  nc.jdbc.framework.processor.BeanListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.pf.change.ExchangeVO
 */
package nc.bs.arap.initdata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.sm.accountmanage.IUpdateAccount;
import nc.jdbc.framework.ConnectionFactory;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.pf.change.ExchangeVO;

public class PmVOChangeForArapBO
implements IUpdateAccount {
    private BaseDAO baseDAO = new BaseDAO();
    public static final String V636 = "6.5.";
    public static final String V651 = "6.51";
    public static final String V653 = "6.53";
    public static final String VNCC1903 = "NC Cloud 1903";
    public static final String VNCC1909 = "NC Cloud 1909";

    public void doBeforeUpdateData(String oldVersion, String newVersion) throws Exception {
    }

    public void doAfterUpdateData(String oldVersion, String newVersion) throws Exception {
    }

    public void doBeforeUpdateDB(String oldVersion, String newVersion) throws Exception {
        if ((oldVersion.startsWith(V636) || oldVersion.startsWith(VNCC1903)) && newVersion.startsWith(VNCC1909)) {
            this.deletePMGlobal();
        }
    }

    private void deletePMGlobal() throws DAOException, SQLException {
        HashSet<String> pkList = new HashSet<String>();
        StringBuffer sql = new StringBuffer();
        String dbType = this.getDbType();
        if ("SQL".equalsIgnoreCase(dbType)) {
            sql.append("SELECT  * FROM  pub_vochange WHERE src_billtype LIKE '4D%' AND LEN(src_billtype) = 4 AND dest_billtype IN('F0','F1','F2','F3' ) ORDER BY dest_billtype;");
        } else {
            sql.append("SELECT  * FROM  pub_vochange WHERE src_billtype LIKE '4D%' AND LENGTH(src_billtype) = 4 AND dest_billtype IN('F0','F1','F2','F3' ) ORDER BY dest_billtype;");
        }
        List exchangeVOList1 = (List)this.baseDAO.executeQuery(sql.toString(), (ResultSetProcessor)new BeanListProcessor(ExchangeVO.class));
        for (ExchangeVO changeVO : exchangeVOList1) {
            pkList.add(changeVO.getPk_vochange());
        }
        if (pkList.size() > 0) {
            int i;
            sql.delete(0, sql.length());
            sql.append(" delete from pub_vochange WHERE pk_vochange in(");
            ArrayList<String> pkListTemp = new ArrayList<String>();
            pkListTemp.addAll(pkList);
            for (i = 0; i < pkListTemp.size(); ++i) {
                if (i != pkListTemp.size() - 1) {
                    sql.append("'").append((String)pkListTemp.get(i)).append("',");
                    continue;
                }
                sql.append("'").append((String)pkListTemp.get(i)).append("'");
            }
            sql.append(" )");
            this.baseDAO.executeUpdate(sql.toString());
            sql.delete(0, sql.length());
            sql.append(" delete from pub_vochange_b WHERE pk_vochange in(");
            for (i = 0; i < pkListTemp.size(); ++i) {
                if (i != pkListTemp.size() - 1) {
                    sql.append("'").append((String)pkListTemp.get(i)).append("',");
                    continue;
                }
                sql.append("'").append((String)pkListTemp.get(i)).append("'");
            }
            sql.append(" )");
            this.baseDAO.executeUpdate(sql.toString());
        }
    }

    private String getDbType() throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        String m_dbname = "";
        DatabaseMetaData dmd = con.getMetaData();
        String dpn = dmd.getDatabaseProductName();
        if (dpn.toUpperCase().indexOf("POSTGRESQL") != -1) {
            m_dbname = "POSTGRESQL";
        }
        if (dpn.toUpperCase().indexOf("DB2") != -1) {
            m_dbname = "DB2";
        }
        if (dpn.toUpperCase().indexOf("ORACLE") != -1) {
            m_dbname = "ORACLE";
        }
        if (dpn.toUpperCase().indexOf("SQL") != -1) {
            m_dbname = "SQL";
        }
        if (dpn.toUpperCase().indexOf("INFORMIX") != -1) {
            m_dbname = "INFORMIX";
        }
        if (dpn.toUpperCase().indexOf("OSCAR") != -1) {
            m_dbname = "OSCAR";
        }
        if (dpn.toUpperCase().indexOf("GBASE") != -1) {
            m_dbname = "GBASE";
        }
        return m_dbname;
    }
}

