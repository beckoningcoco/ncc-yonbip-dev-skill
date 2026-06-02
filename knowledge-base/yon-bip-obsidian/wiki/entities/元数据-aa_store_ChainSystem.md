---
tags: [BIP, 元数据, 数据字典, aa.store.ChainSystem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 连锁系统 (`aa.store.ChainSystem`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_chainsystem` | 应用: `Marketingpublic` | 类型: `Class`

## 属性（12 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 2 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 3 | `code` | 编码 | `code` | String | `text` |
| 4 | `name` | 名称 | `name` | String | `multiLanguage` |
| 5 | `memo` | 备注 | `memo` | String | `multiLanguage` |
| 6 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 7 | `id` | ID | `id` | Long | `long` |
| 8 | `chainSystemDefineCharacter` | chainSystemDefineCharacter | `chainSystemDefineCharacter` | 03eac2e8-1df6-40c3-b993-0fca694c5f84 | `UserDefine` |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 10 | `chainSystemArea` | chainSystemArea | `` | f00fe11c-d8f9-4173-87e8-7ba8f720f52c | `` |
| 11 | `chainSystemDefine` | chainSystemDefine | `` | e8383ac8-16cb-45d2-b4b4-1b47df249c1a | `` |
| 12 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `chainSystemArea` -> `aa.store.ChainSystemArea` (0..n)
- `chainSystemDefine` -> `aa.store.ChainSystemDefine` (1)
- `chainSystemDefineCharacter` -> `aa.store.ChainSystemDefineCharacter` ()
- `tenant` -> `base.tenant.Tenant` ()
