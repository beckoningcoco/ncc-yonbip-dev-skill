---
tags: [BIP, 元数据, 数据字典, bd, bd.project.ProjectVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 项目 (`bd.project.ProjectVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_project` | 应用: `DPMPRJ` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目 |
| 物理表 | `bd_project` |
| 应用 | `DPMPRJ` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-22 22:43:01:000
- 安装来源: `/app/apdoc-basedoc/iuap-apdoc-basedoc/iuap-apdoc-basedoc/scripts/db/patch/mongodb/V7_R0_2507/0001_iuap-apdoc-basedoc_basedoc/0010_iuap_common/DML/0270_iuap_metadata/20260515-itr/202604161357_metadata_bd-project.zip`

## 术语标记

`isAssigned`, `isExtend`, `data_auth`, `isMultiCodeRule`, `MasterData`, `doc`, `DirectConnection`, `state_tag`, `tree_tag`, `isUseCondition`

## 依赖接口（6 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| BasedocIState (`BasedocIState`) | `basedoc.basedocItf.BasedocIState` | 101 | 1 |
| LogicDelete (`LogicDelete`) | `basedoc.basedocItf.LogicDelete` | 31 | 0 |
| IAuto编码 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| AuditInfo (`AuditInfo`) | `basedoc.basedocItf.AuditInfo` | 289 | 4 |
| ITree (`ITree`) | `ucfbase.ucfbaseItf.ITree` | 339 | 6 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（44 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | String | `text` | false | true |
| 2 | `orgid` | orgid | `orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` | false | true |
| 3 | `code` | 编码 | `code` | String | `text` | true | false |
| 4 | `name` | 名称 | `name` | String | `multiLanguage` | true | false |
| 5 | `objid` | objid | `objid` | String | `text` | false | true |
| 6 | `classifyid` | lassifyid | `classifyid` | 5924adca-3894-4034-85ac-3a1b9222c69d | `quote` | false | true |
| 7 | `parent` | parent | `parent_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` | false | true |
| 8 | `projectType` | 项目类型 | `project_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` | false | true |
| 9 | `deptid` | eptid(日期) | `deptid` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` | false | true |
| 10 | `person` | person | `person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` | false | true |
| 11 | `warehouseId` | warehouseId | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` | false | true |
| 12 | `planStartTime` | planStartTime(时间) | `plan_start_time` | Date | `date` | false | true |
| 13 | `planEndTime` | planEndTime(时间) | `plan_end_time` | Date | `date` | false | true |
| 14 | `planDate` | planDate(日期) | `plan_date` | Integer | `int` | false | true |
| 15 | `realStartTime` | realStartTime(时间) | `real_start_time` | Date | `date` | false | true |
| 16 | `realEndTime` | realEndTime(时间) | `real_end_time` | Date | `date` | false | true |
| 17 | `realDate` | realDate(日期) | `real_date` | Integer | `int` | false | true |
| 18 | `progress` | 进度 | `progress` | Decimal | `number` | false | true |
| 19 | `projectStatus` | 项目状态 | `project_status` | 2ae0da27-d19a-4112-9fde-4bd506b0903c | `quote` | false | true |
| 20 | `description` | 描述 | `description` | String | `multiLanguage` | false | true |
| 21 | `projectCalendar` | projectCalendar | `project_calendar` | String | `text` | false | true |
| 22 | `sysid` | sysid | `sysid` | String | `text` |  | true |
| 23 | `orderGrade` | orderGrade | `ordergrade` | Integer | `int` | false | true |
| 24 | `enable` | enable | `enable` | Integer | `int` | false | true |
| 25 | `log` | log | `log` | String | `text` | false | true |
| 26 | `orgGroupId` | orgGroupId | `org_group_id` | String | `text` | false | true |
| 27 | `objidInner` | objidInner | `objid_inner` | String | `text` | false | true |
| 28 | `dr` | 逻辑删除 | `dr` | Integer | `int` |  | true |
| 29 | `level` | level | `level` | Integer | `int` |  | true |
| 30 | `path` | path | `path` | String | `text` |  | true |
| 31 | `sort` | 排序号 | `sort_num` | Integer | `int` |  | true |
| 32 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |  | true |
| 33 | `source` | source | `source` | String | `text` | false | true |
| 34 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 35 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 36 | `defineCharacter` | efineCharacter(日期) | `defineCharacter` | eecb6187-499f-4313-a521-9afdb3990bc6 | `UserDefine` | false | true |
| 37 | `tenant` | tenant | `tenantid` | String | `text` | false | true |
| 38 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 39 | `creationtime` | reationtime | `creationtime` | DateTime | `timestamp` |  | true |
| 40 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 41 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |  | true |
| 42 | `defines` | efines(日期) | `` | 6cf2e067-d7e9-49b8-9a4c-1123560ccc00 | `` |  |  |
| 43 | `execStatus` | execStatus(状态) | `exec_status` | String | `text` | false | true |
| 44 | `projectApplyRangeList` | projectApplyRangeList | `` | e5e4db60-28a0-40ac-9fd3-af9ff0f57f51 | `` |  |  |

## 关联属性（14 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `parent` | parent | `bd.project.ProjectVO` | `parent_id` | 外键 |  |  | None |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | `creator` | 外键 |  |  | Service |  |
| 3 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 4 | `classifyid` | lassifyid | `bd.project.ProjectClassVO` | `classifyid` | 外键 |  |  | None |  |
| 5 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` | 外键 |  |  | Service |  |
| 6 | `deptid` | eptid(日期) | `bd.adminOrg.AdminOrgVO` | `deptid` | 外键 |  |  | Service |  |
| 7 | `projectType` | 项目类型 | `bd.bill.TransType` | `project_type` | 外键 |  |  | Service |  |
| 8 | `projectApplyRangeList` | projectApplyRangeList | `bd.project.ProjectApplyRange` | `` | projectApplyRangeList → projectId | 0..n | Y | None |  |
| 9 | `orgid` | orgid | `org.func.BaseOrg` | `orgid` | 外键 |  |  | Service |  |
| 10 | `defines` | efines(日期) | `bd.project.ProjectVODefine` | `` | defines → id | 1 | Y | None |  |
| 11 | `projectStatus` | 项目状态 | `prjc.projectstatus.ProjectStatus` | `project_status` | 外键 |  |  | Service |  |
| 12 | `warehouseId` | warehouseId | `aa.warehouse.Warehouse` | `warehouse_id` | 外键 |  |  | Service |  |
| 13 | `person` | person | `bd.staff.Staff` | `person` | 外键 |  |  | Service |  |
| 14 | `defineCharacter` | efineCharacter(日期) | `bd.project.ProjectVODefineCharacter` | `defineCharacter` | 外键 |  |  | None |  |

---

## SQL 示例

```sql
SELECT id, orgid, code, name, objid, classifyid, parent_id, project_type
FROM bd_project
```