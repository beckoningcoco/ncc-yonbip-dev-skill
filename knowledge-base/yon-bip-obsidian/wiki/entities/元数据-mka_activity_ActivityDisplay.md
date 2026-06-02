---
tags: [BIP, 元数据, 数据字典, mka.activity.ActivityDisplay]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 营销活动活动陈列 (`mka.activity.ActivityDisplay`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mka_activity_display` | 应用: `MKA` | 类型: `Class`

## 属性（13 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `activity` | activity | `activity` | 924ae32c-2a09-4ec0-aff9-5959ec1f8024 | `quote` |
| 2 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 4 | `creator` | 创建人 | `creator` | String | `text` |
| 5 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 6 | `display` | display | `display` | c1744be8-e28f-4eaa-b24f-c75af5fc4c8f | `quote` |
| 7 | `id` | ID | `id` | Long | `long` |
| 8 | `modifier` | 修改人 | `modifier` | String | `text` |
| 9 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 10 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 13 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `activity` -> `mka.activity.Activity` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `display` -> `crmc.display.Display` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
