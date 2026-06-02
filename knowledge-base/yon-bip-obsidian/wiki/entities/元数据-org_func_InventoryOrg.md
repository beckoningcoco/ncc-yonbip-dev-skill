---
tags: [BIP, 元数据, 数据字典, org, org.func.InventoryOrg]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 库存组织 (`org.func.InventoryOrg`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_inventory` | 应用: `GZTORG` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 库存组织 |
| 物理表 | `org_inventory` |
| 应用 | `GZTORG` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-23 00:06:26:000
- 安装来源: `/app/orgcenter/iuap-apcom-org/scripts/db/patch/mongodb/V7_R0_2507/0001_iuap-apcom-org/0010_iuap_common/DML/0270_iuap_metadata/202605/202605071009_metadata_org-func_delta.zip`

## 术语标记

`MasterData`, `isMain`, `isOrg`, `doc`, `DirectConnection`, `state_tag`, `isCacheRefData`

## 依赖接口（8 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IOrg (`IOrg`) | `org.base.IOrg` | 17 | 3 |
| ITree (`ITree`) | `basedoc.basedocItf.ITree` | 336 | 5 |
| IAuditInfo (`IAuditInfo`) | `bd.itf.IAuditInfo` | 75 | 4 |
| ISystemInfo (`ISystemInfo`) | `bd.itf.ISystemInfo` | 77 | 5 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| LogicDelete (`LogicDelete`) | `basedoc.basedocItf.LogicDelete` | 31 | 0 |
| BasedocITenant (`BasedocITenant`) | `basedoc.basedocItf.BasedocITenant` | 103 | 1 |
| BasedocIState (`BasedocIState`) | `basedoc.basedocItf.BasedocIState` | 101 | 1 |

---

## 全部属性（78 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` | false | true |
| 2 | `code` | 编码 | `code` | String | `text` | false | true |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` | false | true |
| 4 | `name2` | name2 | `name2` | String | `text` | false | true |
| 5 | `name3` | name3 | `name3` | String | `text` | false | true |
| 6 | `name4` | name4 | `name4` | String | `text` | false | true |
| 7 | `name5` | name5 | `name5` | String | `text` | false | true |
| 8 | `name6` | name6 | `name6` | String | `text` | false | true |
| 9 | `shortname` | shortname | `shortname` | String | `multiLanguage` | false | true |
| 10 | `shortname2` | shortname2 | `shortname2` | String | `text` | false | true |
| 11 | `shortname3` | shortname3 | `shortname3` | String | `text` | false | true |
| 12 | `shortname4` | shortname4 | `shortname4` | String | `text` | false | true |
| 13 | `shortname5` | shortname5 | `shortname5` | String | `text` | false | true |
| 14 | `shortname6` | shortname6 | `shortname6` | String | `text` | false | true |
| 15 | `companytype` | ompanytype | `companytype` | 45cbc79d-a41a-41e4-af94-b264ce83596a | `quote` | false | true |
| 16 | `parent` | parent | `parentid` | e18e914b-4518-4e8c-ac21-783145fe7da1 | `quote` | false | true |
| 17 | `parentid` | parentid | `parentid` | e18e914b-4518-4e8c-ac21-783145fe7da1 | `quote` | false | true |
| 18 | `innercode` | nnercode(ID) | `innercode` | String | `text` | false | true |
| 19 | `orgtype` | orgtype | `orgtype` | Integer | `int` | false | true |
| 20 | `iscontrolunit` | 是否controlunit | `is_control_unit` | Integer | `int` |  | true |
| 21 | `depttype` | epttype(日期) | `depttype` | 3bb6a10a-b3a8-438b-a891-3f81baf7a850 | `quote` | false | true |
| 22 | `principal` | principal | `principal` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` | false | true |
| 23 | `branchleader` | branchleader | `branchleader` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` | false | true |
| 24 | `locationid` | locationid | `locationid` | String | `text` | false | true |
| 25 | `taxpayerid` | taxpayerid | `taxpayerid` | String | `text` | false | true |
| 26 | `taxpayername` | taxpayername | `taxpayername` | String | `text` | false | true |
| 27 | `usedtaxpayerid` | usedtaxpayerid | `usedtaxpayerid` | String | `text` | false | true |
| 28 | `usedtaxpayername` | usedtaxpayername | `usedtaxpayername` | String | `text` | false | true |
| 29 | `address` | 地址 | `address` | String | `multiLanguage` | false | true |
| 30 | `address2` | address2 | `address2` | String | `text` | false | true |
| 31 | `address3` | address3 | `address3` | String | `text` | false | true |
| 32 | `address4` | address4 | `address4` | String | `text` | false | true |
| 33 | `address5` | address5 | `address5` | String | `text` | false | true |
| 34 | `address6` | address6 | `address6` | String | `text` | false | true |
| 35 | `contact` | ontact | `contact` | String | `text` | false | true |
| 36 | `taxpayertype` | taxpayertype | `taxpayertype` | Integer | `int` | false | true |
| 37 | `telephone` | telephone | `telephone` | String | `text` | false | true |
| 38 | `exchangerate` | exchangerate | `exchangerate` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` | false | true |
| 39 | `language` | language | `language` | a014aa1b-1f14-4d31-88fb-dcce538d9973 | `quote` | false | true |
| 40 | `timezone` | timezone | `timezone` | String | `text` | false | true |
| 41 | `description` | 描述 | `description` | String | `multiLanguage` | false | true |
| 42 | `description2` | escription2(日期) | `description2` | String | `text` | false | true |
| 43 | `description3` | escription3(日期) | `description3` | String | `text` | false | true |
| 44 | `description4` | escription4(日期) | `description4` | String | `text` | false | true |
| 45 | `description5` | escription5(日期) | `description5` | String | `text` | false | true |
| 46 | `description6` | escription6(日期) | `description6` | String | `text` | false | true |
| 47 | `level` | level | `level` | Integer | `int` | false | true |
| 48 | `displayorder` | isplayorder(日期) | `displayorder` | Integer | `int` | false | true |
| 49 | `sort` | 排序号 | `displayorder` | Integer | `int` | false | true |
| 50 | `objid` | objid | `objid` | String | `text` | false | true |
| 51 | `countryzone` | ountryzone | `countryzone` | String | `text` | false | true |
| 52 | `corpid` | orpid | `corpid` | String | `text` | false | true |
| 53 | `finorgid` | inorgid(金额) | `finorgid` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` | false | true |
| 54 | `isEnd` | 是否End | `isEnd` | Integer | `int` | false | true |
| 55 | `currency` | urrency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` | false | true |
| 56 | `enable` | enable | `enable` | Integer | `int` | false | false |
| 57 | `effectivedate` | effectivedate | `effectivedate` | DateTime | `timestamp` | false | true |
| 58 | `expirationdate` | expirationdate | `expirationdate` | DateTime | `timestamp` | false | true |
| 59 | `creator` | 创建人 | `creator` | String | `text` | false | false |
| 60 | `creationtime` | reationtime | `creationtime` | DateTime | `timestamp` | false | false |
| 61 | `modifier` | 修改人 | `modifier` | String | `text` | false | false |
| 62 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` | false | false |
| 63 | `sourceid` | sourceid | `sourceid` | String | `text` | false | true |
| 64 | `externalorg` | externalorg | `external_org` | Integer | `int` | false | true |
| 65 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 66 | `tenantid` | tenantid | `tenantid` | String | `text` | false | false |
| 67 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 68 | `sysid` | sysid | `sysid` | String | `text` | false | false |
| 69 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` | false | true |
| 70 | `ts` | ts | `ts` | DateTime | `timestamp` |  | false |
| 71 | `synchts` | synchts | `synchts` | DateTime | `timestamp` | false | true |
| 72 | `dr` | 逻辑删除 | `dr` | Integer | `int` | false | true |
| 73 | `orgid` | orgid | `orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` | false | true |
| 74 | `path` | path | `path` | String | `text` | false | true |
| 75 | `businessid` | businessid | `businessid` | String | `text` | false | true |
| 76 | `log` | log | `log` | String | `text` | false | true |
| 77 | `jsonextattr` | jsonextattr | `jsonextattr` | String | `text` | false | true |
| 78 | `inventorydefines` | nventorydefines(ID) | `` | 51ec3572-c290-4a60-9a70-26e8cad5e5d1 | `` |  |  |

## 关联属性（15 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `parent` | parent | `org.func.InventoryOrg` | `parentid` | 外键 |  |  | None |  |
| 2 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 3 | `exchangerate` | exchangerate | `bd.exchangeRate.ExchangeRateTypeVO` | `exchangerate` | 外键 |  |  | Service |  |
| 4 | `inventorydefines` | nventorydefines(ID) | `org.func.InventoryOrgDefine` | `` | inventorydefines → id | 1 | Y | None |  |
| 5 | `language` | language | `bd.timezonelanguage.LanguageVO` | `language` | 外键 |  |  | Service |  |
| 6 | `orgid` | orgid | `org.func.BaseOrg` | `orgid` | 外键 |  |  | None | true |
| 7 | `parentid` | parentid | `org.func.InventoryOrg` | `parentid` | 外键 |  |  | None |  |
| 8 | `principal` | principal | `bd.staff.Staff` | `principal` | 外键 |  |  | Service |  |
| 9 | `branchleader` | branchleader | `bd.staff.Staff` | `branchleader` | 外键 |  |  | Service |  |
| 10 | `companytype` | ompanytype | `org.doc.CompanyType` | `companytype` | 外键 |  |  | None |  |
| 11 | `finorgid` | inorgid(金额) | `org.func.FinanceOrg` | `finorgid` | 外键 |  |  | None |  |
| 12 | `currency` | urrency | `bd.currencytenant.CurrencyTenantVO` | `currency` | 外键 |  |  | Service |  |
| 13 | `id` | 主键ID | `org.func.BaseOrg` | `id` | inventoryOrg → id | 1 | Y | None |  |
| 14 | `depttype` | epttype(日期) | `org.doc.DeptType` | `depttype` | 外键 |  |  | None |  |
| 15 | `tenant` | tenant | `yht.tenant.YhtTenant` | `tenantid` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT id, code, name, name2, name3, name4, name5, name6
FROM org_inventory
```