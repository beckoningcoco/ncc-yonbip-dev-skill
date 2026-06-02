---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, bd.payments.PaymentDate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 付款账期 (`bd.payments.PaymentDate`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_paymentdate` | 应用: `DPMSETL`

## 属性（28 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `payAgreement` | payAgreement | `payagreement` | 3cce8052-512e-4e51-9b6e-57adff40948c | `quote` |
| 3 | `paymentName` | payment名称 | `paymentname` | String | `multiLanguage` |
| 4 | `paymentPercent` | paymentPercent | `paymentpercent` | Decimal | `number` |
| 5 | `prePay` | prePay | `prePay` | Boolean | `switch` |
| 6 | `deposit` | deposit | `deposit` | Integer | `int` |
| 7 | `settleWay` | settleWay | `settleWay` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 8 | `payStartBase` | payStartBase | `paystartbase` | a4a03d83-ea92-422d-9f64-b5f18f26a4a9 | `quote` |
| 9 | `delayDays` | delayDays | `delaydays` | Integer | `int` |
| 10 | `fixedexpireday` | fixedexpireday | `fixedexpireday` | Integer | `int` |
| 11 | `fixedoaday1` | fixedoaday1 | `fixedoaday1` | Integer | `int` |
| 12 | `fixedoaday2` | fixedoaday2 | `fixedoaday2` | Integer | `int` |
| 13 | `fixedoaday3` | fixedoaday3 | `fixedoaday3` | Integer | `int` |
| 14 | `fixedoaday4` | fixedoaday4 | `fixedoaday4` | Integer | `int` |
| 15 | `delayMonths` | delayMonths | `delaymonths` | Integer | `int` |
| 16 | `accountType` | accountType | `accounttype` | Integer | `int` |
| 17 | `accountDay` | accountDay | `accountday` | Integer | `int` |
| 18 | `accountUnit` | accountUnit | `accountUnit` | Integer | `int` |
| 19 | `fixedoaday` | fixedoaday | `fixedoaday` | Integer | `int` |
| 20 | `fixedexpireday1` | fixedexpireday1 | `fixedexpireday1` | Integer | `int` |
| 21 | `fixedexpireday2` | fixedexpireday2 | `fixedexpireday2` | Integer | `int` |
| 22 | `fixedexpireday3` | fixedexpireday3 | `fixedexpireday3` | Integer | `int` |
| 23 | `fixedexpireday4` | fixedexpireday4 | `fixedexpireday4` | Integer | `int` |
| 24 | `order` | order | `iorder` | Integer | `int` |
| 25 | `paymentDateCharacter` | paymentDateCharacter | `paymentDateCharacter` | 01bece07-07ff-4868-b858-8922343a8d33 | `UserDefine` |
| 26 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 27 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 28 | `paymentDateDefine` | paymentDateDefine | `` | 8803e946-636c-4f4e-8fdf-aba2de0026d4 | `` |

## 关联（6 个）

- `payAgreement` -> `bd.payments.PayAgreement` (0..n) 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `paymentDateDefine` -> `bd.payments.PaymentDateDefine` (1) 
- `paymentDateCharacter` -> `bd.payments.PaymentDateDefineCharacter` () 
- `payStartBase` -> `bd.payments.PayStartBase` () 
- `settleWay` -> `aa.settlemethod.SettleMethod` () 
