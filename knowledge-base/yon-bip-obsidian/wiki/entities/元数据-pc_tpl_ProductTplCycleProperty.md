---
tags: [BIP, 元数据, 数据字典, pc.tpl.ProductTplCycleProperty]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料模板-周期购 (`pc.tpl.ProductTplCycleProperty`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `product_tpl_cycleprop` | 应用: `GZTBDM` | 类型: `Class`

## 属性（13 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `alias` | alias | `cPropertyAlias` | String | `multiLanguage` |
| 3 | `dataType` | dataType | `iDataType` | Integer | `int` |
| 4 | `isShow` | 是否Show | `iShow` | Boolean | `switch` |
| 5 | `order` | order | `iOrderNumber` | Integer | `int` |
| 6 | `propertyType` | propertyType | `iPropertyType` | 3f3e9227-cf2c-45ff-9250-91726b504cac | `quote` |
| 7 | `showType` | showType | `iPerformanceType` | String | `text` |
| 8 | `template` | template | `tpl_id` | c40d564b-d166-4e0e-875f-1fafdab28955 | `quote` |
| 9 | `values` | values | `cPromptMessage` | String | `text` |
| 10 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 11 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 13 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（4 个）

- `template` -> `pc.tpl.ProductTpl` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `propertyType` -> `pc.tpl.ProductPropertySource` ()
- `tenant` -> `base.tenant.Tenant` ()
