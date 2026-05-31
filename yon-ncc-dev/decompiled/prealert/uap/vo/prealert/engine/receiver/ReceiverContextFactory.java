/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.vo.pub.BusinessException
 *  nccloud.commons.lang.ArrayUtils
 */
package uap.vo.prealert.engine.receiver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import nc.bs.framework.common.NCLocator;
import nc.vo.pub.BusinessException;
import nc.vo.pub.pa.AlertsendconfigVO;
import nccloud.commons.lang.ArrayUtils;
import uap.itf.prealert.engine.ReceiverTypeResolver;
import uap.itf.prealert.engine.SendMethodResolver;
import uap.vo.prealert.engine.SendMethod;
import uap.vo.prealert.engine.receiver.DeliverableReceiver;
import uap.vo.prealert.engine.receiver.ReceiverContext;
import uap.vo.prealert.engine.receiver.ReceiverImpl;
import uap.vo.prealert.engine.receiver.ReceiverType;
import uap.vo.prealert.engine.receiver.SelfDefType;
import uap.vo.prealert.util.PreAlertUtil;

public class ReceiverContextFactory {
    static ReceiverTypeResolver rtResolver = (ReceiverTypeResolver)NCLocator.getInstance().lookup(ReceiverTypeResolver.class);
    static SendMethodResolver smResolver = (SendMethodResolver)NCLocator.getInstance().lookup(SendMethodResolver.class);

    public static ReceiverContext getReceiverContext(AlertsendconfigVO[] sendConfigs) throws BusinessException {
        HashSet<DeliverableReceiver> rcvSet = new HashSet<DeliverableReceiver>();
        if (ArrayUtils.isEmpty((Object[])sendConfigs)) {
            return new ReceiverContext(null);
        }
        for (AlertsendconfigVO config : sendConfigs) {
            Collection<DeliverableReceiver> resolved = ReceiverContextFactory.resolveV61Config(config);
            if (resolved == null) continue;
            rcvSet.addAll(resolved);
        }
        DeliverableReceiver[] origin = rcvSet.toArray(new DeliverableReceiver[0]);
        DeliverableReceiver[] compacted = ReceiverContextFactory.compact(origin);
        ReceiverContext ctx = new ReceiverContext(compacted);
        return ctx;
    }

    private static Collection<DeliverableReceiver> resolveV61Config(AlertsendconfigVO config) throws BusinessException {
        SendMethod[] sendMethods = null;
        try {
            sendMethods = new SendMethod[]{smResolver.resolveById(config.getSendmethod())};
        }
        catch (IllegalArgumentException e) {
            return null;
        }
        HashSet<DeliverableReceiver> resolved = new HashSet<DeliverableReceiver>();
        try {
            String[] ids;
            for (String id : ids = config.getReceiverid().split(";")) {
                id = id.trim();
                int begin = id.indexOf("[");
                int end = id.indexOf("]");
                int type = Integer.valueOf(id.substring(begin + 1, end));
                String realId = id.substring(end + 1);
                ReceiverType receiverType = rtResolver.resolveById(type);
                if (type == 86) {
                    final String[] name = config.getReceivername().split(";");
                    receiverType = new SelfDefType(){
                        private static final long serialVersionUID = 1L;

                        @Override
                        public String getName() {
                            return name[0];
                        }
                    };
                }
                ReceiverImpl rcv = new ReceiverImpl(sendMethods, receiverType, realId);
                resolved.add(rcv);
            }
            if (PreAlertUtil.isEmpty(ids)) {
                return null;
            }
        }
        catch (Exception e) {
            return null;
        }
        return resolved;
    }

    private static DeliverableReceiver[] compact(DeliverableReceiver[] origin) {
        HashMap map = new HashMap();
        ArrayList<ReceiverImpl> result = new ArrayList<ReceiverImpl>();
        if (PreAlertUtil.isNotEmpty(origin)) {
            Set mSet;
            String key;
            for (DeliverableReceiver rcv : origin) {
                key = rcv.getType().getId() + rcv.getPk();
                mSet = (HashSet)map.get(key);
                if (mSet == null) {
                    mSet = new HashSet();
                    map.put(key, mSet);
                }
                PreAlertUtil.addToCollection(mSet, rcv.getSendMethod());
            }
            for (DeliverableReceiver rcv : origin) {
                key = rcv.getType().getId() + rcv.getPk();
                mSet = (Set)map.get(key);
                if (mSet == null) continue;
                ReceiverImpl compacted = new ReceiverImpl(mSet.toArray(new SendMethod[0]), rcv.getType(), rcv.getPk());
                result.add(compacted);
                map.remove(key);
            }
        }
        return result.toArray(new DeliverableReceiver[0]);
    }
}

