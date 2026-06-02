---
tags: [BIP, 元数据, 数据字典, 销售订单, SCMSA, voucher.order.OrderPrice]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
parent_entity: voucher.order.Order
---

# 订单金额 (`voucher.order.OrderPrice`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP 供应链（SCMSA）模块销售订单的子实体元数据字典。
> 物理表：`orders_price` | 所属应用：`SCMSA`
> 父实体：[[销售订单元数据]] (`voucher.order.Order`)

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 订单金额 |
| 描述 |  |
| 物理表 | `orders_price` |
| 所属应用 | `SCMSA` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 数据权限场景 | `` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `orderId` | `iorderId` | c7c0beb4-f830-486d-83e1-51072b319fd2 | 订单ID |
| 创建人 | `creatorId` | — | → User | |

## 部署信息

- **部署时间**: 2026-05-22 23:41:58:000
- **安装来源**: `/app/uorders/ubill/src/ubill-server/scripts/db/patch/mongodb/V5_R0_2507/0001_udinghuo/0010_iuap_common/DML/0270_iuap_metadata/202603/202601261044_metadata_voucher-order_delta.zip`
- **安装人**: mongoTools

## 术语标记

`BusinessData`, `doc`

## 约束

- **migration_orderId** (MetaClassPrimary): 订单id — 唯一字段: `['orderId']`

---

