/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.basebill;

import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;

public interface IArapBillFieldVO {
    public static final String SETT_ORG_V = "sett_org_v";
    public static final String VID_BU = "vid_bu";
    public static final String VID_FIORG = "vid_fiorg";
    public static final String VID_PCORG = "vid_pcorg";
    public static final String PK_BU = "pk_bu";
    public static final String PK_FIORG = "pk_fiorg";
    public static final String PK_PCORG = "pk_pcorg";
    public static final String INSURANCE = "insurance";
    public static final String SETT_ORG = "sett_org";
    public static final String ISREDED = "isreded";
    public static final String OUTBUSITYPE = "outbusitype";
    public static final String PAYMAN = "payman";
    public static final String PAYDATE = "paydate";
    public static final String ISONLINEPAY = "isonlinepay";
    public static final String OFFICIALPRINTUSER = "officialprintuser";
    public static final String OFFICIALPRINTDATE = "officialprintdate";
    public static final String SETTLENUM = "settlenum";
    public static final String PK_ORG = "pk_org";
    public static final String PK_GROUP = "pk_group";
    public static final String MODIFIEDTIME = "modifiedtime";
    public static final String CREATIONTIME = "creationtime";
    public static final String CREATOR = "creator";
    public static final String PK_BILLTYPE = "pk_billtype";
    public static final String ISMANDATEPAY = "ismandatepay";
    public static final String CUSTDELEGATE = "custdelegate";
    public static final String PK_CORP = "pk_corp";
    public static final String MODIFIER = "modifier";
    public static final String PK_TRADETYPE = "pk_tradetype";
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
    public static final String APPROVER = "approver";
    public static final String APPROVESTATUS = "approvestatus";
    public static final String APPROVEDATE = "approvedate";
    public static final String BILLMAKER = "billmaker";
    public static final String ISNETPAYREADY = "isnetpayready";
    public static final String LASTADJUSTUSER = "lastadjustuser";
    public static final String SIGNUSER = "signuser";
    public static final String SIGNYEAR = "signyear";
    public static final String SIGNPERIOD = "signperiod";
    public static final String SIGNDATE = "signdate";
    public static final String PK_BUSITYPE = "pk_busitype";
    public static final String MONEY = "money";
    public static final String LOCAL_MONEY = "local_money";
    public static final String BILLYEAR = "billyear";
    public static final String BILLPERIOD = "billperiod";
    public static final String COMMENT = "scomment";
    public static final String SETTLEFLAG = "settleflag";
    public static final String SETTLETYPE = "settletype";
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
    public static final String CHECKELEMENT = "checkelement";
    public static final String CUSTOMER = "customer";
    public static final String PK_DEPTIDER = "pk_deptider";
    public static final String PK_PSNDOC = "pk_psndoc";
    public static final String LOCALRATE = "rate";
    public static final String GROUPLOCAL = "grouplocal";
    public static final String GLOBALLOCAL = "globallocal";
    public static final String GROUPRATE = "grouprate";
    public static final String GLOBALRATE = "globalrate";
    public static final String LOCAL_NOTAX = "local_notax";
    public static final String LOCAL_TAX = "local_tax";
    public static final String GLOBALNOTAX = "globalnotax";
    public static final String GROUPTAX = "grouptax";
    public static final String GLOBALTAX = "globaltax";
    public static final String GROUPNOTAX = "groupnotax";
    public static final String CUSTOMER_V = "customer_v";
    public static final String SUPPLIER_V = "supplier_v";
    public static final String ORDERCUBASDOC_V = "ordercubasdoc_v";

    public Integer getPrepay();

    public void setPrepay(Integer var1);

    public UFBoolean getIsreded();

    public void setIsreded(UFBoolean var1);

    public void setBillmaker(String var1);

    public String getBillmaker();

    public String getOutbusitype();

    public void setOutbusitype(String var1);

    public String getPayman();

    public void setPayman(String var1);

    public UFDate getPaydate();

    public void setPaydate(UFDate var1);

    public UFBoolean getIsonlinepay();

    public void setIsonlinepay(UFBoolean var1);

    public String getOfficialprintuser();

    public void setOfficialprintuser(String var1);

    public UFDate getOfficialprintdate();

    public void setOfficialprintdate(UFDate var1);

    public String getSettlenum();

    public void setSettlenum(String var1);

    public String getPk_org();

    public void setPk_org(String var1);

    public String getPk_group();

    public void setPk_group(String var1);

    public UFDateTime getModifiedtime();

    public void setModifiedtime(UFDateTime var1);

    public UFDateTime getCreationtime();

    public void setCreationtime(UFDateTime var1);

    public String getCreator();

    public void setCreator(String var1);

    public String getPk_billtype();

    public void setPk_billtype(String var1);

    public UFBoolean getIsmandatepay();

    public void setIsmandatepay(UFBoolean var1);

