---
tags: [BIP, 元数据, 数据字典, ed.alternateplan.AlternatePlanSubPro]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 替代方案替代物料 (`ed.alternateplan.AlternatePlanSubPro`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ed_alternate_plan_subpro` | domain：`engineeringdata` | 应用：`ED` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 替代方案替代物料 |
| 物理表 | `ed_alternate_plan_subpro` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 直连字段 | 30 个 |
| 子表 | 0 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `bom_unit_id` | `` |
| `bom_alternate_sensitive` | `` |
| `product_id` | `productcenter.productref` |
| `ytenant_id` | `` |
| `mainpro_id` | `` |
| `bom_alternate_free_cts` | `` |
| `org_id` | `` |
| `sku_id` | `` |
| `tenant_id` | `` |
| `alt_plan_sub_dct` | `` |
| `stock_unit_id` | `productcenter.pc_productassitunitsref` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 30 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sensitive_uid` | `sensitive_uid` | `sensitiveUID` | 敏感域id |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_unit_id` | `bom_unit_id` | `bomUnit` | 主计量单位 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `mainpro_id` | `mainpro_id` | `mainproId` | 主物料ID |
| `org_id` | `org_id` | `orgId` | 组织ID |
| `product_id` | `product_id` | `productId` | 物料ID |
| `sku_id` | `sku_id` | `skuId` | skuId |
| `stock_unit_id` | `stock_unit_id` | `stockUnit` | 单位 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `main_material` | `main_material` | `mainMaterial` | 主料 |
| `critical_material` | `critical_material` | `criticalMaterial` | 关键料标识 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `material_id` | `material_id` | `materialId` | 制造物料的ID |
| `sequence` | `sequence` | `sequence` | 替代次序 |
| `id` | `id` | `id` | ID |

### 数值字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `net_demand_ratio` | `net_demand_ratio` | `netDemandRatio` | 净需求比例(%) |
| `alternate_ratio` | `alternate_ratio` | `alternateRatio` | 替代比分子 |
| `alternate_ratio_mon` | `alternate_ratio_mon` | `alternateRatioMon` | 替代比分母 |
| `numerator_quantity` | `numerator_quantity` | `numeratorQuantity` | 主单位数量 |
| `quantity` | `quantity` | `quantity` | 主单位使用数量 |
| `change_rate` | `change_rate` | `changeRate` | 换算率 |
| `stock_numerator_quantity` | `stock_numerator_quantity` | `stockNumeratorQuantity` | 库存单位数量 |
| `stock_quantity` | `stock_quantity` | `stockQuantity` | 库存单位使用数量 |
| `change_rate_den` | `change_rate_den` | `changeRateDen` | 换算率分母 |
| `change_rate_num` | `change_rate_num` | `changeRateNum` | 换算率分子 |

### FreeCT (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_alternate_free_cts` | `bom_alternate_free_cts` | `bomAlternateFreeCts` | 自由项特征组 |
| `bom_alternate_sensitive` | `bom_alternate_sensitive` | `bomAlternateSensitive` | BOM敏感域 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `effective_date` | `effective_date` | `effectiveDate` | 生效时间 |
| `expiry_date` | `expiry_date` | `expiryDate` | 失效时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `alt_plan_sub_dct` | `alt_plan_sub_dct` | `altPlanSubProDct` | 自定义项特征属性组 |
