---
tags: [BIP, 元数据, 数据字典, pc.product.ProductLoadWay]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料装载方式(整合) (`pc.product.ProductLoadWay`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `productloadway` | 应用: `GZTBDM` | 类型: `Class`

## 属性（8 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `productId` | productID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 4 | `productApplyRangeId` | productApplyRangeID | `product_apply_range_id` | ed1f55f2-a3f7-4617-8bd2-7f2f404843ab | `quote` |
| 5 | `productDetailId` | productDetailID | `product_detail_id` | 04616b02-47f8-4821-8c02-2e7a6d3264a8 | `quote` |
| 6 | `loadWay` | loadWay | `load_way` | 3b73800a-106b-41bb-8960-826a7f003aaa | `quote` |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 8 | `tenant` | tenant | `tenant_id` | Long | `long` |

## 关联（5 个）

- `productApplyRangeId` -> `pc.product.ProductApplyRange` (0..n)
- `productId` -> `pc.product.Product` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `loadWay` -> `base.loadway.LoadWay` ()
- `productDetailId` -> `pc.product.ProductDetail` (0..n)
