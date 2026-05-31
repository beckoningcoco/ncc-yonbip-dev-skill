/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyou.iuap.apdoc.sdk.dto.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class DocOrgIdDTO
implements Serializable {
    private String docId;
    private String orgId;

    public String getDocId() {
        return this.docId;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DocOrgIdDTO)) {
            return false;
        }
        DocOrgIdDTO other = (DocOrgIdDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$docId = this.getDocId();
        String other$docId = other.getDocId();
        if (this$docId == null ? other$docId != null : !this$docId.equals(other$docId)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        return !(this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof DocOrgIdDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $docId = this.getDocId();
        result = result * 59 + ($docId == null ? 43 : $docId.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        return result;
    }

    public String toString() {
        return "DocOrgIdDTO(docId=" + this.getDocId() + ", orgId=" + this.getOrgId() + ")";
    }
}

