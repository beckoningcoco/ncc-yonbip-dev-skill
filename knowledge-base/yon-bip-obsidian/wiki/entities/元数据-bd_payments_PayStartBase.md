---
tags: [BIP, 元数据, 数据字典, bd.payments.PayStartBase]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 付款起算依据 (`bd.payments.PayStartBase`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_paystartbase` | domain：`ucfbasedoc` | 应用：`DPMSETL` | 业务对象ID：`513a09fb-13ae-480f-876d-0f1320033a4e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 付款起算依据 |
| 物理表 | `bd_paystartbase` |
| domain/服务域 | `ucfbasedoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMSETL` |
| 直连字段 | 19 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |

## 继承接口 (4个, 6字段)

- **审计信息** (`basedoc.basedocItf.AuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 19 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCode` | `cCode` | `code` | 编码 |
| `objid` | `objid` | `objid` | 外系统主键 |
| `cComment` | `cComment` | `comment` | 备注 |
| `paybase` | `paybase` | `payBase` | 付款依据 |
| `startcolumn` | `startcolumn` | `startColumn` | 起算字段 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `tenantid` | `tenantid` | `tenant` | 租户(废弃) |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourcetype` | `sourcetype` | `sourcetype` | 是否系统预置 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 启用状态 |
| `iorder` | `iorder` | `order` | 排序号码 |
| `dr` | `dr` | `dr` | 删除状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cName` | `cName` | `name` | 名称 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
