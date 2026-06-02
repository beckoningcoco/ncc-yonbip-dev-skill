---
tags: [BIP, 元数据, 数据字典, bd.adminOrg.InventoryOrgVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 库存组织(废弃) (`bd.adminOrg.InventoryOrgVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_inventory` | 应用: `GZTORG` | 类型: `Class`

## 属性（38 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `orgid` | orgid | `orgid` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 3 | `enable` | enable | `enable` | Integer | `int` |
| 4 | `effectivedate` | effectivedate | `effectivedate` | DateTime | `timestamp` |
| 5 | `expirationdate` | expirationdate | `expirationdate` | DateTime | `timestamp` |
| 6 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 7 | `address` | address | `address` | String | `text` |
| 8 | `branchleader` | branchleader | `branchleader` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 9 | `businessid` | businessid | `businessid` | String | `text` |
| 10 | `code` | 编码 | `code` | String | `text` |
| 11 | `companytype` | companytype | `companytype` | 45cbc79d-a41a-41e4-af94-b264ce83596a | `quote` |
| 12 | `contact` | contact | `contact` | String | `text` |
| 13 | `countryzone` | countryzone | `countryzone` | String | `text` |
| 14 | `description` | description | `description` | String | `text` |
| 15 | `displayorder` | displayorder | `displayorder` | Integer | `int` |
| 16 | `externalorg` | externalorg | `external_org` | Integer | `int` |
| 17 | `finorgid` | finorgid | `finorgid` | 4928db62-a46d-4829-a26a-1de4bb3bf98c | `quote` |
| 18 | `innercode` | innercode | `innercode` | String | `text` |
| 19 | `isEnd` | 是否End | `isEnd` | Integer | `int` |
| 20 | `level` | 层级 | `level` | Integer | `int` |
| 21 | `name` | 名称 | `name` | String | `multiLanguage` |
| 22 | `objid` | objid | `objid` | String | `text` |
| 23 | `orgtype` | orgtype | `orgtype` | Integer | `int` |
| 24 | `parent` | parent | `parentid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 25 | `parentid` | parentid | `parentid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 26 | `path` | path | `path` | String | `text` |
| 27 | `principal` | principal | `principal` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 28 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 29 | `shortname` | shortname | `shortname` | String | `multiLanguage` |
| 30 | `sort` | 排序 | `displayorder` | Integer | `int` |
| 31 | `sourceid` | sourceid | `sourceid` | String | `text` |
| 32 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |
| 33 | `sysid` | sysid | `sysid` | String | `text` |
| 34 | `telephone` | telephone | `telephone` | String | `text` |
| 35 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 36 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 37 | `timezone` | timezone | `timezone` | String | `text` |
| 38 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（9 个）

- `principal` -> `bd.staff.Staff` ()
- `parent` -> `org.func.BaseOrg` ()
- `branchleader` -> `bd.staff.Staff` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `companytype` -> `org.doc.CompanyType` ()
- `finorgid` -> `bd.adminOrg.FinanceOrgVO` ()
- `orgid` -> `bd.adminOrg.BaseOrgVO` (0..n)
- `tenant` -> `yht.tenant.YhtTenant` ()
- `parentid` -> `org.func.BaseOrg` ()
