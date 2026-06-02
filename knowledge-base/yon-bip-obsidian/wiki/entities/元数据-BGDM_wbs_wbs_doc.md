---
tags: [BIP, 元数据, 数据字典, BGDM.wbs.wbs_doc]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# WBS (`BGDM.wbs.wbs_doc`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bgdm_wbs_doc` | 应用: `BGDM`

## 属性（62 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `actualTime` | actualTime | `actual_time` | Integer | `int` |
| 2 | `billMakeTime` | billMakeTime | `bill_make_time` | Date | `dateTime` |
| 3 | `billMaker` | billMaker | `bill_maker` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 4 | `currencyId` | currencyID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 5 | `finOrgId` | finOrgID | `fin_org_id` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |
| 6 | `floatingTime` | floatingTime | `floating_time` | Integer | `int` |
| 7 | `isEnd` | 是否End | `leaf_flag` | Short | `short` |
| 8 | `isGroupingWbs` | 是否GroupingWbs | `is_grouping_wbs` | pm_common_yesno | `singleOption` |
| 9 | `parent` | parent | `parent_id` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |
| 10 | `planEarlyEndDate` | planEarlyEndDate | `plan_early_end_date` | Date | `dateTime` |
| 11 | `planEarlyStartDate` | planEarlyStartDate | `plan_early_start_date` | Date | `dateTime` |
| 12 | `planHours` | planHours | `plan_hours` | Decimal | `number` |
| 13 | `planLatestEndDate` | planLatestEndDate | `plan_latest_end_date` | Date | `dateTime` |
| 14 | `planLatestStartDate` | planLatestStartDate | `plan_latest_start_date` | Date | `dateTime` |
| 15 | `predicateEndDate` | predicateEndDate | `predicate_end_date` | Date | `dateTime` |
| 16 | `predicateStartDate` | predicateStartDate | `predicate_start_date` | Date | `dateTime` |
| 17 | `predicateTime` | predicateTime | `predicate_time` | Integer | `int` |
| 18 | `projectId` | projectID | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 19 | `scheduleFlag` | scheduleFlag | `schedule_flag` | Boolean | `switch` |
| 20 | `scheduleType` | scheduleType | `schedule_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 21 | `sort` | sort | `serial` | Integer | `int` |
| 22 | `stageId` | stageID | `stage_id` | 226fae36-161f-456a-adb9-95a7497bf9fd | `quote` |
| 23 | `stageInspectionFlag` | stageInspectionFlag | `stage_inspection_flag` | schedule_milestone | `singleOption` |
| 24 | `wbsDocDefineCharacter` | wbsDocDefineCharacter | `wbs_doc_define_character` | f45f2fe4-4c7e-4592-8f72-2325ac905482 | `UserDefine` |
| 25 | `wbsScheduleMethod` | wbsScheduleMethod | `wbs_schedule_method` | wbsScheduleMethod | `singleOption` |
| 26 | `bResourcePlan` | bResourcePlan | `bresource_plan` | pm_common_yesno | `singleOption` |
| 27 | `participatingEnterprise` | participatingEnterprise | `participating_enterprise_id` | f730d346-ca82-43e3-bbe3-ce0bb1a32530 | `quote` |
| 28 | `actualEndDate` | actualEndDate | `actual_end_date` | String | `date` |
| 29 | `actualStartDate` | actualStartDate | `actual_start_date` | String | `date` |
| 30 | `completionRatio` | completionRatio | `completion_ratio` | Decimal | `number` |
| 31 | `costAccountingFlag` | costAccountingFlag | `cost_accounting_flag` | Boolean | `switch` |
| 32 | `costAccountingStartDate` | costAccountingStartDate | `cost_accounting_start_date` | Date | `dateTime` |
| 33 | `departmentId` | departmentID | `department_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 34 | `planEndDate` | planEndDate | `plan_end_date` | String | `date` |
| 35 | `planStartDate` | planStartDate | `plan_start_date` | String | `date` |
| 36 | `planTime` | planTime | `plan_time` | String | `text` |
| 37 | `reasonForCompletionDelay` | reasonForCompletionDelay | `reason_for_completion_delay` | String | `text` |
| 38 | `reasonForStartingDelay` | reasonForStartingDelay | `reason_for_starting_delay` | String | `text` |
| 39 | `remark` | remark | `remark` | String | `text` |
| 40 | `sourceId` | sourceID | `source_id` | String | `text` |
| 41 | `sourceType` | sourceType | `source_type` | wbsSourceType | `singleOption` |
| 42 | `txStatus` | txStatus | `tx_status` | Integer | `int` |
| 43 | `wbsBudgetFlag` | wbsBudgetFlag | `wbs_budget_flag` | Boolean | `switch` |
| 44 | `wbsDocType` | wbsDocType | `type` | wbsDocType | `singleOption` |
| 45 | `wbsStatus` | wbsStatus | `wbs_status` | wbsStatus | `singleOption` |
| 46 | `id` | ID | `id` | String | `text` |
| 47 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 48 | `code` | 编码 | `code` | String | `text` |
| 49 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 50 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 51 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 52 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 53 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 54 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 55 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 56 | `level` | level | `level` | Integer | `int` |
| 57 | `name` | 名称 | `name` | String | `text` |
| 58 | `path` | path | `path` | String | `text` |
| 59 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 60 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 61 | `orgId` | orgID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 62 | `responsibleId` | responsibleID | `responsible_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |

## 关联（15 个）

- `parent` -> `BGDM.wbs.wbs_doc` () [废]
- `creator` -> `base.user.BipUser` () 
- `departmentId` -> `bd.adminOrg.AdminOrgVO` () [废]
- `modifier` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `orgId` -> `org.func.BaseOrg` () [废]
- `wbsDocDefineCharacter` -> `BGDM.BGDM.WbsDefineCharacter` () [废]
- `participatingEnterprise` -> `PRJC.projectParticipant.ProjectParticipant` () [废]
- `scheduleType` -> `bd.bill.TransType` () [废]
- `billMaker` -> `bd.staff.Staff` () [废]
- `responsibleId` -> `bd.staff.StaffNew` () [废]
- `currencyId` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `finOrgId` -> `org.func.FinanceOrg` () [废]
- `projectId` -> `bd.project.ProjectVO` () [废]
- `stageId` -> `PRJC.stage.Stage` () [废]
