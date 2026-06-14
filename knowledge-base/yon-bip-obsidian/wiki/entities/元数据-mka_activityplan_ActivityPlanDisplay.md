---
tags: [BIP, 元数据, 数据字典, mka.activityplan.ActivityPlanDisplay]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 活动计划陈列 (`mka.activityplan.ActivityPlanDisplay`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mka_activityplan_display` | domain：`yycrm` | 应用：`MKA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 活动计划陈列 |
| 物理表 | `mka_activityplan_display` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `MKA` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `activityplan_id` | `` |
| `display` | `yycrm.mka_displayref` |
| `terminal` | `yycrm.dsfa_storeterminal` |
| `tenant_id` | `` |
| `customer` | `yycrm.cust_customerref` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `address` | `address` | `address` | 活动地址 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `activityplan_id` | `activityplan_id` | `activityplanId` | 活动计划 |
| `terminal` | `terminal` | `terminal` | 终端主键 |
| `customer` | `customer` | `customer` | 客户主键 |
| `display` | `display` | `display` | 陈列主键 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
