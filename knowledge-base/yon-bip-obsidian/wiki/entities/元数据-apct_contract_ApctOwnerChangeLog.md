---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctOwnerChangeLog]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 所属人维护记录 (`apct.contract.ApctOwnerChangeLog`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `apct_apct_change_log` | 应用: `APCT`

## 属性（16 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `ctId` | ctID | `ct_id` | 84a309b9-2fd0-48d8-9b75-8251a20928c2 | `quote` |
| 2 | `changeBeforeId` | changeBeforeID | `change_before_id` | String | `text` |
| 3 | `changeAfterId` | changeAfterID | `change_after_id` | String | `text` |
| 4 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 5 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 7 | `createDate` | createDate | `create_date` | Date | `date` |
| 8 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 9 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 10 | `creator` | 创建人 | `creator` | String | `text` |
| 11 | `modifier` | 修改人 | `modifier` | String | `text` |
| 12 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 13 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 14 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 15 | `id` | ID | `id` | Long | `long` |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |

## 关联（5 个）

- `ctId` -> `apct.contract.Apct` (1..n) 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `tenant` -> `base.tenant.Tenant` () 
