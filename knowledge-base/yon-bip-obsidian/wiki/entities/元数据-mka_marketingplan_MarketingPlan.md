---
tags: [BIP, 元数据, 数据字典, mka.marketingplan.MarketingPlan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 营销方案 (`mka.marketingplan.MarketingPlan`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mka_marketing_plan` | 应用: `MKA` | 类型: `Class`

## 属性（85 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `calculationMethod` | calculationMethod | `calculation_method` | Short | `short` |
| 2 | `integralBasis` | integralBasis | `integral_basis` | Short | `short` |
| 3 | `auditorId` | auditorID | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 4 | `dept` | dept | `dept` | ca871996-b447-42f9-8dac-dd7c21ee0662 | `quote` |
| 5 | `org` | org | `org` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 6 | `parent` | parent | `parent_id` | Long | `long` |
| 7 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 8 | `planDefineCharacter` | planDefineCharacter | `planDefineCharacter` | 52fc5de6-887f-4440-9d0b-0e5a1c766b11 | `UserDefine` |
| 9 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 10 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 11 | `bustype` | bustype | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 12 | `code` | 编码 | `code` | String | `text` |
| 13 | `materialApplyDate` | materialApplyDate | `materialapply_date` | DateTime | `timestamp` |
| 14 | `marketingTheme` | marketingTheme | `marketing_theme` | String | `text` |
| 15 | `beginDate` | beginDate | `begin_date` | DateTime | `timestamp` |
| 16 | `versionNo` | versionNo | `version_no` | String | `text` |
| 17 | `endDate` | endDate | `end_date` | DateTime | `timestamp` |
| 18 | `peopleNum` | peopleNum | `people_num` | Integer | `int` |
| 19 | `salesNum` | salesNum | `sales_num` | Decimal | `number` |
| 20 | `totalFee` | totalFee | `total_fee` | Decimal | `number` |
| 21 | `commitmentAmount` | commitmentAmount | `commitmentAmount` | Decimal | `number` |
| 22 | `expectPercent` | expectPercent | `expect_percent` | Decimal | `number` |
| 23 | `supplyCustomer` | supplyCustomer | `supply_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 24 | `nextOccupyAmount` | nextOccupyAmount | `nextOccupyAmount` | Decimal | `number` |
| 25 | `nextSettleAmount` | nextSettleAmount | `nextSettleAmount` | Decimal | `number` |
| 26 | `SettleAmount` | SettleAmount | `SettleAmount` | Decimal | `number` |
| 27 | `expectPlace` | expectPlace | `expect_place` | Integer | `int` |
| 28 | `isBudgetOver` | 是否BudgetOver | `isBudgetOver` | Boolean | `switch` |
| 29 | `realityPlace` | realityPlace | `reality_place` | Integer | `int` |
| 30 | `isApply` | 是否Apply | `is_apply` | Short | `short` |
| 31 | `dueDate` | dueDate | `due_date` | DateTime | `timestamp` |
| 32 | `closingDate` | closingDate | `closingDate` | DateTime | `timestamp` |
| 33 | `marketingContent` | marketingContent | `marketing_content` | String | `text` |
| 34 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 35 | `customer` | customer | `customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 36 | `isUnifiedPromotion` | 是否UnifiedPromotion | `isUnifiedPromotion` | Short | `short` |
| 37 | `closeStateNum` | closeStateNum | `closeStateNum` | Integer | `int` |
| 38 | `ower` | ower | `ower` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 39 | `settleStateNum` | settleStateNum | `settleStateNum` | Integer | `int` |
| 40 | `saleArea` | saleArea | `salearea` | 75fb7b76-fdb5-4e87-ab0d-e4215a299634 | `quote` |
| 41 | `defaultOrg` | defaultOrg | `defaultOrg` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 42 | `cashMethod` | cashMethod | `cashMethod` | Short | `singleOption` |
| 43 | `defaultDept` | defaultDept | `defaultDept` | ca871996-b447-42f9-8dac-dd7c21ee0662 | `quote` |
| 44 | `applyTime` | applyTime | `apply_time` | DateTime | `timestamp` |
| 45 | `verifystate` | verifystate | `verifystate` | Short | `short` |
| 46 | `auditor` | auditor | `auditor` | String | `text` |
| 47 | `auditDate` | auditDate | `audit_date` | Date | `date` |
| 48 | `auditTime` | auditTime | `audit_time` | DateTime | `timestamp` |
| 49 | `settleState` | settleState | `settle_state` | String | `text` |
| 50 | `settleTime` | settleTime | `settle_time` | DateTime | `timestamp` |
| 51 | `autoClosingRule` | autoClosingRule | `autoClosingRule` | AutoClosingRuleEnum | `singleOption` |
| 52 | `parentId` | 上级ID | `parent_id` | 3defa5fd-999d-4eac-8798-9008f68c8758 | `quote` |
| 53 | `path` | path | `path` | String | `text` |
| 54 | `issuedStatus` | 是否suedStatus | `issued_status` | Short | `short` |
| 55 | `creator` | 创建人 | `creator` | String | `text` |
| 56 | `bizFlow` | bizFlow | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |
| 57 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 58 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 59 | `modifier` | 修改人 | `modifier` | String | `text` |
| 60 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 61 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 62 | `isWfControlled` | 是否WfControlled | `isWfControlled` | Boolean | `switch` |
| 63 | `returncount` | returncount | `returncount` | Short | `short` |
| 64 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 65 | `id` | ID | `id` | Long | `long` |
| 66 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 67 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 68 | `level` | 层级 | `level` | Integer | `int` |
| 69 | `sortNum` | sortNum | `sort_num` | Integer | `int` |
| 70 | `isEnd` | 是否End | `isEnd` | Integer | `int` |
| 71 | `productLine` | productLine | `productLine` | fcdf5213-a995-4874-928f-ff97bcfa4b91 | `quote` |
| 72 | `isFlowCoreBill` | 是否FlowCoreBill | `isFlowCoreBill` | Boolean | `switch` |
| 73 | `openingScheme` | openingScheme | `opening_scheme` | Short | `short` |
| 74 | `estimateSaleSum` | estimateSaleSum | `estimateSaleSum` | Decimal | `number` |
| 75 | `costCenter` | costCenter | `costCenter` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 76 | `profitCenter` | profitCenter | `profitCenter` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | `quote` |
| 77 | `hasIntegRule` | hasIntegRule | `hasIntegRule` | Integer | `int` |
| 78 | `estimateCostList` | estimateCostList | `` | bc854c2f-71eb-4157-ac77-bc3fe9868baf | `` |
| 79 | `headDef` | headDef | `` | 3b99b6d9-462d-4ace-a65e-22bafb0a9313 | `` |
| 80 | `integralRule` | integralRule | `` | 2a49725a-0823-4c51-b907-1ad8d85ff8ec | `` |
| 81 | `marketingPlanParticipantList` | marketingPlanParticipantList | `` | 5ee6dae2-cae6-470c-ab1b-8de6d1a6b9e6 | `` |
| 82 | `partakeScopeConditionList` | partakeScopeConditionList | `` | dcce37ef-7ddd-4225-9690-a9b834555114 | `` |
| 83 | `productScopeConditionList` | productScopeConditionList | `` | 3783070a-623f-4aba-9224-91266ba15e92 | `` |
| 84 | `unjoinCustomerList` | unjoinCustomerList | `` | 082561d3-7520-4f24-b4bb-9c368c8c8464 | `` |
| 85 | `unjoinProductList` | unjoinProductList | `` | a6740419-9159-4e66-b7fd-3c5339291ef5 | `` |

## 关联（29 个）

- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `bizFlow` -> `bf.bizflow.BusinessFlow` ()
- `defaultDept` -> `bd.adminOrg.DeptOrgVO` ()
- `profitCenter` -> `bd.virtualaccbody.VirtualAccbody_view` ()
- `unjoinProductList` -> `mka.marketingplan.UnjoinProduct` (0..n)
- `defaultOrg` -> `org.func.BaseOrg` ()
- `productLine` -> `pc.productline.ProductLine` ()
- `unjoinCustomerList` -> `mka.marketingplan.UnjoinCustomer` (0..n)
- `currency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `tenant` -> `base.tenant.Tenant` ()
- `productScopeConditionList` -> `mka.marketingplan.ProductScopeCondition` (0..n)
- `estimateCostList` -> `mka.marketingplan.EstimateCost` (0..n)
- `ower` -> `bd.staff.Staff` ()
- `planDefineCharacter` -> `mka.marketingplan.MarketingPlanDefineCharacter` ()
- `headDef` -> `mka.marketingplan.MarketingPlanDef` (1)
- `org` -> `org.func.BaseOrg` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `costCenter` -> `bd.costcenter.CostCenter` ()
- `saleArea` -> `aa.salearea.SaleArea` ()
- `dept` -> `bd.adminOrg.DeptOrgVO` ()
- `bustype` -> `bd.bill.TransType` ()
- `parentId` -> `mka.marketingplan.MarketingPlan` ()
- `integralRule` -> `mka.marketingplan.IntegralRule` (0..n)
- `partakeScopeConditionList` -> `mka.marketingplan.PartakeScopeCondition` (0..n)
- `auditorId` -> `base.user.User` ()
- `supplyCustomer` -> `aa.merchant.Merchant` ()
- `marketingPlanParticipantList` -> `mka.marketingplan.MarketingPlanParticipant` (0..n)
- `customer` -> `aa.merchant.Merchant` ()
