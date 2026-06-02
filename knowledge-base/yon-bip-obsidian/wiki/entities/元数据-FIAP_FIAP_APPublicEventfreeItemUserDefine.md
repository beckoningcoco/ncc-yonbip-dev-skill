---
tags: [BIP, 元数据, 数据字典, FIAP.FIAP.APPublicEventfreeItemUserDefine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 应付公共基本信息自定义项 (`FIAP.FIAP.APPublicEventfreeItemUserDefine`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `arap_ledger_h_ch` | 应用: `EAP`

## 属性（12 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `CS0000001` | CS0000001 | `vcol51` | ConttypeEnum | `singleOption` |
| 2 | `GG001` | GG001 | `vcol7` | f488e107-f797-44f5-8502-094ed9f11983 | `quote` |
| 3 | `HTLX` | HTLX | `vcol6` | String | `text` |
| 4 | `W01` | W01 | `vcol10` | aba3c34d-f317-4317-9eaa-fe3e37ffda1d | `quote` |
| 5 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 6 | `fly01` | fly01 | `vcol3` | ba9e2e36-1270-4b7d-8da4-9571e15a0ec8 | `quote` |
| 7 | `htfx` | htfx | `vcol17` | da9b34be-90fa-4969-938b-e11c3aa5ff5a | `quote` |
| 8 | `id` | ID | `id` | String | `text` |
| 9 | `jipp001` | jipp001 | `vcol4` | 79e5aa36-0a84-4315-8daa-1528b0918670 | `quote` |
| 10 | `ld001_yw` | ld001_yw | `vcol55` | String | `text` |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 12 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（6 个）

- `fly01` -> `bd.customerdoc_LS001.LS001` () 
- `GG001` -> `bd.customerdoc_GG01.GG01` () 
- `W01` -> `bd.customerdoc_W01.W01` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `jipp001` -> `bd.customerdoc_jipp001.jipp001` () 
- `htfx` -> `bd.customerdoc_HTFX.HTFX` () 
