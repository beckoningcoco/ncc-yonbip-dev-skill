---
tags: [BIP, 元数据, 数据字典, voucher, voucher.rebate.Rebate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 返利 (`voucher.rebate.Rebate`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `rebate` | 应用: `BBSMK` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 返利 |
| 物理表 | `rebate` |
| 应用 | `BBSMK` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `cRebateNo` | |

## 部署信息

- 部署时间: 2026-05-23 00:59:58:000
- 安装来源: `/app/marketingbill/src/marketingbill-server/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-mkt-mkc2b/0010_iuap_common/DML/0270_iuap_metadata/20260515/001rebate/202604151039_metadata_voucher-rebate_delta.zip`

## 术语标记

`BusinessData`, `strictType`

## 依赖接口（8 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IUordercorp (`IUordercorp`) | `base.itf.IUordercorp` | 73 | 1 |
| IApprovalFlow (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| IAuto编码 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| IClosing (`IClosing`) | `base.itf.IClosing` | 164 | 4 |
| IAgentId (`IAgentId`) | `uorder.voucher.IAgentId` | 3 | 1 |
| IExchangeInfo (`IExchangeInfo`) | `gscm.itf.IExchangeInfo` | 4 | 2 |
| IYTenantExt (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |
| RebateShop(ID) (`iRebateShop`) | `voucher.rebate.iRebateShop` | 194 | 1 |

---

## 全部属性（93 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `bizId` | bizId | `iBizId` | Long | `long` |  | true |
| 2 | `bizName` | biz名称 | `cBizName` | String | `text` |  | true |
| 3 | `canUsable` | anUsable | `canUsable` | Boolean | `switch` |  | true |
| 4 | `closerId` | closerId | `iCloserId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 5 | `domesticCode` | domestic编码 | `cDomesticCode` | String | `text` |  | true |
| 6 | `domesticName` | domestic名称 | `cDomesticName` | String | `text` |  | true |
| 7 | `domesticPk` | omesticPk(日期) | `cDomesticPk` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | true |
| 8 | `exchangeRate` | 汇率 | `fExchangeRate` | Decimal | `number` |  | true |
| 9 | `hasUsed` | hasUsed | `hasUsed` | Boolean | `switch` |  | true |
| 10 | `iDeleted` | 是否删除 | `ideleted` | Short | `short` |  | true |
| 11 | `isPastDue` | 是否PastDue | `isPastDue` | Boolean | `switch` |  | true |
| 12 | `orderNos` | orderNos | `cOrderNos` | String | `text` |  | true |
| 13 | `orderRebateMoney` | orderRebateMoney | `fOrderRebateMoney` | Decimal | `number` |  | true |
| 14 | `originalCode` | original编码 | `cOriginalCode` | String | `text` |  | true |
| 15 | `originalName` | original名称 | `cOriginalName` | String | `text` |  | true |
| 16 | `outSysKey` | outSysKey | `cOutSysKey` | String | `text` |  | true |
| 17 | `payType` | payType(类型) | `payType` | Integer | `int` |  | true |
| 18 | `paymentFinanceCode` | paymentFinance编码 | `cPaymentFinanceCode` | String | `text` |  | true |
| 19 | `paymentFinanceId` | paymentFinanceId | `iPaymentFinanceId` | Long | `long` |  | true |
| 20 | `platformLower` | platformLower | `isPlatformLower` | Boolean | `switch` |  | true |
| 21 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |  | true |
| 22 | `rebateMoneyDomestic` | rebateMoneyDomestic | `fRebateMoneyDomestic` | Decimal | `number` |  | true |
| 23 | `rebateRecord` | rebateRecord | `rebateRecord` | 13a2d42c-010e-4a6d-b984-153a9c212fad | `quote` |  | true |
| 24 | `rebateStatus` | 返利状态 | `cRebateStatus` | String | `text` |  | true |
| 25 | `returncount` | returncount | `returncount` | Short | `short` |  | true |
| 26 | `settlementWayErpCode` | settlementWayErp编码 | `settlementWayErpCode` | String | `text` |  | true |
| 27 | `shareSettingId` | shareSettingId | `iShareSettingId` | 6353a3f1-4736-4c35-bc35-64ec2ea8bb7d | `quote` |  | true |
| 28 | `surplusMoney` | surplusMoney | `fSurplusMoney` | Decimal | `number` |  | true |
| 29 | `surplusQuantity` | surplusQuantity | `iSurplusQuantity` | Decimal | `number` |  | true |
| 30 | `tplid` | tplid | `tplid` | Long | `long` |  | true |
| 31 | `uordercorp` | uordercorp | `iCorpId` | Long | `long` |  | true |
| 32 | `useType` | useType(类型) | `cUseType` | String | `text` |  | true |
| 33 | `useWayName` | useWay名称 | `useWayName` | String | `text` |  | true |
| 34 | `usedMoney` | usedMoney | `usedMoney` | Decimal | `number` |  | true |
| 35 | `valid` | valid | `canUsable` | Boolean | `switch` |  | true |
| 36 | `version` | 版本号 | `version` | Integer | `int` |  | true |
| 37 | `voucherType` | voucherType(类型) | `cVoucherType` | String | `text` |  | true |
| 38 | `voucherTypeName` | voucherType名称 | `voucherTypeName` | String | `text` |  | true |
| 39 | `salesOrgId` | salesOrgId | `iSalesOrgId` | 4991976e-11ee-406e-bdbb-0f73f9f89ff2 | `quote` |  | true |
| 40 | `rebateCode` | 返利编码 | `cRebateCode` | String | `text` |  | true |
| 41 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 42 | `vouchdate` | vouchdate | `vouchdate` | Date | `date` | true | true |
| 43 | `agentId` | agentId | `iAgentId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true |
| 44 | `agentRelationId` | agentRelationId | `iAgentRelationId` | Long | `long` |  | true |
| 45 | `shop` | shop | `iShopID` | Long | `long` |  | true |
| 46 | `usmpPayModel` | usmpPayModel | `usmpPayModel` | Short | `short` |  | true |
| 47 | `settlementOrgId` | settlementOrgId | `iSettlementOrgId` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |  | true |
| 48 | `useWayCode` | useWay编码 | `cUseWayCode` | String | `text` |  | true |
| 49 | `sourceType` | sourceType(类型) | `iSourceType` | Short | `short` |  | true |
| 50 | `rebateSourceId` | rebateSourceId | `iRebateSourceId` | Long | `long` |  | true |
| 51 | `validStartDate` | validStartDate(日期) | `dValidStartDate` | Date | `date` |  | true |
| 52 | `validEndDate` | validEndDate(日期) | `dValidEndDate` | Date | `date` |  | true |
| 53 | `rebateMoney` | rebateMoney | `fRebateMoney` | Decimal | `number` |  | true |
| 54 | `originalPk` | originalPk | `cOriginalPk` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | true |
| 55 | `status` | 状态 | `status` | Short | `short` |  | true |
| 56 | `isWfControlled` | 是否WfControlled | `isWfControlled` | Boolean | `switch` |  | true |
| 57 | `verifystate` | verifystate | `verifystate` | Short | `short` |  | true |
| 58 | `isWiteList` | 是否WiteList | `isWiteList` | Boolean | `switch` |  | true |
| 59 | `costCenterId` | 成本中心 | `iCostCenterId` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |  | true |
| 60 | `expenseItemTypeId` | expenseItemTypeId | `iExpenseItemTypeId` | f21b5eab-a129-49f6-ae72-9f9a2f415134 | `quote` |  | true |
| 61 | `marketingActiveId` | marketingActiveId | `iMarketingActiveId` | 924ae32c-2a09-4ec0-aff9-5959ec1f8024 | `quote` | false | true |
| 62 | `expenseItemId` | expenseItemId | `iExpenseItemId` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |  | true |
| 63 | `code` | 编码 | `cRebateNo` | String | `text` |  | true |
| 64 | `memo` | 备注 | `cMemo` | String | `text` |  | true |
| 65 | `sourceNo` | sourceNo | `cSourceNo` | String | `text` |  | true |
| 66 | `creator` | 创建人 | `cCreator` | String | `text` |  | true |
| 67 | `createTime` | 创建时间 | `dCreatedTime` | DateTime | `timestamp` |  | true |
| 68 | `createDate` | 创建日期 | `dCreateDate` | Date | `date` |  | true |
| 69 | `creatorId` | 创建人ID | `iSubmiterId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 70 | `auditorId` | 审批人ID | `iConfirmUserId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 71 | `auditor` | 审批人 | `auditor` | String | `text` |  | true |
| 72 | `auditTime` | 审批时间 | `dConfirmDate` | Date | `date` |  | true |
| 73 | `auditDate` | 审批日期 | `auditDate` | Date | `date` |  | true |
| 74 | `modifierId` | 修改人ID | `iModifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 75 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 76 | `modifier` | 修改人 | `cModifier` | String | `text` |  | true |
| 77 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 78 | `closeDate` | closeDate(日期) | `dCloseDate` | Date | `date` |  | true |
| 79 | `closeTime` | closeTime(时间) | `dCloseTime` | DateTime | `timestamp` |  | true |
| 80 | `closer` | loser | `cCloser` | String | `text` |  | true |
| 81 | `department` | epartment(日期) | `department` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | true |
| 82 | `exchangeStatus` | exchangeStatus(状态) | `exchangeStatus` | Short | `short` |  | true |
| 83 | `failedInfo` | ailedInfo(金额) | `failedInfo` | String | `text` |  | true |
| 84 | `finalesponsibleOrgId` | finalesponsibleOrgId | `finalesponsibleOrgId` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | true |
| 85 | `messageType` | messageType(类型) | `messageType` | Short | `short` |  | true |
| 86 | `paymentType` | 付款类型 | `paymentType` | Short | `short` |  | true |
| 87 | `rebateQuantity` | rebateQuantity | `fRebateQuantity` | Decimal | `number` |  | true |
| 88 | `shareOrgRebate` | shareOrgRebate | `shareOrgRebate` | Boolean | `switch` |  | true |
| 89 | `shareUseRebate` | shareUseRebate | `shareUseRebate` | Boolean | `switch` |  | true |
| 90 | `sourceBillSettlementType` | sourceBillSettlementType(类型) | `sourceBillSettlementType` | Integer | `int` |  | true |
| 91 | `sourceDetailId` | sourceDetailId | `cSourceDetailId` | Long | `long` |  | true |
| 92 | `useRule` | useRule | `useRule` | Short | `short` |  | true |
| 93 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |

## 关联属性（18 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `expenseItemId` | expenseItemId | `bd.expenseitem.ExpenseItem` | `iExpenseItemId` | 外键 |  |  | Service |  |
| 2 | `agentId` | agentId | `aa.merchant.Merchant` | `iAgentId` | 外键 |  |  | Service |  |
| 3 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 4 | `creatorId` | 创建人ID | `base.user.User` | `iSubmiterId` | 外键 |  |  | Service |  |
| 5 | `modifierId` | 修改人ID | `base.user.User` | `iModifierId` | 外键 |  |  | Service |  |
| 6 | `finalesponsibleOrgId` | finalesponsibleOrgId | `org.func.BaseOrg` | `finalesponsibleOrgId` | 外键 |  |  | Service |  |
| 7 | `shareSettingId` | shareSettingId | `voucher.rebate.RebateShareSetting` | `iShareSettingId` | 外键 |  |  | None |  |
| 8 | `auditorId` | 审批人ID | `base.user.User` | `iConfirmUserId` | 外键 |  |  | Service |  |
| 9 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | `iCostCenterId` | 外键 |  |  | Service |  |
| 10 | `closerId` | closerId | `base.user.User` | `iCloserId` | 外键 |  |  | Service |  |
| 11 | `settlementOrgId` | settlementOrgId | `org.func.FinanceOrg` | `iSettlementOrgId` | 外键 |  |  | Service |  |
| 12 | `domesticPk` | omesticPk(日期) | `bd.currencytenant.CurrencyTenantVO` | `cDomesticPk` | 外键 |  |  | Service |  |
| 13 | `marketingActiveId` | marketingActiveId | `mka.activity.Activity` | `iMarketingActiveId` | 外键 |  |  | Service |  |
| 14 | `originalPk` | originalPk | `bd.currencytenant.CurrencyTenantVO` | `cOriginalPk` | 外键 |  |  | Service |  |
| 15 | `department` | epartment(日期) | `bd.adminOrg.AdminOrgVO` | `department` | 外键 |  |  | Service |  |
| 16 | `expenseItemTypeId` | expenseItemTypeId | `bd.expenseitem.ExpenseItemType` | `iExpenseItemTypeId` | 外键 |  |  | Service |  |
| 17 | `rebateRecord` | rebateRecord | `voucher.rebate.RebateRecord` | `rebateRecord` | 外键 |  |  | None |  |
| 18 | `salesOrgId` | salesOrgId | `org.func.SalesOrg` | `iSalesOrgId` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT iBizId, cBizName, canUsable, iCloserId, cDomesticCode, cDomesticName, cDomesticPk, fExchangeRate
FROM rebate
```