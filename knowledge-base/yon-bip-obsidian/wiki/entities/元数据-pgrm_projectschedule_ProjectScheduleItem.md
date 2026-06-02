---
tags: [BIP, 元数据, 数据字典, pgrm.projectschedule.ProjectScheduleItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目进度计划 (`pgrm.projectschedule.ProjectScheduleItem`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `prjc_project_schedule_item` | 应用: `PGRM` | 类型: `Class`

## 属性（88 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `actualEndDate` | actualEndDate | `actual_end_date` | Date | `date` |
| 2 | `actualStartDate` | actualStartDate | `actual_start_date` | Date | `date` |
| 3 | `actualTime` | actualTime | `actual_time` | Integer | `int` |
| 4 | `childPlanFlag` | childPlanFlag | `childplan_flag` | Boolean | `switch` |
| 5 | `code` | 编码 | `code` | String | `text` |
| 6 | `completionRatio` | completionRatio | `completion_ratio` | Decimal | `number` |
| 7 | `createrId` | createrID | `creater_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 8 | `departmentId` | departmentID | `department_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 9 | `effectiveFlag` | effectiveFlag | `effective_flag` | Boolean | `switch` |
| 10 | `externalSysDataCode` | externalSysData编码 | `external_sys_data_code` | String | `text` |
| 11 | `externalSysDataPk` | externalSysDataPk | `external_sys_data_pk` | String | `text` |
| 12 | `externalSysDataPubts` | externalSysDataPubts | `external_sys_data_pubts` | Date | `dateTime` |
| 13 | `externalSysDataStatus` | externalSysDataStatus | `external_sys_data_status` | String | `text` |
| 14 | `externalSysDataVersion` | externalSysDataVersion | `external_sys_data_version` | String | `text` |
| 15 | `floatingTime` | floatingTime | `floating_time` | Integer | `int` |
| 16 | `ingatherCalculateFlag` | ingatherCalculateFlag | `ingather_calculate_flag` | Boolean | `switch` |
| 17 | `integrationSystemCode` | integrationSystem编码 | `integration_system_code` | String | `text` |
| 18 | `isEnd` | 是否End | `ifend` | Short | `short` |
| 19 | `isExternalPerson` | 是否ExternalPerson | `is_external_person` | Integer | `int` |
| 20 | `isGroupingWbs` | 是否GroupingWbs | `is_grouping_wbs` | pm_common_yesno | `singleOption` |
| 21 | `leafFlag` | leafFlag | `leaf_flag` | Integer | `int` |
| 22 | `level` | 层级 | `level` | Integer | `int` |
| 23 | `milestoneFlag` | milestoneFlag | `milestone_flag` | String | `text` |
| 24 | `milestoneRatio` | milestoneRatio | `milestone_ratio` | Decimal | `number` |
| 25 | `newFlag` | newFlag | `new_flag` | Boolean | `switch` |
| 26 | `node` | node | `node` | String | `text` |
| 27 | `oid` | oid | `oid` | String | `text` |
| 28 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 29 | `parent` | parent | `parent_id` | 992ac0ab-4ad3-40bd-b1c1-7e2368056423 | `quote` |
| 30 | `path` | path | `path` | String | `text` |
| 31 | `planEarlyEndDate` | planEarlyEndDate | `plan_early_end_date` | Date | `dateTime` |
| 32 | `planEarlyStartDate` | planEarlyStartDate | `plan_early_start_date` | Date | `dateTime` |
| 33 | `planEndDate` | planEndDate | `plan_end_date` | Date | `date` |
| 34 | `planHours` | planHours | `plan_hours` | Decimal | `number` |
| 35 | `planLatestEndDate` | planLatestEndDate | `plan_latest_end_date` | Date | `dateTime` |
| 36 | `planLatestStartDate` | planLatestStartDate | `plan_latest_start_date` | Date | `dateTime` |
| 37 | `planStartDate` | planStartDate | `plan_start_date` | Date | `date` |
| 38 | `planTime` | planTime | `plan_time` | Integer | `int` |
| 39 | `pnode` | pnode | `pnode` | String | `text` |
| 40 | `preWBSCode` | preWBS编码 | `pre_wbs_code` | String | `text` |
| 41 | `predicateEndDate` | predicateEndDate | `predicate_end_date` | Date | `dateTime` |
| 42 | `predicateStartDate` | predicateStartDate | `predicate_start_date` | Date | `dateTime` |
| 43 | `predicateTime` | predicateTime | `predicate_time` | Integer | `int` |
| 44 | `projectId` | projectID | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 45 | `projectScheduleDefineCharacter` | projectScheduleDefineCharacter | `project_schedule_item_define_character` | 5b2959fa-1444-44fe-94c2-b7ff9f0733a3 | `UserDefine` |
| 46 | `remark` | remark | `remark` | String | `text` |
| 47 | `responsibleId` | responsibleID | `responsible_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 48 | `scheduleFlag` | scheduleFlag | `schedule_flag` | Boolean | `switch` |
| 49 | `scheduleType` | scheduleType | `schedule_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 50 | `serial` | serial | `serial` | Integer | `int` |
| 51 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 52 | `sourceId` | sourceID | `source_id` | String | `text` |
| 53 | `sourceType` | sourceType | `source_type` | String | `text` |
| 54 | `stageId` | stageID | `stage_id` | 226fae36-161f-456a-adb9-95a7497bf9fd | `quote` |
| 55 | `stageInspectionFlag` | stageInspectionFlag | `stage_inspection_flag` | String | `text` |
| 56 | `tempId` | tempID | `temp_id` | String | `text` |
| 57 | `tplItemId` | tplItemID | `tpl_item_id` | String | `text` |
| 58 | `wbsName` | wbs名称 | `wbs_name` | String | `text` |
| 59 | `wbsScheduleMethod` | wbsScheduleMethod | `wbs_schedule_method` | wbsScheduleMethod | `singleOption` |
| 60 | `wbsStatus` | wbsStatus | `wbs_status` | Short | `short` |
| 61 | `bResourcePlan` | bResourcePlan | `bresource_plan` | pm_common_yesno | `singleOption` |
| 62 | `participatingEnterprise` | participatingEnterprise | `participating_enterprise_id` | f730d346-ca82-43e3-bbe3-ce0bb1a32530 | `quote` |
| 63 | `scheduleId` | scheduleID | `schedule_id` | c4efac13-8e2d-4fa4-b66a-ef806b1dc6ff | `quote` |
| 64 | `costAccountingFlag` | costAccountingFlag | `cost_accounting_flag` | Boolean | `switch` |
| 65 | `costAccountingStartDate` | costAccountingStartDate | `cost_accounting_start_date` | Date | `dateTime` |
| 66 | `finOrgId` | finOrgID | `fin_org_id` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |
| 67 | `reasonForCompletionDelay` | reasonForCompletionDelay | `reason_for_completion_delay` | String | `text` |
| 68 | `reasonForStartingDelay` | reasonForStartingDelay | `reason_for_starting_delay` | String | `text` |
| 69 | `txStatus` | txStatus | `tx_status` | Integer | `int` |
| 70 | `wbsBudgetFlag` | wbsBudgetFlag | `wbs_budget_flag` | Boolean | `switch` |
| 71 | `wbsDocType` | wbsDocType | `type` | wbsDocType | `singleOption` |
| 72 | `id` | ID | `id` | String | `text` |
| 73 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 74 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 75 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 76 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 77 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 78 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 79 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 80 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 81 | `name` | 名称 | `name` | String | `text` |
| 82 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 83 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 84 | `defines` | defines | `` | 1ae598ed-95f4-4124-b363-6e4db3eb6cd7 | `` |
| 85 | `projectScheduleItemLinks` | projectScheduleItemLinks | `` | b0ad4d3d-99fa-4b5e-9534-0cee4773a505 | `` |
| 86 | `projectScheduleItemResult` | projectScheduleItemResult | `` | 8fd514f3-079e-4350-9f81-e66de86c78d2 | `` |
| 87 | `checkitem` | checkitem | `` | 89ae014f-1fc1-4fe7-8e1e-8f6fa3391463 | `` |
| 88 | `projectScheduleItemParticipants` | projectScheduleItemParticipants | `` | b9ffd0a6-3dad-4a7b-bf61-af1eb856845e | `` |

## 关联（20 个）

- `parent` -> `pgrm.projectschedule.ProjectScheduleItem` ()
- `creator` -> `base.user.BipUser` ()
- `departmentId` -> `bd.adminOrg.AdminOrgVO` ()
- `modifier` -> `base.user.BipUser` ()
- `ytenantId` -> `yht.tenant.YhtTenant` ()
- `projectScheduleDefineCharacter` -> `PGRM.PGRM.ProjectScheWbsDefineCharacter` ()
- `orgId` -> `org.func.BaseOrg` ()
- `defines` -> `pgrm.projectschedule.ProjectScheduleItemDefine` (1)
- `checkitem` -> `pgrm.projectschedule.ProjectScheduleItemCheckitem` (0..n)
- `projectScheduleItemParticipants` -> `pgrm.projectschedule.ProjectScheduleItemParticipants` (0..n)
- `participatingEnterprise` -> `PRJC.projectParticipant.ProjectParticipant` ()
- `scheduleType` -> `bd.bill.TransType` ()
- `projectScheduleItemLinks` -> `pgrm.projectschedule.ProjectScheduleItemLinks` (0..n)
- `responsibleId` -> `bd.staff.StaffNew` ()
- `createrId` -> `bd.staff.Staff` ()
- `projectScheduleItemResult` -> `pgrm.projectschedule.ProjectScheduleItemResult` (0..n)
- `projectId` -> `bd.project.ProjectVO` ()
- `finOrgId` -> `org.func.FinanceOrg` ()
- `scheduleId` -> `pgrm.projectschedule.ProjectSchedule` (0..n)
- `stageId` -> `PRJC.stage.Stage` ()
