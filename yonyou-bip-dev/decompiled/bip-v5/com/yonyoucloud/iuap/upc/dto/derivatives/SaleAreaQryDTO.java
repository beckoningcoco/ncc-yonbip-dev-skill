/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.derivatives;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.apdoc.sdk.dto.pub.BaseQueryVO;
import java.io.Serializable;
import java.util.Date;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class SaleAreaQryDTO
extends BaseQueryVO
implements Serializable {
    private Long id;
    private String code;
    private String name;
    private Long parent;
    private String leftPath;
    private String orgId;
    private Date beganTime;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Long getParent() {
        return this.parent;
    }

    public String getLeftPath() {
        return this.leftPath;
    }

    @Override
    public String getOrgId() {
        return this.orgId;
    }

    public Date getBeganTime() {
        return this.beganTime;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public void setLeftPath(String leftPath) {
        this.leftPath = leftPath;
    }

    @Override
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setBeganTime(Date beganTime) {
        this.beganTime = beganTime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SaleAreaQryDTO)) {
            return false;
        }
        SaleAreaQryDTO other = (SaleAreaQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$parent = this.getParent();
        Long other$parent = other.getParent();
        if (this$parent == null ? other$parent != null : !((Object)this$parent).equals(other$parent)) {
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
        String this$leftPath = this.getLeftPath();
        String other$leftPath = other.getLeftPath();
        if (this$leftPath == null ? other$leftPath != null : !this$leftPath.equals(other$leftPath)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        Date this$beganTime = this.getBeganTime();
        Date other$beganTime = other.getBeganTime();
        return !(this$beganTime == null ? other$beganTime != null : !((Object)this$beganTime).equals(other$beganTime));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof SaleAreaQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $parent = this.getParent();
        result = result * 59 + ($parent == null ? 43 : ((Object)$parent).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $leftPath = this.getLeftPath();
        result = result * 59 + ($leftPath == null ? 43 : $leftPath.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        Date $beganTime = this.getBeganTime();
        result = result * 59 + ($beganTime == null ? 43 : ((Object)$beganTime).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "SaleAreaQryDTO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", parent=" + this.getParent() + ", leftPath=" + this.getLeftPath() + ", orgId=" + this.getOrgId() + ", beganTime=" + this.getBeganTime() + ")";
    }
}

