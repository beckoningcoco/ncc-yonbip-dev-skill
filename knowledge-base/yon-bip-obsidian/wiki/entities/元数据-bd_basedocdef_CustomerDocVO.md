---
tags: [BIP, 元数据, 数据字典, bd.basedocdef.CustomerDocVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 自定义档案维护 (`bd.basedocdef.CustomerDocVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_cust_doc` | domain：`ucfbasedoc` | 应用：`DPMPI` | 业务对象ID：`e089f8ca-e119-44bd-a237-7323628420f3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 自定义档案维护 |
| 物理表 | `bd_cust_doc` |
| 数据库 schema | `ucfbasedoc` |
| 所属应用 | `DPMPI` |
| 直连字段 | 32 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `ucfbasedoc.customerdoc_treecardref` |
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `custdocdefid` | `` |
| `countries` | `` |
| `orgid` | `ucf-org-center.org_pure_tree_ref` |
| `parentid` | `ucfbasedoc.customerdoc_treecardref` |

## 继承接口 (7个, 16字段)

- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **树型结构** (`ucfbase.ucfbaseItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **审计信息** (`basedoc.basedocItf.AuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 32 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 编码 |
| `shortname` | `shortname` | `shortname` | 简称 |
| `objid` | `objid` | `objid` | 外系统主键 |
| `log` | `log` | `log` | 操作日志 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源 |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `path` | `path` | `path` | 路径 |
| `tenantid` | `tenantid` | `tenant` | 租户(废弃) |
| `businessid` | `businessid` | `businessid` | 友企连标识 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `parentid` | `parentid` | `parentid` | 上级档案 |
| `orgid` | `orgid` | `orgid` | 组织 |
| `custdocdefid` | `custdocdefid` | `custdocdefid` | 档案定义 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ispreset` | `ispreset` | `ispreset` | 是否预置 |
| `` | `isEnd` | `isEnd` | 是否末级 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sortnum` | `sortnum` | `sortnum` | 序号 |
| `enable` | `enable` | `enable` | 启用状态 |
| `social_mctype` | `social_mctype` | `socialMctype` | 管控类型 |
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |
| `dr` | `dr` | `dr` | 删除状态 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `description` | `description` | `description` | 备注 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |

### referenceList (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `countries` | `countries` | `countries` | 国家/地区 |
