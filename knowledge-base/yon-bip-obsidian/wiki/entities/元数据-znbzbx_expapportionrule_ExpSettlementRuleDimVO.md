---
tags: [BIP, 元数据, 数据字典, znbzbx.expapportionrule.ExpSettlementRuleDimVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 结算规则转换/结算维度 (`znbzbx.expapportionrule.ExpSettlementRuleDimVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_expsettlementrule_dim` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 结算规则转换/结算维度 |
| 物理表 | `znbz_expsettlementrule_dim` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `pk_expapportionrule` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dimappbcode` | `dimappbcode` | `dimappbcode` | 结算明细子表.字段编码 |
| `dimappbname` | `dimappbname` | `dimappbname` | 结算明细子表.字段名称 |
| `dimcode` | `dimcode` | `dimcode` | 维度编码 |
| `dimexpbcode` | `dimexpbcode` | `dimexpbcode` | 明细子表.字段编码 |
| `dimexpbname` | `dimexpbname` | `dimexpbname` | 明细子表.字段名称 |
| `dimname` | `dimname` | `dimname` | 维度名称 |
| `dimtype` | `dimtype` | `dimtype` | 类型 |
| `dimvmemo` | `dimvmemo` | `dimvmemo` | 备注 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_expapportionrule` | `pk_expapportionrule` | `pk_expapportionrule` | 主表主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dimisprepare` | `dimisprepare` | `dimisprepare` | 是否作为结算维度 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
