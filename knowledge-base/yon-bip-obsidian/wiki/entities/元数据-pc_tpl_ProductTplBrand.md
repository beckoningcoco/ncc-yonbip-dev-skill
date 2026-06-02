---
tags: [BIP, 元数据, 数据字典, pc.tpl.ProductTplBrand]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料模板-关联品牌 (`pc.tpl.ProductTplBrand`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `producttpl_brand` | 应用: `GZTBDM` | 类型: `Class`

## 属性（7 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `brand` | brand | `brand_id` | 75116b40-efe4-455e-b62d-d56ac4811eb1 | `quote` |
| 3 | `template` | template | `type_id` | c40d564b-d166-4e0e-875f-1fafdab28955 | `quote` |
| 4 | `ordernumber` | ordernumber | `ordernumber` | Integer | `int` |
| 5 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 7 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（4 个）

- `template` -> `pc.tpl.ProductTpl` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `brand` -> `pc.brand.Brand` ()
- `tenant` -> `base.tenant.Tenant` ()
