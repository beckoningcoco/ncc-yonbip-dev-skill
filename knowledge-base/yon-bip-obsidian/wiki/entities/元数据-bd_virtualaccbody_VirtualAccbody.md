---
tags: [BIP, 元数据, 数据字典, bd, bd.virtualaccbody.VirtualAccbody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 虚拟会计主体 (`bd.virtualaccbody.VirtualAccbody`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_virtualaccbody` | 应用: `DPMACCT` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 虚拟会计主体 |
| 物理表 | `bd_virtualaccbody` |
| 应用 | `DPMACCT` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-23 00:43:01:000
- 安装来源: `/app/finbd/finbd-web/scripts/db/patch/mongodb/V7_R0_2507/0001_iuap-apdoc-finbd/0010_iuap_common/DML/0270_iuap_metadata/20260413/202604131140_metadata_bd-virtualaccbody.zip`

## 术语标记

`ConfigData`, `data_auth`, `doc`

## 依赖接口（6 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| ITenant (`ITenant`) | `base.itf.ITenant` | 73 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| IStopping (`IStopping`) | `base.itf.IStopping` | 111 | 2 |
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| ITree (`ITree`) | `base.itf.ITree` | 231 | 5 |
| LogicDelete (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 全部属性（49 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | String | `text` |  | true |
| 2 | `code` | 编码 | `code` | String | `text` |  | false |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |  | false |
| 4 | `dr` | 逻辑删除 | `dr` | Short | `short` |  | true |
| 5 | `accperiodscheme` | accperiodscheme | `accperiodscheme` | e7bb3d2b-b288-4696-b5f0-a9b0626cded8 | `quote` |  |  |
| 6 | `branchleader` | branchleader | `branchleader` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |  |  |
| 7 | `country` | ountry | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |  |  |
| 8 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 10 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 11 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 12 | `currency` | urrency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  |  |
| 13 | `description` | 描述 | `description` | String | `multiLanguage` |  |  |
| 14 | `displayOrder` | isplayOrder(日期) | `display_order` | Integer | `int` |  |  |
| 15 | `enabledate` | enabledate | `enabledate` | DateTime | `timestamp` |  |  |
| 16 | `entrustaccbody` | entrustaccbody | `entrustaccbody` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |  |  |
| 17 | `exchangerate` | exchangerate | `exchangerate` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |  |  |
| 18 | `expiredate` | expiredate | `expiredate` | DateTime | `timestamp` |  |  |
| 19 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |  | true |
| 20 | `is_virtualaccbody` | 是否_virtualaccbody | `is_virtualaccbody` | Boolean | `switch` |  |  |
| 21 | `isexternal` | 是否external | `isexternal` | Boolean | `switch` |  |  |
| 22 | `isinner` | 是否inner | `isinner` | Boolean | `switch` |  |  |
| 23 | `isorg` | 是否org | `isorg` | Boolean | `switch` |  |  |
| 24 | `language` | language | `language` | a014aa1b-1f14-4d31-88fb-dcce538d9973 | `quote` |  |  |
| 25 | `level` | level | `level` | Integer | `int` |  | true |
| 26 | `liableperson` | liableperson | `liableperson` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |  |  |
| 27 | `locationid` | locationid | `locationid` | String | `text` |  |  |
| 28 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 29 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 30 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 31 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 32 | `orgform` | orgform | `orgform` | 45cbc79d-a41a-41e4-af94-b264ce83596a | `quote` |  |  |
| 33 | `orgpubts` | orgpubts | `orgpubts` | DateTime | `timestamp` |  |  |
| 34 | `orgtype` | orgtype | `orgtype` | String | `text` |  |  |
| 35 | `parent` | parent | `parent` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |  | true |
| 36 | `path` | path | `path` | String | `text` |  | true |
| 37 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 38 | `shortname` | shortname | `shortname` | String | `multiLanguage` |  |  |
| 39 | `sort` | 排序号 | `sort_num` | Integer | `int` |  | true |
| 40 | `source` | source | `source` | Short | `short` |  |  |
| 41 | `status` | 状态 | `status` | Short | `short` |  |  |
| 42 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |  | true |
| 43 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |  | true |
| 44 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 45 | `timezone` | timezone | `timezone` | ff57c966-b826-4a94-a5f6-1599c1fe4eb3 | `quote` |  |  |
| 46 | `bodies` | bodies | `` | 08c10907-7e54-4ee5-aa13-e214eaa5c3d2 | `` |  |  |
| 47 | `orgid` | orgid | `orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  |  |
| 48 | `treeMembers` | treeMembers | `` | 0ddb9fda-f851-4ac5-abf3-15a86353faa1 | `` |  |  |
| 49 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |

## 关联属性（18 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `country` | ountry | `bd.country.CountryVO` | `country` | 外键 |  |  | Service |  |
| 2 | `parent` | parent | `bd.virtualaccbody.VirtualAccbody` | `parent` | 外键 |  |  | None |  |
| 3 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 4 | `exchangerate` | exchangerate | `bd.exchangeRate.ExchangeRateTypeVO` | `exchangerate` | 外键 |  |  | Service |  |
| 5 | `timezone` | timezone | `bd.timezonelanguage.TimeZoneVO` | `timezone` | 外键 |  |  | Service |  |
| 6 | `bodies` | bodies | `bd.virtualaccbody.VirtualAccbodyInnerExternalRel` | `` | bodies → accentity | 0..n | Y | None |  |
| 7 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 8 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 9 | `treeMembers` | treeMembers | `bd.virtualaccbody.VirtualAccbodyTreeMember` | `` | treeMembers → accentity | 0..n | Y | None |  |
| 10 | `language` | language | `bd.timezonelanguage.LanguageVO` | `language` | 外键 |  |  | Service |  |
| 11 | `orgid` | orgid | `org.func.BaseOrg` | `orgid` | 外键 |  |  | Service |  |
| 12 | `liableperson` | liableperson | `bd.staff.StaffNew` | `liableperson` | 外键 |  |  | Service |  |
| 13 | `branchleader` | branchleader | `bd.staff.StaffNew` | `branchleader` | 外键 |  |  | Service |  |
| 14 | `accperiodscheme` | accperiodscheme | `bd.period.AccPeriodScheme` | `accperiodscheme` | 外键 |  |  | None |  |
| 15 | `currency` | urrency | `bd.currencytenant.CurrencyTenantVO` | `currency` | 外键 |  |  | Service |  |
| 16 | `entrustaccbody` | entrustaccbody | `bd.virtualaccbody.VirtualAccbody` | `entrustaccbody` | 外键 |  |  | None |  |
| 17 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | Service |  |
| 18 | `orgform` | orgform | `org.doc.CompanyType` | `orgform` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT id, code, name, dr, accperiodscheme, branchleader, country, create_date
FROM bd_virtualaccbody
```