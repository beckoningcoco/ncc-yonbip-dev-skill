---
tags: [BIP, 元数据, 数据字典, bd, bd.adminOrg.BaseOrgVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 组织 (`bd.adminOrg.BaseOrgVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_orgs` | 应用: `GZTORG`

## 全部属性（67 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `deptOrgVO` | deptOrgVO | `` | ca871996-b447-42f9-8dac-dd7c21ee0662 | `` |  |  |
| 2 | `id` | 主键ID | `id` | String | `text` |  | true |
| 3 | `code` | 编码 | `code` | String | `text` | true | false |
| 4 | `name` | 名称 | `name` | String | `multiLanguage` | false | true |
| 5 | `shortname` | shortname | `shortname` | String | `multiLanguage` |  |  |
| 6 | `companytype` | companytype | `companytype` | 45cbc79d-a41a-41e4-af94-b264ce83596a | `quote` |  | true |
| 7 | `parent` | parent | `parentid` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | true |
| 8 | `parentid` | parentid | `parentid` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | true |
| 9 | `innercode` | innercode | `innercode` | String | `text` |  | true |
| 10 | `is_biz_unit` | 是否_biz_unit | `is_biz_unit` | Integer | `int` |  | true |
| 11 | `isbizunit` | 是否bizunit | `is_biz_unit` | Integer | `int` |  | true |
| 12 | `parentorgid` | parentorgid | `parentorgid` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | true |
| 13 | `orgtype` | orgtype | `orgtype` | Integer | `int` |  | true |
| 14 | `principal` | principal | `principal` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true |
| 15 | `branchleader` | branchleader | `branchleader` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true |
| 16 | `address` | address | `address` | String | `text` |  |  |
| 17 | `contact` | contact | `contact` | String | `text` |  | true |
| 18 | `telephone` | telephone | `telephone` | String | `text` |  | true |
| 19 | `timezone` | timezone | `timezone` | String | `text` |  | true |
| 20 | `description` | description | `description` | String | `multiLanguage` |  |  |
| 21 | `level` | level | `level` | Integer | `int` |  | true |
| 22 | `displayorder` | displayorder | `displayorder` | Integer | `int` |  | true |
| 23 | `sort` | sort | `displayorder` | Integer | `int` |  | true |
| 24 | `objid` | objid | `objid` | String | `text` |  | true |
| 25 | `countryzone` | countryzone | `countryzone` | String | `text` |  | true |
| 26 | `isEnd` | 是否End | `isEnd` | Integer | `int` |  | true |
| 27 | `enable` | enable | `enable` | Integer | `int` |  | true |
| 28 | `starttime` | starttime | `start_time` | DateTime | `timestamp` |  | true |
| 29 | `effectivedate` | effectivedate | `effectivedate` | DateTime | `timestamp` |  | true |
| 30 | `endtime` | endtime | `end_time` | DateTime | `timestamp` |  | true |
| 31 | `expirationdate` | expirationdate | `expirationdate` | DateTime | `timestamp` |  | true |
| 32 | `sourceid` | sourceid | `sourceid` | String | `text` |  | true |
| 33 | `externalorg` | externalorg | `external_org` | Integer | `int` |  | true |
| 34 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 35 | `tenantid` | tenantid | `tenantid` | String | `text` |  | true |
| 36 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 37 | `sysid` | sysid | `sysid` | String | `text` |  | true |
| 38 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 39 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |  | true |
| 40 | `dr` | dr | `dr` | Short | `short` |  | true |
| 41 | `orgid` | orgid | `orgid` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | true |
| 42 | `path` | path | `path` | String | `text` |  | true |
| 43 | `businessid` | businessid | `businessid` | String | `text` |  | true |
| 44 | `purchaseOrgVO` | purchaseOrgVO | `` | 8006983d-d605-473b-b0c4-0e9469aaacff | `` |  |  |
| 45 | `financeOrgVO` | financeOrgVO | `` | 4928db62-a46d-4829-a26a-1de4bb3bf98c | `` |  |  |
| 46 | `adminOrgViewDept` | adminOrgViewDept | `` | 10ff81be-23e4-45e8-b173-240aff8ef9f3 | `` |  |  |
| 47 | `adminOrgViewOrg` | adminOrgViewOrg | `` | 6f914e2e-2a69-4e22-a217-0732653ce8c7 | `` |  |  |
| 48 | `inventoryOrgVO` | inventoryOrgVO | `` | 598482c6-0ad7-493a-b944-5493a8b9fb8e | `` |  |  |
| 49 | `salesOrgVO` | salesOrgVO | `` | 979b498f-19cb-48b2-a299-c9c04accf1b0 | `` |  |  |
| 50 | `factoryOrgVO` | factoryOrgVO | `` | 4ea0642e-e7eb-4171-aa70-e8a0bb77c391 | `` |  |  |
| 51 | `AdminOrgVO` | AdminOrgVO | `id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | true |
| 52 | `deptnature` | deptnature | `dept_nature` | Short | `short` |  |  |
| 53 | `description2` | description2 | `description2` | String | `text` |  |  |
| 54 | `description3` | description3 | `description3` | String | `text` |  |  |
| 55 | `description4` | description4 | `description4` | String | `text` |  |  |
| 56 | `description5` | description5 | `description5` | String | `text` |  |  |
| 57 | `description6` | description6 | `description6` | String | `text` |  |  |
| 58 | `name2` | name2 | `name2` | String | `text` |  |  |
| 59 | `name3` | name3 | `name3` | String | `text` |  |  |
| 60 | `name4` | name4 | `name4` | String | `text` |  |  |
| 61 | `name5` | name5 | `name5` | String | `text` |  |  |
| 62 | `name6` | name6 | `name6` | String | `text` |  |  |
| 63 | `shortname2` | shortname2 | `shortname2` | String | `text` |  |  |
| 64 | `shortname3` | shortname3 | `shortname3` | String | `text` |  |  |
| 65 | `shortname4` | shortname4 | `shortname4` | String | `text` |  |  |
| 66 | `shortname5` | shortname5 | `shortname5` | String | `text` |  |  |
| 67 | `shortname6` | shortname6 | `shortname6` | String | `text` |  |  |

## 关联属性（18 个）

- `parent` -> `bd.adminOrg.AdminOrgVO` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `inventoryOrgVO` -> `bd.adminOrg.InventoryOrgVO` (0..n)
- `financeOrgVO` -> `bd.adminOrg.FinanceOrgVO` (0..n)
- `purchaseOrgVO` -> `bd.adminOrg.PurchaseOrgVO` (0..n)
- `orgid` -> `bd.adminOrg.BaseOrgVO` ()
- `parentid` -> `bd.adminOrg.AdminOrgVO` ()
- `principal` -> `bd.staff.Staff` ()
- `branchleader` -> `bd.staff.Staff` ()
- `adminOrgViewOrg` -> `bd.adminOrg.AdminOrgViewOrg` (0..n)
- `deptOrgVO` -> `bd.adminOrg.DeptOrgVO` (0..n)
- `companytype` -> `org.doc.CompanyType` ()
- `parentorgid` -> `bd.adminOrg.AdminOrgVO` ()
- `adminOrgViewDept` -> `bd.adminOrg.AdminOrgViewDept` (0..n)
- `factoryOrgVO` -> `bd.adminOrg.FactoryOrgVO` (0..n)
- `AdminOrgVO` -> `bd.adminOrg.AdminOrgVO` ()
- `salesOrgVO` -> `bd.adminOrg.SalesOrgVO` (0..n)
- `tenant` -> `yht.tenant.YhtTenant` ()

```sql
SELECT id, code, name, shortname, companytype, parentid FROM org_orgs
```