---
tags: [BIP, 元数据, 数据字典, 其他入库, ST, st.othinrecord.OthInRecordsSN]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 其他入库单序列号 (`st.othinrecord.OthInRecordsSN`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_othinrecordsSN` | 应用: `ST`

## 属性（46 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `lineno` | lineno | `lineno` | String | `text` |
| 2 | `makebillsign` | makebillsign | `cMakeBillSign` | String | `text` |
| 3 | `presnstate` | presnstate | `creSNstate` | String | `text` |
| 4 | `rowno` | rowno | `rowno` | Integer | `int` |
| 5 | `snCharacter` | snCharacter | `othinrecords_sn_character` | 1ee8af3c-a4f8-4ed3-943f-2a179eac7bf8 | `FreeCT` |
| 6 | `snstate` | snstate | `cSNstate` | String | `text` |
| 7 | `sourcebillsnid` | sourcebillsnid | `iSourceBillSNId` | Long | `long` |
| 8 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 9 | `updatecount` | updatecount | `iUpdateCount` | Integer | `int` |
| 10 | `productsku` | productsku | `iProductSkuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 11 | `sn` | sn | `csn_code` | String | `text` |
| 12 | `define1` | define1 | `define1` | String | `text` |
| 13 | `define2` | define2 | `define2` | String | `text` |
| 14 | `define3` | define3 | `define3` | String | `text` |
| 15 | `define4` | define4 | `define4` | String | `text` |
| 16 | `define5` | define5 | `define5` | String | `text` |
| 17 | `define6` | define6 | `define6` | String | `text` |
| 18 | `define7` | define7 | `define7` | String | `text` |
| 19 | `define8` | define8 | `define8` | String | `text` |
| 20 | `define9` | define9 | `define9` | String | `text` |
| 21 | `define10` | define10 | `define10` | String | `text` |
| 22 | `define11` | define11 | `define11` | String | `text` |
| 23 | `define12` | define12 | `define12` | String | `text` |
| 24 | `define13` | define13 | `define13` | String | `text` |
| 25 | `define14` | define14 | `define14` | String | `text` |
| 26 | `define15` | define15 | `define15` | String | `text` |
| 27 | `define16` | define16 | `define16` | String | `text` |
| 28 | `define17` | define17 | `define17` | String | `text` |
| 29 | `define18` | define18 | `define18` | String | `text` |
| 30 | `define19` | define19 | `define19` | String | `text` |
| 31 | `define20` | define20 | `define20` | String | `text` |
| 32 | `define21` | define21 | `define21` | String | `text` |
| 33 | `define22` | define22 | `define22` | String | `text` |
| 34 | `define23` | define23 | `define23` | String | `text` |
| 35 | `define24` | define24 | `define24` | String | `text` |
| 36 | `define25` | define25 | `define25` | String | `text` |
| 37 | `define26` | define26 | `define26` | String | `text` |
| 38 | `define27` | define27 | `define27` | String | `text` |
| 39 | `define28` | define28 | `define28` | String | `text` |
| 40 | `define29` | define29 | `define29` | String | `text` |
| 41 | `define30` | define30 | `define30` | String | `text` |
| 42 | `id` | ID | `id` | Long | `long` |
| 43 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 44 | `grandpaid` | grandpaid | `iGrandpaId` | 7e2e8c06-07d7-41a2-8b9f-a7e7add74c76 | `quote` |
| 45 | `detailid` | detailid | `iDetailId` | 6bbb450a-8303-4528-978e-f552eda93a6f | `quote` |
| 46 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（6 个）

- `productsku` -> `pc.product.ProductSKU` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `snCharacter` -> `st.othinrecord.OthInRecordsSNCharacter` () 
- `detailid` -> `st.othinrecord.OthInRecords` (0..n) 
- `grandpaid` -> `st.othinrecord.OthInRecord` () 
- `tenant` -> `base.tenant.Tenant` () 
