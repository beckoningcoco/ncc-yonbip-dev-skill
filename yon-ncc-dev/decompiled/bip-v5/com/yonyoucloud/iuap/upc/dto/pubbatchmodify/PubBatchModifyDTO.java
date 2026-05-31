/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.pubbatchmodify;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.pubbatchmodify.PubBatchModifyFieldDTO;
import java.io.Serializable;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class PubBatchModifyDTO
implements Serializable {
    private String id;
    private String billNum;
    private String fullName;
    private String entityName;
    private String entityNameResId;
    private String isMain;
    private String primaryKey;
    private String foreignKey;
    private List<PubBatchModifyFieldDTO> batchModifyQueryFieldList;
    private List<PubBatchModifyFieldDTO> batchModifySaveFieldList;

    public String getId() {
        return this.id;
    }

    public String getBillNum() {
        return this.billNum;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getEntityName() {
        return this.entityName;
    }

    public String getEntityNameResId() {
        return this.entityNameResId;
    }

    public String getIsMain() {
        return this.isMain;
    }

    public String getPrimaryKey() {
        return this.primaryKey;
    }

    public String getForeignKey() {
        return this.foreignKey;
    }

    public List<PubBatchModifyFieldDTO> getBatchModifyQueryFieldList() {
        return this.batchModifyQueryFieldList;
    }

    public List<PubBatchModifyFieldDTO> getBatchModifySaveFieldList() {
        return this.batchModifySaveFieldList;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBillNum(String billNum) {
        this.billNum = billNum;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public void setEntityNameResId(String entityNameResId) {
        this.entityNameResId = entityNameResId;
    }

    public void setIsMain(String isMain) {
        this.isMain = isMain;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public void setForeignKey(String foreignKey) {
        this.foreignKey = foreignKey;
    }

    public void setBatchModifyQueryFieldList(List<PubBatchModifyFieldDTO> batchModifyQueryFieldList) {
        this.batchModifyQueryFieldList = batchModifyQueryFieldList;
    }

    public void setBatchModifySaveFieldList(List<PubBatchModifyFieldDTO> batchModifySaveFieldList) {
        this.batchModifySaveFieldList = batchModifySaveFieldList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PubBatchModifyDTO)) {
            return false;
        }
        PubBatchModifyDTO other = (PubBatchModifyDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$billNum = this.getBillNum();
        String other$billNum = other.getBillNum();
        if (this$billNum == null ? other$billNum != null : !this$billNum.equals(other$billNum)) {
            return false;
        }
        String this$fullName = this.getFullName();
        String other$fullName = other.getFullName();
        if (this$fullName == null ? other$fullName != null : !this$fullName.equals(other$fullName)) {
            return false;
        }
        String this$entityName = this.getEntityName();
        String other$entityName = other.getEntityName();
        if (this$entityName == null ? other$entityName != null : !this$entityName.equals(other$entityName)) {
            return false;
        }
        String this$entityNameResId = this.getEntityNameResId();
        String other$entityNameResId = other.getEntityNameResId();
        if (this$entityNameResId == null ? other$entityNameResId != null : !this$entityNameResId.equals(other$entityNameResId)) {
            return false;
        }
        String this$isMain = this.getIsMain();
        String other$isMain = other.getIsMain();
        if (this$isMain == null ? other$isMain != null : !this$isMain.equals(other$isMain)) {
            return false;
        }
        String this$primaryKey = this.getPrimaryKey();
        String other$primaryKey = other.getPrimaryKey();
        if (this$primaryKey == null ? other$primaryKey != null : !this$primaryKey.equals(other$primaryKey)) {
            return false;
        }
        String this$foreignKey = this.getForeignKey();
        String other$foreignKey = other.getForeignKey();
        if (this$foreignKey == null ? other$foreignKey != null : !this$foreignKey.equals(other$foreignKey)) {
            return false;
        }
        List<PubBatchModifyFieldDTO> this$batchModifyQueryFieldList = this.getBatchModifyQueryFieldList();
        List<PubBatchModifyFieldDTO> other$batchModifyQueryFieldList = other.getBatchModifyQueryFieldList();
        if (this$batchModifyQueryFieldList == null ? other$batchModifyQueryFieldList != null : !((Object)this$batchModifyQueryFieldList).equals(other$batchModifyQueryFieldList)) {
            return false;
        }
        List<PubBatchModifyFieldDTO> this$batchModifySaveFieldList = this.getBatchModifySaveFieldList();
        List<PubBatchModifyFieldDTO> other$batchModifySaveFieldList = other.getBatchModifySaveFieldList();
        return !(this$batchModifySaveFieldList == null ? other$batchModifySaveFieldList != null : !((Object)this$batchModifySaveFieldList).equals(other$batchModifySaveFieldList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PubBatchModifyDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $billNum = this.getBillNum();
        result = result * 59 + ($billNum == null ? 43 : $billNum.hashCode());
        String $fullName = this.getFullName();
        result = result * 59 + ($fullName == null ? 43 : $fullName.hashCode());
        String $entityName = this.getEntityName();
        result = result * 59 + ($entityName == null ? 43 : $entityName.hashCode());
        String $entityNameResId = this.getEntityNameResId();
        result = result * 59 + ($entityNameResId == null ? 43 : $entityNameResId.hashCode());
        String $isMain = this.getIsMain();
        result = result * 59 + ($isMain == null ? 43 : $isMain.hashCode());
        String $primaryKey = this.getPrimaryKey();
        result = result * 59 + ($primaryKey == null ? 43 : $primaryKey.hashCode());
        String $foreignKey = this.getForeignKey();
        result = result * 59 + ($foreignKey == null ? 43 : $foreignKey.hashCode());
        List<PubBatchModifyFieldDTO> $batchModifyQueryFieldList = this.getBatchModifyQueryFieldList();
        result = result * 59 + ($batchModifyQueryFieldList == null ? 43 : ((Object)$batchModifyQueryFieldList).hashCode());
        List<PubBatchModifyFieldDTO> $batchModifySaveFieldList = this.getBatchModifySaveFieldList();
        result = result * 59 + ($batchModifySaveFieldList == null ? 43 : ((Object)$batchModifySaveFieldList).hashCode());
        return result;
    }

    public String toString() {
        return "PubBatchModifyDTO(id=" + this.getId() + ", billNum=" + this.getBillNum() + ", fullName=" + this.getFullName() + ", entityName=" + this.getEntityName() + ", entityNameResId=" + this.getEntityNameResId() + ", isMain=" + this.getIsMain() + ", primaryKey=" + this.getPrimaryKey() + ", foreignKey=" + this.getForeignKey() + ", batchModifyQueryFieldList=" + this.getBatchModifyQueryFieldList() + ", batchModifySaveFieldList=" + this.getBatchModifySaveFieldList() + ")";
    }
}

