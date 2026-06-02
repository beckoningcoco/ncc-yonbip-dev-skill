---
tags: [BIP, 元数据, 数据字典, pgrm.projecttask.ProjectTaskCheckitem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目活动检查项 (`pgrm.projecttask.ProjectTaskCheckitem`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `pgrm_activity_checkitem` | 应用: `PGRM` | 类型: `Class`

## 属性（21 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `actualEndDate` | actualEndDate | `actual_end_date` | String | `date` |
| 2 | `actualStartDate` | actualStartDate | `actual_start_date` | String | `date` |
| 3 | `checkFlag` | checkFlag | `checkFlag` | Short | `short` |
| 4 | `content` | content | `content` | String | `text` |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 6 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 7 | `defineCharacter` | defineCharacter | `define_character` | ad294703-45e7-44f9-914e-479df643e490 | `UserDefine` |
| 8 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 9 | `iOrder` | iOrder | `iorder` | Integer | `int` |
| 10 | `id` | ID | `id` | String | `text` |
| 11 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 13 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 14 | `planEndDate` | planEndDate | `plan_end_date` | Date | `date` |
| 15 | `projectDocumentUrl` | projectDocumentUrl | `project_document_url` | String | `link` |
| 16 | `projectId` | projectID | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 18 | `taskId` | taskID | `task_id` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 19 | `weight` | weight | `weight` | Decimal | `number` |
| 20 | `weightPercent` | weightPercent | `weight_percent` | Decimal | `number` |
| 21 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（7 个）

- `creator` -> `base.user.BipUser` ()
- `modifier` -> `base.user.BipUser` ()
- `ytenantId` -> `yht.tenant.YhtTenant` ()
- `defineCharacter` -> `pgrm.projecttask.ProjectTaskCheckitemdefineCharacterUserDefine` ()
- `projectId` -> `bd.project.ProjectVO` ()
- `orgId` -> `org.func.BaseOrg` ()
- `taskId` -> `pgrm.projecttask.ProjectScheduleTask` (0..n)
