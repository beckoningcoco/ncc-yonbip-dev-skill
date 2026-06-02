---
tags: [BIP, 元数据, 数据字典, earap.payable.PayableApprovalTask]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 应付结算清单审批任务信息 (`earap.payable.PayableApprovalTask`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `ap_payable_b_approvaltask` | 应用: `STB`

## 属性（20 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `headerId` | headerID | `header_id` | 404676ad-786c-4ee3-9996-66b853d3bebe | `quote` |
| 2 | `approvalActivityId` | approvalActivityID | `approval_activity_id` | String | `text` |
| 3 | `approvalActivityName` | approvalActivity名称 | `approval_activity_name` | String | `text` |
| 4 | `approvalActivityResid` | approvalActivityResid | `approval_activity_resid` | String | `text` |
| 5 | `approvalComment` | approvalComment | `approval_comment` | String | `text` |
| 6 | `approvalInstId` | approvalInstID | `approval_instid` | String | `text` |
| 7 | `approvalResult` | approvalResult | `approval_result` | String | `text` |
| 8 | `approvalSign` | approvalSign | `approval_sign` | String | `text` |
| 9 | `approvalTime` | approvalTime | `approval_time` | DateTime | `dateTime` |
| 10 | `auditor` | auditor | `auditor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 12 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 13 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 14 | `id` | ID | `id` | String | `text` |
| 15 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 18 | `taskId` | taskID | `taskid` | String | `text` |
| 19 | `taskStatus` | taskStatus | `task_status` | String | `text` |
| 20 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `creator` -> `base.user.BipUser` () 
- `modifier` -> `base.user.BipUser` () 
- `auditor` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `headerId` -> `earap.payable.PayableHeader` (0..n) [废]
