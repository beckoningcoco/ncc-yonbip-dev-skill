/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bd.accperiod.InvalidAccperiodExcetion
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.lang.UFLiteralDate
 */
package nc.vo.arap.basebill;

import java.util.Arrays;
import java.util.List;
import nc.bd.accperiod.InvalidAccperiodExcetion;
import nc.pubitf.accperiod.AccountCalendar;
import nc.vo.arap.basebill.IArapBillFieldVO;
import nc.vo.arap.basebill.IArapMoneyFieldVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.lang.UFLiteralDate;

public abstract class BaseBillVO
extends SuperVO
implements IArapBillFieldVO,
IArapMoneyFieldVO {
    private static final long serialVersionUID = 1L;
    public static final List<String> BUSIORG_FIELD_LIST = Arrays.asList("so_deptid_v", "pu_deptid_v", "so_deptid", "pu_deptid", "so_psndoc", "pu_psndoc");
    public static final List<String> DEPTPSN_FIELD_LIST = Arrays.asList("pk_deptid", "pk_deptid_v", "pk_psndoc");
    private static final String[] YFandSKMoneyFields = new String[]{"quantity_cr", "local_money_cr", "notax_cr", "money_cr", "money_bal", "local_money_bal", "quantity_bal", "local_tax_cr", "local_notax_cr", "grouptax_cre", "groupnotax_cre", "groupcrebit", "globalcrebit", "globaltax_cre", "globalnotax_cre"};
    private static final String[] YSandFKMoneyFields = new String[]{"money_de", "local_money_de", "quantity_de", "money_bal", "local_money_bal", "quantity_bal", "local_tax_de", "notax_de", "local_notax_de", "grouptax_de", "groupnotax_de", "groupdebit", "globaltax_de", "globalnotax_de", "globaldebit"};
    public static final List<String> RATEFIELD_LIST = Arrays.asList("rate", "grouprate", "globalrate");
    public static final List<String> MONEYFIELD_LIST = Arrays.asList("money", "local_money", "grouplocal", "globallocal");
    public static final List<String> OBJTPEFIELD_LIST = Arrays.asList("objtype", "supplier", "customer", "pk_deptid", "pk_psndoc");
    public static final List<String> UPDATEIGNORE_LIST = Arrays.asList("modifier", "modifiedtime", "creator", "creationtime", "billstatus");
    public static final List<String> ACCEFIELD_LIST = Arrays.asList("recaccount", "payaccount", "cashaccount");
    public static final String ZB = "zb.";
    public static final String H_SUBJCODE = "h_subjcode";
    private boolean isAuthAccount = false;
    private boolean isForceEffect = false;
    private UFBoolean isTaxRecalculation = UFBoolean.TRUE;
    private String itemflag;
    private Integer transientFlag;
    private UFBoolean temporarily2Save;
    private UFBoolean saveToTemporarily;
    private transient UFBoolean m_cooperateMoreTimes = UFBoolean.TRUE;
    private UFDouble rate = UFDouble.ONE_DBL;
    private String billmaker;
    private UFBoolean ismandatepay;
    private UFBoolean isnetpayready;
    private UFBoolean isonlinepay;
    private UFDate paydate;
    private Integer prepay;
    private Integer settleflag;
    private String settlenum;
    private Integer settletype;
    private String payman;
    private String pk_currtype;
    private String custdelegate;
    private String customer;
    private String pk_corp;
    private String pk_deptid_res;
    private UFDate signdate;
    private String signperiod;
    private String signuser;
    private String signyear;
    private String parentPK;
    private String pk_org_v;
    private String pk_fiorg_v;
    private String pk_pcorg_v;
    private String pk_fiorg;
    private UFBoolean isreded;
    private String pk_pcorg;
    private String outbusitype;
    private String officialprintuser;
    private UFDate officialprintdate;
    private String approvenote;
    private String pk_org;
    private String pk_group;
    private UFDateTime modifiedtime;
    private UFDateTime creationtime;
    private String creator;
    private String pk_billtype;
    private String custbank;
    private String modifier;
    private String pk_tradetype;
    private String pk_tradetypeid;
    private String billclass;
    private Integer accessorynum;
    private String subjcode;
    private UFBoolean isflowbill;
    private String confirmuser;
    private UFBoolean isinit = UFBoolean.FALSE;
    private UFBoolean isforce;
    private String billno;
    private UFDate billdate;
    private Integer syscode;
    private Integer src_syscode;
    private Integer billstatus;
    private String approver;
    private UFDateTime approvedate;
    private String lastadjustuser;
    private String pk_busitype;
    private UFDouble money = UFDouble.ZERO_DBL;
    private UFDouble local_money = UFDouble.ZERO_DBL;
    private String billyear;
    private String billperiod;
    private String scomment;
    private Integer effectstatus;
    private String effectuser;
    private UFDate effectdate;
    private String lastapproveid;
    private String sett_org;
    private String def1;
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
    private Integer dr;
    private UFDateTime ts;
    private UFDate tallydate;
    private UFDouble grouplocal;
    private UFDouble globallocal;
    private UFDouble grouprate;
    private UFDouble globalrate;
    private String checkelement;
    private String so_deptid;
    private String so_psndoc;
    private String pu_deptid;
    private String pu_psndoc;
    private String so_org;
    private String pu_org;
    private String pk_rescenter;
    private String cashitem;
    private String bankrollprojet;
    private String supplier;
    private String pk_deptid;
    private String pk_deptid_v;
    private String pu_deptid_v;
    private String so_deptid_v;
    private UFDate busidate;
    private String pk_psndoc;
    private String checkno;
    private String payaccount;
    private String recaccount;
    private String incomeitem;
    private String pk_subjcode;
    private Integer objtype;
    private String so_org_v;
    private String sett_org_v;
    private String pk_input;
    private String pk_balatype;
    private String ordercubasdoc;
    private UFDouble globalnotax;
    private UFDouble grouptax;
    private UFDouble globaltax;
    private UFDouble groupnotax;
    private String pu_org_v;
    private Integer coordflag;
    private Integer estflag;
    private String cashaccount;
    private String costcenter;
    private UFBoolean isfromindependent;
    private String rececountryid;
    private String taxcountryid;
    private String sendcountryid;
    private String creditrefstd;
    private transient UFDateTime approvedate_bak;
    private UFBoolean isrefund;
    private String invoiceno;
    private Integer total_period;
    private String start_period;
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
    private Integer saga_frozen;
    private String saga_gtxid;
    private String saga_btxid;
    private Integer saga_status;
    private String driveaction;
    private String pk_ratetype;
    private UFLiteralDate ratedate;
    private String customer_v;
    private String ordercubasdoc_v;
    private String supplier_v;
    private Integer approvestatus;
    private SuperVO settleHead;
    private UFDate commpayenddate;
    private UFDate commpaybegindate;

    public String getDriveaction() {
        return this.driveaction;
    }

    public void setDriveaction(String driveaction) {
        this.driveaction = driveaction;
    }

    public String getInvoiceno() {
        return this.invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    public Integer getTotal_period() {
        return this.total_period;
    }

    public void setTotal_period(Integer total_period) {
        this.total_period = total_period;
    }

    public String getStart_period() {
        return this.start_period;
    }

    public void setStart_period(String start_period) {
        this.start_period = start_period;
    }

    public UFBoolean getIsurgent() {
        return this.isurgent;
    }

    public void setIsurgent(UFBoolean isurgent) {
        this.isurgent = isurgent;
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

    public UFDateTime getApprovedate_bak() {
        return this.approvedate_bak;
    }

    public void setApprovedate_bak(UFDateTime approvedateBak) {
        this.approvedate_bak = approvedateBak;
    }

    public UFDate getApprovedated() {
        if (this.approvedate == null) {
            return null;
        }
        return this.approvedate.getDate();
    }

    public void setApprovedated(UFDate approvedated) {
    }

    public BaseBillVO() {
        this.effectstatus = BillEnumCollection.InureSign.NOINURE.VALUE;
        this.grouplocal = UFDouble.ZERO_DBL;
        this.globallocal = UFDouble.ZERO_DBL;
        this.grouprate = UFDouble.ZERO_DBL;
        this.globalrate = UFDouble.ZERO_DBL;
        this.globalnotax = UFDouble.ZERO_DBL;
        this.grouptax = UFDouble.ZERO_DBL;
        this.globaltax = UFDouble.ZERO_DBL;
        this.groupnotax = UFDouble.ZERO_DBL;
        this.approvestatus = BillEnumCollection.ApproveStatus.NOSTATE.VALUE;
        this.settleHead = null;
    }

    public String getPrimaryKey() {
        String primaryKey = super.getPrimaryKey();
        return primaryKey == null ? this.getAttributeValue(this.getPKFieldName()) : primaryKey;
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        }
        catch (Exception e) {
            throw new RuntimeException("clone not supported!");
        }
        BaseBillVO parent = (BaseBillVO)obj;
        return parent;
    }

    @Override
    public String getBillmaker() {
        return this.billmaker;
    }

    @Override
    public void setBillmaker(String billmaker) {
        this.billmaker = billmaker;
    }

    public String getItemflag() {
        return this.itemflag;
    }

    public void setItemflag(String itemflag) {
        this.itemflag = itemflag;
    }

    public UFBoolean getTemporarily2Save() {
        return this.temporarily2Save;
    }

    public void setTemporarily2Save(UFBoolean Temporarily2Save) {
        this.temporarily2Save = Temporarily2Save;
    }

    public UFBoolean getSaveToTemporarily() {
        return this.saveToTemporarily;
    }

    public void setSaveTotemporarily(UFBoolean saveTotemporarily) {
        this.saveToTemporarily = saveTotemporarily;
    }

    public UFDate getBusidate() {
        return this.busidate;
    }

    public void setBusidate(UFDate busidate) {
        this.busidate = busidate;
    }

    public UFBoolean getM_cooperateMoreTimes() {
        return this.m_cooperateMoreTimes;
    }

    public void setM_cooperateMoreTimes(UFBoolean moreTimes) {
        this.m_cooperateMoreTimes = moreTimes;
    }

    public Integer getTransientFlag() {
        return this.transientFlag;
    }

    public void setTransientFlag(Integer transientFlag) {
        this.transientFlag = transientFlag;
    }

    @Override
    public Integer getApprovestatus() {
        return this.approvestatus == null ? BillEnumCollection.ApproveStatus.NOSTATE.VALUE : this.approvestatus;
    }

    @Override
    public void setApprovestatus(Integer approvestatus) {
        this.approvestatus = approvestatus;
    }

    @Override
    public UFBoolean getIsmandatepay() {
        return this.ismandatepay;
    }

    @Override
    public UFBoolean getIsnetpayready() {
        return this.isnetpayready;
    }

    @Override
    public UFBoolean getIsonlinepay() {
        return this.isonlinepay;
    }

    @Override
    public UFDate getPaydate() {
        return this.paydate;
    }

    @Override
    public String getPayman() {
        return this.payman;
    }

    @Override
    public Integer getPrepay() {
        return this.prepay;
    }

    @Override
    public Integer getSettleflag() {
        return this.settleflag;
    }

    @Override
    public String getSettlenum() {
        return this.settlenum;
    }

    @Override
    public Integer getSettletype() {
        return this.settletype;
    }

    @Override
    public void setIsmandatepay(UFBoolean ismandatepay) {
        this.ismandatepay = ismandatepay;
    }

    @Override
    public void setIsnetpayready(UFBoolean isnetpayready) {
        this.isnetpayready = isnetpayready;
    }

    @Override
    public void setIsonlinepay(UFBoolean isonlinepay) {
        this.isonlinepay = isonlinepay;
    }

    @Override
    public void setPaydate(UFDate paydate) {
        this.paydate = paydate;
    }

    @Override
    public void setPayman(String payman) {
        this.payman = payman;
    }

    @Override
    public void setPrepay(Integer prepay) {
        this.prepay = prepay;
    }

    @Override
    public void setSettleflag(Integer settleflag) {
        this.settleflag = settleflag;
    }

    @Override
    public void setSettlenum(String settlenum) {
        this.settlenum = settlenum;
    }

    @Override
    public void setSettletype(Integer settletype) {
        this.settletype = settletype;
    }

    public String getPk_currtype() {
        return this.pk_currtype;
    }

    public void setPk_currtype(String pk_currtype) {
        this.pk_currtype = pk_currtype;
    }

    @Override
    public String getCustdelegate() {
        return this.custdelegate;
    }

    @Override
    public String getCustomer() {
        return this.customer;
    }

    @Override
    public String getPk_corp() {
        return this.pk_corp;
    }

    @Override
    public String getPk_deptid_res() {
        return this.pk_deptid_res;
    }

    @Override
    public UFDate getSigndate() {
        return this.signdate;
    }

    @Override
    public String getSignperiod() {
        return this.signperiod;
    }

    @Override
    public String getSignuser() {
        return this.signuser;
    }

    @Override
    public String getSignyear() {
        return this.signyear;
    }

    @Override
    public void setCustdelegate(String custdelegate) {
        this.custdelegate = custdelegate;
    }

    @Override
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public void setPk_corp(String pk_corp) {
        this.pk_corp = pk_corp;
    }

    @Override
    public void setPk_deptid_res(String pk_deptid_res) {
        this.pk_deptid_res = pk_deptid_res;
    }

    @Override
    public void setSigndate(UFDate signdate) {
        this.signdate = signdate;
    }

    @Override
    public void setSignperiod(String signperiod) {
        this.signperiod = signperiod;
    }

    @Override
    public void setSignuser(String signuser) {
        this.signuser = signuser;
    }

    @Override
    public void setSignyear(String signyear) {
        this.signyear = signyear;
    }

    @Override
    public String getParentPK() {
        return this.parentPK;
    }

    @Override
    public void setParentPK(String parentPK) {
        this.parentPK = parentPK;
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

    public String getPk_pcorg_v() {
        return this.pk_pcorg_v;
    }

    public void setPk_pcorg_v(String pk_pcorg_v) {
        this.pk_pcorg_v = pk_pcorg_v;
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

    public UFBoolean getInsurance() {
        return null;
    }

    public void setInsurance(UFBoolean newInsurance) {
    }

    @Override
    public UFBoolean getIsreded() {
        return this.isreded;
    }

    @Override
    public void setIsreded(UFBoolean isreded) {
        this.isreded = isreded;
    }

    @Override
    public String getOutbusitype() {
        return this.outbusitype;
    }

    @Override
    public void setOutbusitype(String outbusitype) {
        this.outbusitype = outbusitype;
    }

    @Override
    public String getOfficialprintuser() {
        return this.officialprintuser;
    }

    @Override
    public void setOfficialprintuser(String officialprintuser) {
        this.officialprintuser = officialprintuser;
    }

    @Override
    public UFDate getOfficialprintdate() {
        return this.officialprintdate;
    }

    @Override
    public void setOfficialprintdate(UFDate officialprintdate) {
        this.officialprintdate = officialprintdate;
    }

    public String getApprovenote() {
        return this.approvenote;
    }

    public void setApprovenote(String approvenote) {
        this.approvenote = approvenote;
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
    public String getPk_group() {
        return this.pk_group;
    }

    @Override
    public void setPk_group(String pk_group) {
        this.pk_group = pk_group;
    }

    @Override
    public UFDateTime getModifiedtime() {
        return this.modifiedtime;
    }

    @Override
    public void setModifiedtime(UFDateTime modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    @Override
    public UFDateTime getCreationtime() {
        return this.creationtime;
    }

    @Override
    public void setCreationtime(UFDateTime creationtime) {
        this.creationtime = creationtime;
    }

    @Override
    public String getCreator() {
        return this.creator;
    }

    @Override
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String getPk_billtype() {
        return this.pk_billtype;
    }

    @Override
    public void setPk_billtype(String pk_billtype) {
        this.pk_billtype = pk_billtype;
    }

    public String getCustbank() {
        return this.custbank;
    }

    public void setCustbank(String custbank) {
        this.custbank = custbank;
    }

    @Override
    public String getModifier() {
        return this.modifier;
    }

    @Override
    public void setModifier(String modifier) {
        this.modifier = modifier;
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
    public String getBillclass() {
        return this.billclass;
    }

    @Override
    public void setBillclass(String billclass) {
        this.billclass = billclass;
    }

    @Override
    public Integer getAccessorynum() {
        return this.accessorynum;
    }

    @Override
    public void setAccessorynum(Integer accessorynum) {
        this.accessorynum = accessorynum;
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
    public UFBoolean getIsflowbill() {
        return this.isflowbill;
    }

    @Override
    public void setIsflowbill(UFBoolean isflowbill) {
        this.isflowbill = isflowbill;
    }

    @Override
    public String getConfirmuser() {
        return this.confirmuser;
    }

    @Override
    public void setConfirmuser(String confirmuser) {
        this.confirmuser = confirmuser;
    }

    @Override
    public UFBoolean getIsinit() {
        return this.isinit;
    }

    @Override
    public void setIsinit(UFBoolean isinit) {
        this.isinit = isinit;
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
    public UFDate getBilldate() {
        return this.billdate;
    }

    @Override
    public void setBilldate(UFDate billdate) {
        this.billdate = billdate;
    }

    @Override
    public Integer getSyscode() {
        return this.syscode;
    }

    @Override
    public void setSyscode(Integer syscode) {
        this.syscode = syscode;
    }

    @Override
    public Integer getSrc_syscode() {
        return this.src_syscode;
    }

    @Override
    public void setSrc_syscode(Integer src_syscode) {
        this.src_syscode = src_syscode;
    }

    @Override
    public Integer getBillstatus() {
        return this.billstatus;
    }

    @Override
    public void setBillstatus(Integer billstatus) {
        this.billstatus = billstatus;
    }

    @Override
    public String getApprover() {
        return this.approver;
    }

    @Override
    public void setApprover(String approver) {
        this.setLastapproveid(approver);
        this.approver = approver;
    }

    @Override
    public UFDateTime getApprovedate() {
        return this.approvedate;
    }

    @Override
    public void setApprovedate(UFDateTime approvedate) {
        if (approvedate == null && this.getApprovedate() != null) {
            this.setApprovedate_bak(this.getApprovedate());
        }
        this.approvedate = approvedate;
    }

    @Override
    public String getLastadjustuser() {
        return this.lastadjustuser;
    }

    @Override
    public void setLastadjustuser(String lastadjustuser) {
        this.lastadjustuser = lastadjustuser;
    }

    @Override
    public String getPk_busitype() {
        return this.pk_busitype;
    }

    @Override
    public void setPk_busitype(String pk_busitype) {
        this.pk_busitype = pk_busitype;
    }

    @Override
    public UFDouble getMoney() {
        return this.money;
    }

    @Override
    public void setMoney(UFDouble money) {
        this.money = money;
    }

    @Override
    public UFDouble getLocal_money() {
        return this.local_money;
    }

    @Override
    public void setLocal_money(UFDouble local_money) {
        this.local_money = local_money;
    }

    @Override
    public String getBillyear() {
        return this.billyear;
    }

    @Override
    public void setBillyear(String billyear) {
        this.billyear = billyear;
    }

    @Override
    public String getBillperiod() {
        return this.billperiod;
    }

    @Override
    public void setBillperiod(String billperiod) {
        this.billperiod = billperiod;
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
    public Integer getEffectstatus() {
        return this.effectstatus;
    }

    @Override
    public void setEffectstatus(Integer effectstatus) {
        this.effectstatus = effectstatus;
    }

    @Override
    public String getEffectuser() {
        return this.effectuser;
    }

    @Override
    public void setEffectuser(String effectuser) {
        this.effectuser = effectuser;
    }

    @Override
    public UFDate getEffectdate() {
        return this.effectdate;
    }

    @Override
    public void setEffectdate(UFDate effectdate) {
        this.effectdate = effectdate;
    }

    public void setInner_effect_date(UFDate inner_effect_date) {
    }

    @Override
    public String getLastapproveid() {
        if (this.lastapproveid == null) {
            return this.approver;
        }
        return this.lastapproveid;
    }

    @Override
    public void setLastapproveid(String lastapproveid) {
        this.lastapproveid = lastapproveid;
    }

    public String getSett_org() {
        return this.sett_org;
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

    public UFDate getTallydate() {
        return this.tallydate;
    }

    public void setTallydate(UFDate tallydate) {
        this.tallydate = tallydate;
    }

    public UFDouble getRate() {
        return this.rate;
    }

    public void setRate(UFDouble newRate) {
        this.rate = newRate;
    }

    public UFDouble getGrouplocal() {
        return this.grouplocal;
    }

    public void setGrouplocal(UFDouble grouplocal) {
        this.grouplocal = grouplocal;
    }

    public UFDouble getGloballocal() {
        return this.globallocal;
    }

    public void setGloballocal(UFDouble globallocal) {
        this.globallocal = globallocal;
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

    @Override
    public String getCheckelement() {
        return this.checkelement;
    }

    @Override
    public void setCheckelement(String checkelement) {
        this.checkelement = checkelement;
    }

    public String getSo_deptid() {
        return this.so_deptid;
    }

    public void setSo_deptid(String so_deptid) {
        this.so_deptid = so_deptid;
    }

    public String getSo_psndoc() {
        return this.so_psndoc;
    }

    public void setSo_psndoc(String so_psndoc) {
        this.so_psndoc = so_psndoc;
    }

    public String getPu_deptid() {
        return this.pu_deptid;
    }

    public void setPu_deptid(String pu_deptid) {
        this.pu_deptid = pu_deptid;
    }

    public String getPu_psndoc() {
        return this.pu_psndoc;
    }

    public void setPu_psndoc(String pu_psndoc) {
        this.pu_psndoc = pu_psndoc;
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

    public String getPk_rescenter() {
        return this.pk_rescenter;
    }

    public void setPk_rescenter(String pk_rescenter) {
        this.pk_rescenter = pk_rescenter;
    }

    public String getCashitem() {
        return this.cashitem;
    }

    public void setCashitem(String cashitem) {
        this.cashitem = cashitem;
    }

    public String getBankrollprojet() {
        return this.bankrollprojet;
    }

    public void setBankrollprojet(String bankrollprojet) {
        this.bankrollprojet = bankrollprojet;
    }

    public String getSupplier() {
        return this.supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getPk_deptid() {
        return this.pk_deptid;
    }

    public void setSett_org(String settOrg) {
        this.sett_org = settOrg;
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

    public void setPk_deptid(String pk_deptid) {
        this.pk_deptid = pk_deptid;
    }

    @Override
    public String getPk_psndoc() {
        return this.pk_psndoc;
    }

    @Override
    public void setPk_psndoc(String pk_psndoc) {
        this.pk_psndoc = pk_psndoc;
    }

    public String getCheckno() {
        return this.checkno;
    }

    public void setCheckno(String checkno) {
        this.checkno = checkno;
    }

    public String getPayaccount() {
        return this.payaccount;
    }

    public void setPayaccount(String payaccount) {
        this.payaccount = payaccount;
    }

    public String getRecaccount() {
        return this.recaccount;
    }

    public void setRecaccount(String recaccount) {
        this.recaccount = recaccount;
    }

    public String getCashaccount() {
        return this.cashaccount;
    }

    public void setCashaccount(String cashaccount) {
        this.cashaccount = cashaccount;
    }

    public String getIncomeitem() {
        return this.incomeitem;
    }

    public void setIncomeitem(String incomeitem) {
        this.incomeitem = incomeitem;
    }

    public String getPk_subjcode() {
        return this.pk_subjcode;
    }

    public void setPk_subjcode(String pk_subjcode) {
        this.pk_subjcode = pk_subjcode;
    }

    public Integer getObjtype() {
        return this.objtype;
    }

    public void setObjtype(Integer objtype) {
        this.objtype = objtype;
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

    public void setPu_org_v(String pu_org_v) {
        this.pu_org_v = pu_org_v;
    }

    public String getSett_org_v() {
        return this.sett_org_v;
    }

    public void setSett_org_v(String sett_org_v) {
        this.sett_org_v = sett_org_v;
    }

    public String getPk_input() {
        return this.pk_input;
    }

    public void setPk_input(String pk_input) {
        this.pk_input = pk_input;
    }

    public String getPk_balatype() {
        return this.pk_balatype;
    }

    public void setPk_balatype(String pk_balatype) {
        this.pk_balatype = pk_balatype;
    }

    public String getOrdercubasdoc() {
        return this.ordercubasdoc;
    }

    public void setOrdercubasdoc(String ordercubasdoc) {
        this.ordercubasdoc = ordercubasdoc;
    }

    public UFDouble getGlobalnotax() {
        return this.globalnotax;
    }

    public void setGlobalnotax(UFDouble globalnotax) {
        this.globalnotax = globalnotax;
    }

    public UFDouble getGrouptax() {
        return this.grouptax;
    }

    public void setGrouptax(UFDouble grouptax) {
        this.grouptax = grouptax;
    }

    public UFDouble getGlobaltax() {
        return this.globaltax;
    }

    public void setGlobaltax(UFDouble globaltax) {
        this.globaltax = globaltax;
    }

    public UFDouble getGroupnotax() {
        return this.groupnotax;
    }

    public void setGroupnotax(UFDouble groupnotax) {
        this.groupnotax = groupnotax;
    }

    public Integer getCoordflag() {
        return this.coordflag;
    }

    public void setCoordflag(Integer newCoordflag) {
        this.coordflag = newCoordflag;
    }

    public void resetDefaultValue(String billmaker, UFDateTime operationtime) {
        this.setAccessorynum(0);
        this.setApprovestatus((int)BillEnumCollection.ApproveStatus.NOSTATE.VALUE);
        this.setEffectstatus(0);
        this.setSettleflag(0);
        AccountCalendar acc = AccountCalendar.getInstanceByPk_org((String)this.getPk_org());
        try {
            acc.setDate(operationtime.getDate());
        }
        catch (InvalidAccperiodExcetion e) {
            throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0543"), (Throwable)e);
        }
        this.setBilldate(operationtime.getDate());
        this.setBillperiod(acc.getMonthVO().getAccperiodmth());
        this.setBillyear(acc.getYearVO().getPeriodyear());
        this.setCreationtime(operationtime);
        this.setCreator(billmaker);
        this.setBillmaker(billmaker);
        this.setPrimaryKey(null);
        this.setBillno(null);
    }

    @Override
    public String[] getMoneyFields(String billclass) {
        if (billclass.equals("ys") || billclass.equals("fk")) {
            return YSandFKMoneyFields;
        }
        if (billclass.equals("yf") || billclass.equals("sk")) {
            return YFandSKMoneyFields;
        }
        return new String[0];
    }

    public List<String> getMoneyFields() {
        return MONEYFIELD_LIST;
    }

    public List<String> getRateFields() {
        return RATEFIELD_LIST;
    }

    public Object getAttributeValue(String name) {
        if (name == null) {
            return "";
        }
        Object value = null;
        value = name.startsWith(ZB) ? (this.settleHead == null ? null : this.settleHead.getAttributeValue(name.split("\\.")[1])) : super.getAttributeValue(name);
        if (value == null) {
            if (this.getMoneyFields().contains(name)) {
                value = UFDouble.ZERO_DBL;
            } else if (this.getRateFields().contains(name)) {
                value = "rate".equals(name) ? UFDouble.ONE_DBL : UFDouble.ZERO_DBL;
            }
        }
        return value;
    }

    public SuperVO getSettleHead() {
        return this.settleHead;
    }

    public void setSettleHead(SuperVO settleHead) {
        this.settleHead = settleHead;
    }

    public UFBoolean getIsforce() {
        return this.isforce;
    }

    public void setIsforce(UFBoolean isforce) {
        this.isforce = isforce;
    }

    public UFDate getCommpayenddate() {
        return this.commpayenddate;
    }

    public UFDate getCommpaybegindate() {
        return this.commpaybegindate;
    }

    public void setCommpayenddate(UFDate commpayenddate) {
        this.commpayenddate = commpayenddate;
    }

    public void setCommpaybegindate(UFDate commpaybegindate) {
        this.commpaybegindate = commpaybegindate;
    }

    public Integer getEstflag() {
        return this.estflag;
    }

    public void setEstflag(Integer estflag) {
        this.estflag = estflag;
    }

    public boolean isForceEffect() {
        return this.isForceEffect;
    }

    public void setForceEffect(boolean isForceEffect) {
        this.isForceEffect = isForceEffect;
    }

    public String getCostcenter() {
        return this.costcenter;
    }

    public void setCostcenter(String costcenter) {
        this.costcenter = costcenter;
    }

    public UFBoolean getIsfromindependent() {
        return this.isfromindependent;
    }

    public void setIsfromindependent(UFBoolean isfromindependent) {
        this.isfromindependent = isfromindependent;
    }

    public String getRececountryid() {
        return this.rececountryid;
    }

    public void setRececountryid(String rececountryid) {
        this.rececountryid = rececountryid;
    }

    public String getTaxcountryid() {
        return this.taxcountryid;
    }

    public void setTaxcountryid(String taxcountryid) {
        this.taxcountryid = taxcountryid;
    }

    public String getSendcountryid() {
        return this.sendcountryid;
    }

    public void setSendcountryid(String sendcountryid) {
        this.sendcountryid = sendcountryid;
    }

    public String getCreditrefstd() {
        return this.creditrefstd;
    }

    public void setCreditrefstd(String creditrefstd) {
        this.creditrefstd = creditrefstd;
    }

    public boolean isAuthAccount() {
        return this.isAuthAccount;
    }

    public void setAuthAccount(boolean isAuthAccount) {
        this.isAuthAccount = isAuthAccount;
    }

    public UFBoolean getIsrefund() {
        return this.isrefund;
    }

    public void setIsrefund(UFBoolean isrefund) {
        this.isrefund = isrefund;
    }

    public UFBoolean getIsTaxRecalculation() {
        return this.isTaxRecalculation;
    }

    public void setIsTaxRecalculation(UFBoolean isTaxRecalculation) {
        this.isTaxRecalculation = isTaxRecalculation;
    }

    public Integer getSaga_frozen() {
        return this.saga_frozen;
    }

    public void setSaga_frozen(Integer saga_frozen) {
        this.saga_frozen = saga_frozen;
    }

    public String getSaga_gtxid() {
        return this.saga_gtxid;
    }

    public void setSaga_gtxid(String saga_gtxid) {
        this.saga_gtxid = saga_gtxid;
    }

    public String getSaga_btxid() {
        return this.saga_btxid;
    }

    public void setSaga_btxid(String saga_btxid) {
        this.saga_btxid = saga_btxid;
    }

    public Integer getSaga_status() {
        return this.saga_status;
    }

    public void setSaga_status(Integer saga_status) {
        this.saga_status = saga_status;
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

    public void setAttributeValue(String name, Object value) {
        super.setAttributeValue(name, value);
    }

    public void setAttributeValue2(String name, Object value) {
        super.setAttributeValue(name, value);
    }

    @Override
    public abstract String getPKFieldName();

    @Override
    public abstract String getTableName();
}

