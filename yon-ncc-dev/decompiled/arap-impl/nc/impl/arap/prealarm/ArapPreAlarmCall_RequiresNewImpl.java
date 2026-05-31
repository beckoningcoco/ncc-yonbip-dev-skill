/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.DAOException
 *  nc.bs.pub.pa.PreAlertContext
 *  nc.itf.arap.prealarm.IArapPreAlarmCall_RequiresNew
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.utils.fipub.FipubSqlExecuter
 *  nc.utils.fipub.MemoryResultSetProcessor
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.rs.MemoryResultSet
 */
package nc.impl.arap.prealarm;

import java.sql.SQLException;
import nc.bs.dao.DAOException;
import nc.bs.pub.pa.PreAlertContext;
import nc.impl.arap.prealarm.ArapBasePreAlarm;
import nc.impl.arap.prealarm.ArapMintAlarm;
import nc.impl.arap.prealarm.ArapPayablePreAlarm;
import nc.impl.arap.prealarm.ArapReceivablePreAlarm;
import nc.impl.arap.prealarm.BConferPreAlarm;
import nc.itf.arap.prealarm.IArapPreAlarmCall_RequiresNew;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.utils.fipub.FipubSqlExecuter;
import nc.utils.fipub.MemoryResultSetProcessor;
import nc.vo.pub.BusinessException;
import nc.vo.pub.rs.MemoryResultSet;

public class ArapPreAlarmCall_RequiresNewImpl
extends FipubSqlExecuter
implements IArapPreAlarmCall_RequiresNew {
    public MemoryResultSet getReceivablePreAlarmResult(PreAlertContext context) throws SQLException, BusinessException {
        ArapReceivablePreAlarm alarm = new ArapReceivablePreAlarm();
        alarm.init(context);
        String objTypeScopeSql = alarm.getObjTypeScopeSql();
        String resultSql = ((ArapBasePreAlarm)alarm).getAlarmResultSql();
        String dropTableSql = alarm.getDropTmpTblSql();
        this.executeUpdate(objTypeScopeSql);
        MemoryResultSet resultSet = (MemoryResultSet)this.executeQuery(resultSql, (ResultSetProcessor)new MemoryResultSetProcessor());
        this.executeUpdate(dropTableSql);
        return resultSet;
    }

    public MemoryResultSet getPayablePreAlarmResult(PreAlertContext context) throws SQLException, BusinessException {
        ArapPayablePreAlarm alarm = new ArapPayablePreAlarm();
        alarm.init(context);
        String objTypeScopeSql = alarm.getObjTypeScopeSql();
        String resultSql = ((ArapBasePreAlarm)alarm).getAlarmResultSql();
        String dropTableSql = alarm.getDropTmpTblSql();
        this.executeUpdate(objTypeScopeSql);
        MemoryResultSet resultSet = (MemoryResultSet)this.executeQuery(resultSql, (ResultSetProcessor)new MemoryResultSetProcessor());
        this.executeUpdate(dropTableSql);
        return resultSet;
    }

    public MemoryResultSet getArapMintAlarmResult(PreAlertContext context) throws SQLException, BusinessException {
        ArapMintAlarm alarm = new ArapMintAlarm();
        alarm.init(context);
        return (MemoryResultSet)this.executeQuery(((ArapBasePreAlarm)alarm).getAlarmResultSql(), (ResultSetProcessor)new MemoryResultSetProcessor());
    }

    public MemoryResultSet getBConferAlarmResult(PreAlertContext context) throws SQLException, DAOException, BusinessException {
        BConferPreAlarm alarm = new BConferPreAlarm();
        ((ArapBasePreAlarm)alarm).init(context);
        return (MemoryResultSet)this.executeQuery(((ArapBasePreAlarm)alarm).getAlarmResultSql(), (ResultSetProcessor)new MemoryResultSetProcessor());
    }
}

