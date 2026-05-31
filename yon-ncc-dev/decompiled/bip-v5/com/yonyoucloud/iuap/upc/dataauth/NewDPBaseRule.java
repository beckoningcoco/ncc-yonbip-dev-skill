/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyoucloud.uretail.sys.auth.CustomAuthExtContent
 *  com.yonyoucloud.uretail.sys.auth.CustomAuthRuleResponse
 *  com.yonyoucloud.uretail.sys.itf.custom.ICustomVersionAuthReferRpcZoneService
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.yonyoucloud.iuap.upc.dataauth;

import com.yonyoucloud.uretail.sys.auth.CustomAuthExtContent;
import com.yonyoucloud.uretail.sys.auth.CustomAuthRuleResponse;
import com.yonyoucloud.uretail.sys.itf.custom.ICustomVersionAuthReferRpcZoneService;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class NewDPBaseRule
implements ICustomVersionAuthReferRpcZoneService {
    private static final Logger log = LoggerFactory.getLogger(NewDPBaseRule.class);

    public CustomAuthRuleResponse getValues(CustomAuthExtContent content) throws Exception {
        CustomAuthRuleResponse customAuthRuleResponse = new CustomAuthRuleResponse();
        customAuthRuleResponse.setiSuccess(Boolean.valueOf(true));
        customAuthRuleResponse.setVersion(new Date());
        long start = System.currentTimeMillis();
        int size = 0;
        try {
            Map param = content.getParam();
            if (param == null) {
                log.error("\u6570\u636e\u6743\u9650\u670d\u52a1\u8c03\u7528\u89c4\u5219\u7c7b\uff1a{} \u53c2\u6570\u4e3a\u7a7a", (Object)this.getClass().getName());
                customAuthRuleResponse.setValues(new HashSet(0));
            } else {
                StringBuilder paramInfo = new StringBuilder(128);
                for (Map.Entry entry : param.entrySet()) {
                    paramInfo.append("\u53c2\u6570 ").append((String)entry.getKey()).append(" ");
                    if (entry.getValue() instanceof Collection) {
                        paramInfo.append("\u6761\u6570\u4e3a ");
                        paramInfo.append(((Collection)entry.getValue()).size());
                        paramInfo.append(" ");
                        continue;
                    }
                    if (entry.getValue() instanceof Map) continue;
                    paramInfo.append("\u6761\u6570\u4e3a ").append(entry.getValue()).append(" ");
                }
                log.error("\u6570\u636e\u6743\u9650\u670d\u52a1\u8c03\u7528\u89c4\u5219\u7c7b\uff1a{} {}", (Object)this.getClass().getName(), (Object)paramInfo);
                Set<String> customerSet = this.getCustomValues(content);
                size = customerSet.size();
                customAuthRuleResponse.setValues(customerSet);
            }
        }
        catch (Exception e) {
            customAuthRuleResponse.setVersion(content.getVersion());
            log.error(e.getMessage(), (Throwable)e);
        }
        log.error("\u6570\u636e\u6743\u9650\u670d\u52a1\u8c03\u7528\u89c4\u5219\u7c7b\uff1a{} \u7ed3\u675f\uff0c\u8017\u65f6 {} \u6beb\u79d2\uff0c\u67e5\u8be2\u7ed3\u679c\u5171 {} \u6761", new Object[]{this.getClass().getName(), System.currentTimeMillis() - start, size});
        return customAuthRuleResponse;
    }

    protected abstract Set<String> getCustomValues(CustomAuthExtContent var1) throws Exception;
}

