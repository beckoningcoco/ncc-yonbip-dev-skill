/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.impl.arap.prealarm;

import java.sql.SQLException;
import nc.impl.arap.prealarm.ArapRecPayPreAlarm;
import nc.vo.pub.BusinessException;

public class ArapPayablePreAlarm
extends ArapRecPayPreAlarm {
    @Override
    protected String getBillType() {
        return "F1";
    }

    @Override
    public String getAlarmResultSql() throws SQLException, BusinessException {
        StringBuffer sqlBuffer = new StringBuffer();
        sqlBuffer.append(" select a.* ");
        sqlBuffer.append(" from (");
        sqlBuffer.append(this.getPayableAlarmSql());
        sqlBuffer.append(this.union);
        sqlBuffer.append(this.getPayAlarmSql());
        sqlBuffer.append(") a ");
        sqlBuffer.append(this.getOrderPart(this.getBillType()));
        return sqlBuffer.toString();
    }

    private String getPayableAlarmSql() throws SQLException, BusinessException {
        StringBuffer sqlBuffer = new StringBuffer();
        sqlBuffer.append(this.getSelectPart("F1"));
        sqlBuffer.append(this.getFromPart("F1"));
        sqlBuffer.append(this.getWherePart("F1"));
        sqlBuffer.append(this.getGroupPart("F1"));
        return sqlBuffer.toString();
    }

    private String getPayAlarmSql() throws SQLException, BusinessException {
        StringBuffer sqlBuffer = new StringBuffer();
        sqlBuffer.append(this.getSelectPart("F3"));
        sqlBuffer.append(this.getFromPart("F3"));
        sqlBuffer.append(this.getWherePart("F3"));
        sqlBuffer.append(this.getGroupPart("F3"));
        return sqlBuffer.toString();
    }
}

