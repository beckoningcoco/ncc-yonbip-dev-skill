/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory
 */
package nc.vo.arap.receivable;

import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.pub.IVOMeta;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class ReceivableBillVO
extends BaseBillVO {
    private static final long serialVersionUID = 1L;
    private String pk_recbill;
    private static final String TABLE_NAME = "ar_recbill";
    public static final String PK_ORG_V = "pk_org_v";
    public static final String PK_FIORG_V = "pk_fiorg_v";
    public static final String PK_PCORG_V = "pk_pcorg_v";
    public static final String SETT_ORG_V = "sett_org_v";
    public static final String PK_ORG = "pk_org";
    public static final String PK_FIORG = "pk_fiorg";
    public static final String PK_PCORG = "pk_pcorg";
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
    public static final String CUSTDELEGATE = "custdelegate";
    public static final String PK_CORP = "pk_corp";
    public static final String MODIFIER = "modifier";
    public static final String PK_TRADETYPE = "pk_tradetype";
    public static final String PK_TRADETYPEID = "pk_tradetypeid";
    public static final String BILLCLASS = "billclass";
    public static final String PK_RECBILL = "pk_recbill";
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
    public static final String SIGNUSER = "signuser";
    public static final String SIGNYEAR = "signyear";
    public static final String SIGNPERIOD = "signperiod";
    public static final String SIGNDATE = "signdate";
    public static final String PK_BUSITYPE = "pk_busitype";
    public static final String MONEY = "money";
    public static final String LOCAL_MONEY = "local_money";
    public static final String RATE = "rate";
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
    public static final String GROUPRATE = "grouprate";
    public static final String GLOBALRATE = "globalrate";
    public static final String CHECKELEMENT = "checkelement";
    public static final String SO_DEPTID = "so_deptid";
    public static final String SO_PSNDOC = "so_psndoc";
    public static final String SO_ORG = "so_org";
    public static final String SO_ORG_V = "so_org_v";
    public static final String PK_RESCENTER = "pk_rescenter";
    public static final String PK_DEPTID_RES = "pk_deptid_res";
    public static final String CASHITEM = "cashitem";
    public static final String BANKROLLPROJET = "bankrollprojet";
    public static final String PK_DEPTID = "pk_deptid";
    public static final String PK_PSNDOC = "pk_psndoc";
    public static final String CUSTOMER = "customer";
    public static final String SUPPLIER = "supplier";
    public static final String PK_CURRTYPE = "pk_currtype";
    public static final String PK_SUBJCODE = "pk_subjcode";
    public static final String OBJTYPE = "objtype";
    public static final String RECACCOUNT = "recaccount";
    public static final String PAYACCOUNT = "payaccount";
    public static final String COORDFLAG = "coordflag";
    public static final String INNER_EFFECT_DATE = "inner_effect_date";
    public static final String BUSIDATE = "busidate";
    public static final String ISREFUND = "isrefund";
    public static final String INVOICENO = "invoiceno";
    public static final String TOTAL_PERIOD = "total_period";
    public static final String START_PERIOD = "start_period";
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
    public static final String SAGA_FROZEN = "saga_frozen";
    public static final String SAGA_GTXID = "saga_gtxid";
    public static final String SAGA_BTXID = "saga_btxid";
    public static final String SAGA_STATUS = "saga_status";
    public static final String PK_RATETYPE = "pk_ratetype";
    public static final String RATEDATE = "ratedate";
    public static final String CUSTOMER_V = "customer_v";
    public static final String ORDERCUBASDOC_V = "ordercubasdoc_v";
    public static final String SUPPLIER_V = "supplier_v";
    public static final String PARAM_DRIVEACTION = "driveaction";

    public String getParentPKFieldName() {
        return null;
    }

    public String getPKFieldName() {
        return PK_RECBILL;
    }

    public String getTableName() {
        return TABLE_NAME;
    }

    public IVOMeta getMetaData() {
        IVOMeta meta = VOMetaFactory.getInstance().getVOMeta("arap.recbill");
        return meta;
    }

    public String getPk_recbill() {
        return this.pk_recbill;
    }

    public void setPk_recbill(String pkRecbill) {
        this.pk_recbill = pkRecbill;
    }

    public static String getDefaultTable() {
        return TABLE_NAME;
    }
}

