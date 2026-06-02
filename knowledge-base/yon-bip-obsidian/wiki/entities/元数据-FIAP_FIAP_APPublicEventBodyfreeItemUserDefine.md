---
tags: [BIP, 元数据, 数据字典, FIAP.FIAP.APPublicEventBodyfreeItemUserDefine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 应付公共明细信息自定义项 (`FIAP.FIAP.APPublicEventBodyfreeItemUserDefine`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `arap_ledger_b_ch` | 应用: `EAP`

## 属性（19 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `BK` | BK | `vcol8` | 48093a75-f471-4bd6-88e7-aa77163470d8 | `quote` |
| 2 | `BMSX` | BMSX | `vcol10` | 3bb6a10a-b3a8-438b-a891-3f81baf7a850 | `quote` |
| 3 | `CS0000001` | CS0000001 | `vcol53` | ConttypeEnum | `singleOption` |
| 4 | `Eleven_Product_Color_Attribute` | Eleven_Product_Color_Attribute | `vcol2` | cf0d67fa-8cdb-448d-b794-7339f1689411 | `quote` |
| 5 | `HTLX` | HTLX | `vcol7` | String | `text` |
| 6 | `JJX20251005` | JJX20251005 | `vcol18` | 2f8b75b4-6eb5-4ab9-929f-aaf8e5d3b118 | `quote` |
| 7 | `LH01` | LH01 | `vcol3` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 8 | `UCU01` | UCU01 | `vcol54` | String | `text` |
| 9 | `W01` | W01 | `vcol13` | aba3c34d-f317-4317-9eaa-fe3e37ffda1d | `quote` |
| 10 | `ZXCY` | ZXCY | `vcol9` | e4030037-1032-4ec4-906b-aa3780aa9a1f | `quote` |
| 11 | `cyw02` | cyw02 | `vcol1` | cbf21359-2e4f-4193-aa3b-954a283264ea | `quote` |
| 12 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 13 | `htfx` | htfx | `vcol20` | da9b34be-90fa-4969-938b-e11c3aa5ff5a | `quote` |
| 14 | `id` | ID | `id` | String | `text` |
| 15 | `kjzt` | kjzt | `vcol15` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 16 | `ld001_yw` | ld001_yw | `vcol55` | String | `text` |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 18 | `wlfl` | wlfl | `lcol1` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |
| 19 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（12 个）

- `cyw02` -> `bd.customerdoc_250330.250330` () 
- `BK` -> `bd.customerdoc_BK.BK` () 
- `W01` -> `bd.customerdoc_W01.W01` () 
- `Eleven_Product_Color_Attribute` -> `bd.customerdoc_Eleven_Product_Color_Attribute.Eleven_Product_Color_Attribute` () 
- `JJX20251005` -> `bd.customerdoc_jjx20251005.jjx20251005` () 
- `kjzt` -> `org.func.BaseOrg` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `wlfl` -> `pc.cls.ManagementClass` () 
- `LH01` -> `org.func.BaseOrg` () 
- `ZXCY` -> `bd.customerdoc_ZXCY.ZXCY` () 
- `BMSX` -> `org.doc.DeptType` () 
- `htfx` -> `bd.customerdoc_HTFX.HTFX` () 
