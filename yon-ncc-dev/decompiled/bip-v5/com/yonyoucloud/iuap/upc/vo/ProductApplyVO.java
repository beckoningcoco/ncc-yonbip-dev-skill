/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.vo.ProductApiVO;
import java.util.Date;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductApplyVO {
    private String applyCode;
    private String applyType;
    private String applyReason;
    private String applyDepartment;
    private String applyDepartmentCode;
    private String applyDepartmentName;
    private String applyDesc;
    private Map<String, Object> productApplyCharacterDef;
    private Boolean wfControlled;
    private Integer verifyState;
    private Integer returnCount;
    private Integer status;
    private ProductApiVO productData;
    private String code;
    private String name;
    private String name2;
    private String name3;
    private String name4;
    private String name5;
    private String name6;
    private String applyName;
    private String bizOperator;
    private String bizOperatorCode;
    private String bizOperatorName;
    private Date applyTime;
    private String effectType;
    private Date effectTime;
    private String effectStatus;
    private String failInfo;
    private Date productUpdateTime;
    private Integer productUpdateStatus;
    private Long applyProductId;
    private Long applyProductApplyRangeId;
    private Date createTime;
    private Date createDate;
    private Date modifyTime;
    private Date modifyDate;
    private String creator;
    private String modifier;
    private Long creatorid;
    private Long modifierid;
    private Boolean ideleted;
    private Boolean stopstatus;
    private Date stopTime;
    private String auditor;
    private Long auditorid;
    private Date auditTime;
    private Date auditDate;
    private Long tenantId;
    private Date vouchdate;
    private Long tplid;
    private Long id;
    private Date timestamp;
    private String ytenantId;
    private String productCode;
    private String applyOrg;
    private String applyOrgCode;

    public String getApplyCode() {
        return this.applyCode;
    }

    public String getApplyType() {
        return this.applyType;
    }

    public String getApplyReason() {
        return this.applyReason;
    }

    public String getApplyDepartment() {
        return this.applyDepartment;
    }

    public String getApplyDepartmentCode() {
        return this.applyDepartmentCode;
    }

    public String getApplyDepartmentName() {
        return this.applyDepartmentName;
    }

    public String getApplyDesc() {
        return this.applyDesc;
    }

    public Map<String, Object> getProductApplyCharacterDef() {
        return this.productApplyCharacterDef;
    }

    public Boolean getWfControlled() {
        return this.wfControlled;
    }

    public Integer getVerifyState() {
        return this.verifyState;
    }

    public Integer getReturnCount() {
        return this.returnCount;
    }

    public Integer getStatus() {
        return this.status;
    }

    public ProductApiVO getProductData() {
        return this.productData;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getName2() {
        return this.name2;
    }

    public String getName3() {
        return this.name3;
    }

    public String getName4() {
        return this.name4;
    }

    public String getName5() {
        return this.name5;
    }

    public String getName6() {
        return this.name6;
    }

    public String getApplyName() {
        return this.applyName;
    }

    public String getBizOperator() {
        return this.bizOperator;
    }

    public String getBizOperatorCode() {
        return this.bizOperatorCode;
    }

    public String getBizOperatorName() {
        return this.bizOperatorName;
    }

    public Date getApplyTime() {
        return this.applyTime;
    }

    public String getEffectType() {
        return this.effectType;
    }

    public Date getEffectTime() {
        return this.effectTime;
    }

    public String getEffectStatus() {
        return this.effectStatus;
    }

    public String getFailInfo() {
        return this.failInfo;
    }

    public Date getProductUpdateTime() {
        return this.productUpdateTime;
    }

    public Integer getProductUpdateStatus() {
        return this.productUpdateStatus;
    }

    public Long getApplyProductId() {
        return this.applyProductId;
    }

    public Long getApplyProductApplyRangeId() {
        return this.applyProductApplyRangeId;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public Date getModifyTime() {
        return this.modifyTime;
    }

    public Date getModifyDate() {
        return this.modifyDate;
    }

    public String getCreator() {
        return this.creator;
    }

    public String getModifier() {
        return this.modifier;
    }

    public Long getCreatorid() {
        return this.creatorid;
    }

    public Long getModifierid() {
        return this.modifierid;
    }

    public Boolean getIdeleted() {
        return this.ideleted;
    }

    public Boolean getStopstatus() {
        return this.stopstatus;
    }

    public Date getStopTime() {
        return this.stopTime;
    }

    public String getAuditor() {
        return this.auditor;
    }

    public Long getAuditorid() {
        return this.auditorid;
    }

    public Date getAuditTime() {
        return this.auditTime;
    }

    public Date getAuditDate() {
        return this.auditDate;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public Date getVouchdate() {
        return this.vouchdate;
    }

    public Long getTplid() {
        return this.tplid;
    }

    public Long getId() {
        return this.id;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public String getYtenantId() {
        return this.ytenantId;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public String getApplyOrg() {
        return this.applyOrg;
    }

    public String getApplyOrgCode() {
        return this.applyOrgCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    public void setApplyDepartment(String applyDepartment) {
        this.applyDepartment = applyDepartment;
    }

    public void setApplyDepartmentCode(String applyDepartmentCode) {
        this.applyDepartmentCode = applyDepartmentCode;
    }

    public void setApplyDepartmentName(String applyDepartmentName) {
        this.applyDepartmentName = applyDepartmentName;
    }

    public void setApplyDesc(String applyDesc) {
        this.applyDesc = applyDesc;
    }

    public void setProductApplyCharacterDef(Map<String, Object> productApplyCharacterDef) {
        this.productApplyCharacterDef = productApplyCharacterDef;
    }

    public void setWfControlled(Boolean wfControlled) {
        this.wfControlled = wfControlled;
    }

    public void setVerifyState(Integer verifyState) {
        this.verifyState = verifyState;
    }

    public void setReturnCount(Integer returnCount) {
        this.returnCount = returnCount;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setProductData(ProductApiVO productData) {
        this.productData = productData;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public void setName5(String name5) {
        this.name5 = name5;
    }

    public void setName6(String name6) {
        this.name6 = name6;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public void setBizOperator(String bizOperator) {
        this.bizOperator = bizOperator;
    }

    public void setBizOperatorCode(String bizOperatorCode) {
        this.bizOperatorCode = bizOperatorCode;
    }

    public void setBizOperatorName(String bizOperatorName) {
        this.bizOperatorName = bizOperatorName;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public void setEffectType(String effectType) {
        this.effectType = effectType;
    }

    public void setEffectTime(Date effectTime) {
        this.effectTime = effectTime;
    }

    public void setEffectStatus(String effectStatus) {
        this.effectStatus = effectStatus;
    }

    public void setFailInfo(String failInfo) {
        this.failInfo = failInfo;
    }

    public void setProductUpdateTime(Date productUpdateTime) {
        this.productUpdateTime = productUpdateTime;
    }

    public void setProductUpdateStatus(Integer productUpdateStatus) {
        this.productUpdateStatus = productUpdateStatus;
    }

    public void setApplyProductId(Long applyProductId) {
        this.applyProductId = applyProductId;
    }

    public void setApplyProductApplyRangeId(Long applyProductApplyRangeId) {
        this.applyProductApplyRangeId = applyProductApplyRangeId;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public void setCreatorid(Long creatorid) {
        this.creatorid = creatorid;
    }

    public void setModifierid(Long modifierid) {
        this.modifierid = modifierid;
    }

    public void setIdeleted(Boolean ideleted) {
        this.ideleted = ideleted;
    }

    public void setStopstatus(Boolean stopstatus) {
        this.stopstatus = stopstatus;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public void setAuditorid(Long auditorid) {
        this.auditorid = auditorid;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public void setVouchdate(Date vouchdate) {
        this.vouchdate = vouchdate;
    }

    public void setTplid(Long tplid) {
        this.tplid = tplid;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setYtenantId(String ytenantId) {
        this.ytenantId = ytenantId;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setApplyOrg(String applyOrg) {
        this.applyOrg = applyOrg;
    }

    public void setApplyOrgCode(String applyOrgCode) {
        this.applyOrgCode = applyOrgCode;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductApplyVO)) {
            return false;
        }
        ProductApplyVO other = (ProductApplyVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$wfControlled = this.getWfControlled();
        Boolean other$wfControlled = other.getWfControlled();
        if (this$wfControlled == null ? other$wfControlled != null : !((Object)this$wfControlled).equals(other$wfControlled)) {
            return false;
        }
        Integer this$verifyState = this.getVerifyState();
        Integer other$verifyState = other.getVerifyState();
        if (this$verifyState == null ? other$verifyState != null : !((Object)this$verifyState).equals(other$verifyState)) {
            return false;
        }
        Integer this$returnCount = this.getReturnCount();
        Integer other$returnCount = other.getReturnCount();
        if (this$returnCount == null ? other$returnCount != null : !((Object)this$returnCount).equals(other$returnCount)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        Integer this$productUpdateStatus = this.getProductUpdateStatus();
        Integer other$productUpdateStatus = other.getProductUpdateStatus();
        if (this$productUpdateStatus == null ? other$productUpdateStatus != null : !((Object)this$productUpdateStatus).equals(other$productUpdateStatus)) {
            return false;
        }
        Long this$applyProductId = this.getApplyProductId();
        Long other$applyProductId = other.getApplyProductId();
        if (this$applyProductId == null ? other$applyProductId != null : !((Object)this$applyProductId).equals(other$applyProductId)) {
            return false;
        }
        Long this$applyProductApplyRangeId = this.getApplyProductApplyRangeId();
        Long other$applyProductApplyRangeId = other.getApplyProductApplyRangeId();
        if (this$applyProductApplyRangeId == null ? other$applyProductApplyRangeId != null : !((Object)this$applyProductApplyRangeId).equals(other$applyProductApplyRangeId)) {
            return false;
        }
        Long this$creatorid = this.getCreatorid();
        Long other$creatorid = other.getCreatorid();
        if (this$creatorid == null ? other$creatorid != null : !((Object)this$creatorid).equals(other$creatorid)) {
            return false;
        }
        Long this$modifierid = this.getModifierid();
        Long other$modifierid = other.getModifierid();
        if (this$modifierid == null ? other$modifierid != null : !((Object)this$modifierid).equals(other$modifierid)) {
            return false;
        }
        Boolean this$ideleted = this.getIdeleted();
        Boolean other$ideleted = other.getIdeleted();
        if (this$ideleted == null ? other$ideleted != null : !((Object)this$ideleted).equals(other$ideleted)) {
            return false;
        }
        Boolean this$stopstatus = this.getStopstatus();
        Boolean other$stopstatus = other.getStopstatus();
        if (this$stopstatus == null ? other$stopstatus != null : !((Object)this$stopstatus).equals(other$stopstatus)) {
            return false;
        }
        Long this$auditorid = this.getAuditorid();
        Long other$auditorid = other.getAuditorid();
        if (this$auditorid == null ? other$auditorid != null : !((Object)this$auditorid).equals(other$auditorid)) {
            return false;
        }
        Long this$tenantId = this.getTenantId();
        Long other$tenantId = other.getTenantId();
        if (this$tenantId == null ? other$tenantId != null : !((Object)this$tenantId).equals(other$tenantId)) {
            return false;
        }
        Long this$tplid = this.getTplid();
        Long other$tplid = other.getTplid();
        if (this$tplid == null ? other$tplid != null : !((Object)this$tplid).equals(other$tplid)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        String this$applyCode = this.getApplyCode();
        String other$applyCode = other.getApplyCode();
        if (this$applyCode == null ? other$applyCode != null : !this$applyCode.equals(other$applyCode)) {
            return false;
        }
        String this$applyType = this.getApplyType();
        String other$applyType = other.getApplyType();
        if (this$applyType == null ? other$applyType != null : !this$applyType.equals(other$applyType)) {
            return false;
        }
        String this$applyReason = this.getApplyReason();
        String other$applyReason = other.getApplyReason();
        if (this$applyReason == null ? other$applyReason != null : !this$applyReason.equals(other$applyReason)) {
            return false;
        }
        String this$applyDepartment = this.getApplyDepartment();
        String other$applyDepartment = other.getApplyDepartment();
        if (this$applyDepartment == null ? other$applyDepartment != null : !this$applyDepartment.equals(other$applyDepartment)) {
            return false;
        }
        String this$applyDepartmentCode = this.getApplyDepartmentCode();
        String other$applyDepartmentCode = other.getApplyDepartmentCode();
        if (this$applyDepartmentCode == null ? other$applyDepartmentCode != null : !this$applyDepartmentCode.equals(other$applyDepartmentCode)) {
            return false;
        }
        String this$applyDepartmentName = this.getApplyDepartmentName();
        String other$applyDepartmentName = other.getApplyDepartmentName();
        if (this$applyDepartmentName == null ? other$applyDepartmentName != null : !this$applyDepartmentName.equals(other$applyDepartmentName)) {
            return false;
        }
        String this$applyDesc = this.getApplyDesc();
        String other$applyDesc = other.getApplyDesc();
        if (this$applyDesc == null ? other$applyDesc != null : !this$applyDesc.equals(other$applyDesc)) {
            return false;
        }
        Map<String, Object> this$productApplyCharacterDef = this.getProductApplyCharacterDef();
        Map<String, Object> other$productApplyCharacterDef = other.getProductApplyCharacterDef();
        if (this$productApplyCharacterDef == null ? other$productApplyCharacterDef != null : !((Object)this$productApplyCharacterDef).equals(other$productApplyCharacterDef)) {
            return false;
        }
        ProductApiVO this$productData = this.getProductData();
        ProductApiVO other$productData = other.getProductData();
        if (this$productData == null ? other$productData != null : !((Object)this$productData).equals(other$productData)) {
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
        String this$name2 = this.getName2();
        String other$name2 = other.getName2();
        if (this$name2 == null ? other$name2 != null : !this$name2.equals(other$name2)) {
            return false;
        }
        String this$name3 = this.getName3();
        String other$name3 = other.getName3();
        if (this$name3 == null ? other$name3 != null : !this$name3.equals(other$name3)) {
            return false;
        }
        String this$name4 = this.getName4();
        String other$name4 = other.getName4();
        if (this$name4 == null ? other$name4 != null : !this$name4.equals(other$name4)) {
            return false;
        }
        String this$name5 = this.getName5();
        String other$name5 = other.getName5();
        if (this$name5 == null ? other$name5 != null : !this$name5.equals(other$name5)) {
            return false;
        }
        String this$name6 = this.getName6();
        String other$name6 = other.getName6();
        if (this$name6 == null ? other$name6 != null : !this$name6.equals(other$name6)) {
            return false;
        }
        String this$applyName = this.getApplyName();
        String other$applyName = other.getApplyName();
        if (this$applyName == null ? other$applyName != null : !this$applyName.equals(other$applyName)) {
            return false;
        }
        String this$bizOperator = this.getBizOperator();
        String other$bizOperator = other.getBizOperator();
        if (this$bizOperator == null ? other$bizOperator != null : !this$bizOperator.equals(other$bizOperator)) {
            return false;
        }
        String this$bizOperatorCode = this.getBizOperatorCode();
        String other$bizOperatorCode = other.getBizOperatorCode();
        if (this$bizOperatorCode == null ? other$bizOperatorCode != null : !this$bizOperatorCode.equals(other$bizOperatorCode)) {
            return false;
        }
        String this$bizOperatorName = this.getBizOperatorName();
        String other$bizOperatorName = other.getBizOperatorName();
        if (this$bizOperatorName == null ? other$bizOperatorName != null : !this$bizOperatorName.equals(other$bizOperatorName)) {
            return false;
        }
        Date this$applyTime = this.getApplyTime();
        Date other$applyTime = other.getApplyTime();
        if (this$applyTime == null ? other$applyTime != null : !((Object)this$applyTime).equals(other$applyTime)) {
            return false;
        }
        String this$effectType = this.getEffectType();
        String other$effectType = other.getEffectType();
        if (this$effectType == null ? other$effectType != null : !this$effectType.equals(other$effectType)) {
            return false;
        }
        Date this$effectTime = this.getEffectTime();
        Date other$effectTime = other.getEffectTime();
        if (this$effectTime == null ? other$effectTime != null : !((Object)this$effectTime).equals(other$effectTime)) {
            return false;
        }
        String this$effectStatus = this.getEffectStatus();
        String other$effectStatus = other.getEffectStatus();
        if (this$effectStatus == null ? other$effectStatus != null : !this$effectStatus.equals(other$effectStatus)) {
            return false;
        }
        String this$failInfo = this.getFailInfo();
        String other$failInfo = other.getFailInfo();
        if (this$failInfo == null ? other$failInfo != null : !this$failInfo.equals(other$failInfo)) {
            return false;
        }
        Date this$productUpdateTime = this.getProductUpdateTime();
        Date other$productUpdateTime = other.getProductUpdateTime();
        if (this$productUpdateTime == null ? other$productUpdateTime != null : !((Object)this$productUpdateTime).equals(other$productUpdateTime)) {
            return false;
        }
        Date this$createTime = this.getCreateTime();
        Date other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !((Object)this$createTime).equals(other$createTime)) {
            return false;
        }
        Date this$createDate = this.getCreateDate();
        Date other$createDate = other.getCreateDate();
        if (this$createDate == null ? other$createDate != null : !((Object)this$createDate).equals(other$createDate)) {
            return false;
        }
        Date this$modifyTime = this.getModifyTime();
        Date other$modifyTime = other.getModifyTime();
        if (this$modifyTime == null ? other$modifyTime != null : !((Object)this$modifyTime).equals(other$modifyTime)) {
            return false;
        }
        Date this$modifyDate = this.getModifyDate();
        Date other$modifyDate = other.getModifyDate();
        if (this$modifyDate == null ? other$modifyDate != null : !((Object)this$modifyDate).equals(other$modifyDate)) {
            return false;
        }
        String this$creator = this.getCreator();
        String other$creator = other.getCreator();
        if (this$creator == null ? other$creator != null : !this$creator.equals(other$creator)) {
            return false;
        }
        String this$modifier = this.getModifier();
        String other$modifier = other.getModifier();
        if (this$modifier == null ? other$modifier != null : !this$modifier.equals(other$modifier)) {
            return false;
        }
        Date this$stopTime = this.getStopTime();
        Date other$stopTime = other.getStopTime();
        if (this$stopTime == null ? other$stopTime != null : !((Object)this$stopTime).equals(other$stopTime)) {
            return false;
        }
        String this$auditor = this.getAuditor();
        String other$auditor = other.getAuditor();
        if (this$auditor == null ? other$auditor != null : !this$auditor.equals(other$auditor)) {
            return false;
        }
        Date this$auditTime = this.getAuditTime();
        Date other$auditTime = other.getAuditTime();
        if (this$auditTime == null ? other$auditTime != null : !((Object)this$auditTime).equals(other$auditTime)) {
            return false;
        }
        Date this$auditDate = this.getAuditDate();
        Date other$auditDate = other.getAuditDate();
        if (this$auditDate == null ? other$auditDate != null : !((Object)this$auditDate).equals(other$auditDate)) {
            return false;
        }
        Date this$vouchdate = this.getVouchdate();
        Date other$vouchdate = other.getVouchdate();
        if (this$vouchdate == null ? other$vouchdate != null : !((Object)this$vouchdate).equals(other$vouchdate)) {
            return false;
        }
        Date this$timestamp = this.getTimestamp();
        Date other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !((Object)this$timestamp).equals(other$timestamp)) {
            return false;
        }
        String this$ytenantId = this.getYtenantId();
        String other$ytenantId = other.getYtenantId();
        if (this$ytenantId == null ? other$ytenantId != null : !this$ytenantId.equals(other$ytenantId)) {
            return false;
        }
        String this$productCode = this.getProductCode();
        String other$productCode = other.getProductCode();
        if (this$productCode == null ? other$productCode != null : !this$productCode.equals(other$productCode)) {
            return false;
        }
        String this$applyOrg = this.getApplyOrg();
        String other$applyOrg = other.getApplyOrg();
        if (this$applyOrg == null ? other$applyOrg != null : !this$applyOrg.equals(other$applyOrg)) {
            return false;
        }
        String this$applyOrgCode = this.getApplyOrgCode();
        String other$applyOrgCode = other.getApplyOrgCode();
        return !(this$applyOrgCode == null ? other$applyOrgCode != null : !this$applyOrgCode.equals(other$applyOrgCode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductApplyVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $wfControlled = this.getWfControlled();
        result = result * 59 + ($wfControlled == null ? 43 : ((Object)$wfControlled).hashCode());
        Integer $verifyState = this.getVerifyState();
        result = result * 59 + ($verifyState == null ? 43 : ((Object)$verifyState).hashCode());
        Integer $returnCount = this.getReturnCount();
        result = result * 59 + ($returnCount == null ? 43 : ((Object)$returnCount).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Integer $productUpdateStatus = this.getProductUpdateStatus();
        result = result * 59 + ($productUpdateStatus == null ? 43 : ((Object)$productUpdateStatus).hashCode());
        Long $applyProductId = this.getApplyProductId();
        result = result * 59 + ($applyProductId == null ? 43 : ((Object)$applyProductId).hashCode());
        Long $applyProductApplyRangeId = this.getApplyProductApplyRangeId();
        result = result * 59 + ($applyProductApplyRangeId == null ? 43 : ((Object)$applyProductApplyRangeId).hashCode());
        Long $creatorid = this.getCreatorid();
        result = result * 59 + ($creatorid == null ? 43 : ((Object)$creatorid).hashCode());
        Long $modifierid = this.getModifierid();
        result = result * 59 + ($modifierid == null ? 43 : ((Object)$modifierid).hashCode());
        Boolean $ideleted = this.getIdeleted();
        result = result * 59 + ($ideleted == null ? 43 : ((Object)$ideleted).hashCode());
        Boolean $stopstatus = this.getStopstatus();
        result = result * 59 + ($stopstatus == null ? 43 : ((Object)$stopstatus).hashCode());
        Long $auditorid = this.getAuditorid();
        result = result * 59 + ($auditorid == null ? 43 : ((Object)$auditorid).hashCode());
        Long $tenantId = this.getTenantId();
        result = result * 59 + ($tenantId == null ? 43 : ((Object)$tenantId).hashCode());
        Long $tplid = this.getTplid();
        result = result * 59 + ($tplid == null ? 43 : ((Object)$tplid).hashCode());
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        String $applyCode = this.getApplyCode();
        result = result * 59 + ($applyCode == null ? 43 : $applyCode.hashCode());
        String $applyType = this.getApplyType();
        result = result * 59 + ($applyType == null ? 43 : $applyType.hashCode());
        String $applyReason = this.getApplyReason();
        result = result * 59 + ($applyReason == null ? 43 : $applyReason.hashCode());
        String $applyDepartment = this.getApplyDepartment();
        result = result * 59 + ($applyDepartment == null ? 43 : $applyDepartment.hashCode());
        String $applyDepartmentCode = this.getApplyDepartmentCode();
        result = result * 59 + ($applyDepartmentCode == null ? 43 : $applyDepartmentCode.hashCode());
        String $applyDepartmentName = this.getApplyDepartmentName();
        result = result * 59 + ($applyDepartmentName == null ? 43 : $applyDepartmentName.hashCode());
        String $applyDesc = this.getApplyDesc();
        result = result * 59 + ($applyDesc == null ? 43 : $applyDesc.hashCode());
        Map<String, Object> $productApplyCharacterDef = this.getProductApplyCharacterDef();
        result = result * 59 + ($productApplyCharacterDef == null ? 43 : ((Object)$productApplyCharacterDef).hashCode());
        ProductApiVO $productData = this.getProductData();
        result = result * 59 + ($productData == null ? 43 : ((Object)$productData).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $name2 = this.getName2();
        result = result * 59 + ($name2 == null ? 43 : $name2.hashCode());
        String $name3 = this.getName3();
        result = result * 59 + ($name3 == null ? 43 : $name3.hashCode());
        String $name4 = this.getName4();
        result = result * 59 + ($name4 == null ? 43 : $name4.hashCode());
        String $name5 = this.getName5();
        result = result * 59 + ($name5 == null ? 43 : $name5.hashCode());
        String $name6 = this.getName6();
        result = result * 59 + ($name6 == null ? 43 : $name6.hashCode());
        String $applyName = this.getApplyName();
        result = result * 59 + ($applyName == null ? 43 : $applyName.hashCode());
        String $bizOperator = this.getBizOperator();
        result = result * 59 + ($bizOperator == null ? 43 : $bizOperator.hashCode());
        String $bizOperatorCode = this.getBizOperatorCode();
        result = result * 59 + ($bizOperatorCode == null ? 43 : $bizOperatorCode.hashCode());
        String $bizOperatorName = this.getBizOperatorName();
        result = result * 59 + ($bizOperatorName == null ? 43 : $bizOperatorName.hashCode());
        Date $applyTime = this.getApplyTime();
        result = result * 59 + ($applyTime == null ? 43 : ((Object)$applyTime).hashCode());
        String $effectType = this.getEffectType();
        result = result * 59 + ($effectType == null ? 43 : $effectType.hashCode());
        Date $effectTime = this.getEffectTime();
        result = result * 59 + ($effectTime == null ? 43 : ((Object)$effectTime).hashCode());
        String $effectStatus = this.getEffectStatus();
        result = result * 59 + ($effectStatus == null ? 43 : $effectStatus.hashCode());
        String $failInfo = this.getFailInfo();
        result = result * 59 + ($failInfo == null ? 43 : $failInfo.hashCode());
        Date $productUpdateTime = this.getProductUpdateTime();
        result = result * 59 + ($productUpdateTime == null ? 43 : ((Object)$productUpdateTime).hashCode());
        Date $createTime = this.getCreateTime();
        result = result * 59 + ($createTime == null ? 43 : ((Object)$createTime).hashCode());
        Date $createDate = this.getCreateDate();
        result = result * 59 + ($createDate == null ? 43 : ((Object)$createDate).hashCode());
        Date $modifyTime = this.getModifyTime();
        result = result * 59 + ($modifyTime == null ? 43 : ((Object)$modifyTime).hashCode());
        Date $modifyDate = this.getModifyDate();
        result = result * 59 + ($modifyDate == null ? 43 : ((Object)$modifyDate).hashCode());
        String $creator = this.getCreator();
        result = result * 59 + ($creator == null ? 43 : $creator.hashCode());
        String $modifier = this.getModifier();
        result = result * 59 + ($modifier == null ? 43 : $modifier.hashCode());
        Date $stopTime = this.getStopTime();
        result = result * 59 + ($stopTime == null ? 43 : ((Object)$stopTime).hashCode());
        String $auditor = this.getAuditor();
        result = result * 59 + ($auditor == null ? 43 : $auditor.hashCode());
        Date $auditTime = this.getAuditTime();
        result = result * 59 + ($auditTime == null ? 43 : ((Object)$auditTime).hashCode());
        Date $auditDate = this.getAuditDate();
        result = result * 59 + ($auditDate == null ? 43 : ((Object)$auditDate).hashCode());
        Date $vouchdate = this.getVouchdate();
        result = result * 59 + ($vouchdate == null ? 43 : ((Object)$vouchdate).hashCode());
        Date $timestamp = this.getTimestamp();
        result = result * 59 + ($timestamp == null ? 43 : ((Object)$timestamp).hashCode());
        String $ytenantId = this.getYtenantId();
        result = result * 59 + ($ytenantId == null ? 43 : $ytenantId.hashCode());
        String $productCode = this.getProductCode();
        result = result * 59 + ($productCode == null ? 43 : $productCode.hashCode());
        String $applyOrg = this.getApplyOrg();
        result = result * 59 + ($applyOrg == null ? 43 : $applyOrg.hashCode());
        String $applyOrgCode = this.getApplyOrgCode();
        result = result * 59 + ($applyOrgCode == null ? 43 : $applyOrgCode.hashCode());
        return result;
    }

    public String toString() {
        return "ProductApplyVO(applyCode=" + this.getApplyCode() + ", applyType=" + this.getApplyType() + ", applyReason=" + this.getApplyReason() + ", applyDepartment=" + this.getApplyDepartment() + ", applyDepartmentCode=" + this.getApplyDepartmentCode() + ", applyDepartmentName=" + this.getApplyDepartmentName() + ", applyDesc=" + this.getApplyDesc() + ", productApplyCharacterDef=" + this.getProductApplyCharacterDef() + ", wfControlled=" + this.getWfControlled() + ", verifyState=" + this.getVerifyState() + ", returnCount=" + this.getReturnCount() + ", status=" + this.getStatus() + ", productData=" + this.getProductData() + ", code=" + this.getCode() + ", name=" + this.getName() + ", name2=" + this.getName2() + ", name3=" + this.getName3() + ", name4=" + this.getName4() + ", name5=" + this.getName5() + ", name6=" + this.getName6() + ", applyName=" + this.getApplyName() + ", bizOperator=" + this.getBizOperator() + ", bizOperatorCode=" + this.getBizOperatorCode() + ", bizOperatorName=" + this.getBizOperatorName() + ", applyTime=" + this.getApplyTime() + ", effectType=" + this.getEffectType() + ", effectTime=" + this.getEffectTime() + ", effectStatus=" + this.getEffectStatus() + ", failInfo=" + this.getFailInfo() + ", productUpdateTime=" + this.getProductUpdateTime() + ", productUpdateStatus=" + this.getProductUpdateStatus() + ", applyProductId=" + this.getApplyProductId() + ", applyProductApplyRangeId=" + this.getApplyProductApplyRangeId() + ", createTime=" + this.getCreateTime() + ", createDate=" + this.getCreateDate() + ", modifyTime=" + this.getModifyTime() + ", modifyDate=" + this.getModifyDate() + ", creator=" + this.getCreator() + ", modifier=" + this.getModifier() + ", creatorid=" + this.getCreatorid() + ", modifierid=" + this.getModifierid() + ", ideleted=" + this.getIdeleted() + ", stopstatus=" + this.getStopstatus() + ", stopTime=" + this.getStopTime() + ", auditor=" + this.getAuditor() + ", auditorid=" + this.getAuditorid() + ", auditTime=" + this.getAuditTime() + ", auditDate=" + this.getAuditDate() + ", tenantId=" + this.getTenantId() + ", vouchdate=" + this.getVouchdate() + ", tplid=" + this.getTplid() + ", id=" + this.getId() + ", timestamp=" + this.getTimestamp() + ", ytenantId=" + this.getYtenantId() + ", productCode=" + this.getProductCode() + ", applyOrg=" + this.getApplyOrg() + ", applyOrgCode=" + this.getApplyOrgCode() + ")";
    }
}

