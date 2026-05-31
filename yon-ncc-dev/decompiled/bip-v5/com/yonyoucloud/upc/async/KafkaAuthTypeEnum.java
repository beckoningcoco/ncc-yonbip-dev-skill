/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package com.yonyoucloud.upc.async;

import org.apache.commons.lang3.StringUtils;

public enum KafkaAuthTypeEnum {
    plain,
    scram,
    scram_ssl,
    ssl;


    public static KafkaAuthTypeEnum safeValueOf(String name) {
        if (StringUtils.isEmpty((CharSequence)name)) {
            return null;
        }
        try {
            return KafkaAuthTypeEnum.valueOf(name.toLowerCase());
        }
        catch (Throwable e) {
            return null;
        }
    }
}

