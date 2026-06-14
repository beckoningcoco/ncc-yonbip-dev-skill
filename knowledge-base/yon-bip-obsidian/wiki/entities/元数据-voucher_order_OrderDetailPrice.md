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

> **平台版本：BIP 旗舰版 V5**
> 物理表：`orderdetail_price` | domain：`udinghuo` | 应用：`SCMSA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 订单商品金额 |
| 物理表 | `orderdetail_price` |
| domain/服务域 | `udinghuo` |
| 所属应用 | `SCMSA` |
| 直连字段 | 105 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `custodian` | `` |
| `optional_quotation_sub_id` | `` |
| `optional_quotation_id` | `` |
| `ytenant_id` | `` |
| `proposed_vendor_id` | `` |
| `tax_code_id` | `` |
| `iOrderDetailId` | `` |
| `` | `` |

## 继承接口 (11个, 32字段)

- **换算比** (`gscm.itf.IUOMExchRate`)
  - `` → ``
  - `invexchrateden` → `invexchrateden`
  - `invexchratenum` → `invexchratenum`
  - `` → ``
  - `` → ``
- **计价换算比** (`gscm.itf.IUOMPriceExchRate`)
  - `` → ``
  - `invpriceexchrateden` → `invpriceexchrateden`
  - `invpriceexchratenum` → `invpriceexchratenum`
  - `` → ``
  - `` → ``
- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **本币金额信息** (`voucher.base.INatMoneyInfo`)
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
- **原币金额信息** (`voucher.base.IOriMoneyInfo`)
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
- **计量单位信息** (`voucher.base.IUOMInfo`)
  - `` → ``
  - `` → ``
  - `` → ``
- **计价单位信息** (`voucher.base.IUOMPriceInfo`)
  - `` → ``
  - `` → ``
  - `` → ``
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **货主对象** (`st.inventoryowner.IInventoryOwner`)
  - `` → ``
- **货权归属** (`st.inventoryowner.IOwnerType`)
  - `` → ``

## 字段列表（按类型分组）

> 共 105 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cOrderNo` | `cOrderNo` | `code` | 单据编号 |
| `cOrderDetailIdkey` | `cOrderDetailIdkey` | `idKey` | 行标识 |
| `csourceorderno` | `csourceorderno` | `sourceOrderNo` | 来源订单号 |
| `custodiantype` | `custodiantype` | `custodianType` | 保管者类型 |
| `variantconfigcts_code` | `variantconfigcts_code` | `variantconfigctsCode` | 配置号 |
| `variantconfigcts_version` | `variantconfigcts_version` | `variantconfigctsVersion` | 配置清单版本 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iOrderDetailId` | `iOrderDetailId` | `orderDetailId` | 订单详情id |
| `tax_code_id` | `tax_code_id` | `taxCodeId` | 税码 |
| `proposed_vendor_id` | `proposed_vendor_id` | `proposedVendorId` | 建议供应商 |
| `custodian` | `custodian` | `custodian` | 保管者 |
| `` | `inventoryowner` | `inventoryowner` | 货主对象Id |
| `optional_quotation_id` | `optional_quotation_id` | `optionalQuotationId` | 报价配置清单 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `optional_quotation_sub_id` | `optional_quotation_sub_id` | `optionalQuotationSubId` | 母件配置报价清单行ID |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `service_startdate` | `service_startdate` | `serviceStartDate` | 服务起始日期 |
| `service_enddate` | `service_enddate` | `serviceEndDate` | 服务结束日期 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `revmanagecalculate` | `revmanagecalculate` | `checkByRevenueManagement` | 收入管理核算 |
| `revperformobligation` | `revperformobligation` | `revPerformObligation` | 已生成收入履约义务 |
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `advancePaymentOffsetMethod` | `advancePaymentOffsetMethod` | `advancePaymentOffsetMethod` | 预收款开票冲抵方式 |
| `ifinancereferenced` | `ifinancereferenced` | `financeReferenced` | 财务已引用 |
| `isupconfigured` | `isupconfigured` | `isUpConfigured` | 是否上游已选配 |
| `ireissue` | `ireissue` | `reissue` | 是否补发 |
| `` | `ownertype` | `ownertype` | 货权归属 |
| `prepayInvRvnRecogBkgMeth` | `prepayInvRvnRecogBkgMeth` | `prepayInvRvnRecogBkgMeth` | 预收款开票应收入账方式 |
| `optionalType` | `optionalType` | `optionalType` | 选配方式 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ismakeorderbom` | `ismakeorderbom` | `ismakeorderbom` | 已生成订单BOM |
| `excessivesigning` | `excessivesigning` | `excessiveSigning` | 超量签收 |
| `calbase` | `calbase` | `calBase` | 计算基准 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `salesactionid` | `salesactionid` | `salesactionid` | 行动id |
| `isourceorderid` | `isourceorderid` | `sourceOrderId` | 来源订单id |
| `isourceorderdetailid` | `isourceorderdetailid` | `sourceOrderDetailId` | 来源订单行id |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |

