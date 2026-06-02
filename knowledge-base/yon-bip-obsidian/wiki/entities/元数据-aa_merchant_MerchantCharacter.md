---
tags: [BIP, 元数据, 数据字典, aa.merchant.MerchantCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户基本信息自定义项 (`aa.merchant.MerchantCharacter`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `merchant_character` | 应用: `DPMCUS` | 类型: `Class`

## 属性（15 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `A01` | A01 | `vcol5` | 729b48a0-0491-422e-b5f6-a5685a7b5090 | `quote` |
| 2 | `AAAS01` | AAAS01 | `vcol54` | String | `text` |
| 3 | `AL02` | AL02 | `vcol4` | ea9bcc46-2be2-40b5-804a-9b0c336b9790 | `quote` |
| 4 | `CQ0027` | CQ0027 | `vcol55` | sendMIS | `singleOption` |
| 5 | `FL0401` | FL0401 | `lcol1` | 59ec0b4d-4e38-483d-9bdd-e7aa44176ce8 | `quote` |
| 6 | `I_FM_XX_D_PF001` | I_FM_XX_D_PF001 | `bcol1` | Boolean | `switch` |
| 7 | `I_FM_XX_D_PF002` | I_FM_XX_D_PF002 | `vcol2` | String | `text` |
| 8 | `I_FM_XX_D_PF003` | I_FM_XX_D_PF003 | `vcol3` | ctrttype | `singleOption` |
| 9 | `I_FM_XX_D_PF004` | I_FM_XX_D_PF004 | `dcol1` | Date | `date` |
| 10 | `QY` | QY | `vcol1` | 95577e23-979f-4f09-a629-61fea93e576d | `quote` |
| 11 | `YWTZ001` | YWTZ001 | `bcol50` | Boolean | `switch` |
| 12 | `id` | ID | `id` | String | `text` |
| 13 | `khtzlch` | khtzlch | `ncol50` | Decimal | `number` |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 15 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `A01` -> `bd.customerdoc_A01.A01` ()
- `AL02` -> `bd.customerdoc_AL002.AL002` ()
- `FL0401` -> `aa.vendorclass.VendorClass` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `QY` -> `bd.region.BaseRegionVO` ()
