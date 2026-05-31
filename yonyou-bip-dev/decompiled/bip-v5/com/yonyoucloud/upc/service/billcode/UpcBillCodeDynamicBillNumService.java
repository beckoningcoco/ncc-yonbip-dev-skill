/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.uap.billcode.service.IBillCodeDynamicBillNum
 *  org.apache.commons.lang3.StringUtils
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.billcode;

import com.yonyou.uap.billcode.service.IBillCodeDynamicBillNum;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class UpcBillCodeDynamicBillNumService
implements IBillCodeDynamicBillNum {
    private static final HashMap<String, String> BILL_NUM_MAP = new HashMap();

    public String converBillNum(String cardKey, String billNum, Map<String, Object> extendInfo) {
        String billNumString;
        String returnBillNum = cardKey;
        if (!StringUtils.isEmpty((CharSequence)billNum) && !StringUtils.isEmpty((CharSequence)cardKey) && this.matchPrefix(billNumString = billNum + "#" + cardKey) != null) {
            returnBillNum = this.matchPrefix(billNumString);
        }
        return returnBillNum;
    }

    private String matchPrefix(String input) {
        for (String prefix : BILL_NUM_MAP.keySet()) {
            if (!input.startsWith(prefix)) continue;
            return BILL_NUM_MAP.get(prefix);
        }
        return null;
    }

    static {
        BILL_NUM_MAP.put("aa_merchantexport#aa_merchant", "aa_merchant");
        BILL_NUM_MAP.put("pc_productdetail#pc_productdetail", "pc_product");
        BILL_NUM_MAP.put("pc_productdetail_import#pc_productdetail_import", "pc_product");
    }
}

