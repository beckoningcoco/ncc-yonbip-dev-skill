/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.pub.IArapBilltypeInfo
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nccloud.bs.arap.sagas.util.SagasUtils
 *  nccloud.bs.arap.util.Collections
 *  nccloud.itf.arap.sagas.compensate.refund.IRefundSagasCompensateService
 */
package nccloud.bs.arap.sagas.compensate.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.IArapBilltypeInfo;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nccloud.bs.arap.sagas.util.SagasUtils;
import nccloud.bs.arap.util.Collections;
import nccloud.itf.arap.sagas.compensate.refund.IRefundSagasCompensateService;

public class RefundCompensateUtils {
    public static final String BILLIVO = "BillVO";
    public static final String BILLITEMVO = "BillItemVO";
    public static final String TERMVO = "TermVO";
    public static final String ARAPBUSIDATAVO = "ArapBusiDataVO";
    public static final String TALLYVO = "TallyVO";
    private Map<String, String[]> compensateFieldMap = null;
    private HashMap<String, ArrayList<Map<String, Object>>> compensateData = null;

    public RefundCompensateUtils(AggregatedValueObject bill) {
        if (SagasUtils.isMerged) {
            return;
        }
        this.init(bill);
    }

    private void init(AggregatedValueObject bill) {
        String pk_billtype = (String)bill.getParentVO().getAttributeValue("pk_billtype");
        IArapBilltypeInfo billtypevo = ArapBillTypeInfo.getInstance((Object)pk_billtype);
        String billKeyField = billtypevo.getTablePrimaryKeyBill();
        String billItemField = billtypevo.getTablePrimaryKeyItem();
        this.compensateFieldMap = new HashMap<String, String[]>();
        this.compensateFieldMap.put(BILLIVO, new String[]{billKeyField, "pk_billtype", "isrefund"});
        this.compensateFieldMap.put(BILLITEMVO, new String[]{billItemField, "occupationmny"});
        this.compensateFieldMap.put(TERMVO, new String[]{"pk_termitem", "occupationmny"});
        this.compensateFieldMap.put(ARAPBUSIDATAVO, new String[]{"pk_busidata", "isrefund", "occupationmny"});
        this.compensateFieldMap.put(TALLYVO, new String[]{"pk_tally", "isrefund", "isrefund"});
        this.compensateData = new HashMap();
        this.compensateData.put(BILLIVO, new ArrayList());
        this.compensateData.put(BILLITEMVO, new ArrayList());
        this.compensateData.put(TERMVO, new ArrayList());
        this.compensateData.put(ARAPBUSIDATAVO, new ArrayList());
        this.compensateData.put(TALLYVO, new ArrayList());
    }

    public void extractCompensateData(CircularlyAccessibleValueObject vo, String key) {
        if (SagasUtils.isMerged) {
            return;
        }
        ArrayList<Map<String, Object>> compensateList = this.compensateData.get(key);
        String[] compensateFields = this.compensateFieldMap.get(key);
        HashMap<String, Object> compensateMap = new HashMap<String, Object>();
        for (String compensateField : compensateFields) {
            compensateMap.put(compensateField, vo.getAttributeValue(compensateField));
        }
        compensateList.add(compensateMap);
    }

    public void setCompensateService() {
        if (SagasUtils.isMerged || Collections.isEmpty(this.compensateData)) {
            return;
        }
        HashMap<String, HashMap<String, ArrayList<Map<String, Object>>>> paramMap = new HashMap<String, HashMap<String, ArrayList<Map<String, Object>>>>(16);
        paramMap.put("SAGAS_CALL_DATA", this.compensateData);
        Class<IRefundSagasCompensateService> serviceClazz = IRefundSagasCompensateService.class;
        SagasUtils.setCompensateService(serviceClazz, paramMap);
    }
}

