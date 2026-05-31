/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.pub.pa.PreAlertContext
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.rs.MemoryResultSet
 */
package nc.itf.arap.prealarm;

import java.sql.SQLException;
import nc.bs.pub.pa.PreAlertContext;
import nc.vo.pub.BusinessException;
import nc.vo.pub.rs.MemoryResultSet;

public interface IArapPreAlarmCall_RequiresNew {
    public MemoryResultSet getReceivablePreAlarmResult(PreAlertContext var1) throws SQLException, BusinessException;

    public MemoryResultSet getPayablePreAlarmResult(PreAlertContext var1) throws SQLException, BusinessException;

    public MemoryResultSet getArapMintAlarmResult(PreAlertContext var1) throws SQLException, BusinessException;

    public MemoryResultSet getBConferAlarmResult(PreAlertContext var1) throws SQLException, BusinessException;
}

