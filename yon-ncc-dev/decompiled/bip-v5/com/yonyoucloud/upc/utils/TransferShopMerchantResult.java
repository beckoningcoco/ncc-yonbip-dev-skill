/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.upc.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.upc.utils.TransferDetailErrorShopMerchant;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class TransferShopMerchantResult {
    private int totalCount;
    private int count;
    private int successCount;
    private int failCount;
    private List<TransferDetailErrorShopMerchant> errorList;

    public int getTotalCount() {
        return this.totalCount;
    }

    public int getCount() {
        return this.count;
    }

    public int getSuccessCount() {
        return this.successCount;
    }

    public int getFailCount() {
        return this.failCount;
    }

    public List<TransferDetailErrorShopMerchant> getErrorList() {
        return this.errorList;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setSuccessCount(int successCount) {
        this.successCount = successCount;
    }

    public void setFailCount(int failCount) {
        this.failCount = failCount;
    }

    public void setErrorList(List<TransferDetailErrorShopMerchant> errorList) {
        this.errorList = errorList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TransferShopMerchantResult)) {
            return false;
        }
        TransferShopMerchantResult other = (TransferShopMerchantResult)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getTotalCount() != other.getTotalCount()) {
            return false;
        }
        if (this.getCount() != other.getCount()) {
            return false;
        }
        if (this.getSuccessCount() != other.getSuccessCount()) {
            return false;
        }
        if (this.getFailCount() != other.getFailCount()) {
            return false;
        }
        List<TransferDetailErrorShopMerchant> this$errorList = this.getErrorList();
        List<TransferDetailErrorShopMerchant> other$errorList = other.getErrorList();
        return !(this$errorList == null ? other$errorList != null : !((Object)this$errorList).equals(other$errorList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof TransferShopMerchantResult;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getTotalCount();
        result = result * 59 + this.getCount();
        result = result * 59 + this.getSuccessCount();
        result = result * 59 + this.getFailCount();
        List<TransferDetailErrorShopMerchant> $errorList = this.getErrorList();
        result = result * 59 + ($errorList == null ? 43 : ((Object)$errorList).hashCode());
        return result;
    }

    public String toString() {
        return "TransferShopMerchantResult(totalCount=" + this.getTotalCount() + ", count=" + this.getCount() + ", successCount=" + this.getSuccessCount() + ", failCount=" + this.getFailCount() + ", errorList=" + this.getErrorList() + ")";
    }
}

