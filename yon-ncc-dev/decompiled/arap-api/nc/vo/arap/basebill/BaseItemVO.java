/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.lang.UFLiteralDate
 *  nccloud.commons.lang.StringUtils
 */
package nc.vo.arap.basebill;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import nc.bs.logging.Logger;
import nc.vo.arap.basebill.IArapItemFieldVO;
import nc.vo.arap.basebill.IArapMoneyFieldVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.termitem.TermVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.lang.UFLiteralDate;
import nccloud.commons.lang.StringUtils;

public abstract class BaseItemVO
extends SuperVO
implements IArapItemFieldVO,
IArapMoneyFieldVO {
    private static final long serialVersionUID = 1L;
    private static final String[] moneyFieldsForAddBal = new String[]{"quantity_cr", "money_cr", "local_money_cr", "groupcrebit", "globalcrebit"};
    private static final String[] isdebitMoneyFieldsForAddBal = new String[]{"quantity_de", "money_de", "local_money_de", "groupdebit", "globaldebit"};
    private static final String[] MoneyFieldsBal = new String[]{"quantity_bal", "money_bal", "local_money_bal", "groupbalance", "globalbalance"};
    private static final String[] SKMoneyFields = new String[]{"quantity_cr", "local_money_cr", "notax_cr", "money_cr", "money_bal", "local_money_bal", "quantity_bal", "local_tax_cr", "local_notax_cr", "grouptax_cre", "groupnotax_cre", "groupcrebit", "globalcrebit", "globaltax_cre", "globalnotax_cre"};
    private static final String[] FKMoneyFields = new String[]{"money_de", "local_money_de", "quantity_de", "money_bal", "local_money_bal", "quantity_bal", "local_tax_de", "notax_de", "local_notax_de", "grouptax_de", "groupnotax_de", "groupdebit", "globaltax_de", "globalnotax_de", "globaldebit"};
    private static final String[] YFandZFMoneyFields = new String[]{"quantity_cr", "local_money_cr", "notax_cr", "money_cr", "money_bal", "local_money_bal", "quantity_bal", "local_tax_cr", "local_notax_cr", "grouptax_cre", "groupnotax_cre", "groupcrebit", "globalcrebit", "globaltax_cre", "globalnotax_cre", "caltaxmny", "nosubtax"};
    private static final String[] YSandZSMoneyFields = new String[]{"money_de", "local_money_de", "quantity_de", "money_bal", "local_money_bal", "quantity_bal", "local_tax_de", "notax_de", "local_notax_de", "grouptax_de", "groupnotax_de", "groupdebit", "globaltax_de", "globalnotax_de", "globaldebit", "caltaxmny", "nosubtax"};
    private static final String[] RedundancyFields = new String[]{"pk_org_v", "sett_org", "sett_org_v", "pk_group", "billdate", "pk_tradetype", "pk_tradetypeid", "pk_billtype", "billclass", "billno"};
    public static final List<String> MONEYPARTFIELD_LIST = Arrays.asList("money_de", "local_money_de", "money_bal", "local_money_bal", "local_tax_de", "notax_de", "local_notax_de", "groupdebit", "grouptax_de", "groupnotax_de", "globaldebit", "globaltax_de", "globalnotax_de", "local_money_cr", "money_cr", "local_tax_cr", "notax_cr", "local_notax_cr", "groupcrebit", "grouptax_cre", "groupnotax_cre", "globalcrebit", "globaltax_cre", "globalnotax_cre", "occupationmny", "taxprice", "caltaxmny", "nosubtax");
    public static final List<String> MONEYFIELD_LIST = Arrays.asList("money_de", "local_money_de", "quantity_de", "money_bal", "local_money_bal", "quantity_bal", "local_tax_de", "notax_de", "local_notax_de", "groupdebit", "grouptax_de", "groupnotax_de", "globaldebit", "globaltax_de", "globalnotax_de", "quantity_cr", "local_money_cr", "money_cr", "local_tax_cr", "notax_cr", "local_notax_cr", "groupcrebit", "grouptax_cre", "groupnotax_cre", "globalcrebit", "globaltax_cre", "globalnotax_cre", "occupationmny", "price", "groupbalance", "globalbalance", "taxprice", "caltaxmny", "nosubtax");
    public static final List<String> MONEYFIELD_LIST_NORMAL = Arrays.asList("money_de", "money_bal", "notax_de", "money_cr", "notax_cr", "occupationmny", "caltaxmny", "nosubtax");
    public static final List<String> MONEYFIELD_LIST_LOCAL = Arrays.asList("local_money_de", "local_money_bal", "local_tax_de", "local_notax_de", "local_money_cr", "local_tax_cr", "local_notax_cr");
    public static final List<String> MONEYFIELD_LIST_GROUP = Arrays.asList("groupdebit", "grouptax_de", "groupnotax_de", "groupcrebit", "grouptax_cre", "groupnotax_cre", "groupbalance");
    public static final List<String> MONEYFIELD_LIST_GLOBAL = Arrays.asList("globaldebit", "globaltax_de", "globalnotax_de", "globalcrebit", "globaltax_cre", "globalnotax_cre", "globalbalance");
    public static final List<String> MONEYFIELD_LIST_QUANTITY = Arrays.asList("quantity_de", "quantity_bal", "quantity_cr");
    public static final List<String> MONEYFIELD_LIST_PRICE = Arrays.asList("price", "taxprice");
    public static final List<String> RATEFIELD_LIST = Arrays.asList("rate", "grouprate", "globalrate");
    public static final String FB = "fb.";
    private TermVO[] term;
    private SuperVO settleBody = null;
    protected Integer prepay = 0;
    private UFDouble money_de = UFDouble.ZERO_DBL;
    private UFDouble money_cr = UFDouble.ZERO_DBL;
    private UFDouble money_bal = UFDouble.ZERO_DBL;
    private UFDouble local_money_bal = UFDouble.ZERO_DBL;
    private UFDouble local_money_de = UFDouble.ZERO_DBL;
    private UFDouble local_money_cr = UFDouble.ZERO_DBL;
    private UFDouble local_notax_de = UFDouble.ZERO_DBL;
    private UFDouble local_notax_cr = UFDouble.ZERO_DBL;
    private UFDouble local_tax_de = UFDouble.ZERO_DBL;
    private UFDouble local_tax_cr = UFDouble.ZERO_DBL;
    private UFDouble price;
    private UFDouble taxprice;
    private UFDouble local_price;
    private UFDouble local_taxprice;
    private UFDouble taxrate = UFDouble.ZERO_DBL;
    private UFDouble notax_de = UFDouble.ZERO_DBL;
    private UFDouble notax_cr = UFDouble.ZERO_DBL;
    private UFDouble quantity_bal;
    private UFDouble quantity_de;
    private UFDouble quantity_cr;
    private UFDouble groupbalance = UFDouble.ZERO_DBL;
    private UFDouble groupdebit = UFDouble.ZERO_DBL;
    private UFDouble groupcrebit = UFDouble.ZERO_DBL;
    private UFDouble grouptax_de = UFDouble.ZERO_DBL;
    private UFDouble grouptax_cre = UFDouble.ZERO_DBL;
    private UFDouble groupnotax_de = UFDouble.ZERO_DBL;
    private UFDouble groupnotax_cre = UFDouble.ZERO_DBL;
    private UFDouble globaldebit = UFDouble.ZERO_DBL;
    private UFDouble globalbalance = UFDouble.ZERO_DBL;
    private UFDouble globaltax_de = UFDouble.ZERO_DBL;
    private UFDouble globalnotax_de = UFDouble.ZERO_DBL;
    private UFDouble globaltax_cre = UFDouble.ZERO_DBL;
    private UFDouble globalnotax_cre = UFDouble.ZERO_DBL;
    private UFDouble occupationmny = UFDouble.ZERO_DBL;
    private UFDouble rate = UFDouble.ZERO_DBL;
    private UFDouble grouprate = UFDouble.ZERO_DBL;
    private UFDouble globalrate = UFDouble.ZERO_DBL;
    private UFDouble agentreceiveprimal = UFDouble.ZERO_DBL;
    private UFDouble agentreceivelocal = UFDouble.ZERO_DBL;
    private UFDouble groupagentreceivelocal = UFDouble.ZERO_DBL;
    private UFDouble globalagentreceivelocal = UFDouble.ZERO_DBL;
    private String commpayer;
    private Integer coordflag;
    private Integer rowtype;
    private String pk_rescenter;
    private UFBoolean ispaytermmodified;
    private UFBoolean isrefused = UFBoolean.FALSE;
    private String refuse_reason;
    private String pk_corp;
    private String pk_fiorg;
    private String pk_pcorg;
    private String pk_pcorg_v;
    private String pk_org_v;
    private String pk_fiorg_v;
    private String so_ordertype;
    private String so_transtype;
    private String so_org;
    private String pu_org;
    private String pu_psndoc;
    private String pu_deptid;
    private String so_psndoc;
    private String so_deptid;
    private String material;
    private String postunit;
    private UFDouble postpricenotax;
    private UFDouble postquantity;
    private UFDouble postprice;
    private String project;
    private String project_task;
    private String dealno;
    private String equipmentcode;
    private String productline;
    private String cashitem;
    private String bankrollprojet;
    private UFBoolean pausetransact = UFBoolean.FALSE;
    private UFDate billdate;
    private String pk_org;
    private String pk_group;
    private String pk_billtype;
    private String billclass;
    private String pk_tradetype;
    private String pk_tradetypeid;
    private UFDate busidate;
    private String pk_deptid_res;
    private String pk_subjcode;
    private String billno;
    private Integer objtype;
    private Integer rowno;
    private Integer direction;
    private String pk_ssitem;
    private String scomment;
    private String subjcode;
    private String pk_currtype;
    private String pk_deptid;
    private String pk_deptid_v;
    private String pu_deptid_v;
    private String so_deptid_v;
    private String pk_psndoc;
    private String taxnum;
    private String top_billid;
    private String top_itemid;
    private String top_billtype;
    private String top_termch;
    private String top_tradetype;
    private String src_tradetype;
    private String src_billtype;
    private String src_billid;
    private String src_itemid;
    private Integer taxtype;
    private String pk_payterm;
    private String payaccount;
    private String recaccount;
    private String cashaccount;
    private String ordercubasdoc;
    private String innerorderno;
    private String assetpactno;
    private String contractno;
    private String freecust;
    private String purchaseorder;
    private String checkelement;
    private String invoiceno;
    private String outstoreno;
    private String pk_jobphase;
    private String pk_job;
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
    private Integer dr;
    private UFDateTime ts;
    private UFDateTime top_changets;
    private UFDateTime top_changeitemts;
    private String cbs;
    private UFBoolean insurance;
    private UFBoolean isurgent;
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
    private UFBoolean direct_checkno;
    private String pk_ratetype;
    private UFLiteralDate ratedate;
    private String customer_v;
    private String ordercubasdoc_v;
    private String supplier_v;
    private String so_org_v;
    private String sett_org;
    private String pu_org_v;
    private String sett_org_v;
    private String pk_billfiorg;
    private UFDouble globalcrebit;
    private UFDouble forcemoney;
    private Integer forcestatus;
    private UFDate forcestart;
    private UFDate forceend;
    private String bankrelated_code;
    private String checkdirection;
    private String checkno;
    private String checktype;
    private String dstlsubcs;
    private String facard;
    private UFBoolean isverifyfinished;
    private String itemstyle;
    private UFDate paydate;
    private Integer payflag;
    private String payman;
    private String pk_balatype;
    private String pk_bankreceive;
    private String pk_inventory;
    private String produceorder;
    private String projectelement;
    private String seqnum;
    private String supplier;
    private String customer;
    private UFDate transferdate;
    private Integer transferflag;
    private UFDate verifyfinisheddate;
    private Integer commpaytype;
    private Integer commpaystatus;
    private String confernum;
    private String costcenter;
    private String rececountryid;
    private String sendcountryid;
    private Integer buysellflag;
    private UFBoolean triatradeflag;
    private String vatcode;
    private String custvatcode;
    private String taxcodeid;
    private UFDouble caltaxmny;
    private UFDouble nosubtaxrate;
    private UFDouble nosubtax;
    private UFBoolean opptaxflag;
    private String vendorvatcode;
    private String material_src;
    private String matcustcode;
    private UFDouble settlemoney;
    private String settlecurr;
    private UFBoolean isdiscount;
    private String batchcode;
    private String pk_batchcode;
    private String pk_recpaytype;

    public String[] getRedundancyFields() {
        return RedundancyFields;
    }

    public static String[] getMoneyFieldsBal(boolean isdebit) {
        return MoneyFieldsBal;
    }

    public static String[] getMoneyFieldsForAddBal(boolean isdebit) {
        if (isdebit) {
            return isdebitMoneyFieldsForAddBal;
        }
        return moneyFieldsForAddBal;
    }

    @Override
    public String[] getMoneyFields(String billclass) {
        String[] fields = new String[]{};
        if (billclass.equals("ys") || billclass.equals("zs")) {
            fields = YSandZSMoneyFields;
        } else if (billclass.equals("yf") || billclass.equals("zf")) {
            fields = YFandZFMoneyFields;
        } else if (billclass.equals("fk")) {
            fields = FKMoneyFields;
        } else if (billclass.equals("sk")) {
            fields = SKMoneyFields;
        }
        return fields;
    }

    public List<String> getMoneyFields() {
        return MONEYFIELD_LIST;
    }

    public List<String> getMoneyPartFields() {
        return MONEYPARTFIELD_LIST;
    }

    public List<String> getRateFields() {
        return RATEFIELD_LIST;
    }

    public String getPrimaryKey() {
        return (String)this.getAttributeValue(this.getPKFieldName());
    }

    public UFBoolean getDirect_checkno() {
        return this.direct_checkno;
    }

    public void setDirect_checkno(UFBoolean direct_checkno) {
        this.direct_checkno = direct_checkno;
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

    public UFBoolean getInsurance() {
        return this.insurance;
    }

    public void setInsurance(UFBoolean insurance) {
        this.insurance = insurance;
    }

    public String getCbs() {
        return this.cbs;
    }

    public void setCbs(String cbs) {
        this.cbs = cbs;
    }

    public String getPk_recpaytype() {
        return this.pk_recpaytype;
    }

    public void setPk_recpaytype(String pkRecpaytype) {
        this.pk_recpaytype = pkRecpaytype;
    }

    public Object getAttributeValue(String name) {
        if (StringUtils.isEmpty((CharSequence)name)) {
            Logger.error((Object)(name + " \u7a7a\u5b57\u6bb5"), this.getClass(), (String)"getAttributeValue");
            return null;
        }
        Object value = null;
        value = name.startsWith(FB) ? (this.settleBody == null ? null : this.settleBody.getAttributeValue(name.split("\\.")[1])) : super.getAttributeValue(name);
        if (value == null) {
            if (this.getMoneyPartFields().contains(name)) {
                value = UFDouble.ZERO_DBL;
            } else if (name.equals("insurance")) {
                return this.getInsurance();
            }
            if (name.equals("prepay")) {
                return this.getPrepay();
            }
        }
        return value;
    }

    public void setAttributeValue(String name, Object value) {
        if (value == null) {
            if (this.getMoneyPartFields().contains(name)) {
                value = UFDouble.ZERO_DBL;
            } else {
                super.setAttributeValue(name, value);
                return;
            }
        }
        super.setAttributeValue(name, value);
    }

    public void setAttributeValue2(String name, Object value) {
        if (value == null && this.getMoneyPartFields().contains(name)) {
            value = UFDouble.ZERO_DBL;
        }
        super.setAttributeValue(name, value);
    }

    public SuperVO getSettleBody() {
        return this.settleBody;
    }

    public void setSettleBody(SuperVO settleBody) {
        this.settleBody = settleBody;
    }

    public BaseItemVO() {
        this.taxtype = BillEnumCollection.TaxType.TAXOUT.VALUE;
        this.insurance = UFBoolean.FALSE;
        this.direct_checkno = UFBoolean.FALSE;
        this.globalcrebit = UFDouble.ZERO_DBL;
        this.forcemoney = UFDouble.ZERO_DBL;
        this.caltaxmny = UFDouble.ZERO_DBL;
        this.nosubtaxrate = UFDouble.ZERO_DBL;
        this.nosubtax = UFDouble.ZERO_DBL;
        this.settlemoney = UFDouble.ZERO_DBL;
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        }
        catch (Exception e) {
            throw new RuntimeException("clone not supported!");
        }
        BaseItemVO children = (BaseItemVO)obj;
        return children;
    }

    public TermVO[] getTerm() {
        return this.term;
    }

    public void setTerm(TermVO[] term) {
        this.term = term;
    }

    @Override
    public Integer getPrepay() {
        return this.prepay;
    }

    @Override
    public void setPrepay(Integer newPrepay) {
        this.prepay = newPrepay == null ? Integer.valueOf(0) : newPrepay;
    }

    @Override
    public String getCheckdirection() {
        return this.checkdirection;
    }

    @Override
    public String getCheckno() {
        return this.checkno;
    }

    @Override
    public String getChecktype() {
        return this.checktype;
    }

    @Override
    public String getDstlsubcs() {
        return this.dstlsubcs;
    }

    @Override
    public String getFacard() {
        return this.facard;
    }

    @Override
    public UFBoolean getIsverifyfinished() {
        return this.isverifyfinished;
    }

    @Override
    public String getItemstyle() {
        return this.itemstyle;
    }

    @Override
    public UFDouble getLocal_money_cr() {
        return this.local_money_cr;
    }

    @Override
    public UFDouble getMoney_cr() {
        return this.money_cr;
    }

    @Override
    public UFDouble getOccupationmny() {
        return this.occupationmny;
    }

    @Override
    public UFDate getPaydate() {
        return this.paydate;
    }

    @Override
    public Integer getPayflag() {
        return this.payflag;
    }

    @Override
    public String getPayman() {
        return this.payman;
    }

    @Override
    public String getPk_balatype() {
        return this.pk_balatype;
    }

    @Override
    public String getPk_bankreceive() {
        return this.pk_bankreceive;
    }

    @Override
    public String getPk_inventory() {
        return this.pk_inventory;
    }

    @Override
    public String getProduceorder() {
        return this.produceorder;
    }

    @Override
    public String getProjectelement() {
        return this.projectelement;
    }

    @Override
    public UFDouble getQuantity_cr() {
        return this.quantity_cr;
    }

    @Override
    public String getSeqnum() {
        return this.seqnum;
    }

    @Override
    public String getSupplier() {
        return this.supplier;
    }

    @Override
    public UFDate getTransferdate() {
        return this.transferdate;
    }

    @Override
    public Integer getTransferflag() {
        return this.transferflag;
    }

    @Override
    public UFDate getVerifyfinisheddate() {
        return this.verifyfinisheddate;
    }

    @Override
    public void setCheckdirection(String checkdirection) {
        this.checkdirection = checkdirection;
    }

    @Override
    public void setCheckno(String checkno) {
        this.checkno = checkno;
    }

    @Override
    public void setChecktype(String checktype) {
        this.checktype = checktype;
    }

    @Override
    public void setDstlsubcs(String dstlsubcs) {
        this.dstlsubcs = dstlsubcs;
    }

    @Override
    public void setFacard(String facard) {
        this.facard = facard;
    }

    @Override
    public void setIsverifyfinished(UFBoolean isverifyfinished) {
        this.isverifyfinished = isverifyfinished;
    }

    @Override
    public void setItemstyle(String itemstyle) {
        this.itemstyle = itemstyle;
    }

    @Override
    public void setLocal_money_cr(UFDouble local_money_cr) {
        this.local_money_cr = local_money_cr;
    }

    @Override
    public void setMoney_cr(UFDouble money_cr) {
        this.money_cr = money_cr;
    }

    @Override
    public void setOccupationmny(UFDouble occupationmny) {
        this.occupationmny = occupationmny;
    }

    @Override
    public void setPaydate(UFDate paydate) {
        this.paydate = paydate;
    }

    @Override
    public void setPayflag(Integer payflag) {
        this.payflag = payflag;
    }

    @Override
    public void setPayman(String payman) {
        this.payman = payman;
    }

    @Override
    public void setPk_balatype(String pk_balatype) {
        this.pk_balatype = pk_balatype;
    }

    @Override
    public void setPk_bankreceive(String pk_bankreceive) {
        this.pk_bankreceive = pk_bankreceive;
    }

    @Override
    public void setPk_inventory(String pk_inventory) {
        this.pk_inventory = pk_inventory;
    }

    @Override
    public void setProduceorder(String produceorder) {
        this.produceorder = produceorder;
    }

    @Override
    public void setProject(String project) {
        this.project = project;
    }

    public String getProject_task() {
        return this.project_task;
    }

    public void setProject_task(String projectTask) {
        this.project_task = projectTask;
    }

    @Override
    public void setProjectelement(String projectelement) {
        this.projectelement = projectelement;
    }

    @Override
    public void setQuantity_cr(UFDouble quantity_cr) {
        this.quantity_cr = quantity_cr;
    }

    @Override
    public void setSeqnum(String seqnum) {
        this.seqnum = seqnum;
    }

    @Override
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public void setTransferdate(UFDate transferdate) {
        this.transferdate = transferdate;
    }

    @Override
    public void setTransferflag(Integer transferflag) {
        this.transferflag = transferflag;
    }

    @Override
    public void setVerifyfinisheddate(UFDate verifyfinisheddate) {
        this.verifyfinisheddate = verifyfinisheddate;
    }

    public UFDouble getLocal_tax_cr() {
        return this.local_tax_cr;
    }

    public void setLocal_tax_cr(UFDouble local_tax_cr) {
        this.local_tax_cr = local_tax_cr;
    }

    public UFDouble getNotax_cr() {
        return this.notax_cr;
    }

    public void setNotax_cr(UFDouble notax_cr) {
        this.notax_cr = notax_cr;
    }

    public UFDouble getLocal_notax_cr() {
        return this.local_notax_cr;
    }

    public void setLocal_notax_cr(UFDouble local_notax_cr) {
        this.local_notax_cr = local_notax_cr;
    }

    @Override
    public String getCustomer() {
        return this.customer;
    }

    @Override
    public UFDouble getLocal_money_de() {
        return this.local_money_de;
    }

    @Override
    public UFDouble getLocal_notax_de() {
        return this.local_notax_de;
    }

    @Override
    public UFDouble getLocal_tax_de() {
        return this.local_tax_de;
    }

    @Override
    public UFDouble getMoney_de() {
        return this.money_de;
    }

    @Override
    public UFDouble getNotax_de() {
        return this.notax_de;
    }

    @Override
    public UFDouble getQuantity_de() {
        return this.quantity_de;
    }

    @Override
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public void setLocal_money_de(UFDouble local_money_de) {
        this.local_money_de = local_money_de;
    }

    @Override
    public void setLocal_notax_de(UFDouble local_notax_de) {
        this.local_notax_de = local_notax_de;
    }

    @Override
    public void setLocal_tax_de(UFDouble local_tax_de) {
        this.local_tax_de = local_tax_de;
    }

    @Override
    public void setMoney_de(UFDouble money_de) {
        this.money_de = money_de;
    }

    @Override
    public void setNotax_de(UFDouble notax_de) {
        this.notax_de = notax_de;
    }

    @Override
    public void setQuantity_de(UFDouble quantity_de) {
        this.quantity_de = quantity_de;
    }

    @Override
    public void setCoordflag(Integer coordflag) {
        this.coordflag = coordflag;
    }

    @Override
    public void setRowtype(Integer rowtype) {
        this.rowtype = rowtype;
    }

    @Override
    public UFBoolean getIspaytermmodified() {
        return this.ispaytermmodified;
    }

    public UFBoolean getIsrefused() {
        return this.isrefused;
    }

    public void setIsrefused(UFBoolean isrefused) {
        this.isrefused = isrefused;
    }

    public String getRefuse_reason() {
        return this.refuse_reason;
    }

    public void setRefuse_reason(String refuseReason) {
        this.refuse_reason = refuseReason;
    }

    @Override
    public String getPk_rescenter() {
        return this.pk_rescenter;
    }

    @Override
    public void setIspaytermmodified(UFBoolean ispaytermmodified) {
        this.ispaytermmodified = ispaytermmodified;
    }

    @Override
    public void setPk_rescenter(String pk_rescenter) {
        this.pk_rescenter = pk_rescenter;
    }

    public String getPk_corp() {
        return this.pk_corp;
    }

    public void setPk_corp(String pk_corp) {
        this.pk_corp = pk_corp;
    }

    public String getPk_fiorg() {
        return this.pk_fiorg;
    }

    public void setPk_fiorg(String pk_fiorg) {
        this.pk_fiorg = pk_fiorg;
    }

    public String getPk_pcorg() {
        return this.pk_pcorg;
    }

    public void setPk_pcorg(String pk_pcorg) {
        this.pk_pcorg = pk_pcorg;
    }

    public String getPk_pcorg_v() {
        return this.pk_pcorg_v;
    }

    public void setPk_pcorg_v(String pk_pcorg_v) {
        this.pk_pcorg_v = pk_pcorg_v;
    }

    public String getPk_org_v() {
        return this.pk_org_v;
    }

    public void setPk_org_v(String pk_org_v) {
        this.pk_org_v = pk_org_v;
    }

    public String getPk_fiorg_v() {
        return this.pk_fiorg_v;
    }

    public void setPk_fiorg_v(String pk_fiorg_v) {
        this.pk_fiorg_v = pk_fiorg_v;
    }

    public String getSo_ordertype() {
        return this.so_ordertype;
    }

    public void setSo_ordertype(String so_ordertype) {
        this.so_ordertype = so_ordertype;
    }

    public String getSo_transtype() {
        return this.so_transtype;
    }

    public void setSo_transtype(String so_transtype) {
        this.so_transtype = so_transtype;
    }

    public String getSo_org() {
        return this.so_org;
    }

    public void setSo_org(String so_org) {
        this.so_org = so_org;
    }

    public String getPu_org() {
        return this.pu_org;
    }

    public void setPu_org(String pu_org) {
        this.pu_org = pu_org;
    }

    public String getPu_psndoc() {
        return this.pu_psndoc;
    }

    public void setPu_psndoc(String pu_psndoc) {
        this.pu_psndoc = pu_psndoc;
    }

    public String getPu_deptid() {
        return this.pu_deptid;
    }

    public void setPu_deptid(String pu_deptid) {
        this.pu_deptid = pu_deptid;
    }

    public String getSo_psndoc() {
        return this.so_psndoc;
    }

    public void setSo_psndoc(String so_psndoc) {
        this.so_psndoc = so_psndoc;
    }

    public String getSo_deptid() {
        return this.so_deptid;
    }

    public void setSo_deptid(String so_deptid) {
        this.so_deptid = so_deptid;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getPostunit() {
        return this.postunit;
    }

    @Override
    public void setPostunit(String postunit) {
        this.postunit = postunit;
    }

    @Override
    public UFDouble getPostpricenotax() {
        return this.postpricenotax;
    }

    @Override
    public void setPostpricenotax(UFDouble postpricenotax) {
        this.postpricenotax = postpricenotax;
    }

    @Override
    public UFDouble getPostquantity() {
        return this.postquantity;
    }

    @Override
    public void setPostquantity(UFDouble postquantity) {
        this.postquantity = postquantity;
    }

    @Override
    public UFDouble getPostprice() {
        return this.postprice;
    }

    @Override
    public void setPostprice(UFDouble postprice) {
        this.postprice = postprice;
    }

    public String getProject() {
        return this.project;
    }

    @Override
    public Integer getCoordflag() {
        return this.coordflag;
    }

    public String getDealno() {
        return this.dealno;
    }

    public void setDealno(String dealno) {
        this.dealno = dealno;
    }

    @Override
    public String getEquipmentcode() {
        return this.equipmentcode;
    }

    @Override
    public void setEquipmentcode(String equipmentcode) {
        this.equipmentcode = equipmentcode;
    }

    @Override
    public String getProductline() {
        return this.productline;
    }

    @Override
    public void setProductline(String productline) {
        this.productline = productline;
    }

    @Override
    public String getCashitem() {
        return this.cashitem;
    }

    @Override
    public void setCashitem(String cashitem) {
        this.cashitem = cashitem;
    }

    @Override
    public String getBankrollprojet() {
        return this.bankrollprojet;
    }

    @Override
    public void setBankrollprojet(String bankrollprojet) {
        this.bankrollprojet = bankrollprojet;
    }

    @Override
    public UFBoolean getPausetransact() {
        return this.pausetransact;
    }

    @Override
    public void setPausetransact(UFBoolean pausetransact) {
        this.pausetransact = pausetransact;
    }

    @Override
    public UFDate getBilldate() {
        return this.billdate;
    }

    @Override
    public void setBilldate(UFDate billdate) {
        this.billdate = billdate;
    }

    @Override
    public String getPk_group() {
        return this.pk_group;
    }

    @Override
    public void setPk_group(String pk_group) {
        this.pk_group = pk_group;
    }

    @Override
    public String getPk_org() {
        return this.pk_org;
    }

    @Override
    public void setPk_org(String pk_org) {
        this.pk_org = pk_org;
    }

    @Override
    public String getPk_billtype() {
        return this.pk_billtype;
    }

    @Override
    public void setPk_billtype(String pk_billtype) {
        this.pk_billtype = pk_billtype;
    }

    @Override
    public String getBillclass() {
        return this.billclass;
    }

    @Override
    public void setBillclass(String billclass) {
        this.billclass = billclass;
    }

    @Override
    public String getPk_tradetype() {
        return this.pk_tradetype;
    }

    @Override
    public void setPk_tradetype(String pk_tradetype) {
        this.pk_tradetype = pk_tradetype;
    }

    public String getPk_tradetypeid() {
        return this.pk_tradetypeid;
    }

    public void setPk_tradetypeid(String pk_tradetypeid) {
        this.pk_tradetypeid = pk_tradetypeid;
    }

    @Override
    public UFDate getBusidate() {
        return this.busidate;
    }

    @Override
    public void setBusidate(UFDate busidate) {
        this.busidate = busidate;
    }

    @Override
    public String getPk_deptid_res() {
        return this.pk_deptid_res;
    }

    @Override
    public void setPk_deptid_res(String pk_deptid_res) {
        this.pk_deptid_res = pk_deptid_res;
    }

    @Override
    public String getPk_subjcode() {
        return this.pk_subjcode;
    }

    @Override
    public void setPk_subjcode(String pk_subjcode) {
        this.pk_subjcode = pk_subjcode;
    }

    @Override
    public String getBillno() {
        return this.billno;
    }

    @Override
    public void setBillno(String billno) {
        this.billno = billno;
    }

    @Override
    public Integer getObjtype() {
        return this.objtype;
    }

    @Override
    public void setObjtype(Integer objtye) {
        this.objtype = objtye;
    }

    @Override
    public Integer getRowno() {
        return this.rowno;
    }

    @Override
    public void setRowno(Integer rowno) {
        this.rowno = rowno;
    }

    @Override
    public Integer getRowtype() {
        return this.rowtype;
    }

    @Override
    public Integer getDirection() {
        return this.direction;
    }

    @Override
    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    @Override
    public String getPk_ssitem() {
        return this.pk_ssitem;
    }

    @Override
    public void setPk_ssitem(String pk_ssitem) {
        this.pk_ssitem = pk_ssitem;
    }

    @Override
    public String getScomment() {
        return this.scomment;
    }

    @Override
    public void setScomment(String scomment) {
        this.scomment = scomment;
    }

    @Override
    public String getSubjcode() {
        return this.subjcode;
    }

    @Override
    public void setSubjcode(String subjcode) {
        this.subjcode = subjcode;
    }

    @Override
    public String getPk_currtype() {
        return this.pk_currtype;
    }

    @Override
    public void setPk_currtype(String pk_currtype) {
        this.pk_currtype = pk_currtype;
    }

    @Override
    public UFDouble getRate() {
        return this.rate;
    }

    @Override
    public void setRate(UFDouble rate) {
        this.rate = rate;
    }

    @Override
    public String getPk_deptid() {
        return this.pk_deptid;
    }

    @Override
    public void setPk_deptid(String pk_deptid) {
        this.pk_deptid = pk_deptid;
    }

    public String getPk_deptid_v() {
        return this.pk_deptid_v;
    }

    public void setPk_deptid_v(String pkDeptidV) {
        this.pk_deptid_v = pkDeptidV;
    }

    public String getPu_deptid_v() {
        return this.pu_deptid_v;
    }

    public void setPu_deptid_v(String puDeptidV) {
        this.pu_deptid_v = puDeptidV;
    }

    public String getSo_deptid_v() {
        return this.so_deptid_v;
    }

    public void setSo_deptid_v(String soDeptidV) {
        this.so_deptid_v = soDeptidV;
    }

    @Override
    public String getPk_psndoc() {
        return this.pk_psndoc;
    }

    @Override
    public void setPk_psndoc(String pk_psndoc) {
        this.pk_psndoc = pk_psndoc;
    }

    @Override
    public UFDouble getMoney_bal() {
        return this.money_bal;
    }

    @Override
    public void setMoney_bal(UFDouble money_bal) {
        if (money_bal != null) {
            this.money_bal = money_bal;
        }
    }

    @Override
    public UFDouble getLocal_money_bal() {
        return this.local_money_bal;
    }

    @Override
    public void setLocal_money_bal(UFDouble local_money_bal) {
        this.local_money_bal = local_money_bal;
    }

    @Override
    public UFDouble getQuantity_bal() {
        return this.quantity_bal;
    }

    @Override
    public void setQuantity_bal(UFDouble quantity_bal) {
        this.quantity_bal = quantity_bal;
    }

    @Override
    public UFDouble getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(UFDouble price) {
        this.price = price;
    }

    @Override
    public UFDouble getTaxprice() {
        return this.taxprice;
    }

    @Override
    public void setTaxprice(UFDouble taxprice) {
        this.taxprice = taxprice;
    }

    @Override
    public UFDouble getTaxrate() {
        return this.taxrate;
    }

    @Override
    public void setTaxrate(UFDouble taxrate) {
        this.taxrate = taxrate;
    }

    @Override
    public String getTaxnum() {
        return this.taxnum;
    }

    @Override
    public void setTaxnum(String taxnum) {
        this.taxnum = taxnum;
    }

    @Override
    public String getTop_billid() {
        return this.top_billid;
    }

    @Override
    public void setTop_billid(String top_billid) {
        this.top_billid = top_billid;
    }

    @Override
    public String getTop_itemid() {
        return this.top_itemid;
    }

    @Override
    public void setTop_itemid(String top_itemid) {
        this.top_itemid = top_itemid;
    }

    public String getTop_termch() {
        return this.top_termch;
    }

    public void setTop_termch(String top_termch) {
        this.top_termch = top_termch;
    }

    @Override
    public String getTop_billtype() {
        return this.top_billtype;
    }

    @Override
    public void setTop_billtype(String top_billtype) {
        this.top_billtype = top_billtype;
    }

    @Override
    public String getTop_tradetype() {
        return this.top_tradetype;
    }

    @Override
    public void setTop_tradetype(String top_tradetype) {
        this.top_tradetype = top_tradetype;
    }

    @Override
    public String getSrc_tradetype() {
        return this.src_tradetype;
    }

    @Override
    public void setSrc_tradetype(String src_tradetype) {
        this.src_tradetype = src_tradetype;
    }

    @Override
    public String getSrc_billtype() {
        return this.src_billtype;
    }

    @Override
    public void setSrc_billtype(String src_billtype) {
        this.src_billtype = src_billtype;
    }

    @Override
    public String getSrc_billid() {
        return this.src_billid;
    }

    @Override
    public void setSrc_billid(String src_billid) {
        this.src_billid = src_billid;
    }

    @Override
    public String getSrc_itemid() {
        return this.src_itemid;
    }

    @Override
    public void setSrc_itemid(String src_itemid) {
        this.src_itemid = src_itemid;
    }

    @Override
    public Integer getTaxtype() {
        return this.taxtype;
    }

    @Override
    public void setTaxtype(Integer taxtype) {
        this.taxtype = taxtype;
    }

    @Override
    public String getPk_payterm() {
        return this.pk_payterm;
    }

    @Override
    public void setPk_payterm(String pk_payterm) {
        this.pk_payterm = pk_payterm;
    }

    @Override
    public String getPayaccount() {
        return this.payaccount;
    }

    @Override
    public void setPayaccount(String payaccount) {
        this.payaccount = payaccount;
    }

    @Override
    public String getRecaccount() {
        return this.recaccount;
    }

    @Override
    public void setRecaccount(String recaccount) {
        this.recaccount = recaccount;
    }

    public String getCashaccount() {
        return this.cashaccount;
    }

    public void setCashaccount(String cashaccount) {
        this.cashaccount = cashaccount;
    }

    @Override
    public String getOrdercubasdoc() {
        return this.ordercubasdoc;
    }

    @Override
    public void setOrdercubasdoc(String ordercubasdoc) {
        this.ordercubasdoc = ordercubasdoc;
    }

    @Override
    public String getInnerorderno() {
        return this.innerorderno;
    }

    @Override
    public void setInnerorderno(String innerorderno) {
        this.innerorderno = innerorderno;
    }

    @Override
    public String getAssetpactno() {
        return this.assetpactno;
    }

    @Override
    public void setAssetpactno(String assetpactno) {
        this.assetpactno = assetpactno;
    }

    @Override
    public String getContractno() {
        return this.contractno;
    }

    @Override
    public void setContractno(String contractno) {
        this.contractno = contractno;
    }

    @Override
    public String getFreecust() {
        return this.freecust;
    }

    @Override
    public void setFreecust(String freecust) {
        this.freecust = freecust;
    }

    @Override
    public String getPurchaseorder() {
        return this.purchaseorder;
    }

    @Override
    public void setPurchaseorder(String purchaseorder) {
        this.purchaseorder = purchaseorder;
    }

    @Override
    public String getInvoiceno() {
        return this.invoiceno;
    }

    @Override
    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    @Override
    public String getOutstoreno() {
        return this.outstoreno;
    }

    @Override
    public void setOutstoreno(String outstoreno) {
        this.outstoreno = outstoreno;
    }

    @Override
    public String getPk_jobphase() {
        return this.pk_jobphase;
    }

    @Override
    public void setPk_jobphase(String pk_jobphase) {
        this.pk_jobphase = pk_jobphase;
    }

    @Override
    public String getPk_job() {
        return this.pk_job;
    }

    @Override
    public void setPk_job(String pk_job) {
        this.pk_job = pk_job;
    }

    @Override
    public String getDef30() {
        return this.def30;
    }

    @Override
    public void setDef30(String def30) {
        this.def30 = def30;
    }

    @Override
    public String getDef29() {
        return this.def29;
    }

    @Override
    public void setDef29(String def29) {
        this.def29 = def29;
    }

    @Override
    public String getDef28() {
        return this.def28;
    }

    @Override
    public void setDef28(String def28) {
        this.def28 = def28;
    }

    @Override
    public String getDef27() {
        return this.def27;
    }

    @Override
    public void setDef27(String def27) {
        this.def27 = def27;
    }

    @Override
    public String getDef26() {
        return this.def26;
    }

    @Override
    public void setDef26(String def26) {
        this.def26 = def26;
    }

    @Override
    public String getDef25() {
        return this.def25;
    }

    @Override
    public void setDef25(String def25) {
        this.def25 = def25;
    }

    @Override
    public String getDef24() {
        return this.def24;
    }

    @Override
    public void setDef24(String def24) {
        this.def24 = def24;
    }

    @Override
    public String getDef23() {
        return this.def23;
    }

    @Override
    public void setDef23(String def23) {
        this.def23 = def23;
    }

    @Override
    public String getDef22() {
        return this.def22;
    }

    @Override
    public void setDef22(String def22) {
        this.def22 = def22;
    }

    @Override
    public String getDef21() {
        return this.def21;
    }

    @Override
    public void setDef21(String def21) {
        this.def21 = def21;
    }

    @Override
    public String getDef20() {
        return this.def20;
    }

    @Override
    public void setDef20(String def20) {
        this.def20 = def20;
    }

    @Override
    public String getDef19() {
        return this.def19;
    }

    @Override
    public void setDef19(String def19) {
        this.def19 = def19;
    }

    @Override
    public String getDef18() {
        return this.def18;
    }

    @Override
    public void setDef18(String def18) {
        this.def18 = def18;
    }

    @Override
    public String getDef17() {
        return this.def17;
    }

    @Override
    public void setDef17(String def17) {
        this.def17 = def17;
    }

    @Override
    public String getDef16() {
        return this.def16;
    }

    @Override
    public void setDef16(String def16) {
        this.def16 = def16;
    }

    @Override
    public String getDef15() {
        return this.def15;
    }

    @Override
    public void setDef15(String def15) {
        this.def15 = def15;
    }

    @Override
    public String getDef14() {
        return this.def14;
    }

    @Override
    public void setDef14(String def14) {
        this.def14 = def14;
    }

    @Override
    public String getDef13() {
        return this.def13;
    }

    @Override
    public void setDef13(String def13) {
        this.def13 = def13;
    }

    @Override
    public String getDef12() {
        return this.def12;
    }

    @Override
    public void setDef12(String def12) {
        this.def12 = def12;
    }

    @Override
    public String getDef11() {
        return this.def11;
    }

    @Override
    public void setDef11(String def11) {
        this.def11 = def11;
    }

    @Override
    public String getDef10() {
        return this.def10;
    }

    @Override
    public void setDef10(String def10) {
        this.def10 = def10;
    }

    @Override
    public String getDef9() {
        return this.def9;
    }

    @Override
    public void setDef9(String def9) {
        this.def9 = def9;
    }

    @Override
    public String getDef8() {
        return this.def8;
    }

    @Override
    public void setDef8(String def8) {
        this.def8 = def8;
    }

    @Override
    public String getDef7() {
        return this.def7;
    }

    @Override
    public void setDef7(String def7) {
        this.def7 = def7;
    }

    @Override
    public String getDef6() {
        return this.def6;
    }

    @Override
    public void setDef6(String def6) {
        this.def6 = def6;
    }

    @Override
    public String getDef5() {
        return this.def5;
    }

    @Override
    public void setDef5(String def5) {
        this.def5 = def5;
    }

    @Override
    public String getDef4() {
        return this.def4;
    }

    @Override
    public void setDef4(String def4) {
        this.def4 = def4;
    }

    @Override
    public String getDef3() {
        return this.def3;
    }

    @Override
    public void setDef3(String def3) {
        this.def3 = def3;
    }

    @Override
    public String getDef2() {
        return this.def2;
    }

    @Override
    public void setDef2(String def2) {
        this.def2 = def2;
    }

    @Override
    public String getDef1() {
        return this.def1;
    }

    @Override
    public void setDef1(String def1) {
        this.def1 = def1;
    }

    @Override
    public Integer getDr() {
        return this.dr;
    }

    @Override
    public void setDr(Integer dr) {
        this.dr = dr;
    }

    @Override
    public UFDateTime getTs() {
        return this.ts;
    }

    @Override
    public void setTs(UFDateTime ts) {
        this.ts = ts;
    }

    public UFDateTime getTop_changets() {
        return this.top_changets;
    }

    public void setTop_changets(UFDateTime topChangets) {
        this.top_changets = topChangets;
    }

    @Override
    public String getCheckelement() {
        return this.checkelement;
    }

    @Override
    public void setCheckelement(String checkelement) {
        this.checkelement = checkelement;
    }

    public UFDouble getGrouprate() {
        return this.grouprate;
    }

    public void setGrouprate(UFDouble grouprate) {
        this.grouprate = grouprate;
    }

    public UFDouble getGlobalrate() {
        return this.globalrate;
    }

    public void setGlobalrate(UFDouble globalrate) {
        this.globalrate = globalrate;
    }

    public UFDouble getGroupdebit() {
        return this.groupdebit;
    }

    public void setGroupdebit(UFDouble groupdebit) {
        this.groupdebit = groupdebit;
    }

    public UFDouble getGlobaldebit() {
        return this.globaldebit;
    }

    public void setGlobaldebit(UFDouble globaldebit) {
        if (globaldebit != null) {
            this.globaldebit = globaldebit;
        }
    }

    public UFDouble getGroupbalance() {
        return this.groupbalance;
    }

    public void setGroupbalance(UFDouble groupbalance) {
        this.groupbalance = groupbalance;
    }

    public UFDouble getGlobalbalance() {
        return this.globalbalance;
    }

    public void setGlobalbalance(UFDouble globalbalance) {
        this.globalbalance = globalbalance;
    }

    public UFDouble getGrouptax_de() {
        return this.grouptax_de;
    }

    public void setGrouptax_de(UFDouble grouptax_de) {
        this.grouptax_de = grouptax_de;
    }

    public UFDouble getGlobaltax_de() {
        return this.globaltax_de;
    }

    public void setGlobaltax_de(UFDouble globaltax_de) {
        this.globaltax_de = globaltax_de;
    }

    public UFDouble getGroupnotax_de() {
        return this.groupnotax_de;
    }

    public void setGroupnotax_de(UFDouble groupnotax_de) {
        this.groupnotax_de = groupnotax_de;
    }

    public UFDouble getGlobalnotax_de() {
        return this.globalnotax_de;
    }

    public void setGlobalnotax_de(UFDouble globalnotax_de) {
        this.globalnotax_de = globalnotax_de;
    }

    public UFDouble getGrouptax_cre() {
        return this.grouptax_cre;
    }

    public void setGrouptax_cre(UFDouble grouptax_cre) {
        this.grouptax_cre = grouptax_cre;
    }

    public UFDouble getGlobaltax_cre() {
        return this.globaltax_cre;
    }

    public void setGlobaltax_cre(UFDouble globaltax_cre) {
        this.globaltax_cre = globaltax_cre;
    }

    public UFDouble getGroupnotax_cre() {
        return this.groupnotax_cre;
    }

    public void setGroupnotax_cre(UFDouble groupnotax_cre) {
        this.groupnotax_cre = groupnotax_cre;
    }

    public UFDouble getGlobalnotax_cre() {
        return this.globalnotax_cre;
    }

    public void setGlobalnotax_cre(UFDouble globalnotax_cre) {
        this.globalnotax_cre = globalnotax_cre;
    }

    public String getSo_org_v() {
        return this.so_org_v;
    }

    public void setSo_org_v(String so_org_v) {
        this.so_org_v = so_org_v;
    }

    public String getPu_org_v() {
        return this.pu_org_v;
    }

    public String getSett_org() {
        return this.sett_org;
    }

    public void setSett_org(String sett_org) {
        this.sett_org = sett_org;
    }

    public String getSett_org_v() {
        return this.sett_org_v;
    }

    public void setSett_org_v(String sett_org_v) {
        this.sett_org_v = sett_org_v;
    }

    public String getPk_billfiorg() {
        return this.pk_billfiorg;
    }

    public void setPk_billfiorg(String pk_billfiorg) {
        this.pk_billfiorg = pk_billfiorg;
    }

    public UFDouble getForcemoney() {
        return this.forcemoney;
    }

    public void setForcemoney(UFDouble forcemoney) {
        this.forcemoney = forcemoney;
    }

    public Integer getForcestatus() {
        return this.forcestatus;
    }

    public void setForcestatus(Integer forcestatus) {
        this.forcestatus = forcestatus;
    }

    public UFDate getForcestart() {
        return this.forcestart;
    }

    public void setForcestart(UFDate forcestart) {
        this.forcestart = forcestart;
    }

    public UFDate getForceend() {
        return this.forceend;
    }

    public void setForceend(UFDate forceend) {
        this.forceend = forceend;
    }

    public void setPu_org_v(String pu_org_v) {
        this.pu_org_v = pu_org_v;
    }

    public UFDouble getGroupcrebit() {
        return this.groupcrebit;
    }

    public void setGroupcrebit(UFDouble groupcrebit) {
        this.groupcrebit = groupcrebit;
    }

    public UFDouble getGlobalcrebit() {
        return this.globalcrebit;
    }

    public void setGlobalcrebit(UFDouble globalcrebit) {
        if (globalcrebit != null) {
            this.globalcrebit = globalcrebit;
        }
    }

    public void setBankrelated_code(String bankrelated_code) {
        this.bankrelated_code = bankrelated_code;
    }

    public String getBankrelated_code() {
        return this.bankrelated_code;
    }

    public String getMaterial_src() {
        return this.material_src;
    }

    public void setMaterial_src(String materialSrc) {
        this.material_src = materialSrc;
    }

    public String getMatcustcode() {
        return this.matcustcode;
    }

    public void setMatcustcode(String matcustcode) {
        this.matcustcode = matcustcode;
    }

    public UFDouble getSettlemoney() {
        return this.settlemoney;
    }

    public void setSettlemoney(UFDouble settlemoney) {
        this.settlemoney = settlemoney == null ? UFDouble.ZERO_DBL : settlemoney;
    }

    public String getSettlecurr() {
        return this.settlecurr;
    }

    public void setSettlecurr(String settlecurr) {
        this.settlecurr = settlecurr;
    }

    public UFBoolean getIsdiscount() {
        return this.isdiscount;
    }

    public void setIsdiscount(UFBoolean isdiscount) {
        this.isdiscount = isdiscount;
    }

    public void resetDefaultValue(String operator, UFDateTime operationtime) {
        String[] defaultNullFields;
        this.setBilldate(operationtime.getDate());
        if (this.getBusidate() == null) {
            this.setBusidate(operationtime.getDate());
        }
        this.setIsverifyfinished(UFBoolean.FALSE);
        this.setVerifyfinisheddate(new UFDate("3000-01-01"));
        this.setParentPK(null);
        this.setPrimaryKey(null);
        this.setBillno(null);
        for (String field : defaultNullFields = this.getDefaultNullFields()) {
            this.setAttributeValue(field, null);
        }
    }

    public void recalculateByShl(UFDouble newQuantity, Map<String, UFDouble[]> notaxBalMap) throws BusinessException {
    }

    private String[] getDefaultNullFields() {
        return new String[]{"payman", "paydate", "billno"};
    }

    public Integer getCommpaytype() {
        return this.commpaytype;
    }

    public void setCommpaytype(Integer commpaytype) {
        this.commpaytype = commpaytype;
    }

    public Integer getCommpaystatus() {
        return this.commpaystatus;
    }

    public void setCommpaystatus(Integer commpaystatus) {
        this.commpaystatus = commpaystatus;
    }

    public UFDouble getAgentreceiveprimal() {
        return this.agentreceiveprimal;
    }

    public void setAgentreceiveprimal(UFDouble agentreceiveprimal) {
        this.agentreceiveprimal = agentreceiveprimal;
    }

    public UFDouble getAgentreceivelocal() {
        return this.agentreceivelocal;
    }

    public void setAgentreceivelocal(UFDouble agentreceivelocal) {
        this.agentreceivelocal = agentreceivelocal;
    }

    public UFDouble getGroupagentreceivelocal() {
        return this.groupagentreceivelocal;
    }

    public void setGroupagentreceivelocal(UFDouble groupagentreceivelocal) {
        this.groupagentreceivelocal = groupagentreceivelocal;
    }

    public UFDouble getGlobalagentreceivelocal() {
        return this.globalagentreceivelocal;
    }

    public void setGlobalagentreceivelocal(UFDouble globalagentreceivelocal) {
        this.globalagentreceivelocal = globalagentreceivelocal;
    }

    public String getCommpayer() {
        return this.commpayer;
    }

    public void setCommpayer(String commpayer) {
        this.commpayer = commpayer;
    }

    public UFDouble getLocal_price() {
        return this.local_price;
    }

    public void setLocal_price(UFDouble localPrice) {
        this.local_price = localPrice;
    }

    public UFDouble getLocal_taxprice() {
        return this.local_taxprice;
    }

    public void setLocal_taxprice(UFDouble localTaxprice) {
        this.local_taxprice = localTaxprice;
    }

    public String getConfernum() {
        return this.confernum;
    }

    public void setConfernum(String confernum) {
        this.confernum = confernum;
    }

    public String getCostcenter() {
        return this.costcenter;
    }

    public void setCostcenter(String costcenter) {
        this.costcenter = costcenter;
    }

    public String getRececountryid() {
        return this.rececountryid;
    }

    public void setRececountryid(String rececountryid) {
        this.rececountryid = rececountryid;
    }

    public String getSendcountryid() {
        return this.sendcountryid;
    }

    public void setSendcountryid(String sendcountryid) {
        this.sendcountryid = sendcountryid;
    }

    public Integer getBuysellflag() {
        return this.buysellflag;
    }

    public void setBuysellflag(Integer buysellflag) {
        this.buysellflag = buysellflag;
    }

    public UFBoolean getTriatradeflag() {
        return this.triatradeflag;
    }

    public void setTriatradeflag(UFBoolean triatradeflag) {
        this.triatradeflag = triatradeflag;
    }

    public String getVatcode() {
        return this.vatcode;
    }

    public void setVatcode(String vatcode) {
        this.vatcode = vatcode;
    }

    public String getCustvatcode() {
        return this.custvatcode;
    }

    public void setCustvatcode(String custvatcode) {
        this.custvatcode = custvatcode;
    }

    public String getTaxcodeid() {
        return this.taxcodeid;
    }

    public void setTaxcodeid(String taxcodeid) {
        this.taxcodeid = taxcodeid;
    }

    public UFDouble getCaltaxmny() {
        return this.caltaxmny;
    }

    public void setCaltaxmny(UFDouble caltaxmny) {
        this.caltaxmny = caltaxmny;
    }

    public UFDouble getNosubtaxrate() {
        return this.nosubtaxrate;
    }

    public void setNosubtaxrate(UFDouble nosubtaxrate) {
        this.nosubtaxrate = nosubtaxrate;
    }

    public UFDouble getNosubtax() {
        return this.nosubtax;
    }

    public void setNosubtax(UFDouble nosubtax) {
        this.nosubtax = nosubtax;
    }

    public UFBoolean getOpptaxflag() {
        return this.opptaxflag;
    }

    public void setOpptaxflag(UFBoolean opptaxflag) {
        this.opptaxflag = opptaxflag;
    }

    public String getVendorvatcode() {
        return this.vendorvatcode;
    }

    public void setVendorvatcode(String vendorvatcode) {
        this.vendorvatcode = vendorvatcode;
    }

    public String getBatchcode() {
        return this.batchcode;
    }

    public void setBatchcode(String batchcode) {
        this.batchcode = batchcode;
    }

    public String getPk_batchcode() {
        return this.pk_batchcode;
    }

    public void setPk_batchcode(String pkBatchcode) {
        this.pk_batchcode = pkBatchcode;
    }

    public String getComment() {
        return this.scomment;
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

    public UFBoolean getIsurgent() {
        return this.isurgent;
    }

    public void setIsurgent(UFBoolean isurgent) {
        this.isurgent = isurgent;
    }

    public UFDateTime getTop_changeitemts() {
        return this.top_changeitemts;
    }

    public void setTop_changeitemts(UFDateTime top_changeitemts) {
        this.top_changeitemts = top_changeitemts;
    }

    public String getPk_ratetype() {
        return this.pk_ratetype;
    }

    public void setPk_ratetype(String pk_ratetype) {
        this.pk_ratetype = pk_ratetype;
    }

    public UFLiteralDate getRatedate() {
        return this.ratedate;
    }

    public void setRatedate(UFLiteralDate ratedate) {
        this.ratedate = ratedate;
    }

    public String getCustomer_v() {
        return this.customer_v;
    }

    public void setCustomer_v(String customer_v) {
        this.customer_v = customer_v;
    }

    public String getOrdercubasdoc_v() {
        return this.ordercubasdoc_v;
    }

    public void setOrdercubasdoc_v(String ordercubasdoc_v) {
        this.ordercubasdoc_v = ordercubasdoc_v;
    }

    public String getSupplier_v() {
        return this.supplier_v;
    }

    public void setSupplier_v(String supplier_v) {
        this.supplier_v = supplier_v;
    }
}

