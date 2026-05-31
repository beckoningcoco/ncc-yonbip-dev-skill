/*
 * Decompiled with CFR 0.152.
 */
package ncc.task.quartz.dao.entity;

import java.io.Serializable;
import ncc.task.quartz.dao.entity.NCCTimeSettingVO;

public class ScheduleJob
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String taskId;
    private String groupId;
    private String taskName;
    private Integer taskType;
    private String execServerName;
    private String serverName;
    private String execServerAddress;
    private String execServerInstanceid;
    private String jobClassName;
    private String cronExpression;
    private String pk_task;
    private String dataSource;
    private String tenant;
    private String moduleCode;
    private Integer taskStatus;
    private Integer taskPriority;
    private Long beginExecTime = -1L;
    private Long elapsedTime = 0L;
    private Long avgExecTime = 0L;
    private Long scheExecTime = 0L;
    private String taskClass;
    private Integer runCount;
    private String userId;
    private String ts;
    private Integer dr;
    private String isTiming;
    private NCCTimeSettingVO timeSettingVO;

    public ScheduleJob(String taskId, String groupId, String taskName, Integer taskType, String execServerName, String execServerAddress, String execServerInstanceid, String jobClassName, String cronExpression, String dataSource, String tenant, Integer taskStatus, Integer taskPriority, Long beginExecTime, Long elapsedTime, Long avgExecTime, Long scheExecTime, String taskClass, Integer runCount, String userId, String ts, Integer dr, String isTiming) {
        this.taskId = taskId;
        this.groupId = groupId;
        this.taskName = taskName;
        this.taskType = taskType;
        this.execServerName = execServerName;
        this.execServerAddress = execServerAddress;
        this.execServerInstanceid = execServerInstanceid;
        this.jobClassName = jobClassName;
        this.cronExpression = cronExpression;
        this.dataSource = dataSource;
        this.tenant = tenant;
        this.taskStatus = taskStatus;
        this.taskPriority = taskPriority;
        this.beginExecTime = beginExecTime;
        this.elapsedTime = elapsedTime;
        this.avgExecTime = avgExecTime;
        this.scheExecTime = scheExecTime;
        this.taskClass = taskClass;
        this.runCount = runCount;
        this.userId = userId;
        this.ts = ts;
        this.dr = dr;
        this.isTiming = isTiming;
    }

    public String getServerName() {
        return this.serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getPk_task() {
        return this.pk_task;
    }

    public void setPk_task(String pk_task) {
        this.pk_task = pk_task;
    }

    public String getModuleCode() {
        return this.moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public ScheduleJob() {
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public Integer getTaskType() {
        return this.taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public String getExecServerName() {
        return this.execServerName;
    }

    public void setExecServerName(String execServerName) {
        this.execServerName = execServerName;
    }

    public String getExecServerAddress() {
        return this.execServerAddress;
    }

    public void setExecServerAddress(String execServerAddress) {
        this.execServerAddress = execServerAddress;
    }

    public String getExecServerInstanceid() {
        return this.execServerInstanceid;
    }

    public void setExecServerInstanceid(String execServerInstanceid) {
        this.execServerInstanceid = execServerInstanceid;
    }

    public String getJobClassName() {
        return this.jobClassName;
    }

    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName == null ? null : jobClassName.trim();
    }

    public String getCronExpression() {
        return this.cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression == null ? null : cronExpression.trim();
    }

    public String getDataSource() {
        return this.dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }

    public String getTenant() {
        return this.tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant == null ? null : tenant.trim();
    }

    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Integer getTaskPriority() {
        return this.taskPriority;
    }

    public void setTaskPriority(Integer taskPriority) {
        this.taskPriority = taskPriority;
    }

    public Long getElapsedTime() {
        return this.elapsedTime;
    }

    public void setElapsedTime(Long elapsedTime) {
        this.elapsedTime = elapsedTime == null ? 0L : elapsedTime;
    }

    public Long getAvgExecTime() {
        return this.avgExecTime;
    }

    public void setAvgExecTime(Long avgExecTime) {
        this.avgExecTime = avgExecTime == null ? 0L : avgExecTime;
    }

    public Long getScheExecTime() {
        return this.scheExecTime;
    }

    public void setScheExecTime(Long scheExecTime) {
        this.scheExecTime = scheExecTime == null ? 0L : scheExecTime;
    }

    public String getTaskClass() {
        return this.taskClass;
    }

    public void setTaskClass(String taskClass) {
        this.taskClass = taskClass == null ? null : taskClass.trim();
    }

    public Integer getRunCount() {
        return this.runCount;
    }

    public void setRunCount(Integer runCount) {
        this.runCount = runCount;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getTs() {
        return this.ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }

    public Integer getDr() {
        return this.dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public String getIsTiming() {
        return this.isTiming;
    }

    public void setIsTiming(String isTiming) {
        this.isTiming = isTiming;
    }

    public NCCTimeSettingVO getTimeSettingVO() {
        return this.timeSettingVO;
    }

    public void setTimeSettingVO(NCCTimeSettingVO timeSettingVO) {
        this.timeSettingVO = timeSettingVO;
    }

    public Long getBeginExecTime() {
        return this.beginExecTime;
    }

    public void setBeginExecTime(Long beginExecTime) {
        this.beginExecTime = beginExecTime == null ? 0L : beginExecTime;
    }
}

