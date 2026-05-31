/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.international.MultiLangText
 */
package com.yonyou.iuap.bizdoc.service.model;

import com.yonyou.iuap.international.MultiLangText;

public class BaseDaoModel {
    protected Long id;
    @Deprecated
    protected String name;
    @Deprecated
    protected String name2;
    @Deprecated
    protected String name3;
    protected String code;
    protected Long tenantId;
    protected String ytenantId;
    protected MultiLangText name_multiLangText;

    public Long getId() {
        return this.id;
    }

    @Deprecated
    public String getName() {
        return this.name;
    }

    @Deprecated
    public String getName2() {
        return this.name2;
    }

    @Deprecated
    public String getName3() {
        return this.name3;
    }

    public String getCode() {
        return this.code;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public String getYtenantId() {
        return this.ytenantId;
    }

    public MultiLangText getName_multiLangText() {
        return this.name_multiLangText;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Deprecated
    public void setName(String name) {
        this.name = name;
    }

    @Deprecated
    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Deprecated
    public void setName3(String name3) {
        this.name3 = name3;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public void setYtenantId(String ytenantId) {
        this.ytenantId = ytenantId;
    }

    public void setName_multiLangText(MultiLangText name_multiLangText) {
        this.name_multiLangText = name_multiLangText;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BaseDaoModel)) {
            return false;
        }
        BaseDaoModel other = (BaseDaoModel)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$tenantId = this.getTenantId();
        Long other$tenantId = other.getTenantId();
        if (this$tenantId == null ? other$tenantId != null : !((Object)this$tenantId).equals(other$tenantId)) {
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
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$ytenantId = this.getYtenantId();
        String other$ytenantId = other.getYtenantId();
        if (this$ytenantId == null ? other$ytenantId != null : !this$ytenantId.equals(other$ytenantId)) {
            return false;
        }
        MultiLangText this$name_multiLangText = this.getName_multiLangText();
        MultiLangText other$name_multiLangText = other.getName_multiLangText();
        return !(this$name_multiLangText == null ? other$name_multiLangText != null : !this$name_multiLangText.equals(other$name_multiLangText));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseDaoModel;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $tenantId = this.getTenantId();
        result = result * 59 + ($tenantId == null ? 43 : ((Object)$tenantId).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $name2 = this.getName2();
        result = result * 59 + ($name2 == null ? 43 : $name2.hashCode());
        String $name3 = this.getName3();
        result = result * 59 + ($name3 == null ? 43 : $name3.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $ytenantId = this.getYtenantId();
        result = result * 59 + ($ytenantId == null ? 43 : $ytenantId.hashCode());
        MultiLangText $name_multiLangText = this.getName_multiLangText();
        result = result * 59 + ($name_multiLangText == null ? 43 : $name_multiLangText.hashCode());
        return result;
    }

    public String toString() {
        return "BaseDaoModel(id=" + this.getId() + ", name=" + this.getName() + ", name2=" + this.getName2() + ", name3=" + this.getName3() + ", code=" + this.getCode() + ", tenantId=" + this.getTenantId() + ", ytenantId=" + this.getYtenantId() + ", name_multiLangText=" + this.getName_multiLangText() + ")";
    }
}

