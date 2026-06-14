---
tags: [BIP, 元数据, 数据字典, pc.pub_org_group.PubOrgGroup]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分级管理组织集合 (`pc.pub_org_group.PubOrgGroup`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pub_org_group` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：`d34aab59-c40a-4e96-b89e-ebd3970c6c4d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 分级管理组织集合 |
| 物理表 | `pub_org_group` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 7 个 |
| 子表 | 1 个 |
| 关联引用 | 2 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `orgGroupDetailList` | `pc.pub_org_group.PubOrgGroupDetail` | composition |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 7 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `hash_code` | `hash_code` | `hashCode` | 集合hash值 |
| `id` | `id` | `id` | 主键 |
| `name` | `name` | `name` | 名称 |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `orgGroupDetailList` | 分级管理集合详情 |
