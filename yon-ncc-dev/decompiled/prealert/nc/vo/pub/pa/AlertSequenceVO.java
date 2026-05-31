/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 */
package nc.vo.pub.pa;

import nc.vo.pub.SuperVO;

public class AlertSequenceVO
extends SuperVO {
    private static final long serialVersionUID = -2167573706211701663L;
    private String pk_sequence;
    private String pk_registry;
    private String execution_time;
    private String servername;
    private String serverinstanceid;

    public String getPk_sequence() {
        return this.pk_sequence;
    }

    public void setPk_sequence(String pk_sequence) {
        this.pk_sequence = pk_sequence;
    }

    public String getPk_registry() {
        return this.pk_registry;
    }

    public void setPk_registry(String pk_registry) {
        this.pk_registry = pk_registry;
    }

    public String getExecution_time() {
        return this.execution_time;
    }

    public void setExecution_time(String execution_time) {
        this.execution_time = execution_time;
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

    public String getPrimaryKey() {
        return this.pk_sequence;
    }

    public String getTableName() {
        return "pub_alertsequence";
    }

    public String getPKFieldName() {
        return "pk_sequence";
    }
}

