/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.MessageUtils
 */
package com.yonyoucloud.upc.utils;

import com.yonyou.iuap.ucf.common.i18n.MessageUtils;

public enum AttachmentBusinessTypeEnum {
    PRODUCT_IMAGE("product_image", MessageUtils.getMessage((String)"P_YS_PF_PROCENTER_1694855513112576069")),
    PRODUCT_ALL_IMAGE("product_all_image", MessageUtils.getMessage((String)"P_YS_PF_PROCENTER_1694855513112576069")),
    PRODUCT_HOME_PAGE_IMAGE("product_home_page_image", MessageUtils.getMessage((String)"P_YS_PF_PROCENTER_1694855513112576066")),
    PRODUCT_VIDEO("product_video", MessageUtils.getMessage((String)"P_YS_PF_PC-UI_0001295519")),
    PRODUCT_ATTACHMENT("product_attachment", MessageUtils.getMessage((String)"P_YS_PF_PC-UI_0000160519")),
    PRESENTATION_CLASS_AD_IMAGE("presentation_class_ad_image", MessageUtils.getMessage((String)"P_YS_PF_PROCENTER_1694855513112576027")),
    PRESENTATION_CLASS_IMAGE("presentation_class_image", MessageUtils.getMessage((String)"P_YS_SD_SD-REPORT_1668818845857480887")),
    TAG_IMAGE("tag_image", MessageUtils.getMessage((String)"P_YS_SD_SDMAF_0000136262")),
    BRAND_LOGO_IMAGE("brand_logo_image", MessageUtils.getMessage((String)"P_YS_PF_PROCENTER_1694855513112576036")),
    BRAND_AD_IMAGE("brand_ad_image", MessageUtils.getMessage((String)"P_YS_PF_PROCENTER_1694855513112576063")),
    MERCHANT_LOGO_IMAGE("merchant_logo_image", MessageUtils.getMessage((String)"P_YS_PF_PROCENTER_1694855513112576054")),
    MERCHANT_BUSINESS_LICENSE("merchant_business_license", MessageUtils.getMessage((String)"P_YS_PF_PROCENTER_1694855513112576039")),
    MERCHANT_LEGAL_PERSON_CERTIFICATE_FRONT("merchant_legal_person_certificate_front", MessageUtils.getMessage((String)"P_YS_PF_PROCENTER_1694855513112576015")),
    MERCHANT_LEGAL_PERSON_CERTIFICATE_BACK("merchant_legal_person_certificate_back", MessageUtils.getMessage((String)"P_YS_PF_PROCENTER_1694855513112576078")),
    MERCHANT_CERTIFICATE("merchant_certificate", MessageUtils.getMessage((String)"P_YS_PF_PROCENTER_1694855513112576075")),
    MERCHANT_ORG_CERTIFICATE("merchant_org_certificate", "\u5ba2\u6237\u7ec4\u7ec7\u9644\u4ef6"),
    MERCHANT_ATTACHMENT("merchant_attachment", MessageUtils.getMessage((String)"P_YS_PF_PROCENTER_1694855513112576096"));

    private String businessTypeCode;
    private String businessTypeName;

    private AttachmentBusinessTypeEnum(String businessTypeCode, String businessTypeName) {
        this.businessTypeCode = businessTypeCode;
        this.businessTypeName = businessTypeName;
    }

    public String getBusinessTypeCode() {
        return this.businessTypeCode;
    }

    public void setBusinessTypeCode(String businessTypeCode) {
        this.businessTypeCode = businessTypeCode;
    }

    public String getBusinessTypeName() {
        return this.businessTypeName;
    }

    public void setBusinessTypeName(String businessTypeName) {
        this.businessTypeName = businessTypeName;
    }
}

