---
tags: [BIP, 元数据, 数据字典, 其他入库, ST, st.othinrecord.OthInRecordDefineCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
parent_entity: st.othinrecord.OthInRecord
---
# 其他入库主表自定义项特征实体 (`st.othinrecord.OthInRecordDefineCharacter`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `othinrecord_character_define` | 应用: `ST`

## 属性（4 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `YRL_CX` | YRL_CX | `vcol1` | 18109107-852f-4fca-add4-255ae4862542 | `quote` |
| 2 | `id` | ID | `id` | String | `text` |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 4 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（2 个）

- `ytenant` -> `yht.tenant.YhtTenant` () 
- `YRL_CX` -> `bd.customerdoc_YRL_CX.YRL_CX` () 
