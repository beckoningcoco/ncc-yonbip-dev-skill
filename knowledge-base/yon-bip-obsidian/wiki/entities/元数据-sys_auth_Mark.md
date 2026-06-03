---
tags: [BIP, 元数据, 数据字典, sys.auth.Mark]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 标签管理 (`sys.auth.Mark`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mark` | domain：`u8c-auth` | 应用：`GZTACT` | 业务对象ID：`59d5e29e-a881-47fa-9c09-7fc3df7233ec`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标签管理 |
| 物理表 | `mark` |
| 数据库 schema | `u8c-auth` |
| 所属应用 | `GZTACT` |
| 直连字段 | 15 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `tenantcenter_id` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `tenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 15 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `mark_name2` | `mark_name2` | `name2` | 名称多语 |
| `mark_name3` | `mark_name3` | `name3` | 名称多语 |
| `mark_name4` | `mark_name4` | `name4` | 名称多语 |
| `mark_name5` | `mark_name5` | `name5` | 名称多语 |
| `mark_name6` | `mark_name6` | `name6` | 名称多语 |
| `mark_code` | `mark_code` | `code` | 编码 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modifier` | `modifier` | `modifier` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 营销云租户id |
| `tenantcenter_id` | `tenantcenter_id` | `yhtTenant` | 友互通租户id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isSys` | `isSys` | `isSys` | 系统标签 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mark_name` | `mark_name` | `name` | 名称 |
