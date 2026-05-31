/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.international.MultiLangText
 */
package com.yonyou.iuap.apdoc.sdk.dto.busidoc;

import com.yonyou.iuap.international.MultiLangText;
import java.util.Date;

public class LoadWayRpcDTO {
    private Long productId;
    private Long loadWayId;
    private String code;
    private MultiLangText name;
    private String defineCharacter;
    private Boolean stopstatus;
    private Date stoptime;
    private String erpCode;

    public Long getProductId() {
        return this.productId;
    }

    public Long getLoadWayId() {
        return this.loadWayId;
    }

    public String getCode() {
        return this.code;
    }

    public MultiLangText getName() {
        return this.name;
    }

    public String getDefineCharacter() {
        return this.defineCharacter;
    }

    public Boolean getStopstatus() {
        return this.stopstatus;
    }

    public Date getStoptime() {
        return this.stoptime;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setLoadWayId(Long loadWayId) {
        this.loadWayId = loadWayId;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(MultiLangText name) {
        this.name = name;
    }

    public void setDefineCharacter(String defineCharacter) {
        this.defineCharacter = defineCharacter;
    }

    public void setStopstatus(Boolean stopstatus) {
        this.stopstatus = stopstatus;
    }

    public void setStoptime(Date stoptime) {
        this.stoptime = stoptime;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof LoadWayRpcDTO)) {
            return false;
        }
        LoadWayRpcDTO other = (LoadWayRpcDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        Long this$loadWayId = this.getLoadWayId();
        Long other$loadWayId = other.getLoadWayId();
        if (this$loadWayId == null ? other$loadWayId != null : !((Object)this$loadWayId).equals(other$loadWayId)) {
            return false;
        }
        Boolean this$stopstatus = this.getStopstatus();
        Boolean other$stopstatus = other.getStopstatus();
        if (this$stopstatus == null ? other$stopstatus != null : !((Object)this$stopstatus).equals(other$stopstatus)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        MultiLangText this$name = this.getName();
        MultiLangText other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$defineCharacter = this.getDefineCharacter();
        String other$defineCharacter = other.getDefineCharacter();
        if (this$defineCharacter == null ? other$defineCharacter != null : !this$defineCharacter.equals(other$defineCharacter)) {
            return false;
        }
        Date this$stoptime = this.getStoptime();
        Date other$stoptime = other.getStoptime();
        if (this$stoptime == null ? other$stoptime != null : !((Object)this$stoptime).equals(other$stoptime)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        return !(this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof LoadWayRpcDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Long $loadWayId = this.getLoadWayId();
        result = result * 59 + ($loadWayId == null ? 43 : ((Object)$loadWayId).hashCode());
        Boolean $stopstatus = this.getStopstatus();
        result = result * 59 + ($stopstatus == null ? 43 : ((Object)$stopstatus).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        MultiLangText $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $defineCharacter = this.getDefineCharacter();
        result = result * 59 + ($defineCharacter == null ? 43 : $defineCharacter.hashCode());
        Date $stoptime = this.getStoptime();
        result = result * 59 + ($stoptime == null ? 43 : ((Object)$stoptime).hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        return result;
    }

    public String toString() {
        return "LoadWayRpcDTO(productId=" + this.getProductId() + ", loadWayId=" + this.getLoadWayId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", defineCharacter=" + this.getDefineCharacter() + ", stopstatus=" + this.getStopstatus() + ", stoptime=" + this.getStoptime() + ", erpCode=" + this.getErpCode() + ")";
    }
}

