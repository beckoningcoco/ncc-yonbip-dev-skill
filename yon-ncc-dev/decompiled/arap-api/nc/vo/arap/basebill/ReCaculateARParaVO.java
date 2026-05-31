/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.vo.pub.BusinessException
 */
package nc.vo.arap.basebill;

import java.io.Serializable;
import java.sql.SQLException;
import nc.bs.arap.util.SqlUtils;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.vo.arap.djlx.ArBillStatusMap;
import nc.vo.pub.BusinessException;

public class ReCaculateARParaVO
implements Serializable {
    private static final long serialVersionUID = 5008988529228978845L;
    private String[] productline = null;
    private String[] vtrancode = null;
    private String[] channeltype = null;
    private String[] csaleorgid = null;
    private String[] cdeptid = null;
    private String[] cemployeeid = null;
    private String[] ccustomerid = null;
    private String[] pk_currency = null;
    private static final String SELAR = "select sum(ar.money_bal) as narmny,  ar.pk_group as pk_group,  t.climittypeid as climittypeid,  ar.productline as cprodlineid,  ar.so_ordertype as vtrantypecode,  ar.so_transtype as cchanneltypeid,  t.pk_org as pk_org,  ar.so_org as csaleorgid,  ar.so_deptid as cdeptid,  ar.so_psndoc as cemployeeid,  ar.ordercubasdoc as ccustomerid,  ar.pk_currtype as corigcurrencyid  ,ar.billdate as dbilldate,ar.customer as cinvcustomerid from ";
    private static final String SELEST = "select sum(ar.money_bal) as nestarmny,  ar.pk_group as pk_group,  t.climittypeid as climittypeid,  ar.productline as cprodlineid,  ar.so_ordertype as vtrantypecode,  ar.so_transtype as cchanneltypeid,  t.pk_org as pk_org,  ar.so_org as csaleorgid,  ar.so_deptid as cdeptid,  ar.so_psndoc as cemployeeid,  ar.ordercubasdoc as ccustomerid,  ar.pk_currtype as corigcurrencyid ,ar.billdate as dbilldate,ar.customer as cinvcustomerid from ";
    private static final String SELESTBYCUS = "select sum(ar.money_bal) as nestarmny,  ar.pk_group as pk_group,  t.climittypeid as climittypeid,  ar.productline as cprodlineid,  ar.so_ordertype as vtrantypecode,  ar.so_transtype as cchanneltypeid,  t.pk_org as pk_org,  ar.so_org as csaleorgid,  ar.so_deptid as cdeptid,  ar.so_psndoc as cemployeeid,  (case when t.creditcustomer = 1 then ar.customer else ar.ordercubasdoc end) as ccustomerid,  ar.pk_currtype as corigcurrencyid ,ar.billdate as dbilldate from ";
    private static final String INTOAR = " (narmny,   pk_group,   climittypeid,   cprodlineid,   vtrantypecode,   cchanneltypeid,   pk_org,   csaleorgid,   cdeptid,   cemployeeid,   ccustomerid,   corigcurrencyid,dbilldate,cinvcustomerid) ";
    private static final String INTOESTAR = " (nestarmny,   pk_group,   climittypeid,   cprodlineid,   vtrantypecode,   cchanneltypeid,   pk_org,   csaleorgid,   cdeptid,   cemployeeid,   ccustomerid,   corigcurrencyid,dbilldate,cinvcustomerid) ";
    private static final String INTOGATHER = " (nnoverifymny,   pk_group,   climittypeid,   cprodlineid,   vtrantypecode,   cchanneltypeid,   pk_org,   csaleorgid,   cdeptid,   cemployeeid,   ccustomerid,   corigcurrencyid,dbilldate,cinvcustomerid) ";
    private static final String INTOARSQL = " (narmny,   pk_group,   climittypeid,   cprodlineid,   vtrantypecode,   cchanneltypeid,   pk_org,   csaleorgid,   cdeptid,   cemployeeid,   ccustomerid,   corigcurrencyid,dbilldate) ";
    private static final String INTOESTARSQL = " (nestarmny,   pk_group,   climittypeid,   cprodlineid,   vtrantypecode,   cchanneltypeid,   pk_org,   csaleorgid,   cdeptid,   cemployeeid,   ccustomerid,   corigcurrencyid,dbilldate) ";
    private static final String INTOGATHERSQL = " (nnoverifymny,   pk_group,   climittypeid,   cprodlineid,   vtrantypecode,   cchanneltypeid,   pk_org,   csaleorgid,   cdeptid,   cemployeeid,   ccustomerid,   corigcurrencyid,dbilldate) ";
    private static final String WHEREBEF = " where  t.csettleorg = ar.sett_org  and t.pk_org = cust.pk_org and  (case when t.creditcustomer = 1  then ar.customer  else ar.ordercubasdoc end) = cust.pk_customer and (t.cprodlineid = ar.productline or t.cprodlineid = '~')  and (t.vtrantypecode = ar.so_ordertype or t.vtrantypecode= '~' )  and (t.cchanneltypeid = ar.so_transtype or t.cchanneltypeid = '~' )  and (ar.sett_org <> '~') and (ar.so_deptid <> '~' or ar.so_org <> '~' or ar.so_psndoc <> '~' or ar.ordercubasdoc  <> '~' )  and ar.money_bal <> 0  and ar.dr = 0 ";
    private static final String WHEREBEFGA = " where  t.csettleorg = ar.sett_org  and t.pk_org = cust.pk_org and  (case when ar.top_billtype = '30' and  t.creditcustomer = 0 then ar.ordercubasdoc else ar.customer end) = cust.pk_customer and (t.cprodlineid = ar.productline or t.cprodlineid = '~')  and (t.vtrantypecode = ar.so_ordertype or t.vtrantypecode= '~' )  and (t.cchanneltypeid = ar.so_transtype or t.cchanneltypeid = '~' )  and (ar.sett_org <> '~') and (ar.so_deptid <> '~' or ar.so_org <> '~' or ar.so_psndoc <> '~' or ar.ordercubasdoc  <> '~' )  and ar.money_bal <> 0  and ar.dr = 0 ";
    private static final String WHEREBEFNOSALE = " where  t.csettleorg = ar.sett_org  and t.pk_org = cust.pk_org and  ar.customer = cust.pk_customer and (t.cprodlineid = ar.productline or t.cprodlineid = '~')  and (t.vtrantypecode = ar.so_ordertype or t.vtrantypecode= '~' )  and (t.cchanneltypeid = ar.so_transtype or t.cchanneltypeid = '~' )  and (ar.sett_org <> '~') and (ar.so_deptid <> '~' or ar.so_org <> '~' or ar.so_psndoc <> '~' or ar.ordercubasdoc  <> '~' )  and ar.money_bal <> 0  and ar.dr = 0 ";
    private static final String FROMEST = " t, ar_estirecitem ar , bd_custcreditctl cust ";
    private static final String FROMAR = " t, ar_recitem ar , ar_recbill arbill, bd_custcreditctl cust ";
    private static final String FROMGATHER = " t, ar_gatherbill arbill, ar_gatheritem ar , bd_custcreditctl cust ";
    private static final String GATHERPART = " and arbill.pk_gatherbill = ar.pk_gatherbill ";
    private static final String REFUNDPART = " and arbill.isrefund='N' ";
    private static final String RECPAYTYPEPART = " and (t.crecpaytypeid=ar.pk_recpaytype or t.crecpaytypeid='~') ";
    private static final String NSALEARAPPART = " and ar.top_billtype not in ('32','35','4C','4453') and ( t.pk_tradetypeid=ar.pk_tradetypeid or t.pk_tradetypeid='~')";
    private static final String SALEARAPPART = " and ar.top_billtype in ('32','35','4C','4453') ";
    private static final String RECRPART = " and ar.pk_recbill = arbill.pk_recbill  and arbill.billstatus in (-1,1,8) ";
    private static final String GROUPPART = "  group by  ar.pk_group,t.climittypeid,ar.productline,ar.so_ordertype,ar.so_transtype,t.pk_org,ar.so_org,ar.so_deptid,ar.so_psndoc,ar.ordercubasdoc,ar.pk_currtype ,ar.billdate,ar.customer";
    private static final String GROUPPARTBYCUS = ",t.creditcustomer,ar.top_billtype ";
    private static final String SELEST_D = "select sum(ar.money_bal) as nestarmny,  ar.pk_group as pk_group,  t.climittypeid as climittypeid,  ar.productline as cprodlineid,  ar.so_ordertype as vtrantypecode,  ar.so_transtype as cchanneltypeid,  t.pk_org as pk_org,  ar.so_org as csaleorgid,  ar.so_deptid as cdeptid,  ar.so_psndoc as cemployeeid,  (case when t.creditcustomer = 1 then ar.customer else ar.ordercubasdoc end) as ccustomerid,  ar.pk_currtype as corigcurrencyid,ar.pk_estirecbill as parentid, ar.billno as vbillcode,ar.pk_estirecitem as bodyid,ar.rowno as crowno,ar.pk_billtype as billtypecode ,ar.billdate as dbilldate,ar.customer as cinvcustomerid from ";
    private static final String INTOAR_D = " (narmny,   pk_group,   climittypeid,   cprodlineid,   vtrantypecode,   cchanneltypeid,   pk_org,   csaleorgid,   cdeptid,   cemployeeid,   ccustomerid,   corigcurrencyid, parentid, vbillcode, bodyid, crowno, billtypecode,dbilldate,cinvcustomerid) ";
    private static final String INTOESTAR_D = " (nestarmny,   pk_group,   climittypeid,   cprodlineid,   vtrantypecode,   cchanneltypeid,   pk_org,   csaleorgid,   cdeptid,   cemployeeid,   ccustomerid,   corigcurrencyid, parentid, vbillcode, bodyid, crowno, billtypecode,dbilldate,cinvcustomerid) ";
    private static final String INTOGATHER_D = " (nnoverifymny,   pk_group,   climittypeid,   cprodlineid,   vtrantypecode,   cchanneltypeid,   pk_org,   csaleorgid,   cdeptid,   cemployeeid,   ccustomerid,   corigcurrencyid, parentid, vbillcode, bodyid, crowno, billtypecode,dbilldate,cinvcustomerid) ";
    public static final int AREST = 0;
    public static final int SOARNOTEST = 1;
    public static final int NSOARNOTEST = 3;
    public static final int ARGATHER = 2;
    public static final String AR_PRODUCTLINE = "ar.productline";
    public static final String AR_VTRANCODE = "ar.so_ordertype";
    public static final String AR_CHANELTYPE = "ar.so_transtype";
    public static final String AR_CSALEORGID = "ar.so_org";
    public static final String AR_CDEPTID = "ar.so_deptid";
    public static final String AR_CEMPLOYEEID = "ar.so_psndoc";
    public static final String CUST_PK_CUSTOMER = "cust.pk_customer";
    public static final String AR_CCUSTOMERID = "ar.customer";
    public static final String AR_ORDERCUBASDOC = "ar.ordercubasdoc";
    public static final String AR_PKCURRENCY = "ar.pk_currtype";
    private static final String AR_PKGROUP = "ar.pk_group";
    private static final String AND = " and ";
    private static final String BLANK = " ";
    private static final String INSERTINTO = "insert into ";
    private static final String LEFTC = "(";
    private static final String RIGHTC = ")";
    private static ReCaculateARParaVO instance = null;

    public static ReCaculateARParaVO getInstance() {
        if (null == instance) {
            instance = new ReCaculateARParaVO(null, null, null, null, null, null, null, null);
        }
        return instance;
    }

    public ReCaculateARParaVO(String[] productline, String[] vtrancode, String[] channeltype, String[] csaleorgid, String[] cdeptid, String[] cemployeeid, String[] ccustomerid, String[] pk_currency) {
        this.setProductline(productline);
        this.setVtrancode(vtrancode);
        this.setChanneltype(channeltype);
        this.setCsaleorgid(csaleorgid);
        this.setCdeptid(cdeptid);
        this.setCemployeeid(cemployeeid);
        this.setCcustomerid(ccustomerid);
        this.setPk_currency(pk_currency);
    }

    public void setProductline(String[] value) {
        this.productline = value;
    }

    public void setVtrancode(String[] value) {
        this.vtrancode = value;
    }

    public void setChanneltype(String[] value) {
        this.channeltype = value;
    }

    public void setCsaleorgid(String[] value) {
        this.csaleorgid = value;
    }

    public void setCdeptid(String[] value) {
        this.cdeptid = value;
    }

    public void setCemployeeid(String[] value) {
        this.cemployeeid = value;
    }

    public void setCcustomerid(String[] value) {
        this.ccustomerid = value;
    }

    public void setPk_currency(String[] value) {
        this.pk_currency = value;
    }

    public String[] getProductline() {
        return this.productline;
    }

    public String[] getVtrancode() {
        return this.vtrancode;
    }

    public String[] getChanneltype() {
        return this.channeltype;
    }

    public String[] getCsaleorgid() {
        return this.csaleorgid;
    }

    public String[] getCdeptid() {
        return this.cdeptid;
    }

    public String[] getCemployeeid() {
        return this.cemployeeid;
    }

    public String[] getCcustomerid() {
        return this.ccustomerid;
    }

    public String[] getPk_currency() {
        return this.pk_currency;
    }

    public String getSql(String temptable, int val, String intotable) throws SQLException, BusinessException {
        String sql;
        if (2 == val) {
            sql = INSERTINTO + intotable + INTOGATHERSQL + LEFTC;
            sql = sql + this.getSelectForGather(false);
        } else if (1 == val) {
            sql = INSERTINTO + intotable + INTOARSQL + LEFTC;
            sql = sql + this.getSelectForSOArap(false);
        } else if (3 == val) {
            sql = INSERTINTO + intotable + INTOARSQL + LEFTC;
            sql = sql + this.getSelectForNSOArap(false);
        } else {
            sql = INSERTINTO + intotable + INTOESTARSQL + LEFTC;
            sql = sql + SELESTBYCUS;
        }
        sql = sql + temptable;
        sql = sql + this.getFromPart(val);
        sql = sql + this.getWhereBefore(val);
        if (2 == val) {
            sql = sql + RECPAYTYPEPART;
        }
        if (1 == val) {
            sql = sql + SALEARAPPART;
        }
        if (3 == val) {
            sql = sql + NSALEARAPPART;
        }
        sql = sql + this.getWherePart();
        sql = sql + this.getGroupPart();
        return sql;
    }

    private String getWhereBefore(int val) {
        if (2 == val) {
            return " where  t.csettleorg = ar.sett_org  and t.pk_org = cust.pk_org and  (case when ar.top_billtype = '30' and  t.creditcustomer = 0 then ar.ordercubasdoc else ar.customer end) = cust.pk_customer and (t.cprodlineid = ar.productline or t.cprodlineid = '~')  and (t.vtrantypecode = ar.so_ordertype or t.vtrantypecode= '~' )  and (t.cchanneltypeid = ar.so_transtype or t.cchanneltypeid = '~' )  and (ar.sett_org <> '~') and (ar.so_deptid <> '~' or ar.so_org <> '~' or ar.so_psndoc <> '~' or ar.ordercubasdoc  <> '~' )  and ar.money_bal <> 0  and ar.dr = 0  and arbill.pk_gatherbill = ar.pk_gatherbill  and arbill.isrefund='N' ";
        }
        if (1 == val) {
            return " where  t.csettleorg = ar.sett_org  and t.pk_org = cust.pk_org and  (case when t.creditcustomer = 1  then ar.customer  else ar.ordercubasdoc end) = cust.pk_customer and (t.cprodlineid = ar.productline or t.cprodlineid = '~')  and (t.vtrantypecode = ar.so_ordertype or t.vtrantypecode= '~' )  and (t.cchanneltypeid = ar.so_transtype or t.cchanneltypeid = '~' )  and (ar.sett_org <> '~') and (ar.so_deptid <> '~' or ar.so_org <> '~' or ar.so_psndoc <> '~' or ar.ordercubasdoc  <> '~' )  and ar.money_bal <> 0  and ar.dr = 0  and ar.pk_recbill = arbill.pk_recbill  and arbill.billstatus in (-1,1,8)  and arbill.isrefund='N' ";
        }
        if (3 == val) {
            return " where  t.csettleorg = ar.sett_org  and t.pk_org = cust.pk_org and  ar.customer = cust.pk_customer and (t.cprodlineid = ar.productline or t.cprodlineid = '~')  and (t.vtrantypecode = ar.so_ordertype or t.vtrantypecode= '~' )  and (t.cchanneltypeid = ar.so_transtype or t.cchanneltypeid = '~' )  and (ar.sett_org <> '~') and (ar.so_deptid <> '~' or ar.so_org <> '~' or ar.so_psndoc <> '~' or ar.ordercubasdoc  <> '~' )  and ar.money_bal <> 0  and ar.dr = 0  and ar.pk_recbill = arbill.pk_recbill  and arbill.billstatus in (-1,1,8)  and arbill.isrefund='N' ";
        }
        return WHEREBEF;
    }

    private String getGroupPart() {
        return "  group by  ar.pk_group,t.climittypeid,ar.productline,ar.so_ordertype,ar.so_transtype,t.pk_org,ar.so_org,ar.so_deptid,ar.so_psndoc,ar.ordercubasdoc,ar.pk_currtype ,ar.billdate,ar.customer,t.creditcustomer,ar.top_billtype )";
    }

    private String getWherePart() throws SQLException, BusinessException {
        String sql = BLANK;
        sql = sql + this.getOrgPart();
        if (null != this.getProductline()) {
            sql = sql + AND;
            sql = sql + this.buildINSql(AR_PRODUCTLINE, this.getProductline());
        }
        if (null != this.getVtrancode()) {
            sql = sql + AND;
            sql = sql + this.buildINSql(AR_VTRANCODE, this.getVtrancode());
        }
        if (null != this.getChanneltype()) {
            sql = sql + AND;
            sql = sql + this.buildINSql(AR_CHANELTYPE, this.getChanneltype());
        }
        if (null != this.getCsaleorgid()) {
            sql = sql + AND;
            sql = sql + this.buildINSql(AR_CSALEORGID, this.getCsaleorgid());
        }
        if (null != this.getCdeptid()) {
            sql = sql + AND;
            sql = sql + this.buildINSql(AR_CDEPTID, this.getCdeptid());
        }
        if (null != this.getCemployeeid()) {
            sql = sql + AND;
            sql = sql + this.buildINSql(AR_CEMPLOYEEID, this.getCemployeeid());
        }
        if (null != this.getCcustomerid()) {
            sql = sql + AND;
            sql = sql + this.buildINSql(CUST_PK_CUSTOMER, this.getCcustomerid());
        }
        if (null != this.getPk_currency()) {
            sql = sql + AND;
            sql = sql + this.buildINSql(AR_PKCURRENCY, this.getPk_currency());
        }
        return sql;
    }

    public String getFromPart(int val) {
        if (0 == val) {
            return FROMEST;
        }
        if (1 == val || 3 == val) {
            return FROMAR;
        }
        return FROMGATHER;
    }

    private String buildINSql(String fieldName, String[] pks) throws BusinessException, SQLException {
        return SqlUtils.getInStr(fieldName, pks, true);
    }

    private String getSelectForGather(boolean isDetail) throws SQLException {
        String sql = "select sum(case when t.fcalculateflag = " + ArBillStatusMap.SAVE + AND + SqlUtils.getInInt("arbill.billstatus", ArBillStatusMap.MAPPING_MAP.get(ArBillStatusMap.SAVE), false) + " then  ar.money_bal  when t.fcalculateflag = " + ArBillStatusMap.AUDIT + AND + SqlUtils.getInInt("arbill.billstatus", ArBillStatusMap.MAPPING_MAP.get(ArBillStatusMap.AUDIT), false) + " then  ar.money_bal when   t.fcalculateflag = " + ArBillStatusMap.EFFECT + AND + SqlUtils.getInInt("arbill.effectstatus", ArBillStatusMap.MAPPING_MAP.get(ArBillStatusMap.EFFECT), false);
        if (isDetail) {
            sql = sql + " then  ar.money_bal else 0 end  ) as  nnoverifymny,  ar.pk_group as pk_group,  t.climittypeid as climittypeid,  ar.productline as cprodlineid,  ar.so_ordertype as vtrantypecode,  ar.so_transtype as cchanneltypeid,  t.pk_org as pk_org,  ar.so_org as csaleorgid,  ar.so_deptid as cdeptid,  ar.so_psndoc as cemployeeid,  (case when ar.top_billtype = '30' and  t.creditcustomer = 0 then ar.ordercubasdoc else ar.customer end) as ccustomerid,  ar.pk_currtype as corigcurrencyid ";
            sql = sql + " ,ar.pk_gatherbill as parentid, ar.billno as vbillcode,ar.pk_gatheritem as bodyid,ar.rowno as crowno,ar.pk_billtype as billtypecode ,ar.billdate as dbilldate,ar.customer as cinvcustomerid";
        } else {
            sql = sql + " then  ar.money_bal else 0 end  ) as  nnoverifymny,  ar.pk_group as pk_group,  t.climittypeid as climittypeid,  ar.productline as cprodlineid,  ar.so_ordertype as vtrantypecode,  ar.so_transtype as cchanneltypeid,  t.pk_org as pk_org,  ar.so_org as csaleorgid,  ar.so_deptid as cdeptid,  ar.so_psndoc as cemployeeid,  (case when ar.top_billtype = '30' and  t.creditcustomer = 0 then ar.ordercubasdoc else ar.customer end) as ccustomerid,  ar.pk_currtype as corigcurrencyid ";
            sql = sql + " ,ar.billdate as dbilldate ";
        }
        sql = sql + " from ";
        return sql;
    }

    private String getSelectForNSOArap(boolean isDetail) throws SQLException {
        String sql = "select sum(case  WHEN  t.nsalearapflag = " + ArBillStatusMap.SAVE + AND + SqlUtils.getInInt("arbill.billstatus", ArBillStatusMap.MAPPING_MAP.get(ArBillStatusMap.SAVE), false) + " then  ar.money_bal  when  t.nsalearapflag = " + ArBillStatusMap.AUDIT + AND + SqlUtils.getInInt("arbill.billstatus", ArBillStatusMap.MAPPING_MAP.get(ArBillStatusMap.AUDIT), false);
        if (isDetail) {
            sql = sql + " then  ar.money_bal else 0 end  ) as narmny,  ar.pk_group as pk_group,  t.climittypeid as climittypeid,  ar.productline as cprodlineid,  ar.so_ordertype as vtrantypecode,  ar.so_transtype as cchanneltypeid,  t.pk_org as pk_org,  ar.so_org as csaleorgid,  ar.so_deptid as cdeptid,  ar.so_psndoc as cemployeeid,   ar.customer  as ccustomerid";
            sql = sql + " ,ar.pk_currtype as corigcurrencyid,ar.pk_recbill as parentid, ar.billno as vbillcode,ar.pk_recitem as bodyid,ar.rowno as crowno,ar.pk_billtype as billtypecode ,ar.billdate as dbilldate,ar.customer as cinvcustomerid";
        } else {
            sql = sql + " then  ar.money_bal else 0 end  ) as narmny,  ar.pk_group as pk_group,  t.climittypeid as climittypeid,  ar.productline as cprodlineid,  ar.so_ordertype as vtrantypecode,  ar.so_transtype as cchanneltypeid,  t.pk_org as pk_org,  ar.so_org as csaleorgid,  ar.so_deptid as cdeptid,  ar.so_psndoc as cemployeeid,  ar.customer   as ccustomerid,  ar.pk_currtype as corigcurrencyid  ,ar.billdate as dbilldate ";
        }
        sql = sql + " from ";
        return sql;
    }

    private String getSelectForSOArap(boolean isDetail) throws SQLException {
        String sql = "select sum( ar.money_bal ";
        if (isDetail) {
            sql = sql + "  ) as narmny,  ar.pk_group as pk_group,  t.climittypeid as climittypeid,  ar.productline as cprodlineid,  ar.so_ordertype as vtrantypecode,  ar.so_transtype as cchanneltypeid,  t.pk_org as pk_org,  ar.so_org as csaleorgid,  ar.so_deptid as cdeptid,  ar.so_psndoc as cemployeeid,  (case when t.creditcustomer = 1 then ar.customer else ar.ordercubasdoc end) as ccustomerid";
            sql = sql + " ,ar.pk_currtype as corigcurrencyid,ar.pk_recbill as parentid, ar.billno as vbillcode,ar.pk_recitem as bodyid,ar.rowno as crowno,ar.pk_billtype as billtypecode ,ar.billdate as dbilldate,ar.customer as cinvcustomerid";
        } else {
            sql = sql + "  ) as narmny,  ar.pk_group as pk_group,  t.climittypeid as climittypeid,  ar.productline as cprodlineid,  ar.so_ordertype as vtrantypecode,  ar.so_transtype as cchanneltypeid,  t.pk_org as pk_org,  ar.so_org as csaleorgid,  ar.so_deptid as cdeptid,  ar.so_psndoc as cemployeeid,  (case when t.creditcustomer = 1 then ar.customer else ar.ordercubasdoc end) as ccustomerid,  ar.pk_currtype as corigcurrencyid  ,ar.billdate as dbilldate ";
        }
        sql = sql + " from ";
        return sql;
    }

    private String getOrgPart() {
        return " and ar.pk_group = '" + InvocationInfoProxy.getInstance().getGroupId().trim() + "'";
    }

    public String getSqlByDetail(String temptable, int val, String intotable) throws SQLException, BusinessException {
        String sql;
        if (2 == val) {
            sql = INSERTINTO + intotable + INTOGATHER_D + LEFTC;
            sql = sql + this.getSelectForGather(true);
        } else if (1 == val) {
            sql = INSERTINTO + intotable + INTOAR_D + LEFTC;
            sql = sql + this.getSelectForSOArap(true);
        } else if (3 == val) {
            sql = INSERTINTO + intotable + INTOAR_D + LEFTC;
            sql = sql + this.getSelectForNSOArap(true);
        } else {
            sql = INSERTINTO + intotable + INTOESTAR_D + LEFTC;
            sql = sql + SELEST_D;
        }
        sql = sql + temptable;
        sql = sql + this.getFromPart(val);
        sql = sql + this.getWhereBefore(val);
        sql = sql + this.getWherePart();
        if (2 == val) {
            sql = sql + RECPAYTYPEPART;
        }
        if (3 == val) {
            sql = sql + NSALEARAPPART;
        }
        if (1 == val) {
            sql = sql + SALEARAPPART;
        }
        sql = sql + GROUPPART;
        sql = sql + GROUPPARTBYCUS;
        sql = 2 == val ? sql + ",ar.pk_gatherbill,ar.billno, ar.pk_gatheritem, ar.rowno,ar.pk_billtype" : (1 == val || 3 == val ? sql + ",ar.pk_recbill, ar.billno,ar.pk_recitem,ar.rowno,ar.pk_billtype" : sql + ",ar.pk_estirecbill,ar.billno, ar.pk_estirecitem, ar.rowno,ar.pk_billtype");
        sql = sql + RIGHTC;
        return sql;
    }
}

