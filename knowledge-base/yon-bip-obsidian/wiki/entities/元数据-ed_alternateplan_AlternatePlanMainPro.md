---
tags: [BIP, 元数据, 数据字典, ed.alternateplan.AlternatePlanMainPro]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 替代方案主物料 (`ed.alternateplan.AlternatePlanMainPro`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ed_alternate_plan_mainpro` | domain：`engineeringdata` | 应用：`ED` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 替代方案主物料 |
| 物理表 | `ed_alternate_plan_mainpro` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 直连字段 | 26 个 |
| 子表 | 1 个 |
| 关联引用 | 13 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `alternatePlanSubPro` | `ed.alternateplan.AlternatePlanSubPro` | composition |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `bom_component_sensitive` | `` |
| `product_id` | `productcenter.productref` |
| `ytenant_id` | `` |
| `pid` | `` |
| `org_id` | `` |
| `stock_unit_id` | `productcenter.pc_productassitunitsref` |
| `bom_unit_id` | `` |
| `bom_component_free_cts` | `` |
| `alt_plan_main_dct` | `` |
| `sku_id` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 26 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sensitive_uid` | `sensitive_uid` | `sensitiveUID` | 敏感域id |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_unit_id` | `bom_unit_id` | `bomUnit` | 主计量单位 |
| `product_id` | `product_id` | `productAuth` | 物料权限 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `pid` | `pid` | `pid` | 替代方案id |
| `sku_id` | `sku_id` | `skuId` | skuId |
| `stock_unit_id` | `stock_unit_id` | `stockUnit` | 库存单位 |
| `org_id` | `org_id` | `orgId` | 组织id |
| `product_id` | `product_id` | `productId` | 物料的ID |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `main_material` | `main_material` | `mainMaterial` | 主料 |
| `critical_material` | `critical_material` | `criticalMaterial` | 关键料标识 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sequence` | `sequence` | `sequence` | 替代次序 |
| `material_id` | `material_id` | `materialId` | 制造物料的ID |
| `id` | `id` | `id` | ID |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `net_demand_ratio` | `net_demand_ratio` | `netDemandRatio` | 净需求比例(%) |
| `stock_numerator_quantity` | `stock_numerator_quantity` | `stockNumeratorQuantity` | 库存单位数量 |
| `stock_quantity` | `stock_quantity` | `stockQuantity` | 库存单位使用数量 |
| `change_rate` | `change_rate` | `changeRate` | 换算率 |
| `change_rate_den` | `change_rate_den` | `changeRateDen` | 换算率分母 |
| `change_rate_num` | `change_rate_num` | `changeRateNum` | 换算率分子 |

### FreeCT (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_component_free_cts` | `bom_component_free_cts` | `bomComponentFreeCts` | 自由项特征组 |
| `bom_component_sensitive` | `bom_component_sensitive` | `bomComponentSensitive` | BOM敏感域 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `alt_plan_main_dct` | `alt_plan_main_dct` | `altPlanMainProDct` | 自定义项特征属性组 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `alternatePlanSubPro` | 替代方案替代物料 |
