---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, st.purinrecord.PurInRecordsSN]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 采购入库单序列号 (`st.purinrecord.PurInRecordsSN`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_purinrecords_sn` | 应用: `ST`

## 属性（46 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `makebillsign` | makebillsign | `cMakeBillSign` | String | `text` |
| 2 | `presnstate` | presnstate | `creSNstate` | String | `text` |
| 3 | `rowno` | rowno | `rowno` | Integer | `int` |
| 4 | `snstate` | snstate | `cSNstate` | String | `text` |
| 5 | `sourcebillsnid` | sourcebillsnid | `iSourceBillSNId` | Long | `long` |
| 6 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 7 | `updatecount` | updatecount | `iUpdateCount` | Integer | `int` |
| 8 | `id` | ID | `id` | Long | `long` |
| 9 | `sn` | sn | `csn_code` | String | `text` |
| 10 | `define1` | define1 | `define1` | String | `text` |
| 11 | `productsku` | productsku | `iProductSkuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 12 | `define2` | define2 | `define2` | String | `text` |
| 13 | `define3` | define3 | `define3` | String | `text` |
| 14 | `define4` | define4 | `define4` | String | `text` |
| 15 | `define5` | define5 | `define5` | String | `text` |
| 16 | `define6` | define6 | `define6` | String | `text` |
| 17 | `define7` | define7 | `define7` | String | `text` |
| 18 | `define8` | define8 | `define8` | String | `text` |
| 19 | `define9` | define9 | `define9` | String | `text` |
| 20 | `define10` | define10 | `define10` | String | `text` |
| 21 | `define11` | define11 | `define11` | String | `text` |
| 22 | `define12` | define12 | `define12` | String | `text` |
| 23 | `define13` | define13 | `define13` | String | `text` |
| 24 | `define14` | define14 | `define14` | String | `text` |
| 25 | `define15` | define15 | `define15` | String | `text` |
| 26 | `define16` | define16 | `define16` | String | `text` |
| 27 | `define17` | define17 | `define17` | String | `text` |
| 28 | `define18` | define18 | `define18` | String | `text` |
| 29 | `define19` | define19 | `define19` | String | `text` |
| 30 | `define20` | define20 | `define20` | String | `text` |
| 31 | `define21` | define21 | `define21` | String | `text` |
| 32 | `define22` | define22 | `define22` | String | `text` |
| 33 | `define23` | define23 | `define23` | String | `text` |
| 34 | `define24` | define24 | `define24` | String | `text` |
| 35 | `define25` | define25 | `define25` | String | `text` |
| 36 | `define26` | define26 | `define26` | String | `text` |
| 37 | `define27` | define27 | `define27` | String | `text` |
| 38 | `define28` | define28 | `define28` | String | `text` |
| 39 | `define29` | define29 | `define29` | String | `text` |
| 40 | `define30` | define30 | `define30` | String | `text` |
| 41 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 42 | `grandpaid` | grandpaid | `iGrandpaId` | f27abe81-1a48-4c58-b5fd-9a49a519276e | `quote` |
| 43 | `detailid` | detailid | `iDetailId` | da282394-f665-4148-b271-97b57607779a | `quote` |
| 44 | `lineno` | lineno | `lineno` | String | `text` |
| 45 | `snCharacter` | snCharacter | `purinrecords_sn_character` | 51e20e43-5035-43ff-832c-fda9a7ff52c1 | `FreeCT` |
| 46 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（6 个）

- `productsku` -> `pc.product.ProductSKU` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `snCharacter` -> `st.purinrecord.PurInRecordsSNCharacter` () 
- `detailid` -> `st.purinrecord.PurInRecords` (0..n) 
- `grandpaid` -> `st.purinrecord.PurInRecord` () 
- `tenant` -> `base.tenant.Tenant` () 
