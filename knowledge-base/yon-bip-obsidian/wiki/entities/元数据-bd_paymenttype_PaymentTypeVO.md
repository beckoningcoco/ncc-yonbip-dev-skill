---
tags: [BIP, 元数据, 数据字典, bd.paymenttype.PaymentTypeVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 款项类型 (`bd.paymenttype.PaymentTypeVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_paymenttype` | domain：`finbd` | 应用：`DPMACCT` | 业务对象ID：`52c514dd-d8dd-4eca-a325-cbba7817128f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 款项类型 |
| 物理表 | `bd_paymenttype` |
| domain/服务域 | `finbd` |
| schema | `iuap_apdoc_finbd` |
| 所属应用 | `DPMACCT` |
| 直连字段 | 25 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `character` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 12字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `code` | `code` | String | 编码 |
| `applications_cope` | `applications_cope` | String | 应用范围 |
| `desc` | `desc` | String | 备注 |
| `` | `creator` | String | 创建人名称 |
| `` | `modifier` | String | 修改人名称 |
| `obj_id` | `obj_id` | String | 友企连id |

### 引用字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_date` | `create_date` | Date | 创建日期 |
| `modify_date` | `modify_date` | Date | 修改日期 |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `check_should_pay` | `check_should_pay` | Boolean | 核销应收应付 |
| `prepay_status` | `prepay_status` | Boolean | 预收/预付 |
| `currentaccount` | `currentaccount` | Boolean | 往来登账 |
| `system` | `system` | Boolean | 系统预制 |
| `stopstatus` | `stopstatus` | Boolean | 停用状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `sortnum` | `sortnum` | Integer | 排序字段 |

### 长整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | Long | ID |

### multiLanguage (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 名称 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `character` | `character` | 13cdcef4-3c26-473e-82c0-84380a3687e9 | 款项类型特征属性 |

### timestamp (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |
| `stop_time` | `stop_time` | DateTime | 停用时间 |
