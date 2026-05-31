/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 *  org.apache.commons.httpclient.DefaultHttpMethodRetryHandler
 *  org.apache.commons.httpclient.HttpClient
 *  org.apache.commons.httpclient.HttpException
 *  org.apache.commons.httpclient.HttpMethod
 *  org.apache.commons.httpclient.NameValuePair
 *  org.apache.commons.httpclient.methods.GetMethod
 *  org.apache.commons.httpclient.methods.PostMethod
 */
package nc.vo.pf.mobileapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import nc.bs.logging.Logger;
import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;

public class HttpRequestUtil {
    public static final String URL_PROTOCAL = "protocol";
    public static final String URL_HOST = "host";
    public static final String URL_HTTP = "http";
    public static final String URL_HTTPS = "https";
    public static final String URL_PORT = "port";
    public static final String URL_LOCALHOST = "localhost";
    public static final String URL_SERVICE = "service";
    public static final String URL_PROT_80 = "80";
    public static final int HTTP_CONNECTION_TIMEOUT = 180000;
    public static final String HTTP_HEAD_JSON = "json";
    public static final String HTTP_HEAD_XML = "xml";
    public static final String HTTP_HEAD_HTML = "html";
    public static final String HTTP_HEAD_DOWNLOAD = "x-download";
    public static final String HTTP_ENCODE_UTF8 = "UTF-8";

    public static String get(String url, Map<String, String> paraMap) {
        HttpMethod httpMethod = HttpRequestUtil.getGetMethod(url, paraMap);
        return HttpRequestUtil.httpRequest(url, httpMethod, 180000);
    }

    public static String get(String url, Map<String, String> paraMap, int timeout) {
        HttpMethod httpMethod = HttpRequestUtil.getGetMethod(url, paraMap);
        return HttpRequestUtil.httpRequest(url, httpMethod, timeout);
    }

    public static String post(String url, Map<String, String> paraMap) {
        HttpMethod httpMethod = HttpRequestUtil.getPostMethod(url, paraMap);
        return HttpRequestUtil.httpRequest(url, httpMethod, 180000);
    }

    public static String post(String url, Map<String, String> paraMap, int timeout) {
        HttpMethod httpMethod = HttpRequestUtil.getPostMethod(url, paraMap);
        return HttpRequestUtil.httpRequest(url, httpMethod, timeout);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static String httpRequest(String url, HttpMethod httpMethod, int timeout) {
        String responseStr;
        block23: {
            if (timeout < 0) {
                timeout = timeout < 0 ? 180000 : timeout;
            }
            HttpClient client = new HttpClient();
            Map<String, String> urlMap = HttpRequestUtil.convertUrl(url);
            client.getHostConfiguration().setHost(urlMap.get(URL_HOST), Integer.valueOf(urlMap.get(URL_PORT)).intValue(), urlMap.get(URL_PROTOCAL));
            client.getHttpConnectionManager().getParams().setConnectionTimeout(timeout);
            client.getHttpConnectionManager().getParams().setSoTimeout(timeout);
            client.getParams().setParameter("http.protocol.content-charset", (Object)HTTP_ENCODE_UTF8);
            responseStr = "";
            BufferedReader br = null;
            try {
                client.executeMethod(httpMethod);
                int statuscode = httpMethod.getStatusCode();
                if (statuscode == 200) {
                    br = new BufferedReader(new InputStreamReader(httpMethod.getResponseBodyAsStream(), HTTP_ENCODE_UTF8));
                    String line = null;
                    StringBuffer sb = new StringBuffer();
                    try {
                        while ((line = br.readLine()) != null) {
                            sb.append(line).append("\n");
                        }
                        responseStr = sb.toString();
                        break block23;
                    }
                    finally {
                        br.close();
                    }
                }
                Logger.warn((Object)("MA Sync MDM Http exceptoin: statuscode ~ " + statuscode));
            }
            catch (HttpException e) {
                Logger.warn((Object)("MA Sync HttpException: " + e.getMessage()));
            }
            catch (IOException e) {
                Logger.warn((Object)("MA Sync IOException: " + e.getMessage()));
            }
            finally {
                if (httpMethod != null) {
                    httpMethod.releaseConnection();
                    httpMethod = null;
                }
                if (br != null) {
                    try {
                        br.close();
                    }
                    catch (IOException e) {
                        Logger.error((Object)e);
                    }
                }
            }
        }
        return responseStr;
    }

    private static HttpMethod getGetMethod(String url, Map<String, String> paramsMap) {
        GetMethod getMethod = new GetMethod(url);
        getMethod.getParams().setParameter("http.method.retry-handler", (Object)new DefaultHttpMethodRetryHandler());
        ArrayList<NameValuePair> list = new ArrayList<NameValuePair>();
        for (String key : paramsMap.keySet()) {
            NameValuePair tempNameValuePair = new NameValuePair(key.toString(), paramsMap.get(key).toString());
            list.add(tempNameValuePair);
        }
        NameValuePair[] names = list.toArray(new NameValuePair[0]);
        getMethod.setQueryString(names);
        return getMethod;
    }

    private static HttpMethod getPostMethod(String url, Map<String, String> paramsMap) {
        PostMethod postMethod = new PostMethod(url);
        ArrayList<NameValuePair> list = new ArrayList<NameValuePair>();
        for (String key : paramsMap.keySet()) {
            NameValuePair tempNameValuePair = new NameValuePair(key.toString(), paramsMap.get(key).toString());
            list.add(tempNameValuePair);
        }
        NameValuePair[] names = list.toArray(new NameValuePair[0]);
        postMethod.setRequestBody(names);
        return postMethod;
    }

    private static Map<String, String> convertUrl(String url) {
        HashMap<String, String> urlMap = new HashMap<String, String>();
        if (url != null && url.length() > 0) {
            String[] urlStrs = url.split("://");
            String[] secPartStrs = null;
            if (urlStrs != null && urlStrs.length > 1) {
                urlMap.put(URL_PROTOCAL, urlStrs[0]);
                String secPartStr = urlStrs[1];
                secPartStrs = secPartStr.split(":");
            } else {
                urlMap.put(URL_PROTOCAL, URL_HTTP);
                secPartStrs = url.split(":");
            }
            String[] thirdPartStrs = null;
            if (secPartStrs != null && secPartStrs.length > 1) {
                urlMap.put(URL_HOST, secPartStrs[0]);
                thirdPartStrs = secPartStrs[1].split("/", 2);
                urlMap.put(URL_PORT, thirdPartStrs[0]);
                urlMap.put(URL_SERVICE, "/" + thirdPartStrs[1]);
            } else {
                urlMap.put(URL_PORT, URL_PROT_80);
                thirdPartStrs = secPartStrs[0].split("/", 2);
                urlMap.put(URL_HOST, thirdPartStrs[0]);
                urlMap.put(URL_SERVICE, "/" + thirdPartStrs[1]);
            }
        }
        return urlMap;
    }
}

