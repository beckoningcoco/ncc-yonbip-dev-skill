---
tags: [BIP, 元数据, 数据字典, pc.userdef.UserDefineClass]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 自定义项 (`pc.userdef.UserDefineClass`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `userdef_base` | 应用: `GZTBDM` | 类型: `Class`

## 属性（42 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 4 | `achiveCode` | achive编码 | `achive_code` | String | `text` |
| 5 | `achiveDefineCode` | achiveDefine编码 | `achive_define_code` | String | `text` |
| 6 | `achiveDefineName` | achiveDefine名称 | `archive_define_name` | String | `text` |
| 7 | `achiveDomain` | achiveDomain | `achive_domain` | String | `text` |
| 8 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 9 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 10 | `achiveDomainName` | achiveDomain名称 | `achive_domain_name` | String | `text` |
| 11 | `achiveName` | achive名称 | `achive_name` | String | `text` |
| 12 | `achiveReturn` | achiveReturn | `achive_return` | String | `text` |
| 13 | `achiveReturnCaption` | achiveReturnCaption | `achive_return_caption` | String | `text` |
| 14 | `classId` | classID | `classId` | String | `text` |
| 15 | `defineId` | 自定义项ID | `defineId` | String | `text` |
| 16 | `defineIdOther` | defineIdOther | `defineIdOther` | String | `text` |
| 17 | `erpCode` | erp编码 | `erp_code` | String | `text` |
| 18 | `iorder` | iorder | `iorder` | Integer | `int` |
| 19 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 20 | `isMultiSel` | 是否MultiSel | `isMultiSel` | Boolean | `switch` |
| 21 | `isSerInput` | 是否SerInput | `isinput` | Boolean | `switch` |
| 22 | `isShowSpec` | 是否ShowSpec | `isShowSpec` | Boolean | `switch` |
| 23 | `item` | item | `item` | String | `text` |
| 24 | `name` | 名称 | `className` | String | `text` |
| 25 | `propertyType` | propertyType | `propertyType` | Integer | `int` |
| 26 | `showItemResid` | showItemResid | `showItem_resid` | String | `text` |
| 27 | `sociCoreArchive` | sociCoreArchive | `sociCoreArchive_id` | Long | `long` |
| 28 | `sourcetype` | sourcetype | `sourcetype` | Boolean | `switch` |
| 29 | `showItem` | showItem | `showItem` | String | `multiLanguage` |
| 30 | `userdefAlias` | userdefAlias | `userdef_alias` | String | `multiLanguage` |
| 31 | `type` | type | `type` | String | `text` |
| 32 | `length` | length | `length` | Integer | `int` |
| 33 | `orderNum` | orderNum | `ordernum` | Integer | `int` |
| 34 | `isWebInput` | 是否WebInput | `iswebinput` | Boolean | `switch` |
| 35 | `isWebShow` | 是否WebShow | `iswebshow` | Boolean | `switch` |
| 36 | `isEnabled` | 启用 | `isEnabled` | Integer | `int` |
| 37 | `userdefMode` | userdefMode | `userdef_mode` | Integer | `int` |
| 38 | `maxInputLen` | maxInputLen | `maxInputLen` | Integer | `int` |
| 39 | `decimalDigits` | decimalDigits | `decimalDigits` | Integer | `int` |
| 40 | `userdefDesc` | userdefDesc | `userdef_desc` | String | `multiLanguage` |
| 41 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 42 | `userdefines` | userdefines | `` | ea8eef91-08ab-4b54-8359-92eed26877e7 | `` |

## 关联（3 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `userdefines` -> `pc.userdef.Userdefine` (0..n)
- `tenant` -> `base.tenant.Tenant` ()
