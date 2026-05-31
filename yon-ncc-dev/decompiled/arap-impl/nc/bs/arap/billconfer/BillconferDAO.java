/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.vo.arap.billconfer.BillVO
 *  nc.vo.arap.billconfer.BillconferVO
 */
package nc.bs.arap.billconfer;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.vo.arap.billconfer.BillVO;
import nc.vo.arap.billconfer.BillconferVO;

public class BillconferDAO {
    BaseDAO basedao = new BaseDAO();

    public BillconferVO findByPrimaryKey(String key) throws SQLException, DAOException {
        String cond = "where pk_bconfer = '" + key + "' and dr=0";
        List ret = (List)this.basedao.retrieveByClause(BillconferVO.class, cond);
        return (BillconferVO)ret.get(0);
    }

    public BillconferVO[] queryConfigInfo(String pk_corp, Vector vAccountIds) throws DAOException {
        String sql = "";
        String sOrderBy = " order by Docontrol,Sourcecorp";
        StringBuffer sWhere = new StringBuffer();
        sWhere.append(" pk_accid='~' and dr=0 and busitype is not null ");
        sql = pk_corp != null ? sql + " and (" + sWhere + ")" : sql + " where " + sWhere;
        sql = sql + sOrderBy;
        List ret = (List)this.basedao.retrieveByClause(BillconferVO.class, sql);
        return ret.toArray(new BillconferVO[0]);
    }

    public BillVO updateBill(BillVO vo) throws DAOException {
        this.updateBillHeaders(vo);
        return vo;
    }

    public void updateBillHeaders(BillVO dJZBHeader) throws DAOException {
    }
}

