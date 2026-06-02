---
tags: [BIP, 元数据, 数据字典, ucfbase.yht.PubUserTenant]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 友互通用户租户 (`ucfbase.yht.PubUserTenant`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `idx_user_relation` | 应用: `` | 类型: `Class`

## 属性（9 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `user_id` | String | `text` |
| 2 | `pubUserID` | pubUserID | `user_id` | String | `text` |
| 3 | `tenant` | tenant | `tenant_id` | String | `text` |
| 4 | `ts` | ts | `user_ts` | Long | `long` |
| 5 | `typeID` | typeID | `type_id` | String | `text` |
| 6 | `userCode` | user编码 | `user_code` | String | `text` |
| 7 | `userIDDeprecated` | userIDDeprecated | `user_id` | String | `text` |
| 8 | `userId` | userID | `user_id` | String | `text` |
| 9 | `userName` | user名称 | `user_name` | String | `text` |
