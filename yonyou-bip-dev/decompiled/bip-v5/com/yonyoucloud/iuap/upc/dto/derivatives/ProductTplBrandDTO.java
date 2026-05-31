/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.derivatives;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductTplBrandDTO
implements Serializable {
    private Long id;
    private Long brand;
    private Long productTplTemp;
    private String productTplTempName;
    private String _status;

    public Long getId() {
        return this.id;
    }

    public Long getBrand() {
        return this.brand;
    }

    public Long getProductTplTemp() {
        return this.productTplTemp;
    }

    public String getProductTplTempName() {
        return this.productTplTempName;
    }

    public String get_status() {
        return this._status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBrand(Long brand) {
        this.brand = brand;
    }

    public void setProductTplTemp(Long productTplTemp) {
        this.productTplTemp = productTplTemp;
    }

    public void setProductTplTempName(String productTplTempName) {
        this.productTplTempName = productTplTempName;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductTplBrandDTO)) {
            return false;
        }
        ProductTplBrandDTO other = (ProductTplBrandDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$brand = this.getBrand();
        Long other$brand = other.getBrand();
        if (this$brand == null ? other$brand != null : !((Object)this$brand).equals(other$brand)) {
            return false;
        }
        Long this$productTplTemp = this.getProductTplTemp();
        Long other$productTplTemp = other.getProductTplTemp();
        if (this$productTplTemp == null ? other$productTplTemp != null : !((Object)this$productTplTemp).equals(other$productTplTemp)) {
            return false;
        }
        String this$productTplTempName = this.getProductTplTempName();
        String other$productTplTempName = other.getProductTplTempName();
        if (this$productTplTempName == null ? other$productTplTempName != null : !this$productTplTempName.equals(other$productTplTempName)) {
            return false;
        }
        String this$_status = this.get_status();
        String other$_status = other.get_status();
        return !(this$_status == null ? other$_status != null : !this$_status.equals(other$_status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductTplBrandDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $brand = this.getBrand();
        result = result * 59 + ($brand == null ? 43 : ((Object)$brand).hashCode());
        Long $productTplTemp = this.getProductTplTemp();
        result = result * 59 + ($productTplTemp == null ? 43 : ((Object)$productTplTemp).hashCode());
        String $productTplTempName = this.getProductTplTempName();
        result = result * 59 + ($productTplTempName == null ? 43 : $productTplTempName.hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        return result;
    }

    public String toString() {
        return "ProductTplBrandDTO(id=" + this.getId() + ", brand=" + this.getBrand() + ", productTplTemp=" + this.getProductTplTemp() + ", productTplTempName=" + this.getProductTplTempName() + ", _status=" + this.get_status() + ")";
    }
}

