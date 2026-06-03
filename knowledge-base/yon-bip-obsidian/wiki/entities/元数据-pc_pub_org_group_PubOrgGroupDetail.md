---
tags: [BIP, 元数据, 数据字典, pc.pub_org_group.PubOrgGroupDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分级管理集合详情 (`pc.pub_org_group.PubOrgGroupDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pub_org_group_detail` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：`7572ee40-912e-4f31-8eda-143652be970c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 分级管理集合详情 |
| 物理表 | `pub_org_group_detail` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 6 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `group_id` | `` |
| `org_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 6 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `org_type` | `org_type` | `orgType` | 组织类型 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `group_id` | `group_id` | `groupId` | 组id |
| `org_id` | `org_id` | `orgId` | 组织id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
