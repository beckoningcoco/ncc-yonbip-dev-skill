---
tags: [BIP, 元数据, 数据字典, znbzbx.loanrule.LoanRuleBustypeVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 适用交易类型 (`znbzbx.loanrule.LoanRuleBustypeVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_loanrule_bustype` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 适用交易类型 |
| 物理表 | `znbz_loanrule_bustype` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 8 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `pk_loanrule` | `` |
| `ytenant_id` | `` |
| `vbilltypeid` | `` |
| `loanbustype` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 8 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 受控单据类型 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `loanbustype` | `loanbustype` | `loanbustype` | 交易类型 |
| `pk_loanrule` | `pk_loanrule` | `pk_loanrule` | 表头主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `vbilltypeid` | `vbilltypeid` | `vbilltypeid` | 受控单据类型 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
