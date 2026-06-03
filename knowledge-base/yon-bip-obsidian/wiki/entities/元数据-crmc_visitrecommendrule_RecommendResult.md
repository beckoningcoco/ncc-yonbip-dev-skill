---
tags: [BIP, 元数据, 数据字典, crmc.visitrecommendrule.RecommendResult]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 推荐结果 (`crmc.visitrecommendrule.RecommendResult`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`crmc_recommend_result` | domain：`yycrm` | 应用：`CRMC` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 推荐结果 |
| 物理表 | `crmc_recommend_result` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CRMC` |
| 直连字段 | 31 个 |
| 子表 | 4 个 |
| 关联引用 | 17 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `recommendResultObjectChilds` | `crmc.visitrecommendrule.RecommendResultObjectBasic` | composition |
| `recommendResultTaskTypeChilds` | `crmc.visitrecommendrule.RecommendResultTaskType` | composition |
| `recommendResultProductChilds` | `crmc.visitrecommendrule.RecommendResultProduct` | composition |
| `recommendResultMotionChilds` | `crmc.visitrecommendrule.RecommendResultMotion` | composition |

## 关联引用 (17个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `basic_id` | `` |
| `recommend_plan` | `` |
| `terminal_id` | `` |
| `org` | `` |
| `recommend_task` | `` |
| `oppt` | `` |
| `clue` | `` |
| `customer_id` | `` |
| `rule_id` | `` |
| `stage_id` | `` |

## 继承接口 (2个, 9字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 31 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `recommend_reason` | `recommend_reason` | `recommendReason` | 推荐原因 |
| `recommend_suggest` | `recommend_suggest` | `recommendSuggest` | 推荐建议 |
| `recommend_type` | `recommend_type` | `recommendType` | 推荐类型 |
| `visit_document` | `visit_document` | `visitDocument` | 拜访单据 |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `basic_id` | `basic_id` | `basicId` | 推荐依据id |
| `clue` | `clue` | `clue` | 线索 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `customer_id` | `customer_id` | `customerId` | 客户id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `oppt` | `oppt` | `oppt` | 商机 |
| `org` | `org` | `orgId` | 组织 |
| `recommend_plan` | `recommend_plan` | `recommendPlan` | 拜访计划id |
| `recommend_task` | `recommend_task` | `recommendTask` | 拜访任务id |
| `rule_id` | `rule_id` | `ruleId` | 规则id |
| `stage_id` | `stage_id` | `stageId` | 商机当前阶段 |
| `terminal_id` | `terminal_id` | `terminalId` | 终端id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `type` | `type` | `type` | 推荐对象 1= 拜访 2 =商机 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `recommend_time` | `recommend_time` | `recommendTime` | 推荐时间 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `recommendResultMotionChilds` | 推荐结果-推荐动作 |
| `` | `` | `recommendResultObjectChilds` | 推荐项对象子表 |
| `` | `` | `recommendResultProductChilds` | 推荐结果-推荐商品 |
| `` | `` | `recommendResultTaskTypeChilds` | 推荐结果-推荐任务 |
