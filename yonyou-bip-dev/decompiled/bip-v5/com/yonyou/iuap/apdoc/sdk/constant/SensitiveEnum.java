/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.MessageUtils
 */
package com.yonyou.iuap.apdoc.sdk.constant;

import com.yonyou.iuap.ucf.common.i18n.MessageUtils;

public enum SensitiveEnum {
    SKUSENS(MessageUtils.getMessage((String)"P_YS_PF_PROCENTER_0001593096"), 0, "skuSens"),
    BATCHSENS(MessageUtils.getMessage((String)"P_YS_PF_PRODUCTCENTER-MD_0001586491"), 1, "batchSens"),
    SNSENS(MessageUtils.getMessage((String)"P_YS_PF_PRODUCTCENTER-MD_0001586492"), 2, "SNSens"),
    STOCKSENS(MessageUtils.getMessage((String)"P_YS_PF_PROCENTER_0001660495"), 3, "stockSens"),
    COSTAFFEC(MessageUtils.getMessage((String)"P_YS_PF_PRODUCTCENTER-MD_0001586494"), 4, "costAffec"),
    BOMAFFEC(MessageUtils.getMessage((String)"P_YS_PF_PRODUCTCENTER-MD_0001586495"), 5, "BOMAffec"),
    MANUAFFEC(MessageUtils.getMessage((String)"P_YS_PF_PRODUCTCENTER-MD_0001586496"), 6, "manuAffec"),
    PRICEAFFEC(MessageUtils.getMessage((String)"P_YS_PF_PROCENTER_0001593097"), 7, "PriceAffec");

    private String name;
    private Integer value;
    private String code;

    private SensitiveEnum(String name, Integer value, String code) {
        this.name = name;
        this.value = value;
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public Integer getValue() {
        return this.value;
    }

    public String getCode() {
        return this.code;
    }
}

