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
 *  nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory
 */
package nc.vo.arap.tally;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class TallyVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    private String pk_tally;
    private String pk_group;
    private String pk_org;
    private String pk_org_v;
    private String accyear;
    private String accperiod;
    private UFDate tallydate;
    private String brief;
    private String pk_currtype;
    private Integer objtype;
    private String customer;
    private String supplier;
    private String pk_deptid;
    private String pk_psndoc;
    private String billclass;
    private String pk_billtype;
    private String pk_tradetype;
    private String pk_tradetypeid;
    private String billno;
    private String pk_bill;
    private String pk_item;
    private String pk_corbill;
    private String pk_coritem;
    private String corbillclass;
    private UFDouble quantity_de;
    private UFDouble money_de;
    private UFDouble local_money_de;
    private UFDouble grouplocal_money_de;
    private UFDouble globallocal_money_de;
    private UFDouble tax_de;
    private UFDouble local_tax_de;
    private UFDouble grouplocal_tax_de;
    private UFDouble globallocal_tax_de;
    private UFDouble notax_de;
    private UFDouble local_notax_de;
    private UFDouble grouplocal_notax_de;
    private UFDouble globallocal_notax_de;
    private String material;
    private String pk_subjcode;
    private String subjcode;
    private String ordercubasdoc;
    private UFDouble quantity_cr;
    private UFDouble money_cr;
    private UFDouble local_money_cr;
    private UFDouble grouplocal_money_cr;
    private UFDouble globallocal_money_cr;
    private UFDouble tax_cr;
    private UFDouble local_tax_cr;
    private UFDouble grouplocal_tax_cr;
    private UFDouble globallocal_tax_cr;
    private UFDouble notax_cr;
    private UFDouble local_notax_cr;
    private UFDouble grouplocal_notax_cr;
    private UFDouble globallocal_notax_cr;
    private String invoiceno;
    private Integer dealflag;
    private Integer busitype;
    private String pk_dealnum;
    private String pk_busidata;
    private UFBoolean prepay;
    private UFDate busidate;
    private UFDate billdate;
    private UFDateTime approvedate;
    private UFDate effectdate;
    private Integer effectstatus;
    private Integer billstatus;
    private UFDate verifyfinishdate;
    private String def1;
    private String def2;
    private String def3;
    private String def4;
    private String def5;
    private String def6;
    private String def7;
    private String def8;
    private String def9;
    private String def10;
    private String def11;
    private String def12;
    private String def13;
    private String def14;
    private String def15;
    private String def16;
    private String def17;
    private String def18;
    private String def19;
    private String def20;
    private String def21;
    private String def22;
    private String def23;
    private String def24;
    private String def25;
    private String def26;
    private String def27;
    private String def28;
    private String def29;
    private String def30;
    private UFDouble deal_quantity;
    private UFDouble deal_money;
    private UFDouble deal_local_money;
    private UFDouble deal_grouplocal_money;
    private UFDouble deal_globallocal_money;
    private Integer dr = 0;
    private UFDateTime ts;
    private String pk_recpaytype;
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
    private String transerial;
    private UFBoolean isrefund;
    public static final String PK_TALLY = "pk_tally";
    public static final String PK_GROUP = "pk_group";
    public static final String PK_ORG = "pk_org";
    public static final String PK_ORG_V = "pk_org_v";
    public static final String ACCYEAR = "accyear";
    public static final String ACCPERIOD = "accperiod";
    public static final String TALLYDATE = "tallydate";
    public static final String BRIEF = "brief";
    public static final String PK_CURRTYPE = "pk_currtype";
    public static final String OBJTYPE = "objtype";
    public static final String CUSTOMER = "customer";
    public static final String SUPPLIER = "supplier";
    public static final String PK_DEPTID = "pk_deptid";
    public static final String PK_PSNDOC = "pk_psndoc";
    public static final String BILLCLASS = "billclass";
    public static final String PK_BILLTYPE = "pk_billtype";
    public static final String PK_TRADETYPE = "pk_tradetype";
    public static final String PK_TRADETYPEID = "pk_tradetypeid";
    public static final String BILLNO = "billno";
    public static final String PK_BILL = "pk_bill";
    public static final String PK_ITEM = "pk_item";
    public static final String PK_CORBILL = "pk_corbill";
    public static final String PK_CORITEM = "pk_coritem";
    public static final String CORBILLCLASS = "corbillclass";
    public static final String QUANTITY_DE = "quantity_de";
    public static final String MONEY_DE = "money_de";
    public static final String LOCAL_MONEY_DE = "local_money_de";
    public static final String GROUPLOCAL_MONEY_DE = "grouplocal_money_de";
    public static final String GLOBALLOCAL_MONEY_DE = "globallocal_money_de";
    public static final String TAX_DE = "tax_de";
    public static final String LOCAL_TAX_DE = "local_tax_de";
    public static final String GROUPLOCAL_TAX_DE = "grouplocal_tax_de";
    public static final String GLOBALLOCAL_TAX_DE = "globallocal_tax_de";
    public static final String NOTAX_DE = "notax_de";
    public static final String LOCAL_NOTAX_DE = "local_notax_de";
    public static final String GROUPLOCAL_NOTAX_DE = "grouplocal_notax_de";
    public static final String GLOBALLOCAL_NOTAX_DE = "globallocal_notax_de";
    public static final String MATERIAL = "material";
    public static final String PK_SUBJCODE = "pk_subjcode";
    public static final String SUBJCODE = "subjcode";
    public static final String ORDERCUBASDOC = "ordercubasdoc";
    public static final String QUANTITY_CR = "quantity_cr";
    public static final String MONEY_CR = "money_cr";
    public static final String LOCAL_MONEY_CR = "local_money_cr";
    public static final String GROUPLOCAL_MONEY_CR = "grouplocal_money_cr";
    public static final String GLOBALLOCAL_MONEY_CR = "globallocal_money_cr";
    public static final String TAX_CR = "tax_cr";
    public static final String LOCAL_TAX_CR = "local_tax_cr";
    public static final String GROUPLOCAL_TAX_CR = "grouplocal_tax_cr";
    public static final String GLOBALLOCAL_TAX_CR = "globallocal_tax_cr";
    public static final String NOTAX_CR = "notax_cr";
    public static final String LOCAL_NOTAX_CR = "local_notax_cr";
    public static final String GROUPLOCAL_NOTAX_CR = "grouplocal_notax_cr";
    public static final String GLOBALLOCAL_NOTAX_CR = "globallocal_notax_cr";
    public static final String INVOICENO = "invoiceno";
    public static final String DEALFLAG = "dealflag";
    public static final String BUSITYPE = "busitype";
    public static final String PK_DEALNUM = "pk_dealnum";
    public static final String PK_BUSIDATA = "pk_busidata";
    public static final String PREPAY = "prepay";
    public static final String BUSIDATE = "busidate";
    public static final String BILLDATE = "billdate";
    public static final String APPROVEDATE = "approvedate";
    public static final String EFFECTDATE = "effectdate";
    public static final String EFFECTSTATUS = "effectstatus";
    public static final String BILLSTATUS = "billstatus";
    public static final String VERIFYFINISHDATE = "verifyfinishdate";
    public static final String DEF1 = "def1";
    public static final String DEF2 = "def2";
    public static final String DEF3 = "def3";
    public static final String DEF4 = "def4";
    public static final String DEF5 = "def5";
    public static final String DEF6 = "def6";
    public static final String DEF7 = "def7";
    public static final String DEF8 = "def8";
    public static final String DEF9 = "def9";
    public static final String DEF10 = "def10";
    public static final String DEF11 = "def11";
    public static final String DEF12 = "def12";
    public static final String DEF13 = "def13";
    public static final String DEF14 = "def14";
    public static final String DEF15 = "def15";
    public static final String DEF16 = "def16";
    public static final String DEF17 = "def17";
    public static final String DEF18 = "def18";
    public static final String DEF19 = "def19";
    public static final String DEF20 = "def20";
    public static final String DEF21 = "def21";
    public static final String DEF22 = "def22";
    public static final String DEF23 = "def23";
    public static final String DEF24 = "def24";
    public static final String DEF25 = "def25";
    public static final String DEF26 = "def26";
    public static final String DEF27 = "def27";
    public static final String DEF28 = "def28";
    public static final String DEF29 = "def29";
    public static final String DEF30 = "def30";
    public static final String DEAL_QUANTITY = "deal_quantity";
    public static final String DEAL_MONEY = "deal_money";
    public static final String DEAL_LOCAL_MONEY = "deal_local_money";
    public static final String DEAL_GROUPLOCAL_MONEY = "deal_grouplocal_money";
    public static final String DEAL_GLOBALLOCAL_MONEY = "deal_globallocal_money";
    public static final String PK_RECPAYTYP = "pk_recpaytype";
    public static final String DEF31 = "def31";
    public static final String DEF32 = "def32";
    public static final String DEF33 = "def33";
    public static final String DEF34 = "def34";
    public static final String DEF35 = "def35";
    public static final String DEF36 = "def36";
    public static final String DEF37 = "def37";
    public static final String DEF38 = "def38";
    public static final String DEF39 = "def39";
    public static final String DEF40 = "def40";
    public static final String DEF41 = "def41";
    public static final String DEF42 = "def42";
    public static final String DEF43 = "def43";
    public static final String DEF44 = "def44";
    public static final String DEF45 = "def45";
    public static final String DEF46 = "def46";
    public static final String DEF47 = "def47";
    public static final String DEF48 = "def48";
    public static final String DEF49 = "def49";
    public static final String DEF50 = "def50";
    public static final String DEF51 = "def51";
    public static final String DEF52 = "def52";
    public static final String DEF53 = "def53";
    public static final String DEF54 = "def54";
    public static final String DEF55 = "def55";
    public static final String DEF56 = "def56";
    public static final String DEF57 = "def57";
    public static final String DEF58 = "def58";
    public static final String DEF59 = "def59";
    public static final String DEF60 = "def60";
    public static final String DEF61 = "def61";
    public static final String DEF62 = "def62";
    public static final String DEF63 = "def63";
    public static final String DEF64 = "def64";
    public static final String DEF65 = "def65";
    public static final String DEF66 = "def66";
    public static final String DEF67 = "def67";
    public static final String DEF68 = "def68";
    public static final String DEF69 = "def69";
    public static final String DEF70 = "def70";
    public static final String DEF71 = "def71";
    public static final String DEF72 = "def72";
    public static final String DEF73 = "def73";
    public static final String DEF74 = "def74";
    public static final String DEF75 = "def75";
    public static final String DEF76 = "def76";
    public static final String DEF77 = "def77";
    public static final String DEF78 = "def78";
    public static final String DEF79 = "def79";
    public static final String DEF80 = "def80";
    public static final String TRANSERIAL = "transerial";
    public static final String ISREFUND = "isrefund";

    public String getPk_recpaytype() {
        return this.pk_recpaytype;
    }

    public void setPk_recpaytype(String pk_recpaytype) {
        this.pk_recpaytype = pk_recpaytype;
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

    public String getPk_tally() {
        return this.pk_tally;
    }

    public void setPk_tally(String newPk_tally) {
        this.pk_tally = newPk_tally;
    }

    public String getPk_group() {
        return this.pk_group;
    }

    public void setPk_group(String newPk_group) {
        this.pk_group = newPk_group;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String newPk_org) {
        this.pk_org = newPk_org;
    }

    public String getPk_org_v() {
        return this.pk_org_v;
    }

    public void setPk_org_v(String newPk_org_v) {
        this.pk_org_v = newPk_org_v;
    }

    public String getAccyear() {
        return this.accyear;
    }

    public void setAccyear(String newAccyear) {
        this.accyear = newAccyear;
    }

    public String getAccperiod() {
        return this.accperiod;
    }

    public void setAccperiod(String newAccperiod) {
        this.accperiod = newAccperiod;
    }

    public UFDate getTallydate() {
        return this.tallydate;
    }

    public void setTallydate(UFDate newTallydate) {
        this.tallydate = newTallydate;
    }

    public String getBrief() {
        return this.brief;
    }

    public void setBrief(String newBrief) {
        this.brief = newBrief;
    }

    public String getPk_currtype() {
        return this.pk_currtype;
    }

    public void setPk_currtype(String newPk_currtype) {
        this.pk_currtype = newPk_currtype;
    }

    public Integer getObjtype() {
        return this.objtype;
    }

    public void setObjtype(Integer newObjtype) {
        this.objtype = newObjtype;
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

    public String getBillclass() {
        return this.billclass;
    }

    public void setBillclass(String newBillclass) {
        this.billclass = newBillclass;
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

    public String getBillno() {
        return this.billno;
    }

    public void setBillno(String newBillno) {
        this.billno = newBillno;
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

    public String getPk_corbill() {
        return this.pk_corbill;
    }

    public void setPk_corbill(String newPk_corbill) {
        this.pk_corbill = newPk_corbill;
    }

    public String getPk_coritem() {
        return this.pk_coritem;
    }

    public void setPk_coritem(String newPk_coritem) {
        this.pk_coritem = newPk_coritem;
    }

    public String getCorbillclass() {
        return this.corbillclass;
    }

    public void setCorbillclass(String corbillclass) {
        this.corbillclass = corbillclass;
    }

    public UFDouble getQuantity_de() {
        return this.quantity_de;
    }

    public void setQuantity_de(UFDouble newQuantity_de) {
        this.quantity_de = newQuantity_de;
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

    public UFDouble getGrouplocal_money_de() {
        return this.grouplocal_money_de;
    }

    public void setGrouplocal_money_de(UFDouble newGrouplocal_money_de) {
        this.grouplocal_money_de = newGrouplocal_money_de;
    }

    public UFDouble getGloballocal_money_de() {
        return this.globallocal_money_de;
    }

    public void setGloballocal_money_de(UFDouble newGloballocal_money_de) {
        this.globallocal_money_de = newGloballocal_money_de;
    }

    public UFDouble getTax_de() {
        return this.tax_de;
    }

    public void setTax_de(UFDouble newTax_de) {
        this.tax_de = newTax_de;
    }

    public UFDouble getLocal_tax_de() {
        return this.local_tax_de;
    }

    public void setLocal_tax_de(UFDouble newLocal_tax_de) {
        this.local_tax_de = newLocal_tax_de;
    }

    public UFDouble getGrouplocal_tax_de() {
        return this.grouplocal_tax_de;
    }

    public void setGrouplocal_tax_de(UFDouble newGrouplocal_tax_de) {
        this.grouplocal_tax_de = newGrouplocal_tax_de;
    }

    public UFDouble getGloballocal_tax_de() {
        return this.globallocal_tax_de;
    }

    public void setGloballocal_tax_de(UFDouble newGloballocal_tax_de) {
        this.globallocal_tax_de = newGloballocal_tax_de;
    }

    public UFDouble getNotax_de() {
        return this.notax_de;
    }

    public void setNotax_de(UFDouble newNotax_de) {
        this.notax_de = newNotax_de;
    }

    public UFDouble getLocal_notax_de() {
        return this.local_notax_de;
    }

    public void setLocal_notax_de(UFDouble newLocal_notax_de) {
        this.local_notax_de = newLocal_notax_de;
    }

    public UFDouble getGrouplocal_notax_de() {
        return this.grouplocal_notax_de;
    }

    public void setGrouplocal_notax_de(UFDouble newGrouplocal_notax_de) {
        this.grouplocal_notax_de = newGrouplocal_notax_de;
    }

    public UFDouble getGloballocal_notax_de() {
        return this.globallocal_notax_de;
    }

    public void setGloballocal_notax_de(UFDouble newGloballocal_notax_de) {
        this.globallocal_notax_de = newGloballocal_notax_de;
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

    public void setPk_subjcode(String newPk_subjcode) {
        this.pk_subjcode = newPk_subjcode;
    }

    public String getSubjcode() {
        return this.subjcode;
    }

    public void setSubjcode(String newSubjcode) {
        this.subjcode = newSubjcode;
    }

    public String getOrdercubasdoc() {
        return this.ordercubasdoc;
    }

    public void setOrdercubasdoc(String newOrdercubasdoc) {
        this.ordercubasdoc = newOrdercubasdoc;
    }

    public UFDouble getQuantity_cr() {
        return this.quantity_cr;
    }

    public void setQuantity_cr(UFDouble newQuantity_cr) {
        this.quantity_cr = newQuantity_cr;
    }

    public UFDouble getMoney_cr() {
        return this.money_cr;
    }

    public void setMoney_cr(UFDouble newMoney_cr) {
        this.money_cr = newMoney_cr;
    }

    public UFDouble getLocal_money_cr() {
        return this.local_money_cr;
    }

    public void setLocal_money_cr(UFDouble newLocal_money_cr) {
        this.local_money_cr = newLocal_money_cr;
    }

    public UFDouble getGrouplocal_money_cr() {
        return this.grouplocal_money_cr;
    }

    public void setGrouplocal_money_cr(UFDouble newGrouplocal_money_cr) {
        this.grouplocal_money_cr = newGrouplocal_money_cr;
    }

    public UFDouble getGloballocal_money_cr() {
        return this.globallocal_money_cr;
    }

    public void setGloballocal_money_cr(UFDouble newGloballocal_money_cr) {
        this.globallocal_money_cr = newGloballocal_money_cr;
    }

    public UFDouble getTax_cr() {
        return this.tax_cr;
    }

    public void setTax_cr(UFDouble newTax_cr) {
        this.tax_cr = newTax_cr;
    }

    public UFDouble getLocal_tax_cr() {
        return this.local_tax_cr;
    }

    public void setLocal_tax_cr(UFDouble newLocal_tax_cr) {
        this.local_tax_cr = newLocal_tax_cr;
    }

    public UFDouble getGrouplocal_tax_cr() {
        return this.grouplocal_tax_cr;
    }

    public void setGrouplocal_tax_cr(UFDouble newGrouplocal_tax_cr) {
        this.grouplocal_tax_cr = newGrouplocal_tax_cr;
    }

    public UFDouble getGloballocal_tax_cr() {
        return this.globallocal_tax_cr;
    }

    public void setGloballocal_tax_cr(UFDouble newGloballocal_tax_cr) {
        this.globallocal_tax_cr = newGloballocal_tax_cr;
    }

    public UFDouble getNotax_cr() {
        return this.notax_cr;
    }

    public void setNotax_cr(UFDouble newNotax_cr) {
        this.notax_cr = newNotax_cr;
    }

    public UFDouble getLocal_notax_cr() {
        return this.local_notax_cr;
    }

    public void setLocal_notax_cr(UFDouble newLocal_notax_cr) {
        this.local_notax_cr = newLocal_notax_cr;
    }

    public UFDouble getGrouplocal_notax_cr() {
        return this.grouplocal_notax_cr;
    }

    public void setGrouplocal_notax_cr(UFDouble newGrouplocal_notax_cr) {
        this.grouplocal_notax_cr = newGrouplocal_notax_cr;
    }

    public UFDouble getGloballocal_notax_cr() {
        return this.globallocal_notax_cr;
    }

    public void setGloballocal_notax_cr(UFDouble newGloballocal_notax_cr) {
        this.globallocal_notax_cr = newGloballocal_notax_cr;
    }

    public String getInvoiceno() {
        return this.invoiceno;
    }

    public void setInvoiceno(String newInvoiceno) {
        this.invoiceno = newInvoiceno;
    }

    public Integer getDealflag() {
        return this.dealflag;
    }

    public void setDealflag(Integer newDealflag) {
        this.dealflag = newDealflag;
    }

    public Integer getBusitype() {
        return this.busitype;
    }

    public void setBusitype(Integer newBusitype) {
        this.busitype = newBusitype;
    }

    public String getPk_dealnum() {
        return this.pk_dealnum;
    }

    public void setPk_dealnum(String newPk_dealnum) {
        this.pk_dealnum = newPk_dealnum;
    }

    public String getPk_busidata() {
        return this.pk_busidata;
    }

    public void setPk_busidata(String pkBusidata) {
        this.pk_busidata = pkBusidata;
    }

    public UFBoolean getPrepay() {
        return this.prepay;
    }

    public void setPrepay(UFBoolean newPrepay) {
        this.prepay = newPrepay;
    }

    public UFDate getBusidate() {
        return this.busidate;
    }

    public void setBusidate(UFDate newBusidate) {
        this.busidate = newBusidate;
    }

    public UFDate getBilldate() {
        return this.billdate;
    }

    public void setBilldate(UFDate newBilldate) {
        this.billdate = newBilldate;
    }

    public UFDateTime getApprovedate() {
        return this.approvedate;
    }

    public void setApprovedate(UFDateTime newApprovedate) {
        this.approvedate = newApprovedate;
    }

    public UFDate getEffectdate() {
        return this.effectdate;
    }

    public void setEffectdate(UFDate newEffectdate) {
        this.effectdate = newEffectdate;
    }

    public Integer getEffectstatus() {
        return this.effectstatus;
    }

    public void setEffectstatus(Integer newEffectstatus) {
        this.effectstatus = newEffectstatus;
    }

    public Integer getBillstatus() {
        return this.billstatus;
    }

    public void setBillstatus(Integer newBillstatus) {
        this.billstatus = newBillstatus;
    }

    public UFDate getVerifyfinishdate() {
        return this.verifyfinishdate;
    }

    public void setVerifyfinishdate(UFDate newVerifyfinishdate) {
        this.verifyfinishdate = newVerifyfinishdate;
    }

    public String getDef1() {
        return this.def1;
    }

    public void setDef1(String newDef1) {
        this.def1 = newDef1;
    }

    public String getDef2() {
        return this.def2;
    }

    public void setDef2(String newDef2) {
        this.def2 = newDef2;
    }

    public String getDef3() {
        return this.def3;
    }

    public void setDef3(String newDef3) {
        this.def3 = newDef3;
    }

    public String getDef4() {
        return this.def4;
    }

    public void setDef4(String newDef4) {
        this.def4 = newDef4;
    }

    public String getDef5() {
        return this.def5;
    }

    public void setDef5(String newDef5) {
        this.def5 = newDef5;
    }

    public String getDef6() {
        return this.def6;
    }

    public void setDef6(String newDef6) {
        this.def6 = newDef6;
    }

    public String getDef7() {
        return this.def7;
    }

    public void setDef7(String newDef7) {
        this.def7 = newDef7;
    }

    public String getDef8() {
        return this.def8;
    }

    public void setDef8(String newDef8) {
        this.def8 = newDef8;
    }

    public String getDef9() {
        return this.def9;
    }

    public void setDef9(String newDef9) {
        this.def9 = newDef9;
    }

    public String getDef10() {
        return this.def10;
    }

    public void setDef10(String newDef10) {
        this.def10 = newDef10;
    }

    public String getDef11() {
        return this.def11;
    }

    public void setDef11(String newDef11) {
        this.def11 = newDef11;
    }

    public String getDef12() {
        return this.def12;
    }

    public void setDef12(String newDef12) {
        this.def12 = newDef12;
    }

    public String getDef13() {
        return this.def13;
    }

    public void setDef13(String newDef13) {
        this.def13 = newDef13;
    }

    public String getDef14() {
        return this.def14;
    }

    public void setDef14(String newDef14) {
        this.def14 = newDef14;
    }

    public String getDef15() {
        return this.def15;
    }

    public void setDef15(String newDef15) {
        this.def15 = newDef15;
    }

    public String getDef16() {
        return this.def16;
    }

    public void setDef16(String newDef16) {
        this.def16 = newDef16;
    }

    public String getDef17() {
        return this.def17;
    }

    public void setDef17(String newDef17) {
        this.def17 = newDef17;
    }

    public String getDef18() {
        return this.def18;
    }

    public void setDef18(String newDef18) {
        this.def18 = newDef18;
    }

    public String getDef19() {
        return this.def19;
    }

    public void setDef19(String newDef19) {
        this.def19 = newDef19;
    }

    public String getDef20() {
        return this.def20;
    }

    public void setDef20(String newDef20) {
        this.def20 = newDef20;
    }

    public String getDef21() {
        return this.def21;
    }

    public void setDef21(String newDef21) {
        this.def21 = newDef21;
    }

    public String getDef22() {
        return this.def22;
    }

    public void setDef22(String newDef22) {
        this.def22 = newDef22;
    }

    public String getDef23() {
        return this.def23;
    }

    public void setDef23(String newDef23) {
        this.def23 = newDef23;
    }

    public String getDef24() {
        return this.def24;
    }

    public void setDef24(String newDef24) {
        this.def24 = newDef24;
    }

    public String getDef25() {
        return this.def25;
    }

    public void setDef25(String newDef25) {
        this.def25 = newDef25;
    }

    public String getDef26() {
        return this.def26;
    }

    public void setDef26(String newDef26) {
        this.def26 = newDef26;
    }

    public String getDef27() {
        return this.def27;
    }

    public void setDef27(String newDef27) {
        this.def27 = newDef27;
    }

    public String getDef28() {
        return this.def28;
    }

    public void setDef28(String newDef28) {
        this.def28 = newDef28;
    }

    public String getDef29() {
        return this.def29;
    }

    public void setDef29(String newDef29) {
        this.def29 = newDef29;
    }

    public String getDef30() {
        return this.def30;
    }

    public void setDef30(String newDef30) {
        this.def30 = newDef30;
    }

    public UFDouble getDeal_quantity() {
        return this.deal_quantity;
    }

    public void setDeal_quantity(UFDouble newDeal_quantity) {
        this.deal_quantity = newDeal_quantity;
    }

    public UFDouble getDeal_money() {
        return this.deal_money;
    }

    public void setDeal_money(UFDouble newDeal_money) {
        this.deal_money = newDeal_money;
    }

    public UFDouble getDeal_local_money() {
        return this.deal_local_money;
    }

    public void setDeal_local_money(UFDouble newDeal_local_money) {
        this.deal_local_money = newDeal_local_money;
    }

    public UFDouble getDeal_grouplocal_money() {
        return this.deal_grouplocal_money;
    }

    public void setDeal_grouplocal_money(UFDouble newDeal_grouplocal_money) {
        this.deal_grouplocal_money = newDeal_grouplocal_money;
    }

    public UFDouble getDeal_globallocal_money() {
        return this.deal_globallocal_money;
    }

    public void setDeal_globallocal_money(UFDouble newDeal_globallocal_money) {
        this.deal_globallocal_money = newDeal_globallocal_money;
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
        return PK_TALLY;
    }

    public String getTableName() {
        return "arap_tally";
    }

    public static String getDefaultTableName() {
        return "arap_tally";
    }

    public IVOMeta getMetaData() {
        return VOMetaFactory.getInstance().getVOMeta("arap.arap_tally");
    }

    public String getTranserial() {
        return this.transerial;
    }

    public void setTranserial(String transerial) {
        this.transerial = transerial;
    }

    public UFBoolean getIsrefund() {
        return this.isrefund;
    }

    public void setIsrefund(UFBoolean isrefund) {
        this.isrefund = isrefund;
    }
}

