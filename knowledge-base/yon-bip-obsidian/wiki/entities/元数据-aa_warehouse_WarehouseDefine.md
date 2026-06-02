---
tags: [BIP, 元数据, 数据字典, aa.warehouse.WarehouseDefine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 仓库档案自定义项 (`aa.warehouse.WarehouseDefine`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_warehouse_define` | 应用: `DPMSI` | 类型: `Class`

## 属性（33 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `define1` | define1 | `define1` | String | `text` |
| 2 | `define2` | define2 | `define2` | String | `text` |
| 3 | `define3` | define3 | `define3` | String | `text` |
| 4 | `define4` | define4 | `define4` | String | `text` |
| 5 | `define5` | define5 | `define5` | String | `text` |
| 6 | `define6` | define6 | `define6` | String | `text` |
| 7 | `define7` | define7 | `define7` | String | `text` |
| 8 | `define8` | define8 | `define8` | String | `text` |
| 9 | `define9` | define9 | `define9` | String | `text` |
| 10 | `define10` | define10 | `define10` | String | `text` |
| 11 | `define11` | define11 | `define11` | String | `text` |
| 12 | `define12` | define12 | `define12` | String | `text` |
| 13 | `define13` | define13 | `define13` | String | `text` |
| 14 | `define14` | define14 | `define14` | String | `text` |
| 15 | `define15` | define15 | `define15` | String | `text` |
| 16 | `define16` | define16 | `define16` | String | `text` |
| 17 | `define17` | define17 | `define17` | String | `text` |
| 18 | `define18` | define18 | `define18` | String | `text` |
| 19 | `define19` | define19 | `define19` | String | `text` |
| 20 | `define20` | define20 | `define20` | String | `text` |
| 21 | `define21` | define21 | `define21` | String | `text` |
| 22 | `define22` | define22 | `define22` | String | `text` |
| 23 | `define23` | define23 | `define23` | String | `text` |
| 24 | `define24` | define24 | `define24` | String | `text` |
| 25 | `define25` | define25 | `define25` | String | `text` |
| 26 | `define26` | define26 | `define26` | String | `text` |
| 27 | `define27` | define27 | `define27` | String | `text` |
| 28 | `define28` | define28 | `define28` | String | `text` |
| 29 | `define29` | define29 | `define29` | String | `text` |
| 30 | `define30` | define30 | `define30` | String | `text` |
| 31 | `id` | ID | `id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 32 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 33 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（3 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `id` -> `aa.warehouse.Warehouse` (1)
- `tenant` -> `base.tenant.Tenant` ()
