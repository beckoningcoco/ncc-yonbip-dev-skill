---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxengine.TaxCalculationInputDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 计税输入明细 (`taxpubdoc.taxengine.TaxCalculationInputDetail`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `tax_calc_input_b` | 应用: `DPMTAX`

## 属性（55 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `exchangeRateMethod` | exchangeRateMethod | `exchange_rate_method` | ExchangeRateMethod | `singleOption` |
| 2 | `exchangeRate` | exchangeRate | `exchange_rate` | Decimal | `number` |
| 3 | `localCurrencyId` | localCurrencyID | `local_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 4 | `currencyId` | currencyID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 5 | `currType` | currType | `curr_type` | taxEngineCurrType | `singleOption` |
| 6 | `lineAmountMark` | lineAmountMark | `line_amount_mark` | String | `text` |
| 7 | `discountAmount` | discountAmount | `discount_amount` | Decimal | `number` |
| 8 | `priceMark` | priceMark | `price_mark` | taxPriceFlag | `singleOption` |
| 9 | `hid` | hid | `hid` | bce8f91c-16fa-4e46-99b9-47cd0e4a5f89 | `quote` |
| 10 | `calcTaxDate` | calcTaxDate | `calc_tax_date` | String | `date` |
| 11 | `unitPrice` | unitPrice | `unit_price` | Decimal | `number` |
| 12 | `productClassId` | productClassID | `product_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |
| 13 | `hsje` | hsje | `hsje` | Decimal | `number` |
| 14 | `deliveryCountry` | deliveryCountry | `delivery_country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 15 | `receiverAddress` | receiverAddress | `receiver_address` | String | `text` |
| 16 | `deliveryPostcode` | deliveryPostcode | `delivery_postcode` | String | `text` |
| 17 | `hsdj` | hsdj | `hsdj` | Decimal | `number` |
| 18 | `warehouseId` | warehouseID | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 19 | `receiverPostcode` | receiverPostcode | `receiver_postcode` | String | `text` |
| 20 | `materialId` | materialID | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 21 | `directDelivery` | directDelivery | `direct_delivery` | taxpubdocYNEnum | `singleOption` |
| 22 | `unitId` | unitID | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 23 | `marClassCode` | marClass编码 | `mar_class_code` | String | `text` |
| 24 | `money` | money | `money` | Decimal | `number` |
| 25 | `defineTerm` | defineTerm | `define_term` | 6a2b7dac-caa3-496f-927e-8c5df06fbcbb | `UserDefine` |
| 26 | `costPrice` | costPrice | `cost_price` | Decimal | `number` |
| 27 | `receiverCountry` | receiverCountry | `receiver_country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 28 | `dj` | dj | `dj` | Decimal | `number` |
| 29 | `qty` | qty | `qty` | Decimal | `number` |
| 30 | `reliefTaxCodeId` | reliefTax编码ID | `relief_tax_code_id` | f4d09486-b96d-44b2-bb7d-7f9e79bcf157 | `quote` |
| 31 | `deliveryAddress` | deliveryAddress | `delivery_address` | String | `text` |
| 32 | `taxCodeId` | tax编码ID | `tax_code_id` | 3f7c3856-5b00-4506-b458-a64eed0d3bfb | `quote` |
| 33 | `discountMoney` | discountMoney | `discount_money` | Decimal | `number` |
| 34 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 35 | `id` | ID | `id` | String | `text` |
| 36 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 37 | `bizFlowInstanceId` | bizFlowInstanceID | `bizflowinstance_id` | String | `text` |
| 38 | `bizFlowMakeBillCode` | bizFlowMakeBill编码 | `bizflow_makebillcode` | String | `text` |
| 39 | `bizflowId` | bizflowID | `bizflow_id` | String | `text` |
| 40 | `bizflowName` | bizflow名称 | `bizflowname` | String | `text` |
| 41 | `sourceBusiObj` | sourceBusiObj | `sourcebusiobj` | String | `text` |
| 42 | `sourceChildId` | sourceChildID | `sourcechild_id` | String | `text` |
| 43 | `sourceCode` | source编码 | `sourcecode` | String | `text` |
| 44 | `sourceId` | sourceID | `source_id` | String | `text` |
| 45 | `firstBusiObj` | firstBusiObj | `firstbusiobj` | String | `text` |
| 46 | `firstChildId` | firstChildID | `firstchild_id` | String | `text` |
| 47 | `firstCode` | first编码 | `firstcode` | String | `text` |
| 48 | `firstId` | firstID | `first_id` | String | `text` |
| 49 | `sourceGrandId` | sourceGrandID | `sourcegrand_id` | String | `text` |
| 50 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 51 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 52 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 53 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 54 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 55 | `dr` | 逻辑删除 | `dr` | Short | `short` |

## 关联（16 个）

- `hid` -> `taxpubdoc.taxengine.TaxCalculationInput` (0..n) [废]
- `creator` -> `base.user.BipUser` () 
- `productClassId` -> `pc.cls.ManagementClass` () [废]
- `localCurrencyId` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `defineTerm` -> `taxpubdoc.taxengine.TaxCalculationInputDetaildefineTermUserDefine` () [废]
- `modifier` -> `base.user.BipUser` () 
- `reliefTaxCodeId` -> `taxpubdoc.taxengine.TaxReliefCode` () [废]
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `materialId` -> `pc.product.Product` () [废]
- `taxCodeId` -> `taxpubdoc.taxengine.TaxCode` () [废]
- `receiverCountry` -> `bd.country.CountryVO` () [废]
- `warehouseId` -> `aa.warehouse.Warehouse` () [废]
- `deliveryCountry` -> `bd.country.CountryVO` () [废]
- `unitId` -> `pc.unit.Unit` () [废]
- `currency` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `currencyId` -> `bd.currencytenant.CurrencyTenantVO` () [废]
