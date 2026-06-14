---
tags: [BIP, 元数据, 数据字典, bd.businessstep.BusinessPhase]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务阶段 (`bd.businessstep.BusinessPhase`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_business_phase` | domain：`transtype` | 应用：`BMMMM` | 业务对象ID：`c55f7ae7-6f72-46f2-8ba3-094132a7179d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务阶段 |
| 物理表 | `bd_business_phase` |
| domain/服务域 | `transtype` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `BMMMM` |
| 直连字段 | 18 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `bill_type_id` | `` |

## 继承接口 (7个, 12字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `applicationCode` | `applicationCode` | `applicationCode` | 应用编码 |
| `code` | `code` | `code` | 编码 |
| `id` | `id` | `id` | 主键 |
| `iorder` | `iorder` | `iorder` | 排序号 |
| `micro_service_code` | `micro_service_code` | `microServiceCode` | 微服务编码 |
| `sourceid` | `sourceid` | `sourceId` | 来源ID |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型id |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 删除标识 |
| `enable` | `enable` | `enable` | 停用启用 |
| `phase_level` | `phase_level` | `phaseLevel` | 阶段级别 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
