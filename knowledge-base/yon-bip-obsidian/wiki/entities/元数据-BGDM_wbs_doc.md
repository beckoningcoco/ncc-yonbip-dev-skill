---
tags: [BIP, 元数据, 数据字典, BGDM, BGDM.wbs.wbs.doc]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# WBS (`BGDM.wbs.wbs.doc`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bgdm_wbs_doc` | 应用: `BGDM` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | WBS |
| 物理表 | `bgdm_wbs_doc` |
| 应用 | `BGDM` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-23 00:25:26:000
- 安装来源: `/app/project_dir/pm-iuapdoc-starter/scripts/db/patch/mongodb/V5_R0_2507/0001_pm-pmc-iuapdoc/0010_iuap_common/DML/0270_iuap_metadata/202604/bgdm/wbs_doc/202604131005_metadata_BGDM-wbs.zip`

## 术语标记

`data_auth`, `MasterData`, `report`, `doc`, `reportAuth`

## 依赖接口（4 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| OrgItf (`OrgItf`) | `iuap.busiObj.OrgItf` | 226 | 1 |
| ITree (`ITree`) | `iuap.busiObj.ITree` | 968 | 6 |
| 编码 (`Code`) | `iuap.busiObj.Code` | 223 | 1 |
| LogicDelete (`LogicDelete`) | `iuap.busiObj.LogicDelete` | 211 | 1 |

---

## 全部属性（62 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `actualTime` | actualTime(时间) | `actual_time` | Integer | `int` | false |  |
| 2 | `billMakeTime` | billMakeTime(时间) | `bill_make_time` | Date | `dateTime` | false |  |
| 3 | `billMaker` | billMaker | `bill_maker` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` | false |  |
| 4 | `currencyId` | currencyId | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` | false |  |
| 5 | `finOrgId` | finOrgId | `fin_org_id` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` | false |  |
| 6 | `floatingTime` | floatingTime(时间) | `floating_time` | Integer | `int` | false |  |
| 7 | `isEnd` | 是否End | `leaf_flag` | Short | `short` | false | true |
| 8 | `isGroupingWbs` | 是否GroupingWbs | `is_grouping_wbs` | pm_common_yesno | `singleOption` | false |  |
| 9 | `parent` | parent | `parent_id` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` | false | true |
| 10 | `planEarlyEndDate` | planEarlyEndDate(日期) | `plan_early_end_date` | Date | `dateTime` | false |  |
| 11 | `planEarlyStartDate` | planEarlyStartDate(日期) | `plan_early_start_date` | Date | `dateTime` | false |  |
| 12 | `planHours` | planHours | `plan_hours` | Decimal | `number` | false |  |
| 13 | `planLatestEndDate` | planLatestEndDate(日期) | `plan_latest_end_date` | Date | `dateTime` | false |  |
| 14 | `planLatestStartDate` | planLatestStartDate(日期) | `plan_latest_start_date` | Date | `dateTime` | false |  |
| 15 | `predicateEndDate` | predicateEndDate(日期) | `predicate_end_date` | Date | `dateTime` | false |  |
| 16 | `predicateStartDate` | predicateStartDate(日期) | `predicate_start_date` | Date | `dateTime` | false |  |
| 17 | `predicateTime` | predicateTime(时间) | `predicate_time` | Integer | `int` | false |  |
| 18 | `projectId` | projectId | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` | false |  |
| 19 | `scheduleFlag` | scheduleFlag | `schedule_flag` | Boolean | `switch` | false |  |
| 20 | `scheduleType` | scheduleType(类型) | `schedule_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` | false |  |
| 21 | `sort` | 排序号 | `serial` | Integer | `int` | false | true |
| 22 | `stageId` | stageId | `stage_id` | 226fae36-161f-456a-adb9-95a7497bf9fd | `quote` | false |  |
| 23 | `stageInspectionFlag` | stageInspectionFlag | `stage_inspection_flag` | schedule_milestone | `singleOption` | false |  |
| 24 | `wbsDocDefineCharacter` | wbsDocDefineCharacter | `wbs_doc_define_character` | f45f2fe4-4c7e-4592-8f72-2325ac905482 | `UserDefine` | false |  |
| 25 | `wbsScheduleMethod` | wbsScheduleMethod | `wbs_schedule_method` | wbsScheduleMethod | `singleOption` | false |  |
| 26 | `bResourcePlan` | bResourcePlan | `bresource_plan` | pm_common_yesno | `singleOption` | false |  |
| 27 | `participatingEnterprise` | participatingEnterprise | `participating_enterprise_id` | f730d346-ca82-43e3-bbe3-ce0bb1a32530 | `quote` | false |  |
| 28 | `actualEndDate` | 实际结束日期 | `actual_end_date` | String | `date` | false |  |
| 29 | `actualStartDate` | 实际开始日期 | `actual_start_date` | String | `date` | false |  |
| 30 | `completionRatio` | ompletionRatio | `completion_ratio` | Decimal | `number` | false |  |
| 31 | `costAccountingFlag` | ostAccountingFlag | `cost_accounting_flag` | Boolean | `switch` | false |  |
| 32 | `costAccountingStartDate` | costAccountingStartDate(日期) | `cost_accounting_start_date` | Date | `dateTime` | false |  |
| 33 | `departmentId` | departmentId | `department_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` | false |  |
| 34 | `planEndDate` | 计划结束日期 | `plan_end_date` | String | `date` | false |  |
| 35 | `planStartDate` | 计划开始日期 | `plan_start_date` | String | `date` | false |  |
| 36 | `planTime` | planTime(时间) | `plan_time` | String | `text` | false |  |
| 37 | `reasonForCompletionDelay` | reasonForCompletionDelay | `reason_for_completion_delay` | String | `text` | false |  |
| 38 | `reasonForStartingDelay` | reasonForStartingDelay | `reason_for_starting_delay` | String | `text` | false |  |
| 39 | `remark` | 备注 | `remark` | String | `text` | false |  |
| 40 | `sourceId` | sourceId | `source_id` | String | `text` | false |  |
| 41 | `sourceType` | sourceType(类型) | `source_type` | wbsSourceType | `singleOption` | false |  |
| 42 | `txStatus` | txStatus(状态) | `tx_status` | Integer | `int` | false |  |
| 43 | `wbsBudgetFlag` | wbsBudgetFlag | `wbs_budget_flag` | Boolean | `switch` | false |  |
| 44 | `wbsDocType` | wbsDocType(类型) | `type` | wbsDocType | `singleOption` | false |  |
| 45 | `wbsStatus` | wbsStatus(状态) | `wbs_status` | wbsStatus | `singleOption` | false |  |
| 46 | `id` | 主键ID | `id` | String | `text` |  | true |
| 47 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | true |
| 48 | `code` | 编码 | `code` | String | `text` | false | true |
| 49 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | true |
| 50 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 51 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 52 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | true |
| 53 | `disablets` | isablets(日期) | `disablets` | DateTime | `dateTime` |  | true |
| 54 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |  | true |
| 55 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |  | true |
| 56 | `level` | level | `level` | Integer | `int` |  | true |
| 57 | `name` | 名称 | `name` | String | `text` | false | true |
| 58 | `path` | path | `path` | String | `text` |  | true |
| 59 | `ytenantId` | ytenantId | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |
| 60 | `dr` | 逻辑删除 | `dr` | Short | `short` | false | true |
| 61 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` | false | true |
| 62 | `responsibleId` | responsibleId | `responsible_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` | false |  |

