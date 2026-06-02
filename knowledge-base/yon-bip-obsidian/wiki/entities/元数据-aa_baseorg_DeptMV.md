---
tags: [BIP, 元数据, 数据字典, aa.baseorg.DeptMV]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 部门 (`aa.baseorg.DeptMV`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_orgs` | 应用: `GZTORG` | 类型: `Class`

## 属性（31 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `parent` | parent | `parentid` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 | `quote` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `modifier` | 修改人 | `modifier` | String | `text` |
| 4 | `deptid` | deptid | `id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 5 | `memo` | 备注 | `path` | String | `text` |
| 6 | `stoptime` | stoptime | `modifiedtime` | DateTime | `timestamp` |
| 7 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 8 | `orgId` | 组织ID | `parentorgid` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 9 | `principal` | principal | `principal` | String | `text` |
| 10 | `path` | path | `path` | String | `text` |
| 11 | `membercorp` | membercorp | `external_org` | Integer | `int` |
| 12 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |
| 13 | `erpCode` | erp编码 | `path` | String | `text` |
| 14 | `id` | ID | `id` | String | `text` |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 16 | `tenant` | tenant | `tenantid` | String | `text` |
| 17 | `stopstatus` | stopstatus | `enable` | Integer | `int` |
| 18 | `createDate` | 创建日期 | `creationtime` | Date | `date` |
| 19 | `orgtype` | orgtype | `orgtype` | Integer | `int` |
| 20 | `cAppID` | cAppID | `path` | String | `text` |
| 21 | `creator` | 创建人 | `creator` | String | `text` |
| 22 | `modifyDate` | 修改日期 | `modifiedtime` | Date | `date` |
| 23 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 24 | `level` | 层级 | `level` | Integer | `int` |
| 25 | `sort` | 排序 | `displayorder` | Integer | `int` |
| 26 | `isEnd` | 是否End | `isEnd` | Integer | `int` |
| 27 | `createTime` | 创建时间 | `creationtime` | DateTime | `timestamp` |
| 28 | `name` | 名称 | `name` | String | `multiLanguage` |
| 29 | `fullname` | fullname | `name` | String | `multiLanguage` |
| 30 | `externalorg` | externalorg | `external_org` | Integer | `int` |
| 31 | `depttype` | depttype | `depttype` | String | `text` |

## 关联（4 个）

- `parent` -> `aa.baseorg.DeptMV` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `deptid` -> `bd.adminOrg.AdminOrgVO` ()
- `orgId` -> `aa.baseorg.OrgMV` ()
