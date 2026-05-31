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

public class AlerttypeBVO
extends SuperVO {
    private static final long serialVersionUID = -9874L;
    public static final String TYPE_CHAR = "Character";
    public static final String TYPE_REFRENCE = "Reference";
    public static final String TYPE_COMBOX = "ComboBox";
    public static final String TYPE_BOOLEAN = "Boolean";
    public static final String TYPE_INTEGER = "Integer";
    public static final String TYPE_DOUBLE = "Double";
    public static final String TYPE_FORMULA = "Formula";
    public static final String TYPE_DATETIME = "Datetime";
    public String pk_alerttype_b;
    public String displaynameid;
    public String pk_alerttype;
    public String refername;
    public String variablename;
    public String fieldname;
    public String vartype;
    public UFBoolean notnullable;
    public String defaultValue;
    public String refdealclass;
    public String sqlbuildclass;
    public UFBoolean issingleselected;
    public Object value;
    public String operator;
    public String refervalue;

    public String getSqlbuildclass() {
        return this.sqlbuildclass;
    }

    public void setSqlbuildclass(String sqlbuildclass) {
        this.sqlbuildclass = sqlbuildclass;
    }

    public String getRefdealclass() {
        return this.refdealclass;
    }

    public void setRefdealclass(String refdealclass) {
        this.refdealclass = refdealclass;
    }

    public UFBoolean getNotnullable() {
        return this.notnullable;
    }

    public void setNotnullable(UFBoolean notnullable) {
        this.notnullable = notnullable;
    }

    public String getDisplaynameid() {
        return this.displaynameid;
    }

    public String getPk_alerttype() {
        return this.pk_alerttype;
    }

    public String getRefername() {
        return this.refername;
    }

    public String getVariablename() {
        return this.variablename;
    }

    public String getFieldname() {
        return this.fieldname;
    }

    public String getVartype() {
        return this.vartype;
    }

    public void setDisplaynameid(String newDisplaynameid) {
        this.displaynameid = newDisplaynameid;
    }

    public void setPk_alerttype(String newPk_alerttype) {
        this.pk_alerttype = newPk_alerttype;
    }

    public void setRefername(String newRefername) {
        this.refername = newRefername;
    }

    public void setVariablename(String newVariablename) {
        this.variablename = newVariablename;
    }

    public void setFieldname(String newFieldname) {
        this.fieldname = newFieldname;
    }

    public void setVartype(String newVartype) {
        this.vartype = newVartype;
    }

    public void validate() throws ValidationException {
        ArrayList<String> errFields = new ArrayList<String>();
        if (this.pk_alerttype_b == null) {
            errFields.add(new String("pk_alerttype_b"));
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
        return "pk_alerttype_b";
    }

    public String getTableName() {
        return "pub_alerttype_b";
    }

    public AlerttypeBVO() {
    }

    public AlerttypeBVO(String newPk_alerttype_b) {
        this.pk_alerttype_b = newPk_alerttype_b;
    }

    public String getPrimaryKey() {
        return this.pk_alerttype_b;
    }

    public void setPrimaryKey(String newPk_alerttype_b) {
        this.pk_alerttype_b = newPk_alerttype_b;
    }

    public String getEntityName() {
        return "AlerttypeB";
    }

    public void setValue(Object newValue) {
        this.value = newValue;
    }

    public Object getValue() {
        return this.value;
    }

    public void setRefervalue(String newRefervalue) {
        this.refervalue = newRefervalue;
    }

    public String getRefervalue() {
        return this.refervalue;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public UFBoolean getIssingleselected() {
        return this.issingleselected;
    }

    public void setIssingleselected(UFBoolean issingleselected) {
        this.issingleselected = issingleselected;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}

