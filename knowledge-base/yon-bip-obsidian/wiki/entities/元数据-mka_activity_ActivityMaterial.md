---
tags: [BIP, 元数据, 数据字典, mka.activity.ActivityMaterial]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 营销活动活动物料 (`mka.activity.ActivityMaterial`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mka_activity_material` | 应用: `MKA` | 类型: `Class`

## 属性（34 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `lineNo` | lineNo | `lineNo` | Decimal | `number` |
| 2 | `id` | ID | `id` | Long | `long` |
| 3 | `activityPlanMaterial` | activityPlanMaterial | `activity_plan_material` | a77c0558-66a4-44b8-a78c-ccbfcefc0cc6 | `quote` |
| 4 | `mainUnit` | mainUnit | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 5 | `mainQuantity` | mainQuantity | `main_quantity` | Decimal | `number` |
| 6 | `mainUnitRate` | mainUnitRate | `main_unit_rate` | Decimal | `number` |
| 7 | `unitExchangeType` | unitExchangeType | `unit_exchange_type` | Integer | `int` |
| 8 | `applyMainQuantity` | applyMainQuantity | `apply_main_quantity` | Decimal | `number` |
| 9 | `applyOrderQuantity` | applyOrderQuantity | `apply_order_quantity` | Decimal | `number` |
| 10 | `productDefineCharacter` | productDefineCharacter | `productDefineCharacter` | cb2cca54-d63d-4fb9-9467-851d22411581 | `FreeCT` |
| 11 | `productSensCode` | productSens编码 | `productSensCode` | String | `text` |
| 12 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 13 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 16 | `creator` | 创建人 | `creator` | String | `text` |
| 17 | `modifier` | 修改人 | `modifier` | String | `text` |
| 18 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 19 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 20 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 22 | `activityId` | activityID | `activityId` | 924ae32c-2a09-4ec0-aff9-5959ec1f8024 | `quote` |
| 23 | `product` | product | `product` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 24 | `unit` | unit | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 25 | `quantity` | quantity | `quantity` | Decimal | `number` |
| 26 | `productPrice` | productPrice | `product_price` | Decimal | `number` |
| 27 | `productAmount` | productAmount | `product_amount` | Decimal | `number` |
| 28 | `applyQuantity` | applyQuantity | `apply_quantity` | Decimal | `number` |
| 29 | `useQuantity` | useQuantity | `use_quantity` | Decimal | `number` |
| 30 | `expenseItem` | expenseItem | `expenseItem` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 31 | `activityMaterialDefineCharacter` | activityMaterialDefineCharacter | `activityMaterialDefineCharacter` | 16c7ef01-9b93-4f1c-b3f0-df6544e1836d | `UserDefine` |
| 32 | `mainUnitRateDen` | mainUnitRateDen | `main_unit_rate_den` | Decimal | `number` |
| 33 | `mainUnitRateNum` | mainUnitRateNum | `main_unit_rate_num` | Decimal | `number` |
| 34 | `materialBodyDef` | materialBodyDef | `` | a04aef88-6aab-44d3-be8f-5c72edb7b045 | `` |

## 关联（12 个）

- `expenseItem` -> `bd.expenseitem.ExpenseItem` ()
- `activityId` -> `mka.activity.Activity` (0..n)
- `materialBodyDef` -> `mka.activity.ActivityMaterialDef` (1)
- `activityPlanMaterial` -> `mka.activityplan.ActivityPlanMaterial` ()
- `mainUnit` -> `pc.unit.Unit` ()
- `product` -> `pc.product.Product` ()
- `unit` -> `pc.unit.Unit` ()
- `activityMaterialDefineCharacter` -> `mka.activity.ActivityMaterialDefineCharacter` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `productDefineCharacter` -> `mka.activity.ActivityMaterialProductDefineCharacter` ()
