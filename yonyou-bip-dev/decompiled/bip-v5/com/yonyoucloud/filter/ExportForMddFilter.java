/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.servlet.Filter
 *  javax.servlet.FilterChain
 *  javax.servlet.ServletException
 *  javax.servlet.ServletRequest
 *  javax.servlet.ServletResponse
 *  javax.servlet.http.HttpServletRequest
 *  org.springframework.core.annotation.Order
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.filter;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value=1)
public class ExportForMddFilter
implements Filter {
    private static final Set<String> busiObjSet = new HashSet<String>();

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest)request;
        if (null != httpRequest.getRequestURI() && httpRequest.getRequestURI().contains("export") && busiObjSet.contains(httpRequest.getParameter("busiObj"))) {
            request.getParameterMap().put("FRAMEWORK", new String[]{"MDF_MDD"});
        }
        chain.doFilter(request, response);
    }

    static {
        busiObjSet.add("productcenter.pc_product");
        busiObjSet.add("productcenter.aa_merchant");
    }
}

