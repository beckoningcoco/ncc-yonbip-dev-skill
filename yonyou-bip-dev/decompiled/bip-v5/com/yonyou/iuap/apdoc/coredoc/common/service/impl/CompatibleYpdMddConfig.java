/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.springframework.stereotype.Component
 */
package com.yonyou.iuap.apdoc.coredoc.common.service.impl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class CompatibleYpdMddConfig {
    private static final String refCodesStr = "aa_reasonref,aa_sendtranswayref,base_loadwayref,base_shipregionref";
    private static Set<String> ynfAllRefCodes = new HashSet<String>();

    public boolean compatibleYpdRefer(String refCode) {
        if (refCode == null) {
            return false;
        }
        String[] drefCode = refCode.split("\\.");
        refCode = drefCode.length > 1 ? drefCode[1] : drefCode[0];
        return ynfAllRefCodes.contains(refCode);
    }

    static {
        ynfAllRefCodes.addAll(Arrays.asList(refCodesStr.split(",")));
    }
}

