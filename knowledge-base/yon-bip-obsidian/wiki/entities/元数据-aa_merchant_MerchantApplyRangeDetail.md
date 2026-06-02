---
tags: [BIP, 元数据, 数据字典, aa.merchant.MerchantApplyRangeDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# (停用)客户适用范围详情 (`aa.merchant.MerchantApplyRangeDetail`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `merchantapplyrangedetail` | 应用: `DPMCUS` | 类型: `Class`

## 属性（57 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 2 | `merchantApplyRangeId` | merchantApplyRangeID | `merchantApplyRangeId` | c6b2ce53-9c17-45ca-b313-c775c94bc001 | `quote` |
| 3 | `merchantApplyRangeExtId` | merchantApplyRangeExtID | `merchantApplyRangeId` | b023ebd3-0f7f-4a9a-a28b-32183b1b8022 | `quote` |
| 4 | `belongOrg` | belongOrg | `cBelongOrg` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 5 | `belongMerchant` | belongMerchant | `cBelongMerchant` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 6 | `searchcode` | searchcode | `searchCode` | String | `text` |
| 7 | `customerLevel` | customerLevel | `oCustomerLevel_id` | 40e121d8-8927-4bf1-ba4f-22a7b9f7b3b5 | `quote` |
| 8 | `customerType` | customerType | `iCustomerTypeId` | e62ca924-4399-44b2-99d7-f33fc5a5b9e9 | `quote` |
| 9 | `deliveryWarehouse` | deliveryWarehouse | `cDeliveryWarehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 10 | `transactionCurrency` | transactionCurrency | `cTransactionCurrency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 11 | `exchangeratetype` | exchangeratetype | `cExchangeratetypeId` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 12 | `taxRate` | taxRate | `iTaxRate` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 13 | `payway` | payway | `cPayWay` | Payway | `` |
| 14 | `creditServiceDay` | creditServiceDay | `iCreditServiceDay` | Integer | `int` |
| 15 | `collectionAgreement` | collectionAgreement | `cCollectionAgreement` | e336f779-f1e5-4530-b6d5-fa2e5ed1c302 | `quote` |
| 16 | `settlementMethod` | settlementMethod | `cSettlementMethod` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 17 | `shipmentMethod` | shipmentMethod | `iShipmentMethodId` | aa2f6845-347d-499f-a5b2-964b84747d99 | `quote` |
| 18 | `priceMarking` | priceMarking | `cPriceMarking` | Integer | `int` |
| 19 | `signBack` | signBack | `bSignBack` | Boolean | `switch` |
| 20 | `isTradeCustomers` | 是否TradeCustomers | `is_trade_customers` | String | `text` |
| 21 | `orgDefaultAddress` | orgDefaultAddress | `orgdefaultaddress` | String | `text` |
| 22 | `merchantApplyRangeDetailCharacter` | merchantApplyRangeDetailCharacter | `merchant_detail_character` | e2c1560c-f967-47af-8018-536256dd0ca7 | `UserDefine` |
| 23 | `frozenState` | frozenState | `bfrozenstate` | FrozenState | `` |
| 24 | `freezingLink` | freezingLink | `cfreezinglink` | String | `text` |
| 25 | `customerArea` | customerArea | `oCustomerArea_id` | 75fb7b76-fdb5-4e87-ab0d-e4215a299634 | `quote` |
| 26 | `professSalesman` | professSalesman | `cProfessSalesman` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 27 | `specialManagementDep` | specialManagementDep | `cSpecialManagementDep` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 28 | `internationalTradeTerms` | internationalTradeTerms | `internationaltradeterms` | InternationalTradeTerms | `` |
| 29 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 30 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 31 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 32 | `layoffId` | layoffID | `layoff_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 33 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 34 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 35 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 36 | `creator` | 创建人 | `creator` | String | `text` |
| 37 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 38 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 39 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 40 | `modifier` | 修改人 | `modifier` | String | `text` |
| 41 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 42 | `lockDate` | lockDate | `lock_Date` | Date | `date` |
| 43 | `lockTime` | lockTime | `lock_time` | DateTime | `timestamp` |
| 44 | `locker` | locker | `locker` | String | `text` |
| 45 | `applyStatus` | applyStatus | `apply_status` | Integer | `int` |
| 46 | `applyTime` | applyTime | `apply_time` | DateTime | `timestamp` |
| 47 | `applyPerson` | applyPerson | `apply_person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 48 | `clue` | clue | `clueId` | Long | `long` |
| 49 | `recentFollower` | recentFollower | `recent_follower` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 50 | `recentFollowContent` | recentFollowContent | `recent_follow_content` | String | `text` |
| 51 | `sourceOfTheHighSeas` | sourceOfTheHighSeas | `sourceOfTheHighSeas` | Long | `long` |
| 52 | `highSeas` | highSeas | `highSeas` | Long | `long` |
| 53 | `logicallyDeleteType` | logicallyDeleteType | `logicallyDeleteType` | LogicallyDeleteType | `` |
| 54 | `deleteLog` | deleteLog | `deleteLog` | String | `text` |
| 55 | `yhtUserId` | yhtUserID | `cyhtUserId` | String | `text` |
| 56 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 57 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（25 个）

- `layoffId` -> `base.user.User` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `specialManagementDep` -> `bd.adminOrg.AdminOrgVO` ()
- `settlementMethod` -> `aa.settlemethod.SettleMethod` ()
- `merchantApplyRangeDetailCharacter` -> `aa.merchant.MerchantApplyRangeDetailCharacter` ()
- `shipmentMethod` -> `aa.sendtrans.SendTransWay` ()
- `customerType` -> `aa.customertype.CustomerType` ()
- `recentFollower` -> `bd.staff.Staff` ()
- `id` -> `aa.merchant.Merchant` (0..n)
- `tenant` -> `base.tenant.Tenant` ()
- `belongMerchant` -> `bd.adminOrg.BaseOrgVO` ()
- `transactionCurrency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `professSalesman` -> `bd.staff.Staff` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `merchantApplyRangeId` -> `aa.merchant.MerchantApplyRange` (1)
- `customerArea` -> `aa.salearea.SaleArea` ()
- `customerLevel` -> `aa.agentlevel.AgentLevel` ()
- `applyPerson` -> `bd.staff.Staff` ()
- `collectionAgreement` -> `bd.receivables.ReceiveAgreement` ()
- `taxRate` -> `archive.taxArchives.TaxRateArchive` ()
- `deliveryWarehouse` -> `aa.warehouse.Warehouse` ()
- `belongOrg` -> `bd.adminOrg.BaseOrgVO` ()
- `exchangeratetype` -> `bd.exchangeRate.ExchangeRateTypeVO` ()
- `merchantApplyRangeExtId` -> `aa.merchant.MerchantApplyRangeExt` (1)
