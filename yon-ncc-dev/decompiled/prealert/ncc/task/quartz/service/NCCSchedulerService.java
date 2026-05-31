/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package ncc.task.quartz.service;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import java.util.List;
import ncc.task.quartz.dao.entity.ScheduleJob;

@RemoteCall(value="ncc-quartz", proto="application/octet-stream")
public interface NCCSchedulerService {
    public boolean addJob(ScheduleJob var1);

    public boolean pauseJob(ScheduleJob var1);

    public boolean resumeJob(ScheduleJob var1);

    public boolean rescheduleJob(ScheduleJob var1);

    public boolean deleteJob(ScheduleJob var1);

    public boolean reLoadJobs(List<ScheduleJob> var1);

    public List<ScheduleJob> getList();

    public ScheduleJob getByTaskId(String var1);

    public boolean update(ScheduleJob var1);

    public String execute(String var1);

    public boolean remove(String var1);

    public boolean delete(String var1);
}

