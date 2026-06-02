---
tags: [BIP, 元数据, 数据字典, pc.product.ProductApplyRangeGroup]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料适用范围组 (`pc.product.ProductApplyRangeGroup`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `product_apply_range_group` | 应用: `GZTBDM` | 类型: `Class`

## 属性（9 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `productId` | productID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 3 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 4 | `orgGroupType` | orgGroupType | `org_group_type` | String | `text` |
| 5 | `orgGroupId` | orgGroupID | `org_group_id` | 6a8af5af-0687-4254-ab87-c07e00fc8398 | `quote` |
| 6 | `productDetailId` | productDetailID | `product_detail_id` | 04616b02-47f8-4821-8c02-2e7a6d3264a8 | `quote` |
| 7 | `controlRuleVersion` | controlRuleVersion | `control_rule_version` | Integer | `int` |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 9 | `tenant` | tenant | `tenant_id` | Long | `long` |

## 关联（4 个）

- `productId` -> `pc.product.Product` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `orgGroupId` -> `pc.pub_org_group.PubOrgGroup` ()
- `productDetailId` -> `pc.product.ProductDetail` ()
