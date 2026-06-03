---
tags: [BIP, metadata, voucher, DeliveryPrice]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 发货金额 (voucher.delivery.DeliveryPrice)

> Platform: BIP V5 | Module: voucher | Table: delivery_price | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 发货金额 |
| uri | voucher.delivery.DeliveryPrice |
| tableName | delivery_price |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | uorder.voucher.UorderBizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | iDeliveryId |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | U订货租户相关 (IUordercorp) | base.itf.IUordercorp |
| 2 | 币种信息 (ICurrency) | voucher.base.ICurrency |
| 3 | 逻辑删除相关 (Deletable) | base.itf.Deletable |
| 4 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 5 | 汇率信息 (IExchangeRate) | voucher.base.IExchangeRate |

---

## All Fields (56)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | confirmPriceDomestic | 已支付金额（本币） | fConfirmPrice_domestic | number | Decimal |  |  | nullable |
| 2 | confirmPriceDomesticTaxfree | 已支付金额（本币无税） | fConfirmPrice_domestic_taxfree | number | Decimal |  |  | nullable |
| 3 | confirmPriceOrigTaxfree | 已支付金额（原币无税） | fConfirmPrice_orig_taxfree | number | Decimal |  |  | nullable |
| 4 | currency | 币种 | iCurrencyID | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 5 | deliveryId | 发货单ID | iDeliveryId | quote | voucher.delivery.DeliveryVoucher |  |  | nullable,REF.ID |
| 6 | deliveryNo | 发货单号 | cDeliveryNo | text | String |  |  | nullable |
| 7 | deliveryPayMoneyDomestic | 实付金额(不含运费)（本币） | fDeliveryPayMoney_domestic | number | Decimal |  |  | nullable |
| 8 | deliveryPayMoneyDomesticTaxfree | 实付金额(不含运费)（本币无税） | fDeliveryPayMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 9 | deliveryPayMoneyOrigTaxfree | 实付金额(不含运费)（原币无税） | fDeliveryPayMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 10 | deliveryRealMoneyDomestic | 应付金额(不含运费)（本币） | fDeliveryRealMoney_domestic | number | Decimal |  |  | nullable |
| 11 | deliveryRealMoneyDomesticTaxfree | 应付金额(不含运费)（本币无税） | fDeliveryRealMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 12 | deliveryRealMoneyOrigTaxfree | 应付金额(不含运费)（原币无税） | fDeliveryRealMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 13 | domesticCode | 本币编码 | cDomesticCode | text | String |  |  | nullable |
| 14 | domesticName | 本币名称 | cDomesticName | text | String |  |  | nullable |
| 15 | exchRate | 汇率 | exchRate | number | Decimal |  |  | nullable |
| 16 | exchRateOps | 汇率折算方式 | exchRateOps | - | unitfyEnum.GZTBDM.ExchangeRateMethod |  |  | nullable |
| 17 | exchangeRateType | 汇率类型id | cExchangeRateTypeId | quote | bd.exchangeRate.ExchangeRateTypeVO |  |  | nullable |
| 18 | id | id | id | long | Long |  |  | nullable,REF.ID |
| 19 | invoiceMoneyDomestic | 已开票金额（本币） | fInvoiceMoney_domestic | number | Decimal |  |  | nullable |
| 20 | invoiceMoneyDomesticTaxfree | 已开票金额（本币无税） | fInvoiceMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 21 | invoiceMoneyOrigTaxfree | 已开票金额（原币无税） | fInvoiceMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 22 | isDeleted | 是否删除 | iDeleted | switch | Boolean |  | Y | nullable |
| 23 | natCurrency | 本币 | iNatCurrencyID | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 24 | originalCode | 原币编码 | cOriginalCode | text | String |  |  | nullable |
| 25 | originalName | 原币名称 | cOriginalName | text | String |  |  | nullable |
| 26 | payMoneyDomestic | 实付金额(含运费)（本币） | fPayMoney_domestic | number | Decimal |  |  | nullable |
| 27 | payMoneyDomesticTaxfree | 实付金额(含运费)（本币无税） | fPayMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 28 | payMoneyOrigTaxfree | 实付金额(含运费)（原币无税） | fPayMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 29 | payNatTax | 本币税额 | fPayNatTax | number | Decimal |  |  | nullable |
| 30 | payOriTax | 原币税额 | fPayOriTax | number | Decimal |  |  | nullable |
| 31 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 32 | realMoneyDomestic | 应付金额(含运费)（本币） | fRealMoney_domestic | number | Decimal |  |  | nullable |
| 33 | realMoneyDomesticTaxfree | 应付金额(含运费)（本币无税） | fRealMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 34 | realMoneyOrigTaxfree | 应付金额(含运费)（原币无税） | fRealMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 35 | rebateToCashMoneyDomestic | 抵现金额（本币） | fRebateToCashMoney_domestic | number | Decimal |  |  | nullable |
| 36 | rebateToCashMoneyDomesticTaxfree | 抵现金额（本币无税） | fRebateToCashMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 37 | rebateToCashMoneyOrigTaxfree | 抵现金额（原币无税） | fRebateToCashMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 38 | rebateToOrderMoneyDomestic | 整单返利金额（本币） | fRebateToOrderMoney_domestic | number | Decimal |  |  | nullable |
| 39 | rebateToOrderMoneyDomesticTaxfree | 整单返利金额（本币无税） | fRebateToOrderMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 40 | rebateToOrderMoneyOrigTaxfree | 整单返利金额（原币无税） | fRebateToOrderMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 41 | reightDomestic | 运费（本币） | fReight_domestic | number | Decimal |  |  | nullable |
| 42 | reightDomesticTaxfree | 运费（本币无税） | fReight_domestic_taxfree | number | Decimal |  |  | nullable |
| 43 | reightOrigTaxfree | 运费（原币无税） | fReight_orig_taxfree | number | Decimal |  |  | nullable |
| 44 | taxInclusive | 是否含税 | bTaxInclusive | switch | Boolean |  |  | nullable |
| 45 | totalMoneyDomestic | 总金额（本币） | fTotalMoney_domestic | number | Decimal |  |  | nullable |
| 46 | totalMoneyDomesticTaxfree | 总金额（本币无税） | fTotalMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 47 | totalMoneyOrigTaxfree | 总金额（原币无税） | fTotalMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 48 | totalOutStockRebateMoney | 累计出库折扣返利分摊金额 | ctotalOutStockRebateMoney | number | Decimal |  |  | nullable |
| 49 | unConfirmPriceDomestic | 支付未审核的金额（本币） | fUnConfirmPrice_domestic | number | Decimal |  |  | nullable |
| 50 | unConfirmPriceDomesticTaxfree | 支付未审核的金额（本币无税） | fUnConfirmPrice_domestic_taxfree | number | Decimal |  |  | nullable |
| 51 | unConfirmPriceOrigTaxfree | 支付未审核的金额（原币无税） | fUnConfirmPrice_orig_taxfree | number | Decimal |  |  | nullable |
| 52 | unInvoiceMoneyDomestic | 待开票金额（本币） | fUnInvoiceMoney_domestic | number | Decimal |  |  | nullable |
| 53 | unInvoiceMoneyDomesticTaxfree | 待开票金额（本币无税） | fUnInvoiceMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 54 | unInvoiceMoneyOrigTaxfree | 待开票金额（原币无税） | fUnInvoiceMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 55 | uordercorp | 租户 | iCorpId | long | Long |  | Y | nullable,reportHide |
| 56 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | currency | 币种 | iCurrencyID | bd.currencytenant.CurrencyTenantVO |
| 2 | deliveryId | 发货单ID | iDeliveryId | voucher.delivery.DeliveryVoucher |
| 3 | exchangeRateType | 汇率类型id | cExchangeRateTypeId | bd.exchangeRate.ExchangeRateTypeVO |
| 4 | natCurrency | 本币 | iNatCurrencyID | bd.currencytenant.CurrencyTenantVO |
| 5 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
