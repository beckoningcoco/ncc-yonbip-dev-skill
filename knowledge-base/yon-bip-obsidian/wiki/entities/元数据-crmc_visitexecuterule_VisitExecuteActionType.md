---
tags: [BIP, 元数据, 数据字典, crmc.visitexecuterule.VisitExecuteActionType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 执行规则行动类型 (`crmc.visitexecuterule.VisitExecuteActionType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`crmc_visit_execute_action_type` | domain：`yycrm` | 应用：`CRMC` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 执行规则行动类型 |
| 物理表 | `crmc_visit_execute_action_type` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `CRMC` |
| 直连字段 | 6 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `action_set_id` | `` |
| `execute_rule_id` | `` |
| `action_type_id` | `yycrm.act_actiontypesettingref` |
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 6 个直连字段

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `execute_rule_id` | `execute_rule_id` | `executeRuleId` | 执行规则id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `action_set_id` | `action_set_id` | `actionSetId` | 行动类型设置ID |
| `action_type_id` | `action_type_id` | `actionTypeId` | 适用行动类型id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 子表id |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
