---
tags: [BIP, 元数据, 数据字典, mka.activityplan.ActivityPlan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 活动计划 (`mka.activityplan.ActivityPlan`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mka_activityplan` | 应用: `MKA` | 类型: `Class`

## 属性（59 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 3 | `org` | org | `org` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 4 | `bustype` | bustype | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 5 | `isBudgetOver` | 是否BudgetOver | `isBudgetOver` | Boolean | `switch` |
| 6 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 7 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 8 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 9 | `modifier` | 修改人 | `modifier` | String | `text` |
| 10 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 11 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 12 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 13 | `returncount` | returncount | `returncount` | Short | `short` |
| 14 | `auditorId` | auditorID | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 15 | `auditDate` | auditDate | `audit_date` | Date | `date` |
| 16 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 17 | `code` | 编码 | `code` | String | `text` |
| 18 | `activityBustype` | activityBustype | `activity_bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 19 | `theme` | theme | `theme` | String | `text` |
| 20 | `startDate` | startDate | `start_date` | DateTime | `timestamp` |
| 21 | `endDate` | endDate | `end_date` | DateTime | `timestamp` |
| 22 | `expensesTotal` | expensesTotal | `expenses_total` | Decimal | `number` |
| 23 | `expectProduce` | expectProduce | `expect_produce` | Decimal | `number` |
| 24 | `expectSalesRate` | expectSalesRate | `expect_sales_rate` | Decimal | `number` |
| 25 | `assumeAmountTotal` | assumeAmountTotal | `assumeAmountTotal` | Decimal | `number` |
| 26 | `marketingPlan` | marketingPlan | `marketing_plan` | 3defa5fd-999d-4eac-8798-9008f68c8758 | `quote` |
| 27 | `productLine` | productLine | `product_line` | fcdf5213-a995-4874-928f-ff97bcfa4b91 | `quote` |
| 28 | `materialApplyDate` | materialApplyDate | `materialapply_date` | DateTime | `timestamp` |
| 29 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 30 | `synMaterial` | synMaterial | `syn_material` | Boolean | `switch` |
| 31 | `mergeMaterial` | mergeMaterial | `merge_material` | Boolean | `switch` |
| 32 | `partnerExecute` | partnerExecute | `partner_execute` | Boolean | `switch` |
| 33 | `ower` | ower | `ower` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 34 | `settleAmount` | settleAmount | `settleAmount` | Decimal | `number` |
| 35 | `dept` | dept | `dept` | ca871996-b447-42f9-8dac-dd7c21ee0662 | `quote` |
| 36 | `saleArea` | saleArea | `salearea` | 75fb7b76-fdb5-4e87-ab0d-e4215a299634 | `quote` |
| 37 | `partnerPerson` | partnerPerson | `partner_person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 38 | `content` | content | `content` | String | `text` |
| 39 | `verifystate` | verifystate | `verifystate` | Short | `short` |
| 40 | `auditor` | auditor | `auditor` | String | `text` |
| 41 | `auditTime` | auditTime | `audit_time` | DateTime | `timestamp` |
| 42 | `supplyCustomer` | supplyCustomer | `supply_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 43 | `isWfControlled` | 是否WfControlled | `isWfControlled` | Boolean | `switch` |
| 44 | `creator` | 创建人 | `creator` | String | `text` |
| 45 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 46 | `activityPlanDefineCharacter` | activityPlanDefineCharacter | `activityPlanDefineCharacter` | 8cee6657-f2c7-4d4d-8bf8-d0db0c284ae9 | `UserDefine` |
| 47 | `openActivityPlan` | openActivityPlan | `openActivityPlan` | Short | `short` |
| 48 | `settleTime` | settleTime | `settle_time` | DateTime | `timestamp` |
| 49 | `settleState` | settleState | `settle_state` | Short | `short` |
| 50 | `bizFlow` | bizFlow | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |
| 51 | `isFlowCoreBill` | 是否FlowCoreBill | `isFlowCoreBill` | Boolean | `switch` |
| 52 | `versionNo` | versionNo | `version_no` | String | `text` |
| 53 | `activityPlanCosts` | activityPlanCosts | `` | 79306112-3428-443d-9f29-c82391f812fc | `` |
| 54 | `activityPlanDisplays` | activityPlanDisplays | `` | f36aac56-bd25-472f-97c2-eea57e7bd105 | `` |
| 55 | `activityPlanFreeDef` | activityPlanFreeDef | `` | 2f7dd223-14a8-4990-99f4-75d1d1c423f8 | `` |
| 56 | `activityPlanInfos` | activityPlanInfos | `` | a1e91e79-31c7-4d4e-a357-3dbc69523da1 | `` |
| 57 | `activityPlanMaterials` | activityPlanMaterials | `` | a77c0558-66a4-44b8-a78c-ccbfcefc0cc6 | `` |
| 58 | `cust` | cust | `partner` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 59 | `partnerDept` | partnerDept | `partner_dept` | b54fc393-1d66-4f6e-806b-c8a50b5e788b | `quote` |

## 关联（25 个）

- `activityBustype` -> `bd.bill.TransType` ()
- `activityPlanInfos` -> `mka.activityplan.ActivityPlanInfo` (0..n)
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `bizFlow` -> `bf.bizflow.BusinessFlow` ()
- `marketingPlan` -> `mka.marketingplan.MarketingPlan` ()
- `productLine` -> `pc.productline.ProductLine` ()
- `activityPlanDefineCharacter` -> `mka.activityplan.ActivityPlanDefineCharacter` ()
- `activityPlanFreeDef` -> `mka.activityplan.ActivityPlanFreeDef` (1)
- `currency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `tenant` -> `base.tenant.Tenant` ()
- `activityPlanDisplays` -> `mka.activityplan.ActivityPlanDisplay` (0..n)
- `ower` -> `bd.staff.Staff` ()
- `org` -> `org.func.BaseOrg` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `saleArea` -> `aa.salearea.SaleArea` ()
- `dept` -> `bd.adminOrg.DeptOrgVO` ()
- `bustype` -> `bd.bill.TransType` ()
- `activityPlanMaterials` -> `mka.activityplan.ActivityPlanMaterial` (0..n)
- `partnerPerson` -> `bd.staff.Staff` ()
- `auditorId` -> `base.user.User` ()
- `activityPlanCosts` -> `mka.activityplan.ActivityPlanCost` (0..n)
- `supplyCustomer` -> `aa.merchant.Merchant` ()
- `partnerDept` -> `cust.custoperateinfo.CustTechnologyDepartment` ()
- `cust` -> `aa.merchant.Merchant` ()
