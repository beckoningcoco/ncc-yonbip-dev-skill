/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.lang.UFLiteralDate
 *  nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory
 */
package nc.vo.arap.agiotage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.lang.UFLiteralDate;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class ArapBusiDataVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    public static final String HXSEQ = "hxseq";
    public static final String HXKEY = "hxkey";
    private static List<String> attributeNames = Arrays.asList("approver", "billclass", "billdate", "billno", "billstatus", "contractno", "costcenter", "customer", "def1", "def10", "def11", "def12", "def13", "def14", "def15", "def16", "def17", "def18", "def19", "def2", "direction", "dr", "estflag", "expiredate", "global_money_bal", "global_money_cr", "global_money_de", "globalrate", "group_money_bal", "group_money_cr", "group_money_de", "grouprate", "headsubjcode", "innerctldeferdays", "insurance", "invoiceno", "isinit", "istransin", "local_money_bal", "local_money_cr", "local_money_de", "material", "money_bal", "money_cr", "money_de", "objtype", "occupationmny", "operator", "ordercubasdoc", "outbusitype", "pausetransact", "pk_areacl", "pk_balatype", "pk_bill", "pk_billtype", "pk_busidata", "pk_busitype", "pk_costsubj", "pk_currtype", "pk_deptid", "pk_group", "pk_item", "pk_org", "pk_pcorg", "pk_psndoc", "pk_termitem", "pk_tradetype", "pk_tradetypeid", "prepay", "price", "productline", "project", "project_task", "pu_deptid", "pu_org", "pu_psndoc", "purchaseorder", "quantity_bal", "quantity_cr", "quantity_de", "rate", "sett_org", "so_deptid", "so_ordertype", "so_org", "so_psndoc", "so_transtype", "src_billid", "src_itemid", "src_syscode", "subjcode", "sum_headmoney", "sum_itemmoney", "supplier", "", "syscode", "top_billid", "top_billtype", "top_itemid", "ts", "def1", "def2", "def3", "def4", "def5", "def6", "def7", "def8", "def9", "def10", "def11", "def12", "def13", "def14", "def15", "def16", "def17", "def18", "def19", "def20", "def21", "def22", "def23", "def24", "def25", "def26", "def27", "def28", "def29", "def30", "def31", "def32", "def33", "def34", "def35", "def36", "def37", "def38", "def39", "def40", "def41", "def42", "def43", "def44", "def45", "def46", "def47", "def48", "def49", "def50", "def51", "def52", "def53", "def54", "def55", "def56", "def57", "def58", "def59", "def60", "def61", "def62", "def63", "def64", "def65", "def66", "def67", "def68", "def69", "def70", "def71", "def72", "def73", "def74", "def75", "def76", "def77", "def78", "def79", "def80", "isrefund", "saga_frozen", "saga_status");
    private String pk_busidata;
    private String pk_org;
    private String pk_group;
    private String pk_termitem;
    private String pk_bill;
    private String pk_item;
    private String pk_billtype;
    private String pk_tradetype;
    private String pk_tradetypeid;
    private String billclass;
    private UFDate expiredate;
    private UFBoolean isinit;
    private UFBoolean pausetransact;
    private String billno;
    private UFDate busidate;
    private UFDate inner_effect_date;
    private Integer effectstatus;
    private UFDate billdate;
    private UFDateTime approvedate;
    private UFDate effectdate;
    private Integer syscode;
    private Integer src_syscode;
    private String operator;
    private String approver;
    private String customer;
    private String supplier;
    private String pk_deptid;
    private String pk_psndoc;
    private String pk_costsubj;
    private UFDouble occupationmny;
    private Integer objtype;
    private Integer direction;
    private String pk_currtype;
    private UFDouble rate;
    private UFDouble grouprate;
    private UFDouble globalrate;
    private UFDouble money_de = UFDouble.ZERO_DBL;
    private UFDouble local_money_de = UFDouble.ZERO_DBL;
    private UFDouble local_money_cr = UFDouble.ZERO_DBL;
    private UFDouble money_cr = UFDouble.ZERO_DBL;
    private UFDouble money_bal = UFDouble.ZERO_DBL;
    private UFDouble local_money_bal = UFDouble.ZERO_DBL;
    private UFDouble group_money_bal = UFDouble.ZERO_DBL;
    private UFDouble group_money_cr = UFDouble.ZERO_DBL;
    private UFDouble group_money_de = UFDouble.ZERO_DBL;
    private UFDouble global_money_bal = UFDouble.ZERO_DBL;
    private UFDouble global_money_cr = UFDouble.ZERO_DBL;
    private UFDouble global_money_de = UFDouble.ZERO_DBL;
    private UFDouble quantity_de = UFDouble.ZERO_DBL;
    private UFDouble quantity_cr = UFDouble.ZERO_DBL;
    private UFDouble quantity_bal = UFDouble.ZERO_DBL;
    private UFDouble price = UFDouble.ZERO_DBL;
    private String material;
    private String pk_subjcode;
    private String ordercubasdoc;
    private String pk_balatype;
    private String top_billid;
    private String top_itemid;
    private String top_billtype;
    private String h_def30;
    private String h_def29;
    private String h_def28;
    private String h_def27;
    private String h_def26;
    private String h_def25;
    private String h_def24;
    private String h_def23;
    private String h_def22;
    private String h_def21;
    private String h_def20;
    private String h_def19;
    private String h_def18;
    private String h_def17;
    private String h_def16;
    private String h_def15;
    private String h_def14;
    private String h_def13;
    private String h_def12;
    private String h_def11;
    private String h_def10;
    private String h_def9;
    private String h_def8;
    private String h_def7;
    private String h_def6;
    private String h_def5;
    private String h_def4;
    private String h_def3;
    private String h_def2;
    private String h_def1;
    private String def30;
    private String def29;
    private String def28;
    private String def27;
    private String def26;
    private String def25;
    private String def24;
    private String def23;
    private String def22;
    private String def21;
    private String def20;
    private String def19;
    private String def18;
    private String def17;
    private String def16;
    private String def15;
    private String def14;
    private String def13;
    private String def12;
    private String def11;
    private String def10;
    private String def9;
    private String def8;
    private String def7;
    private String def6;
    private String def5;
    private String def4;
    private String def3;
    private String def2;
    private String def1;
    private Integer dr = 0;
    private UFDateTime ts;
    private UFDouble money;
    private UFDouble local_money;
    private UFDouble quantity;
    private UFDouble sum_money = UFDouble.ZERO_DBL;
    private UFDouble sum_money_bal = UFDouble.ZERO_DBL;
    private UFDouble this_sett = UFDouble.ZERO_DBL;
    private String sett_org;
    private String productline;
    private String so_ordertype;
    private String so_transtype;
    private String so_org;
    private String so_deptid;
    private String so_psndoc;
    private String pk_busitype;
    private String headsubjcode;
    private String subjcode;
    private String pk_pcorg;
    private String pu_org;
    private String pu_deptid;
    private String pu_psndoc;
    private UFBoolean insurance;
    private String pk_areacl;
    private Integer estflag;
    private Integer prepay;
    private String costcenter;
    private String cashaccount;
    private String src_billid;
    private String src_itemid;
    private String src_org;
    private String def31;
    private String def32;
    private String def33;
    private String def34;
    private String def35;
    private String def36;
    private String def37;
    private String def38;
    private String def39;
    private String def40;
    private String def41;
    private String def42;
    private String def43;
    private String def44;
    private String def45;
    private String def46;
    private String def47;
    private String def48;
    private String def49;
    private String def50;
    private String def51;
    private String def52;
    private String def53;
    private String def54;
    private String def55;
    private String def56;
    private String def57;
    private String def58;
    private String def59;
    private String def60;
    private String def61;
    private String def62;
    private String def63;
    private String def64;
    private String def65;
    private String def66;
    private String def67;
    private String def68;
    private String def69;
    private String def70;
    private String def71;
    private String def72;
    private String def73;
    private String def74;
    private String def75;
    private String def76;
    private String def77;
    private String def78;
    private String def79;
    private String def80;
    private String linkedPk;
    private String pk_recpaytype;
    private UFBoolean isEditMoney;
    private UFBoolean isrefund;
    private Integer saga_frozen;
    private Integer saga_status;
    private UFLiteralDate ratedate;
    private String pk_ratetype;
    private String wldxpk;
    private UFBoolean istransin;
    private UFDouble hzybye;
    private UFDouble hzbbye;
    private Integer billstatus;
    private String invoiceno;
    private String purchaseorder;
    private String contractno;
    private String project_task;
    private String project;
    private UFDate innerctldeferdays;
    private UFDouble sum_headmoney;
    private UFDouble sum_itemmoney;
    boolean isshlclear = false;
    public static final String PK_BUSIDATA = "pk_busidata";
    public static final String PK_ORG = "pk_org";
    public static final String PK_GROUP = "pk_group";
    public static final String PK_TERMITEM = "pk_termitem";
    public static final String PK_BILL = "pk_bill";
    public static final String PK_ITEM = "pk_item";
    public static final String PK_BILLTYPE = "pk_billtype";
    public static final String PK_TRADETYPE = "pk_tradetype";
    public static final String PK_TRADETYPEID = "pk_tradetypeid";
    public static final String BILLCLASS = "billclass";
    public static final String EXPIREDATE = "expiredate";
    public static final String ISINIT = "isinit";
    public static final String BILLNO = "billno";
    public static final String BILLDATE = "billdate";
    public static final String SYSCODE = "syscode";
    public static final String SRC_SYSCODE = "src_syscode";
    public static final String OPERATOR = "operator";
    public static final String APPROVER = "approver";
    public static final String CUSTOMER = "customer";
    public static final String SUPPLIER = "supplier";
    public static final String PK_DEPTID = "pk_deptid";
    public static final String PK_PSNDOC = "pk_psndoc";
    public static final String PK_COSTSUBJ = "pk_costsubj";
    public static final String OCCUPATIONMNY = "occupationmny";
    public static final String OBJTYPE = "objtype";
    public static final String DIRECTION = "direction";
    public static final String PK_CURRTYPE = "pk_currtype";
    public static final String RATE = "rate";
    public static final String GROUPRATE = "grouprate";
    public static final String GLOBALRATE = "globalrate";
    public static final String MONEY_DE = "money_de";
    public static final String LOCAL_MONEY_DE = "local_money_de";
    public static final String LOCAL_MONEY_CR = "local_money_cr";
    public static final String MONEY_CR = "money_cr";
    public static final String MONEY_BAL = "money_bal";
    public static final String LOCAL_MONEY_BAL = "local_money_bal";
    public static final String GROUP_MONEY_BAL = "group_money_bal";
    public static final String GROUP_MONEY_CR = "group_money_cr";
    public static final String GROUP_MONEY_DE = "group_money_de";
    public static final String GLOBAL_MONEY_BAL = "global_money_bal";
    public static final String GLOBAL_MONEY_CR = "global_money_cr";
    public static final String GLOBAL_MONEY_DE = "global_money_de";
    public static final String QUANTITY_DE = "quantity_de";
    public static final String QUANTITY_CR = "quantity_cr";
    public static final String QUANTITY_BAL = "quantity_bal";
    public static final String MATERIAL = "material";
    public static final String ORDERCUBASDOC = "ordercubasdoc";
    public static final String PK_BALATYPE = "pk_balatype";
    public static final String TOP_BILLID = "top_billid";
    public static final String TOP_ITEMID = "top_itemid";
    public static final String TOP_BILLTYPE = "top_billtype";
    public static final String PK_BUSITYPE = "pk_busitype";
    public static final String H_DEF30 = "h_def30";
    public static final String H_DEF29 = "h_def29";
    public static final String H_DEF28 = "h_def28";
    public static final String H_DEF27 = "h_def27";
    public static final String H_DEF26 = "h_def26";
    public static final String H_DEF25 = "h_def25";
    public static final String H_DEF24 = "h_def24";
    public static final String H_DEF23 = "h_def23";
    public static final String H_DEF22 = "h_def22";
    public static final String H_DEF21 = "h_def21";
    public static final String H_DEF20 = "h_def20";
    public static final String H_DEF19 = "h_def19";
    public static final String H_DEF18 = "h_def18";
    public static final String H_DEF17 = "h_def17";
    public static final String H_DEF16 = "h_def16";
    public static final String H_DEF15 = "h_def15";
    public static final String H_DEF14 = "h_def14";
    public static final String H_DEF13 = "h_def13";
    public static final String H_DEF12 = "h_def12";
    public static final String H_DEF11 = "h_def11";
    public static final String H_DEF10 = "h_def10";
    public static final String H_DEF9 = "h_def9";
    public static final String H_DEF8 = "h_def8";
    public static final String H_DEF7 = "h_def7";
    public static final String H_DEF6 = "h_def6";
    public static final String H_DEF5 = "h_def5";
    public static final String H_DEF4 = "h_def4";
    public static final String H_DEF3 = "h_def3";
    public static final String H_DEF2 = "h_def2";
    public static final String H_DEF1 = "h_def1";
    public static final String DEF30 = "def30";
    public static final String DEF29 = "def29";
    public static final String DEF28 = "def28";
    public static final String DEF27 = "def27";
    public static final String DEF26 = "def26";
    public static final String DEF25 = "def25";
    public static final String DEF24 = "def24";
    public static final String DEF23 = "def23";
    public static final String DEF22 = "def22";
    public static final String DEF21 = "def21";
    public static final String DEF20 = "def20";
    public static final String DEF19 = "def19";
    public static final String DEF18 = "def18";
    public static final String DEF17 = "def17";
    public static final String DEF16 = "def16";
    public static final String DEF15 = "def15";
    public static final String DEF14 = "def14";
    public static final String DEF13 = "def13";
    public static final String DEF12 = "def12";
    public static final String DEF11 = "def11";
    public static final String DEF10 = "def10";
    public static final String DEF9 = "def9";
    public static final String DEF8 = "def8";
    public static final String DEF7 = "def7";
    public static final String DEF6 = "def6";
    public static final String DEF5 = "def5";
    public static final String DEF4 = "def4";
    public static final String DEF3 = "def3";
    public static final String DEF2 = "def2";
    public static final String DEF1 = "def1";
    public static final String SETT_ORG = "sett_org";
    public static final String PRODUCTLINE = "productline";
    public static final String SO_ORDERTYPE = "so_ordertype";
    public static final String SO_TRANSTYPE = "so_transtype";
    public static final String SO_ORG = "so_org";
    public static final String SO_DEPTID = "so_deptid";
    public static final String SO_PSNDOC = "so_psndoc";
    public static final String HEADSUBJCODE = "headsubjcode";
    public static final String SUBJCODE = "subjcode";
    public static final String PK_PCORG = "pk_pcorg";
    public static final String PU_ORG = "pu_org";
    public static final String PU_DEPTID = "pu_deptid";
    public static final String PU_PSNDOC = "pu_psndoc";
    public static final String PK_AREACL = "pk_areacl";
    public static final String WLDXPK = "wldxpk";
    public static final String ESTFLAG = "estflag";
    public static final String PREPAY = "prepay";
    public static final String COSTCENTER = "costcenter";
    public static final String CASHACCOUNT = "cashaccount";
    public static final String INVOICENO = "invoiceno";
    public static final String PURCHASEORDER = "purchaseorder";
    public static final String CONTRACTNO = "contractno";
    public static final String BILLSTATUS = "billstatus";
    public static final String ISTRANSIN = "istransin";
    public static final String PROJECT = "project";
    public static final String PROJECT_TASK = "project_task";
    public static final String PAUSETRANSACT = "pausetransact";
    public static final String INNERCTLDEFERDAYS = "innerctldeferdays";
    public static final String SUM_HEADMONEY = "sum_headmoney";
    public static final String SUM_ITEMMONEY = "sum_itemmoney";
    public static final String ISREFUND = "isrefund";
    public static final String FROZENSTATUS = "frozenstatus";
    public static final String SAGA_FROZEN = "saga_frozen";
    public static final String SAGA_STATUS = "saga_status";
    private HashMap<String, Object> attributes = new HashMap();
    public static final String SETT_LEFT_MONEY = "SETT_LEFT_MONEY";
    public static final String SETT_LEFT_LOCAL_MONEY = "SETT_LEFT_LOCAL_MONEY";
    public static final String SETT_MONEY = "SETT_MONEY";
    public static final String SETT_LOCAL_MONEY = "SETT_LOCAL_MONEY";
    public static final String SETT_QUANTITY = "SETT_QUANTITY";
    public static final String SETT_QUANTITY_LEFT = "SETT_QUANTITY_LEFT";
    public static final String MONEY = "MONEY";
    public static final String LOCAL_MONEY = "LOCAL_MONEY";
    public static final String QUANTITY = "quantity";
    public static final String PRICE = "price";
    public static final String DISCTION = "DISCTION";
    public static final String BODYTS = "BODYTS";
    public static final String MID_SETT = "MID_SETT";
    public static final String THIS_SETT = "THIS_SETT";
    public static final String XZBZ = "xzbz";
    public static final String PK_OBJTYPE = "PK_OBJTYPE";
    public static final String ZB_MONEY = "ZB_MONEY";
    public static final String SUM_MONEY = "SUM_MONEY";
    public static final String SUM_MONEY_BAL = "SUM_MONEY_BAL";
    public static final String MYDEFINESQL = "MYDEFINESQL";
    public static final String MONEY_BAL_UP = "MONEY_BAL";
    public static final String INSURANCE = "insurance";
    public static final String TABLENAME = "arap_busidata";
    private UFDouble dealMoney;

    public String[] getAttributeNames() {
        return super.getAttributeNames();
    }

    public UFLiteralDate getRatedate() {
        return this.ratedate;
    }

    public void setRatedate(UFLiteralDate ratedate) {
        this.ratedate = ratedate;
    }

    public String getPk_ratetype() {
        return this.pk_ratetype;
    }

    public void setPk_ratetype(String pk_ratetype) {
        this.pk_ratetype = pk_ratetype;
    }

    public String getDef31() {
        return this.def31;
    }

    public void setDef31(String def31) {
        this.def31 = def31;
    }

    public String getDef32() {
        return this.def32;
    }

    public void setDef32(String def32) {
        this.def32 = def32;
    }

    public String getDef33() {
        return this.def33;
    }

    public void setDef33(String def33) {
        this.def33 = def33;
    }

    public String getDef34() {
        return this.def34;
    }

    public void setDef34(String def34) {
        this.def34 = def34;
    }

    public String getDef35() {
        return this.def35;
    }

    public void setDef35(String def35) {
        this.def35 = def35;
    }

    public String getDef36() {
        return this.def36;
    }

    public void setDef36(String def36) {
        this.def36 = def36;
    }

    public String getDef37() {
        return this.def37;
    }

    public void setDef37(String def37) {
        this.def37 = def37;
    }

    public String getDef38() {
        return this.def38;
    }

    public void setDef38(String def38) {
        this.def38 = def38;
    }

    public String getDef39() {
        return this.def39;
    }

    public void setDef39(String def39) {
        this.def39 = def39;
    }

    public String getDef40() {
        return this.def40;
    }

    public void setDef40(String def40) {
        this.def40 = def40;
    }

    public String getDef41() {
        return this.def41;
    }

    public void setDef41(String def41) {
        this.def41 = def41;
    }

    public String getDef42() {
        return this.def42;
    }

    public void setDef42(String def42) {
        this.def42 = def42;
    }

    public String getDef43() {
        return this.def43;
    }

    public void setDef43(String def43) {
        this.def43 = def43;
    }

    public String getDef44() {
        return this.def44;
    }

    public void setDef44(String def44) {
        this.def44 = def44;
    }

    public String getDef45() {
        return this.def45;
    }

    public void setDef45(String def45) {
        this.def45 = def45;
    }

    public String getDef46() {
        return this.def46;
    }

    public void setDef46(String def46) {
        this.def46 = def46;
    }

    public String getDef47() {
        return this.def47;
    }

    public void setDef47(String def47) {
        this.def47 = def47;
    }

    public String getDef48() {
        return this.def48;
    }

    public void setDef48(String def48) {
        this.def48 = def48;
    }

    public String getDef49() {
        return this.def49;
    }

    public void setDef49(String def49) {
        this.def49 = def49;
    }

    public String getDef50() {
        return this.def50;
    }

    public void setDef50(String def50) {
        this.def50 = def50;
    }

    public String getDef51() {
        return this.def51;
    }

    public void setDef51(String def51) {
        this.def51 = def51;
    }

    public String getDef52() {
        return this.def52;
    }

    public void setDef52(String def52) {
        this.def52 = def52;
    }

    public String getDef53() {
        return this.def53;
    }

    public void setDef53(String def53) {
        this.def53 = def53;
    }

    public String getDef54() {
        return this.def54;
    }

    public void setDef54(String def54) {
        this.def54 = def54;
    }

    public String getDef55() {
        return this.def55;
    }

    public void setDef55(String def55) {
        this.def55 = def55;
    }

    public String getDef56() {
        return this.def56;
    }

    public void setDef56(String def56) {
        this.def56 = def56;
    }

    public String getDef57() {
        return this.def57;
    }

    public void setDef57(String def57) {
        this.def57 = def57;
    }

    public String getDef58() {
        return this.def58;
    }

    public void setDef58(String def58) {
        this.def58 = def58;
    }

    public String getDef59() {
        return this.def59;
    }

    public void setDef59(String def59) {
        this.def59 = def59;
    }

    public String getDef60() {
        return this.def60;
    }

    public void setDef60(String def60) {
        this.def60 = def60;
    }

    public String getDef61() {
        return this.def61;
    }

    public void setDef61(String def61) {
        this.def61 = def61;
    }

    public String getDef62() {
        return this.def62;
    }

    public void setDef62(String def62) {
        this.def62 = def62;
    }

    public String getDef63() {
        return this.def63;
    }

    public void setDef63(String def63) {
        this.def63 = def63;
    }

    public String getDef64() {
        return this.def64;
    }

    public void setDef64(String def64) {
        this.def64 = def64;
    }

    public String getDef65() {
        return this.def65;
    }

    public void setDef65(String def65) {
        this.def65 = def65;
    }

    public String getDef66() {
        return this.def66;
    }

    public void setDef66(String def66) {
        this.def66 = def66;
    }

    public String getDef67() {
        return this.def67;
    }

    public void setDef67(String def67) {
        this.def67 = def67;
    }

    public String getDef68() {
        return this.def68;
    }

    public void setDef68(String def68) {
        this.def68 = def68;
    }

    public String getDef69() {
        return this.def69;
    }

    public void setDef69(String def69) {
        this.def69 = def69;
    }

    public String getDef70() {
        return this.def70;
    }

    public void setDef70(String def70) {
        this.def70 = def70;
    }

    public String getDef71() {
        return this.def71;
    }

    public void setDef71(String def71) {
        this.def71 = def71;
    }

    public String getDef72() {
        return this.def72;
    }

    public void setDef72(String def72) {
        this.def72 = def72;
    }

    public String getDef73() {
        return this.def73;
    }

    public void setDef73(String def73) {
        this.def73 = def73;
    }

    public String getDef74() {
        return this.def74;
    }

    public void setDef74(String def74) {
        this.def74 = def74;
    }

    public String getDef75() {
        return this.def75;
    }

    public void setDef75(String def75) {
        this.def75 = def75;
    }

    public String getDef76() {
        return this.def76;
    }

    public void setDef76(String def76) {
        this.def76 = def76;
    }

    public String getDef77() {
        return this.def77;
    }

    public void setDef77(String def77) {
        this.def77 = def77;
    }

    public String getDef78() {
        return this.def78;
    }

    public void setDef78(String def78) {
        this.def78 = def78;
    }

    public String getDef79() {
        return this.def79;
    }

    public void setDef79(String def79) {
        this.def79 = def79;
    }

    public String getDef80() {
        return this.def80;
    }

    public void setDef80(String def80) {
        this.def80 = def80;
    }

    public String getSrc_org() {
        return this.src_org;
    }

    public void setSrc_org(String srcOrg) {
        this.src_org = srcOrg;
    }

    public String getCashaccount() {
        return this.cashaccount;
    }

    public void setCashaccount(String cashaccount) {
        this.cashaccount = cashaccount;
    }

    public String getSrc_billid() {
        return this.src_billid;
    }

    public void setSrc_billid(String srcBillid) {
        this.src_billid = srcBillid;
    }

    public String getSrc_itemid() {
        return this.src_itemid;
    }

    public void setSrc_itemid(String srcItemid) {
        this.src_itemid = srcItemid;
    }

    public UFBoolean getIsrefund() {
        return this.isrefund;
    }

    public void setIsrefund(UFBoolean isrefund) {
        this.isrefund = isrefund;
    }

    public String getCostcenter() {
        return this.costcenter;
    }

    public void setCostcenter(String costcenter) {
        this.costcenter = costcenter;
    }

    public boolean isIsshlclear() {
        return this.isshlclear;
    }

    public void setIsshlclear(boolean isshlclear) {
        this.isshlclear = isshlclear;
    }

    public Integer getBillstatus() {
        return this.billstatus;
    }

    public void setBillstatus(Integer billstatus) {
        this.billstatus = billstatus;
    }

    public String getInvoiceno() {
        return this.invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    public String getPurchaseorder() {
        return this.purchaseorder;
    }

    public void setPurchaseorder(String purchaseorder) {
        this.purchaseorder = purchaseorder;
    }

    public String getContractno() {
        return this.contractno;
    }

    public void setContractno(String contractno) {
        this.contractno = contractno;
    }

    public Integer getPrepay() {
        return this.prepay;
    }

    public void setPrepay(Integer prepay) {
        this.prepay = prepay;
    }

    public UFDouble getHzybye() {
        return this.hzybye;
    }

    public void setHzybye(UFDouble hzybye) {
        this.hzybye = hzybye;
    }

    public UFDouble getHzbbye() {
        return this.hzbbye;
    }

    public void setHzbbye(UFDouble hzbbye) {
        this.hzbbye = hzbbye;
    }

    public UFDouble getSum_money() {
        return this.sum_money;
    }

    public void setSum_money(UFDouble sumMoney) {
        this.sum_money = sumMoney;
    }

    public UFDouble getSum_money_bal() {
        return this.sum_money_bal;
    }

    public void setSum_money_bal(UFDouble sumMoneybal) {
        this.sum_money_bal = sumMoneybal;
    }

    public UFDouble getThis_sett() {
        return this.this_sett;
    }

    public void setThis_sett(UFDouble this_sett) {
        this.this_sett = this_sett;
    }

    public UFDouble getLocal_money() {
        Integer direct = Integer.valueOf(this.getAttributeValue(DIRECTION).toString());
        if (direct == 1) {
            this.local_money = this.local_money_de;
        } else if (direct == -1) {
            this.local_money = this.local_money_cr;
        }
        return this.local_money;
    }

    public IVOMeta getMetaData() {
        return VOMetaFactory.getInstance().getVOMeta("arap.arap_busidata");
    }

    public void setLocal_money(UFDouble localMoney) {
        this.local_money = localMoney;
    }

    public UFDouble getQuantity() {
        Integer direct = Integer.valueOf(this.getAttributeValue(DIRECTION).toString());
        if (direct == 1) {
            this.quantity = this.quantity_de;
        } else if (direct == -1) {
            this.quantity = this.quantity_cr;
        }
        return this.quantity;
    }

    public void setQuantity(UFDouble quantity) {
        this.quantity = quantity;
    }

    public UFDouble getMoney() {
        Integer direct = Integer.valueOf(this.getAttributeValue(DIRECTION).toString());
        if (direct == 1) {
            this.money = this.money_de;
        } else if (direct == -1) {
            this.money = this.money_cr;
        }
        return this.money;
    }

    public void setMoney(UFDouble money) {
        this.money = money;
    }

    public String getWldxpk() {
        if (this.getObjtype() != null && this.getObjtype() == 0) {
            this.wldxpk = this.getCustomer();
        } else if (this.getObjtype() != null && this.getObjtype() == 1) {
            this.wldxpk = this.getSupplier();
        } else if (this.getObjtype() != null && this.getObjtype() == 2) {
            this.wldxpk = this.getPk_deptid();
        } else if (this.getObjtype() != null && this.getObjtype() == 3) {
            this.wldxpk = this.getPk_psndoc();
        }
        return this.wldxpk;
    }

    public void setWldxpk(String wldxpk) {
        this.wldxpk = wldxpk;
    }

    public String getProject_task() {
        return this.project_task;
    }

    public void setProject_task(String projectTask) {
        this.project_task = projectTask;
    }

    public String getProject() {
        return this.project;
    }

    public UFBoolean getPausetransact() {
        return this.pausetransact;
    }

    public void setPausetransact(UFBoolean pausetransact) {
        this.pausetransact = pausetransact;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public UFBoolean getIstransin() {
        return this.istransin;
    }

    public void setIstransin(UFBoolean istransin) {
        this.istransin = istransin;
    }

    public UFDouble getPrice() {
        return this.price;
    }

    public void setPrice(UFDouble price) {
        this.price = price;
    }

    public String getPk_busidata() {
        return this.pk_busidata;
    }

    public void setPk_busidata(String newPk_busidata) {
        this.pk_busidata = newPk_busidata;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String newPk_org) {
        this.pk_org = newPk_org;
    }

    public String getPk_group() {
        return this.pk_group;
    }

    public void setPk_group(String newPk_group) {
        this.pk_group = newPk_group;
    }

    public String getPk_termitem() {
        return this.pk_termitem;
    }

    public void setPk_termitem(String newPk_termitem) {
        this.pk_termitem = newPk_termitem;
    }

    public String getPk_bill() {
        return this.pk_bill;
    }

    public void setPk_bill(String newPk_bill) {
        this.pk_bill = newPk_bill;
    }

    public String getPk_item() {
        return this.pk_item;
    }

    public void setPk_item(String newPk_item) {
        this.pk_item = newPk_item;
    }

    public String getPk_billtype() {
        return this.pk_billtype;
    }

    public void setPk_billtype(String newPk_billtype) {
        this.pk_billtype = newPk_billtype;
    }

    public String getPk_tradetype() {
        return this.pk_tradetype;
    }

    public void setPk_tradetype(String newPk_tradetype) {
        this.pk_tradetype = newPk_tradetype;
    }

    public String getPk_tradetypeid() {
        return this.pk_tradetypeid;
    }

    public void setPk_tradetypeid(String newPk_tradetypeid) {
        this.pk_tradetypeid = newPk_tradetypeid;
    }

    public String getBillclass() {
        return this.billclass;
    }

    public void setBillclass(String newBillclass) {
        this.billclass = newBillclass;
    }

    public UFDate getExpiredate() {
        return this.expiredate;
    }

    public void setExpiredate(UFDate newExpiredate) {
        this.expiredate = newExpiredate;
    }

    public UFBoolean getIsinit() {
        return this.isinit;
    }

    public void setIsinit(UFBoolean newIsinit) {
        this.isinit = newIsinit;
    }

    public String getBillno() {
        return this.billno;
    }

    public void setBillno(String newBillno) {
        this.billno = newBillno;
    }

    public UFDate getBilldate() {
        return this.billdate;
    }

    public void setBilldate(UFDate newBilldate) {
        this.billdate = newBilldate;
    }

    public UFDate getBusidate() {
        return this.busidate;
    }

    public void setBusidate(UFDate busidate) {
        this.busidate = busidate;
    }

    public UFDate getInner_effect_date() {
        return this.inner_effect_date;
    }

    public void setInner_effect_date(UFDate innerEffectDate) {
        this.inner_effect_date = innerEffectDate;
    }

    public Integer getEffectstatus() {
        return this.effectstatus;
    }

    public void setEffectstatus(Integer effectstatus) {
        this.effectstatus = effectstatus;
    }

    public UFDateTime getApprovedate() {
        return this.approvedate;
    }

    public void setApprovedate(UFDateTime approvedate) {
        this.approvedate = approvedate;
    }

    public UFDate getEffectdate() {
        return this.effectdate;
    }

    public void setEffectdate(UFDate effectdate) {
        this.effectdate = effectdate;
    }

    public Integer getSyscode() {
        return this.syscode;
    }

    public void setSyscode(Integer newSyscode) {
        this.syscode = newSyscode;
    }

    public Integer getSrc_syscode() {
        return this.src_syscode;
    }

    public void setSrc_syscode(Integer newSrc_syscode) {
        this.src_syscode = newSrc_syscode;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String newOperator) {
        this.operator = newOperator;
    }

    public String getApprover() {
        return this.approver;
    }

    public void setApprover(String newApprover) {
        this.approver = newApprover;
    }

    public String getCustomer() {
        return this.customer;
    }

    public void setCustomer(String newCustomer) {
        this.customer = newCustomer;
    }

    public String getSupplier() {
        return this.supplier;
    }

    public void setSupplier(String newSupplier) {
        this.supplier = newSupplier;
    }

    public String getPk_deptid() {
        return this.pk_deptid;
    }

    public void setPk_deptid(String newPk_deptid) {
        this.pk_deptid = newPk_deptid;
    }

    public String getPk_psndoc() {
        return this.pk_psndoc;
    }

    public void setPk_psndoc(String newPk_psndoc) {
        this.pk_psndoc = newPk_psndoc;
    }

    public String getPk_costsubj() {
        return this.pk_costsubj;
    }

    public void setPk_costsubj(String newPk_costsubj) {
        this.pk_costsubj = newPk_costsubj;
    }

    public UFDouble getOccupationmny() {
        return this.occupationmny;
    }

    public void setOccupationmny(UFDouble newOccupationmny) {
        this.occupationmny = newOccupationmny;
    }

    public Integer getObjtype() {
        return this.objtype;
    }

    public void setObjtype(Integer newObjtype) {
        this.objtype = newObjtype;
    }

    public Integer getDirection() {
        return this.direction;
    }

    public void setDirection(Integer newDirection) {
        this.direction = newDirection;
    }

    public String getPk_currtype() {
        return this.pk_currtype;
    }

    public void setPk_currtype(String newPk_currtype) {
        this.pk_currtype = newPk_currtype;
    }

    public UFDouble getRate() {
        return this.rate;
    }

    public void setRate(UFDouble newRate) {
        this.rate = newRate;
    }

    public UFDouble getGrouprate() {
        return this.grouprate;
    }

    public void setGrouprate(UFDouble newGrouprate) {
        this.grouprate = newGrouprate;
    }

    public UFDouble getGlobalrate() {
        return this.globalrate;
    }

    public void setGlobalrate(UFDouble newGlobalrate) {
        this.globalrate = newGlobalrate;
    }

    public UFDouble getMoney_de() {
        return this.money_de;
    }

    public void setMoney_de(UFDouble newMoney_de) {
        this.money_de = newMoney_de;
    }

    public UFDouble getLocal_money_de() {
        return this.local_money_de;
    }

    public void setLocal_money_de(UFDouble newLocal_money_de) {
        this.local_money_de = newLocal_money_de;
    }

    public UFDouble getLocal_money_cr() {
        return this.local_money_cr;
    }

    public void setLocal_money_cr(UFDouble newLocal_money_cr) {
        this.local_money_cr = newLocal_money_cr;
    }

    public UFDouble getMoney_cr() {
        return this.money_cr;
    }

    public void setMoney_cr(UFDouble newMoney_cr) {
        this.money_cr = newMoney_cr;
    }

    public UFDouble getMoney_bal() {
        return this.money_bal;
    }

    public void setMoney_bal(UFDouble newMoney_bal) {
        this.money_bal = newMoney_bal;
    }

    public UFDouble getLocal_money_bal() {
        return this.local_money_bal;
    }

    public void setLocal_money_bal(UFDouble newLocal_money_bal) {
        this.local_money_bal = newLocal_money_bal;
    }

    public UFDouble getGroup_money_bal() {
        return this.group_money_bal;
    }

    public void setGroup_money_bal(UFDouble newGroup_money_bal) {
        this.group_money_bal = newGroup_money_bal;
    }

    public UFDouble getGroup_money_cr() {
        return this.group_money_cr;
    }

    public void setGroup_money_cr(UFDouble newGroup_money_cr) {
        this.group_money_cr = newGroup_money_cr;
    }

    public UFDouble getGroup_money_de() {
        return this.group_money_de;
    }

    public void setGroup_money_de(UFDouble newGroup_money_de) {
        this.group_money_de = newGroup_money_de;
    }

    public UFDouble getGlobal_money_bal() {
        return this.global_money_bal;
    }

    public void setGlobal_money_bal(UFDouble newGlobal_money_bal) {
        this.global_money_bal = newGlobal_money_bal;
    }

    public UFDouble getGlobal_money_cr() {
        return this.global_money_cr;
    }

    public void setGlobal_money_cr(UFDouble newGlobal_money_cr) {
        this.global_money_cr = newGlobal_money_cr;
    }

    public UFDouble getGlobal_money_de() {
        return this.global_money_de;
    }

    public void setGlobal_money_de(UFDouble newGlobal_money_de) {
        this.global_money_de = newGlobal_money_de;
    }

    public UFDouble getQuantity_de() {
        return this.quantity_de;
    }

    public void setQuantity_de(UFDouble newQuantity_de) {
        this.quantity_de = newQuantity_de;
    }

    public UFDouble getQuantity_cr() {
        return this.quantity_cr;
    }

    public void setQuantity_cr(UFDouble newQuantity_cr) {
        this.quantity_cr = newQuantity_cr;
    }

    public UFDouble getQuantity_bal() {
        return this.quantity_bal;
    }

    public void setQuantity_bal(UFDouble newQuantity_bal) {
        this.quantity_bal = newQuantity_bal;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String newMaterial) {
        this.material = newMaterial;
    }

    public String getPk_subjcode() {
        return this.pk_subjcode;
    }

    public void setPk_subjcode(String pkSubjcode) {
        this.pk_subjcode = pkSubjcode;
    }

    public String getOrdercubasdoc() {
        return this.ordercubasdoc;
    }

    public void setOrdercubasdoc(String newOrdercubasdoc) {
        this.ordercubasdoc = newOrdercubasdoc;
    }

    public String getPk_balatype() {
        return this.pk_balatype;
    }

    public void setPk_balatype(String newPk_balatype) {
        this.pk_balatype = newPk_balatype;
    }

    public String getTop_billid() {
        return this.top_billid;
    }

    public void setTop_billid(String newTop_billid) {
        this.top_billid = newTop_billid;
    }

    public String getTop_itemid() {
        return this.top_itemid;
    }

    public void setTop_itemid(String newTop_itemid) {
        this.top_itemid = newTop_itemid;
    }

    public String getTop_billtype() {
        return this.top_billtype;
    }

    public void setTop_billtype(String newTop_billtype) {
        this.top_billtype = newTop_billtype;
    }

    public String getPk_busitype() {
        return this.pk_busitype;
    }

    public void setPk_busitype(String newPk_busitype) {
        this.pk_busitype = newPk_busitype;
    }

    public Integer getDr() {
        return this.dr;
    }

    public void setDr(Integer newDr) {
        this.dr = newDr;
    }

    public UFDateTime getTs() {
        return this.ts;
    }

    public void setTs(UFDateTime newTs) {
        this.ts = newTs;
    }

    public String getParentPKFieldName() {
        return null;
    }

    public String getPKFieldName() {
        return PK_BUSIDATA;
    }

    public String getTableName() {
        return TABLENAME;
    }

    public static String defaultTableName() {
        return TABLENAME;
    }

    public boolean isDebt() {
        return this.getPk_billtype().equals("F0") || this.getPk_billtype().equals("F3") || this.getPk_billtype().equals("23F0") || this.getPk_billtype().equals("23F3");
    }

    public UFDouble getDealMoney() {
        return this.dealMoney;
    }

    public void setDealMoney(UFDouble dealMoney) {
        this.dealMoney = dealMoney;
    }

    public Object getAttributeValue(String name) {
        if (this.isDefaultField(name)) {
            return super.getAttributeValue(name);
        }
        return this.attributes == null ? null : this.attributes.get(name);
    }

    public void setAttributeValue(String name, Object value) {
        if (this.isDefaultField(name)) {
            if (!ISINIT.equals(name)) {
                super.setAttributeValue(name, value);
            }
            return;
        }
        if (this.attributes == null) {
            this.attributes = new HashMap();
        }
        this.attributes.put(name, value);
    }

    private boolean isDefaultField(String name) {
        return attributeNames.contains(name);
    }

    public String getSett_org() {
        return this.sett_org;
    }

    public void setSett_org(String newSett_org) {
        this.sett_org = newSett_org;
    }

    public String getProductline() {
        return this.productline;
    }

    public void setProductline(String newProductline) {
        this.productline = newProductline;
    }

    public String getSo_ordertype() {
        return this.so_ordertype;
    }

    public void setSo_ordertype(String newSo_ordertype) {
        this.so_ordertype = newSo_ordertype;
    }

    public String getSo_transtype() {
        return this.so_transtype;
    }

    public void setSo_transtype(String newSo_transtype) {
        this.so_transtype = newSo_transtype;
    }

    public String getSo_org() {
        return this.so_org;
    }

    public void setSo_org(String newSo_org) {
        this.so_org = newSo_org;
    }

    public String getSo_deptid() {
        return this.so_deptid;
    }

    public void setSo_deptid(String newSo_deptid) {
        this.so_deptid = newSo_deptid;
    }

    public String getSo_psndoc() {
        return this.so_psndoc;
    }

    public void setSo_psndoc(String newSo_psndoc) {
        this.so_psndoc = newSo_psndoc;
    }

    public String getHeadsubjcode() {
        return this.headsubjcode;
    }

    public void setHeadsubjcode(String newHeadsubjcode) {
        this.headsubjcode = newHeadsubjcode;
    }

    public String getSubjcode() {
        return this.subjcode;
    }

    public void setSubjcode(String newSubjcode) {
        this.subjcode = newSubjcode;
    }

    public String getPk_pcorg() {
        return this.pk_pcorg;
    }

    public void setPk_pcorg(String newPk_pcorg) {
        this.pk_pcorg = newPk_pcorg;
    }

    public String getPu_org() {
        return this.pu_org;
    }

    public void setPu_org(String newPu_org) {
        this.pu_org = newPu_org;
    }

    public String getPu_deptid() {
        return this.pu_deptid;
    }

    public void setPu_deptid(String newPu_deptid) {
        this.pu_deptid = newPu_deptid;
    }

    public String getPu_psndoc() {
        return this.pu_psndoc;
    }

    public void setPu_psndoc(String newPu_psndoc) {
        this.pu_psndoc = newPu_psndoc;
    }

    public UFBoolean getInsurance() {
        return this.insurance;
    }

    public void setInsurance(UFBoolean newInsurance) {
        this.insurance = newInsurance;
    }

    public String getPk_areacl() {
        return this.pk_areacl;
    }

    public void setPk_areacl(String newPk_areacl) {
        this.pk_areacl = newPk_areacl;
    }

    public Integer getEstflag() {
        return this.estflag;
    }

    public void setEstflag(Integer newEstflag) {
        this.estflag = newEstflag;
    }

    public UFDate getInnerctldeferdays() {
        return this.innerctldeferdays;
    }

    public void setInnerctldeferdays(UFDate newInnerctldeferdays) {
        this.innerctldeferdays = newInnerctldeferdays;
    }

    public UFDouble getSum_headmoney() {
        return this.sum_headmoney;
    }

    public void setSum_headmoney(UFDouble newSum_headmoney) {
        this.sum_headmoney = newSum_headmoney;
    }

    public UFDouble getSum_itemmoney() {
        return this.sum_itemmoney;
    }

    public void setSum_itemmoney(UFDouble newSum_itemmoney) {
        this.sum_itemmoney = newSum_itemmoney;
    }

    public String getH_def30() {
        return this.h_def30;
    }

    public void setH_def30(String hDef30) {
        this.h_def30 = hDef30;
    }

    public String getH_def29() {
        return this.h_def29;
    }

    public void setH_def29(String hDef29) {
        this.h_def29 = hDef29;
    }

    public String getH_def28() {
        return this.h_def28;
    }

    public void setH_def28(String hDef28) {
        this.h_def28 = hDef28;
    }

    public String getH_def27() {
        return this.h_def27;
    }

    public void setH_def27(String hDef27) {
        this.h_def27 = hDef27;
    }

    public String getH_def26() {
        return this.h_def26;
    }

    public void setH_def26(String hDef26) {
        this.h_def26 = hDef26;
    }

    public String getH_def25() {
        return this.h_def25;
    }

    public void setH_def25(String hDef25) {
        this.h_def25 = hDef25;
    }

    public String getH_def24() {
        return this.h_def24;
    }

    public void setH_def24(String hDef24) {
        this.h_def24 = hDef24;
    }

    public String getH_def23() {
        return this.h_def23;
    }

    public void setH_def23(String hDef23) {
        this.h_def23 = hDef23;
    }

    public String getH_def22() {
        return this.h_def22;
    }

    public void setH_def22(String hDef22) {
        this.h_def22 = hDef22;
    }

    public String getH_def21() {
        return this.h_def21;
    }

    public void setH_def21(String hDef21) {
        this.h_def21 = hDef21;
    }

    public String getH_def20() {
        return this.h_def20;
    }

    public void setH_def20(String hDef20) {
        this.h_def20 = hDef20;
    }

    public String getH_def19() {
        return this.h_def19;
    }

    public void setH_def19(String hDef19) {
        this.h_def19 = hDef19;
    }

    public String getH_def18() {
        return this.h_def18;
    }

    public void setH_def18(String hDef18) {
        this.h_def18 = hDef18;
    }

    public String getH_def17() {
        return this.h_def17;
    }

    public void setH_def17(String hDef17) {
        this.h_def17 = hDef17;
    }

    public String getH_def16() {
        return this.h_def16;
    }

    public void setH_def16(String hDef16) {
        this.h_def16 = hDef16;
    }

    public String getH_def15() {
        return this.h_def15;
    }

    public void setH_def15(String hDef15) {
        this.h_def15 = hDef15;
    }

    public String getH_def14() {
        return this.h_def14;
    }

    public void setH_def14(String hDef14) {
        this.h_def14 = hDef14;
    }

    public String getH_def13() {
        return this.h_def13;
    }

    public void setH_def13(String hDef13) {
        this.h_def13 = hDef13;
    }

    public String getH_def12() {
        return this.h_def12;
    }

    public void setH_def12(String hDef12) {
        this.h_def12 = hDef12;
    }

    public String getH_def11() {
        return this.h_def11;
    }

    public void setH_def11(String hDef11) {
        this.h_def11 = hDef11;
    }

    public String getH_def10() {
        return this.h_def10;
    }

    public void setH_def10(String hDef10) {
        this.h_def10 = hDef10;
    }

    public String getH_def9() {
        return this.h_def9;
    }

    public void setH_def9(String hDef9) {
        this.h_def9 = hDef9;
    }

    public String getH_def8() {
        return this.h_def8;
    }

    public void setH_def8(String hDef8) {
        this.h_def8 = hDef8;
    }

    public String getH_def7() {
        return this.h_def7;
    }

    public void setH_def7(String hDef7) {
        this.h_def7 = hDef7;
    }

    public String getH_def6() {
        return this.h_def6;
    }

    public void setH_def6(String hDef6) {
        this.h_def6 = hDef6;
    }

    public String getH_def5() {
        return this.h_def5;
    }

    public void setH_def5(String hDef5) {
        this.h_def5 = hDef5;
    }

    public String getH_def4() {
        return this.h_def4;
    }

    public void setH_def4(String hDef4) {
        this.h_def4 = hDef4;
    }

    public String getH_def3() {
        return this.h_def3;
    }

    public void setH_def3(String hDef3) {
        this.h_def3 = hDef3;
    }

    public String getH_def2() {
        return this.h_def2;
    }

    public void setH_def2(String hDef2) {
        this.h_def2 = hDef2;
    }

    public String getH_def1() {
        return this.h_def1;
    }

    public void setH_def1(String hDef1) {
        this.h_def1 = hDef1;
    }

    public String getDef30() {
        return this.def30;
    }

    public void setDef30(String def30) {
        this.def30 = def30;
    }

    public String getDef29() {
        return this.def29;
    }

    public void setDef29(String def29) {
        this.def29 = def29;
    }

    public String getDef28() {
        return this.def28;
    }

    public void setDef28(String def28) {
        this.def28 = def28;
    }

    public String getDef27() {
        return this.def27;
    }

    public void setDef27(String def27) {
        this.def27 = def27;
    }

    public String getDef26() {
        return this.def26;
    }

    public void setDef26(String def26) {
        this.def26 = def26;
    }

    public String getDef25() {
        return this.def25;
    }

    public void setDef25(String def25) {
        this.def25 = def25;
    }

    public String getDef24() {
        return this.def24;
    }

    public void setDef24(String def24) {
        this.def24 = def24;
    }

    public String getDef23() {
        return this.def23;
    }

    public void setDef23(String def23) {
        this.def23 = def23;
    }

    public String getDef22() {
        return this.def22;
    }

    public void setDef22(String def22) {
        this.def22 = def22;
    }

    public String getDef21() {
        return this.def21;
    }

    public void setDef21(String def21) {
        this.def21 = def21;
    }

    public String getDef20() {
        return this.def20;
    }

    public void setDef20(String def20) {
        this.def20 = def20;
    }

    public String getDef19() {
        return this.def19;
    }

    public void setDef19(String def19) {
        this.def19 = def19;
    }

    public String getDef18() {
        return this.def18;
    }

    public void setDef18(String def18) {
        this.def18 = def18;
    }

    public String getDef17() {
        return this.def17;
    }

    public void setDef17(String def17) {
        this.def17 = def17;
    }

    public String getDef16() {
        return this.def16;
    }

    public void setDef16(String def16) {
        this.def16 = def16;
    }

    public String getDef15() {
        return this.def15;
    }

    public void setDef15(String def15) {
        this.def15 = def15;
    }

    public String getDef14() {
        return this.def14;
    }

    public void setDef14(String def14) {
        this.def14 = def14;
    }

    public String getDef13() {
        return this.def13;
    }

    public void setDef13(String def13) {
        this.def13 = def13;
    }

    public String getDef12() {
        return this.def12;
    }

    public void setDef12(String def12) {
        this.def12 = def12;
    }

    public String getDef11() {
        return this.def11;
    }

    public void setDef11(String def11) {
        this.def11 = def11;
    }

    public String getDef10() {
        return this.def10;
    }

    public void setDef10(String def10) {
        this.def10 = def10;
    }

    public String getDef9() {
        return this.def9;
    }

    public void setDef9(String def9) {
        this.def9 = def9;
    }

    public String getDef8() {
        return this.def8;
    }

    public void setDef8(String def8) {
        this.def8 = def8;
    }

    public String getDef7() {
        return this.def7;
    }

    public void setDef7(String def7) {
        this.def7 = def7;
    }

    public String getDef6() {
        return this.def6;
    }

    public void setDef6(String def6) {
        this.def6 = def6;
    }

    public String getDef5() {
        return this.def5;
    }

    public void setDef5(String def5) {
        this.def5 = def5;
    }

    public String getDef4() {
        return this.def4;
    }

    public void setDef4(String def4) {
        this.def4 = def4;
    }

    public String getDef3() {
        return this.def3;
    }

    public void setDef3(String def3) {
        this.def3 = def3;
    }

    public String getDef2() {
        return this.def2;
    }

    public void setDef2(String def2) {
        this.def2 = def2;
    }

    public String getDef1() {
        return this.def1;
    }

    public void setDef1(String def1) {
        this.def1 = def1;
    }

    public String getLinkedPk() {
        return this.linkedPk;
    }

    public void setLinkedPk(String linkedPk) {
        this.linkedPk = linkedPk;
    }

    public String getPk_recpaytype() {
        return this.pk_recpaytype;
    }

    public void setPk_recpaytype(String pk_recpaytype) {
        this.pk_recpaytype = pk_recpaytype;
    }

    public UFBoolean getIsEditMoney() {
        return this.isEditMoney;
    }

    public void setIsEditMoney(UFBoolean isEditMoney) {
        this.isEditMoney = isEditMoney;
    }

    public Integer getSaga_frozen() {
        return this.saga_frozen;
    }

    public void setSaga_frozen(Integer saga_frozen) {
        this.saga_frozen = saga_frozen;
    }

    public Integer getSaga_status() {
        return this.saga_status;
    }

    public void setSaga_status(Integer saga_status) {
        this.saga_status = saga_status;
    }
}

