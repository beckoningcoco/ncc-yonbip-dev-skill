/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.logging.Logger
 *  nc.jdbc.framework.JdbcSession
 *  nc.jdbc.framework.PersistenceManager
 *  nc.jdbc.framework.exception.DbException
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.arap.pub.BillEnumCollection$FromSystem
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.arap.receivable.ReceivableBillItemVO
 *  nc.vo.arap.receivable.ReceivableBillVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.bs.arap.receiveablebp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.logging.Logger;
import nc.jdbc.framework.JdbcSession;
import nc.jdbc.framework.PersistenceManager;
import nc.jdbc.framework.exception.DbException;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.arap.receivable.ReceivableBillItemVO;
import nc.vo.arap.receivable.ReceivableBillVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public class RecBillDAO
extends ArapBillDAO {
    public Map<String, UFDouble> getNewCoustomBanlanceByCubasdoc(String[] pk_cubasdoc, String pk_org) throws BusinessException {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        Hashtable<String, UFDouble> hRe = new Hashtable<String, UFDouble>();
        try {
            String wherein = SqlUtils.getInStr((String)"fb.customer", (String[])pk_cubasdoc, (boolean[])new boolean[]{true});
            String sql = "select sum(fb.local_money_bal) ye,fb.customer customer from ar_recitem fb where fb.pk_org =? and fb.top_tradetype <> '33' and" + wherein + "  and fb.dr=0 group by fb.customer";
            con = this.getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setString(1, pk_org);
            rs = stmt.executeQuery();
            while (rs.next()) {
                hRe.put(rs.getString(1), new UFDouble(rs.getDouble(2)));
            }
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
        finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            }
            catch (Exception e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
            try {
                if (con != null) {
                    con.close();
                }
            }
            catch (Exception e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
            try {
                if (rs != null) {
                    rs.close();
                }
            }
            catch (Exception e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
        }
        return hRe;
    }

    private Connection getConnection() throws DbException {
        PersistenceManager manager = null;
        JdbcSession session = null;
        manager = PersistenceManager.getInstance((String)InvocationInfoProxy.getInstance().getUserDataSource());
        session = manager.getJdbcSession();
        return session.getConnection();
    }

    public AggReceivableBillVO[] queryBillsBySourceRowIDs(String[] sRowIDs, String pk_org) throws Exception {
        if (null == sRowIDs) {
            return null;
        }
        String whereString = " ar_recbill in (select pk_recbill from ar_recitem fb where fb.pk_org='" + pk_org + "' and fb.dr=0 and " + SqlUtils.getInStr((String)"fb.top_itemid", (String[])sRowIDs, (boolean[])new boolean[]{true}) + ") ";
        Collection bills = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(AggReceivableBillVO.class, whereString, false);
        return bills.toArray(new AggReceivableBillVO[0]);
    }

    public AggReceivableBillVO[] queryBillsBySourceBillIDs(String[] sBillIDs) throws Exception {
        if (null == sBillIDs) {
            return null;
        }
        String whereString = " pk_recbill in (select pk_recbill from ar_recitem fb where fb.dr=0 and " + SqlUtils.getInStr((String)"fb.top_billid", (String[])sBillIDs, (boolean[])new boolean[]{true}) + ") ";
        Collection bills = this.queryBillVO(AggReceivableBillVO.class, whereString);
        return bills.toArray(new AggReceivableBillVO[0]);
    }

    public AggReceivableBillVO[] queryBillsBySourceBillIDs(String[] sBillIDs, String[] fields) throws Exception {
        if (null == sBillIDs) {
            return null;
        }
        String whereString = " pk_recbill in (select pk_recbill from ar_recitem fb where fb.dr=0 and " + SqlUtils.getInStr((String)"fb.top_billid", (String[])sBillIDs, (boolean[])new boolean[]{true}) + ") ";
        Collection bills = new BaseDAO().retrieveByClause(AggReceivableBillVO.class, whereString, fields);
        return bills.toArray(new AggReceivableBillVO[0]);
    }

    public ReceivableBillItemVO[] queryBillsBySourceRowIDs(String[] sRowIDs, String[] fields) throws Exception {
        if (null == sRowIDs) {
            return null;
        }
        String whereString = SqlUtils.getInStr((String)"src_billid", (String[])sRowIDs, (boolean[])new boolean[]{true});
        whereString = whereString + " and dr = 0 ";
        Collection bills = new BaseDAO().retrieveByClause(ReceivableBillItemVO.class, whereString, fields);
        return bills.toArray(new ReceivableBillItemVO[0]);
    }

    public ReceivableBillItemVO[] querySoBillsBySourceRowIDs(String[] sRowIDs, String[] fields) throws Exception {
        if (null == sRowIDs) {
            return null;
        }
        String whereString = SqlUtils.getInStr((String)"src_billid", (String[])sRowIDs, (boolean[])new boolean[]{true});
        whereString = whereString + " and dr = 0 and " + "pk_recbill" + " in (select pk_recbill from ar_recbill where src_syscode = " + BillEnumCollection.FromSystem.SO.VALUE + " and effectstatus = " + BillEnumCollection.InureSign.OKINURE.VALUE + " )";
        Collection bills = new BaseDAO().retrieveByClause(ReceivableBillItemVO.class, whereString, fields);
        return bills.toArray(new ReceivableBillItemVO[0]);
    }

    public AggReceivableBillVO[] queryBillsBySrcRowIDs(String[] sRowIDs, String pk_org) throws Exception {
        if (null == sRowIDs) {
            return null;
        }
        String whereString = " ar_recbill in (select pk_recbill from ar_recitem fb where fb.pk_org='" + pk_org + "' and fb.dr=0 and " + SqlUtils.getInStr((String)"fb.src_itemid", (String[])sRowIDs, (boolean[])new boolean[]{true}) + ") ";
        Collection bills = this.queryBillVO(AggReceivableBillVO.class, whereString);
        return bills.toArray(new AggReceivableBillVO[0]);
    }

    public AggReceivableBillVO[] queryBillsBySrcBillIDs(String[] sBillIDs) throws Exception {
        if (null == sBillIDs) {
            return null;
        }
        String whereString = " pk_recbill in (select pk_recbill from ar_recitem fb where fb.dr=0 and " + SqlUtils.getInStr((String)"fb.src_billid", (String[])sBillIDs, (boolean[])new boolean[]{true}) + ") ";
        Collection bills = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(AggReceivableBillVO.class, whereString, false);
        return bills.toArray(new AggReceivableBillVO[0]);
    }

    public boolean checkTradetypeUsed(String pkTradetype, String pkGroup) throws DAOException {
        if (StringUtil.isEmpty((String)pkTradetype)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("pk_tradetype").append("='").append(pkTradetype).append("' and ");
        if (!StringUtil.isEmpty((String)pkGroup)) {
            sb.append("pk_group").append("='").append(pkGroup).append("' ");
        } else {
            sb.append("pk_group = '~' ");
        }
        Collection bills = new BaseDAO().retrieveByClause(ReceivableBillVO.class, sb.toString().trim(), new String[]{"pk_recbill"});
        return bills.size() > 0;
    }
}

