---
tags: [BIP, 元数据, 数据字典, voucher.order.OrderDetailPrice]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 订单商品金额 (`voucher.order.OrderDetailPrice`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `orderdetail_price` | 应用: `SCMSA` | 类型: `Class`

## 属性（105 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `code` | 编码 | `cOrderNo` | String | `text` |
| 2 | `id` | ID | `id` | Long | `long` |
| 3 | `idKey` | idKey | `cOrderDetailIdkey` | String | `text` |
| 4 | `orderDetailId` | orderDetailID | `iOrderDetailId` | 3722d563-08aa-453d-ac82-6b8cf906b1ab | `quote` |
| 5 | `qty` | qty | `qty` | Decimal | `number` |
| 6 | `subQty` | subQty | `subQty` | Decimal | `number` |
| 7 | `favorableRate` | favorableRate | `fFavorableRate` | Decimal | `number` |
| 8 | `ismakeorderbom` | 是否makeorderbom | `ismakeorderbom` | Short | `short` |
| 9 | `excessiveSigning` | excessiveSigning | `excessivesigning` | Short | `short` |
| 10 | `advancePaymentOffsetMethod` | advancePaymentOffsetMethod | `advancePaymentOffsetMethod` | Integer | `int` |
| 11 | `returnOriSum` | returnOriSum | `freturnorisum` | Decimal | `number` |
| 12 | `returnPreSendOriSum` | returnPreSendOriSum | `freturnpresendorisum` | Decimal | `number` |
| 13 | `totalReturnStockOriSum` | totalReturnStockOriSum | `ftotalreturnstockorisum` | Decimal | `number` |
| 14 | `totalReturnInvoiceOriSum` | totalReturnInvoiceOriSum | `ftotalreturninvoiceorisum` | Decimal | `number` |
| 15 | `returnPriceQty` | returnPriceQty | `freturnpriceqty` | Decimal | `number` |
| 16 | `totalReturnStockQty` | totalReturnStockQty | `ftotalreturnstockqty` | Decimal | `number` |
| 17 | `totalReturnStockPriceQty` | totalReturnStockPriceQty | `ftotalreturnstockpriceqty` | Decimal | `number` |
| 18 | `totalReturnInvoiceQty` | totalReturnInvoiceQty | `ftotalreturninvoiceqty` | Decimal | `number` |
| 19 | `totalReturnInvoicePriceQty` | totalReturnInvoicePriceQty | `ftotalreturninvoicepriceqty` | Decimal | `number` |
| 20 | `financeReferenced` | financeReferenced | `ifinancereferenced` | Integer | `int` |
| 21 | `paidMoneyNew` | paidMoneyNew | `paidMoneyNew` | Decimal | `number` |
| 22 | `taxCodeId` | tax编码ID | `tax_code_id` | 3f7c3856-5b00-4506-b458-a64eed0d3bfb | `quote` |
| 23 | `oriWithholdingTax` | oriWithholdingTax | `oriwithholdingtax` | Decimal | `number` |
| 24 | `natWithholdingTax` | natWithholdingTax | `natwithholdingtax` | Decimal | `number` |
| 25 | `proposedVendorId` | proposedVendorID | `proposed_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 26 | `receivableDiffQty` | receivableDiffQty | `freceivablediffqty` | Decimal | `number` |
| 27 | `calBase` | calBase | `calbase` | Short | `short` |
| 28 | `salesactionid` | salesactionid | `salesactionid` | Long | `long` |
| 29 | `totalOutStockConfirmQuantity` | totalOutStockConfirmQuantity | `ftotaloutstockconfirmquantity` | Decimal | `number` |
| 30 | `totalOutStockConfirmSubQty` | totalOutStockConfirmSubQty | `ftotaloutstockconfirmsubqty` | Decimal | `number` |
| 31 | `isUpConfigured` | 是否UpConfigured | `isupconfigured` | Integer | `int` |
| 32 | `reissue` | reissue | `ireissue` | Integer | `int` |
| 33 | `sourceOrderNo` | sourceOrderNo | `csourceorderno` | String | `text` |
| 34 | `sourceOrderLineNo` | sourceOrderLineNo | `fsourceorderlineno` | Decimal | `number` |
| 35 | `sourceOrderId` | sourceOrderID | `isourceorderid` | Long | `long` |
| 36 | `sourceOrderDetailId` | sourceOrderDetailID | `isourceorderdetailid` | Long | `long` |
| 37 | `totalNewOrderRepQuantity` | totalNewOrderRepQuantity | `ftotalneworderrepquantity` | Decimal | `number` |
| 38 | `custodianType` | custodianType | `custodiantype` | String | `text` |
| 39 | `custodian` | custodian | `custodian` | 0578a613-7f7f-4bec-b589-039035ca3f8a | `quote` |
| 40 | `openingOutStockPriceQty` | openingOutStockPriceQty | `fopeningoutstockpriceqty` | Decimal | `number` |
| 41 | `openingOutStockOriTaxMoney` | openingOutStockOriTaxMoney | `fopeningoutstockoritaxmoney` | Decimal | `number` |
| 42 | `totalTransferQty` | totalTransferQty | `ftotal_transfer_qty` | Decimal | `number` |
| 43 | `inventoryowner` | inventoryowner | `inventoryowner` | af1b583d-f5e4-4f7c-bba5-66d570ef7e3e | `quote` |
| 44 | `ownertype` | ownertype | `ownertype` | Integer | `int` |
| 45 | `totalServiceQty` | totalServiceQty | `ftotalServiceQty` | Decimal | `number` |
| 46 | `prepayInvRvnRecogBkgMeth` | prepayInvRvnRecogBkgMeth | `prepayInvRvnRecogBkgMeth` | Integer | `int` |
| 47 | `confirmQty` | confirmQty | `fconfirmqty` | Decimal | `number` |
| 48 | `unConfirmQty` | unConfirmQty | `funconfirmqty` | Decimal | `number` |
| 49 | `orderQtyRebateMoney` | orderQtyRebateMoney | `forderqtyrebatemoney` | Decimal | `number` |
| 50 | `checkByRevenueManagement` | checkByRevenueManagement | `revmanagecalculate` | Boolean | `switch` |
| 51 | `revPerformObligation` | revPerformObligation | `revperformobligation` | Boolean | `switch` |
| 52 | `serviceStartDate` | serviceStartDate | `service_startdate` | Date | `date` |
| 53 | `serviceEndDate` | serviceEndDate | `service_enddate` | Date | `date` |
| 54 | `optionalQuotationId` | optionalQuotationID | `optional_quotation_id` | fe25af69-5dad-4a67-b9dd-c8a720a2da76 | `quote` |
| 55 | `variantconfigctsCode` | variantconfigcts编码 | `variantconfigcts_code` | String | `text` |
| 56 | `variantconfigctsVersion` | variantconfigctsVersion | `variantconfigcts_version` | String | `text` |
| 57 | `optionalType` | optionalType | `optionalType` | Integer | `int` |
| 58 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 59 | `priceQty` | priceQty | `priceQty` | Decimal | `number` |
| 60 | `invExchRate` | invExchRate | `invExchRate` | Decimal | `number` |
| 61 | `invPriceExchRate` | invPriceExchRate | `invPriceExchRate` | Decimal | `number` |
| 62 | `oriTaxUnitPrice` | oriTaxUnitPrice | `oriTaxUnitPrice` | Decimal | `number` |
| 63 | `oriUnitPrice` | oriUnitPrice | `fTransactionPrice_orig_taxfree` | Decimal | `number` |
| 64 | `oriSum` | oriSum | `oriSum` | Decimal | `number` |
| 65 | `oriMoney` | oriMoney | `fSalePayMoney_orig_taxfree` | Decimal | `number` |
| 66 | `oriTax` | oriTax | `fOriTax` | Decimal | `number` |
| 67 | `taxRate` | taxRate | `taxRate` | Decimal | `number` |
| 68 | `discountRate` | discountRate | `fDiscountRate` | Decimal | `number` |
| 69 | `lineDiscountMoney` | lineDiscountMoney | `fLineDiscountMoney` | Decimal | `number` |
| 70 | `particularlyMoneyOrigTaxfree` | particularlyMoneyOrigTaxfree | `fParticularlyMoney_orig_taxfree` | Decimal | `number` |
| 71 | `promotionMoneyOrigTaxfree` | promotionMoneyOrigTaxfree | `fPromotionMoney_orig_taxfree` | Decimal | `number` |
| 72 | `rebateMoneyOrigTaxfree` | rebateMoneyOrigTaxfree | `fRebateMoney_orig_taxfree` | Decimal | `number` |
| 73 | `pointsMoneyOrigTaxfree` | pointsMoneyOrigTaxfree | `fPointsMoney_orig_taxfree` | Decimal | `number` |
| 74 | `natTaxUnitPrice` | natTaxUnitPrice | `fTransactionPrice_domestic` | Decimal | `number` |
| 75 | `natUnitPrice` | natUnitPrice | `fTransactionPrice_domestic_taxfree` | Decimal | `number` |
| 76 | `natSum` | natSum | `fSalePayMoney_domestic` | Decimal | `number` |
| 77 | `natMoney` | natMoney | `fSalePayMoney_domestic_taxfree` | Decimal | `number` |
| 78 | `natTax` | natTax | `fNatTax` | Decimal | `number` |
| 79 | `particularlyMoneyDomestic` | particularlyMoneyDomestic | `fParticularlyMoney_domestic` | Decimal | `number` |
| 80 | `particularlyMoneyDomesticTaxfree` | particularlyMoneyDomesticTaxfree | `fParticularlyMoney_domestic_taxfree` | Decimal | `number` |
| 81 | `rebateMoneyDomestic` | rebateMoneyDomestic | `fRebateMoney_domestic` | Decimal | `number` |
| 82 | `rebateMoneyDomesticTaxfree` | rebateMoneyDomesticTaxfree | `fRebateMoney_domestic_taxfree` | Decimal | `number` |
| 83 | `cashRebateMoneyDomestic` | cashRebateMoneyDomestic | `fCashRebateMoney_domestic` | Decimal | `number` |
| 84 | `orderRebateMoneyDomestic` | orderRebateMoneyDomestic | `fOrderRebateMoney_domestic` | Decimal | `number` |
| 85 | `promotionMoneyDomestic` | promotionMoneyDomestic | `fPromotionMoney_domestic` | Decimal | `number` |
| 86 | `promotionMoneyDomesticTaxfree` | promotionMoneyDomesticTaxfree | `fPromotionMoney_domestic_taxfree` | Decimal | `number` |
| 87 | `pointsMoneyDomestic` | pointsMoneyDomestic | `fPointsMoney_domestic` | Decimal | `number` |
| 88 | `pointsMoneyDomesticTaxfree` | pointsMoneyDomesticTaxfree | `fPointsMoney_domestic_taxfree` | Decimal | `number` |
| 89 | `salePrice_orig_taxfree` | salePrice_orig_taxfree | `fSalePrice_orig_taxfree` | Decimal | `number` |
| 90 | `saleCost_orig_taxfree` | saleCost_orig_taxfree | `fSaleCost_orig_taxfree` | Decimal | `number` |
| 91 | `saleCost_domestic` | saleCost_domestic | `fSaleCost_domestic` | Decimal | `number` |
| 92 | `saleCost_domestic_taxfree` | saleCost_domestic_taxfree | `fSaleCost_domestic_taxfree` | Decimal | `number` |
| 93 | `salePrice_domestic` | salePrice_domestic | `fSalePrice_domestic` | Decimal | `number` |
| 94 | `salePrice_domestic_taxfree` | salePrice_domestic_taxfree | `fSalePrice_domestic_taxfree` | Decimal | `number` |
| 95 | `uordercorp` | uordercorp | `iCorpId` | Long | `long` |
| 96 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |
| 97 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 98 | `invExchRateDen` | invExchRateDen | `invexchrateden` | Decimal | `number` |
| 99 | `invExchRateNum` | invExchRateNum | `invexchratenum` | Decimal | `number` |
| 100 | `invPriceExchRateDen` | invPriceExchRateDen | `invpriceexchrateden` | Decimal | `number` |
| 101 | `invPriceExchRateNum` | invPriceExchRateNum | `invpriceexchratenum` | Decimal | `number` |
| 102 | `optionalQuotationSubId` | optionalQuotationSubID | `optional_quotation_sub_id` | 4a962e6e-40fd-4b1c-b093-37739c6494d1 | `quote` |
| 103 | `totalSettledOriSum` | totalSettledOriSum | `totalsettledorisum` | Decimal | `number` |
| 104 | `totalSettledQuantity` | totalSettledQuantity | `totalsettledquantity` | Decimal | `number` |
| 105 | `totalWorkOrderQty` | totalWorkOrderQty | `ftotalworkorderqty` | Decimal | `number` |

## 关联（8 个）

- `custodian` -> `st.custodian.Custodian` ()
- `optionalQuotationSubId` -> `marketing.cpq.OptionalQuotationDetail` ()
- `optionalQuotationId` -> `marketing.cpq.OptionalQuotation` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `proposedVendorId` -> `aa.vendor.Vendor` ()
- `taxCodeId` -> `taxpubdoc.taxengine.TaxCode` ()
- `orderDetailId` -> `voucher.order.OrderDetail` (1)
- `inventoryowner` -> `st.inventoryowner.InventoryOwner` ()
