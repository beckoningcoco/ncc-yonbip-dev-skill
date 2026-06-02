---
tags: [BIP, 元数据, 数据字典, st.reservation.ReservationType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 跟踪线索类型主表 (`st.reservation.ReservationType`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_reservationtype` | 应用: `ST` | 类型: `Class`

## 属性（8 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `details` | details | `` | 6b3f95a7-dc06-4253-8745-74d6cf34ab09 | `` |
| 3 | `id` | ID | `id` | Long | `long` |
| 4 | `isSystem` | 是否System | `isSystem` | Short | `short` |
| 5 | `name` | 名称 | `name` | String | `multiLanguage` |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 7 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 8 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `details` -> `st.reservation.ReservationTypes` (1..n)
- `tenant` -> `base.tenant.Tenant` ()
