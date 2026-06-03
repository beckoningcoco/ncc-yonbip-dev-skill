---
tags: [BIP, 元数据, 数据字典, base.character.CharacteristicsValueRelation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 特征组特征值关联表 (`base.character.CharacteristicsValueRelation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`base_characteristics_value_relation` | domain：`u8c-userdefine` | 应用：`CHARACTER` | 业务对象ID：`c7210069-229b-45cd-8eee-25f753bf0138`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 特征组特征值关联表 |
| 物理表 | `base_characteristics_value_relation` |
| 数据库 schema | `u8c-userdefine` |
| 所属应用 | `CHARACTER` |
| 直连字段 | 18 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `iCharacterId` | `` |
| `iCharacteristicsId` | `` |
| `ytenant_id` | `` |
| `iCharacterValueEnumId` | `` |
| `creatorId` | `yonbip-ndi-meeting.RefTable_d3d3cf3d50` |
| `modifierId` | `yonbip-ndi-meeting.RefTable_d3d3cf3d50` |
| `iCharacteristicsRelationId` | `` |

## 继承接口 (5个, 12字段)

- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **排序** (`base.character.IOrder`)
  - `iOrder` → `iOrder`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人名称 |
| `erpCode` | `erpCode` | `erpCode` | 商家编码 |
| `modifier` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCharacterId` | `iCharacterId` | `character` | 特征 |
| `iCharacterValueEnumId` | `iCharacterValueEnumId` | `characterValueEnum` | 枚举特征值 |
| `iCharacteristicsId` | `iCharacteristicsId` | `characteristics` | 特征组 |
| `iCharacteristicsRelationId` | `iCharacteristicsRelationId` | `characteristicsRelation` | 特征组关联特征 |
| `creatorId` | `creatorId` | `creatorId` | 创建人 |
| `modifierId` | `modifierId` | `modifierId` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

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

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
