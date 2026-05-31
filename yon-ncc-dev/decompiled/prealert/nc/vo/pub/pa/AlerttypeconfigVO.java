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

public class AlerttypeconfigVO
extends SuperVO {
    private static final long serialVersionUID = -9873L;
    public String pk_alerttypeconfig;
    public String pk_alertregistry;
    public String value;
    public String fieldname;
    public String operator;
    public String vartype;
    public String refervalue;
    public String variablename;

    public String getPk_alertregistry() {
        return this.pk_alertregistry;
    }

    public String getValue() {
        return this.value;
    }

    public String getFieldname() {
        return this.fieldname;
    }

    public String getVartype() {
        return this.vartype;
    }

    public String getRefervalue() {
        return this.refervalue;
    }

    public void setPk_alertregistry(String newPk_alertregistry) {
        this.pk_alertregistry = newPk_alertregistry;
    }

    public void setValue(String newValue) {
        this.value = newValue;
    }

    public void setFieldname(String newFieldname) {
        this.fieldname = newFieldname;
    }

    public void setVartype(String newVartype) {
        this.vartype = newVartype;
    }

    public void setRefervalue(String newRefervalue) {
        this.refervalue = newRefervalue;
    }

    public void validate() throws ValidationException {
        ArrayList<String> errFields = new ArrayList<String>();
        if (this.pk_alerttypeconfig == null) {
            errFields.add(new String("pk_alerttypeconfig"));
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
        return "pk_alerttypeconfig";
    }

    public String getTableName() {
        return "pub_alerttypeconfig";
    }

    public AlerttypeconfigVO() {
    }

    public AlerttypeconfigVO(String newPk_alerttypeconfig) {
        this.pk_alerttypeconfig = newPk_alerttypeconfig;
    }

    public String getPrimaryKey() {
        return this.pk_alerttypeconfig;
    }

    public void setPrimaryKey(String newPk_alerttypeconfig) {
        this.pk_alerttypeconfig = newPk_alerttypeconfig;
    }

    public String getEntityName() {
        return "Alerttypeconfig";
    }

    public String getVariablename() {
        return this.variablename;
    }

    public void setVariablename(String variablename) {
        this.variablename = variablename;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}

