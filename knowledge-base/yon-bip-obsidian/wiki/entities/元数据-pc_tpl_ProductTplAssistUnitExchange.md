---
tags: [BIP, 元数据, 数据字典, pc.tpl.ProductTplAssistUnitExchange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料模板辅计量换算对照 (`pc.tpl.ProductTplAssistUnitExchange`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `producttpl_assist_unitexchange` | 应用: `GZTBDM` | 类型: `Class`

## 属性（15 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `assistUnit` | assistUnit | `assistUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 3 | `assistUnitCount` | assistUnitCount | `fAssistUnitCount` | Decimal | `number` |
| 4 | `assistVersValue` | assistVersValue | `assistVersValue` | String | `text` |
| 5 | `balance` | balance | `balance` | Integer | `int` |
| 6 | `iOrder` | iOrder | `iOrder` | Integer | `int` |
| 7 | `mainUnitCount` | mainUnitCount | `fMainUnitCount` | Decimal | `number` |
| 8 | `mainUnitCountNew` | mainUnitCountNew | `mainUnitCount` | Decimal | `number` |
| 9 | `mainUnitRate` | mainUnitRate | `mainUnitRate` | Decimal | `number` |
| 10 | `template` | template | `tpl_id` | c40d564b-d166-4e0e-875f-1fafdab28955 | `quote` |
| 11 | `unitExchangeType` | unitExchangeType | `unitExchangeType` | UnitExchangeType | `` |
| 12 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 13 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 15 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（4 个）

- `template` -> `pc.tpl.ProductTpl` (0..n)
- `assistUnit` -> `pc.unit.Unit` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `tenant` -> `base.tenant.Tenant` ()
