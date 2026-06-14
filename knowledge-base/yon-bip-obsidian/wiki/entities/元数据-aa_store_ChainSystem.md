---
tags: [BIP, 元数据, 数据字典, aa.store.ChainSystem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 连锁系统 (`aa.store.ChainSystem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_chainsystem` | domain：`yxybase` | 应用：`Marketingpublic` | 业务对象ID：`13b9bc5d-ab8a-49aa-bdc4-7e7c85974010`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 连锁系统 |
| 物理表 | `mp_chainsystem` |
| domain/服务域 | `yxybase` |
| schema | `pricecenter` |
| 所属应用 | `Marketingpublic` |
| 直连字段 | 12 个 |
| 子表 | 2 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `chainSystemArea` | `aa.store.ChainSystemArea` | composition |
| `chainSystemDefine` | `aa.store.ChainSystemDefine` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `chainSystemDefineCharacter` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 4字段)

- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `memo` | `memo` | `memo` | 备注 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `chainSystemDefineCharacter` | `chainSystemDefineCharacter` | `chainSystemDefineCharacter` | 自定义项特征组 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `chainSystemArea` | 连锁系统适用区域子表 |
| `` | `` | `chainSystemDefine` | 连锁系统自定义项 |
