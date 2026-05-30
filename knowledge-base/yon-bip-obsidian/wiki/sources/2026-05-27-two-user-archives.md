---
tags: [用户档案, base.user.User, ba_user, 友互通, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-two-user-archives.md]
---

# 旗舰版中的两个用户档案

> 旗舰版存在两个用户表：`base.user.User`（平台用户）和 `iuap_apcom_auth.ba_user`（友互通用户）。

## 核心关系

- `用户表.yht_user_id` = `友互通用户表.id`
- 报销单创建人参照是 `base.user.User`
- OpenAPI 的 `creator_code` 是 `base.user.User` 的 `code`
- 获取 Token 的用户 ID 是 `yht_user_id`（即 `ba_user.id`）
- 员工参照的 `user_id` 也是 `ba_user.id`

## 表位置

```sql
SELECT * FROM iuap_apcom_auth."user";    -- 平台用户
SELECT * FROM iuap_apcom_auth.ba_user;   -- 友互通用户
```

## 关键概念

- [[用户档案]]
- [[友互通]]
- [[OpenAPI 调用]]
