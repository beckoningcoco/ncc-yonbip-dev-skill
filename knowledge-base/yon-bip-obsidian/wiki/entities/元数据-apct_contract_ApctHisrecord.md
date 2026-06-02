---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctHisrecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 变更历史 (`apct.contract.ApctHisrecord`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `apct_apct_hisrecord` | 应用: `APCT`

## 属性（18 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `changeCode` | change编码 | `change_code` | String | `text` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `copyCtId` | copyCtID | `copy_ct_id` | 84a309b9-2fd0-48d8-9b75-8251a20928c2 | `quote` |
| 4 | `createDate` | createDate | `create_date` | Date | `date` |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 6 | `creator` | 创建人 | `creator` | String | `text` |
| 7 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 8 | `ctId` | ctID | `ct_id` | 84a309b9-2fd0-48d8-9b75-8251a20928c2 | `quote` |
| 9 | `ctVersion` | ctVersion | `ct_version` | String | `text` |
| 10 | `id` | ID | `id` | Long | `long` |
| 11 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 12 | `modifier` | 修改人 | `modifier` | String | `text` |
| 13 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 14 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 17 | `reason` | reason | `reason` | String | `text` |
| 18 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（6 个）

- `copyCtId` -> `apct.contract.Apct` () 
- `ctId` -> `apct.contract.Apct` (0..n) 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `tenant` -> `base.tenant.Tenant` () 
