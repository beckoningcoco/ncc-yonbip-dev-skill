---
tags: [BIP, 元数据, 数据字典, aa.vendor.VendorExtend]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 供应商业务属性(管理组织) (`aa.vendor.VendorExtend`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_vendorextend_new` | 应用: `DPMSPL` | 类型: `Class`

## 属性（76 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `belongOrg` | belongOrg | `cBelongOrg` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 3 | `vendor` | vendor | `iVendorId` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 4 | `simplename` | simplename | `cSimpleName` | String | `multiLanguage` |
| 5 | `helpcode` | helpcode | `cHelpCode` | String | `text` |
| 6 | `invoicevendor` | invoicevendor | `iInvoiceVendorId` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 7 | `invoiceBizType` | invoiceBizType | `invoice_biz_type` | Short | `short` |
| 8 | `vendorExtendCharacterDefine` | vendorExtendCharacterDefine | `vendorExtendCharacterDefine` | 54e570e4-9ed9-4b61-9100-d333882349b5 | `UserDefine` |
| 9 | `financialSynergy` | financialSynergy | `financial_synergy` | Boolean | `switch` |
| 10 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 11 | `lifecycleStatus` | lifecycleStatus | `lifecycleStatus` | 5ffdc7d3-9e62-4b5f-8668-eb39ddd20dd5 | `quote` |
| 12 | `blackTime` | blackTime | `blackTime` | DateTime | `timestamp` |
| 13 | `cooperationLevel` | cooperationLevel | `cooperationLevel` | 5ffdc7d3-9e62-4b5f-8668-eb39ddd20dd5 | `quote` |
| 14 | `blackReason` | blackReason | `blackReason` | String | `text` |
| 15 | `org` | org | `org` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 16 | `priceTag` | priceTag | `price_tag` | String | `text` |
| 17 | `taxitems` | taxitems | `iTaxItem` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 18 | `taxrate` | taxrate | `fTaxRate` | Decimal | `number` |
| 19 | `paymentagreement` | paymentagreement | `iPaymentAgreementId` | 3cce8052-512e-4e51-9b6e-57adff40948c | `quote` |
| 20 | `paymentTerms` | paymentTerms | `paymentTerms` | f4c80a3e-e324-4009-a2ff-269d5099f7b0 | `quote` |
| 21 | `creditServiceDay` | creditServiceDay | `iCreditServiceDay` | Long | `long` |
| 22 | `exchangeratetype` | exchangeratetype | `cExchangeratetypeId` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 23 | `settlemethod` | settlemethod | `iSettleMethodId` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 24 | `currency` | currency | `iCurrencyId` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 25 | `currencyname` | currencyname | `cCurrencyName` | String | `text` |
| 26 | `transactionCurrency` | transactionCurrency | `transactionCurrency` | f4c80a3e-e324-4009-a2ff-269d5099f7b0 | `quote` |
| 27 | `department` | department | `iDepartmentId` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 | `quote` |
| 28 | `person` | person | `iPersonId` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 29 | `accountingStaff` | accountingStaff | `accountingStaff` | f4c80a3e-e324-4009-a2ff-269d5099f7b0 | `quote` |
| 30 | `shipvia` | shipvia | `iShipViaId` | aa2f6845-347d-499f-a5b2-964b84747d99 | `quote` |
| 31 | `deliveryvendor` | deliveryvendor | `iDeliveryVendorId` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 32 | `shipregion` | shipregion | `iShipregionId` | 373171f0-f497-4bab-bda7-ff4b6489c13e | `quote` |
| 33 | `remark` | remark | `cRemark` | String | `multiLanguage` |
| 34 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 35 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 36 | `creator` | 创建人 | `creator` | String | `text` |
| 37 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 38 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 39 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 40 | `modifier` | 修改人 | `modifier` | String | `text` |
| 41 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 42 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 43 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 44 | `internationalTradTerms` | internationalTradTerms | `internationalTradTerms` | f4c80a3e-e324-4009-a2ff-269d5099f7b0 | `quote` |
| 45 | `internationalTradTerms2` | internationalTradTerms2 | `internationalTradTerms2` | f4c80a3e-e324-4009-a2ff-269d5099f7b0 | `quote` |
| 46 | `paymentMethod` | paymentMethod | `paymentMethod` | f4c80a3e-e324-4009-a2ff-269d5099f7b0 | `quote` |
| 47 | `paymentMethod2` | paymentMethod2 | `paymentMethod2` | f4c80a3e-e324-4009-a2ff-269d5099f7b0 | `quote` |
| 48 | `paymentMethod3` | paymentMethod3 | `paymentMethod3` | f4c80a3e-e324-4009-a2ff-269d5099f7b0 | `quote` |
| 49 | `paymentMethod4` | paymentMethod4 | `paymentMethod4` | f4c80a3e-e324-4009-a2ff-269d5099f7b0 | `quote` |
| 50 | `paymentMethod5` | paymentMethod5 | `paymentMethod5` | f4c80a3e-e324-4009-a2ff-269d5099f7b0 | `quote` |
| 51 | `evaAbility` | evaAbility | `eva_ability_id` | Long | `long` |
| 52 | `evaAbilityName` | evaAbility名称 | `eva_ability_name` | String | `text` |
| 53 | `abilityDetial` | abilityDetial | `ability_detial_id` | Long | `long` |
| 54 | `abilityDetialName` | abilityDetial名称 | `ability_detial_name` | String | `text` |
| 55 | `evaScore` | evaScore | `eva_score` | Decimal | `number` |
| 56 | `abilityStatus` | abilityStatus | `ability_status` | Boolean | `switch` |
| 57 | `evaSourceBillid` | evaSourceBillid | `eva_source_billid` | Long | `long` |
| 58 | `evaSourceBillname` | evaSourceBillname | `eva_source_Billname` | String | `text` |
| 59 | `evaSourceType` | evaSourceType | `eva_source_type` | Short | `short` |
| 60 | `evaUpdateDate` | evaUpdateDate | `eva_update_date` | Date | `date` |
| 61 | `accessstatus` | accessstatus | `cAccessStatus` | Short | `short` |
| 62 | `freezeStep` | freezeStep | `freeze_step` | String | `text` |
| 63 | `freezestatus` | freezestatus | `bFreezeStatus` | Short | `short` |
| 64 | `purchaseFreezeMark` | purchaseFreezeMark | `purchaseFreezeMark` | Boolean | `switch` |
| 65 | `purchaseInterfaceFeedback` | purchaseInterfaceFeedback | `purchaseInterfaceFeedback` | String | `text` |
| 66 | `purchaseIsTransfer` | purchaseIsTransfer | `purchaseIsTransfer` | Boolean | `switch` |
| 67 | `receiptInvoiceVerification` | receiptInvoiceVerification | `receiptInvoiceVerification` | Boolean | `switch` |
| 68 | `serviceBillingVerification` | serviceBillingVerification | `serviceBillingVerification` | Boolean | `switch` |
| 69 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 70 | `customerFreezingSign` | customerFreezingSign | `customerFreezingSign` | Boolean | `switch` |
| 71 | `customerInterfaceFeedback` | customerInterfaceFeedback | `customerInterfaceFeedback` | String | `text` |
| 72 | `customerIsTransfer` | customerIsTransfer | `customerIsTransfer` | Boolean | `switch` |
| 73 | `belongMerchant` | belongMerchant | `cBelongMerchant` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 74 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 75 | `vendororg` | vendororg | `iVendorOrgId` | 884766bb-f155-42a2-93fd-2e90d1903c9a | `quote` |
| 76 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（33 个）

- `lifecycleStatus` -> `aa.supplyability.SupplyAbilityDetail` ()
- `cooperationLevel` -> `aa.supplyability.SupplyAbilityDetail` ()
- `settlemethod` -> `aa.settlemethod.SettleMethod` ()
- `internationalTradTerms` -> `bd.basedocdef.CustomerDocVO` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `accountingStaff` -> `bd.basedocdef.CustomerDocVO` ()
- `paymentMethod2` -> `bd.basedocdef.CustomerDocVO` ()
- `internationalTradTerms2` -> `bd.basedocdef.CustomerDocVO` ()
- `paymentMethod5` -> `bd.basedocdef.CustomerDocVO` ()
- `paymentMethod4` -> `bd.basedocdef.CustomerDocVO` ()
- `vendor` -> `aa.vendor.Vendor` (1)
- `paymentMethod3` -> `bd.basedocdef.CustomerDocVO` ()
- `shipregion` -> `base.shipregion.ShipRegion` ()
- `vendororg` -> `aa.vendor.VendorOrg` ()
- `currency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `invoicevendor` -> `aa.vendor.Vendor` ()
- `paymentagreement` -> `bd.payments.PayAgreement` ()
- `department` -> `aa.baseorg.DeptMV` ()
- `paymentTerms` -> `bd.basedocdef.CustomerDocVO` ()
- `tenant` -> `base.tenant.Tenant` ()
- `deliveryvendor` -> `aa.vendor.Vendor` ()
- `belongMerchant` -> `aa.merchant.Merchant` ()
- `transactionCurrency` -> `bd.basedocdef.CustomerDocVO` ()
- `org` -> `bd.adminOrg.BaseOrgVO` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `shipvia` -> `aa.sendtrans.SendTransWay` ()
- `vendorExtendCharacterDefine` -> `aa.vendor.VendorExtendCharacterDefine` ()
- `person` -> `bd.staff.StaffNew` ()
- `belongOrg` -> `bd.adminOrg.BaseOrgVO` ()
- `paymentMethod` -> `bd.basedocdef.CustomerDocVO` ()
- `exchangeratetype` -> `bd.exchangeRate.ExchangeRateTypeVO` ()
- `taxitems` -> `archive.taxArchives.TaxRateArchive` ()
