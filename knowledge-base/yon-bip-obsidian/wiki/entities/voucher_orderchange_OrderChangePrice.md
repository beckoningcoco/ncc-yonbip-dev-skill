---
tags: [BIP, metadata, voucher, OrderChangePrice]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 变更单金额 (voucher.orderchange.OrderChangePrice)

> Platform: BIP V5 | Module: voucher | Table: orderschange_price | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 变更单金额 |
| uri | voucher.orderchange.OrderChangePrice |
| tableName | orderschange_price |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | voucher.order.OrderPrice |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | iorderId |

## Suppliers (1)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (87)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | expenseNatSum | 费用本币含税金额 | fExpenseNatSum | number | Decimal |  |  | nullable |
| 2 | agentTaxItem | 客户销项税率id | cTaxItems | text | String |  |  | nullable |
| 3 | code | 单据编号 | cOrderNo | text | String |  |  | nullable |
| 4 | currency | 原币pk | cOriginalPk | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 5 | discountAfterMoney | 整单折后金额 | fDiscountAfterMoney | number | Decimal |  |  | nullable |
| 6 | discountMoney | 折扣总金额 | fDiscountMoney | number | Decimal |  |  | nullable |
| 7 | domesticCode | 本币简称 | cDomesticCode | text | String |  |  | nullable |
| 8 | domesticName | 本币 | cDomesticName | text | String |  |  | nullable |
| 9 | changeBusinessType | 变更类型 | change_businesstype | short | Short |  |  | nullable |
| 10 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide,notGenerate |
| 11 | atpversion | ATP版本 | atpversion | int | Integer |  |  | nullable |
| 12 | exchRateOps | 汇率计算方式 | exchRateOps | singleOption | unitfyEnum.GZTBDM.ExchangeRateMethod |  |  | nullable |
| 13 | oneTimeOutboundClosure | 一次出库即关闭 | onetimeout_bound_closure | int | Integer |  |  | nullable |
| 14 | orderType | 订单类型 | iordertype | int | Integer |  |  | nullable |
| 15 | outboundProductType | 发出商品 | soutboundproducttype | text | String |  |  | nullable |
| 16 | signFileId | 待签署合同文件 | sign_file_id | attachment | String |  |  | nullable |
| 17 | wholeFavorableRate | 整单倒扣 | fWholeFavorableRate | number | Decimal |  |  | nullable |
| 18 | workTransferOwner | 工作移交负责人 | work_transfer_owner | quote | bd.staff.Staff |  |  | data_auth,nullable |
| 19 | submitTime | 提交时间 | submit_time | dateTime | Timestamp |  |  | nullable |
| 20 | submitter | 提交人 | submitter | quote | base.user.BipUser |  |  | nullable |
| 21 | withdrawTime | 撤回提交时间 | withdraw_time | dateTime | Timestamp |  |  | nullable |
| 22 | withdrawpp | 撤回提交的人 | withdrawpp | quote | base.user.BipUser |  |  | nullable |
| 23 | ctTplId | 合同模板id | ct_tpl_id | text | String |  |  | nullable |
| 24 | ctTplCode | 合同模板编码 | ct_tpl_code | text | String |  |  | nullable |
| 25 | ctTplVersion | 合同模板版本 | ct_tpl_version | text | String |  |  | nullable |
| 26 | ctTplName | 合同模板名称 | ct_tpl_name | text | String |  |  | nullable |
| 27 | ctTermsData | 合同条款数据 | ctTermsData | text | String |  |  | nullable |
| 28 | signStatus | 电子签署状态 | sign_status | short | Short |  |  | nullable |
| 29 | ctSignId | 签署流程ID | ct_sign_id | text | String |  |  | nullable |
| 30 | exchRate | 汇率 | fExchangeRate | number | Decimal |  |  | nullable |
| 31 | exchangeRateType | 汇率类型id | cExchangeRateTypeId | quote | bd.exchangeRate.ExchangeRateTypeVO |  |  | nullable |
| 32 | expenseOriSum | 费用含税金额 | fExpenseOriSum | number | Decimal |  |  | nullable |
| 33 | iDeleted | 删除标记 | iDeleted | short | Short |  |  | nullable |
| 34 | id | id | id | long | Long |  |  | nullable,REF.ID |
| 35 | invoiceOriSum | 累计开票金额 | fInvoiceOriSum | number | Decimal |  |  | nullable |
| 36 | natCurrency | 本币pk | cDomesticPk | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 37 | orderId | 变更单id | iorderId | quote | voucher.orderchange.OrderChange |  |  | nullable,REF.ID |
| 38 | orderPayMoneyDomestic | 商品本币含税实付金额 | fOrderPayMoney_domestic | number | Decimal |  |  | nullable |
| 39 | orderPayMoneyDomesticTaxfree | 商品本币无税金额 | fOrderPayMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 40 | orderPayMoneyOrigTaxfree | 商品实付无税金额 | fOrderPayMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 41 | orderRealMoneyDomestic | 商品本币含税应付金额 | fOrderRealMoney_domestic | number | Decimal |  |  | nullable |
| 42 | orderRealMoneyDomesticTaxfree | 商品本币无税应付金额 | fOrderRealMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 43 | orderRealMoneyOrigTaxfree | 商品应付无税金额 | fOrderRealMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 44 | originalCode | 原币简称 | cOriginalCode | text | String |  |  | nullable |
| 45 | originalName | 币种 | cOriginalName | text | String |  |  | nullable |
| 46 | outBoundSumMoney | 累计出库金额 | fOutBoundSumMoney | number | Decimal |  |  | nullable |
| 47 | particularlyMoneyDomestic | 本币特殊优惠 | fParticularlyMoney_domestic | number | Decimal |  |  | nullable |
| 48 | particularlyMoneyDomesticTaxfree | 本币无税特殊优惠 | fParticularlyMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 49 | particularlyMoneyOrigTaxfree | 无税特殊优惠 | fParticularlyMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 50 | payMoneyDomestic | 本币含税金额 | fPayMoney_domestic | number | Decimal |  |  | nullable |
| 51 | payMoneyDomesticTaxfree | 本币无税金额 | fPayMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 52 | payMoneyOrigTaxfree | 合计无税金额 | fPayMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 53 | pointsMoneyDomestic | 本币积分抵扣 | fPointsMoney_domestic | number | Decimal |  |  | nullable |
| 54 | pointsMoneyOrigTaxfree | 无税积分抵扣 | fPointsMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 55 | promotionMoneyDomestic | 本币促销优惠 | fPromotionMoney_domestic | number | Decimal |  |  | nullable |
| 56 | promotionMoneyDomesticTaxfree | 本币无税促销金额 | fPromotionMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 57 | promotionMoneyOrigTaxfree | 无税促销优惠 | fPromotionMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 58 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 59 | realMoneyDomestic | 本币含税应付金额 | fRealMoney_domestic | number | Decimal |  |  | nullable |
| 60 | realMoneyDomesticTaxfree | 本币无税应付金额 | fRealMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 61 | realMoneyOrigTaxfree | 应付无税金额 | fRealMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 62 | rebateCashMoneyDomestic | 本币含税抵现金额 | fRebateCashMoney_domestic | number | Decimal |  |  | nullable |
| 63 | rebateCashMoneyDomesticTaxfree | 本币无税抵现金额 | fRebateCashMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 64 | rebateCashMoneyOrigTaxfree | 无税抵现金额 | fRebateCashMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 65 | rebateMoneyDomestic | 本币返利金额 | fRebateMoney_domestic | number | Decimal |  |  | nullable |
| 66 | rebateMoneyDomesticTaxfree | 本币无税返利金额 | fRebateMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 67 | rebateMoneyOrigTaxfree | 无税分摊返利 | fRebateMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 68 | reightMoneyDomestic | 本币运费 | fReightMoney_domestic | number | Decimal |  |  | nullable |
| 69 | reightMoneyDomesticTaxfree | 本币无税运费金额 | fReightMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 70 | reightMoneyOrigTaxfree | 无税运费 | fReightMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 71 | sendSumMoney | 累计发货金额 | fSendSumMoney | number | Decimal |  |  | nullable |
| 72 | taxInclusive | 单价含税 | bTaxInclusive | switch | Boolean |  |  | nullable |
| 73 | totalMoneyDomestic | 本币总金额 | fTotalMoney_domestic | number | Decimal |  |  | nullable |
| 74 | totalMoneyDomesticTaxfree | 本币无税总金额 | fTotalMoney_domestic_taxfree | number | Decimal |  |  | nullable |
| 75 | totalMoneyOrigTaxfree | 无税总金额 | fTotalMoney_orig_taxfree | number | Decimal |  |  | nullable |
| 76 | totalNatTax | 本币总税额 | fTotalNatTax | number | Decimal |  |  | nullable |
| 77 | totalOriTax | 税额 | fTotalOriTax | number | Decimal |  |  | nullable |
| 78 | uordercorp | 租户 | iCorpId | long | Long |  | Y | nullable,reportHide |
| 79 | wholeDiscountRate | 整单扣率% | fWholeDiscountRate | number | Decimal |  |  | nullable |
| 80 | coDirectShipmentReturn | 直运退货协同 | codirectshipmentreturn | text | String |  |  | nullable |
| 81 | compMatchExpand | 选配物料生成子件行 | comp_match_expand | int | Integer |  |  | nullable |
| 82 | creatorId | 创建人ID | iSubmiterId | quote | base.user.User |  |  | nullable |
| 83 | lockDate | 锁定日期 | lock_date | date | Date |  |  | nullable |
| 84 | lockStatus | 锁定状态 | lock_status | int | Integer |  |  | nullable |
| 85 | lockTime | 锁定时间 | lock_time | timestamp | Timestamp |  |  | nullable |
| 86 | lockerId | 锁定人ID | locker_id | quote | base.user.User |  |  | nullable |
| 87 | paymentModel | 收款模型 | paymentmodel | int | Integer |  |  | nullable |

