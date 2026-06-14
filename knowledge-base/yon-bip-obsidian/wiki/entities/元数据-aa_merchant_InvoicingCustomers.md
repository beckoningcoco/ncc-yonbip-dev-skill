---
tags: [BIP, 元数据, 数据字典, aa.merchant.InvoicingCustomers]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 开票客户 (`aa.merchant.InvoicingCustomers`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`invoicingcustomers` | domain：`productcenter` | 应用：`DPMCUS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开票客户 |
| 物理表 | `invoicingcustomers` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMCUS` |
| 直连字段 | 8 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `cinvoicingcustomersid` | `productcenter.aa_merchantref` |
| `imerchantid` | `` |
| `ytenant_id` | `` |
| `merchantapplyrangeid` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 8 个直连字段

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imerchantid` | `imerchantid` | `merchantId` | 客户 |
| `merchantapplyrangeid` | `merchantapplyrangeid` | `merchantApplyRangeId` | 客户适用范围 |
| `cinvoicingcustomersid` | `cinvoicingcustomersid` | `invoicingCustomersId` | 开票客户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bdefaultinvoicingcustomers` | `bdefaultinvoicingcustomers` | `isDefault` | 是否默认开票客户 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
