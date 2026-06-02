---
tags: [BIP, 元数据, 数据字典, sccs, sccs.multitrade.TradeRoutes]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 贸易路径子表 (`sccs.multitrade.TradeRoutes`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `scmmp_traderoutes` | 应用: `SCCS`

## 全部属性（37 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `currency` | currency | `cCurrencyId` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | true |
| 2 | `discountRate` | discountRate | `discountRate` | Decimal | `number` |  | true |
| 3 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 4 | `inPause` | inPause | `inPause` | Short | `short` |  | true |
| 5 | `inTransTypeId` | inTransTypeID | `inTransTypeId` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | true |
| 6 | `inWarehouseId` | inWarehouseID | `inWarehouseId` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |  | true |
| 7 | `invoiceOrgId` | invoiceOrgID | `invoiceOrgId` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` | false | true |
| 8 | `lineno` | lineno | `lineno` | Decimal | `number` |  | true |
| 9 | `mainid` | mainid | `mainid` | c69f1d6a-783c-4f79-b446-b4da14cb7fff | `quote` |  | true |
| 10 | `memo` | 备注 | `memo` | String | `text` |  | true |
| 11 | `orderOrgId` | orderOrgID | `orderOrgId` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` | false | true |
| 12 | `outPause` | outPause | `outPause` | Short | `short` |  | true |
| 13 | `outTransTypeId` | outTransTypeID | `outTransTypeId` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | true |
| 14 | `outWarehouseId` | outWarehouseID | `outWarehouseId` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |  | true |
| 15 | `piPause` | piPause | `piPause` | Short | `short` |  | true |
| 16 | `piStatus` | piStatus | `piStatus` | Short | `short` |  | true |
| 17 | `piTransTypeId` | piTransTypeID | `piTransTypeId` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | true |
| 18 | `poPause` | poPause | `poPause` | Short | `short` |  | true |
| 19 | `poStatus` | poStatus | `poStatus` | Short | `short` |  | true |
| 20 | `poTransTypeId` | poTransTypeID | `poTransTypeId` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | true |
| 21 | `priceBasic` | priceBasic | `priceBasic` | Short | `short` |  | true |
| 22 | `priceDifference` | priceDifference | `priceDifference` | Decimal | `number` |  | true |
| 23 | `priceType` | priceType | `priceType` | Short | `short` |  | true |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 25 | `redPurinTransTypeId` | redPurinTransTypeID | `red_purin_trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` | false | true |
| 26 | `redSaleoutTransTypeId` | redSaleoutTransTypeID | `red_saleout_trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` | false | true |
| 27 | `returnInPause` | returnInPause | `returnInPause` | Integer | `int` |  | true |
| 28 | `returnOutPause` | returnOutPause | `returnOutPause` | Integer | `int` |  | true |
| 29 | `saleReturnTransTypeId` | saleReturnTransTypeID | `sale_return_trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` | false | true |
| 30 | `siPause` | siPause | `siPause` | Short | `short` |  | true |
| 31 | `siStatus` | siStatus | `siStatus` | Short | `short` |  | true |
| 32 | `siTransTypeId` | siTransTypeID | `siTransTypeId` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | true |
| 33 | `soPause` | soPause | `soPause` | Short | `short` |  | true |
| 34 | `soStatus` | soStatus | `soStatus` | Short | `short` |  | true |
| 35 | `soTransTypeId` | soTransTypeID | `soTransTypeId` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | true |
| 36 | `stockOrgId` | stockOrgID | `stockOrgId` | e18e914b-4518-4e8c-ac21-783145fe7da1 | `quote` |  | true |
| 37 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |

## 关联属性（17 个）

- `orderOrgId` -> `org.func.BaseOrg` ()
- `redSaleoutTransTypeId` -> `bd.bill.TransType` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `invoiceOrgId` -> `org.func.FinanceOrg` ()
- `siTransTypeId` -> `bd.bill.TransType` ()
- `outWarehouseId` -> `aa.warehouse.Warehouse` ()
- `inWarehouseId` -> `aa.warehouse.Warehouse` ()
- `saleReturnTransTypeId` -> `bd.bill.TransType` ()
- `soTransTypeId` -> `bd.bill.TransType` ()
- `outTransTypeId` -> `bd.bill.TransType` ()
- `poTransTypeId` -> `bd.bill.TransType` ()
- `redPurinTransTypeId` -> `bd.bill.TransType` ()
- `stockOrgId` -> `org.func.InventoryOrg` ()
- `currency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `inTransTypeId` -> `bd.bill.TransType` ()
- `piTransTypeId` -> `bd.bill.TransType` ()
- `mainid` -> `sccs.multitrade.TradeRoute` (1..n)

```sql
SELECT cCurrencyId, discountRate, id, inPause, inTransTypeId, inWarehouseId FROM scmmp_traderoutes
```