---
tags: [BIP, 元数据, 数据字典, aa.productsofstore.ProductsofStore]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 门店经营范围 (`aa.productsofstore.ProductsofStore`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_products_of_store` | 应用: `` | 类型: `Class`

## 属性（22 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `name` | 名称 | `name` | String | `multiLanguage` |
| 3 | `memo` | 备注 | `memo` | String | `multiLanguage` |
| 4 | `cust` | cust | `iCustID` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 5 | `id` | ID | `id` | Long | `long` |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 7 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 9 | `creator` | 创建人 | `creator` | String | `text` |
| 10 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 11 | `excludeProducts` | excludeProducts | `` | 742714af-c4a2-4a90-a812-1511f29cc4ae | `` |
| 12 | `modifier` | 修改人 | `modifier` | String | `text` |
| 13 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 16 | `productBrands` | productBrands | `` | 33fdcd0b-9b46-46e2-b575-d696f3e7bffa | `` |
| 17 | `productClass` | productClass | `` | ea943049-5411-4437-a5d4-4b7a708dcf7c | `` |
| 18 | `productClassDES` | productClassDES | `productClassDES` | String | `text` |
| 19 | `productbrand` | productbrand | `product_brand_id` | 33fdcd0b-9b46-46e2-b575-d696f3e7bffa | `quote` |
| 20 | `productclass` | productclass | `product_class_id` | ea943049-5411-4437-a5d4-4b7a708dcf7c | `quote` |
| 21 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 22 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（10 个）

- `productBrands` -> `aa.productsofstore.ProductBrandChild` (0..n)
- `productClass` -> `aa.productsofstore.ProductClassChild` (0..n)
- `productclass` -> `aa.productsofstore.ProductClassChild` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `productbrand` -> `aa.productsofstore.ProductBrandChild` ()
- `cust` -> `aa.merchant.Merchant` ()
- `tenant` -> `base.tenant.Tenant` ()
- `excludeProducts` -> `aa.productsofstore.ExcludeProducts` (0..n)
