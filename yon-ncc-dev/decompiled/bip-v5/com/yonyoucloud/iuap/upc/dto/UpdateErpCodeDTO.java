/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class UpdateErpCodeDTO
implements Serializable {
    private String entityName;
    private String sourceErpCode;
    private String targetErpCode;
    private String tableName;
    private String columnName;
    private String yTenantId;
    private Long tenantId;

    public String getEntityName() {
        return this.entityName;
    }

    public String getSourceErpCode() {
        return this.sourceErpCode;
    }

    public String getTargetErpCode() {
        return this.targetErpCode;
    }

    public String getTableName() {
        return this.tableName;
    }

    public String getColumnName() {
        return this.columnName;
    }

    public String getYTenantId() {
        return this.yTenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public void setSourceErpCode(String sourceErpCode) {
        this.sourceErpCode = sourceErpCode;
    }

    public void setTargetErpCode(String targetErpCode) {
        this.targetErpCode = targetErpCode;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public void setYTenantId(String yTenantId) {
        this.yTenantId = yTenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UpdateErpCodeDTO)) {
            return false;
        }
        UpdateErpCodeDTO other = (UpdateErpCodeDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$tenantId = this.getTenantId();
        Long other$tenantId = other.getTenantId();
        if (this$tenantId == null ? other$tenantId != null : !((Object)this$tenantId).equals(other$tenantId)) {
            return false;
        }
        String this$entityName = this.getEntityName();
        String other$entityName = other.getEntityName();
        if (this$entityName == null ? other$entityName != null : !this$entityName.equals(other$entityName)) {
            return false;
        }
        String this$sourceErpCode = this.getSourceErpCode();
        String other$sourceErpCode = other.getSourceErpCode();
        if (this$sourceErpCode == null ? other$sourceErpCode != null : !this$sourceErpCode.equals(other$sourceErpCode)) {
            return false;
        }
        String this$targetErpCode = this.getTargetErpCode();
        String other$targetErpCode = other.getTargetErpCode();
        if (this$targetErpCode == null ? other$targetErpCode != null : !this$targetErpCode.equals(other$targetErpCode)) {
            return false;
        }
        String this$tableName = this.getTableName();
        String other$tableName = other.getTableName();
        if (this$tableName == null ? other$tableName != null : !this$tableName.equals(other$tableName)) {
            return false;
        }
        String this$columnName = this.getColumnName();
        String other$columnName = other.getColumnName();
        if (this$columnName == null ? other$columnName != null : !this$columnName.equals(other$columnName)) {
            return false;
        }
        String this$yTenantId = this.getYTenantId();
        String other$yTenantId = other.getYTenantId();
        return !(this$yTenantId == null ? other$yTenantId != null : !this$yTenantId.equals(other$yTenantId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof UpdateErpCodeDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $tenantId = this.getTenantId();
        result = result * 59 + ($tenantId == null ? 43 : ((Object)$tenantId).hashCode());
        String $entityName = this.getEntityName();
        result = result * 59 + ($entityName == null ? 43 : $entityName.hashCode());
        String $sourceErpCode = this.getSourceErpCode();
        result = result * 59 + ($sourceErpCode == null ? 43 : $sourceErpCode.hashCode());
        String $targetErpCode = this.getTargetErpCode();
        result = result * 59 + ($targetErpCode == null ? 43 : $targetErpCode.hashCode());
        String $tableName = this.getTableName();
        result = result * 59 + ($tableName == null ? 43 : $tableName.hashCode());
        String $columnName = this.getColumnName();
        result = result * 59 + ($columnName == null ? 43 : $columnName.hashCode());
        String $yTenantId = this.getYTenantId();
        result = result * 59 + ($yTenantId == null ? 43 : $yTenantId.hashCode());
        return result;
    }

    public String toString() {
        return "UpdateErpCodeDTO(entityName=" + this.getEntityName() + ", sourceErpCode=" + this.getSourceErpCode() + ", targetErpCode=" + this.getTargetErpCode() + ", tableName=" + this.getTableName() + ", columnName=" + this.getColumnName() + ", yTenantId=" + this.getYTenantId() + ", tenantId=" + this.getTenantId() + ")";
    }
}

