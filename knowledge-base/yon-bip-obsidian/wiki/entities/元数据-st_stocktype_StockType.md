---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, st.stocktype.StockType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 库存类型档案 (`st.stocktype.StockType`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_stocktype` | 应用: ``

## 属性（9 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `explanation` | explanation | `explanation` | String | `multiLanguage` |
| 3 | `id` | ID | `id` | Long | `long` |
| 4 | `isWithAvailableQtyCal` | 是否WithAvailableQtyCal | `isWithAvailableQtyCal` | Boolean | `switch` |
| 5 | `name` | 名称 | `name` | String | `multiLanguage` |
| 6 | `ownertype` | ownertype | `ownertype` | Integer | `int` |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 8 | `reservationType` | reservationType | `reservationType` | 4c3758da-bf55-4619-a4c4-138e0382edde | `quote` |
| 9 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（2 个）

- `ytenant` -> `yht.tenant.YhtTenant` () 
- `reservationType` -> `st.reservation.ReservationType` () 
