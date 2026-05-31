/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.HashSet;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class BusinessPartnerInfoQryDTO
implements Serializable {
    private Object id;
    private String code;
    private String name;
    private String creditCode;
    private String linkObject;
    private String partnerId;
    private HashSet<String> changeFieldNameSet;

    public Object getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getCreditCode() {
        return this.creditCode;
    }

    public String getLinkObject() {
        return this.linkObject;
    }

    public String getPartnerId() {
        return this.partnerId;
    }

    public HashSet<String> getChangeFieldNameSet() {
        return this.changeFieldNameSet;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public void setLinkObject(String linkObject) {
        this.linkObject = linkObject;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public void setChangeFieldNameSet(HashSet<String> changeFieldNameSet) {
        this.changeFieldNameSet = changeFieldNameSet;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BusinessPartnerInfoQryDTO)) {
            return false;
        }
        BusinessPartnerInfoQryDTO other = (BusinessPartnerInfoQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Object this$id = this.getId();
        Object other$id = other.getId();
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
        String this$creditCode = this.getCreditCode();
        String other$creditCode = other.getCreditCode();
        if (this$creditCode == null ? other$creditCode != null : !this$creditCode.equals(other$creditCode)) {
            return false;
        }
        String this$linkObject = this.getLinkObject();
        String other$linkObject = other.getLinkObject();
        if (this$linkObject == null ? other$linkObject != null : !this$linkObject.equals(other$linkObject)) {
            return false;
        }
        String this$partnerId = this.getPartnerId();
        String other$partnerId = other.getPartnerId();
        if (this$partnerId == null ? other$partnerId != null : !this$partnerId.equals(other$partnerId)) {
            return false;
        }
        HashSet<String> this$changeFieldNameSet = this.getChangeFieldNameSet();
        HashSet<String> other$changeFieldNameSet = other.getChangeFieldNameSet();
        return !(this$changeFieldNameSet == null ? other$changeFieldNameSet != null : !((Object)this$changeFieldNameSet).equals(other$changeFieldNameSet));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BusinessPartnerInfoQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $creditCode = this.getCreditCode();
        result = result * 59 + ($creditCode == null ? 43 : $creditCode.hashCode());
        String $linkObject = this.getLinkObject();
        result = result * 59 + ($linkObject == null ? 43 : $linkObject.hashCode());
        String $partnerId = this.getPartnerId();
        result = result * 59 + ($partnerId == null ? 43 : $partnerId.hashCode());
        HashSet<String> $changeFieldNameSet = this.getChangeFieldNameSet();
        result = result * 59 + ($changeFieldNameSet == null ? 43 : ((Object)$changeFieldNameSet).hashCode());
        return result;
    }

    public String toString() {
        return "BusinessPartnerInfoQryDTO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", creditCode=" + this.getCreditCode() + ", linkObject=" + this.getLinkObject() + ", partnerId=" + this.getPartnerId() + ", changeFieldNameSet=" + this.getChangeFieldNameSet() + ")";
    }
}

