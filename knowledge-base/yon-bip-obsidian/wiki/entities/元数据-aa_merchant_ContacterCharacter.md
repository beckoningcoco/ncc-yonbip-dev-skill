---
tags: [BIP, 元数据, 数据字典, aa.merchant.ContacterCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户联系人信息自定义项 (`aa.merchant.ContacterCharacter`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `contacter_character` | 应用: `DPMCUS` | 类型: `Class`

## 属性（5 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `A01` | A01 | `vcol1` | 729b48a0-0491-422e-b5f6-a5685a7b5090 | `quote` |
| 2 | `KHZW` | KHZW | `vcol55` | String | `text` |
| 3 | `id` | ID | `id` | String | `text` |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 5 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（2 个）

- `A01` -> `bd.customerdoc_A01.A01` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
