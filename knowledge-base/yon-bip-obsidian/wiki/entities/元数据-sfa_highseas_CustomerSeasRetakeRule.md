---
tags: [BIP, 元数据, 数据字典, sfa.highseas.CustomerSeasRetakeRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 公海池收回规则表 (`sfa.highseas.CustomerSeasRetakeRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_seas_retake_rule` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：`3f511bc1-aa59-400e-8b67-9b86e542ea5a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 公海池收回规则表 |
| 物理表 | `sfa_seas_retake_rule` |
| 数据库 schema | `yycrm` |
| 所属应用 | `SFA` |
| 直连字段 | 25 个 |
| 子表 | 4 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `customerRetakeRuleOrg` | `sfa.highseas.CustomerRuleOrg` | composition |
| `customerRetakeTimeSet` | `sfa.highseas.CustomerSeasRetakeTimeSet` | composition |
| `retakePersonList` | `sfa.highseas.RetakePerson` | composition |
| `customerConditionList` | `sfa.highseas.CustomerHighSeasCondition` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `retake_seas_id` | `` |
| `seas_id` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `org_id` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `seas_name` | `seas_name` | `seasName` | 收回方式 |
| `org_name` | `org_name` | `orgName` | 适用组织 |
| `retake_seas_name` | `retake_seas_name` | `retakeSeasName` | 收回线索池名称 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `seas_id` | `seas_id` | `seasId` | 关联公海Id |
| `org_id` | `org_id` | `orgId` | 适用组织ID |
| `retake_seas_id` | `retake_seas_id` | `retakeSeasId` | 收回公海池ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_warning` | `is_warning` | `isWarning` | 设置提醒 |
| `waring_to_ower` | `waring_to_ower` | `warningToOwer` | 提醒负责人 |
| `waring_to_team` | `waring_to_team` | `warningToTeam` | 提醒团队成员 |

### 整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rule_priority` | `rule_priority` | `rulePriority` | 优先级 |
| `rule_type` | `rule_type` | `ruleType` | 收回池 |
| `data_range` | `data_range` | `dataRange` | 数据范围 |
| `retake_seas_type` | `retake_seas_type` | `retakeSeasType` | 收回路径 |
| `remind_day` | `remind_day` | `remindDay` | 收回提醒天数 |
| `remind_hour` | `remind_hour` | `remindHour` | 收回提醒小时数 |
| `retake_rule_relation` | `retake_rule_relation` | `retakeRuleRelation` | 收回规则关系: 0或, 1且,默认是0 |
| `warning_days` | `warning_days` | `warningDays` | 提前X天提醒 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `customerConditionList` | 客户公海条件设定 |
| `` | `` | `customerRetakeRuleOrg` | 客户规则适用组织 |
| `` | `` | `customerRetakeTimeSet` | 公海池收回时间设置表 |
| `` | `` | `retakePersonList` | 收回提醒人员 |
