---
tags: [BIP, 元数据, 数据字典, uhybase.labeldoc.LabelAutoCondition]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 标签自动设置条件 (`uhybase.labeldoc.LabelAutoCondition`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_labelautocondition` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标签自动设置条件 |
| 物理表 | `mp_labelautocondition` |
| 数据库 schema | `uhy` |
| 所属应用 | `SDMB` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `cAppID` | `` |
| `ytenant_id` | `` |
| `iLabelID` | `` |
| `iParentGroup` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 16 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAttr` | `cAttr` | `cAttr` | 属性 |
| `cAttrSource` | `cAttrSource` | `cAttrSource` | 属性来源 |
| `cCondition` | `cCondition` | `cCondition` | 条件 |
| `cConditionLevelName` | `cConditionLevelName` | `cConditionLevelName` | 参照名称 |
| `cConditionRelation` | `cConditionRelation` | `cConditionRelation` | 条件关系使用or|and |
| `cType` | `cType` | `cType` | 条件类型 |
| `cValue1` | `cValue1` | `cValue1` | 条件值1 |
| `cValue2` | `cValue2` | `cValue2` | 条件值2 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAppID` | `cAppID` | `cAppID` | 会籍 |
| `iLabelID` | `iLabelID` | `iLabelID` | 标签id |
| `iParentGroup` | `iParentGroup` | `iParentGroup` | 父节点ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iConditionType` | `iConditionType` | `iConditionType` | 条件类型(0:打标签,1:移除标签) |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iConditionLevelId` | `iConditionLevelId` | `iConditionLevelId` | 参照ID |
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
