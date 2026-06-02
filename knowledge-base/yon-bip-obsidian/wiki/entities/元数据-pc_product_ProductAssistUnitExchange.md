---
tags: [BIP, 元数据, 数据字典, pc.product.ProductAssistUnitExchange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料辅计量换算对照 (`pc.product.ProductAssistUnitExchange`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `productassistunitexchange` | 应用: `GZTBDM` | 类型: `Class`

## 属性（14 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `productId` | productID | `productId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 3 | `assistUnit` | assistUnit | `assistUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 4 | `unitExchangeType` | unitExchangeType | `unitExchangeType` | UnitExchangeType | `` |
| 5 | `mainUnitRate` | mainUnitRate | `mainUnitRate` | Decimal | `number` |
| 6 | `assistVersValue` | assistVersValue | `assistVersValue` | String | `text` |
| 7 | `mainUnitCountNew` | mainUnitCountNew | `mainUnitCount` | Decimal | `number` |
| 8 | `assistUnitCount` | assistUnitCount | `fAssistUnitCount` | Decimal | `number` |
| 9 | `mainUnitCount` | mainUnitCount | `fMainUnitCount` | Decimal | `number` |
| 10 | `balance` | balance | `balance` | Integer | `int` |
| 11 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 12 | `iOrder` | iOrder | `iOrder` | Integer | `int` |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 14 | `tenant` | tenant | `tenant_id` | Long | `long` |

## 关联（3 个）

- `assistUnit` -> `pc.unit.Unit` ()
- `productId` -> `pc.product.Product` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
