---
tags: [BIP, 元数据, 数据字典, prm.partnertype.PartnerTypeApplyRange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 伙伴类型适用范围 (`prm.partnertype.PartnerTypeApplyRange`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prm_partnertype_applyrange` | domain：`yycrm` | 应用：`PRM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 伙伴类型适用范围 |
| 物理表 | `prm_partnertype_applyrange` |
| 数据库 schema | `yycrm` |
| 所属应用 | `PRM` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `clsId` | `` |
| `ytenant_id` | `` |
| `orgId` | `ucf-org-center.bd_salesorg_na` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clsId` | `clsId` | `clsId` | 分类id |
| `orgId` | `orgId` | `orgId` | 组织id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isCreator` | `isCreator` | `isCreator` | 是否创建者 |
| `isApplied` | `isApplied` | `isApplied` | 是否被分配者使用 |
| `isEnd` | `isEnd` | `isEnd` | 是否末级 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 伙伴类型适用范围id |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
