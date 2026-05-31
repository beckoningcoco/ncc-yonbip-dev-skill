/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.yms.http.YmsHttpClient
 *  com.yonyou.iuap.yms.http.YmsHttpHeader
 *  com.yonyou.iuap.yms.http.YmsHttpMethod
 *  com.yonyou.iuap.yms.http.YmsHttpRequest
 *  com.yonyou.iuap.yms.http.YmsHttpRequestBuilder
 *  com.yonyou.iuap.yms.http.YmsHttpResponse
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.product;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.yms.http.YmsHttpClient;
import com.yonyou.iuap.yms.http.YmsHttpHeader;
import com.yonyou.iuap.yms.http.YmsHttpMethod;
import com.yonyou.iuap.yms.http.YmsHttpRequest;
import com.yonyou.iuap.yms.http.YmsHttpRequestBuilder;
import com.yonyou.iuap.yms.http.YmsHttpResponse;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProductCheckStockService {
    private static final Logger log = LoggerFactory.getLogger(ProductCheckStockService.class);
    @Autowired
    @Qualifier(value="coredocYmsHttpClient")
    private YmsHttpClient ymsHttpClient;
    @Autowired
    private YMSParamConfig ymsParamConfig;

    public List<Map> checkCurrentStockByProduct(List<Map> products) throws Exception {
        if (ProductUtil.checkOpenOption("u8c-config", "app:ST")) {
            return this.sendCheckCurrentStock(products);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List<Map> sendCheckCurrentStock(List<Map> products) throws Exception {
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("Content-Type", "application/json");
        headers.put("token", InvocationInfoProxy.getYhtAccessToken());
        headers.put("yht_access_token", InvocationInfoProxy.getYhtAccessToken());
        String domain = this.ymsParamConfig.getDomainYonbipScmStock();
        String url = domain + "/rest/checkCurrentStockByProduct";
        YmsHttpHeader ymsHttpHeader = new YmsHttpHeader();
        ymsHttpHeader.add("Content-Type", "application/json;charset=utf-8");
        YmsHttpRequest request = new YmsHttpRequestBuilder().url(url).method(YmsHttpMethod.POST).body((Object)JSON.toJSONString(products)).addHeader(ymsHttpHeader.addAllMap(headers)).build();
        try (YmsHttpResponse ymsHttpResponse = this.ymsHttpClient.execute(request);){
            String result = ymsHttpResponse.getBodyString();
            Map map = (Map)JSONObject.parseObject((String)result, Map.class);
            Object status = map.get("code");
            if (status == null) return null;
            if (!"200".equals(status.toString())) return null;
            Object data = map.get("data");
            List list = JSON.parseArray((String)JSON.toJSONString(data), Map.class);
            return list;
        }
        catch (Exception e) {
            log.error("\u505c\u7528\u7269\u6599\u65f6\uff0c\u68c0\u67e5\u7269\u6599\u662f\u5426\u5305\u542b\u5e93\u5b58\u91cf\u5f02\u5e38", (Throwable)e);
        }
        return null;
    }
}

