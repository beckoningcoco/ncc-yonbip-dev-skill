---
tags: [BIP, 元数据, 数据字典, base.character.CharacterValueEnum]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 特征值枚举项子表 (`base.character.CharacterValueEnum`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`base_character_value_enum` | domain：`u8c-userdefine` | 应用：`CHARACTER` | 业务对象ID：`891fd15d-f24e-4d05-91a5-c7c4b96ceec4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 特征值枚举项子表 |
| 物理表 | `base_character_value_enum` |
| domain/服务域 | `u8c-userdefine` |
| schema | `iuap_metadata_extendservice` |
| 所属应用 | `CHARACTER` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `iCharacterId` | `` |
| `ytenant_id` | `` |
| `creatorId` | `yonbip-ndi-meeting.RefTable_d3d3cf3d50` |
| `modifierId` | `yonbip-ndi-meeting.RefTable_d3d3cf3d50` |

## 继承接口 (6个, 14字段)

- **排序** (`base.character.IOrder`)
  - `iOrder` → `iOrder`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cBarCode` | `cBarCode` | `barCode` | 条形码 |
| `cCode` | `cCode` | `code` | 编码 |
| `creator` | `creator` | `creator` | 创建人名称 |
| `erpCode` | `erpCode` | `erpCode` | 商家编码 |
| `modifier` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCharacterId` | `iCharacterId` | `character` | 特征 |
| `creatorId` | `creatorId` | `creatorId` | 创建人 |
| `modifierId` | `modifierId` | `modifierId` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iOrder` | `iOrder` | `order` | 排序 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cName` | `cName` | `name` | 名称 |
