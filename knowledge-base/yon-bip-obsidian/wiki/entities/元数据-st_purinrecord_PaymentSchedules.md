---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, st.purinrecord.PaymentSchedules]
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
# 付款计划子表 (`st.purinrecord.PaymentSchedules`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_paymentschedules` | 应用: `ST`

## 属性（31 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `number` | number | `iNumber` | Integer | `int` |
| 2 | `name` | 名称 | `iName` | String | `text` |
| 3 | `payRatio` | payRatio | `iPayRatio` | Decimal | `number` |
| 4 | `amount` | amount | `iAmount` | Decimal | `number` |
| 5 | `payNatMoney` | payNatMoney | `iPayNatMoney` | Decimal | `number` |
| 6 | `payNatSum` | payNatSum | `iPayNatSum` | Decimal | `number` |
| 7 | `startDate` | start日期 | `iStartDate` | a4a03d83-ea92-422d-9f64-b5f18f26a4a9 | `quote` |
| 8 | `startDateTime` | startDateTime | `iStartDateTime` | DateTime | `timestamp` |
| 9 | `fixAccoutDayTwo` | fixAccoutDayTwo | `iFixAccoutDayTwo` | Integer | `int` |
| 10 | `delayDay` | delayDay | `iDelayDay` | Integer | `int` |
| 11 | `fixAccoutDayThree` | fixAccoutDayThree | `iFixAccoutDayThree` | Integer | `int` |
| 12 | `delayMonth` | delayMonth | `iDelayMonth` | Integer | `int` |
| 13 | `fixAccoutDayFour` | fixAccoutDayFour | `iFixAccoutDayFour` | Integer | `int` |
| 14 | `accountDay` | accountDay | `iAccountDay` | Integer | `int` |
| 15 | `fixExpireDayOne` | fixExpireDayOne | `iFixExpireDayOne` | Integer | `int` |
| 16 | `fixExpireDayTwo` | fixExpireDayTwo | `iFixExpireDayTwo` | Integer | `int` |
| 17 | `accountUnit` | accountUnit | `iAccountUnit` | DateUnit | `` |
| 18 | `fixExpireDayThree` | fixExpireDayThree | `iFixExpireDayThree` | Integer | `int` |
| 19 | `accountType` | accountType | `iAccounType` | AccountType | `` |
| 20 | `fixExpireDayFour` | fixExpireDayFour | `iFixExpireDayFour` | Integer | `int` |
| 21 | `fixAccoutDateTime` | fixAccoutDateTime | `iFixAccoutDateTime` | DateTime | `timestamp` |
| 22 | `rowno` | rowno | `rowno` | Integer | `int` |
| 23 | `expiringDateTime` | expiringDateTime | `iExpiringDateTime` | DateTime | `timestamp` |
| 24 | `mainid` | mainid | `iMainId` | f27abe81-1a48-4c58-b5fd-9a49a519276e | `quote` |
| 25 | `paidAmount` | paidAmount | `iPaidAmount` | Decimal | `number` |
| 26 | `id` | ID | `id` | Long | `long` |
| 27 | `fixAccoutDayOne` | fixAccoutDayOne | `iFixAccoutDayOne` | Integer | `int` |
| 28 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 29 | `isAdvancePay` | 是否AdvancePay | `isAdvancePay` | Boolean | `switch` |
| 30 | `prePayType` | prePayType | `prePayType` | Integer | `int` |
| 31 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `ytenant` -> `yht.tenant.YhtTenant` () 
- `mainid` -> `st.purinrecord.PurInRecord` (0..n) 
- `startDate` -> `bd.payments.PayStartBase` () 
