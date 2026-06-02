---
tags: [BIP, 元数据, 数据字典, pc.product.ProductDefine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料属性(自定义项)表 (`pc.product.ProductDefine`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `productdefine` | 应用: `GZTBDM` | 类型: `Class`

## 属性（35 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `tenant` | tenant | `tenant_id` | Long | `long` |
| 4 | `productId` | productID | `productId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 5 | `define1` | define1 | `define1` | String | `text` |
| 6 | `define2` | define2 | `define2` | String | `text` |
| 7 | `define3` | define3 | `define3` | String | `text` |
| 8 | `define4` | define4 | `define4` | String | `text` |
| 9 | `define5` | define5 | `define5` | String | `text` |
| 10 | `define6` | define6 | `define6` | String | `text` |
| 11 | `define7` | define7 | `define7` | String | `text` |
| 12 | `define8` | define8 | `define8` | String | `text` |
| 13 | `define9` | define9 | `define9` | String | `text` |
| 14 | `define10` | define10 | `define10` | String | `text` |
| 15 | `define11` | define11 | `define11` | String | `text` |
| 16 | `define12` | define12 | `define12` | String | `text` |
| 17 | `define13` | define13 | `define13` | String | `text` |
| 18 | `define14` | define14 | `define14` | String | `text` |
| 19 | `define15` | define15 | `define15` | String | `text` |
| 20 | `define16` | define16 | `define16` | String | `text` |
| 21 | `define17` | define17 | `define17` | String | `text` |
| 22 | `define18` | define18 | `define18` | String | `text` |
| 23 | `define19` | define19 | `define19` | String | `text` |
| 24 | `define20` | define20 | `define20` | String | `text` |
| 25 | `define21` | define21 | `define21` | String | `text` |
| 26 | `define22` | define22 | `define22` | String | `text` |
| 27 | `define23` | define23 | `define23` | String | `text` |
| 28 | `define24` | define24 | `define24` | String | `text` |
| 29 | `define25` | define25 | `define25` | String | `text` |
| 30 | `define26` | define26 | `define26` | String | `text` |
| 31 | `define27` | define27 | `define27` | String | `text` |
| 32 | `define28` | define28 | `define28` | String | `text` |
| 33 | `define29` | define29 | `define29` | String | `text` |
| 34 | `define30` | define30 | `define30` | String | `text` |
| 35 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |

## 关联（2 个）

- `productId` -> `pc.product.Product` (1)
- `ytenant` -> `yht.tenant.YhtTenant` ()
