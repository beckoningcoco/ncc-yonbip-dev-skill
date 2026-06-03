---
tags: [BIP, 元数据, 数据字典, vc.variantConfiguration.VariantConfigurationComponent]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 选配参数文件组件模版 (`vc.variantConfiguration.VariantConfigurationComponent`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`vc_component` | domain：`engineeringdata` | 应用：`ED` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 选配参数文件组件模版 |
| 物理表 | `vc_component` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 直连字段 | 31 个 |
| 子表 | 0 个 |
| 关联引用 | 13 个 |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `component_freect_id` | `` |
| `bom_id` | `` |
| `` | `` |
| `parent_product_id` | `` |
| `ytenant_id` | `` |
| `bom_component_id` | `` |
| `component_product_id` | `` |
| `bom_unit_id` | `` |
| `parent_freect_id` | `` |
| `variant_configuration_id` | `` |
| `vc_group_id` | `` |
| `p_bom_id` | `` |

## 继承接口 (2个, 5字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 31 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_level` | `bom_level` | `bomLevel` | BOM层级 |
| `group_no` | `group_no` | `groupNo` | 配置组号 |
| `material_group_no` | `material_group_no` | `materialGroupNo` | 替代料组号 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_component_id` | `bom_component_id` | `bomComponentId` | 子件ID |
| `bom_id` | `bom_id` | `bomId` | 子件BOMID |
| `bom_unit_id` | `bom_unit_id` | `bomUnit` | 计量单位 |
| `component_product_id` | `component_product_id` | `componentProductId` | 子件物料ID |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `p_bom_id` | `p_bom_id` | `pBomId` | 子件所属BOMID |
| `parent_product_id` | `parent_product_id` | `parentProductId` | 父件物料ID |
| `variant_configuration_id` | `variant_configuration_id` | `variantConfiguration` | 选配参数文件 |
| `vc_group_id` | `vc_group_id` | `variantConfigurationAttrGroup` | 选配参数文件属性组 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `serial_no` | `serial_no` | `serialNo` | 顺序号 |

### 短整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `group_ex` | `group_ex` | `groupEx` | 组内互斥 |
| `group_first` | `group_first` | `groupFirst` | 组内首选 |
| `is_show` | `is_show` | `isShow` | 是否显示 |
| `line_type` | `line_type` | `lineType` | 行类型 |
| `must_select` | `must_select` | `mustSelect` | 是否必选 |
| `num_edit` | `num_edit` | `numEdit` | 数量可改 |
| `usage_type` | `usage_type` | `usageType` | 用量类型 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `component_num` | `component_num` | `componentNum` | 子件数量 |
| `component_use_num` | `component_use_num` | `componentUseNum` | 本阶子件用量 |
| `denominator_quantity` | `denominator_quantity` | `denominatorQuantity` | 母件底数 |

### UserDefine (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `component_freect_id` | `component_freect_id` | `componentFreeCT` | 子件BOM自由项特征组 |
| `parent_freect_id` | `parent_freect_id` | `parentFreeCT` | 父件BOM自由项特征组 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
