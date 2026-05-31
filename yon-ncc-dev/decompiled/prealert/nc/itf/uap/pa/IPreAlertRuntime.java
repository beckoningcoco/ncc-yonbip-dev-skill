/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.uap.pa;

import java.util.List;
import nc.bs.pub.taskcenter.AlertRuntimeInfo;
import nc.vo.pub.BusinessException;
import nc.vo.pub.pa.AlertregistryVO;

public interface IPreAlertRuntime {
    public AlertRuntimeInfo addRuntimeInfo(AlertregistryVO var1, String var2) throws BusinessException;

    public AlertRuntimeInfo getRuntimeInfoByTaskId(String var1) throws BusinessException;

    public List<AlertRuntimeInfo> listSuspendedPreAlertTask(String var1) throws BusinessException;

    public List<AlertRuntimeInfo> listSuspendedBackgroundTask(String var1) throws BusinessException;

    public List<AlertRuntimeInfo> listSuspendedTempTask(String var1, String var2) throws BusinessException;

    public void removeRuntimeInfoByTaskId(String var1) throws BusinessException;

    public void removeAllExceptSuspended_RequiresNew(String var1, String var2, String var3) throws BusinessException;

    public void removeAllExceptSuspended_RequiresNew(String var1) throws BusinessException;

    public void logExecutionSequence_RequiresNew(String var1, String var2) throws BusinessException;
}

