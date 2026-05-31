/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.table;

import java.io.Serializable;
import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;

public class TableFieldVO
extends ValueObject
implements Serializable {
    private String m_fieldName;
    private int m_maxLength;
    private String m_defaultValue;
    private String m_note;
    private boolean m_nullAllowed;
    private int m_index;
    private int m_dataType;
    private String m_dataTypeName;

    public int getDataType() {
        return this.m_dataType;
    }

    public String getDataTypeName() {
        return this.m_dataTypeName;
    }

    public String getDefaultValue() {
        return this.m_defaultValue;
    }

    @Override
    public String getEntityName() {
        return null;
    }

    public String getFieldName() {
        return this.m_fieldName;
    }

    public int getIndex() {
        return this.m_index;
    }

    public int getMaxLength() {
        return this.m_maxLength;
    }

    public String getNote() {
        return this.m_note;
    }

    public boolean isNullAllowed() {
        return this.m_nullAllowed;
    }

    public void setDataType(int newDataType) {
        this.m_dataType = newDataType;
    }

    public void setDataTypeName(String newDataTypeName) {
        this.m_dataTypeName = newDataTypeName;
    }

    public void setDefaultValue(String newDefaultValue) {
        this.m_defaultValue = newDefaultValue;
    }

    public void setFieldName(String newFieldName) {
        this.m_fieldName = newFieldName;
    }

    public void setIndex(int newIndex) {
        this.m_index = newIndex;
    }

    public void setMaxLength(int newMaxLength) {
        this.m_maxLength = newMaxLength;
    }

    public void setNote(String newNote) {
        this.m_note = newNote;
    }

    public void setNullAllowed(boolean newNullAllowed) {
        this.m_nullAllowed = newNullAllowed;
    }

    @Override
    public void validate() throws ValidationException {
    }
}

