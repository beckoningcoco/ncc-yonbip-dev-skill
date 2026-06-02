---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctMemorabilia]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 合同大事记 (`apct.contract.ApctMemorabilia`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `apct_apct_memorabilia` | 应用: `APCT`

## 属性（19 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `content` | content | `content` | String | `text` |
| 3 | `sourceautoid` | sourceautoid | `sourceautoid` | Long | `long` |
| 4 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 5 | `createDate` | createDate | `create_date` | Date | `date` |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 7 | `creator` | 创建人 | `creator` | String | `text` |
| 8 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 9 | `ctId` | ctID | `ct_id` | 84a309b9-2fd0-48d8-9b75-8251a20928c2 | `quote` |
| 10 | `id` | ID | `id` | Long | `long` |
| 11 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 12 | `modifier` | 修改人 | `modifier` | String | `text` |
| 13 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 14 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 16 | `note` | note | `note` | String | `text` |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 18 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 19 | `apctApctMemorabiliaDcs` | apctApctMemorabiliaDcs | `apctApctMemorabiliaDcs` | 25f8066a-8277-48e0-bb04-481bbb4cf91c | `UserDefine` |

## 关联（6 个）

- `ctId` -> `apct.contract.Apct` (0..n) 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `apctApctMemorabiliaDcs` -> `apct.contract.ApctMemorabiliaDcsVo` () 
- `tenant` -> `base.tenant.Tenant` () 
