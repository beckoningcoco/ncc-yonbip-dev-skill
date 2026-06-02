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

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `apct_apct_invoiceinfo` | 应用: `APCT`

## 属性（21 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `ctId` | ctID | `ct_id` | 84a309b9-2fd0-48d8-9b75-8251a20928c2 | `quote` |
| 2 | `id` | ID | `id` | Long | `long` |
| 3 | `nnatuntaxmny` | nnatuntaxmny | `nnatuntaxmny` | Decimal | `number` |
| 4 | `nnattaxmny` | nnattaxmny | `nnattaxmny` | Decimal | `number` |
| 5 | `nnatmny` | nnatmny | `nnatmny` | Decimal | `number` |
| 6 | `billtype` | billtype | `bill_type` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |
| 7 | `invoicestate` | invoicestate | `invoice_state` | String | `text` |
| 8 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 9 | `pk_invoice` | pk_invoice | `pk_invoice` | String | `text` |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 11 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 12 | `pk_invoicetype` | pk_invoicetype | `pk_invoicetype` | 22e45e65-e39f-43d0-8b27-756e9891b275 | `quote` |
| 13 | `vinvoicecode` | vinvoicecode | `vinvoicecode` | String | `text` |
| 14 | `vinvoiceno` | vinvoiceno | `vinvoiceno` | String | `text` |
| 15 | `dcostdate` | dcostdate | `dcostdate` | Date | `date` |
| 16 | `vcustname` | vcustname | `vcustname` | String | `text` |
| 17 | `vcurrency` | vcurrency | `vcurrency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 18 | `nuntaxmny` | nuntaxmny | `nuntaxmny` | Decimal | `number` |
| 19 | `ntaxmny` | ntaxmny | `ntaxmny` | Decimal | `number` |
| 20 | `nmny` | nmny | `nmny` | Decimal | `number` |
| 21 | `billno` | billno | `billno` | String | `text` |

## 关联（6 个）

- `vcurrency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `ctId` -> `apct.contract.Apct` (0..n) 
- `billtype` -> `bd.bill.BillTypeVO` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `pk_invoicetype` -> `znbzbx.invoicetype.InvoiceTypeVO` () 
- `tenant` -> `base.tenant.Tenant` () 
