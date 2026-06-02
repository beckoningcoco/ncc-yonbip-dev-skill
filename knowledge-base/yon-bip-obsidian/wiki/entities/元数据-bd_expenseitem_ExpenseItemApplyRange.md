---
tags: [BIP, 元数据, 数据字典, bd.expenseitem.ExpenseItemApplyRange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 适用范围 (`bd.expenseitem.ExpenseItemApplyRange`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_expenseitem_applyrange` | 应用: `DPMACCT` | 类型: `Class`

## 属性（14 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `expenseitem` | expenseitem | `expenseitem` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 3 | `accentity` | accentity | `accentity` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 4 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 6 | `creator` | 创建人 | `creator` | String | `text` |
| 7 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 8 | `modifier` | 修改人 | `modifier` | String | `text` |
| 9 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 10 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 13 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 14 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（6 个）

- `expenseitem` -> `bd.expenseitem.ExpenseItem` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `accentity` -> `org.func.BaseOrg` ()
- `tenant` -> `base.tenant.Tenant` ()
