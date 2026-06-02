---
tags: [BIP, 元数据, 数据字典, pc.cls.CostClass]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成本分类 (`pc.cls.CostClass`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `product_cost_class` | 应用: `GZTBDM` | 类型: `Class`

## 属性（24 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `orgId` | 组织ID | `orgId` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 3 | `code` | 编码 | `code` | String | `text` |
| 4 | `name` | 名称 | `name` | String | `multiLanguage` |
| 5 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 6 | `parent` | parent | `parent_id` | 80e9c421-f9e9-4752-b1e9-7c240cb2fc1f | `quote` |
| 7 | `order` | order | `iOrder` | Integer | `int` |
| 8 | `remark` | remark | `remark` | String | `multiLanguage` |
| 9 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 10 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 11 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 12 | `level` | 层级 | `level` | Integer | `int` |
| 13 | `path` | path | `path` | String | `text` |
| 14 | `fullPath` | fullPath | `cFullPath` | String | `text` |
| 15 | `template` | template | `tpl_id` | c40d564b-d166-4e0e-875f-1fafdab28955 | `quote` |
| 16 | `productCount` | productCount | `productCount` | Decimal | `number` |
| 17 | `sociCoreArchive` | sociCoreArchive | `sociCoreArchive_id` | Long | `long` |
| 18 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 19 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 21 | `orgGroupId` | orgGroupID | `org_group_id` | 6a8af5af-0687-4254-ab87-c07e00fc8398 | `quote` |
| 22 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 23 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 24 | `costClassApplyRanges` | costClassApplyRanges | `` | f0df4641-fb14-467c-b39c-7488cef88954 | `` |

## 关联（7 个）

- `template` -> `pc.tpl.ProductTpl` ()
- `parent` -> `pc.cls.CostClass` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `orgGroupId` -> `pc.pub_org_group.PubOrgGroup` ()
- `costClassApplyRanges` -> `pc.cls.CostClassApplyRange` (0..n)
- `orgId` -> `bd.adminOrg.BaseOrgVO` ()
- `tenant` -> `base.tenant.Tenant` ()
