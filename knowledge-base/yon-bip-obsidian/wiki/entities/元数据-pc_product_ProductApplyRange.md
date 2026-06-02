---
tags: [BIP, 元数据, 数据字典, pc.product.ProductApplyRange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料适用范围 (`pc.product.ProductApplyRange`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `productapplyrange` | 应用: `GZTBDM` | 类型: `Class`

## 属性（33 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `productId` | productID | `productId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 3 | `orgId` | 组织ID | `orgId` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 4 | `isCreator` | 是否Creator | `isCreator` | Boolean | `switch` |
| 5 | `customerId` | customerID | `customerId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 6 | `shopId` | shopID | `shopId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 7 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 8 | `rangeType` | rangeType | `iRangeType` | Integer | `int` |
| 9 | `productDetailId` | productDetailID | `productDetailId` | 04616b02-47f8-4821-8c02-2e7a6d3264a8 | `quote` |
| 10 | `isApplied` | 是否Applied | `isApplied` | Boolean | `switch` |
| 11 | `controlRuleVersion` | controlRuleVersion | `control_rule_version` | Integer | `int` |
| 12 | `productDepositTimeDetailId` | productDepositTimeDetailID | `productDepositTimeDetailId` | 50af4617-0d26-41d3-a575-2fda1f544f2d | `quote` |
| 13 | `allocatorId` | allocatorID | `allocator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 14 | `allocatorName` | allocator名称 | `allocator_name` | String | `text` |
| 15 | `allocateTime` | allocateTime | `allocate_time` | DateTime | `timestamp` |
| 16 | `allocateSource` | allocateSource | `allocate_source` | String | `text` |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 18 | `tenant` | tenant | `tenant_id` | Long | `long` |
| 19 | `defaultSKUAppliedOrderProperties` | defaultSKUAppliedOrderProperties | `` | 61b929f0-9b2e-438e-82d4-a4e978a184b9 | `` |
| 20 | `productAppliedCheckFrees` | productAppliedCheckFrees | `` | bcb694ee-d969-4710-bb46-08706acc274d | `` |
| 21 | `productAppliedDetail` | productAppliedDetail | `` | e873b2d5-4a69-482e-8a7a-c73169af0141 | `` |
| 22 | `productAppliedParams` | productAppliedParams | `` | 46da793c-26de-428f-a75a-a4d667dd5730 | `` |
| 23 | `productAppliedSpecFrees` | productAppliedSpecFrees | `` | bcb694ee-d969-4710-bb46-08706acc274d | `` |
| 24 | `productAppliedTags` | productAppliedTags | `` | 989442f5-0227-438b-8de5-9aa2bdbf9b71 | `` |
| 25 | `productAppliedTime` | productAppliedTime | `` | 88c5a1fa-bafc-452a-a76b-f611f76cb30f | `` |
| 26 | `productCheckFreeNew` | productCheckFreeNew | `` | 0c671a67-be50-4853-af7d-34a328fbbe7d | `` |
| 27 | `productLoadWay` | productLoadWay | `` | 3c00f201-5ce7-4cfc-bc56-d214ae327f98 | `` |
| 28 | `productParameters` | productParameters | `` | a17ec282-d9c6-4beb-bdd2-e810bf87ce73 | `` |
| 29 | `productSkuOrderProperty` | productSkuOrderProperty | `` | a810167f-b9ce-465d-ae5d-de40bc42b82f | `` |
| 30 | `productSpecFreeNew` | productSpecFreeNew | `` | 0c671a67-be50-4853-af7d-34a328fbbe7d | `` |
| 31 | `productTagNew` | productTagNew | `` | c77e6af7-abba-4d81-9421-c276c46aab7f | `` |
| 32 | `skuAppliedTags` | skuAppliedTags | `` | 2a8fa712-87c2-4673-b2de-338c09dc73d3 | `` |
| 33 | `skuTagNew` | skuTagNew | `` | 3fa4d3ea-fbf8-4f49-8b4f-9af7d282a8f6 | `` |

## 关联（23 个）

- `productAppliedTags` -> `pc.product.ProductTag` (0..n)
- `productAppliedCheckFrees` -> `pc.product.ProductCheckFree` (0..n)
- `productSpecFreeNew` -> `pc.product.ProductCheckFreeNew` (0..n)
- `productTagNew` -> `pc.product.ProductTagNew` (0..n)
- `productId` -> `pc.product.Product` (0..n)
- `productCheckFreeNew` -> `pc.product.ProductCheckFreeNew` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `productAppliedDetail` -> `pc.product.ProductApplyRangeDetail` (1)
- `defaultSKUAppliedOrderProperties` -> `pc.product.SKUOrderProperty` (0..n)
- `productDepositTimeDetailId` -> `pc.product.ProductDepositTimeDetail` ()
- `allocatorId` -> `base.user.User` ()
- `productLoadWay` -> `pc.product.ProductLoadWay` (0..n)
- `productAppliedSpecFrees` -> `pc.product.ProductCheckFree` (0..n)
- `orgId` -> `bd.adminOrg.BaseOrgVO` ()
- `productAppliedParams` -> `pc.product.ProductParameter` (0..n)
- `productSkuOrderProperty` -> `pc.product.ProductSkuOrderProperty` (0..n)
- `skuTagNew` -> `pc.product.SkuTagNew` (0..n)
- `skuAppliedTags` -> `pc.product.SKUTag` (0..n)
- `productParameters` -> `pc.product.ProductParameters` (0..n)
- `customerId` -> `aa.merchant.Merchant` ()
- `shopId` -> `aa.merchant.Merchant` ()
- `productAppliedTime` -> `pc.product.ProductDepositTime` (1)
- `productDetailId` -> `pc.product.ProductDetail` ()
