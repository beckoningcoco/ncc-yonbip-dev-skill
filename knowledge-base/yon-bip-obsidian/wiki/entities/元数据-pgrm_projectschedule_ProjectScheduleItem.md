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

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prjc_project_schedule_item` | domain：`yonbip-pm-projectme` | 应用：`PGRM` | 业务对象ID：`5ed50b6c-9204-42ec-8910-4b7147d2f488`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目进度计划 |
| 物理表 | `prjc_project_schedule_item` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `PGRM` |
| 直连字段 | 88 个 |
| 子表 | 5 个 |
| 关联引用 | 20 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `checkitem` | `pgrm.projectschedule.ProjectScheduleItemCheckitem` | composition |
| `projectScheduleItemParticipants` | `pgrm.projectschedule.ProjectScheduleItemParticipants` | composition |
| `projectScheduleItemLinks` | `pgrm.projectschedule.ProjectScheduleItemLinks` | composition |
| `projectScheduleItemResult` | `pgrm.projectschedule.ProjectScheduleItemResult` | composition |
| `defines` | `pgrm.projectschedule.ProjectScheduleItemDefine` | composition |

## 关联引用 (20个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `department_id` | `ucf-org-center.org_unit_tree_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `project_schedule_item_define_character` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `` | `` |
| `participating_enterprise_id` | `yonbip-pm-projectme.prjc_projectparticipant_ref` |
| `schedule_type` | `ucfbasedoc.bd_billtyperef` |
| `responsible_id` | `ucf-staff-center.bd_staff_leave_ref` |
| `creater_id` | `iuap-ptc-yoncmm.sattUuser` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `fin_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `schedule_id` | `` |
| `stage_id` | `yonbip-pm-projectme.RefTable_0494c88295` |

## 继承接口 (2个, 7字段)

- **树型结构** (`iuap.busiObj.ITree`)
  - `ifend` → `ifend`
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 88 个直连字段

### 文本字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | code |
| `external_sys_data_code` | `external_sys_data_code` | `externalSysDataCode` | 第三方数据编码 |
| `external_sys_data_pk` | `external_sys_data_pk` | `externalSysDataPk` | 第三方数据主键 |
| `external_sys_data_status` | `external_sys_data_status` | `externalSysDataStatus` | 第三方数据状态 |
| `external_sys_data_version` | `external_sys_data_version` | `externalSysDataVersion` | 第三方数据版本号 |
| `integration_system_code` | `integration_system_code` | `integrationSystemCode` | 集成系统编码 |
| `milestone_flag` | `milestone_flag` | `milestoneFlag` | 里程碑标识 |
| `node` | `node` | `node` | 节点id |
| `oid` | `oid` | `oid` | 原始id |
| `path` | `path` | `path` | 路径,上级的id拼接 |
| `pnode` | `pnode` | `pnode` | 父节点id |
| `pre_wbs_code` | `pre_wbs_code` | `preWBSCode` | 前置集合 |
| `remark` | `remark` | `remark` | 备注 |
| `source_id` | `source_id` | `sourceId` | 来源id |
| `source_type` | `source_type` | `sourceType` | 来源类型 |
| `stage_inspection_flag` | `stage_inspection_flag` | `stageInspectionFlag` | 阶段验收标识 |
| `temp_id` | `temp_id` | `tempId` | 立项临时数据id |
| `tpl_item_id` | `tpl_item_id` | `tplItemId` | 模版明细 |
| `wbs_name` | `wbs_name` | `wbsName` | WBS名称 |
| `reason_for_completion_delay` | `reason_for_completion_delay` | `reasonForCompletionDelay` | 完成延期原因 |
| `reason_for_starting_delay` | `reason_for_starting_delay` | `reasonForStartingDelay` | 开始延期原因 |
| `id` | `id` | `id` | 主键 |
| `name` | `name` | `name` | 节点标题 |

### 引用字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creater_id` | `creater_id` | `createrId` | 创建人id |
| `department_id` | `department_id` | `departmentId` | 责任部门id |
| `org_id` | `org_id` | `orgId` | 立项企业 |
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `project_id` | `project_id` | `projectId` | 项目档案 |
| `responsible_id` | `responsible_id` | `responsibleId` | 责任人id |
| `schedule_type` | `schedule_type` | `scheduleType` | 计划类型 |
| `stage_id` | `stage_id` | `stageId` | 项目阶段 |
| `participating_enterprise_id` | `participating_enterprise_id` | `participatingEnterprise` | 参与企业 |
| `schedule_id` | `schedule_id` | `scheduleId` | 项目进度主表外键 |
| `fin_org_id` | `fin_org_id` | `finOrgId` | 会计主体 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `actual_end_date` | `actual_end_date` | `actualEndDate` | 实际完成日期 |
| `actual_start_date` | `actual_start_date` | `actualStartDate` | 实际开始日期 |
| `plan_end_date` | `plan_end_date` | `planEndDate` | 计划结束日期 |
| `plan_start_date` | `plan_start_date` | `planStartDate` | 计划开始日期 |

