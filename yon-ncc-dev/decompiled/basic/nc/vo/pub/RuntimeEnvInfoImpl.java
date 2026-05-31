/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.RuntimeEnv
 */
package nc.vo.pub;

import nc.bs.framework.common.RuntimeEnv;
import nc.vo.pub.BusinessException;
import nc.vo.pub.IRuntimeEnvInfo;

public class RuntimeEnvInfoImpl
implements IRuntimeEnvInfo {
    @Override
    public boolean isRunningOnCloud() throws BusinessException {
        return RuntimeEnv.getInstance().isRunningOnCloud();
    }
}

