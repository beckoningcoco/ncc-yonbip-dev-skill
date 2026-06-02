---
tags: [BIP, 元数据, 数据字典, pc.brand.BrandDefine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 品牌属性(自定义项)表 (`pc.brand.BrandDefine`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `branddefine` | 应用: `GZTBDM` | 类型: `Class`

## 属性（33 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `brandDefine1` | brandDefine1 | `define1` | String | `text` |
| 2 | `brandDefine10` | brandDefine10 | `define10` | String | `text` |
| 3 | `brandDefine11` | brandDefine11 | `define11` | String | `text` |
| 4 | `brandDefine12` | brandDefine12 | `define12` | String | `text` |
| 5 | `brandDefine13` | brandDefine13 | `define13` | String | `text` |
| 6 | `brandDefine14` | brandDefine14 | `define14` | String | `text` |
| 7 | `brandDefine15` | brandDefine15 | `define15` | String | `text` |
| 8 | `brandDefine16` | brandDefine16 | `define16` | String | `text` |
| 9 | `brandDefine17` | brandDefine17 | `define17` | String | `text` |
| 10 | `brandDefine18` | brandDefine18 | `define18` | String | `text` |
| 11 | `brandDefine19` | brandDefine19 | `define19` | String | `text` |
| 12 | `brandDefine2` | brandDefine2 | `define2` | String | `text` |
| 13 | `brandDefine20` | brandDefine20 | `define20` | String | `text` |
| 14 | `brandDefine21` | brandDefine21 | `define21` | String | `text` |
| 15 | `brandDefine22` | brandDefine22 | `define22` | String | `text` |
| 16 | `brandDefine23` | brandDefine23 | `define23` | String | `text` |
| 17 | `brandDefine24` | brandDefine24 | `define24` | String | `text` |
| 18 | `brandDefine25` | brandDefine25 | `define25` | String | `text` |
| 19 | `brandDefine26` | brandDefine26 | `define26` | String | `text` |
| 20 | `brandDefine27` | brandDefine27 | `define27` | String | `text` |
| 21 | `brandDefine28` | brandDefine28 | `define28` | String | `text` |
| 22 | `brandDefine29` | brandDefine29 | `define29` | String | `text` |
| 23 | `brandDefine3` | brandDefine3 | `define3` | String | `text` |
| 24 | `brandDefine30` | brandDefine30 | `define30` | String | `text` |
| 25 | `brandDefine4` | brandDefine4 | `define4` | String | `text` |
| 26 | `brandDefine5` | brandDefine5 | `define5` | String | `text` |
| 27 | `brandDefine6` | brandDefine6 | `define6` | String | `text` |
| 28 | `brandDefine7` | brandDefine7 | `define7` | String | `text` |
| 29 | `brandDefine8` | brandDefine8 | `define8` | String | `text` |
| 30 | `brandDefine9` | brandDefine9 | `define9` | String | `text` |
| 31 | `id` | ID | `id` | 75116b40-efe4-455e-b62d-d56ac4811eb1 | `quote` |
| 32 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 33 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `id` -> `pc.brand.Brand` (1)
- `tenant` -> `base.tenant.Tenant` ()
