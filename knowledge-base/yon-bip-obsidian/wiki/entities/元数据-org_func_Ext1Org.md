---
tags: [BIP, 元数据, 数据字典, org.func.Ext1Org]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 扩展职能组织1 (`org.func.Ext1Org`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_ext1` | 应用: `GZTORG` | 类型: `Class`

## 属性（61 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |
| 4 | `shortname` | shortname | `shortname` | String | `multiLanguage` |
| 5 | `companytype` | companytype | `companytype` | 45cbc79d-a41a-41e4-af94-b264ce83596a | `quote` |
| 6 | `parent` | parent | `parentid` | d913b342-9085-41a1-a8d1-04c251ed2eab | `quote` |
| 7 | `parentid` | parentid | `parentid` | d913b342-9085-41a1-a8d1-04c251ed2eab | `quote` |
| 8 | `innercode` | innercode | `innercode` | String | `text` |
| 9 | `is_biz_unit` | 是否_biz_unit | `is_biz_unit` | Integer | `int` |
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
| 25 | `language` | language | `language` | a014aa1b-1f14-4d31-88fb-dcce538d9973 | `quote` |
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
| 36 | `enable` | enable | `enable` | Integer | `int` |
| 37 | `effectivedate` | effectivedate | `effectivedate` | DateTime | `timestamp` |
| 38 | `expirationdate` | expirationdate | `expirationdate` | DateTime | `timestamp` |
| 39 | `creator` | 创建人 | `creator` | String | `text` |
| 40 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 41 | `modifier` | 修改人 | `modifier` | String | `text` |
| 42 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 43 | `sourceid` | sourceid | `sourceid` | String | `text` |
| 44 | `externalorg` | externalorg | `external_org` | Integer | `int` |
| 45 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 46 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 47 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 48 | `sysid` | sysid | `sysid` | String | `text` |
| 49 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 50 | `ts` | ts | `ts` | DateTime | `timestamp` |
| 51 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |
| 52 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 53 | `orgid` | orgid | `orgid` | String | `text` |
| 54 | `region` | region | `region` | String | `text` |
| 55 | `orgform` | orgform | `orgform` | String | `text` |
| 56 | `orglevel` | orglevel | `orglevel` | String | `text` |
| 57 | `path` | path | `path` | String | `text` |
| 58 | `businessid` | businessid | `businessid` | String | `text` |
| 59 | `log` | log | `log` | String | `text` |
| 60 | `jsonextattr` | jsonextattr | `jsonextattr` | String | `text` |
| 61 | `defines` | defines | `` | e705fb27-2797-4cf9-86c4-1024e9d1a104 | `` |

## 关联（13 个）

- `parent` -> `org.func.Ext1Org` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `exchangerate` -> `bd.exchangeRate.ExchangeRateTypeVO` ()
- `language` -> `bd.timezonelanguage.LanguageVO` ()
- `parentid` -> `org.func.Ext1Org` ()
- `defines` -> `org.func.Ext1OrgDefine` (1)
- `principal` -> `bd.staff.Staff` ()
- `branchleader` -> `bd.staff.Staff` ()
- `companytype` -> `org.doc.CompanyType` ()
- `locationid` -> `hrcm.location.Location` ()
- `id` -> `org.func.BaseOrg` (1)
- `depttype` -> `org.doc.DeptType` ()
- `tenant` -> `yht.tenant.YhtTenant` ()
