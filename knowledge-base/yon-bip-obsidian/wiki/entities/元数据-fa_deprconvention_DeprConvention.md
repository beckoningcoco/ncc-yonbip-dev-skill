---
tags: [BIP, 元数据, 数据字典, fa.deprconvention.DeprConvention]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分摊惯例 (`fa.deprconvention.DeprConvention`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_depr_convention` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`e9096cb2-144a-424a-8a80-f20e5a306ee3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 分摊惯例 |
| 物理表 | `fa_depr_convention` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 20 个 |
| 子表 | 1 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodies` | `fa.deprconvention.DeprConventionDtl` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `from_period_year_id` | `finbd.bd_periodyear` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `acc_period_scheme_id` | `finbd.bd_accperiodscheme` |
| `to_period_year_id` | `finbd.bd_periodyear` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 分摊惯例编码 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户隔离唯一标识 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_scheme_id` | `acc_period_scheme_id` | `accPeriodScheme` | 会计期间方案 |
| `from_period_year_id` | `from_period_year_id` | `fromPeriodYear` | 从会计年度 |
| `to_period_year_id` | `to_period_year_id` | `toPeriodYear` | 至会计年度 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_depr_enabled` | `bln_depr_enabled` | `isDeprenabled` | 启用时开始分摊 |
| `bln_enabled` | `bln_enabled` | `isEnabled` | 是否启用 |
| `bln_preset` | `bln_preset` | `isPreset` | 是否预置 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `period_control_mode` | `period_control_mode` | `periodControlMode` | 期间控制方式 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `period_num` | `period_num` | `periodNum` | 会计期间个数 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `description` | `description` | `description` | 说明 |
| `name` | `name` | `name` | 分摊惯例名称 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodies` | 分摊惯例明细 |
