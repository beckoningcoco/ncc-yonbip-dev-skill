---
tags: [BIP, 元数据, 数据字典, voucher.rebate.RebateReturnProductRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 返利回退商品记录 (`voucher.rebate.RebateReturnProductRecord`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `rebateReturnProductRecord` | 应用: `BBSMK` | 类型: `Class`

## 属性（29 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `agentId` | agentID | `iAgentId` | 265e9b66-8898-43a6-9a65-0a156c84f0c1 | `quote` |
| 2 | `createDate` | 创建日期 | `dCreateDate` | DateTime | `timestamp` |
| 3 | `id` | ID | `id` | Long | `long` |
| 4 | `orderDetailIdKey` | orderDetailIdKey | `cOrderDetailIdKey` | String | `text` |
| 5 | `orderId` | orderID | `iOrderId` | c7c0beb4-f830-486d-83e1-51072b319fd2 | `quote` |
| 6 | `orderNo` | orderNo | `cOrderNo` | String | `text` |
| 7 | `outSysKey` | outSysKey | `cOutSysKey` | String | `text` |
| 8 | `product` | product | `iProductId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 9 | `productSku` | productSku | `iSkuId` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 10 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |
| 11 | `quantity` | quantity | `iQuantity` | Decimal | `number` |
| 12 | `rebateId` | rebateID | `iRebateId` | 9b73cf61-0421-4d25-8694-116cbe27ba7c | `quote` |
| 13 | `rebateNo` | rebateNo | `cRebateNo` | String | `text` |
| 14 | `rebateReturnProductId` | rebateReturnProductID | `iRebateReturnProductId` | 631cf218-f93d-48a9-8d02-7c2d4c520538 | `quote` |
| 15 | `recordStatus` | recordStatus | `cRecordStatus` | String | `text` |
| 16 | `recordStatusName` | recordStatus名称 | `recordStatusName` | String | `text` |
| 17 | `submitUser` | submitUser | `iSubmiterId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 18 | `uordercorp` | uordercorp | `iCorpId` | Long | `long` |
| 19 | `usedAmount` | usedAmount | `iUsedAmount` | Decimal | `number` |
| 20 | `feeTransferStatus` | feeTransferStatus | `feeTransferStatus` | Boolean | `switch` |
| 21 | `freezeDate` | freezeDate | `freezeDate` | DateTime | `timestamp` |
| 22 | `rebateDetailType` | rebateDetailType | `cRebateDetailType` | String | `text` |
| 23 | `saleReturnDetailId` | saleReturnDetailID | `iSaleReturnDetailId` | Long | `long` |
| 24 | `saleReturnId` | saleReturnID | `iSaleReturnId` | Long | `long` |
| 25 | `saleReturnNo` | saleReturnNo | `cSaleReturnNo` | String | `text` |
| 26 | `settlementId` | settlementID | `settlementId` | Long | `long` |
| 27 | `settlementNo` | settlementNo | `settlementNo` | String | `text` |
| 28 | `voucherSourceType` | voucherSourceType | `cVoucherSourceType` | String | `text` |
| 29 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（8 个）

- `agentId` -> `aa.agent.Agent` ()
- `product` -> `pc.product.Product` ()
- `productSku` -> `pc.product.ProductSKU` ()
- `orderId` -> `voucher.order.Order` ()
- `submitUser` -> `base.user.User` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `rebateId` -> `voucher.rebate.ProductRebate` (0..n)
- `rebateReturnProductId` -> `voucher.rebate.RebateReturnProduct` (0..n)
