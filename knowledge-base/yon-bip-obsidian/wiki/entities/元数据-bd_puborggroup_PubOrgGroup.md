---
tags: [BIP, 元数据, 数据字典, bd.puborggroup.PubOrgGroup]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分级管理组织集合 (`bd.puborggroup.PubOrgGroup`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pub_org_group` | domain：`ucfbasedoc` | 应用：`DPMPI` | 业务对象ID：`88f3172e-8bcf-4177-9d4d-f5784d1c04f3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 分级管理组织集合 |
| 物理表 | `pub_org_group` |
| 数据库 schema | `ucfbasedoc` |
| 所属应用 | `DPMPI` |
| 直连字段 | 7 个 |
| 子表 | 1 个 |
| 关联引用 | 2 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `orgGroupDetailList` | `bd.puborggroup.PubOrgGroupDetail` | composition |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 7 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `hash_code` | `hash_code` | `hashCode` | 集合hash值 |
| `id` | `id` | `id` | 主键 |
| `name` | `name` | `name` | 名称 |
| `tenantid` | `tenantid` | `tenant` | 租户废弃 |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `orgGroupDetailList` | 分级管理集合详情 |
