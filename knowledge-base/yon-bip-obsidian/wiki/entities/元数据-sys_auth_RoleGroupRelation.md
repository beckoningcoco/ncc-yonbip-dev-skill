---
tags: [BIP, 元数据, 数据字典, sys.auth.RoleGroupRelation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 角色组关系 (`sys.auth.RoleGroupRelation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`role_group_relation` | domain：`u8c-auth` | 应用：`GZTACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 角色组关系 |
| 物理表 | `role_group_relation` |
| domain/服务域 | `u8c-auth` |
| schema | `iuap_apcom_auth` |
| 所属应用 | `GZTACT` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `tenantcenter_id` | `` |
| `role_id` | `` |
| `ytenant_id` | `` |
| `tenant_id` | `` |
| `group_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 10 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modifier` | `modifier` | `modifier` | 修改人 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `group_id` | `group_id` | `group` | 角色组id |
| `role_id` | `role_id` | `role` | 角色id |
| `tenant_id` | `tenant_id` | `tenant` | 营销云租户id |
| `tenantcenter_id` | `tenantcenter_id` | `yhtTenant` | 友互通租户id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `pubts` | `pubts` | `ts` | 时间戳 |
