---
tags: [BIP, 元数据, 数据字典, bd.virtualaccbody.VirtualAccbody_view]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 虚拟会计主体参照 (`bd.virtualaccbody.VirtualAccbody_view`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_virtualaccbody` | domain：`finbd` | 应用：`DPMACCT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 虚拟会计主体参照 |
| 物理表 | `bd_virtualaccbody` |
| 数据库 schema | `finbd` |
| 所属应用 | `DPMACCT` |
| 直连字段 | 32 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `` |
| `liableperson` | `` |
| `parent` | `` |
| `ytenant_id` | `` |
| `exchangerate` | `` |
| `accperiodscheme` | `` |
| `currency` | `` |
| `orgid` | `` |
| `tenant_id` | `` |

## 继承接口 (5个, 10字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **树型结构** (`base.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 32 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `id` | `id` | `id` | 会计主体id |
| `orgtype` | `orgtype` | `orgtype` | 组织类型 |
| `parent` | `parent` | `parentid` | 上级会计主体 |
| `path` | `path` | `path` | 路径 |
| `timezone` | `timezone` | `timezone` | 时区 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accperiodscheme` | `accperiodscheme` | `accperiodscheme` | 会计期间方案 |
| `country` | `country` | `country` | 国家 |
| `currency` | `currency` | `currency` | 本位币 |
| `exchangerate` | `exchangerate` | `exchangerate` | 汇率类型 |
| `liableperson` | `liableperson` | `liableperson` | 负责人 |
| `orgid` | `orgid` | `orgid` | 组织id |
| `parent` | `parent` | `parent` | 上级会计主体 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |
| `is_virtualaccbody` | `is_virtualaccbody` | `is_virtualaccbody` | 是否虚拟会计主体 |
| `isexternal` | `isexternal` | `isexternal` | 是否对外核算主体 |
| `isinner` | `isinner` | `isinner` | 是否对内核算主体 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `display_order` | `display_order` | `displayOrder` | 显示顺序 |
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `source` | `source` | `source` | 来源 |
| `status` | `status` | `status` | 状态 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `description` | `description` | `description` | 备注 |
| `name` | `name` | `name` | 名称 |
| `shortname` | `shortname` | `shortname` | 简称 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enabledate` | `enabledate` | `enabledate` | 启用时间 |
| `expiredate` | `expiredate` | `expiredate` | 失效时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
