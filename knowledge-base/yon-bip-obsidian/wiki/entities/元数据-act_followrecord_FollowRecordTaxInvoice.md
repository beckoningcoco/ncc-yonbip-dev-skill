---
tags: [BIP, 元数据, 数据字典, act.followrecord.FollowRecordTaxInvoice]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 跟进记录税票 (`act.followrecord.FollowRecordTaxInvoice`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`act_followrecord_taxinvoice` | domain：`yycrm` | 应用：`ACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 跟进记录税票 |
| 物理表 | `act_followrecord_taxinvoice` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `ACT` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `bdInvoiceTypeId` | `` |
| `ytenant_id` | `` |
| `followrecord_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billType` | `billType` | `billType` | 类型 |
| `hidenFileId` | `hidenFileId` | `hidenFileId` | 附件 |
| `invoiceCheckCode` | `invoiceCheckCode` | `invoiceCheckCode` | 发票校验码 |
| `invoiceCode` | `invoiceCode` | `invoiceCode` | 发票代码 |
| `invoiceTitle` | `invoiceTitle` | `invoiceTitle` | 发票抬头 |
| `outReason` | `outReason` | `outReason` | 转出原因 |
| `sellName` | `sellName` | `sellName` | 销售方名称 |
| `taxInvoiceCode` | `taxInvoiceCode` | `taxInvoiceCode` | 发票号码 |
| `vendorTaxStatus` | `vendorTaxStatus` | `vendorTaxStatus` | 状态 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bdInvoiceTypeId` | `bdInvoiceTypeId` | `bdInvoiceTypeId` | 发票类型 |
| `followrecord_id` | `followrecord_id` | `followRecordId` | 所属跟进记录 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accountMoney` | `accountMoney` | `accountMoney` | 报账金额 |
| `accountTaxMoney` | `accountTaxMoney` | `accountTaxMoney` | 报账税额 |
| `inOutTax` | `inOutTax` | `inOutTax` | 进项转出税额 |
| `invoiceAmount` | `invoiceAmount` | `invoiceAmount` | 无税金额 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `outDate` | `outDate` | `outDate` | 转出日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `taxInvoiceDate` | `taxInvoiceDate` | `taxInvoiceDate` | 开票日期 |
