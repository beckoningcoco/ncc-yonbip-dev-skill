---
tags: [BIP, 元数据, 数据字典, earap.payment.PaymentHeaderfreeChIdUserDefine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 付款单基本信息自定义项 (`earap.payment.PaymentHeaderfreeChIdUserDefine`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `ap_payment_h_ch` | 应用: `EAP`

## 属性（28 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `BZXM` | BZXM | `vcol5` | 48cb63f7-de9b-4f60-915c-c989e31bbe2c | `quote` |
| 2 | `CS0000001` | CS0000001 | `vcol46` | ConttypeEnum | `singleOption` |
| 3 | `FKD102` | FKD102 | `vcol6` | 7d42ad2c-8e74-4de5-9527-5bb346fbf706 | `quote` |
| 4 | `JJZF` | JJZF | `bcol50` | Boolean | `switch` |
| 5 | `JYYWLX` | JYYWLX | `vcol9` | 9b1a1ef4-44af-43a6-a0cf-95d1f0e4cd6b | `quote` |
| 6 | `SCHD01` | SCHD01 | `vcol7` | b64185aa-2840-477d-8f07-c78e4962e847 | `quote` |
| 7 | `SY` | SY | `vcol47` | String | `text` |
| 8 | `TMLTZ` | TMLTZ | `vcol49` | String | `text` |
| 9 | `W01` | W01 | `vcol4` | aba3c34d-f317-4317-9eaa-fe3e37ffda1d | `quote` |
| 10 | `YKDYS` | YKDYS | `vcol53` | String | `text` |
| 11 | `ZFRQ` | ZFRQ | `dcol50` | Date | `date` |
| 12 | `ZW0309` | ZW0309 | `vcol51` | String | `text` |
| 13 | `cyfkmudi` | cyfkmudi | `vcol48` | String | `text` |
| 14 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 15 | `eeeee222` | eeeee222 | `vcol8` | 69adc389-4644-4d69-9d87-241d5d713cdd | `quote` |
| 16 | `fly01` | fly01 | `vcol2` | ba9e2e36-1270-4b7d-8da4-9571e15a0ec8 | `quote` |
| 17 | `htfx` | htfx | `vcol12` | da9b34be-90fa-4969-938b-e11c3aa5ff5a | `quote` |
| 18 | `id` | ID | `id` | String | `text` |
| 19 | `jipp001` | jipp001 | `vcol3` | 79e5aa36-0a84-4315-8daa-1528b0918670 | `quote` |
| 20 | `jwtoois001` | jwtoois001 | `vcol10` | b86590ed-a675-4707-9d7c-e99ab3268218 | `quote` |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 22 | `sczcx001` | sczcx001 | `vcol52` | String | `text` |
| 23 | `sjhl` | sjhl | `vcol50` | String | `text` |
| 24 | `tyz002` | tyz002 | `vcol11` | 916f2556-ab2c-4845-bf74-5b1ce6652078 | `quote` |
| 25 | `tz001` | tz001 | `vcol1` | 18904b12-27fb-451b-ab10-b68179c6abc7 | `quote` |
| 26 | `wms1223` | wms1223 | `vcol54` | String | `text` |
| 27 | `www111` | www111 | `vcol55` | String | `text` |
| 28 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（13 个）

- `fly01` -> `bd.customerdoc_LS001.LS001` () 
- `FKD102` -> `bd.customerdoc_000.000` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `jipp001` -> `bd.customerdoc_jipp001.jipp001` () 
- `eeeee222` -> `bd.customerdoc_test111.test111` () 
- `tyz002` -> `bd.customerdoc_tyz001.tyz001` () 
- `htfx` -> `bd.customerdoc_HTFX.HTFX` () 
- `JYYWLX` -> `bd.customerdoc_JYYWLX.JYYWLX` () 
- `tz001` -> `bd.customerdoc_zdy001.zdy001` () 
- `BZXM` -> `bd.customerdoc_BZXM.BZXM` () 
- `SCHD01` -> `bd.customerdoc_SCHD02.SCHD02` () 
- `W01` -> `bd.customerdoc_W01.W01` () 
- `jwtoois001` -> `bd.customerdoc_jwtooi001.jwtooi001` () 
