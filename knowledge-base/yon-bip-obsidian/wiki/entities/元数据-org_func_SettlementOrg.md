---
tags: [BIP, 元数据, 数据字典, org.func.SettlementOrg]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 结算中心 (`org.func.SettlementOrg`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_settlement` | 应用: `GZTORG` | 类型: `Class`

## 属性（76 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |
| 4 | `name2` | name2 | `name2` | String | `text` |
| 5 | `name3` | name3 | `name3` | String | `text` |
| 6 | `name4` | name4 | `name4` | String | `text` |
| 7 | `name5` | name5 | `name5` | String | `text` |
| 8 | `name6` | name6 | `name6` | String | `text` |
| 9 | `shortname` | shortname | `shortname` | String | `multiLanguage` |
| 10 | `shortname2` | shortname2 | `shortname2` | String | `text` |
| 11 | `shortname3` | shortname3 | `shortname3` | String | `text` |
| 12 | `shortname4` | shortname4 | `shortname4` | String | `text` |
| 13 | `shortname5` | shortname5 | `shortname5` | String | `text` |
| 14 | `shortname6` | shortname6 | `shortname6` | String | `text` |
| 15 | `companytype` | companytype | `companytype` | 45cbc79d-a41a-41e4-af94-b264ce83596a | `quote` |
| 16 | `parent` | parent | `parentid` | c8022140-b5fa-4f19-a0b2-2be0192eac18 | `quote` |
| 17 | `parentid` | parentid | `parentid` | c8022140-b5fa-4f19-a0b2-2be0192eac18 | `quote` |
| 18 | `innercode` | innercode | `innercode` | String | `text` |
| 19 | `orgtype` | orgtype | `orgtype` | Integer | `int` |
| 20 | `depttype` | depttype | `depttype` | 3bb6a10a-b3a8-438b-a891-3f81baf7a850 | `quote` |
| 21 | `principal` | principal | `principal` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 22 | `branchleader` | branchleader | `branchleader` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 23 | `locationid` | locationid | `locationid` | String | `text` |
| 24 | `taxpayerid` | taxpayerid | `taxpayerid` | String | `text` |
| 25 | `taxpayername` | taxpayername | `taxpayername` | String | `text` |
| 26 | `usedtaxpayerid` | usedtaxpayerid | `usedtaxpayerid` | String | `text` |
| 27 | `usedtaxpayername` | usedtaxpayername | `usedtaxpayername` | String | `text` |
| 28 | `address` | address | `address` | String | `multiLanguage` |
| 29 | `address2` | address2 | `address2` | String | `text` |
| 30 | `address3` | address3 | `address3` | String | `text` |
| 31 | `address4` | address4 | `address4` | String | `text` |
| 32 | `address5` | address5 | `address5` | String | `text` |
| 33 | `address6` | address6 | `address6` | String | `text` |
| 34 | `contact` | contact | `contact` | String | `text` |
| 35 | `taxpayertype` | taxpayertype | `taxpayertype` | Integer | `int` |
| 36 | `telephone` | telephone | `telephone` | String | `text` |
| 37 | `exchangerate` | exchangerate | `exchangerate` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 38 | `timezone` | timezone | `timezone` | String | `text` |
| 39 | `description` | description | `description` | String | `multiLanguage` |
| 40 | `description2` | description2 | `description2` | String | `text` |
| 41 | `description3` | description3 | `description3` | String | `text` |
| 42 | `description4` | description4 | `description4` | String | `text` |
| 43 | `description5` | description5 | `description5` | String | `text` |
| 44 | `description6` | description6 | `description6` | String | `text` |
| 45 | `level` | 层级 | `level` | Integer | `int` |
| 46 | `displayorder` | displayorder | `displayorder` | Integer | `int` |
| 47 | `sort` | 排序 | `displayorder` | Integer | `int` |
| 48 | `objid` | objid | `objid` | String | `text` |
| 49 | `countryzone` | countryzone | `countryzone` | String | `text` |
| 50 | `corpid` | corpid | `corpid` | String | `text` |
| 51 | `isEnd` | 是否End | `isEnd` | Integer | `int` |
| 52 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 53 | `enable` | enable | `enable` | Integer | `int` |
| 54 | `effectivedate` | effectivedate | `effectivedate` | DateTime | `timestamp` |
| 55 | `expirationdate` | expirationdate | `expirationdate` | DateTime | `timestamp` |
| 56 | `creator` | 创建人 | `creator` | String | `text` |
| 57 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 58 | `modifier` | 修改人 | `modifier` | String | `text` |
| 59 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 60 | `sourceid` | sourceid | `sourceid` | String | `text` |
| 61 | `externalorg` | externalorg | `external_org` | Integer | `int` |
| 62 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 63 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 64 | `iscontrolunit` | 是否controlunit | `is_control_unit` | Integer | `int` |
| 65 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 66 | `sysid` | sysid | `sysid` | String | `text` |
| 67 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 68 | `ts` | ts | `ts` | DateTime | `timestamp` |
| 69 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |
| 70 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 71 | `orgid` | orgid | `orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 72 | `path` | path | `path` | String | `text` |
| 73 | `businessid` | businessid | `businessid` | String | `text` |
| 74 | `log` | log | `log` | String | `text` |
| 75 | `jsonextattr` | jsonextattr | `jsonextattr` | String | `text` |
| 76 | `settlementOrgdefines` | settlementOrgdefines | `` | 55706def-bbf5-4d8d-987d-51453f03a1f5 | `` |

## 关联（13 个）

- `parent` -> `org.func.SettlementOrg` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `exchangerate` -> `bd.exchangeRate.ExchangeRateTypeVO` ()
- `orgid` -> `org.func.BaseOrg` ()
- `parentid` -> `org.func.SettlementOrg` ()
- `principal` -> `bd.staff.Staff` ()
- `branchleader` -> `bd.staff.Staff` ()
- `companytype` -> `org.doc.CompanyType` ()
- `currency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `id` -> `org.func.BaseOrg` (1)
- `depttype` -> `org.doc.DeptType` ()
- `tenant` -> `yht.tenant.YhtTenant` ()
- `settlementOrgdefines` -> `org.func.SettlementOrgDefine` (1)
