/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.doc.check.dto;

import java.util.List;

public class DocCheckDataDTO<T> {
    private T newDocDTO;
    private T oldDocDTO;
    private String orgId;
    private List<String> updateFieldNames;

    public T getNewDocDTO() {
        return this.newDocDTO;
    }

    public T getOldDocDTO() {
        return this.oldDocDTO;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public List<String> getUpdateFieldNames() {
        return this.updateFieldNames;
    }

    public void setNewDocDTO(T newDocDTO) {
        this.newDocDTO = newDocDTO;
    }

    public void setOldDocDTO(T oldDocDTO) {
        this.oldDocDTO = oldDocDTO;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setUpdateFieldNames(List<String> updateFieldNames) {
        this.updateFieldNames = updateFieldNames;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DocCheckDataDTO)) {
            return false;
        }
        DocCheckDataDTO other = (DocCheckDataDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        T this$newDocDTO = this.getNewDocDTO();
        T other$newDocDTO = other.getNewDocDTO();
        if (this$newDocDTO == null ? other$newDocDTO != null : !this$newDocDTO.equals(other$newDocDTO)) {
            return false;
        }
        T this$oldDocDTO = this.getOldDocDTO();
        T other$oldDocDTO = other.getOldDocDTO();
        if (this$oldDocDTO == null ? other$oldDocDTO != null : !this$oldDocDTO.equals(other$oldDocDTO)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        List<String> this$updateFieldNames = this.getUpdateFieldNames();
        List<String> other$updateFieldNames = other.getUpdateFieldNames();
        return !(this$updateFieldNames == null ? other$updateFieldNames != null : !((Object)this$updateFieldNames).equals(other$updateFieldNames));
    }

    protected boolean canEqual(Object other) {
        return other instanceof DocCheckDataDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        T $newDocDTO = this.getNewDocDTO();
        result = result * 59 + ($newDocDTO == null ? 43 : $newDocDTO.hashCode());
        T $oldDocDTO = this.getOldDocDTO();
        result = result * 59 + ($oldDocDTO == null ? 43 : $oldDocDTO.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        List<String> $updateFieldNames = this.getUpdateFieldNames();
        result = result * 59 + ($updateFieldNames == null ? 43 : ((Object)$updateFieldNames).hashCode());
        return result;
    }

    public String toString() {
        return "DocCheckDataDTO(newDocDTO=" + this.getNewDocDTO() + ", oldDocDTO=" + this.getOldDocDTO() + ", orgId=" + this.getOrgId() + ", updateFieldNames=" + this.getUpdateFieldNames() + ")";
    }
}

