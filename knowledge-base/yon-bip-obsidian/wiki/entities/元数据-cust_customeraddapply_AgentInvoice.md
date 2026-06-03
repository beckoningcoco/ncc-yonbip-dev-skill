---
tags: [BIP, 元数据, 数据字典, cust.customeraddapply.AgentInvoice]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 申请单发票信息 (`cust.customeraddapply.AgentInvoice`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_customeraddapply_agent_invoice` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 申请单发票信息 |
| 物理表 | `cust_customeraddapply_agent_invoice` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CUST` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `agent_invoice_character` | `` |
| `bd_billing_type` | `ucfbasedoc.bd_invoiceref` |
| `imerchantId` | `` |
| `ytenant_id` | `` |
| `cName` | `ucfbasedoc.bd_bankcard` |
| `cBankName` | `ucfbasedoc.bd_bankdotref` |

## 继承接口 (2个, 2字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceDataId` | `sourceDataId` | `sourceDataId` | 客户档案子表ID |
| `dataStatus` | `dataStatus` | `dataStatus` | 数据状态 |
| `cTitle` | `cTitle` | `title` | 发票抬头 |
| `cTaxNo` | `cTaxNo` | `taxNo` | 税号 |
| `cTelephone` | `cTelephone` | `telephone` | 电话 |
| `cBankAccount` | `cBankAccount` | `bankAccount` | 银行账号 |
| `cReceievInvoiceMobile` | `cReceievInvoiceMobile` | `receievInvoiceMobile` | 收票手机号 |
| `cReceievInvoiceEmail` | `cReceievInvoiceEmail` | `receievInvoiceEmail` | 收票邮箱 |
| `cRemarks` | `cRemarks` | `remarks` | 备注 |
| `erpCode` | `erpCode` | `erpCode` | 商家编码 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imerchantId` | `imerchantId` | `merchantId` | 手工码 |
| `bd_billing_type` | `bd_billing_type` | `bdBillingType` | 发票类型 |
| `cName` | `cName` | `name` | 银行类别id |
| `cBankName` | `cBankName` | `bankName` | 银行网点id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bDefaultInvoice` | `bDefaultInvoice` | `isDefault` | 默认发票信息 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billingType` | `billingType` | `billingType` | 默认发票类型 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAddress` | `cAddress` | `address` | 详细地址 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agent_invoice_character` | `agent_invoice_character` | `agentInvoiceCharacter` | 自定义项特征组 |
