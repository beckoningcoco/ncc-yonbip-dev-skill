---
tags: [BIP, 元数据, 数据字典, aa.vendor.VendorQualify]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 供应商资质 (`aa.vendor.VendorQualify`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_vendorqualify` | domain：`yssupplier` | 应用：`DPMSPL` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商资质 |
| 物理表 | `aa_vendorqualify` |
| 数据库 schema | `yssupplier` |
| 所属应用 | `DPMSPL` |
| 直连字段 | 24 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `aa.vendor.VendorQualifyDefine` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `iVendorId` | `` |
| `vendorQualifyCharacterDefine` | `` |
| `qualify_grade_id` | `aa_qualifyGrade` |
| `qualifydoc_id` | `aa_qualify` |
| `tenant_id` | `` |
| `` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enter_mode` | `enter_mode` | `enterMode` | 数据录入方式 |
| `qualifydoc_code` | `qualifydoc_code` | `qualifydocCode` | 资质档案编码 |
| `qualify_name` | `qualify_name` | `qualifydocName` | 证照名称 |
| `qualifydoc_remark` | `qualifydoc_remark` | `qualifydocDescription` | 证照说明 |
| `qualify_grade_name` | `qualify_grade_name` | `qualifyGradeName` | 证件等级 |
| `qualify_code` | `qualify_code` | `qualifyCode` | 证件号 |
| `remark` | `remark` | `remark` | 备注 |
| `file_path` | `file_path` | `filePath` | 附件 |
| `erpCode` | `erpCode` | `erpCode` | 外部编码 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iVendorId` | `iVendorId` | `vendor` | 供应商档案主键 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `qualifydoc_id` | `qualifydoc_id` | `qualifydoc` | 资质档案主键 |
| `qualify_grade_id` | `qualify_grade_id` | `qualifyGrade` | 证件等级主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `long_effective` | `long_effective` | `longEffective` | 长期有效 |
| `file_must` | `file_must` | `fileMust` | 附件是否必传 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_preset` | `is_preset` | `isPreset` | 是否预置 |
| `qualify_define` | `qualify_define` | `qualifyDefine` | 自定义资质 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 资质档案主键 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `qualify_date` | `qualify_date` | `qualifyDate` | 使用期限开始日期 |
| `qualify_exp_date` | `qualify_exp_date` | `qualifyExpDate` | 到期日 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vendorQualifyCharacterDefine` | `vendorQualifyCharacterDefine` | `vendorQualifyCharacterDefine` | 供应商资质自定义项 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 供应商资质自定义项 |
