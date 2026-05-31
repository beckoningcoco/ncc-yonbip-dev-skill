/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.vo.pub.pa;

import java.util.ArrayList;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.uap.pa.IPreAlertNCService;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.ValidationException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.pa.AlertTypeCategoryEnum;
import nc.vo.pub.pa.AlerttypeBVO;
import nc.vo.pub.pa.customquery.IAlertQueryDef;

public class AlerttypeVO
extends SuperVO {
    private static final long serialVersionUID = -9875L;
    private String pk_alerttype;
    private String busi_plugin;
    private String descrip_resid;
    private String name_resid;
    private String type_code;
    private String type_name;
    private String belong_system;
    private String apptag;
    private String pk_busiobj;
    private String hycode;
    private String description;
    private String category;
    private String pk_alertquery;
    private IAlertQueryDef alertQueryDefVO;
    private String pk_funcnode;
    private String orgtype;
    private UFBoolean org_multiselectable;
    private UFBoolean org_nullable;
    private AlerttypeBVO[] alertVariables;
    private Integer tasktype = 0;
    private String bizconfigclass;
    private Integer control_level;
    private Integer exeintervalunit;
    private Integer executeinterval;

    public Integer getControl_level() {
        return this.control_level;
    }

    public void setControl_level(Integer control_level) {
        this.control_level = control_level;
    }

    public Integer getExeintervalunit() {
        return this.exeintervalunit;
    }

    public void setExeintervalunit(Integer exeintervalunit) {
        this.exeintervalunit = exeintervalunit;
    }

    public Integer getExecuteinterval() {
        return this.executeinterval;
    }

    public void setExecuteinterval(Integer executeinterval) {
        this.executeinterval = executeinterval;
    }

    public String getBizconfigclass() {
        return this.bizconfigclass;
    }

    public void setBizconfigclass(String bizconfigclazz) {
        this.bizconfigclass = bizconfigclazz;
    }

    public Integer getTasktype() {
        return this.tasktype;
    }

    public void setTasktype(Integer tasktype) {
        this.tasktype = tasktype;
    }

    public String getBelong_system() {
        return this.belong_system;
    }

    public String getType_name() {
        return this.type_name;
    }

    public String getType_nameML() {
        try {
            String name = null;
            String name_resid = this.getName_resid();
            if (name_resid != null) {
                name = NCLangRes4VoTransl.getNCLangRes().getString("prealerttype", this.getType_name(), name_resid);
            }
            if (StringUtil.isEmptyWithTrim(name)) {
                name = this.getType_name();
            }
            return name;
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            return this.getType_name();
        }
    }

    public String getDescription() {
        return this.description;
    }

    public String getDescriptionML() {
        try {
            return NCLangRes4VoTransl.getNCLangRes().getString("prealerttype", this.getDescription(), this.getDescrip_resid());
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            return this.getDescription();
        }
    }

    public String getBusi_plugin() {
        return this.busi_plugin;
    }

    public String getDescrip_resid() {
        return this.descrip_resid;
    }

    public String getName_resid() {
        return this.name_resid;
    }

    public void setBelong_system(String newBelong_system) {
        this.belong_system = newBelong_system;
    }

    public void setType_name(String newType_name) {
        this.type_name = newType_name;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public void setBusi_plugin(String newBusi_plugin) {
        this.busi_plugin = newBusi_plugin;
    }

    public void setDescrip_resid(String newDescrip_resid) {
        this.descrip_resid = newDescrip_resid;
    }

    public void setName_resid(String newName_resid) {
        this.name_resid = newName_resid;
    }

    public void validate() throws ValidationException {
        ArrayList<String> errFields = new ArrayList<String>();
        if (this.pk_alerttype == null) {
            errFields.add(new String("pk_alerttype"));
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
        return "pk_alerttype";
    }

    public String getTableName() {
        return "pub_alerttype";
    }

    public AlerttypeVO() {
    }

    public AlerttypeVO(String newPk_alerttype) {
        this.pk_alerttype = newPk_alerttype;
    }

    public String getPrimaryKey() {
        return this.pk_alerttype;
    }

    public void setPrimaryKey(String newPk_alerttype) {
        this.pk_alerttype = newPk_alerttype;
    }

    public String getEntityName() {
        return "Alerttype";
    }

    public AlerttypeBVO[] getAlertVariables() {
        return this.alertVariables;
    }

    public void setAlertVariables(AlerttypeBVO[] alertVariables) {
        this.alertVariables = alertVariables;
    }

    public String toString() {
        String typename = this.getName_resid() != null ? NCLangRes4VoTransl.getNCLangRes().getStrByID("prealerttype", this.getName_resid().trim()) : this.getType_name();
        return typename;
    }

    public static String i18nType(int iType) {
        switch (iType) {
            case 1: {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000345");
            }
            case 0: {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000344");
            }
            case 2: {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000361");
            }
        }
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000391");
    }

    public String getOrgtype() {
        return this.orgtype;
    }

    public void setOrgtype(String orgtype) {
        this.orgtype = orgtype;
    }

    public String getPk_funcnode() {
        return this.pk_funcnode;
    }

    public void setPk_funcnode(String pk_funcnode) {
        this.pk_funcnode = pk_funcnode;
    }

    public String getPk_busiobj() {
        return this.pk_busiobj;
    }

    public void setPk_busiobj(String pk_busiobj) {
        this.pk_busiobj = pk_busiobj;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public AlertTypeCategoryEnum getCategoryEnum() {
        return AlertTypeCategoryEnum.fromStrValue(this.getCategory());
    }

    public String getPk_alerttype() {
        return this.pk_alerttype;
    }

    public void setPk_alerttype(String pk_alerttype) {
        this.pk_alerttype = pk_alerttype;
    }

    public String getHycode() {
        return this.hycode;
    }

    public void setHycode(String hycode) {
        this.hycode = hycode;
    }

    public String getPk_alertquery() {
        return this.pk_alertquery;
    }

    public void setPk_alertquery(String pk_alertquery) {
        this.pk_alertquery = pk_alertquery;
    }

    public String getType_code() {
        return this.type_code;
    }

    public void setType_code(String type_code) {
        this.type_code = type_code;
    }

    public UFBoolean getOrg_multiselectable() {
        if (this.org_multiselectable != null) {
            return this.org_multiselectable;
        }
        return UFBoolean.FALSE;
    }

    public void setOrg_multiselectable(UFBoolean org_multiselectable) {
        this.org_multiselectable = org_multiselectable;
    }

    public UFBoolean getOrg_nullable() {
        if (this.org_nullable != null) {
            return this.org_nullable;
        }
        return UFBoolean.TRUE;
    }

    public void setOrg_nullable(UFBoolean org_nullable) {
        this.org_nullable = org_nullable;
    }

    public IAlertQueryDef getAlertQueryDefVO() {
        if (StringUtil.isEmptyWithTrim((String)this.getPk_alertquery())) {
            if (!StringUtil.isEmptyWithTrim((String)this.getCategory()) && this.getCategory().equals(AlertTypeCategoryEnum.CUSTOM.toString())) {
                Logger.error((Object)("PreAlert: this is a custom alerttype but has no alertquery associated: " + this.getPk_alerttype() + ", " + this.getType_name()));
            }
            return null;
        }
        if (this.alertQueryDefVO == null || !this.getPk_alertquery().equals(this.alertQueryDefVO.getPk_alertquery())) {
            try {
                IPreAlertNCService srv = (IPreAlertNCService)NCLocator.getInstance().lookup(IPreAlertNCService.class);
                this.alertQueryDefVO = srv.queryAlertQueryDefVOByPk(this.getPk_alertquery());
            }
            catch (BusinessException e) {
                throw new BusinessRuntimeException(e.getMessage(), (Throwable)e);
            }
        }
        return this.alertQueryDefVO;
    }

    public void setAlertQueryDefVO(IAlertQueryDef alertQueryDefVO) {
        this.alertQueryDefVO = alertQueryDefVO;
    }

    public String getApptag() {
        return this.apptag;
    }

    public void setApptag(String apptag) {
        this.apptag = apptag;
    }
}

