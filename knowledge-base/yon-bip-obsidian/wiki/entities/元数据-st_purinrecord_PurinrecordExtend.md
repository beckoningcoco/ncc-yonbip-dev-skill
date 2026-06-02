---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, st.purinrecord.PurinrecordExtend]
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
# 采购入库单主表平行表 (`st.purinrecord.PurinrecordExtend`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_purinrecord_extend` | 应用: `ST`

## 属性（3 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `dependentTaskType` | dependentTaskType | `dependentTaskType` | String | `text` |
| 2 | `id` | ID | `id` | f27abe81-1a48-4c58-b5fd-9a49a519276e | `quote` |
| 3 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（2 个）

- `ytenant` -> `yht.tenant.YhtTenant` () 
- `id` -> `st.purinrecord.PurInRecord` (1) 
