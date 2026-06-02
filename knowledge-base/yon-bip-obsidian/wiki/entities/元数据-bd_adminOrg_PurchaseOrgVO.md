---
tags: [BIP, 元数据, 数据字典, bd.adminOrg.PurchaseOrgVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 采购组织(废弃) (`bd.adminOrg.PurchaseOrgVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_purchase` | 应用: `GZTORG` | 类型: `Class`

## 属性（37 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `orgid` | orgid | `orgid` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 3 | `enable` | enable | `enable` | Integer | `int` |
| 4 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 5 | `effectivedate` | effectivedate | `effectivedate` | DateTime | `timestamp` |
| 6 | `expirationdate` | expirationdate | `expirationdate` | DateTime | `timestamp` |
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
| 17 | `innercode` | innercode | `innercode` | String | `text` |
| 18 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 19 | `level` | 层级 | `level` | Integer | `int` |
| 20 | `name` | 名称 | `name` | String | `multiLanguage` |
| 21 | `objid` | objid | `objid` | String | `text` |
| 22 | `orgtype` | orgtype | `orgtype` | Integer | `int` |
| 23 | `parent` | parent | `parentid` | String | `text` |
| 24 | `parentid` | parentid | `parentid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 25 | `path` | path | `path` | String | `text` |
| 26 | `principal` | principal | `principal` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 27 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 28 | `shortname` | shortname | `shortname` | String | `multiLanguage` |
| 29 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 30 | `sourceid` | sourceid | `sourceid` | String | `text` |
| 31 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |
| 32 | `sysid` | sysid | `sysid` | String | `text` |
| 33 | `telephone` | telephone | `telephone` | String | `text` |
| 34 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 35 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 36 | `timezone` | timezone | `timezone` | String | `text` |
| 37 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（7 个）

- `principal` -> `bd.staff.Staff` ()
- `branchleader` -> `bd.staff.Staff` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `companytype` -> `org.doc.CompanyType` ()
- `orgid` -> `bd.adminOrg.BaseOrgVO` (0..n)
- `tenant` -> `yht.tenant.YhtTenant` ()
- `parentid` -> `org.func.BaseOrg` ()
