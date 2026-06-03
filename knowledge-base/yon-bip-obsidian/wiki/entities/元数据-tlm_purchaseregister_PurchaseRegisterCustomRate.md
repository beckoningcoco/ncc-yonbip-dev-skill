---
tags: [BIP, 元数据, 数据字典, tlm.purchaseregister.PurchaseRegisterCustomRate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 自定义利率 (`tlm.purchaseregister.PurchaseRegisterCustomRate`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_purchasregister_custom_rate` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 自定义利率 |
| 物理表 | `tlm_purchasregister_custom_rate` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `mainid` | `` |
| `tlm_purchase_custom_rate_character_def` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_method` | `create_method` | `createMethod` | 生成方式：引用枚举类-BillCreateMethodEnum |
| `id` | `id` | `id` | ID |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 申购登记id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `effective_date` | `effective_date` | `effectiveDate` | 生效日 |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rate_change_type` | `rate_change_type` | `rateChangeType` | 利率变更类型 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rate` | `rate` | `rate` | 利率 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tlm_purchase_custom_rate_character_def` | `tlm_purchase_custom_rate_character_def` | `purchaseRegisterCustomRateDefineCharacterDef` | 自定义利率子表特征 |
