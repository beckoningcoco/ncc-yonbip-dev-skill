/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.upc.merge.model;

import com.yonyou.iuap.upc.merge.model.CheckStatusEnum;
import com.yonyou.iuap.upc.merge.model.CheckTypeEnum;

public class MergeResult {
    private String serviceCode;
    private CheckTypeEnum CheckTypeEnum;
    private String checkStandard;
    private String checkItem;
    private CheckStatusEnum status;
    private String result;
    private String suggestion;
    private String url;

    public String getServiceCode() {
        return this.serviceCode;
    }

    public CheckTypeEnum getCheckTypeEnum() {
        return this.CheckTypeEnum;
    }

    public String getCheckStandard() {
        return this.checkStandard;
    }

    public String getCheckItem() {
        return this.checkItem;
    }

    public CheckStatusEnum getStatus() {
        return this.status;
    }

    public String getResult() {
        return this.result;
    }

    public String getSuggestion() {
        return this.suggestion;
    }

    public String getUrl() {
        return this.url;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public void setCheckTypeEnum(CheckTypeEnum CheckTypeEnum2) {
        this.CheckTypeEnum = CheckTypeEnum2;
    }

    public void setCheckStandard(String checkStandard) {
        this.checkStandard = checkStandard;
    }

    public void setCheckItem(String checkItem) {
        this.checkItem = checkItem;
    }

    public void setStatus(CheckStatusEnum status) {
        this.status = status;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MergeResult)) {
            return false;
        }
        MergeResult other = (MergeResult)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$serviceCode = this.getServiceCode();
        String other$serviceCode = other.getServiceCode();
        if (this$serviceCode == null ? other$serviceCode != null : !this$serviceCode.equals(other$serviceCode)) {
            return false;
        }
        CheckTypeEnum this$CheckTypeEnum = this.getCheckTypeEnum();
        CheckTypeEnum other$CheckTypeEnum = other.getCheckTypeEnum();
        if (this$CheckTypeEnum == null ? other$CheckTypeEnum != null : !((Object)((Object)this$CheckTypeEnum)).equals((Object)other$CheckTypeEnum)) {
            return false;
        }
        String this$checkStandard = this.getCheckStandard();
        String other$checkStandard = other.getCheckStandard();
        if (this$checkStandard == null ? other$checkStandard != null : !this$checkStandard.equals(other$checkStandard)) {
            return false;
        }
        String this$checkItem = this.getCheckItem();
        String other$checkItem = other.getCheckItem();
        if (this$checkItem == null ? other$checkItem != null : !this$checkItem.equals(other$checkItem)) {
            return false;
        }
        CheckStatusEnum this$status = this.getStatus();
        CheckStatusEnum other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)((Object)this$status)).equals((Object)other$status)) {
            return false;
        }
        String this$result = this.getResult();
        String other$result = other.getResult();
        if (this$result == null ? other$result != null : !this$result.equals(other$result)) {
            return false;
        }
        String this$suggestion = this.getSuggestion();
        String other$suggestion = other.getSuggestion();
        if (this$suggestion == null ? other$suggestion != null : !this$suggestion.equals(other$suggestion)) {
            return false;
        }
        String this$url = this.getUrl();
        String other$url = other.getUrl();
        return !(this$url == null ? other$url != null : !this$url.equals(other$url));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MergeResult;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $serviceCode = this.getServiceCode();
        result = result * 59 + ($serviceCode == null ? 43 : $serviceCode.hashCode());
        CheckTypeEnum $CheckTypeEnum = this.getCheckTypeEnum();
        result = result * 59 + ($CheckTypeEnum == null ? 43 : ((Object)((Object)$CheckTypeEnum)).hashCode());
        String $checkStandard = this.getCheckStandard();
        result = result * 59 + ($checkStandard == null ? 43 : $checkStandard.hashCode());
        String $checkItem = this.getCheckItem();
        result = result * 59 + ($checkItem == null ? 43 : $checkItem.hashCode());
        CheckStatusEnum $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)((Object)$status)).hashCode());
        String $result = this.getResult();
        result = result * 59 + ($result == null ? 43 : $result.hashCode());
        String $suggestion = this.getSuggestion();
        result = result * 59 + ($suggestion == null ? 43 : $suggestion.hashCode());
        String $url = this.getUrl();
        result = result * 59 + ($url == null ? 43 : $url.hashCode());
        return result;
    }

    public String toString() {
        return "MergeResult(serviceCode=" + this.getServiceCode() + ", CheckTypeEnum=" + (Object)((Object)this.getCheckTypeEnum()) + ", checkStandard=" + this.getCheckStandard() + ", checkItem=" + this.getCheckItem() + ", status=" + (Object)((Object)this.getStatus()) + ", result=" + this.getResult() + ", suggestion=" + this.getSuggestion() + ", url=" + this.getUrl() + ")";
    }
}

