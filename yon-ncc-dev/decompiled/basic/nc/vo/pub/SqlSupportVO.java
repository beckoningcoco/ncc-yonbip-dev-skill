/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;

public class SqlSupportVO
extends ValueObject {
    private String sqlSelectField = null;
    private String voAttributeName = null;

    public SqlSupportVO(String sqlSelectField, String voAttributeName) {
        this.sqlSelectField = sqlSelectField;
        this.voAttributeName = voAttributeName;
    }

    @Override
    public String getEntityName() {
        return null;
    }

    public String getSqlSelectField() {
        return this.sqlSelectField;
    }

    public String getVoAttributeName() {
        return this.voAttributeName;
    }

    public void setSqlSelectField(String newSqlSelectField) {
        this.sqlSelectField = newSqlSelectField;
    }

    public void setVoAttributeName(String newVoAttributeName) {
        this.voAttributeName = newVoAttributeName;
    }

    @Override
    public void validate() throws ValidationException {
    }
}

