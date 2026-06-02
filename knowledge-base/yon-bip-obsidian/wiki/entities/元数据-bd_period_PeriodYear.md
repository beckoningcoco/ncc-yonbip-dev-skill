---
tags: [BIP, 元数据, 数据字典, bd.period.PeriodYear]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会计期间年 (`bd.period.PeriodYear`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_periodyear` | 应用: `FP` | 类型: `Class`

## 属性（28 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `name` | 名称 | `name` | String | `text` |
| 3 | `objId` | objID | `obj_id` | String | `text` |
| 4 | `begindate` | begindate | `begindate` | Date | `date` |
| 5 | `enddate` | enddate | `enddate` | Date | `date` |
| 6 | `num` | num | `num` | Integer | `int` |
| 7 | `accperiodscheme` | accperiodscheme | `accperiodscheme` | e7bb3d2b-b288-4696-b5f0-a9b0626cded8 | `quote` |
| 8 | `description` | description | `description` | String | `text` |
| 9 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 11 | `creator` | 创建人 | `creator` | String | `text` |
| 12 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 13 | `halfYearCount` | halfYearCount | `half_year_count` | Integer | `int` |
| 14 | `id` | ID | `id` | Long | `long` |
| 15 | `modifier` | 修改人 | `modifier` | String | `text` |
| 16 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 19 | `period` | period | `` | 0028813f-135a-485e-a5c3-c15a3d18168b | `` |
| 20 | `periodAdjust` | periodAdjust | `` | a6284b47-4c60-434a-baa1-7f1ad1dac2c6 | `` |
| 21 | `periodCount` | periodCount | `period_count` | Integer | `int` |
| 22 | `periodSegment` | periodSegment | `` | c2e7f025-3174-4160-8361-6de4677c328b | `` |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 24 | `quarterCount` | quarterCount | `quarter_count` | Integer | `int` |
| 25 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 26 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 27 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 28 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（8 个）

- `period` -> `bd.period.Period` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `accperiodscheme` -> `bd.period.AccPeriodScheme` (0..n)
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `periodAdjust` -> `bd.period.PeriodAdjust` (0..n)
- `periodSegment` -> `bd.period.PeriodSegment` (0..n)
- `tenant` -> `base.tenant.Tenant` ()
