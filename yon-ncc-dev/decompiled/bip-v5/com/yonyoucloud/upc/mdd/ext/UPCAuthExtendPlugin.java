/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.plugins.auth.AuthBillExtendPlugin
 *  javax.servlet.http.HttpServletRequest
 *  org.apache.commons.lang3.StringUtils
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.mdd.ext;

import com.yonyou.ucf.mdd.plugins.auth.AuthBillExtendPlugin;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class UPCAuthExtendPlugin
implements AuthBillExtendPlugin {
    private static final HashMap<String, String> prefixAuthMap = new HashMap();

    public Set<String> getIgnoreAuthBillNoSet() {
        return new HashSet<String>(){
            {
                this.add("batch_modiflist");
                this.add("batch_modif_import");
                this.add("batch_modif");
                this.add("aa_billdeleteforcelist");
                this.add("aa_billdeleteforce");
            }
        };
    }

    public Set<String> getCommonCommandSet() {
        return new HashSet<String>(){};
    }

    public String getAuthIdBySpUrl(String billNo, String url, HttpServletRequest request) {
        String returnAuthId = this.matchPrefix(url);
        if (prefixAuthMap.containsKey(returnAuthId)) {
            String parentBillNum = request.getParameter("parentBillNum");
            returnAuthId = StringUtils.isNotBlank((CharSequence)parentBillNum) ? "pc_productapply" : "pc_product";
        }
        return returnAuthId;
    }

    public int order() {
        return 0;
    }

    private String matchPrefix(String input) {
        for (String prefix : prefixAuthMap.keySet()) {
            if (!input.startsWith(prefix)) continue;
            return prefixAuthMap.get(prefix);
        }
        return null;
    }

    static {
        prefixAuthMap.put("/api/product/tpl/data", "pc_product");
    }
}

