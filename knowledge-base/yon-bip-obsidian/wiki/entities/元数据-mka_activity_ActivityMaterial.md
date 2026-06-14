---
tags: [BIP, 元数据, 数据字典, mka.activity.ActivityMaterial]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 营销活动活动物料 (`mka.activity.ActivityMaterial`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mka_activity_material` | domain：`yycrm` | 应用：`MKA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 营销活动活动物料 |
| 物理表 | `mka_activity_material` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `MKA` |
| 直连字段 | 34 个 |
| 子表 | 1 个 |
| 关联引用 | 12 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `materialBodyDef` | `mka.activity.ActivityMaterialDef` | composition |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `expenseItem` | `finbd.bd_expenseitemref` |
| `activityId` | `` |
| `` | `` |
| `activity_plan_material` | `` |
| `main_unit` | `productcenter.pc_unitref` |
| `product` | `productcenter.pc_productquerytreeref` |
| `unit` | `productcenter.pc_unitref` |
| `activityMaterialDefineCharacter` | `` |
| `ytenant_id` | `` |
| `productDefineCharacter` | `` |

## 继承接口 (2个, 9字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 34 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productSensCode` | `productSensCode` | `productSensCode` | 物料敏感编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activity_plan_material` | `activity_plan_material` | `activityPlanMaterial` | 计划活动物料主键 |
| `main_unit` | `main_unit` | `mainUnit` | 主单位 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `activityId` | `activityId` | `activityId` | 活动ID |
| `product` | `product` | `product` | 物料ID |
| `unit` | `unit` | `unit` | 计量单位ID |
| `expenseItem` | `expenseItem` | `expenseItem` | 费用项ID |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `unit_exchange_type` | `unit_exchange_type` | `unitExchangeType` | 换算类型 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `lineNo` | `lineNo` | `lineNo` | 行号 |
| `main_quantity` | `main_quantity` | `mainQuantity` | 主数量 |
| `main_unit_rate` | `main_unit_rate` | `mainUnitRate` | 换算率 |
| `apply_main_quantity` | `apply_main_quantity` | `applyMainQuantity` | 已请购主数量 |
| `apply_order_quantity` | `apply_order_quantity` | `applyOrderQuantity` | 已请购数量 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `product_price` | `product_price` | `productPrice` | 单价 |
| `product_amount` | `product_amount` | `productAmount` | 金额 |
| `apply_quantity` | `apply_quantity` | `applyQuantity` | 申领数量 |
| `use_quantity` | `use_quantity` | `useQuantity` | 使用数量 |
| `main_unit_rate_den` | `main_unit_rate_den` | `mainUnitRateDen` | 换算率分母 |
| `main_unit_rate_num` | `main_unit_rate_num` | `mainUnitRateNum` | 换算率分子 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productDefineCharacter` | `productDefineCharacter` | `productDefineCharacter` | 物料自定义项 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activityMaterialDefineCharacter` | `activityMaterialDefineCharacter` | `activityMaterialDefineCharacter` | 活动物料自定义特征组 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `materialBodyDef` | 活动物料自定义项 |
