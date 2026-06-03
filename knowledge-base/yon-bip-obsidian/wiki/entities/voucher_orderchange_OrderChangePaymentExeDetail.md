---
tags: [BIP, metadata, voucher, OrderChangePaymentExeDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收款执行明细变更单 (voucher.orderchange.OrderChangePaymentExeDetail)

> Platform: BIP V5 | Module: voucher | Table: orderchange_paymentexedetail | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 收款执行明细变更单 |
| uri | voucher.orderchange.OrderChangePaymentExeDetail |
| tableName | orderchange_paymentexedetail |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | voucher.paymentexedetail.PaymentExeDetail |
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

## All Fields (69)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | startDate | 起算时点id | iStartDate | quote | bd.receivables.ReceiveStartBase |  |  | nullable |
| 2 | order | 期号 | iOrder | int | Integer |  |  | nullable |
| 3 | period | 阶段名称 | period | text | String |  |  | nullable |
| 4 | payRatio | 应收比例 | fPayRatio | number | Decimal |  |  | nullable |
| 5 | showPayMoney | 阶段应收总金额 | showPayMoney | number | Decimal |  |  | nullable |
| 6 | vouchtype | 单据类型 | cVouchType | text | String |  |  | nullable |
| 7 | vouchid | 单据主表id | iVouchId | long | Long |  |  | nullable |
| 8 | vouchsubid | 单据子表id | iVouchSubId | long | Long |  |  | nullable |
| 9 | vouchcode | 单据编号 | cVouchCode | text | String |  |  | nullable |
| 10 | paySum | 收款总金额 | fPaySum | number | Decimal |  |  | nullable |
| 11 | showPaidMoney | 应收金额 | showPaidMoney | number | Decimal |  |  | nullable |
| 12 | writeBackSum | 回写金额 | fWriteBackSum | number | Decimal |  |  | nullable |
| 13 | startBaseDate | 起算日 | dStartBaseDate | timestamp | Timestamp |  |  | nullable |
| 14 | accountDate | 出账日 | dAccountDate | timestamp | Timestamp |  |  | nullable |
| 15 | expireDate | 到期日 | dExpireDate | timestamp | Timestamp |  |  | nullable |
| 16 | preReceive | 是否预付 | bPreReceive | switch | Boolean |  |  | nullable |
| 17 | rowno | 行号 | rowno | int | Integer |  |  | nullable |
| 18 | mainid | 变更单id | iOrderId | quote | voucher.orderchange.OrderChange |  |  | nullable |
| 19 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 20 | actualPayMoney | 已收金额 | fActualPayMoney | number | Decimal |  |  | nullable |
| 21 | oriOrderId | 销售订单id | iOriOrderId | quote | voucher.order.Order |  |  | nullable |
| 22 | firstsource | 源头单据类型 | firstsource | text | String |  |  | nullable |
| 23 | firstsourceid | 源头单据主表id | firstsourceid | long | Long |  |  | nullable |
| 24 | firstsourceautoid | 源头单据子表id | firstsourceautoid | long | Long |  |  | nullable |
| 25 | firstupcode | 源头单据号 | firstupcode | text | String |  |  | nullable |
| 26 | source | 来源单据类型 | source | text | String |  |  | nullable |
| 27 | sourceid | 来源单据主表id | sourceid | long | Long |  |  | nullable |
| 28 | sourceautoid | 来源单据子表id | sourceautoid | long | Long |  |  | nullable |
| 29 | upcode | 来源单据号 | upcode | text | String |  |  | nullable |
| 30 | receiveAgreementId | 收付款协议id | iReceiveAgreementId | long | Long |  |  | nullable |
| 31 | isInit | 是否是订单创建时生成 | isInit | switch | Boolean |  |  | nullable |
| 32 | startBase | 起算阶段 | cStartBase | text | String |  |  | nullable |
| 33 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 34 | payNatSum | 本币收款总金额 | dPayNatSum | number | Decimal |  |  | nullable |
| 35 | payNatMoney | 本币收款金额 | dPayNatMoney | number | Decimal |  |  | nullable |
| 36 | paidMoney | 冲销金额 | fPaidMoney | number | Decimal |  |  | nullable |
| 37 | tenant | 租户 | tenant_id | long | Long | Y | Y | nullable,TENANTID |
| 38 | accountType | 账期类型 | iAccountType | short | Short |  |  | nullable |
| 39 | fixedexpireday2 | 固定到期日2 | iFixedExpireDay2 | short | Short |  |  | nullable |
| 40 | fixedexpireday1 | 固定到期日1 | iFixedExpireDay1 | short | Short |  |  | nullable |
| 41 | fixedexpireday4 | 固定到期日4 | iFixedExpireDay4 | short | Short |  |  | nullable |
| 42 | fixedexpireday3 | 固定到期日3 | iFixedExpireDay3 | short | Short |  |  | nullable |
| 43 | actualPayDate | 实际收款日 | dActualPayDate | timestamp | Timestamp |  |  | nullable |
| 44 | accountDay | 账期 | iAccountDay | int | Integer |  |  | nullable |
| 45 | productsku | 商品SKUID | iProductSkuid | long | Long |  |  | nullable |
| 46 | deposit | 0无保证金，1有保证金 | bDeposit | switch | Boolean |  |  | nullable |
| 47 | delayMonths | 延迟月份 | iDelayMonths | int | Integer |  |  | nullable |
| 48 | fixedoaday1 | 固定出账日1 | iFixedoaDay1 | short | Short |  |  | nullable |
| 49 | payMoney | 收款金额 | fPayMoney | number | Decimal |  |  | nullable |
| 50 | fixedoaday2 | 固定出账日2 | iFixedoaDay2 | short | Short |  |  | nullable |
| 51 | fixedoaday3 | 固定出账日3 | iFixedoaDay3 | short | Short |  |  | nullable |
| 52 | fixedoaday4 | 固定出账日4 | iFixedoaDay4 | short | Short |  |  | nullable |
| 53 | product | 商品 | iProductid | long | Long |  |  | nullable |
| 54 | accountUnit | 账期单位 | iAccountUnit | short | Short |  |  | nullable |
| 55 | startColumn | 起算字段 | cStartColumn | text | String |  |  | nullable |
| 56 | delayDays | 延迟天数 | iDelayDays | int | Integer |  |  | nullable |
| 57 | paidNatMoney | 本币冲销金额 | dPaidNatMoney | number | Decimal |  |  | nullable |
| 58 | blueInvId | 蓝字发票执行明细id | blueInvId | long | Long |  |  | nullable |
| 59 | fixedexpireday | 固定到期日 | fixedexpireday | int | Integer |  |  | nullable |
| 60 | fixedoaday | 固定出账日 | fixedoaday | int | Integer |  |  | nullable |
| 61 | paidMoneyNew | 已收款金额 | paidMoneyNew | number | Decimal |  |  | nullable |
| 62 | payExe | 税额 | payExe | number | Decimal |  |  | nullable |
| 63 | payNatExe | 本币税额 | payNatExe | number | Decimal |  |  | nullable |
| 64 | rebateCashMoney | 抵现返利金额 | fRebateCashMoney | number | Decimal |  |  | nullable |
| 65 | settleWay | 结算方式id | settleWay | quote | aa.settlemethod.SettleMethod |  |  | nullable |
| 66 | settlementOrgId | 开票组织id | iSettlementOrgId | quote | org.func.FinanceOrg |  |  | nullable |
| 67 | srcExedetailId | 收款执行明细显示id | src_exedetail_id | long | Long |  |  | nullable |
| 68 | totalPaidMoneyNew | 累计收款金额 | fTotalPaidMoneyNew | number | Decimal |  |  | nullable |
| 69 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide,notGenerate |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | startDate | 起算时点id | iStartDate | bd.receivables.ReceiveStartBase |
| 2 | mainid | 变更单id | iOrderId | voucher.orderchange.OrderChange |
| 3 | oriOrderId | 销售订单id | iOriOrderId | voucher.order.Order |
| 4 | settleWay | 结算方式id | settleWay | aa.settlemethod.SettleMethod |
| 5 | settlementOrgId | 开票组织id | iSettlementOrgId | org.func.FinanceOrg |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
