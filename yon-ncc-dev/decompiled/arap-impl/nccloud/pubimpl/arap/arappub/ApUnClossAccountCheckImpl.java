/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.pub.ArapConstant
 */
package nccloud.pubimpl.arap.arappub;

import nc.vo.arap.pub.ArapConstant;
import nccloud.pubimpl.arap.arappub.ArapPubUnCloseAccCheckImpl;

public class ApUnClossAccountCheckImpl
extends ArapPubUnCloseAccCheckImpl {
    @Override
    public String getSfBillClass() {
        return ArapConstant.ARAP_AP_BILLCLASS;
    }

    @Override
    public String getmodule() {
        return "2008";
    }

    @Override
    public String getProid() {
        return "AP";
    }
}

