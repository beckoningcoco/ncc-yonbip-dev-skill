/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.bd.timezone.TimezoneUtil
 *  nc.pubitf.org.IOrgUnitPubService
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.arap.tally.TallyVO
 *  nc.vo.org.OrgVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.impl.arap.prealarm;

import java.sql.SQLException;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import nc.bs.arap.util.SqlUtils;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.impl.arap.prealarm.ArapBasePreAlarm;
import nc.impl.arap.prealarm.ArapPreAlarmEnumCollection;
import nc.itf.bd.timezone.TimezoneUtil;
import nc.pubitf.org.IOrgUnitPubService;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.tally.TallyVO;
import nc.vo.org.OrgVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public class ArapMintAlarm
extends ArapBasePreAlarm {
    @Override
    protected String getBillType() {
        return null;
    }

    @Override
    public String getAlarmResultSql() throws SQLException, BusinessException {
        StringBuffer sqlBuffer = new StringBuffer();
        sqlBuffer.append(" select ");
        sqlBuffer.append("customer").append(", ");
        sqlBuffer.append("supplier").append(", ");
        sqlBuffer.append("pk_deptid").append(", ");
        sqlBuffer.append("pk_psndoc").append(", ");
        sqlBuffer.append("billno").append(", ");
        sqlBuffer.append("billdate").append(", ");
        sqlBuffer.append("brief").append(", ");
        sqlBuffer.append("pk_currtype").append(", ");
        sqlBuffer.append("invoiceno").append(", ");
        sqlBuffer.append(" case ");
        sqlBuffer.append(" when sum(").append("money_cr").append(") < 0 then ");
        sqlBuffer.append(" 0 - sum(abs(").append("money_de").append("-").append("money_cr").append(")) ");
        sqlBuffer.append(" else ");
        sqlBuffer.append(" sum(abs(").append("money_de").append("-").append("money_cr").append(")) ");
        sqlBuffer.append(" end money_ori, ");
        sqlBuffer.append(" case ");
        sqlBuffer.append(" when sum(").append("local_money_cr").append(") < 0 then ");
        sqlBuffer.append(" 0 - sum(abs(").append("local_money_de").append("-").append("local_money_cr").append(")) ");
        sqlBuffer.append(" else ");
        sqlBuffer.append(" sum(abs(").append("local_money_de").append("-").append("local_money_cr").append(")) ");
        sqlBuffer.append(" end money_loc, ");
        sqlBuffer.append("billclass");
        sqlBuffer.append(" from ");
        sqlBuffer.append(TallyVO.getDefaultTableName());
        sqlBuffer.append(" where ");
        sqlBuffer.append("pk_dealnum").append(" = '~' ");
        sqlBuffer.append(this.getAlarmSql());
        if (!StringUtils.isEmpty((CharSequence)this.assoobj)) {
            sqlBuffer.append(this.and).append("objtype").append(" = ").append(this.assoobj);
        }
        if (!ArrayUtils.isEmpty((Object[])this.tradetype)) {
            sqlBuffer.append(this.and).append(SqlUtils.getInStr((String)"pk_tradetype", (String[])this.tradetype));
        }
        if (!ArrayUtils.isEmpty((Object[])this.currtype)) {
            sqlBuffer.append(this.and).append(SqlUtils.getInStr((String)"pk_currtype", (String[])this.currtype));
        }
        if (ArapPreAlarmEnumCollection.BillStatus.UNEFFECT.getCode().toString().equals(this.billstatus)) {
            sqlBuffer.append(this.and).append("effectstatus").append(" < ").append(BillEnumCollection.InureSign.OKINURE.VALUE);
        } else if (ArapPreAlarmEnumCollection.BillStatus.EFFECT.getCode().toString().equals(this.billstatus)) {
            sqlBuffer.append(this.and).append("effectstatus").append(" = ").append(BillEnumCollection.InureSign.OKINURE.VALUE);
        }
        if (!ArrayUtils.isEmpty((Object[])this.pk_org)) {
            sqlBuffer.append(this.and).append(SqlUtils.getInStr((String)"pk_org", (String[])this.pk_org, (boolean[])new boolean[]{false}));
        }
        sqlBuffer.append(this.and).append("pk_group").append(" = '").append(this.pk_group).append("' ");
        sqlBuffer.append(" group by ");
        sqlBuffer.append("customer").append(", ");
        sqlBuffer.append("supplier").append(", ");
        sqlBuffer.append("pk_deptid").append(", ");
        sqlBuffer.append("pk_psndoc").append(", ");
        sqlBuffer.append("billno").append(", ");
        sqlBuffer.append("billdate").append(", ");
        sqlBuffer.append("brief").append(", ");
        sqlBuffer.append("pk_currtype").append(", ");
        sqlBuffer.append("invoiceno").append(", ");
        sqlBuffer.append("billclass");
        sqlBuffer.append(" having 1 = 1 ");
        if (this.moneystart != null) {
            sqlBuffer.append(this.and).append(" abs(sum(").append("money_de").append("-").append("money_cr").append(")) >= ").append(this.moneystart);
        }
        if (this.moneyend != null) {
            sqlBuffer.append(this.and).append(" abs(sum(").append("money_de").append("-").append("money_cr").append(")) <= ").append(this.moneyend);
        }
        sqlBuffer.append(" order by ");
        sqlBuffer.append("customer").append(", ");
        sqlBuffer.append("supplier").append(", ");
        sqlBuffer.append("pk_deptid").append(", ");
        sqlBuffer.append("pk_psndoc").append(", ");
        sqlBuffer.append("billclass").append(", ");
        sqlBuffer.append("billno").append(", ");
        sqlBuffer.append("billdate");
        return sqlBuffer.toString();
    }

    @Override
    protected String getAlarmSql() {
        GregorianCalendar calendar = new GregorianCalendar();
        UFDate currDate = new UFDate(new UFDate(calendar.getTimeInMillis()).toStdString(), false);
        Boolean isSensitiveTimeZone = InvocationInfoProxy.getInstance().getSensitiveTimeZone();
        if (isSensitiveTimeZone.booleanValue()) {
            OrgVO[] orgVOs = null;
            TimeZone clientTimeZone = null;
            try {
                orgVOs = ArapMintAlarm.getOrgUnitPubService().getOrgs(this.pk_org, new String[]{"pk_org", "pk_vid", "name", "pk_group", "pk_timezone"});
                if (orgVOs != null && orgVOs[0] != null) {
                    clientTimeZone = TimezoneUtil.getTimeZone((String)orgVOs[0].getPk_timezone());
                }
            }
            catch (BusinessException e) {
                ExceptionUtils.wrappException((Exception)((Object)e));
            }
            if (orgVOs == null || clientTimeZone == null) {
                clientTimeZone = TimeZone.getTimeZone(InvocationInfoProxy.getInstance().getTimeZone());
            }
            String datelineDate = new UFDateTime(currDate.toString()).getDate().toStdString(clientTimeZone);
            currDate = new UFDate(datelineDate, clientTimeZone, false);
        }
        StringBuffer sqlBuffer = new StringBuffer();
        if (this.daysbefore != null) {
            UFDate alarmDate = currDate.getDateBefore(this.daysbefore + 1);
            sqlBuffer.append(this.and).append("billdate").append(" > '").append(alarmDate).append("' ");
        }
        sqlBuffer.append(this.and).append("billdate").append(" <= '").append(currDate).append("' ");
        return sqlBuffer.toString();
    }

    public static IOrgUnitPubService getOrgUnitPubService() {
        try {
            return (IOrgUnitPubService)NCLocator.getInstance().lookup(IOrgUnitPubService.class.getName());
        }
        catch (Exception ex) {
            Logger.error((Object)ex);
            return null;
        }
    }
}

