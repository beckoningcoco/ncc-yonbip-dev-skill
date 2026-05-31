/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.uap.scheduler.TaskStatus
 */
package nc.bs.pub.taskcenter;

import java.io.Serializable;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.uap.scheduler.TaskStatus;

public class TaskAdminPojo
implements Serializable {
    private static final long serialVersionUID = -1164650925449582025L;
    private String taskname;
    private String taskid;
    private String tasktype;
    private int status;
    private long avgtime;
    private String schetime;
    private int runcount;
    private String deployCorpname;
    private String registryPK;
    private String servername;
    private String serverinstanceid;

    public String getDeployCorpname() {
        return this.deployCorpname;
    }

    public String getServername() {
        return this.servername;
    }

    public void setServername(String servername) {
        this.servername = servername;
    }

    public String getServerinstanceid() {
        return this.serverinstanceid;
    }

    public void setServerinstanceid(String serverinstanceid) {
        this.serverinstanceid = serverinstanceid;
    }

    public void setDeployCorpname(String deployCorpname) {
        this.deployCorpname = deployCorpname;
    }

    public String getTasktype() {
        return this.tasktype;
    }

    public void setTasktype(String tasktype) {
        this.tasktype = tasktype;
    }

    public int getRuncount() {
        return this.runcount;
    }

    public void setRuncount(int runcount) {
        this.runcount = runcount;
    }

    public String getSchetime() {
        return this.schetime;
    }

    public void setSchetime(String schetime) {
        this.schetime = schetime;
    }

    public long getAvgtime() {
        return this.avgtime;
    }

    public void setAvgtime(long avgtime) {
        this.avgtime = avgtime;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTaskid() {
        return this.taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public String getTaskname() {
        return this.taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getRegistryPK() {
        return this.registryPK;
    }

    public void setRegistryPK(String registryPK) {
        this.registryPK = registryPK;
    }

    public static String i18nStatus(int iStatus) {
        if (iStatus == TaskStatus.OUT_SCHEDULE.intValue()) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000372");
        }
        if (iStatus == TaskStatus.SCHEDULING.intValue() || iStatus == TaskStatus.SCHEDULING_EXECUTABLE.intValue()) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000373");
        }
        if (iStatus == TaskStatus.EXECUTABLE.intValue() || iStatus == TaskStatus.EXECUTABLE_RUNNING.intValue()) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000390");
        }
        if (iStatus == TaskStatus.RUNNING.intValue()) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000375");
        }
        if (iStatus == TaskStatus.FINISHED.intValue()) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000376");
        }
        if (iStatus == TaskStatus.PAUSED.intValue()) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000377");
        }
        if (iStatus == TaskStatus.FAILED.intValue()) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000378");
        }
        if (iStatus == TaskStatus.CANCELLING.intValue()) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000379");
        }
        if (iStatus == TaskStatus.CANCELLED.intValue()) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000380");
        }
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000371");
    }
}

