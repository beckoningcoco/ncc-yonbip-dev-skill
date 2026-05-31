/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  nc.bs.logging.Logger
 *  org.apache.http.HttpEntity
 *  org.apache.http.ParseException
 *  org.apache.http.client.ClientProtocolException
 *  org.apache.http.client.methods.CloseableHttpResponse
 *  org.apache.http.client.methods.HttpPost
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.entity.StringEntity
 *  org.apache.http.impl.client.CloseableHttpClient
 *  org.apache.http.impl.client.HttpClientBuilder
 *  org.apache.http.util.EntityUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package nccloud.bs.pub.pa;

import com.alibaba.fastjson.JSON;
import java.io.IOException;
import nc.bs.logging.Logger;
import ncc.task.quartz.dao.entity.ScheduleJob;
import nccloud.bs.pub.pa.TaskUtil;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class PreAlertHttpClientUtil {
    private static String url = TaskUtil.getQuartzURL();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean post(ScheduleJob job, String uri) {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost(url + uri);
        String jsonString = JSON.toJSONString((Object)job);
        StringEntity entity = new StringEntity(jsonString, "UTF-8");
        httpPost.setEntity((HttpEntity)entity);
        httpPost.setHeader("Content-Type", "application/json;charset=utf8");
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute((HttpUriRequest)httpPost);
            HttpEntity responseEntity = response.getEntity();
            String retSrc = EntityUtils.toString((HttpEntity)responseEntity);
            JSONObject result = new JSONObject(retSrc);
            int resultCode = result.getInt("code");
            if (response.getStatusLine().getStatusCode() == 200 && resultCode == 0) {
                boolean bl = true;
                return bl;
            }
        }
        catch (ClientProtocolException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        catch (ParseException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        catch (IOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        catch (JSONException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        finally {
            try {
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            }
            catch (IOException e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String post(String uri) {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost(url + uri);
        httpPost.setHeader("Content-Type", "application/json;charset=utf8");
        String retSrc = "";
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute((HttpUriRequest)httpPost);
            HttpEntity responseEntity = response.getEntity();
            retSrc = EntityUtils.toString((HttpEntity)responseEntity);
        }
        catch (ClientProtocolException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        catch (ParseException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        catch (IOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        finally {
            try {
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            }
            catch (IOException e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
        }
        return retSrc;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String post(String uri, String json) {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost(url + uri);
        httpPost.setHeader("Content-Type", "application/json;charset=utf8");
        StringEntity entity = new StringEntity(json, "UTF-8");
        httpPost.setEntity((HttpEntity)entity);
        String retSrc = "";
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute((HttpUriRequest)httpPost);
            HttpEntity responseEntity = response.getEntity();
            retSrc = EntityUtils.toString((HttpEntity)responseEntity);
        }
        catch (ClientProtocolException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        catch (ParseException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        catch (IOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        finally {
            try {
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            }
            catch (IOException e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
        }
        return retSrc;
    }
}

