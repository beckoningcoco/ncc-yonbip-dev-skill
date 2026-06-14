---
tags: [BIP, 元数据, 数据字典, sfa.competeopponent.CompeteOpponentOrg]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# (竞争对手)组织 (`sfa.competeopponent.CompeteOpponentOrg`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_opponent_org` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | (竞争对手)组织 |
| 物理表 | `sfa_opponent_org` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `SFA` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `cpmopponent_id` | `` |
| `ytenant_id` | `` |
| `org_id` | `ucf-org-center.bd_salesorg` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `advantage` | `advantage` | `advantage` | 优势 |
| `inferiority` | `inferiority` | `inferiority` | 劣势 |
| `strategy` | `strategy` | `strategy` | 应对策略 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cpmopponent_id` | `cpmopponent_id` | `cpmOpponentId` | 竞争对手ID |
| `org_id` | `org_id` | `orgId` | 组织ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
