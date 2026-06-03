---
tags: [BIP, 元数据, 数据字典, pgrm.projectschedule.ProjectSchedule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目进度 (`pgrm.projectschedule.ProjectSchedule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prjc_project_schedule` | domain：`yonbip-pm-projectme` | 应用：`PGRM` | 业务对象ID：`5ed50b6c-9204-42ec-8910-4b7147d2f488`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目进度 |
| 物理表 | `prjc_project_schedule` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `PGRM` |
| 直连字段 | 50 个 |
| 子表 | 1 个 |
| 关联引用 | 13 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `projectScheduleItems` | `pgrm.projectschedule.ProjectScheduleItem` | composition |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `transi_type_id` | `transtype.bd_billtyperef` |
| `ytenant_id` | `` |
| `project_schedule_define_character` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref_na` |
| `wbs_doc_id` | `yonbip-pm-commonbd.RefTable_6359897d78` |
| `bill_maker` | `bd_staff_all_ref` |
| `responsible_id` | `iuap-ptc-yoncmm.sattUuser` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `bill_type_id` | `transtype.bd_billtypetreeref` |

## 继承接口 (5个, 12字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 50 个直连字段

### 文本字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `adjust_reason` | `adjust_reason` | `adjustReason` | 调整原因 |
| `bill_type_code` | `bill_type_code` | `billTypeCode` | 单据类型编码 |
| `code` | `code` | `code` | 自动编码 |
| `creater_id` | `creater_id` | `createrId` | 创建人id |
| `isWfControlled` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `name` | `name` | `name` | 名称 |
| `oid` | `oid` | `oid` | 原始id |
| `source_id` | `source_id` | `sourceId` | 来源id |
| `source_type` | `source_type` | `sourceType` | 来源类型 |
| `transi_type_code` | `transi_type_code` | `transiTypeCode` | 交易类型编码 |
| `version` | `version` | `version` | 版本 |
| `version_operator` | `version_operator` | `versionOperator` | 版本操作人 |
| `wbs_schedule_method` | `wbs_schedule_method` | `wbsScheduleMethod` | wbs编制类型 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_maker` | `bill_maker` | `billMaker` | 制单人 |
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `org_id` | `org_id` | `orgId` | 立项企业 |
| `project_id` | `project_id` | `projectId` | 项目档案 |
| `responsible_id` | `responsible_id` | `responsibleId` | 责任人id |
| `transi_type_id` | `transi_type_id` | `transiTypeId` | 交易类型 |
| `wbs_doc_id` | `wbs_doc_id` | `wbsDocId` | WBS档案id |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `actual_end_date` | `actual_end_date` | `actualEndDate` | 实际完成日期 |
| `actual_start_date` | `actual_start_date` | `actualStartDate` | 实际开始日期 |
| `plan_end_date` | `plan_end_date` | `planEndDate` | 计划结束日期 |
| `plan_start_date` | `plan_start_date` | `planStartDate` | 计划开始日期 |
| `version_change_date` | `version_change_date` | `versionChangeDate` | 版本更新日期 |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_make_time` | `bill_make_time` | `billMakeTime` | 制单时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `new_flag` | `new_flag` | `newFlag` | 是否最新版本标识 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `effective_flag` | `effective_flag` | `effectiveFlag` | 是否生效标识 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `actual_time` | `actual_time` | `actualTime` | 实际工期 |
| `plan_time` | `plan_time` | `planTime` | 计划工期 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `completion_ratio_rule` | `completion_ratio_rule` | `completionRatioRule` | 计算完工比规则 |
| `plan_type` | `plan_type` | `planType` | 计划类型 |
| `status` | `status` | `status` | 单据状态 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `child_plan_id` | `child_plan_id` | `childPlanId` | 关联的子计划的id |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `completion_ratio` | `completion_ratio` | `completionRatio` | 完工比 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `project_schedule_define_character` | `project_schedule_define_character` | `projectScheduleDefineCharacter` | 自定义项特征属性 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `projectScheduleItems` | 项目进度计划 |
