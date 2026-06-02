---
tags: [BIP, 元数据, 数据字典, FIAP.FIAP.TaxCalculationResultARAPfreeChIdUserDefine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 计税单基类新_自定义特征实体 (`FIAP.FIAP.TaxCalculationResultARAPfreeChIdUserDefine`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `arap_ledger_g_taxcalc_ch` | 应用: `EAP`

## 属性（12 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `CS0000001` | CS0000001 | `vcol54` | ConttypeEnum | `singleOption` |
| 2 | `CS0000004` | CS0000004 | `lcol2` | 84a309b9-2fd0-48d8-9b75-8251a20928c2 | `quote` |
| 3 | `DSDFZZB` | DSDFZZB | `lcol1` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 4 | `DSDW` | DSDW | `vcol2` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 5 | `JYYWLX` | JYYWLX | `vcol3` | 9b1a1ef4-44af-43a6-a0cf-95d1f0e4cd6b | `quote` |
| 6 | `W01` | W01 | `vcol1` | aba3c34d-f317-4317-9eaa-fe3e37ffda1d | `quote` |
| 7 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 8 | `htfx` | htfx | `vcol4` | da9b34be-90fa-4969-938b-e11c3aa5ff5a | `quote` |
| 9 | `id` | ID | `id` | String | `text` |
| 10 | `ld001_yw` | ld001_yw | `vcol55` | String | `text` |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 12 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（7 个）

- `DSDW` -> `aa.baseorg.OrgMV` () 
- `DSDFZZB` -> `aa.vendor.Vendor` () 
- `W01` -> `bd.customerdoc_W01.W01` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `CS0000004` -> `apct.contract.Apct` () 
- `htfx` -> `bd.customerdoc_HTFX.HTFX` () 
- `JYYWLX` -> `bd.customerdoc_JYYWLX.JYYWLX` () 
