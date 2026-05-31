/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.framework.exception.ComponentException
 *  nc.bs.logging.Log
 *  nc.bs.mw.sqltrans.TempTable
 *  nc.bs.pub.SystemException
 *  nc.bs.sec.esapi.NCESAPI
 *  nc.itf.fi.pub.Currency
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.pubitf.arap.djlx.IBillTypePublic
 *  nc.vo.arap.dap.RetBillVo
 *  nc.vo.arap.djlx.DjLXVO
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.arap.selectedpay.DataManager
 *  nc.vo.arap.termendtransact.AgiotageBzVO
 *  nc.vo.arap.termendtransact.AgiotageDJVO
 *  nc.vo.arap.termendtransact.AgiotageVO
 *  nc.vo.arap.termendtransact.FilterCondVO
 *  nc.vo.arap.termendtransact.ReportVO
 *  nc.vo.arap.transaction.Je
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 */
package nc.bs.arap.termendtransact;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import javax.naming.NamingException;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.bs.framework.exception.ComponentException;
import nc.bs.logging.Log;
import nc.bs.mw.sqltrans.TempTable;
import nc.bs.pub.SystemException;
import nc.bs.sec.esapi.NCESAPI;
import nc.itf.fi.pub.Currency;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.pubitf.accperiod.AccountCalendar;
import nc.pubitf.arap.djlx.IBillTypePublic;
import nc.vo.arap.dap.RetBillVo;
import nc.vo.arap.djlx.DjLXVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.selectedpay.DataManager;
import nc.vo.arap.termendtransact.AgiotageBzVO;
import nc.vo.arap.termendtransact.AgiotageDJVO;
import nc.vo.arap.termendtransact.AgiotageVO;
import nc.vo.arap.termendtransact.FilterCondVO;
import nc.vo.arap.termendtransact.ReportVO;
import nc.vo.arap.transaction.Je;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;

