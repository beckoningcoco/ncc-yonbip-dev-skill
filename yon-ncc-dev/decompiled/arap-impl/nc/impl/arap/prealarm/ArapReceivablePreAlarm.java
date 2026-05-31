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

public class ArapReceivablePreAlarm
extends ArapRecPayPreAlarm {
    @Override
    protected String getBillType() {
        return "F0";
    }

    @Override
    public String getAlarmResultSql() throws SQLException, BusinessException {
        StringBuffer sqlBuffer = new StringBuffer();
        sqlBuffer.append(" select a.* ");
        sqlBuffer.append(" from (");
        sqlBuffer.append(this.getReceivableAlarmSql());
        sqlBuffer.append(this.union);
        sqlBuffer.append(this.getGatherAlarmSql());
        sqlBuffer.append(") a ");
        sqlBuffer.append(this.getOrderPart(this.getBillType()));
        return sqlBuffer.toString();
    }

    private String getReceivableAlarmSql() throws SQLException, BusinessException {
        StringBuffer sqlBuffer = new StringBuffer();
        sqlBuffer.append(this.getSelectPart("F0"));
        sqlBuffer.append(this.getFromPart("F0"));
        sqlBuffer.append(this.getWherePart("F0"));
        sqlBuffer.append(this.getGroupPart("F0"));
        return sqlBuffer.toString();
    }

    private String getGatherAlarmSql() throws SQLException, BusinessException {
        StringBuffer sqlBuffer = new StringBuffer();
        sqlBuffer.append(this.getSelectPart("F2"));
        sqlBuffer.append(this.getFromPart("F2"));
        sqlBuffer.append(this.getWherePart("F2"));
        sqlBuffer.append(this.getGroupPart("F2"));
        return sqlBuffer.toString();
    }
}

