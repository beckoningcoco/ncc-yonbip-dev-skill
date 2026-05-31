/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nccloud.commons.lang.ArrayUtils
 */
package uap.vo.prealert.engine.receiver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.vo.pub.BusinessException;
import nccloud.commons.lang.ArrayUtils;
import uap.vo.prealert.engine.SendMethod;
import uap.vo.prealert.engine.receiver.DeliverableReceiver;
import uap.vo.prealert.engine.receiver.ReceiverType;
import uap.vo.prealert.util.PreAlertUtil;

public class ReceiverContext {
    private DeliverableReceiver[] receivers = null;
    private Map<SendMethod, List<DeliverableReceiver>> smRcvMap = null;
    private Map<ReceiverType, List<DeliverableReceiver>> rtRcvMap = null;

    public ReceiverContext(DeliverableReceiver[] receivers) {
        this.receivers = receivers != null ? receivers : new DeliverableReceiver[0];
        this.init();
    }

    private void init() {
        this.smRcvMap = new HashMap<SendMethod, List<DeliverableReceiver>>();
        this.rtRcvMap = new HashMap<ReceiverType, List<DeliverableReceiver>>();
        for (DeliverableReceiver r : this.receivers) {
            List<DeliverableReceiver> rtRcvList = this.rtRcvMap.get(r.getType());
            if (rtRcvList == null) {
                rtRcvList = new ArrayList<DeliverableReceiver>();
                this.rtRcvMap.put(r.getType(), rtRcvList);
            }
            rtRcvList.add(r);
            for (SendMethod sm : r.getSendMethod()) {
                List<DeliverableReceiver> smRcvList = this.smRcvMap.get(sm);
                if (smRcvList == null) {
                    smRcvList = new ArrayList<DeliverableReceiver>();
                    this.smRcvMap.put(sm, smRcvList);
                }
                smRcvList.add(r);
            }
        }
    }

    public DeliverableReceiver[] getReceiverBy(SendMethod sendMethod) {
        List<DeliverableReceiver> rcvList = this.smRcvMap.get(sendMethod);
        if (rcvList != null) {
            return rcvList.toArray(new DeliverableReceiver[0]);
        }
        return new DeliverableReceiver[0];
    }

    public DeliverableReceiver[] getReceiveryBy(ReceiverType type) {
        return null;
    }

    public DeliverableReceiver[] getReceivers() {
        return this.receivers;
    }

    public SendMethod[] getSendMethods() {
        return this.smRcvMap.keySet().toArray(new SendMethod[0]);
    }

    public ReceiverType[] getReceiverTypes() {
        return this.rtRcvMap.keySet().toArray(new ReceiverType[0]);
    }

    public String[] getUseridsBy(SendMethod sendMethod) throws BusinessException {
        Set<String> cuseridSet = this.getUseridSetBy(sendMethod);
        return cuseridSet.toArray(new String[0]);
    }

    private Set<String> getUseridSetBy(SendMethod sendMethod) throws BusinessException {
        HashSet<String> cuseridSet = new HashSet<String>();
        List<DeliverableReceiver> rcvList = this.smRcvMap.get(sendMethod);
        if (rcvList != null) {
            for (DeliverableReceiver r : rcvList) {
                if (!ArrayUtils.contains((Object[])r.getSendMethod(), (Object)sendMethod)) continue;
                PreAlertUtil.addToCollection(cuseridSet, r.getUserids());
            }
        }
        return cuseridSet;
    }

    public String[] getCuserids() throws BusinessException {
        SendMethod[] sendMethods = this.getSendMethods();
        HashSet<String> useridSet = new HashSet<String>();
        for (SendMethod sm : sendMethods) {
            Set<String> got = this.getUseridSetBy(sm);
            useridSet.addAll(got);
        }
        return useridSet.toArray(new String[0]);
    }
}

