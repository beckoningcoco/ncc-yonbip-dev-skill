---
tags: [BIP, 元数据, 数据字典, mka.activity.ActivityInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 营销活动活动费用 (`mka.activity.ActivityInfo`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mka_activity_info` | 应用: `MKA` | 类型: `Class`

## 属性（72 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `allowOverage` | allowOverage | `allowOverage` | Boolean | `switch` |
| 2 | `amountsIncurred` | amountsIncurred | `amountsIncurred` | Decimal | `number` |
| 3 | `activityInfoDefineCharacter` | activityInfoDefineCharacter | `activityInfoDefineCharacter` | dd8d10d3-a350-43c7-a9a9-262e5726fbd5 | `UserDefine` |
| 4 | `advanceCustomer` | advanceCustomer | `advanceCustomer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 5 | `advancePayMode` | advancePayMode | `advancePayMode` | String | `singleOption` |
| 6 | `source` | source | `source` | String | `text` |
| 7 | `isReplenishGoods` | 是否ReplenishGoods | `is_replenish_goods` | Boolean | `switch` |
| 8 | `bankAccountCustomer` | bankAccountCustomer | `bank_account_cust` | 60cc421e-5605-475b-a829-02fd75c0b189 | `quote` |
| 9 | `allowSettle` | allowSettle | `allow_settle` | Boolean | `switch` |
| 10 | `settleStatus` | settleStatus | `settle_status` | Short | `short` |
| 11 | `sourceid` | sourceid | `sourceid` | Long | `long` |
| 12 | `sourceautoid` | sourceautoid | `sourceautoid` | Long | `long` |
| 13 | `upcode` | upcode | `upcode` | String | `text` |
| 14 | `makeRuleCode` | makeRule编码 | `makerule_code` | String | `text` |
| 15 | `sourceMainPubts` | sourceMainPubts | `sourceMainPubts` | DateTime | `timestamp` |
| 16 | `groupTaskKey` | groupTaskKey | `groupTaskKey` | String | `text` |
| 17 | `advanceSettledAmount` | advanceSettledAmount | `advanceSettledAmount` | Decimal | `number` |
| 18 | `bNeedSettle` | bNeedSettle | `bNeedSettle` | Boolean | `switch` |
| 19 | `activityPlanCost` | activityPlanCost | `activity_plan_cost` | 79306112-3428-443d-9f29-c82391f812fc | `quote` |
| 20 | `productDefineCharacter` | productDefineCharacter | `productDefineCharacter` | 605799f4-0df2-4bae-91b0-4cdb20fe3285 | `FreeCT` |
| 21 | `materialClass` | materialClass | `materialClass` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |
| 22 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 23 | `businessPeriod` | businessPeriod | `businessPeriod` | 420990f0-03d4-400a-b15f-bda5ebf94edf | `quote` |
| 24 | `assumeCustomer` | assumeCustomer | `assumeCustomer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 25 | `attachmentId` | 附件ID | `attachmentId` | String | `text` |
| 26 | `bankAccountPerson` | bankAccountPerson | `bankAccountPerson` | e1db328d-c25b-49de-8aad-33400dc10e4b | `quote` |
| 27 | `bankAccountVendor` | bankAccountVendor | `bankAccountVendor` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c | `quote` |
| 28 | `consultExpenseAmount` | consultExpenseAmount | `consultExpenseAmount` | Decimal | `number` |
| 29 | `consultExpenseRate` | consultExpenseRate | `consultExpenseRate` | Decimal | `number` |
| 30 | `consultSaleAmount` | consultSaleAmount | `consultSaleAmount` | Decimal | `number` |
| 31 | `isSettleComplated` | 是否SettleComplated | `isSettleComplated` | Boolean | `switch` |
| 32 | `standardExpenseRate` | standardExpenseRate | `standardExpenseRate` | Decimal | `number` |
| 33 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 34 | `id` | ID | `id` | Long | `long` |
| 35 | `activityId` | activityID | `activityId` | 924ae32c-2a09-4ec0-aff9-5959ec1f8024 | `quote` |
| 36 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 37 | `lineNo` | lineNo | `lineNo` | Decimal | `number` |
| 38 | `dimension_terminal` | dimension_terminal | `dimension_terminal` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |
| 39 | `dimension_customer` | dimension_customer | `dimension_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 40 | `dimension_region` | dimension_region | `dimension_region` | 75fb7b76-fdb5-4e87-ab0d-e4215a299634 | `quote` |
| 41 | `dimension_terminal_chain` | dimension_terminal_chain | `dimension_terminal_chain` | ba7bad3b-8619-4d8c-8659-5d1bf82cc9f9 | `quote` |
| 42 | `dimension_expense_item` | dimension_expense_item | `dimension_expense_item` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 43 | `dimension_expense_itemType` | dimension_expense_itemType | `dimension_expense_itemType` | f21b5eab-a129-49f6-ae72-9f9a2f415134 | `quote` |
| 44 | `product` | product | `product` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 45 | `productClass` | productClass | `productClass` | 5ad8fc93-4e6b-409f-a70f-462efa6fcee9 | `quote` |
| 46 | `unit` | unit | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 47 | `unitInvest` | unitInvest | `unitInvest` | Decimal | `number` |
| 48 | `quality` | quality | `quality` | Decimal | `number` |
| 49 | `applyAmount` | applyAmount | `applyAmount` | Decimal | `number` |
| 50 | `approveAmount` | approveAmount | `approveAmount` | Decimal | `number` |
| 51 | `settlementType` | settlementType | `settlementType` | CustomerTypeEnum | `singleOption` |
| 52 | `settle_customer` | settle_customer | `settle_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 53 | `settle_vendor` | settle_vendor | `settle_vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 54 | `settle_person` | settle_person | `settle_person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 55 | `bankAccount` | bankAccount | `bankAccount` | String | `text` |
| 56 | `bankType` | bankType | `bankType` | b7ee7189-ed97-48d5-91e4-808228664429 | `quote` |
| 57 | `assumeOrg` | assumeOrg | `assumeOrg` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 58 | `asumeDept` | asumeDept | `asumeDept` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 59 | `assumeRate` | assumeRate | `assumeRate` | Decimal | `number` |
| 60 | `assumeAmount` | assumeAmount | `assumeAmount` | Decimal | `number` |
| 61 | `settledAmount` | settledAmount | `settledAmount` | Decimal | `number` |
| 62 | `freezeAmount` | freezeAmount | `freezeAmount` | Decimal | `number` |
| 63 | `payMode` | payMode | `payMode` | String | `singleOption` |
| 64 | `productLine` | productLine | `productLine` | fcdf5213-a995-4874-928f-ff97bcfa4b91 | `quote` |
| 65 | `expectedSaleAmount` | expectedSaleAmount | `expectedSaleAmount` | Decimal | `number` |
| 66 | `expectedExpenseRate` | expectedExpenseRate | `expectedExpenseRate` | Decimal | `number` |
| 67 | `isRejected` | 是否Rejected | `isRejected` | Boolean | `switch` |
| 68 | `rejectReason` | rejectReason | `rejectReason` | String | `text` |
| 69 | `planExpenseInfo` | planExpenseInfo | `planExpenseInfo` | bc854c2f-71eb-4157-ac77-bc3fe9868baf | `quote` |
| 70 | `planExpenseInfo_lineNo` | planExpenseInfo_lineNo | `planExpenseInfo_lineNo` | String | `text` |
| 71 | `activityInfoProperty` | activityInfoProperty | `` | defeaf94-8167-4d58-bb2e-0acd7332b36c | `` |
| 72 | `freeDefine` | freeDefine | `` | 4ff9ac6d-35e1-4b9e-96a9-938dec7d0fd7 | `` |

## 关联（32 个）

- `dimension_region` -> `aa.salearea.SaleArea` ()
- `planExpenseInfo` -> `mka.marketingplan.EstimateCost` ()
- `dimension_expense_item` -> `bd.expenseitem.ExpenseItem` ()
- `assumeOrg` -> `org.func.BaseOrg` ()
- `dimension_customer` -> `aa.merchant.Merchant` ()
- `productLine` -> `pc.productline.ProductLine` ()
- `activityId` -> `mka.activity.Activity` (0..n)
- `assumeCustomer` -> `aa.merchant.Merchant` ()
- `activityInfoDefineCharacter` -> `mka.activity.ActivityInfoDefineCharacter` ()
- `activityPlanCost` -> `mka.activityplan.ActivityPlanCost` ()
- `tenant` -> `base.tenant.Tenant` ()
- `bankAccountVendor` -> `aa.vendor.VendorBank` ()
- `advanceCustomer` -> `aa.merchant.Merchant` ()
- `materialClass` -> `pc.cls.ManagementClass` ()
- `product` -> `pc.product.Product` ()
- `settle_vendor` -> `aa.vendor.Vendor` ()
- `productClass` -> `pc.cls.PresentationClass` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `bankType` -> `bd.bank.BankVO` ()
- `productDefineCharacter` -> `mka.activity.ActivityFeeProductDefineCharacter` ()
- `settle_person` -> `bd.staff.Staff` ()
- `bankAccountPerson` -> `bd.staff.StaffBankAcct` ()
- `businessPeriod` -> `bd.business.BusinessPeriodVO` ()
- `unit` -> `pc.unit.Unit` ()
- `freeDefine` -> `mka.activity.ActivityInfoFreeDefine` (1)
- `dimension_expense_itemType` -> `bd.expenseitem.ExpenseItemType` ()
- `settle_customer` -> `aa.merchant.Merchant` ()
- `dimension_terminal_chain` -> `aa.store.ChainSystem` ()
- `dimension_terminal` -> `aa.store.Store` ()
- `bankAccountCustomer` -> `aa.merchant.AgentFinancial` ()
- `activityInfoProperty` -> `mka.activity.ActivityInfoProperty` (1)
- `asumeDept` -> `bd.adminOrg.AdminOrgVO` ()
