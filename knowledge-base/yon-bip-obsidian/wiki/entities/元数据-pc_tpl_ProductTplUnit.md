---
tags: [BIP, 元数据, 数据字典, pc.tpl.ProductTplUnit]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料模板-计量单位 (`pc.tpl.ProductTplUnit`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `product_tpl_unit` | 应用: `GZTBDM` | 类型: `Class`

## 属性（25 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `batchPriceRate` | batchPriceRate | `batchPriceRate` | Decimal | `number` |
| 3 | `batchPriceUnit` | batchPriceUnit | `batchPriceUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 4 | `batchRate` | batchRate | `batchRate` | Decimal | `number` |
| 5 | `batchUnit` | batchUnit | `batchUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 6 | `demandPlanningUnit` | demandPlanningUnit | `demandPlanningUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 7 | `enableAssistUnit` | enableAssistUnit | `bEnableAssistUnit` | Boolean | `switch` |
| 8 | `inspectionUnit` | inspectionUnit | `inspectionUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 9 | `offlineRate` | offlineRate | `offlineRate` | Decimal | `number` |
| 10 | `offlineUnit` | offlineUnit | `offlineUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 11 | `onlineRate` | onlineRate | `onlineRate` | Decimal | `number` |
| 12 | `onlineUnit` | onlineUnit | `onlineUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 13 | `produceUnit` | produceUnit | `produceUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 14 | `purchasePriceUnit` | purchasePriceUnit | `purchasePriceUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 15 | `purchaseRate` | purchaseRate | `purchaseRate` | Decimal | `number` |
| 16 | `purchaseUnit` | purchaseUnit | `purchaseUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 17 | `requireRate` | requireRate | `requireRate` | Decimal | `number` |
| 18 | `requireUnit` | requireUnit | `requireUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 19 | `stockRate` | stockRate | `stockRate` | Decimal | `number` |
| 20 | `stockUnit` | stockUnit | `stockUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 21 | `template` | template | `tpl_id` | c40d564b-d166-4e0e-875f-1fafdab28955 | `quote` |
| 22 | `unit` | unit | `oUnit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 23 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 25 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（15 个）

- `produceUnit` -> `pc.unit.Unit` ()
- `template` -> `pc.tpl.ProductTpl` (0..n)
- `demandPlanningUnit` -> `pc.unit.Unit` ()
- `batchPriceUnit` -> `pc.unit.Unit` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `offlineUnit` -> `pc.unit.Unit` ()
- `onlineUnit` -> `pc.unit.Unit` ()
- `stockUnit` -> `pc.unit.Unit` ()
- `purchaseUnit` -> `pc.unit.Unit` ()
- `unit` -> `pc.unit.Unit` ()
- `batchUnit` -> `pc.unit.Unit` ()
- `requireUnit` -> `pc.unit.Unit` ()
- `purchasePriceUnit` -> `pc.unit.Unit` ()
- `tenant` -> `base.tenant.Tenant` ()
- `inspectionUnit` -> `pc.unit.Unit` ()
