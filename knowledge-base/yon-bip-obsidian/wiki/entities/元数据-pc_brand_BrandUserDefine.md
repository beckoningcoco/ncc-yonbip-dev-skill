---
tags: [BIP, 元数据, 数据字典, pc.brand.BrandUserDefine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 品牌自定义项 (`pc.brand.BrandUserDefine`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `brand_userdefine` | 应用: `GZTBDM` | 类型: `Class`

## 属性（63 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | 75116b40-efe4-455e-b62d-d56ac4811eb1 | `quote` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 4 | `define1` | define1 | `define1` | String | `text` |
| 5 | `define2` | define2 | `define2` | String | `text` |
| 6 | `define3` | define3 | `define3` | String | `text` |
| 7 | `define4` | define4 | `define4` | String | `text` |
| 8 | `define5` | define5 | `define5` | String | `text` |
| 9 | `define6` | define6 | `define6` | String | `text` |
| 10 | `define7` | define7 | `define7` | String | `text` |
| 11 | `define8` | define8 | `define8` | String | `text` |
| 12 | `define9` | define9 | `define9` | String | `text` |
| 13 | `define10` | define10 | `define10` | String | `text` |
| 14 | `define11` | define11 | `define11` | String | `text` |
| 15 | `define12` | define12 | `define12` | String | `text` |
| 16 | `define13` | define13 | `define13` | String | `text` |
| 17 | `define14` | define14 | `define14` | String | `text` |
| 18 | `define15` | define15 | `define15` | String | `text` |
| 19 | `define16` | define16 | `define16` | String | `text` |
| 20 | `define17` | define17 | `define17` | String | `text` |
| 21 | `define18` | define18 | `define18` | String | `text` |
| 22 | `define19` | define19 | `define19` | String | `text` |
| 23 | `define20` | define20 | `define20` | String | `text` |
| 24 | `define21` | define21 | `define21` | String | `text` |
| 25 | `define22` | define22 | `define22` | String | `text` |
| 26 | `define23` | define23 | `define23` | String | `text` |
| 27 | `define24` | define24 | `define24` | String | `text` |
| 28 | `define25` | define25 | `define25` | String | `text` |
| 29 | `define26` | define26 | `define26` | String | `text` |
| 30 | `define27` | define27 | `define27` | String | `text` |
| 31 | `define28` | define28 | `define28` | String | `text` |
| 32 | `define29` | define29 | `define29` | String | `text` |
| 33 | `define30` | define30 | `define30` | String | `text` |
| 34 | `define31` | define31 | `define31` | String | `text` |
| 35 | `define32` | define32 | `define32` | String | `text` |
| 36 | `define33` | define33 | `define33` | String | `text` |
| 37 | `define34` | define34 | `define34` | String | `text` |
| 38 | `define35` | define35 | `define35` | String | `text` |
| 39 | `define36` | define36 | `define36` | String | `text` |
| 40 | `define37` | define37 | `define37` | String | `text` |
| 41 | `define38` | define38 | `define38` | String | `text` |
| 42 | `define39` | define39 | `define39` | String | `text` |
| 43 | `define40` | define40 | `define40` | String | `text` |
| 44 | `define41` | define41 | `define41` | String | `text` |
| 45 | `define42` | define42 | `define42` | String | `text` |
| 46 | `define43` | define43 | `define43` | String | `text` |
| 47 | `define44` | define44 | `define44` | String | `text` |
| 48 | `define45` | define45 | `define45` | String | `text` |
| 49 | `define46` | define46 | `define46` | String | `text` |
| 50 | `define47` | define47 | `define47` | String | `text` |
| 51 | `define48` | define48 | `define48` | String | `text` |
| 52 | `define49` | define49 | `define49` | String | `text` |
| 53 | `define50` | define50 | `define50` | String | `text` |
| 54 | `define51` | define51 | `define51` | String | `text` |
| 55 | `define52` | define52 | `define52` | String | `text` |
| 56 | `define53` | define53 | `define53` | String | `text` |
| 57 | `define54` | define54 | `define54` | String | `text` |
| 58 | `define55` | define55 | `define55` | String | `text` |
| 59 | `define56` | define56 | `define56` | String | `text` |
| 60 | `define57` | define57 | `define57` | String | `text` |
| 61 | `define58` | define58 | `define58` | String | `text` |
| 62 | `define59` | define59 | `define59` | String | `text` |
| 63 | `define60` | define60 | `define60` | String | `text` |

## 关联（3 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `id` -> `pc.brand.Brand` (1)
- `tenant` -> `base.tenant.Tenant` ()