---

## Reference Fields (10)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | currency | 原币pk | cOriginalPk | bd.currencytenant.CurrencyTenantVO |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 3 | workTransferOwner | 工作移交负责人 | work_transfer_owner | bd.staff.Staff |
| 4 | submitter | 提交人 | submitter | base.user.BipUser |
| 5 | withdrawpp | 撤回提交的人 | withdrawpp | base.user.BipUser |
| 6 | exchangeRateType | 汇率类型id | cExchangeRateTypeId | bd.exchangeRate.ExchangeRateTypeVO |
| 7 | natCurrency | 本币pk | cDomesticPk | bd.currencytenant.CurrencyTenantVO |
| 8 | orderId | 变更单id | iorderId | voucher.orderchange.OrderChange |
| 9 | creatorId | 创建人ID | iSubmiterId | base.user.User |
| 10 | lockerId | 锁定人ID | locker_id | base.user.User |

---

## Enum Fields (1)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | exchRateOps | 汇率计算方式 | exchRateOps | ExchangeRateMethod |

---

## Enum Value Details

### 汇率计算方式 (exchRateOps) -> exchRateOps
> Enum: unitfyEnum.GZTBDM.ExchangeRateMethod

| code | value | name |
|------|-------|------|
| 1 | 1 | * |
| 2 | 2 | / |
