/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.openapi.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.openapi.character.QueryExtendDTO;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantOpenApiQryDTO
extends QueryExtendDTO
implements Serializable {
    private String[] fields;
    private Long id;
    private String code;
    private String name;
    private String fuzzyName;
    private String shortname;
    private String fuzzyShortname;
    private String createOrgId;
    private String createOrgCode;
    private List<Long> idList;
    private List<String> codeList;
    private List<String> createOrgIdList;
    private List<String> belongOrgIdList;
    private Long customerClassId;
    private String customerClassCode;
    private List<Long> customerClassIdList;
    private List<String> customerClassCodeList;
    private Long customerIndustryId;
    private String customerIndustryCode;
    private Boolean internalOrg;
    private String internalOrgIdId;
    private String internalOrgIdCode;
    private Long suppliersId;
    private String suppliersCode;
    private Date beganTime;
    private Date endTime;
    private String belongOrgId;
    private String belongOrgCode;
    private Boolean filterPotential;
    private Boolean onlyFilterPotential;
    private Boolean onlyQuerySelf;
    private Boolean createFlag;
    private Date beginTime;
    private Date pubts;
    private String creditCode;
    private List<String> creditCodeList;

    public String[] getFields() {
        return this.fields;
    }

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getFuzzyName() {
        return this.fuzzyName;
    }

    public String getShortname() {
        return this.shortname;
    }

    public String getFuzzyShortname() {
        return this.fuzzyShortname;
    }

    public String getCreateOrgId() {
        return this.createOrgId;
    }

    public String getCreateOrgCode() {
        return this.createOrgCode;
    }

    public List<Long> getIdList() {
        return this.idList;
    }

    public List<String> getCodeList() {
        return this.codeList;
    }

    public List<String> getCreateOrgIdList() {
        return this.createOrgIdList;
    }

    public List<String> getBelongOrgIdList() {
        return this.belongOrgIdList;
    }

    public Long getCustomerClassId() {
        return this.customerClassId;
    }

    public String getCustomerClassCode() {
        return this.customerClassCode;
    }

    public List<Long> getCustomerClassIdList() {
        return this.customerClassIdList;
    }

    public List<String> getCustomerClassCodeList() {
        return this.customerClassCodeList;
    }

    public Long getCustomerIndustryId() {
        return this.customerIndustryId;
    }

    public String getCustomerIndustryCode() {
        return this.customerIndustryCode;
    }

    public Boolean getInternalOrg() {
        return this.internalOrg;
    }

    public String getInternalOrgIdId() {
        return this.internalOrgIdId;
    }

    public String getInternalOrgIdCode() {
        return this.internalOrgIdCode;
    }

    public Long getSuppliersId() {
        return this.suppliersId;
    }

    public String getSuppliersCode() {
        return this.suppliersCode;
    }

    public Date getBeganTime() {
        return this.beganTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public String getBelongOrgId() {
        return this.belongOrgId;
    }

    public String getBelongOrgCode() {
        return this.belongOrgCode;
    }

    public Boolean getFilterPotential() {
        return this.filterPotential;
    }

    public Boolean getOnlyFilterPotential() {
        return this.onlyFilterPotential;
    }

    public Boolean getOnlyQuerySelf() {
        return this.onlyQuerySelf;
    }

    public Boolean getCreateFlag() {
        return this.createFlag;
    }

    public Date getBeginTime() {
        return this.beginTime;
    }

    public Date getPubts() {
        return this.pubts;
    }

    public String getCreditCode() {
        return this.creditCode;
    }

    public List<String> getCreditCodeList() {
        return this.creditCodeList;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFuzzyName(String fuzzyName) {
        this.fuzzyName = fuzzyName;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public void setFuzzyShortname(String fuzzyShortname) {
        this.fuzzyShortname = fuzzyShortname;
    }

    public void setCreateOrgId(String createOrgId) {
        this.createOrgId = createOrgId;
    }

    public void setCreateOrgCode(String createOrgCode) {
        this.createOrgCode = createOrgCode;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }

    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }

    public void setCreateOrgIdList(List<String> createOrgIdList) {
        this.createOrgIdList = createOrgIdList;
    }

    public void setBelongOrgIdList(List<String> belongOrgIdList) {
        this.belongOrgIdList = belongOrgIdList;
    }

    public void setCustomerClassId(Long customerClassId) {
        this.customerClassId = customerClassId;
    }

    public void setCustomerClassCode(String customerClassCode) {
        this.customerClassCode = customerClassCode;
    }

    public void setCustomerClassIdList(List<Long> customerClassIdList) {
        this.customerClassIdList = customerClassIdList;
    }

    public void setCustomerClassCodeList(List<String> customerClassCodeList) {
        this.customerClassCodeList = customerClassCodeList;
    }

    public void setCustomerIndustryId(Long customerIndustryId) {
        this.customerIndustryId = customerIndustryId;
    }

    public void setCustomerIndustryCode(String customerIndustryCode) {
        this.customerIndustryCode = customerIndustryCode;
    }

    public void setInternalOrg(Boolean internalOrg) {
        this.internalOrg = internalOrg;
    }

    public void setInternalOrgIdId(String internalOrgIdId) {
        this.internalOrgIdId = internalOrgIdId;
    }

    public void setInternalOrgIdCode(String internalOrgIdCode) {
        this.internalOrgIdCode = internalOrgIdCode;
    }

    public void setSuppliersId(Long suppliersId) {
        this.suppliersId = suppliersId;
    }

    public void setSuppliersCode(String suppliersCode) {
        this.suppliersCode = suppliersCode;
    }

    public void setBeganTime(Date beganTime) {
        this.beganTime = beganTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setBelongOrgId(String belongOrgId) {
        this.belongOrgId = belongOrgId;
    }

    public void setBelongOrgCode(String belongOrgCode) {
        this.belongOrgCode = belongOrgCode;
    }

    public void setFilterPotential(Boolean filterPotential) {
        this.filterPotential = filterPotential;
    }

    public void setOnlyFilterPotential(Boolean onlyFilterPotential) {
        this.onlyFilterPotential = onlyFilterPotential;
    }

    public void setOnlyQuerySelf(Boolean onlyQuerySelf) {
        this.onlyQuerySelf = onlyQuerySelf;
    }

    public void setCreateFlag(Boolean createFlag) {
        this.createFlag = createFlag;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public void setPubts(Date pubts) {
        this.pubts = pubts;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public void setCreditCodeList(List<String> creditCodeList) {
        this.creditCodeList = creditCodeList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantOpenApiQryDTO)) {
            return false;
        }
        MerchantOpenApiQryDTO other = (MerchantOpenApiQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$customerClassId = this.getCustomerClassId();
        Long other$customerClassId = other.getCustomerClassId();
        if (this$customerClassId == null ? other$customerClassId != null : !((Object)this$customerClassId).equals(other$customerClassId)) {
            return false;
        }
        Long this$customerIndustryId = this.getCustomerIndustryId();
        Long other$customerIndustryId = other.getCustomerIndustryId();
        if (this$customerIndustryId == null ? other$customerIndustryId != null : !((Object)this$customerIndustryId).equals(other$customerIndustryId)) {
            return false;
        }
        Boolean this$internalOrg = this.getInternalOrg();
        Boolean other$internalOrg = other.getInternalOrg();
        if (this$internalOrg == null ? other$internalOrg != null : !((Object)this$internalOrg).equals(other$internalOrg)) {
            return false;
        }
        Long this$suppliersId = this.getSuppliersId();
        Long other$suppliersId = other.getSuppliersId();
        if (this$suppliersId == null ? other$suppliersId != null : !((Object)this$suppliersId).equals(other$suppliersId)) {
            return false;
        }
        Boolean this$filterPotential = this.getFilterPotential();
        Boolean other$filterPotential = other.getFilterPotential();
        if (this$filterPotential == null ? other$filterPotential != null : !((Object)this$filterPotential).equals(other$filterPotential)) {
            return false;
        }
        Boolean this$onlyFilterPotential = this.getOnlyFilterPotential();
        Boolean other$onlyFilterPotential = other.getOnlyFilterPotential();
        if (this$onlyFilterPotential == null ? other$onlyFilterPotential != null : !((Object)this$onlyFilterPotential).equals(other$onlyFilterPotential)) {
            return false;
        }
        Boolean this$onlyQuerySelf = this.getOnlyQuerySelf();
        Boolean other$onlyQuerySelf = other.getOnlyQuerySelf();
        if (this$onlyQuerySelf == null ? other$onlyQuerySelf != null : !((Object)this$onlyQuerySelf).equals(other$onlyQuerySelf)) {
            return false;
        }
        Boolean this$createFlag = this.getCreateFlag();
        Boolean other$createFlag = other.getCreateFlag();
        if (this$createFlag == null ? other$createFlag != null : !((Object)this$createFlag).equals(other$createFlag)) {
            return false;
        }
        if (!Arrays.deepEquals(this.getFields(), other.getFields())) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$fuzzyName = this.getFuzzyName();
        String other$fuzzyName = other.getFuzzyName();
        if (this$fuzzyName == null ? other$fuzzyName != null : !this$fuzzyName.equals(other$fuzzyName)) {
            return false;
        }
        String this$shortname = this.getShortname();
        String other$shortname = other.getShortname();
        if (this$shortname == null ? other$shortname != null : !this$shortname.equals(other$shortname)) {
            return false;
        }
        String this$fuzzyShortname = this.getFuzzyShortname();
        String other$fuzzyShortname = other.getFuzzyShortname();
        if (this$fuzzyShortname == null ? other$fuzzyShortname != null : !this$fuzzyShortname.equals(other$fuzzyShortname)) {
            return false;
        }
        String this$createOrgId = this.getCreateOrgId();
        String other$createOrgId = other.getCreateOrgId();
        if (this$createOrgId == null ? other$createOrgId != null : !this$createOrgId.equals(other$createOrgId)) {
            return false;
        }
        String this$createOrgCode = this.getCreateOrgCode();
        String other$createOrgCode = other.getCreateOrgCode();
        if (this$createOrgCode == null ? other$createOrgCode != null : !this$createOrgCode.equals(other$createOrgCode)) {
            return false;
        }
        List<Long> this$idList = this.getIdList();
        List<Long> other$idList = other.getIdList();
        if (this$idList == null ? other$idList != null : !((Object)this$idList).equals(other$idList)) {
            return false;
        }
        List<String> this$codeList = this.getCodeList();
        List<String> other$codeList = other.getCodeList();
        if (this$codeList == null ? other$codeList != null : !((Object)this$codeList).equals(other$codeList)) {
            return false;
        }
        List<String> this$createOrgIdList = this.getCreateOrgIdList();
        List<String> other$createOrgIdList = other.getCreateOrgIdList();
        if (this$createOrgIdList == null ? other$createOrgIdList != null : !((Object)this$createOrgIdList).equals(other$createOrgIdList)) {
            return false;
        }
        List<String> this$belongOrgIdList = this.getBelongOrgIdList();
        List<String> other$belongOrgIdList = other.getBelongOrgIdList();
        if (this$belongOrgIdList == null ? other$belongOrgIdList != null : !((Object)this$belongOrgIdList).equals(other$belongOrgIdList)) {
            return false;
        }
        String this$customerClassCode = this.getCustomerClassCode();
        String other$customerClassCode = other.getCustomerClassCode();
        if (this$customerClassCode == null ? other$customerClassCode != null : !this$customerClassCode.equals(other$customerClassCode)) {
            return false;
        }
        List<Long> this$customerClassIdList = this.getCustomerClassIdList();
        List<Long> other$customerClassIdList = other.getCustomerClassIdList();
        if (this$customerClassIdList == null ? other$customerClassIdList != null : !((Object)this$customerClassIdList).equals(other$customerClassIdList)) {
            return false;
        }
        List<String> this$customerClassCodeList = this.getCustomerClassCodeList();
        List<String> other$customerClassCodeList = other.getCustomerClassCodeList();
        if (this$customerClassCodeList == null ? other$customerClassCodeList != null : !((Object)this$customerClassCodeList).equals(other$customerClassCodeList)) {
            return false;
        }
        String this$customerIndustryCode = this.getCustomerIndustryCode();
        String other$customerIndustryCode = other.getCustomerIndustryCode();
        if (this$customerIndustryCode == null ? other$customerIndustryCode != null : !this$customerIndustryCode.equals(other$customerIndustryCode)) {
            return false;
        }
        String this$internalOrgIdId = this.getInternalOrgIdId();
        String other$internalOrgIdId = other.getInternalOrgIdId();
        if (this$internalOrgIdId == null ? other$internalOrgIdId != null : !this$internalOrgIdId.equals(other$internalOrgIdId)) {
            return false;
        }
        String this$internalOrgIdCode = this.getInternalOrgIdCode();
        String other$internalOrgIdCode = other.getInternalOrgIdCode();
        if (this$internalOrgIdCode == null ? other$internalOrgIdCode != null : !this$internalOrgIdCode.equals(other$internalOrgIdCode)) {
            return false;
        }
        String this$suppliersCode = this.getSuppliersCode();
        String other$suppliersCode = other.getSuppliersCode();
        if (this$suppliersCode == null ? other$suppliersCode != null : !this$suppliersCode.equals(other$suppliersCode)) {
            return false;
        }
        Date this$beganTime = this.getBeganTime();
        Date other$beganTime = other.getBeganTime();
        if (this$beganTime == null ? other$beganTime != null : !((Object)this$beganTime).equals(other$beganTime)) {
            return false;
        }
        Date this$endTime = this.getEndTime();
        Date other$endTime = other.getEndTime();
        if (this$endTime == null ? other$endTime != null : !((Object)this$endTime).equals(other$endTime)) {
            return false;
        }
        String this$belongOrgId = this.getBelongOrgId();
        String other$belongOrgId = other.getBelongOrgId();
        if (this$belongOrgId == null ? other$belongOrgId != null : !this$belongOrgId.equals(other$belongOrgId)) {
            return false;
        }
        String this$belongOrgCode = this.getBelongOrgCode();
        String other$belongOrgCode = other.getBelongOrgCode();
        if (this$belongOrgCode == null ? other$belongOrgCode != null : !this$belongOrgCode.equals(other$belongOrgCode)) {
            return false;
        }
        Date this$beginTime = this.getBeginTime();
        Date other$beginTime = other.getBeginTime();
        if (this$beginTime == null ? other$beginTime != null : !((Object)this$beginTime).equals(other$beginTime)) {
            return false;
        }
        Date this$pubts = this.getPubts();
        Date other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !((Object)this$pubts).equals(other$pubts)) {
            return false;
        }
        String this$creditCode = this.getCreditCode();
        String other$creditCode = other.getCreditCode();
        if (this$creditCode == null ? other$creditCode != null : !this$creditCode.equals(other$creditCode)) {
            return false;
        }
        List<String> this$creditCodeList = this.getCreditCodeList();
        List<String> other$creditCodeList = other.getCreditCodeList();
        return !(this$creditCodeList == null ? other$creditCodeList != null : !((Object)this$creditCodeList).equals(other$creditCodeList));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof MerchantOpenApiQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $customerClassId = this.getCustomerClassId();
        result = result * 59 + ($customerClassId == null ? 43 : ((Object)$customerClassId).hashCode());
        Long $customerIndustryId = this.getCustomerIndustryId();
        result = result * 59 + ($customerIndustryId == null ? 43 : ((Object)$customerIndustryId).hashCode());
        Boolean $internalOrg = this.getInternalOrg();
        result = result * 59 + ($internalOrg == null ? 43 : ((Object)$internalOrg).hashCode());
        Long $suppliersId = this.getSuppliersId();
        result = result * 59 + ($suppliersId == null ? 43 : ((Object)$suppliersId).hashCode());
        Boolean $filterPotential = this.getFilterPotential();
        result = result * 59 + ($filterPotential == null ? 43 : ((Object)$filterPotential).hashCode());
        Boolean $onlyFilterPotential = this.getOnlyFilterPotential();
        result = result * 59 + ($onlyFilterPotential == null ? 43 : ((Object)$onlyFilterPotential).hashCode());
        Boolean $onlyQuerySelf = this.getOnlyQuerySelf();
        result = result * 59 + ($onlyQuerySelf == null ? 43 : ((Object)$onlyQuerySelf).hashCode());
        Boolean $createFlag = this.getCreateFlag();
        result = result * 59 + ($createFlag == null ? 43 : ((Object)$createFlag).hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getFields());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $fuzzyName = this.getFuzzyName();
        result = result * 59 + ($fuzzyName == null ? 43 : $fuzzyName.hashCode());
        String $shortname = this.getShortname();
        result = result * 59 + ($shortname == null ? 43 : $shortname.hashCode());
        String $fuzzyShortname = this.getFuzzyShortname();
        result = result * 59 + ($fuzzyShortname == null ? 43 : $fuzzyShortname.hashCode());
        String $createOrgId = this.getCreateOrgId();
        result = result * 59 + ($createOrgId == null ? 43 : $createOrgId.hashCode());
        String $createOrgCode = this.getCreateOrgCode();
        result = result * 59 + ($createOrgCode == null ? 43 : $createOrgCode.hashCode());
        List<Long> $idList = this.getIdList();
        result = result * 59 + ($idList == null ? 43 : ((Object)$idList).hashCode());
        List<String> $codeList = this.getCodeList();
        result = result * 59 + ($codeList == null ? 43 : ((Object)$codeList).hashCode());
        List<String> $createOrgIdList = this.getCreateOrgIdList();
        result = result * 59 + ($createOrgIdList == null ? 43 : ((Object)$createOrgIdList).hashCode());
        List<String> $belongOrgIdList = this.getBelongOrgIdList();
        result = result * 59 + ($belongOrgIdList == null ? 43 : ((Object)$belongOrgIdList).hashCode());
        String $customerClassCode = this.getCustomerClassCode();
        result = result * 59 + ($customerClassCode == null ? 43 : $customerClassCode.hashCode());
        List<Long> $customerClassIdList = this.getCustomerClassIdList();
        result = result * 59 + ($customerClassIdList == null ? 43 : ((Object)$customerClassIdList).hashCode());
        List<String> $customerClassCodeList = this.getCustomerClassCodeList();
        result = result * 59 + ($customerClassCodeList == null ? 43 : ((Object)$customerClassCodeList).hashCode());
        String $customerIndustryCode = this.getCustomerIndustryCode();
        result = result * 59 + ($customerIndustryCode == null ? 43 : $customerIndustryCode.hashCode());
        String $internalOrgIdId = this.getInternalOrgIdId();
        result = result * 59 + ($internalOrgIdId == null ? 43 : $internalOrgIdId.hashCode());
        String $internalOrgIdCode = this.getInternalOrgIdCode();
        result = result * 59 + ($internalOrgIdCode == null ? 43 : $internalOrgIdCode.hashCode());
        String $suppliersCode = this.getSuppliersCode();
        result = result * 59 + ($suppliersCode == null ? 43 : $suppliersCode.hashCode());
        Date $beganTime = this.getBeganTime();
        result = result * 59 + ($beganTime == null ? 43 : ((Object)$beganTime).hashCode());
        Date $endTime = this.getEndTime();
        result = result * 59 + ($endTime == null ? 43 : ((Object)$endTime).hashCode());
        String $belongOrgId = this.getBelongOrgId();
        result = result * 59 + ($belongOrgId == null ? 43 : $belongOrgId.hashCode());
        String $belongOrgCode = this.getBelongOrgCode();
        result = result * 59 + ($belongOrgCode == null ? 43 : $belongOrgCode.hashCode());
        Date $beginTime = this.getBeginTime();
        result = result * 59 + ($beginTime == null ? 43 : ((Object)$beginTime).hashCode());
        Date $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : ((Object)$pubts).hashCode());
        String $creditCode = this.getCreditCode();
        result = result * 59 + ($creditCode == null ? 43 : $creditCode.hashCode());
        List<String> $creditCodeList = this.getCreditCodeList();
        result = result * 59 + ($creditCodeList == null ? 43 : ((Object)$creditCodeList).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MerchantOpenApiQryDTO(fields=" + Arrays.deepToString(this.getFields()) + ", id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", fuzzyName=" + this.getFuzzyName() + ", shortname=" + this.getShortname() + ", fuzzyShortname=" + this.getFuzzyShortname() + ", createOrgId=" + this.getCreateOrgId() + ", createOrgCode=" + this.getCreateOrgCode() + ", idList=" + this.getIdList() + ", codeList=" + this.getCodeList() + ", createOrgIdList=" + this.getCreateOrgIdList() + ", belongOrgIdList=" + this.getBelongOrgIdList() + ", customerClassId=" + this.getCustomerClassId() + ", customerClassCode=" + this.getCustomerClassCode() + ", customerClassIdList=" + this.getCustomerClassIdList() + ", customerClassCodeList=" + this.getCustomerClassCodeList() + ", customerIndustryId=" + this.getCustomerIndustryId() + ", customerIndustryCode=" + this.getCustomerIndustryCode() + ", internalOrg=" + this.getInternalOrg() + ", internalOrgIdId=" + this.getInternalOrgIdId() + ", internalOrgIdCode=" + this.getInternalOrgIdCode() + ", suppliersId=" + this.getSuppliersId() + ", suppliersCode=" + this.getSuppliersCode() + ", beganTime=" + this.getBeganTime() + ", endTime=" + this.getEndTime() + ", belongOrgId=" + this.getBelongOrgId() + ", belongOrgCode=" + this.getBelongOrgCode() + ", filterPotential=" + this.getFilterPotential() + ", onlyFilterPotential=" + this.getOnlyFilterPotential() + ", onlyQuerySelf=" + this.getOnlyQuerySelf() + ", createFlag=" + this.getCreateFlag() + ", beginTime=" + this.getBeginTime() + ", pubts=" + this.getPubts() + ", creditCode=" + this.getCreditCode() + ", creditCodeList=" + this.getCreditCodeList() + ")";
    }
}

