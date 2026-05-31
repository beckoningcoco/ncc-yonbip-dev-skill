/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  javax.servlet.Filter
 *  javax.servlet.FilterChain
 *  javax.servlet.FilterConfig
 *  javax.servlet.ServletException
 *  javax.servlet.ServletRequest
 *  javax.servlet.ServletResponse
 *  javax.servlet.http.HttpServletRequest
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.filter;

import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BillContextListFilter
implements Filter {
    private static final Logger log = LoggerFactory.getLogger(BillContextListFilter.class);

    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        try {
            if (request != null && ((HttpServletRequest)request).getRequestURI() != null && ((HttpServletRequest)request).getRequestURI().contains("/api/upc")) {
                InvocationInfoProxy.setExtendAttribute((String)"setI18ndoc", (Object)"true");
            }
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080483", (String)"BillContextListAspector\u62e6\u622a\u5668\u5904\u7406\u53c2\u6570\u5f02\u5e38\uff0c\u8bf7\u68c0\u67e5\u5904\u7406\u903b\u8f91\uff01\uff01\uff01\u5f02\u5e38\u4e3a\uff1a"), (Object)e.getMessage(), (Object)e);
        }
        chain.doFilter(request, response);
    }

    public void destroy() {
    }
}

