---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctProcess]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 执行过程 (`apct.contract.ApctProcess`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `apct_apct_process` | 应用: `APCT`

## 属性（17 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `createDate` | createDate | `create_date` | Date | `date` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 4 | `creator` | 创建人 | `creator` | String | `text` |
| 5 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 6 | `ctId` | ctID | `ct_id` | 84a309b9-2fd0-48d8-9b75-8251a20928c2 | `quote` |
| 7 | `executeDate` | executeDate | `execute_date` | DateTime | `timestamp` |
| 8 | `executeFlow` | executeFlow | `execute_flow` | String | `text` |
| 9 | `id` | ID | `id` | Long | `long` |
| 10 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 11 | `modifier` | 修改人 | `modifier` | String | `text` |
| 12 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 13 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 16 | `reason` | reason | `reason` | String | `text` |
| 17 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（5 个）

- `ctId` -> `apct.contract.Apct` (0..n) 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `tenant` -> `base.tenant.Tenant` () 
