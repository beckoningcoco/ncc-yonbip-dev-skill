---
tags: [BIP, 元数据, 数据字典, pu.purchaseorder.PurchaseOrdersPaymentProgressACK]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 采购订单付款计划进度确认孙表 (`pu.purchaseorder.PurchaseOrdersPaymentProgressACK`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_purchaseorders_paymentprogressack` | 应用: `PU`

## 属性（16 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `rowno` | rowno | `rowno` | Integer | `int` |
| 2 | `number` | number | `iNumber` | Integer | `int` |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 4 | `id` | ID | `id` | Long | `long` |
| 5 | `paymentSchedulesId` | paymentSchedulesID | `ipaymentSchedulesId` | dc8eacac-306c-4460-bc12-ad63290275fd | `quote` |
| 6 | `mainid` | mainid | `imainid` | 68e65921-f77c-4794-a820-768e10ec6d28 | `quote` |
| 7 | `startDate` | start日期 | `iStartDate` | a4a03d83-ea92-422d-9f64-b5f18f26a4a9 | `quote` |
| 8 | `startDateTime` | startDateTime | `iStartDateTime` | DateTime | `timestamp` |
| 9 | `expiringDateTime` | expiringDateTime | `iExpiringDateTime` | DateTime | `timestamp` |
| 10 | `totalAckQty` | totalAckQty | `ftotalAckQty` | Decimal | `number` |
| 11 | `totalAckExecutedQty` | totalAckExecutedQty | `ftotalAckExecutedQty` | Decimal | `number` |
| 12 | `totalAckUnExecutedQty` | totalAckUnExecutedQty | `ftotalAckUnExecutedQty` | Decimal | `number` |
| 13 | `totalAckExecutedMoney` | totalAckExecutedMoney | `fTotalAckExecutedMoney` | Decimal | `number` |
| 14 | `totalNatAckExecutedMoney` | totalNatAckExecutedMoney | `fTotalNatAckExecutedMoney` | Decimal | `number` |
| 15 | `executedStatus` | executedStatus | `executedStatus` | PaymentProgressExecutedStatus | `` |
| 16 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `paymentSchedulesId` -> `pu.purchaseorder.PaymentSchedules` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `mainid` -> `pu.purchaseorder.PurchaseOrders` (0..n) 
- `startDate` -> `bd.payments.PayStartBase` () 
