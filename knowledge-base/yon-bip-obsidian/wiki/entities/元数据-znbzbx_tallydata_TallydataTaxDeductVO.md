---
tags: [BIP, 元数据, 数据字典, znbzbx.tallydata.TallydataTaxDeductVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 账单税务抵扣 (`znbzbx.tallydata.TallydataTaxDeductVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_tallydatataxdeduct` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 账单税务抵扣 |
| 物理表 | `znbz_tallydatataxdeduct` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 17 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `pk_invoicecheck_b` | `` |
| `ytenant_id` | `` |
| `pk_consumekind` | `` |
| `pk_tallydata` | `` |
| `pk_airticketcheck` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 17 个直连字段

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `pk_airticketcheck` | `pk_airticketcheck` | `pk_airticketcheck` | 机票查验结果 |
| `pk_consumekind` | `pk_consumekind` | `pk_consumekind` | 发票消费类型 |
| `pk_invoicecheck_b` | `pk_invoicecheck_b` | `pk_invoicecheck_b` | 增值税票查验结果子表 |
| `pk_tallydata` | `pk_tallydata` | `pk_tallydata` | 主表主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iscandeduct` | `iscandeduct` | `iscandeduct` | 货物是否可抵扣 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `virtureRow` | `virtureRow` | `virtureRow` | 虚拟行号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ndeducttaxmny` | `ndeducttaxmny` | `ndeducttaxmny` | 可抵扣金额 |
| `ndeducttaxrate` | `ndeducttaxrate` | `ndeducttaxrate` | 可抵扣税率 |
| `nmny` | `nmny` | `nmny` | 价税合计 |
| `nservicetaxmny` | `nservicetaxmny` | `nservicetaxmny` | 服务费可抵扣税额 |
| `nservicetaxrate` | `nservicetaxrate` | `nservicetaxrate` | 服务费可抵扣税率 |
| `ntaxmny` | `ntaxmny` | `ntaxmny` | 税额 |
| `nuntaxmny` | `nuntaxmny` | `nuntaxmny` | 不含税金额 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
