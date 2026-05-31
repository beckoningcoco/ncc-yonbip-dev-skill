/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.upc.opt.dto;

import java.util.HashMap;
import java.util.List;

public class ForceUpdateDTO {
    private String tenantName;
    private String tenantId;
    private String sopNo;
    private String updateReason;
    private String batchNo;
    private String docType;
    private String docCode;
    private String docName;
    private String updateTime;
    private String commitor;
    private String linkUrl;
    private String updateDetail;
    private String fullName;
    private List<HashMap<String, Object>> updateMapList;

    public String getTenantName() {
        return this.tenantName;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public String getSopNo() {
        return this.sopNo;
    }

    public String getUpdateReason() {
        return this.updateReason;
    }

    public String getBatchNo() {
        return this.batchNo;
    }

    public String getDocType() {
        return this.docType;
    }

    public String getDocCode() {
        return this.docCode;
    }

    public String getDocName() {
        return this.docName;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public String getCommitor() {
        return this.commitor;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public String getUpdateDetail() {
        return this.updateDetail;
    }

    public String getFullName() {
        return this.fullName;
    }

    public List<HashMap<String, Object>> getUpdateMapList() {
        return this.updateMapList;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public void setSopNo(String sopNo) {
        this.sopNo = sopNo;
    }

    public void setUpdateReason(String updateReason) {
        this.updateReason = updateReason;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public void setCommitor(String commitor) {
        this.commitor = commitor;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public void setUpdateDetail(String updateDetail) {
        this.updateDetail = updateDetail;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUpdateMapList(List<HashMap<String, Object>> updateMapList) {
        this.updateMapList = updateMapList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ForceUpdateDTO)) {
            return false;
        }
        ForceUpdateDTO other = (ForceUpdateDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$tenantName = this.getTenantName();
        String other$tenantName = other.getTenantName();
        if (this$tenantName == null ? other$tenantName != null : !this$tenantName.equals(other$tenantName)) {
            return false;
        }
        String this$tenantId = this.getTenantId();
        String other$tenantId = other.getTenantId();
        if (this$tenantId == null ? other$tenantId != null : !this$tenantId.equals(other$tenantId)) {
            return false;
        }
        String this$sopNo = this.getSopNo();
        String other$sopNo = other.getSopNo();
        if (this$sopNo == null ? other$sopNo != null : !this$sopNo.equals(other$sopNo)) {
            return false;
        }
        String this$updateReason = this.getUpdateReason();
        String other$updateReason = other.getUpdateReason();
        if (this$updateReason == null ? other$updateReason != null : !this$updateReason.equals(other$updateReason)) {
            return false;
        }
        String this$batchNo = this.getBatchNo();
        String other$batchNo = other.getBatchNo();
        if (this$batchNo == null ? other$batchNo != null : !this$batchNo.equals(other$batchNo)) {
            return false;
        }
        String this$docType = this.getDocType();
        String other$docType = other.getDocType();
        if (this$docType == null ? other$docType != null : !this$docType.equals(other$docType)) {
            return false;
        }
        String this$docCode = this.getDocCode();
        String other$docCode = other.getDocCode();
        if (this$docCode == null ? other$docCode != null : !this$docCode.equals(other$docCode)) {
            return false;
        }
        String this$docName = this.getDocName();
        String other$docName = other.getDocName();
        if (this$docName == null ? other$docName != null : !this$docName.equals(other$docName)) {
            return false;
        }
        String this$updateTime = this.getUpdateTime();
        String other$updateTime = other.getUpdateTime();
        if (this$updateTime == null ? other$updateTime != null : !this$updateTime.equals(other$updateTime)) {
            return false;
        }
        String this$commitor = this.getCommitor();
        String other$commitor = other.getCommitor();
        if (this$commitor == null ? other$commitor != null : !this$commitor.equals(other$commitor)) {
            return false;
        }
        String this$linkUrl = this.getLinkUrl();
        String other$linkUrl = other.getLinkUrl();
        if (this$linkUrl == null ? other$linkUrl != null : !this$linkUrl.equals(other$linkUrl)) {
            return false;
        }
        String this$updateDetail = this.getUpdateDetail();
        String other$updateDetail = other.getUpdateDetail();
        if (this$updateDetail == null ? other$updateDetail != null : !this$updateDetail.equals(other$updateDetail)) {
            return false;
        }
        String this$fullName = this.getFullName();
        String other$fullName = other.getFullName();
        if (this$fullName == null ? other$fullName != null : !this$fullName.equals(other$fullName)) {
            return false;
        }
        List<HashMap<String, Object>> this$updateMapList = this.getUpdateMapList();
        List<HashMap<String, Object>> other$updateMapList = other.getUpdateMapList();
        return !(this$updateMapList == null ? other$updateMapList != null : !((Object)this$updateMapList).equals(other$updateMapList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ForceUpdateDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $tenantName = this.getTenantName();
        result = result * 59 + ($tenantName == null ? 43 : $tenantName.hashCode());
        String $tenantId = this.getTenantId();
        result = result * 59 + ($tenantId == null ? 43 : $tenantId.hashCode());
        String $sopNo = this.getSopNo();
        result = result * 59 + ($sopNo == null ? 43 : $sopNo.hashCode());
        String $updateReason = this.getUpdateReason();
        result = result * 59 + ($updateReason == null ? 43 : $updateReason.hashCode());
        String $batchNo = this.getBatchNo();
        result = result * 59 + ($batchNo == null ? 43 : $batchNo.hashCode());
        String $docType = this.getDocType();
        result = result * 59 + ($docType == null ? 43 : $docType.hashCode());
        String $docCode = this.getDocCode();
        result = result * 59 + ($docCode == null ? 43 : $docCode.hashCode());
        String $docName = this.getDocName();
        result = result * 59 + ($docName == null ? 43 : $docName.hashCode());
        String $updateTime = this.getUpdateTime();
        result = result * 59 + ($updateTime == null ? 43 : $updateTime.hashCode());
        String $commitor = this.getCommitor();
        result = result * 59 + ($commitor == null ? 43 : $commitor.hashCode());
        String $linkUrl = this.getLinkUrl();
        result = result * 59 + ($linkUrl == null ? 43 : $linkUrl.hashCode());
        String $updateDetail = this.getUpdateDetail();
        result = result * 59 + ($updateDetail == null ? 43 : $updateDetail.hashCode());
        String $fullName = this.getFullName();
        result = result * 59 + ($fullName == null ? 43 : $fullName.hashCode());
        List<HashMap<String, Object>> $updateMapList = this.getUpdateMapList();
        result = result * 59 + ($updateMapList == null ? 43 : ((Object)$updateMapList).hashCode());
        return result;
    }

    public String toString() {
        return "ForceUpdateDTO(tenantName=" + this.getTenantName() + ", tenantId=" + this.getTenantId() + ", sopNo=" + this.getSopNo() + ", updateReason=" + this.getUpdateReason() + ", batchNo=" + this.getBatchNo() + ", docType=" + this.getDocType() + ", docCode=" + this.getDocCode() + ", docName=" + this.getDocName() + ", updateTime=" + this.getUpdateTime() + ", commitor=" + this.getCommitor() + ", linkUrl=" + this.getLinkUrl() + ", updateDetail=" + this.getUpdateDetail() + ", fullName=" + this.getFullName() + ", updateMapList=" + this.getUpdateMapList() + ")";
    }
}

