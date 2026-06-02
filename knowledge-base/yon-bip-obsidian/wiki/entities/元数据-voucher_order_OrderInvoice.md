---
tags: [BIP, 元数据, 数据字典, voucher.order.OrderInvoice]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 订单发票 (`voucher.order.OrderInvoice`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `orders_invoice` | 应用: `SCMSA` | 类型: `Class`

## 属性（20 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `address` | address | `cAddress` | String | `text` |
| 2 | `bankAccount` | bankAccount | `cBankAccount` | String | `text` |
| 3 | `bankCode` | bank编码 | `cBankCode` | String | `text` |
| 4 | `bankName` | bank名称 | `cBankName` | String | `text` |
| 5 | `code` | 编码 | `cOrderNo` | String | `text` |
| 6 | `id` | ID | `id` | Long | `long` |
| 7 | `invoiceAddress` | invoiceAddress | `cInvoiceAddress` | String | `text` |
| 8 | `invoiceContent` | invoiceContent | `cInvoiceContent` | String | `text` |
| 9 | `invoiceMoney` | invoiceMoney | `iInvoiceMoney` | Decimal | `number` |
| 10 | `invoiceTelephone` | invoiceTelephone | `cInvoiceTelephone` | String | `text` |
| 11 | `invoiceTitle` | invoiceTitle | `cInvoiceTitle` | String | `text` |
| 12 | `invoiceType` | invoiceType | `cInvoiceType` | String | `text` |
| 13 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 14 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |
| 15 | `subBankName` | subBank名称 | `cSubBankName` | String | `text` |
| 16 | `taxNum` | taxNum | `cTaxNum` | String | `text` |
| 17 | `telephone` | telephone | `cTelephone` | String | `text` |
| 18 | `uordercorp` | uordercorp | `iCorpId` | Long | `long` |
| 19 | `userBankName` | userBank名称 | `cUserBankName` | String | `text` |
| 20 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（1 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
