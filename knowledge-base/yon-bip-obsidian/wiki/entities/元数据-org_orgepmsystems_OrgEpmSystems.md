---
tags: [BIP, 元数据, 数据字典, org.orgepmsystems.OrgEpmSystems]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 组织体系 (`org.orgepmsystems.OrgEpmSystems`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_epm_systems` | domain：`ucf-org-center` | 应用：`GZTORG` | 业务对象ID：`2f6b4cfa-0eb0-4bf8-9bf6-a636e8751bd5`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 组织体系 |
| 物理表 | `org_epm_systems` |
| 数据库 schema | `ucf-org-center` |
| 所属应用 | `GZTORG` |
| 直连字段 | 27 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `orgid` | `` |
| `tenantid` | `` |

## 继承接口 (6个, 12字段)

- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **树型结构** (`basedoc.basedocItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **审计信息** (`bd.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``

## 字段列表（按类型分组）

> 共 27 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `code` | `code` | `code` | 编码 |
| `description` | `description` | `description` | 备注 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `name2` | `name2` | `name2` | 名称(备用) |
| `name3` | `name3` | `name3` | 名称(备用) |
| `name4` | `name4` | `name4` | 名称(备用) |
| `name5` | `name5` | `name5` | 名称(备用) |
| `name6` | `name6` | `name6` | 名称(备用) |
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `path` | `path` | `path` | 路径 |
| `servicecode` | `servicecode` | `serviceCode` | 所属系统编码 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `orgid` | `orgid` | `orgid` | 所属组织 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `isEnd` | `isEnd` | `isEnd` | 是否末级 |
| `level` | `level` | `level` | 层级 |
| `manage_type` | `manage_type` | `manage_type` | 管理组织类型 |
| `period_view` | `period_view` | `period_view` | 启用期间视图 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
