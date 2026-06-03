---
tags: [BIP, 元数据, 数据字典, aa.merchant.AgentInvoice]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 发票信息 (`aa.merchant.AgentInvoice`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`agentinvoicenew` | domain：`productcenter` | 应用：`DPMCUS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 发票信息 |
| 物理表 | `agentinvoicenew` |
| 数据库 schema | `productcenter` |
| 所属应用 | `DPMCUS` |
| 直连字段 | 21 个 |
| 子表 | 1 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `agentInvoiceDefine` | `aa.merchant.AgentInvoiceDefine` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `agent_invoice_character` | `` |
| `bd_billing_type` | `ucfbasedoc.bd_invoiceref` |
| `imerchantId` | `productcenter.aa_merchantref` |
| `ytenant_id` | `` |
| `cName` | `ucfbasedoc.bd_bankcard` |
| `` | `` |
| `cBankName` | `ucfbasedoc.bd_bankdotref` |
| `tenant_id` | `` |

## 继承接口 (3个, 3字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `erpCode` | `erpCode` | `erpCode` | ERP编码 |
| `cTitle` | `cTitle` | `title` | 发票抬头 |
| `cReceievInvoiceEmail` | `cReceievInvoiceEmail` | `receievInvoiceEmail` | 收票邮箱 |
| `cReceievInvoiceMobile` | `cReceievInvoiceMobile` | `receievInvoiceMobile` | 收票手机号 |
| `cTaxNo` | `cTaxNo` | `taxNo` | 税号 |
| `cTelephone` | `cTelephone` | `telephone` | 电话 |
| `cBankAccount` | `cBankAccount` | `bankAccount` | 银行账号 |
| `cRemarks` | `cRemarks` | `remarks` | 备注 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imerchantId` | `imerchantId` | `merchantId` | 客户 |
| `bd_billing_type` | `bd_billing_type` | `bdBillingType` | 发票类型 |
| `cName` | `cName` | `name` | 银行类别 |
| `cBankName` | `cBankName` | `bankName` | 银行网点 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bDefaultInvoice` | `bDefaultInvoice` | `isDefault` | 默认发票信息 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAddress` | `cAddress` | `address` | 地址 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agent_invoice_character` | `agent_invoice_character` | `agentInvoiceCharacter` | 发票信息自定义项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billingType` | `billingType` | `billingType` | 默认发票类型(停用) |
| `` | `` | `agentInvoiceDefine` | 客户档案发票信息自定义项(废弃) |
