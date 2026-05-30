---
tags: [yht_access_token, Token, Redis, 用户认证, CAS]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-yht-access-token.md]
---

# 根据用户 ID 获取 yht_access_token

> 通过 `YonBipTokenUtil` 获取友互通的 access token，含 Redis 缓存机制。

## 核心观点

- `YonBipTokenUtil.getYhtAccessToken(yhtUserId)` 是获取 token 的统一入口
- 优先从 Redis 读取缓存，缓存未命中时调用 `genLoginTokenByUserId` 实时获取
- 通过模拟 CAS 登录跳转，从响应的 Cookie 中提取 `yht_access_token`
- Token 缓存到 Redis，过期时间 1 小时（3600 秒）

## 调用链

`getYhtAccessToken` → Redis 查缓存 → `genLoginTokenByUserId` → `buildRedirectUrl` → `doGet2` → `extractYhtAccessToken`

## 关键概念

- [[yht_access_token]]
- [[YonBipTokenUtil]]
- [[CAS 登录]]
- [[Redis 缓存]]
- [[genLoginTokenByUserId]]

## 相关页面

- [[旗舰版 API 调用]]
- [[用户认证]]
