---
tags: [BIP, 元数据, 数据字典, epub.dimension.MultiDimensionExt]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 辅助核算项 (`epub.dimension.MultiDimensionExt`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_multidimension_ext` | domain：`fiepub` | 应用：`FP` | 业务对象ID：`40227abc-0c57-4766-bbfa-dee9e06ad92c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 辅助核算项 |
| 物理表 | `epub_multidimension_ext` |
| 数据库 schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 33 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `multidimension` | `` |
| `ytenant_id` | `` |
| `creatorId` | `` |
| `modifierId` | `` |
| `sourcedoc` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 13字段)

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
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 33 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `code` | `code` | `code` | 编码 |
| `creator` | `creator` | `creator` | 创建人名称 |
| `datatype` | `datatype` | `datatype` | 数据类型 |
| `modifier` | `modifier` | `modifier` | 修改人名称 |
| `objid` | `objid` | `objid` | 友企连id |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源id |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `sourcedoccode` | `sourcedoccode` | `sourcedoccode` | 来源档案编码 |
| `srccoreid` | `srccoreid` | `srccoreid` | 核心租户的数据id |
| `sysid` | `sysid` | `sysid` | 来源主键 |
| `vrs` | `vrs` | `vrs` | 辅助核算项 |
| `full_name` | `full_name` | `fullName` | 业财分析维度fullname |
| `relate_field` | `relate_field` | `relateField` | 业财分析维度字段编码 |
| `text_type_value` | `text_type_value` | `textTypeValue` | 文本类型辅助值 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creatorId` | `creatorId` | `creatorId` | 创建人 |
| `modifierId` | `modifierId` | `modifierId` | 修改人 |
| `multidimension` | `multidimension` | `multidimension` | 维度 |
| `sourcedoc` | `sourcedoc` | `sourcedoc` | 来源档案类型 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bstrongctrl` | `bstrongctrl` | `bstrongctrl` | 是否强管控 |
| `isvisible` | `isvisible` | `isvisible` | 是否显示 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |
| `sort` | `sort` | `sort` | 排序 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `doctype` | `doctype` | `doctype` | 档案属性 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `description` | `description` | `description` | 描述 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
