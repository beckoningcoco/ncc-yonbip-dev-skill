/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.customerTrade;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class BatchCustomertradeIPassSaveRequest
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String code;
    private String name;
    private String name_en_US;
    private String name_zh_TW;
    private Long order;
    private String parent;
    private String parent_code;
    private Boolean stopstatus;
    private String _status;
    private String sourceUnique;

    public String getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getName_en_US() {
        return this.name_en_US;
    }

    public String getName_zh_TW() {
        return this.name_zh_TW;
    }

    public Long getOrder() {
        return this.order;
    }

    public String getParent() {
        return this.parent;
    }

    public String getParent_code() {
        return this.parent_code;
    }

    public Boolean getStopstatus() {
        return this.stopstatus;
    }

    public String get_status() {
        return this._status;
    }

    public String getSourceUnique() {
        return this.sourceUnique;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName_en_US(String name_en_US) {
        this.name_en_US = name_en_US;
    }

    public void setName_zh_TW(String name_zh_TW) {
        this.name_zh_TW = name_zh_TW;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public void setParent_code(String parent_code) {
        this.parent_code = parent_code;
    }

    public void setStopstatus(Boolean stopstatus) {
        this.stopstatus = stopstatus;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public void setSourceUnique(String sourceUnique) {
        this.sourceUnique = sourceUnique;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BatchCustomertradeIPassSaveRequest)) {
            return false;
        }
        BatchCustomertradeIPassSaveRequest other = (BatchCustomertradeIPassSaveRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$order = this.getOrder();
        Long other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        Boolean this$stopstatus = this.getStopstatus();
        Boolean other$stopstatus = other.getStopstatus();
        if (this$stopstatus == null ? other$stopstatus != null : !((Object)this$stopstatus).equals(other$stopstatus)) {
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
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$name_en_US = this.getName_en_US();
        String other$name_en_US = other.getName_en_US();
        if (this$name_en_US == null ? other$name_en_US != null : !this$name_en_US.equals(other$name_en_US)) {
            return false;
        }
        String this$name_zh_TW = this.getName_zh_TW();
        String other$name_zh_TW = other.getName_zh_TW();
        if (this$name_zh_TW == null ? other$name_zh_TW != null : !this$name_zh_TW.equals(other$name_zh_TW)) {
            return false;
        }
        String this$parent = this.getParent();
        String other$parent = other.getParent();
        if (this$parent == null ? other$parent != null : !this$parent.equals(other$parent)) {
            return false;
        }
        String this$parent_code = this.getParent_code();
        String other$parent_code = other.getParent_code();
        if (this$parent_code == null ? other$parent_code != null : !this$parent_code.equals(other$parent_code)) {
            return false;
        }
        String this$_status = this.get_status();
        String other$_status = other.get_status();
        if (this$_status == null ? other$_status != null : !this$_status.equals(other$_status)) {
            return false;
        }
        String this$sourceUnique = this.getSourceUnique();
        String other$sourceUnique = other.getSourceUnique();
        return !(this$sourceUnique == null ? other$sourceUnique != null : !this$sourceUnique.equals(other$sourceUnique));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BatchCustomertradeIPassSaveRequest;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        Boolean $stopstatus = this.getStopstatus();
        result = result * 59 + ($stopstatus == null ? 43 : ((Object)$stopstatus).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $name_en_US = this.getName_en_US();
        result = result * 59 + ($name_en_US == null ? 43 : $name_en_US.hashCode());
        String $name_zh_TW = this.getName_zh_TW();
        result = result * 59 + ($name_zh_TW == null ? 43 : $name_zh_TW.hashCode());
        String $parent = this.getParent();
        result = result * 59 + ($parent == null ? 43 : $parent.hashCode());
        String $parent_code = this.getParent_code();
        result = result * 59 + ($parent_code == null ? 43 : $parent_code.hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        String $sourceUnique = this.getSourceUnique();
        result = result * 59 + ($sourceUnique == null ? 43 : $sourceUnique.hashCode());
        return result;
    }

    public String toString() {
        return "BatchCustomertradeIPassSaveRequest(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", name_en_US=" + this.getName_en_US() + ", name_zh_TW=" + this.getName_zh_TW() + ", order=" + this.getOrder() + ", parent=" + this.getParent() + ", parent_code=" + this.getParent_code() + ", stopstatus=" + this.getStopstatus() + ", _status=" + this.get_status() + ", sourceUnique=" + this.getSourceUnique() + ")";
    }
}

