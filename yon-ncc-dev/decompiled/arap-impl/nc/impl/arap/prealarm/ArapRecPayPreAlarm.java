/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.ArapBillType2TableMapping
 *  nc.vo.arap.termitem.TermVO
 *  nc.vo.pub.BusinessException
 */
package nc.impl.arap.prealarm;

import java.sql.SQLException;
import nc.bs.arap.util.ArapBillType2TableMapping;
import nc.impl.arap.prealarm.ArapBasePreAlarm;
import nc.vo.arap.termitem.TermVO;
import nc.vo.pub.BusinessException;

public abstract class ArapRecPayPreAlarm
extends ArapBasePreAlarm {
    protected String getSelectPart(String billType) {
        StringBuffer sqlBuffer = new StringBuffer(" select ");
        if ("F0".equals(billType) || "F2".equals(billType)) {
            sqlBuffer.append(this.fbAlias).append(".").append("customer").append(", ");
        } else if ("F1".equals(billType) || "F3".equals(billType)) {
            sqlBuffer.append(this.fbAlias).append(".").append("supplier").append(", ");
        }
        sqlBuffer.append(this.fbAlias).append(".").append("pk_deptid").append(", ");
        sqlBuffer.append(this.fbAlias).append(".").append("pk_psndoc").append(", ");
        sqlBuffer.append(this.zbAlias).append(".").append("billno").append(", ");
        sqlBuffer.append(this.zbAlias).append(".").append("billdate").append(", ");
        sqlBuffer.append(this.fbAlias).append(".").append("scomment").append(", ");
        sqlBuffer.append(this.fbAlias).append(".").append("pk_currtype").append(", ");
        sqlBuffer.append(this.fbAlias).append(".").append("invoiceno").append(", ");
        String moneyFld = null;
        String localMoneyFld = null;
        if ("F0".equals(billType) || "F3".equals(billType)) {
            moneyFld = "money_de";
            localMoneyFld = "local_money_de";
        } else if ("F1".equals(billType) || "F2".equals(billType)) {
            moneyFld = "money_cr";
            localMoneyFld = "local_money_cr";
        }
        sqlBuffer.append("sum(").append(this.xybAlias).append(".").append(moneyFld).append(") ").append(moneyFld).append(", ");
        sqlBuffer.append("sum(").append(this.xybAlias).append(".").append(localMoneyFld).append(") ").append(localMoneyFld).append(", ");
        sqlBuffer.append("sum(").append(this.xybAlias).append(".").append("money_bal").append(") ").append("money_bal").append(", ");
        sqlBuffer.append("sum(").append(this.xybAlias).append(".").append("local_money_bal").append(") ").append("local_money_bal");
        return sqlBuffer.toString();
    }

    protected String getFromPart(String billType) {
        StringBuffer sqlBuffer = new StringBuffer(" from ");
        sqlBuffer.append(ArapBillType2TableMapping.getParentTable((String)billType)).append(this.blank).append(this.zbAlias).append(", ");
        sqlBuffer.append(ArapBillType2TableMapping.getChildrenTable((String)billType)).append(this.blank).append(this.fbAlias).append(", ");
        sqlBuffer.append(new TermVO().getTableName()).append(this.blank).append(this.xybAlias);
        return sqlBuffer.toString();
    }

    protected String getWherePart(String billType) throws SQLException, BusinessException {
        StringBuffer sqlBuffer = new StringBuffer(" where 1 = 1 ");
        sqlBuffer.append(this.and).append(this.zbAlias).append(".").append(this.getFieldNameWithoutTableName(ArapBillType2TableMapping.getParentTablePK((String)billType))).append(" = ").append(this.fbAlias).append(".").append(this.getFieldNameWithoutTableName(ArapBillType2TableMapping.getParentTablePK((String)billType)));
        sqlBuffer.append(this.and).append(this.fbAlias).append(".").append(this.getFieldNameWithoutTableName(ArapBillType2TableMapping.getParentTablePK((String)billType))).append(" = ").append(this.xybAlias).append(".").append("pk_bill");
        sqlBuffer.append(this.and).append(this.fbAlias).append(".").append(this.getFieldNameWithoutTableName(ArapBillType2TableMapping.getChildrenTablePK((String)billType))).append(" = ").append(this.xybAlias).append(".").append("pk_item");
        sqlBuffer.append(this.and).append(this.fbAlias).append(".").append("money_bal").append(" != 0 ");
        sqlBuffer.append(this.and).append(this.zbAlias).append(".dr = 0 ");
        sqlBuffer.append(this.and).append(this.fbAlias).append(".dr = 0 ");
        sqlBuffer.append(this.and).append(this.xybAlias).append(".dr = 0 ");
        sqlBuffer.append(this.and).append(this.getAlarmSql());
        if ("F0".equals(billType) || "F2".equals(billType)) {
            sqlBuffer.append(this.and).append(this.getCustomerSql());
        } else if ("F1".equals(billType) || "F3".equals(billType)) {
            sqlBuffer.append(this.and).append(this.getSupplierSql());
        }
        sqlBuffer.append(this.and).append(this.getDeptSql());
        sqlBuffer.append(this.and).append(this.getBusimanSql());
        sqlBuffer.append(this.and).append(this.getAssoObjSql());
        sqlBuffer.append(this.and).append(this.getTradeTypeSql());
        sqlBuffer.append(this.and).append(this.getCurrtypeSql());
        sqlBuffer.append(this.and).append(this.getBillStatusSql());
        sqlBuffer.append(this.and).append(this.getOrgSql());
        sqlBuffer.append(this.and).append(this.getGroupSql());
        return sqlBuffer.toString();
    }

    protected String getGroupPart(String billType) {
        StringBuffer sqlBuffer = new StringBuffer(" group by ");
        if ("F0".equals(billType) || "F2".equals(billType)) {
            sqlBuffer.append(this.fbAlias).append(".").append("customer").append(", ");
        } else if ("F1".equals(billType) || "F3".equals(billType)) {
            sqlBuffer.append(this.fbAlias).append(".").append("supplier").append(", ");
        }
        sqlBuffer.append(this.fbAlias).append(".").append("pk_deptid").append(", ");
        sqlBuffer.append(this.fbAlias).append(".").append("pk_psndoc").append(", ");
        sqlBuffer.append(this.zbAlias).append(".").append("billno").append(", ");
        sqlBuffer.append(this.zbAlias).append(".").append("billdate").append(", ");
        sqlBuffer.append(this.fbAlias).append(".").append("scomment").append(", ");
        sqlBuffer.append(this.fbAlias).append(".").append("pk_currtype").append(", ");
        sqlBuffer.append(this.fbAlias).append(".").append("invoiceno");
        return sqlBuffer.toString();
    }

    protected String getOrderPart(String billType) {
        StringBuffer sqlBuffer = new StringBuffer(" order by ");
        if ("F0".equals(billType) || "F2".equals(billType)) {
            sqlBuffer.append("customer");
        } else if ("F1".equals(billType) || "F3".equals(billType)) {
            sqlBuffer.append("supplier");
        }
        sqlBuffer.append(", ").append("pk_deptid");
        sqlBuffer.append(", ").append("pk_psndoc");
        sqlBuffer.append(", ").append("billno");
        sqlBuffer.append(", ").append("billdate");
        return sqlBuffer.toString();
    }
}

