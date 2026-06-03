---
tags: [BIP, 元数据, 数据字典, vc.variantconfigcts.VariantConfigBomDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 特征选配单物料表体 (`vc.variantconfigcts.VariantConfigBomDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`vc_variantconfigcts_bom_detail` | domain：`engineeringdata` | 应用：`ED` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 特征选配单物料表体 |
| 物理表 | `vc_variantconfigcts_bom_detail` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 直连字段 | 18 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `vc_config_product_id` | `` |
| `component_free_cts` | `` |
| `product_id` | `productcenter.productref` |
| `vc_cts_id` | `` |
| `ytenant_id` | `` |
| `super_bom_id` | `` |
| `vc_config_id` | `` |
| `tenant_id` | `` |
| `vca_free_cts` | `` |

## 继承接口 (3个, 3字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `super_bom_version` | `super_bom_version` | `superBomVersion` | 超级bom版本 |
| `create_type` | `create_type` | `createType` | 创建类型 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `product_id` | `product_id` | `productId` | 物料id |
| `vc_cts_id` | `vc_cts_id` | `vcCtsId` | 特征选配单主表id |
| `vc_config_id` | `vc_config_id` | `vcConfigId` | 选配参数文件id |
| `super_bom_id` | `super_bom_id` | `superBomId` | 超级bomid |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `vc_config_product_id` | `vc_config_product_id` | `vcConfigProductId` | 来源选配参数文件物料行ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `chose_flag` | `chose_flag` | `choseFlag` | 已选配 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `is_derived` | `is_derived` | `isDerived` | 是否派生物料 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 子表id |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `component_use_num` | `component_use_num` | `componentUseNum` | 子件使用数量 |
| `num` | `num` | `num` | 数量 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### OptionCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vca_free_cts` | `vca_free_cts` | `vcaFreeCts` | 选配项特征组 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `component_free_cts` | `component_free_cts` | `componentFreeCT` | 子件自由项特征组自定义项实体 |
