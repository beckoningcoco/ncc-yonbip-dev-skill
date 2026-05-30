---
tags: [Token, userId, access_token, yht_access_token, Redis, SSO, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-userid-to-token.md]
---

# 通过userId获取token

> 通过 userId 获取 access_token 和 yht_access_token（友互通 token），用于调用 API 时绑定用户身份。

## 两种 Token

| Token | 获取方式 | 用途 |
|-------|----------|------|
| access_token | appKey + appSecret + HmacSHA256 签名 | 调用 OpenAPI（应用级） |
| yht_access_token | userId → CAS login → Cookie 提取 | 调用内部 API 绑定用户身份 |

## 获取 yht_access_token

1. 调 `/cas/exclusive/genLoginTokenByUserIdLimitIp?userId=xxx` 获取 login token
2. 构建 Cas 登录跳转 URL
3. 从返回的 Cookie 中提取 `yht_access_token`
4. 清理控制字符（`\r\n` 等）

## 使用

```java
ymsHttpHeader.add("yht_access_token", accessTokenUtil.getYhtAccessToken(userId));
```

UAT 环境可能不稳定，建议加 Redis 缓存（10 分钟过期）。前台触发时可直接用 `InvocationInfoProxy.getYhtAccessToken()`。

## 关键概念

- [[yht_access_token]]
- [[access_token]]
- [[SSO]]
- [[CAS]]
