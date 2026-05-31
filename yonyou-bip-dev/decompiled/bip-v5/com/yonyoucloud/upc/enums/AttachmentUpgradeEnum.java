/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.enums;

public enum AttachmentUpgradeEnum {
    ATTACHMENT_GROUP("attachmentGroup", "ATTACHMENT_GROUP"),
    ATTACHMENT_GROUP_BIND_PRODUCT("attachmentGroup", "ATTACHMENT_GROUP_BIND_PRODUCT"),
    ATTACHMENT_GROUP_BIND_MERCHANT("attachmentGroup", "ATTACHMENT_GROUP_BIND_MERCHANT"),
    PRODUCT_ALL_IMAGE("productalbum", "PRODUCT_ALL_IMAGE"),
    PRODUCT_HOME_PAGE_IMAGE("productalbum", "PRODUCT_HOME_PAGE_IMAGE"),
    PRODUCT_VIDEO("productattachment", "PRODUCT_VIDEO"),
    PRODUCT_ATTACHMENT("productattachment", "PRODUCT_ATTACHMENT"),
    PRODUCT_SPEC_IMAGE("productspecitemalbum", "PRODUCT_SPEC_IMAGE"),
    PRESENTATION_CLASS_IMAGE("product_presentation_class", "PRESENTATION_CLASS_IMAGE"),
    TAG_IMAGE("tag", "TAG_IMAGE"),
    BRAND_IMAGE("brand", "BRAND_IMAGE"),
    MERCHANT_MAIN_IMAGE("merchant", "MERCHANT_MAIN_IMAGE"),
    MERCHANT_CERTIFICATE("merchantcorpimagealbum", "MERCHANT_CERTIFICATE"),
    MERCHANT_ATTACHMENT("merchantattachment", "MERCHANT_ATTACHMENT"),
    PRODUCT_APPLY("productapply", "PRODUCT_APPLY"),
    MERCHANT_APPLY("customerapply", "MERCHANT_APPLY"),
    PRODUCT_APPLY_UNIQUE("productApplyUnique", "PRODUCT_APPLY_UNIQUE");

    private String originTableName;
    private String attachmentBusinessType;

    private AttachmentUpgradeEnum(String originTableName, String attachmentBusinessType) {
        this.originTableName = originTableName;
        this.attachmentBusinessType = attachmentBusinessType;
    }

    public String getOriginTableName() {
        return this.originTableName;
    }

    public void setOriginTableName(String originTableName) {
        this.originTableName = originTableName;
    }

    public String getAttachmentBusinessType() {
        return this.attachmentBusinessType;
    }

    public void setAttachmentBusinessType(String attachmentBusinessType) {
        this.attachmentBusinessType = attachmentBusinessType;
    }
}

