---
tags: [BIP, 元数据, 数据字典, aa.warehouse.WarehouseStock]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 仓库库存组织关联表 (`aa.warehouse.WarehouseStock`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_warehouse_stock` | 应用: `DPMSI` | 类型: `Class`

## 属性（7 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `warehouse` | warehouse | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 3 | `isDefault` | 是否Default | `isDefault` | Boolean | `switch` |
| 4 | `org` | org | `org_id` | c1135e08-c4bf-4499-90bf-67030d1f2654 | `quote` |
| 5 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 7 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（4 个）

- `org` -> `aa.baseorg.InventoryOrgMV` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `warehouse` -> `aa.warehouse.Warehouse` (0..n)
- `tenant` -> `base.tenant.Tenant` ()
