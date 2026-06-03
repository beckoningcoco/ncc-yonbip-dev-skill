---
tags: [BIP, 元数据, 数据字典, RVN.RVN.RclProjectCostScheduleCalcHeader]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成本进度信息主表 (`RVN.RVN.RclProjectCostScheduleCalcHeader`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_projectcostschedule_h` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`7b46aff8-655f-47f6-8ff2-59a9e8421367`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成本进度信息主表 |
| 物理表 | `rcl_projectcostschedule_h` |
| 数据库 schema | `yonbip-fi-ercl` |
| 所属应用 | `RVN` |
| 直连字段 | 51 个 |
| 子表 | 1 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `RclProjectCostScheduleCalculBodyList` | `RVN.RVN.RclProjectCostScheduleCalculBody` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `acc_book_id` | `fiepub.fiepub_accountbooktreeref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accentity` | `ucf-org-center.bd_financeorgtreeref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `project_schedule_type` | `ucfbasedoc.bd_billtyperef` |

## 继承接口 (6个, 24字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 51 个直连字段

### 文本字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dimension` | `dimension` | `dimension` | 收入成本匹配维度 |
| `dimension_value` | `dimension_value` | `dimensionValue` | 收入成本匹配维度实际值 |
| `period_code` | `period_code` | `periodCode` | 会计期间编码 |
| `project_schedule_info_header_id` | `project_schedule_info_header_id` | `projectScheduleInfoHeaderId` | 项目进度信息ID |
| `project_schedule_type_name` | `project_schedule_type_name` | `projectScheduleTypeName` | 项目进度类型名称 |
| `serial_number` | `serial_number` | `serialNumber` | 序列号 |
| `task_id` | `task_id` | `taskId` | 任务ID |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 账簿 |
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `project_schedule_type` | `project_schedule_type` | `projectScheduleType` | 项目进度类型 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_exist_pre` | `bln_exist_pre` | `blnExistPre` | 存在预计成本来源 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `status` | `status` | `status` | 计算状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `perform_progress` | `perform_progress` | `performProgress` | 累计履约进度 |
| `pre_liability` | `pre_liability` | `preLiability` | 预计负债 |
| `pre_total_revenue_no_tax` | `pre_total_revenue_no_tax` | `preTotalRevenueNoTax` | 预计总收入(无税) |
| `acc_cost` | `acc_cost` | `accCost` | 累计成本 |
| `actual_total_revenue` | `actual_total_revenue` | `actualTotalRevenue` | 累计实际收入 |
| `cost_schedule` | `cost_schedule` | `costSchedule` | 成本进度 |
| `expected_gross_profit` | `expected_gross_profit` | `expectedGrossProfit` | 预计毛利率 |
| `pre_cost` | `pre_cost` | `preCost` | 预计总成本 |
| `pre_rate_margin` | `pre_rate_margin` | `preRateMargin` | 预计毛利率 |
| `pre_total_revenue` | `pre_total_revenue` | `preTotalRevenue` | 预计总收入 |

### bigText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `error_msg` | `error_msg` | `errorMsg` | 异常信息 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `RclProjectCostScheduleCalculBodyList` | 成本进度信息子表 |
