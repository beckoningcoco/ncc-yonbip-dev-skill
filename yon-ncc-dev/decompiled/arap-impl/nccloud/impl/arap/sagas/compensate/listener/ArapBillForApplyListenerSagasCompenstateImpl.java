/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.itf.arap.sagas.compensate.listener.IArapBillForApplyListenerSagasCompenstate
 */
package nccloud.impl.arap.sagas.compensate.listener;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import nc.bs.arap.busireg.ArapBillForApplyListener;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nccloud.itf.arap.sagas.compensate.listener.IArapBillForApplyListenerSagasCompenstate;

public class ArapBillForApplyListenerSagasCompenstateImpl
implements IArapBillForApplyListenerSagasCompenstate {
    public static final String SAGAS_LISTENER_BILLDATA = "SAGAS_LISTENER_BILLDATA";
    public static final String SAGAS_LISTENER_TERMDATA = "SAGAS_LISTENER_TERMDATA";

    public void doCompensate(Map<String, Serializable> sagamap) throws BusinessException {
        HashMap hashMap = (HashMap)sagamap.get("SAGAS_CALL_DATA");
        Map termMap = (Map)hashMap.get(SAGAS_LISTENER_TERMDATA);
        Map billMap = (Map)hashMap.get(SAGAS_LISTENER_BILLDATA);
        ArapBillForApplyListener backobj = new ArapBillForApplyListener();
        this.setNewMap(termMap);
        for (String key : billMap.keySet()) {
            this.setNewMap((Map)billMap.get(key));
        }
        backobj.doUpdataForSagaCompenstate(termMap, billMap);
    }

    private void setNewMap(Map<String, UFDouble> map) {
        for (String key : map.keySet()) {
            UFDouble value = map.get(key);
            UFDouble newvalue = value.multiply(-1.0);
            map.put(key, newvalue);
        }
    }
}

