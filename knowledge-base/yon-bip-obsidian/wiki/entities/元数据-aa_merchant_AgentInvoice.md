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

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `agentinvoicenew` | 应用: `DPMCUS` | 类型: `Class`

## 属性（21 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `merchantId` | merchantID | `imerchantId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 3 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 4 | `bdBillingType` | bdBillingType | `bd_billing_type` | 3a762abb-858d-4fc4-a60e-4850edf0ab1b | `quote` |
| 5 | `title` | title | `cTitle` | String | `text` |
| 6 | `receievInvoiceEmail` | receievInvoiceEmail | `cReceievInvoiceEmail` | String | `text` |
| 7 | `receievInvoiceMobile` | receievInvoiceMobile | `cReceievInvoiceMobile` | String | `text` |
| 8 | `taxNo` | taxNo | `cTaxNo` | String | `text` |
| 9 | `telephone` | telephone | `cTelephone` | String | `text` |
| 10 | `address` | address | `cAddress` | String | `multiLanguage` |
| 11 | `name` | 名称 | `cName` | b7ee7189-ed97-48d5-91e4-808228664429 | `quote` |
| 12 | `bankName` | bank名称 | `cBankName` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 13 | `bankAccount` | bankAccount | `cBankAccount` | String | `text` |
| 14 | `isDefault` | 是否Default | `bDefaultInvoice` | Boolean | `switch` |
| 15 | `remarks` | remarks | `cRemarks` | String | `text` |
| 16 | `agentInvoiceCharacter` | agentInvoiceCharacter | `agent_invoice_character` | f5da0c57-a486-44de-a177-4f53ef7d1c18 | `UserDefine` |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 18 | `billingType` | billingType | `billingType` | InvoiceType | `` |
| 19 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 20 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 21 | `agentInvoiceDefine` | agentInvoiceDefine | `` | 071b7b43-d088-46d6-9d93-804e56678779 | `` |

## 关联（8 个）

- `agentInvoiceCharacter` -> `aa.merchant.AgentInvoiceCharacter` ()
- `bdBillingType` -> `bd.invoice.InvoiceTypeVO` ()
- `merchantId` -> `aa.merchant.Merchant` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `name` -> `bd.bank.BankVO` ()
- `agentInvoiceDefine` -> `aa.merchant.AgentInvoiceDefine` (1)
- `bankName` -> `bd.bank.BankDotVO` ()
- `tenant` -> `base.tenant.Tenant` ()
