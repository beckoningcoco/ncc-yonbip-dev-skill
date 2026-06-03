---
tags: [BIP, 元数据, 数据字典, ec.ec_valueInsurance.ValueInsurance]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 保价策略主表 (`ec.ec_valueInsurance.ValueInsurance`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`oms_valueInsurance` | domain：`dst` | 应用：`` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 保价策略主表 |
| 物理表 | `oms_valueInsurance` |
| 数据库 schema | `dst` |
| 所属应用 | `` |
| 直连字段 | 9 个 |
| 关联引用 | 3 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `valueInsuranceDetail` | `ec.ec_valueInsurance.ValueInsuranceDetail` | composition |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `valueInsurance_code` | `valueInsurance_code` | String | 策略编码 |
| `valueInsurance_name` | `valueInsurance_name` | String | 策略名称 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | Long | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `init_Fee` | `init_Fee` | Decimal | 起始金额 |

### timestamp (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `pubts` | `pubts` | DateTime | 时间戳 |

### other (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | 94b8cc13-d54f-476b-b23c-09f386220b3e | 保价策略子表 |
| `valueInsurance_method` | `valueInsurance_method` | ValueInsuranceMethod | 保价条件 |
