---
tags: [Token, 用户认证, Redis, CAS]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-yht-access-token.md]
platform_version: "BIP V5"
project: ""
last_verified: 2026-05-31
status: verified
source_type: practice
---

# yht_access_token

> 友互通（yht）访问令牌，用于 BIP 平台用户认证。

## 获取方式

通过 `YonBipTokenUtil.getYhtAccessToken(yhtUserId)` 获取。

## 缓存策略

- 存储介质：Redis
- Key 格式：`yht_access_token + {userId}`
- 过期时间：1 小时（3600 秒）

## 获取流程

1. 查 Redis 缓存
2. 缓存未命中 → `genLoginTokenByUserId` 获取临时 token
3. 构造 CAS 登录 URL
4. 请求 CAS，从 Cookie 中提取 `yht_access_token`
5. 写入 Redis

## 相关页面

- [[YonBipTokenUtil]]
- [[genLoginTokenByUserId]]
- [[CAS 登录]]
