/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.MultiLangContext
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.uap.scheduler.TimeConfigVO
 */
package nc.vo.pub.pa;

import java.util.ArrayList;
import nc.bs.pub.pa.AlertMethod;
import nc.bs.pub.pa.PaConstant;
import nc.bs.pub.taskcenter.IReportLikeWork;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.MultiLangContext;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.SuperVO;
import nc.vo.pub.ValidationException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.pa.AlertRegistryOrgVO;
import nc.vo.pub.pa.AlertTimeConfig;
import nc.vo.pub.pa.AlertsendconfigVO;
import nc.vo.pub.pa.AlerttypeBVO;
import nc.vo.pub.pa.AlerttypeVO;
import nc.vo.pub.pa.AlerttypeconfigVO;
import nc.vo.pub.pa.TimingSettingVO;
import nc.vo.uap.scheduler.TimeConfigVO;
import uap.vo.prealert.util.PreAlertUtil;

public class AlertregistryVO
extends SuperVO {
    public static final String GLOBLE_PK_GROUP = "GLOBLE00000000000000";
    private static final long serialVersionUID = -9876L;
    private String pk_alertregistry;
    private String alertname;
    private String alertname2;
    private String alertname3;
    private String alertname4;
    private String alertname5;
    private String alertname6;
    private String description;
    private UFBoolean enabled;
    private String filename;
    private UFBoolean istiming;
    private String curlang;
    private String pk_alerttype;
    private String groupId;
    private String scheduletaskid;
    private String messagefile;
    private String message;
    public Integer registrytype;
    public String creator;
    public Integer maxlogs = 10;
    private AlerttypeVO alertTypeVo;
    private AlerttypeconfigVO[] typeConfigVo;
    private AlertsendconfigVO[] sendConfigVo;
    private TimingSettingVO timeSettingVo;
    private AlertTimeConfig timeConfig;
    private TimeConfigVO timeconfigVO;
    private AlertMethod alertMethod;
    private String dataSource;
    private IReportLikeWork reportlikework;
    private String pk_org;
    private String pk_messagetemplate;
    private AlertRegistryOrgVO[] orgs = null;
    private UFBoolean withtranscation = UFBoolean.FALSE;
    private UFBoolean pushable = UFBoolean.FALSE;
    private UFDateTime ts;
    private String servername;
    private String clusterflag;

    public String getServername() {
        return this.servername;
    }

    public void setServername(String servername) {
        this.servername = servername;
    }

    public String getClusterflag() {
        return this.clusterflag;
    }

    public void setClusterflag(String clusterflag) {
        this.clusterflag = clusterflag;
    }

    public UFBoolean getWithtranscation() {
        return this.withtranscation;
    }

    public void setWithtranscation(UFBoolean withtranscation) {
        this.withtranscation = withtranscation;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Integer getRegistrytype() {
        return this.registrytype;
    }

    public void setRegistrytype(Integer registrytype) {
        this.registrytype = registrytype;
    }

    public String getAlertname() {
        return this.alertname;
    }

    public String getDescription() {
        return this.description;
    }

    public UFBoolean getEnabled() {
        return this.enabled;
    }

    public String getFilename() {
        return this.filename;
    }

    public UFBoolean getIstiming() {
        return this.istiming;
    }

    public String getPk_alerttype() {
        return this.pk_alerttype;
    }

    public String getScheduletaskid() {
        return this.scheduletaskid;
    }

    public String getMessagefile() {
        return this.messagefile;
    }

    public String getMessage() {
        return this.message;
    }

    public String getDataSource() {
        return this.dataSource;
    }

    public void setAlertname(String newAlertname) {
        this.alertname = newAlertname;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public void setEnabled(UFBoolean newEnabled) {
        this.enabled = newEnabled;
    }

    public void setFilename(String newFilename) {
        this.filename = newFilename;
    }

    public void setIstiming(UFBoolean newIstiming) {
        this.istiming = newIstiming;
    }

    public void setPk_alerttype(String newPk_alerttype) {
        this.pk_alerttype = newPk_alerttype;
    }

    public void setScheduletaskid(String newScheduletaskid) {
        this.scheduletaskid = newScheduletaskid;
    }

    public void setMessagefile(String newMessagefile) {
        this.messagefile = newMessagefile;
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public void validate() throws ValidationException {
        ArrayList<String> errFields = new ArrayList<String>();
        if (this.pk_alertregistry == null) {
            errFields.add("pk_alertregistry");
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
        return "pk_alertregistry";
    }

    public String getTableName() {
        return "pub_alertregistry";
    }

    public AlertregistryVO() {
    }

    public AlertregistryVO(String newPk_alertregistry) {
        this.pk_alertregistry = newPk_alertregistry;
    }

    public String getPrimaryKey() {
        return this.pk_alertregistry;
    }

    public void setPrimaryKey(String newPk_alertregistry) {
        this.pk_alertregistry = newPk_alertregistry;
    }

    public String getEntityName() {
        return "Alertregistry";
    }

    public AlerttypeVO getAlertTypeVo() {
        return this.alertTypeVo;
    }

    public void setAlertTypeVo(AlerttypeVO alertTypeVo) {
        this.alertTypeVo = alertTypeVo;
    }

    public AlertsendconfigVO[] getSendConfigVo() {
        return this.sendConfigVo;
    }

    public void setSendConfigVo(AlertsendconfigVO[] sendConfigVo) {
        this.sendConfigVo = sendConfigVo;
    }

    public TimingSettingVO getTimingSettingVo() {
        return this.timeSettingVo;
    }

    public void setTimingSettingVO(TimingSettingVO timeSettingVo) {
        this.timeSettingVo = timeSettingVo;
    }

    public AlerttypeconfigVO[] getTypeConfigVo() {
        return this.typeConfigVo;
    }

    public void setTypeConfigVo(AlerttypeconfigVO[] typeConfigVo) {
        this.typeConfigVo = typeConfigVo;
    }

    public void setTimeConfig(AlertTimeConfig timeConfig) {
        this.timeConfig = timeConfig;
    }

    public AlertTimeConfig getTimeConfig() {
        return this.timeConfig;
    }

    public void setAlertMethod(AlertMethod alertMethod) {
        this.alertMethod = alertMethod;
    }

    public AlertMethod getAlertMethod() {
        return this.alertMethod;
    }

    public void setTimeConfigVO(TimeConfigVO tcvo) {
        this.timeconfigVO = tcvo;
    }

    public TimeConfigVO getTimeconfigVO() {
        return this.timeconfigVO;
    }

    public void timeConfig2VO() {
        if (this.timeConfig != null) {
            this.timeSettingVo = PaConstant.transAlertTimeConfig2TimingSettingVO(this.timeConfig);
        }
    }

    public void vo2TimeConfig() {
        this.timeConfig = PaConstant.transTimingSettingVO2AlertTimeConfig(this.timeSettingVo);
        this.timeConfig.setJustInTime(!this.istiming.booleanValue());
    }

    public void method2VO() {
        if (this.alertMethod != null) {
            AlertsendconfigVO sendVo;
            AlertsendconfigVO sendVo2;
            int i;
            String[] syscodes;
            AlertsendconfigVO sendVo3;
            int i2;
            String[] names;
            String[] ids;
            ArrayList<AlertsendconfigVO> al = new ArrayList<AlertsendconfigVO>();
            if (this.alertMethod.getEnable(0)) {
                ids = this.alertMethod.getAcounts();
                names = this.alertMethod.getAcountNames();
                for (i2 = 0; i2 < ids.length; ++i2) {
                    sendVo3 = new AlertsendconfigVO();
                    sendVo3.setPk_alertregistry(this.getPrimaryKey());
                    sendVo3.setSendmethod(0);
                    sendVo3.setReceiverid(ids[i2]);
                    sendVo3.setReceivername(names[i2]);
                    al.add(sendVo3);
                }
            }
            if (this.alertMethod.getEnable(1)) {
                ids = this.alertMethod.getToDOUserIds();
                names = this.alertMethod.getToDOUserlNames();
                for (i2 = 0; i2 < ids.length; ++i2) {
                    sendVo3 = new AlertsendconfigVO();
                    sendVo3.setPk_alertregistry(this.getPrimaryKey());
                    sendVo3.setSendmethod(1);
                    sendVo3.setReceiverid(ids[i2]);
                    sendVo3.setReceivername(names[i2]);
                    al.add(sendVo3);
                }
            }
            if (this.alertMethod.getEnable(2)) {
                ids = this.alertMethod.getNext();
                names = this.alertMethod.getNextAttribute();
                String[] nodetypes = this.alertMethod.getNodetype();
                syscodes = this.alertMethod.getSyscode();
                for (i = 0; i < ids.length; ++i) {
                    sendVo2 = new AlertsendconfigVO();
                    sendVo2.setPk_alertregistry(this.getPrimaryKey());
                    sendVo2.setSendmethod(2);
                    sendVo2.setReceiverid(ids[i]);
                    sendVo2.setReceivername(names[i]);
                    sendVo2.setSyscode(syscodes[i]);
                    sendVo2.setNodetype(nodetypes[i]);
                    al.add(sendVo2);
                }
            }
            if (this.alertMethod.getEnable(8)) {
                ids = this.alertMethod.getNextNCC();
                names = this.alertMethod.getNextNameNCC();
                String[] nodetypes = this.alertMethod.getNodetypeNCC();
                syscodes = this.alertMethod.getSyscode_ncc();
                for (i = 0; i < ids.length; ++i) {
                    sendVo2 = new AlertsendconfigVO();
                    sendVo2.setPk_alertregistry(this.getPrimaryKey());
                    sendVo2.setSendmethod(8);
                    sendVo2.setReceiverid(ids[i]);
                    sendVo2.setReceivername(names[i]);
                    sendVo2.setSyscode(syscodes[i]);
                    sendVo2.setNodetype(nodetypes[i]);
                    al.add(sendVo2);
                }
            }
            if (this.alertMethod.getEnable(3)) {
                sendVo = new AlertsendconfigVO();
                sendVo.setPk_alertregistry(this.getPrimaryKey());
                sendVo.setSendmethod(3);
                al.add(sendVo);
            }
            if (this.alertMethod.getEnable(4)) {
                sendVo = new AlertsendconfigVO();
                sendVo.setPk_alertregistry(this.getPrimaryKey());
                sendVo.setSendmethod(4);
                al.add(sendVo);
            }
            if (this.alertMethod.getEnable(5)) {
                ids = this.alertMethod.getButtons();
                names = this.alertMethod.getButtonNames();
                for (int i3 = 0; i3 < ids.length; ++i3) {
                    sendVo3 = new AlertsendconfigVO();
                    sendVo3.setPk_alertregistry(this.getPrimaryKey());
                    sendVo3.setSendmethod(5);
                    sendVo3.setReceiverid(ids[i3]);
                    sendVo3.setReceivername(names[i3]);
                    al.add(sendVo3);
                }
            }
            if (this.alertMethod.getEnable(6)) {
                ids = this.alertMethod.getMobiles();
                names = this.alertMethod.getMobileNames();
                for (int i4 = 0; i4 < ids.length; ++i4) {
                    sendVo3 = new AlertsendconfigVO();
                    sendVo3.setPk_alertregistry(this.getPrimaryKey());
                    sendVo3.setSendmethod(6);
                    sendVo3.setReceiverid(ids[i4]);
                    sendVo3.setReceivername(names[i4]);
                    al.add(sendVo3);
                }
            }
            if (this.alertMethod.getEnable(7)) {
                ids = this.alertMethod.getRealEmailsArray();
                names = this.alertMethod.getRealEmailNamesArray();
                for (int i5 = 0; i5 < ids.length; ++i5) {
                    sendVo3 = new AlertsendconfigVO();
                    sendVo3.setPk_alertregistry(this.getPrimaryKey());
                    sendVo3.setSendmethod(7);
                    sendVo3.setReceiverid(ids[i5]);
                    sendVo3.setReceivername(names[i5]);
                    al.add(sendVo3);
                }
            }
            this.sendConfigVo = al.toArray(new AlertsendconfigVO[al.size()]);
        }
    }

    public void vo2Method() {
        if (this.sendConfigVo != null && this.sendConfigVo.length > 0) {
            this.alertMethod = new AlertMethod();
            for (int i = 0; i < this.sendConfigVo.length; ++i) {
                this.alertMethod.setEnable(this.sendConfigVo[i].getSendmethod(), true);
                if (this.sendConfigVo[i].getSendmethod() == 0) {
                    this.alertMethod.addAccount(this.sendConfigVo[i].getReceiverid());
                    this.alertMethod.addAccountName(this.sendConfigVo[i].getReceivername());
                    continue;
                }
                if (this.sendConfigVo[i].getSendmethod() == 1) {
                    this.alertMethod.addToDOUserID(this.sendConfigVo[i].getReceiverid());
                    this.alertMethod.addToDOUserName(this.sendConfigVo[i].getReceivername());
                    continue;
                }
                if (this.sendConfigVo[i].getSendmethod() == 2) {
                    this.alertMethod.addNext(this.sendConfigVo[i].getReceiverid());
                    this.alertMethod.addNextName(this.sendConfigVo[i].getReceivername());
                    this.alertMethod.addNodetype(this.sendConfigVo[i].getNodetype());
                    this.alertMethod.addNextSysCode(this.sendConfigVo[i].getSyscode());
                    continue;
                }
                if (this.sendConfigVo[i].getSendmethod() == 8) {
                    this.alertMethod.addNextNCC(this.sendConfigVo[i].getReceiverid());
                    this.alertMethod.addNextNameNCC(this.sendConfigVo[i].getReceivername());
                    this.alertMethod.addNodetypeNCC(this.sendConfigVo[i].getNodetype());
                    this.alertMethod.addNextSysCodeNCC(this.sendConfigVo[i].getSyscode());
                    continue;
                }
                if (this.sendConfigVo[i].getSendmethod() == 5) {
                    this.alertMethod.addButton(this.sendConfigVo[i].getReceiverid());
                    this.alertMethod.addButtonName(this.sendConfigVo[i].getReceivername());
                    continue;
                }
                if (this.sendConfigVo[i].getSendmethod() == 6) {
                    this.alertMethod.addMobile(this.sendConfigVo[i].getReceiverid());
                    this.alertMethod.addMobileName(this.sendConfigVo[i].getReceivername());
                    continue;
                }
                if (this.sendConfigVo[i].getSendmethod() != 7) continue;
                this.alertMethod.addRealEmail(this.sendConfigVo[i].getReceiverid());
                this.alertMethod.addRealEmailName(this.sendConfigVo[i].getReceivername());
            }
        }
    }

    public void key2TypeVO(AlerttypeBVO[] keys) {
        if (keys != null && keys.length > 0) {
            ArrayList<AlerttypeconfigVO> al = new ArrayList<AlerttypeconfigVO>();
            for (int i = 0; i < keys.length; ++i) {
                AlerttypeconfigVO typeConfigVO = new AlerttypeconfigVO();
                typeConfigVO.setFieldname(keys[i].getFieldname());
                typeConfigVO.setVartype(keys[i].getVartype());
                typeConfigVO.setValue(keys[i].getValue() == null ? null : keys[i].getValue().toString());
                typeConfigVO.setRefervalue(keys[i].getRefervalue());
                typeConfigVO.setVariablename(keys[i].getVariablename());
                typeConfigVO.setOperator(keys[i].getOperator());
                al.add(typeConfigVO);
            }
            this.typeConfigVo = al.toArray(new AlerttypeconfigVO[al.size()]);
        }
    }

    public Integer getMaxlogs() {
        return this.maxlogs;
    }

    public void setMaxlogs(Integer maxlogs) {
        this.maxlogs = maxlogs;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getPk_messagetemplate() {
        return this.pk_messagetemplate;
    }

    public void setPk_messagetemplate(String pk_messagetemplate) {
        this.pk_messagetemplate = pk_messagetemplate;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String pk_org) {
        this.pk_org = pk_org;
    }

    public IReportLikeWork getReportlikework() {
        return this.reportlikework;
    }

    public void setReportlikework(IReportLikeWork reportlikework) {
        this.reportlikework = reportlikework;
    }

    public String getAlertname2() {
        return this.alertname2;
    }

    public void setAlertname2(String alertname2) {
        this.alertname2 = alertname2;
    }

    public String getAlertname3() {
        return this.alertname3;
    }

    public void setAlertname3(String alertname3) {
        this.alertname3 = alertname3;
    }

    public String getMultiLangAlertname() {
        return AlertregistryVO.getText(this.alertname, this.alertname2, this.alertname3, this.alertname4, this.alertname5, this.alertname6);
    }

    public static String getText(String mlText, String mlText2, String mlText3, String mlText4, String mlText5, String mlText6) {
        String[] ss = new String[]{mlText, mlText2, mlText3, mlText4, mlText5, mlText6};
        int currentLangSeq = MultiLangContext.getInstance().getCurrentLangSeq() - 1;
        String result = null;
        if (currentLangSeq > -1 && currentLangSeq < ss.length) {
            result = ss[currentLangSeq];
        }
        if (StringUtil.isEmpty(result)) {
            result = ss[0];
        }
        return result;
    }

    public String getCurlang() {
        return this.curlang;
    }

    public void setCurlang(String curlang) {
        this.curlang = curlang;
    }

    public UFBoolean getPushable() {
        return this.pushable;
    }

    public void setPushable(UFBoolean pushable) {
        this.pushable = pushable;
    }

    public String getAlertname4() {
        return this.alertname4;
    }

    public void setAlertname4(String alertname4) {
        this.alertname4 = alertname4;
    }

    public String getAlertname5() {
        return this.alertname5;
    }

    public void setAlertname5(String alertname5) {
        this.alertname5 = alertname5;
    }

    public String getAlertname6() {
        return this.alertname6;
    }

    public void setAlertname6(String alertname6) {
        this.alertname6 = alertname6;
    }

    public AlertRegistryOrgVO[] getOrgs() {
        return this.orgs;
    }

    public void setOrgs(AlertRegistryOrgVO[] orgs) {
        this.orgs = orgs;
    }

    public String[] getPk_orgs() {
        if (PreAlertUtil.isNotEmpty(this.getOrgs())) {
            return PreAlertUtil.getFieldValues(String.class, this.getOrgs(), "pk_org");
        }
        if (!StringUtil.isEmptyWithTrim((String)this.getPk_org())) {
            return new String[]{this.getPk_org()};
        }
        return null;
    }

    public UFDateTime getTs() {
        return this.ts;
    }

    public void setTs(UFDateTime ts) {
        this.ts = ts;
    }
}

