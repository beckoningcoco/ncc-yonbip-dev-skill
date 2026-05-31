/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.biz.ucfbase.ucfbaseItf.IYTenant
 *  com.yonyou.ucf.mdd.ext.base.itf.IAuditInfo
 *  com.yonyou.ucf.mdd.ext.base.itf.ITenant
 *  org.imeta.orm.base.BizObject
 */
package com.yonyoucloud.upc.service.operationalTools;

import com.yonyou.ucf.mdd.biz.ucfbase.ucfbaseItf.IYTenant;
import com.yonyou.ucf.mdd.ext.base.itf.IAuditInfo;
import com.yonyou.ucf.mdd.ext.base.itf.ITenant;
import java.util.Date;
import org.imeta.orm.base.BizObject;

public class BillDeleteForceConfig
extends BizObject
implements IAuditInfo,
ITenant,
IYTenant {
    public static final String ENTITY_NAME = "coredoc.pub.BillDeleteForceConfig";

    public String getAnalyzeKey() {
        return (String)this.get("analyzeKey");
    }

    public void setAnalyzeKey(String analyzeKey) {
        this.set("analyzeKey", analyzeKey);
    }

    public String getCExtProps() {
        return (String)this.get("cExtProps");
    }

    public void setCExtProps(String cExtProps) {
        this.set("cExtProps", cExtProps);
    }

    public Date getCreateDate() {
        return (Date)this.get("createDate");
    }

    public void setCreateDate(Date createDate) {
        this.set("createDate", createDate);
    }

    public Date getCreateTime() {
        return (Date)this.get("createTime");
    }

    public void setCreateTime(Date createTime) {
        this.set("createTime", createTime);
    }

    public String getCreator() {
        return (String)this.get("creator");
    }

    public void setCreator(String creator) {
        this.set("creator", creator);
    }

    public Long getCreatorId() {
        return (Long)this.get("creatorId");
    }

    public void setCreatorId(Long creatorId) {
        this.set("creatorId", creatorId);
    }

    public String getDomain() {
        return (String)this.get("domain");
    }

    public void setDomain(String domain) {
        this.set("domain", domain);
    }

    public String getExternalField() {
        return (String)this.get("externalField");
    }

    public void setExternalField(String externalField) {
        this.set("externalField", externalField);
    }

    public String getFullname() {
        return (String)this.get("fullname");
    }

    public void setFullname(String fullname) {
        this.set("fullname", fullname);
    }

    public Integer getIsMain() {
        return (Integer)this.get("isMain");
    }

    public void setIsMain(Integer isMain) {
        this.set("isMain", isMain);
    }

    public String getMicroServiceCode() {
        return (String)this.get("microServiceCode");
    }

    public void setMicroServiceCode(String microServiceCode) {
        this.set("microServiceCode", microServiceCode);
    }

    public String getModifier() {
        return (String)this.get("modifier");
    }

    public void setModifier(String modifier) {
        this.set("modifier", modifier);
    }

    public Long getModifierId() {
        return (Long)this.get("modifierId");
    }

    public void setModifierId(Long modifierId) {
        this.set("modifierId", modifierId);
    }

    public Date getModifyDate() {
        return (Date)this.get("modifyDate");
    }

    public void setModifyDate(Date modifyDate) {
        this.set("modifyDate", modifyDate);
    }

    public Date getModifyTime() {
        return (Date)this.get("modifyTime");
    }

    public void setModifyTime(Date modifyTime) {
        this.set("modifyTime", modifyTime);
    }

    public Long getParentId() {
        return (Long)this.get("parentId");
    }

    public void setParentId(Long parentId) {
        this.set("parentId", parentId);
    }

    public Date getPubts() {
        return (Date)this.get("pubts");
    }

    public void setPubts(Date pubts) {
        this.set("pubts", pubts);
    }

    public String getTablename() {
        return (String)this.get("tablename");
    }

    public void setTablename(String tablename) {
        this.set("tablename", tablename);
    }

    public String getRootentity() {
        return (String)this.get("rootentity");
    }

    public void setRootentity(String rootentity) {
        this.set("rootentity", rootentity);
    }

    public Long getTenant() {
        return (Long)this.get("tenant");
    }

    public void setTenant(Long tenant) {
        this.set("tenant", tenant);
    }

    public String getYTenant() {
        return (String)this.get("ytenant");
    }

    public void setYTenant(String ytenant) {
        this.set("ytenant", ytenant);
    }

    public String getFieldMapping() {
        return (String)this.get("fieldMapping");
    }

    public void setFieldMapping(String fieldMapping) {
        this.set("fieldMapping", fieldMapping);
    }

    public boolean getLongIdType() {
        return (Boolean)this.get("longIdType");
    }

    public void setLongIdType(boolean longIdType) {
        this.set("longIdType", longIdType);
    }
}

