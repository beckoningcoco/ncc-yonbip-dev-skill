/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductIPassQueryRequest
extends UPCPager
implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<String> productCodeList;
    private List<String> productNameList;
    private List<String> managerClassIdList;
    private List<String> managerClassCodeList;
    private List<String> productClassIdList;
    private List<String> productClassCodeList;
    private String productTemplate;
    private String modelDescription;
    private String model;
    private Date beginTime;
    private Date endTime;
    private Boolean custom_queryDetailData;
    private Map<String, Object> productCharacterDef;
    private Boolean stopStatus;

    public List<String> getProductCodeList() {
        return this.productCodeList;
    }

    public List<String> getProductNameList() {
        return this.productNameList;
    }

    public List<String> getManagerClassIdList() {
        return this.managerClassIdList;
    }

    public List<String> getManagerClassCodeList() {
        return this.managerClassCodeList;
    }

    public List<String> getProductClassIdList() {
        return this.productClassIdList;
    }

    public List<String> getProductClassCodeList() {
        return this.productClassCodeList;
    }

    public String getProductTemplate() {
        return this.productTemplate;
    }

    public String getModelDescription() {
        return this.modelDescription;
    }

    public String getModel() {
        return this.model;
    }

    public Date getBeginTime() {
        return this.beginTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public Boolean getCustom_queryDetailData() {
        return this.custom_queryDetailData;
    }

    public Map<String, Object> getProductCharacterDef() {
        return this.productCharacterDef;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public void setProductCodeList(List<String> productCodeList) {
        this.productCodeList = productCodeList;
    }

    public void setProductNameList(List<String> productNameList) {
        this.productNameList = productNameList;
    }

    public void setManagerClassIdList(List<String> managerClassIdList) {
        this.managerClassIdList = managerClassIdList;
    }

    public void setManagerClassCodeList(List<String> managerClassCodeList) {
        this.managerClassCodeList = managerClassCodeList;
    }

    public void setProductClassIdList(List<String> productClassIdList) {
        this.productClassIdList = productClassIdList;
    }

    public void setProductClassCodeList(List<String> productClassCodeList) {
        this.productClassCodeList = productClassCodeList;
    }

    public void setProductTemplate(String productTemplate) {
        this.productTemplate = productTemplate;
    }

    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setCustom_queryDetailData(Boolean custom_queryDetailData) {
        this.custom_queryDetailData = custom_queryDetailData;
    }

    public void setProductCharacterDef(Map<String, Object> productCharacterDef) {
        this.productCharacterDef = productCharacterDef;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductIPassQueryRequest)) {
            return false;
        }
        ProductIPassQueryRequest other = (ProductIPassQueryRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$custom_queryDetailData = this.getCustom_queryDetailData();
        Boolean other$custom_queryDetailData = other.getCustom_queryDetailData();
        if (this$custom_queryDetailData == null ? other$custom_queryDetailData != null : !((Object)this$custom_queryDetailData).equals(other$custom_queryDetailData)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        List<String> this$productCodeList = this.getProductCodeList();
        List<String> other$productCodeList = other.getProductCodeList();
        if (this$productCodeList == null ? other$productCodeList != null : !((Object)this$productCodeList).equals(other$productCodeList)) {
            return false;
        }
        List<String> this$productNameList = this.getProductNameList();
        List<String> other$productNameList = other.getProductNameList();
        if (this$productNameList == null ? other$productNameList != null : !((Object)this$productNameList).equals(other$productNameList)) {
            return false;
        }
        List<String> this$managerClassIdList = this.getManagerClassIdList();
        List<String> other$managerClassIdList = other.getManagerClassIdList();
        if (this$managerClassIdList == null ? other$managerClassIdList != null : !((Object)this$managerClassIdList).equals(other$managerClassIdList)) {
            return false;
        }
        List<String> this$managerClassCodeList = this.getManagerClassCodeList();
        List<String> other$managerClassCodeList = other.getManagerClassCodeList();
        if (this$managerClassCodeList == null ? other$managerClassCodeList != null : !((Object)this$managerClassCodeList).equals(other$managerClassCodeList)) {
            return false;
        }
        List<String> this$productClassIdList = this.getProductClassIdList();
        List<String> other$productClassIdList = other.getProductClassIdList();
        if (this$productClassIdList == null ? other$productClassIdList != null : !((Object)this$productClassIdList).equals(other$productClassIdList)) {
            return false;
        }
        List<String> this$productClassCodeList = this.getProductClassCodeList();
        List<String> other$productClassCodeList = other.getProductClassCodeList();
        if (this$productClassCodeList == null ? other$productClassCodeList != null : !((Object)this$productClassCodeList).equals(other$productClassCodeList)) {
            return false;
        }
        String this$productTemplate = this.getProductTemplate();
        String other$productTemplate = other.getProductTemplate();
        if (this$productTemplate == null ? other$productTemplate != null : !this$productTemplate.equals(other$productTemplate)) {
            return false;
        }
        String this$modelDescription = this.getModelDescription();
        String other$modelDescription = other.getModelDescription();
        if (this$modelDescription == null ? other$modelDescription != null : !this$modelDescription.equals(other$modelDescription)) {
            return false;
        }
        String this$model = this.getModel();
        String other$model = other.getModel();
        if (this$model == null ? other$model != null : !this$model.equals(other$model)) {
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
        Map<String, Object> this$productCharacterDef = this.getProductCharacterDef();
        Map<String, Object> other$productCharacterDef = other.getProductCharacterDef();
        return !(this$productCharacterDef == null ? other$productCharacterDef != null : !((Object)this$productCharacterDef).equals(other$productCharacterDef));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof ProductIPassQueryRequest;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $custom_queryDetailData = this.getCustom_queryDetailData();
        result = result * 59 + ($custom_queryDetailData == null ? 43 : ((Object)$custom_queryDetailData).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        List<String> $productCodeList = this.getProductCodeList();
        result = result * 59 + ($productCodeList == null ? 43 : ((Object)$productCodeList).hashCode());
        List<String> $productNameList = this.getProductNameList();
        result = result * 59 + ($productNameList == null ? 43 : ((Object)$productNameList).hashCode());
        List<String> $managerClassIdList = this.getManagerClassIdList();
        result = result * 59 + ($managerClassIdList == null ? 43 : ((Object)$managerClassIdList).hashCode());
        List<String> $managerClassCodeList = this.getManagerClassCodeList();
        result = result * 59 + ($managerClassCodeList == null ? 43 : ((Object)$managerClassCodeList).hashCode());
        List<String> $productClassIdList = this.getProductClassIdList();
        result = result * 59 + ($productClassIdList == null ? 43 : ((Object)$productClassIdList).hashCode());
        List<String> $productClassCodeList = this.getProductClassCodeList();
        result = result * 59 + ($productClassCodeList == null ? 43 : ((Object)$productClassCodeList).hashCode());
        String $productTemplate = this.getProductTemplate();
        result = result * 59 + ($productTemplate == null ? 43 : $productTemplate.hashCode());
        String $modelDescription = this.getModelDescription();
        result = result * 59 + ($modelDescription == null ? 43 : $modelDescription.hashCode());
        String $model = this.getModel();
        result = result * 59 + ($model == null ? 43 : $model.hashCode());
        Date $beginTime = this.getBeginTime();
        result = result * 59 + ($beginTime == null ? 43 : ((Object)$beginTime).hashCode());
        Date $endTime = this.getEndTime();
        result = result * 59 + ($endTime == null ? 43 : ((Object)$endTime).hashCode());
        Map<String, Object> $productCharacterDef = this.getProductCharacterDef();
        result = result * 59 + ($productCharacterDef == null ? 43 : ((Object)$productCharacterDef).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ProductIPassQueryRequest(productCodeList=" + this.getProductCodeList() + ", productNameList=" + this.getProductNameList() + ", managerClassIdList=" + this.getManagerClassIdList() + ", managerClassCodeList=" + this.getManagerClassCodeList() + ", productClassIdList=" + this.getProductClassIdList() + ", productClassCodeList=" + this.getProductClassCodeList() + ", productTemplate=" + this.getProductTemplate() + ", modelDescription=" + this.getModelDescription() + ", model=" + this.getModel() + ", beginTime=" + this.getBeginTime() + ", endTime=" + this.getEndTime() + ", custom_queryDetailData=" + this.getCustom_queryDetailData() + ", productCharacterDef=" + this.getProductCharacterDef() + ", stopStatus=" + this.getStopStatus() + ")";
    }
}

