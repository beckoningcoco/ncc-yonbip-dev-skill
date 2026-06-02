---
tags: [BIP, 元数据, 数据字典, 其他入库, ST, st.othinrecord.OthInRecordsDefineCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 其他入库子表自定义项特征实体 (`st.othinrecord.OthInRecordsDefineCharacter`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `othinrecords_character_define` | 应用: `ST`

## 属性（15 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `HGZ00002` | HGZ00002 | `vcol54` | String | `text` |
| 2 | `RA001` | RA001 | `vcol6` | 94ecc6d9-fca4-4e83-8748-9b5c4da2c22e | `quote` |
| 3 | `SCCJ` | SCCJ | `lcol1` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 4 | `WMCS` | WMCS | `vcol55` | String | `text` |
| 5 | `Xia` | Xia | `vcol1` | String | `text` |
| 6 | `Xia02` | Xia02 | `vcol2` | String | `text` |
| 7 | `YY0199_01_001` | YY0199_01_001 | `lcol2` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |
| 8 | `id` | ID | `id` | String | `text` |
| 9 | `jewellery04` | jewellery04 | `vcol4` | 9361525d-3def-44d1-8e27-7407f8c6aace | `quote` |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 11 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 12 | `yxh00001` | yxh00001 | `ncol49` | Decimal | `number` |
| 13 | `yxh00002` | yxh00002 | `ncol50` | Decimal | `number` |
| 14 | `yxh00004` | yxh00004 | `vcol5` | f9729a5e-fc7f-4c96-9eb5-5edad8b95ccd | `quote` |
| 15 | `zqdyanse` | zqdyanse | `vcol3` | 12949f86-a911-456b-b6a1-0acc521cc3c7 | `quote` |

## 关联（7 个）

- `zqdyanse` -> `bd.customerdoc_zqdyanse.zqdyanse` () 
- `SCCJ` -> `aa.vendor.Vendor` () 
- `RA001` -> `bd.customerdoc_RA0001.RA0001` () 
- `jewellery04` -> `bd.customerdoc_jewellery04.jewellery04` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `yxh00004` -> `bd.customerdoc_yxh0001.yxh0001` () 
- `YY0199_01_001` -> `pc.cls.ManagementClass` () 
