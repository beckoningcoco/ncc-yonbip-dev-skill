/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package uap.vo.prealert.engine.sendmethod;

import nc.vo.ml.NCLangRes4VoTransl;
import uap.vo.prealert.engine.sendmethod.AbstractNCSendMethod;

public class PushMethod
extends AbstractNCSendMethod {
    private static final long serialVersionUID = 5615901360636416148L;

    @Override
    public Integer getId() {
        return 65536;
    }

    @Override
    public String getName() {
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("riasmprealert", "PushMethod-000000");
    }
}

