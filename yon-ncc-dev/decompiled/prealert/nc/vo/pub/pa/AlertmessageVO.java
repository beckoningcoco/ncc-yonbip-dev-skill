/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.vo.pub.pa;

import java.util.ArrayList;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.SuperVO;
import nc.vo.pub.ValidationException;
import nc.vo.pub.lang.UFBoolean;

public class AlertmessageVO
extends SuperVO {
    private static final long serialVersionUID = 5880682772942504256L;
    public String pk_alertmessage;
    public String belong_system;
    public String pk_alertregistry;
    public String pk_alerttype;
    public String alertname;
    public String groupid;
    public String receiverid;
    public Integer sendmethod;
    public Integer triggermethod;
    public Integer implementtype;
    public String pk_message;
    public String[] pk_files;
    public String message;
    public String createdate;
    public String createtime;
    public String senddate;
    public String sendtime;
    public String sentdate;
    public String senttime;
    public String receivername;
    @Deprecated
    public String filename;
    @Deprecated
    public UFBoolean isnew;
    @Deprecated
    public UFBoolean istiming;
    @Deprecated
    public Integer priority;
    @Deprecated
    public String curlang;
    @Deprecated
    public String accountpk;
    @Deprecated
    private transient Object fileContent;
    @Deprecated
    private String dataSource;

    public String getPk_alertmessage() {
        return this.pk_alertmessage;
    }

    public void setPk_alertmessage(String pk_alertmessage) {
        this.pk_alertmessage = pk_alertmessage;
    }

    public String getBelong_system() {
        return this.belong_system;
    }

    public String getFilename() {
        return this.filename;
    }

    public UFBoolean getIsnew() {
        return this.isnew;
    }

    public UFBoolean getIstiming() {
        return this.istiming;
    }

    public String getPk_alertregistry() {
        return this.pk_alertregistry;
    }

    public String getAlertname() {
        return this.alertname;
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

    public Integer getPriority() {
        return this.priority;
    }

    public String getLanguage() {
        return this.curlang;
    }

    public String getAccountpk() {
        return this.accountpk;
    }

    public Integer getImplementtype() {
        return this.implementtype;
    }

    public String getMessage() {
        return this.message;
    }

    public String getCreatedate() {
        return this.createdate;
    }

    public String getCreatetime() {
        return this.createtime;
    }

    public String getSenddate() {
        return this.senddate;
    }

    public String getSendtime() {
        return this.sendtime;
    }

    public String getSentdate() {
        return this.sentdate;
    }

    public String getSenttime() {
        return this.senttime;
    }

    public String getDataSource() {
        return this.dataSource;
    }

    public void setBelong_system(String newBelong_system) {
        this.belong_system = newBelong_system;
    }

    public void setFilename(String newFilename) {
        this.filename = newFilename;
    }

    public void setIsnew(UFBoolean newIsnew) {
        this.isnew = newIsnew;
    }

    public void setIstiming(UFBoolean newIstiming) {
        this.istiming = newIstiming;
    }

    public void setPk_alertregistry(String newPk_alertregistry) {
        this.pk_alertregistry = newPk_alertregistry;
    }

    public void setAlertname(String newAlertname) {
        this.alertname = newAlertname;
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

    public Integer getTriggermethod() {
        return this.triggermethod;
    }

    public String getPk_alerttype() {
        return this.pk_alerttype;
    }

    public void setPk_alerttype(String pk_alerttype) {
        this.pk_alerttype = pk_alerttype;
    }

    public void setTriggermethod(Integer triggermethod) {
        this.triggermethod = triggermethod;
    }

    public String getPk_message() {
        return this.pk_message;
    }

    public void setPk_message(String pk_message) {
        this.pk_message = pk_message;
    }

    public void setPriority(Integer newPriority) {
        this.priority = newPriority;
    }

    public void setLanguage(String newLanguage) {
        this.curlang = newLanguage;
    }

    public void setAccountpk(String newAccountpk) {
        this.accountpk = newAccountpk;
    }

    public void setImplementtype(Integer newImplementtype) {
        this.implementtype = newImplementtype;
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }

    public void setCreatedate(String newCreatedate) {
        this.createdate = newCreatedate;
    }

    public void setCreatetime(String newCreatetime) {
        this.createtime = newCreatetime;
    }

    public void setSenddate(String newSenddate) {
        this.senddate = newSenddate;
    }

    public void setSendtime(String newSendtime) {
        this.sendtime = newSendtime;
    }

    public void setSentdate(String newSentdate) {
        this.sentdate = newSentdate;
    }

    public void setSenttime(String newSenttime) {
        this.senttime = newSenttime;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public void validate() throws ValidationException {
        ArrayList<String> errFields = new ArrayList<String>();
        if (this.pk_alertmessage == null) {
            errFields.add("pk_alertmessage");
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

    public String getParentPKFieldName() {
        return null;
    }

    public String getPKFieldName() {
        return "pk_alertmessage";
    }

    public String getTableName() {
        return "pub_alertmessage";
    }

    public AlertmessageVO() {
    }

    public AlertmessageVO(String newPk_alertmessage) {
        this.pk_alertmessage = newPk_alertmessage;
    }

    public String getPrimaryKey() {
        return this.pk_alertmessage;
    }

    public void setPrimaryKey(String newPk_alertmessage) {
        this.pk_alertmessage = newPk_alertmessage;
    }

    public String getEntityName() {
        return "Alertmessage";
    }

    public String getGroupid() {
        return this.groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public Object getFileContent() {
        return this.fileContent;
    }

    public void setFileContent(Object fileContent) {
        this.fileContent = fileContent;
    }

    public String[] getPk_files() {
        return this.pk_files;
    }

    public void setPk_files(String[] pk_files) {
        this.pk_files = pk_files;
    }
}

