/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.ValidationException
 */
package nc.vo.pub.pa;

import java.util.ArrayList;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.SuperVO;
import nc.vo.pub.ValidationException;

public class AlertsendconfigVO
extends SuperVO {
    private static final long serialVersionUID = -9872L;
    public String pk_alertsendconfig;
    public String pk_alertregistry;
    public String receiverid;
    public String receivername;
    public Integer sendmethod;
    public Integer receiver_type_id = -1;
    private String syscode;
    private String nodetype;

    public String getPk_alertregistry() {
        return this.pk_alertregistry;
    }

    public String getReceiverid() {
        return this.receiverid;
    }

    public String getReceivername() {
        return this.receivername;
    }

    public Integer getSendmethod() {
        return this.sendmethod;
    }

    public void setPk_alertregistry(String newPk_alertregistry) {
        this.pk_alertregistry = newPk_alertregistry;
    }

    public void setReceiverid(String newReceiverid) {
        this.receiverid = newReceiverid;
    }

    public void setReceivername(String newReceivername) {
        this.receivername = newReceivername;
    }

    public void setSendmethod(Integer newSendmethod) {
        this.sendmethod = newSendmethod;
    }

    public void validate() throws ValidationException {
        ArrayList<String> errFields = new ArrayList<String>();
        if (this.pk_alertsendconfig == null) {
            errFields.add(new String("pk_alertsendconfig"));
        }
        StringBuffer message = new StringBuffer();
        message.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("101504", "UPP101504-000041"));
        if (errFields.size() > 0) {
            String[] temp = errFields.toArray(new String[0]);
            message.append(temp[0]);
            for (int i = 1; i < temp.length; ++i) {
                message.append(",");
                message.append(temp[i]);
            }
            throw new ValidationException(message.toString());
        }
    }

    public String getPKFieldName() {
        return "pk_alertsendconfig";
    }

    public String getTableName() {
        return "pub_alertsendconfig";
    }

    public AlertsendconfigVO() {
    }

    public AlertsendconfigVO(String newPk_alertsendconfig) {
        this.pk_alertsendconfig = newPk_alertsendconfig;
    }

    public String getPrimaryKey() {
        return this.pk_alertsendconfig;
    }

    public Integer getReceiver_type_id() {
        return this.receiver_type_id;
    }

    public void setReceiver_type_id(Integer receiver_type_id) {
        this.receiver_type_id = receiver_type_id;
    }

    public void setPrimaryKey(String newPk_alertsendconfig) {
        this.pk_alertsendconfig = newPk_alertsendconfig;
    }

    public String getEntityName() {
        return "Alertsendconfig";
    }

    public String getSyscode() {
        return this.syscode;
    }

    public void setSyscode(String syscode) {
        this.syscode = syscode;
    }

    public String getNodetype() {
        return this.nodetype;
    }

    public void setNodetype(String nodetype) {
        this.nodetype = nodetype;
    }
}

