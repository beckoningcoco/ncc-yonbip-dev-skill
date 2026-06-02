---
tags: [BIP, 元数据, 数据字典, org.func.Ext4Org]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 扩展职能组织4 (`org.func.Ext4Org`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_ext4` | 应用: `GZTORG` | 类型: `Class`

## 属性（62 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |
| 4 | `shortname` | shortname | `shortname` | String | `multiLanguage` |
| 5 | `companytype` | companytype | `companytype` | 45cbc79d-a41a-41e4-af94-b264ce83596a | `quote` |
| 6 | `parent` | parent | `parentid` | 1274aba2-2700-44a4-9e9f-c9ab986f5901 | `quote` |
| 7 | `parentid` | parentid | `parentid` | 1274aba2-2700-44a4-9e9f-c9ab986f5901 | `quote` |
| 8 | `innercode` | innercode | `innercode` | String | `text` |
| 9 | `isbizunit` | 是否bizunit | `is_biz_unit` | Integer | `int` |
| 10 | `parentorgid` | parentorgid | `parentorgid` | String | `text` |
| 11 | `orgtype` | orgtype | `orgtype` | Integer | `int` |
| 12 | `depttype` | depttype | `depttype` | 3bb6a10a-b3a8-438b-a891-3f81baf7a850 | `quote` |
| 13 | `principal` | principal | `principal` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 14 | `branchleader` | branchleader | `branchleader` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 15 | `locationid` | locationid | `locationid` | 95256905-1d37-4ca6-a37f-ddbdab4d1c25 | `quote` |
| 16 | `taxpayerid` | taxpayerid | `taxpayerid` | String | `text` |
| 17 | `taxpayername` | taxpayername | `taxpayername` | String | `text` |
| 18 | `usedtaxpayerid` | usedtaxpayerid | `usedtaxpayerid` | String | `text` |
| 19 | `usedtaxpayername` | usedtaxpayername | `usedtaxpayername` | String | `text` |
| 20 | `address` | address | `address` | String | `multiLanguage` |
| 21 | `contact` | contact | `contact` | String | `text` |
| 22 | `taxpayertype` | taxpayertype | `taxpayertype` | Integer | `int` |
| 23 | `telephone` | telephone | `telephone` | String | `text` |
| 24 | `exchangerate` | exchangerate | `exchangerate` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 25 | `language` | language | `language` | String | `text` |
| 26 | `timezone` | timezone | `timezone` | String | `text` |
| 27 | `description` | description | `description` | String | `multiLanguage` |
| 28 | `level` | 层级 | `level` | Integer | `int` |
| 29 | `displayorder` | displayorder | `displayorder` | Integer | `int` |
| 30 | `sort` | 排序 | `displayorder` | Integer | `int` |
| 31 | `objid` | objid | `objid` | String | `text` |
| 32 | `countryzone` | countryzone | `countryzone` | String | `text` |
| 33 | `corpid` | corpid | `corpid` | String | `text` |
| 34 | `isdefault` | 是否default | `isdefault` | Integer | `int` |
| 35 | `isEnd` | 是否End | `isEnd` | Integer | `int` |
| 36 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 37 | `enable` | enable | `enable` | Integer | `int` |
| 38 | `effectivedate` | effectivedate | `effectivedate` | DateTime | `timestamp` |
| 39 | `expirationdate` | expirationdate | `expirationdate` | DateTime | `timestamp` |
| 40 | `creator` | 创建人 | `creator` | String | `text` |
| 41 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 42 | `modifier` | 修改人 | `modifier` | String | `text` |
| 43 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 44 | `sourceid` | sourceid | `sourceid` | String | `text` |
| 45 | `externalorg` | externalorg | `external_org` | Integer | `int` |
| 46 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 47 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 48 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 49 | `sysid` | sysid | `sysid` | String | `text` |
| 50 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 51 | `ts` | ts | `ts` | DateTime | `timestamp` |
| 52 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |
| 53 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 54 | `orgid` | orgid | `orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 55 | `region` | region | `region` | String | `text` |
| 56 | `orgform` | orgform | `orgform` | String | `text` |
| 57 | `orglevel` | orglevel | `orglevel` | String | `text` |
| 58 | `path` | path | `path` | String | `text` |
| 59 | `businessid` | businessid | `businessid` | String | `text` |
| 60 | `log` | log | `log` | String | `text` |
| 61 | `jsonextattr` | jsonextattr | `jsonextattr` | String | `text` |
| 62 | `defines` | defines | `` | ecfcc03b-b265-487e-9ba3-950abf08d2e8 | `` |

## 关联（14 个）

- `parent` -> `org.func.Ext4Org` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `exchangerate` -> `bd.exchangeRate.ExchangeRateTypeVO` ()
- `orgid` -> `org.func.BaseOrg` ()
- `parentid` -> `org.func.Ext4Org` ()
- `defines` -> `org.func.Ext4OrgDefine` (1)
- `principal` -> `bd.staff.Staff` ()
- `branchleader` -> `bd.staff.Staff` ()
- `companytype` -> `org.doc.CompanyType` ()
- `locationid` -> `hrcm.location.Location` ()
- `currency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `id` -> `org.func.BaseOrg` (1)
- `depttype` -> `org.doc.DeptType` ()
- `tenant` -> `yht.tenant.YhtTenant` ()
