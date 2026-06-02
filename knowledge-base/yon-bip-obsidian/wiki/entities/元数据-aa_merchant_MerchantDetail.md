---
tags: [BIP, 元数据, 数据字典, aa.merchant.MerchantDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户适用范围组详情 (`aa.merchant.MerchantDetail`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `merchant_detail` | 应用: `DPMCUS` | 类型: `Class`

## 属性（44 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `merchantId` | merchantID | `merchant_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 3 | `belongOrgId` | belongOrgID | `belong_org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 4 | `belongMerchantId` | belongMerchantID | `belong_merchant_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 5 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 6 | `searchCode` | search编码 | `search_code` | String | `text` |
| 7 | `merchantLevelId` | merchantLevelID | `merchant_level_id` | 40e121d8-8927-4bf1-ba4f-22a7b9f7b3b5 | `quote` |
| 8 | `merchantTypeId` | merchantTypeID | `merchant_type_id` | e62ca924-4399-44b2-99d7-f33fc5a5b9e9 | `quote` |
| 9 | `deliveryWarehouseId` | deliveryWarehouseID | `delivery_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 10 | `transactionCurrencyId` | transactionCurrencyID | `transaction_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 11 | `exchangeRateTypeId` | exchangeRateTypeID | `exchange_rate_type_Id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 12 | `taxRateId` | taxRateID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 13 | `payWay` | payWay | `pay_way` | Payway | `` |
| 14 | `creditServiceDayId` | creditServiceDayID | `credit_service_day_id` | Integer | `int` |
| 15 | `collectionAgreementId` | collectionAgreementID | `collection_agreement_id` | e336f779-f1e5-4530-b6d5-fa2e5ed1c302 | `quote` |
| 16 | `settlementMethodId` | settlementMethodID | `settlement_method_id` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 17 | `shipmentMethodId` | shipmentMethodID | `shipment_method_id` | aa2f6845-347d-499f-a5b2-964b84747d99 | `quote` |
| 18 | `priceMarking` | priceMarking | `cPriceMarking` | Integer | `int` |
| 19 | `signBack` | signBack | `sign_back` | Integer | `int` |
| 20 | `isTradeCustomers` | 是否TradeCustomers | `is_trade_customers` | String | `text` |
| 21 | `orgDefaultAddress` | orgDefaultAddress | `org_default_address` | String | `text` |
| 22 | `merchantApplyRangeDetailCharacter` | merchantApplyRangeDetailCharacter | `merchant_detail_character` | e2c1560c-f967-47af-8018-536256dd0ca7 | `UserDefine` |
| 23 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 24 | `layoffId` | layoffID | `layoff_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 25 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 26 | `frozenState` | frozenState | `frozen_state` | FrozenState | `` |
| 27 | `freezeLink` | freezeLink | `freeze_link` | String | `text` |
| 28 | `lockDate` | lockDate | `lock_Date` | Date | `date` |
| 29 | `lockTime` | lockTime | `lock_time` | DateTime | `timestamp` |
| 30 | `locker` | locker | `locker` | String | `text` |
| 31 | `isCreator` | 是否Creator | `is_creator` | Boolean | `switch` |
| 32 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 33 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 34 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 35 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 36 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 37 | `creator` | 创建人 | `creator` | String | `text` |
| 38 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 39 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 40 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 41 | `modifier` | 修改人 | `modifier` | String | `text` |
| 42 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 43 | `merchantApplyRangeGroupId` | merchantApplyRangeGroupID | `merchant_apply_range_group_id` | 4a4a8f0b-00a4-4375-84ee-5561c7f28c17 | `quote` |
| 44 | `merchantDetailForCrm` | merchantDetailForCrm | `` | 6972f9fb-67ad-4183-a43d-dbf1cd61cf10 | `` |

## 关联（20 个）

- `merchantTypeId` -> `aa.customertype.CustomerType` ()
- `shipmentMethodId` -> `aa.sendtrans.SendTransWay` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `belongOrgId` -> `bd.adminOrg.BaseOrgVO` ()
- `layoffId` -> `base.user.User` ()
- `merchantApplyRangeGroupId` -> `aa.merchant.MerchantApplyRangeGroup` ()
- `belongMerchantId` -> `bd.adminOrg.BaseOrgVO` ()
- `deliveryWarehouseId` -> `aa.warehouse.Warehouse` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `merchantApplyRangeDetailCharacter` -> `aa.merchant.MerchantApplyRangeDetailCharacter` ()
- `merchantLevelId` -> `aa.agentlevel.AgentLevel` ()
- `exchangeRateTypeId` -> `bd.exchangeRate.ExchangeRateTypeVO` ()
- `merchantId` -> `aa.merchant.Merchant` (0..n)
- `settlementMethodId` -> `aa.settlemethod.SettleMethod` ()
- `merchantDetailForCrm` -> `aa.merchant.MerchantDetailForCRM` (0..n)
- `collectionAgreementId` -> `bd.receivables.ReceiveAgreement` ()
- `taxRateId` -> `archive.taxArchives.TaxRateArchive` ()
- `transactionCurrencyId` -> `bd.currencytenant.CurrencyTenantVO` ()
- `tenant` -> `base.tenant.Tenant` ()