    public String getCustdelegate();

    public void setCustdelegate(String var1);

    public String getPk_corp();

    public void setPk_corp(String var1);

    public String getModifier();

    public void setModifier(String var1);

    public String getPk_tradetype();

    public void setPk_tradetype(String var1);

    public String getBillclass();

    public void setBillclass(String var1);

    public String getParentPK();

    public void setParentPK(String var1);

    public Integer getAccessorynum();

    public void setAccessorynum(Integer var1);

    public String getSubjcode();

    public void setSubjcode(String var1);

    public UFBoolean getIsflowbill();

    public void setIsflowbill(UFBoolean var1);

    public String getConfirmuser();

    public void setConfirmuser(String var1);

    public UFBoolean getIsinit();

    public void setIsinit(UFBoolean var1);

    public String getBillno();

    public void setBillno(String var1);

    public UFDate getBilldate();

    public void setBilldate(UFDate var1);

    public Integer getSyscode();

    public void setSyscode(Integer var1);

    public Integer getSrc_syscode();

    public void setSrc_syscode(Integer var1);

    public Integer getBillstatus();

    public void setBillstatus(Integer var1);

    public String getApprover();

    public void setApprover(String var1);

    public Integer getApprovestatus();

    public void setApprovestatus(Integer var1);

    public UFDateTime getApprovedate();

    public void setApprovedate(UFDateTime var1);

    public UFBoolean getIsnetpayready();

    public void setIsnetpayready(UFBoolean var1);

    public String getLastadjustuser();

    public void setLastadjustuser(String var1);

    public String getSignuser();

    public void setSignuser(String var1);

    public String getSignyear();

    public void setSignyear(String var1);

    public String getSignperiod();

    public void setSignperiod(String var1);

    public UFDate getSigndate();

    public void setSigndate(UFDate var1);

    public String getPk_busitype();

    public void setPk_busitype(String var1);

    public UFDouble getMoney();

    public void setMoney(UFDouble var1);

    public UFDouble getLocal_money();

    public void setLocal_money(UFDouble var1);

    public String getBillyear();

    public void setBillyear(String var1);

    public String getBillperiod();

    public void setBillperiod(String var1);

    public String getScomment();

    public void setScomment(String var1);

    public Integer getSettleflag();

    public void setSettleflag(Integer var1);

    public Integer getSettletype();

    public void setSettletype(Integer var1);

    public Integer getEffectstatus();

    public void setEffectstatus(Integer var1);

    public String getEffectuser();

    public void setEffectuser(String var1);

    public UFDate getEffectdate();

    public void setEffectdate(UFDate var1);

    public String getLastapproveid();

    public void setLastapproveid(String var1);

    public String getDef1();

    public void setDef1(String var1);

    public String getDef30();

    public void setDef30(String var1);

    public String getDef29();

    public void setDef29(String var1);

    public String getDef28();

    public void setDef28(String var1);

    public String getDef27();

    public void setDef27(String var1);

    public String getDef26();

    public void setDef26(String var1);

    public String getDef25();

    public void setDef25(String var1);

    public String getDef24();

    public void setDef24(String var1);

    public String getDef23();

    public void setDef23(String var1);

    public String getDef22();

    public void setDef22(String var1);

    public String getDef21();

    public void setDef21(String var1);

    public String getDef20();

    public void setDef20(String var1);

    public String getDef19();

    public void setDef19(String var1);

    public String getDef18();

    public void setDef18(String var1);

    public String getDef17();

    public void setDef17(String var1);

    public String getDef16();

    public void setDef16(String var1);

    public String getDef15();

    public void setDef15(String var1);

    public String getDef14();

    public void setDef14(String var1);

    public String getDef13();

    public void setDef13(String var1);

    public String getDef12();

    public void setDef12(String var1);

    public String getDef11();

    public void setDef11(String var1);

    public String getDef10();

    public void setDef10(String var1);

    public String getDef9();

    public void setDef9(String var1);

    public String getDef8();

    public void setDef8(String var1);

    public String getDef7();

    public void setDef7(String var1);

    public String getDef6();

    public void setDef6(String var1);

    public String getDef5();

    public void setDef5(String var1);

    public String getDef4();

    public void setDef4(String var1);

    public String getDef3();

    public void setDef3(String var1);

    public String getDef2();

    public void setDef2(String var1);

    public Integer getDr();

    public void setDr(Integer var1);

    public UFDateTime getTs();

    public void setTs(UFDateTime var1);

    public String getCheckelement();

    public void setCheckelement(String var1);

    public String getCustomer();

    public void setCustomer(String var1);

    public String getPk_deptid_res();

    public void setPk_deptid_res(String var1);

    public String getPk_psndoc();

    public void setPk_psndoc(String var1);

    public String getParentPKFieldName();

    public String getPKFieldName();

    public String getTableName();
}

