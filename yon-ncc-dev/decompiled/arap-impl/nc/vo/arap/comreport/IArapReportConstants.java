/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.arap.comreport;

import nc.vo.arap.pub.BillEnumCollection;

public interface IArapReportConstants {
    public static final String KEY_SHOW_DATE_TOTAL = "showDateTotalComb";
    public static final String KEY_NOTSHOW_BACKESTI = "notshowBackEstiComb";
    public static final String KEY_PRE_REC_PAY_ACCAGE = "prerecpayaccage";
    public static final String KEY_NOOCC_NOSHOW = "nooccur_noshow";
    public static final String KEY_NOBAL_NOOCC_NOSHOW = "nobal_nooccur_noshow";
    public static final String KEY_FORECAST_COMPOSE_RECPAY = "recpaycheck";
    public static final String KEY_FORECAST_COMPOSE_RECPAYBAL = "recpaybalcheck";
    public static final String KEY_FORECAST_COMPOSE_PRERECPAYBAL = "prerecpaybalcheck";
    public static final String KEY_SHOW_EXPIREDATE = "showexpiredate";
    public static final String ACC_ANA_MODE_AGE = "byAccAge";
    public static final String ACC_ANA_MODE_DATE = "byDate";
    public static final String ACC_ANA_DIRECT_RECABLE_REC = "recable_rec";
    public static final String ACC_ANA_DIRECT_PAYABLE_PAY = "payable_pay";
    public static final String ACC_ANA_TYP_SETTLE = "settle";
    public static final String ACC_ANA_TYP_DEADLINE = "deadline";
    public static final String ACC_ANA_DATE_EXPIREDATE = "expiredate";
    public static final String ACC_ANA_DATE_BILLDATE = "billdate";
    public static final String ACC_ANA_DATE_AUDITDATE = "auditdate";
    public static final String ACC_ANA_DATE_EFFECTDATE = "effectdate";
    public static final String ACC_ANA_DATE_WITHINDATE = "withindate";
    public static final String ACC_ANA_DATE_RAISEDATE = "raisedate";
    public static final String ACC_ANA_PATTERN_FINAL = "final";
    public static final String ACC_ANA_PATTERN_POINT = "point";
    public static final String REPLACE_TABLE = "@Table";
    public static final int I_BILL_STATUS_ALL = -1000;
    public static final String ANA_DIRECT_RECABLE = "recable";
    public static final String ANA_DIRECT_RECABLE_REC = "recable_rec";
    public static final String ANA_DIRECT_RECABLE_REC_PRE = "recable_rec_pre";
    public static final String ANA_DIRECT_PAYABLE = "payable";
    public static final String ANA_DIRECT_PAYABLE_PAY = "payable_pay";
    public static final String ANA_DIRECT_PAYABLE_PAY_PRE = "payable_pay_pre";
    public static final int SYS_FLAG_REC = 3;
    public static final int SYS_FLAG_PAY = 4;
    public static final String MODULEID_AR = "2006";
    public static final String MODULEID_AP = "2008";
    public static final int ASSO_OBJ_ALL = 9;
    public static final int ASSO_OBJ_CUS_SUP = 8;
    public static final int ASSO_OBJ_CUSTOMER = BillEnumCollection.ObjType.CUSTOMER.VALUE;
    public static final int ASSO_OBJ_SUPPLIER = BillEnumCollection.ObjType.SUPPLIER.VALUE;
    public static final int ASSO_OBJ_DEPT = BillEnumCollection.ObjType.DEP.VALUE;
    public static final int ASSO_OBJ_BUSIMAN = BillEnumCollection.ObjType.PERSON.VALUE;
    public static final String DEF = "def";
    public static final int BAL_DEF_LEN = 6;
    public static final int REPORT_QRYOBJ_SIZE = 5;
    public static final String IS_MATCUSTCODE = "isShowMatCustCode";
    public static final String STATE_BY_LOCAL = "statebylocal";
    public static final String STATE_BY_ORI = "statebyori";
    public static final String GLBR = "glbr";
    public static final String GLBRSUM = "glbrsum";
}

