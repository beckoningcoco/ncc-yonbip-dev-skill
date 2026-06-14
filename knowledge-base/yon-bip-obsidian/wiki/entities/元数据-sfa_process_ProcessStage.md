---
tags: [BIP, 元数据, 数据字典, sfa.process.ProcessStage]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 流程阶段 (`sfa.process.ProcessStage`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_process_stage` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 流程阶段 |
| 物理表 | `sfa_process_stage` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `SFA` |
| 直连字段 | 24 个 |
| 子表 | 5 个 |
| 关联引用 | 11 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `motionList` | `sfa.process.StageMotion` | composition |
| `actionmotionList` | `sfa.process.StageActionMotion` | composition |
| `operationList` | `sfa.process.StageOperation` | composition |
| `businessmotionList` | `sfa.process.StageBusinessMotion` | composition |
| `feedbackList` | `sfa.process.StageFeedBack` | composition |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `current_stage_id` | `yycrm.sfa_stageref` |
| `process_id` | `` |
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `description` | `description` | `description` | 阶段业务说明 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `current_stage_id` | `current_stage_id` | `currentStageId` | 当前阶段 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `process_id` | `process_id` | `processId` | 流程IDID |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_stage_promote_approved` | `is_stage_promote_approved` | `isStagePromoteApproved` | 阶段变更需申请 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sort` | `sort` | `sort` | 显示顺序 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `win_rate` | `win_rate` | `winRate` | 赢单率 |
| `duration` | `duration` | `duration` | 持续时间 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `actionmotionList` | 流程阶段跟进动作 |
| `` | `` | `businessmotionList` | 流程阶段业务动作 |
| `` | `` | `feedbackList` | 流程阶段反馈 |
| `` | `` | `motionList` | 流程阶段动作 |
| `` | `` | `operationList` | 流程阶段操作 |
