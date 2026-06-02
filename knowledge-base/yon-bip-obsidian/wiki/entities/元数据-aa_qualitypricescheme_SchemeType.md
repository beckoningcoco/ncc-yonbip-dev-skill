---
tags: [BIP, 元数据, 数据字典, aa.qualitypricescheme.SchemeType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 方案分类树列 (`aa.qualitypricescheme.SchemeType`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `scheme_type` | 应用: `ycPriceCenter`

## 属性（9 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `id` | ID | `id` | Long | `long` |
| 3 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 4 | `level` | level | `level` | Integer | `int` |
| 5 | `name` | 名称 | `name` | String | `multiLanguage` |
| 6 | `parent` | parent | `parent_id` | 55cc1587-1f0f-4bd4-beae-18f37f40fb7c | `quote` |
| 7 | `path` | path | `path` | String | `text` |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 9 | `sort` | sort | `sort_num` | Integer | `int` |

## 关联（1 个）

- `parent` -> `aa.qualitypricescheme.SchemeType` () 
