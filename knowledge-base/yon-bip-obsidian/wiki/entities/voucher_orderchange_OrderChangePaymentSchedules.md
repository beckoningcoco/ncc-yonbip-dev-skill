---
tags: [BIP, metadata, voucher, OrderChangePaymentSchedules]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收款计划表变更单 (voucher.orderchange.OrderChangePaymentSchedules)

> Platform: BIP V5 | Module: voucher | Table: orderchange_paymentschedules | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 收款计划表变更单 |
| uri | voucher.orderchange.OrderChangePaymentSchedules |
| tableName | orderchange_paymentschedules |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | voucher.order.PaymentSchedules |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (1)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (47)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | settleWay | 结算方式id | settleWay | quote | aa.settlemethod.SettleMethod |  |  | nullable |
| 2 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide,notGenerate |
| 3 | fixedexpireday | 固定到期日 | fixedexpireday | short | Short |  |  | nullable |
| 4 | fixedoaday | 固定出账日 | fixedoaday | short | Short |  |  | nullable |
| 5 | milestoneId | 里程碑 | cmilestoneid | quote | BGDM.milestones.project_milepost |  |  | nullable |
| 6 | paidMoneyNew | 已收款金额 | paidMoneyNew | number | Decimal |  |  | nullable |
| 7 | rebateCashMoney | 抵现返利金额 | fRebateCashMoney | number | Decimal |  |  | nullable |
| 8 | number | 期号 | iNumber | int | Integer |  |  | nullable |
| 9 | name | 阶段名称 | iName | text | String |  |  | nullable |
| 10 | payRatio | 应收比例 | iPayRatio | number | Decimal |  |  | nullable |
| 11 | amount | 应收金额 | iAmount | number | Decimal |  |  | nullable |
| 12 | accountDay | 账期 | iAccountDay | int | Integer |  |  | nullable |
| 13 | accountUnit | 账期单位 | iAccountUnit | - | bd.receivables.DateUnit |  |  | nullable |
| 14 | accountType | 账期类型 | iAccounType | - | bd.receivables.AccountType |  |  | nullable |
| 15 | startDateTime | 起算日 | iStartDateTime | timestamp | Timestamp |  |  | nullable |
| 16 | fixAccoutDateTime | 出账日 | iFixAccoutDateTime | timestamp | Timestamp |  |  | nullable |
| 17 | expiringDateTime | 到期日 | iExpiringDateTime | timestamp | Timestamp |  |  | nullable |
| 18 | paidAmount | 已收金额 | iPaidAmount | number | Decimal |  |  | nullable |
| 19 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 20 | startDate | 起算时点id | iStartDate | quote | bd.receivables.ReceiveStartBase |  |  | nullable |
| 21 | oriOrderId | 销售订单id | iOriOrderId | quote | voucher.order.Order |  |  | nullable |
| 22 | oriPaymentScheduleId | 收付款协议id | iOriPaymentScheduleId | quote | voucher.order.PaymentSchedules |  |  | nullable |
| 23 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 24 | controlLink | 控制环节 | iControlLink | int | Integer |  |  | nullable |
| 25 | fixExpireDayThree | 固定到期日3 | iFixExpireDayThree | int | Integer |  |  | nullable |
| 26 | fixExpireDayTwo | 固定到期日2 | iFixExpireDayTwo | int | Integer |  |  | nullable |
| 27 | fixAccoutDayTwo | 固定出账日2 | iFixAccoutDayTwo | int | Integer |  |  | nullable |
| 28 | fixExpireDayOne | 固定到期日1 | iFixExpireDayOne | int | Integer |  |  | nullable |
| 29 | uordercorp | 租户 | iCorpId | long | Long |  | Y | nullable,reportHide |
| 30 | rate | 汇率 | fRate | number | Decimal |  |  | nullable |
| 31 | preReceiveType | 预收折算方式 | iPreReceiveType | - | bd.receivables.PreReceiveType |  |  | nullable |
| 32 | mainid | 变更单id | iOrderId | quote | voucher.orderchange.OrderChange |  |  | nullable |
| 33 | tenant | 租户 | tenant_id | long | Long |  |  | nullable |
| 34 | controlMode | 控制方式 | iControlMode | int | Integer |  |  | nullable |
| 35 | controlOppt | 控制时机 | iControlOppt | int | Integer |  |  | nullable |
| 36 | delayMonth | 起算日延迟月 | iDelayMonth | int | Integer |  |  | nullable |
| 37 | preReceive | 0无预收,1预收 | bPreReceive | switch | Boolean |  |  | nullable |
| 38 | fixAccoutDayOne | 固定出账日1 | iFixAccoutDayOne | int | Integer |  |  | nullable |
| 39 | fixExpireDayFour | 固定到期日4 | iFixExpireDayFour | int | Integer |  |  | nullable |
| 40 | natCurrencyPk | 本币pk | cDomesticPk | text | String |  |  | nullable |
| 41 | sourceType | 起算时点是否是系统预制 | bStartSourceType | switch | Boolean |  |  | nullable |
| 42 | deposit | 0无保证金,1有保证金 | bDeposit | switch | Boolean |  |  | nullable |
| 43 | fixAccoutDayThree | 固定出账日3 | iFixAccoutDayThree | int | Integer |  |  | nullable |
| 44 | fixAccoutDayFour | 固定出账日4 | iFixAccoutDayFour | int | Integer |  |  | nullable |
| 45 | delayDay | 起算日延迟日 | iDelayDay | int | Integer |  |  | nullable |
| 46 | currencyPk | 原币pk | cOriginalPk | text | String |  |  | nullable |
| 47 | scheduleDefineCharacter | 收款协议自定义项特征组 | scheduleDefineCharacter | UserDefine | voucher.orderchange.PaymentScheduleDefineCharacter |  |  | nullable |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | settleWay | 结算方式id | settleWay | aa.settlemethod.SettleMethod |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 3 | milestoneId | 里程碑 | cmilestoneid | BGDM.milestones.project_milepost |
| 4 | startDate | 起算时点id | iStartDate | bd.receivables.ReceiveStartBase |
| 5 | oriOrderId | 销售订单id | iOriOrderId | voucher.order.Order |
| 6 | oriPaymentScheduleId | 收付款协议id | iOriPaymentScheduleId | voucher.order.PaymentSchedules |
| 7 | mainid | 变更单id | iOrderId | voucher.orderchange.OrderChange |
