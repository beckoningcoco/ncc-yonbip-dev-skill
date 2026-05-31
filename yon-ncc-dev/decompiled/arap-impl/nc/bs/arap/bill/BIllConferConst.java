/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Log
 */
package nc.bs.arap.bill;

import nc.bs.logging.Log;

public class BIllConferConst {
    public static final String CLASS_F0_SRV = "nc.itf.arap.receivable.IArapReceivableBillService";
    public static final String METHOD_F0_SAVE = "save";
    public static final String METHOD_F0_UPDATE = "update";
    public static Class<?> C_AggReceivableBillVO = null;
    public static final Class[] PRAMS_F0_SAVE;
    public static final Class[] PRAMS_F0_UPDATE;
    public static final String CLASS_23F0_SRV = "nc.itf.arap.supreceivable.IArapSupReceivableBillService";
    public static final String METHOD_23F0_SAVE = "save";
    public static final String METHOD_23F0_UPDATE = "update";
    public static Class C_AggSupReceivableBillVO;
    public static final Class[] PRAMS_23F0_SAVE;
    public static final Class[] PRAMS_23F0_UPDATE;
    public static final String CLASS_F1_SRV = "nc.itf.arap.payable.IArapPayableBillService";
    public static final String METHOD_F1_SAVE = "save";
    public static final String METHOD_F1_UPDATE = "update";
    public static Class C_AggPayableBillVO;
    public static final Class[] PRAMS_F1_SAVE;
    public static final Class[] PRAMS_F1_UPDATE;
    public static final String CLASS_23F1_SRV = "nc.itf.arap.cuspayable.IArapCusPayableBillService";
    public static final String METHOD_23F1_SAVE = "save";
    public static final String METHOD_23F1_UPDATE = "update";
    public static Class C_AggCusPayableBillVO;
    public static final Class[] PRAMS_23F1_SAVE;
    public static final Class[] PRAMS_23F1_UPDATE;
    public static final String CLASS_F2_SRV = "nc.itf.arap.gathering.IArapGatheringBillService";
    public static final String METHOD_F2_SAVE = "save";
    public static final String METHOD_F2_UPDATE = "update";
    public static Class C_AggGatheringBillVO;
    public static final Class[] PRAMS_F2_SAVE;
    public static final Class[] PRAMS_F2_UPDATE;
    public static final String CLASS_23F2_SRV = "nc.itf.arap.supgathering.IArapSupGatheringBillService";
    public static final String METHOD_23F2_SAVE = "save";
    public static final String METHOD_23F2_UPDATE = "update";
    public static Class C_AggSupGatheringBillVO;
    public static final Class[] PRAMS_23F2_SAVE;
    public static final Class[] PRAMS_23F2_UPDATE;
    public static final String CLASS_F3_SRV = "nc.itf.arap.pay.IArapPayBillService";
    public static final String METHOD_F3_SAVE = "save";
    public static final String METHOD_F3_UPDATE = "update";
    public static Class C_AggPayBillVO;
    public static final Class[] PRAMS_F3_SAVE;
    public static final Class[] PRAMS_F3_UPDATE;
    public static final String CLASS_23F3_SRV = "nc.itf.arap.cuspay.IArapCusPayBillService";
    public static final String METHOD_23F3_SAVE = "save";
    public static final String METHOD_23F3_UPDATE = "update";
    public static Class C_AggCusPaybillVO;
    public static final Class[] PRAMS_23F3_SAVE;
    public static final Class[] PRAMS_23F3_UPDATE;

    static {
        try {
            C_AggReceivableBillVO = Class.forName("nc.vo.arap.receivable.AggReceivableBillVO");
        }
        catch (ClassNotFoundException e) {
            Log.getInstance((String)"arapExceptionLog").error((Object)e);
        }
        PRAMS_F0_SAVE = new Class[]{C_AggReceivableBillVO};
        PRAMS_F0_UPDATE = new Class[]{C_AggReceivableBillVO};
        C_AggSupReceivableBillVO = null;
        try {
            C_AggSupReceivableBillVO = Class.forName("nc.vo.arap.supreceivable.AggSupReceivableBillVO");
        }
        catch (ClassNotFoundException e) {
            Log.getInstance((String)"arapExceptionLog").error((Object)e);
        }
        PRAMS_23F0_SAVE = new Class[]{C_AggSupReceivableBillVO};
        PRAMS_23F0_UPDATE = new Class[]{C_AggSupReceivableBillVO};
        C_AggPayableBillVO = null;
        try {
            C_AggPayableBillVO = Class.forName("nc.vo.arap.payable.AggPayableBillVO");
        }
        catch (ClassNotFoundException e) {
            Log.getInstance((String)"arapExceptionLog").error((Object)e);
        }
        PRAMS_F1_SAVE = new Class[]{C_AggPayableBillVO};
        PRAMS_F1_UPDATE = new Class[]{C_AggPayableBillVO};
        C_AggCusPayableBillVO = null;
        try {
            C_AggCusPayableBillVO = Class.forName("nc.vo.arap.cuspayable.AggCusPayableBillVO");
        }
        catch (ClassNotFoundException e) {
            Log.getInstance((String)"arapExceptionLog").error((Object)e);
        }
        PRAMS_23F1_SAVE = new Class[]{C_AggCusPayableBillVO};
        PRAMS_23F1_UPDATE = new Class[]{C_AggCusPayableBillVO};
        C_AggGatheringBillVO = null;
        try {
            C_AggGatheringBillVO = Class.forName("nc.vo.arap.gathering.AggGatheringBillVO");
        }
        catch (ClassNotFoundException e) {
            Log.getInstance((String)"arapExceptionLog").error((Object)e);
        }
        PRAMS_F2_SAVE = new Class[]{C_AggGatheringBillVO};
        PRAMS_F2_UPDATE = new Class[]{C_AggGatheringBillVO};
        C_AggSupGatheringBillVO = null;
        try {
            C_AggSupGatheringBillVO = Class.forName("nc.vo.arap.supgathering.AggSupGatheringBillVO");
        }
        catch (ClassNotFoundException e) {
            Log.getInstance((String)"arapExceptionLog").error((Object)e);
        }
        PRAMS_23F2_SAVE = new Class[]{C_AggSupGatheringBillVO};
        PRAMS_23F2_UPDATE = new Class[]{C_AggSupGatheringBillVO};
        C_AggPayBillVO = null;
        try {
            C_AggPayBillVO = Class.forName("nc.vo.arap.pay.AggPayBillVO");
        }
        catch (ClassNotFoundException e) {
            Log.getInstance((String)"arapExceptionLog").error((Object)e);
        }
        PRAMS_F3_SAVE = new Class[]{C_AggPayBillVO};
        PRAMS_F3_UPDATE = new Class[]{C_AggPayBillVO};
        C_AggCusPaybillVO = null;
        try {
            C_AggCusPaybillVO = Class.forName("nc.vo.arap.cuspay.AggCusPaybillVO");
        }
        catch (ClassNotFoundException e) {
            Log.getInstance((String)"arapExceptionLog").error((Object)e);
        }
        PRAMS_23F3_SAVE = new Class[]{C_AggCusPaybillVO};
        PRAMS_23F3_UPDATE = new Class[]{C_AggCusPaybillVO};
    }
}

