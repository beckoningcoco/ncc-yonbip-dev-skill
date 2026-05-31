/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.international.MultiLangText
 */
package com.yonyou.iuap.doc.check.dto;

import com.yonyou.iuap.international.MultiLangText;

public class CheckResultData {
    private String bizObjCode;
    private String fullName;
    private String attrName;
    private String id;
    private String code;
    private MultiLangText name;

    public String getBizObjCode() {
        return this.bizObjCode;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getAttrName() {
        return this.attrName;
    }

    public String getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public MultiLangText getName() {
        return this.name;
    }

    public void setBizObjCode(String bizObjCode) {
        this.bizObjCode = bizObjCode;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(MultiLangText name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CheckResultData)) {
            return false;
        }
        CheckResultData other = (CheckResultData)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$bizObjCode = this.getBizObjCode();
        String other$bizObjCode = other.getBizObjCode();
        if (this$bizObjCode == null ? other$bizObjCode != null : !this$bizObjCode.equals(other$bizObjCode)) {
            return false;
        }
        String this$fullName = this.getFullName();
        String other$fullName = other.getFullName();
        if (this$fullName == null ? other$fullName != null : !this$fullName.equals(other$fullName)) {
            return false;
        }
        String this$attrName = this.getAttrName();
        String other$attrName = other.getAttrName();
        if (this$attrName == null ? other$attrName != null : !this$attrName.equals(other$attrName)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        MultiLangText this$name = this.getName();
        MultiLangText other$name = other.getName();
        return !(this$name == null ? other$name != null : !this$name.equals(other$name));
    }

    protected boolean canEqual(Object other) {
        return other instanceof CheckResultData;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $bizObjCode = this.getBizObjCode();
        result = result * 59 + ($bizObjCode == null ? 43 : $bizObjCode.hashCode());
        String $fullName = this.getFullName();
        result = result * 59 + ($fullName == null ? 43 : $fullName.hashCode());
        String $attrName = this.getAttrName();
        result = result * 59 + ($attrName == null ? 43 : $attrName.hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        MultiLangText $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    public String toString() {
        return "CheckResultData(bizObjCode=" + this.getBizObjCode() + ", fullName=" + this.getFullName() + ", attrName=" + this.getAttrName() + ", id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ")";
    }
}

