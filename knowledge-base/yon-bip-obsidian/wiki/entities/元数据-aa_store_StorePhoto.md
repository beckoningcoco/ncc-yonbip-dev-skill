---
tags: [BIP, 元数据, 数据字典, aa.store.StorePhoto]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 门店相册 (`aa.store.StorePhoto`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_storephoto` | 应用: `Marketingpublic` | 类型: `Class`

## 属性（10 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `url` | url | `cUrl` | String | `text` |
| 2 | `desc` | desc | `cDesc` | String | `text` |
| 3 | `store` | store | `iStoreID` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |
| 4 | `sort` | 排序 | `iSort` | Integer | `int` |
| 5 | `type` | type | `cType` | String | `text` |
| 6 | `size` | size | `cSize` | String | `text` |
| 7 | `name` | 名称 | `cName` | String | `text` |
| 8 | `id` | ID | `id` | Long | `long` |
| 9 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |
| 10 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（2 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `store` -> `aa.store.Store` (0..n)
