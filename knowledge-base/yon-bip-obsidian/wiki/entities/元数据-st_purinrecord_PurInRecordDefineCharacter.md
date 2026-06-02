---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, st.purinrecord.PurInRecordDefineCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
parent_entity: st.purinrecord.PurInRecord
---
# 采购入库主表自定义项特征实体 (`st.purinrecord.PurInRecordDefineCharacter`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `purinrecord_character_define` | 应用: `ST`

## 属性（16 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `CTcolour` | CTcolour | `vcol1` | da13b59a-d5d7-4abf-a6ef-fc35eb9d6eac | `quote` |
| 2 | `Debitkh` | Debitkh | `lcol2` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 3 | `LXQ00005` | LXQ00005 | `lcol1` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 4 | `ND001` | ND001 | `vcol5` | String | `text` |
| 5 | `ND002` | ND002 | `vcol6` | 4307f1eb-e1bc-4bc9-b3cb-6ac3a87ab50f | `quote` |
| 6 | `TZZD20041211` | TZZD20041211 | `lcol3` | f27abe81-1a48-4c58-b5fd-9a49a519276e | `quote` |
| 7 | `ZP_01` | ZP_01 | `vcol2` | aafcda72-f43e-43ff-ba0b-f861a544870a | `quote` |
| 8 | `ZYWTZ02` | ZYWTZ02 | `vcol54` | String | `text` |
| 9 | `gpy02` | gpy02 | `vcol4` | String | `text` |
| 10 | `hq` | hq | `vcol3` | 821ea9e7-d7ee-4a8f-af1c-89faadf18e5f | `quote` |
| 11 | `id` | ID | `id` | String | `text` |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 13 | `wj0123` | wj0123 | `vcol55` | String | `text` |
| 14 | `yhtqy` | yhtqy | `lcol4` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 15 | `ysfs` | ysfs | `vcol7` | 68ff79fc-9f91-4713-bba0-816eddc5c8b8 | `quote` |
| 16 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（10 个）

- `ZP_01` -> `bd.customerdoc_ZP01.ZP01` () 
- `LXQ00005` -> `aa.warehouse.Warehouse` () 
- `TZZD20041211` -> `st.purinrecord.PurInRecord` () 
- `CTcolour` -> `bd.customerdoc_CT001.CT001` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `ND002` -> `AT1EAFDFE83EF80003.AT1EAFDFE83EF80003.i92076_xs01` () 
- `yhtqy` -> `aa.warehouse.Warehouse` () 
- `hq` -> `bd.customerdoc_wxwdc01.wxwdc01` () 
- `Debitkh` -> `aa.merchant.Merchant` () 
- `ysfs` -> `bd.customerdoc_ysfs.ysfs` () 
