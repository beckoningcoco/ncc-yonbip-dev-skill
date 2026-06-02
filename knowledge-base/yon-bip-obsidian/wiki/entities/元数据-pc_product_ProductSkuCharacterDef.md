---
tags: [BIP, 元数据, 数据字典, pc.product.ProductSkuCharacterDef]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# SKU特征自定义项 (`pc.product.ProductSkuCharacterDef`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `productsku_character_def` | 应用: `GZTBDM` | 类型: `Class`

## 属性（24 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `CK01` | CK01 | `vcol55` | String | `text` |
| 2 | `CS01` | CS01 | `vcol1` | String | `text` |
| 3 | `CS02` | CS02 | `vcol2` | String | `text` |
| 4 | `CS03` | CS03 | `vcol3` | String | `text` |
| 5 | `CSL01` | CSL01 | `ncol1` | Decimal | `number` |
| 6 | `Character_001_TJH` | Character_001_TJH | `ncol50` | Decimal | `number` |
| 7 | `GXXTZ01` | GXXTZ01 | `vcol53` | String | `text` |
| 8 | `HZW007` | HZW007 | `vcol5` | String | `text` |
| 9 | `PH001` | PH001 | `bcol2,ncol5,ncol6` | Composite | `decimalRange` |
| 10 | `QA001` | QA001 | `vcol7` | String | `text` |
| 11 | `RSJT01` | RSJT01 | `vcol10` | String | `text` |
| 12 | `TJL01` | TJL01 | `bcol1,ncol2,ncol3` | Composite | `decimalRange` |
| 13 | `WD001` | WD001 | `ncol4` | Decimal | `number` |
| 14 | `WMCS` | WMCS | `vcol8` | String | `text` |
| 15 | `XCDJ` | XCDJ | `vcol13` | 1c45fed3-b15f-43c3-967a-c96d6c885904 | `quote` |
| 16 | `ZXBZ01` | ZXBZ01 | `vcol6` | String | `text` |
| 17 | `a008551` | a008551 | `vcol54` | String | `text` |
| 18 | `ddd` | ddd | `vcol12` | 2edd0fb4-031e-4083-8fc9-1824f13931af | `quote` |
| 19 | `gpy02` | gpy02 | `vcol9` | String | `text` |
| 20 | `id` | ID | `id` | String | `text` |
| 21 | `jewellery03` | jewellery03 | `vcol4` | 717c0605-da7f-42ca-b85e-56b58e55e707 | `quote` |
| 22 | `ljx002` | ljx002 | `vcol11` | d2ab4043-0c6a-45d7-8231-9bee300f1480 | `quote` |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 24 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `ljx002` -> `bd.customerdoc_ljx002.ljx002` ()
- `ddd` -> `bd.customerdoc_1111.1111` ()
- `jewellery03` -> `bd.customerdoc_jewellery03.jewellery03` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `XCDJ` -> `bd.customerdoc_XCDA.XCDA` ()
