---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctInvoicinginfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 开票信息 (`apct.contract.ApctInvoicinginfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`apct_apct_invoicinginfo` | domain：`apct` | 应用：`APCT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开票信息 |
| 物理表 | `apct_apct_invoicinginfo` |
| 数据库 schema | `apct` |
| 所属应用 | `APCT` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `vcurrency` | `` |
| `ct_id` | `` |
| `invoice_org` | `` |
| `bill_type` | `` |
| `ytenant_id` | `` |
| `pk_invoicetype` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_invoice` | `pk_invoice` | `pk_invoice` | 发票主键 |
| `vinvoicecode` | `vinvoicecode` | `vinvoicecode` | 发票代码 |
| `vinvoiceno` | `vinvoiceno` | `vinvoiceno` | 发票号码 |
| `vcustname` | `vcustname` | `vcustname` | 购方名称 |
| `billno` | `billno` | `billno` | 单据号 |
| `invoice_state` | `invoice_state` | `invoicestate` | 发票状态 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ct_id` | `ct_id` | `ctId` | 合同主键 |
| `pk_invoicetype` | `pk_invoicetype` | `pk_invoicetype` | 发票类型 |
| `vcurrency` | `vcurrency` | `vcurrency` | 币种 |
| `bill_type` | `bill_type` | `billtype` | 来源单据类型 |
| `invoice_org` | `invoice_org` | `invoiceOrg` | 开票组织 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dcostdate` | `dcostdate` | `dcostdate` | 发生日期 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nuntaxmny` | `nuntaxmny` | `nuntaxmny` | 金额 |
| `ntaxmny` | `ntaxmny` | `ntaxmny` | 税额 |
| `nmny` | `nmny` | `nmny` | 价税合计 |
| `nnatuntaxmny` | `nnatuntaxmny` | `nnatuntaxmny` | 本币金额 |
| `nnattaxmny` | `nnattaxmny` | `nnattaxmny` | 本币税额 |
| `nnatmny` | `nnatmny` | `nnatmny` | 本币价税合计 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
