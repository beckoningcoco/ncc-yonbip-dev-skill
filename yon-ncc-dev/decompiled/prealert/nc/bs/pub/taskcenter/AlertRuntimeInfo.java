/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.pub.taskcenter;

import java.io.Serializable;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;

public class AlertRuntimeInfo
extends SuperVO
implements Serializable {
    private static final long serialVersionUID = 7513462039396687182L;
    private String pk_alertruntime;
    private String registryid;
    private Integer registrytype;
    private String taskid;
    private UFBoolean active;
    private String serverinstanceid;
    private String creator;
    private String mystatus;
    private String servername;
    private String serveraddress;

    public String getRegistryid() {
        return this.registryid;
    }

    public void setRegistryid(String registryid) {
        this.registryid = registryid;
    }

    public Integer getRegistrytype() {
        return this.registrytype;
    }

    public void setRegistrytype(Integer registrytype) {
        this.registrytype = registrytype;
    }

    public String getTaskid() {
        return this.taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public String getServerinstanceid() {
        return this.serverinstanceid;
    }

    public void setServerinstanceid(String serverinstanceid) {
        this.serverinstanceid = serverinstanceid;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getMystatus() {
        return this.mystatus;
    }

    public void setMystatus(String mystatus) {
        this.mystatus = mystatus;
    }

    public String getServername() {
        return this.servername;
    }

    public void setServername(String servername) {
        this.servername = servername;
    }

    public String getPk_alertruntime() {
        return this.pk_alertruntime;
    }

    public void setPk_alertruntime(String pk_alertruntime) {
        this.pk_alertruntime = pk_alertruntime;
    }

    public String getServeraddress() {
        return this.serveraddress;
    }

    public void setServeraddress(String serveraddress) {
        this.serveraddress = serveraddress;
    }

    public UFBoolean getActive() {
        return this.active;
    }

    public void setActive(UFBoolean active) {
        this.active = active;
    }

    public String getTableName() {
        return "pub_alertruntime";
    }

    public String getPrimaryKey() {
        return this.pk_alertruntime;
    }

    public String getPKFieldName() {
        return "pk_alertruntime";
    }
}

