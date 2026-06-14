---
tags: [BIP, 元数据, 数据字典, pgrm.projecttask.ProjectScheduleTask]
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

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pgrm_activity` | domain：`yonbip-pm-projectme` | 应用：`PGRM` | 业务对象ID：`f76a015a-f5ed-4916-8354-47da523fbe1f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目活动 |
| 物理表 | `pgrm_activity` |
| domain/服务域 | `yonbip-pm-projectme` |
| schema | `pmcloud` |
| 所属应用 | `PGRM` |
| 直连字段 | 81 个 |
| 子表 | 7 个 |
| 关联引用 | 22 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `checkitem` | `pgrm.projecttask.ProjectTaskCheckitem` | composition |
| `projectTaskWorkProgressList` | `pgrm.projecttask.ProjectTaskWorkProgress` | composition |
| `projectTaskWorkCenterList` | `pgrm.projecttask.ProjectTaskWorkCenter` | composition |
| `projectTaskResult` | `pgrm.projecttask.ProjectTaskResult` | composition |
| `projectTaskMaterial` | `pgrm.projecttask.ProjectTaskMaterial` | composition |
| `projectScheduleTaskLinks` | `pgrm.projecttask.ProjectScheduleTaskLinks` | composition |
| `projectTaskParticipants` | `pgrm.projecttask.ProjectTaskParticipants` | composition |

## 关联引用 (22个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `schedule_item_id` | `yonbip-pm-projectme.pgrm_introduce_activity_ref` |
| `department_id` | `ucf-org-center.org_unit_tree_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `participating_enterprise_id` | `yonbip-pm-projectme.prjc_projectparticipant_ref` |
| `project_schedule_task_define_character` | `` |
| `wbs_doc_id` | `yonbip-pm-commonbd.wbs_doc_ref` |
| `bill_maker` | `iuap-ptc-yoncmm.sattUuser` |
| `standard_milepost_id` | `yonbip-pm-commonbd.standard_milepost_ref` |
| `responsible_id` | `iuap-ptc-yoncmm.sattUuser` |
| `creater_id` | `iuap-ptc-yoncmm.sattUuser` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |

## 继承接口 (5个, 8字段)

- **交易类型** (`iuap.busiObj.BustypeItf`)
  - `bustype` → `bustype`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 81 个直连字段

### 文本字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 项目活动编码 |
| `external_sys_data_code` | `external_sys_data_code` | `externalSysDataCode` | 第三方数据编码 |
| `external_sys_data_pk` | `external_sys_data_pk` | `externalSysDataPk` | 第三方数据主键 |
| `external_sys_data_status` | `external_sys_data_status` | `externalSysDataStatus` | 第三方数据状态 |
| `external_sys_data_version` | `external_sys_data_version` | `externalSysDataVersion` | 第三方数据版本号 |
| `integration_system_code` | `integration_system_code` | `integrationSystemCode` | 集成系统编码 |
| `join_network_method` | `join_network_method` | `joinNetworkMethod` | 加入网络方式 |
| `milestone_point` | `milestone_point` | `milestonePoint` | 里程碑达成点 |
| `network_id` | `network_id` | `networkId` | 计划网络ID |
| `node` | `node` | `node` | 节点id |
| `pre_wbs_code` | `pre_wbs_code` | `preWBSCode` | 前置集合 |
| `product_id` | `product_id` | `productId` | 物料 |
| `reason_for_completion_delay` | `reason_for_completion_delay` | `reasonForCompletionDelay` | 完成延期原因 |
| `reason_for_starting_delay` | `reason_for_starting_delay` | `reasonForStartingDelay` | 开始延期原因 |
| `remark` | `remark` | `remark` | 备注 |
| `schedule_id` | `schedule_id` | `scheduleId` | 进度计划id |
| `source_id` | `source_id` | `sourceId` | 来源id |
| `supplier_id` | `supplier_id` | `supplierId` | 供应商id |
| `task_name` | `task_name` | `taskName` | 项目活动名称 |
| `temp_id` | `temp_id` | `tempId` | 立项临时数据Id |
| `tpl_item_id` | `tpl_item_id` | `tplItemId` | 模板明细ID |

### 引用字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_maker` | `bill_maker` | `billMaker` | 制单人 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `creater_id` | `creater_id` | `createrId` | 创建人id |
| `department_id` | `department_id` | `departmentId` | 责任部门id |
| `org_id` | `org_id` | `orgId` | 组织id |
| `project_id` | `project_id` | `projectId` | 项目档案 |
| `responsible_id` | `responsible_id` | `responsibleId` | 责任人id |
| `schedule_item_id` | `schedule_item_id` | `scheduleItemId` | wbsId |
| `wbs_doc_id` | `wbs_doc_id` | `wbsDocId` | WBS档案id |
| `standard_milepost_id` | `standard_milepost_id` | `standardMilepostId` | 标准里程碑ID |
| `participating_enterprise_id` | `participating_enterprise_id` | `participatingEnterprise` | 参与企业 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `actual_end_date` | `actual_end_date` | `actualEndDate` | 实际完成日期 |
| `actual_start_date` | `actual_start_date` | `actualStartDate` | 实际开始日期 |
| `plan_end_date` | `plan_end_date` | `planEndDate` | 计划完成日期 |
| `plan_start_date` | `plan_start_date` | `planStartDate` | 计划开始日期 |

