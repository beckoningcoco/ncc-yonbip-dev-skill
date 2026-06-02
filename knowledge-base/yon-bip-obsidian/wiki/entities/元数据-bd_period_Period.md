---
tags: [BIP, 元数据, 数据字典, bd.period.Period]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会计期间 (`bd.period.Period`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_period` | 应用: `FP` | 类型: `Class`

## 属性（24 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `name` | 名称 | `name` | String | `text` |
| 3 | `objId` | objID | `obj_id` | String | `text` |
| 4 | `begindate` | begindate | `begindate` | Date | `date` |
| 5 | `accperiodyear2` | accperiodyear2 | `accperiodyear2` | String | `text` |
| 6 | `periodyear` | periodyear | `periodyear` | c1fb756f-95cc-4faf-b1bf-7cea0aa99973 | `quote` |
| 7 | `periodtree` | periodtree | `periodtree` | d84acede-7690-4b3b-ac33-e64e4f24e7cf | `quote` |
| 8 | `localcode` | localcode | `localcode` | String | `text` |
| 9 | `description` | description | `description` | String | `text` |
| 10 | `codedate` | codedate | `codedate` | String | `text` |
| 11 | `enddate` | enddate | `enddate` | Date | `date` |
| 12 | `accperiodscheme` | accperiodscheme | `accperiodscheme` | e7bb3d2b-b288-4696-b5f0-a9b0626cded8 | `quote` |
| 13 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 15 | `creator` | 创建人 | `creator` | String | `text` |
| 16 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 17 | `id` | ID | `id` | Long | `long` |
| 18 | `modifier` | 修改人 | `modifier` | String | `text` |
| 19 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 20 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 21 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 23 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 24 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（7 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `periodyear` -> `bd.period.PeriodYear` (0..n)
- `accperiodscheme` -> `bd.period.AccPeriodScheme` ()
- `periodtree` -> `bd.period.PeriodTree` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `tenant` -> `base.tenant.Tenant` ()
