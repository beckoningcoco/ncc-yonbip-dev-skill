---
tags: [BIP, 元数据, 数据字典, bd.bill.BillTypeRuleAdmin]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 单据规则运营 (`bd.bill.BillTypeRuleAdmin`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_billtype_rule_basic` | domain：`transtype` | 应用：`BMMMM` | 业务对象ID：`5a67ced1-559e-4302-a0d0-cde9569a0656`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 单据规则运营 |
| 物理表 | `bd_billtype_rule_basic` |
| 数据库 schema | `transtype` |
| 所属应用 | `BMMMM` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `tenantid` | `` |
| `billtype_id` | `` |

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rule_reg_class` | `rule_reg_class` | `ruleRegClass` | 规则rule |
| `micro_service_code` | `micro_service_code` | `microServiceCode` | 微服务编码 |
| `owner_app` | `owner_app` | `ownerApp` | 规则所属应用 |
| `rule_code` | `rule_code` | `ruleCode` | 规则编码 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billtype_id` | `billtype_id` | `billTypeId` | 单据类型主键 |
| `tenantid` | `tenantid` | `tenantid` | 租户id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标识 |
| `enable` | `enable` | `enable` | 是否启用 |
| `rule_type` | `rule_type` | `ruleType` | 规则类型 |
| `upgrade_data_type` | `upgrade_data_type` | `upgradeDataType` | upgradeDataType |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rule_name` | `rule_name` | `ruleName` | 规则名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
