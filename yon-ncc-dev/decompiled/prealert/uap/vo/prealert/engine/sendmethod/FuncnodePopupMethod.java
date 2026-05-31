/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package uap.vo.prealert.engine.sendmethod;

import nc.vo.ml.NCLangRes4VoTransl;
import uap.vo.prealert.engine.sendmethod.AbstractNCSendMethod;

public class FuncnodePopupMethod
extends AbstractNCSendMethod {
    @Override
    public Integer getId() {
        return 65535;
    }

    @Override
    public String getName() {
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("riasmprealert", "FuncnodePopupMethod-000000");
    }
}

