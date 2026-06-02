---
tags: [BIP, 元数据, 数据字典, aa.baseorg.FinanceOrgMV]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会计主体 (`aa.baseorg.FinanceOrgMV`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_fin` | 应用: `GZTORG` | 类型: `Class`

## 属性（49 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `accountingcalendar` | accountingcalendar | `accountingcalendar` | String | `text` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `coder0e0` | coder0e0 | `currency` | String | `text` |
| 4 | `createDate` | 创建日期 | `creationtime` | Date | `date` |
| 5 | `sourcetype` | sourcetype | `source_type` | Integer | `int` |
| 6 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 7 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 8 | `creator` | 创建人 | `creator` | String | `text` |
| 9 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 10 | `currencyCode` | currency编码 | `currency` | String | `text` |
| 11 | `currencyName` | currency名称 | `currency` | String | `text` |
| 12 | `customerId` | customerID | `dr` | Integer | `int` |
| 13 | `displayorder` | displayorder | `displayorder` | Integer | `int` |
| 14 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 15 | `eaiCode` | eai编码 | `tenantid` | String | `text` |
| 16 | `erpCode` | erp编码 | `tenantid` | String | `text` |
| 17 | `exchangerate` | exchangerate | `exchangerate` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 18 | `externalorg` | externalorg | `external_org` | Integer | `int` |
| 19 | `fullname` | fullname | `name` | String | `multiLanguage` |
| 20 | `id` | ID | `id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 21 | `isEnd` | 是否End | `isEnd` | Integer | `int` |
| 22 | `isGlobal` | 是否Global | `isEnd` | Integer | `int` |
| 23 | `level` | 层级 | `level` | Integer | `int` |
| 24 | `localtaxregnum` | localtaxregnum | `localtaxregnum` | String | `text` |
| 25 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 26 | `modifier` | 修改人 | `modifier` | String | `text` |
| 27 | `modifyDate` | 修改日期 | `modifiedtime` | Date | `date` |
| 28 | `name` | 名称 | `name` | String | `multiLanguage` |
| 29 | `namer0e0` | namer0e0 | `currency` | String | `multiLanguage` |
| 30 | `org` | org | `orgid` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 31 | `orgFunc` | orgFunc | `tenantid` | String | `text` |
| 32 | `orgid` | orgid | `orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 33 | `orglevel` | orglevel | `orglevel` | String | `text` |
| 34 | `parent` | parent | `parentid` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |
| 35 | `parentid` | parentid | `parentid` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |
| 36 | `parentorgid` | parentorgid | `parentid` | String | `text` |
| 37 | `path` | path | `id` | String | `text` |
| 38 | `periodschema` | periodschema | `periodschema` | e7bb3d2b-b288-4696-b5f0-a9b0626cded8 | `quote` |
| 39 | `principal` | principal | `principal` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 40 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 41 | `region` | region | `region` | String | `text` |
| 42 | `sort` | 排序 | `displayorder` | Integer | `int` |
| 43 | `statetaxregnum` | statetaxregnum | `statetaxregnum` | String | `text` |
| 44 | `stopstatus` | stopstatus | `enable` | Integer | `int` |
| 45 | `stoptime` | stoptime | `modifiedtime` | DateTime | `timestamp` |
| 46 | `taxPayingCategories` | taxPayingCategories | `taxpayertype` | Integer | `int` |
| 47 | `taxpayerid` | taxpayerid | `taxpayerid` | String | `text` |
| 48 | `tenant` | tenant | `tenantid` | String | `text` |
| 49 | `ts` | ts | `ts` | DateTime | `timestamp` |

## 关联（10 个）

- `principal` -> `bd.staff.Staff` ()
- `parent` -> `org.func.FinanceOrg` ()
- `org` -> `aa.baseorg.OrgMV` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `exchangerate` -> `bd.exchangeRate.ExchangeRateTypeVO` ()
- `periodschema` -> `bd.period.AccPeriodScheme` ()
- `currency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `id` -> `aa.baseorg.OrgMV` (1)
- `orgid` -> `org.func.BaseOrg` ()
- `parentid` -> `org.func.FinanceOrg` ()
