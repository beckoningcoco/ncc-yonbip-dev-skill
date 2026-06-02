---
tags: [BIP, 元数据, 数据字典, bd.duty.RankTZDefines]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 职级特征 (`bd.duty.RankTZDefines`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_rank_tz_defines` | 应用: `DPMSTF` | 类型: `Class`

## 属性（6 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `A111` | A111 | `vcol54` | String | `text` |
| 2 | `bxjb` | bxjb | `vcol1` | e8ed7b65-9c22-430b-936c-0f75088eca99 | `quote` |
| 3 | `id` | ID | `id` | String | `text` |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 5 | `wx154300` | wx154300 | `vcol55` | String | `text` |
| 6 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（2 个）

- `bxjb` -> `bd.customerdoc_bxjb.bxjb` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
