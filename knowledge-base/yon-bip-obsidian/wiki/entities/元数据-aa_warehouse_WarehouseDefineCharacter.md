---
tags: [BIP, 元数据, 数据字典, aa.warehouse.WarehouseDefineCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 仓库档案自定义项 (`aa.warehouse.WarehouseDefineCharacter`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_warehouse_character_define` | 应用: `DPMSI` | 类型: `Class`

## 属性（7 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `BM01` | BM01 | `vcol1` | String | `text` |
| 2 | `GA01` | GA01 | `vcol55` | String | `text` |
| 3 | `XMJGR` | XMJGR | `vcol2` | String | `text` |
| 4 | `id` | ID | `id` | String | `text` |
| 5 | `lzz0001` | lzz0001 | `vcol3` | String | `text` |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 7 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（1 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
