---
tags: [BIP, 元数据, 数据字典, bd, bd.adminOrg.AdminOrgVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 部门 (`bd.adminOrg.AdminOrgVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_admin` | 应用: `GZTORG`

## 全部属性（78 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | true |
| 2 | `code` | 编码 | `code` | String | `text` | true | true |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` | false | true |
| 4 | `shortname` | shortname | `shortname` | String | `multiLanguage` |  | true |
| 5 | `companytype` | companytype | `companytype` | 45cbc79d-a41a-41e4-af94-b264ce83596a | `quote` |  | true |
| 6 | `parent` | parent | `parentid` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | true |
| 7 | `parentid` | parentid | `parentid` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | true |
| 8 | `innercode` | innercode | `innercode` | String | `text` |  | true |
| 9 | `isbizunit` | 是否bizunit | `is_biz_unit` | Integer | `int` |  | true |
| 10 | `is_biz_unit` | 是否_biz_unit | `is_biz_unit` | Integer | `int` |  | true |
| 11 | `parentorgid` | parentorgid | `parentorgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | true |
| 12 | `orgtype` | orgtype | `orgtype` | Integer | `int` |  | true |
| 13 | `iscontrolunit` | 是否controlunit | `is_control_unit` | Integer | `int` |  | true |
| 14 | `depttype` | depttype | `depttype` | 3bb6a10a-b3a8-438b-a891-3f81baf7a850 | `quote` |  | true |
| 15 | `principal` | principal | `principal` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true |
| 16 | `branchleader` | branchleader | `branchleader` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true |
| 17 | `locationid` | locationid | `locationid` | 95256905-1d37-4ca6-a37f-ddbdab4d1c25 | `quote` |  | true |
| 18 | `taxpayerid` | taxpayerid | `taxpayerid` | String | `text` |  | true |
| 19 | `address` | address | `address` | String | `multiLanguage` |  | true |
| 20 | `contact` | contact | `contact` | String | `text` |  | true |
| 21 | `shortname2` | shortname2 | `shortname2` | String | `text` |  |  |
| 22 | `telephone` | telephone | `telephone` | String | `text` |  | true |
| 23 | `timezone` | timezone | `timezone` | String | `text` |  | true |
| 24 | `description` | description | `description` | String | `multiLanguage` |  | true |
| 25 | `shortname3` | shortname3 | `shortname3` | String | `text` |  |  |
| 26 | `shortname4` | shortname4 | `shortname4` | String | `text` |  |  |
| 27 | `level` | level | `level` | Integer | `int` |  | true |
| 28 | `displayorder` | displayorder | `displayorder` | Integer | `int` |  | true |
| 29 | `sort` | sort | `displayorder` | Integer | `int` |  | true |
| 30 | `globalorder` | globalorder | `global_order` | Integer | `int` |  | true |
| 31 | `objid` | objid | `objid` | String | `text` |  | true |
| 32 | `countryzone` | countryzone | `countryzone` | String | `text` |  | true |
| 33 | `corpid` | corpid | `corpid` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | true |
| 34 | `deptdefinefeature` | deptdefinefeature | `deptcharacterid` | 38ec14b3-ecb9-4bea-8ac6-2102e8dc3b41 | `UserDefine` |  | true |
| 35 | `isEnd` | 是否End | `isEnd` | Integer | `int` |  | true |
| 36 | `frozen` | frozen | `frozen` | Integer | `int` |  | true |
| 37 | `shortname5` | shortname5 | `shortname5` | String | `text` |  |  |
| 38 | `frozentime` | frozentime | `frozen_time` | Date | `date` |  | true |
| 39 | `enable` | enable | `enable` | Integer | `int` |  | true |
| 40 | `starttime` | starttime | `start_time` | DateTime | `timestamp` |  | true |
| 41 | `effectivedate` | effectivedate | `effectivedate` | DateTime | `timestamp` |  | true |
| 42 | `endtime` | endtime | `end_time` | DateTime | `timestamp` |  | true |
| 43 | `expirationdate` | expirationdate | `expirationdate` | DateTime | `timestamp` |  | true |
| 44 | `closed` | closed | `closed` | Integer | `int` |  | true |
| 45 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 46 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |  | true |
| 47 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 48 | `shortname6` | shortname6 | `shortname6` | String | `text` |  |  |
| 49 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |  | true |
| 50 | `sourceid` | sourceid | `sourceid` | String | `text` |  | true |
| 51 | `externalorg` | externalorg | `external_org` | Integer | `int` |  | true |
| 52 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 53 | `tenantid` | tenantid | `tenantid` | String | `text` |  | true |
| 54 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 55 | `sysid` | sysid | `sysid` | String | `text` |  | true |
| 56 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 57 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |  | true |
| 58 | `dr` | dr | `dr` | Short | `short` |  | true |
| 59 | `orgid` | orgid | `orgid` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | true |
| 60 | `region` | region | `region` | String | `text` |  | true |
| 61 | `orgform` | orgform | `orgform` | String | `text` |  | true |
| 62 | `orglevel` | orglevel | `orglevel` | String | `text` |  | true |
| 63 | `path` | path | `path` | String | `text` |  | true |
| 64 | `businessid` | businessid | `businessid` | String | `text` |  | true |
| 65 | `AdminOrgVO` | AdminOrgVO | `id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | true |
| 66 | `name2` | name2 | `name2` | String | `text` |  |  |
| 67 | `name3` | name3 | `name3` | String | `text` |  |  |
| 68 | `name4` | name4 | `name4` | String | `text` |  |  |
| 69 | `name5` | name5 | `name5` | String | `text` |  |  |
| 70 | `name6` | name6 | `name6` | String | `text` |  |  |
| 71 | `deptOrgExt` | deptOrgExt | `` | 3e326fd8-fe3c-44da-bad1-b98c69b1dc31 | `` |  |  |
| 72 | `deptdefines` | deptdefines | `` | 0a571c39-b5d9-4bd3-817a-eee6b2736310 | `` |  |  |
| 73 | `deptnature` | deptnature | `dept_nature` | Short | `short` |  |  |
| 74 | `description2` | description2 | `description2` | String | `text` |  |  |
| 75 | `description3` | description3 | `description3` | String | `text` |  |  |
| 76 | `description4` | description4 | `description4` | String | `text` |  |  |
| 77 | `description5` | description5 | `description5` | String | `text` |  |  |
| 78 | `description6` | description6 | `description6` | String | `text` |  |  |

## 关联属性（19 个）

- `parent` -> `bd.adminOrg.AdminOrgVO` ()
- `creator` -> `base.user.BipUser` ()
- `corpid` -> `bd.adminOrg.BaseOrgVO` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `deptOrgExt` -> `bd.adminOrg.DeptOrgExtA` (1)
- `deptdefines` -> `bd.adminOrg.DeptOrgDefineA` (1)
- `orgid` -> `bd.adminOrg.BaseOrgVO` ()
- `parentid` -> `bd.adminOrg.AdminOrgVO` ()
- `principal` -> `bd.staff.Staff` ()
- `branchleader` -> `bd.staff.Staff` ()
- `locationid` -> `hrcm.location.Location` ()
- `parentorgid` -> `org.func.BaseOrg` ()
- `companytype` -> `org.doc.CompanyType` ()
- `id` -> `org.func.BaseOrg` ()
- `depttype` -> `org.doc.DeptType` ()
- `AdminOrgVO` -> `bd.adminOrg.AdminOrgVO` ()
- `tenant` -> `yht.tenant.YhtTenant` ()
- `deptdefinefeature` -> `bd.adminOrg.AdminVOFeature` ()

```sql
SELECT id, code, name, shortname, companytype, parentid FROM org_admin
```