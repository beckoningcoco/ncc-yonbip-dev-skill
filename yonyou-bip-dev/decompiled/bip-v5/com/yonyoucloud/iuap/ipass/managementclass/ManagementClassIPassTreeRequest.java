/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.managementclass;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import java.io.Serializable;
import java.util.Date;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ManagementClassIPassTreeRequest
extends UPCPager
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String code;
    private String orgId;
    private String orgCode;
    private Date beginTime;
    private Date endTime;
    private String sourceUnique;

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public Date getBeginTime() {
        return this.beginTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public String getSourceUnique() {
        return this.sourceUnique;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setSourceUnique(String sourceUnique) {
        this.sourceUnique = sourceUnique;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ManagementClassIPassTreeRequest)) {
            return false;
        }
        ManagementClassIPassTreeRequest other = (ManagementClassIPassTreeRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$orgCode = this.getOrgCode();
        String other$orgCode = other.getOrgCode();
        if (this$orgCode == null ? other$orgCode != null : !this$orgCode.equals(other$orgCode)) {
            return false;
        }
        Date this$beginTime = this.getBeginTime();
        Date other$beginTime = other.getBeginTime();
        if (this$beginTime == null ? other$beginTime != null : !((Object)this$beginTime).equals(other$beginTime)) {
            return false;
        }
        Date this$endTime = this.getEndTime();
        Date other$endTime = other.getEndTime();
        if (this$endTime == null ? other$endTime != null : !((Object)this$endTime).equals(other$endTime)) {
            return false;
        }
        String this$sourceUnique = this.getSourceUnique();
        String other$sourceUnique = other.getSourceUnique();
        return !(this$sourceUnique == null ? other$sourceUnique != null : !this$sourceUnique.equals(other$sourceUnique));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof ManagementClassIPassTreeRequest;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $orgCode = this.getOrgCode();
        result = result * 59 + ($orgCode == null ? 43 : $orgCode.hashCode());
        Date $beginTime = this.getBeginTime();
        result = result * 59 + ($beginTime == null ? 43 : ((Object)$beginTime).hashCode());
        Date $endTime = this.getEndTime();
        result = result * 59 + ($endTime == null ? 43 : ((Object)$endTime).hashCode());
        String $sourceUnique = this.getSourceUnique();
        result = result * 59 + ($sourceUnique == null ? 43 : $sourceUnique.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ManagementClassIPassTreeRequest(name=" + this.getName() + ", code=" + this.getCode() + ", orgId=" + this.getOrgId() + ", orgCode=" + this.getOrgCode() + ", beginTime=" + this.getBeginTime() + ", endTime=" + this.getEndTime() + ", sourceUnique=" + this.getSourceUnique() + ")";
    }
}

