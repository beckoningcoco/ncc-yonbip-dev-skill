---
tags: [BIP, 元数据, 数据字典, org, org.func.PurchaseOrg]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 采购组织 (`org.func.PurchaseOrg`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_purchase` | 应用: `GZTORG` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购组织 |
| 物理表 | `org_purchase` |
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
| ITree (`ITree`) | `basedoc.basedocItf.ITree` | 336 | 5 |
| ISystemInfo (`ISystemInfo`) | `bd.itf.ISystemInfo` | 77 | 5 |
| LogicDelete (`LogicDelete`) | `basedoc.basedocItf.LogicDelete` | 31 | 0 |
| IOrg (`IOrg`) | `org.base.IOrg` | 17 | 3 |
| IAuditInfo (`IAuditInfo`) | `bd.itf.IAuditInfo` | 75 | 4 |
| BasedocITenant (`BasedocITenant`) | `basedoc.basedocItf.BasedocITenant` | 103 | 1 |
| BasedocIState (`BasedocIState`) | `basedoc.basedocItf.BasedocIState` | 101 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（80 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | true |
| 2 | `code` | 编码 | `code` | String | `text` |  | true |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |  | true |
| 4 | `name2` | name2 | `name2` | String | `text` |  | true |
| 5 | `name3` | name3 | `name3` | String | `text` |  | true |
| 6 | `name4` | name4 | `name4` | String | `text` |  | true |
| 7 | `name5` | name5 | `name5` | String | `text` |  | true |
| 8 | `name6` | name6 | `name6` | String | `text` |  | true |
| 9 | `shortname` | shortname | `shortname` | String | `multiLanguage` |  | true |
| 10 | `shortname2` | shortname2 | `shortname2` | String | `text` |  | true |
| 11 | `shortname3` | shortname3 | `shortname3` | String | `text` |  | true |
| 12 | `shortname4` | shortname4 | `shortname4` | String | `text` |  | true |
| 13 | `shortname5` | shortname5 | `shortname5` | String | `text` |  | true |
| 14 | `shortname6` | shortname6 | `shortname6` | String | `text` |  | true |
| 15 | `companytype` | ompanytype | `companytype` | 45cbc79d-a41a-41e4-af94-b264ce83596a | `quote` |  | true |
| 16 | `parent` | parent | `parentid` | a4916c85-f087-4e87-a178-0ad37aff7cd0 | `quote` |  | true |
| 17 | `parentid` | parentid | `parentid` | a4916c85-f087-4e87-a178-0ad37aff7cd0 | `quote` |  | true |
| 18 | `innercode` | nnercode(ID) | `innercode` | String | `text` |  | true |
| 19 | `orgtype` | orgtype | `orgtype` | Integer | `int` |  | true |
| 20 | `iscontrolunit` | 是否controlunit | `is_control_unit` | Integer | `int` |  | true |
| 21 | `depttype` | epttype(日期) | `depttype` | 3bb6a10a-b3a8-438b-a891-3f81baf7a850 | `quote` |  | true |
| 22 | `principal` | principal | `principal` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true |
| 23 | `branchleader` | branchleader | `branchleader` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true |
| 24 | `locationid` | locationid | `locationid` | String | `text` |  | true |
| 25 | `taxpayerid` | taxpayerid | `taxpayerid` | String | `text` |  | true |
| 26 | `taxpayername` | taxpayername | `taxpayername` | String | `text` |  | true |
| 27 | `usedtaxpayerid` | usedtaxpayerid | `usedtaxpayerid` | String | `text` |  | true |
| 28 | `usedtaxpayername` | usedtaxpayername | `usedtaxpayername` | String | `text` |  | true |
| 29 | `address` | 地址 | `address` | String | `multiLanguage` |  | true |
| 30 | `address2` | address2 | `address2` | String | `text` |  | true |
| 31 | `address3` | address3 | `address3` | String | `text` |  | true |
| 32 | `address4` | address4 | `address4` | String | `text` |  | true |
| 33 | `address5` | address5 | `address5` | String | `text` |  | true |
| 34 | `address6` | address6 | `address6` | String | `text` |  | true |
| 35 | `contact` | ontact | `contact` | String | `text` |  | true |
| 36 | `taxpayertype` | taxpayertype | `taxpayertype` | Integer | `int` |  | true |
| 37 | `telephone` | telephone | `telephone` | String | `text` |  | true |
| 38 | `exchangerate` | exchangerate | `exchangerate` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |  | true |
| 39 | `language` | language | `language` | a014aa1b-1f14-4d31-88fb-dcce538d9973 | `quote` |  | true |
| 40 | `timezone` | timezone | `timezone` | String | `text` |  | true |
| 41 | `description` | 描述 | `description` | String | `multiLanguage` |  | true |
| 42 | `description2` | escription2(日期) | `description2` | String | `text` |  | true |
| 43 | `description3` | escription3(日期) | `description3` | String | `text` |  | true |
| 44 | `description4` | escription4(日期) | `description4` | String | `text` |  | true |
| 45 | `description5` | escription5(日期) | `description5` | String | `text` |  | true |
| 46 | `description6` | escription6(日期) | `description6` | String | `text` |  | true |
| 47 | `level` | level | `level` | Integer | `int` |  | true |
| 48 | `displayorder` | isplayorder(日期) | `displayorder` | Integer | `int` |  | true |
| 49 | `sort` | 排序号 | `displayorder` | Integer | `int` |  | true |
| 50 | `objid` | objid | `objid` | String | `text` |  | true |
| 51 | `countryzone` | ountryzone | `countryzone` | String | `text` |  | true |
| 52 | `corpid` | orpid | `corpid` | String | `text` |  | true |
| 53 | `isEnd` | 是否End | `isEnd` | Integer | `int` |  | true |
| 54 | `currency` | urrency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | true |
| 55 | `enable` | enable | `enable` | Integer | `int` |  | false |
| 56 | `effectivedate` | effectivedate | `effectivedate` | DateTime | `timestamp` |  | true |
| 57 | `expirationdate` | expirationdate | `expirationdate` | DateTime | `timestamp` |  | true |
| 58 | `creator` | 创建人 | `creator` | String | `text` |  | false |
| 59 | `creationtime` | reationtime | `creationtime` | DateTime | `timestamp` |  | false |
| 60 | `modifier` | 修改人 | `modifier` | String | `text` |  | false |
| 61 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |  | false |
| 62 | `sourceid` | sourceid | `sourceid` | String | `text` |  | true |
| 63 | `externalorg` | externalorg | `external_org` | Integer | `int` |  | true |
| 64 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 65 | `tenantid` | tenantid | `tenantid` | String | `text` |  | false |
| 66 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 67 | `sysid` | sysid | `sysid` | String | `text` |  | false |
| 68 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 69 | `ts` | ts | `ts` | DateTime | `timestamp` |  | false |
| 70 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |  | true |
| 71 | `dr` | 逻辑删除 | `dr` | Integer | `int` |  | true |
| 72 | `orgid` | orgid | `orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | true |
| 73 | `path` | path | `path` | String | `text` |  | true |
| 74 | `businessid` | businessid | `businessid` | String | `text` |  | true |
| 75 | `log` | log | `log` | String | `text` |  | true |
| 76 | `jsonextattr` | jsonextattr | `jsonextattr` | String | `text` |  | true |
| 77 | `applyrate` | applyrate | `applyrate` | String | `text` |  | true |
| 78 | `bided` | bided | `bided` | Integer | `int` |  | true |
| 79 | `contactOrg` | ontactOrg | `contact_org` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | true |
| 80 | `purchasedefines` | purchasedefines | `` | 39691308-9455-4430-9083-f3a1e616dd01 | `` |  |  |

## 关联属性（15 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `parent` | parent | `org.func.PurchaseOrg` | `parentid` | 外键 |  |  | None |  |
| 2 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 3 | `exchangerate` | exchangerate | `bd.exchangeRate.ExchangeRateTypeVO` | `exchangerate` | 外键 |  |  | Service |  |
| 4 | `language` | language | `bd.timezonelanguage.LanguageVO` | `language` | 外键 |  |  | Service |  |
| 5 | `orgid` | orgid | `org.func.BaseOrg` | `orgid` | 外键 |  |  | None | true |
| 6 | `parentid` | parentid | `org.func.PurchaseOrg` | `parentid` | 外键 |  |  | None |  |
| 7 | `principal` | principal | `bd.staff.Staff` | `principal` | 外键 |  |  | Service |  |
| 8 | `branchleader` | branchleader | `bd.staff.Staff` | `branchleader` | 外键 |  |  | Service |  |
| 9 | `contactOrg` | ontactOrg | `org.func.BaseOrg` | `contact_org` | 外键 |  |  | None |  |
| 10 | `companytype` | ompanytype | `org.doc.CompanyType` | `companytype` | 外键 |  |  | None |  |
| 11 | `purchasedefines` | purchasedefines | `org.func.PurchaseOrgDefine` | `` | purchasedefines → id | 1 | Y | None |  |
| 12 | `currency` | urrency | `bd.currencytenant.CurrencyTenantVO` | `currency` | 外键 |  |  | Service |  |
| 13 | `id` | 主键ID | `org.func.BaseOrg` | `id` | purchaseOrg → id | 1 | Y | None |  |
| 14 | `depttype` | epttype(日期) | `org.doc.DeptType` | `depttype` | 外键 |  |  | None |  |
| 15 | `tenant` | tenant | `yht.tenant.YhtTenant` | `tenantid` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT id, code, name, name2, name3, name4, name5, name6
FROM org_purchase
```