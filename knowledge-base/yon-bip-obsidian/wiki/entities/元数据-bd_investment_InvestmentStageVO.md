---
tags: [BIP, 元数据, 数据字典, bd.investment.InvestmentStageVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 投资阶段 (`bd.investment.InvestmentStageVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_investment_stage` | domain：`ucfbasedoc` | 应用：`DPMPRJ` | 业务对象ID：`93df3bb1-19e0-427c-a5ab-8c6197ae8a86`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投资阶段 |
| 物理表 | `bd_investment_stage` |
| domain/服务域 | `ucfbasedoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMPRJ` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |

## 继承接口 (4个, 6字段)

- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **审计信息** (`basedoc.basedocItf.AuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 16 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `log` | `log` | `log` | 操作日志 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `code` | `code` | `code` | 投资阶段编码 |
| `stage` | `stage` | `stage` | 阶段类别 |
| `sysid` | `sysid` | `sysid` | 应用标识 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `enable` | `enable` | `enable` | 状态 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 投资阶段名称 |
| `description` | `description` | `description` | 备注 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
