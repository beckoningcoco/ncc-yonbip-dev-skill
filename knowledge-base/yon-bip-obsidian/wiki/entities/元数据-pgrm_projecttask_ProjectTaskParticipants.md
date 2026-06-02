---
tags: [BIP, 元数据, 数据字典, pgrm.projecttask.ProjectTaskParticipants]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目活动参与人 (`pgrm.projecttask.ProjectTaskParticipants`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `pgrm_activity_participants` | 应用: `PGRM` | 类型: `Class`

## 属性（21 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 4 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 5 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 6 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 7 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 8 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 9 | `isExternalPerson` | 是否ExternalPerson | `is_external_person` | commonFlag | `singleOption` |
| 10 | `planLaborCost` | planLaborCost | `plan_labor_cost` | Decimal | `number` |
| 11 | `planHours` | planHours | `plan_hours` | Integer | `int` |
| 12 | `userId` | userID | `user_id` | String | `text` |
| 13 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 14 | `rankRate` | rankRate | `rank_rate` | Decimal | `number` |
| 15 | `planStartDate` | planStartDate | `plan_start_date` | Date | `date` |
| 16 | `defineCharacter` | defineCharacter | `define_character` | 82e10c63-0b75-49d3-bfec-afbfc0e4cc08 | `UserDefine` |
| 17 | `planEndDate` | planEndDate | `plan_end_date` | Date | `date` |
| 18 | `projectId` | projectID | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 19 | `taskId` | taskID | `task_id` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 20 | `memberId` | memberID | `member_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 21 | `participatingEnterprise` | participatingEnterprise | `participating_enterprise_id` | f730d346-ca82-43e3-bbe3-ce0bb1a32530 | `quote` |

## 关联（9 个）

- `participatingEnterprise` -> `PRJC.projectParticipant.ProjectParticipant` ()
- `creator` -> `base.user.BipUser` ()
- `modifier` -> `base.user.BipUser` ()
- `ytenantId` -> `yht.tenant.YhtTenant` ()
- `defineCharacter` -> `pgrm.projecttask.ProjectTaskParticipantsdefineCharacterUserDefine` ()
- `projectId` -> `bd.project.ProjectVO` ()
- `orgId` -> `org.func.BaseOrg` ()
- `taskId` -> `pgrm.projecttask.ProjectScheduleTask` (0..n)
- `memberId` -> `bd.staff.Staff` ()
