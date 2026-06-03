---
tags: [BIP, 元数据, 数据字典, base.character.CharacterClass]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 特征分类 (`base.character.CharacterClass`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`base_character_class` | domain：`u8c-userdefine` | 应用：`CHARACTER` | 业务对象ID：`4b059d4e-0567-44da-b49c-ccc15212db09`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 特征分类 |
| 物理表 | `base_character_class` |
| 数据库 schema | `u8c-userdefine` |
| 所属应用 | `CHARACTER` |
| 直连字段 | 23 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `` |
| `ytenant_id` | `` |
| `creatorId` | `yonbip-ndi-meeting.RefTable_d3d3cf3d50` |
| `modifierId` | `yonbip-ndi-meeting.RefTable_d3d3cf3d50` |

## 继承接口 (6个, 17字段)

- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **排序** (`base.character.IOrder`)
  - `iOrder` → `iOrder`
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
- **树型结构** (`base.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCode` | `cCode` | `code` | 编码 |
| `creator` | `creator` | `creator` | 创建人名称 |
| `erpCode` | `erpCode` | `erpCode` | 商家编码 |
| `modifier` | `modifier` | `modifier` | 修改人名称 |
| `path` | `path` | `path` | 路径 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creatorId` | `creatorId` | `creatorId` | 创建人 |
| `modifierId` | `modifierId` | `modifierId` | 修改人 |
| `parent_id` | `parent_id` | `parent` | 上级特征分类 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isEnd` | `isEnd` | `isEnd` | 是否末级 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |
| `iOrder` | `iOrder` | `order` | 排序 |
| `sort_num` | `sort_num` | `sort` | 排序号 |
| `status` | `status` | `status` | 状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cComment` | `cComment` | `comment` | 备注 |
| `cName` | `cName` | `name` | 名称 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
