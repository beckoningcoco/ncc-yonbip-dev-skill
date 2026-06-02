---
tags: [BIP, 元数据, 数据字典, aa.goodsposition.GoodsProductsComparison]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 货位物料对照 (`aa.goodsposition.GoodsProductsComparison`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_goodsproductscomparison` | 应用: `DPMSI`

## 属性（18 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `lookat` | lookat | `lookat` | String | `text` |
| 2 | `creator` | 创建人 | `creator` | String | `text` |
| 3 | `modifyDate` | modify日期 | `modify_date` | Date | `date` |
| 4 | `modifier` | 修改人 | `modifier` | String | `text` |
| 5 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 6 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 7 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 9 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 10 | `createDate` | create日期 | `create_date` | Date | `date` |
| 11 | `warehouseId` | warehouseID | `warehouseId` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 12 | `id` | ID | `id` | Long | `long` |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 14 | `positionId` | positionID | `position_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc | `quote` |
| 15 | `productId` | productID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 16 | `inPriority` | inPriority | `inPriority` | Integer | `int` |
| 17 | `outPriority` | outPriority | `outPriority` | Integer | `int` |
| 18 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（7 个）

- `positionId` -> `aa.goodsposition.GoodsPosition` (0..n) 
- `productId` -> `pc.product.Product` () 
- `warehouseId` -> `aa.warehouse.Warehouse` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `tenant` -> `base.tenant.Tenant` () 
