/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.framework.common.RuntimeEnv
 */
package nc.vo.pub;

import nc.bs.framework.common.NCLocator;
import nc.bs.framework.common.RuntimeEnv;
import nc.vo.pub.BusinessException;
import nc.vo.pub.IRuntimeEnvInfo;

public class RuntimeInfoProxy {
    private static Boolean isRunningOnCloud;

    public static boolean isRunningOnCloud() {
        if (isRunningOnCloud == null) {
            if (RuntimeEnv.getInstance().isRunningInServer()) {
                isRunningOnCloud = RuntimeEnv.getInstance().isRunningOnCloud();
            } else {
                IRuntimeEnvInfo info = (IRuntimeEnvInfo)NCLocator.getInstance().lookup(IRuntimeEnvInfo.class);
                try {
                    isRunningOnCloud = info.isRunningOnCloud();
                }
                catch (BusinessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return isRunningOnCloud;
    }

    private RuntimeInfoProxy() {
    }
}

