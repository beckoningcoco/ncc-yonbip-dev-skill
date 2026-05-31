/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.businessevent.BdUpdateEvent
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.bs.dao.BaseDAO
 *  nc.bs.logging.Logger
 *  nc.bs.sec.esapi.NCESAPI
 *  nc.jdbc.framework.PersistenceManager
 *  nc.vo.arap.agiotage.ArapBusiDataVO
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.termitem.TermVO
 *  nc.vo.cmp.apply.AggApplyVO
 *  nc.vo.cmp.apply.ApplyBVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.pub.SqlBuilder
 *  nccloud.bs.arap.sagas.util.SagasUtils
 *  nccloud.itf.arap.sagas.compensate.listener.IArapBillForApplyListenerSagasCompenstate
 */
package nc.bs.arap.busireg;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.util.SqlUtils;
import nc.bs.businessevent.BdUpdateEvent;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.dao.BaseDAO;
import nc.bs.logging.Logger;
import nc.bs.sec.esapi.NCESAPI;
import nc.jdbc.framework.PersistenceManager;
import nc.vo.arap.agiotage.ArapBusiDataVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.termitem.TermVO;
import nc.vo.cmp.apply.AggApplyVO;
import nc.vo.cmp.apply.ApplyBVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.pub.SqlBuilder;
import nccloud.bs.arap.sagas.util.SagasUtils;
import nccloud.itf.arap.sagas.compensate.listener.IArapBillForApplyListenerSagasCompenstate;

