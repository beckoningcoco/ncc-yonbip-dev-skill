---
tags: [BIP, 元数据, 数据字典, aa.salearea.SaleAreaApplyRange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售区域适用范围 (`aa.salearea.SaleAreaApplyRange`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_salearea_applyrange` | 应用: `DPMCUS` | 类型: `Class`

## 属性（9 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `saleArea` | saleArea | `salearea_id` | 75fb7b76-fdb5-4e87-ab0d-e4215a299634 | `quote` |
| 3 | `orgId` | 组织ID | `orgId` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 4 | `isCreator` | 是否Creator | `isCreator` | Boolean | `switch` |
| 5 | `isApplied` | 是否Applied | `isApplied` | Boolean | `switch` |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 7 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 8 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 9 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |

## 关联（4 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `saleArea` -> `aa.salearea.SaleArea` (0..n)
- `orgId` -> `bd.adminOrg.BaseOrgVO` ()
- `tenant` -> `base.tenant.Tenant` ()
