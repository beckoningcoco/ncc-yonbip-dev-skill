/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

import nc.vo.pub.BusinessException;

public interface IRuntimeEnvInfo {
    public boolean isRunningOnCloud() throws BusinessException;
}

