---
tags: [BIP, 元数据, 数据字典, org.view.AdminOrgGlobalView]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 行政组织全局视图实体 (`org.view.AdminOrgGlobalView`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_orgs` | domain：`ucf-org-center` | 应用：`GZTORG` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 行政组织全局视图实体 |
| 物理表 | `org_orgs` |
| domain/服务域 | `ucf-org-center` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `GZTORG` |
| 直连字段 | 28 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `parentid` | `` |
| `ytenant_id` | `` |
| `id` | `` |
| `tenantid` | `` |

## 继承接口 (5个, 8字段)

- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **树型结构** (`basedoc.basedocItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 28 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `creator` | `creator` | `creator` | 创建人 |
| `innercode` | `innercode` | `innercode` | 内部码 |
| `name2` | `name2` | `name2` | 英文 |
| `name3` | `name3` | `name3` | 中文简体 |
| `name4` | `name4` | `name4` | 法语 |
| `name5` | `name5` | `name5` | 备用 |
| `name6` | `name6` | `name6` | 备用 |
| `orgid` | `orgid` | `orgid` | 基础组织ID |
| `path` | `path` | `path` | 祖先路径 |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `tenantid` | `tenantid` | `tenantid` | 租户标识 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `parentid` | `parentid` | `parent` | 上级节点 |
| `parentid` | `parentid` | `parentid` | 上级节点 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `displayorder` | `displayorder` | `displayorder` | 显示顺序 |
| `enable` | `enable` | `enable` | 启用状态 |
| `isEnd` | `isEnd` | `isEnd` | 是否叶子节点 |
| `level` | `level` | `level` | level |
| `orgtype` | `orgtype` | `orgtype` | 组织类型 |
| `displayorder` | `displayorder` | `sort` | 排序字段 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标识 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `ts` | `ts` | `ts` | 时间戳 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
