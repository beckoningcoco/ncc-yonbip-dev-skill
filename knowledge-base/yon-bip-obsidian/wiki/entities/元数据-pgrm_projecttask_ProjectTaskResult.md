---
tags: [BIP, 元数据, 数据字典, pgrm.projecttask.ProjectTaskResult]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目活动成果物 (`pgrm.projecttask.ProjectTaskResult`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `pgrm_activity_result` | 应用: `PGRM` | 类型: `Class`

## 属性（21 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `acceptanceStatus` | acceptanceStatus | `acceptance_status` | Integer | `int` |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 3 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 4 | `defineCharacter` | defineCharacter | `define_character` | 7bd246f2-8cdf-4744-a12b-4e792e83cfb1 | `UserDefine` |
| 5 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 6 | `id` | ID | `id` | String | `text` |
| 7 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 8 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 9 | `mustSubmit` | mustSubmit | `must_submit` | Boolean | `switch` |
| 10 | `name` | 名称 | `name` | String | `text` |
| 11 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 12 | `projectDocumentUrl` | projectDocumentUrl | `project_document_url` | String | `link` |
| 13 | `projectId` | projectID | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 15 | `result` | result | `result` | String | `text` |
| 16 | `resultUploadFlag` | resultUploadFlag | `result_upload_flag` | Boolean | `switch` |
| 17 | `submissionTime` | submissionTime | `submission_time` | Date | `date` |
| 18 | `submitterId` | submitterID | `submitter_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 19 | `taskId` | taskID | `task_id` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 20 | `template` | template | `template` | String | `text` |
| 21 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（8 个）

- `creator` -> `base.user.BipUser` ()
- `submitterId` -> `bd.staff.Staff` ()
- `modifier` -> `base.user.BipUser` ()
- `ytenantId` -> `yht.tenant.YhtTenant` ()
- `defineCharacter` -> `pgrm.projecttask.ProjectTaskResultdefineCharacterUserDefine` ()
- `projectId` -> `bd.project.ProjectVO` ()
- `orgId` -> `org.func.BaseOrg` ()
- `taskId` -> `pgrm.projecttask.ProjectScheduleTask` (0..n)
