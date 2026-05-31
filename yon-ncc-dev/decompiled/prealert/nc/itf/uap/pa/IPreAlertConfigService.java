/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.uap.scheduler.TimeConfigVO
 */
package nc.itf.uap.pa;

import java.util.List;
import nc.bs.pub.taskcenter.BgWorkingContext;
import nc.bs.pub.taskcenter.IReportLikeWork;
import nc.bs.pub.taskcenter.TaskAdminPojo;
import nc.bs.pub.taskcenter.WorkingLogVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.pa.AlertregistryVO;
import nc.vo.pub.pa.AlertsendconfigVO;
import nc.vo.pub.pa.AlerttypeconfigVO;
import nc.vo.pub.pa.TimingSettingVO;
import nc.vo.uap.scheduler.TimeConfigVO;

public interface IPreAlertConfigService {
    public boolean createTaskInstance(AlertregistryVO var1) throws BusinessException;

    public void startReportLikeWork(IReportLikeWork var1, TimingSettingVO var2) throws BusinessException;

    public void startReportLikeWork(IReportLikeWork var1, String var2, TimingSettingVO var3) throws BusinessException;

    public void startReportLikeWork(IReportLikeWork var1, TimingSettingVO var2, boolean var3) throws BusinessException;

    public boolean startOnceTask(String var1, String var2, BgWorkingContext var3, TimeConfigVO var4, String var5, String var6) throws BusinessException;

    public String[] insertAlertRegistries(AlertregistryVO[] var1) throws BusinessException;

    public int updateAlertRegistries(AlertregistryVO[] var1) throws BusinessException;

    public void deleteRegistriesByPk(String[] var1) throws BusinessException;

    public String[] copyAlertRegistries(AlertregistryVO[] var1) throws BusinessException;

    public List<TaskAdminPojo> listBgTasks() throws BusinessException;

    public List<TaskAdminPojo> listTempTasks(String var1) throws BusinessException;

    public List<TaskAdminPojo> listPreAlertTasks() throws BusinessException;

    public void removeTask(String var1, String var2) throws BusinessException;

    public void manualExecute(String var1) throws BusinessException;

    public void suspendTask(String var1) throws BusinessException;

    public void resumeTask(String var1) throws BusinessException;

    public String startBackgroundTask(String var1, String var2, String var3, TimingSettingVO var4, AlerttypeconfigVO[] var5, AlertsendconfigVO[] var6) throws BusinessException;

    public void deleteTaskLogs(WorkingLogVO[] var1) throws BusinessException;

    public int updateAlertRegistriesStatus(AlertregistryVO[] var1, boolean var2) throws BusinessException;

    public String copyAlertRegistry(AlertregistryVO var1) throws BusinessException;

    public void initLoadAlertRegistry(AlertregistryVO var1) throws BusinessException;
}

