---
tags: [BIP, 元数据, 数据字典, voucher.rebate.ProductRebate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 商品返利 (`voucher.rebate.ProductRebate`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `rebate` | 应用: `BBSMK` | 类型: `Class`

## 属性（98 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `agentId` | agentID | `iAgentId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 2 | `agentRelationId` | agentRelationID | `iAgentRelationId` | Long | `long` |
| 3 | `auditDate` | auditDate | `auditDate` | Date | `date` |
| 4 | `auditTime` | auditTime | `dConfirmDate` | Date | `date` |
| 5 | `auditor` | auditor | `auditor` | String | `text` |
| 6 | `auditorId` | auditorID | `iConfirmUserId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 7 | `bizId` | bizID | `iBizId` | Long | `long` |
| 8 | `bizName` | biz名称 | `cBizName` | String | `text` |
| 9 | `canUsable` | canUsable | `canUsable` | Boolean | `switch` |
| 10 | `sourceDetailId` | sourceDetailID | `cSourceDetailId` | Long | `long` |
| 11 | `paymentType` | paymentType | `paymentType` | Short | `short` |
| 12 | `messageType` | messageType | `messageType` | Short | `short` |
| 13 | `useRule` | useRule | `useRule` | Short | `short` |
| 14 | `sourceBillSettlementType` | sourceBillSettlementType | `sourceBillSettlementType` | Integer | `int` |
| 15 | `finalesponsibleOrgId` | finalesponsibleOrgID | `finalesponsibleOrgId` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 16 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 17 | `exchangeStatus` | exchangeStatus | `exchangeStatus` | Short | `short` |
| 18 | `failedInfo` | failedInfo | `failedInfo` | String | `text` |
| 19 | `closeDate` | closeDate | `dCloseDate` | Date | `date` |
| 20 | `closeTime` | closeTime | `dCloseTime` | DateTime | `timestamp` |
| 21 | `closer` | closer | `cCloser` | String | `text` |
| 22 | `closerId` | closerID | `iCloserId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 23 | `code` | 编码 | `cRebateNo` | String | `text` |
| 24 | `costCenterId` | costCenterID | `iCostCenterId` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 25 | `createDate` | 创建日期 | `dCreateDate` | Date | `date` |
| 26 | `createTime` | 创建时间 | `dCreatedTime` | DateTime | `timestamp` |
| 27 | `creator` | 创建人 | `cCreator` | String | `text` |
| 28 | `creatorId` | 创建人ID | `iSubmiterId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 29 | `domesticCode` | domestic编码 | `cDomesticCode` | String | `text` |
| 30 | `domesticName` | domestic名称 | `cDomesticName` | String | `text` |
| 31 | `domesticPk` | domesticPk | `cDomesticPk` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 32 | `exchangeRate` | exchangeRate | `fExchangeRate` | Decimal | `number` |
| 33 | `expenseItemId` | expenseItemID | `iExpenseItemId` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 34 | `rebateQuantity` | rebateQuantity | `fRebateQuantity` | Decimal | `number` |
| 35 | `expenseItemTypeId` | expenseItemTypeID | `iExpenseItemTypeId` | f21b5eab-a129-49f6-ae72-9f9a2f415134 | `quote` |
| 36 | `hasUsed` | hasUsed | `hasUsed` | Boolean | `switch` |
| 37 | `iDeleted` | iDeleted | `ideleted` | Short | `short` |
| 38 | `isPastDue` | 是否PastDue | `isPastDue` | Boolean | `switch` |
| 39 | `isWfControlled` | 是否WfControlled | `isWfControlled` | Boolean | `switch` |
| 40 | `isWiteList` | 是否WiteList | `isWiteList` | Boolean | `switch` |
| 41 | `marketingActiveId` | marketingActiveID | `iMarketingActiveId` | 924ae32c-2a09-4ec0-aff9-5959ec1f8024 | `quote` |
| 42 | `memo` | 备注 | `cMemo` | String | `text` |
| 43 | `modifier` | 修改人 | `cModifier` | String | `text` |
| 44 | `modifierId` | 修改人ID | `iModifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 45 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 46 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 47 | `orderNos` | orderNos | `cOrderNos` | String | `text` |
| 48 | `orderRebateMoney` | orderRebateMoney | `fOrderRebateMoney` | Decimal | `number` |
| 49 | `originalCode` | original编码 | `cOriginalCode` | String | `text` |
| 50 | `originalName` | original名称 | `cOriginalName` | String | `text` |
| 51 | `originalPk` | originalPk | `cOriginalPk` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 52 | `outSysKey` | outSysKey | `cOutSysKey` | String | `text` |
| 53 | `payType` | payType | `payType` | Integer | `int` |
| 54 | `paymentFinanceCode` | paymentFinance编码 | `cPaymentFinanceCode` | String | `text` |
| 55 | `paymentFinanceId` | paymentFinanceID | `iPaymentFinanceId` | Long | `long` |
| 56 | `platformLower` | platformLower | `isPlatformLower` | Boolean | `switch` |
| 57 | `shareUseRebate` | shareUseRebate | `shareUseRebate` | Boolean | `switch` |
| 58 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |
| 59 | `rebateCode` | rebate编码 | `cRebateCode` | String | `text` |
| 60 | `shareOrgRebate` | shareOrgRebate | `shareOrgRebate` | Boolean | `switch` |
| 61 | `rebateDefineCharacter` | rebateDefineCharacter | `rebateDefineCharacter` | 2d75fc13-abb3-4f12-b9af-2e4d644a52e5 | `UserDefine` |
| 62 | `rebateMoney` | rebateMoney | `fRebateMoney` | Decimal | `number` |
| 63 | `rebateMoneyDomestic` | rebateMoneyDomestic | `fRebateMoneyDomestic` | Decimal | `number` |
| 64 | `rebateRecord` | rebateRecord | `rebateRecord` | 13a2d42c-010e-4a6d-b984-153a9c212fad | `quote` |
| 65 | `rebateSourceId` | rebateSourceID | `iRebateSourceId` | Long | `long` |
| 66 | `rebateStatus` | rebateStatus | `cRebateStatus` | String | `text` |
| 67 | `returncount` | returncount | `returncount` | Short | `short` |
| 68 | `salesOrgId` | salesOrgID | `iSalesOrgId` | 4991976e-11ee-406e-bdbb-0f73f9f89ff2 | `quote` |
| 69 | `settlementOrgId` | settlementOrgID | `iSettlementOrgId` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |
| 70 | `settlementWayErpCode` | settlementWayErp编码 | `settlementWayErpCode` | String | `text` |
| 71 | `shareSettingId` | shareSettingID | `iShareSettingId` | 6353a3f1-4736-4c35-bc35-64ec2ea8bb7d | `quote` |
| 72 | `shop` | shop | `iShopID` | Long | `long` |
| 73 | `sourceNo` | sourceNo | `cSourceNo` | String | `text` |
| 74 | `sourceType` | sourceType | `iSourceType` | Short | `short` |
| 75 | `status` | 状态 | `status` | Short | `short` |
| 76 | `surplusMoney` | surplusMoney | `fSurplusMoney` | Decimal | `number` |
| 77 | `tplid` | tplid | `tplid` | Long | `long` |
| 78 | `uordercorp` | uordercorp | `iCorpId` | Long | `long` |
| 79 | `useType` | useType | `cUseType` | String | `text` |
| 80 | `useWayCode` | useWay编码 | `cUseWayCode` | String | `text` |
| 81 | `useWayName` | useWay名称 | `useWayName` | String | `text` |
| 82 | `usedMoney` | usedMoney | `usedMoney` | Decimal | `number` |
| 83 | `usmpPayModel` | usmpPayModel | `usmpPayModel` | Short | `short` |
| 84 | `valid` | valid | `canUsable` | Boolean | `switch` |
| 85 | `validEndDate` | validEndDate | `dValidEndDate` | Date | `date` |
| 86 | `validStartDate` | validStartDate | `dValidStartDate` | Date | `date` |
| 87 | `verifystate` | verifystate | `verifystate` | Short | `short` |
| 88 | `version` | 版本号 | `version` | Integer | `int` |
| 89 | `vouchdate` | vouchdate | `vouchdate` | Date | `date` |
| 90 | `voucherType` | voucherType | `cVoucherType` | String | `text` |
| 91 | `voucherTypeName` | voucherType名称 | `voucherTypeName` | String | `text` |
| 92 | `id` | ID | `id` | Long | `long` |
| 93 | `surplusQuantity` | surplusQuantity | `iSurplusQuantity` | Decimal | `number` |
| 94 | `WhiteProduct` | WhiteProduct | `` | baaaf685-d004-419f-a5fc-14d78e7e0ab3 | `` |
| 95 | `department` | department | `department` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 96 | `headItem` | headItem | `` | 8f8c2792-a67f-4535-9738-0ef6ef661156 | `` |
| 97 | `rebateReturnProductRecords` | rebateReturnProductRecords | `` | 18a0fb7c-4997-4818-b148-cd8b3a5ebb2c | `` |
| 98 | `rebateReturnProducts` | rebateReturnProducts | `` | 631cf218-f93d-48a9-8d02-7c2d4c520538 | `` |

## 关联（23 个）

- `WhiteProduct` -> `voucher.rebate.RebateWhiteProduct` (0..n)
- `expenseItemId` -> `bd.expenseitem.ExpenseItem` ()
- `rebateReturnProductRecords` -> `voucher.rebate.RebateReturnProductRecord` (0..n)
- `agentId` -> `aa.merchant.Merchant` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `rebateDefineCharacter` -> `voucher.rebate.ProductRebateDefineCharacter` ()
- `finalesponsibleOrgId` -> `org.func.BaseOrg` ()
- `headItem` -> `voucher.rebate.ProductRebateDefine` (1)
- `shareSettingId` -> `voucher.rebate.RebateShareSetting` ()
- `auditorId` -> `base.user.User` ()
- `costCenterId` -> `bd.costcenter.CostCenter` ()
- `closerId` -> `base.user.User` ()
- `settlementOrgId` -> `org.func.FinanceOrg` ()
- `domesticPk` -> `bd.currencytenant.CurrencyTenantVO` ()
- `marketingActiveId` -> `mka.activity.Activity` ()
- `originalPk` -> `bd.currencytenant.CurrencyTenantVO` ()
- `rebateReturnProducts` -> `voucher.rebate.RebateReturnProduct` (0..n)
- `department` -> `bd.adminOrg.AdminOrgVO` ()
- `expenseItemTypeId` -> `bd.expenseitem.ExpenseItemType` ()
- `rebateRecord` -> `voucher.rebate.RebateRecord` ()
- `salesOrgId` -> `org.func.SalesOrg` ()
