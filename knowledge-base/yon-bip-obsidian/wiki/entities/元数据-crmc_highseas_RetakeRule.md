---
tags: [BIP, 元数据, 数据字典, crmc.highseas.RetakeRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收回规则 (`crmc.highseas.RetakeRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`crmc_retake_rule` | domain：`yycrm` | 应用：`CRMC` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收回规则 |
| 物理表 | `crmc_retake_rule` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `CRMC` |
| 直连字段 | 18 个 |
| 子表 | 3 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `retakeRuleOrg` | `crmc.highseas.RetakeRuleOrg` | composition |
| `ruleNonRetakeParticipant` | `crmc.highseas.NonRetakeParticipant` | composition |
| `retakeTimeSet` | `crmc.highseas.RetakeTimeSet` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `retake_seas_id` | `` |
| `seas_id` | `` |
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 规则名称 |
| `period_condition` | `period_condition` | `periodCondition` | 数据范围筛选数据 |
| `rule_type` | `rule_type` | `ruleType` | 规则类型 收回规则-retake|关闭规则-close 默认retake |
| `voucher_type` | `voucher_type` | `voucherType` | 单据类型 线索:clue|商机:oppt|客户:customer |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `retake_seas_id` | `retake_seas_id` | `retakeSeasId` | 收回公海id |
| `seas_id` | `seas_id` | `seasId` | 公海id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rule_priority` | `rule_priority` | `rulePriority` | 规则优先级 |

### 短整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `data_range` | `data_range` | `dataRange` | 收回数据范围 0-全部数据|1-筛选数据 默认0 |
| `participant_retake_type` | `participant_retake_type` | `participantRetakeType` | 参与人收回类型 1-收回参与人|2-不收参与人|3-指定不收回的参与人 |
| `retake_rule_relation` | `retake_rule_relation` | `retakeRuleRelation` | 收回规则关系: 0或|1且 默认0 |
| `retake_seas_type` | `retake_seas_type` | `retakeSeasType` | 收回公海池类型 1-本线索池|2-指定线索池 |
| `retake_type` | `retake_type` | `retakeType` | 收回类型 0-公海|1-自建 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `retakeRuleOrg` | 收回规则适用组织 |
| `` | `` | `retakeTimeSet` | 收回规则时间设置 |
| `` | `` | `ruleNonRetakeParticipant` | 不收回的参与人 |
