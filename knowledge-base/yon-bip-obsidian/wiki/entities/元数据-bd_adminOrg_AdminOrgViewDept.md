---
tags: [BIP, 元数据, 数据字典, bd.adminOrg.AdminOrgViewDept]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 行政部门视图 (`bd.adminOrg.AdminOrgViewDept`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_admin` | 应用: `GZTORG` | 类型: `Class`

## 属性（67 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `AdminOrgVO` | AdminOrgVO | `id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 2 | `address` | address | `address` | String | `text` |
| 3 | `branchleader` | branchleader | `branchleader` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 4 | `businessid` | businessid | `businessid` | String | `text` |
| 5 | `code` | 编码 | `code` | String | `text` |
| 6 | `companytype` | companytype | `companytype` | 45cbc79d-a41a-41e4-af94-b264ce83596a | `quote` |
| 7 | `contact` | contact | `contact` | String | `text` |
| 8 | `corpid` | corpid | `corpid` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 9 | `countryzone` | countryzone | `countryzone` | String | `text` |
| 10 | `deptnature` | deptnature | `dept_nature` | Short | `short` |
| 11 | `depttype` | depttype | `depttype` | 3bb6a10a-b3a8-438b-a891-3f81baf7a850 | `quote` |
| 12 | `description` | description | `description` | String | `multiLanguage` |
| 13 | `description2` | description2 | `description2` | String | `text` |
| 14 | `description3` | description3 | `description3` | String | `text` |
| 15 | `description4` | description4 | `description4` | String | `text` |
| 16 | `description5` | description5 | `description5` | String | `text` |
| 17 | `description6` | description6 | `description6` | String | `text` |
| 18 | `displayorder` | displayorder | `displayorder` | Integer | `int` |
| 19 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 20 | `effectivedate` | effectivedate | `effectivedate` | DateTime | `timestamp` |
| 21 | `enable` | enable | `enable` | Integer | `int` |
| 22 | `endtime` | endtime | `end_time` | DateTime | `timestamp` |
| 23 | `expirationdate` | expirationdate | `expirationdate` | DateTime | `timestamp` |
| 24 | `externalorg` | externalorg | `external_org` | Integer | `int` |
| 25 | `id` | ID | `id` | String | `text` |
| 26 | `innercode` | innercode | `innercode` | String | `text` |
| 27 | `isEnd` | 是否End | `isEnd` | Integer | `int` |
| 28 | `is_biz_unit` | 是否_biz_unit | `is_biz_unit` | Integer | `int` |
| 29 | `isbizunit` | 是否bizunit | `is_biz_unit` | Integer | `int` |
| 30 | `level` | 层级 | `level` | Integer | `int` |
| 31 | `locationid` | locationid | `locationid` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 32 | `name` | 名称 | `name` | String | `multiLanguage` |
| 33 | `name2` | name2 | `name2` | String | `text` |
| 34 | `name3` | name3 | `name3` | String | `text` |
| 35 | `name4` | name4 | `name4` | String | `text` |
| 36 | `name5` | name5 | `name5` | String | `text` |
| 37 | `name6` | name6 | `name6` | String | `text` |
| 38 | `objid` | objid | `objid` | String | `text` |
| 39 | `orgform` | orgform | `orgform` | String | `text` |
| 40 | `orgid` | orgid | `orgid` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 41 | `orglevel` | orglevel | `orglevel` | String | `text` |
| 42 | `orgtype` | orgtype | `orgtype` | Integer | `int` |
| 43 | `parent` | parent | `parentid` | 10ff81be-23e4-45e8-b173-240aff8ef9f3 | `quote` |
| 44 | `parentid` | parentid | `parentid` | 10ff81be-23e4-45e8-b173-240aff8ef9f3 | `quote` |
| 45 | `parentorg` | parentorg | `parentorgid` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 46 | `parentorgid` | parentorgid | `parentorgid` | 10ff81be-23e4-45e8-b173-240aff8ef9f3 | `quote` |
| 47 | `path` | path | `path` | String | `text` |
| 48 | `principal` | principal | `principal` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 49 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 50 | `region` | region | `region` | String | `text` |
| 51 | `shortname` | shortname | `shortname` | String | `multiLanguage` |
| 52 | `shortname2` | shortname2 | `shortname2` | String | `text` |
| 53 | `shortname3` | shortname3 | `shortname3` | String | `text` |
| 54 | `shortname4` | shortname4 | `shortname4` | String | `text` |
| 55 | `shortname5` | shortname5 | `shortname5` | String | `text` |
| 56 | `shortname6` | shortname6 | `shortname6` | String | `text` |
| 57 | `sort` | 排序 | `displayorder` | Integer | `int` |
| 58 | `sourceid` | sourceid | `sourceid` | String | `text` |
| 59 | `starttime` | starttime | `start_time` | DateTime | `timestamp` |
| 60 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |
| 61 | `sysid` | sysid | `sysid` | String | `text` |
| 62 | `taxpayerid` | taxpayerid | `taxpayerid` | String | `text` |
| 63 | `telephone` | telephone | `telephone` | String | `text` |
| 64 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 65 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 66 | `timezone` | timezone | `timezone` | String | `text` |
| 67 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（14 个）

- `parent` -> `bd.adminOrg.AdminOrgViewDept` ()
- `corpid` -> `bd.adminOrg.BaseOrgVO` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `orgid` -> `bd.adminOrg.BaseOrgVO` (0..n)
- `parentid` -> `bd.adminOrg.AdminOrgViewDept` ()
- `principal` -> `bd.staff.Staff` ()
- `branchleader` -> `bd.staff.Staff` ()
- `locationid` -> `bd.adminOrg.BaseOrgVO` ()
- `parentorgid` -> `bd.adminOrg.AdminOrgViewDept` ()
- `companytype` -> `org.doc.CompanyType` ()
- `parentorg` -> `bd.adminOrg.BaseOrgVO` ()
- `depttype` -> `org.doc.DeptType` ()
- `AdminOrgVO` -> `bd.adminOrg.AdminOrgVO` ()
- `tenant` -> `yht.tenant.YhtTenant` ()
