---
tags: [BIP, 元数据, 数据字典, aa.merchant.CustomerDefine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户(自定义项)表(废弃) (`aa.merchant.CustomerDefine`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `customerdefine` | 应用: `DPMCUS` | 类型: `Class`

## 属性（35 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `customerDefine1` | customerDefine1 | `define1` | String | `text` |
| 2 | `customerDefine10` | customerDefine10 | `define10` | String | `text` |
| 3 | `customerDefine11` | customerDefine11 | `define11` | String | `text` |
| 4 | `customerDefine12` | customerDefine12 | `define12` | String | `text` |
| 5 | `customerDefine13` | customerDefine13 | `define13` | String | `text` |
| 6 | `customerDefine14` | customerDefine14 | `define14` | String | `text` |
| 7 | `customerDefine15` | customerDefine15 | `define15` | String | `text` |
| 8 | `customerDefine16` | customerDefine16 | `define16` | String | `text` |
| 9 | `customerDefine17` | customerDefine17 | `define17` | String | `text` |
| 10 | `customerDefine18` | customerDefine18 | `define18` | String | `text` |
| 11 | `customerDefine19` | customerDefine19 | `define19` | String | `text` |
| 12 | `customerDefine2` | customerDefine2 | `define2` | String | `text` |
| 13 | `customerDefine20` | customerDefine20 | `define20` | String | `text` |
| 14 | `customerDefine21` | customerDefine21 | `define21` | String | `text` |
| 15 | `customerDefine22` | customerDefine22 | `define22` | String | `text` |
| 16 | `customerDefine23` | customerDefine23 | `define23` | String | `text` |
| 17 | `customerDefine24` | customerDefine24 | `define24` | String | `text` |
| 18 | `customerDefine25` | customerDefine25 | `define25` | String | `text` |
| 19 | `customerDefine26` | customerDefine26 | `define26` | String | `text` |
| 20 | `customerDefine27` | customerDefine27 | `define27` | String | `text` |
| 21 | `customerDefine28` | customerDefine28 | `define28` | String | `text` |
| 22 | `customerDefine29` | customerDefine29 | `define29` | String | `text` |
| 23 | `customerDefine3` | customerDefine3 | `define3` | String | `text` |
| 24 | `customerDefine30` | customerDefine30 | `define30` | String | `text` |
| 25 | `customerDefine4` | customerDefine4 | `define4` | String | `text` |
| 26 | `customerDefine5` | customerDefine5 | `define5` | String | `text` |
| 27 | `customerDefine6` | customerDefine6 | `define6` | String | `text` |
| 28 | `customerDefine7` | customerDefine7 | `define7` | String | `text` |
| 29 | `customerDefine8` | customerDefine8 | `define8` | String | `text` |
| 30 | `customerDefine9` | customerDefine9 | `define9` | String | `text` |
| 31 | `id` | ID | `id` | Long | `long` |
| 32 | `merchantId` | merchantID | `imerchantId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 33 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 34 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 35 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `merchantId` -> `aa.merchant.Merchant` (1)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `tenant` -> `base.tenant.Tenant` ()
