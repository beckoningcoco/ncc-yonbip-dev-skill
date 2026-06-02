---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxengine.TaxCalculationInput]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 计税输入 (`taxpubdoc.taxengine.TaxCalculationInput`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `tax_calc_input` | 应用: `DPMTAX`

## 属性（58 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `taxPriceFlag` | taxPriceFlag | `tax_price_flag` | taxPriceFlag | `singleOption` |
| 2 | `taxAccType` | taxAccType | `tax_acc_type` | taxCurrType | `singleOption` |
| 3 | `invoiceReceiptAddress` | invoiceReceiptAddress | `invoice_receipt_address` | 0d98e246-387e-4239-a8da-c372e94fff77 | `quote` |
| 4 | `invoiceAddress` | invoiceAddress | `invoice_address` | String | `text` |
| 5 | `vendorTaxCountry` | vendorTaxCountry | `vendor_tax_country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 6 | `customerId` | customerID | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 7 | `billtypeId` | billtypeID | `billtype_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |
| 8 | `warehouseId` | warehouseID | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 9 | `customerTaxNumber` | customerTaxNumber | `customer_tax_number` | String | `text` |
| 10 | `directDelivery` | directDelivery | `direct_delivery` | taxpubdocYNEnum | `singleOption` |
| 11 | `receiverAddress` | receiverAddress | `receiver_address` | String | `text` |
| 12 | `deliveryCountry` | deliveryCountry | `delivery_country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 13 | `invoiceReceiptCountry` | invoiceReceiptCountry | `invoice_receipt_country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 14 | `transtypeId` | transtypeID | `transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 15 | `insiderTrading` | insiderTrading | `insider_trading` | taxpubdocYNEnum | `singleOption` |
| 16 | `invoiceCountry` | invoiceCountry | `invoice_country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 17 | `customerTaxCountry` | customerTaxCountry | `customer_tax_country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 18 | `receiverPostcode` | receiverPostcode | `receiver_postcode` | String | `text` |
| 19 | `invoicePostcode` | invoicePostcode | `invoice_postcode` | String | `text` |
| 20 | `currencyId` | currencyID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 21 | `taxpayerType` | taxpayerType | `taxpayer_type` | String | `text` |
| 22 | `receiverCountry` | receiverCountry | `receiver_country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 23 | `currencyConvertDate` | currencyConvertDate | `currency_convert_date` | String | `date` |
| 24 | `vendorTaxNumber` | vendorTaxNumber | `vendor_tax_number` | String | `text` |
| 25 | `vendorId` | vendorID | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 26 | `transDate` | transDate | `trans_date` | Date | `dateTime` |
| 27 | `orgCountry` | orgCountry | `org_country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 28 | `deliveryAddress` | deliveryAddress | `delivery_address` | String | `text` |
| 29 | `defineTerm` | defineTerm | `define_term` | e0d65972-3883-40a0-b81f-f956e19a8f30 | `UserDefine` |
| 30 | `invoiceReceiptPostcode` | invoiceReceiptPostcode | `invoice_receipt_postcode` | String | `text` |
| 31 | `deliveryPostcode` | deliveryPostcode | `delivery_postcode` | String | `text` |
| 32 | `taxCalcMethod` | taxCalcMethod | `tax_calc_method` | TaxCalcMethod_C | `singleOption` |
| 33 | `currType` | currType | `curr_type` | taxEngineCurrType | `singleOption` |
| 34 | `localCurrencyId` | localCurrencyID | `local_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 35 | `exchangeRate` | exchangeRate | `exchange_rate` | Decimal | `number` |
| 36 | `exchangeRateMethod` | exchangeRateMethod | `exchange_rate_method` | String | `text` |
| 37 | `id` | ID | `id` | String | `text` |
| 38 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 39 | `bizFlowInstanceId` | bizFlowInstanceID | `bizflowinstance_id` | String | `text` |
| 40 | `bizFlowMakeBillCode` | bizFlowMakeBill编码 | `bizflow_makebillcode` | String | `text` |
| 41 | `bizflowId` | bizflowID | `bizflow_id` | String | `text` |
| 42 | `bizflowName` | bizflow名称 | `bizflowname` | String | `text` |
| 43 | `sourceBusiObj` | sourceBusiObj | `sourcebusiobj` | String | `text` |
| 44 | `sourceChildId` | sourceChildID | `sourcechild_id` | String | `text` |
| 45 | `sourceCode` | source编码 | `sourcecode` | String | `text` |
| 46 | `sourceId` | sourceID | `source_id` | String | `text` |
| 47 | `firstBusiObj` | firstBusiObj | `firstbusiobj` | String | `text` |
| 48 | `firstChildId` | firstChildID | `firstchild_id` | String | `text` |
| 49 | `firstCode` | first编码 | `firstcode` | String | `text` |
| 50 | `firstId` | firstID | `first_id` | String | `text` |
| 51 | `sourceGrandId` | sourceGrandID | `sourcegrand_id` | String | `text` |
| 52 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 53 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 54 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 55 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 56 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 57 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 58 | `TaxCalculationInputDetailList` | TaxCalculationInputDetailList | `` | 002f1c0c-815d-4afd-a93e-446e31a5abc9 | `` |

## 关联（20 个）

- `invoiceReceiptAddress` -> `aa.regioncorp.RegionCorp` () [废]
- `billtypeId` -> `bd.bill.BillTypeVO` () [废]
- `creator` -> `base.user.BipUser` () 
- `invoiceReceiptCountry` -> `bd.country.CountryVO` () [废]
- `invoiceCountry` -> `bd.country.CountryVO` () [废]
- `localCurrencyId` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `defineTerm` -> `taxpubdoc.taxengine.TaxCalculationInputdefineTermUserDefine` () [废]
- `modifier` -> `base.user.BipUser` () 
- `orgCountry` -> `bd.country.CountryVO` () [废]
- `vendorId` -> `aa.vendor.Vendor` () [废]
- `TaxCalculationInputDetailList` -> `taxpubdoc.taxengine.TaxCalculationInputDetail` (0..n) 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `customerTaxCountry` -> `bd.country.CountryVO` () [废]
- `receiverCountry` -> `bd.country.CountryVO` () [废]
- `warehouseId` -> `aa.warehouse.Warehouse` () [废]
- `deliveryCountry` -> `bd.country.CountryVO` () [废]
- `customerId` -> `aa.merchant.Merchant` () [废]
- `vendorTaxCountry` -> `bd.country.CountryVO` () [废]
- `currencyId` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `transtypeId` -> `bd.bill.TransType` () [废]
