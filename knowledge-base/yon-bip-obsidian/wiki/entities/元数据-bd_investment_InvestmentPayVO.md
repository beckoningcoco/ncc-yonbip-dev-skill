---
tags: [BIP, 元数据, 数据字典, bd.investment.InvestmentPayVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 投资支出类别 (`bd.investment.InvestmentPayVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_investment_pay` | domain：`ucfbasedoc` | 应用：`DPMPRJ` | 业务对象ID：`1bf418d9-b610-462e-b030-22c63ddc1de8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投资支出类别 |
| 物理表 | `bd_investment_pay` |
| 数据库 schema | `ucfbasedoc` |
| 所属应用 | `DPMPRJ` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `ucfbasedoc.bd_investpaytreeref` |
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |

## 继承接口 (5个, 12字段)

- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **树型结构** (`ucfbase.ucfbaseItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **审计信息** (`basedoc.basedocItf.AuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `code` | `code` | `code` | 编码 |
| `log` | `log` | `log` | 操作日志 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `attribute` | `attribute` | `attribute` | 投资属性 |
| `path` | `path` | `path` | 路径 |
| `sysid` | `sysid` | `sysid` | 应用标识 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `parent_id` | `parent_id` | `parent` | 上级类别id |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sort_num` | `sort_num` | `sort` | 排序号 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `level` | `level` | `level` | 层级 |
| `enable` | `enable` | `enable` | 状态 |

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
