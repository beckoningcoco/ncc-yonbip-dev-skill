---
tags: [BIP, 元数据, 数据字典, mka, mka.activity.Activity]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 营销活动 (`mka.activity.Activity`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mka_activity` | 应用: `MKA`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 全部属性（95 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `activityPoints` | activityPoints | `activity_points` | Decimal | `number` |  | true |
| 2 | `integralCriterion` | integralCriterion | `integral_criterion` | Decimal | `number` |  | true |
| 3 | `partnerPerson` | partnerPerson | `partner_person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true |
| 4 | `amountsIncurred` | amountsIncurred | `amountsIncurred` | Decimal | `number` |  | true |
| 5 | `versionNo` | versionNo | `version_no` | String | `text` |  | true |
| 6 | `activityDefineCharacter` | activityDefineCharacter | `activityDefineCharacter` | 88238235-109e-4880-8548-0285b4fe4c48 | `UserDefine` |  | true |
| 7 | `applyTime` | applyTime | `apply_time` | DateTime | `timestamp` |  | true |
| 8 | `auditDate` | auditDate | `audit_date` | Date | `date` |  | true |
| 9 | `closeReason` | closeReason | `close_reason` | b6eaed9b-5240-4fdb-aefe-e90f68a20f9f | `quote` |  | true |
| 10 | `closeStatement` | closeStatement | `close_statement` | String | `text` |  | true |
| 11 | `pcUrl` | pcUrl | `pc_url` | String | `text` |  | true |
| 12 | `couponStandard` | couponStandard | `coupon_standard` | String | `text` |  | true |
| 13 | `peopleNum` | peopleNum | `people_num` | Integer | `int` |  | true |
| 14 | `waitSettleAmount` | waitSettleAmount | `waitSettleAmount` | Decimal | `number` |  | true |
| 15 | `synClaimMaterial` | synClaimMaterial | `syn_claim_material` | Boolean | `switch` |  | true |
| 16 | `activityPlanInfo` | activityPlanInfo | `activity_plan_info` | a1e91e79-31c7-4d4e-a357-3dbc69523da1 | `quote` |  | true |
| 17 | `isBudgetOver` | 是否BudgetOver | `isBudgetOver` | Boolean | `switch` |  | true |
| 18 | `activityPlan` | activityPlan | `activity_plan` | ac48ac5e-aab9-45c7-b50b-3f0938ca8ded | `quote` |  | true |
| 19 | `mobileUrl` | mobileUrl | `mobile_url` | String | `text` |  | true |
| 20 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |
| 21 | `rewardCoupon` | rewardCoupon | `reward_coupon` | String | `text` |  | true |
| 22 | `realityNum` | realityNum | `reality_num` | Integer | `int` |  | true |
| 23 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 24 | `cust` | cust | `iCustID` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true |
| 25 | `defaultAssumeOrg` | defaultAssumeOrg | `defaultAssumeOrg` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | true |
| 26 | `defaultAsumeDept` | defaultAsumeDept | `defaultAsumeDept` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | true |
| 27 | `defaultDimension_region` | defaultDimension_region | `defaultDimension_region` | 75fb7b76-fdb5-4e87-ab0d-e4215a299634 | `quote` |  | true |
| 28 | `defaultDimension_terminal_chain` | defaultDimension_terminal_chain | `defaultDimension_terminal_chain` | ba7bad3b-8619-4d8c-8659-5d1bf82cc9f9 | `quote` |  | true |
| 29 | `freezeAmountTotal` | freezeAmountTotal | `freezeAmountTotal` | Decimal | `number` |  | true |
| 30 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 31 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 32 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 33 | `materialApplyDate` | materialApplyDate | `materialapply_date` | DateTime | `timestamp` |  | true |
| 34 | `org` | org | `org` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | true |
| 35 | `marketingPlan` | marketingPlan | `marketing_plan` | 3defa5fd-999d-4eac-8798-9008f68c8758 | `quote` |  | true |
| 36 | `path` | path | `path` | String | `text` |  | true |
| 37 | `code` | 编码 | `code` | String | `text` |  | true |
| 38 | `bustype` | bustype | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` | false | true |
| 39 | `theme` | theme | `theme` | String | `text` |  | true |
| 40 | `startDate` | startDate | `start_date` | DateTime | `timestamp` |  | true |
| 41 | `endDate` | endDate | `end_date` | DateTime | `timestamp` |  | true |
| 42 | `terminal` | terminal | `terminal` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |  | true |
| 43 | `customer` | customer | `customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true |
| 44 | `productLine` | productLine | `product_line` | fcdf5213-a995-4874-928f-ff97bcfa4b91 | `quote` |  | true |
| 45 | `supplyCustomer` | supplyCustomer | `supply_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true |
| 46 | `country` | country | `cCountry` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |  | true |
| 47 | `regionCode` | 区域编码 | `cRegionCode` | String | `text` |  | true |
| 48 | `longitude` | longitude | `iLNG` | Decimal | `number` |  | true |
| 49 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 50 | `latitude` | latitude | `iLAT` | Decimal | `number` |  | true |
| 51 | `address` | address | `address` | String | `text` |  | true |
| 52 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | true |
| 53 | `applyAmountTotal` | applyAmountTotal | `applyAmountTotal` | Decimal | `number` |  | true |
| 54 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 55 | `expectedSaleAmountTotal` | expectedSaleAmountTotal | `expectedSaleAmountTotal` | Decimal | `number` |  | true |
| 56 | `expectFee` | expectFee | `expect_fee` | Decimal | `number` |  | true |
| 57 | `expectSales` | expectSales | `expect_sales` | Decimal | `number` |  | true |
| 58 | `expectedExpenseRate` | expectedExpenseRate | `expectedExpenseRate` | Decimal | `number` |  | true |
| 59 | `expectSalesRate` | expectSalesRate | `expect_sales_rate` | Decimal | `number` |  | true |
| 60 | `settleAmount` | settleAmount | `settle_amount` | Decimal | `number` |  | true |
| 61 | `settledAmountTotal` | settledAmountTotal | `settledAmountTotal` | Decimal | `number` |  | true |
| 62 | `executionFrequency` | executionFrequency | `execution_frequency` | Integer | `int` |  | true |
| 63 | `assumeAmountTotal` | assumeAmountTotal | `assumeAmountTotal` | Decimal | `number` |  | true |
| 64 | `executionTime` | executionTime | `execution_time` | DateTime | `timestamp` |  | true |
| 65 | `content` | content | `content` | String | `text` |  | true |
| 66 | `ower` | ower | `ower` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true |
| 67 | `dept` | dept | `dept` | ca871996-b447-42f9-8dac-dd7c21ee0662 | `quote` |  | true |
| 68 | `saleArea` | saleArea | `salearea` | 75fb7b76-fdb5-4e87-ab0d-e4215a299634 | `quote` |  | true |
| 69 | `verifystate` | verifystate | `verifystate` | Short | `short` |  | true |
| 70 | `auditor` | auditor | `auditor` | String | `text` |  | true |
| 71 | `auditTime` | auditTime | `audit_time` | DateTime | `timestamp` |  | true |
| 72 | `isWfControlled` | 是否WfControlled | `isWfControlled` | Boolean | `switch` |  | true |
| 73 | `returncount` | returncount | `returncount` | Short | `short` |  | true |
| 74 | `closeState` | closeState | `close_state` | ActivityCloseStateEnum | `singleOption` |  | true |
| 75 | `closeTime` | closeTime | `close_time` | DateTime | `timestamp` |  | true |
| 76 | `settleState` | settleState | `settle_state` | Short | `singleOption` |  | true |
| 77 | `bizFlow` | bizFlow | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |  | true |
| 78 | `settleTime` | settleTime | `settle_time` | DateTime | `timestamp` |  | true |
| 79 | `auditorId` | auditorID | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 80 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 81 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 82 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 83 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 84 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 85 | `accountingPeriod` | accountingPeriod | `accounting_period` | 0028813f-135a-485e-a5c3-c15a3d18168b | `quote` |  | true |
| 86 | `partnerExecute` | partnerExecute | `partner_execute` | Boolean | `switch` |  | true |
| 87 | `openingActivity` | openingActivity | `opening_activity` | Short | `short` |  | true |
| 88 | `isFlowCoreBill` | 是否FlowCoreBill | `isFlowCoreBill` | Boolean | `switch` |  | true |
| 89 | `isAutoGenerate` | 是否AutoGenerate | `isAutoGenerate` | Boolean | `switch` |  | true |
| 90 | `activityDisplays` | activityDisplays | `` | f5b18631-0da8-43ed-9c73-2225ebe44ecc | `` |  |  |
| 91 | `activityInfs` | activityInfs | `` | efb595da-64fa-401e-a39a-64d5820d23d1 | `` |  |  |
| 92 | `activityMaterialList` | activityMaterialList | `` | 03c8abab-f494-4eb1-bbd6-f636c2aae05f | `` |  |  |
| 93 | `activityParticipantList` | activityParticipantList | `` | 76945e50-5e68-4f8c-95f5-b3e1779a0cb5 | `` |  |  |
| 94 | `headDef` | headDef | `` | 374f5474-5a56-42ff-94ed-90c21af4c0ac | `` |  |  |
| 95 | `partnerDept` | partnerDept | `partner_dept` | b54fc393-1d66-4f6e-806b-c8a50b5e788b | `quote` |  | true |

## 关联属性（35 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `country` | `bd.country.CountryVO` | `cCountry` |  |  |  |
| 2 | `activityMaterialList` | `mka.activity.ActivityMaterial` | `` | 0..n | Y |  |
| 3 | `activityPlanInfo` | `mka.activityplan.ActivityPlanInfo` | `activity_plan_info` |  |  |  |
| 4 | `creatorId` | `base.user.User` | `creatorId` |  |  |  |
| 5 | `modifierId` | `base.user.User` | `modifierId` |  |  |  |
| 6 | `bizFlow` | `bf.bizflow.BusinessFlow` | `bizFlowId` |  |  |  |
| 7 | `defaultDimension_terminal_chain` | `aa.store.ChainSystem` | `defaultDimension_terminal_chain` |  |  |  |
| 8 | `activityPlan` | `mka.activityplan.ActivityPlan` | `activity_plan` |  |  |  |
| 9 | `defaultAsumeDept` | `bd.adminOrg.AdminOrgVO` | `defaultAsumeDept` |  |  |  |
| 10 | `activityParticipantList` | `mka.activity.ActivityParticipant` | `` | 0..n | Y |  |
| 11 | `marketingPlan` | `mka.marketingplan.MarketingPlan` | `marketing_plan` |  |  |  |
| 12 | `productLine` | `pc.productline.ProductLine` | `product_line` |  |  |  |
| 13 | `currency` | `bd.currencytenant.CurrencyTenantVO` | `currency` |  |  |  |
| 14 | `accountingPeriod` | `bd.period.Period` | `accounting_period` |  |  |  |
| 15 | `defaultAssumeOrg` | `org.func.BaseOrg` | `defaultAssumeOrg` |  |  |  |
| 16 | `closeReason` | `crmc.custdoc.CustDoc` | `close_reason` |  |  |  |
| 17 | `activityDefineCharacter` | `mka.activity.ActivityDefineCharacter` | `activityDefineCharacter` |  |  |  |
| 18 | `tenant` | `base.tenant.Tenant` | `tenant_id` |  |  |  |
| 19 | `ower` | `bd.staff.Staff` | `ower` |  |  |  |
| 20 | `headDef` | `mka.activity.ActivityDef` | `` | 1 | Y |  |
| 21 | `activityDisplays` | `mka.activity.ActivityDisplay` | `` | 0..n | Y |  |
| 22 | `org` | `org.func.BaseOrg` | `org` |  |  |  |
| 23 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 24 | `saleArea` | `aa.salearea.SaleArea` | `salearea` |  |  |  |
| 25 | `terminal` | `aa.store.Store` | `terminal` |  |  |  |
| 26 | `dept` | `bd.adminOrg.DeptOrgVO` | `dept` |  |  |  |
| 27 | `bustype` | `bd.bill.TransType` | `bustype` |  |  |  |
| 28 | `activityInfs` | `mka.activity.ActivityInfo` | `` | 0..n | Y |  |
| 29 | `defaultDimension_region` | `aa.salearea.SaleArea` | `defaultDimension_region` |  |  |  |
| 30 | `partnerPerson` | `bd.staff.Staff` | `partner_person` |  |  |  |
| 31 | `auditorId` | `base.user.User` | `auditorId` |  |  |  |
| 32 | `supplyCustomer` | `aa.merchant.Merchant` | `supply_customer` |  |  |  |
| 33 | `partnerDept` | `cust.custoperateinfo.CustTechnologyDepartment` | `partner_dept` |  |  |  |
| 34 | `cust` | `aa.merchant.Merchant` | `iCustID` |  |  |  |
| 35 | `customer` | `aa.merchant.Merchant` | `customer` |  |  |  |

## 依赖接口（8 个）

- `IAuditInfo` → `base.itf.IAuditInfo` (v340)
- `IAutoCode` → `voucher.base.IAutoCode` (v49)
- `ITenant` → `base.itf.ITenant` (v73)
- `IDataPermissions` → `crmc.base.IDataPermissions` (v117)
- `IApprovalFlow` → `base.itf.IApprovalFlow` (v134)
- `IApprovalInfo` → `base.itf.IApprovalInfo` (v172)
- `IBusinessFlow` → `base.itf.IBusinessFlow` (v77)
- `IYTenantExt` → `ucfbase.ucfbaseItf.IYTenantExt` (v24)

## SQL 示例

```sql
SELECT activity_points, integral_criterion, partner_person, amountsIncurred, version_no, activityDefineCharacter, apply_time, audit_date
FROM mka_activity
```