### 数值字段 (70个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `qty` | `qty` | `qty` | 数量 |
| `subQty` | `subQty` | `subQty` | 销售数量 |
| `fFavorableRate` | `fFavorableRate` | `favorableRate` | 倒扣 |
| `freturnorisum` | `freturnorisum` | `returnOriSum` | 退货金额 |
| `freturnpresendorisum` | `freturnpresendorisum` | `returnPreSendOriSum` | 退货补发含税金额 |
| `ftotalreturnstockorisum` | `ftotalreturnstockorisum` | `totalReturnStockOriSum` | 累计退货入库含税金额 |
| `ftotalreturninvoiceorisum` | `ftotalreturninvoiceorisum` | `totalReturnInvoiceOriSum` | 累计退货开票含税金额 |
| `freturnpriceqty` | `freturnpriceqty` | `returnPriceQty` | 退货计价数量 |
| `ftotalreturnstockqty` | `ftotalreturnstockqty` | `totalReturnStockQty` | 累计退货入库数量 |
| `ftotalreturnstockpriceqty` | `ftotalreturnstockpriceqty` | `totalReturnStockPriceQty` | 累计退货入库计价数量 |
| `ftotalreturninvoiceqty` | `ftotalreturninvoiceqty` | `totalReturnInvoiceQty` | 累计退货开票数量 |
| `ftotalreturninvoicepriceqty` | `ftotalreturninvoicepriceqty` | `totalReturnInvoicePriceQty` | 累计退货开票计价数量 |
| `paidMoneyNew` | `paidMoneyNew` | `paidMoneyNew` | 已收款金额 |
| `oriwithholdingtax` | `oriwithholdingtax` | `oriWithholdingTax` | 代扣税税额 |
| `natwithholdingtax` | `natwithholdingtax` | `natWithholdingTax` | 本币代扣税税额 |
| `freceivablediffqty` | `freceivablediffqty` | `receivableDiffQty` | 应收扣减数量 |
| `ftotaloutstockconfirmquantity` | `ftotaloutstockconfirmquantity` | `totalOutStockConfirmQuantity` | 累计出库确认数量 |
| `ftotaloutstockconfirmsubqty` | `ftotaloutstockconfirmsubqty` | `totalOutStockConfirmSubQty` | 累计出库确认件数 |
| `fsourceorderlineno` | `fsourceorderlineno` | `sourceOrderLineNo` | 来源订单行号 |
| `ftotalneworderrepquantity` | `ftotalneworderrepquantity` | `totalNewOrderRepQuantity` | 累计新单补货数量 |
| `fopeningoutstockpriceqty` | `fopeningoutstockpriceqty` | `openingOutStockPriceQty` | 期初出库/服务计价数量 |
| `fopeningoutstockoritaxmoney` | `fopeningoutstockoritaxmoney` | `openingOutStockOriTaxMoney` | 期初出库/服务含税金额 |
| `ftotal_transfer_qty` | `ftotal_transfer_qty` | `totalTransferQty` | 累计调拨数量 |
| `ftotalServiceQty` | `ftotalServiceQty` | `totalServiceQty` | 累计下达服务量 |
| `fconfirmqty` | `fconfirmqty` | `confirmQty` | 已确认数量 |
| `funconfirmqty` | `funconfirmqty` | `unConfirmQty` | 未确认数量 |
| `forderqtyrebatemoney` | `forderqtyrebatemoney` | `orderQtyRebateMoney` | 数量货补分摊金额 |
| `priceQty` | `priceQty` | `priceQty` | 计价数量 |
| `invExchRate` | `invExchRate` | `invExchRate` | 换算率 |
| `invPriceExchRate` | `invPriceExchRate` | `invPriceExchRate` | 计价换算率 |
| `oriTaxUnitPrice` | `oriTaxUnitPrice` | `oriTaxUnitPrice` | 含税成交价 |
| `fTransactionPrice_orig_taxfree` | `fTransactionPrice_orig_taxfree` | `oriUnitPrice` | 无税成交价 |
| `oriSum` | `oriSum` | `oriSum` | 含税金额 |
| `fSalePayMoney_orig_taxfree` | `fSalePayMoney_orig_taxfree` | `oriMoney` | 无税金额 |
| `fOriTax` | `fOriTax` | `oriTax` | 税额 |
| `taxRate` | `taxRate` | `taxRate` | 税率 |
| `fDiscountRate` | `fDiscountRate` | `discountRate` | 扣率% |
| `fLineDiscountMoney` | `fLineDiscountMoney` | `lineDiscountMoney` | 行折扣额 |
| `fParticularlyMoney_orig_taxfree` | `fParticularlyMoney_orig_taxfree` | `particularlyMoneyOrigTaxfree` | 原币无税特殊优惠 |
| `fPromotionMoney_orig_taxfree` | `fPromotionMoney_orig_taxfree` | `promotionMoneyOrigTaxfree` | 原币无税促销 |
| `fRebateMoney_orig_taxfree` | `fRebateMoney_orig_taxfree` | `rebateMoneyOrigTaxfree` | 原币无税分摊返利 |
| `fPointsMoney_orig_taxfree` | `fPointsMoney_orig_taxfree` | `pointsMoneyOrigTaxfree` | 原币无税抵扣积分 |
| `fTransactionPrice_domestic` | `fTransactionPrice_domestic` | `natTaxUnitPrice` | 本币含税单价 |
| `fTransactionPrice_domestic_taxfree` | `fTransactionPrice_domestic_taxfree` | `natUnitPrice` | 本币无税单价 |
| `fSalePayMoney_domestic` | `fSalePayMoney_domestic` | `natSum` | 本币含税金额 |
| `fSalePayMoney_domestic_taxfree` | `fSalePayMoney_domestic_taxfree` | `natMoney` | 本币无税金额 |
| `fNatTax` | `fNatTax` | `natTax` | 本币税额 |
| `fParticularlyMoney_domestic` | `fParticularlyMoney_domestic` | `particularlyMoneyDomestic` | 本币特殊优惠 |
| `fParticularlyMoney_domestic_taxfree` | `fParticularlyMoney_domestic_taxfree` | `particularlyMoneyDomesticTaxfree` | 本币无税特殊优惠 |
| `fRebateMoney_domestic` | `fRebateMoney_domestic` | `rebateMoneyDomestic` | 本币分摊返利 |
| `fRebateMoney_domestic_taxfree` | `fRebateMoney_domestic_taxfree` | `rebateMoneyDomesticTaxfree` | 本币无税分摊返利 |
| `fCashRebateMoney_domestic` | `fCashRebateMoney_domestic` | `cashRebateMoneyDomestic` | 本币返利直接抵现 |
| `fOrderRebateMoney_domestic` | `fOrderRebateMoney_domestic` | `orderRebateMoneyDomestic` | 本币返利整单折扣 |
| `fPromotionMoney_domestic` | `fPromotionMoney_domestic` | `promotionMoneyDomestic` | 本币促销优惠 |
| `fPromotionMoney_domestic_taxfree` | `fPromotionMoney_domestic_taxfree` | `promotionMoneyDomesticTaxfree` | 本币无税促销优惠 |
| `fPointsMoney_domestic` | `fPointsMoney_domestic` | `pointsMoneyDomestic` | 本币积分抵扣 |
| `fPointsMoney_domestic_taxfree` | `fPointsMoney_domestic_taxfree` | `pointsMoneyDomesticTaxfree` | 本币无税积分抵扣 |
| `fSalePrice_orig_taxfree` | `fSalePrice_orig_taxfree` | `salePrice_orig_taxfree` | 无税报价 |
| `fSaleCost_orig_taxfree` | `fSaleCost_orig_taxfree` | `saleCost_orig_taxfree` | 报价无税金额 |
| `fSaleCost_domestic` | `fSaleCost_domestic` | `saleCost_domestic` | 报价本币含税金额 |
| `fSaleCost_domestic_taxfree` | `fSaleCost_domestic_taxfree` | `saleCost_domestic_taxfree` | 报价本币无税金额 |
| `fSalePrice_domestic` | `fSalePrice_domestic` | `salePrice_domestic` | 报价本币含税单价 |
| `fSalePrice_domestic_taxfree` | `fSalePrice_domestic_taxfree` | `salePrice_domestic_taxfree` | 报价本币无税单价 |
| `invexchrateden` | `invexchrateden` | `invExchRateDen` | 换算率分母 |
| `invexchratenum` | `invexchratenum` | `invExchRateNum` | 换算率分子 |
| `invpriceexchrateden` | `invpriceexchrateden` | `invPriceExchRateDen` | 计价换算率分母 |
| `invpriceexchratenum` | `invpriceexchratenum` | `invPriceExchRateNum` | 计价换算率分子 |
| `totalsettledorisum` | `totalsettledorisum` | `totalSettledOriSum` | 累计价格结算含税金额 |
| `totalsettledquantity` | `totalsettledquantity` | `totalSettledQuantity` | 累计价格结算数量 |
| `ftotalworkorderqty` | `ftotalworkorderqty` | `totalWorkOrderQty` | 累计服务工单数量 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
