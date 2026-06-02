---
tags: [BIP, 元数据, 数据字典, aa.vendor.Crowd]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 组织群 (`aa.vendor.Crowd`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_crowd` | 应用: `DPMSPL` | 类型: `Class`

## 属性（6 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `md5String` | md5String | `md5String` | String | `text` |
| 2 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 3 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 4 | `id` | ID | `id` | Long | `long` |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 6 | `crowdOrgs` | crowdOrgs | `` | cbc36a92-9cc0-4552-9b67-2f0785d38da5 | `` |

## 关联（3 个）

- `crowdOrgs` -> `aa.vendor.CrowdOrg` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `tenant` -> `base.tenant.Tenant` ()
