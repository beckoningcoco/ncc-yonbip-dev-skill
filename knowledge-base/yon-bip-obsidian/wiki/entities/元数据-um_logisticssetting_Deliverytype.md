---
tags: [BIP, 元数据, 数据字典, um.logisticssetting.Deliverytype]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物流设置 (`um.logisticssetting.Deliverytype`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `deliverytype` | 应用: `SDMA` | 类型: `Class`

## 属性（48 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `mallcorp` | mallcorp | `iCorpId` | Long | `long` |
| 3 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |
| 4 | `dt_name` | dt_name | `dt_name` | String | `text` |
| 5 | `isDefault` | 是否Default | `isDefault` | Boolean | `switch` |
| 6 | `feestyle` | feestyle | `feestyle` | Integer | `int` |
| 7 | `unifiedPrice` | unifiedPrice | `unifiedPrice` | Decimal | `number` |
| 8 | `firstunit` | firstunit | `firstunit` | Integer | `int` |
| 9 | `continueunit` | continueunit | `continueunit` | Integer | `int` |
| 10 | `firstprice` | firstprice | `firstprice` | Decimal | `number` |
| 11 | `continueprice` | continueprice | `continueprice` | Decimal | `number` |
| 12 | `setting` | setting | `setting` | Integer | `int` |
| 13 | `isPost` | 是否Post | `isPost` | Short | `short` |
| 14 | `terminalType` | terminalType | `terminalType` | Short | `short` |
| 15 | `postDescription` | postDescription | `postDescription` | String | `text` |
| 16 | `startTime` | startTime | `startTime` | Date | `date` |
| 17 | `endTime` | endTime | `endTime` | Date | `date` |
| 18 | `iConsumerSpending` | iConsumerSpending | `iConsumerSpending` | Decimal | `number` |
| 19 | `preferentialWay` | preferentialWay | `preferentialWay` | Short | `short` |
| 20 | `packetMailRangeType` | packetMailRangeType | `packetMailRangeType` | Short | `short` |
| 21 | `protect` | protect | `protect` | Boolean | `switch` |
| 22 | `area_fee_conf` | area_fee_conf | `area_fee_conf` | String | `text` |
| 23 | `corp_id` | corp_id | `corp_id` | String | `text` |
| 24 | `def_area_fee` | def_area_fee | `def_area_fee` | String | `text` |
| 25 | `deliveryarea` | deliveryarea | `` | 1ae84cdb-a2f1-46f9-86b3-f1a8b2ebc2be | `` |
| 26 | `detail` | detail | `detail` | String | `text` |
| 27 | `disabled` | disabled | `disabled` | Boolean | `switch` |
| 28 | `distanceUnit` | distanceUnit | `distanceUnit` | Decimal | `number` |
| 29 | `distancefreight` | distancefreight | `` | d0fb44fb-9f06-4940-8601-7387ba48dd17 | `` |
| 30 | `dt_discount` | dt_discount | `dt_discount` | Decimal | `number` |
| 31 | `dt_expressions` | dt_expressions | `dt_expressions` | String | `text` |
| 32 | `dt_status` | dt_status | `dt_status` | Integer | `int` |
| 33 | `dt_useexp` | dt_useexp | `dt_useexp` | Boolean | `switch` |
| 34 | `fixedAmount` | fixedAmount | `fixedamount` | Decimal | `number` |
| 35 | `freightDescription` | freightDescription | `freightDescription` | String | `text` |
| 36 | `freightMarkupStyle` | freightMarkupStyle | `freight_markup_style` | Integer | `int` |
| 37 | `freightUnit` | freightUnit | `freightUnit` | Decimal | `number` |
| 38 | `has_cod` | has_cod | `has_cod` | Boolean | `switch` |
| 39 | `iDeleted` | iDeleted | `iDeleted` | Integer | `int` |
| 40 | `is_threshold` | 是否_threshold | `is_threshold` | Integer | `int` |
| 41 | `minprice` | minprice | `minprice` | Decimal | `number` |
| 42 | `nonmailarea` | nonmailarea | `` | 85140ded-3e20-463e-acf7-5851fc8a1b5e | `` |
| 43 | `ordernum` | ordernum | `ordernum` | Short | `short` |
| 44 | `proportional` | proportional | `proportional` | Decimal | `number` |
| 45 | `protect_rate` | protect_rate | `protect_rate` | Decimal | `number` |
| 46 | `templateDisplayName` | templateDisplay名称 | `templateDisplayName` | String | `text` |
| 47 | `threshold` | threshold | `threshold` | String | `text` |
| 48 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `deliveryarea` -> `um.logisticssetting.Deliveryarea` (0..n)
- `nonmailarea` -> `um.logisticssetting.Nonmailarea` (0..n)
- `distancefreight` -> `um.logisticssetting.DistanceFreight` (0..n)
