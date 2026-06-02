---
tags: [BIP, 元数据, 数据字典, 其他入库, ST, st.custodian.Custodian]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 保管者对象 (`st.custodian.Custodian`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_custodian` | 应用: `ST`

## 属性（17 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `createDate` | createDate | `create_date` | Date | `date` |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 4 | `creator` | 创建人 | `creator` | String | `text` |
| 5 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 6 | `customer` | customer | `customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 7 | `id` | ID | `id` | Long | `long` |
| 8 | `memo` | 备注 | `cmemo` | String | `text` |
| 9 | `modifier` | 修改人 | `modifier` | String | `text` |
| 10 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 11 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 13 | `name` | 名称 | `name` | String | `text` |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 15 | `type` | type | `custodian_type` | String | `text` |
| 16 | `vendor` | vendor | `vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 17 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `ytenant` -> `yht.tenant.YhtTenant` () 
- `vendor` -> `aa.vendor.Vendor` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `customer` -> `aa.merchant.Merchant` () 
