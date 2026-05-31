/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.pubitf.arap.receivable.IArapReceivableBillPubServiceForCT
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.pubimpl.arap.receivable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.pubitf.arap.receivable.IArapReceivableBillPubServiceForCT;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public class ArapReceivableBillPubServiceForCTImpl
implements IArapReceivableBillPubServiceForCT {
    public Map<String, UFDouble> queryBalanceByCTpks(String[] ctpks) throws BusinessException {
        StringBuffer sql = new StringBuffer();
        sql.append("select top_billid, sum (money_bal) ");
        sql.append("from ").append("ar_recitem");
        sql.append(" where ");
        try {
            sql.append(SqlUtils.getInStr((String)"top_billid", (String[])ctpks, (boolean[])new boolean[]{true})).append(" and ");
        }
        catch (SQLException e) {
            sql.append(" (0 = 1) and ");
        }
        sql.append("dr = 0 ");
        sql.append("group by top_billid");
        final HashMap<String, UFDouble> ret = new HashMap<String, UFDouble>();
        new BaseDAO().executeQuery(sql.toString(), new ResultSetProcessor(){
            private static final long serialVersionUID = 1L;

            public Object handleResultSet(ResultSet rs) throws SQLException {
                while (rs.next()) {
                    ret.put(rs.getString(1), new UFDouble(rs.getDouble(2)));
                }
                return null;
            }
        });
        return ret;
    }
}

