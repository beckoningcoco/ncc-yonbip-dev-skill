---
tags: [BIP, 元数据, 数据字典, epub.doctype.DoctypePO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 档案类型 (`epub.doctype.DoctypePO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_doctype` | domain：`fiepub` | 应用：`FP` | 业务对象ID：`c45668dd-229d-4c1f-8987-fc7188529f7e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 档案类型 |
| 物理表 | `epub_doctype` |
| domain/服务域 | `fiepub` |
| schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 37 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ref_doc` | `` |
| `` | `` |

## 继承接口 (2个, 9字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 37 个直连字段

### 文本字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 档案编码 |
| `cache_attributes` | `cache_attributes` | `cacheAttributes` | 缓存属性 |
| `def1` | `def1` | `def1` | 扩展1 |
| `def2` | `def2` | `def2` | 扩展2 |
| `def3` | `def3` | `def3` | 扩展3 |
| `def4` | `def4` | `def4` | 扩展4 |
| `def5` | `def5` | `def5` | 扩展5 |
| `fixdimension` | `fixdimension` | `fixDimension` | 数据隔离维度 |
| `fullname` | `fullname` | `fullname` | 全名称 |
| `ref_code` | `ref_code` | `refCode` | 参照编码 |
| `domain` | `domain` | `domain` | 所属域 |
| `source_from` | `source_from` | `sourceFrom` | 来源系统 |
| `source_id` | `source_id` | `sourceId` | 来源ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户Id |
| `` | `creator` | `creator` | 创建人名称 |
| `datatype` | `datatype` | `datatype` | 数据类型 |
| `doc_attr_code` | `doc_attr_code` | `docAttrCode` | 档案编码字段 |
| `doc_attr_name` | `doc_attr_name` | `docAttrName` | 档案名称字段 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `ref_doc_name` | `ref_doc_name` | `refDocName` | 引用档案名称 |
| `ref_doc_name_resid` | `ref_doc_name_resid` | `refDocNameResid` | 引用档案名称多语资源 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ref_doc` | `ref_doc` | `refDoc` | 引用档案 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `baux` | `baux` | `baux` | 是否辅助项 |
| `enable` | `enable` | `enable` | 启用禁用 |
| `modify` | `modify` | `modify` | 可编辑的 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户编号 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 档案名称 |
| `description` | `description` | `description` | 描述 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
