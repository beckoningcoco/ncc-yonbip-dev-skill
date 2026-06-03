---
tags: [BIP, 元数据, 数据字典, bd.basedocdef.CustomerDocDefVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 自定义档案设置 (`bd.basedocdef.CustomerDocDefVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_cust_doc_def` | domain：`ucfbasedoc` | 应用：`DPMPI` | 业务对象ID：`ee6a9e81-60d3-42e6-89c5-b081b62fe2bc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 自定义档案设置 |
| 物理表 | `bd_cust_doc_def` |
| 数据库 schema | `ucfbasedoc` |
| 所属应用 | `DPMPI` |
| 直连字段 | 31 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `tenantid` | `` |

## 继承接口 (5个, 9字段)

- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **审计信息** (`basedoc.basedocItf.AuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 31 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 编码 |
| `objid` | `objid` | `objid` | 外系统主键 |
| `serviceCode` | `serviceCode` | `serviceCode` | 发布服务 |
| `billno` | `billno` | `billno` | 模版编码 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源 |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `entityid` | `entityid` | `entityid` | 实体 |
| `log` | `log` | `log` | 操作日志 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `tenantid` | `tenantid` | `tenant` | 租户(废弃) |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenantid` | `tenantid` | `tenantid` | 租户 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ispreset` | `ispreset` | `ispreset` | 是否预置 |

### 整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `editcode` | `editcode` | `editcode` | 档案编码修改规则 |
| `classify` | `classify` | `classify` | 是否多级 |
| `mcflag` | `mcflag` | `mcflag` | 是否分级管理 |
| `releasestatus` | `releasestatus` | `releasestatus` | 是否发布 |
| `isUpgrade` | `isUpgrade` | `isUpgrade` | 是否特征升级 |
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |
| `businessstatus` | `businessstatus` | `businessstatus` | 是否随业务产生 |
| `enable` | `enable` | `enable` | 启用状态 |
| `dr` | `dr` | `dr` | 删除状态 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `description` | `description` | `description` | 备注 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `business_pubts` | `business_pubts` | `businessPubts` | 是否随业务产生时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
