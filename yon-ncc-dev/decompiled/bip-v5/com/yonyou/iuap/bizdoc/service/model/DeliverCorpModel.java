/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.international.MultiLangText
 */
package com.yonyou.iuap.bizdoc.service.model;

import com.yonyou.iuap.bizdoc.service.model.BaseDaoModel;
import com.yonyou.iuap.international.MultiLangText;

public class DeliverCorpModel
extends BaseDaoModel {
    @Deprecated
    private String website;
    @Deprecated
    private String website2;
    @Deprecated
    private String website3;
    private MultiLangText website_multilangText;
    @Deprecated
    private String requestUrl;
    @Deprecated
    private String requestUrl2;
    @Deprecated
    private String requestUrl3;
    private MultiLangText requestUrl_multilangText;
    private Integer ordernum;
    private Boolean stopStatus;
    private Integer sourceType;

    @Deprecated
    public String getWebsite() {
        return this.website;
    }

    @Deprecated
    public String getWebsite2() {
        return this.website2;
    }

    @Deprecated
    public String getWebsite3() {
        return this.website3;
    }

    public MultiLangText getWebsite_multilangText() {
        return this.website_multilangText;
    }

    @Deprecated
    public String getRequestUrl() {
        return this.requestUrl;
    }

    @Deprecated
    public String getRequestUrl2() {
        return this.requestUrl2;
    }

    @Deprecated
    public String getRequestUrl3() {
        return this.requestUrl3;
    }

    public MultiLangText getRequestUrl_multilangText() {
        return this.requestUrl_multilangText;
    }

    public Integer getOrdernum() {
        return this.ordernum;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public Integer getSourceType() {
        return this.sourceType;
    }

    @Deprecated
    public void setWebsite(String website) {
        this.website = website;
    }

    @Deprecated
    public void setWebsite2(String website2) {
        this.website2 = website2;
    }

    @Deprecated
    public void setWebsite3(String website3) {
        this.website3 = website3;
    }

    public void setWebsite_multilangText(MultiLangText website_multilangText) {
        this.website_multilangText = website_multilangText;
    }

    @Deprecated
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    @Deprecated
    public void setRequestUrl2(String requestUrl2) {
        this.requestUrl2 = requestUrl2;
    }

    @Deprecated
    public void setRequestUrl3(String requestUrl3) {
        this.requestUrl3 = requestUrl3;
    }

    public void setRequestUrl_multilangText(MultiLangText requestUrl_multilangText) {
        this.requestUrl_multilangText = requestUrl_multilangText;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DeliverCorpModel)) {
            return false;
        }
        DeliverCorpModel other = (DeliverCorpModel)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$ordernum = this.getOrdernum();
        Integer other$ordernum = other.getOrdernum();
        if (this$ordernum == null ? other$ordernum != null : !((Object)this$ordernum).equals(other$ordernum)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        Integer this$sourceType = this.getSourceType();
        Integer other$sourceType = other.getSourceType();
        if (this$sourceType == null ? other$sourceType != null : !((Object)this$sourceType).equals(other$sourceType)) {
            return false;
        }
        String this$website = this.getWebsite();
        String other$website = other.getWebsite();
        if (this$website == null ? other$website != null : !this$website.equals(other$website)) {
            return false;
        }
        String this$website2 = this.getWebsite2();
        String other$website2 = other.getWebsite2();
        if (this$website2 == null ? other$website2 != null : !this$website2.equals(other$website2)) {
            return false;
        }
        String this$website3 = this.getWebsite3();
        String other$website3 = other.getWebsite3();
        if (this$website3 == null ? other$website3 != null : !this$website3.equals(other$website3)) {
            return false;
        }
        MultiLangText this$website_multilangText = this.getWebsite_multilangText();
        MultiLangText other$website_multilangText = other.getWebsite_multilangText();
        if (this$website_multilangText == null ? other$website_multilangText != null : !this$website_multilangText.equals(other$website_multilangText)) {
            return false;
        }
        String this$requestUrl = this.getRequestUrl();
        String other$requestUrl = other.getRequestUrl();
        if (this$requestUrl == null ? other$requestUrl != null : !this$requestUrl.equals(other$requestUrl)) {
            return false;
        }
        String this$requestUrl2 = this.getRequestUrl2();
        String other$requestUrl2 = other.getRequestUrl2();
        if (this$requestUrl2 == null ? other$requestUrl2 != null : !this$requestUrl2.equals(other$requestUrl2)) {
            return false;
        }
        String this$requestUrl3 = this.getRequestUrl3();
        String other$requestUrl3 = other.getRequestUrl3();
        if (this$requestUrl3 == null ? other$requestUrl3 != null : !this$requestUrl3.equals(other$requestUrl3)) {
            return false;
        }
        MultiLangText this$requestUrl_multilangText = this.getRequestUrl_multilangText();
        MultiLangText other$requestUrl_multilangText = other.getRequestUrl_multilangText();
        return !(this$requestUrl_multilangText == null ? other$requestUrl_multilangText != null : !this$requestUrl_multilangText.equals(other$requestUrl_multilangText));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof DeliverCorpModel;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $ordernum = this.getOrdernum();
        result = result * 59 + ($ordernum == null ? 43 : ((Object)$ordernum).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Integer $sourceType = this.getSourceType();
        result = result * 59 + ($sourceType == null ? 43 : ((Object)$sourceType).hashCode());
        String $website = this.getWebsite();
        result = result * 59 + ($website == null ? 43 : $website.hashCode());
        String $website2 = this.getWebsite2();
        result = result * 59 + ($website2 == null ? 43 : $website2.hashCode());
        String $website3 = this.getWebsite3();
        result = result * 59 + ($website3 == null ? 43 : $website3.hashCode());
        MultiLangText $website_multilangText = this.getWebsite_multilangText();
        result = result * 59 + ($website_multilangText == null ? 43 : $website_multilangText.hashCode());
        String $requestUrl = this.getRequestUrl();
        result = result * 59 + ($requestUrl == null ? 43 : $requestUrl.hashCode());
        String $requestUrl2 = this.getRequestUrl2();
        result = result * 59 + ($requestUrl2 == null ? 43 : $requestUrl2.hashCode());
        String $requestUrl3 = this.getRequestUrl3();
        result = result * 59 + ($requestUrl3 == null ? 43 : $requestUrl3.hashCode());
        MultiLangText $requestUrl_multilangText = this.getRequestUrl_multilangText();
        result = result * 59 + ($requestUrl_multilangText == null ? 43 : $requestUrl_multilangText.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "DeliverCorpModel(website=" + this.getWebsite() + ", website2=" + this.getWebsite2() + ", website3=" + this.getWebsite3() + ", website_multilangText=" + this.getWebsite_multilangText() + ", requestUrl=" + this.getRequestUrl() + ", requestUrl2=" + this.getRequestUrl2() + ", requestUrl3=" + this.getRequestUrl3() + ", requestUrl_multilangText=" + this.getRequestUrl_multilangText() + ", ordernum=" + this.getOrdernum() + ", stopStatus=" + this.getStopStatus() + ", sourceType=" + this.getSourceType() + ")";
    }
}

