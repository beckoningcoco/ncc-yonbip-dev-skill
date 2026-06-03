---
tags: [BIP, 元数据, 数据字典, crmc.visitrecommendrule.VisitRecommendBasis]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 拜访推荐依据 (`crmc.visitrecommendrule.VisitRecommendBasis`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`crmc_visit_recommend_basis` | domain：`yycrm` | 应用：`CRMC` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 拜访推荐依据 |
| 物理表 | `crmc_visit_recommend_basis` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CRMC` |
| 直连字段 | 29 个 |
| 子表 | 4 个 |
| 关联引用 | 11 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `recommendResults` | `crmc.visitrecommendrule.RecommendResult` | composition |
| `recommendBasicObjectChilds` | `crmc.visitrecommendrule.RecommendBasicObjectBasic` | composition |
| `recommendBasicTaskTypeChilds` | `crmc.visitrecommendrule.RecommendBasicTaskType` | composition |
| `recommendBasicMotionChilds` | `crmc.visitrecommendrule.RecommendBasicMotion` | composition |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `label_id` | `uhy.mm_labeldocref` |
| `labelValueId` | `` |
| `ytenant_id` | `` |
| `recommend_type_task` | `` |
| `rule_id` | `` |
| `tenant_id` | `` |
| `recommend_type_plan` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 29 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `label_type` | `label_type` | `labelType` | 标签类型 |
| `order_recommend_condition` | `order_recommend_condition` | `orderRecommendCondition` | 订单过滤条件 |
| `product_recommend_condition` | `product_recommend_condition` | `productRecommendCondition` | 商品筛选条件 |
| `recommend_condition` | `recommend_condition` | `recommendCondition` | 推荐条件: 且或组件数据格式 |
| `recommend_suggest` | `recommend_suggest` | `recommendSuggest` | 推荐建议 |
| `recommend_type` | `recommend_type` | `recommendType` | 推荐类型 |
| `task_summary` | `task_summary` | `taskSummary` | 任务摘要 |
| `visit_document` | `visit_document` | `visitDocument` | 拜访单据 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `label_id` | `label_id` | `labelId` | 标签ID |
| `labelValueId` | `labelValueId` | `labelValueId` | 标签值 |
| `recommend_type_plan` | `recommend_type_plan` | `recommendTypePlan` | 计划推荐类型 |
| `recommend_type_task` | `recommend_type_task` | `recommendTypeTask` | 任务推荐类型 |
| `rule_id` | `rule_id` | `ruleId` | 规则id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `order_end_date` | `order_end_date` | `orderEndDate` | 订单结束日期 |
| `order_start_date` | `order_start_date` | `orderStartDate` | 订单开始日期 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `delay_days` | `delay_days` | `delayDays` | 指定天数 |
| `execute_days` | `execute_days` | `executeDays` | 执行时长 |
| `max_visit_quantity` | `max_visit_quantity` | `maxVisitQuantity` | 最大拜访量 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `recommendBasicMotionChilds` | 推荐项-推荐动作 |
| `` | `` | `recommendBasicObjectChilds` | 推荐项对象子表 |
| `` | `` | `recommendBasicTaskTypeChilds` | 推荐项-推荐任务 |
| `` | `` | `recommendResults` | 推荐结果 |
| `task_type` | `task_type` | `taskType` | 任务状态 |
| `visit_time_type` | `visit_time_type` | `visitTimeType` | 拜访时间类型 |
| `visitor_type` | `visitor_type` | `visitorType` | 拜访人员类型 |
