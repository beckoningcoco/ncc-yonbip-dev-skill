/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package uap.vo.prealert.engine.receiver;

import nc.vo.pub.BusinessException;
import uap.vo.prealert.engine.SendMethod;
import uap.vo.prealert.engine.receiver.DeliverableReceiver;
import uap.vo.prealert.engine.receiver.ReceiverType;
import uap.vo.prealert.engine.sendmethod.NCSendMethodEnum;

public class FuncnodePopupReceiver
implements DeliverableReceiver {
    @Override
    public SendMethod[] getSendMethod() {
        return new SendMethod[]{NCSendMethodEnum.FuncnodePopup};
    }

    @Override
    public ReceiverType getType() {
        return null;
    }

    @Override
    public String getPk() {
        return null;
    }

    @Override
    public String[] getUserids() throws BusinessException {
        return null;
    }
}