## 依赖接口（共 6 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | IUordercorp (`IUordercorp`) | `base.itf.IUordercorp` | 73 | 1 |
| 2 | ICurrency (`ICurrency`) | `voucher.base.ICurrency` | 44 | 3 |
| 3 | IYTenantExt (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |
| 4 | IContractTerms (`IContractTerms`) | `sale.aa.IContractTerms` | 6 | 8 |
| 5 | ISubmitInfo (`ISubmitInfo`) | `ucfbase.ucfbaseItf.ISubmitInfo` | 85 | 4 |
| 6 | IExchangeRate (`IExchangeRate`) | `voucher.base.IExchangeRate` | 7 | 4 |

### IUordercorp (`IUordercorp`)
> URI: `base.itf.IUordercorp` | 版本: 73

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `uordercorp` (公司(分区键)) | `iCorpId` | `long` | `Long` |

### ICurrency (`ICurrency`)
> URI: `voucher.base.ICurrency` | 版本: 44

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `currency` (currency) | `iCurrencyID` | `quote` | `bd.currencytenant.CurrencyTenantVO` |
| `exchRate` (exchRate) | `` | `number` | `Real` |
| `natCurrency` (natCurrency) | `iNatCurrencyID` | `quote` | `bd.currencytenant.CurrencyTenantVO` |

### IYTenantExt (`IYTenantExt`)
> URI: `ucfbase.ucfbaseItf.IYTenantExt` | 版本: 24

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `ytenant` (租户) | `ytenant_id` | `quote` | `yht.tenant.YhtTenant` |

### IContractTerms (`IContractTerms`)
> URI: `sale.aa.IContractTerms` | 版本: 6

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `ctSignId` (ctSignId) | `ct_sign_id` | `text` | `String` |
| `ctTermsData` (ctTermsData) | `` | `text` | `String` |
| `ctTplCode` (ctTplCode) | `ct_tpl_code` | `text` | `String` |
| `ctTplId` (ctTplId) | `ct_tpl_id` | `text` | `String` |
| `ctTplName` (ctTplName) | `ct_tpl_name` | `text` | `String` |
| `ctTplVersion` (ctTplVersion) | `ct_tpl_version` | `text` | `String` |
| `id` (主键ID) | `id` | `long` | `Long` |
| `signStatus` (签署状态) | `sign_status` | `short` | `Short` |

### ISubmitInfo (`ISubmitInfo`)
> URI: `ucfbase.ucfbaseItf.ISubmitInfo` | 版本: 85

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `submitter` (submitter) | `submitter` | `quote` | `base.user.BipUser` |
| `submitTime` (submitTime) | `submit_time` | `dateTime` | `Timestamp` |
| `withdrawpp` (withdrawpp) | `withdrawpp` | `quote` | `base.user.BipUser` |
| `withdrawTime` (withdrawTime) | `withdraw_time` | `dateTime` | `Timestamp` |

### IExchangeRate (`IExchangeRate`)
> URI: `voucher.base.IExchangeRate` | 版本: 7

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `currency` (currency) | `iCurrencyID` | `quote` | `bd.currencytenant.CurrencyTenantVO` |
| `exchRate` (exchRate) | `` | `number` | `Real` |
| `exchRateOps` (exchRateOps) | `exchRateOps` | `singleOption_int` | `unitfyEnum.GZTBDM.ExchangeRateMethod` |
| `natCurrency` (natCurrency) | `iNatCurrencyID` | `quote` | `bd.currencytenant.CurrencyTenantVO` |

---

## 全部直接属性（共 86 个）

> 含直接映射数据库列的字段。类型为 UUID 的为外键引用（详见关联属性节）。

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 | URI |
|---|--------|--------|---------|------|---------|------|------|-----|
| 1 | `code` | 编码 | `cOrderNo` | String | `text` |  | true | `voucher.order.OrderPrice.code` |
| 2 | `orderId` | 订单ID | `iorderId` | c7c0beb4-f830-486d-83e1-51072b319fd2 | `quote` |  | true | `voucher.order.OrderPrice.orderId` |
| 3 | `id` | 主键ID | `id` | Long | `long` |  | true | `voucher.order.OrderPrice.id` |
| 4 | `currency` | currency | `cOriginalPk` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | true | `voucher.order.OrderPrice.currency` |
| 5 | `originalName` | originalName | `cOriginalName` | String | `text` |  | true | `voucher.order.OrderPrice.originalName` |
| 6 | `originalCode` | originalCode | `cOriginalCode` | String | `text` |  | true | `voucher.order.OrderPrice.originalCode` |
| 7 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true | `ucfbase.ucfbaseItf.IYTenantExt.ytenant` |
| 8 | `oneTimeOutboundClosure` | oneTimeOutboundClosure | `onetimeout_bound_closure` | Integer | `int` |  | true | `voucher.order.OrderPrice.oneTimeOutboundClosure` |
| 9 | `exchRateOps` | exchRateOps | `exchRateOps` | ExchangeRateMethod | `singleOption` |  | true | `voucher.order.OrderPrice.exchRateOps` |
| 10 | `creatorId` | 创建人ID | `iSubmiterId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true | `voucher.order.OrderPrice.creatorId` |
| 11 | `coDirectShipmentReturn` | coDirectShipmentReturn | `codirectshipmentreturn` | String | `text` |  | true | `voucher.order.OrderPrice.coDirectShipmentReturn` |
| 12 | `paymentModel` | paymentModel | `paymentmodel` | Integer | `int` |  | true | `voucher.order.OrderPrice.paymentModel` |
| 13 | `wholeFavorableRate` | wholeFavorableRate | `fWholeFavorableRate` | Decimal | `number` |  | true | `voucher.order.OrderPrice.wholeFavorableRate` |
| 14 | `atpversion` | atpversion | `atpversion` | Integer | `int` |  | true | `voucher.order.OrderPrice.atpversion` |
| 15 | `signFileId` | signFileId | `sign_file_id` | String | `attachment` |  | true | `voucher.order.OrderPrice.signFileId` |
| 16 | `orderType` | orderType | `iordertype` | Integer | `int` |  | true | `voucher.order.OrderPrice.orderType` |
| 17 | `outboundProductType` | outboundProductType | `soutboundproducttype` | String | `text` |  | true | `voucher.order.OrderPrice.outboundProductType` |
| 18 | `workTransferOwner` | workTransferOwner | `work_transfer_owner` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true | `voucher.order.OrderPrice.workTransferOwner` |
| 19 | `submitTime` | submitTime | `submit_time` | DateTime | `dateTime` |  | true | `ucfbase.ucfbaseItf.ISubmitInfo.submitTime` |
| 20 | `submitter` | submitter | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true | `ucfbase.ucfbaseItf.ISubmitInfo.submitter` |
| 21 | `withdrawTime` | withdrawTime | `withdraw_time` | DateTime | `dateTime` |  | true | `ucfbase.ucfbaseItf.ISubmitInfo.withdrawTime` |
| 22 | `withdrawpp` | withdrawpp | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true | `ucfbase.ucfbaseItf.ISubmitInfo.withdrawpp` |
| 23 | `ctTplId` | ctTplId | `ct_tpl_id` | String | `text` |  | true | `sale.aa.IContractTerms.ctTplId` |
| 24 | `ctTplCode` | ctTplCode | `ct_tpl_code` | String | `text` |  | true | `sale.aa.IContractTerms.ctTplCode` |
| 25 | `ctTplVersion` | ctTplVersion | `ct_tpl_version` | String | `text` |  | true | `sale.aa.IContractTerms.ctTplVersion` |
| 26 | `ctTplName` | ctTplName | `ct_tpl_name` | String | `text` |  | true | `sale.aa.IContractTerms.ctTplName` |
| 27 | `ctTermsData` | ctTermsData | `ctTermsData` | String | `text` |  | true | `sale.aa.IContractTerms.ctTermsData` |
| 28 | `signStatus` | 签署状态 | `sign_status` | Short | `short` |  | true | `sale.aa.IContractTerms.signStatus` |
| 29 | `ctSignId` | ctSignId | `ct_sign_id` | String | `text` |  | true | `sale.aa.IContractTerms.ctSignId` |
| 30 | `exchangeRateType` | exchangeRateType | `cExchangeRateTypeId` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |  | true | `voucher.order.OrderPrice.exchangeRateType` |
| 31 | `exchRate` | exchRate | `fExchangeRate` | Decimal | `number` |  | true | `voucher.order.OrderPrice.exchRate` |
| 32 | `sendSumMoney` | sendSumMoney | `fSendSumMoney` | Decimal | `number` |  | true | `voucher.order.OrderPrice.sendSumMoney` |
| 33 | `outBoundSumMoney` | outBoundSumMoney | `fOutBoundSumMoney` | Decimal | `number` |  | true | `voucher.order.OrderPrice.outBoundSumMoney` |
| 34 | `invoiceOriSum` | invoiceOriSum | `fInvoiceOriSum` | Decimal | `number` |  | true | `voucher.order.OrderPrice.invoiceOriSum` |
| 35 | `particularlyMoneyOrigTaxfree` | particularlyMoneyOrigTaxfree | `fParticularlyMoney_orig_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.particularlyMoneyOrigTaxfree` |
| 36 | `expenseOriSum` | expenseOriSum | `fExpenseOriSum` | Decimal | `number` |  | true | `voucher.order.OrderPrice.expenseOriSum` |
| 37 | `discountMoney` | 折扣金额 | `fDiscountMoney` | Decimal | `number` |  | true | `voucher.order.OrderPrice.discountMoney` |
| 38 | `totalOriTax` | totalOriTax | `fTotalOriTax` | Decimal | `number` |  | true | `voucher.order.OrderPrice.totalOriTax` |
| 39 | `totalMoneyOrigTaxfree` | totalMoneyOrigTaxfree | `fTotalMoney_orig_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.totalMoneyOrigTaxfree` |
| 40 | `payMoneyOrigTaxfree` | payMoneyOrigTaxfree | `fPayMoney_orig_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.payMoneyOrigTaxfree` |
| 41 | `realMoneyOrigTaxfree` | realMoneyOrigTaxfree | `fRealMoney_orig_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.realMoneyOrigTaxfree` |
| 42 | `promotionMoneyOrigTaxfree` | promotionMoneyOrigTaxfree | `fPromotionMoney_orig_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.promotionMoneyOrigTaxfree` |
| 43 | `rebateCashMoneyOrigTaxfree` | rebateCashMoneyOrigTaxfree | `fRebateCashMoney_orig_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.rebateCashMoneyOrigTaxfree` |
| 44 | `rebateMoneyOrigTaxfree` | rebateMoneyOrigTaxfree | `fRebateMoney_orig_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.rebateMoneyOrigTaxfree` |
| 45 | `pointsMoneyOrigTaxfree` | pointsMoneyOrigTaxfree | `fPointsMoney_orig_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.pointsMoneyOrigTaxfree` |
| 46 | `agentTaxItem` | agentTaxItem | `cTaxItems` | String | `text` |  | true | `voucher.order.OrderPrice.agentTaxItem` |
| 47 | `natCurrency` | natCurrency | `cDomesticPk` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | true | `voucher.order.OrderPrice.natCurrency` |
| 48 | `domesticName` | domesticName | `cDomesticName` | String | `text` |  | true | `voucher.order.OrderPrice.domesticName` |
| 49 | `domesticCode` | domesticCode | `cDomesticCode` | String | `text` |  | true | `voucher.order.OrderPrice.domesticCode` |
| 50 | `expenseNatSum` | expenseNatSum | `fExpenseNatSum` | Decimal | `number` |  | true | `voucher.order.OrderPrice.expenseNatSum` |
| 51 | `particularlyMoneyDomestic` | particularlyMoneyDomestic | `fParticularlyMoney_domestic` | Decimal | `number` |  | true | `voucher.order.OrderPrice.particularlyMoneyDomestic` |
| 52 | `particularlyMoneyDomesticTaxfree` | particularlyMoneyDomesticTaxfree | `fParticularlyMoney_domestic_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.particularlyMoneyDomesticTaxfree` |
| 53 | `payMoneyDomestic` | payMoneyDomestic | `fPayMoney_domestic` | Decimal | `number` |  | true | `voucher.order.OrderPrice.payMoneyDomestic` |
| 54 | `payMoneyDomesticTaxfree` | payMoneyDomesticTaxfree | `fPayMoney_domestic_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.payMoneyDomesticTaxfree` |
| 55 | `pointsMoneyDomestic` | pointsMoneyDomestic | `fPointsMoney_domestic` | Decimal | `number` |  | true | `voucher.order.OrderPrice.pointsMoneyDomestic` |
| 56 | `promotionMoneyDomestic` | promotionMoneyDomestic | `fPromotionMoney_domestic` | Decimal | `number` |  | true | `voucher.order.OrderPrice.promotionMoneyDomestic` |
| 57 | `promotionMoneyDomesticTaxfree` | promotionMoneyDomesticTaxfree | `fPromotionMoney_domestic_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.promotionMoneyDomesticTaxfree` |
| 58 | `realMoneyDomestic` | realMoneyDomestic | `fRealMoney_domestic` | Decimal | `number` |  | true | `voucher.order.OrderPrice.realMoneyDomestic` |
| 59 | `realMoneyDomesticTaxfree` | realMoneyDomesticTaxfree | `fRealMoney_domestic_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.realMoneyDomesticTaxfree` |
| 60 | `rebateCashMoneyDomestic` | rebateCashMoneyDomestic | `fRebateCashMoney_domestic` | Decimal | `number` |  | true | `voucher.order.OrderPrice.rebateCashMoneyDomestic` |
| 61 | `rebateCashMoneyDomesticTaxfree` | rebateCashMoneyDomesticTaxfree | `fRebateCashMoney_domestic_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.rebateCashMoneyDomesticTaxfree` |
| 62 | `rebateMoneyDomestic` | rebateMoneyDomestic | `fRebateMoney_domestic` | Decimal | `number` |  | true | `voucher.order.OrderPrice.rebateMoneyDomestic` |
| 63 | `rebateMoneyDomesticTaxfree` | rebateMoneyDomesticTaxfree | `fRebateMoney_domestic_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.rebateMoneyDomesticTaxfree` |
| 64 | `totalMoneyDomestic` | totalMoneyDomestic | `fTotalMoney_domestic` | Decimal | `number` |  | true | `voucher.order.OrderPrice.totalMoneyDomestic` |
| 65 | `totalMoneyDomesticTaxfree` | totalMoneyDomesticTaxfree | `fTotalMoney_domestic_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.totalMoneyDomesticTaxfree` |
| 66 | `totalNatTax` | totalNatTax | `fTotalNatTax` | Decimal | `number` |  | true | `voucher.order.OrderPrice.totalNatTax` |
| 67 | `reightMoneyOrigTaxfree` | reightMoneyOrigTaxfree | `fReightMoney_orig_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.reightMoneyOrigTaxfree` |
| 68 | `reightMoneyDomestic` | reightMoneyDomestic | `fReightMoney_domestic` | Decimal | `number` |  | true | `voucher.order.OrderPrice.reightMoneyDomestic` |
| 69 | `reightMoneyDomesticTaxfree` | reightMoneyDomesticTaxfree | `fReightMoney_domestic_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.reightMoneyDomesticTaxfree` |
| 70 | `uordercorp` | 公司(分区键) | `iCorpId` | Long | `long` |  | true | `base.itf.IUordercorp.uordercorp` |
| 71 | `taxInclusive` | taxInclusive | `bTaxInclusive` | Boolean | `switch` |  | true | `voucher.order.OrderPrice.taxInclusive` |
| 72 | `wholeDiscountRate` | wholeDiscountRate | `fWholeDiscountRate` | Decimal | `number` |  | true | `voucher.order.OrderPrice.wholeDiscountRate` |
| 73 | `discountAfterMoney` | discountAfterMoney | `fDiscountAfterMoney` | Decimal | `number` |  | true | `voucher.order.OrderPrice.discountAfterMoney` |
| 74 | `iDeleted` | 是否删除 | `iDeleted` | Short | `short` |  | true | `voucher.order.OrderPrice.iDeleted` |
| 75 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |  | true | `uorder.voucher.UorderBizObject.pubts` |
| 76 | `orderPayMoneyDomestic` | orderPayMoneyDomestic | `fOrderPayMoney_domestic` | Decimal | `number` |  | true | `voucher.order.OrderPrice.orderPayMoneyDomestic` |
| 77 | `orderPayMoneyDomesticTaxfree` | orderPayMoneyDomesticTaxfree | `fOrderPayMoney_domestic_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.orderPayMoneyDomesticTaxfree` |
| 78 | `orderRealMoneyOrigTaxfree` | orderRealMoneyOrigTaxfree | `fOrderRealMoney_orig_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.orderRealMoneyOrigTaxfree` |
| 79 | `orderPayMoneyOrigTaxfree` | orderPayMoneyOrigTaxfree | `fOrderPayMoney_orig_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.orderPayMoneyOrigTaxfree` |
| 80 | `orderRealMoneyDomestic` | orderRealMoneyDomestic | `fOrderRealMoney_domestic` | Decimal | `number` |  | true | `voucher.order.OrderPrice.orderRealMoneyDomestic` |
| 81 | `orderRealMoneyDomesticTaxfree` | orderRealMoneyDomesticTaxfree | `fOrderRealMoney_domestic_taxfree` | Decimal | `number` |  | true | `voucher.order.OrderPrice.orderRealMoneyDomesticTaxfree` |
| 82 | `compMatchExpand` | compMatchExpand | `comp_match_expand` | Integer | `int` |  | true | `voucher.order.OrderPrice.compMatchExpand` |
| 83 | `lockDate` | lockDate | `lock_date` | Date | `date` |  | true | `voucher.order.OrderPrice.lockDate` |
| 84 | `lockStatus` | lockStatus | `lock_status` | Integer | `int` |  | true | `voucher.order.OrderPrice.lockStatus` |
| 85 | `lockTime` | lockTime | `lock_time` | DateTime | `timestamp` |  | true | `voucher.order.OrderPrice.lockTime` |
| 86 | `lockerId` | lockerId | `locker_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true | `voucher.order.OrderPrice.lockerId` |

---

## 关联属性（共 10 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `exchangeRateType` | exchangeRateType | `bd.exchangeRate.ExchangeRateTypeVO` | `cExchangeRateTypeId` | 外键引用 |  |  | Service |  |
| 2 | `submitter` | submitter | `base.user.BipUser` | `submitter` | 外键引用 |  |  | Service |  |
| 3 | `natCurrency` | natCurrency | `bd.currencytenant.CurrencyTenantVO` | `cDomesticPk` | 外键引用 |  |  | Service |  |
| 4 | `withdrawpp` | withdrawpp | `base.user.BipUser` | `withdrawpp` | 外键引用 |  |  | Service |  |
| 5 | `orderId` | 订单ID | `voucher.order.Order` | `iorderId` | orderPrices → orderId | 1 | Y | None |  |
| 6 | `workTransferOwner` | workTransferOwner | `bd.staff.Staff` | `work_transfer_owner` | 外键引用 |  |  | Service |  |
| 7 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | `ytenant_id` | 外键引用 |  |  | Service |  |
| 8 | `lockerId` | lockerId | `base.user.User` | `locker_id` | 外键引用 |  |  | Service |  |
| 9 | `creatorId` | 创建人ID | `base.user.User` | `iSubmiterId` | 外键引用 |  |  | Service |  |
| 10 | `currency` | currency | `bd.currencytenant.CurrencyTenantVO` | `cOriginalPk` | 外键引用 |  |  | Service |  |

### Composition（子表）

- **订单ID**: `orderId` → `voucher.order.Order` | 1

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `exchangeRateType` (exchangeRateType) | `bd.exchangeRate.ExchangeRateTypeVO` | `cExchangeRateTypeId` |
| `submitter` (submitter) | `base.user.BipUser` | `submitter` |
| `natCurrency` (natCurrency) | `bd.currencytenant.CurrencyTenantVO` | `cDomesticPk` |
| `withdrawpp` (withdrawpp) | `base.user.BipUser` | `withdrawpp` |
| `workTransferOwner` (workTransferOwner) | `bd.staff.Staff` | `work_transfer_owner` |
| `ytenant` (租户) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `lockerId` (lockerId) | `base.user.User` | `locker_id` |
| `creatorId` (创建人ID) | `base.user.User` | `iSubmiterId` |
| `currency` (currency) | `bd.currencytenant.CurrencyTenantVO` | `cOriginalPk` |

---

## 使用示例

```sql
-- 查询 订单金额 数据
SELECT cOrderNo, iorderId, id, cOriginalPk, cOriginalName, cOriginalCode, ytenant_id, onetimeout_bound_closure, exchRateOps, iSubmiterId
FROM orders_price
WHERE orderId = ? -- 关联订单ID
```

### 通过 API 获取元数据

```bash
python bip_metadata_query.py voucher.order.OrderPrice
```
