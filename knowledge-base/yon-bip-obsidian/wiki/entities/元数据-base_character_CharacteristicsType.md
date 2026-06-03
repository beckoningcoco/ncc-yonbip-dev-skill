---
tags: [BIP, 元数据, 数据字典, base.character.CharacteristicsType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 特征组类型 (`base.character.CharacteristicsType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`base_characteristics_type` | domain：`u8c-userdefine` | 应用：`CHARACTER` | 业务对象ID：`bbf46fd0-b927-4e6d-aa98-24c35c122578`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 特征组类型 |
| 物理表 | `base_characteristics_type` |
| 数据库 schema | `u8c-userdefine` |
| 所属应用 | `CHARACTER` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 1 个 |

## 关联引用 (1个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |

## 继承接口 (2个, 2字段)

- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **排序** (`base.character.IOrder`)
  - `iOrder` → `iOrder`

## 字段列表（按类型分组）

> 共 10 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCode` | `cCode` | `code` | 编码 |
| `cInterfaceUri` | `cInterfaceUri` | `interfaceUri` | 特征接口uri |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bSupportIsMallShowIt` | `bSupportIsMallShowIt` | `supportIsMallShowIt` | 是否支持控制特征商城是否显示 |
| `bSupportIsRequired` | `bSupportIsRequired` | `supportIsRequired` | 是否支持控制特征是否必输 |

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

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cName` | `cName` | `name` | 名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
