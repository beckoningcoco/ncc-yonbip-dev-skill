---
tags: [BIP, 元数据, 数据字典, pc.product.ProductAssistClass]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料辅助分类 (`pc.product.ProductAssistClass`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `productassistclass` | 应用: `GZTBDM` | 类型: `Class`

## 属性（6 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `productClassId` | productClassID | `productClassId` | 5ad8fc93-4e6b-409f-a70f-462efa6fcee9 | `quote` |
| 4 | `productId` | productID | `productId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 6 | `tenant` | tenant | `tenant_id` | Long | `long` |

## 关联（3 个）

- `productClassId` -> `pc.cls.PresentationClass` ()
- `productId` -> `pc.product.Product` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
