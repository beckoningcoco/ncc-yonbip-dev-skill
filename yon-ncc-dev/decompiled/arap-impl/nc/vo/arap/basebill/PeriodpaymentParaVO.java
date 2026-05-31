/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.vo.arap.basebill;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import nc.bs.arap.util.SqlUtils;
import nc.vo.arap.djlx.ArBillStatusMap;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import org.apache.commons.lang3.ArrayUtils;

public class PeriodpaymentParaVO
extends SuperVO
implements Serializable {
    public static final String ORDERCUSDOC = "ordercusdoc";
    public static final String VTRANCODE = "vtrancode";
    public static final String PRODLINE = "prodline";
    public static final String SETTORG = "settorg";
    public static final String CHANNELTYPE = "channeltype";
    private List<String> combineKey;
    private static final long serialVersionUID = 500710871718028477L;
    private String[] settorg;
    private String[] prodline = null;
    private String[] vtrancode = null;
    private String[] channeltype = null;
    private String[] ordercusdoc;
    private UFDate date;
    private String creditorg;
    private String climittype;
    private String customer;
    private int status;
    private Integer customertype = 0;
    private Integer innerctldeferdays = 0;
    private String billtype = null;
    private String billno = null;
    private Integer billrowno = null;
    private UFDate billdate = null;
    public static final String STATUSFIELD = "ar_gatherbill.billstatus";
    public static final String EFFECTFIELD = "ar_gatherbill.effectstatus";
    private static final String AND = " and ";
    private static final String ARTABLE = "ar_recitem.";
    private static final String GATHERTABLE = "ar_gatheritem.";
    private static final String ESTIRECTABLE = "ar_estirecitem.";
    private static final String PK_CURRTYPE = "pk_currtype";
    private static final String BLANK = " group by ";
    private static final String DATEFIELDBEF = " ((ar_recitem.money_bal > 0 and arap_termitem.expiredate < '";
    private static final String DATEFIELDBEFALL = " (ar_recitem.money_bal > 0 ";
    private static final String DATEFIELDAFT = "') or ar_recitem.money_bal < 0 )";
    private static final String DATEFIELDAFTALL = " or ar_recitem.money_bal < 0 )";
    private static final String ESTIDATEFIELDBEF = " ((ar_estirecitem.money_bal > 0 and arap_termitem.expiredate < '";
    private static final String ESTIDATEFIELDBEFALL = " (ar_estirecitem.money_bal > 0 ";
    private static final String ESTIDATEFIELDAFT = "') or ar_estirecitem.money_bal < 0 )";
    private static final String ESTIDATEFIELDAFTALL = " or ar_estirecitem.money_bal < 0 )";
    public static final String REFROMSQL = " from ar_recitem,arap_termitem where  ar_recitem.pk_recitem = arap_termitem.pk_item and arap_termitem.dr = 0   and ar_recitem.dr = 0  ";
    public static final String ESTREFROMSQL = " from ar_estirecitem, arap_termitem WHERE  ar_estirecitem.pk_estirecitem = arap_termitem.pk_item     and arap_termitem.dr  = 0     and ar_estirecitem.dr     = 0 ";
    public static final String GATHERFROMSQL = " from ar_gatherbill, ar_gatheritem where ar_gatherbill.pk_gatherbill = ar_gatheritem.pk_gatherbill and ar_gatheritem.dr = 0";
    public static final String GATHERFROMSQLALL = " from arap_termitem, ar_gatheritem where arap_termitem.pk_item = ar_gatheritem.pk_gatheritem  and ar_gatheritem.dr = 0 and arap_termitem.dr  = 0 and (ar_gatheritem.money_bal>0 or ar_gatheritem.money_bal<0)";
    public static final String RESQLALL = "select arap_termitem.money_bal, ar_recitem.pk_currtype,arap_termitem.expiredate ,ar_recitem.customer,ar_recitem.pk_billtype,ar_recitem.billno,ar_recitem.billdate,ar_recitem.rowno,ar_recitem.so_ordertype,ar_recitem.so_transtype,ar_recitem.productline, ar_recitem.ordercubasdoc,arap_termitem.pk_termitem,ar_recitem.pk_recbill ";
    public static final String ESTRESQLALL = "SELECT  arap_termitem.money_bal,   ar_estirecitem.pk_currtype, arap_termitem.expiredate,ar_estirecitem.customer,ar_estirecitem.pk_billtype,ar_estirecitem.billno,ar_estirecitem.billdate,ar_estirecitem.rowno,ar_estirecitem.so_ordertype,ar_estirecitem.so_transtype,ar_estirecitem.productline, ar_estirecitem.ordercubasdoc,arap_termitem.pk_termitem,ar_estirecitem.pk_estirecbill ";
    public static final String GATHERSQLALL = "select ar_gatheritem.money_bal ,ar_gatheritem.pk_currtype, arap_termitem.expiredate,ar_gatheritem.customer,ar_gatheritem.pk_billtype,ar_gatheritem.billno,ar_gatheritem.billdate,ar_gatheritem.rowno,ar_gatheritem.so_ordertype,ar_gatheritem.so_transtype,ar_gatheritem.productline,ar_gatheritem.ordercubasdoc,arap_termitem.pk_termitem,ar_gatheritem.pk_gatherbill";
    public static final String RESQL = "select sum(arap_termitem.money_bal), ar_recitem.pk_currtype,min(arap_termitem.expiredate) ";
    public static final String ESTRESQL = "SELECT   sum(arap_termitem.money_bal),   ar_estirecitem.pk_currtype,  min(arap_termitem.expiredate) ";
    public static final String GATHERSQL = "select sum(ar_gatheritem.money_bal),ar_gatheritem.pk_currtype,min(ar_gatherbill.billdate) ";

    public PeriodpaymentParaVO(String[] settorg, String[] prodline, String[] vtrancode, String[] channeltype, String[] ordercusdoc, UFDate date, String creditorg, String climittype, String customer, int status) {
        this.setSettorg(settorg);
        this.setProdline(prodline);
        this.setVtrancode(vtrancode);
        this.setChanneltype(channeltype);
        this.setOrdercusdoc(ordercusdoc);
        this.setDate(date);
        this.setCreditorg(creditorg);
        this.setClimittype(climittype);
        this.setCustomer(customer);
        this.setStatus(status);
        this.setBilltype(this.billtype);
        this.setBillno(this.billno);
        this.setBillrowno(this.billrowno);
        this.setBilldate(this.billdate);
    }

    public String getBilltype() {
        return this.billtype;
    }

    public void setBilltype(String billtype) {
        this.billtype = billtype;
    }

    public String getBillno() {
        return this.billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public Integer getCustomertype() {
        return this.customertype;
    }

    public void setCustomertype(Integer customertype) {
        this.customertype = customertype;
    }

    public Integer getBillrowno() {
        return this.billrowno;
    }

    public void setBillrowno(Integer billrowno) {
        this.billrowno = billrowno;
    }

    public UFDate getBilldate() {
        return this.billdate;
    }

    public void setBilldate(UFDate billdate) {
        this.billdate = billdate;
    }

    public List<String> getCombineKey() {
        return this.combineKey;
    }

    public void setCombineKey(List<String> combineKey) {
        this.combineKey = combineKey;
    }

    public String[] getSettorg() {
        return this.settorg;
    }

    public String[] getProdline() {
        return this.prodline;
    }

    public String[] getVtrancode() {
        return this.vtrancode;
    }

    public String[] getChanneltype() {
        return this.channeltype;
    }

    public String[] getOrdercusdoc() {
        return this.ordercusdoc;
    }

    public UFDate getDate() {
        return this.date;
    }

    public String getCreditorg() {
        return this.creditorg;
    }

    public String getClimittype() {
        return this.climittype;
    }

    public String getCustomer() {
        return this.customer;
    }

    public int getStatus() {
        return this.status;
    }

    public void setSettorg(String[] value) {
        this.settorg = value;
    }

    public void setProdline(String[] value) {
        this.prodline = value;
    }

    public void setVtrancode(String[] value) {
        this.vtrancode = value;
    }

    public void setChanneltype(String[] value) {
        this.channeltype = value;
    }

    public void setOrdercusdoc(String[] value) {
        this.ordercusdoc = value;
    }

    public void setDate(UFDate value) {
        this.date = value;
    }

    public void setCreditorg(String value) {
        this.creditorg = value;
    }

    public void setClimittype(String value) {
        this.climittype = value;
    }

    public void setCustomer(String value) {
        this.customer = value;
    }

    public void setStatus(int value) {
        this.status = value;
    }

    public Integer getInnerctldeferdays() {
        return this.innerctldeferdays;
    }

    public void setInnerctldeferdays(Integer innerctldeferdays) {
        this.innerctldeferdays = innerctldeferdays;
    }

    public String getKey() {
        return this.creditorg + this.climittype + this.customer;
    }

    public String getWhereSql(boolean isAR, boolean isesti, boolean isAll) {
        this.validata();
        String sqlWhere = "";
        String table = this.getTable(isAR, isesti);
        try {
            if (null != this.getSettorg()) {
                sqlWhere = AND;
                if (this.getSettorg().length < 200) {
                    if (ArrayUtils.isNotEmpty((Object[])this.getSettorg()) && this.getSettorg()[0] != null) {
                        sqlWhere = sqlWhere + SqlUtils.getInStr(table + "sett_org", this.getSettorg(), false);
                    }
                } else {
                    sqlWhere = sqlWhere + SqlUtils.getInStr(table + "sett_org", this.getSettorg(), true);
                }
            }
            if (null != this.getOrdercusdoc() && ArrayUtils.isNotEmpty((Object[])this.getOrdercusdoc()) && this.getOrdercusdoc()[0] != null) {
                sqlWhere = sqlWhere + AND;
                sqlWhere = this.getCustomertype() == 0 ? sqlWhere + SqlUtils.getInStr(table + "ordercubasdoc", this.getOrdercusdoc(), false) : sqlWhere + SqlUtils.getInStr(table + "customer", this.getOrdercusdoc(), false);
            }
            if (null != this.getChanneltype()) {
                sqlWhere = sqlWhere + AND;
                sqlWhere = sqlWhere + SqlUtils.getInStr(table + "so_transtype", this.getChanneltype(), false);
            }
            if (null != this.getVtrancode()) {
                sqlWhere = sqlWhere + AND;
                sqlWhere = sqlWhere + SqlUtils.getInStr(table + "so_ordertype", this.getVtrancode(), false);
            }
            if (null != this.getProdline()) {
                sqlWhere = sqlWhere + AND;
                sqlWhere = sqlWhere + SqlUtils.getInStr(table + "productline", this.getProdline(), false);
            }
            String date = this.getDate().toStdString().trim();
            if (isAll) {
                if (isAR && !isesti) {
                    sqlWhere = sqlWhere + AND;
                    sqlWhere = sqlWhere + " (ar_recitem.money_bal > 0  or ar_recitem.money_bal < 0 )";
                } else if (isAR && isesti) {
                    sqlWhere = sqlWhere + AND;
                    sqlWhere = sqlWhere + " (ar_estirecitem.money_bal > 0  or ar_estirecitem.money_bal < 0 )";
                }
            } else if (isAR && !isesti) {
                sqlWhere = sqlWhere + AND;
                sqlWhere = sqlWhere + DATEFIELDBEF + date + DATEFIELDAFT;
            } else if (isAR && isesti) {
                sqlWhere = sqlWhere + AND;
                sqlWhere = sqlWhere + ESTIDATEFIELDBEF + date + ESTIDATEFIELDAFT;
            }
            if (!isAR && !isAll) {
                String field = STATUSFIELD;
                sqlWhere = sqlWhere + AND;
                if (this.getStatus() == ArBillStatusMap.EFFECT.intValue()) {
                    field = EFFECTFIELD;
                }
                sqlWhere = sqlWhere + SqlUtils.getInInt(field, ArBillStatusMap.MAPPING_MAP.get(this.getStatus()), false);
            }
            if (!isAll) {
                sqlWhere = sqlWhere + BLANK + table + PK_CURRTYPE;
                if (this.combineKey != null) {
                    for (String key : this.combineKey) {
                        sqlWhere = sqlWhere + "," + table + this.getBillKey(key);
                    }
                }
            }
        }
        catch (SQLException e) {
            ExceptionUtils.wrappException((Exception)e);
        }
        return sqlWhere;
    }

    private String getTable(boolean isAR, boolean isesti) {
        String table = ARTABLE;
        if (!isAR) {
            table = GATHERTABLE;
        }
        if (isesti) {
            table = ESTIRECTABLE;
        }
        return table;
    }

    private String getBillKey(String key) {
        if (key.equals(ORDERCUSDOC)) {
            return "ordercubasdoc";
        }
        if (key.equals(VTRANCODE)) {
            return "so_ordertype";
        }
        if (key.equals(SETTORG)) {
            return "sett_org";
        }
        if (key.equals(PRODLINE)) {
            return "productline";
        }
        if (key.equals(CHANNELTYPE)) {
            return "so_transtype";
        }
        return null;
    }

    private void validata() {
        if (null == this.getSettorg() || null == this.getOrdercusdoc() || null == this.getDate() || null == this.getCreditorg() || null == this.getClimittype()) {
            ExceptionUtils.wrappBusinessException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0544"));
        }
    }

    public String getOtherSelectSql(boolean isAR, boolean isesti) {
        String sqlWhere = "";
        if (this.combineKey != null) {
            for (String key : this.combineKey) {
                sqlWhere = sqlWhere + "," + this.getTable(isAR, isesti) + this.getBillKey(key);
            }
        }
        return sqlWhere;
    }
}

