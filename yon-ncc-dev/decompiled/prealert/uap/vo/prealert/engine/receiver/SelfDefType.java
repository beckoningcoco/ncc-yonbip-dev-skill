/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package uap.vo.prealert.engine.receiver;

import nc.vo.pub.BusinessException;
import uap.vo.prealert.engine.receiver.AbstractNCReceiverType;

public class SelfDefType
extends AbstractNCReceiverType {
    private static final long serialVersionUID = -1412415372185577287L;

    @Override
    public Integer getId() {
        return 86;
    }

    @Override
    public String getName() {
        return "86";
    }

    @Override
    public String[] getActualReceiver(String pk_receiver) throws BusinessException {
        return null;
    }
}

