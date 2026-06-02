---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, st.purinrecord.PaymentExeDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
parent_entity: st.purinrecord.PurInRecord
---
# 付款执行明细 (`st.purinrecord.PaymentExeDetail`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_paymentexedetail` | 应用: `ST`

## 属性（23 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `payNatMoney` | payNatMoney | `payNatMoney` | Decimal | `number` |
| 2 | `payNatSum` | payNatSum | `payNatSum` | Decimal | `number` |
| 3 | `rowno` | rowno | `rowno` | Integer | `int` |
| 4 | `mainid` | mainid | `iMainId` | f27abe81-1a48-4c58-b5fd-9a49a519276e | `quote` |
| 5 | `id` | ID | `id` | Long | `long` |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 7 | `vouchtype` | vouchtype | `vouchtype` | String | `text` |
| 8 | `vouchid` | vouchid | `vouchid` | Long | `long` |
| 9 | `vouchsubid` | vouchsubid | `vouchsubid` | Long | `long` |
| 10 | `vouchcode` | vouchcode | `vouchcode` | String | `text` |
| 11 | `number` | number | `iNumber` | Integer | `int` |
| 12 | `period` | period | `period` | String | `text` |
| 13 | `paySum` | paySum | `paySum` | Decimal | `number` |
| 14 | `payRatio` | payRatio | `payRatio` | Decimal | `number` |
| 15 | `payMoney` | payMoney | `payMoney` | Decimal | `number` |
| 16 | `paidMoney` | paidMoney | `paidMoney` | Decimal | `number` |
| 17 | `writeBackSum` | writeBackSum | `writeBackSum` | Decimal | `number` |
| 18 | `startDateTime` | startDateTime | `startDateTime` | Date | `date` |
| 19 | `paidNatMoney` | paidNatMoney | `paidNatMoney` | Decimal | `number` |
| 20 | `writeBackNatSum` | writeBackNatSum | `writeBackNatSum` | Decimal | `number` |
| 21 | `expiringDateTime` | expiringDateTime | `expiringDateTime` | Date | `date` |
| 22 | `isAdvancePay` | 是否AdvancePay | `isAdvancePay` | Boolean | `switch` |
| 23 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（2 个）

- `ytenant` -> `yht.tenant.YhtTenant` () 
- `mainid` -> `st.purinrecord.PurInRecord` (0..n) 
