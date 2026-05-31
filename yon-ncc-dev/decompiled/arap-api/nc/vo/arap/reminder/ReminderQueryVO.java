/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.fipub.report.IReportQueryCond
 *  nc.vo.fipub.report.AggReportInitializeVO
 *  nc.vo.fipub.report.QryObj
 *  nc.vo.pub.lang.UFDate
 */
package nc.vo.arap.reminder;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import nc.itf.fipub.report.IReportQueryCond;
import nc.vo.fipub.report.AggReportInitializeVO;
import nc.vo.fipub.report.QryObj;
import nc.vo.pub.lang.UFDate;

public class ReminderQueryVO
implements IReportQueryCond,
Serializable {
    private static final long serialVersionUID = 1L;
    private String[] pk_orgs;
    private String pk_currtype;
    private String anaPattern = null;
    private UFDate enddate;
    private UFDate[] billdate;
    private String queryObj;
    private String customer;
    private String areaclass;
    private String dept;
    private String psndoc;
    private String recScope;
    private String analysedate;
    private String accageplan;
    private String[] accountage;
    private String[] yefw;
    private String pk_notice;
    private String billStatus;
    private String includeExpire;
    private String rectype;
    private String whereSql = null;

    public String getWhereSql() {
        return this.whereSql;
    }

    public void setWhereSql(String whereSql) {
        this.whereSql = whereSql;
    }

    public String getIncludeExpire() {
        return this.includeExpire;
    }

    public void setIncludeExpire(String includeExpire) {
        this.includeExpire = includeExpire;
    }

    public String getRecScope() {
        return this.recScope;
    }

    public void setRecScope(String recScope) {
        this.recScope = recScope;
    }

    public String getBillStatus() {
        return this.billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    public String getRectype() {
        return this.rectype;
    }

    public void setRectype(String rectype) {
        this.rectype = rectype;
    }

    public String[] getPk_orgs() {
        return this.pk_orgs;
    }

    public void setPk_orgs(String[] pk_orgs) {
        this.pk_orgs = pk_orgs;
    }

    public String getQueryObj() {
        return this.queryObj;
    }

    public void setQueryObj(String queryObj) {
        this.queryObj = queryObj;
    }

    public String getPk_currtype() {
        return this.pk_currtype;
    }

    public void setPk_currtype(String pkCurrtype) {
        this.pk_currtype = pkCurrtype;
    }

    public UFDate getEnddate() {
        return this.enddate;
    }

    public void setEnddate(UFDate enddate) {
        this.enddate = enddate;
    }

    public String getCustomer() {
        return this.customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getAreaclass() {
        return this.areaclass;
    }

    public void setAreaclass(String areaclass) {
        this.areaclass = areaclass;
    }

    public UFDate[] getBilldate() {
        return this.billdate;
    }

    public void setBilldate(UFDate[] billdate) {
        this.billdate = billdate;
    }

    public String getAnalysedate() {
        return this.analysedate;
    }

    public void setAnalysedate(String analysedate) {
        this.analysedate = analysedate;
    }

    public String[] getAccountage() {
        return this.accountage;
    }

    public void setAccountage(String[] accountage) {
        this.accountage = accountage;
    }

    public String[] getYefw() {
        return this.yefw;
    }

    public void setYefw(String[] yefw) {
        this.yefw = yefw;
    }

    public String getPk_notice() {
        return this.pk_notice;
    }

    public void setPk_notice(String pkNotice) {
        this.pk_notice = pkNotice;
    }

    public String getAccageplan() {
        return this.accageplan;
    }

    public void setAccageplan(String accageplan) {
        this.accageplan = accageplan;
    }

    public String getDept() {
        return this.dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPsndoc() {
        return this.psndoc;
    }

    public void setPsndoc(String psndoc) {
        this.psndoc = psndoc;
    }

    public UFDate getBeginDate() {
        return null;
    }

    public UFDate getDateline() {
        return null;
    }

    public UFDate getEndDate() {
        return null;
    }

    public String getLocalCurrencyType() {
        return null;
    }

    public String getModuleId() {
        return null;
    }

    public String getOwnModule() {
        return null;
    }

    public String getPk_currency() {
        return null;
    }

    public String getPk_group() {
        return null;
    }

    public List<QryObj> getQryObjs() {
        return null;
    }

    public AggReportInitializeVO getRepInitContext() {
        return null;
    }

    public Map<String, Object> getUserObject() {
        return null;
    }

    public void setLocalCurrencyType(String localCurrencyType) {
    }

    public void setPk_group(String pkGroup) {
    }

    public void setAnaPattern(String anaPattern) {
        this.anaPattern = anaPattern;
    }

    public String getAnaPattern() {
        return this.anaPattern;
    }
}

