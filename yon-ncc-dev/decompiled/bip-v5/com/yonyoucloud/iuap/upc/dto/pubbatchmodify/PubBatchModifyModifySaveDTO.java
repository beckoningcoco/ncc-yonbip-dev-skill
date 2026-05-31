/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.pubbatchmodify;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.pubbatchmodify.PubBatchModifyFieldSaveDTO;
import com.yonyoucloud.iuap.upc.dto.pubbatchmodify.PubBatchModifyQueryFieldDTO;
import java.io.Serializable;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class PubBatchModifyModifySaveDTO
implements Serializable {
    private String asyncKey;
    private int expireTime;
    private List<Object> idList;
    private String fullName;
    private String entityName;
    private String isMain;
    private String primaryKey;
    private String foreignKey;
    private List<PubBatchModifyFieldSaveDTO> batchModifyFieldSaveDTOList;
    private List<PubBatchModifyQueryFieldDTO> batchModifyQueryFieldDTOList;

    public String getAsyncKey() {
        return this.asyncKey;
    }

    public int getExpireTime() {
        return this.expireTime;
    }

    public List<Object> getIdList() {
        return this.idList;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getEntityName() {
        return this.entityName;
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

    public List<PubBatchModifyFieldSaveDTO> getBatchModifyFieldSaveDTOList() {
        return this.batchModifyFieldSaveDTOList;
    }

    public List<PubBatchModifyQueryFieldDTO> getBatchModifyQueryFieldDTOList() {
        return this.batchModifyQueryFieldDTOList;
    }

    public void setAsyncKey(String asyncKey) {
        this.asyncKey = asyncKey;
    }

    public void setExpireTime(int expireTime) {
        this.expireTime = expireTime;
    }

    public void setIdList(List<Object> idList) {
        this.idList = idList;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
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

    public void setBatchModifyFieldSaveDTOList(List<PubBatchModifyFieldSaveDTO> batchModifyFieldSaveDTOList) {
        this.batchModifyFieldSaveDTOList = batchModifyFieldSaveDTOList;
    }

    public void setBatchModifyQueryFieldDTOList(List<PubBatchModifyQueryFieldDTO> batchModifyQueryFieldDTOList) {
        this.batchModifyQueryFieldDTOList = batchModifyQueryFieldDTOList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PubBatchModifyModifySaveDTO)) {
            return false;
        }
        PubBatchModifyModifySaveDTO other = (PubBatchModifyModifySaveDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getExpireTime() != other.getExpireTime()) {
            return false;
        }
        String this$asyncKey = this.getAsyncKey();
        String other$asyncKey = other.getAsyncKey();
        if (this$asyncKey == null ? other$asyncKey != null : !this$asyncKey.equals(other$asyncKey)) {
            return false;
        }
        List<Object> this$idList = this.getIdList();
        List<Object> other$idList = other.getIdList();
        if (this$idList == null ? other$idList != null : !((Object)this$idList).equals(other$idList)) {
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
        List<PubBatchModifyFieldSaveDTO> this$batchModifyFieldSaveDTOList = this.getBatchModifyFieldSaveDTOList();
        List<PubBatchModifyFieldSaveDTO> other$batchModifyFieldSaveDTOList = other.getBatchModifyFieldSaveDTOList();
        if (this$batchModifyFieldSaveDTOList == null ? other$batchModifyFieldSaveDTOList != null : !((Object)this$batchModifyFieldSaveDTOList).equals(other$batchModifyFieldSaveDTOList)) {
            return false;
        }
        List<PubBatchModifyQueryFieldDTO> this$batchModifyQueryFieldDTOList = this.getBatchModifyQueryFieldDTOList();
        List<PubBatchModifyQueryFieldDTO> other$batchModifyQueryFieldDTOList = other.getBatchModifyQueryFieldDTOList();
        return !(this$batchModifyQueryFieldDTOList == null ? other$batchModifyQueryFieldDTOList != null : !((Object)this$batchModifyQueryFieldDTOList).equals(other$batchModifyQueryFieldDTOList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PubBatchModifyModifySaveDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getExpireTime();
        String $asyncKey = this.getAsyncKey();
        result = result * 59 + ($asyncKey == null ? 43 : $asyncKey.hashCode());
        List<Object> $idList = this.getIdList();
        result = result * 59 + ($idList == null ? 43 : ((Object)$idList).hashCode());
        String $fullName = this.getFullName();
        result = result * 59 + ($fullName == null ? 43 : $fullName.hashCode());
        String $entityName = this.getEntityName();
        result = result * 59 + ($entityName == null ? 43 : $entityName.hashCode());
        String $isMain = this.getIsMain();
        result = result * 59 + ($isMain == null ? 43 : $isMain.hashCode());
        String $primaryKey = this.getPrimaryKey();
        result = result * 59 + ($primaryKey == null ? 43 : $primaryKey.hashCode());
        String $foreignKey = this.getForeignKey();
        result = result * 59 + ($foreignKey == null ? 43 : $foreignKey.hashCode());
        List<PubBatchModifyFieldSaveDTO> $batchModifyFieldSaveDTOList = this.getBatchModifyFieldSaveDTOList();
        result = result * 59 + ($batchModifyFieldSaveDTOList == null ? 43 : ((Object)$batchModifyFieldSaveDTOList).hashCode());
        List<PubBatchModifyQueryFieldDTO> $batchModifyQueryFieldDTOList = this.getBatchModifyQueryFieldDTOList();
        result = result * 59 + ($batchModifyQueryFieldDTOList == null ? 43 : ((Object)$batchModifyQueryFieldDTOList).hashCode());
        return result;
    }

    public String toString() {
        return "PubBatchModifyModifySaveDTO(asyncKey=" + this.getAsyncKey() + ", expireTime=" + this.getExpireTime() + ", idList=" + this.getIdList() + ", fullName=" + this.getFullName() + ", entityName=" + this.getEntityName() + ", isMain=" + this.getIsMain() + ", primaryKey=" + this.getPrimaryKey() + ", foreignKey=" + this.getForeignKey() + ", batchModifyFieldSaveDTOList=" + this.getBatchModifyFieldSaveDTOList() + ", batchModifyQueryFieldDTOList=" + this.getBatchModifyQueryFieldDTOList() + ")";
    }
}

