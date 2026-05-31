/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.table;

import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;
import nc.vo.pub.table.TableFieldVO;

public class TableVO
extends ValueObject {
    private String m_tableName;
    private TableFieldVO[] m_tableFields;
    private String[] m_primaryKey;

    public TableVO() {
    }

    public TableVO(String tableName) {
        this.setTableName(tableName);
    }

    @Override
    public String getEntityName() {
        return null;
    }

    public TableFieldVO[] getTableFields() {
        return this.m_tableFields;
    }

    public String getTableName() {
        return this.m_tableName;
    }

    public String[] getTablePrimaryKey() {
        return this.m_primaryKey;
    }

    public void setTableFields(TableFieldVO[] newTableFields) {
        this.m_tableFields = newTableFields;
    }

    public void setTableName(String newTableName) {
        this.m_tableName = newTableName;
    }

    public void setTablePrimaryKey(String[] newPrimaryKey) {
        this.m_primaryKey = newPrimaryKey;
    }

    @Override
    public void validate() throws ValidationException {
    }
}

