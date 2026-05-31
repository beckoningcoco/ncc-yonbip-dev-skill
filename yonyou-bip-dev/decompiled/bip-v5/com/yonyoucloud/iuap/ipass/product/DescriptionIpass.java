/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class DescriptionIpass
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String description;
    private String mobileDescription;

    public String getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public String getMobileDescription() {
        return this.mobileDescription;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMobileDescription(String mobileDescription) {
        this.mobileDescription = mobileDescription;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DescriptionIpass)) {
            return false;
        }
        DescriptionIpass other = (DescriptionIpass)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$description = this.getDescription();
        String other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) {
            return false;
        }
        String this$mobileDescription = this.getMobileDescription();
        String other$mobileDescription = other.getMobileDescription();
        return !(this$mobileDescription == null ? other$mobileDescription != null : !this$mobileDescription.equals(other$mobileDescription));
    }

    protected boolean canEqual(Object other) {
        return other instanceof DescriptionIpass;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        String $mobileDescription = this.getMobileDescription();
        result = result * 59 + ($mobileDescription == null ? 43 : $mobileDescription.hashCode());
        return result;
    }

    public String toString() {
        return "DescriptionIpass(id=" + this.getId() + ", description=" + this.getDescription() + ", mobileDescription=" + this.getMobileDescription() + ")";
    }
}

