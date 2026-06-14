---
tags: [BIP, 元数据, 数据字典, pc.productline.ProductLine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 产品线 (`pc.productline.ProductLine`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`productline` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：`e90fac87-5605-4330-80c4-b94c073e682c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 产品线 |
| 物理表 | `productline` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 13 个 |
| 子表 | 1 个 |
| 关联引用 | 4 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `productLineDefines` | `pc.productline.ProductLineDefine` | composition |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `productline_character_def` | `` |
| `` | `` |
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (5个, 6字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **社会化核心企业档案** (`base.itf.ISociCoreArchive`)
  - `sociCoreArchive_id` → `sociCoreArchive_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 13 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCode` | `cCode` | `code` | 编码 |
| `erpCode` | `erpCode` | `erpCode` | 外部编码 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `sociCoreArchive_id` | `sociCoreArchive_id` | `sociCoreArchive` | 社会化核心企业档案 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cName` | `cName` | `name` | 名称 |
| `remark` | `remark` | `remark` | 备注 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productline_character_def` | `productline_character_def` | `productLineCharacterDef` | 产品线自定义项 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `productLineDefines` | 产品线自定义项 |
