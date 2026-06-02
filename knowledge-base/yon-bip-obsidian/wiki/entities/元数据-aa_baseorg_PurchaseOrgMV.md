---
tags: [BIP, 元数据, 数据字典, aa.baseorg.PurchaseOrgMV]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 采购组织 (`aa.baseorg.PurchaseOrgMV`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_purchase` | 应用: `GZTORG` | 类型: `Class`

## 属性（30 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `createDate` | 创建日期 | `creationtime` | Date | `date` |
| 3 | `createTime` | 创建时间 | `creationtime` | DateTime | `timestamp` |
| 4 | `creator` | 创建人 | `creator` | String | `text` |
| 5 | `customerId` | customerID | `dr` | Integer | `int` |
| 6 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 7 | `eaiCode` | eai编码 | `tenantid` | String | `text` |
| 8 | `erpCode` | erp编码 | `tenantid` | String | `text` |
| 9 | `externalorg` | externalorg | `external_org` | Integer | `int` |
| 10 | `fullname` | fullname | `name` | String | `multiLanguage` |
| 11 | `id` | ID | `id` | String | `text` |
| 12 | `isEnd` | 是否End | `isEnd` | Integer | `int` |
| 13 | `isGlobal` | 是否Global | `isEnd` | Integer | `int` |
| 14 | `level` | 层级 | `level` | Integer | `int` |
| 15 | `modifier` | 修改人 | `modifier` | String | `text` |
| 16 | `modifyDate` | 修改日期 | `modifiedtime` | Date | `date` |
| 17 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |
| 18 | `name` | 名称 | `name` | String | `multiLanguage` |
| 19 | `org` | org | `orgid` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 20 | `orgFunc` | orgFunc | `tenantid` | String | `text` |
| 21 | `parent` | parent | `parentid` | 528ae807-a9d3-4f2a-9ee7-1db3e5eddc01 | `quote` |
| 22 | `path` | path | `id` | String | `text` |
| 23 | `principal` | principal | `principal` | String | `text` |
| 24 | `shortname` | shortname | `shortname` | String | `multiLanguage` |
| 25 | `sort` | 排序 | `displayorder` | Integer | `int` |
| 26 | `stopstatus` | stopstatus | `enable` | Integer | `int` |
| 27 | `stoptime` | stoptime | `modifiedtime` | DateTime | `timestamp` |
| 28 | `tenant` | tenant | `tenantid` | String | `text` |
| 29 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 30 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `parent` -> `aa.baseorg.PurchaseOrgMV` ()
- `org` -> `aa.baseorg.OrgMV` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
