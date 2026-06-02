---
tags: [BIP, 元数据, 数据字典, bd.accpurpose.PurposeAccbodyMappingVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 核算目的会计主体关联表 (`bd.accpurpose.PurposeAccbodyMappingVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_purpose_accbody_mapping` | 应用: `FP`

## 属性（6 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `accbody` | accbody | `accbody` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | `quote` |
| 2 | `accpurpose` | accpurpose | `accpurpose` | 637f4637-0862-4167-a2bf-ef52818ca9d9 | `quote` |
| 3 | `id` | ID | `id` | Long | `long` |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 5 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 6 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `ytenant` -> `yht.tenant.YhtTenant` () 
- `accpurpose` -> `bd.accpurpose.AccPurposeVO` (0..n) 
- `accbody` -> `bd.virtualaccbody.VirtualAccbody_view` () 
- `tenant` -> `base.tenant.Tenant` () 
