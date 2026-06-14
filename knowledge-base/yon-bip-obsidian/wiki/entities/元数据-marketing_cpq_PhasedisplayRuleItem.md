---
tags: [BIP, 元数据, 数据字典, marketing.cpq.PhasedisplayRuleItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 盈亏显示规则明细 (`marketing.cpq.PhasedisplayRuleItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`udh_cpq_phasedisplay_ruleitem` | domain：`marketingbill` | 应用：`CPQ` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 盈亏显示规则明细 |
| 物理表 | `udh_cpq_phasedisplay_ruleitem` |
| domain/服务域 | `marketingbill` |
| 所属应用 | `CPQ` |
| 直连字段 | 7 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `ruleid` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 7 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `profit` | `profit` | `profit` | 盈亏情况 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ruleid` | `ruleid` | `ruleId` | 盈亏显示规则ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `gross_margin_end` | `gross_margin_end` | `grossMarginEnd` | 预估毛利(%)止 |
| `gross_margin_start` | `gross_margin_start` | `grossMarginStart` | 预估毛利(%)起 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
