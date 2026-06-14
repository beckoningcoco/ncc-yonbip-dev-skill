---
tags: [BIP, 元数据, 数据字典, vc.variantConfiguration.VariantConfiguration]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 选配参数文件 (`vc.variantConfiguration.VariantConfiguration`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`vc_variant_configuration` | domain：`engineeringdata` | 应用：`ED` | 业务对象ID：`351d49a7-d5ff-4d4e-8072-bb656f304f0e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 选配参数文件 |
| 物理表 | `vc_variant_configuration` |
| domain/服务域 | `engineeringdata` |
| 所属应用 | `ED` |
| 直连字段 | 39 个 |
| 子表 | 2 个 |
| 关联引用 | 12 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `VCComponent` | `vc.variantConfiguration.VariantConfigurationComponent` | composition |
| `VCAttr` | `vc.variantConfiguration.VariantConfigurationAttr` | composition |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `bom_id` | `` |
| `vc_free_cts` | `` |
| `productId` | `productcenter.productref` |
| `ytenant_id` | `` |
| `` | `` |
| `vc_free_characteristics` | `` |
| `character_id` | `` |
| `org_id` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
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

> 共 39 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 参数文件编号 |
| `check_derived_material` | `check_derived_material` | `checkDerivedMaterial` | 派生物料检查 |
| `replace_derived_material` | `replace_derived_material` | `replaceDerivedMaterial` | 替换派生物料环节 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 最后修改人 |
| `create_config_type` | `create_config_type` | `createConfigType` | 组件选配文件创建方式 |
| `sub_version` | `sub_version` | `subVersion` | 替代版本 |
| `substitute_flag` | `substitute_flag` | `substituteFlag` | 替代版本标识 |
| `vc_config_type` | `vc_config_type` | `vcConfigType` | 选配文件类型 |
| `version` | `version` | `version` | 版本 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productId` | `productId` | `productId` | 物料ID |
| `` | `creatorId` | `creatorId` | 创建人id |
| `` | `modifierId` | `modifierId` | 最后修改人id |
| `bom_id` | `bom_id` | `bomId` | BOMID |
| `character_id` | `character_id` | `characterId` | 特征ID |
| `org_id` | `org_id` | `orgId` | 组织 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 最后修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `new_version` | `new_version` | `newVersion` | 是否最新版本 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ref_supper_bom` | `ref_supper_bom` | `refSupperBom` | 参照超级BOM组件选配 |
| `show_group` | `show_group` | `showGroup` | 显示分组信息 |
| `` | `status` | `status` | 单据状态 |
| `vc_type` | `vc_type` | `vcType` | 选配类型 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `description` | `description` | `description` | 参数文件描述 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `effectiveDate` | `effectiveDate` | `effectiveDate` | 生效日期 |
| `expiryDate` | `expiryDate` | `expiryDate` | 失效日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 最后修改时间 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `purpose` | `purpose` | `purpose` | 用途 |
| `` | `` | `VCAttr` | 选配参数文件属性模版 |
| `` | `` | `VCComponent` | 选配参数文件组件模版 |

### OptionCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vc_free_characteristics` | `vc_free_characteristics` | `vcFreeCharacteristics` | 特征组 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vc_free_cts` | `vc_free_cts` | `vcFreeCts` | 自由项特征组 |
