/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.ui.pf.pub.TranstypeRefModel
 */
package nc.vo.arap.ref;

import nc.ui.pf.pub.TranstypeRefModel;

public class APTranstypeRefModel
extends TranstypeRefModel {
    public String getWherePart() {
        String superSql = super.getWherePart();
        return superSql + " and systemcode='AP'";
    }
}

