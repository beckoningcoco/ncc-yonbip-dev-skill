/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory
 */
package nc.vo.arap.cuspayable;

import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.pub.IVOMeta;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class CusPayableBillVO
extends BaseBillVO {
    private static final long serialVersionUID = 1L;
    public static final String PK_TRADETYPEID = "pk_tradetypeid";
    public static final String PK_CUSPAYABLEBILL = "pk_cuspayablebill";
    public static final String PK_FIORG = "pk_fiorg";
    public static final String PK_ORG = "pk_org";
    public static final String PK_PCORG = "pk_pcorg";
    public static final String PK_PCORG_V = "pk_pcorg_v";
    public static final String PK_FIORG_V = "pk_fiorg_v";
    public static final String PK_ORG_V = "pk_org_v";
    public static final String SETT_ORG_V = "sett_org_v";
    public static final String SETT_ORG = "sett_org";
    public static final String ISREDED = "isreded";
    public static final String OUTBUSITYPE = "outbusitype";
    public static final String OFFICIALPRINTUSER = "officialprintuser";
    public static final String OFFICIALPRINTDATE = "officialprintdate";
    public static final String PK_GROUP = "pk_group";
    public static final String MODIFIEDTIME = "modifiedtime";
    public static final String CREATIONTIME = "creationtime";
    public static final String CREATOR = "creator";
    public static final String PK_BILLTYPE = "pk_billtype";
    public static final String PK_TRADETYPE = "pk_tradetype";
    public static final String MODIFIER = "modifier";
    public static final String BILLCLASS = "billclass";
    public static final String ACCESSORYNUM = "accessorynum";
    public static final String SUBJCODE = "subjcode";
    public static final String ISFLOWBILL = "isflowbill";
    public static final String CONFIRMUSER = "confirmuser";
    public static final String ISINIT = "isinit";
    public static final String BILLNO = "billno";
    public static final String BILLDATE = "billdate";
    public static final String SYSCODE = "syscode";
    public static final String SRC_SYSCODE = "src_syscode";
    public static final String BILLSTATUS = "billstatus";
    public static final String BILLMAKER = "billmaker";
    public static final String APPROVER = "approver";
    public static final String APPROVEDATE = "approvedate";
    public static final String LASTADJUSTUSER = "lastadjustuser";
    public static final String PK_BUSITYPE = "pk_busitype";
    public static final String MONEY = "money";
    public static final String LOCAL_MONEY = "local_money";
    public static final String BILLYEAR = "billyear";
    public static final String BILLPERIOD = "billperiod";
    public static final String SCOMMENT = "scomment";
    public static final String EFFECTSTATUS = "effectstatus";
    public static final String EFFECTUSER = "effectuser";
    public static final String EFFECTDATE = "effectdate";
    public static final String LASTAPPROVEID = "lastapproveid";
    public static final String DEF1 = "def1";
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
    public static final String TALLYDATE = "tallydate";
    public static final String GROUPLOCAL = "grouplocal";
    public static final String GLOBALLOCAL = "globallocal";
    public static final String RATE = "rate";
    public static final String GROUPRATE = "grouprate";
    public static final String GLOBALRATE = "globalrate";
    public static final String CHECKELEMENT = "checkelement";
    public static final String OBJTYPE = "objtype";
    public static final String SO_DEPTID = "so_deptid";
    public static final String SO_PSNDOC = "so_psndoc";
    public static final String SO_ORG = "so_org";
    public static final String CASHITEM = "cashitem";
    public static final String BANKROLLPROJET = "bankrollprojet";
    public static final String PK_DEPTID = "pk_deptid";
    public static final String PK_PSNDOC = "pk_psndoc";
    public static final String CUSTOMER = "customer";
    public static final String PK_CURRTYPE = "pk_currtype";
    public static final String PK_BALATYPE = "pk_balatype";
    public static final String PAYACCOUNT = "payaccount";
    public static final String RECACCOUNT = "recaccount";
    public static final String SO_ORG_V = "so_org_v";
    public static final String COORDFLAG = "coordflag";
    private String pk_cuspayablebill;

    public String getParentPK() {
        return this.getPk_cuspayablebill();
    }

    public String getPk_cuspayablebill() {
        return this.pk_cuspayablebill;
    }

    public void setParentPK(String newParentPK) {
        this.setPk_cuspayablebill(newParentPK);
    }

    public void setPk_cuspayablebill(String newParentPK) {
        this.pk_cuspayablebill = newParentPK;
    }

    public String getParentPKFieldName() {
        return null;
    }

    public String getPKFieldName() {
        return PK_CUSPAYABLEBILL;
    }

    public String getTableName() {
        return "ap_cuspayablebill";
    }

    public CusPayableBillVO() {
        this.setBillclass("yf");
    }

    public IVOMeta getMetaData() {
        IVOMeta meta = VOMetaFactory.getInstance().getVOMeta("arap.cuspayablebill");
        return meta;
    }
}

