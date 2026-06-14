---
tags: [BIP, 元数据, 数据字典, fa.facategorystructure.FixedAssetCategoryStructure]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产类别结构 (`fa.facategorystructure.FixedAssetCategoryStructure`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_category_structure` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`c62fd68f-2c19-46bc-acf1-270f5e521e7c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产类别结构 |
| 物理表 | `fa_category_structure` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 25 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `FixedAssetCategoryStructure_applicationScopeList` | `fa.facategorystructure.FixedAssetCategoryStructure_applicationScope` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `application_scope` | `finbd.bd_allaccbodyref` |

## 继承接口 (5个, 13字段)

- **树型结构** (`iuap.busiObj.ITree`)
  - `ifend` → `ifend`
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `coding_rule` | `coding_rule` | `codingRule` | 编码规则 |
| `description` | `description` | `description` | 描述 |
| `id` | `id` | `id` | id |
| `code` | `code` | `code` | 编码 |
| `path` | `path` | `path` | 路径 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_auto_code` | `bln_auto_code` | `autoCode` | 自动编码 |
| `include_next_level` | `include_next_level` | `includeNextLevel` | 包含下级 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `control_level` | `control_level` | `controLevel` | 管控层级 |
| `control_strategy` | `control_strategy` | `controlStrategy` | 管控策略 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `struct_level` | `struct_level` | `structLevel` | 结构层级 |
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ifend` | `ifend` | `isEnd` | 是否末级 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### quoteList (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `application_scope` | `application_scope` | `applicationScope` | 适用范围 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `FixedAssetCategoryStructure_applicationScopeList` | 适用范围多选引用子实体 |
