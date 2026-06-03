---
tags: [BIP, 元数据, 数据字典, bd.industry.IndustryCategoryVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 所属行业 (`bd.industry.IndustryCategoryVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_industry_category` | domain：`ucfbasedoc` | 应用：`DPMPI` | 业务对象ID：`ebdfb8dc-aa3b-457c-9654-8fe929935519`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 所属行业 |
| 物理表 | `bd_industry_category` |
| 数据库 schema | `ucfbasedoc` |
| 所属应用 | `DPMPI` |
| 直连字段 | 24 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `ucfbasedoc.bd_industrycategory_ref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |

## 继承接口 (7个, 16字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **树型结构** (`basedoc.basedocItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **审计信息** (`basedoc.basedocItf.AuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 编码 |
| `objid` | `objid` | `objid` | 外系统主键 |
| `log` | `log` | `log` | 操作日志 |
| `path` | `path` | `path` | 路径 |
| `tenantid` | `tenantid` | `tenant` | 租户(废弃) |
| `exec_status` | `exec_status` | `execStatus` | 执行状态 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parent_id` | `parent_id` | `parent_id` | 上级行业 |
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 状态 |
| `isEnd` | `isEnd` | `isEnd` | 是否末级 |
| `dr` | `dr` | `dr` | 删除状态 |
| `sort_num` | `sort_num` | `sort` | 排序号 |
| `level` | `level` | `level` | 层级 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
