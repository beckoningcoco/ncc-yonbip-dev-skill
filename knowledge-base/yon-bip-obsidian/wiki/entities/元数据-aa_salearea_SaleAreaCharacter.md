---
tags: [BIP, 元数据, 数据字典, aa.salearea.SaleAreaCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售区域特征自定义项 (`aa.salearea.SaleAreaCharacter`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_salearea_character` | 应用: `DPMCUS` | 类型: `Class`

## 属性（4 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `XZQH` | XZQH | `XZQH` | 95577e23-979f-4f09-a629-61fea93e576d | `referenceList` |
| 2 | `id` | ID | `id` | String | `text` |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 4 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（2 个）

- `XZQH` -> `bd.region.BaseRegionVO` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
