---
url: https://community.yonyou.com/datadict/bipbook/chapter2701/chapter2701.html
title: "OpenAPI | YonBIP高级版"
description: "YonBIP高级版电子书"
language: "zh"
captured_at: "2026-05-29T18:28:53.316Z"
---

# OpenAPI | YonBIP高级版

## OpenAPI

---

## 1\. OpenAPI含义

## 1.1 什么是OpenAPI

Open API即开放API,也称开放平台。 所谓的开放API（OpenAPI）是服务型网站常见的一种应用，网站的服务商将自己的网站服务封装成一系列API（Application Programming Interface，应用编程接口）开放出去，供第三方开发者使用，这种行为就叫做开放网站的API，所开放的API就被称作OpenAPI（开放API）。 网站提供开放平台的API后，可以吸引一些第三方的开发人员在该平台上开发商业应用，平台提供商可以获得更多的流量与市场份额，第三方开发者不需要庞大的硬件与技术投资就可以轻松快捷的创业，从而达到双赢的目的，开放API是大平台发展、共享的途径，让开发者开发一个有价值应用，付出的成本更少，成功的机会更多。今天，OpenAPI作为互联网在线服务的发展基础，已经成为越来越多互联网企业发展服务的必然选择。

## 1.2 Uap实现OpenAPI

就现在互联网上Open API的形态来看，主要分成两种：标准REST和类REST(也可以叫做RPC形态)。 REST形态主要有这么几点特点： 1.服务地址就是资源定位地址。 2.服务操作就是Http请求中的方法类型（GET,POST,DELETE,PUT），这其实是抽象现实当中对于服务的增删改查操作。

Restlet项目为“建立REST概念与Java类之间的映射”提供了一个轻量级而全面的框架。

UAP在Restlet框架之上，选择了官方JAX-RS扩展，并且在扩展的基础上与NC进行了集成。

## 2\. OpenAPI的开发

## 2.1 开发前准备工作

请使用平台提供的nchome，并且准备如下两个步骤：

1. nchome中modules/uapfw路径下包含pubuapfw\_restframeworkLevel-1.jar
2. nchome/hotwebs/nccloud/WEB-INF/web.xml中增加配置，配置如下所示：
```xml
xml    <context-param>
        <param-name>org.restlet.application</param-name>
        <param-value>uap.ws.rest.core.UAPRestJaxRsApplication</param-value>
    </context-param>

    <filter>
        <filter-name>openCloudSecurityFilter</filter-name>
        <filter-class>nccloud.ws.opm.core.filter.OpenCloudSecurityFilter</filter-class>
      </filter>
    <!-- opm login-->
    <filter>
         <filter-name>openCloudLoginFilter</filter-name>
         <filter-class>nccloud.ws.opm.core.filter.OpenCloudLoginFilter</filter-class>
      </filter>
    <filter-mapping>
        <filter-name>openCloudSecurityFilter</filter-name>
        <url-pattern>/api/*</url-pattern>
    </filter-mapping>
    <filter-mapping>
        <filter-name>openCloudLoginFilter</filter-name>
        <url-pattern>/opm/*</url-pattern>
    </filter-mapping>

    <servlet>
        <servlet-name>RestletServlet</servlet-name>
        <servlet-class>uap.ws.rest.servlet.UAPRSServerServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>RestletServlet</servlet-name>
        <url-pattern>/api/*</url-pattern>
    </servlet-mapping>
```

## 2.2 OpenAPI开发步骤

### 2.2.1 创建资源

## 资源类创建

