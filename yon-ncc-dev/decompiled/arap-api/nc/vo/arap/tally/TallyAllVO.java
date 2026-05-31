/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory
 */
package nc.vo.arap.tally;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class TallyAllVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    private String pk_tally;
    private String pk_tally_all;
    private String pk_bill;
    private String pk_item;
    private String pk_pcorg;
    private String costcenter;
    private String sett_org;
    private String pk_busitype;
    private String h_subjcode;
    private String recaccount;
    private String payaccount;
    private String cashaccount;
    private String project;
    private String project_task;
    private String productline;
    private String cashitem;
    private String pk_dealnum;
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
    private String so_org;
    private String so_deptid;
    private String so_psndoc;
    private String so_ordertype;
    private String so_transtype;
    private String pk_recterm;
    private String outstoreno;
    private String pu_org;
    private String pu_deptid;
    private String pu_psndoc;
    private String pk_payterm;
    private String instoreno;
    private String equipmentcode;
    private String facard;
    private String innerorderno;
    private String checkelement;
    private String bankrollprojet;
    private String checktype;
    private String src_billtype;
    private String src_tradetype;
    private String freecust;
    private String contractno;
    private String purchaseorder;
    private String matcustcode;
    private Integer dr = 0;
    private UFDateTime ts;
    private String h_def31;
    private String h_def32;
    private String h_def33;
    private String h_def34;
    private String h_def35;
    private String h_def36;
    private String h_def37;
    private String h_def38;
    private String h_def39;
    private String h_def40;
    private String h_def41;
    private String h_def42;
    private String h_def43;
    private String h_def44;
    private String h_def45;
    private String h_def46;
    private String h_def47;
    private String h_def48;
    private String h_def49;
    private String h_def50;
    private String h_def51;
    private String h_def52;
    private String h_def53;
    private String h_def54;
    private String h_def55;
    private String h_def56;
    private String h_def57;
    private String h_def58;
    private String h_def59;
    private String h_def60;
    private String h_def61;
    private String h_def62;
    private String h_def63;
    private String h_def64;
    private String h_def65;
    private String h_def66;
    private String h_def67;
    private String h_def68;
    private String h_def69;
    private String h_def70;
    private String h_def71;
    private String h_def72;
    private String h_def73;
    private String h_def74;
    private String h_def75;
    private String h_def76;
    private String h_def77;
    private String h_def78;
    private String h_def79;
    private String h_def80;
    public static final String PK_TALLY = "pk_tally";
    public static final String PK_TALLY_ALL = "pk_tally_all";
    public static final String PK_BILL = "pk_bill";
    public static final String PK_ITEM = "pk_item";
    public static final String PK_PCORG = "pk_pcorg";
    public static final String COSTCENTER = "costcenter";
    public static final String SETT_ORG = "sett_org";
    public static final String PK_BUSITYPE = "pk_busitype";
    public static final String H_SUBJCODE = "h_subjcode";
    public static final String RECACCOUNT = "recaccount";
    public static final String PAYACCOUNT = "payaccount";
    public static final String CASHACCOUNT = "cashaccount";
    public static final String PROJECT = "project";
    public static final String PROJECT_TASK = "project_task";
    public static final String PRODUCTLINE = "productline";
    public static final String CASHITEM = "cashitem";
    public static final String PK_DEALNUM = "pk_dealnum";
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
    public static final String SO_ORG = "so_org";
    public static final String SO_DEPTID = "so_deptid";
    public static final String SO_PSNDOC = "so_psndoc";
    public static final String SO_ORDERTYPE = "so_ordertype";
    public static final String SO_TRANSTYPE = "so_transtype";
    public static final String PK_RECTERM = "pk_recterm";
    public static final String OUTSTORENO = "outstoreno";
    public static final String PU_ORG = "pu_org";
    public static final String PU_DEPTID = "pu_deptid";
    public static final String PU_PSNDOC = "pu_psndoc";
    public static final String PK_PAYTERM = "pk_payterm";
    public static final String INSTORENO = "instoreno";
    public static final String EQUIPMENTCODE = "equipmentcode";
    public static final String FACARD = "facard";
    public static final String INNERORDERNO = "innerorderno";
    public static final String CHECKELEMENT = "checkelement";
    public static final String BANKROLLPROJET = "bankrollprojet";
    public static final String CHECKTYPE = "checktype";
    public static final String SRC_BILLTYPE = "src_billtype";
    public static final String SRC_TRADETYPE = "src_tradetype";
    public static final String FREECUST = "freecust";
    public static final String CONTRACTNO = "contractno";
    public static final String PURCHASEORDER = "purchaseorder";
    public static final String MATCUSTCODE = "matcustcode";
    public static final String H_DEF31 = "h_def31";
    public static final String H_DEF32 = "h_def32";
    public static final String H_DEF33 = "h_def33";
    public static final String H_DEF34 = "h_def34";
    public static final String H_DEF35 = "h_def35";
    public static final String H_DEF36 = "h_def36";
    public static final String H_DEF37 = "h_def37";
    public static final String H_DEF38 = "h_def38";
    public static final String H_DEF39 = "h_def39";
    public static final String H_DEF40 = "h_def40";
    public static final String H_DEF41 = "h_def41";
    public static final String H_DEF42 = "h_def42";
    public static final String H_DEF43 = "h_def43";
    public static final String H_DEF44 = "h_def44";
    public static final String H_DEF45 = "h_def45";
    public static final String H_DEF46 = "h_def46";
    public static final String H_DEF47 = "h_def47";
    public static final String H_DEF48 = "h_def48";
    public static final String H_DEF49 = "h_def49";
    public static final String H_DEF50 = "h_def50";
    public static final String H_DEF51 = "h_def51";
    public static final String H_DEF52 = "h_def52";
    public static final String H_DEF53 = "h_def53";
    public static final String H_DEF54 = "h_def54";
    public static final String H_DEF55 = "h_def55";
    public static final String H_DEF56 = "h_def56";
    public static final String H_DEF57 = "h_def57";
    public static final String H_DEF58 = "h_def58";
    public static final String H_DEF59 = "h_def59";
    public static final String H_DEF60 = "h_def60";
    public static final String H_DEF61 = "h_def61";
    public static final String H_DEF62 = "h_def62";
    public static final String H_DEF63 = "h_def63";
    public static final String H_DEF64 = "h_def64";
    public static final String H_DEF65 = "h_def65";
    public static final String H_DEF66 = "h_def66";
    public static final String H_DEF67 = "h_def67";
    public static final String H_DEF68 = "h_def68";
    public static final String H_DEF69 = "h_def69";
    public static final String H_DEF70 = "h_def70";
    public static final String H_DEF71 = "h_def71";
    public static final String H_DEF72 = "h_def72";
    public static final String H_DEF73 = "h_def73";
    public static final String H_DEF74 = "h_def74";
    public static final String H_DEF75 = "h_def75";
    public static final String H_DEF76 = "h_def76";
    public static final String H_DEF77 = "h_def77";
    public static final String H_DEF78 = "h_def78";
    public static final String H_DEF79 = "h_def79";
    public static final String H_DEF80 = "h_def80";

    public String getH_def31() {
        return this.h_def31;
    }

    public void setH_def31(String h_def31) {
        this.h_def31 = h_def31;
    }

    public String getH_def32() {
        return this.h_def32;
    }

    public void setH_def32(String h_def32) {
        this.h_def32 = h_def32;
    }

    public String getH_def33() {
        return this.h_def33;
    }

    public void setH_def33(String h_def33) {
        this.h_def33 = h_def33;
    }

    public String getH_def34() {
        return this.h_def34;
    }

    public void setH_def34(String h_def34) {
        this.h_def34 = h_def34;
    }

    public String getH_def35() {
        return this.h_def35;
    }

    public void setH_def35(String h_def35) {
        this.h_def35 = h_def35;
    }

    public String getH_def36() {
        return this.h_def36;
    }

    public void setH_def36(String h_def36) {
        this.h_def36 = h_def36;
    }

    public String getH_def37() {
        return this.h_def37;
    }

    public void setH_def37(String h_def37) {
        this.h_def37 = h_def37;
    }

    public String getH_def38() {
        return this.h_def38;
    }

    public void setH_def38(String h_def38) {
        this.h_def38 = h_def38;
    }

    public String getH_def39() {
        return this.h_def39;
    }

    public void setH_def39(String h_def39) {
        this.h_def39 = h_def39;
    }

    public String getH_def40() {
        return this.h_def40;
    }

    public void setH_def40(String h_def40) {
        this.h_def40 = h_def40;
    }

    public String getH_def41() {
        return this.h_def41;
    }

    public void setH_def41(String h_def41) {
        this.h_def41 = h_def41;
    }

    public String getH_def42() {
        return this.h_def42;
    }

    public void setH_def42(String h_def42) {
        this.h_def42 = h_def42;
    }

    public String getH_def43() {
        return this.h_def43;
    }

    public void setH_def43(String h_def43) {
        this.h_def43 = h_def43;
    }

    public String getH_def44() {
        return this.h_def44;
    }

    public void setH_def44(String h_def44) {
        this.h_def44 = h_def44;
    }

    public String getH_def45() {
        return this.h_def45;
    }

    public void setH_def45(String h_def45) {
        this.h_def45 = h_def45;
    }

    public String getH_def46() {
        return this.h_def46;
    }

    public void setH_def46(String h_def46) {
        this.h_def46 = h_def46;
    }

    public String getH_def47() {
        return this.h_def47;
    }

    public void setH_def47(String h_def47) {
        this.h_def47 = h_def47;
    }

    public String getH_def48() {
        return this.h_def48;
    }

    public void setH_def48(String h_def48) {
        this.h_def48 = h_def48;
    }

    public String getH_def49() {
        return this.h_def49;
    }

    public void setH_def49(String h_def49) {
        this.h_def49 = h_def49;
    }

    public String getH_def50() {
        return this.h_def50;
    }

    public void setH_def50(String h_def50) {
        this.h_def50 = h_def50;
    }

    public String getH_def51() {
        return this.h_def51;
    }

    public void setH_def51(String h_def51) {
        this.h_def51 = h_def51;
    }

    public String getH_def52() {
        return this.h_def52;
    }

    public void setH_def52(String h_def52) {
        this.h_def52 = h_def52;
    }

    public String getH_def53() {
        return this.h_def53;
    }

    public void setH_def53(String h_def53) {
        this.h_def53 = h_def53;
    }

    public String getH_def54() {
        return this.h_def54;
    }

    public void setH_def54(String h_def54) {
        this.h_def54 = h_def54;
    }

    public String getH_def55() {
        return this.h_def55;
    }

    public void setH_def55(String h_def55) {
        this.h_def55 = h_def55;
    }

    public String getH_def56() {
        return this.h_def56;
    }

    public void setH_def56(String h_def56) {
        this.h_def56 = h_def56;
    }

    public String getH_def57() {
        return this.h_def57;
    }

    public void setH_def57(String h_def57) {
        this.h_def57 = h_def57;
    }

    public String getH_def58() {
        return this.h_def58;
    }

    public void setH_def58(String h_def58) {
        this.h_def58 = h_def58;
    }

    public String getH_def59() {
        return this.h_def59;
    }

    public void setH_def59(String h_def59) {
        this.h_def59 = h_def59;
    }

    public String getH_def60() {
        return this.h_def60;
    }

    public void setH_def60(String h_def60) {
        this.h_def60 = h_def60;
    }

    public String getH_def61() {
        return this.h_def61;
    }

    public void setH_def61(String h_def61) {
        this.h_def61 = h_def61;
    }

    public String getH_def62() {
        return this.h_def62;
    }

    public void setH_def62(String h_def62) {
        this.h_def62 = h_def62;
    }

    public String getH_def63() {
        return this.h_def63;
    }

    public void setH_def63(String h_def63) {
        this.h_def63 = h_def63;
    }

    public String getH_def64() {
        return this.h_def64;
    }

    public void setH_def64(String h_def64) {
        this.h_def64 = h_def64;
    }

    public String getH_def65() {
        return this.h_def65;
    }

    public void setH_def65(String h_def65) {
        this.h_def65 = h_def65;
    }

    public String getH_def66() {
        return this.h_def66;
    }

    public void setH_def66(String h_def66) {
        this.h_def66 = h_def66;
    }

    public String getH_def67() {
        return this.h_def67;
    }

    public void setH_def67(String h_def67) {
        this.h_def67 = h_def67;
    }

    public String getH_def68() {
        return this.h_def68;
    }

    public void setH_def68(String h_def68) {
        this.h_def68 = h_def68;
    }

    public String getH_def69() {
        return this.h_def69;
    }

    public void setH_def69(String h_def69) {
        this.h_def69 = h_def69;
    }

    public String getH_def70() {
        return this.h_def70;
    }

    public void setH_def70(String h_def70) {
        this.h_def70 = h_def70;
    }

    public String getH_def71() {
        return this.h_def71;
    }

    public void setH_def71(String h_def71) {
        this.h_def71 = h_def71;
    }

    public String getH_def72() {
        return this.h_def72;
    }

    public void setH_def72(String h_def72) {
        this.h_def72 = h_def72;
    }

    public String getH_def73() {
        return this.h_def73;
    }

    public void setH_def73(String h_def73) {
        this.h_def73 = h_def73;
    }

    public String getH_def74() {
        return this.h_def74;
    }

    public void setH_def74(String h_def74) {
        this.h_def74 = h_def74;
    }

    public String getH_def75() {
        return this.h_def75;
    }

    public void setH_def75(String h_def75) {
        this.h_def75 = h_def75;
    }

    public String getH_def76() {
        return this.h_def76;
    }

    public void setH_def76(String h_def76) {
        this.h_def76 = h_def76;
    }

    public String getH_def77() {
        return this.h_def77;
    }

    public void setH_def77(String h_def77) {
        this.h_def77 = h_def77;
    }

    public String getH_def78() {
        return this.h_def78;
    }

    public void setH_def78(String h_def78) {
        this.h_def78 = h_def78;
    }

    public String getH_def79() {
        return this.h_def79;
    }

    public void setH_def79(String h_def79) {
        this.h_def79 = h_def79;
    }

    public String getH_def80() {
        return this.h_def80;
    }

    public void setH_def80(String h_def80) {
        this.h_def80 = h_def80;
    }

    public String getPk_tally() {
        return this.pk_tally;
    }

    public void setPk_tally(String newPk_tally) {
        this.pk_tally = newPk_tally;
    }

    public String getPk_tally_all() {
        return this.pk_tally_all;
    }

    public void setPk_tally_all(String newPk_tally_all) {
        this.pk_tally_all = newPk_tally_all;
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

    public String getPk_pcorg() {
        return this.pk_pcorg;
    }

    public String getCostcenter() {
        return this.costcenter;
    }

    public void setCostcenter(String costcenter) {
        this.costcenter = costcenter;
    }

    public void setPk_pcorg(String newPk_pcorg) {
        this.pk_pcorg = newPk_pcorg;
    }

    public String getSett_org() {
        return this.sett_org;
    }

    public void setSett_org(String newSett_org) {
        this.sett_org = newSett_org;
    }

    public String getPk_busitype() {
        return this.pk_busitype;
    }

    public void setPk_busitype(String newPk_busitype) {
        this.pk_busitype = newPk_busitype;
    }

    public String getH_subjcode() {
        return this.h_subjcode;
    }

    public void setH_subjcode(String newH_subjcode) {
        this.h_subjcode = newH_subjcode;
    }

    public String getRecaccount() {
        return this.recaccount;
    }

    public void setRecaccount(String newRecaccount) {
        this.recaccount = newRecaccount;
    }

    public String getPayaccount() {
        return this.payaccount;
    }

    public void setPayaccount(String newPayaccount) {
        this.payaccount = newPayaccount;
    }

    public String getCashaccount() {
        return this.cashaccount;
    }

    public void setCashaccount(String cashaccount) {
        this.cashaccount = cashaccount;
    }

    public String getProject() {
        return this.project;
    }

    public void setProject(String newProject) {
        this.project = newProject;
    }

    public String getProject_task() {
        return this.project_task;
    }

    public void setProject_task(String newProject_task) {
        this.project_task = newProject_task;
    }

    public String getProductline() {
        return this.productline;
    }

    public void setProductline(String newProductline) {
        this.productline = newProductline;
    }

    public String getCashitem() {
        return this.cashitem;
    }

    public void setCashitem(String newCashitem) {
        this.cashitem = newCashitem;
    }

    public String getPk_dealnum() {
        return this.pk_dealnum;
    }

    public void setPk_dealnum(String newPk_dealnum) {
        this.pk_dealnum = newPk_dealnum;
    }

    public String getH_def30() {
        return this.h_def30;
    }

    public void setH_def30(String newH_def30) {
        this.h_def30 = newH_def30;
    }

    public String getH_def29() {
        return this.h_def29;
    }

    public void setH_def29(String newH_def29) {
        this.h_def29 = newH_def29;
    }

    public String getH_def28() {
        return this.h_def28;
    }

    public void setH_def28(String newH_def28) {
        this.h_def28 = newH_def28;
    }

    public String getH_def27() {
        return this.h_def27;
    }

    public void setH_def27(String newH_def27) {
        this.h_def27 = newH_def27;
    }

    public String getH_def26() {
        return this.h_def26;
    }

    public void setH_def26(String newH_def26) {
        this.h_def26 = newH_def26;
    }

    public String getH_def25() {
        return this.h_def25;
    }

    public void setH_def25(String newH_def25) {
        this.h_def25 = newH_def25;
    }

    public String getH_def24() {
        return this.h_def24;
    }

    public void setH_def24(String newH_def24) {
        this.h_def24 = newH_def24;
    }

    public String getH_def23() {
        return this.h_def23;
    }

    public void setH_def23(String newH_def23) {
        this.h_def23 = newH_def23;
    }

    public String getH_def22() {
        return this.h_def22;
    }

    public void setH_def22(String newH_def22) {
        this.h_def22 = newH_def22;
    }

    public String getH_def21() {
        return this.h_def21;
    }

    public void setH_def21(String newH_def21) {
        this.h_def21 = newH_def21;
    }

    public String getH_def20() {
        return this.h_def20;
    }

    public void setH_def20(String newH_def20) {
        this.h_def20 = newH_def20;
    }

    public String getH_def19() {
        return this.h_def19;
    }

    public void setH_def19(String newH_def19) {
        this.h_def19 = newH_def19;
    }

    public String getH_def18() {
        return this.h_def18;
    }

    public void setH_def18(String newH_def18) {
        this.h_def18 = newH_def18;
    }

    public String getH_def17() {
        return this.h_def17;
    }

    public void setH_def17(String newH_def17) {
        this.h_def17 = newH_def17;
    }

    public String getH_def16() {
        return this.h_def16;
    }

    public void setH_def16(String newH_def16) {
        this.h_def16 = newH_def16;
    }

    public String getH_def15() {
        return this.h_def15;
    }

    public void setH_def15(String newH_def15) {
        this.h_def15 = newH_def15;
    }

    public String getH_def14() {
        return this.h_def14;
    }

    public void setH_def14(String newH_def14) {
        this.h_def14 = newH_def14;
    }

    public String getH_def13() {
        return this.h_def13;
    }

    public void setH_def13(String newH_def13) {
        this.h_def13 = newH_def13;
    }

    public String getH_def12() {
        return this.h_def12;
    }

    public void setH_def12(String newH_def12) {
        this.h_def12 = newH_def12;
    }

    public String getH_def11() {
        return this.h_def11;
    }

    public void setH_def11(String newH_def11) {
        this.h_def11 = newH_def11;
    }

    public String getH_def10() {
        return this.h_def10;
    }

    public void setH_def10(String newH_def10) {
        this.h_def10 = newH_def10;
    }

    public String getH_def9() {
        return this.h_def9;
    }

    public void setH_def9(String newH_def9) {
        this.h_def9 = newH_def9;
    }

    public String getH_def8() {
        return this.h_def8;
    }

    public void setH_def8(String newH_def8) {
        this.h_def8 = newH_def8;
    }

    public String getH_def7() {
        return this.h_def7;
    }

    public void setH_def7(String newH_def7) {
        this.h_def7 = newH_def7;
    }

    public String getH_def6() {
        return this.h_def6;
    }

    public void setH_def6(String newH_def6) {
        this.h_def6 = newH_def6;
    }

    public String getH_def5() {
        return this.h_def5;
    }

    public void setH_def5(String newH_def5) {
        this.h_def5 = newH_def5;
    }

    public String getH_def4() {
        return this.h_def4;
    }

    public void setH_def4(String newH_def4) {
        this.h_def4 = newH_def4;
    }

    public String getH_def3() {
        return this.h_def3;
    }

    public void setH_def3(String newH_def3) {
        this.h_def3 = newH_def3;
    }

    public String getH_def2() {
        return this.h_def2;
    }

    public void setH_def2(String newH_def2) {
        this.h_def2 = newH_def2;
    }

    public String getH_def1() {
        return this.h_def1;
    }

    public void setH_def1(String newH_def1) {
        this.h_def1 = newH_def1;
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

    public String getPk_recterm() {
        return this.pk_recterm;
    }

    public void setPk_recterm(String newPk_recterm) {
        this.pk_recterm = newPk_recterm;
    }

    public String getOutstoreno() {
        return this.outstoreno;
    }

    public void setOutstoreno(String newOutstoreno) {
        this.outstoreno = newOutstoreno;
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

    public String getPk_payterm() {
        return this.pk_payterm;
    }

    public void setPk_payterm(String newPk_payterm) {
        this.pk_payterm = newPk_payterm;
    }

    public String getInstoreno() {
        return this.instoreno;
    }

    public void setInstoreno(String newInstoreno) {
        this.instoreno = newInstoreno;
    }

    public String getEquipmentcode() {
        return this.equipmentcode;
    }

    public void setEquipmentcode(String newEquipmentcode) {
        this.equipmentcode = newEquipmentcode;
    }

    public String getFacard() {
        return this.facard;
    }

    public void setFacard(String newFacard) {
        this.facard = newFacard;
    }

    public String getInnerorderno() {
        return this.innerorderno;
    }

    public void setInnerorderno(String newInnerorderno) {
        this.innerorderno = newInnerorderno;
    }

    public String getCheckelement() {
        return this.checkelement;
    }

    public void setCheckelement(String newCheckelement) {
        this.checkelement = newCheckelement;
    }

    public String getBankrollprojet() {
        return this.bankrollprojet;
    }

    public void setBankrollprojet(String newBankrollprojet) {
        this.bankrollprojet = newBankrollprojet;
    }

    public String getChecktype() {
        return this.checktype;
    }

    public void setChecktype(String newChecktype) {
        this.checktype = newChecktype;
    }

    public String getSrc_billtype() {
        return this.src_billtype;
    }

    public void setSrc_billtype(String newSrc_billtype) {
        this.src_billtype = newSrc_billtype;
    }

    public String getSrc_tradetype() {
        return this.src_tradetype;
    }

    public void setSrc_tradetype(String newSrc_tradetype) {
        this.src_tradetype = newSrc_tradetype;
    }

    public String getFreecust() {
        return this.freecust;
    }

    public void setFreecust(String newFreecust) {
        this.freecust = newFreecust;
    }

    public String getContractno() {
        return this.contractno;
    }

    public void setContractno(String newContractno) {
        this.contractno = newContractno;
    }

    public String getPurchaseorder() {
        return this.purchaseorder;
    }

    public void setPurchaseorder(String newPurchaseorder) {
        this.purchaseorder = newPurchaseorder;
    }

    public String getMatcustcode() {
        return this.matcustcode;
    }

    public void setMatcustcode(String matcustcode) {
        this.matcustcode = matcustcode;
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
        return PK_TALLY;
    }

    public String getPKFieldName() {
        return PK_TALLY_ALL;
    }

    public String getTableName() {
        return "arap_tally_all";
    }

    public static String getDefaultTableName() {
        return "arap_tally_all";
    }

    public IVOMeta getMetaData() {
        return VOMetaFactory.getInstance().getVOMeta("arap.arap_tally_all");
    }
}

