---
tags: [BIP, 元数据, 数据字典, bd.timezonelanguage.TimeZoneVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 时区 (`bd.timezonelanguage.TimeZoneVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `sdm_utc_time_base_with_name` | 应用: `DPMPI` | 类型: `Class`

## 属性（15 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `auto_id` | auto_id | `auto_id` | String | `text` |
| 2 | `city` | city | `city` | String | `multiLanguage` |
| 3 | `cityserid` | cityserid | `cityserid` | String | `text` |
| 4 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 5 | `id` | ID | `pk` | String | `text` |
| 6 | `introduction` | introduction | `introduction` | String | `text` |
| 7 | `off_set` | off_set | `off_set` | String | `text` |
| 8 | `pk` | pk | `pk` | String | `text` |
| 9 | `standard` | standard | `standard` | String | `text` |
| 10 | `sys_id` | sys_id | `sys_id` | String | `text` |
| 11 | `tenant_id` | tenant_id | `tenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 12 | `timename` | timename | `timename` | String | `multiLanguage` |
| 13 | `timenameserid` | timenameserid | `timenameserid` | String | `text` |
| 14 | `ts` | ts | `ts` | Long | `long` |
| 15 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（2 个）

- `tenant_id` -> `yht.tenant.YhtTenant` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
