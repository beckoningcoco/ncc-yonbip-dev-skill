/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.logging.Log
 *  nc.bs.logging.Logger
 *  nc.jdbc.framework.JdbcSession
 *  nc.jdbc.framework.PersistenceManager
 *  nc.jdbc.framework.exception.DbException
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.rs.ComTool
 *  nc.vo.pub.rs.MemoryResultSet
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.arap.djlx;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.logging.Log;
import nc.bs.logging.Logger;
import nc.jdbc.framework.JdbcSession;
import nc.jdbc.framework.PersistenceManager;
import nc.jdbc.framework.exception.DbException;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.arap.bdcontrastinfo.BdcontrastinfoVO;
import nc.vo.arap.djlx.DjLXVO;
import nc.vo.arap.global.ArapCommonTool;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.utils.OrgUtils;
import nc.vo.arap.utils.TempTableDAO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.rs.ComTool;
import nc.vo.pub.rs.MemoryResultSet;
import nccloud.commons.lang.ArrayUtils;

public class DjLXDMO {
    public boolean checkUnique(DjLXVO vo) throws BusinessException {
        String strSql = OrgUtils.getGlobalAndGroupSql(vo.getPk_group()) + "and djlxbm = '" + vo.getDjlxbm() + "'";
        Collection cl = new BaseDAO().retrieveByClause(DjLXVO.class, strSql, new String[]{"pk_billtype"});
        return cl.size() <= 1;
    }

    public boolean isInUse(DjLXVO vo) throws BusinessException {
        String sTabName = "arap_djzb";
        if (vo.getDjdl().equalsIgnoreCase("ss")) {
            sTabName = "arap_item";
        } else if (vo.getDjdl().equalsIgnoreCase("yt")) {
            sTabName = "arap_tb_item";
        } else if ("jk".equalsIgnoreCase(vo.getDjdl())) {
            sTabName = "arap_jkzb";
        } else if ("bx".equalsIgnoreCase(vo.getDjdl())) {
            sTabName = "arap_bxzb";
        } else if ("sj".equalsIgnoreCase(vo.getDjdl()) || "fj".equalsIgnoreCase(vo.getDjdl()) || "hj".equalsIgnoreCase(vo.getDjdl())) {
            sTabName = "cmp_busibill";
        }
        String sql = "select count(djlxbm) as num from " + sTabName + " where djlxbm ='" + vo.getDjlxbm() + "' and " + OrgUtils.getGlobalAndGroupSql(vo.getPk_group()) + " and dr=0";
        PersistenceManager manager = null;
        Object o = UFBoolean.TRUE;
        try {
            manager = PersistenceManager.getInstance((String)this.getds());
            JdbcSession session = manager.getJdbcSession();
            o = session.executeQuery(sql, new ResultSetProcessor(){
                private static final long serialVersionUID = 1L;

                public Object handleResultSet(ResultSet rs) throws SQLException {
                    UFBoolean o = UFBoolean.FALSE;
                    if (rs.next()) {
                        o = rs.getInt(1) != 0 ? UFBoolean.TRUE : UFBoolean.FALSE;
                    }
                    return o;
                }
            });
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new DAOException(e.getMessage());
        }
        finally {
            if (manager != null) {
                manager.release();
            }
        }
        return o.booleanValue();
    }

    public boolean isRefered(DjLXVO vo) {
        BaseDAO dao = new BaseDAO();
        try {
            Collection cl = dao.retrieveByClause(DjLXVO.class, "pk_group is not null and djlxbm ='" + vo.getDjlxbm() + "'");
            return cl.size() <= 0;
        }
        catch (DAOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessRuntimeException(e.getMessage());
        }
    }

    public DjLXVO[] queryAllByInit(String pk_group) throws BusinessException {
        BaseDAO dao = new BaseDAO();
        Collection cl = dao.retrieveByClause(DjLXVO.class, " 1=1 order by pk_group,djlxbm");
        DjLXVO[] djlxs = (DjLXVO[])ArapCommonTool.changeCollection2Array(cl, DjLXVO.class);
        return djlxs;
    }

    public DjLXVO getDjlxvoByDjlxbm(String djlxbm, String pk_group) throws BusinessException {
        try {
            return this.queryByDjbm(djlxbm, pk_group)[0];
        }
        catch (Exception e) {
            Log.getInstance(this.getClass()).error((Object)e.getMessage());
            throw new BusinessException(e.getMessage(), (Throwable)e);
        }
    }

