---
tags: [BIP, 元数据, 数据字典, 其他入库, ST, st.othinrecord.OthInRecordParallel]
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
# 其他入库库单主表平行表 (`st.othinrecord.OthInRecordParallel`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_othinrecord_parallel` | 应用: `ST`

## 属性（4 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `fiSplitType` | fiSplitType | `fi_split_type` | Short | `short` |
| 2 | `id` | ID | `id` | 7e2e8c06-07d7-41a2-8b9f-a7e7add74c76 | `quote` |
| 3 | `returnDifferenceFlag` | returnDifferenceFlag | `return_difference_flag` | Short | `short` |
| 4 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（2 个）

- `ytenant` -> `yht.tenant.YhtTenant` () 
- `id` -> `st.othinrecord.OthInRecord` (1) 
