/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.md.model.MetaDataException
 *  nc.pub.report.utils.ReportSqlUtils
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.arap.pub.BillEnumCollection$ObjType
 *  nc.vo.arap.reminder.ReminderQueryVO
 *  nc.vo.arap.tally.TallyAgrVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.sql;

import java.sql.SQLException;
import java.util.ArrayList;
import nc.bs.arap.sql.ReminderSqlUtils;
import nc.bs.arap.util.SqlUtils;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.md.model.MetaDataException;
import nc.pub.report.utils.ReportSqlUtils;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.reminder.ReminderQueryVO;
import nc.vo.arap.tally.TallyAgrVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public class ReminderSQLCreator {
    private ReminderQueryVO queryVO = null;
    private String TIME_BEGIN = " 00:00:00";
    private String TIME_END = " 23:59:59";
    private String tmpTblName = null;
    private String[] tmpTblColNames = null;
    private Integer[] tmpTblColTypes = null;
    private String COLUMN_FIELD_STRING = "pk_group,pk_org,anadate,customer,pk_deptid,pk_psndoc,pk_currtype,pk_billtype,pk_recbill,billdate,pk_tradetype,billno,project,material,invoiceno,outstoreno,expiredate,propertyid";
    private String COLUMN_FIELD_DECIMAL = "money_de,money_done,quantity_bal,money_bal,expiredmny,unexpiremny,term_money_de";
    private String COLUMN_FIELD_STRING_ACCAGE = "pk_group,pk_org,anadate,customer,pk_deptid,pk_psndoc,pk_currtype,pk_billtype,pk_recbill,billdate,pk_tradetype,billno,project,material,invoiceno,outstoreno,expiredate,propertyid";
    private String COLUMN_FIELD_DECIMAL_ACCAGE = "money_de,money_done,quantity_bal,money_bal,expiredmny,unexpiremny,term_money_de";

    public void setParams(ReminderQueryVO queryVO) {
        this.queryVO = queryVO;
    }

    public String[] getSQLs() throws SQLException, BusinessException {
        ArrayList<String> sqlList = new ArrayList<String>();
        String detailSql = this.getDetailSql();
        if ("confirmrec".equals(this.queryVO.getRecScope())) {
            sqlList.add(this.getDetailSql());
        } else {
            String detailSql2 = detailSql.replaceAll("recbill", "estirecbill").replaceAll("recitem", "estirecitem");
            if ("unconfirmrec".equals(this.queryVO.getRecScope())) {
                sqlList.add(detailSql2);
            } else {
                sqlList.add(detailSql);
                sqlList.add(detailSql2);
            }
        }
        sqlList.add(this.getResultSql());
        sqlList.add(this.getDropTmpTblSql());
        return sqlList.toArray(new String[0]);
    }

    private String getResultSql() throws SQLException {
        StringBuffer sqlBuffer = new StringBuffer();
        sqlBuffer.append(" select t.* from ").append(this.getTmpTblName()).append(" t");
        return sqlBuffer.toString();
    }

    private String getDetailSql() throws SQLException, BusinessException {
        StringBuffer sqlBuffer = new StringBuffer();
        String anadate = this.queryVO.getAnalysedate();
        String anadateName = ReminderSqlUtils.getAnalysedateName(anadate);
        UFDate dateline = null;
        dateline = "final".equals(this.queryVO.getAnaPattern()) || this.queryVO.getEnddate() == null ? this.getBusisDate(false) : this.queryVO.getEnddate();
        sqlBuffer.append(" insert into ").append(this.getTmpTblName());
        sqlBuffer.append(" select ");
        sqlBuffer.append("ar_recitem.pk_group, ar_recitem.pk_org, ");
        sqlBuffer.append(anadateName).append(" anadate,");
        if (BillEnumCollection.ObjType.CUSTOMER.VALUE.toString().equals(this.queryVO.getQueryObj())) {
            sqlBuffer.append("ar_recitem.customer customer, ");
            if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getDept())) {
                sqlBuffer.append("ar_recitem.pk_deptid pk_deptid, ");
            } else {
                sqlBuffer.append("'' pk_deptid, ");
            }
            if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getPsndoc())) {
                sqlBuffer.append("ar_recitem.pk_psndoc pk_psndoc, ");
            } else {
                sqlBuffer.append("'' pk_psndoc, ");
            }
        } else if (BillEnumCollection.ObjType.DEP.VALUE.toString().equals(this.queryVO.getQueryObj())) {
            if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getCustomer())) {
                sqlBuffer.append("ar_recitem.customer pk_customer, ");
            } else {
                sqlBuffer.append("'' pk_customer, ");
            }
            sqlBuffer.append("ar_recitem.pk_deptid pk_deptid, ");
            if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getPsndoc())) {
                sqlBuffer.append("ar_recitem.pk_psndoc pk_psndoc, ");
            } else {
                sqlBuffer.append("'' pk_psndoc, ");
            }
        } else if (BillEnumCollection.ObjType.PERSON.VALUE.toString().equals(this.queryVO.getQueryObj())) {
            if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getCustomer())) {
                sqlBuffer.append("ar_recitem.customer pk_customer, ");
            } else {
                sqlBuffer.append("'' pk_customer, ");
            }
            if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getDept())) {
                sqlBuffer.append("ar_recitem.pk_deptid pk_deptid, ");
            } else {
                sqlBuffer.append("'' pk_deptid, ");
            }
            sqlBuffer.append("ar_recitem.pk_psndoc pk_psndoc, ");
        }
        sqlBuffer.append("ar_recitem.pk_currtype, ar_recitem.pk_billtype, ar_recitem.pk_recbill, ");
        sqlBuffer.append("ar_recitem.billdate, ar_recitem.pk_tradetypeid pk_tradetype, ar_recitem.billno, ar_recitem.project, ");
        sqlBuffer.append("case when ar_recitem.material = '~' then '' else ar_recitem.material end as material, ");
        sqlBuffer.append("case when ar_recitem.invoiceno = '~' then '' else ar_recitem.invoiceno end as invoiceno, ");
        sqlBuffer.append("case when ar_recitem.outstoreno = '~' then '' else ar_recitem.outstoreno end as outstoreno, ");
        sqlBuffer.append("case when arap_tally_agr.expiredate = '~' then '' else arap_tally_agr.expiredate end as expiredate, ");
        if (!StringUtils.isEmpty((CharSequence)this.queryVO.getAccageplan())) {
            sqlBuffer.append("propertyid, ");
        } else {
            sqlBuffer.append("'' as propertyid, ");
        }
        sqlBuffer.append("sum(arap_tally_agr.money_de) money_de, sum(arap_tally_agr.money_cr) money_done, sum(arap_tally_agr.quantity_de - arap_tally_agr.quantity_cr) quantity_bal, sum(arap_tally_agr.money_de - arap_tally_agr.money_cr) money_bal,").append("case when ").append(anadateName).append(" <= '").append(dateline).append(this.TIME_END).append("' ").append("then sum(arap_tally_agr.money_de - arap_tally_agr.money_cr) else 0 end as expiredmny,").append("case when ").append(anadateName).append(" > '").append(dateline).append(this.TIME_END).append("' ").append("then sum(arap_tally_agr.money_de - arap_tally_agr.money_cr) else 0 end as unexpiremny,").append(" sum(arap_tally_agr.money_de - arap_tally_agr.money_cr) term_money_de ");
        sqlBuffer.append(" from ar_recbill");
        sqlBuffer.append(" inner join ar_recitem on ar_recbill.pk_recbill = ar_recitem.pk_recbill ");
        sqlBuffer.append(" inner join ").append(TallyAgrVO.getDefaultTableName());
        sqlBuffer.append(" on ar_recitem.pk_recitem = ").append(" arap_tally_agr.pk_item ");
        if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getAccageplan())) {
            String tmpTable = ReportSqlUtils.getTimeCtrlTmpTable((String)this.queryVO.getAccageplan(), (UFDate)dateline);
            sqlBuffer.append(" inner join " + tmpTable + " on 1 = 1 ");
        }
        if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getAreaclass()) && BillEnumCollection.ObjType.CUSTOMER.VALUE.toString().equals(this.queryVO.getQueryObj())) {
            sqlBuffer.append(" inner join bd_customer on ar_recitem.customer = bd_customer.pk_customer ");
            sqlBuffer.append(" left join bd_areacl on bd_customer.pk_areacl = bd_areacl.pk_areacl ");
        }
        sqlBuffer.append(" where ").append(ReminderSqlUtils.getFixedWhere());
        if (!ArrayUtils.isEmpty((Object[])this.queryVO.getPk_orgs())) {
            sqlBuffer.append(" and ").append(SqlUtils.getInStr((String)"ar_recitem.pk_org", (String[])this.queryVO.getPk_orgs()));
        }
        if (this.queryVO.getBilldate() != null && this.queryVO.getBilldate()[0] != null) {
            sqlBuffer.append(" and ar_recitem.billdate >= '").append(this.queryVO.getBilldate()[0]).append("' ");
        }
        if (this.queryVO.getBilldate() != null && this.queryVO.getBilldate()[1] != null) {
            sqlBuffer.append(" and ar_recitem.billdate <= '").append(this.queryVO.getBilldate()[1]).append("' ");
        }
        if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getQueryObj())) {
            sqlBuffer.append(" and ar_recitem.objtype = '").append(this.queryVO.getQueryObj()).append("' ");
        }
        if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getBillStatus())) {
            if (this.queryVO.getBillStatus().equals("effect")) {
                sqlBuffer.append(" and ar_recbill.effectstatus = '").append(BillEnumCollection.InureSign.OKINURE.VALUE).append("' ");
            } else if (this.queryVO.getBillStatus().equals("uneffect")) {
                sqlBuffer.append(" and ar_recbill.effectstatus = '").append(BillEnumCollection.InureSign.NOINURE.VALUE).append("' ");
            }
        }
        if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getPk_currtype())) {
            sqlBuffer.append(SqlUtils.getInStr((String)" and ar_recitem.pk_currtype ", (String[])this.queryVO.getPk_currtype().split(","), (boolean[])new boolean[]{true}));
        }
        if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getIncludeExpire()) && this.queryVO.getIncludeExpire().equals("1")) {
            sqlBuffer.append(" and ").append(anadateName).append(" <= '").append(dateline).append(this.TIME_END).append("' ");
        }
        if (this.queryVO.getAccountage() != null) {
            UFDate tmpDate;
            if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getAccountage()[0])) {
                tmpDate = dateline;
                tmpDate = tmpDate.getDateBefore(Integer.valueOf(this.queryVO.getAccountage()[0]).intValue());
                sqlBuffer.append(" and ").append(anadateName).append(" <= '").append(tmpDate.toStdString()).append(this.TIME_END).append("' ");
            }
            if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getAccountage()[1])) {
                tmpDate = dateline;
                tmpDate = tmpDate.getDateBefore(Integer.valueOf(this.queryVO.getAccountage()[1]).intValue());
                sqlBuffer.append(" and ").append(anadateName).append(" >= '").append(tmpDate.toStdString()).append(this.TIME_BEGIN).append("' ");
            }
        }
        if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getAccageplan())) {
            sqlBuffer.append(" and ").append(anadateName).append(" >= startdate and ").append(anadateName).append(" <= enddate ");
        }
        if ("point".equals(this.queryVO.getAnaPattern())) {
            sqlBuffer.append(" and (").append(TallyAgrVO.getDefaultTableName()).append(".").append("tallydate").append(" <= '" + dateline + "') ");
        }
        if (BillEnumCollection.ObjType.CUSTOMER.VALUE.toString().equals(this.queryVO.getQueryObj())) {
            sqlBuffer.append(" and ar_recitem.customer <> '").append("~").append("' ");
        } else if (BillEnumCollection.ObjType.DEP.VALUE.toString().equals(this.queryVO.getQueryObj())) {
            sqlBuffer.append(" and ar_recitem.pk_deptid <> '").append("~").append("' ");
        } else if (BillEnumCollection.ObjType.PERSON.VALUE.toString().equals(this.queryVO.getQueryObj())) {
            sqlBuffer.append(" and ar_recitem.pk_psndoc <> '").append("~").append("' ");
        }
        if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getCustomer())) {
            sqlBuffer.append(" and ").append(SqlUtils.getInStr((String)" ar_recitem.customer ", (String[])this.queryVO.getCustomer().split(","), (boolean[])new boolean[]{true}));
        }
        if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getDept())) {
            sqlBuffer.append(" and ").append(SqlUtils.getInStr((String)" ar_recitem.pk_deptid ", (String[])this.queryVO.getDept().split(","), (boolean[])new boolean[]{true}));
        }
        if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getPsndoc())) {
            sqlBuffer.append(" and ").append(SqlUtils.getInStr((String)" ar_recitem.pk_psndoc ", (String[])this.queryVO.getPsndoc().split(","), (boolean[])new boolean[]{true}));
        }
        if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getAreaclass()) && BillEnumCollection.ObjType.CUSTOMER.VALUE.toString().equals(this.queryVO.getQueryObj())) {
            sqlBuffer.append(" and ").append(SqlUtils.getInStr((String)" bd_areacl.pk_areacl ", (String[])this.queryVO.getAreaclass().split(","), (boolean[])new boolean[]{true}));
        }
        InvocationInfoProxy invo = InvocationInfoProxy.getInstance();
        sqlBuffer.append(ReminderSqlUtils.getDataPermissionSql(invo.getUserId(), invo.getGroupId(), ReminderSqlUtils.RESOURCE_IDS, "fi"));
        if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getWhereSql())) {
            sqlBuffer.append(" and ").append(this.queryVO.getWhereSql());
        }
        sqlBuffer.append(" group by ");
        sqlBuffer.append("ar_recitem.pk_group, ar_recitem.pk_org, ").append(anadateName);
        if (BillEnumCollection.ObjType.CUSTOMER.VALUE.toString().equals(this.queryVO.getQueryObj())) {
            sqlBuffer.append(", ar_recitem.customer");
            if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getDept())) {
                sqlBuffer.append(", ar_recitem.pk_deptid");
            }
            if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getPsndoc())) {
                sqlBuffer.append(", ar_recitem.pk_psndoc");
            }
        } else if (BillEnumCollection.ObjType.DEP.VALUE.toString().equals(this.queryVO.getQueryObj())) {
            if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getCustomer())) {
                sqlBuffer.append(", ar_recitem.customer");
            }
            sqlBuffer.append(", ar_recitem.pk_deptid");
            if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getPsndoc())) {
                sqlBuffer.append(", ar_recitem.pk_psndoc");
            }
        } else if (BillEnumCollection.ObjType.PERSON.VALUE.toString().equals(this.queryVO.getQueryObj())) {
            if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getCustomer())) {
                sqlBuffer.append(", ar_recitem.customer");
            }
            if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getDept())) {
                sqlBuffer.append(", ar_recitem.pk_deptid");
            }
            sqlBuffer.append(", ar_recitem.pk_psndoc");
        }
        sqlBuffer.append(", ar_recitem.pk_currtype, ar_recitem.pk_billtype, ar_recitem.pk_recbill, ar_recitem.billdate, ar_recitem.pk_tradetypeid, ar_recitem.billno, ar_recitem.project");
        sqlBuffer.append(", ar_recitem.material, ar_recitem.invoiceno, ar_recitem.outstoreno, arap_tally_agr.expiredate");
        if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getAccageplan())) {
            sqlBuffer.append(", propertyid");
        }
        if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getYefw()[0]) || StringUtils.isNotEmpty((CharSequence)this.queryVO.getYefw()[1])) {
            sqlBuffer.append(" having ");
            if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getYefw()[0])) {
                sqlBuffer.append(" sum(arap_tally_agr.money_de - arap_tally_agr.money_cr) >= ").append(this.queryVO.getYefw()[0]);
                if (StringUtils.isNotEmpty((CharSequence)this.queryVO.getYefw()[1])) {
                    sqlBuffer.append(" and sum(arap_tally_agr.money_de - arap_tally_agr.money_cr) <= ").append(this.queryVO.getYefw()[1]);
                }
            } else {
                sqlBuffer.append(" sum(arap_tally_agr.money_de - arap_tally_agr.money_cr) <= ").append(this.queryVO.getYefw()[1]);
            }
            sqlBuffer.append(" and SUM(arap_tally_agr.money_de - arap_tally_agr.money_cr) <> 0 ");
        } else {
            sqlBuffer.append(" having SUM(arap_tally_agr.money_de - arap_tally_agr.money_cr) <> 0 ");
        }
        return sqlBuffer.toString();
    }

    private String getDropTmpTblSql() throws SQLException, MetaDataException {
        return " drop table " + this.getTmpTblName();
    }

    private String getTmpTblName() throws SQLException {
        if (StringUtils.isEmpty((CharSequence)this.tmpTblName)) {
            int tableSeq = ReminderSqlUtils.getTempTableSeq();
            this.tmpTblName = StringUtils.isEmpty((CharSequence)this.queryVO.getAccageplan()) ? ReminderSqlUtils.createTmpTable("tmp_arap_reminder" + tableSeq, this.getTmpTblColNames(), this.getTmpTblColTypes()) : ReminderSqlUtils.createTmpTable("tmp_arap_reminder" + tableSeq, this.getAgeTmpTblColNames(), this.getAgeTmpTblColTypes());
        }
        return this.tmpTblName;
    }

    private String[] getTmpTblColNames() {
        if (this.tmpTblColNames == null || this.tmpTblColNames.length == 0) {
            this.tmpTblColNames = (this.COLUMN_FIELD_STRING + "," + this.COLUMN_FIELD_DECIMAL).split(",");
        }
        return this.tmpTblColNames;
    }

    private Integer[] getTmpTblColTypes() {
        if (this.tmpTblColTypes == null || this.tmpTblColTypes.length == 0) {
            int i;
            this.tmpTblColTypes = new Integer[this.getTmpTblColNames().length];
            for (i = 0; i < this.tmpTblColTypes.length - this.COLUMN_FIELD_DECIMAL.split(",").length; ++i) {
                this.tmpTblColTypes[i] = 12;
            }
            while (i < this.tmpTblColTypes.length) {
                this.tmpTblColTypes[i] = 3;
                ++i;
            }
        }
        return this.tmpTblColTypes;
    }

    private String[] getAgeTmpTblColNames() {
        if (this.tmpTblColNames == null || this.tmpTblColNames.length == 0) {
            this.tmpTblColNames = (this.COLUMN_FIELD_STRING_ACCAGE + "," + this.COLUMN_FIELD_DECIMAL_ACCAGE).split(",");
        }
        return this.tmpTblColNames;
    }

    private Integer[] getAgeTmpTblColTypes() {
        if (this.tmpTblColTypes == null || this.tmpTblColTypes.length == 0) {
            int i;
            this.tmpTblColTypes = new Integer[this.getAgeTmpTblColNames().length];
            for (i = 0; i < this.tmpTblColTypes.length - this.COLUMN_FIELD_DECIMAL_ACCAGE.split(",").length; ++i) {
                this.tmpTblColTypes[i] = 12;
            }
            while (i < this.tmpTblColTypes.length) {
                this.tmpTblColTypes[i] = 3;
                ++i;
            }
        }
        return this.tmpTblColTypes;
    }

    private UFDate getBusisDate(boolean begin) {
        UFDateTime busiDateWithTime = new UFDateTime(InvocationInfoProxy.getInstance().getBizDateTime());
        return busiDateWithTime.getEndDate();
    }
}

