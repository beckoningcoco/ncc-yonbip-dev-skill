---
tags: [BIP, 元数据, 数据字典, aa.settlemethod.SettleMethodDefineCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 结算方式自定义项 (`aa.settlemethod.SettleMethodDefineCharacter`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `settle_method_character_define` | 应用: `DPMSETL` | 类型: `Class`

## 属性（5 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `CLX01` | CLX01 | `vcol55` | String | `text` |
| 2 | `CLX02` | CLX02 | `vcol1` | b9dcc421-d980-4ecd-81b0-7952a682055a | `quote` |
| 3 | `id` | ID | `id` | String | `text` |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 5 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（2 个）

- `CLX02` -> `bd.customerdoc_11.11` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
