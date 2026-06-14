---
tags: [BIP, 元数据, 数据字典, znbzbx.budgetestablish.BudgetBillRelationVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 预算编制生单记录表 (`znbzbx.budgetestablish.BudgetBillRelationVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_budgetbillrelation` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预算编制生单记录表 |
| 物理表 | `znbz_budgetbillrelation` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 11 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `vcurrency` | `` |
| `pk_expensebill` | `` |
| `cfinaceorg` | `` |
| `ytenant_id` | `` |
| `vfinacedeptid` | `` |
| `pk_budgetestablishb` | `` |
| `pk_busimemo` | `` |
| `staffId` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 11 个直连字段

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织 |
| `pk_budgetestablishb` | `pk_budgetestablishb` | `pk_budgetestablishb` | 预算编制子表主键 |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目 |
| `pk_expensebill` | `pk_expensebill` | `pk_expensebill` | 报销单主表主键 |
| `staffId` | `staffId` | `staffId` | 员工 |
| `vcurrency` | `vcurrency` | `vcurrency` | 币种 |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
