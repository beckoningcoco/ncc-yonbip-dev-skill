---
tags: [BIP, 元数据, 数据字典, aa.store.StoreCategory]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 终端分类 (`aa.store.StoreCategory`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_store_category` | 应用: `Marketingpublic` | 类型: `Class`

## 属性（13 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `name` | 名称 | `name` | String | `text` |
| 3 | `note` | note | `note` | String | `text` |
| 4 | `id` | ID | `id` | Long | `long` |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 6 | `enabled` | enabled | `enabled` | EnableStatus | `` |
| 7 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 8 | `level` | 层级 | `level` | Integer | `int` |
| 9 | `parent` | parent | `parent_id` | Long | `long` |
| 10 | `path` | path | `path` | String | `text` |
| 11 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 12 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 13 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（2 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `tenant` -> `base.tenant.Tenant` ()
