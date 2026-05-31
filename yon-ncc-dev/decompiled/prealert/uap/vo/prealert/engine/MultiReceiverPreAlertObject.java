/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.ui.pub.print.IDataSource
 */
package uap.vo.prealert.engine;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import nc.bs.pub.pa.PreAlertObject;
import nc.bs.pub.pa.PreAlertReturnType;
import nc.ui.pub.print.IDataSource;
import uap.vo.prealert.engine.SendMethod;
import uap.vo.prealert.engine.receiver.DeliverableReceiver;
import uap.vo.prealert.engine.receiver.ReceiverImpl;
import uap.vo.prealert.engine.receiver.ReceiverType;
import uap.vo.prealert.util.PreAlertUtil;

public class MultiReceiverPreAlertObject
extends PreAlertObject {
    private Map<PreAlertObject, Set<DeliverableReceiver>> objRcvMap = new LinkedHashMap<PreAlertObject, Set<DeliverableReceiver>>();
    private PreAlertObject funcnodePopupSenderPreAlertObject;

    @Override
    public PreAlertReturnType getReturnType() {
        if (this.objRcvMap.size() == 0) {
            return PreAlertReturnType.RETURNNOTHING;
        }
        return PreAlertReturnType.RETURN_MULTIPLE_RECEIVER_OBJECT;
    }

    @Override
    public Object getReturnObj() {
        return this;
    }

    public void add(PreAlertObject object, DeliverableReceiver ... receiver) {
        Set<DeliverableReceiver> rcvSet = this.objRcvMap.get(object);
        if (rcvSet == null) {
            rcvSet = new LinkedHashSet<DeliverableReceiver>();
            this.objRcvMap.put(object, rcvSet);
        }
        PreAlertUtil.addToCollection(rcvSet, receiver);
    }

    public void add(IDataSource ds, DeliverableReceiver ... receiver) {
        PreAlertObject pao = new PreAlertObject();
        pao.setReturnType(PreAlertReturnType.RETURNDATASOURCE);
        pao.setReturnObj(ds);
        this.add(pao, receiver);
    }

    public void add(IDataSource ds, SendMethod[] sendMethods, ReceiverType receiverType, String pk_receiver) {
        ReceiverImpl rcv = new ReceiverImpl(sendMethods, receiverType, pk_receiver);
        this.add(ds, rcv);
    }

    public void add(PreAlertObject pao, SendMethod[] sendMethods, ReceiverType receiverType, String pk_receiver) {
        ReceiverImpl rcv = new ReceiverImpl(sendMethods, receiverType, pk_receiver);
        this.add(pao, rcv);
    }

    public PreAlertObject[] getPreAlertObjects() {
        return this.objRcvMap.keySet().toArray(new PreAlertObject[0]);
    }

    public DeliverableReceiver[] getReceiverOf(PreAlertObject pao) {
        Set<DeliverableReceiver> rcvSet = this.objRcvMap.get(pao);
        if (rcvSet != null) {
            return rcvSet.toArray(new DeliverableReceiver[0]);
        }
        return new DeliverableReceiver[0];
    }

    public PreAlertObject getFuncnodePopupSenderPreAlertObject() {
        return this.funcnodePopupSenderPreAlertObject;
    }

    public void setFuncnodePopupSenderPreAlertObject(PreAlertObject funcnodePopupSenderPreAlertObject) {
        this.funcnodePopupSenderPreAlertObject = funcnodePopupSenderPreAlertObject;
    }
}

