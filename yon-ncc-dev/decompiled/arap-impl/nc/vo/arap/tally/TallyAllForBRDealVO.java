/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.vo.arap.tally;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;

public class TallyAllForBRDealVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    private HashMap<String, String[]> map = new HashMap();
    private HashMap<String, String[]> submap = new HashMap();
    private String[] billtypepks;
    private Integer anaDate;
    public static final String PK_TALLY_ALL = "pk_tally_all";
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
    public static final String MATERIAL = "material";
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
    public static final String BRIEF = "brief";
    public static final String OBJTYPE = "objtype";
    public static final String CUSTOMER = "customer";
    public static final String SUPPLIER = "supplier";
    public static final String PK_DEPTID = "pk_deptid";
    public static final String PK_PSNDOC = "pk_psndoc";
    public static final String BILLCLASS = "billclass";
    public static final String PK_BILLTYPE = "pk_billtype";
    public static final String PK_TRADETYPE = "pk_tradetype";
    public static final String PK_TRADETYPEID = "pk_tradetypeid";
    public static final String PK_SUBJCODE = "pk_subjcode";
    public static final String SUBJCODE = "subjcode";
    public static final String ORDERCUBASDOC = "ordercubasdoc";
    public static final String PREPAY = "prepay";
    public static final String EFFECTSTATUS = "effectstatus";
    public static final String BILLSTATUS = "billstatus";
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
    public static final String PK_RECPAYTYPE = "pk_recpaytype";
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
    public static final List<String> tallyfieldList = new ArrayList<String>();
    public static final List<String> allfieldList = new ArrayList<String>();
    public static final List<String> deffieldList = new ArrayList<String>();
    private String[] pk_pcorg;
    private String[] costcenter;
    private String[] sett_org;
    private String[] pk_busitype;
    private String[] h_subjcode;
    private String[] recaccount;
    private String[] payaccount;
    private String[] cashaccount;
    private String[] project;
    private String[] project_task;
    private String[] productline;
    private String[] cashitem;
    private String[] h_def30;
    private String[] h_def29;
    private String[] h_def28;
    private String[] h_def27;
    private String[] h_def26;
    private String[] h_def25;
    private String[] h_def24;
    private String[] h_def23;
    private String[] h_def22;
    private String[] h_def21;
    private String[] h_def20;
    private String[] h_def19;
    private String[] h_def18;
    private String[] h_def17;
    private String[] h_def16;
    private String[] h_def15;
    private String[] h_def14;
    private String[] h_def13;
    private String[] h_def12;
    private String[] h_def11;
    private String[] h_def10;
    private String[] h_def9;
    private String[] h_def8;
    private String[] h_def7;
    private String[] h_def6;
    private String[] h_def5;
    private String[] h_def4;
    private String[] h_def3;
    private String[] h_def2;
    private String[] h_def1;
    private String[] so_org;
    private String[] so_deptid;
    private String[] so_psndoc;
    private String[] so_ordertype;
    private String[] so_transtype;
    private String[] pk_recterm;
    private String[] outstoreno;
    private String[] pu_org;
    private String[] pu_deptid;
    private String[] pu_psndoc;
    private String[] pk_payterm;
    private String[] instoreno;
    private String[] equipmentcode;
    private String[] facard;
    private String[] innerorderno;
    private String[] checkelement;
    private String[] bankrollprojet;
    private String[] checktype;
    private String[] src_billtype;
    private String[] src_tradetype;
    private String[] freecust;
    private String[] contractno;
    private String[] purchaseorder;
    private String[] matcustcode;
    private String[] h_def31;
    private String[] h_def32;
    private String[] h_def33;
    private String[] h_def34;
    private String[] h_def35;
    private String[] h_def36;
    private String[] h_def37;
    private String[] h_def38;
    private String[] h_def39;
    private String[] h_def40;
    private String[] h_def41;
    private String[] h_def42;
    private String[] h_def43;
    private String[] h_def44;
    private String[] h_def45;
    private String[] h_def46;
    private String[] h_def47;
    private String[] h_def48;
    private String[] h_def49;
    private String[] h_def50;
    private String[] h_def51;
    private String[] h_def52;
    private String[] h_def53;
    private String[] h_def54;
    private String[] h_def55;
    private String[] h_def56;
    private String[] h_def57;
    private String[] h_def58;
    private String[] h_def59;
    private String[] h_def60;
    private String[] h_def61;
    private String[] h_def62;
    private String[] h_def63;
    private String[] h_def64;
    private String[] h_def65;
    private String[] h_def66;
    private String[] h_def67;
    private String[] h_def68;
    private String[] h_def69;
    private String[] h_def70;
    private String[] h_def71;
    private String[] h_def72;
    private String[] h_def73;
    private String[] h_def74;
    private String[] h_def75;
    private String[] h_def76;
    private String[] h_def77;
    private String[] h_def78;
    private String[] h_def79;
    private String[] h_def80;
    private String[] pk_currtype;
    private String[] pk_orgs;
    private String[] brief;
    private Integer objtype;
    private String[] customer;
    private String[] supplier;
    private String[] pk_deptid;
    private String[] pk_psndoc;
    private String[] billclass;
    private String[] pk_billtype;
    private String[] pk_tradetype;
    private String[] pk_tradetypeid;
    private String[] material;
    private String[] pk_subjcode;
    private String[] subjcode;
    private String[] ordercubasdoc;
    private UFBoolean prepay;
    private Integer effectstatus;
    private Integer billstatus;
    private String[] def1;
    private String[] def2;
    private String[] def3;
    private String[] def4;
    private String[] def5;
    private String[] def6;
    private String[] def7;
    private String[] def8;
    private String[] def9;
    private String[] def10;
    private String[] def11;
    private String[] def12;
    private String[] def13;
    private String[] def14;
    private String[] def15;
    private String[] def16;
    private String[] def17;
    private String[] def18;
    private String[] def19;
    private String[] def20;
    private String[] def21;
    private String[] def22;
    private String[] def23;
    private String[] def24;
    private String[] def25;
    private String[] def26;
    private String[] def27;
    private String[] def28;
    private String[] def29;
    private String[] def30;
    private String[] pk_recpaytype;
    private String[] def31;
    private String[] def32;
    private String[] def33;
    private String[] def34;
    private String[] def35;
    private String[] def36;
    private String[] def37;
    private String[] def38;
    private String[] def39;
    private String[] def40;
    private String[] def41;
    private String[] def42;
    private String[] def43;
    private String[] def44;
    private String[] def45;
    private String[] def46;
    private String[] def47;
    private String[] def48;
    private String[] def49;
    private String[] def50;
    private String[] def51;
    private String[] def52;
    private String[] def53;
    private String[] def54;
    private String[] def55;
    private String[] def56;
    private String[] def57;
    private String[] def58;
    private String[] def59;
    private String[] def60;
    private String[] def61;
    private String[] def62;
    private String[] def63;
    private String[] def64;
    private String[] def65;
    private String[] def66;
    private String[] def67;
    private String[] def68;
    private String[] def69;
    private String[] def70;
    private String[] def71;
    private String[] def72;
    private String[] def73;
    private String[] def74;
    private String[] def75;
    private String[] def76;
    private String[] def77;
    private String[] def78;
    private String[] def79;
    private String[] def80;

    public HashMap<String, String[]> getMap() {
        return this.map;
    }

    public void setMap(HashMap<String, String[]> map) {
        this.map = map;
    }

    public Map<String, String[]> getSubmap() {
        return this.submap;
    }

    public void setSubmap(HashMap<String, String[]> submap) {
        this.submap = submap;
    }

    public String[] getH_def31() {
        return this.h_def31;
    }

    public void setH_def31(String[] h_def31) {
        this.h_def31 = h_def31;
    }

    public String[] getH_def32() {
        return this.h_def32;
    }

    public void setH_def32(String[] h_def32) {
        this.h_def32 = h_def32;
    }

    public String[] getH_def33() {
        return this.h_def33;
    }

    public void setH_def33(String[] h_def33) {
        this.h_def33 = h_def33;
    }

    public String[] getH_def34() {
        return this.h_def34;
    }

    public void setH_def34(String[] h_def34) {
        this.h_def34 = h_def34;
    }

    public String[] getH_def35() {
        return this.h_def35;
    }

    public void setH_def35(String[] h_def35) {
        this.h_def35 = h_def35;
    }

    public String[] getH_def36() {
        return this.h_def36;
    }

    public void setH_def36(String[] h_def36) {
        this.h_def36 = h_def36;
    }

    public String[] getH_def37() {
        return this.h_def37;
    }

    public void setH_def37(String[] h_def37) {
        this.h_def37 = h_def37;
    }

    public String[] getH_def38() {
        return this.h_def38;
    }

    public void setH_def38(String[] h_def38) {
        this.h_def38 = h_def38;
    }

    public String[] getH_def39() {
        return this.h_def39;
    }

    public void setH_def39(String[] h_def39) {
        this.h_def39 = h_def39;
    }

    public String[] getH_def40() {
        return this.h_def40;
    }

    public void setH_def40(String[] h_def40) {
        this.h_def40 = h_def40;
    }

    public String[] getH_def41() {
        return this.h_def41;
    }

    public void setH_def41(String[] h_def41) {
        this.h_def41 = h_def41;
    }

    public String[] getH_def42() {
        return this.h_def42;
    }

    public void setH_def42(String[] h_def42) {
        this.h_def42 = h_def42;
    }

    public String[] getH_def43() {
        return this.h_def43;
    }

    public void setH_def43(String[] h_def43) {
        this.h_def43 = h_def43;
    }

    public String[] getH_def44() {
        return this.h_def44;
    }

    public void setH_def44(String[] h_def44) {
        this.h_def44 = h_def44;
    }

    public String[] getH_def45() {
        return this.h_def45;
    }

    public void setH_def45(String[] h_def45) {
        this.h_def45 = h_def45;
    }

    public String[] getH_def46() {
        return this.h_def46;
    }

    public void setH_def46(String[] h_def46) {
        this.h_def46 = h_def46;
    }

    public String[] getH_def47() {
        return this.h_def47;
    }

    public void setH_def47(String[] h_def47) {
        this.h_def47 = h_def47;
    }

    public String[] getH_def48() {
        return this.h_def48;
    }

    public void setH_def48(String[] h_def48) {
        this.h_def48 = h_def48;
    }

    public String[] getH_def49() {
        return this.h_def49;
    }

    public void setH_def49(String[] h_def49) {
        this.h_def49 = h_def49;
    }

    public String[] getH_def50() {
        return this.h_def50;
    }

    public void setH_def50(String[] h_def50) {
        this.h_def50 = h_def50;
    }

    public String[] getH_def51() {
        return this.h_def51;
    }

    public void setH_def51(String[] h_def51) {
        this.h_def51 = h_def51;
    }

    public String[] getH_def52() {
        return this.h_def52;
    }

    public void setH_def52(String[] h_def52) {
        this.h_def52 = h_def52;
    }

    public String[] getH_def53() {
        return this.h_def53;
    }

    public void setH_def53(String[] h_def53) {
        this.h_def53 = h_def53;
    }

    public String[] getH_def54() {
        return this.h_def54;
    }

    public void setH_def54(String[] h_def54) {
        this.h_def54 = h_def54;
    }

    public String[] getH_def55() {
        return this.h_def55;
    }

    public void setH_def55(String[] h_def55) {
        this.h_def55 = h_def55;
    }

    public String[] getH_def56() {
        return this.h_def56;
    }

    public void setH_def56(String[] h_def56) {
        this.h_def56 = h_def56;
    }

    public String[] getH_def57() {
        return this.h_def57;
    }

    public void setH_def57(String[] h_def57) {
        this.h_def57 = h_def57;
    }

    public String[] getH_def58() {
        return this.h_def58;
    }

    public void setH_def58(String[] h_def58) {
        this.h_def58 = h_def58;
    }

    public String[] getH_def59() {
        return this.h_def59;
    }

    public void setH_def59(String[] h_def59) {
        this.h_def59 = h_def59;
    }

    public String[] getH_def60() {
        return this.h_def60;
    }

    public void setH_def60(String[] h_def60) {
        this.h_def60 = h_def60;
    }

    public String[] getH_def61() {
        return this.h_def61;
    }

    public void setH_def61(String[] h_def61) {
        this.h_def61 = h_def61;
    }

    public String[] getH_def62() {
        return this.h_def62;
    }

    public void setH_def62(String[] h_def62) {
        this.h_def62 = h_def62;
    }

    public String[] getH_def63() {
        return this.h_def63;
    }

    public void setH_def63(String[] h_def63) {
        this.h_def63 = h_def63;
    }

    public String[] getH_def64() {
        return this.h_def64;
    }

    public void setH_def64(String[] h_def64) {
        this.h_def64 = h_def64;
    }

    public String[] getH_def65() {
        return this.h_def65;
    }

    public void setH_def65(String[] h_def65) {
        this.h_def65 = h_def65;
    }

    public String[] getH_def66() {
        return this.h_def66;
    }

    public void setH_def66(String[] h_def66) {
        this.h_def66 = h_def66;
    }

    public String[] getH_def67() {
        return this.h_def67;
    }

    public void setH_def67(String[] h_def67) {
        this.h_def67 = h_def67;
    }

    public String[] getH_def68() {
        return this.h_def68;
    }

    public void setH_def68(String[] h_def68) {
        this.h_def68 = h_def68;
    }

    public String[] getH_def69() {
        return this.h_def69;
    }

    public void setH_def69(String[] h_def69) {
        this.h_def69 = h_def69;
    }

    public String[] getH_def70() {
        return this.h_def70;
    }

    public void setH_def70(String[] h_def70) {
        this.h_def70 = h_def70;
    }

    public String[] getH_def71() {
        return this.h_def71;
    }

    public void setH_def71(String[] h_def71) {
        this.h_def71 = h_def71;
    }

    public String[] getH_def72() {
        return this.h_def72;
    }

    public void setH_def72(String[] h_def72) {
        this.h_def72 = h_def72;
    }

    public String[] getH_def73() {
        return this.h_def73;
    }

    public void setH_def73(String[] h_def73) {
        this.h_def73 = h_def73;
    }

    public String[] getH_def74() {
        return this.h_def74;
    }

    public void setH_def74(String[] h_def74) {
        this.h_def74 = h_def74;
    }

    public String[] getH_def75() {
        return this.h_def75;
    }

    public void setH_def75(String[] h_def75) {
        this.h_def75 = h_def75;
    }

    public String[] getH_def76() {
        return this.h_def76;
    }

    public void setH_def76(String[] h_def76) {
        this.h_def76 = h_def76;
    }

    public String[] getH_def77() {
        return this.h_def77;
    }

    public void setH_def77(String[] h_def77) {
        this.h_def77 = h_def77;
    }

    public String[] getH_def78() {
        return this.h_def78;
    }

    public void setH_def78(String[] h_def78) {
        this.h_def78 = h_def78;
    }

    public String[] getH_def79() {
        return this.h_def79;
    }

    public void setH_def79(String[] h_def79) {
        this.h_def79 = h_def79;
    }

    public String[] getH_def80() {
        return this.h_def80;
    }

    public void setH_def80(String[] h_def80) {
        this.h_def80 = h_def80;
    }

    public String[] getPk_pcorg() {
        return this.pk_pcorg;
    }

    public String[] getCostcenter() {
        return this.costcenter;
    }

    public void setCostcenter(String[] costcenter) {
        this.costcenter = costcenter;
    }

    public void setPk_pcorg(String[] newPk_pcorg) {
        this.pk_pcorg = newPk_pcorg;
    }

    public String[] getSett_org() {
        return this.sett_org;
    }

    public void setSett_org(String[] newSett_org) {
        this.sett_org = newSett_org;
    }

    public String[] getPk_busitype() {
        return this.pk_busitype;
    }

    public void setPk_busitype(String[] newPk_busitype) {
        this.pk_busitype = newPk_busitype;
    }

    public String[] getH_subjcode() {
        return this.h_subjcode;
    }

    public void setH_subjcode(String[] newH_subjcode) {
        this.h_subjcode = newH_subjcode;
    }

    public String[] getRecaccount() {
        return this.recaccount;
    }

    public void setRecaccount(String[] newRecaccount) {
        this.recaccount = newRecaccount;
    }

    public String[] getPayaccount() {
        return this.payaccount;
    }

    public void setPayaccount(String[] newPayaccount) {
        this.payaccount = newPayaccount;
    }

    public String[] getCashaccount() {
        return this.cashaccount;
    }

    public void setCashaccount(String[] cashaccount) {
        this.cashaccount = cashaccount;
    }

    public String[] getProject() {
        return this.project;
    }

    public void setProject(String[] newProject) {
        this.project = newProject;
    }

    public String[] getProject_task() {
        return this.project_task;
    }

    public void setProject_task(String[] newProject_task) {
        this.project_task = newProject_task;
    }

    public String[] getProductline() {
        return this.productline;
    }

    public void setProductline(String[] newProductline) {
        this.productline = newProductline;
    }

    public String[] getCashitem() {
        return this.cashitem;
    }

    public void setCashitem(String[] newCashitem) {
        this.cashitem = newCashitem;
    }

    public String[] getH_def30() {
        return this.h_def30;
    }

    public void setH_def30(String[] newH_def30) {
        this.h_def30 = newH_def30;
    }

    public String[] getH_def29() {
        return this.h_def29;
    }

    public void setH_def29(String[] newH_def29) {
        this.h_def29 = newH_def29;
    }

    public String[] getH_def28() {
        return this.h_def28;
    }

    public void setH_def28(String[] newH_def28) {
        this.h_def28 = newH_def28;
    }

    public String[] getH_def27() {
        return this.h_def27;
    }

    public void setH_def27(String[] newH_def27) {
        this.h_def27 = newH_def27;
    }

    public String[] getH_def26() {
        return this.h_def26;
    }

    public void setH_def26(String[] newH_def26) {
        this.h_def26 = newH_def26;
    }

    public String[] getH_def25() {
        return this.h_def25;
    }

    public void setH_def25(String[] newH_def25) {
        this.h_def25 = newH_def25;
    }

    public String[] getH_def24() {
        return this.h_def24;
    }

    public void setH_def24(String[] newH_def24) {
        this.h_def24 = newH_def24;
    }

    public String[] getH_def23() {
        return this.h_def23;
    }

    public void setH_def23(String[] newH_def23) {
        this.h_def23 = newH_def23;
    }

    public String[] getH_def22() {
        return this.h_def22;
    }

    public void setH_def22(String[] newH_def22) {
        this.h_def22 = newH_def22;
    }

    public String[] getH_def21() {
        return this.h_def21;
    }

    public void setH_def21(String[] newH_def21) {
        this.h_def21 = newH_def21;
    }

    public String[] getH_def20() {
        return this.h_def20;
    }

    public void setH_def20(String[] newH_def20) {
        this.h_def20 = newH_def20;
    }

    public String[] getH_def19() {
        return this.h_def19;
    }

    public void setH_def19(String[] newH_def19) {
        this.h_def19 = newH_def19;
    }

    public String[] getH_def18() {
        return this.h_def18;
    }

    public void setH_def18(String[] newH_def18) {
        this.h_def18 = newH_def18;
    }

    public String[] getH_def17() {
        return this.h_def17;
    }

    public void setH_def17(String[] newH_def17) {
        this.h_def17 = newH_def17;
    }

    public String[] getH_def16() {
        return this.h_def16;
    }

    public void setH_def16(String[] newH_def16) {
        this.h_def16 = newH_def16;
    }

    public String[] getH_def15() {
        return this.h_def15;
    }

    public void setH_def15(String[] newH_def15) {
        this.h_def15 = newH_def15;
    }

    public String[] getH_def14() {
        return this.h_def14;
    }

    public void setH_def14(String[] newH_def14) {
        this.h_def14 = newH_def14;
    }

    public String[] getH_def13() {
        return this.h_def13;
    }

    public void setH_def13(String[] newH_def13) {
        this.h_def13 = newH_def13;
    }

    public String[] getH_def12() {
        return this.h_def12;
    }

    public void setH_def12(String[] newH_def12) {
        this.h_def12 = newH_def12;
    }

    public String[] getH_def11() {
        return this.h_def11;
    }

    public void setH_def11(String[] newH_def11) {
        this.h_def11 = newH_def11;
    }

    public String[] getH_def10() {
        return this.h_def10;
    }

    public void setH_def10(String[] newH_def10) {
        this.h_def10 = newH_def10;
    }

    public String[] getH_def9() {
        return this.h_def9;
    }

    public void setH_def9(String[] newH_def9) {
        this.h_def9 = newH_def9;
    }

    public String[] getH_def8() {
        return this.h_def8;
    }

    public void setH_def8(String[] newH_def8) {
        this.h_def8 = newH_def8;
    }

    public String[] getH_def7() {
        return this.h_def7;
    }

    public void setH_def7(String[] newH_def7) {
        this.h_def7 = newH_def7;
    }

    public String[] getH_def6() {
        return this.h_def6;
    }

    public void setH_def6(String[] newH_def6) {
        this.h_def6 = newH_def6;
    }

    public String[] getH_def5() {
        return this.h_def5;
    }

    public void setH_def5(String[] newH_def5) {
        this.h_def5 = newH_def5;
    }

    public String[] getH_def4() {
        return this.h_def4;
    }

    public void setH_def4(String[] newH_def4) {
        this.h_def4 = newH_def4;
    }

    public String[] getH_def3() {
        return this.h_def3;
    }

    public void setH_def3(String[] newH_def3) {
        this.h_def3 = newH_def3;
    }

    public String[] getH_def2() {
        return this.h_def2;
    }

    public void setH_def2(String[] newH_def2) {
        this.h_def2 = newH_def2;
    }

    public String[] getH_def1() {
        return this.h_def1;
    }

    public void setH_def1(String[] newH_def1) {
        this.h_def1 = newH_def1;
    }

    public String[] getSo_org() {
        return this.so_org;
    }

    public void setSo_org(String[] newSo_org) {
        this.so_org = newSo_org;
    }

    public String[] getSo_deptid() {
        return this.so_deptid;
    }

    public void setSo_deptid(String[] newSo_deptid) {
        this.so_deptid = newSo_deptid;
    }

    public String[] getSo_psndoc() {
        return this.so_psndoc;
    }

    public void setSo_psndoc(String[] newSo_psndoc) {
        this.so_psndoc = newSo_psndoc;
    }

    public String[] getSo_ordertype() {
        return this.so_ordertype;
    }

    public void setSo_ordertype(String[] newSo_ordertype) {
        this.so_ordertype = newSo_ordertype;
    }

    public String[] getSo_transtype() {
        return this.so_transtype;
    }

    public void setSo_transtype(String[] newSo_transtype) {
        this.so_transtype = newSo_transtype;
    }

    public String[] getPk_recterm() {
        return this.pk_recterm;
    }

    public void setPk_recterm(String[] newPk_recterm) {
        this.pk_recterm = newPk_recterm;
    }

    public String[] getOutstoreno() {
        return this.outstoreno;
    }

    public void setOutstoreno(String[] newOutstoreno) {
        this.outstoreno = newOutstoreno;
    }

    public String[] getPu_org() {
        return this.pu_org;
    }

    public void setPu_org(String[] newPu_org) {
        this.pu_org = newPu_org;
    }

    public String[] getPu_deptid() {
        return this.pu_deptid;
    }

    public void setPu_deptid(String[] newPu_deptid) {
        this.pu_deptid = newPu_deptid;
    }

    public String[] getPu_psndoc() {
        return this.pu_psndoc;
    }

    public void setPu_psndoc(String[] newPu_psndoc) {
        this.pu_psndoc = newPu_psndoc;
    }

    public String[] getPk_payterm() {
        return this.pk_payterm;
    }

    public void setPk_payterm(String[] newPk_payterm) {
        this.pk_payterm = newPk_payterm;
    }

    public String[] getInstoreno() {
        return this.instoreno;
    }

    public void setInstoreno(String[] newInstoreno) {
        this.instoreno = newInstoreno;
    }

    public String[] getEquipmentcode() {
        return this.equipmentcode;
    }

    public void setEquipmentcode(String[] newEquipmentcode) {
        this.equipmentcode = newEquipmentcode;
    }

    public String[] getFacard() {
        return this.facard;
    }

    public void setFacard(String[] newFacard) {
        this.facard = newFacard;
    }

    public String[] getInnerorderno() {
        return this.innerorderno;
    }

    public void setInnerorderno(String[] newInnerorderno) {
        this.innerorderno = newInnerorderno;
    }

    public String[] getCheckelement() {
        return this.checkelement;
    }

    public void setCheckelement(String[] newCheckelement) {
        this.checkelement = newCheckelement;
    }

    public String[] getBankrollprojet() {
        return this.bankrollprojet;
    }

    public void setBankrollprojet(String[] newBankrollprojet) {
        this.bankrollprojet = newBankrollprojet;
    }

    public String[] getChecktype() {
        return this.checktype;
    }

    public void setChecktype(String[] newChecktype) {
        this.checktype = newChecktype;
    }

    public String[] getSrc_billtype() {
        return this.src_billtype;
    }

    public void setSrc_billtype(String[] newSrc_billtype) {
        this.src_billtype = newSrc_billtype;
    }

    public String[] getSrc_tradetype() {
        return this.src_tradetype;
    }

    public void setSrc_tradetype(String[] newSrc_tradetype) {
        this.src_tradetype = newSrc_tradetype;
    }

    public String[] getFreecust() {
        return this.freecust;
    }

    public void setFreecust(String[] newFreecust) {
        this.freecust = newFreecust;
    }

    public String[] getContractno() {
        return this.contractno;
    }

    public void setContractno(String[] newContractno) {
        this.contractno = newContractno;
    }

    public String[] getPurchaseorder() {
        return this.purchaseorder;
    }

    public void setPurchaseorder(String[] newPurchaseorder) {
        this.purchaseorder = newPurchaseorder;
    }

    public String[] getMatcustcode() {
        return this.matcustcode;
    }

    public void setMatcustcode(String[] matcustcode) {
        this.matcustcode = matcustcode;
    }

    public String[] getPk_recpaytype() {
        return this.pk_recpaytype;
    }

    public void setPk_recpaytype(String[] pk_recpaytype) {
        this.pk_recpaytype = pk_recpaytype;
    }

    public String[] getDef31() {
        return this.def31;
    }

    public void setDef31(String[] def31) {
        this.def31 = def31;
    }

    public String[] getDef32() {
        return this.def32;
    }

    public void setDef32(String[] def32) {
        this.def32 = def32;
    }

    public String[] getDef33() {
        return this.def33;
    }

    public void setDef33(String[] def33) {
        this.def33 = def33;
    }

    public String[] getDef34() {
        return this.def34;
    }

    public void setDef34(String[] def34) {
        this.def34 = def34;
    }

    public String[] getDef35() {
        return this.def35;
    }

    public void setDef35(String[] def35) {
        this.def35 = def35;
    }

    public String[] getDef36() {
        return this.def36;
    }

    public void setDef36(String[] def36) {
        this.def36 = def36;
    }

    public String[] getDef37() {
        return this.def37;
    }

    public void setDef37(String[] def37) {
        this.def37 = def37;
    }

    public String[] getDef38() {
        return this.def38;
    }

    public void setDef38(String[] def38) {
        this.def38 = def38;
    }

    public String[] getDef39() {
        return this.def39;
    }

    public void setDef39(String[] def39) {
        this.def39 = def39;
    }

    public String[] getDef40() {
        return this.def40;
    }

    public void setDef40(String[] def40) {
        this.def40 = def40;
    }

    public String[] getDef41() {
        return this.def41;
    }

    public void setDef41(String[] def41) {
        this.def41 = def41;
    }

    public String[] getDef42() {
        return this.def42;
    }

    public void setDef42(String[] def42) {
        this.def42 = def42;
    }

    public String[] getDef43() {
        return this.def43;
    }

    public void setDef43(String[] def43) {
        this.def43 = def43;
    }

    public String[] getDef44() {
        return this.def44;
    }

    public void setDef44(String[] def44) {
        this.def44 = def44;
    }

    public String[] getDef45() {
        return this.def45;
    }

    public void setDef45(String[] def45) {
        this.def45 = def45;
    }

    public String[] getDef46() {
        return this.def46;
    }

    public void setDef46(String[] def46) {
        this.def46 = def46;
    }

    public String[] getDef47() {
        return this.def47;
    }

    public void setDef47(String[] def47) {
        this.def47 = def47;
    }

    public String[] getDef48() {
        return this.def48;
    }

    public void setDef48(String[] def48) {
        this.def48 = def48;
    }

    public String[] getDef49() {
        return this.def49;
    }

    public void setDef49(String[] def49) {
        this.def49 = def49;
    }

    public String[] getDef50() {
        return this.def50;
    }

    public void setDef50(String[] def50) {
        this.def50 = def50;
    }

    public String[] getDef51() {
        return this.def51;
    }

    public void setDef51(String[] def51) {
        this.def51 = def51;
    }

    public String[] getDef52() {
        return this.def52;
    }

    public void setDef52(String[] def52) {
        this.def52 = def52;
    }

    public String[] getDef53() {
        return this.def53;
    }

    public void setDef53(String[] def53) {
        this.def53 = def53;
    }

    public String[] getDef54() {
        return this.def54;
    }

    public void setDef54(String[] def54) {
        this.def54 = def54;
    }

    public String[] getDef55() {
        return this.def55;
    }

    public void setDef55(String[] def55) {
        this.def55 = def55;
    }

    public String[] getDef56() {
        return this.def56;
    }

    public void setDef56(String[] def56) {
        this.def56 = def56;
    }

    public String[] getDef57() {
        return this.def57;
    }

    public void setDef57(String[] def57) {
        this.def57 = def57;
    }

    public String[] getDef58() {
        return this.def58;
    }

    public void setDef58(String[] def58) {
        this.def58 = def58;
    }

    public String[] getDef59() {
        return this.def59;
    }

    public void setDef59(String[] def59) {
        this.def59 = def59;
    }

    public String[] getDef60() {
        return this.def60;
    }

    public void setDef60(String[] def60) {
        this.def60 = def60;
    }

    public String[] getDef61() {
        return this.def61;
    }

    public void setDef61(String[] def61) {
        this.def61 = def61;
    }

    public String[] getDef62() {
        return this.def62;
    }

    public void setDef62(String[] def62) {
        this.def62 = def62;
    }

    public String[] getDef63() {
        return this.def63;
    }

    public void setDef63(String[] def63) {
        this.def63 = def63;
    }

    public String[] getDef64() {
        return this.def64;
    }

    public void setDef64(String[] def64) {
        this.def64 = def64;
    }

    public String[] getDef65() {
        return this.def65;
    }

    public void setDef65(String[] def65) {
        this.def65 = def65;
    }

    public String[] getDef66() {
        return this.def66;
    }

    public void setDef66(String[] def66) {
        this.def66 = def66;
    }

    public String[] getDef67() {
        return this.def67;
    }

    public void setDef67(String[] def67) {
        this.def67 = def67;
    }

    public String[] getDef68() {
        return this.def68;
    }

    public void setDef68(String[] def68) {
        this.def68 = def68;
    }

    public String[] getDef69() {
        return this.def69;
    }

    public void setDef69(String[] def69) {
        this.def69 = def69;
    }

    public String[] getDef70() {
        return this.def70;
    }

    public void setDef70(String[] def70) {
        this.def70 = def70;
    }

    public String[] getDef71() {
        return this.def71;
    }

    public void setDef71(String[] def71) {
        this.def71 = def71;
    }

    public String[] getDef72() {
        return this.def72;
    }

    public void setDef72(String[] def72) {
        this.def72 = def72;
    }

    public String[] getDef73() {
        return this.def73;
    }

    public void setDef73(String[] def73) {
        this.def73 = def73;
    }

    public String[] getDef74() {
        return this.def74;
    }

    public void setDef74(String[] def74) {
        this.def74 = def74;
    }

    public String[] getDef75() {
        return this.def75;
    }

    public void setDef75(String[] def75) {
        this.def75 = def75;
    }

    public String[] getDef76() {
        return this.def76;
    }

    public void setDef76(String[] def76) {
        this.def76 = def76;
    }

    public String[] getDef77() {
        return this.def77;
    }

    public void setDef77(String[] def77) {
        this.def77 = def77;
    }

    public String[] getDef78() {
        return this.def78;
    }

    public void setDef78(String[] def78) {
        this.def78 = def78;
    }

    public String[] getDef79() {
        return this.def79;
    }

    public void setDef79(String[] def79) {
        this.def79 = def79;
    }

    public String[] getDef80() {
        return this.def80;
    }

    public void setDef80(String[] def80) {
        this.def80 = def80;
    }

    public String[] getBrief() {
        return this.brief;
    }

    public void setBrief(String[] newBrief) {
        this.brief = newBrief;
    }

    public String[] getPk_currtype() {
        return this.pk_currtype;
    }

    public void setPk_currtype(String[] newPk_currtype) {
        this.pk_currtype = newPk_currtype;
    }

    public Integer getObjtype() {
        return this.objtype;
    }

    public void setObjtype(Integer newObjtype) {
        this.objtype = newObjtype;
    }

    public String[] getCustomer() {
        return this.customer;
    }

    public void setCustomer(String[] newCustomer) {
        this.customer = newCustomer;
    }

    public String[] getSupplier() {
        return this.supplier;
    }

    public void setSupplier(String[] newSupplier) {
        this.supplier = newSupplier;
    }

    public String[] getPk_deptid() {
        return this.pk_deptid;
    }

    public void setPk_deptid(String[] newPk_deptid) {
        this.pk_deptid = newPk_deptid;
    }

    public String[] getPk_psndoc() {
        return this.pk_psndoc;
    }

    public void setPk_psndoc(String[] newPk_psndoc) {
        this.pk_psndoc = newPk_psndoc;
    }

    public String[] getBillclass() {
        return this.billclass;
    }

    public void setBillclass(String[] newBillclass) {
        this.billclass = newBillclass;
    }

    public String[] getPk_billtype() {
        return this.pk_billtype;
    }

    public void setPk_billtype(String[] newPk_billtype) {
        this.pk_billtype = newPk_billtype;
    }

    public String[] getPk_tradetype() {
        return this.pk_tradetype;
    }

    public void setPk_tradetype(String[] newPk_tradetype) {
        this.pk_tradetype = newPk_tradetype;
    }

    public String[] getPk_tradetypeid() {
        return this.pk_tradetypeid;
    }

    public void setPk_tradetypeid(String[] newPk_tradetypeid) {
        this.pk_tradetypeid = newPk_tradetypeid;
    }

    public String[] getMaterial() {
        return this.material;
    }

    public void setMaterial(String[] newMaterial) {
        this.material = newMaterial;
    }

    public String[] getPk_subjcode() {
        return this.pk_subjcode;
    }

    public void setPk_subjcode(String[] newPk_subjcode) {
        this.pk_subjcode = newPk_subjcode;
    }

    public String[] getSubjcode() {
        return this.subjcode;
    }

    public void setSubjcode(String[] newSubjcode) {
        this.subjcode = newSubjcode;
    }

    public String[] getOrdercubasdoc() {
        return this.ordercubasdoc;
    }

    public void setOrdercubasdoc(String[] newOrdercubasdoc) {
        this.ordercubasdoc = newOrdercubasdoc;
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

    public String[] getDef1() {
        return this.def1;
    }

    public void setDef1(String[] newDef1) {
        this.def1 = newDef1;
    }

    public String[] getDef2() {
        return this.def2;
    }

    public void setDef2(String[] newDef2) {
        this.def2 = newDef2;
    }

    public String[] getDef3() {
        return this.def3;
    }

    public void setDef3(String[] newDef3) {
        this.def3 = newDef3;
    }

    public String[] getDef4() {
        return this.def4;
    }

    public void setDef4(String[] newDef4) {
        this.def4 = newDef4;
    }

    public String[] getDef5() {
        return this.def5;
    }

    public void setDef5(String[] newDef5) {
        this.def5 = newDef5;
    }

    public String[] getDef6() {
        return this.def6;
    }

    public void setDef6(String[] newDef6) {
        this.def6 = newDef6;
    }

    public String[] getDef7() {
        return this.def7;
    }

    public void setDef7(String[] newDef7) {
        this.def7 = newDef7;
    }

    public String[] getDef8() {
        return this.def8;
    }

    public void setDef8(String[] newDef8) {
        this.def8 = newDef8;
    }

    public String[] getDef9() {
        return this.def9;
    }

    public void setDef9(String[] newDef9) {
        this.def9 = newDef9;
    }

    public String[] getDef10() {
        return this.def10;
    }

    public void setDef10(String[] newDef10) {
        this.def10 = newDef10;
    }

    public String[] getDef11() {
        return this.def11;
    }

    public void setDef11(String[] newDef11) {
        this.def11 = newDef11;
    }

    public String[] getDef12() {
        return this.def12;
    }

    public void setDef12(String[] newDef12) {
        this.def12 = newDef12;
    }

    public String[] getDef13() {
        return this.def13;
    }

    public void setDef13(String[] newDef13) {
        this.def13 = newDef13;
    }

    public String[] getDef14() {
        return this.def14;
    }

    public void setDef14(String[] newDef14) {
        this.def14 = newDef14;
    }

    public String[] getDef15() {
        return this.def15;
    }

    public void setDef15(String[] newDef15) {
        this.def15 = newDef15;
    }

    public String[] getDef16() {
        return this.def16;
    }

    public void setDef16(String[] newDef16) {
        this.def16 = newDef16;
    }

    public String[] getDef17() {
        return this.def17;
    }

    public void setDef17(String[] newDef17) {
        this.def17 = newDef17;
    }

    public String[] getDef18() {
        return this.def18;
    }

    public void setDef18(String[] newDef18) {
        this.def18 = newDef18;
    }

    public String[] getDef19() {
        return this.def19;
    }

    public void setDef19(String[] newDef19) {
        this.def19 = newDef19;
    }

    public String[] getDef20() {
        return this.def20;
    }

    public void setDef20(String[] newDef20) {
        this.def20 = newDef20;
    }

    public String[] getDef21() {
        return this.def21;
    }

    public void setDef21(String[] newDef21) {
        this.def21 = newDef21;
    }

    public String[] getDef22() {
        return this.def22;
    }

    public void setDef22(String[] newDef22) {
        this.def22 = newDef22;
    }

    public String[] getDef23() {
        return this.def23;
    }

    public void setDef23(String[] newDef23) {
        this.def23 = newDef23;
    }

    public String[] getDef24() {
        return this.def24;
    }

    public void setDef24(String[] newDef24) {
        this.def24 = newDef24;
    }

    public String[] getDef25() {
        return this.def25;
    }

    public void setDef25(String[] newDef25) {
        this.def25 = newDef25;
    }

    public String[] getDef26() {
        return this.def26;
    }

    public void setDef26(String[] newDef26) {
        this.def26 = newDef26;
    }

    public String[] getDef27() {
        return this.def27;
    }

    public void setDef27(String[] newDef27) {
        this.def27 = newDef27;
    }

    public String[] getDef28() {
        return this.def28;
    }

    public void setDef28(String[] newDef28) {
        this.def28 = newDef28;
    }

    public String[] getDef29() {
        return this.def29;
    }

    public void setDef29(String[] newDef29) {
        this.def29 = newDef29;
    }

    public String[] getDef30() {
        return this.def30;
    }

    public void setDef30(String[] newDef30) {
        this.def30 = newDef30;
    }

    public void setPrepay(UFBoolean prepay) {
        this.prepay = prepay;
    }

    public UFBoolean getPrepay() {
        return this.prepay;
    }

    public void setBilltypepks(String[] billtypepks) {
        this.billtypepks = billtypepks;
    }

    public String[] getBilltypepks() {
        return this.billtypepks;
    }

    public Integer getAnaDate() {
        return this.anaDate;
    }

    public void setAnaDate(Integer anaDate) {
        this.anaDate = anaDate;
    }

    public String[] getPk_orgs() {
        return this.pk_orgs;
    }

    public void setPk_orgs(String[] pkOrgs) {
        this.pk_orgs = pkOrgs;
    }

    static {
        allfieldList.add(PK_PCORG);
        allfieldList.add(COSTCENTER);
        allfieldList.add(SETT_ORG);
        allfieldList.add(PK_BUSITYPE);
        allfieldList.add(H_SUBJCODE);
        allfieldList.add(RECACCOUNT);
        allfieldList.add(PAYACCOUNT);
        allfieldList.add(CASHACCOUNT);
        allfieldList.add(PROJECT);
        allfieldList.add(PROJECT_TASK);
        allfieldList.add(PRODUCTLINE);
        allfieldList.add(CASHITEM);
        allfieldList.add(H_DEF30);
        allfieldList.add(H_DEF29);
        allfieldList.add(H_DEF28);
        allfieldList.add(H_DEF27);
        allfieldList.add(H_DEF26);
        allfieldList.add(H_DEF25);
        allfieldList.add(H_DEF24);
        allfieldList.add(H_DEF23);
        allfieldList.add(H_DEF22);
        allfieldList.add(H_DEF21);
        allfieldList.add(H_DEF20);
        allfieldList.add(H_DEF19);
        allfieldList.add(H_DEF18);
        allfieldList.add(H_DEF17);
        allfieldList.add(H_DEF16);
        allfieldList.add(H_DEF15);
        allfieldList.add(H_DEF14);
        allfieldList.add(H_DEF13);
        allfieldList.add(H_DEF12);
        allfieldList.add(H_DEF11);
        allfieldList.add(H_DEF10);
        allfieldList.add(H_DEF9);
        allfieldList.add(H_DEF8);
        allfieldList.add(H_DEF7);
        allfieldList.add(H_DEF6);
        allfieldList.add(H_DEF5);
        allfieldList.add(H_DEF4);
        allfieldList.add(H_DEF3);
        allfieldList.add(H_DEF2);
        allfieldList.add(H_DEF1);
        allfieldList.add(SO_ORG);
        allfieldList.add(SO_DEPTID);
        allfieldList.add(SO_PSNDOC);
        allfieldList.add(SO_ORDERTYPE);
        allfieldList.add(SO_TRANSTYPE);
        allfieldList.add(PK_RECTERM);
        allfieldList.add(OUTSTORENO);
        allfieldList.add(PU_ORG);
        allfieldList.add(PU_DEPTID);
        allfieldList.add(PU_PSNDOC);
        allfieldList.add(PK_PAYTERM);
        allfieldList.add(INSTORENO);
        allfieldList.add(EQUIPMENTCODE);
        allfieldList.add(FACARD);
        allfieldList.add(INNERORDERNO);
        allfieldList.add(CHECKELEMENT);
        allfieldList.add(BANKROLLPROJET);
        allfieldList.add(CHECKTYPE);
        allfieldList.add(SRC_BILLTYPE);
        allfieldList.add(SRC_TRADETYPE);
        allfieldList.add(FREECUST);
        allfieldList.add(CONTRACTNO);
        allfieldList.add(PURCHASEORDER);
        allfieldList.add(MATCUSTCODE);
        allfieldList.add(H_DEF31);
        allfieldList.add(H_DEF32);
        allfieldList.add(H_DEF33);
        allfieldList.add(H_DEF34);
        allfieldList.add(H_DEF35);
        allfieldList.add(H_DEF36);
        allfieldList.add(H_DEF37);
        allfieldList.add(H_DEF38);
        allfieldList.add(H_DEF39);
        allfieldList.add(H_DEF40);
        allfieldList.add(H_DEF41);
        allfieldList.add(H_DEF42);
        allfieldList.add(H_DEF43);
        allfieldList.add(H_DEF44);
        allfieldList.add(H_DEF45);
        allfieldList.add(H_DEF46);
        allfieldList.add(H_DEF47);
        allfieldList.add(H_DEF48);
        allfieldList.add(H_DEF49);
        allfieldList.add(H_DEF50);
        allfieldList.add(H_DEF61);
        allfieldList.add(H_DEF62);
        allfieldList.add(H_DEF63);
        allfieldList.add(H_DEF64);
        allfieldList.add(H_DEF65);
        allfieldList.add(H_DEF66);
        allfieldList.add(H_DEF67);
        allfieldList.add(H_DEF68);
        allfieldList.add(H_DEF69);
        allfieldList.add(H_DEF70);
        allfieldList.add(H_DEF71);
        allfieldList.add(H_DEF72);
        allfieldList.add(H_DEF73);
        allfieldList.add(H_DEF74);
        allfieldList.add(H_DEF75);
        allfieldList.add(H_DEF76);
        allfieldList.add(H_DEF77);
        allfieldList.add(H_DEF78);
        allfieldList.add(H_DEF79);
        allfieldList.add(H_DEF80);
        tallyfieldList.add(BRIEF);
        tallyfieldList.add(OBJTYPE);
        tallyfieldList.add(CUSTOMER);
        tallyfieldList.add(SUPPLIER);
        tallyfieldList.add(PK_DEPTID);
        tallyfieldList.add(PK_PSNDOC);
        tallyfieldList.add(BILLCLASS);
        tallyfieldList.add(PK_BILLTYPE);
        tallyfieldList.add(PK_TRADETYPE);
        tallyfieldList.add(PK_TRADETYPEID);
        tallyfieldList.add(PK_SUBJCODE);
        tallyfieldList.add(MATERIAL);
        tallyfieldList.add(SUBJCODE);
        tallyfieldList.add(ORDERCUBASDOC);
        tallyfieldList.add(PREPAY);
        tallyfieldList.add(EFFECTSTATUS);
        tallyfieldList.add(BILLSTATUS);
        tallyfieldList.add(DEF1);
        tallyfieldList.add(DEF2);
        tallyfieldList.add(DEF3);
        tallyfieldList.add(DEF4);
        tallyfieldList.add(DEF5);
        tallyfieldList.add(DEF6);
        tallyfieldList.add(DEF7);
        tallyfieldList.add(DEF8);
        tallyfieldList.add(DEF9);
        tallyfieldList.add(DEF10);
        tallyfieldList.add(DEF11);
        tallyfieldList.add(DEF12);
        tallyfieldList.add(DEF13);
        tallyfieldList.add(DEF14);
        tallyfieldList.add(DEF15);
        tallyfieldList.add(DEF16);
        tallyfieldList.add(DEF17);
        tallyfieldList.add(DEF18);
        tallyfieldList.add(DEF19);
        tallyfieldList.add(DEF20);
        tallyfieldList.add(DEF21);
        tallyfieldList.add(DEF22);
        tallyfieldList.add(DEF23);
        tallyfieldList.add(DEF24);
        tallyfieldList.add(DEF25);
        tallyfieldList.add(DEF26);
        tallyfieldList.add(DEF27);
        tallyfieldList.add(DEF28);
        tallyfieldList.add(DEF29);
        tallyfieldList.add(DEF30);
        tallyfieldList.add(PK_RECPAYTYPE);
        tallyfieldList.add(DEF31);
        tallyfieldList.add(DEF32);
        tallyfieldList.add(DEF33);
        tallyfieldList.add(DEF34);
        tallyfieldList.add(DEF35);
        tallyfieldList.add(DEF36);
        tallyfieldList.add(DEF37);
        tallyfieldList.add(DEF38);
        tallyfieldList.add(DEF39);
        tallyfieldList.add(DEF40);
        tallyfieldList.add(DEF41);
        tallyfieldList.add(DEF42);
        tallyfieldList.add(DEF43);
        tallyfieldList.add(DEF44);
        tallyfieldList.add(DEF45);
        tallyfieldList.add(DEF46);
        tallyfieldList.add(DEF47);
        tallyfieldList.add(DEF48);
        tallyfieldList.add(DEF49);
        tallyfieldList.add(DEF50);
        tallyfieldList.add(DEF51);
        tallyfieldList.add(DEF52);
        tallyfieldList.add(DEF53);
        tallyfieldList.add(DEF54);
        tallyfieldList.add(DEF55);
        tallyfieldList.add(DEF56);
        tallyfieldList.add(DEF57);
        tallyfieldList.add(DEF58);
        tallyfieldList.add(DEF59);
        tallyfieldList.add(DEF60);
        tallyfieldList.add(DEF71);
        tallyfieldList.add(DEF72);
        tallyfieldList.add(DEF73);
        tallyfieldList.add(DEF74);
        tallyfieldList.add(DEF75);
        tallyfieldList.add(DEF76);
        tallyfieldList.add(DEF77);
        tallyfieldList.add(DEF78);
        tallyfieldList.add(DEF79);
        tallyfieldList.add(DEF80);
        deffieldList.add(H_DEF30);
        deffieldList.add(H_DEF29);
        deffieldList.add(H_DEF28);
        deffieldList.add(H_DEF27);
        deffieldList.add(H_DEF26);
        deffieldList.add(H_DEF25);
        deffieldList.add(H_DEF24);
        deffieldList.add(H_DEF23);
        deffieldList.add(H_DEF22);
        deffieldList.add(H_DEF21);
        deffieldList.add(H_DEF20);
        deffieldList.add(H_DEF19);
        deffieldList.add(H_DEF18);
        deffieldList.add(H_DEF17);
        deffieldList.add(H_DEF16);
        deffieldList.add(H_DEF15);
        deffieldList.add(H_DEF14);
        deffieldList.add(H_DEF13);
        deffieldList.add(H_DEF12);
        deffieldList.add(H_DEF11);
        deffieldList.add(H_DEF10);
        deffieldList.add(H_DEF9);
        deffieldList.add(H_DEF8);
        deffieldList.add(H_DEF7);
        deffieldList.add(H_DEF6);
        deffieldList.add(H_DEF5);
        deffieldList.add(H_DEF4);
        deffieldList.add(H_DEF3);
        deffieldList.add(H_DEF2);
        deffieldList.add(H_DEF1);
        deffieldList.add(H_DEF31);
        deffieldList.add(H_DEF32);
        deffieldList.add(H_DEF33);
        deffieldList.add(H_DEF34);
        deffieldList.add(H_DEF35);
        deffieldList.add(H_DEF36);
        deffieldList.add(H_DEF37);
        deffieldList.add(H_DEF38);
        deffieldList.add(H_DEF39);
        deffieldList.add(H_DEF40);
        deffieldList.add(H_DEF41);
        deffieldList.add(H_DEF42);
        deffieldList.add(H_DEF43);
        deffieldList.add(H_DEF44);
        deffieldList.add(H_DEF45);
        deffieldList.add(H_DEF46);
        deffieldList.add(H_DEF47);
        deffieldList.add(H_DEF48);
        deffieldList.add(H_DEF49);
        deffieldList.add(H_DEF50);
        deffieldList.add(H_DEF61);
        deffieldList.add(H_DEF62);
        deffieldList.add(H_DEF63);
        deffieldList.add(H_DEF64);
        deffieldList.add(H_DEF65);
        deffieldList.add(H_DEF66);
        deffieldList.add(H_DEF67);
        deffieldList.add(H_DEF68);
        deffieldList.add(H_DEF69);
        deffieldList.add(H_DEF70);
        deffieldList.add(H_DEF71);
        deffieldList.add(H_DEF72);
        deffieldList.add(H_DEF73);
        deffieldList.add(H_DEF74);
        deffieldList.add(H_DEF75);
        deffieldList.add(H_DEF76);
        deffieldList.add(H_DEF77);
        deffieldList.add(H_DEF78);
        deffieldList.add(H_DEF79);
        deffieldList.add(H_DEF80);
        deffieldList.add(DEF31);
        deffieldList.add(DEF32);
        deffieldList.add(DEF33);
        deffieldList.add(DEF34);
        deffieldList.add(DEF35);
        deffieldList.add(DEF36);
        deffieldList.add(DEF37);
        deffieldList.add(DEF38);
        deffieldList.add(DEF39);
        deffieldList.add(DEF40);
        deffieldList.add(DEF41);
        deffieldList.add(DEF42);
        deffieldList.add(DEF43);
        deffieldList.add(DEF44);
        deffieldList.add(DEF45);
        deffieldList.add(DEF46);
        deffieldList.add(DEF47);
        deffieldList.add(DEF48);
        deffieldList.add(DEF49);
        deffieldList.add(DEF50);
        deffieldList.add(DEF51);
        deffieldList.add(DEF52);
        deffieldList.add(DEF53);
        deffieldList.add(DEF54);
        deffieldList.add(DEF55);
        deffieldList.add(DEF56);
        deffieldList.add(DEF57);
        deffieldList.add(DEF58);
        deffieldList.add(DEF59);
        deffieldList.add(DEF60);
        deffieldList.add(DEF71);
        deffieldList.add(DEF72);
        deffieldList.add(DEF73);
        deffieldList.add(DEF74);
        deffieldList.add(DEF75);
        deffieldList.add(DEF76);
        deffieldList.add(DEF77);
        deffieldList.add(DEF78);
        deffieldList.add(DEF79);
        deffieldList.add(DEF80);
        deffieldList.add(DEF1);
        deffieldList.add(DEF2);
        deffieldList.add(DEF3);
        deffieldList.add(DEF4);
        deffieldList.add(DEF5);
        deffieldList.add(DEF6);
        deffieldList.add(DEF7);
        deffieldList.add(DEF8);
        deffieldList.add(DEF9);
        deffieldList.add(DEF10);
        deffieldList.add(DEF11);
        deffieldList.add(DEF12);
        deffieldList.add(DEF13);
        deffieldList.add(DEF14);
        deffieldList.add(DEF15);
        deffieldList.add(DEF16);
        deffieldList.add(DEF17);
        deffieldList.add(DEF18);
        deffieldList.add(DEF19);
        deffieldList.add(DEF20);
        deffieldList.add(DEF21);
        deffieldList.add(DEF22);
        deffieldList.add(DEF23);
        deffieldList.add(DEF24);
        deffieldList.add(DEF25);
        deffieldList.add(DEF26);
        deffieldList.add(DEF27);
        deffieldList.add(DEF28);
        deffieldList.add(DEF29);
        deffieldList.add(DEF30);
    }
}