    public DjLXVO[] queryByDjbm(String djlxbm, String pk_group) {
        Collection cl;
        String sWhere = "";
        if (djlxbm != null) {
            sWhere = sWhere + "and  " + OrgUtils.getGlobalAndGroupSql(pk_group);
        }
        if (sWhere.length() > 1) {
            sWhere = sWhere.substring(3);
        }
        BaseDAO dao = new BaseDAO();
        try {
            cl = dao.retrieveByClause(DjLXVO.class, sWhere);
        }
        catch (DAOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessRuntimeException(e.getMessage());
        }
        if (cl == null || cl.size() == 0) {
            return null;
        }
        DjLXVO[] djlxs = (DjLXVO[])ArapCommonTool.changeCollection2Array(cl, DjLXVO.class);
        return djlxs;
    }

    public DjLXVO[] queryByDjbm(String[] djlxbm, String pk_group) {
        Collection cl;
        String sql = null;
        if (!ArrayUtils.isEmpty((Object[])djlxbm)) {
            try {
                sql = SqlUtils.getInStr("djlxoid", djlxbm) + " and ";
            }
            catch (BusinessException e1) {
                Logger.error((Object)e1.getMessage(), (Throwable)e1);
                throw new BusinessRuntimeException(e1.getMessage());
            }
        }
        if (pk_group != null) {
            sql = sql + " and pk_group='" + pk_group + "' and ";
        }
        sql = sql.substring(0, sql.lastIndexOf("and"));
        BaseDAO dao = new BaseDAO();
        try {
            cl = dao.retrieveByClause(DjLXVO.class, sql);
        }
        catch (DAOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessRuntimeException(e.getMessage());
        }
        if (cl == null || cl.size() == 0) {
            return null;
        }
        DjLXVO[] djlxs = (DjLXVO[])ArapCommonTool.changeCollection2Array(cl, DjLXVO.class);
        return djlxs;
    }

    public Vector<DjLXVO> getByPrimaryKeys(String[] pks, String pk_group) throws BusinessException {
        try {
            String sql = SqlUtils.getInStr("djlxoid", pks);
            if (pk_group != null) {
                sql = sql + " and pk_group='" + pk_group + "'";
            }
            Vector<DjLXVO> v = new Vector<DjLXVO>();
            BaseDAO dao = new BaseDAO();
            Collection cl = dao.retrieveByClause(DjLXVO.class, sql);
            v.addAll(cl);
            return v;
        }
        catch (Exception e) {
            ExceptionHandler.handleException(this.getClass(), (Exception)e);
            return null;
        }
    }

