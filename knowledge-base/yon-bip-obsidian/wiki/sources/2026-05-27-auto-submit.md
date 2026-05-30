---
tags: [自动提交, RestTemplate, HTTP请求, F12抓包, Token, 提交接口, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-auto-submit.md]
---

# 自动提交

> 不走标准 API，通过模拟前台网络请求封装提交功能代码。

## 三步实现

1. **F12 抓包**：前台正常提交，捕获 POST 请求的 URL、Headers、Payload（保存报文需 `_status=2`）
2. **提取 Token**：F12 Application → Storage 中获取 `yht_access_token` 和 `Domain-Key`；精简 Headers 仅保留这两个即可
3. **代码模拟**：
   ```java
   String requestUrl = domainUrl + "/" + domainKey
       + "/bill/submit?cmdname=cmdSubmit&terminalType=1"
       + "&busiObj=" + busiObj + "&serviceCode=" + serviceCode;
   RestTemplate restTemplate = new RestTemplate(new OkHttp3ClientHttpRequestFactory(okHttpClient));
   // Headers: Domain-Key, Content-Type
   // Body: { "billnum": "...", "data": {...} }
   ```

## 报文中获取数据

```java
BizObject bizObject = MetaDaoHelper.findById(EntityName, bipId);
Map<String, Object> respMap = autoSubmit(entity, "ctdevelopengine-be", JSONObject.toJSONString(bizObject));
```

## 常见坑

- 保存后无表体：参照字段传了不存在的值
- 提交报错"稽核VO不能为空"：id 字段类型需是字符串
- 提交报错"未找到流程定义"：需传 `isWfControlled: true`

## 关键概念

- [[自动提交]]
- [[RestTemplate]]
- [[F12 抓包]]
- [[yht_access_token]]
