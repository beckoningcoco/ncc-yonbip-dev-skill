---
tags: [BIP, 元数据, 数据字典, znbzbx.auditrulebilltype.AuditRuleBillTypeBusimemoVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 交易类型稽核规则费用项目 (`znbzbx.auditrulebilltype.AuditRuleBillTypeBusimemoVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_auditrulebilltype_busimemo` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 交易类型稽核规则费用项目 |
| 物理表 | `znbz_auditrulebilltype_busimemo` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 7 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `pk_auditrulebilltype` | `` |
| `pk_busimemo` | `finbd.bd_expenseitemref` |
| `pk_busimemotype` | `finbd.bd_expenseitemtyperef` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 7 个直连字段

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目id |
| `pk_busimemotype` | `pk_busimemotype` | `pk_busimemotype` | 费用项目类别id |
| `pk_auditrulebilltype` | `pk_auditrulebilltype` | `pk_auditrulebilltype` | 主表主键 |
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
