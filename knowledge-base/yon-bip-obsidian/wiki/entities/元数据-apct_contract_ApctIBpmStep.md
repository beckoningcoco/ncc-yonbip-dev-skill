---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctIBpmStep]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 合同审批业务阶段 (`apct.contract.ApctIBpmStep`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `apct_apct_ibpmstep` | 应用: `APCT`

## 属性（11 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `ctId` | ctID | `ct_id` | 84a309b9-2fd0-48d8-9b75-8251a20928c2 | `quote` |
| 2 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 3 | `stepId` | stepID | `stepid` | 9bcecb5a-ff80-4e82-9b49-67af93c7db82 | `quote` |
| 4 | `flag` | flag | `flag` | String | `text` |
| 5 | `stepparam` | stepparam | `stepparam` | String | `text` |
| 6 | `processinstId` | processinstID | `processinstid` | String | `text` |
| 7 | `stepLastModify` | stepLastModify | `stepcode_lastmodify` | DateTime | `dateTime` |
| 8 | `taskId` | taskID | `taskid` | String | `text` |
| 9 | `id` | ID | `id` | Long | `long` |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 11 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `ctId` -> `apct.contract.Apct` (0..n) 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `stepId` -> `bd.businessstep.BusinessStep` () 
- `tenant` -> `base.tenant.Tenant` () 
