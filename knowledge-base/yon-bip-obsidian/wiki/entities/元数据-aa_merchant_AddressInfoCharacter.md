---
tags: [BIP, 元数据, 数据字典, aa.merchant.AddressInfoCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户地址信息自定义项 (`aa.merchant.AddressInfoCharacter`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `address_info_character` | 应用: `DPMCUS` | 类型: `Class`

## 属性（7 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `A01` | A01 | `vcol2` | 729b48a0-0491-422e-b5f6-a5685a7b5090 | `quote` |
| 2 | `CQ011` | CQ011 | `lcol1` | 3198ce2d-0e64-462d-bacf-54d18171756a | `quote` |
| 3 | `CQ029` | CQ029 | `vcol55` | String | `text` |
| 4 | `CQ111` | CQ111 | `vcol1` | 7f5ae223-0579-4c27-a0f1-11bf4fd9ff45 | `quote` |
| 5 | `id` | ID | `id` | String | `text` |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 7 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `A01` -> `bd.customerdoc_A01.A01` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `CQ111` -> `bd.customerdoc_CQ111.CQ111` ()
- `CQ011` -> `aa.custcategory.CustCategory` ()
