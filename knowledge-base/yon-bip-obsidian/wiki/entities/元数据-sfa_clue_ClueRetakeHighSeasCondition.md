---
tags: [BIP, 元数据, 数据字典, sfa.clue.ClueRetakeHighSeasCondition]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 线索公海收回规则条件设定 (`sfa.clue.ClueRetakeHighSeasCondition`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_clue_high_seas_condition` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 线索公海收回规则条件设定 |
| 物理表 | `sfa_clue_high_seas_condition` |
| 数据库 schema | `yycrm` |
| 所属应用 | `SFA` |
| 直连字段 | 18 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `rule_id` | `` |
| `parentId` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `attr` | `attr` | `attr` | 属性 |
| `attrSource` | `attrSource` | `attrSource` | 属性来源 |
| `code` | `code` | `code` | 数据编码 |
| `condition` | `condition` | `condition` | 条件 |
| `conditionRelation` | `conditionRelation` | `conditionRelation` | 条件关系 |
| `parentCode` | `parentCode` | `parentCode` | 父级数据编码 |
| `type` | `type` | `type` | 条件类型 |
| `value1` | `value1` | `value1` | 条件值1 |
| `value2` | `value2` | `value2` | 条件值2 |
| `valueName` | `valueName` | `valueName` | 条件值name |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parentId` | `parentId` | `parentId` | 父节点ID |
| `rule_id` | `rule_id` | `ruleDistributeId` | 分配规则ID |
| `rule_id` | `rule_id` | `ruleId` | 规则ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `condition_type` | `condition_type` | `conditionType` | 数据条件类型 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
