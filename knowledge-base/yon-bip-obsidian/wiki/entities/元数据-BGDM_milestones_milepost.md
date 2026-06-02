---
tags: [BIP, 元数据, 数据字典, BGDM, BGDM.milestones.project.milepost]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 项目里程碑 (`BGDM.milestones.project.milepost`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bgdm_project_milepost` | 应用: `BGDM` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目里程碑 |
| 物理表 | `bgdm_project_milepost` |
| 应用 | `BGDM` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-01-23 23:19:12:000
- 安装来源: `/app/project_dir/pm-iuapdoc-starter/scripts/db/patch/mongodb/V5_R0_2507/0001_pm-pmc-iuapdoc/0010_iuap_common/DML/0270_iuap_metadata/202512/20251225/0001/202512251402_metadata_BGDM-milestones_delta.zip`

## 术语标记

`BusinessData`, `data_auth`, `report`, `doc`

## 依赖接口（4 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IEnable (`IEnable`) | `iuap.busiObj.IEnable` | 508 | 3 |
| IAuditInfo (`IAuditInfo`) | `iuap.busiObj.IAuditInfo` | 679 | 4 |
| IYTenant (`IYTenant`) | `iuap.busiObj.IYTenant` | 214 | 1 |
| LogicDelete (`LogicDelete`) | `iuap.busiObj.LogicDelete` | 211 | 1 |

---

## 全部属性（29 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `activityNode` | activityNode | `activity_node` | String | `text` | false |  |
| 2 | `code` | 编码 | `code` | String | `text` | false |  |
| 3 | `completeStatus` | completeStatus(状态) | `complete_status` | pgrm_milestone_complete_status | `singleOption` | false |  |
| 4 | `milestoneRatio` | milestoneRatio | `milestone_ratio` | Decimal | `number` | false |  |
| 5 | `name` | 名称 | `name` | String | `text` | false |  |
| 6 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` | false |  |
| 7 | `planCompleteDate` | planCompleteDate(日期) | `plan_complete_date` | Date | `dateTime` | false |  |
| 8 | `projectCreationId` | projectCreationId | `project_creation_id` | String | `text` | false |  |
| 9 | `projectId` | projectId | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` | false |  |
| 10 | `realCompleteDate` | realCompleteDate(日期) | `real_complete_date` | Date | `dateTime` | false |  |
| 11 | `sort` | 排序号 | `sort` | Integer | `int` | false |  |
| 12 | `standardMilepostId` | standardMilepostId | `standard_milepost_id` | 057f2dea-55a5-4003-93c1-3ab6d39d47a2 | `quote` | false |  |
| 13 | `type` | type | `type` | PmMilePostType | `singleOption` | false |  |
| 14 | `categoryId` | categoryId | `category_id` | afd67656-c334-4f36-a081-b10d0de6b970 | `quote` | false |  |
| 15 | `remark` | 备注 | `remark` | String | `text` | false |  |
| 16 | `useages` | useages | `useages` | PmMilepostUseage | `multipleOption` | false |  |
| 17 | `milepostCharacter` | milepostCharacter | `milepost_character` | 663d974e-07c0-480b-9996-541273e0de7d | `UserDefine` | false |  |
| 18 | `id` | 主键ID | `id` | String | `text` |  | true |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | true |
| 20 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | true |
| 21 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 22 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 23 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | true |
| 24 | `disablets` | isablets(日期) | `disablets` | DateTime | `dateTime` |  | true |
| 25 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |  | true |
| 26 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |  | true |
| 27 | `ytenantId` | ytenantId | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |
| 28 | `dr` | 逻辑删除 | `dr` | Short | `short` |  | true |
| 29 | `activity` | activity | `activity_id` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` | false |  |

## 关联属性（9 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` | 外键 |  |  | Service |  |
| 2 | `activity` | activity | `pgrm.projecttask.ProjectScheduleTask` | `activity_id` | 外键 |  |  | Service | false |
| 3 | `milepostCharacter` | milepostCharacter | `BGDM.milestones.MilepostDefineCharacter` | `milepost_character` | 外键 |  |  | None | false |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` | 外键 |  |  | Service |  |
| 5 | `standardMilepostId` | standardMilepostId | `BGDM.milestones.project_milepost` | `standard_milepost_id` | 外键 |  |  | None | false |
| 6 | `ytenantId` | ytenantId | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 7 | `projectId` | projectId | `bd.project.ProjectVO` | `project_id` | 外键 |  |  | Service | false |
| 8 | `categoryId` | categoryId | `BGDM.milestones.milestoneCategory` | `category_id` | 外键 |  |  | None | false |
| 9 | `orgId` | 组织ID | `org.func.BaseOrg` | `org_id` | 外键 |  |  | Service | false |

---

## SQL 示例

```sql
SELECT activity_node, code, complete_status, milestone_ratio, name, org_id, plan_complete_date, project_creation_id
FROM bgdm_project_milepost
```