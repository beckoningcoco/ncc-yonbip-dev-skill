---
tags: [BIP, 元数据, 数据字典, earap.payment.PaymentBodyfreeChIdUserDefine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 付款单明细信息自定义项 (`earap.payment.PaymentBodyfreeChIdUserDefine`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `ap_payment_b_ch` | 应用: `EAP`

## 属性（21 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `BZXM` | BZXM | `vcol6` | 48cb63f7-de9b-4f60-915c-c989e31bbe2c | `quote` |
| 2 | `CS0000001` | CS0000001 | `vcol51` | ConttypeEnum | `singleOption` |
| 3 | `Eleven_Product_Color_Attribute` | Eleven_Product_Color_Attribute | `vcol1` | cf0d67fa-8cdb-448d-b794-7339f1689411 | `quote` |
| 4 | `JJX20251005` | JJX20251005 | `vcol9` | 2f8b75b4-6eb5-4ab9-929f-aaf8e5d3b118 | `quote` |
| 5 | `JYYWLX` | JYYWLX | `vcol8` | 9b1a1ef4-44af-43a6-a0cf-95d1f0e4cd6b | `quote` |
| 6 | `SCHJ` | SCHJ | `vcol53` | String | `text` |
| 7 | `UCU01` | UCU01 | `vcol52` | String | `text` |
| 8 | `W01` | W01 | `vcol5` | aba3c34d-f317-4317-9eaa-fe3e37ffda1d | `quote` |
| 9 | `XCJE` | XCJE | `ncol1` | Decimal | `number` |
| 10 | `XMZB` | XMZB | `vcol3` | 5df8e763-5595-4a87-9ff9-a7ac3bd1e81e | `quote` |
| 11 | `YCL07` | YCL07 | `vcol4` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |
| 12 | `cyfkmudi` | cyfkmudi | `vcol54` | String | `text` |
| 13 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 14 | `eeeee222` | eeeee222 | `vcol7` | 69adc389-4644-4d69-9d87-241d5d713cdd | `quote` |
| 15 | `htfx` | htfx | `vcol11` | da9b34be-90fa-4969-938b-e11c3aa5ff5a | `quote` |
| 16 | `id` | ID | `id` | String | `text` |
| 17 | `jipp001` | jipp001 | `vcol2` | 79e5aa36-0a84-4315-8daa-1528b0918670 | `quote` |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 19 | `tyz002` | tyz002 | `vcol10` | 916f2556-ab2c-4845-bf74-5b1ce6652078 | `quote` |
| 20 | `www111` | www111 | `vcol55` | String | `text` |
| 21 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（12 个）

- `BZXM` -> `bd.customerdoc_BZXM.BZXM` () 
- `XMZB` -> `epub.accountbook.AccountBook` () 
- `W01` -> `bd.customerdoc_W01.W01` () 
- `Eleven_Product_Color_Attribute` -> `bd.customerdoc_Eleven_Product_Color_Attribute.Eleven_Product_Color_Attribute` () 
- `JJX20251005` -> `bd.customerdoc_jjx20251005.jjx20251005` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `YCL07` -> `org.func.FinanceOrg` () 
- `jipp001` -> `bd.customerdoc_jipp001.jipp001` () 
- `eeeee222` -> `bd.customerdoc_test111.test111` () 
- `tyz002` -> `bd.customerdoc_tyz001.tyz001` () 
- `htfx` -> `bd.customerdoc_HTFX.HTFX` () 
- `JYYWLX` -> `bd.customerdoc_JYYWLX.JYYWLX` () 
