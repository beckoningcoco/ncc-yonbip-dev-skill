---
tags: [BIP, 元数据, 数据字典, pgrm.projecttask.ProjectScheduleTaskLinks]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目活动链接 (`pgrm.projecttask.ProjectScheduleTaskLinks`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `pgrm_activity_links` | 应用: `PGRM` | 类型: `Class`

## 属性（14 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `address` | address | `address` | String | `text` |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 3 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 4 | `defineCharacter` | defineCharacter | `define_character` | 2fcbece7-1e58-4a90-b348-2e862e6af800 | `UserDefine` |
| 5 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 6 | `id` | ID | `id` | String | `text` |
| 7 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 8 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 9 | `name` | 名称 | `name` | String | `text` |
| 10 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 11 | `projectId` | projectID | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 13 | `taskId` | taskID | `task_id` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 14 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（7 个）

- `creator` -> `base.user.BipUser` ()
- `modifier` -> `base.user.BipUser` ()
- `ytenantId` -> `yht.tenant.YhtTenant` ()
- `defineCharacter` -> `pgrm.projecttask.ProjectScheduleTaskLinksdefineCharacterUserDefine` ()
- `projectId` -> `bd.project.ProjectVO` ()
- `orgId` -> `org.func.BaseOrg` ()
- `taskId` -> `pgrm.projecttask.ProjectScheduleTask` (0..n)
