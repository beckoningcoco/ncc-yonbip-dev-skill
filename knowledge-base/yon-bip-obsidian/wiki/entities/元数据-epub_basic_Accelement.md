---
tags: [BIP, 元数据, 数据字典, epub.basic.Accelement]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会计要素表 (`epub.basic.Accelement`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_accelement` | domain：`fiepub` | 应用：`FP` | 业务对象ID：`aee7397e-97b3-4f76-b39c-370bcd751300`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 会计要素表 |
| 物理表 | `epub_accelement` |
| domain/服务域 | `fiepub` |
| schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 26 个 |
| 子表 | 2 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `standard` | `epub.basic.Accstandard` | composition |
| `accProperty` | `epub.basic.AccProperty` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `character` | `` |
| `ytenant_id` | `` |
| `creatorId` | `` |
| `modifierId` | `` |
| `accstandard` | `fiepub.epub_accstandard_ref` |
| `tenant_id` | `` |

## 继承接口 (4个, 12字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 26 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 编码 |
| `creator` | `creator` | `creator` | 创建人名称 |
| `modifier` | `modifier` | `modifier` | 修改人名称 |
| `objid` | `objid` | `objid` | 友企连id |
| `subjectcoderule` | `subjectcoderule` | `subjectcoderule` | 科目编码规则 |
| `sysid` | `sysid` | `sysid` | ID |
| `description` | `description` | `description` | 备注 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creatorId` | `creatorId` | `creatorId` | 创建人 |
| `modifierId` | `modifierId` | `modifierId` | 修改人 |
| `accstandard` | `accstandard` | `accstandard` | 会计准则id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bsystem` | `bsystem` | `bsystem` | 是否预制 |
| `stopstatus` | `stopstatus` | `stopstatus` | 状态 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `accstandardname` | `accstandardname` | `accstandardname` | 对应的会计准则名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `accProperty` | 会计要素 |
| `` | `` | `standard` | 会计准则 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `character` | `character` | `character` | 会计要素表特征属性 |
