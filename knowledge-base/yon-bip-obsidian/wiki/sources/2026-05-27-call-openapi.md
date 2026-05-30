---
tags: [OpenAPI, access_token, HmacSHA256, HttpUtil, 签名, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-call-openapi.md]
---

# 旗舰版调用OpenAPI

> 在后端 Java 代码中调用 BIP 开放平台 API，含 Token 获取（HmacSHA256 签名）、POST/GET 调用、appKey/appSecret 配置。

## Token 获取（HmacSHA256 签名）

```java
public static String getBipTokenByBY(String bipUrl, String appKey, String appSecret) {
    long timestamp = new Date().getTime();
    Map<String, String> rsMap = new HashMap<>();
    rsMap.put("appKey", appKey);
    rsMap.put("timestamp", timestamp + "");
    String signature = sign(rsMap, appSecret);  // HmacSHA256
    String tokenUrl = bipUrl + "/iuap-api-auth/open-auth/selfAppAuth/getAccessToken"
        + "?appKey=" + appKey + "&timestamp=" + timestamp + "&signature=" + signature;
    // 调用后缓存 access_token
}
```

签名算法：`HmacSHA256(TreeMap("appKey"+appKey+"timestamp"+timestamp), appSecret)` → Base64 → URLEncode

## POST 调用

```java
String token = SendBipOpenapiUtil.getBipTokenByBY(url, appKey, appSecret);
String apiUrl = domain + "/yonbip/EFI/receivable/batchsave?access_token=" + token;
String respJson = HttpUtil.post(apiUrl, param);
```

## 关键概念

- [[OpenAPI]]
- [[access_token]]
- [[HmacSHA256]]
- [[SendBipOpenapiUtil]]
