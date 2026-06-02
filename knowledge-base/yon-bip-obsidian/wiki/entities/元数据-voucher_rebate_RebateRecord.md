---
tags: [BIP, 元数据, 数据字典, voucher.rebate.RebateRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 返利记录 (`voucher.rebate.RebateRecord`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `rebateRecord` | 应用: `BBSMK` | 类型: `Class`

## 属性（26 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `agentId` | agentID | `iAgentId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 2 | `createDate` | 创建日期 | `dCreateDate` | DateTime | `timestamp` |
| 3 | `id` | ID | `id` | Long | `long` |
| 4 | `orderId` | orderID | `iOrderId` | c7c0beb4-f830-486d-83e1-51072b319fd2 | `quote` |
| 5 | `orderNo` | orderNo | `cOrderNo` | String | `text` |
| 6 | `orderRebateMoney` | orderRebateMoney | `fOrderRebateMoney` | Decimal | `number` |
| 7 | `outSysKey` | outSysKey | `cOutSysKey` | String | `text` |
| 8 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |
| 9 | `rebateId` | rebateID | `iRebateId` | 8eda1ebb-ea7d-465d-a414-d26019cad0c8 | `quote` |
| 10 | `rebateNo` | rebateNo | `cRebateNo` | String | `text` |
| 11 | `recordStatus` | recordStatus | `cRecordStatus` | String | `text` |
| 12 | `recordStatusName` | recordStatus名称 | `recordStatusName` | String | `text` |
| 13 | `saleReturnId` | saleReturnID | `iSaleReturnId` | Long | `long` |
| 14 | `saleReturnNo` | saleReturnNo | `cSaleReturnNo` | String | `text` |
| 15 | `submitUser` | submitUser | `iSubmiterId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 16 | `uordercorp` | uordercorp | `iCorpId` | Long | `long` |
| 17 | `useWayCode` | useWay编码 | `cUseWayCode` | String | `text` |
| 18 | `voucherSourceType` | voucherSourceType | `cVoucherSourceType` | String | `text` |
| 19 | `feeTransferStatus` | feeTransferStatus | `feeTransferStatus` | Boolean | `switch` |
| 20 | `freezeDate` | freezeDate | `freezeDate` | DateTime | `timestamp` |
| 21 | `paymentFinanceCode` | paymentFinance编码 | `cPaymentFinanceCode` | String | `text` |
| 22 | `paymentFinanceId` | paymentFinanceID | `iPaymentFinanceId` | Long | `long` |
| 23 | `saleInvoiceId` | saleInvoiceID | `saleInvoiceId` | 7a70750d-b22c-40ae-8516-df758fbd8cc5 | `quote` |
| 24 | `settlementId` | settlementID | `settlementId` | Long | `long` |
| 25 | `settlementNo` | settlementNo | `settlementNo` | String | `text` |
| 26 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（6 个）

- `agentId` -> `aa.merchant.Merchant` ()
- `orderId` -> `voucher.order.Order` ()
- `saleInvoiceId` -> `voucher.invoice.SaleInvoice` ()
- `submitUser` -> `base.user.User` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `rebateId` -> `voucher.rebate.AmountRebate` (0..n)