public class ArapBillForApplyListener
implements IBusinessListener {
    public void doAction(IBusinessEvent event) throws BusinessException {
        ApplyBVO[] childrenVO;
        AggApplyVO[] vos = new AggApplyVO[]{};
        AggApplyVO[] oldvos = new AggApplyVO[]{};
        if (event instanceof BdUpdateEvent) {
            BdUpdateEvent bd = (BdUpdateEvent)event;
            oldvos = (AggApplyVO[])bd.getOldObject();
            vos = (AggApplyVO[])bd.getNewObject();
        } else {
            vos = (AggApplyVO[])((BusinessEvent)event).getObject();
        }
        HashMap<String, UFDouble> termMap = new HashMap<String, UFDouble>();
        HashMap<String, Map<String, UFDouble>> billMap = new HashMap<String, Map<String, UFDouble>>();
        for (AggApplyVO vo : vos) {
            for (ApplyBVO child : childrenVO = (ApplyBVO[])vo.getChildrenVO()) {
                if (event.getEventType().equals("1006")) {
                    this.gatherMoney(termMap, billMap, child, true);
                    continue;
                }
                this.gatherMoney(termMap, billMap, child, false);
            }
        }
        for (AggApplyVO vo : oldvos) {
            for (ApplyBVO child : childrenVO = (ApplyBVO[])vo.getChildrenVO()) {
                this.gatherMoney(termMap, billMap, child, true);
            }
        }
        try {
            this.updateMoney("arap_termitem", "pk_termitem", "occupationmny", termMap);
            this.updateMoney("arap_busidata", "pk_termitem", "occupationmny", termMap);
            for (String key : billMap.keySet()) {
                this.updateMoney(ArapBillTypeInfo.getInstance((Object)key).getTableNameItem(), ArapBillTypeInfo.getInstance((Object)key).getTablePrimaryKeyItem(), "occupationmny", (Map)billMap.get(key));
            }
        }
        catch (SQLException e) {
            Logger.error((Object)e.getMessage());
            throw new BusinessException((Throwable)e);
        }
        String[] pks = termMap.keySet().toArray(new String[0]);
        Collection errorInfo = new BaseDAO().retrieveByClause(TermVO.class, SqlUtils.getInStr((String)"pk_termitem", (String[])pks) + " and (abs(occupationmny)>abs(money_bal) or occupationmny*money_bal<0)");
        if (errorInfo != null && errorInfo.size() != 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0854"));
        }
        Collection siz = new BaseDAO().retrieveByClause(ArapBusiDataVO.class, SqlUtils.getInStr((String)"pk_termitem", (String[])pks));
        if (siz == null || siz.size() != pks.length) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0855"));
        }
        this.doFrozenBusiData(pks);
        this.doFrozenBill(billMap, vos);
        this.setSagasCompenstate(termMap, billMap);
    }

    private void updateMoney(String table, String pkfield, String field, Map<String, UFDouble> termMap) throws BusinessException, SQLException {
        Connection conn = null;
        Statement updatestmt = null;
        try {
            conn = PersistenceManager.getInstance().getJdbcSession().getConnection();
            StringBuffer sql = new StringBuffer(" update " + table + " set ");
            sql.append(field);
            sql.append("=");
            sql.append(field);
            sql.append("-?");
            sql.append(" where ");
            sql.append(pkfield);
            sql.append("=?");
            updatestmt = conn.prepareStatement(sql.toString());
            for (String key : termMap.keySet()) {
                UFDouble value = termMap.get(key);
                updatestmt.setDouble(1, value.doubleValue());
                updatestmt.setString(2, NCESAPI.sqlEncode((String)key));
                updatestmt.addBatch();
            }
            updatestmt.executeBatch();
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException(this.getClass(), (Exception)e);
        }
        finally {
            if (updatestmt != null) {
                updatestmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    private void gatherMoney(Map<String, UFDouble> termMap, Map<String, Map<String, UFDouble>> billMap, ApplyBVO child, boolean isNegtive) {
        UFDouble spaymny;
        String pk_srcbilltypeid = child.getPk_srcbilltypeid();
        if (pk_srcbilltypeid == null) {
            return;
        }
        if (pk_srcbilltypeid.equals("0000Z3000000000000F0") || "F0".equals(pk_srcbilltypeid)) {
            pk_srcbilltypeid = "F0";
        } else if (pk_srcbilltypeid.equals("0000Z3000000000000F1") || "F1".equals(pk_srcbilltypeid)) {
            pk_srcbilltypeid = "F1";
        } else if (pk_srcbilltypeid.equals("0000Z3000000000000F2") || "F2".equals(pk_srcbilltypeid)) {
            pk_srcbilltypeid = "F2";
        } else if (pk_srcbilltypeid.equals("0000Z3000000000000F3") || "F3".equals(pk_srcbilltypeid)) {
            pk_srcbilltypeid = "F3";
        } else {
            return;
        }
        String pk_payterm_b = child.getPk_payterm_b();
        String pk_srcbillrowid = child.getPk_srcbillrowid();
        UFDouble termmoney = spaymny = child.getApplymny().multiply(isNegtive ? -1.0 : 1.0).multiply(pk_srcbilltypeid.equals("F0") || pk_srcbilltypeid.equals("F3") ? -1.0 : 1.0);
        if (termMap.containsKey(pk_payterm_b)) {
            termmoney = termmoney.add(termMap.get(pk_payterm_b));
        }
        termMap.put(pk_payterm_b, termmoney);
        Map<Object, Object> mbill = new HashMap();
        if (billMap.containsKey(pk_srcbilltypeid)) {
            mbill = billMap.get(pk_srcbilltypeid);
        }
        UFDouble billmoney = spaymny;
        if (mbill.containsKey(pk_srcbillrowid)) {
            billmoney = billmoney.add((UFDouble)mbill.get(pk_srcbillrowid));
        }
        mbill.put(pk_srcbillrowid, billmoney);
        billMap.put(pk_srcbilltypeid, mbill);
    }

    private void setSagasCompenstate(Map<String, UFDouble> termMap, Map<String, Map<String, UFDouble>> billMap) {
        HashMap param = new HashMap();
        HashMap<String, Map<String, Object>> hashMap = new HashMap<String, Map<String, Object>>();
        hashMap.put("SAGAS_LISTENER_TERMDATA", termMap);
        hashMap.put("SAGAS_LISTENER_BILLDATA", billMap);
        param.put("SAGAS_CALL_DATA", hashMap);
        SagasUtils.setCompensateService(IArapBillForApplyListenerSagasCompenstate.class, param);
    }

    private void doFrozenBusiData(String[] pkterms) throws BusinessException {
        if (pkterms.length == 0 || pkterms == null) {
            return;
        }
        BaseDAO dao = new BaseDAO();
        SqlBuilder sql = new SqlBuilder();
        String inStr = null;
        if (pkterms.length > 200) {
            try {
                inStr = SqlUtils.getInStr((String)"pk_termitem", (String[])pkterms, (boolean[])new boolean[]{true});
                sql.append(inStr);
            }
            catch (SQLException e) {
                throw new BusinessException(e.getMessage());
            }
        } else {
            sql.append("pk_termitem", pkterms);
        }
        Collection vos = dao.retrieveByClause(ArapBusiDataVO.class, sql.toString());
        ArapBusiDataVO[] busVOs = vos.toArray(new ArapBusiDataVO[0]);
        SagasUtils.frozenAndAddSaga((String)"other", (SuperVO[])busVOs, (String)"billno", (String)busVOs[0].getPk_billtype());
    }

    private void doFrozenBill(Map<String, Map<String, UFDouble>> billMap, AggApplyVO[] vos) throws BusinessException {
        ArapBillDAO dao = new ArapBillDAO();
        ArrayList<String> pklist = new ArrayList<String>();
        for (AggApplyVO vo : vos) {
            ApplyBVO[] childrenVO;
            for (ApplyBVO child : childrenVO = (ApplyBVO[])vo.getChildrenVO()) {
                pklist.add(child.getPk_srcbill());
            }
        }
        for (String billType : billMap.keySet()) {
            AggregatedValueObject[] bills = dao.queryBillByPrimaryKeys(pklist.toArray(new String[0]), billType);
            SagasUtils.frozenAndAddSaga((String)"update", (AggregatedValueObject[])bills);
        }
    }

    public void doUpdataForSagaCompenstate(Map<String, UFDouble> termMap, Map<String, Map<String, UFDouble>> billMap) throws BusinessException {
        try {
            this.updateMoney("arap_termitem", "pk_termitem", "occupationmny", termMap);
            this.updateMoney("arap_busidata", "pk_termitem", "occupationmny", termMap);
            for (String key : billMap.keySet()) {
                this.updateMoney(ArapBillTypeInfo.getInstance((Object)key).getTableNameItem(), ArapBillTypeInfo.getInstance((Object)key).getTablePrimaryKeyItem(), "occupationmny", billMap.get(key));
            }
        }
        catch (SQLException e) {
            Logger.error((Object)e.getMessage());
            throw new BusinessException((Throwable)e);
        }
    }
}

