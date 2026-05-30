---
tags: [OpenAPI, SDK, Maven, 开放平台, API调用, HttpOptions]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-openapi-sdk.md]
---

# openapi-sdk调用API的使用示例

> 从零搭建 Maven 工程，通过 openapi-sdk 依赖调用 BIP 的 OpenAPI。

## POM 依赖

核心依赖：jackson-databind、commons-lang3、commons-codec、httpclient、slf4j-api。需额外引入两个独立 JAR：`iuap-ip-openapi-sdk-8.2.jar` 和 `expiringmap-0.5.10.jar`。

## 超时配置

防止 `Read timed out` 异常的关键是设置 SocketTimeout：

```java
HttpOptions httpOptions = new HttpOptions()
    .setConnectionRequestTimeout(30 * 1000)
    .setConnectionTimeout(30 * 1000)
    .setSocketTimeout(180 * 1000);  // 关键：读取响应超时180秒
```

## 调用流程

1. 创建 `OpenServiceBuilder`，设置 appKey、appSecret、env
2. 构建 `InputParam`（URL、body、contentType、method）
3. `Invoke.getResult(openServiceBuilder, inputParam)` 执行调用
4. 解析 `HttpResponse`，statusCode=200 且 code="200" 为成功

## 关键概念

- [[OpenAPI]]
- [[openapi-sdk]]
- [[HttpOptions]]
- [[Maven]]
