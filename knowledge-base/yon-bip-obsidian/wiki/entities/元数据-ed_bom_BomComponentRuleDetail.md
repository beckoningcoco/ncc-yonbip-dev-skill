---
tags: [BIP, 元数据, 数据字典, ed.bom.BomComponentRuleDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# BOM子件规则明细 (`ed.bom.BomComponentRuleDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`vc_variant_rule_detail` | domain：`engineeringdata` | 应用：`ED` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | BOM子件规则明细 |
| 物理表 | `vc_variant_rule_detail` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 直连字段 | 15 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `bom_id` | `` |
| `ytenant_id` | `` |
| `bom_component_id` | `` |

## 继承接口 (2个, 2字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 15 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `memo` | `memo` | `memo` | 备注 |
| `rule_ls_text` | `rule_ls_text` | `ruleLsText` | 约束条件 |
| `rule_rs_text` | `rule_rs_text` | `ruleRsText` | 结果 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_component_id` | `bom_component_id` | `bomComponentId` | 关联材料 |
| `bom_id` | `bom_id` | `bomId` | 物料清单 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `invalid_opt` | `invalid_opt` | `invalidOpt` | 控制方式 |
| `is_migrate` | `is_migrate` | `isMigrate` | 是否来源于迁移 |
| `rule_type` | `rule_type` | `ruleType` | 类型 |
| `type` | `type` | `type` | 规则类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### bigText (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rule_show_json` | `rule_show_json` | `ruleGroupUiShow` | 显示json |
| `rules_json` | `rules_json` | `rulesJson` | 规则列表json |