- 在相应模块的public目录下创建OpenAPI资源类继承nccloud.ws.rest.resource.AbstractNCCRestResource
```java
javapackage nccloud.api.uapbd.customermanage.customer;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.json.JSONString;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import nc.bs.framework.common.NCLocator;
import nc.itf.bd.cust.pf.ICustomerPfQueryService;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.vo.bd.cust.CustomerVO;
import nc.vo.bd.cust.pf.AggCustomerPfVO;
import nc.vo.bd.cust.pf.CustomerPfVO;
import nc.vo.pub.BusinessException;
import nc.ws.opm.pub.utils.result.APIErrInfoUtil;
import nccloud.api.rest.utils.ResultMessageUtil;
import nccloud.ws.rest.resource.AbstractNCCRestResource;
@Path("uapbd/customermanage/baseinfo")
public class CustomerbaseinfoResources extends AbstractNCCRestResource {
    @Override
    public String getModule() {
        return "uapbd";
    }
    @POST
    @Path("/getCustomerbaseinfo")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public JSONString getCustomerbaseinfo(JSONString json) {
        JSONObject jObject = JSON.parseObject(json.toJSONString());
        if(jObject == null) {
            return ResultMessageUtil.exceptionToJSON(new NullPointerException("JSONString:null"));
        }
        if(jObject.get("ufinterface") == null) {
            return ResultMessageUtil.exceptionToJSON(new NullPointerException("ufinterface:null"));
        }
        JSONObject object = jObject.getJSONObject("ufinterface");
        String pk_org = (String)object.getOrDefault("pk_org", "");
        String billnumber = (String)object.getOrDefault("billnumber", "");
        try {
            String customerPfPk = getCustomerPfPk(pk_org, billnumber);
            AggCustomerPfVO vo = getCustomerPfService().queryVOByPk(customerPfPk);
            if(vo == null) {
                BusinessException e = new BusinessException("根据业务单元主键和客户申请单编码未查询到对应的客户申请单！");
                return ResultMessageUtil.exceptionToJSON(APIErrInfoUtil.getCode(e), APIErrInfoUtil.getErrMsg(e));
            }
            CustomerVO customerinfo = (CustomerVO)((CustomerPfVO)vo.getParentVO()).getCustomerinfo();
            JSONObject returnJson = new JSONObject();
            returnJson.put("pk_org", pk_org);
            returnJson.put("billnumber", billnumber);
            returnJson.put("customerbaseinfo", customerinfo);
            return ResultMessageUtil.toJSON(returnJson);
        } catch(BusinessException e) {
            return ResultMessageUtil.exceptionToJSON(APIErrInfoUtil.getCode(e), APIErrInfoUtil.getErrMsg(e));
        }
    }
    private String getCustomerPfPk(String pk_org, String billnumber) throws BusinessException {
        String sql = "select pk_customerpf from bd_customer_pf where isnull(dr, 0) = 0 and pk_org = '"
                + pk_org + "' and billnumber = '" + billnumber + "'";
        String customerPfPk = (String)getQueryService().executeQuery(sql, new ColumnProcessor());
        return customerPfPk;
    }
    public IUAPQueryBS getQueryService() {
        return NCLocator.getInstance().lookup(IUAPQueryBS.class);
    }
    public ICustomerPfQueryService getCustomerPfService() {
        return NCLocator.getInstance().lookup(ICustomerPfQueryService.class);
    }
}
```
- 类名上方使用Path注解标记类请求路径
```java
java@Path("uapbd/customermanage/baseinfo")
```
- getModule()方法返回模块编码
```java
java@Override
  public String getModule() {
      return "uapbd";
  }
```
- 创建OpenAPI请求处理方法并使用对应注解标记请求方式、方法请求路径、指定处理请求的提交内容类型、指定返回的内容类型
```java
java    @POST
    @Path("/getCustomerbaseinfo")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public JSONString getCustomerbaseinfo(JSONString json) {
        // ...
    }
```
- 处理其它业务逻辑

### 2.2.2 rest资源文件配置

- 创建后缀为rest的资源配置文件，文件内容如下：
```xml
xml<?xml version="1.0" encoding='gb2312'?>
<module>
<rest>
    <resource classname="nccloud.api.uapbd.customermanage.customer.CustomerbaseinfoResources"  exinfo="根据客户申请单编码和业务单元主键查询客户基本信息"/>
</rest>
</module>
```

其中resource标签中classname属性的内容为OpenAPI资源类的全限定类名，exinfo属性的内容为对资源类功能的说明。

- 将配置好的rest文件放到home中对应模块的META-INF目录下

