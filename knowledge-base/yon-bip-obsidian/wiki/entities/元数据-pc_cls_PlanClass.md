---
tags: [BIP, 元数据, 数据字典, pc.cls.PlanClass]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计划分类 (`pc.cls.PlanClass`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `product_plan_class` | 应用: `GZTBDM` | 类型: `Class`

## 属性（19 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |
| 4 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 5 | `parent` | parent | `parent_id` | 5f9b1ee7-d6e8-4ba0-b5d7-6728fa089ae3 | `quote` |
| 6 | `order` | order | `iOrder` | Integer | `int` |
| 7 | `remark` | remark | `remark` | String | `multiLanguage` |
| 8 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 9 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 10 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 11 | `level` | 层级 | `level` | Integer | `int` |
| 12 | `path` | path | `path` | String | `text` |
| 13 | `fullPath` | fullPath | `cFullPath` | String | `text` |
| 14 | `sociCoreArchive` | sociCoreArchive | `sociCoreArchive_id` | Long | `long` |
| 15 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 17 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 18 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 19 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（3 个）

- `parent` -> `pc.cls.PlanClass` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `tenant` -> `base.tenant.Tenant` ()
