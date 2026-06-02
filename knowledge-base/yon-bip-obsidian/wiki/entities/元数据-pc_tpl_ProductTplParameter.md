---
tags: [BIP, 元数据, 数据字典, pc.tpl.ProductTplParameter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料模板-物料参数 (`pc.tpl.ProductTplParameter`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `product_tpl_parameter` | 应用: `GZTBDM` | 类型: `Class`

## 属性（10 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `group` | group | `group` | String | `multiLanguage` |
| 3 | `isFilter` | 是否Filter | `isFilter` | Boolean | `switch` |
| 4 | `name` | 名称 | `cName` | String | `multiLanguage` |
| 5 | `parent` | parent | `iParentParamId` | c06be101-c80b-40a1-b607-c41329151c48 | `quote` |
| 6 | `template` | template | `tpl_id` | c40d564b-d166-4e0e-875f-1fafdab28955 | `quote` |
| 7 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 8 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 10 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（4 个）

- `template` -> `pc.tpl.ProductTpl` (0..n)
- `parent` -> `pc.tpl.ProductTplParameter` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `tenant` -> `base.tenant.Tenant` ()
