---
tags: [BIP, 元数据, 数据字典, pc.product.ProductCheckFreeExtend]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# (停用)指定核算的规格 (`pc.product.ProductCheckFreeExtend`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `productcheckfreenew` | 应用: `GZTBDM` | 类型: `Class`

## 属性（10 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `tenant` | tenant | `tenant_id` | Long | `long` |
| 4 | `productId` | productID | `productId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 5 | `productApplyRangeId` | productApplyRangeID | `productApplyRangeId` | ed1f55f2-a3f7-4617-8bd2-7f2f404843ab | `quote` |
| 6 | `freeType` | freeType | `iFreeType` | Short | `short` |
| 7 | `freeId` | freeID | `freeId` | 8420b5e5-7919-41ca-a192-7b8c4fb1d8b8 | `quote` |
| 8 | `checked` | checked | `bChecked` | Boolean | `switch` |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 10 | `isCreator` | 是否Creator | `isCreator` | Boolean | `switch` |

## 关联（4 个）

- `freeId` -> `pc.userdef.UserDefineClass` ()
- `productApplyRangeId` -> `pc.product.ProductApplyRange` ()
- `productId` -> `pc.product.Product` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
