---
tags: [BIP, 元数据, 数据字典, aa.qualitypricescheme.ApplicableOrganization]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 优质优价方案适用组织表 (`aa.qualitypricescheme.ApplicableOrganization`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `cpu_qualityprice_applicable_organization` | 应用: `ycPriceCenter`

## 属性（7 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `number` | number | `number` | String | `text` |
| 3 | `organizationId` | organizationID | `organization_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 4 | `vendorId` | vendorID | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 5 | `priceSchemeId` | priceSchemeID | `price_scheme_id` | c7cc8895-2b03-4c7d-a327-da6e09410f76 | `quote` |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 7 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `organizationId` -> `org.func.BaseOrg` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `vendorId` -> `aa.vendor.Vendor` () 
- `priceSchemeId` -> `aa.qualitypricescheme.QualitypriceScheme` (1..n) 
