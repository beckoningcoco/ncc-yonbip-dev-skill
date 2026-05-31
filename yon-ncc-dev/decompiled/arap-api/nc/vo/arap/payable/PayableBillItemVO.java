/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.VOMetaFactory
 *  nc.vo.pub.IVOMeta
 */
package nc.vo.arap.payable;

import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.VOMetaFactory;
import nc.vo.pub.IVOMeta;

public class PayableBillItemVO
extends BaseItemVO {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "ap_payableitem";
    public static final String PK_ORG = "pk_org";
    public static final String PK_FIORG = "pk_fiorg";
    public static final String PK_PCORG = "pk_pcorg";
    public static final String PK_PCORG_V = "pk_pcorg_v";
    public static final String PK_ORG_V = "pk_org_v";
    public static final String PK_FIORG_V = "pk_fiorg_v";
    public static final String SETT_ORG_V = "sett_org_v";
    public static final String PU_DEPTID = "pu_deptid";
    public static final String PU_PSNDOC = "pu_psndoc";
    public static final String PU_ORG = "pu_org";
    public static final String SETT_ORG = "sett_org";
    public static final String MATERIAL = "material";
    public static final String SUPPLIER = "supplier";
    public static final String CUSTOMER = "customer";
    public static final String POSTUNIT = "postunit";
    public static final String POSTPRICENOTAX = "postpricenotax";
    public static final String POSTQUANTITY = "postquantity";
    public static final String POSTPRICE = "postprice";
    public static final String COORDFLAG = "coordflag";
    public static final String EQUIPMENTCODE = "equipmentcode";
    public static final String PRODUCTLINE = "productline";
    public static final String CASHITEM = "cashitem";
    public static final String BANKROLLPROJET = "bankrollprojet";
    public static final String PAUSETRANSACT = "pausetransact";
    public static final String BILLDATE = "billdate";
    public static final String PK_GROUP = "pk_group";
    public static final String PK_BILLTYPE = "pk_billtype";
    public static final String BILLCLASS = "billclass";
    public static final String PK_TRADETYPE = "pk_tradetype";
    public static final String PK_TRADETYPEID = "pk_tradetypeid";
    public static final String PK_PAYABLEBILL = "pk_payablebill";
    public static final String PK_PAYABLEITEM = "pk_payableitem";
    public static final String BUSIDATE = "busidate";
    public static final String PK_SUBJCODE = "pk_subjcode";
    public static final String BILLNO = "billno";
    public static final String OBJTYPE = "objtype";
    public static final String ROWNO = "rowno";
    public static final String ROWTYPE = "rowtype";
    public static final String DIRECTION = "direction";
    public static final String CHECKTYPE = "checktype";
    public static final String PK_SSITEM = "pk_ssitem";
    public static final String SCOMMENT = "scomment";
    public static final String SUBJCODE = "subjcode";
    public static final String PK_CURRTYPE = "pk_currtype";
    public static final String RATE = "rate";
    public static final String PK_DEPTID = "pk_deptid";
    public static final String PK_PSNDOC = "pk_psndoc";
    public static final String QUANTITY_CR = "quantity_cr";
    public static final String LOCAL_MONEY_CR = "local_money_cr";
    public static final String MONEY_CR = "money_cr";
    public static final String MONEY_BAL = "money_bal";
    public static final String LOCAL_MONEY_BAL = "local_money_bal";
    public static final String QUANTITY_BAL = "quantity_bal";
    public static final String LOCAL_TAX_CR = "local_tax_cr";
    public static final String NOTAX_CR = "notax_cr";
    public static final String LOCAL_NOTAX_CR = "local_notax_cr";
    public static final String PRICE = "price";
    public static final String TAXPRICE = "taxprice";
    public static final String TAXRATE = "taxrate";
    public static final String TAXNUM = "taxnum";
    public static final String TOP_BILLID = "top_billid";
    public static final String TOP_ITEMID = "top_itemid";
    public static final String TOP_BILLTYPE = "top_billtype";
    public static final String TOP_TRADETYPE = "top_tradetype";
    public static final String SRC_TRADETYPE = "src_tradetype";
    public static final String SRC_BILLTYPE = "src_billtype";
    public static final String SRC_BILLID = "src_billid";
    public static final String SRC_ITEMID = "src_itemid";
    public static final String TAXTYPE = "taxtype";
    public static final String PK_PAYTERM = "pk_payterm";
    public static final String PAYACCOUNT = "payaccount";
    public static final String RECACCOUNT = "recaccount";
    public static final String ORDERCUBASDOC = "ordercubasdoc";
    public static final String INNERORDERNO = "innerorderno";
    public static final String ASSETPACTNO = "assetpactno";
    public static final String CONTRACTNO = "contractno";
    public static final String FREECUST = "freecust";
    public static final String FACARD = "facard";
    public static final String PURCHASEORDER = "purchaseorder";
    public static final String INVOICENO = "invoiceno";
    public static final String OUTSTORENO = "outstoreno";
    public static final String PK_JOBPHASE = "pk_jobphase";
    public static final String PK_JOB = "pk_job";
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
    public static final String CHECKELEMENT = "checkelement";
    public static final String GROUPRATE = "grouprate";
    public static final String GLOBALRATE = "globalrate";
    public static final String PU_ORG_V = "pu_org_v";
    public static final String GROUPCREBIT = "groupcrebit";
    public static final String GLOBALCREBIT = "globalcrebit";
    public static final String GROUPBALANCE = "groupbalance";
    public static final String GLOBALBALANCE = "globalbalance";
    public static final String GROUPTAX_CRE = "grouptax_cre";
    public static final String GLOBALTAX_CRE = "globaltax_cre";
    public static final String GROUPNOTAX_CRE = "groupnotax_cre";
    public static final String GLOBALNOTAX_CRE = "globalnotax_cre";
    public static final String OCCUPATIONMNY = "occupationmny";
    public static final String PROJECT = "project";
    public static final String PROJECT_TASK = "project_task";
    public static final String SETTLENO = "settleno";
    public static final String TOP_CHANGETS = "top_changets";
    private String pk_payableitem;
    private String pk_payablebill;
    public static final String ISURGENT = "isurgent";
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
    public static final String CUSTOMER_V = "customer_v";
    public static final String ORDERCUBASDOC_V = "ordercubasdoc_v";
    public static final String SUPPLIER_V = "supplier_v";
    public static final String PK_RATETYPE = "pk_ratetype";
    public static final String RATEDATE = "ratedate";

    public PayableBillItemVO() {
        this.setBillclass("yf");
    }

    public IVOMeta getMetaData() {
        IVOMeta meta = VOMetaFactory.getInstance().getVOMeta("arap.payableitem");
        return meta;
    }

    public String getChildrenPK() {
        return this.pk_payableitem;
    }

    public String getParentPK() {
        return this.pk_payablebill == null ? (String)this.getAttributeValue(PK_PAYABLEBILL) : this.pk_payablebill;
    }

    public void setChildrenPK(String pk_payableitem) {
        this.pk_payableitem = pk_payableitem;
    }

    public void setParentPK(String pk_payablebill) {
        this.pk_payablebill = pk_payablebill;
    }

    public String getPk_payableitem() {
        return this.pk_payableitem;
    }

    public void setPk_payableitem(String pkPayableitem) {
        this.pk_payableitem = pkPayableitem;
    }

    public String getPk_payablebill() {
        return this.pk_payablebill;
    }

    public void setPk_payablebill(String pkPayablebill) {
        this.pk_payablebill = pkPayablebill;
    }

    public static String getDefaultTable() {
        return TABLE_NAME;
    }

    public String getParentPKFieldName() {
        return PK_PAYABLEBILL;
    }
}

