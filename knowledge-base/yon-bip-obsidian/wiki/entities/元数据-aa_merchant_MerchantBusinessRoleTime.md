---
tags: [BIP, 元数据, 数据字典, aa.merchant.MerchantBusinessRoleTime]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务角色时间 (`aa.merchant.MerchantBusinessRoleTime`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `merchantbusinessroletime` | 应用: `DPMCUS` | 类型: `Class`

## 属性（9 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 2 | `id` | ID | `id` | Long | `long` |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 4 | `merchantId` | merchantID | `imerchantId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 5 | `businessRole` | businessRole | `cBusinessRole` | String | `text` |
| 6 | `ActivationTime` | ActivationTime | `ActivationTime` | DateTime | `timestamp` |
| 7 | `DisableTime` | DisableTime | `DisableTime` | DateTime | `timestamp` |
| 8 | `RoleTimeStopstatus` | RoleTimeStopstatus | `cRoleTimeStopstatus` | Boolean | `switch` |
| 9 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（3 个）

- `merchantId` -> `aa.merchant.Merchant` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `tenant` -> `base.tenant.Tenant` ()
