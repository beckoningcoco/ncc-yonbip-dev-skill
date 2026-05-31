/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.pub.ArapConstant
 */
package nccloud.pubimpl.arap.arappub;

import nc.vo.arap.pub.ArapConstant;
import nccloud.pubimpl.arap.arappub.ArapPubUnCloseAccCheckImpl;

public class ArUnClossAccountCheckImpl
extends ArapPubUnCloseAccCheckImpl {
    @Override
    public String getSfBillClass() {
        return ArapConstant.ARAP_AR_BILLCLASS;
    }

    @Override
    public String getmodule() {
        return "2006";
    }

    @Override
    public String getProid() {
        return "AR";
    }
}

