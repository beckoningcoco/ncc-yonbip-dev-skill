/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.bs.pub.taskcenter;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.pa.AlertregistryVO;

public class WorkingLogVO
extends SuperVO {
    private String pk_workingtasklog;
    private String taskname;
    private String taskid;
    private UFBoolean workingresult;
    private String logstr;
    private UFDateTime starttime;
    private UFDateTime endtime;
    private String pkregistry;
    private String sagaId;
    private AlertregistryVO registry;
    private Integer tasktype;
    private String servername;
    private String serverinstanceid;
    private Integer index;

    public Integer getIndex() {
        return this.index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getPk_workingtasklog() {
        return this.pk_workingtasklog;
    }

    public void setPk_workingtasklog(String pk_workingtasklog) {
        this.pk_workingtasklog = pk_workingtasklog;
    }

    public Integer getTasktype() {
        return this.tasktype;
    }

    public void setTasktype(Integer tasktype) {
        this.tasktype = tasktype;
    }

    public AlertregistryVO getRegistry() {
        return this.registry;
    }

    public void setRegistry(AlertregistryVO registry) {
        this.registry = registry;
    }

    public String getPkregistry() {
        return this.pkregistry;
    }

    public void setPkregistry(String pkregistry) {
        this.pkregistry = pkregistry;
    }

    public UFDateTime getStarttime() {
        return this.starttime;
    }

    public void setStarttime(UFDateTime starttime) {
        this.starttime = starttime;
    }

    public UFDateTime getEndtime() {
        return this.endtime;
    }

    public void setEndtime(UFDateTime endtime) {
        this.endtime = endtime;
    }

    public String getLogstr() {
        return this.logstr;
    }

    public void setLogstr(String logstr) {
        this.logstr = logstr;
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

    public UFBoolean getWorkingresult() {
        return this.workingresult;
    }

    public void setWorkingresult(UFBoolean workingresult) {
        this.workingresult = workingresult;
    }

    public String getPKFieldName() {
        return "pk_workingtasklog";
    }

    public String getParentPKFieldName() {
        return null;
    }

    public String getTableName() {
        return "pub_workingtasklog";
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

    public String getSagaId() {
        return this.sagaId;
    }

    public void setSagaId(String sagaId) {
        this.sagaId = sagaId;
    }
}

