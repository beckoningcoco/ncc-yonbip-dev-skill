---
tags: [BIP, 元数据, 数据字典, bd.receivables.ReceivableDate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收款账期 (`bd.receivables.ReceivableDate`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_receivabledate` | 应用: `DPMSETL` | 类型: `Class`

## 属性（31 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `receiveAgreement` | receiveAgreement | `receiveAgreement` | e336f779-f1e5-4530-b6d5-fa2e5ed1c302 | `quote` |
| 3 | `receiveName` | receive名称 | `receivename` | String | `multiLanguage` |
| 4 | `receivePercent` | receivePercent | `receivepercent` | Decimal | `number` |
| 5 | `preReceive` | preReceive | `prereceive` | Boolean | `switch` |
| 6 | `deposit` | deposit | `deposit` | Boolean | `switch` |
| 7 | `settleWay` | settleWay | `settleWay` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 8 | `receiveStartBase` | receiveStartBase | `receivestartbase` | dba40d49-c056-440a-9b39-7697f24364b3 | `quote` |
| 9 | `delayDays` | delayDays | `delaydays` | Integer | `int` |
| 10 | `delayMonths` | delayMonths | `delaymonths` | Integer | `int` |
| 11 | `fixedoaday` | fixedoaday | `fixedoaday` | Integer | `int` |
| 12 | `fixedoaday1` | fixedoaday1 | `fixedoaday1` | Integer | `int` |
| 13 | `fixedoaday2` | fixedoaday2 | `fixedoaday2` | Integer | `int` |
| 14 | `fixedoaday3` | fixedoaday3 | `fixedoaday3` | Integer | `int` |
| 15 | `fixedoaday4` | fixedoaday4 | `fixedoaday4` | Integer | `int` |
| 16 | `accountType` | accountType | `accounttype` | Integer | `int` |
| 17 | `accountDay` | accountDay | `accountday` | Integer | `int` |
| 18 | `accountUnit` | accountUnit | `accountUnit` | Integer | `int` |
| 19 | `fixedexpireday` | fixedexpireday | `fixedexpireday` | Integer | `int` |
| 20 | `fixedexpireday1` | fixedexpireday1 | `fixedexpireday1` | Integer | `int` |
| 21 | `fixedexpireday2` | fixedexpireday2 | `fixedexpireday2` | Integer | `int` |
| 22 | `fixedexpireday3` | fixedexpireday3 | `fixedexpireday3` | Integer | `int` |
| 23 | `fixedexpireday4` | fixedexpireday4 | `fixedexpireday4` | Integer | `int` |
| 24 | `controlLink` | controlLink | `controllink` | Integer | `int` |
| 25 | `controlOppt` | controlOppt | `controloppt` | Integer | `int` |
| 26 | `controlMode` | controlMode | `controlmode` | Integer | `int` |
| 27 | `order` | order | `iorder` | Integer | `int` |
| 28 | `receivableDateCharacter` | receivableDateCharacter | `receivableDateCharacter` | 81dc0e6d-afcc-4a02-ae19-ab00ae80f880 | `UserDefine` |
| 29 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 30 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 31 | `receivableDateDefine` | receivableDateDefine | `` | 156dc8bb-40d6-4e0a-bf9a-a6da1568f690 | `` |

## 关联（6 个）

- `receivableDateDefine` -> `bd.receivables.ReceivableDateDefine` (1)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `receivableDateCharacter` -> `bd.receivables.ReceivableDateDefineCharacter` ()
- `receiveStartBase` -> `bd.receivables.ReceiveStartBase` ()
- `settleWay` -> `aa.settlemethod.SettleMethod` ()
- `receiveAgreement` -> `bd.receivables.ReceiveAgreement` (0..n)
