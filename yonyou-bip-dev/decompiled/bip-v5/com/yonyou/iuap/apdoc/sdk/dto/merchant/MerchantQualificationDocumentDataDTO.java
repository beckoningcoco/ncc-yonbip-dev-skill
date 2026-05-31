/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyou.iuap.apdoc.sdk.dto.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCEntityStatus;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantQualificationDocumentDataDTO
implements Serializable {
    private Long id;
    private Long merchantId;
    private Long licenseName;
    private String attachment;
    private String licenseNumber;
    private String longTermEffective;
    private Date validityStartDate;
    private Date dueDate;
    private String remarks;
    private String documentUploader;
    private Date documentUploaderTime;
    private String informationModifier;
    private Date informationModifyTime;
    private UPCEntityStatus entityStatus;
    private List<String> needBlankFieldList;

    public Long getId() {
        return this.id;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public Long getLicenseName() {
        return this.licenseName;
    }

    public String getAttachment() {
        return this.attachment;
    }

    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    public String getLongTermEffective() {
        return this.longTermEffective;
    }

    public Date getValidityStartDate() {
        return this.validityStartDate;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getDocumentUploader() {
        return this.documentUploader;
    }

    public Date getDocumentUploaderTime() {
        return this.documentUploaderTime;
    }

    public String getInformationModifier() {
        return this.informationModifier;
    }

    public Date getInformationModifyTime() {
        return this.informationModifyTime;
    }

    public UPCEntityStatus getEntityStatus() {
        return this.entityStatus;
    }

    public List<String> getNeedBlankFieldList() {
        return this.needBlankFieldList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setLicenseName(Long licenseName) {
        this.licenseName = licenseName;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setLongTermEffective(String longTermEffective) {
        this.longTermEffective = longTermEffective;
    }

    public void setValidityStartDate(Date validityStartDate) {
        this.validityStartDate = validityStartDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setDocumentUploader(String documentUploader) {
        this.documentUploader = documentUploader;
    }

    public void setDocumentUploaderTime(Date documentUploaderTime) {
        this.documentUploaderTime = documentUploaderTime;
    }

    public void setInformationModifier(String informationModifier) {
        this.informationModifier = informationModifier;
    }

    public void setInformationModifyTime(Date informationModifyTime) {
        this.informationModifyTime = informationModifyTime;
    }

    public void setEntityStatus(UPCEntityStatus entityStatus) {
        this.entityStatus = entityStatus;
    }

    public void setNeedBlankFieldList(List<String> needBlankFieldList) {
        this.needBlankFieldList = needBlankFieldList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantQualificationDocumentDataDTO)) {
            return false;
        }
        MerchantQualificationDocumentDataDTO other = (MerchantQualificationDocumentDataDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Long this$licenseName = this.getLicenseName();
        Long other$licenseName = other.getLicenseName();
        if (this$licenseName == null ? other$licenseName != null : !((Object)this$licenseName).equals(other$licenseName)) {
            return false;
        }
        String this$attachment = this.getAttachment();
        String other$attachment = other.getAttachment();
        if (this$attachment == null ? other$attachment != null : !this$attachment.equals(other$attachment)) {
            return false;
        }
        String this$licenseNumber = this.getLicenseNumber();
        String other$licenseNumber = other.getLicenseNumber();
        if (this$licenseNumber == null ? other$licenseNumber != null : !this$licenseNumber.equals(other$licenseNumber)) {
            return false;
        }
        String this$longTermEffective = this.getLongTermEffective();
        String other$longTermEffective = other.getLongTermEffective();
        if (this$longTermEffective == null ? other$longTermEffective != null : !this$longTermEffective.equals(other$longTermEffective)) {
            return false;
        }
        Date this$validityStartDate = this.getValidityStartDate();
        Date other$validityStartDate = other.getValidityStartDate();
        if (this$validityStartDate == null ? other$validityStartDate != null : !((Object)this$validityStartDate).equals(other$validityStartDate)) {
            return false;
        }
        Date this$dueDate = this.getDueDate();
        Date other$dueDate = other.getDueDate();
        if (this$dueDate == null ? other$dueDate != null : !((Object)this$dueDate).equals(other$dueDate)) {
            return false;
        }
        String this$remarks = this.getRemarks();
        String other$remarks = other.getRemarks();
        if (this$remarks == null ? other$remarks != null : !this$remarks.equals(other$remarks)) {
            return false;
        }
        String this$documentUploader = this.getDocumentUploader();
        String other$documentUploader = other.getDocumentUploader();
        if (this$documentUploader == null ? other$documentUploader != null : !this$documentUploader.equals(other$documentUploader)) {
            return false;
        }
        Date this$documentUploaderTime = this.getDocumentUploaderTime();
        Date other$documentUploaderTime = other.getDocumentUploaderTime();
        if (this$documentUploaderTime == null ? other$documentUploaderTime != null : !((Object)this$documentUploaderTime).equals(other$documentUploaderTime)) {
            return false;
        }
        String this$informationModifier = this.getInformationModifier();
        String other$informationModifier = other.getInformationModifier();
        if (this$informationModifier == null ? other$informationModifier != null : !this$informationModifier.equals(other$informationModifier)) {
            return false;
        }
        Date this$informationModifyTime = this.getInformationModifyTime();
        Date other$informationModifyTime = other.getInformationModifyTime();
        if (this$informationModifyTime == null ? other$informationModifyTime != null : !((Object)this$informationModifyTime).equals(other$informationModifyTime)) {
            return false;
        }
        UPCEntityStatus this$entityStatus = this.getEntityStatus();
        UPCEntityStatus other$entityStatus = other.getEntityStatus();
        if (this$entityStatus == null ? other$entityStatus != null : !((Object)((Object)this$entityStatus)).equals((Object)other$entityStatus)) {
            return false;
        }
        List<String> this$needBlankFieldList = this.getNeedBlankFieldList();
        List<String> other$needBlankFieldList = other.getNeedBlankFieldList();
        return !(this$needBlankFieldList == null ? other$needBlankFieldList != null : !((Object)this$needBlankFieldList).equals(other$needBlankFieldList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantQualificationDocumentDataDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $licenseName = this.getLicenseName();
        result = result * 59 + ($licenseName == null ? 43 : ((Object)$licenseName).hashCode());
        String $attachment = this.getAttachment();
        result = result * 59 + ($attachment == null ? 43 : $attachment.hashCode());
        String $licenseNumber = this.getLicenseNumber();
        result = result * 59 + ($licenseNumber == null ? 43 : $licenseNumber.hashCode());
        String $longTermEffective = this.getLongTermEffective();
        result = result * 59 + ($longTermEffective == null ? 43 : $longTermEffective.hashCode());
        Date $validityStartDate = this.getValidityStartDate();
        result = result * 59 + ($validityStartDate == null ? 43 : ((Object)$validityStartDate).hashCode());
        Date $dueDate = this.getDueDate();
        result = result * 59 + ($dueDate == null ? 43 : ((Object)$dueDate).hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        String $documentUploader = this.getDocumentUploader();
        result = result * 59 + ($documentUploader == null ? 43 : $documentUploader.hashCode());
        Date $documentUploaderTime = this.getDocumentUploaderTime();
        result = result * 59 + ($documentUploaderTime == null ? 43 : ((Object)$documentUploaderTime).hashCode());
        String $informationModifier = this.getInformationModifier();
        result = result * 59 + ($informationModifier == null ? 43 : $informationModifier.hashCode());
        Date $informationModifyTime = this.getInformationModifyTime();
        result = result * 59 + ($informationModifyTime == null ? 43 : ((Object)$informationModifyTime).hashCode());
        UPCEntityStatus $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : ((Object)((Object)$entityStatus)).hashCode());
        List<String> $needBlankFieldList = this.getNeedBlankFieldList();
        result = result * 59 + ($needBlankFieldList == null ? 43 : ((Object)$needBlankFieldList).hashCode());
        return result;
    }

    public String toString() {
        return "MerchantQualificationDocumentDataDTO(id=" + this.getId() + ", merchantId=" + this.getMerchantId() + ", licenseName=" + this.getLicenseName() + ", attachment=" + this.getAttachment() + ", licenseNumber=" + this.getLicenseNumber() + ", longTermEffective=" + this.getLongTermEffective() + ", validityStartDate=" + this.getValidityStartDate() + ", dueDate=" + this.getDueDate() + ", remarks=" + this.getRemarks() + ", documentUploader=" + this.getDocumentUploader() + ", documentUploaderTime=" + this.getDocumentUploaderTime() + ", informationModifier=" + this.getInformationModifier() + ", informationModifyTime=" + this.getInformationModifyTime() + ", entityStatus=" + (Object)((Object)this.getEntityStatus()) + ", needBlankFieldList=" + this.getNeedBlankFieldList() + ")";
    }
}

