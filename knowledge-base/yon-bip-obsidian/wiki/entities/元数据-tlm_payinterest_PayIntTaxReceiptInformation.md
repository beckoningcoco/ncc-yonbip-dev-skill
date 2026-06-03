---
tags: [BIP, 元数据, 数据字典, tlm.payinterest.PayIntTaxReceiptInformation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 付息税票信息 (`tlm.payinterest.PayIntTaxReceiptInformation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_pitaxreceipt_information` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 付息税票信息 |
| 物理表 | `tlm_pitaxreceipt_information` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 30 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `mainid` | `` |
| `interestbeartranscurrency` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 30 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `attachment` | `attachment` | `attachment` | 附件 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `invoice_code` | `invoice_code` | `invoiceCode` | 发票代码 |
| `invoice_number` | `invoice_number` | `invoiceNumber` | 发票号码 |
| `invoice_title` | `invoice_title` | `invoiceTitle` | 发票抬头 |
| `invoice_type` | `invoice_type` | `invoiceType` | 发票类型 |
| `invoice_verification_code` | `invoice_verification_code` | `invoiceVerificationCode` | 发票校验码 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `sellers_name` | `sellers_name` | `sellersName` | 销售方名称 |
| `status` | `status` | `status` | 发票状态 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `interestbeartranscurrency` | `interestbeartranscurrency` | `interestBearTransCurrency` | 计息交易币种 |
| `mainid` | `mainid` | `mainid` | 付息调整主键 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `invoice_date` | `invoice_date` | `invoiceDate` | 开票日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `quotation_tax_total` | `quotation_tax_total` | `quotationTaxTotal` | 累计报账价税合计 |
| `reported_amount` | `reported_amount` | `reportedAmount` | 报账金额 |
| `tax_amount` | `tax_amount` | `taxAmount` | 税额 |
| `total_price_with_tax` | `total_price_with_tax` | `totalPriceWithTax` | 价税合计 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
