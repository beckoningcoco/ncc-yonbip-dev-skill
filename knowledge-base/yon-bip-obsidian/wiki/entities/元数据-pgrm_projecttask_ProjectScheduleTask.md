---
tags: [BIP, 元数据, 数据字典, pgrm, pgrm.projecttask.ProjectScheduleTask]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 项目活动 (`pgrm.projecttask.ProjectScheduleTask`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `pgrm_activity` | 应用: `PGRM` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目活动 |
| 物理表 | `pgrm_activity` |
| 应用 | `PGRM` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-23 01:03:33:000
- 安装来源: `/app/project_dir/project-me-starter/scripts/db/patch/mongodb/V5_R0_2507/0001_pm-pmc-project-me/0010_iuap_common/DML/0270_iuap_metadata/202604/pgrm/pgrm_project_task_import/202604131002_metadata_pgrm-projecttask.zip`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`, `doc`

## 依赖接口（5 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| BustypeItf (`BustypeItf`) | `iuap.busiObj.BustypeItf` | 160 | 1 |
| IAuditInfo (`IAuditInfo`) | `iuap.busiObj.IAuditInfo` | 679 | 4 |
| IYTenant (`IYTenant`) | `iuap.busiObj.IYTenant` | 214 | 1 |
| 编码 (`Code`) | `iuap.busiObj.Code` | 223 | 1 |
| LogicDelete (`LogicDelete`) | `iuap.busiObj.LogicDelete` | 211 | 1 |

---

## 全部属性（81 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `actualEndDate` | 实际结束日期 | `actual_end_date` | Date | `date` | false |  |
| 2 | `actualStartDate` | 实际开始日期 | `actual_start_date` | Date | `date` | false |  |
| 3 | `actualTime` | actualTime(时间) | `actual_time` | Integer | `int` | false |  |
| 4 | `applyActivityId` | applyActivityId | `apply_activity_id` | Long | `long` | false |  |
| 5 | `applyAmount` | applyAmount | `apply_amount` | Decimal | `number` | false |  |
| 6 | `billMakeTime` | billMakeTime(时间) | `bill_make_time` | Date | `dateTime` | false |  |
| 7 | `billMaker` | billMaker | `bill_maker` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` | false |  |
| 8 | `bustype` | bustype | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` | false | true |
| 9 | `code` | 编码 | `code` | String | `text` | false | true |
| 10 | `completionRatio` | ompletionRatio | `completion_ratio` | Decimal | `number` | false |  |
| 11 | `createrId` | createrId | `creater_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` | false |  |
| 12 | `departmentId` | departmentId | `department_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` | false |  |
| 13 | `disablets` | isablets(日期) | `disablets` | Date | `dateTime` | false |  |
| 14 | `distributeType` | distributeType(类型) | `distribute_type` | Integer | `int` | false |  |
| 15 | `effectFlag` | effectFlag | `effect_flag` | Boolean | `switch` | false |  |
| 16 | `enable` | enable | `enable` | enableStatus | `singleOption` | false |  |
| 17 | `enablets` | enablets | `enablets` | Date | `dateTime` | false |  |
| 18 | `externalSysDataCode` | externalSysData编码 | `external_sys_data_code` | String | `text` | false |  |
| 19 | `externalSysDataPk` | externalSysDataPk | `external_sys_data_pk` | String | `text` | false |  |
| 20 | `externalSysDataPubts` | externalSysDataPubts | `external_sys_data_pubts` | Date | `dateTime` | false |  |
| 21 | `externalSysDataStatus` | externalSysDataStatus(状态) | `external_sys_data_status` | String | `text` | false |  |
| 22 | `externalSysDataVersion` | externalSysDataVersion | `external_sys_data_version` | String | `text` | false |  |
| 23 | `floatingTime` | floatingTime(时间) | `floating_time` | Integer | `int` | false |  |
| 24 | `id` | 主键ID | `id` | Long | `long` | false | true |
| 25 | `integrationSystemCode` | integrationSystem编码 | `integration_system_code` | String | `text` | false |  |
| 26 | `joinNetworkMethod` | joinNetworkMethod | `join_network_method` | String | `text` | false |  |
| 27 | `latestEndDateInNetwork` | latestEndDateInNetwork | `latest_end_date_in_network` | Date | `dateTime` | false |  |
| 28 | `level` | level | `level` | Integer | `int` | false |  |
| 29 | `milestoneFlag` | milestoneFlag | `milestone_flag` | schedule_milestone | `singleOption` | false |  |
| 30 | `milestonePoint` | milestonePoint | `milestone_point` | String | `text` | false |  |
| 31 | `milestoneRatio` | milestoneRatio | `milestone_ratio` | Decimal | `number` | false |  |
| 32 | `networkId` | networkId | `network_id` | String | `text` | false |  |
| 33 | `node` | node | `node` | String | `text` | false |  |
| 34 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` | false |  |
| 35 | `payAmount` | payAmount | `pay_amount` | Decimal | `number` | false |  |
| 36 | `planEarlyEndDate` | planEarlyEndDate(日期) | `plan_early_end_date` | Date | `dateTime` | false |  |
| 37 | `planEarlyStartDate` | planEarlyStartDate(日期) | `plan_early_start_date` | Date | `dateTime` | false |  |
| 38 | `planEndDate` | 计划结束日期 | `plan_end_date` | Date | `date` | false |  |
| 39 | `planHours` | planHours | `plan_hours` | Decimal | `number` | false |  |
| 40 | `planLatestEndDate` | planLatestEndDate(日期) | `plan_latest_end_date` | Date | `dateTime` | false |  |
| 41 | `planLatestStartDate` | planLatestStartDate(日期) | `plan_latest_start_date` | Date | `dateTime` | false |  |
| 42 | `planStartDate` | 计划开始日期 | `plan_start_date` | Date | `date` | false |  |
| 43 | `planTime` | planTime(时间) | `plan_time` | Integer | `int` | false |  |
| 44 | `preWBSCode` | preWBS编码 | `pre_wbs_code` | String | `text` | false |  |
| 45 | `predicateEndDate` | predicateEndDate(日期) | `predicate_end_date` | Date | `dateTime` | false |  |
| 46 | `predicateStartDate` | predicateStartDate(日期) | `predicate_start_date` | Date | `dateTime` | false |  |
| 47 | `predicateTime` | predicateTime(时间) | `predicate_time` | Integer | `int` | false |  |
| 48 | `priority` | 优先级 | `priority` | Short | `short` | false |  |
| 49 | `productId` | productId | `product_id` | String | `text` | false |  |
| 50 | `projectId` | projectId | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` | false |  |
| 51 | `projectScheduleTaskDefineCharacter` | projectScheduleTaskDefineCharacter | `project_schedule_task_define_character` | 023490f7-e19a-4b1a-ae06-ac3cafeb2beb | `UserDefine` | false |  |
| 52 | `reasonForCompletionDelay` | reasonForCompletionDelay | `reason_for_completion_delay` | String | `text` | false |  |
| 53 | `reasonForStartingDelay` | reasonForStartingDelay | `reason_for_starting_delay` | String | `text` | false |  |
| 54 | `remark` | 备注 | `remark` | String | `text` | false |  |
| 55 | `responsibleId` | responsibleId | `responsible_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` | false |  |
| 56 | `scheduleId` | scheduleId | `schedule_id` | String | `text` | false |  |
| 57 | `scheduleItemId` | scheduleItemId | `schedule_item_id` | 992ac0ab-4ad3-40bd-b1c1-7e2368056423 | `quote` | false |  |
| 58 | `serial` | serial | `serial` | Integer | `int` | false |  |
| 59 | `sourceId` | sourceId | `source_id` | String | `text` | false |  |
| 60 | `supplierId` | supplierId | `supplier_id` | String | `text` | false |  |
| 61 | `taskName` | 任务名称 | `task_name` | String | `text` | false |  |
| 62 | `taskStatus` | 任务状态 | `task_status` | pm_task_status | `singleOption` | false |  |
| 63 | `tempId` | tempId | `temp_id` | String | `text` | false |  |
| 64 | `tplItemId` | tplItemId | `tpl_item_id` | String | `text` | false |  |
| 65 | `wbsDocId` | wbsDocId | `wbs_doc_id` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` | false |  |
| 66 | `standardMilepostId` | standardMilepostId | `standard_milepost_id` | 057f2dea-55a5-4003-93c1-3ab6d39d47a2 | `quote` | false |  |
| 67 | `participatingEnterprise` | participatingEnterprise | `participating_enterprise_id` | f730d346-ca82-43e3-bbe3-ce0bb1a32530 | `quote` | false |  |
| 68 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | true |
| 69 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | true |
| 70 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 71 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 72 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | true |
| 73 | `ytenantId` | ytenantId | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |
| 74 | `dr` | 逻辑删除 | `dr` | Short | `short` |  | true |
| 75 | `projectTaskMaterial` | projectTaskMaterial | `` | 37f9763d-fb18-4bad-aa8f-2105ba309100 | `` |  |  |
| 76 | `projectTaskWorkProgressList` | projectTaskWorkProgressList | `` | 19619aa6-b9e2-45f3-87e7-932dbb85ff1b | `` |  |  |
| 77 | `projectTaskResult` | projectTaskResult | `` | 4ece26cf-d02d-40ef-8b06-5ff2d6216d77 | `` |  |  |
| 78 | `checkitem` | heckitem | `` | abd077c7-c782-4abe-958e-37cbb9ca6d88 | `` |  |  |
| 79 | `projectScheduleTaskLinks` | projectScheduleTaskLinks | `` | aefc7ec0-439e-430b-9402-4a5c17f24b48 | `` |  |  |
| 80 | `projectTaskWorkCenterList` | projectTaskWorkCenterList | `` | 8b8a89c8-dab5-4872-9f22-ff474d1a7de4 | `` |  |  |
| 81 | `projectTaskParticipants` | projectTaskParticipants | `` | 419687bb-619e-42ce-92a1-187a6e8579d2 | `` |  |  |

## 关联属性（22 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` | 外键 |  |  | Service |  |
| 2 | `projectTaskWorkCenterList` | projectTaskWorkCenterList | `pgrm.projecttask.ProjectTaskWorkCenter` | `` | projectTaskWorkCenterList → taskId | 0..n | Y | None |  |
| 3 | `scheduleItemId` | scheduleItemId | `pgrm.projectschedule.ProjectScheduleItem` | `schedule_item_id` | 外键 |  |  | None | false |
| 4 | `projectTaskResult` | projectTaskResult | `pgrm.projecttask.ProjectTaskResult` | `` | projectTaskResult → taskId | 0..n | Y | None |  |
| 5 | `departmentId` | departmentId | `bd.adminOrg.AdminOrgVO` | `department_id` | 外键 |  |  | Service | false |
| 6 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` | 外键 |  |  | Service |  |
| 7 | `ytenantId` | ytenantId | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 8 | `bustype` | bustype | `bd.bill.TransType` | `bustype` | 外键 |  |  | Service | false |
| 9 | `orgId` | 组织ID | `org.func.BaseOrg` | `org_id` | 外键 |  |  | Service | false |
| 10 | `projectScheduleTaskLinks` | projectScheduleTaskLinks | `pgrm.projecttask.ProjectScheduleTaskLinks` | `` | projectScheduleTaskLinks → taskId | 0..n | Y | None |  |
| 11 | `checkitem` | heckitem | `pgrm.projecttask.ProjectTaskCheckitem` | `` | checkitem → taskId | 0..n | Y | None |  |
| 12 | `participatingEnterprise` | participatingEnterprise | `PRJC.projectParticipant.ProjectParticipant` | `participating_enterprise_id` | 外键 |  |  | None | false |
| 13 | `projectTaskWorkProgressList` | projectTaskWorkProgressList | `pgrm.projecttask.ProjectTaskWorkProgress` | `` | projectTaskWorkProgressList → taskId | 0..n | Y | None |  |
| 14 | `projectScheduleTaskDefineCharacter` | projectScheduleTaskDefineCharacter | `PGRM.PGRM.ActivityCharacter` | `project_schedule_task_define_character` | 外键 |  |  | None | false |
| 15 | `wbsDocId` | wbsDocId | `BGDM.wbs.wbs_doc` | `wbs_doc_id` | 外键 |  |  | Service | false |
| 16 | `billMaker` | billMaker | `bd.staff.Staff` | `bill_maker` | 外键 |  |  | Service | false |
| 17 | `standardMilepostId` | standardMilepostId | `BGDM.milestones.project_milepost` | `standard_milepost_id` | 外键 |  |  | Service | false |
| 18 | `responsibleId` | responsibleId | `bd.staff.Staff` | `responsible_id` | 外键 |  |  | Service | false |
| 19 | `createrId` | createrId | `bd.staff.Staff` | `creater_id` | 外键 |  |  | Service | false |
| 20 | `projectId` | projectId | `bd.project.ProjectVO` | `project_id` | 外键 |  |  | Service | false |
| 21 | `projectTaskMaterial` | projectTaskMaterial | `pgrm.projecttask.ProjectTaskMaterial` | `` | projectTaskMaterial → projectScheduleTaskId | 0..n | Y | None |  |
| 22 | `projectTaskParticipants` | projectTaskParticipants | `pgrm.projecttask.ProjectTaskParticipants` | `` | projectTaskParticipants → taskId | 0..n | Y | None |  |

---

## SQL 示例

```sql
SELECT actual_end_date, actual_start_date, actual_time, apply_activity_id, apply_amount, bill_make_time, bill_maker, bustype
FROM pgrm_activity
```