![](https://community.yonyou.com/datadict/bipbook/assets/38.CmoYp61T.jpg)

### 2.2.3 OpenAPI接口说明文件

- OpenAPI接口说明文件为md格式文件，文件内容包括：接口名称、接口说明、使用场景、接口调用说明等，其中接口调用说明包括请求类型、请求示例、请求URL参数说明、请求参数JSON示例、返回值说明等，具体的文档内容可以参考已有的OpenAPI接口说明文件。
- 放置接口文件的目录为home根目录\\hotwebs\\nccloud\\resources\\api\\modules\\模块编码\\资源文件目录

![](https://community.yonyou.com/datadict/bipbook/assets/39.Dv_YPhJ2.jpg)

- 以上配置完成后可以在对应环境的NCCloud开放管理平台的“API维护”页签进行OpenAPI的维护： 具体步骤参加下文：OpenAPI注册以及接口测试

## 3 OpenAPI注册以及接口测试

## 3.1 OpenAPI注册

完成Java类以及rest文件编写之后，还需要进行一步网上资源的注册。步骤如下：

### 3.1.1 2207版本之前

访问地址 `http://ip:port/nccloud/resources/opm` ，并通过管理员登录。 在API维护页签当中新增加相关的API，其中需要注意一下几个点： URI路径如下所示： `/nccloud/api/uapbd/currtype/currtype/queryCurrtypeByCode` 其中 `uapbd/currtype/currtype` 对应于资源类的Path，而 `queryCurrtypeByCode` 对应于相关方法的Path注解。 在第三方应用管理当中进行应用的注册并且分配相关的小应用，然后就可以使用注册app\_id，app\_secret，加密类型以及公钥字段进行API的访问了。

注册API的步骤如下图所示：

![](https://community.yonyou.com/datadict/bipbook/assets/2.9yrXrYte.jpg)

注册第三方应用如下图所示：

![](https://community.yonyou.com/datadict/bipbook/assets/3.b8EFQs4G.jpg)

### 3.1.2 2207版本之后

登录YonBIP高级版，首页>开放集成>OpenAPI管理>OpenAPI管理>OpenAPI应用管理，进行第三方应用的注册：

![](https://community.yonyou.com/datadict/bipbook/assets/31.C-BNIZvr.jpg)

在首页>开放集成>OpenAPI管理>OpenAPI管理>OpenAPI维护，进行OpenAPI接口的注册：

![](https://community.yonyou.com/datadict/bipbook/assets/32.CwP8wAHP.jpg)

注册完毕后，在OpenAPI应用管理节点点击关联API按钮为应用分配OpenAPI接口：

![](https://community.yonyou.com/datadict/bipbook/assets/33.BlFwUB-Q.jpg)

## 3.2 OpenAPI的接口测试

API的测试或者请求流程如下所示：

### 3.2.1 自行发送http请求获取token和调用接口

第一步请求获取相应的token，请求的URL路径如下：

```xml
http://127.0.0.1/nccloud/opm/accesstokenbiz_center=1&grant_type=client_credentials&signature=3ca73b3bb506a34059e2bce1ce3bfe128e4e9fb6cefb7325396094f7816a01d9&client_secret=Su1s4kk0pQhhgAupsDajkqSFWeWxUEAy78yYh84wTHt1UPyC2ZV3CD7%2BP12XB897owyaVFQRJd2g%0D%0AfZcPwkvlxUgq3yrp1PBYxZ1TJ89oLf4Wicn%2BsDVAi57pTlsHHZZqQqLow5zdQjNP3Wm04ewszLhu%0D%0AasoViTdspzujiPAmwxY%3D%0D%0A&client_id=wqch
```

其中各个参数的含义如下：

biz\_center：访问的nccloud系统的账套code

grant\_type：授权模式，此处为client\_credentials

client\_id：对应于在第三方应用注册当中的app\_id

client\_secret：对应于第三方应用注册当中的app\_secret

signature：请求加签，其算法为SHA256Util.getSHA256(client\_id + client\_secret + pubKey)

其中pubKey为第三方应用注册当中的公钥字段

第二步为最终请求的OpenAPI，其中URL地址如下所示： [http://127.0.0.1/nccloud/api/uapbd/currtype/currtype/queryCurrtypeByCode](http://127.0.0.1/nccloud/api/uapbd/currtype/currtype/queryCurrtypeByCode)

其中在请求头当中包含了相关的参数，如下所示：

access\_token：即上一步当中获取到的token。

ucg\_flag：Y

signature：对请求体进行加签，算法如下：SHA256Util.getSHA256(client\_id+requestBody+pubkey)

其中pubKey为第三方应用注册当中的公钥字段。

下面是一段调用接口的Java代码及其配置：

```java
javapackage nccloud.api.testcase.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;

import nccloud.api.test.utils.CompressUtil;
import nccloud.api.test.utils.Decryption;
import nccloud.api.test.utils.Encryption;
import nccloud.api.test.utils.ResultMessageUtil;
import nccloud.api.test.utils.SHA256Util;

/**
 * 1.从resources/config.properties中读取测试api相关的数据 2.运行程序，测试查看测试结果
 *
 * @author lizhmf
 * @date 2019年6月20日上午10:53:11
 */
public class Test {

    private static String client_secret = null;
    private static String pubKey = null;
    private static String client_id = null;
    private static String username = null;
    private static String pwd = null;
    private static String busi_center = null;
    // 获取token方式
    private static String grant_type = null;
    // 服务器ip：port
    private static String baseUrl = null;
    private static String secret_level = null;
    private static String requestBody = null;
    // openapi请求路径
    private static String apiUrl = null;

    public static String token = null;
    public static String repeat_check = null;
    public static String busi_id = null;

    public static void main(String[] args) {
        try {
            // 初始化数据
            init();
            // 请求token
            token = getToken();
            System.out.println("getTokenData:" + token);
            if (token != null) {
                // 测试openapi
                testApi(token);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 通过refresh_token重新获取token
     *
     * @param refresh_token
     * @return
     * @throws UnsupportedEncodingException
     * @throws Exception
     */
    private static String getTokenByRefreshToken(String refresh_token) throws UnsupportedEncodingException, Exception {
        Map<String, String> paramMap = new HashMap<String, String>();
        // 密码模式认证
        paramMap.put("grant_type", "refresh_token");
        // 第三方应用id
        paramMap.put("client_id", client_id);
        // 第三方应用secret 公钥加密
        paramMap.put("client_secret", URLEncoder.encode(Encryption.pubEncrypt(pubKey, client_secret), "utf-8"));
        // 签名
        String sign = SHA256Util.getSHA256(client_id + client_secret + refresh_token + pubKey);
        paramMap.put("signature", sign);

        String url = baseUrl + "/nccloud/opm/accesstoken";
        String mediaType = "application/x-www-form-urlencoded";
        String token = doPost(url, paramMap, mediaType, null, "");
        return token;
    }

    private static String getToken() throws Exception {
        String token = null;
        if ("password".equals(grant_type)) {
            // 密码模式
            token = getTokenByPWD();
        } else if ("client_credentials".equals(grant_type)) {
            // 客户端模式
            token = getTokenByClient();
        } else if ("authorization_code".equals(grant_type)) {
            // TODO 页面跳转
            // 授权码模式
        }
        return token;
    }

    /**
     * 客户端模式获取token
     *
     * @return
     * @throws Exception
     */
    private static String getTokenByClient() throws Exception {
        Map<String, String> paramMap = new HashMap<String, String>();
        // 密码模式认证
        paramMap.put("grant_type", "client_credentials");
        // 第三方应用id
        paramMap.put("client_id", client_id);
        // 第三方应用secret 公钥加密
        paramMap.put("client_secret", URLEncoder.encode(Encryption.pubEncrypt(pubKey, client_secret), "utf-8"));
        // 账套编码
        paramMap.put("biz_center", busi_center);
        // // TODO 传递数据源和ncc登录用户
        // paramMap.put("dsname", "TM_0614");
        // paramMap.put("usercode", "1");

        // 签名
        String sign = SHA256Util.getSHA256(client_id + client_secret + pubKey);
        paramMap.put("signature", sign);

        String url = baseUrl + "/nccloud/opm/accesstoken";
        String mediaType = "application/x-www-form-urlencoded";
        String token = doPost(url, paramMap, mediaType, null, "");
        return token;
    }

    /**
     * 密码模式获取token
     *
     * @return
     * @throws Exception
     */
    @SuppressWarnings("unused")
    private static String getTokenByPWD() throws Exception {
        Map<String, String> paramMap = new HashMap<String, String>();
        // 密码模式认证
        paramMap.put("grant_type", "password");
        // 第三方应用id
        paramMap.put("client_id", client_id);
        // 第三方应用secret 公钥加密
        paramMap.put("client_secret", URLEncoder.encode(Encryption.pubEncrypt(pubKey, client_secret), "utf-8"));
        // ncc用户名
        paramMap.put("username", username);
        // 密码 公钥加密
        paramMap.put("password", URLEncoder.encode(Encryption.pubEncrypt(pubKey, pwd), "utf-8"));
        // 账套编码
        paramMap.put("biz_center", busi_center);
        // 签名
        String sign = SHA256Util.getSHA256(client_id + client_secret + username + pwd + pubKey);
        paramMap.put("signature", sign);

        String url = baseUrl + "/nccloud/opm/accesstoken";
        String mediaType = "application/x-www-form-urlencoded";
        String token = doPost(url, paramMap, mediaType, null, "");
        return token;
    }

    /**
     * 请求openapi
     *
     * @param token
     * @param security_key
     *                         请求body参数加密压缩用的key
     * @throws Exception
     */
    private static void testApi(String token) throws Exception {
        // token转对象，获取api访问所用token和secret
        ResultMessageUtil returnData = new Gson().fromJson(token, ResultMessageUtil.class);
        Map<String, String> data = (Map<String, String>) returnData.getData();
        String access_token = data.get("access_token");
        String security_key = data.get("security_key");
        String refresh_token = data.get("refresh_token");
        System.out.println("【ACCESS_TOKEN】:" + access_token);

        // 请求路径
        String url = baseUrl + apiUrl;
        // header 参数
        Map<String,String> headermap = new HashMap<>();
        headermap.put("access_token", access_token);
        headermap.put("client_id", client_id);

        StringBuffer sb = new StringBuffer();
        sb.append(client_id);
        if (StringUtils.isNotBlank(requestBody)) {
            // sb.append(requestBody.replaceAll("\\s*|\t|\r|\n", "").trim());
            sb.append(requestBody);
        }
        sb.append(pubKey);
        String sign = SHA256Util.getSHA256(sb.toString());
        headermap.put("signature", sign);

        if (StringUtils.isNotBlank(busi_id)) {
            headermap.put("busi_id", busi_id);
        }
        if (StringUtils.isNotBlank(repeat_check)) {
            headermap.put("repeat_check", repeat_check);
        }
        headermap.put("ucg_flag", "y");

        String mediaType = "application/json;charset=utf-8";

        // 表体数据json
        // 根据安全级别选择加密或压缩请求表体参数
        String json = dealRequestBody(requestBody, security_key, secret_level);

        // 返回值
        String result = doPost(url, null, mediaType, headermap, json);
        String result2 = dealResponseBody(result, security_key, secret_level);
        System.out.println("【RESULT】:" + result);
        // System.out.println("result解密:" + result2);
    }

    private static String dealResponseBody(String source, String security_key, String level) throws Exception {
        String result = null;

        if (StringUtils.isEmpty(level) || SecretConst.LEVEL0.equals(level)) {
            result = source;
        } else if (SecretConst.LEVEL1.equals(level)) {
            result = Decryption.symDecrypt(security_key, source);
        } else if (SecretConst.LEVEL2.equals(level)) {
            result = CompressUtil.gzipDecompress(source);
        } else if (SecretConst.LEVEL3.equals(level)) {
            result = CompressUtil.gzipDecompress(Decryption.symDecrypt(security_key, source));
        } else if (SecretConst.LEVEL4.equals(level)) {
            result = Decryption.symDecrypt(security_key, CompressUtil.gzipDecompress(source));
        } else {
            throw new Exception("无效的安全等级");
        }

        return result;
    }

    /**
     * 初始化参数
     */
    private static void init() {
        // TODO Auto-generated method stub
        Properties properties = new Properties();

        String filepath = "config.properties";
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classloader.getResourceAsStream(filepath);
        try {
            InputStreamReader reader = new InputStreamReader(inputStream, "UTF-8");
            properties.load(reader);

            client_secret = new String(properties.getProperty("client_secret").getBytes("utf-8"), "utf-8");
            client_id = properties.getProperty("client_id");
            pubKey = properties.getProperty("pubKey");
            username = properties.getProperty("username");
            pwd = properties.getProperty("pwd");
            busi_center = properties.getProperty("busi_center");
            baseUrl = properties.getProperty("baseUrl");
            requestBody = new String(properties.getProperty("requestBody").getBytes("utf-8"), "utf-8");
            apiUrl = properties.getProperty("apiUrl");
            grant_type = properties.getProperty("grant_type");
            secret_level = properties.getProperty("secret_level");
            repeat_check = properties.getProperty("repeat_check");
            busi_id = properties.getProperty("busi_id");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // 根据安全级别设置，表体是否加密或压缩
    private static String dealRequestBody(String source, String security_key, String level) throws Exception {
        String result = null;
        if (StringUtils.isEmpty(level) || SecretConst.LEVEL0.equals(level)) {
            result = source;
        } else if (SecretConst.LEVEL1.equals(level)) {
            result = Encryption.symEncrypt(security_key, source);
        } else if (SecretConst.LEVEL2.equals(level)) {
            result = CompressUtil.gzipCompress(source);
        } else if (SecretConst.LEVEL3.equals(level)) {
            result = Encryption.symEncrypt(security_key, CompressUtil.gzipCompress(source));
        } else if (SecretConst.LEVEL4.equals(level)) {
            result = CompressUtil.gzipCompress(Encryption.symEncrypt(security_key, source));
        } else {
            throw new Exception("无效的安全等级");
        }

        return result;
    }

    /**
     * 发送post请求
     *
     * @param baseUrl
     * @param paramMap
     * @param mediaType
     * @param headers
     * @param json
     * @return
     */
    private static String doPost(String baseUrl, Map<String, String> paramMap, String mediaType, Map<String, String> headers, String json) {

        HttpURLConnection urlConnection = null;
        InputStream in = null;
        OutputStream out = null;
        BufferedReader bufferedReader = null;
        String result = null;
        try {
            StringBuffer sb = new StringBuffer();
            sb.append(baseUrl);
            if (paramMap != null) {
                sb.append("?");
                for (Map.Entry<String, String> entry : paramMap.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    sb.append(key + "=" + value).append("&");
                }
                baseUrl = sb.toString().substring(0, sb.toString().length() - 1);
            }

            URL urlObj = new URL(baseUrl);
            urlConnection = (HttpURLConnection) urlObj.openConnection();
            urlConnection.setConnectTimeout(50000);
            urlConnection.setRequestMethod("POST");
            urlConnection.setDoOutput(true);
            urlConnection.setDoInput(true);
            urlConnection.setUseCaches(false);
            urlConnection.addRequestProperty("content-type", mediaType);
            if (headers != null) {
                for (String key : headers.keySet()) {
                    urlConnection.addRequestProperty(key, headers.get(key));
                }
            }
            out = urlConnection.getOutputStream();
            out.write(json.getBytes("utf-8"));
            out.flush();
            int resCode = urlConnection.getResponseCode();
            if (resCode == HttpURLConnection.HTTP_OK || resCode == HttpURLConnection.HTTP_CREATED || resCode == HttpURLConnection.HTTP_ACCEPTED) {
                in = urlConnection.getInputStream();
            } else {
                in = urlConnection.getErrorStream();
            }
            bufferedReader = new BufferedReader(new InputStreamReader(in, "utf-8"));
            StringBuffer temp = new StringBuffer();
            String line = bufferedReader.readLine();
            while (line != null) {
                temp.append(line).append("\r\n");
                line = bufferedReader.readLine();
            }
            String ecod = urlConnection.getContentEncoding();
            if (ecod == null) {
                ecod = Charset.forName("utf-8").name();
            }
            result = new String(temp.toString().getBytes("utf-8"), ecod);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (null != bufferedReader) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            urlConnection.disconnect();
        }
        return result;
    }

    class SecretConst {
        /**
         * LEVEL0 不压缩、不加密
         */
        public static final String LEVEL0 = "L0";
        /**
         * LEVEL1 只加密、不压缩
         */
        public static final String LEVEL1 = "L1";
        /**
         * LEVEL2 只压缩、不加密
         */
        public static final String LEVEL2 = "L2";
        /**
         * LEVEL3 先压缩、后加密
         */
        public static final String LEVEL3 = "L3";
        /**
         * LEVEL4 先加密、后压缩
         */
        public static final String LEVEL4 = "L4";
    }
}
```

相关的资源文件：

```xml
properties#####不变参数

client_id=wqch
client_secret=c02397ac7d49417aaa7c
pubKey=MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCLuDvkKNHs0C0+LHJks/0QVGyLWFSqXPvMEJ6jC17ebft+LMrFvSAcFLiE8TGdFoUyMbqB3XDIK78o/VvoRDhHIGmFJXRs/sfgpPvJPPsAwlHHNFR7Wm1Na/MvqlKnGOVhOTCKzQR8kQ7LUIiYrKHgU+IPtSPa7cA5gMG8YrfAYQIDAQAB
secret_level=L0

## 账套code
busi_center=1

#################################################################################################

#####可变参数
## 获取token方式
grant_type=client_credentials
#grant_type=password

#重复校验
#busi_id=1234
#repeat_check=Y

## 服务器地址
baseUrl=http://127.0.0.1

## 请求参数
requestBody=[{\"code\":\"CNY\"}]
## api访问路径
apiUrl=/nccloud/api/uapbd/currtype/currtype/queryCurrtypeByCode
```

### 3.2.2 使用OpenAPI调用工具包调用接口

- 下载OpenAPI工具包，放到第三方系统中，工具包下载链接如下（其中 OpenAPIUtil-jdk1.7-1.0.0 为适配jdk1.7的工具包，jdk1.8及以上版本使用OpenAPIUtil-jdk1.8-1.0.0即可）：
	- OpenAPIUtil-jdk1.7-1.0.0: [http://pan.yonyou.com/s/i3W6cdgMSE](http://pan.yonyou.com/s/i3W6cdgMSE) 密码：n3yl
		- OpenAPIUtil-jdk1.8-1.0.0: [https://pan.yonyou.com/s/4hgECOTNk](https://pan.yonyou.com/s/4hgECOTNk) 密码：mrer
- 注：此工具包需要使用commons-codec.jar和fastjson.jar两个第三方包支持，可以自行网上下载并使用， 也可以访问下面链接下载：
	- [http://pan.yonyou.com/s/jGV5V8MqQtg密码：zya2](http://pan.yonyou.com/s/jGV5V8MqQtg%E5%AF%86%E7%A0%81%EF%BC%9Azya2)
		- 在nccloud系统中注册第三方应用（参考前文注册第三方应用的介绍）， 如果此处生成的公钥字段包含空格，在调试代码中需要去除空格再使用。
		- 使用示例：
创建工具类对象NC Cloud2021.05版本开始调整了加解密方式，工具已做适配，注意初始化工具类对象。

创建工具类对象：

```java
javaIAPIUtils util = null;
// util = new APIOldUtils(); // 2021.05之前的版本
util = new APICurUtils();//2021.05版本及以后版本
```

构造请求参数：

```java
java// 服务地址ip
String ip = "127.0.0.1";
// 服务地址端口号
String port = "8013";
// 账套编码，开发环境使用develop，生产环境需要使用用root账号登录，在“系统管理”节点查看账套编码
String busi_center = "develop";
// 第三方应用编码
String app_id = "ncc1";
// app_secret，用于请求加签
String app_secret = "e64b98e4fe9e4d3f823a";
// 公钥，加解密使用
String public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAt4Vjm27e2ZMw8wstEKZZsnvAFB13bnt2UA170Hw2Wpcv1zUnEuws8uE4l+MoADjwjwMgoiNoQN8S8IcIx0P+qmsc1zNkdqoVDX4V292z1Ul1ZZwPT2LhyATcF6AOWp/O2MitIFxBrFlMpVE8bvTGtOavtUYOkJWL1ZERp2/Cufv/Xe9wtuWuIxcSn97+YLf9ynsVMTr49g7yddJGuBuJRGGYj3FXDWiJG+xP5jO8ulIfgSe5+TwitJTMw3wS4xqEmJj+EG0AlEcD2wlbcHmB1Wx14DGRvZbQtBv3z0IG0DqtbZoQ1gUAyqJfYaZEgZwfutfN+3mcF+0sWU9K9zzr4QIDAQAB";
// ncc用户名
String ncc_user = "ncc1";
// ncc用户密码
String password = "123456a!!";
```

初始化工具类对象：

```java
javautil.init(ip, port, busi_center, app_id, app_secret, public_key, ncc_user, password);
```

获取token:

```java
javaString token = util.getToken();
```

进行接口请求测试：

```java
java// 请求的OpenAPI接口地址，注意nccloud前面没有"/"
String apiuri = "nccloud/api/cmp/applyext/queryBodyMoneyByCon";
util.setApiUrl(apiuri);
// 对应接口地址的请求参数
String requestParam = "{\"orderno\":[\"HT00000001\",\"HT00000002\",\"HT00000003\"],\"pk_org\":[\"0001\"],\"vdef1\":[\"\"]}";
// 携带token访问接口，获取结果
String result = util.getAPIRetrun(token, requestParam);
```

### 3.2.3 使用YonBIP高级版开发工具进行OpenAPI的测试

- 安装最新版YonBIP高级版开发工具，下载地址为： [https://nccdev.yonyou.com/studio/](https://nccdev.yonyou.com/studio/)
- 配置第三方应用信息：

![](https://community.yonyou.com/datadict/bipbook/assets/34.CSZQ8sFi.jpg)

配置样例：

![](https://community.yonyou.com/datadict/bipbook/assets/35.CNzwcpiP.jpg)

- 配置接口请求路径及请求参数：
![](https://community.yonyou.com/datadict/bipbook/assets/36.BWjkTTAS.jpg)

请求样例：

![](https://community.yonyou.com/datadict/bipbook/assets/37.BCmrV9Kx.jpg)

### 3.2.4 使用IDEA插件进行OpenAPI的测试

- IDEA插件获取地址 ： [https://nccdev.yonyou.com/article/detail/658](https://nccdev.yonyou.com/article/detail/658)
- 点击右侧侧边栏的\[OpenAPI Tool\],打开界面
![](https://community.yonyou.com/datadict/bipbook/assets/41.tzkVvAb4.jpg)
- 首先点击左侧小齿轮配置链接信息，配置完成后点击【OK】
![](https://community.yonyou.com/datadict/bipbook/assets/42.BqoLVQXS.jpg)
- 选择版本，输入请求路径和请求参数后，点击发送按钮，结果会出现在下方。返回结果会自动格式化，方便查看
![](https://community.yonyou.com/datadict/bipbook/assets/43.DCktTxkj.jpg)

## 4 OpenAPI在云融合场景中的应用

- YonBIP高级版和BIP的云融合场景中使用了OpenAPI作为数据传输通道，云融合支持多种功能，包括：菜单穿透、权限体系、档案同步。
- 档案同步中的数据同步任务包括：预置档案一键同步（BIP拉取YonBIP高级版数据作为预置档案），对应ERP连接配置中的自定义档案、生态购买方案一键同步（BIP推送数据到YonBIP高级版，例如：供应商）、自定义档案同步（BIP低代码生成自定义单据数据推送至YonBIP高级版）。
- 云融合中OpenAPI相关配置 云融合场景中OpenAPI相关配置可以在BIP环境中的“连接配置”节点或者“ERP连接配置”节点进行配置。下面以“连接配置”节点为例介绍云融合中和OpenAPI相关的配置参数：

![](https://community.yonyou.com/datadict/bipbook/assets/40.DuMpoxVw.jpg)

- 以上配置在点击“获取参数”按钮时向YonBIP高级版发送获取账套的请求，获取账套编码、集团编码、用户编码参数，当用户是系统管理员时，YonBIP高级版会接收集团编码作为参数并翻译为集团主键设置到环境上下文中，供业务领域在调用接口时获取使用。
- 云融合场景下针对“友企联”这个第三方应用做了“动态密钥”的功能，每个环境下的“应用公钥”和“应用密文”都不一样，增加了安全性。