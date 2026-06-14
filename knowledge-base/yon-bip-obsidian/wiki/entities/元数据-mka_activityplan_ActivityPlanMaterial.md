---
tags: [BIP, 元数据, 数据字典, mka.activityplan.ActivityPlanMaterial]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 活动计划物料 (`mka.activityplan.ActivityPlanMaterial`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mka_activityplan_material` | domain：`yycrm` | 应用：`MKA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 活动计划物料 |
| 物理表 | `mka_activityplan_material` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `MKA` |
| 直连字段 | 18 个 |
| 子表 | 1 个 |
| 关联引用 | 11 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `activityPlanMaterialFreeDef` | `mka.activityplan.ActivityPlanMaterialFreeDef` | composition |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `product` | `productcenter.pc_productquerytreeref` |
| `unit` | `productcenter.pc_unitref` |
| `ytenant_id` | `` |
| `activityplan_id` | `` |
| `` | `` |
| `productDefineCharacter` | `` |
| `terminal` | `yycrm.dsfa_storeterminal` |
| `activityPlanMaterialDefineCharacter` | `` |
| `dimension_expense_item` | `finbd.bd_expenseitemref` |
| `tenant_id` | `` |
| `customer` | `yycrm.cust_customerref` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `address` | `address` | `address` | 活动地址 |
| `productSensCode` | `productSensCode` | `productSensCode` | 物料敏感域编码 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `activityplan_id` | `activityplan_id` | `activityplanId` | 活动计划 |
| `terminal` | `terminal` | `terminal` | 终端主键 |
| `customer` | `customer` | `customer` | 客户主键 |
| `product` | `product` | `product` | 商品主键 |
| `unit` | `unit` | `unit` | 单位主键 |
| `dimension_expense_item` | `dimension_expense_item` | `dimensionExpenseItem` | 费用项主键 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `product_price` | `product_price` | `productPrice` | 单价 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `product_amount` | `product_amount` | `productAmount` | 金额 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productDefineCharacter` | `productDefineCharacter` | `productDefineCharacter` | 物料自由项特征组 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activityPlanMaterialDefineCharacter` | `activityPlanMaterialDefineCharacter` | `activityPlanMaterialDefineCharacter` | 活动物料自定义特征组 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `activityPlanMaterialFreeDef` | 活动计划物料自由自定义项扩展 |