### 日期时间 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_make_time` | `bill_make_time` | `billMakeTime` | 制单日期 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |
| `external_sys_data_pubts` | `external_sys_data_pubts` | `externalSysDataPubts` | 第三方数据时间戳 |
| `latest_end_date_in_network` | `latest_end_date_in_network` | `latestEndDateInNetwork` | 网络最晚完成时间 |
| `plan_early_end_date` | `plan_early_end_date` | `planEarlyEndDate` | 计划最早完成时间 |
| `plan_early_start_date` | `plan_early_start_date` | `planEarlyStartDate` | 计划最早开始时间 |
| `plan_latest_end_date` | `plan_latest_end_date` | `planLatestEndDate` | 计划最晚结束时间 |
| `plan_latest_start_date` | `plan_latest_start_date` | `planLatestStartDate` | 计划最晚开始时间 |
| `predicate_end_date` | `predicate_end_date` | `predicateEndDate` | 预测结束日期 |
| `predicate_start_date` | `predicate_start_date` | `predicateStartDate` | 预测开始日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `effect_flag` | `effect_flag` | `effectFlag` | 是否是生效版本 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 启用 |
| `milestone_flag` | `milestone_flag` | `milestoneFlag` | 里程碑标识 |
| `task_status` | `task_status` | `taskStatus` | 项目活动状态 |

### 整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `actual_time` | `actual_time` | `actualTime` | 实际工期 |
| `distribute_type` | `distribute_type` | `distributeType` | 下发状态 |
| `floating_time` | `floating_time` | `floatingTime` | 浮动天数 |
| `level` | `level` | `level` | 等级 |
| `plan_time` | `plan_time` | `planTime` | 计划工期 |
| `predicate_time` | `predicate_time` | `predicateTime` | 预测天数 |
| `serial` | `serial` | `serial` | 排序 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `priority` | `priority` | `priority` | 优先级 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `apply_activity_id` | `apply_activity_id` | `applyActivityId` | 立项关联活动id |
| `id` | `id` | `id` | id |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `apply_amount` | `apply_amount` | `applyAmount` | 已付金额 |
| `completion_ratio` | `completion_ratio` | `completionRatio` | 完工比 |
| `milestone_ratio` | `milestone_ratio` | `milestoneRatio` | 里程碑进度 |
| `pay_amount` | `pay_amount` | `payAmount` | 付款金额 |
| `plan_hours` | `plan_hours` | `planHours` | 计划时长 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `project_schedule_task_define_character` | `project_schedule_task_define_character` | `projectScheduleTaskDefineCharacter` | 自定义项特征属性 |

### other (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `projectTaskMaterial` | 项目活动物资清单 |
| `` | `` | `projectTaskWorkProgressList` | 活动工作进展 |
| `` | `` | `projectTaskResult` | 项目活动成果物 |
| `` | `` | `checkitem` | 项目活动检查项 |
| `` | `` | `projectScheduleTaskLinks` | 项目活动链接 |
| `` | `` | `projectTaskWorkCenterList` | 项目活动工作中心 |
| `` | `` | `projectTaskParticipants` | 项目活动参与人 |
