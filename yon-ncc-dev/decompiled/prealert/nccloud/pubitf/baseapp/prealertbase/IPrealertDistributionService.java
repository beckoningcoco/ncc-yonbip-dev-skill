/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nccloud.pubitf.baseapp.prealertbase;

import nc.vo.pub.BusinessException;

public interface IPrealertDistributionService {
    public void distributeServerName() throws BusinessException;

    public String getServerName();

    public void setNextCursor();

    public String[] getServerNames();
}

