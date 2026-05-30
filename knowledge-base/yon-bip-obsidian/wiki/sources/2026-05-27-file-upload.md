---
tags: [文件上传, Base64, MultipartFile, OkHttp, 开放平台API, 504, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-file-upload.md]
---

# 旗舰版文件上传

> 通过开放平台 API 实现 Base64 编码文件上传，含 OkHttp MultipartForm 实现及 URL 编码导致的 504 问题。

## 核心流程

1. 外系统传入 Base64 编码的文件列表
2. `decodeBase64ToBytes` 解码 → `createMultipartFile` 构造 MultipartFile
3. 调用文件上传 API：`/yonbip/uspace/iuap-apcom-file/rest/v1/file`
4. 参数：businessType、businessId、access_token

## 504 网关超时问题

**原因**：直接字符串拼接 URL 时，特殊字符（如 `+`）不会被转义为 `%2B`

**解决**：使用 `HttpUrl.Builder` 自动编码：
```java
HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();
urlBuilder.addQueryParameter(key, value);  // 自动 URL 编码
```

## 关键概念

- [[文件上传 API]]
- [[OkHttp]]
- [[Base64]]
- [[MultipartFile]]
