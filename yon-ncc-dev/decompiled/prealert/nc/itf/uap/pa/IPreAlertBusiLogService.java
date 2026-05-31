/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.uap.pa;

import nc.bs.pub.taskcenter.AlertRuntimeInfo;
import nc.bs.pub.taskcenter.WorkingLogVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.pa.AlertmessageVO;
import nc.vo.pub.pa.AlertregistryVO;

public interface IPreAlertBusiLogService {
    public void addRegistry(AlertregistryVO var1) throws BusinessException;

    public void editRegistry(AlertregistryVO var1, AlertregistryVO var2) throws BusinessException;

    public void deleteRegistry(AlertregistryVO var1) throws BusinessException;

    public void manualExecute(AlertRuntimeInfo var1) throws BusinessException;

    public void cancelExecution(AlertRuntimeInfo var1) throws BusinessException;

    public void suspendExecution(AlertRuntimeInfo var1) throws BusinessException;

    public void resumeExcution(AlertRuntimeInfo var1) throws BusinessException;

    public void deleteWorkingLog(WorkingLogVO var1) throws BusinessException;

    public void activateRegistry(AlertregistryVO var1) throws BusinessException;

    public void deactivateRegistry(AlertregistryVO var1) throws BusinessException;

    public void deleteAlertMessage(AlertmessageVO var1) throws BusinessException;
}

