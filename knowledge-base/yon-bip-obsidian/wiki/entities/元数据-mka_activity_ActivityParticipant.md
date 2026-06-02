---
tags: [BIP, 元数据, 数据字典, mka.activity.ActivityParticipant]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 营销活动参与人 (`mka.activity.ActivityParticipant`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `cust_relateperson` | 应用: `MKA` | 类型: `Class`

## 属性（17 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 3 | `creator` | 创建人 | `creator` | String | `text` |
| 4 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 5 | `id` | ID | `id` | Long | `long` |
| 6 | `joinKey` | joinKey | `joinKey` | String | `text` |
| 7 | `modifier` | 修改人 | `modifier` | String | `text` |
| 8 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 9 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 11 | `partnerPerson` | partnerPerson | `partner_person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 12 | `person` | person | `person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 14 | `relateObject` | relateObject | `relate_object_id` | 924ae32c-2a09-4ec0-aff9-5959ec1f8024 | `quote` |
| 15 | `relateObjectType` | relateObjectType | `relate_object_type` | String | `text` |
| 16 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 17 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（7 个）

- `partnerPerson` -> `bd.staff.Staff` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `person` -> `bd.staff.Staff` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `relateObject` -> `mka.activity.Activity` (0..n)
- `tenant` -> `base.tenant.Tenant` ()