    private String getds() {
        return InvocationInfoProxy.getInstance().getUserDataSource();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map<String, String> getDjdlByDjlxbm(String[] djlxbms, String pk_group) throws Exception {
        if (ArrayUtils.isEmpty((Object[])djlxbms)) {
            throw new IllegalArgumentException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0567"));
        }
        String sql = "select distinct djlxbm,djdl from arap_billtype where " + SqlUtils.getInStr("djlxbm", djlxbms) + " and " + OrgUtils.getGlobalAndGroupSql(pk_group);
        PersistenceManager manager = null;
        try {
            manager = PersistenceManager.getInstance((String)this.getds());
            JdbcSession session = manager.getJdbcSession();
            Map map = (Map)session.executeQuery(sql, new ResultSetProcessor(){
                private static final long serialVersionUID = 1L;

                public Object handleResultSet(ResultSet rs) throws SQLException {
                    HashMap<String, String> temp = new HashMap<String, String>();
                    if (rs.next()) {
                        temp.put(rs.getString("djlxbm"), rs.getString("djdl"));
                    }
                    return temp;
                }
            });
            return map;
        }
        finally {
            if (manager != null) {
                manager.release();
            }
        }
    }

    public BdcontrastinfoVO[] queryAll(String pk_org) throws SQLException {
        BdcontrastinfoVO[] bdcontrastinfos = null;
        Vector<BdcontrastinfoVO> v = new Vector<BdcontrastinfoVO>();
        Connection con = null;
        Statement stmt = null;
        JdbcSession session = null;
        ResultSet rs = null;
        try {
            String sql;
            session = this.getJdbcSession();
            con = session.getConnection();
            if (pk_org != null) {
                sql = "select ntb.pk_obj, bd.accessclass, bd.bdcode, bd.bdname, bd.bdtype, bd.budgetconst, bd.codefieldname, \t\tbd.corpfieldname, bd.dr, bd.isdef, bd.isselfref, bd.namefieldname, bd.pk_bdinfo, bd.pk_org, bd.pk_defdef,  bd.refnodename, bd.refsystem, bd.reserved1, bd.reserved2, bd.selfrefclass, bd.tablename, bd.tablepkname, bd.ts, ntb.att_fld, ntb.att_fld_desc, ntb.bdinfo_type, ntb.bill_type, ntb.busi_type, ntb.busisys_id, ntb.busisys_name,ntb.levelctlflag  from ntb_id_bdcontrast  ntb inner join  bd_bdinfo  bd  on ntb.pk_bdinfo = bd.pk_bdinfo where pk_org = ? and bd.dr =0 and ntb.dr = 0  and ntb.busisys_id='FI_BILL' order by ntb.pk_obj ";
                stmt = con.prepareStatement(sql);
                stmt.setString(1, pk_org);
            } else {
                sql = "select ntb.pk_obj, bd.accessclass, bd.bdcode, bd.bdname, bd.bdtype, bd.budgetconst, bd.codefieldname, \t\tbd.corpfieldname, bd.dr, bd.isdef, bd.isselfref, bd.namefieldname, bd.pk_bdinfo, bd.pk_org, bd.pk_defdef,  bd.refnodename, bd.refsystem, bd.reserved1, bd.reserved2, bd.selfrefclass, bd.tablename, bd.tablepkname, bd.ts, ntb.att_fld, ntb.att_fld_desc, ntb.bdinfo_type, ntb.bill_type, ntb.busi_type, ntb.busisys_id, ntb.busisys_name,ntb.levelctlflag  from ntb_id_bdcontrast  ntb inner join  bd_bdinfo  bd  on ntb.pk_bdinfo = bd.pk_bdinfo where bd.dr =0 and ntb.dr = 0 and ntb.busisys_id='FI_BILL' order by ntb.pk_obj ";
                stmt = con.prepareStatement(sql);
            }
            rs = stmt.executeQuery();
            while (rs.next()) {
                BdcontrastinfoVO bdcontrastinfo = new BdcontrastinfoVO();
                String pk_bdcontrastinfo = rs.getString(1);
                bdcontrastinfo.setPk_bdcontrastinfo(pk_bdcontrastinfo == null ? null : pk_bdcontrastinfo.trim());
                String accessclass = rs.getString(2);
                bdcontrastinfo.setAccessclass(accessclass == null ? null : accessclass.trim());
                String bdcode = rs.getString(3);
                bdcontrastinfo.setBdcode(bdcode == null ? null : bdcode.trim());
                String bdname = rs.getString(4);
                bdcontrastinfo.setBdname(bdname == null ? null : bdname.trim());
                Integer bdtype = (Integer)rs.getObject(5);
                bdcontrastinfo.setBdtype(bdtype == null ? null : bdtype);
                String budgetconst = rs.getString(6);
                bdcontrastinfo.setBudgetconst(budgetconst == null ? null : budgetconst.trim());
                String codefieldname = rs.getString(7);
                bdcontrastinfo.setCodefieldname(codefieldname == null ? null : codefieldname.trim());
                String corpfieldname = rs.getString(8);
                bdcontrastinfo.setCorpfieldname(corpfieldname == null ? null : corpfieldname.trim());
                Integer dr = (Integer)rs.getObject(9);
                bdcontrastinfo.setDr(dr == null ? null : dr);
                String isdef = rs.getString(10);
                bdcontrastinfo.setIsdef(isdef == null ? null : UFBoolean.valueOf((String)isdef.trim()));
                String isselfref = rs.getString(11);
                bdcontrastinfo.setIsselfref(isselfref == null ? null : UFBoolean.valueOf((String)isselfref.trim()));
                String namefieldname = rs.getString(12);
                bdcontrastinfo.setNamefieldname(namefieldname == null ? null : namefieldname.trim());
                String pk_bdinfo = rs.getString(13);
                bdcontrastinfo.setPk_bdinfo(pk_bdinfo == null ? null : pk_bdinfo.trim());
                String pk_corp2 = rs.getString(14);
                bdcontrastinfo.setPk_corp(pk_corp2 == null ? null : pk_corp2.trim());
                String pk_defdef = rs.getString(15);
                bdcontrastinfo.setPk_defdef(pk_defdef == null ? null : pk_defdef.trim());
                String refnodename = rs.getString(16);
                bdcontrastinfo.setRefnodename(refnodename == null ? null : refnodename.trim());
                String refsystem = rs.getString(17);
                bdcontrastinfo.setRefsystem(refsystem == null ? null : refsystem.trim());
                String reserved1 = rs.getString(18);
                bdcontrastinfo.setReserved1(reserved1 == null ? null : reserved1.trim());
                String reserved2 = rs.getString(19);
                bdcontrastinfo.setReserved2(reserved2 == null ? null : reserved2.trim());
                String selfrefclass = rs.getString(20);
                bdcontrastinfo.setSelfrefclass(selfrefclass == null ? null : selfrefclass.trim());
                String tablename = rs.getString(21);
                bdcontrastinfo.setTablename(tablename == null ? null : tablename.trim());
                String tablepkname = rs.getString(22);
                bdcontrastinfo.setTablepkname(tablepkname == null ? null : tablepkname.trim());
                String ts = rs.getString(23);
                bdcontrastinfo.setTs(ts == null ? null : new UFDateTime(ts.trim()));
                String att_fld = rs.getString(24);
                bdcontrastinfo.setAtt_fld(att_fld == null ? null : att_fld.trim());
                String att_fld_desc = rs.getString(25);
                bdcontrastinfo.setAtt_fld_desc(att_fld_desc == null ? null : att_fld_desc.trim());
                String bdinfo_type = rs.getString(26);
                bdcontrastinfo.setBdinfo_type(bdinfo_type == null ? null : bdinfo_type.trim());
                String bill_type = rs.getString(27);
                bdcontrastinfo.setBill_type(bill_type == null ? null : bill_type.trim());
                String busi_type = rs.getString(28);
                bdcontrastinfo.setBusi_type(busi_type == null ? null : busi_type.trim());
                String busisys_id = rs.getString(29);
                bdcontrastinfo.setBusisys_id(busisys_id == null ? null : busisys_id.trim());
                String busisys_name = rs.getString(30);
                bdcontrastinfo.setBusisys_name(busisys_name == null ? null : busisys_name.trim());
                String setIsLevelControl = rs.getString(31);
                bdcontrastinfo.setIsLevelControl(setIsLevelControl == null ? ArapConstant.UFBOOLEAN_FALSE : UFBoolean.valueOf((String)setIsLevelControl.trim()));
                v.addElement(bdcontrastinfo);
            }
        }
        catch (SQLException e) {
            Log.getInstance(this.getClass()).error((Object)e.getMessage(), (Throwable)e);
            throw e;
        }
        finally {
            if (con != null) {
                con.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
            if (session != null) {
                session.closeAll();
            }
        }
        bdcontrastinfos = new BdcontrastinfoVO[v.size()];
        if (v.size() > 0) {
            v.copyInto((Object[])bdcontrastinfos);
        }
        return bdcontrastinfos;
    }

    public Hashtable<String, String> getDjlxbmbyBillPks(String tabname, ArrayList<?> alPks, Hashtable<String, String> hashResult) throws BusinessException {
        try {
            String tmptab = null;
            String sWhere = "";
            if (alPks.size() > TempTableDAO.getTmpTableMinCount()) {
                tmptab = new TempTableDAO().createTable(tabname + "_tmp", "pk", "char(20)", alPks);
                sWhere = sWhere + " left outer join " + tmptab + " on zb.vouchid=" + tmptab + ".pk ";
            } else {
                sWhere = sWhere + " where zb.vouchid in (";
                for (int i = 0; i < alPks.size(); ++i) {
                    if (i != 0) {
                        sWhere = sWhere + ",";
                    }
                    sWhere = sWhere + "'" + alPks.get(i) + "'";
                }
                sWhere = sWhere + ") ";
            }
            String sql = " select zb.vouchid,zb.djlxbm  from " + tabname + " zb " + sWhere;
            MemoryResultSet mrs = this.execQuery(sql);
            if (hashResult == null) {
                hashResult = new Hashtable();
            }
            while (mrs.next()) {
                String pk = mrs.getString("vouchid");
                String value = mrs.getString("djlxbm");
                if (pk == null) continue;
                hashResult.put(pk.trim(), value.trim());
            }
        }
        catch (Exception e) {
            Log.getInstance(this.getClass()).error((Object)e.getMessage());
            throw new BusinessException("", (Throwable)e);
        }
        return hashResult;
    }

    public MemoryResultSet execQuery(String sql) throws SQLException {
        MemoryResultSet mrs = null;
        try (Connection con = null;){
            con = this.getConnection();
            mrs = ComTool.getMemoryResultSet((Connection)con, (String)sql);
        }
        return mrs;
    }

    private Connection getConnection() {
        JdbcSession session = this.getJdbcSession();
        return session.getConnection();
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
}

