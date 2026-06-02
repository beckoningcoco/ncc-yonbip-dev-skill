---
tags: [BIP, 元数据, 数据字典, aa.baseorg.OrgMV]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 视图业务单元 (`aa.baseorg.OrgMV`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_orgs` | 应用: `GZTORG` | 类型: `Class`

## 属性（35 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `orgAndFuncs` | orgAndFuncs | `` | 60e49a57-6241-44be-a6c8-65b236baf73e | `` |
| 3 | `code` | 编码 | `code` | String | `text` |
| 4 | `fullname` | fullname | `name` | String | `multiLanguage` |
| 5 | `name` | 名称 | `name` | String | `multiLanguage` |
| 6 | `shortname` | shortname | `shortname` | String | `multiLanguage` |
| 7 | `parent` | parent | `parentid` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 8 | `isbizunit` | 是否bizunit | `is_biz_unit` | Integer | `int` |
| 9 | `principal` | principal | `principal` | String | `text` |
| 10 | `level` | 层级 | `level` | Integer | `int` |
| 11 | `sort` | 排序 | `displayorder` | Integer | `int` |
| 12 | `isEnd` | 是否End | `isEnd` | Integer | `int` |
| 13 | `isGlobal` | 是否Global | `isEnd` | Integer | `int` |
| 14 | `stopstatus` | stopstatus | `enable` | Integer | `int` |
| 15 | `customerId` | customerID | `dr` | Integer | `int` |
| 16 | `eaiCode` | eai编码 | `tenantid` | String | `text` |
| 17 | `erpCode` | erp编码 | `orgform` | String | `text` |
| 18 | `creator` | 创建人 | `creator` | String | `text` |
| 19 | `createDate` | 创建日期 | `creationtime` | Date | `date` |
| 20 | `createTime` | 创建时间 | `creationtime` | DateTime | `timestamp` |
| 21 | `modifier` | 修改人 | `modifier` | String | `text` |
| 22 | `modifyDate` | 修改日期 | `modifiedtime` | Date | `date` |
| 23 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |
| 24 | `sourcetype` | sourcetype | `source_type` | Integer | `int` |
| 25 | `stoptime` | stoptime | `modifiedtime` | DateTime | `timestamp` |
| 26 | `externalorg` | externalorg | `external_org` | Integer | `int` |
| 27 | `tenant` | tenant | `tenantid` | String | `text` |
| 28 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 29 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 30 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 31 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 32 | `orgid` | orgid | `orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 33 | `path` | path | `id` | String | `text` |
| 34 | `orgFunc` | orgFunc | `tenantid` | String | `text` |
| 35 | `financeOrg` | financeOrg | `` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 | `` |

## 关联（5 个）

- `parent` -> `aa.baseorg.OrgMV` ()
- `financeOrg` -> `aa.baseorg.FinanceOrgMV` (1)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `orgAndFuncs` -> `aa.baseorg.OrgAndFuncMV` (0..n)
- `orgid` -> `org.func.BaseOrg` ()
