---
tags: [BIP, 元数据, 数据字典, bd.adminOrg.FinanceOrgVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会计主体(废弃) (`bd.adminOrg.FinanceOrgVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_fin` | 应用: `GZTORG` | 类型: `Class`

## 属性（46 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `orgid` | orgid | `orgid` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 3 | `parentid` | parentid | `parentid` | 4928db62-a46d-4829-a26a-1de4bb3bf98c | `quote` |
| 4 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 5 | `enable` | enable | `enable` | Integer | `int` |
| 6 | `effectivedate` | effectivedate | `effectivedate` | DateTime | `timestamp` |
| 7 | `expirationdate` | expirationdate | `expirationdate` | DateTime | `timestamp` |
| 8 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 9 | `accountingcalendar` | accountingcalendar | `accountingcalendar` | String | `text` |
| 10 | `address` | address | `address` | String | `text` |
| 11 | `branchleader` | branchleader | `branchleader` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 12 | `businessid` | businessid | `businessid` | String | `text` |
| 13 | `code` | 编码 | `code` | String | `text` |
| 14 | `companytype` | companytype | `companytype` | 45cbc79d-a41a-41e4-af94-b264ce83596a | `quote` |
| 15 | `contact` | contact | `contact` | String | `text` |
| 16 | `countryzone` | countryzone | `countryzone` | String | `text` |
| 17 | `description` | description | `description` | String | `text` |
| 18 | `displayorder` | displayorder | `displayorder` | Integer | `int` |
| 19 | `externalorg` | externalorg | `external_org` | Integer | `int` |
| 20 | `innercode` | innercode | `innercode` | String | `text` |
| 21 | `isEnd` | 是否End | `isEnd` | Integer | `int` |
| 22 | `isexternalaccounting` | 是否externalaccounting | `is_external_accounting` | Integer | `int` |
| 23 | `isinternalaccounting` | 是否internalaccounting | `is_internal_accounting` | Integer | `int` |
| 24 | `level` | 层级 | `level` | Integer | `int` |
| 25 | `localtaxregnum` | localtaxregnum | `localtaxregnum` | String | `text` |
| 26 | `name` | 名称 | `name` | String | `multiLanguage` |
| 27 | `objid` | objid | `objid` | String | `text` |
| 28 | `orglevel` | orglevel | `orglevel` | String | `text` |
| 29 | `orgtype` | orgtype | `orgtype` | Integer | `int` |
| 30 | `parent` | parent | `parent_id` | String | `text` |
| 31 | `path` | path | `path` | String | `text` |
| 32 | `principal` | principal | `principal` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 33 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 34 | `region` | region | `region` | String | `text` |
| 35 | `shortname` | shortname | `shortname` | String | `multiLanguage` |
| 36 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 37 | `sourceid` | sourceid | `sourceid` | String | `text` |
| 38 | `statetaxregnum` | statetaxregnum | `statetaxregnum` | String | `text` |
| 39 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |
| 40 | `sysid` | sysid | `sysid` | String | `text` |
| 41 | `taxpayerid` | taxpayerid | `taxpayerid` | String | `text` |
| 42 | `telephone` | telephone | `telephone` | String | `text` |
| 43 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 44 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 45 | `timezone` | timezone | `timezone` | String | `text` |
| 46 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（8 个）

- `principal` -> `bd.staff.Staff` ()
- `branchleader` -> `bd.staff.Staff` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `companytype` -> `org.doc.CompanyType` ()
- `currency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `orgid` -> `bd.adminOrg.BaseOrgVO` (0..n)
- `parentid` -> `bd.adminOrg.FinanceOrgVO` ()
- `tenant` -> `yht.tenant.YhtTenant` ()
