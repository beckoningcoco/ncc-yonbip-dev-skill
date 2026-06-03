---
tags: [BIP, 元数据, 数据字典, fa.fixedassetcategory.FixedAssetsCategoryVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产类别 (`fa.fixedassetcategory.FixedAssetsCategoryVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`at_fixedassetcategory` | domain：`yonyoufi` | 应用：`FA` | 业务对象ID：`fb46eeae-13ec-4991-a10d-8f7ca5db2886`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产类别 |
| 物理表 | `at_fixedassetcategory` |
| 数据库 schema | `yonyoufi` |
| 所属应用 | `FA` |
| 直连字段 | 28 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `fixed_assets_categorytreeref` |
| `depreciationmethod` | `at_depreciation_methodlistref` |
| `` | `` |
| `units` | `pc_unitref` |
| `tenant_id` | `` |

## 继承接口 (3个, 14字段)

- **树型结构** (`base.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`

## 字段列表（按类型分组）

> 共 28 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 分类编码 |
| `accrued` | `accrued` | `accrued` | 计提属性 |
| `path` | `path` | `path` | 路径 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `parent_id` | `parent_id` | `parent` | 上级单位 |
| `units` | `units` | `units` | 计量单位 |
| `depreciationmethod` | `depreciationmethod` | `depreciationmethod` | 折旧方法 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `presetdate` | `presetdate` | `presetdate` | 是否为预置数据 |
| `` | `isEnd` | `isEnd` | 是否末级 |
| `isinventory` | `isinventory` | `isInventory` | 是否盘点 |
| `isnewcurdepr` | `isnewcurdepr` | `isNewCurDepr` | 新增资产当期计提 |
| `isdisposalcurdepr` | `isdisposalcurdepr` | `isDisposalCurDepr` | 处置资产当期计提 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `lifemonth` | `lifemonth` | `lifemonth` | 使用月限 |
| `iLevel` | `iLevel` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sysid` | `sysid` | `sysid` | sysid |
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `scrapvaluerate` | `scrapvaluerate` | `scrapvaluerate` | 残值率(%) |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 分类名称 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
