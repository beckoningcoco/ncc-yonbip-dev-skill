---
tags: [BIP, 元数据, 数据字典, aa.vendor.VendorOrg]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 适用范围-弃用 (`aa.vendor.VendorOrg`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_vendororg` | 应用: `DPMSPL` | 类型: `Class`

## 属性（11 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `rangeType` | rangeType | `iRangeType` | Integer | `int` |
| 4 | `vendororg` | vendororg | `iVendorId` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 5 | `org` | org | `iOrgId` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 6 | `isCreator` | 是否Creator | `isCreator` | Boolean | `switch` |
| 7 | `isApplied` | 是否Applied | `isApplied` | Boolean | `switch` |
| 8 | `cust` | cust | `iCustID` | Long | `long` |
| 9 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 11 | `vendordetails` | vendordetails | `` | 4b6acca4-5371-4bbc-bd2f-ee3d593d8b1d | `` |

## 关联（5 个）

- `vendordetails` -> `aa.vendor.VendorDetail` (1)
- `org` -> `bd.adminOrg.BaseOrgVO` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `vendororg` -> `aa.vendor.Vendor` (0..n)
- `tenant` -> `base.tenant.Tenant` ()
