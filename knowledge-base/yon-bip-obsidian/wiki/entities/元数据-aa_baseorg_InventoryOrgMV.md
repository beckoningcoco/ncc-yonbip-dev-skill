---
tags: [BIP, 元数据, 数据字典, aa.baseorg.InventoryOrgMV]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 库存职能 (`aa.baseorg.InventoryOrgMV`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_inventory` | 应用: `GZTORG` | 类型: `Class`

## 属性（31 个）

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
| 10 | `finorgid` | finorgid | `finorgid` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 | `quote` |
| 11 | `fullname` | fullname | `name` | String | `multiLanguage` |
| 12 | `id` | ID | `id` | String | `text` |
| 13 | `isEnd` | 是否End | `isEnd` | Integer | `int` |
| 14 | `isGlobal` | 是否Global | `isEnd` | Integer | `int` |
| 15 | `level` | 层级 | `level` | Integer | `int` |
| 16 | `modifier` | 修改人 | `modifier` | String | `text` |
| 17 | `modifyDate` | 修改日期 | `modifiedtime` | Date | `date` |
| 18 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |
| 19 | `name` | 名称 | `name` | String | `multiLanguage` |
| 20 | `org` | org | `id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 21 | `orgFunc` | orgFunc | `tenantid` | String | `text` |
| 22 | `parent` | parent | `parentid` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 23 | `path` | path | `id` | String | `text` |
| 24 | `principal` | principal | `principal` | String | `text` |
| 25 | `shortname` | shortname | `shortname` | String | `multiLanguage` |
| 26 | `sort` | 排序 | `displayorder` | Integer | `int` |
| 27 | `stopstatus` | stopstatus | `enable` | Integer | `int` |
| 28 | `stoptime` | stoptime | `modifiedtime` | DateTime | `timestamp` |
| 29 | `tenant` | tenant | `tenantid` | String | `text` |
| 30 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 31 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `parent` -> `aa.baseorg.OrgMV` ()
- `org` -> `aa.baseorg.OrgMV` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `finorgid` -> `aa.baseorg.FinanceOrgMV` ()
