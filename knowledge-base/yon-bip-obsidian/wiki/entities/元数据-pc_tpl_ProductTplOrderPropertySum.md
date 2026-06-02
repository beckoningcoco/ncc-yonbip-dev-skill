---
tags: [BIP, 元数据, 数据字典, pc.tpl.ProductTplOrderPropertySum]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料模板-订单属性 (`pc.tpl.ProductTplOrderPropertySum`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `product_tpl_orderprop` | 应用: `GZTBDM` | 类型: `Class`

## 属性（10 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `alias` | alias | `propertyAlias` | String | `text` |
| 2 | `id` | ID | `id` | Long | `long` |
| 3 | `isRequired` | 是否Required | `isWebRequired` | Boolean | `switch` |
| 4 | `isShow` | 是否Show | `isShow` | Boolean | `switch` |
| 5 | `limitNum` | limitNum | `iLimitNum` | Integer | `int` |
| 6 | `order` | order | `ordernumber` | Integer | `int` |
| 7 | `propertyType` | propertyType | `propertyType` | 8420b5e5-7919-41ca-a192-7b8c4fb1d8b8 | `quote` |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 9 | `template` | template | `tpl_id` | c40d564b-d166-4e0e-875f-1fafdab28955 | `quote` |
| 10 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `template` -> `pc.tpl.ProductTpl` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `propertyType` -> `pc.userdef.UserDefineClass` ()
