---
tags: [BIP, 元数据, 数据字典, hrcm.location.LocationScopeOrg]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 适用范围 (`hrcm.location.LocationScopeOrg`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `cs_location_scope_org` | 应用: `HRCM` | 类型: `Class`

## 属性（6 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `tenant` | tenant | `tenant_id` | String | `text` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 4 | `id` | ID | `id` | Long | `long` |
| 5 | `orgId` | 组织ID | `orgId` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 6 | `locationId` | locationID | `cs_location_id` | 95256905-1d37-4ca6-a37f-ddbdab4d1c25 | `quote` |

## 关联（3 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `locationId` -> `hrcm.location.Location` (0..n)
- `orgId` -> `bd.adminOrg.AdminOrgVO` ()
