---
tags: [BIP, 元数据, 数据字典, org.func.AdminOrg]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 行政组织 (`org.func.AdminOrg`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_admin` | 应用: `GZTORG` | 类型: `Class`

## 属性（94 个）

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
| 10 | `adminOrgExt` | adminOrgExt | `` | 78404d53-934b-4093-af90-c332bf652673 | `` |
| 11 | `defines` | defines | `` | 389d4513-f3d4-4564-aa22-310139072ebe | `` |
| 12 | `shortname2` | shortname2 | `shortname2` | String | `text` |
| 13 | `shortname3` | shortname3 | `shortname3` | String | `text` |
| 14 | `shortname4` | shortname4 | `shortname4` | String | `text` |
| 15 | `shortname5` | shortname5 | `shortname5` | String | `text` |
| 16 | `shortname6` | shortname6 | `shortname6` | String | `text` |
| 17 | `companytype` | companytype | `companytype` | 45cbc79d-a41a-41e4-af94-b264ce83596a | `quote` |
| 18 | `parent` | parent | `parentid` | c3b96360-c57f-455b-9728-2ca499d9922a | `quote` |
| 19 | `parentid` | parentid | `parentid` | c3b96360-c57f-455b-9728-2ca499d9922a | `quote` |
| 20 | `innercode` | innercode | `innercode` | String | `text` |
| 21 | `isbizunit` | 是否bizunit | `is_biz_unit` | Integer | `int` |
| 22 | `parentorgid` | parentorgid | `parentorgid` | c3b96360-c57f-455b-9728-2ca499d9922a | `quote` |
| 23 | `orgtype` | orgtype | `orgtype` | Integer | `int` |
| 24 | `iscontrolunit` | 是否controlunit | `is_control_unit` | Integer | `int` |
| 25 | `depttype` | depttype | `depttype` | 3bb6a10a-b3a8-438b-a891-3f81baf7a850 | `quote` |
| 26 | `principal` | principal | `principal` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 27 | `branchleader` | branchleader | `branchleader` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 28 | `locationid` | locationid | `locationid` | 95256905-1d37-4ca6-a37f-ddbdab4d1c25 | `quote` |
| 29 | `taxpayerid` | taxpayerid | `taxpayerid` | String | `text` |
| 30 | `taxpayername` | taxpayername | `taxpayername` | String | `text` |
| 31 | `usedtaxpayerid` | usedtaxpayerid | `usedtaxpayerid` | String | `text` |
| 32 | `usedtaxpayername` | usedtaxpayername | `usedtaxpayername` | String | `text` |
| 33 | `address` | address | `address` | String | `multiLanguage` |
| 34 | `address2` | address2 | `address2` | String | `text` |
| 35 | `address3` | address3 | `address3` | String | `text` |
| 36 | `address4` | address4 | `address4` | String | `text` |
| 37 | `address5` | address5 | `address5` | String | `text` |
| 38 | `address6` | address6 | `address6` | String | `text` |
| 39 | `contact` | contact | `contact` | String | `text` |
| 40 | `taxpayertype` | taxpayertype | `taxpayertype` | Integer | `int` |
| 41 | `telephone` | telephone | `telephone` | String | `text` |
| 42 | `exchangerate` | exchangerate | `exchangerate` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 43 | `language` | language | `language` | a014aa1b-1f14-4d31-88fb-dcce538d9973 | `quote` |
| 44 | `timezone` | timezone | `timezone` | String | `text` |
| 45 | `description` | description | `description` | String | `multiLanguage` |
| 46 | `description2` | description2 | `description2` | String | `text` |
| 47 | `description3` | description3 | `description3` | String | `text` |
| 48 | `description4` | description4 | `description4` | String | `text` |
| 49 | `description5` | description5 | `description5` | String | `text` |
| 50 | `description6` | description6 | `description6` | String | `text` |
| 51 | `level` | 层级 | `level` | Integer | `int` |
| 52 | `displayorder` | displayorder | `displayorder` | Integer | `int` |
| 53 | `sort` | 排序 | `displayorder` | Integer | `int` |
| 54 | `globalorder` | globalorder | `global_order` | Integer | `int` |
| 55 | `objid` | objid | `objid` | String | `text` |
| 56 | `countryzone` | countryzone | `countryzone` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 57 | `corpid` | corpid | `corpid` | a754b1bb-3377-4617-922e-a6108548cd73 | `quote` |
| 58 | `admindefinefeature` | admindefinefeature | `characterid` | 0f11011c-ff17-496d-a7e4-f546ccc7dc5b | `UserDefine` |
| 59 | `isdefault` | 是否default | `isdefault` | Integer | `int` |
| 60 | `isEnd` | 是否End | `isEnd` | Integer | `int` |
| 61 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 62 | `frozen` | frozen | `frozen` | Integer | `int` |
| 63 | `frozentime` | frozentime | `frozen_time` | Date | `date` |
| 64 | `enable` | enable | `enable` | Integer | `int` |
| 65 | `starttime` | starttime | `start_time` | DateTime | `timestamp` |
| 66 | `effectivedate` | effectivedate | `effectivedate` | DateTime | `timestamp` |
| 67 | `endtime` | endtime | `end_time` | DateTime | `timestamp` |
| 68 | `expirationdate` | expirationdate | `expirationdate` | DateTime | `timestamp` |
| 69 | `closed` | closed | `closed` | Integer | `int` |
| 70 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 71 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 72 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 73 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 74 | `sourceid` | sourceid | `sourceid` | String | `text` |
| 75 | `externalorg` | externalorg | `external_org` | Integer | `int` |
| 76 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 77 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 78 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 79 | `sysid` | sysid | `sysid` | String | `text` |
| 80 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 81 | `ts` | ts | `ts` | DateTime | `timestamp` |
| 82 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |
| 83 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 84 | `orgid` | orgid | `orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 85 | `region` | region | `region` | String | `text` |
| 86 | `orgform` | orgform | `orgform` | String | `text` |
| 87 | `orglevel` | orglevel | `orglevel` | String | `text` |
| 88 | `path` | path | `path` | String | `text` |
| 89 | `businessid` | businessid | `businessid` | String | `text` |
| 90 | `log` | log | `log` | String | `text` |
| 91 | `canEmployee` | canEmployee | `can_employee` | Integer | `int` |
| 92 | `jsonextattr` | jsonextattr | `jsonextattr` | String | `text` |
| 93 | `employerOrg` | employerOrg | `employer_org` | Integer | `int` |
| 94 | `deptnature` | deptnature | `dept_nature` | Short | `short` |

## 关联（22 个）

- `admindefinefeature` -> `org.func.AdminBaseFeature` ()
- `parent` -> `org.func.AdminOrg` ()
- `creator` -> `base.user.BipUser` ()
- `corpid` -> `hrcm.contractentity.ContractEntity` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `adminOrgExt` -> `org.func.AdminOrgExt` (1)
- `exchangerate` -> `bd.exchangeRate.ExchangeRateTypeVO` ()
- `modifier` -> `base.user.BipUser` ()
- `language` -> `bd.timezonelanguage.LanguageVO` ()
- `countryzone` -> `bd.country.CountryVO` ()
- `orgid` -> `org.func.BaseOrg` ()
- `parentid` -> `org.func.AdminOrg` ()
- `defines` -> `org.func.AdminOrgDefine` (1)
- `principal` -> `bd.staff.Staff` ()
- `branchleader` -> `bd.staff.Staff` ()
- `companytype` -> `org.doc.CompanyType` ()
- `locationid` -> `hrcm.location.Location` ()
- `parentorgid` -> `org.func.AdminOrg` ()
- `currency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `id` -> `org.func.BaseOrg` (1)
- `depttype` -> `org.doc.DeptType` ()
- `tenant` -> `yht.tenant.YhtTenant` ()
