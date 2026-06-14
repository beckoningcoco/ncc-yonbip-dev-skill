---
tags: [BIP, 元数据, 数据字典, aa.qualitypricescheme.QualitypriceScheme]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 优质优价方案 (`aa.qualitypricescheme.QualitypriceScheme`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cpu_qualityprice_scheme` | domain：`cpu-bi-service` | 应用：`ycPriceCenter` | 业务对象ID：`9254371d-1896-4399-ae51-55bb6b7c90fd`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 优质优价方案 |
| 物理表 | `cpu_qualityprice_scheme` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 直连字段 | 33 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `priceSchemeItemList` | `aa.qualitypricescheme.QualitypriceSchemeItem` | composition |
| `priceSchemeOrganizationList` | `aa.qualitypricescheme.ApplicableOrganization` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `cpu_qualityprice_scheme_define` | `` |
| `` | `` |
| `product_id` | `productcenter.productref` |
| `scheme_type` | `` |
| `ytenant_id` | `` |
| `manage_class` | `productcenter.pc_managementclassref` |

## 继承接口 (5个, 10字段)

- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **审计信息** (`aa.priceformula.YcIAuditInfo`)
  - `` → ``
  - `` → ``
- **自动编码** (`ucfbase.ucfbaseItf.IAutoCode`)
- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 33 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `code` | `code` | String | 方案编号 |
| `order_id` | `order_id` | String | 单据id |
| `order_item_id` | `order_item_id` | String | 单据行唯一键 |
| `` | `creatorName` | String | 创建人名称 |
| `` | `modifierName` | String | 修改人名称 |
| `feature_range` | `feature_range` | String | 特征范围 |
| `vmemo` | `vmemo` | String | 备注 |
| `version` | `version` | String | 版本 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `scheme_type` | `scheme_type` | 55cc1587-1f0f-4bd4-beae-18f37f40fb7c | 方案分类树列 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |
| `product_id` | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | 物料Id |
| `manage_class` | `manage_class` | b295ef54-c421-4865-aca3-f5a9207a8d50 | 物料分类 |
| `` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人id |
| `` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 更新人id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `enablets` | `enablets` | DateTime | 启用时间 |
| `disablets` | `disablets` | DateTime | 停用时间 |
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 更新时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `islast` | `islast` | Boolean | 是否最新版 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `enable` | `enable` | sys_intboolean | 状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `oid` | `oid` | Long | 初始id |
| `id` | `id` | Long | 方案id |

### multiLanguage (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `scheme_name` | `scheme_name` | String | 方案名称 |

### other (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `order_type` | `order_type` | BillTypeEnum | 单据类型 |
| `type` | `type` | SchemeTypeEnum | 类型 |
| `apply_scene` | `apply_scene` | ApplyScene | 应用场景 |
| `inspect_result_source` | `inspect_result_source` | InspectResultSource | 检验结果来源 |
| `` | `` | f0819815-58ef-4551-91e4-d7fa8cfc56d3 | 优质优价方案组成项 |
| `` | `` | aead02dd-9270-4992-9f71-e2c6b35d2571 | 优质优价方案适用组织表 |

### timestamp (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `pubts` | `pubts` | DateTime | 时间戳 |
| `effective_date` | `effective_date` | DateTime | 生效日期 |
| `expiry_date` | `expiry_date` | DateTime | 失效日期 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `cpu_qualityprice_scheme_define` | `cpu_qualityprice_scheme_define` | b4ce51bc-5468-4745-8f4b-4dc6022036c0 | 优质优价方案自定义项 |
