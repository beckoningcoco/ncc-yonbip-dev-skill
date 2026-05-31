/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package uap.vo.prealert.engine.receiver;

import java.util.LinkedHashSet;
import java.util.Set;
import nc.vo.pub.BusinessException;
import uap.vo.prealert.engine.SendMethod;
import uap.vo.prealert.engine.receiver.DeliverableReceiver;
import uap.vo.prealert.engine.receiver.NCReceiverTypeEnum;
import uap.vo.prealert.engine.receiver.ReceiverType;
import uap.vo.prealert.util.PreAlertUtil;

public class BatchUserReceiver
implements DeliverableReceiver {
    private Set<SendMethod> sendMethodSet = new LinkedHashSet<SendMethod>();
    private Set<String> userSet = new LinkedHashSet<String>();

    @Override
    public SendMethod[] getSendMethod() {
        return this.sendMethodSet.toArray(new SendMethod[0]);
    }

    @Override
    public ReceiverType getType() {
        return NCReceiverTypeEnum.User;
    }

    @Override
    public String getPk() {
        return null;
    }

    @Override
    public String[] getUserids() throws BusinessException {
        return this.userSet.toArray(new String[0]);
    }

    public void addUser(String ... cuserid) {
        PreAlertUtil.addToCollection(this.userSet, cuserid);
    }

    public void addSendMethod(SendMethod ... sendMethod) {
        PreAlertUtil.addToCollection(this.sendMethodSet, sendMethod);
    }
}