public class ReckoningDMO
extends DataManager {
    public Vector<Vector<String>> onchange(ResultSet rs, Hashtable<String, String> hash_type) throws SQLException {
        Vector<Vector<String>> vDJCLBs = new Vector<Vector<String>>();
        while (rs.next()) {
            Vector<String> v = new Vector<String>();
            String sBillTypeNm = rs.getString(1);
            if (sBillTypeNm == null) continue;
            String sBillNum = rs.getString(2);
            v.addElement("");
            v.addElement(hash_type.get(sBillTypeNm) + sBillNum);
            v.addElement("");
            vDJCLBs.addElement(v);
        }
        return vDJCLBs;
    }

    public Vector<Vector<String>> onchange(ResultSet rs, Hashtable<String, String> hash_type, Vector<Vector<String>> vetResult) throws SQLException {
        while (rs.next()) {
            Vector<String> v = new Vector<String>();
            String sBillTypeNm = rs.getString(1);
            if (sBillTypeNm == null) continue;
            String sBillNum = rs.getString(2);
            v.addElement("");
            v.addElement(hash_type.get(sBillTypeNm) + sBillNum);
            v.addElement("");
            vetResult.addElement(v);
        }
        return vetResult;
    }

    public Vector<AgiotageDJVO> onChangeToVO(ResultSet rs) throws SQLException {
        Vector<AgiotageDJVO> vResult = new Vector<AgiotageDJVO>();
        while (rs.next()) {
            AgiotageDJVO voDj = new AgiotageDJVO();
            BigDecimal ybye = (BigDecimal)rs.getObject(1);
            voDj.setYbye(ybye == null ? null : new UFDouble(ybye));
            BigDecimal bbye = (BigDecimal)rs.getObject(2);
            voDj.setBbye(bbye == null ? null : new UFDouble(bbye));
            BigDecimal groupbb = (BigDecimal)rs.getObject(3);
            voDj.setGroupbb(groupbb == null ? null : new UFDouble(groupbb));
            BigDecimal globalbb = (BigDecimal)rs.getObject(4);
            voDj.setGlobalbb(globalbb == null ? null : new UFDouble(globalbb));
            vResult.addElement(voDj);
        }
        return vResult;
    }

    public Vector<Vector<String>> onReckoningCheckStep1(FilterCondVO vo) throws Exception {
        this.beforeCallMethod("nc.bs.arap.termendtransact.ReckoningDMO", "onReckoningCheckStep1", new Object[]{vo});
        String sql = "";
        StringBuffer sb = new StringBuffer();
        String pk_org = vo.getPk_org();
        String date = vo.getEndDate() + " 23:59:59";
        if (vo.getSfbz().equals(ArapConstant.ARAP_AR_BILLCLASS)) {
            sb.append("SELECT bill.billno as billno,type.billtypename as billtypename FROM ( ");
            sb.append("SELECT billno, pk_tradetypeid FROM ar_recbill WHERE dr!=1 and effectstatus != 10 and pk_org = '");
            sb.append(NCESAPI.sqlEncode((String)pk_org));
            sb.append("'and billdate  <= '");
            sb.append(NCESAPI.sqlEncode((String)date));
            sb.append("' UNION ");
            sb.append("SELECT billno, pk_tradetypeid FROM ar_gatherbill WHERE dr!=1 and effectstatus != 10 and pk_org = '");
            sb.append(NCESAPI.sqlEncode((String)pk_org));
            sb.append("'and billdate  <= '");
            sb.append(NCESAPI.sqlEncode((String)date));
            sb.append("') bill, bd_billtype type WHERE bill.pk_tradetypeid = type.pk_billtypeid ");
        }
        if (vo.getSfbz().equals(ArapConstant.ARAP_AP_BILLCLASS)) {
            sb.append("SELECT bill.billno as billno,type.billtypename as billtypename FROM ( ");
            sb.append("SELECT billno, pk_tradetypeid FROM ap_paybill WHERE dr!=1 and effectstatus != 10 and pk_org = '");
            sb.append(NCESAPI.sqlEncode((String)pk_org));
            sb.append("'and billdate  <= '");
            sb.append(NCESAPI.sqlEncode((String)date));
            sb.append("' UNION ");
            sb.append("SELECT billno, pk_tradetypeid FROM ap_payablebill WHERE dr!=1 and effectstatus != 10 and pk_org = '");
            sb.append(NCESAPI.sqlEncode((String)pk_org));
            sb.append("'and billdate  <= '");
            sb.append(NCESAPI.sqlEncode((String)date));
            sb.append("') bill, bd_billtype type WHERE bill.pk_tradetypeid = type.pk_billtypeid ");
        }
        sql = sb.toString();
        Vector<Vector<String>> v = new Vector<Vector<String>>();
        try (Connection con = this.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();){
            Vector<String> vTem = new Vector<String>();
            vTem.addElement("1");
            vTem.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0331"));
            v.addElement(vTem);
            while (rs.next()) {
                Vector<String> vReport = new Vector<String>();
                String bh = "";
                vReport.addElement(bh);
                String djlx = "";
                djlx = rs.getString("billno") != null ? rs.getString("billtypename") + rs.getString("billno") : rs.getString("billtypename");
                vReport.addElement(djlx == null ? null : djlx.trim());
                String count = "";
                vReport.addElement(count);
                v.addElement(vReport);
            }
            vTem.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0052", null, new String[]{String.valueOf(v.size() - 1)}));
        }
        this.afterCallMethod("nc.bs.arap.termendtransact.ReckoningDMO", "onReckoningCheckStep1", new Object[]{vo});
        int iCount = v.size() - 1;
        if (iCount != 0) {
            String sCount = Integer.valueOf(iCount).toString();
            v.elementAt(0).setElementAt(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0052", null, new String[]{sCount.toString()}), 2);
        }
        return v;
    }

    public Vector<Vector<String>> onReckoningCheckStep2(FilterCondVO vo) throws Exception {
        this.beforeCallMethod("nc.bs.arap.termendtransact.ReckoningDMO", "onReckoningCheckStep2", new Object[]{vo});
        String sql = "";
        StringBuffer sb = new StringBuffer();
        String pk_org = vo.getPk_org();
        String date = vo.getEndDate();
        date = date + " 23:59:59";
        if (vo.getSfbz().equals(ArapConstant.ARAP_AR_BILLCLASS)) {
            sb.append("SELECT bill.billno as billno,type.billtypename as billtypename FROM ( ");
            sb.append("SELECT distinct billno, pk_tradetypeid FROM ar_gatheritem WHERE dr!=1 and money_bal != 0 and pk_org = '");
            sb.append(NCESAPI.sqlEncode((String)pk_org));
            sb.append("'and billdate  < '");
            sb.append(NCESAPI.sqlEncode((String)date));
            sb.append("') bill, bd_billtype type WHERE bill.pk_tradetypeid = type.pk_billtypeid ");
        }
        if (vo.getSfbz().equals(ArapConstant.ARAP_AP_BILLCLASS)) {
            sb.append("SELECT bill.billno as billno,type.billtypename as billtypename FROM ( ");
            sb.append("SELECT distinct billno, pk_tradetypeid FROM ap_payitem WHERE  dr!=1 and money_bal != 0 and pk_org = '");
            sb.append(NCESAPI.sqlEncode((String)pk_org));
            sb.append("'and billdate  < '");
            sb.append(NCESAPI.sqlEncode((String)date));
            sb.append("') bill, bd_billtype type WHERE bill.pk_tradetypeid = type.pk_billtypeid ");
        }
        sql = sb.toString();
        Vector<Vector<String>> v = new Vector<Vector<String>>();
        try (Connection con = this.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();){
            while (rs.next()) {
                Vector<String> vReport = new Vector<String>();
                String bh = "";
                vReport.addElement(bh);
                String djlx = "";
                djlx = rs.getString("billno") != null ? rs.getString("billtypename") + rs.getString("billno") : rs.getString("billtypename");
                vReport.addElement(djlx == null ? null : djlx.trim());
                String count = "";
                vReport.addElement(count);
                v.addElement(vReport);
            }
        }
        this.afterCallMethod("nc.bs.arap.termendtransact.ReckoningDMO", "onReckoningCheckStep2", new Object[]{vo});
        return v;
    }

    public ReportVO onReckoningCheckStep3(FilterCondVO vo, AgiotageVO voCurrency) throws Exception {
        this.beforeCallMethod("nc.bs.arap.termendtransact.ReckoningDMO", "onReckoningCheckStep5", new Object[]{vo, voCurrency});
        Vector vAllBz = new Vector();
        Vector<Object> vDj = new Vector();
        String sMsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0332");
        vAllBz = voCurrency.getSelBzbm();
        boolean isPassed = true;
        if (vAllBz.size() == 0) {
            sMsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0333");
            isPassed = true;
        }
        String year = vo.getYear();
        String month = vo.getQj();
        AccountCalendar ac = AccountCalendar.getInstanceByPk_org((String)vo.getPk_org());
        ac.set(year, month);
        String sql2 = "";
        StringBuffer sb = new StringBuffer();
        String pk_org = vo.getPk_org();
        vo.getEndDate();
        UFDate enddate = ac.getMonthVO().getEnddate();
        if (vo.getSfbz().equals(ArapConstant.ARAP_AR_BILLCLASS)) {
            sb.append("SELECT distinct pk_currtype FROM ( ");
            sb.append("SELECT pk_currtype FROM ar_recitem WHERE dr!=1 and pk_org = '");
            sb.append(NCESAPI.sqlEncode((String)pk_org));
            sb.append("'and billdate  > '");
            sb.append(ac.getMonthVO().getBegindate());
            sb.append("'and billdate  < '");
            sb.append(enddate);
            sb.append("' UNION ");
            sb.append("SELECT pk_currtype FROM ar_gatheritem WHERE dr!=1 and pk_org = '");
            sb.append(NCESAPI.sqlEncode((String)pk_org));
            sb.append("'and billdate  > '");
            sb.append(ac.getMonthVO().getBegindate());
            sb.append("'and billdate  < '");
            sb.append(enddate);
            sb.append("') bill ");
        }
        if (vo.getSfbz().equals(ArapConstant.ARAP_AP_BILLCLASS)) {
            sb.append("SELECT distinct pk_currtype FROM ( ");
            sb.append("SELECT pk_currtype FROM ap_payitem WHERE  dr!=1 and pk_org = '");
            sb.append(NCESAPI.sqlEncode((String)pk_org));
            sb.append("'and billdate  > '");
            sb.append(ac.getMonthVO().getBegindate());
            sb.append("'and billdate  < '");
            sb.append(enddate);
            sb.append("' UNION ");
            sb.append("SELECT pk_currtype FROM ap_payableitem WHERE dr!=1 and pk_org = '");
            sb.append(NCESAPI.sqlEncode((String)pk_org));
            sb.append("'and billdate  > '");
            sb.append(ac.getMonthVO().getBegindate());
            sb.append("'and billdate  < '");
            sb.append(enddate);
            sb.append("') bill ");
        }
        sql2 = sb.toString();
        List bzs = (List)new BaseDAO().executeQuery(sql2, new ResultSetProcessor(){
            private static final long serialVersionUID = 1L;

            public Object handleResultSet(ResultSet rs) throws SQLException {
                ArrayList<String> bzs = new ArrayList<String>();
                while (rs.next()) {
                    bzs.add(rs.getString(1));
                }
                return bzs;
            }
        });
        block27: for (int i = 0; i < vAllBz.size() && isPassed; ++i) {
            AgiotageBzVO voBz = (AgiotageBzVO)vAllBz.elementAt(i);
            String bzbm = voBz.getBzbm();
            if (!bzs.contains(bzbm) || bzbm.equals(Currency.getLocalCurrPK((String)vo.getPk_org()))) continue;
            String sql = "";
            sb = new StringBuffer();
            if (vo.getSfbz().equals(ArapConstant.ARAP_AR_BILLCLASS)) {
                sb.append("SELECT item.money_bal as ybye, item.local_money_bal as bbye,bill.grouplocal as groupbb, bill.globallocal as globalbb FROM arap_termitem item ,( ");
                sb.append("SELECT item.pk_recitem as pk_bill, grouplocal , globallocal FROM ar_recbill head inner join ar_recitem item on head.pk_recbill=item.pk_recbill WHERE head.dr! = 1 and item.dr!=1 and head.effectstatus = 10 and head.pk_org = '");
                sb.append(NCESAPI.sqlEncode((String)pk_org));
                sb.append("'and head.billdate  > '");
                sb.append(ac.getMonthVO().getBegindate());
                sb.append("'and head.billdate  < '");
                sb.append(enddate);
                sb.append("'and item.pk_currtype  = '");
                sb.append(NCESAPI.sqlEncode((String)bzbm));
                sb.append("' UNION ");
                sb.append("SELECT item.pk_gatheritem as pk_bill, grouplocal , globallocal FROM ar_gatherbill head inner join ar_gatheritem item on head.pk_gatherbill=item.pk_gatherbill WHERE head.dr!=1 and item.dr!=1 and head.effectstatus = 10 and head.pk_org = '");
                sb.append(NCESAPI.sqlEncode((String)pk_org));
                sb.append("'and head.billdate  > '");
                sb.append(ac.getMonthVO().getBegindate());
                sb.append("'and head.billdate  < '");
                sb.append(enddate);
                sb.append("'and item.pk_currtype  = '");
                sb.append(NCESAPI.sqlEncode((String)bzbm));
                sb.append("') bill WHERE bill.pk_bill = item.pk_item");
            }
            if (vo.getSfbz().equals(ArapConstant.ARAP_AP_BILLCLASS)) {
                sb.append("SELECT item.money_bal as ybye, item.local_money_bal as bbye,bill.grouplocal as groupbb, bill.globallocal as globalbb FROM arap_termitem item ,( ");
                sb.append("SELECT item.pk_payitem as pk_bill, grouplocal , globallocal FROM ap_paybill head inner join ap_payitem item on head.pk_paybill=item.pk_paybill WHERE  head.dr!=1 and item.dr!=1 and head.effectstatus = 10 and head.pk_org = '");
                sb.append(NCESAPI.sqlEncode((String)pk_org));
                sb.append("'and head.billdate  > '");
                sb.append(ac.getMonthVO().getBegindate());
                sb.append("'and head.billdate  < '");
                sb.append(enddate);
                sb.append("'and item.pk_currtype  = '");
                sb.append(NCESAPI.sqlEncode((String)bzbm));
                sb.append("' UNION ");
                sb.append("SELECT item.pk_payableitem as pk_bill, grouplocal , globallocal FROM ap_payablebill head inner join ap_payableitem item on head.pk_payablebill=item.pk_payablebill  WHERE head.dr!=1 and item.dr!=1 and head.effectstatus = 10 and head.pk_org = '");
                sb.append(NCESAPI.sqlEncode((String)pk_org));
                sb.append("'and head.billdate  > '");
                sb.append(ac.getMonthVO().getBegindate());
                sb.append("'and head.billdate  < '");
                sb.append(enddate);
                sb.append("'and item.pk_currtype  = '");
                sb.append(NCESAPI.sqlEncode((String)bzbm));
                sb.append("') bill WHERE bill.pk_bill = item.pk_item");
            }
            sql = sb.toString();
            try (Connection con = this.getConnection();
                 PreparedStatement stmt = con.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery();){
                vDj = this.onChangeToVO(rs);
            }
            if (vDj == null || vDj.size() == 0) continue;
            boolean isError = voBz.getState();
            if (!isError) {
                sMsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0334");
                isPassed = false;
                break;
            }
            for (int j = 0; j < vDj.size(); ++j) {
                AgiotageDJVO vDjcl = (AgiotageDJVO)vDj.elementAt(j);
                UFDouble yb = vDjcl.getYbye();
                UFDouble bb = vDjcl.getBbye();
                UFDouble groupbb = vDjcl.getGroupbb();
                UFDouble globalbb = vDjcl.getGlobalbb();
                Je je = new Je(bzbm, yb, bb, groupbb, globalbb);
                UFDouble bbye = null;
                bbye = Currency.getAmountByOpp((String)voCurrency.getDwbm(), (String)voBz.getBzbm(), (String)Currency.getLocalCurrPK((String)voCurrency.getDwbm()), (UFDouble)yb, (UFDouble)voBz.getBbhl(), null);
                Je ye = new Je(bzbm, yb, bbye, groupbb, globalbb);
                Je ce = je.subtract(ye);
                if (ce.isAllZero()) continue;
                sMsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0334");
                isPassed = false;
                continue block27;
            }
        }
        ReportVO repVO = new ReportVO();
        repVO.setInfo(sMsg);
        repVO.setState(isPassed);
        this.afterCallMethod("nc.bs.arap.termendtransact.ReckoningDMO", "onReckoningCheckStep5", new Object[]{vo, voCurrency});
        return repVO;
    }

    public Vector<Vector<String>> queryBillType(String spk_corp) throws BusinessException {
        Vector<Vector<String>> vTem = new Vector<Vector<String>>();
        try {
            DjLXVO[] vos = ((IBillTypePublic)NCLocator.getInstance().lookup(IBillTypePublic.class)).queryAllBillTypeByGroup(spk_corp);
            for (int i = 0; i < vos.length; ++i) {
                Vector<String> v = new Vector<String>();
                v.addElement(vos[i].getDjlxbm());
                v.addElement(vos[i].getDjlxjc_remark());
                vTem.addElement(v);
            }
        }
        catch (ComponentException e) {
            Log.getInstance(((Object)((Object)this)).getClass()).error((Object)e.getMessage(), (Throwable)e);
        }
        catch (BusinessException e) {
            throw ExceptionHandler.handleException(((Object)((Object)this)).getClass(), (Exception)((Object)e));
        }
        return vTem;
    }

    public Vector<Vector<String>> queryNoVouchBills(String sql, Hashtable<String, String> hash_type, Vector<Vector<String>> vetResult) throws Exception {
        try (Connection con = this.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();){
            vetResult = this.onchange(rs, hash_type, vetResult);
        }
        return vetResult;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String createHeaderTempTable(Hashtable<?, ?> hash_bill) throws Exception {
        String tablename = null;
        Statement stmt = null;
        Connection con = null;
        try {
            Enumeration<?> em = hash_bill.elements();
            con = this.getConnection();
            TempTable tmptab = new TempTable();
            tablename = tmptab.createTempTable(con, "arap_termend_1", "djlxbm varchar(20),djbh varchar(30),ts char(19)", new String[]{"djlxbm,djbh"});
            String sql_temp = " insert into  " + tablename + " (djlxbm,djbh) values(?,?)";
            stmt = this.prepareStatement(con, sql_temp);
            while (em.hasMoreElements()) {
                RetBillVo voBill = (RetBillVo)em.nextElement();
                stmt.setString(1, NCESAPI.sqlEncode((String)voBill.getBillType()));
                stmt.setString(2, NCESAPI.sqlEncode((String)voBill.getBillNo()));
                stmt.addBatch();
            }
            stmt.executeBatch();
        }
        finally {
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return tablename;
    }

    public RetBillVo[] getRetBillVOByPks(String[] pks, FilterCondVO vo) throws Exception {
        String sql = "";
        StringBuffer sb = new StringBuffer();
        String pk_org = vo.getPk_org();
        if (vo.getSfbz().equals(ArapConstant.ARAP_AR_BILLCLASS)) {
            sb.append("SELECT bill.billno as billno,type.billtypename as billtypename FROM ( ");
            sb.append("SELECT billno, pk_tradetypeid FROM ar_recbill WHERE dr!=1 and pk_org = '");
            sb.append(NCESAPI.sqlEncode((String)pk_org));
            sb.append("' and ").append(SqlUtils.getInStr((String)"pk_recbill", (String[])pks));
            sb.append(" UNION ");
            sb.append("SELECT billno, pk_tradetypeid FROM ar_gatherbill WHERE dr!=1 and pk_org = '");
            sb.append(NCESAPI.sqlEncode((String)pk_org));
            sb.append("' and ").append(SqlUtils.getInStr((String)"pk_gatherbill", (String[])pks));
            sb.append(") bill, bd_billtype type WHERE bill.pk_tradetypeid = type.pk_billtypeid ");
        }
        if (vo.getSfbz().equals(ArapConstant.ARAP_AP_BILLCLASS)) {
            sb.append("SELECT bill.billno as billno,type.billtypename as billtypename FROM ( ");
            sb.append("SELECT billno, pk_tradetypeid FROM ap_paybill WHERE dr!=1 and pk_org = '");
            sb.append(NCESAPI.sqlEncode((String)pk_org));
            sb.append("' and ").append(SqlUtils.getInStr((String)"pk_paybill", (String[])pks));
            sb.append(" UNION ");
            sb.append("SELECT billno, pk_tradetypeid FROM ap_payablebill WHERE dr!=1 and pk_org = '");
            sb.append(NCESAPI.sqlEncode((String)pk_org));
            sb.append("' and ").append(SqlUtils.getInStr((String)"pk_payablebill", (String[])pks));
            sb.append(") bill, bd_billtype type WHERE bill.pk_tradetypeid = type.pk_billtypeid ");
        }
        sql = sb.toString();
        ArrayList<RetBillVo> resList = new ArrayList<RetBillVo>();
        try (Connection con = this.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();){
            while (rs.next()) {
                RetBillVo retBillVo = new RetBillVo();
                retBillVo.setBillNo(rs.getString("billno"));
                retBillVo.setBillType(rs.getString("billtypename"));
                resList.add(retBillVo);
            }
        }
        return resList.toArray(new RetBillVo[0]);
    }
}

