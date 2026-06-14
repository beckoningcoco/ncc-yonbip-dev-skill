---
tags: [BIP, 元数据, 数据字典, GL.GL.GlMultiColumn]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 多栏账设置 (`GL.GL.GlMultiColumn`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_multicolumn` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`168b020f-1d66-486a-ab46-3f18203fdef4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 多栏账设置 |
| 物理表 | `gl_multicolumn` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 23 个 |
| 子表 | 1 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `GlMultiColumnSubList` | `GL.GL.GlMultiColumnSub` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `column_content` | `fiepub.epub_multidimensionextref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `ytenant_id` | `` |
| `accsubjectchart_id` | `fiepub.epub_accsubjectchartref` |
| `accentity_id` | `finbd.bd_allaccbodyref` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `ref_code` | `ref_code` | `refCode` | 栏目内容选中的档案refCode |
| `id` | `id` | `id` | 主键 |
| `name2` | `name2` | `name2` | 英文名称 |
| `name3` | `name3` | `name3` | 繁体名称 |
| `name4` | `name4` | `name4` | 多语预留字段 |
| `name5` | `name5` | `name5` | 多语预留字段5 |
| `name6` | `name6` | `name6` | 多语预留字段6 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accsubjectchart_id` | `accsubjectchart_id` | `accsubjectchart` | 科目表 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `column_content` | `column_content` | `columnContent` | 栏目内容 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `analysis_direction` | `analysis_direction` | `analysisDirection` | 分析方向 |
| `bln_detail_column` | `bln_detail_column` | `blnDetailColumn` | 按明细档案分栏 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `GlMultiColumnSubList` | 多栏账设置明细 |
