/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.doc.check.dto;

public class DocOrgPairDTO {
    private Long docId;
    private String orgId;

    public Long getDocId() {
        return this.docId;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DocOrgPairDTO)) {
            return false;
        }
        DocOrgPairDTO other = (DocOrgPairDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$docId = this.getDocId();
        Long other$docId = other.getDocId();
        if (this$docId == null ? other$docId != null : !((Object)this$docId).equals(other$docId)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        return !(this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof DocOrgPairDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $docId = this.getDocId();
        result = result * 59 + ($docId == null ? 43 : ((Object)$docId).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        return result;
    }

    public String toString() {
        return "DocOrgPairDTO(docId=" + this.getDocId() + ", orgId=" + this.getOrgId() + ")";
    }
}

