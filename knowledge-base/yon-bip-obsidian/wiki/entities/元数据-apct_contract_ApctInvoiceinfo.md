---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctInvoiceinfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收票信息 (`apct.contract.ApctInvoiceinfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`apct_apct_invoiceinfo` | domain：`apct` | 应用：`APCT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收票信息 |
| 物理表 | `apct_apct_invoiceinfo` |
| domain/服务域 | `apct` |
| schema | `apct` |
| 所属应用 | `APCT` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `ct_id` | `` |
| `bill_type` | `` |
| `ytenant_id` | `` |
| `pk_invoicetype` | `znbzbx.znbzbx_invoicetyperef` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `invoice_state` | `invoice_state` | `invoicestate` | 发票状态 |
| `pk_invoice` | `pk_invoice` | `pk_invoice` | 发票主键 |
| `vinvoicecode` | `vinvoicecode` | `vinvoicecode` | 发票代码 |
| `vinvoiceno` | `vinvoiceno` | `vinvoiceno` | 发票号码 |
| `vcustname` | `vcustname` | `vcustname` | 销方名称 |
| `billno` | `billno` | `billno` | 单据号 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ct_id` | `ct_id` | `ctId` | 合同主键 |
| `bill_type` | `bill_type` | `billtype` | 来源单据类型 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `pk_invoicetype` | `pk_invoicetype` | `pk_invoicetype` | 发票类型Id |
| `vcurrency` | `vcurrency` | `vcurrency` | 币种id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dcostdate` | `dcostdate` | `dcostdate` | 发生日期 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatuntaxmny` | `nnatuntaxmny` | `nnatuntaxmny` | 本币金额 |
| `nnattaxmny` | `nnattaxmny` | `nnattaxmny` | 本币税额 |
| `nnatmny` | `nnatmny` | `nnatmny` | 本币价税合计 |
| `nuntaxmny` | `nuntaxmny` | `nuntaxmny` | 金额 |
| `ntaxmny` | `ntaxmny` | `ntaxmny` | 税额 |
| `nmny` | `nmny` | `nmny` | 价税合计 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
