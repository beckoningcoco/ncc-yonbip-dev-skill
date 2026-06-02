---
tags: [BIP, 元数据, 数据字典, voucher.upaymentvoucher.PaymentVerification]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 支付核销表 (`voucher.upaymentvoucher.PaymentVerification`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `paymentverification` | 应用: `` | 类型: `Class`

## 属性（37 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `agentId` | agentID | `iAgentId` | Long | `long` |
| 2 | `amount` | amount | `iAmount` | Decimal | `number` |
| 3 | `createTime` | 创建时间 | `dCreatedTime` | DateTime | `timestamp` |
| 4 | `creator` | 创建人 | `cCreator` | String | `text` |
| 5 | `creatorId` | 创建人ID | `iSubmiterId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 6 | `financeDetailId` | financeDetailID | `iFinanceDetailId` | String | `text` |
| 7 | `financeId` | financeID | `iFinancePaymentId` | String | `text` |
| 8 | `iSsueNo` | iSsueNo | `iSsueNo` | Integer | `int` |
| 9 | `id` | ID | `id` | Long | `long` |
| 10 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 11 | `isVerification` | 是否Verification | `isVerification` | Boolean | `switch` |
| 12 | `modifier` | 修改人 | `cModifier` | String | `text` |
| 13 | `modifierId` | 修改人ID | `iModifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 14 | `modifyTime` | 修改时间 | `dModifyTime` | DateTime | `timestamp` |
| 15 | `orderAmount` | orderAmount | `iorderAmount` | Decimal | `number` |
| 16 | `orderCurrency` | orderCurrency | `cOrderCurrencyPk` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 17 | `orderDetailId` | orderDetailID | `iOrderDetailId` | Long | `long` |
| 18 | `orderId` | orderID | `iOrderId` | Long | `long` |
| 19 | `outSyskey` | outSyskey | `cOutSyskey` | String | `text` |
| 20 | `parVoucherNo` | parVoucherNo | `cParVoucherNo` | String | `text` |
| 21 | `payBusinessDate` | payBusinessDate | `dPayBusinessDate` | Date | `date` |
| 22 | `payCurrency` | payCurrency | `cPayCurrencyPk` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 23 | `payDate` | payDate | `dPayDate` | Date | `date` |
| 24 | `payNo` | payNo | `cPayNo` | String | `text` |
| 25 | `paymentDetailId` | paymentDetailID | `iPaymentDetailId` | 831ceb71-a226-4ea3-9eb2-0c809c82669f | `quote` |
| 26 | `paymentVoucher` | paymentVoucher | `iPaymentId` | c74e56b1-57e1-4d21-b8d5-e31fdcaf803e | `quote` |
| 27 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |
| 28 | `rate` | rate | `iRate` | Decimal | `number` |
| 29 | `rollBackDate` | rollBackDate | `dRollBackDate` | Date | `date` |
| 30 | `rollBackUser` | rollBackUser | `iRollBackUserId` | Long | `long` |
| 31 | `status` | 状态 | `cStatus` | String | `text` |
| 32 | `uordercorp` | uordercorp | `iCorpId` | Long | `long` |
| 33 | `verificationType` | verificationType | `iVerificationType` | Integer | `int` |
| 34 | `voucherNo` | voucherNo | `cVoucherNo` | String | `text` |
| 35 | `voucherType` | voucherType | `cVoucherType` | String | `text` |
| 36 | `voucherTypeName` | voucherType名称 | `cVoucherTypeName` | String | `text` |
| 37 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（7 个）

- `orderCurrency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `paymentDetailId` -> `voucher.upaymentvoucher.PaymentVoucherDetail` ()
- `paymentVoucher` -> `voucher.upaymentvoucher.PaymentVoucher` (0..n)
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `payCurrency` -> `bd.currencytenant.CurrencyTenantVO` ()
