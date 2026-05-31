/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.context.InvocationInfoProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MultilingualVO {
    private static final Logger log = LoggerFactory.getLogger(MultilingualVO.class);
    private String simplifiedName;
    private String englishName;
    private String traditionalName;

    public String toString() {
        String currentLocale = InvocationInfoProxy.getLocale();
        String defaultLocale = InvocationInfoProxy.getDefaultLocale();
        if (this.isNull(currentLocale) || this.isNull(defaultLocale)) {
            this.doInvocationCheck();
        }
        String text = null;
        if (currentLocale != null) {
            text = this.getText(currentLocale);
        }
        if ((text == null || text.isEmpty()) && defaultLocale != null) {
            text = this.getText(defaultLocale);
        }
        if (text == null || text.isEmpty()) {
            text = this.simplifiedName;
        }
        return text;
    }

    private String getText(String langCode) {
        if ("zh_CN".equalsIgnoreCase(langCode)) {
            return this.simplifiedName;
        }
        if ("zh_EN".equalsIgnoreCase(langCode)) {
            return this.englishName;
        }
        if ("zh_TW".equalsIgnoreCase(langCode)) {
            return this.traditionalName;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MultilingualVO) {
            MultilingualVO text = (MultilingualVO)obj;
            return this.isEquals(this.simplifiedName, text.getSimplifiedName()) && this.isEquals(this.englishName, text.getEnglishName()) && this.isEquals(this.traditionalName, text.getTraditionalName());
        }
        return false;
    }

    private boolean isEquals(String srcStr, String targetStr) {
        if (StringUtils.hasLength((String)srcStr) && StringUtils.hasLength((String)targetStr)) {
            return srcStr.equals(targetStr);
        }
        return !StringUtils.hasLength((String)srcStr) && !StringUtils.hasLength((String)targetStr);
    }

    private boolean isNull(String str) {
        return str == null || str.trim().isEmpty() || "null".equals(str);
    }

    private void doInvocationCheck() {
        String tenantId = InvocationInfoProxy.getTenantid();
        if (tenantId != null) {
            String userId = InvocationInfoProxy.getUserid();
            String yhtAccessToken = InvocationInfoProxy.getYhtAccessToken();
            String locale = InvocationInfoProxy.getLocale();
            String defaultLocale = InvocationInfoProxy.getDefaultLocale();
            String languages = InvocationInfoProxy.getLanguages();
            if (this.isNull(locale) || this.isNull(defaultLocale) || this.isNull(languages)) {
                String message = "\u5f53\u524d\u4e0a\u4e0b\u6587\u4e2d\u8bed\u79cd\u4fe1\u606f\u4e0d\u5168(Locale\u3001DefaultLocale\u3001Languages\u4e0d\u80fd\u4e3a\u7a7a)\uff0c\u53ef\u80fd\u662f\u751f\u6210\u767b\u5f55token\u65f6\u672a\u8bbe\u7f6e\u591a\u8bed\u4e0a\u4e0b\u6587\u3002\u8bf7\u68c0\u67e5token\u6765\u6e90\uff0c\u5c06\u4e0a\u4e0b\u6587\u8865\u5145\u5b8c\u6574! \u8865\u5168\u8fc7\u7a0b\u53ef\u53c2\u8003wiki: https://gfwiki.yyrd.com/pages/viewpage.action?pageId=12152992 \n\u8be6\u7ec6\u4fe1\u606f:\n[\u5f53\u524dyhtAccessToken]:[%s],[\u5f53\u524d\u79df\u6237]:[%s],[\u5f53\u524d\u7528\u6237]:[%s],\n\u5f02\u5e38\u591a\u8bed\u4e0a\u4e0b\u6587:\n    [InvocationInfoProxy.getLocale()]=[%s],\n    [InvocationInfoProxy.getDefaultLocale()]=[%s],\n    [InvocationInfoProxy.getLanguages()]=[%s]";
                log.error("\u68c0\u6d4b\u5230\u4e0a\u4e0b\u6587\u9519\u8bef,\u8bf7\u786e\u8ba4token\u6765\u6e90,\u6309\u67b6\u6784\u90e8\u89c4\u8303\u4fee\u590d!", (Throwable)new IllegalStateException(String.format(message, yhtAccessToken, tenantId, userId, locale, defaultLocale, languages)));
            }
        }
    }

    public String getSimplifiedName() {
        return this.simplifiedName;
    }

    public String getEnglishName() {
        return this.englishName;
    }

    public String getTraditionalName() {
        return this.traditionalName;
    }

    public void setSimplifiedName(String simplifiedName) {
        this.simplifiedName = simplifiedName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public void setTraditionalName(String traditionalName) {
        this.traditionalName = traditionalName;
    }
}