## 关联属性（15 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `parent` | parent | `BGDM.wbs.wbs_doc` | `parent_id` | 外键 |  |  | None | false |
| 2 | `creator` | 创建人 | `base.user.BipUser` | `creator` | 外键 |  |  | Service |  |
| 3 | `departmentId` | departmentId | `bd.adminOrg.AdminOrgVO` | `department_id` | 外键 |  |  | Service | false |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` | 外键 |  |  | Service |  |
| 5 | `ytenantId` | ytenantId | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 6 | `orgId` | 组织ID | `org.func.BaseOrg` | `org_id` | 外键 |  |  | Service | false |
| 7 | `wbsDocDefineCharacter` | wbsDocDefineCharacter | `BGDM.BGDM.WbsDefineCharacter` | `wbs_doc_define_character` | 外键 |  |  | None | false |
| 8 | `participatingEnterprise` | participatingEnterprise | `PRJC.projectParticipant.ProjectParticipant` | `participating_enterprise_id` | 外键 |  |  | Service | false |
| 9 | `scheduleType` | scheduleType(类型) | `bd.bill.TransType` | `schedule_type` | 外键 |  |  | Service | false |
| 10 | `billMaker` | billMaker | `bd.staff.Staff` | `bill_maker` | 外键 |  |  | Service | false |
| 11 | `responsibleId` | responsibleId | `bd.staff.StaffNew` | `responsible_id` | 外键 |  |  | Service | false |
| 12 | `currencyId` | currencyId | `bd.currencytenant.CurrencyTenantVO` | `currency_id` | 外键 |  |  | Service | false |
| 13 | `finOrgId` | finOrgId | `org.func.FinanceOrg` | `fin_org_id` | 外键 |  |  | Service | false |
| 14 | `projectId` | projectId | `bd.project.ProjectVO` | `project_id` | 外键 |  |  | Service | false |
| 15 | `stageId` | stageId | `PRJC.stage.Stage` | `stage_id` | 外键 |  |  | Service | false |

---

## SQL 示例

```sql
SELECT actual_time, bill_make_time, bill_maker, currency_id, fin_org_id, floating_time, leaf_flag, is_grouping_wbs
FROM bgdm_wbs_doc
```