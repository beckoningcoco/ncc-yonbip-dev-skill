---
tags: [BIP, 元数据, 数据字典, bd.customerdoc_09991.09991]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同类型 (`bd.customerdoc_09991.09991`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_cust_doc` | domain：`ucfbasedoc` | 应用：`DPMPI` | 业务对象ID：`6082bd84-3ab0-4bcc-ab30-8cc21465bf9f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同类型 |
| 物理表 | `bd_cust_doc` |
| domain/服务域 | `ucfbasedoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMPI` |
| 直连字段 | 30 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `` |
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `custdocdefid` | `` |
| `orgid` | `` |
| `parentid` | `` |

## 继承接口 (8个, 17字段)

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
- **UCFDefDoc相关** (`bd.basedocdef.BasedocIDefDoc`)
  - `custdocdefid` → `custdocdefid`

## 字段列表（按类型分组）

> 共 30 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `id` | `id` | `id` | 主键 |
| `log` | `log` | `log` | 操作日志 |
| `objid` | `objid` | `objid` | 友企联id |
| `path` | `path` | `path` | 路径 |
| `shortname` | `shortname` | `shortname` | 简称 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源id |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `sysid` | `sysid` | `sysid` | 系统id |
| `tenantid` | `tenantid` | `tenant` | 租户废弃 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `custdocdefid` | `custdocdefid` | `custdocdefid` | 档案定义id |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `orgid` | `orgid` | `orgid` | 所属组织 |
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `parentid` | `parentid` | `parentid` | 上级档案 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |
| `ispreset` | `ispreset` | `ispreset` | 是否预置 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 状态 |
| `level` | `level` | `level` | 层级 |
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |
| `sort_num` | `sort_num` | `sort` | 排序号 |
| `sortnum` | `sortnum` | `sortnum` | 序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `description` | `description` | `description` | 备注 |
| `name` | `name` | `name` | 名称 |
