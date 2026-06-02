---
tags: [BIP, 元数据, 数据字典, org.func.ITOrg]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# IT组织 (`org.func.ITOrg`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_it` | 应用: `GZTORG` | 类型: `Class`

## 属性（87 个）

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
| 16 | `parent` | parent | `parentid` | 575554ae-c3e6-48c6-b383-9d5a81b3ce80 | `quote` |
| 17 | `parentid` | parentid | `parentid` | 575554ae-c3e6-48c6-b383-9d5a81b3ce80 | `quote` |
| 18 | `innercode` | innercode | `innercode` | String | `text` |
| 19 | `isbizunit` | 是否bizunit | `isbizunit` | Integer | `int` |
| 20 | `parentorgid` | parentorgid | `parentorgid` | 575554ae-c3e6-48c6-b383-9d5a81b3ce80 | `quote` |
| 21 | `orgtype` | orgtype | `orgtype` | Integer | `int` |
| 22 | `depttype` | depttype | `depttype` | 3bb6a10a-b3a8-438b-a891-3f81baf7a850 | `quote` |
| 23 | `principal` | principal | `principal` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 24 | `branchleader` | branchleader | `branchleader` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 25 | `locationid` | locationid | `locationid` | String | `text` |
| 26 | `taxpayerid` | taxpayerid | `taxpayerid` | String | `text` |
| 27 | `taxpayername` | taxpayername | `taxpayername` | String | `text` |
| 28 | `usedtaxpayerid` | usedtaxpayerid | `usedtaxpayerid` | String | `text` |
| 29 | `usedtaxpayername` | usedtaxpayername | `usedtaxpayername` | String | `text` |
| 30 | `address` | address | `address` | String | `multiLanguage` |
| 31 | `address2` | address2 | `address2` | String | `text` |
| 32 | `address3` | address3 | `address3` | String | `text` |
| 33 | `address4` | address4 | `address4` | String | `text` |
| 34 | `address5` | address5 | `address5` | String | `text` |
| 35 | `address6` | address6 | `address6` | String | `text` |
| 36 | `contact` | contact | `contact` | String | `text` |
| 37 | `taxpayertype` | taxpayertype | `taxpayertype` | Integer | `int` |
| 38 | `telephone` | telephone | `telephone` | String | `text` |
| 39 | `exchangerate` | exchangerate | `exchangerate` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 40 | `language` | language | `language` | String | `text` |
| 41 | `timezone` | timezone | `timezone` | String | `text` |
| 42 | `description` | description | `description` | String | `multiLanguage` |
| 43 | `description2` | description2 | `description2` | String | `text` |
| 44 | `description3` | description3 | `description3` | String | `text` |
| 45 | `description4` | description4 | `description4` | String | `text` |
| 46 | `description5` | description5 | `description5` | String | `text` |
| 47 | `description6` | description6 | `description6` | String | `text` |
| 48 | `level` | 层级 | `level` | Integer | `int` |
| 49 | `displayorder` | displayorder | `displayorder` | Integer | `int` |
| 50 | `sort` | 排序 | `displayorder` | Integer | `int` |
| 51 | `objid` | objid | `objid` | String | `text` |
| 52 | `countryzone` | countryzone | `countryzone` | String | `text` |
| 53 | `corpid` | corpid | `corpid` | String | `text` |
| 54 | `isdefault` | 是否default | `isdefault` | Integer | `int` |
| 55 | `isEnd` | 是否End | `isEnd` | Integer | `int` |
| 56 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 57 | `enable` | enable | `enable` | Integer | `int` |
| 58 | `effectivedate` | effectivedate | `effectivedate` | DateTime | `timestamp` |
| 59 | `expirationdate` | expirationdate | `expirationdate` | DateTime | `timestamp` |
| 60 | `creator` | 创建人 | `creator` | String | `text` |
| 61 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 62 | `modifier` | 修改人 | `modifier` | String | `text` |
| 63 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 64 | `sourceid` | sourceid | `sourceid` | String | `text` |
| 65 | `externalorg` | externalorg | `external_org` | Integer | `int` |
| 66 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 67 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 68 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 69 | `sysid` | sysid | `sysid` | String | `text` |
| 70 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 71 | `ts` | ts | `ts` | DateTime | `timestamp` |
| 72 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |
| 73 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 74 | `orgid` | orgid | `orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 75 | `region` | region | `region` | String | `text` |
| 76 | `orgform` | orgform | `orgform` | String | `text` |
| 77 | `orglevel` | orglevel | `orglevel` | String | `text` |
| 78 | `path` | path | `path` | String | `text` |
| 79 | `businessid` | businessid | `businessid` | String | `text` |
| 80 | `log` | log | `log` | String | `text` |
| 81 | `jsonextattr` | jsonextattr | `jsonextattr` | String | `text` |
| 82 | `reforgcode` | reforgcode | `reforgcode` | String | `text` |
| 83 | `reforgname` | reforgname | `reforgname` | c3b96360-c57f-455b-9728-2ca499d9922a | `quote` |
| 84 | `branchleaderuser` | branchleaderuser | `branchleaderuser` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 85 | `principaluser` | principaluser | `principaluser` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 86 | `orgfunctype` | orgfunctype | `log` | String | `text` |
| 87 | `defines` | defines | `` | ad19c40c-8401-4e96-84be-dbdc838ac3eb | `` |

## 关联（17 个）

- `parent` -> `org.func.ITOrg` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `exchangerate` -> `bd.exchangeRate.ExchangeRateTypeVO` ()
- `branchleaderuser` -> `base.user.User` ()
- `orgid` -> `org.func.BaseOrg` ()
- `parentid` -> `org.func.ITOrg` ()
- `defines` -> `org.func.ITOrgDefine` (1)
- `principal` -> `bd.staff.Staff` ()
- `branchleader` -> `bd.staff.Staff` ()
- `companytype` -> `org.doc.CompanyType` ()
- `parentorgid` -> `org.func.ITOrg` ()
- `currency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `id` -> `org.func.BaseOrg` (1)
- `reforgname` -> `org.func.AdminOrg` ()
- `principaluser` -> `base.user.User` ()
- `depttype` -> `org.doc.DeptType` ()
- `tenant` -> `yht.tenant.YhtTenant` ()
