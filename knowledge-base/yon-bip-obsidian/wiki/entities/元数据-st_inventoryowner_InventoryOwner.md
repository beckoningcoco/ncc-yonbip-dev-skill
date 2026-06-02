---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, st.inventoryowner.InventoryOwner]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
parent_entity: st.purinrecord.PurInRecord
---
# 货主对象 (`st.inventoryowner.InventoryOwner`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `inventoryowner` | 应用: ``

## 属性（9 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `customer` | customer | `customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 3 | `id` | ID | `id` | Long | `long` |
| 4 | `name` | 名称 | `name` | String | `text` |
| 5 | `ownertype` | ownertype | `ownertype` | Integer | `int` |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 7 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 8 | `vendor` | vendor | `vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 9 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `ytenant` -> `yht.tenant.YhtTenant` () 
- `vendor` -> `aa.vendor.Vendor` () 
- `tenant` -> `base.tenant.Tenant` () 
- `customer` -> `aa.merchant.Merchant` () 