### 日期时间 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `external_sys_data_pubts` | `external_sys_data_pubts` | `externalSysDataPubts` | 第三方数据时间戳 |
| `plan_early_end_date` | `plan_early_end_date` | `planEarlyEndDate` | 计划最早完成时间 |
| `plan_early_start_date` | `plan_early_start_date` | `planEarlyStartDate` | 计划最早开始时间 |
| `plan_latest_end_date` | `plan_latest_end_date` | `planLatestEndDate` | 计划最晚结束时间 |
| `plan_latest_start_date` | `plan_latest_start_date` | `planLatestStartDate` | 计划最晚开始时间 |
| `predicate_end_date` | `predicate_end_date` | `predicateEndDate` | 预测结束日期 |
| `predicate_start_date` | `predicate_start_date` | `predicateStartDate` | 预测开始日期 |
| `cost_accounting_start_date` | `cost_accounting_start_date` | `costAccountingStartDate` | 成本核算启用日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |

### 布尔字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `childplan_flag` | `childplan_flag` | `childPlanFlag` | 是否子计划标识 |
| `effective_flag` | `effective_flag` | `effectiveFlag` | 是否生效标识 |
| `ingather_calculate_flag` | `ingather_calculate_flag` | `ingatherCalculateFlag` | 是否收入核算 |
| `new_flag` | `new_flag` | `newFlag` | 是否最新版本标识 |
| `schedule_flag` | `schedule_flag` | `scheduleFlag` | 是否计划 |
| `cost_accounting_flag` | `cost_accounting_flag` | `costAccountingFlag` | 是否成本核算 |
| `wbs_budget_flag` | `wbs_budget_flag` | `wbsBudgetFlag` | WBS预算属性 |

### 枚举字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_grouping_wbs` | `is_grouping_wbs` | `isGroupingWbs` | 是否库存管理WBS |
| `wbs_schedule_method` | `wbs_schedule_method` | `wbsScheduleMethod` | 编制方式 |
| `bresource_plan` | `bresource_plan` | `bResourcePlan` | 是否资源计划 |
| `type` | `type` | `wbsDocType` | WBS类型 |
| `enable` | `enable` | `enable` | 档案状态 |

### 整数 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `actual_time` | `actual_time` | `actualTime` | 实际工期 |
| `floating_time` | `floating_time` | `floatingTime` | 浮动天数 |
| `is_external_person` | `is_external_person` | `isExternalPerson` | 是否外部人员 |
| `leaf_flag` | `leaf_flag` | `leafFlag` | 是否叶子节点 |
| `level` | `level` | `level` | 等级 |
| `plan_time` | `plan_time` | `planTime` | 计划工期 |
| `predicate_time` | `predicate_time` | `predicateTime` | 预测天数 |
| `serial` | `serial` | `serial` | 排序 |
| `sort_num` | `sort_num` | `sort` | 排序号 |
| `tx_status` | `tx_status` | `txStatus` | 事务状态 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ifend` | `ifend` | `isEnd` | 是否末级 |
| `wbs_status` | `wbs_status` | `wbsStatus` | WBS状态 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `completion_ratio` | `completion_ratio` | `completionRatio` | 完工比 |
| `milestone_ratio` | `milestone_ratio` | `milestoneRatio` | 里程碑进度 |
| `plan_hours` | `plan_hours` | `planHours` | 计划时长 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `project_schedule_item_define_character` | `project_schedule_item_define_character` | `projectScheduleDefineCharacter` | 自定义项特征属性 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 项目进度详情自定义项 |
| `` | `` | `projectScheduleItemLinks` | 项目进度计划链接 |
| `` | `` | `projectScheduleItemResult` | 项目进度成果物 |
| `` | `` | `checkitem` | 进度计划检查项 |
| `` | `` | `projectScheduleItemParticipants` | 项目进度参与人 |
