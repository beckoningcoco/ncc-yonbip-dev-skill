---
tags: [BIP, 元数据, 数据字典, bd.duty.PositionDefineCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 岗位⾃定义项特征 (`bd.duty.PositionDefineCharacter`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_position_characteristics_define` | 应用: `DPMSTF` | 类型: `Class`

## 属性（17 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `bm0001` | bm0001 | `vcol3` | 7f5ff1e2-d21f-48d7-b057-0f8c40c17505 | `quote` |
| 2 | `gangwei1101` | gangwei1101 | `bcol50` | Boolean | `switch` |
| 3 | `id` | ID | `id` | String | `text` |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 5 | `wms1223` | wms1223 | `vcol55` | String | `text` |
| 6 | `wx154300` | wx154300 | `vcol54` | String | `text` |
| 7 | `wy01` | wy01 | `vcol1` | wy001 | `singleOption` |
| 8 | `wy02` | wy02 | `vcol2` | wy002 | `singleOption` |
| 9 | `wy03` | wy03 | `ncol7` | Decimal | `number` |
| 10 | `wy04` | wy04 | `ncol5` | Decimal | `number` |
| 11 | `wy05` | wy05 | `ncol6` | Decimal | `number` |
| 12 | `wy06` | wy06 | `ncol4` | Decimal | `number` |
| 13 | `wy07` | wy07 | `ncol1` | Decimal | `number` |
| 14 | `wy08` | wy08 | `ncol3` | Decimal | `number` |
| 15 | `wy09` | wy09 | `ncol2` | Decimal | `number` |
| 16 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 17 | `zz01003` | zz01003 | `zz01003` | db1cdc88-aa30-44ea-9934-a8f8f9cf9dcf | `referenceList` |

## 关联（3 个）

- `zz01003` -> `bd.customerdoc_zz01003.zz01003` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `bm0001` -> `bd.customerdoc_bm001.bm001` ()
