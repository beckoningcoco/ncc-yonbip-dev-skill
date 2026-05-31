/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package uap.vo.prealert.engine.receiver;

import nc.vo.ml.NCLangRes4VoTransl;
import uap.vo.prealert.engine.receiver.AbstractNCReceiverType;

public class UserType
extends AbstractNCReceiverType {
    @Override
    public Integer getId() {
        return 1;
    }

    @Override
    public String getName() {
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertnc", "UserType-000");
    }

    @Override
    public String[] getActualReceiver(String pk_receiver) {
        return new String[]{pk_receiver};
    }
}

