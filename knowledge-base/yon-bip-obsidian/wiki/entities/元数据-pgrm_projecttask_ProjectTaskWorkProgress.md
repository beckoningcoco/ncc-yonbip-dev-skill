---
tags: [BIP, 元数据, 数据字典, pgrm.projecttask.ProjectTaskWorkProgress]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 活动工作进展 (`pgrm.projecttask.ProjectTaskWorkProgress`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `pgrm_activity_work_progress` | 应用: `PGRM` | 类型: `Class`

## 属性（12 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `actualProgress` | actualProgress | `actual_progress` | String | `text` |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 3 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 4 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 5 | `id` | ID | `id` | String | `text` |
| 6 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 7 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 9 | `reportDate` | reportDate | `report_date` | String | `date` |
| 10 | `taskId` | taskID | `task_id` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 11 | `workDetails` | workDetails | `work_details` | String | `bigText` |
| 12 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `creator` -> `base.user.BipUser` ()
- `modifier` -> `base.user.BipUser` ()
- `ytenantId` -> `yht.tenant.YhtTenant` ()
- `taskId` -> `pgrm.projecttask.ProjectScheduleTask` (0..n)
