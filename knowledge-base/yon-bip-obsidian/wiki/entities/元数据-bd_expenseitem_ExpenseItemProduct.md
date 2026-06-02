---
tags: [BIP, 元数据, 数据字典, bd.expenseitem.ExpenseItemProduct]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料维护 (`bd.expenseitem.ExpenseItemProduct`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_expenseitem_product` | 应用: `DPMACCT` | 类型: `Class`

## 属性（14 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `expense` | expense | `expense` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 3 | `product` | product | `product` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 4 | `creator` | 创建人 | `creator` | String | `text` |
| 5 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 6 | `ytenant` | ytenant | `ytenant_id` | String | `text` |
| 7 | `modifier` | 修改人 | `modifier` | String | `text` |
| 8 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 9 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 13 | `tenant` | tenant | `tenant_id` | Long | `long` |
| 14 | `createDate` | 创建日期 | `create_date` | Date | `date` |

## 关联（4 个）

- `product` -> `pc.product.Product` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `expense` -> `bd.expenseitem.ExpenseItem` (0..n)
