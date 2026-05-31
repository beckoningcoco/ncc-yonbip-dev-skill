/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.sec.esapi.NCESAPI
 *  nc.jdbc.framework.PersistenceManager
 *  nc.jdbc.framework.exception.DbException
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.pub.IArapBilltypeInfo
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.bs.arap.util.Collections
 *  nccloud.itf.arap.sagas.compensate.refund.IRefundSagasCompensateService
 */
package nccloud.impl.arap.sagas.compensate.refund;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import nc.bs.sec.esapi.NCESAPI;
import nc.jdbc.framework.PersistenceManager;
import nc.jdbc.framework.exception.DbException;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.IArapBilltypeInfo;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nccloud.bs.arap.util.Collections;
import nccloud.itf.arap.sagas.compensate.refund.IRefundSagasCompensateService;

public class RefundSagasCompensateServiceImpl
implements IRefundSagasCompensateService {
    public void doCompensate(Map<String, Serializable> map) throws BusinessException {
        if (Collections.isEmpty(map)) {
            return;
        }
        Map compensateData = (Map)((Object)map.get("SAGAS_CALL_DATA"));
        if (Collections.isEmpty((Map)compensateData)) {
            return;
        }
        ArrayList billVOs = (ArrayList)compensateData.get("BillVO");
        String pk_billtype = (String)((Map)billVOs.get(0)).get("pk_billtype");
        ((Map)billVOs.get(0)).remove("pk_billtype");
        IArapBilltypeInfo billtypevo = ArapBillTypeInfo.getInstance((Object)pk_billtype);
        Set entrySet = compensateData.entrySet();
        for (Map.Entry entry : entrySet) {
            String key = (String)entry.getKey();
            String tableName = null;
            String pkFiled = null;
            switch (key) {
                case "BillVO": {
                    tableName = billtypevo.getTableNameBill();
                    pkFiled = billtypevo.getTablePrimaryKeyBill();
                    break;
                }
                case "BillItemVO": {
                    tableName = billtypevo.getTableNameItem();
                    pkFiled = billtypevo.getTablePrimaryKeyItem();
                    break;
                }
                case "TermVO": {
                    tableName = "arap_termitem";
                    pkFiled = "pk_termitem";
                    break;
                }
                case "ArapBusiDataVO": {
                    tableName = "arap_busidata";
                    pkFiled = "pk_busidata";
                    break;
                }
                case "TallyVO": {
                    tableName = "arap_tally";
                    pkFiled = "pk_tally";
                    break;
                }
            }
            this.compensateUpdate(tableName, pkFiled, (ArrayList)entry.getValue());
        }
    }

    private void compensateUpdate(String tableName, String pkFiled, ArrayList<Map<String, Object>> values) throws BusinessException {
        if (tableName == null || pkFiled == null || Collections.isEmpty(values)) {
            return;
        }
        StringBuffer sql = new StringBuffer(" update " + tableName + " set ");
        Set<String> fieldSet = values.get(0).keySet();
        for (String field : fieldSet) {
            if (pkFiled.equals(field)) continue;
            if (sql.charAt(sql.length() - 1) == '?') {
                sql.append(",");
            }
            sql.append(field);
            sql.append("= ?");
        }
        sql.append(" where ");
        sql.append(pkFiled);
        sql.append("= ?");
        try (Connection conn = PersistenceManager.getInstance().getJdbcSession().getConnection();
             PreparedStatement updatestmt = conn.prepareStatement(sql.toString());){
            for (Map<String, Object> value : values) {
                int i = 1;
                for (String field : fieldSet) {
                    if (pkFiled.equals(field)) continue;
                    this.setObjectParam(updatestmt, i++, value.get(field));
                }
                updatestmt.setString(i, NCESAPI.sqlEncode((String)((String)value.get(pkFiled))));
                updatestmt.addBatch();
            }
            updatestmt.executeBatch();
        }
        catch (SQLException | DbException e) {
            throw ExceptionHandler.handleException(this.getClass(), (Exception)e);
        }
    }

    private void setObjectParam(PreparedStatement updatestmt, int index, Object value) throws SQLException {
        if (value.getClass() == null) {
            return;
        }
        switch (value.getClass().getName()) {
            case "nc.vo.pub.lang.UFDouble": {
                updatestmt.setDouble(index, ((UFDouble)value).doubleValue());
                break;
            }
            case "nc.vo.pub.lang.UFDate": {
                updatestmt.setDate(index, (Date)((UFDate)value).toDate());
                break;
            }
            default: {
                String parm = "~";
                if (value != null) {
                    parm = value.toString();
                }
                updatestmt.setString(index, parm);
            }
        }
    }
}

