---
tags: [BIP, 元数据, 数据字典, aa.vendor.VendorCharacterDefine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 供应商特征自定义项 (`aa.vendor.VendorCharacterDefine`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_vendor_character_define` | 应用: `DPMSPL` | 类型: `Class`

## 属性（11 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `BM05` | BM05 | `bcol1` | Boolean | `switch` |
| 2 | `CQ001` | CQ001 | `vcol3` | 8f5f37eb-b437-42ae-b579-8cdb1f5c4de7 | `quote` |
| 3 | `CQHK007` | CQHK007 | `vcol2` | af9369eb-b1eb-4e5c-9170-47d0f6a070d4 | `quote` |
| 4 | `GYSLX` | GYSLX | `vcol1` | be53d2f7-648f-4b53-9d00-6c473f6bb8eb | `quote` |
| 5 | `YWTZ001` | YWTZ001 | `bcol50` | Boolean | `switch` |
| 6 | `gyste1` | gyste1 | `vcol55` | String | `text` |
| 7 | `id` | ID | `id` | String | `text` |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 9 | `ymtz004` | ymtz004 | `vcol54` | String | `text` |
| 10 | `ymtz005` | ymtz005 | `vcol4` | e236205a-f252-4f02-86f8-f3f825d1623a | `quote` |
| 11 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `CQHK007` -> `bd.customerdoc_0005.0005` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `CQ001` -> `bd.customerdoc_HCSupplierContry.HCSupplierContry` ()
- `ymtz005` -> `bd.customerdoc_ymzdyda01.ymzdyda01` ()
- `GYSLX` -> `bd.customerdoc_9435.9435` ()
