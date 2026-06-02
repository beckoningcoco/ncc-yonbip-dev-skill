---
tags: [BIP, 元数据, 数据字典, pc.product.SkuPropCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# sku属性特征组合 (`pc.product.SkuPropCharacter`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `skupropcharacter` | 应用: `GZTBDM` | 类型: `Class`

## 属性（23 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `AUV2` | AUV2 | `vcol13` | d5fe7d73-1e16-4988-aa04-6d93f8ea9bda | `quote` |
| 2 | `BM02` | BM02 | `vcol2` | String | `text` |
| 3 | `BM040702` | BM040702 | `vcol3` | 549e1b9b-46f2-4fd8-923a-f13089fd7dfa | `quote` |
| 4 | `BM040704` | BM040704 | `vcol4` | 313f0225-dcd4-497c-a859-9cc0be2d26ce | `quote` |
| 5 | `BM1` | BM1 | `vcol1` | String | `text` |
| 6 | `LW000001` | LW000001 | `vcol55` | String | `text` |
| 7 | `LW00003` | LW00003 | `vcol53` | String | `text` |
| 8 | `LW0002` | LW0002 | `vcol54` | String | `text` |
| 9 | `MKCM` | MKCM | `vcol10` | cddb5c28-b090-4a31-abb9-5ff4ccf55940 | `quote` |
| 10 | `MKYS` | MKYS | `vcol11` | ee3928b6-46fd-4b74-a663-4db2311e010d | `quote` |
| 11 | `PH001` | PH001 | `bcol1,ncol1,ncol2` | Composite | `decimalRange` |
| 12 | `Q654321` | Q654321 | `vcol12` | String | `text` |
| 13 | `QA001` | QA001 | `vcol8` | String | `text` |
| 14 | `TJL01` | TJL01 | `bcol2,ncol4,ncol5` | Composite | `decimalRange` |
| 15 | `WD001` | WD001 | `ncol3` | Decimal | `number` |
| 16 | `ZXBZ01` | ZXBZ01 | `vcol9` | String | `text` |
| 17 | `id` | ID | `id` | String | `text` |
| 18 | `ljx002` | ljx002 | `vcol14` | d2ab4043-0c6a-45d7-8231-9bee300f1480 | `quote` |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 20 | `xjz002` | xjz002 | `vcol7` | 5d758a16-e5fe-45f1-90ef-1807c170f2cc | `quote` |
| 21 | `xjz01` | xjz01 | `vcol5` | c7da87af-4663-4bc9-ab82-bcc972ec216a | `quote` |
| 22 | `xjz02` | xjz02 | `vcol6` | 9b36b5c7-2ef2-4ec0-8b19-90f6bc1a1f81 | `quote` |
| 23 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（10 个）

- `ljx002` -> `bd.customerdoc_ljx002.ljx002` ()
- `BM040702` -> `bd.customerdoc_040701.040701` ()
- `BM040704` -> `bd.customerdoc_040702.040702` ()
- `xjz01` -> `bd.customerdoc_121325.121325` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `xjz02` -> `bd.customerdoc_CM.CM` ()
- `xjz002` -> `bd.customerdoc_xjz02.xjz02` ()
- `MKCM` -> `bd.customerdoc_MKCM.MKCM` ()
- `MKYS` -> `bd.customerdoc_MKYS.MKYS` ()
- `AUV2` -> `bd.customerdoc_0022.0022` ()
