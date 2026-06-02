---
tags: [BIP, 元数据, 数据字典, bd.project.ProjectVODefineCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目自定义项 (`bd.project.ProjectVODefineCharacter`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_project_character_define` | 应用: `DPMPRJ` | 类型: `Class`

## 属性（10 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `CR20260001` | CR20260001 | `vcol55` | String | `text` |
| 2 | `CR20260002` | CR20260002 | `vcol54` | String | `link` |
| 3 | `TZ0011` | TZ0011 | `vcol3` | 44754eb0-bbcd-4dcd-8d25-a88211a6f64c | `quote` |
| 4 | `XMZB` | XMZB | `vcol2` | 5df8e763-5595-4a87-9ff9-a7ac3bd1e81e | `quote` |
| 5 | `YCK009` | YCK009 | `bcol1` | Boolean | `switch` |
| 6 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 7 | `id` | ID | `id` | String | `text` |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 9 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 10 | `zyx001` | zyx001 | `vcol1` | 5df09ac0-6ac7-4e55-ac48-17709225ed24 | `quote` |

## 关联（4 个）

- `XMZB` -> `epub.accountbook.AccountBook` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `TZ0011` -> `bd.customerdoc_ZDY0011.ZDY0011` ()
- `zyx001` -> `bd.customerdoc_ZYX01.ZYX01` ()
