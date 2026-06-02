---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctIBpmApprovalTask]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 合同审批当前审批人 (`apct.contract.ApctIBpmApprovalTask`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `apct_apct_ibpmcurrentauditor` | 应用: `APCT`

## 属性（16 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `ctId` | ctID | `ct_id` | 84a309b9-2fd0-48d8-9b75-8251a20928c2 | `quote` |
| 2 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 3 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 4 | `taskId` | taskID | `taskid` | String | `text` |
| 5 | `auditor` | auditor | `auditor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 6 | `approvalActivityName` | approvalActivity名称 | `approval_activity_name` | String | `text` |
| 7 | `approvalActivityResid` | approvalActivityResid | `approval_activity_resid` | String | `text` |
| 8 | `approvalActivityId` | approvalActivityID | `approval_activity_id` | String | `text` |
| 9 | `approvalComment` | approvalComment | `approval_comment` | String | `text` |
| 10 | `approvalSign` | approvalSign | `approval_sign` | String | `text` |
| 11 | `approvalResult` | approvalResult | `approval_result` | String | `text` |
| 12 | `approvalTime` | approvalTime | `approval_time` | DateTime | `dateTime` |
| 13 | `approvalInstId` | approvalInstID | `approval_instid` | String | `text` |
| 14 | `taskStatus` | taskStatus | `task_status` | String | `text` |
| 15 | `id` | ID | `id` | Long | `long` |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |

## 关联（4 个）

- `ctId` -> `apct.contract.Apct` (0..n) 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `auditor` -> `base.user.BipUser` () 
- `tenant` -> `base.tenant.Tenant` () 
