---
tags: [BIP, 元数据, 数据字典, mka.activityplan.ActivityPlanInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 活动计划明细 (`mka.activityplan.ActivityPlanInfo`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mka_activityplan_info` | 应用: `MKA` | 类型: `Class`

## 属性（38 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `lineNo` | lineNo | `line_no` | Decimal | `number` |
| 2 | `id` | ID | `id` | Long | `long` |
| 3 | `activityplanId` | activityplanID | `activityplan_id` | ac48ac5e-aab9-45c7-b50b-3f0938ca8ded | `quote` |
| 4 | `theme` | theme | `theme` | String | `text` |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 6 | `longitude` | longitude | `longitude` | Decimal | `number` |
| 7 | `latitude` | latitude | `latitude` | Decimal | `number` |
| 8 | `activityPlanInfoDefineCharacter` | activityPlanInfoDefineCharacter | `activityPlanInfoDefineCharacter` | eed09e15-efd7-4cd4-9c82-36c1574f8fa1 | `UserDefine` |
| 9 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 10 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 11 | `terminal` | terminal | `terminal` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |
| 12 | `startDate` | startDate | `start_date` | DateTime | `timestamp` |
| 13 | `endDate` | endDate | `end_date` | DateTime | `timestamp` |
| 14 | `customer` | customer | `customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 15 | `ower` | ower | `ower` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 16 | `regionCode` | region编码 | `regionCode` | String | `text` |
| 17 | `address` | address | `address` | String | `text` |
| 18 | `expensesTotal` | expensesTotal | `expenses_total` | Decimal | `number` |
| 19 | `supplyCustomer` | supplyCustomer | `supply_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 20 | `expectProduce` | expectProduce | `expect_produce` | Decimal | `number` |
| 21 | `expectSalesRate` | expectSalesRate | `expect_sales_rate` | Decimal | `number` |
| 22 | `activityExpect` | activityExpect | `activity_expect` | String | `text` |
| 23 | `supplyCustomerFilter` | supplyCustomerFilter | `supply_customer_filter` | String | `text` |
| 24 | `displayNum` | displayNum | `display_num` | Integer | `int` |
| 25 | `activityDisplay` | activityDisplay | `activity_display` | String | `text` |
| 26 | `materialNum` | materialNum | `material_num` | Integer | `int` |
| 27 | `activityMaterial` | activityMaterial | `activity_material` | String | `text` |
| 28 | `executionFrequency` | executionFrequency | `execution_frequency` | Integer | `int` |
| 29 | `rejected` | rejected | `rejected` | Boolean | `switch` |
| 30 | `rejectMessage` | rejectMessage | `reject_message` | String | `text` |
| 31 | `replyPerson` | replyPerson | `reply_person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 32 | `settleStatus` | settleStatus | `settle_status` | Short | `short` |
| 33 | `replyTime` | replyTime | `reply_time` | DateTime | `timestamp` |
| 34 | `syncResult` | syncResult | `sync_result` | Short | `short` |
| 35 | `generateFailReason` | generateFailReason | `generate_fail_reason` | String | `text` |
| 36 | `deleteFailReason` | deleteFailReason | `delete_fail_reason` | String | `text` |
| 37 | `activityId` | activityID | `activity_id` | 924ae32c-2a09-4ec0-aff9-5959ec1f8024 | `quote` |
| 38 | `attachmentId` | 附件ID | `attachmentId` | String | `text` |

## 关联（10 个）

- `activityId` -> `mka.activity.Activity` ()
- `ower` -> `bd.staff.Staff` ()
- `activityPlanInfoDefineCharacter` -> `mka.activityplan.ActivityPlanInfoDefineCharacter` ()
- `replyPerson` -> `bd.staff.Staff` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `activityplanId` -> `mka.activityplan.ActivityPlan` (0..n)
- `supplyCustomer` -> `aa.merchant.Merchant` ()
- `terminal` -> `aa.store.Store` ()
- `tenant` -> `base.tenant.Tenant` ()
- `customer` -> `aa.merchant.Merchant` ()
