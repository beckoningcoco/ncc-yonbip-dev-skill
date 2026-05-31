/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory
 */
package nc.vo.arap.cuspayable;

import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.pub.IVOMeta;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class CusPayableBillItemVO
extends BaseItemVO {
    private static final long serialVersionUID = 1L;
    private String pk_cuspayablebill;
    private String pk_cuspayableitem;
    public static final String PK_CUSPAYABLEBILL = "pk_cuspayablebill";
    public static final String PK_TRADETYPEID = "pk_tradetypeid";
    public static final String PK_CUSPAYABLEITEM = "pk_cuspayableitem";
    public static final String SETT_ORG_V = "sett_org_v";
    public static final String PK_FIORG_V = "pk_fiorg_v";
    public static final String PK_ORG_V = "pk_org_v";
    public static final String PK_PCORG_V = "pk_pcorg_v";
    public static final String PK_PCORG = "pk_pcorg";
    public static final String PK_FIORG = "pk_fiorg";
    public static final String PK_ORG = "pk_org";
    public static final String SETT_ORG = "sett_org";
    public static final String SO_DEPTID = "so_deptid";
    public static final String SO_PSNDOC = "so_psndoc";
    public static final String SO_ORDERTYPE = "so_ordertype";
    public static final String SO_TRANSTYPE = "so_transtype";
    public static final String SO_ORG = "so_org";
    public static final String MATERIAL = "material";
    public static final String CUSTOMER = "customer";
    public static final String POSTUNIT = "postunit";
    public static final String POSTPRICENOTAX = "postpricenotax";
    public static final String POSTQUANTITY = "postquantity";
    public static final String POSTPRICE = "postprice";
    public static final String PROJECT_TASK = "project_task";
    public static final String COORDFLAG = "coordflag";
    public static final String EQUIPMENTCODE = "equipmentcode";
    public static final String PRODUCTLINE = "productline";
    public static final String CASHITEM = "cashitem";
    public static final String BANKROLLPROJET = "bankrollprojet";
    public static final String PAUSETRANSACT = "pausetransact";
    public static final String BILLDATE = "billdate";
    public static final String PK_GROUP = "pk_group";
    public static final String PK_BILLTYPE = "pk_billtype";
    public static final String PK_TRADETYPE = "pk_tradetype";
    public static final String BILLCLASS = "billclass";
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
    public static final String CHECKNO = "checkno";
    public static final String PAYACCOUNT = "payaccount";
    public static final String RECACCOUNT = "recaccount";
    public static final String ORDERCUBASDOC = "ordercubasdoc";
    public static final String INNERORDERNO = "innerorderno";
    public static final String ASSETPACTNO = "assetpactno";
    public static final String CONTRACTNO = "contractno";
    public static final String FREECUST = "freecust";
    public static final String FACARD = "facard";
    public static final String PURCHASEORDER = "purchaseorder";
    public static final String PK_BALATYPE = "pk_balatype";
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
    public static final String GROUPCREBIT = "groupcrebit";
    public static final String GLOBALCREBIT = "globalcrebit";
    public static final String GROUPBALANCE = "groupbalance";
    public static final String GLOBALBALANCE = "globalbalance";
    public static final String GROUPTAX_CRE = "grouptax_cre";
    public static final String GLOBALTAX_CRE = "globaltax_cre";
    public static final String GROUPNOTAX_CRE = "groupnotax_cre";
    public static final String GLOBALNOTAX_CRE = "globalnotax_cre";
    public static final String SO_ORG_V = "so_org_v";

    public String getPk_cuspayablebill() {
        return this.pk_cuspayablebill;
    }

    public void setPk_cuspayablebill(String newPk_cuspayablebill) {
        this.pk_cuspayablebill = newPk_cuspayablebill;
    }

    public String getChildrenPK() {
        return this.getPk_cuspayableitem();
    }

    public String getPk_cuspayableitem() {
        return this.pk_cuspayableitem;
    }

    public void setPk_cuspayableitem(String newChildrenPK) {
        this.pk_cuspayableitem = newChildrenPK;
    }

    public String getParentPK() {
        return this.getPk_cuspayablebill();
    }

    public void setChildrenPK(String newChildrenPK) {
        this.setPk_cuspayableitem(newChildrenPK);
    }

    public void setParentPK(String newParentPK) {
        this.setPk_cuspayablebill(newParentPK);
    }

    public String getParentPKFieldName() {
        return PK_CUSPAYABLEBILL;
    }

    public String getPKFieldName() {
        return PK_CUSPAYABLEITEM;
    }

    public String getTableName() {
        return "ap_cuspayableitem";
    }

    public CusPayableBillItemVO() {
        this.setBillclass("yf");
    }

    public IVOMeta getMetaData() {
        IVOMeta meta = VOMetaFactory.getInstance().getVOMeta("arap.cuspayableitem");
        return meta;
    }
}

