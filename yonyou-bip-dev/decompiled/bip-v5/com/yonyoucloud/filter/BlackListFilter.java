/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  javax.servlet.Filter
 *  javax.servlet.FilterChain
 *  javax.servlet.FilterConfig
 *  javax.servlet.ServletContext
 *  javax.servlet.ServletException
 *  javax.servlet.ServletRequest
 *  javax.servlet.ServletResponse
 *  javax.servlet.annotation.WebFilter
 *  javax.servlet.http.HttpServletRequest
 *  javax.servlet.http.HttpServletResponse
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.data.redis.core.RedisTemplate
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.web.context.WebApplicationContext
 *  org.springframework.web.context.support.WebApplicationContextUtils
 */
package com.yonyoucloud.filter;

import com.yonyou.ucf.mdd.ext.core.AppContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

@Component
@WebFilter(filterName="BlackListFilter", urlPatterns={"/*"})
public class BlackListFilter
implements Filter {
    private static final String BLACK_LIST_PREFIX = "COREDOC_BLACK_LIST_";
    private static final String BLACK_LIST_URI_PREFIX = "BLACK_LIST_URI_";
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private static List<String> whiteUrlList = new ArrayList<String>();
    private RedisTemplate redisTemplate;

    public void init(FilterConfig filterConfig) throws ServletException {
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext((ServletContext)filterConfig.getServletContext());
        if (context != null && context.getBean("redisTemplate") != null && this.redisTemplate == null) {
            this.redisTemplate = (RedisTemplate)context.getBean("redisTemplate");
        }
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String requestURI = ((HttpServletRequest)request).getRequestURI();
        if (!whiteUrlList.contains(requestURI)) {
            List range;
            String yTenantId = AppContext.getCurrentUser().getYTenantId();
            if (this.redisTemplate.opsForValue().get((Object)(BLACK_LIST_PREFIX + yTenantId)) != null && !CollectionUtils.isEmpty((Collection)(range = this.redisTemplate.opsForList().range((Object)(BLACK_LIST_URI_PREFIX + yTenantId), 0L, -1L))) && range.contains(requestURI)) {
                this.logger.error("\u79df\u6237:{}{}", new Object[]{yTenantId, "\u88ab\u4e34\u65f6\u52a0\u5165\u9ed1\u540d\u5355\uff0c\u62e6\u622a\u8be5\u79df\u6237\u7684{}\u8bf7\u6c42!", requestURI});
                HttpServletResponse httpResponse = (HttpServletResponse)response;
                httpResponse.setStatus(429);
                httpResponse.setContentType("application/json;charset=UTF-8");
                httpResponse.getWriter().write("{\"code\": 429, \"message\": \"\u8be5\u79df\u6237\u6682\u65f6\u88ab\u62d2\u7edd\u8be5\u8bf7\u6c42\uff0c\u8bf7\u8054\u7cfb\u7ba1\u7406\u5458\u6216\u5de5\u4f5c\u4eba\u5458\uff01\"}");
                httpResponse.getWriter().flush();
                return;
            }
        }
        chain.doFilter(request, response);
    }

    public void destroy() {
    }

    static {
        whiteUrlList.add("/iuap-apdoc-material/api/upc/sysopen");
    }
}

