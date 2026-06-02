---
tags: [BIP, 元数据, 数据字典, bd.virtualaccbody.VirtualAccbody_view]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 虚拟会计主体参照 (`bd.virtualaccbody.VirtualAccbody_view`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_virtualaccbody` | 应用: `DPMACCT` | 类型: `Class`

## 属性（32 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `accperiodscheme` | accperiodscheme | `accperiodscheme` | e7bb3d2b-b288-4696-b5f0-a9b0626cded8 | `quote` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `country` | country | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 4 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 5 | `description` | description | `description` | String | `multiLanguage` |
| 6 | `displayOrder` | displayOrder | `display_order` | Integer | `int` |
| 7 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 8 | `enabledate` | enabledate | `enabledate` | DateTime | `timestamp` |
| 9 | `exchangerate` | exchangerate | `exchangerate` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 10 | `expiredate` | expiredate | `expiredate` | DateTime | `timestamp` |
| 11 | `id` | ID | `id` | String | `text` |
| 12 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 13 | `is_virtualaccbody` | 是否_virtualaccbody | `is_virtualaccbody` | Boolean | `switch` |
| 14 | `isexternal` | 是否external | `isexternal` | Boolean | `switch` |
| 15 | `isinner` | 是否inner | `isinner` | Boolean | `switch` |
| 16 | `level` | 层级 | `level` | Integer | `int` |
| 17 | `liableperson` | liableperson | `liableperson` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 18 | `name` | 名称 | `name` | String | `multiLanguage` |
| 19 | `orgid` | orgid | `orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 20 | `orgtype` | orgtype | `orgtype` | String | `text` |
| 21 | `parent` | parent | `parent` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 22 | `parentid` | parentid | `parent` | String | `text` |
| 23 | `path` | path | `path` | String | `text` |
| 24 | `shortname` | shortname | `shortname` | String | `multiLanguage` |
| 25 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 26 | `source` | source | `source` | Short | `short` |
| 27 | `status` | 状态 | `status` | Short | `short` |
| 28 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 29 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 30 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 31 | `timezone` | timezone | `timezone` | String | `text` |
| 32 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（9 个）

- `country` -> `bd.country.CountryVO` ()
- `liableperson` -> `bd.staff.Staff` ()
- `parent` -> `bd.virtualaccbody.VirtualAccbody` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `exchangerate` -> `bd.exchangeRate.ExchangeRateTypeVO` ()
- `accperiodscheme` -> `bd.period.AccPeriodScheme` ()
- `currency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `orgid` -> `org.func.BaseOrg` ()
- `tenant` -> `base.tenant.Tenant` ()
