/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.pa;

import java.io.Serializable;

public class Key
implements Serializable {
    private static final long serialVersionUID = -5754580081071660272L;
    private String name;
    private Object value;
    private String description;
    private String editType;
    private String refName;
    private String refNameValue;
    private String operator;

    public Key() {
    }

    public Key(String name, String description, byte value) {
        this.setName(name);
        this.setDescription(description);
        this.setValue(value);
    }

    public Key(String name, String description, char value) {
        this.setName(name);
        this.setDescription(description);
        this.setValue(value);
    }

    public Key(String name, String description, double value) {
        this.setName(name);
        this.setDescription(description);
        this.setValue(value);
    }

    public Key(String name, String description, float value) {
        this.setName(name);
        this.setDescription(description);
        this.setValue(value);
    }

    public Key(String name, String description, int value) {
        this.setName(name);
        this.setDescription(description);
        this.setValue(value);
    }

    public Key(String name, String description, long value) {
        this.setName(name);
        this.setDescription(description);
        this.setValue(value);
    }

    public Key(String name, String description, String value) {
        this.setName(name);
        this.setDescription(description);
        this.setValue(value);
    }

    public Key(String name, String description, short value) {
        this.setName(name);
        this.setDescription(description);
        this.setValue(value);
    }

    public Key(String name, String description, boolean value) {
        this.setName(name);
        this.setDescription(description);
        this.setValue(value);
    }

    public String getDescription() {
        return this.description;
    }

    public String getEditType() {
        return this.editType;
    }

    public String getName() {
        return this.name;
    }

    public String getRefName() {
        return this.refName;
    }

    public String getRefNameValue() {
        return this.refNameValue;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public void setEditType(String newM_editType) {
        this.editType = newM_editType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRefName(String newM_refName) {
        this.refName = newM_refName;
    }

    public void setRefNameValue(String newM_refNameValue) {
        this.refNameValue = newM_refNameValue;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setValue(byte value) {
        this.value = value;
    }

    public void setValue(char value) {
        this.value = Character.valueOf(value);
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setValue(float value) {
        this.value = Float.valueOf(value);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        if (this.getEditType() != null && this.value != null && this.value.toString().trim().length() != 0) {
            if (this.getEditType().equals("Character") || this.getEditType().equals("Reference")) {
                return this.value;
            }
            if (this.getEditType().equals("Boolean")) {
                if (this.value.toString().equalsIgnoreCase("Y") || this.value.toString().equalsIgnoreCase("true")) {
                    return true;
                }
                if (this.value.toString().equalsIgnoreCase("N") || this.value.toString().equalsIgnoreCase("false")) {
                    return false;
                }
            } else {
                if (this.getEditType().equals("Integer")) {
                    if (this.value == null || this.value.equals("null")) {
                        return "";
                    }
                    return Integer.valueOf(this.value.toString());
                }
                if (this.getEditType().equals("Double")) {
                    if (this.value == null || this.value.equals("null")) {
                        return "";
                    }
                    return Double.valueOf(this.value.toString());
                }
            }
        }
        return this.value;
    }

    public String toString() {
        return this.getName() + " = " + this.getValue();
    }
}

