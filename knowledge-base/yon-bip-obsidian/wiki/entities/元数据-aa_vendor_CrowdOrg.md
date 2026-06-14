---
tags: [BIP, 元数据, 数据字典, aa.vendor.CrowdOrg]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 组织群详情 (`aa.vendor.CrowdOrg`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_crowdOrg` | domain：`yssupplier` | 应用：`DPMSPL` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 组织群详情 |
| 物理表 | `aa_crowdOrg` |
| domain/服务域 | `yssupplier` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMSPL` |
| 直连字段 | 8 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `crowd` | `` |
| `org` | `aa_adminorgrangeref` |
| `ytenant_id` | `` |
| `readOrg` | `aa_adminorgrangeref` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 8 个直连字段

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `crowd` | `crowd` | `crowd` | 群 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `org` | `org` | `org` | 使用组织 |
| `readOrg` | `readOrg` | `readOrg` | 业务信息读取组织 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isCrowdLeader` | `isCrowdLeader` | `isCrowdLeader` | 是否管理组织 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
